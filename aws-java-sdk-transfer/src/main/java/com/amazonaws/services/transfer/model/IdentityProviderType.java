/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The mode of authentication for a server. The default value is <code>SERVICE_MANAGED</code>, which allows you to store
 * and access user credentials within the Transfer Family service.
 * </p>
 * <p>
 * Use <code>AWS_DIRECTORY_SERVICE</code> to provide access to Active Directory groups in Directory Service for
 * Microsoft Active Directory or Microsoft Active Directory in your on-premises environment or in Amazon Web Services
 * using AD Connector. This option also requires you to provide a Directory ID by using the
 * <code>IdentityProviderDetails</code> parameter.
 * </p>
 * <p>
 * Use the <code>API_GATEWAY</code> value to integrate with an identity provider of your choosing. The
 * <code>API_GATEWAY</code> setting requires you to provide an Amazon API Gateway endpoint URL to call for
 * authentication by using the <code>IdentityProviderDetails</code> parameter.
 * </p>
 * <p>
 * Use the <code>AWS_LAMBDA</code> value to directly use an Lambda function as your identity provider. If you choose
 * this value, you must specify the ARN for the Lambda function in the <code>Function</code> parameter for the
 * <code>IdentityProviderDetails</code> data type.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum IdentityProviderType {

    SERVICE_MANAGED("SERVICE_MANAGED"),
    API_GATEWAY("API_GATEWAY"),
    AWS_DIRECTORY_SERVICE("AWS_DIRECTORY_SERVICE"),
    AWS_LAMBDA("AWS_LAMBDA");

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
