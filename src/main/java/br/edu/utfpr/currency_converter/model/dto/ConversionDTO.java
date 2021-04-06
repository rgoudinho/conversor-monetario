package br.edu.utfpr.currency_converter.model.dto;

import lombok.Data;
import lombok.NonNull;

@Data
public class ConversionDTO {
    @NonNull
    private float value;

    @NonNull
    private String startingCurrency;

    @NonNull
    private String convertedCurrency;

    @NonNull
    private UserDTO user;
}
