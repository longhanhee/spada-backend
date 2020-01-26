package com.hanhee.spada.model_param;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class VerifyAuthCodeParam {
    private String telephone;
    @JsonProperty("auth_code")
    private String authCode;
}
