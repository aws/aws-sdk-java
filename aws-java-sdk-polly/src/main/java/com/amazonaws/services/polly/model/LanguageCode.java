/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.polly.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum LanguageCode {

    Arb("arb"),
    CmnCN("cmn-CN"),
    CyGB("cy-GB"),
    DaDK("da-DK"),
    DeDE("de-DE"),
    EnAU("en-AU"),
    EnGB("en-GB"),
    EnGBWLS("en-GB-WLS"),
    EnIN("en-IN"),
    EnUS("en-US"),
    EsES("es-ES"),
    EsMX("es-MX"),
    EsUS("es-US"),
    FrCA("fr-CA"),
    FrFR("fr-FR"),
    IsIS("is-IS"),
    ItIT("it-IT"),
    JaJP("ja-JP"),
    HiIN("hi-IN"),
    KoKR("ko-KR"),
    NbNO("nb-NO"),
    NlNL("nl-NL"),
    PlPL("pl-PL"),
    PtBR("pt-BR"),
    PtPT("pt-PT"),
    RoRO("ro-RO"),
    RuRU("ru-RU"),
    SvSE("sv-SE"),
    TrTR("tr-TR");

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
