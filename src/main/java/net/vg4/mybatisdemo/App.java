package net.vg4.mybatisdemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

import net.vg4.mybatisdemo.mybatis.generate.mapper.PeopleMapper;
import net.vg4.mybatisdemo.mybatis.generate.model.People;

import lombok.extern.slf4j.Slf4j;
import lombok.val;

@SpringBootApplication
@val
@Slf4j
public class App implements CommandLineRunner {
    private final PeopleMapper peopleMapper;

    public App(PeopleMapper peopleMapper) {this.peopleMapper = peopleMapper;}

    public static void main(String[] args) {

        log.info("start");
        try (val ctx = SpringApplication.run(App.class, args)) {
            log.info("{}", ctx.getEnvironment());
        } finally {
            log.info("end");
        }
    }

    @Transactional
    @Override
    public void run(String... args) throws Exception {
        People newPeople = new People();
        newPeople.setFirstName("kiriga");
        newPeople.setLastName("mine");
        peopleMapper.insert(newPeople);
        val got = peopleMapper.selectByPrimaryKey(newPeople.getId());

        log.info("{}", got.getId());
        log.info("{}", got.getFirstName());
    }
}
