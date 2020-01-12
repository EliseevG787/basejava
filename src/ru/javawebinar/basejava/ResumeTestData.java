package ru.javawebinar.basejava;

import ru.javawebinar.basejava.model.*;

import java.time.LocalDate;

public class ResumeTestData {
    public static void main(String[] args) {
        Resume resume = new Resume("Григорий Кислин");
        resume.addContact(ContactType.PHONE, "+7(921) 855-0482");
        resume.addContact(ContactType.SKYPE, "grigory.kislin");
        resume.addContact(ContactType.MAIL, "gkislin@yandex.ru");
        resume.addContact(ContactType.LINKEDIN, "Профиль LinkedIn");
        resume.addContact(ContactType.GITHUB, "Профиль GitHub");
        resume.addContact(ContactType.STATCKOVERFLOW, "Профиль Stackoverflow");
        resume.addContact(ContactType.HOME_PAGE, "Домашняя страница");

        resume.addSection(SectionType.OBJECTIVE, new PersonalSection("Ведущий стажировок и корпоративного обучения по Java Web и" +
                " Enterprise технологиям"));
        resume.addSection(SectionType.PERSONAL, new PersonalSection("Аналитический склад ума, сильная логика, креативность," +
                " инициативность. Пурист кода и архитектуры."));
        resume.addSection(SectionType.ACHIEVEMENT, new SkillSection("С 2013 года: разработка проектов \"Разработка Web приложения\"," +
                " \"Java Enterprise\", \"Многомодульный maven. Многопоточность. XML (JAXB/StAX). Веб сервисы (JAX-RS/SOAP)." +
                " Удаленное взаимодействие (JMS/AKKA)\". Организация онлайн стажировок и ведение проектов. Более 1000 выпускников.",
                "Реализация двухфакторной аутентификации для онлайн платформы управления проектами Wrike. Интеграция с Twilio, DuoSecurity," +
                        " Google Authenticator, Jira, Zendesk."));
        resume.addSection(SectionType.QUALIFICATIONS, new SkillSection("JEE AS: GlassFish (v2.1, v3), OC4J, JBoss, Tomcat, Jetty," +
                " WebLogic, WSO2", "Version control: Subversion, Git, Mercury, ClearCase, Perforce", "DB: PostgreSQL(наследование, pgplsql, " +
                "PL/Python), Redis (Jedis), H2, Oracle,"));
        resume.addSection(SectionType.EXPERIENCE, new EnterpriseSection(
                new Enterprise("Wrike", "wirke.com", LocalDate.parse("2014-10-01"), LocalDate.parse("2016-01-01"), "Старший" +
                        " разработчик (backend)", "Проектирование и разработка онлайн платформы управления проектами Wrike" +
                        " (Java 8 API, Maven, Spring, MyBatis, Guava, Vaadin, PostgreSQL, Redis). Двухфакторная аутентификация, авторизация по" +
                        " OAuth1, OAuth2, JWT SSO."),
                new Enterprise("Yota", "yota.ru", LocalDate.parse("2008-06-01"), LocalDate.parse("2010-12-01"),
                        "Ведущий специалист", "Дизайн и имплементация Java EE фреймворка для отдела \"Платежные Системы\" " +
                        "(GlassFish v2.1, v3, OC4J, EJB3, JAX-WS RI 2.1, Servlet 2.4, JSP, JMX, JMS, Maven2). Реализация администрирования, " +
                        "статистики и мониторинга фреймворка. Разработка online JMX клиента (Python/ Jython, Django, ExtJS)")));
        resume.addSection(SectionType.EDUCATION, new EnterpriseSection(
                new Enterprise("Coursera", "coursera.org", LocalDate.parse("2013-03-01"), LocalDate.parse("2013-05-01"),
                        "Functional Programming Principles in Scala\" by Martin Odersky", ""),
                new Enterprise("Siemens AG", "siemens.ru", LocalDate.parse("2005-01-01"), LocalDate.parse("2005-04-01"),
                        "3 месяца обучения мобильным IN сетям (Берлин) ", "")
        ));
    }
}
