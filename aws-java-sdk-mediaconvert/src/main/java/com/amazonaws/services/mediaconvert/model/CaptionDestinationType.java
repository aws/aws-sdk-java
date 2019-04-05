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
package com.amazonaws.services.mediaconvert.model;

import javax.annotation.Generated;

/**
 * Specify the format for this set of captions on this output. The default format is embedded without SCTE-20. Other
 * options are embedded with SCTE-20, burn-in, DVB-sub, SCC, SRT, teletext, TTML, and web-VTT. If you are using SCTE-20,
 * choose SCTE-20 plus embedded (SCTE20_PLUS_EMBEDDED) to create an output that complies with the SCTE-43 spec. To
 * create a non-compliant output where the embedded captions come first, choose Embedded plus SCTE-20
 * (EMBEDDED_PLUS_SCTE20).
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum CaptionDestinationType {

    BURN_IN("BURN_IN"),
    DVB_SUB("DVB_SUB"),
    EMBEDDED("EMBEDDED"),
    EMBEDDED_PLUS_SCTE20("EMBEDDED_PLUS_SCTE20"),
    SCTE20_PLUS_EMBEDDED("SCTE20_PLUS_EMBEDDED"),
    SCC("SCC"),
    SRT("SRT"),
    SMI("SMI"),
    TELETEXT("TELETEXT"),
    TTML("TTML"),
    WEBVTT("WEBVTT");

    private String value;

    private CaptionDestinationType(String value) {
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
     * @return CaptionDestinationType corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static CaptionDestinationType fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (CaptionDestinationType enumEntry : CaptionDestinationType.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
