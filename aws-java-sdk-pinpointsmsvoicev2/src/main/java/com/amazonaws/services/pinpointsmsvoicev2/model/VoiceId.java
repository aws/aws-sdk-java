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
package com.amazonaws.services.pinpointsmsvoicev2.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum VoiceId {

    AMY("AMY"),
    ASTRID("ASTRID"),
    BIANCA("BIANCA"),
    BRIAN("BRIAN"),
    CAMILA("CAMILA"),
    CARLA("CARLA"),
    CARMEN("CARMEN"),
    CELINE("CELINE"),
    CHANTAL("CHANTAL"),
    CONCHITA("CONCHITA"),
    CRISTIANO("CRISTIANO"),
    DORA("DORA"),
    EMMA("EMMA"),
    ENRIQUE("ENRIQUE"),
    EWA("EWA"),
    FILIZ("FILIZ"),
    GERAINT("GERAINT"),
    GIORGIO("GIORGIO"),
    GWYNETH("GWYNETH"),
    HANS("HANS"),
    INES("INES"),
    IVY("IVY"),
    JACEK("JACEK"),
    JAN("JAN"),
    JOANNA("JOANNA"),
    JOEY("JOEY"),
    JUSTIN("JUSTIN"),
    KARL("KARL"),
    KENDRA("KENDRA"),
    KIMBERLY("KIMBERLY"),
    LEA("LEA"),
    LIV("LIV"),
    LOTTE("LOTTE"),
    LUCIA("LUCIA"),
    LUPE("LUPE"),
    MADS("MADS"),
    MAJA("MAJA"),
    MARLENE("MARLENE"),
    MATHIEU("MATHIEU"),
    MATTHEW("MATTHEW"),
    MAXIM("MAXIM"),
    MIA("MIA"),
    MIGUEL("MIGUEL"),
    MIZUKI("MIZUKI"),
    NAJA("NAJA"),
    NICOLE("NICOLE"),
    PENELOPE("PENELOPE"),
    RAVEENA("RAVEENA"),
    RICARDO("RICARDO"),
    RUBEN("RUBEN"),
    RUSSELL("RUSSELL"),
    SALLI("SALLI"),
    SEOYEON("SEOYEON"),
    TAKUMI("TAKUMI"),
    TATYANA("TATYANA"),
    VICKI("VICKI"),
    VITORIA("VITORIA"),
    ZEINA("ZEINA"),
    ZHIYU("ZHIYU");

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
