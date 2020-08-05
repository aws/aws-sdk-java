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

    AfZA("af-ZA"),
    ArAE("ar-AE"),
    ArSA("ar-SA"),
    CyGB("cy-GB"),
    DaDK("da-DK"),
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
    FaIR("fa-IR"),
    FrCA("fr-CA"),
    FrFR("fr-FR"),
    GaIE("ga-IE"),
    GdGB("gd-GB"),
    HeIL("he-IL"),
    HiIN("hi-IN"),
    IdID("id-ID"),
    ItIT("it-IT"),
    JaJP("ja-JP"),
    KoKR("ko-KR"),
    MsMY("ms-MY"),
    NlNL("nl-NL"),
    PtBR("pt-BR"),
    PtPT("pt-PT"),
    RuRU("ru-RU"),
    TaIN("ta-IN"),
    TeIN("te-IN"),
    TrTR("tr-TR"),
    ZhCN("zh-CN");

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
