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
package com.amazonaws.services.comprehend.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum PartOfSpeechTagType {

    ADJ("ADJ"),
    ADP("ADP"),
    ADV("ADV"),
    AUX("AUX"),
    CONJ("CONJ"),
    CCONJ("CCONJ"),
    DET("DET"),
    INTJ("INTJ"),
    NOUN("NOUN"),
    NUM("NUM"),
    O("O"),
    PART("PART"),
    PRON("PRON"),
    PROPN("PROPN"),
    PUNCT("PUNCT"),
    SCONJ("SCONJ"),
    SYM("SYM"),
    VERB("VERB");

    private String value;

    private PartOfSpeechTagType(String value) {
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
     * @return PartOfSpeechTagType corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static PartOfSpeechTagType fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (PartOfSpeechTagType enumEntry : PartOfSpeechTagType.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
