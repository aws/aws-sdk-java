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
package com.amazonaws.services.iotfleetwise.model;

import javax.annotation.Generated;

/**
 * <p>
 * The request couldn't be completed because it contains signals that aren't valid.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InvalidSignalsException extends com.amazonaws.services.iotfleetwise.model.AWSIoTFleetWiseException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The signals which caused the exception.
     * </p>
     */
    private java.util.List<InvalidSignal> invalidSignals;

    /**
     * Constructs a new InvalidSignalsException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public InvalidSignalsException(String message) {
        super(message);
    }

    /**
     * <p>
     * The signals which caused the exception.
     * </p>
     * 
     * @return The signals which caused the exception.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("invalidSignals")
    public java.util.List<InvalidSignal> getInvalidSignals() {
        return invalidSignals;
    }

    /**
     * <p>
     * The signals which caused the exception.
     * </p>
     * 
     * @param invalidSignals
     *        The signals which caused the exception.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("invalidSignals")
    public void setInvalidSignals(java.util.Collection<InvalidSignal> invalidSignals) {
        if (invalidSignals == null) {
            this.invalidSignals = null;
            return;
        }

        this.invalidSignals = new java.util.ArrayList<InvalidSignal>(invalidSignals);
    }

    /**
     * <p>
     * The signals which caused the exception.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInvalidSignals(java.util.Collection)} or {@link #withInvalidSignals(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param invalidSignals
     *        The signals which caused the exception.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvalidSignalsException withInvalidSignals(InvalidSignal... invalidSignals) {
        if (this.invalidSignals == null) {
            setInvalidSignals(new java.util.ArrayList<InvalidSignal>(invalidSignals.length));
        }
        for (InvalidSignal ele : invalidSignals) {
            this.invalidSignals.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The signals which caused the exception.
     * </p>
     * 
     * @param invalidSignals
     *        The signals which caused the exception.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvalidSignalsException withInvalidSignals(java.util.Collection<InvalidSignal> invalidSignals) {
        setInvalidSignals(invalidSignals);
        return this;
    }

}
