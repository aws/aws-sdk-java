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
package com.amazonaws.services.cloudsearchv2.model;

import javax.annotation.Generated;

/**
 * <p>
 * The state of processing a change to an option. One of:
 * </p>
 * <ul>
 * <li>RequiresIndexDocuments: The option's latest value will not be deployed until <a>IndexDocuments</a> has been
 * called and indexing is complete.</li>
 * <li>Processing: The option's latest value is in the process of being activated.</li>
 * <li>Active: The option's latest value is fully deployed.</li>
 * <li>FailedToValidate: The option value is not compatible with the domain's data and cannot be used to index the data.
 * You must either modify the option value or update or remove the incompatible documents.</li>
 * </ul>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum OptionState {

    RequiresIndexDocuments("RequiresIndexDocuments"),
    Processing("Processing"),
    Active("Active"),
    FailedToValidate("FailedToValidate");

    private String value;

    private OptionState(String value) {
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
     * @return OptionState corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static OptionState fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (OptionState enumEntry : OptionState.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
