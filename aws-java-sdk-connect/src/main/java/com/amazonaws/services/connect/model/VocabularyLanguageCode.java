/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.connect.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum VocabularyLanguageCode {

    ArAE("ar-AE"),
    DeCH("de-CH"),
    DeDE("de-DE"),
    EnAB("en-AB"),
    EnAU("en-AU"),
    EnGB("en-GB"),
    EnIE("en-IE"),
    EnIN("en-IN"),
    EnUS("en-US"),
    EnWL("en-WL"),
    EsES("es-ES"),
    EsUS("es-US"),
    FrCA("fr-CA"),
    FrFR("fr-FR"),
    HiIN("hi-IN"),
    ItIT("it-IT"),
    JaJP("ja-JP"),
    KoKR("ko-KR"),
    PtBR("pt-BR"),
    PtPT("pt-PT"),
    ZhCN("zh-CN"),
    EnNZ("en-NZ"),
    EnZA("en-ZA");

    private String value;

    private VocabularyLanguageCode(String value) {
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
     * @return VocabularyLanguageCode corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static VocabularyLanguageCode fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (VocabularyLanguageCode enumEntry : VocabularyLanguageCode.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
