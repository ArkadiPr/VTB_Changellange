package com.company;


import java.util.*;
import java.util.stream.Collectors;

public class Main {

    private final List<User> userRepository;
    private final List<Bill> billRepository;
    private final List<Installation> installationRepository;

    public Main(List<User> userRepository, List<Bill> billRepository, List<Installation> installationRepository) {
        this.userRepository = userRepository;
        this.billRepository = billRepository;
        this.installationRepository = installationRepository;
    }

    public int sumOfBills(int userId, Date date) throws NoEntityException {
        User currentUser = userRepository.stream()
                .filter(user -> user.getId() == userId)
                .findAny()
                .orElseThrow(() -> new NoEntityException());
        return installationRepository.stream()
                .filter(installation -> installation.getDate().equals(date))
                .filter(installation -> currentUser.getBills().contains(installation.getEnrollment()))
                .mapToInt(Installation::getSum)
                .sum();
    }

    public List<Information> getInformationOfBill(int billId) throws NoEntityException {
        List<Information> resultInformationBill = new ArrayList<>();
        Bill currentBill = billRepository.stream()
                .filter(bill -> bill.getId() == billId)
                .findAny()
                .orElseThrow(() -> new NoEntityException());

        return installationRepository.stream()
                .filter(installation -> installation.getEnrollment().equals(currentBill)
                        || installation.getWriteOff().equals(currentBill))
                .map(installation -> {
                    OperationType operationType;
                    Bill secondBill;
                    if (installation.getWriteOff().equals(currentBill)) {
                        operationType = OperationType.WRITE_OFF;
                        secondBill = installation.getEnrollment();
                    } else {
                        operationType = OperationType.ENROLLMENT;
                        secondBill = installation.getWriteOff();
                    }
                    return new Information(installation.getDate(), operationType, installation.getSum(), secondBill);
                }).collect(Collectors.toList());
    }

    public static void main(String[] args) {

    }
}
