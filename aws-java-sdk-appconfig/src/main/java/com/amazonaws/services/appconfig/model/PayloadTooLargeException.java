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
package com.amazonaws.services.appconfig.model;

import javax.annotation.Generated;

/**
 * <p>
 * The configuration size is too large.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PayloadTooLargeException extends com.amazonaws.services.appconfig.model.AmazonAppConfigException {
    private static final long serialVersionUID = 1L;

    private String measure;

    private Float limit;

    private Float size;

    /**
     * Constructs a new PayloadTooLargeException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public PayloadTooLargeException(String message) {
        super(message);
    }

    /**
     * @param measure
     * @see BytesMeasure
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Measure")
    public void setMeasure(String measure) {
        this.measure = measure;
    }

    /**
     * @return
     * @see BytesMeasure
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Measure")
    public String getMeasure() {
        return this.measure;
    }

    /**
     * @param measure
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BytesMeasure
     */

    public PayloadTooLargeException withMeasure(String measure) {
        setMeasure(measure);
        return this;
    }

    /**
     * @param measure
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BytesMeasure
     */

    public PayloadTooLargeException withMeasure(BytesMeasure measure) {
        this.measure = measure.toString();
        return this;
    }

    /**
     * @param limit
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Limit")
    public void setLimit(Float limit) {
        this.limit = limit;
    }

    /**
     * @return
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Limit")
    public Float getLimit() {
        return this.limit;
    }

    /**
     * @param limit
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PayloadTooLargeException withLimit(Float limit) {
        setLimit(limit);
        return this;
    }

    /**
     * @param size
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Size")
    public void setSize(Float size) {
        this.size = size;
    }

    /**
     * @return
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Size")
    public Float getSize() {
        return this.size;
    }

    /**
     * @param size
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PayloadTooLargeException withSize(Float size) {
        setSize(size);
        return this;
    }

}
