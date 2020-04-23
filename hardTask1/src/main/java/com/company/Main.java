package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
     List<User> userRepository=new ArrayList<>();
     List<Authority> authorityRepository=new ArrayList<>();
     List<Role> roleRepository=new ArrayList<>();

    public Main(List<User> userRepository, List<Authority> authorityRepository, List<Role> roleRepository) {
        this.userRepository = userRepository;
        this.authorityRepository = authorityRepository;
        this.roleRepository = roleRepository;
    }

    public  boolean hasAccess(long userId, long authorityId)throws NoEntityException{

        User currentUser=userRepository.stream()
                .filter(user -> user.getId()==userId)
                .findAny()
                .orElseThrow(()->new NoEntityException());

        Optional<Authority> optionalAuthority = currentUser.getRoles()
                .stream()
                .flatMap(role -> role.getAuthorities().stream())
                .filter(authority -> authority.getId() == authorityId)
                .findAny();


        return optionalAuthority.isPresent();

    }

    public  Set<Authority> availableAuthorities(long userId) throws NoEntityException {
        User currentUser=userRepository.stream()
                .filter(user -> user.getId()==userId)
                .findAny()
                .orElseThrow(()->new NoEntityException());

        Set<Authority> authorities=currentUser.getRoles()
                .stream()
                .flatMap(role -> role.getAuthorities().stream())
                .collect(Collectors.toSet());

        return authorities;

    }


    public static void main(String[] args) {

    }
}
