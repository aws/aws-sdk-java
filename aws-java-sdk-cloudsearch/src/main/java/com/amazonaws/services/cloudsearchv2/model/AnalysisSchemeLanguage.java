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
package com.amazonaws.services.cloudsearchv2.model;

import javax.annotation.Generated;

/**
 * <p>
 * An <a href="http://tools.ietf.org/html/rfc4646" target="_blank">IETF RFC 4646</a> language code or <code>mul</code>
 * for multiple languages.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum AnalysisSchemeLanguage {

    Ar("ar"),
    Bg("bg"),
    Ca("ca"),
    Cs("cs"),
    Da("da"),
    De("de"),
    El("el"),
    En("en"),
    Es("es"),
    Eu("eu"),
    Fa("fa"),
    Fi("fi"),
    Fr("fr"),
    Ga("ga"),
    Gl("gl"),
    He("he"),
    Hi("hi"),
    Hu("hu"),
    Hy("hy"),
    Id("id"),
    It("it"),
    Ja("ja"),
    Ko("ko"),
    Lv("lv"),
    Mul("mul"),
    Nl("nl"),
    No("no"),
    Pt("pt"),
    Ro("ro"),
    Ru("ru"),
    Sv("sv"),
    Th("th"),
    Tr("tr"),
    ZhHans("zh-Hans"),
    ZhHant("zh-Hant");

    private String value;

    private AnalysisSchemeLanguage(String value) {
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
     * @return AnalysisSchemeLanguage corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static AnalysisSchemeLanguage fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (AnalysisSchemeLanguage enumEntry : AnalysisSchemeLanguage.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
