/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.transcribe.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum LanguageCode {

    EnUS("en-US"),
    EsUS("es-US"),
    EnAU("en-AU"),
    FrCA("fr-CA"),
    EnGB("en-GB"),
    DeDE("de-DE"),
    PtBR("pt-BR"),
    FrFR("fr-FR"),
    ItIT("it-IT"),
    KoKR("ko-KR"),
    EsES("es-ES"),
    EnIN("en-IN"),
    HiIN("hi-IN"),
    ArSA("ar-SA"),
    RuRU("ru-RU"),
    ZhCN("zh-CN"),
    NlNL("nl-NL"),
    IdID("id-ID"),
    TaIN("ta-IN"),
    FaIR("fa-IR"),
    EnIE("en-IE"),
    EnAB("en-AB"),
    EnWL("en-WL"),
    PtPT("pt-PT"),
    TeIN("te-IN"),
    TrTR("tr-TR"),
    DeCH("de-CH"),
    HeIL("he-IL"),
    MsMY("ms-MY"),
    JaJP("ja-JP"),
    ArAE("ar-AE");

    private String value;

    private LanguageCode(String value) {
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
     * @return LanguageCode corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static LanguageCode fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (LanguageCode enumEntry : LanguageCode.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
