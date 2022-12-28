package com.example.account.Dto;

import com.example.account.Type.ErrorCode;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class ErrorResponse {
    private ErrorCode errorCode;
    private String errorMessage;
}
 