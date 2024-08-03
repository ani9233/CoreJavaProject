package com.javaproject.conditionalstatement;

import lombok.extern.log4j.Log4j2;

import java.util.Scanner;

@Log4j2

public class LanguageAssignment {

    public static void main(String[] args) {
        LanguageAssignment language = new LanguageAssignment();
        Scanner scanner = new Scanner(System.in);
        log.info("Enter the language code");
        String response = scanner.next();
        String resp1 = language.getlangassignment(response);
        log.info("Response:{}",resp1);
        String resp2 = language.getLanguagelambda(response);
        log.info("Response:{}",resp2);
        String resp3 = language.getLanguageYield(response);
        log.info("Response:{}",resp3);
    }
 // Default switch
        public String getlangassignment(String response) {
             String lang= null;
            switch (response) {
                case "ENG":
                    lang = "English";
                    break;
                case "SPN":
                    lang = "Spanish";
                   break;
                default:
                    lang = "Code is of different language";
            }
            return lang;
        }
// Lambda switch
    public String getLanguagelambda(String response) {
        String lang = null;

        lang = switch (response) {
            case "ENG" -> "English";
            case "SPN" -> "Spanish";
            default -> "Code is of different language";
        };
        return lang;
    }

    //yield switch
    public String getLanguageYield(String response) {
            return switch (response) {
                case "ENG":
                     yield "English";
                case "SPN":
                     yield "Spanish";
                default:
                     yield "unknown Language";
            };
        }
}
