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

package com.amazonaws.services.ec2.model;

/**
 * 
 */
public enum BundleTaskState {

    Pending("pending"),
    WaitingForShutdown("waiting-for-shutdown"),
    Bundling("bundling"),
    Storing("storing"),
    Cancelling("cancelling"),
    Complete("complete"),
    Failed("failed");

    private String value;

    private BundleTaskState(String value) {
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
     * @return BundleTaskState corresponding to the value
     */
    public static BundleTaskState fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if ("pending".equals(value)) {
            return Pending;
        } else if ("waiting-for-shutdown".equals(value)) {
            return WaitingForShutdown;
        } else if ("bundling".equals(value)) {
            return Bundling;
        } else if ("storing".equals(value)) {
            return Storing;
        } else if ("cancelling".equals(value)) {
            return Cancelling;
        } else if ("complete".equals(value)) {
            return Complete;
        } else if ("failed".equals(value)) {
            return Failed;
        } else {
            throw new IllegalArgumentException("Cannot create enum from "
                    + value + " value!");
        }
    }
}