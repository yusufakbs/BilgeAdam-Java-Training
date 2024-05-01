package com.yusuf;

import com.yusuf.entity.Deneme;
import com.yusuf.repository.DenemeRepository;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        DenemeRepository denemeRepository = new DenemeRepository();
        denemeRepository.save(new Deneme());
    }
}