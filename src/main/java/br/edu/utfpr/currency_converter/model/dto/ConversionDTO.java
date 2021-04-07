package br.edu.utfpr.currency_converter.model.dto;

import lombok.Data;
import lombok.NonNull;

@Data
public class ConversionDTO {
    @NonNull
    private float value;

    @NonNull
    private CurrencyDTO startingCurrency;

    @NonNull
    private CurrencyDTO convertedCurrency;

    @NonNull
    private UserDTO user;

}
