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

    Aditi("Aditi"),
    Amy("Amy"),
    Astrid("Astrid"),
    Bianca("Bianca"),
    Brian("Brian"),
    Carla("Carla"),
    Carmen("Carmen"),
    Celine("Celine"),
    Chantal("Chantal"),
    Conchita("Conchita"),
    Cristiano("Cristiano"),
    Dora("Dora"),
    Emma("Emma"),
    Enrique("Enrique"),
    Ewa("Ewa"),
    Filiz("Filiz"),
    Geraint("Geraint"),
    Giorgio("Giorgio"),
    Gwyneth("Gwyneth"),
    Hans("Hans"),
    Ines("Ines"),
    Ivy("Ivy"),
    Jacek("Jacek"),
    Jan("Jan"),
    Joanna("Joanna"),
    Joey("Joey"),
    Justin("Justin"),
    Karl("Karl"),
    Kendra("Kendra"),
    Kimberly("Kimberly"),
    Lea("Lea"),
    Liv("Liv"),
    Lotte("Lotte"),
    Lucia("Lucia"),
    Mads("Mads"),
    Maja("Maja"),
    Marlene("Marlene"),
    Mathieu("Mathieu"),
    Matthew("Matthew"),
    Maxim("Maxim"),
    Mia("Mia"),
    Miguel("Miguel"),
    Mizuki("Mizuki"),
    Naja("Naja"),
    Nicole("Nicole"),
    Penelope("Penelope"),
    Raveena("Raveena"),
    Ricardo("Ricardo"),
    Ruben("Ruben"),
    Russell("Russell"),
    Salli("Salli"),
    Seoyeon("Seoyeon"),
    Takumi("Takumi"),
    Tatyana("Tatyana"),
    Vicki("Vicki"),
    Vitoria("Vitoria"),
    Zeina("Zeina"),
    Zhiyu("Zhiyu");

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
