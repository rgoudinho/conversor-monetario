package br.edu.utfpr.currency_converter.model.dto;

import lombok.Data;
import lombok.NonNull;

@Data
public class CurrencyDTO {
    @NonNull
    private String currencyName;

    @NonNull
    private float valueRelativeReal;
}
