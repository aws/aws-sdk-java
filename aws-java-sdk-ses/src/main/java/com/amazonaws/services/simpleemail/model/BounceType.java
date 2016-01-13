/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.simpleemail.model;

/**
 * 
 */
public enum BounceType {

    DoesNotExist("DoesNotExist"),
    MessageTooLarge("MessageTooLarge"),
    ExceededQuota("ExceededQuota"),
    ContentRejected("ContentRejected"),
    Undefined("Undefined"),
    TemporaryFailure("TemporaryFailure");

    private String value;

    private BounceType(String value) {
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
     * @return BounceType corresponding to the value
     */
    public static BounceType fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if ("DoesNotExist".equals(value)) {
            return DoesNotExist;
        } else if ("MessageTooLarge".equals(value)) {
            return MessageTooLarge;
        } else if ("ExceededQuota".equals(value)) {
            return ExceededQuota;
        } else if ("ContentRejected".equals(value)) {
            return ContentRejected;
        } else if ("Undefined".equals(value)) {
            return Undefined;
        } else if ("TemporaryFailure".equals(value)) {
            return TemporaryFailure;
        } else {
            throw new IllegalArgumentException("Cannot create enum from "
                    + value + " value!");
        }
    }
}