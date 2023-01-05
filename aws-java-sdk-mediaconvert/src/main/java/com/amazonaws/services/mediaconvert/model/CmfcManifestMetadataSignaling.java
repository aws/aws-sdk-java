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
package com.amazonaws.services.mediaconvert.model;

import javax.annotation.Generated;

/**
 * To add an InbandEventStream element in your output MPD manifest for each type of event message, set Manifest metadata
 * signaling to Enabled. For ID3 event messages, the InbandEventStream element schemeIdUri will be same value that you
 * specify for ID3 metadata scheme ID URI. For SCTE35 event messages, the InbandEventStream element schemeIdUri will be
 * "urn:scte:scte35:2013:bin". To leave these elements out of your output MPD manifest, set Manifest metadata signaling
 * to Disabled.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum CmfcManifestMetadataSignaling {

    ENABLED("ENABLED"),
    DISABLED("DISABLED");

    private String value;

    private CmfcManifestMetadataSignaling(String value) {
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
     * @return CmfcManifestMetadataSignaling corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static CmfcManifestMetadataSignaling fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (CmfcManifestMetadataSignaling enumEntry : CmfcManifestMetadataSignaling.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
