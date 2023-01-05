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
package com.amazonaws.services.route53domains.model;

import javax.annotation.Generated;

/**
 * <p>
 * Whether the domain name can be transferred to Route 53.
 * </p>
 * <note>
 * <p>
 * You can transfer only domains that have a value of <code>TRANSFERABLE</code> or <code>Transferable</code>.
 * </p>
 * </note>
 * <p>
 * Valid values:
 * </p>
 * <dl>
 * <dt>TRANSFERABLE</dt>
 * <dd>
 * <p>
 * The domain name can be transferred to Route 53.
 * </p>
 * </dd>
 * <dt>UNTRANSFERRABLE</dt>
 * <dd>
 * <p>
 * The domain name can't be transferred to Route 53.
 * </p>
 * </dd>
 * <dt>DONT_KNOW</dt>
 * <dd>
 * <p>
 * Reserved for future use.
 * </p>
 * </dd>
 * <dt>DOMAIN_IN_OWN_ACCOUNT</dt>
 * <dd>
 * <p>
 * The domain already exists in the current Amazon Web Services account.
 * </p>
 * </dd>
 * <dt>DOMAIN_IN_ANOTHER_ACCOUNT</dt>
 * <dd>
 * <p>
 * the domain exists in another Amazon Web Services account.
 * </p>
 * </dd>
 * <dt>PREMIUM_DOMAIN</dt>
 * <dd>
 * <p>
 * Premium domain transfer is not supported.
 * </p>
 * </dd>
 * </dl>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum Transferable {

    TRANSFERABLE("TRANSFERABLE"),
    UNTRANSFERABLE("UNTRANSFERABLE"),
    DONT_KNOW("DONT_KNOW"),
    DOMAIN_IN_OWN_ACCOUNT("DOMAIN_IN_OWN_ACCOUNT"),
    DOMAIN_IN_ANOTHER_ACCOUNT("DOMAIN_IN_ANOTHER_ACCOUNT"),
    PREMIUM_DOMAIN("PREMIUM_DOMAIN");

    private String value;

    private Transferable(String value) {
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
     * @return Transferable corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static Transferable fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (Transferable enumEntry : Transferable.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
