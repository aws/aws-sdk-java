/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.sns.model;

import javax.annotation.Generated;

/**
 * Supported language code for sending OTP message
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum LanguageCodeString {

    EnUS("en-US"),
    EnGB("en-GB"),
    Es419("es-419"),
    EsES("es-ES"),
    DeDE("de-DE"),
    FrCA("fr-CA"),
    FrFR("fr-FR"),
    ItIT("it-IT"),
    JaJP("ja-JP"),
    PtBR("pt-BR"),
    KrKR("kr-KR"),
    ZhCN("zh-CN"),
    ZhTW("zh-TW");

    private String value;

    private LanguageCodeString(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value
     *        real value
     * @return LanguageCodeString corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static LanguageCodeString fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (LanguageCodeString enumEntry : LanguageCodeString.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
