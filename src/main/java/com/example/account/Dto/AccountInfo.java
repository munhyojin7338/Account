package com.example.account.Dto;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
/**
 *  Client 와 Controller 주고 받는 응답..
 */
public class AccountInfo {
    private String accountNumber;
    private Long balance;
}
