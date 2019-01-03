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
public enum VoiceId {

    Geraint("Geraint"),
    Gwyneth("Gwyneth"),
    Mads("Mads"),
    Naja("Naja"),
    Hans("Hans"),
    Marlene("Marlene"),
    Nicole("Nicole"),
    Russell("Russell"),
    Amy("Amy"),
    Brian("Brian"),
    Emma("Emma"),
    Raveena("Raveena"),
    Ivy("Ivy"),
    Joanna("Joanna"),
    Joey("Joey"),
    Justin("Justin"),
    Kendra("Kendra"),
    Kimberly("Kimberly"),
    Matthew("Matthew"),
    Salli("Salli"),
    Conchita("Conchita"),
    Enrique("Enrique"),
    Miguel("Miguel"),
    Penelope("Penelope"),
    Chantal("Chantal"),
    Celine("Celine"),
    Lea("Lea"),
    Mathieu("Mathieu"),
    Dora("Dora"),
    Karl("Karl"),
    Carla("Carla"),
    Giorgio("Giorgio"),
    Mizuki("Mizuki"),
    Liv("Liv"),
    Lotte("Lotte"),
    Ruben("Ruben"),
    Ewa("Ewa"),
    Jacek("Jacek"),
    Jan("Jan"),
    Maja("Maja"),
    Ricardo("Ricardo"),
    Vitoria("Vitoria"),
    Cristiano("Cristiano"),
    Ines("Ines"),
    Carmen("Carmen"),
    Maxim("Maxim"),
    Tatyana("Tatyana"),
    Astrid("Astrid"),
    Filiz("Filiz"),
    Vicki("Vicki"),
    Takumi("Takumi"),
    Seoyeon("Seoyeon"),
    Aditi("Aditi"),
    Zhiyu("Zhiyu"),
    Bianca("Bianca"),
    Lucia("Lucia"),
    Mia("Mia");

    private String value;

    private VoiceId(String value) {
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
     * @return VoiceId corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static VoiceId fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (VoiceId enumEntry : VoiceId.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
