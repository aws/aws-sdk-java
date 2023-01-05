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
package com.amazonaws.services.sagemaker.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum ClarifyTextLanguage {

    Af("af"),
    Sq("sq"),
    Ar("ar"),
    Hy("hy"),
    Eu("eu"),
    Bn("bn"),
    Bg("bg"),
    Ca("ca"),
    Zh("zh"),
    Hr("hr"),
    Cs("cs"),
    Da("da"),
    Nl("nl"),
    En("en"),
    Et("et"),
    Fi("fi"),
    Fr("fr"),
    De("de"),
    El("el"),
    Gu("gu"),
    He("he"),
    Hi("hi"),
    Hu("hu"),
    Is("is"),
    Id("id"),
    Ga("ga"),
    It("it"),
    Kn("kn"),
    Ky("ky"),
    Lv("lv"),
    Lt("lt"),
    Lb("lb"),
    Mk("mk"),
    Ml("ml"),
    Mr("mr"),
    Ne("ne"),
    Nb("nb"),
    Fa("fa"),
    Pl("pl"),
    Pt("pt"),
    Ro("ro"),
    Ru("ru"),
    Sa("sa"),
    Sr("sr"),
    Tn("tn"),
    Si("si"),
    Sk("sk"),
    Sl("sl"),
    Es("es"),
    Sv("sv"),
    Tl("tl"),
    Ta("ta"),
    Tt("tt"),
    Te("te"),
    Tr("tr"),
    Uk("uk"),
    Ur("ur"),
    Yo("yo"),
    Lij("lij"),
    Xx("xx");

    private String value;

    private ClarifyTextLanguage(String value) {
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
     * @return ClarifyTextLanguage corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static ClarifyTextLanguage fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (ClarifyTextLanguage enumEntry : ClarifyTextLanguage.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
