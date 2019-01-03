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
 * Describes the condition of the SFTP server with respect to its ability to perform file operations. There are six
 * possible states: <code>OFFLINE</code>, <code>ONLINE</code>, <code>STARTING</code>, <code>STOPPING</code>,
 * <code>START_FAILED</code>, and <code>STOP_FAILED</code>.
 * </p>
 * <p>
 * <code>OFFLINE</code> indicates that the SFTP server exists, but that it is not available for file operations.
 * <code>ONLINE</code> indicates that the SFTP server is available to perform file operations. <code>STARTING</code>
 * indicates that the SFTP server's was instantiated, but the server is not yet available to perform file operations.
 * Under normal conditions, it can take a couple of minutes for an SFTP server to be completely operational. Both
 * <code>START_FAILED</code> and <code>STOP_FAILED</code> are error conditions.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum State {

    OFFLINE("OFFLINE"),
    ONLINE("ONLINE"),
    STARTING("STARTING"),
    STOPPING("STOPPING"),
    START_FAILED("START_FAILED"),
    STOP_FAILED("STOP_FAILED");

    private String value;

    private State(String value) {
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
     * @return State corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static State fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (State enumEntry : State.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
