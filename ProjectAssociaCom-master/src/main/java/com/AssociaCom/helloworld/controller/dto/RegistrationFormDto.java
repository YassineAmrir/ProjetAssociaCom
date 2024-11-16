package com.AssociaCom.helloworld.controller.dto;

import com.AssociaCom.helloworld.model.Association;
import com.AssociaCom.helloworld.model.President;
import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
@Builder
public class RegistrationFormDto {

    @NonNull
    private Association association;
    @NonNull
    private President president;

}
