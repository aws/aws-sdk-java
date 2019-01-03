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
package com.amazonaws.services.transfer.model;

import javax.annotation.Generated;

/**
 * <p>
 * Returns information related to the type of user authentication that is in use for a server's users. For
 * <code>SERVICE_MANAGED</code> authentication, the Secure Shell (SSH) public keys are stored with a user on an SFTP
 * server instance. For <code>API_GATEWAY</code> authentication, your custom authentication method is implemented by
 * using an API call. A server can only have one method of authentication.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum IdentityProviderType {

    SERVICE_MANAGED("SERVICE_MANAGED"),
    API_GATEWAY("API_GATEWAY");

    private String value;

    private IdentityProviderType(String value) {
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
     * @return IdentityProviderType corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static IdentityProviderType fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (IdentityProviderType enumEntry : IdentityProviderType.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
