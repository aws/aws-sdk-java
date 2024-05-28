/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.workdocs.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum LanguageCodeType {

    AR("AR"),
    BG("BG"),
    BN("BN"),
    DA("DA"),
    DE("DE"),
    CS("CS"),
    EL("EL"),
    EN("EN"),
    ES("ES"),
    FA("FA"),
    FI("FI"),
    FR("FR"),
    HI("HI"),
    HU("HU"),
    ID("ID"),
    IT("IT"),
    JA("JA"),
    KO("KO"),
    LT("LT"),
    LV("LV"),
    NL("NL"),
    NO("NO"),
    PT("PT"),
    RO("RO"),
    RU("RU"),
    SV("SV"),
    SW("SW"),
    TH("TH"),
    TR("TR"),
    ZH("ZH"),
    DEFAULT("DEFAULT");

    private String value;

    private LanguageCodeType(String value) {
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
     * @return LanguageCodeType corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static LanguageCodeType fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (LanguageCodeType enumEntry : LanguageCodeType.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
