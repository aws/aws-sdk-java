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
package com.amazonaws.services.pinpointemail.model;

import javax.annotation.Generated;

/**
 * <p>
 * Specifies whether Amazon Pinpoint should require that incoming email is delivered over a connection encrypted with
 * Transport Layer Security (TLS). If this parameter is set to <code>Require</code>, Amazon Pinpoint rejects emails that
 * weren't received over TLS. If the parameter is set to <code>Optional</code>, then Amazon Pinpoint accepts emails that
 * weren't received over TLS. The default value is <code>Optional</code>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum TlsPolicy {

    REQUIRE("REQUIRE"),
    OPTIONAL("OPTIONAL");

    private String value;

    private TlsPolicy(String value) {
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
     * @return TlsPolicy corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static TlsPolicy fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (TlsPolicy enumEntry : TlsPolicy.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
