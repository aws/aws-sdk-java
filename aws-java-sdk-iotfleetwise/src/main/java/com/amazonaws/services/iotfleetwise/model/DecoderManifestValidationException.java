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
 * The request couldn't be completed because it contains signal decoders with one or more validation errors.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DecoderManifestValidationException extends com.amazonaws.services.iotfleetwise.model.AWSIoTFleetWiseException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The request couldn't be completed because of invalid signals in the request.
     * </p>
     */
    private java.util.List<InvalidSignalDecoder> invalidSignals;
    /**
     * <p>
     * The request couldn't be completed because of invalid network interfaces in the request.
     * </p>
     */
    private java.util.List<InvalidNetworkInterface> invalidNetworkInterfaces;

    /**
     * Constructs a new DecoderManifestValidationException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public DecoderManifestValidationException(String message) {
        super(message);
    }

    /**
     * <p>
     * The request couldn't be completed because of invalid signals in the request.
     * </p>
     * 
     * @return The request couldn't be completed because of invalid signals in the request.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("invalidSignals")
    public java.util.List<InvalidSignalDecoder> getInvalidSignals() {
        return invalidSignals;
    }

    /**
     * <p>
     * The request couldn't be completed because of invalid signals in the request.
     * </p>
     * 
     * @param invalidSignals
     *        The request couldn't be completed because of invalid signals in the request.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("invalidSignals")
    public void setInvalidSignals(java.util.Collection<InvalidSignalDecoder> invalidSignals) {
        if (invalidSignals == null) {
            this.invalidSignals = null;
            return;
        }

        this.invalidSignals = new java.util.ArrayList<InvalidSignalDecoder>(invalidSignals);
    }

    /**
     * <p>
     * The request couldn't be completed because of invalid signals in the request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInvalidSignals(java.util.Collection)} or {@link #withInvalidSignals(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param invalidSignals
     *        The request couldn't be completed because of invalid signals in the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DecoderManifestValidationException withInvalidSignals(InvalidSignalDecoder... invalidSignals) {
        if (this.invalidSignals == null) {
            setInvalidSignals(new java.util.ArrayList<InvalidSignalDecoder>(invalidSignals.length));
        }
        for (InvalidSignalDecoder ele : invalidSignals) {
            this.invalidSignals.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The request couldn't be completed because of invalid signals in the request.
     * </p>
     * 
     * @param invalidSignals
     *        The request couldn't be completed because of invalid signals in the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DecoderManifestValidationException withInvalidSignals(java.util.Collection<InvalidSignalDecoder> invalidSignals) {
        setInvalidSignals(invalidSignals);
        return this;
    }

    /**
     * <p>
     * The request couldn't be completed because of invalid network interfaces in the request.
     * </p>
     * 
     * @return The request couldn't be completed because of invalid network interfaces in the request.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("invalidNetworkInterfaces")
    public java.util.List<InvalidNetworkInterface> getInvalidNetworkInterfaces() {
        return invalidNetworkInterfaces;
    }

    /**
     * <p>
     * The request couldn't be completed because of invalid network interfaces in the request.
     * </p>
     * 
     * @param invalidNetworkInterfaces
     *        The request couldn't be completed because of invalid network interfaces in the request.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("invalidNetworkInterfaces")
    public void setInvalidNetworkInterfaces(java.util.Collection<InvalidNetworkInterface> invalidNetworkInterfaces) {
        if (invalidNetworkInterfaces == null) {
            this.invalidNetworkInterfaces = null;
            return;
        }

        this.invalidNetworkInterfaces = new java.util.ArrayList<InvalidNetworkInterface>(invalidNetworkInterfaces);
    }

    /**
     * <p>
     * The request couldn't be completed because of invalid network interfaces in the request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInvalidNetworkInterfaces(java.util.Collection)} or
     * {@link #withInvalidNetworkInterfaces(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param invalidNetworkInterfaces
     *        The request couldn't be completed because of invalid network interfaces in the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DecoderManifestValidationException withInvalidNetworkInterfaces(InvalidNetworkInterface... invalidNetworkInterfaces) {
        if (this.invalidNetworkInterfaces == null) {
            setInvalidNetworkInterfaces(new java.util.ArrayList<InvalidNetworkInterface>(invalidNetworkInterfaces.length));
        }
        for (InvalidNetworkInterface ele : invalidNetworkInterfaces) {
            this.invalidNetworkInterfaces.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The request couldn't be completed because of invalid network interfaces in the request.
     * </p>
     * 
     * @param invalidNetworkInterfaces
     *        The request couldn't be completed because of invalid network interfaces in the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DecoderManifestValidationException withInvalidNetworkInterfaces(java.util.Collection<InvalidNetworkInterface> invalidNetworkInterfaces) {
        setInvalidNetworkInterfaces(invalidNetworkInterfaces);
        return this;
    }

}
