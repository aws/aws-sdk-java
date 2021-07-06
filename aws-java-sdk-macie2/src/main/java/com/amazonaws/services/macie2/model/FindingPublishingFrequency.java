/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.macie2.model;

import javax.annotation.Generated;

/**
 * <p>
 * The frequency with which Amazon Macie publishes updates to policy findings for an account. This includes publishing
 * updates to Security Hub and Amazon EventBridge (formerly called Amazon CloudWatch Events). For more information, see
 * <a href="https://docs.aws.amazon.com/macie/latest/user/findings-monitor.html">Monitoring and processing findings</a>
 * in the <i>Amazon Macie User Guide</i>. Valid values are:
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum FindingPublishingFrequency {

    FIFTEEN_MINUTES("FIFTEEN_MINUTES"),
    ONE_HOUR("ONE_HOUR"),
    SIX_HOURS("SIX_HOURS");

    private String value;

    private FindingPublishingFrequency(String value) {
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
     * @return FindingPublishingFrequency corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static FindingPublishingFrequency fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (FindingPublishingFrequency enumEntry : FindingPublishingFrequency.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
