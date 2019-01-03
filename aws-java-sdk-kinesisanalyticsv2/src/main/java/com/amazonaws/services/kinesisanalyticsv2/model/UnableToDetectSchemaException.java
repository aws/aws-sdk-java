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
package com.amazonaws.services.kinesisanalyticsv2.model;

import javax.annotation.Generated;

/**
 * <p>
 * The data format is not valid. Amazon Kinesis Data Analytics cannot detect the schema for the given streaming source.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UnableToDetectSchemaException extends com.amazonaws.services.kinesisanalyticsv2.model.AmazonKinesisAnalyticsV2Exception {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * Raw stream data that was sampled to infer the schema.
     * </p>
     */
    private java.util.List<String> rawInputRecords;
    /**
     * <p>
     * Stream data that was modified by the processor specified in the <code>InputProcessingConfiguration</code>
     * parameter.
     * </p>
     */
    private java.util.List<String> processedInputRecords;

    /**
     * Constructs a new UnableToDetectSchemaException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public UnableToDetectSchemaException(String message) {
        super(message);
    }

    /**
     * <p>
     * Raw stream data that was sampled to infer the schema.
     * </p>
     * 
     * @return Raw stream data that was sampled to infer the schema.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("RawInputRecords")
    public java.util.List<String> getRawInputRecords() {
        return rawInputRecords;
    }

    /**
     * <p>
     * Raw stream data that was sampled to infer the schema.
     * </p>
     * 
     * @param rawInputRecords
     *        Raw stream data that was sampled to infer the schema.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("RawInputRecords")
    public void setRawInputRecords(java.util.Collection<String> rawInputRecords) {
        if (rawInputRecords == null) {
            this.rawInputRecords = null;
            return;
        }

        this.rawInputRecords = new java.util.ArrayList<String>(rawInputRecords);
    }

    /**
     * <p>
     * Raw stream data that was sampled to infer the schema.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRawInputRecords(java.util.Collection)} or {@link #withRawInputRecords(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param rawInputRecords
     *        Raw stream data that was sampled to infer the schema.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UnableToDetectSchemaException withRawInputRecords(String... rawInputRecords) {
        if (this.rawInputRecords == null) {
            setRawInputRecords(new java.util.ArrayList<String>(rawInputRecords.length));
        }
        for (String ele : rawInputRecords) {
            this.rawInputRecords.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Raw stream data that was sampled to infer the schema.
     * </p>
     * 
     * @param rawInputRecords
     *        Raw stream data that was sampled to infer the schema.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UnableToDetectSchemaException withRawInputRecords(java.util.Collection<String> rawInputRecords) {
        setRawInputRecords(rawInputRecords);
        return this;
    }

    /**
     * <p>
     * Stream data that was modified by the processor specified in the <code>InputProcessingConfiguration</code>
     * parameter.
     * </p>
     * 
     * @return Stream data that was modified by the processor specified in the <code>InputProcessingConfiguration</code>
     *         parameter.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ProcessedInputRecords")
    public java.util.List<String> getProcessedInputRecords() {
        return processedInputRecords;
    }

    /**
     * <p>
     * Stream data that was modified by the processor specified in the <code>InputProcessingConfiguration</code>
     * parameter.
     * </p>
     * 
     * @param processedInputRecords
     *        Stream data that was modified by the processor specified in the <code>InputProcessingConfiguration</code>
     *        parameter.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ProcessedInputRecords")
    public void setProcessedInputRecords(java.util.Collection<String> processedInputRecords) {
        if (processedInputRecords == null) {
            this.processedInputRecords = null;
            return;
        }

        this.processedInputRecords = new java.util.ArrayList<String>(processedInputRecords);
    }

    /**
     * <p>
     * Stream data that was modified by the processor specified in the <code>InputProcessingConfiguration</code>
     * parameter.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProcessedInputRecords(java.util.Collection)} or
     * {@link #withProcessedInputRecords(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param processedInputRecords
     *        Stream data that was modified by the processor specified in the <code>InputProcessingConfiguration</code>
     *        parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UnableToDetectSchemaException withProcessedInputRecords(String... processedInputRecords) {
        if (this.processedInputRecords == null) {
            setProcessedInputRecords(new java.util.ArrayList<String>(processedInputRecords.length));
        }
        for (String ele : processedInputRecords) {
            this.processedInputRecords.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Stream data that was modified by the processor specified in the <code>InputProcessingConfiguration</code>
     * parameter.
     * </p>
     * 
     * @param processedInputRecords
     *        Stream data that was modified by the processor specified in the <code>InputProcessingConfiguration</code>
     *        parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UnableToDetectSchemaException withProcessedInputRecords(java.util.Collection<String> processedInputRecords) {
        setProcessedInputRecords(processedInputRecords);
        return this;
    }

}
