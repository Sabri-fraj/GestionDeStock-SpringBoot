package com.sbrfraj.tn.Gestiondestock.handlers;

import com.sbrfraj.tn.Gestiondestock.Exception.ErrorCodes;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ErrorDto {
    private Integer httpCode;
    private ErrorCodes errorCodes;
    private String message;
    private List<String> Error = new ArrayList<>();

}
