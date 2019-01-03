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
package com.amazonaws.services.kinesisanalytics.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalytics-2015-08-14/DiscoverInputSchema"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DiscoverInputSchemaResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Schema inferred from the streaming source. It identifies the format of the data in the streaming source and how
     * each data element maps to corresponding columns in the in-application stream that you can create.
     * </p>
     */
    private SourceSchema inputSchema;
    /**
     * <p>
     * An array of elements, where each element corresponds to a row in a stream record (a stream record can have more
     * than one row).
     * </p>
     */
    private java.util.List<java.util.List<String>> parsedInputRecords;
    /**
     * <p>
     * Stream data that was modified by the processor specified in the <code>InputProcessingConfiguration</code>
     * parameter.
     * </p>
     */
    private java.util.List<String> processedInputRecords;
    /**
     * <p>
     * Raw stream data that was sampled to infer the schema.
     * </p>
     */
    private java.util.List<String> rawInputRecords;

    /**
     * <p>
     * Schema inferred from the streaming source. It identifies the format of the data in the streaming source and how
     * each data element maps to corresponding columns in the in-application stream that you can create.
     * </p>
     * 
     * @param inputSchema
     *        Schema inferred from the streaming source. It identifies the format of the data in the streaming source
     *        and how each data element maps to corresponding columns in the in-application stream that you can create.
     */

    public void setInputSchema(SourceSchema inputSchema) {
        this.inputSchema = inputSchema;
    }

    /**
     * <p>
     * Schema inferred from the streaming source. It identifies the format of the data in the streaming source and how
     * each data element maps to corresponding columns in the in-application stream that you can create.
     * </p>
     * 
     * @return Schema inferred from the streaming source. It identifies the format of the data in the streaming source
     *         and how each data element maps to corresponding columns in the in-application stream that you can create.
     */

    public SourceSchema getInputSchema() {
        return this.inputSchema;
    }

    /**
     * <p>
     * Schema inferred from the streaming source. It identifies the format of the data in the streaming source and how
     * each data element maps to corresponding columns in the in-application stream that you can create.
     * </p>
     * 
     * @param inputSchema
     *        Schema inferred from the streaming source. It identifies the format of the data in the streaming source
     *        and how each data element maps to corresponding columns in the in-application stream that you can create.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DiscoverInputSchemaResult withInputSchema(SourceSchema inputSchema) {
        setInputSchema(inputSchema);
        return this;
    }

    /**
     * <p>
     * An array of elements, where each element corresponds to a row in a stream record (a stream record can have more
     * than one row).
     * </p>
     * 
     * @return An array of elements, where each element corresponds to a row in a stream record (a stream record can
     *         have more than one row).
     */

    public java.util.List<java.util.List<String>> getParsedInputRecords() {
        return parsedInputRecords;
    }

    /**
     * <p>
     * An array of elements, where each element corresponds to a row in a stream record (a stream record can have more
     * than one row).
     * </p>
     * 
     * @param parsedInputRecords
     *        An array of elements, where each element corresponds to a row in a stream record (a stream record can have
     *        more than one row).
     */

    public void setParsedInputRecords(java.util.Collection<java.util.List<String>> parsedInputRecords) {
        if (parsedInputRecords == null) {
            this.parsedInputRecords = null;
            return;
        }

        this.parsedInputRecords = new java.util.ArrayList<java.util.List<String>>(parsedInputRecords);
    }

    /**
     * <p>
     * An array of elements, where each element corresponds to a row in a stream record (a stream record can have more
     * than one row).
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setParsedInputRecords(java.util.Collection)} or {@link #withParsedInputRecords(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param parsedInputRecords
     *        An array of elements, where each element corresponds to a row in a stream record (a stream record can have
     *        more than one row).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DiscoverInputSchemaResult withParsedInputRecords(java.util.List<String>... parsedInputRecords) {
        if (this.parsedInputRecords == null) {
            setParsedInputRecords(new java.util.ArrayList<java.util.List<String>>(parsedInputRecords.length));
        }
        for (java.util.List<String> ele : parsedInputRecords) {
            this.parsedInputRecords.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of elements, where each element corresponds to a row in a stream record (a stream record can have more
     * than one row).
     * </p>
     * 
     * @param parsedInputRecords
     *        An array of elements, where each element corresponds to a row in a stream record (a stream record can have
     *        more than one row).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DiscoverInputSchemaResult withParsedInputRecords(java.util.Collection<java.util.List<String>> parsedInputRecords) {
        setParsedInputRecords(parsedInputRecords);
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

    public DiscoverInputSchemaResult withProcessedInputRecords(String... processedInputRecords) {
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

    public DiscoverInputSchemaResult withProcessedInputRecords(java.util.Collection<String> processedInputRecords) {
        setProcessedInputRecords(processedInputRecords);
        return this;
    }

    /**
     * <p>
     * Raw stream data that was sampled to infer the schema.
     * </p>
     * 
     * @return Raw stream data that was sampled to infer the schema.
     */

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

    public DiscoverInputSchemaResult withRawInputRecords(String... rawInputRecords) {
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

    public DiscoverInputSchemaResult withRawInputRecords(java.util.Collection<String> rawInputRecords) {
        setRawInputRecords(rawInputRecords);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getInputSchema() != null)
            sb.append("InputSchema: ").append(getInputSchema()).append(",");
        if (getParsedInputRecords() != null)
            sb.append("ParsedInputRecords: ").append(getParsedInputRecords()).append(",");
        if (getProcessedInputRecords() != null)
            sb.append("ProcessedInputRecords: ").append(getProcessedInputRecords()).append(",");
        if (getRawInputRecords() != null)
            sb.append("RawInputRecords: ").append(getRawInputRecords());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DiscoverInputSchemaResult == false)
            return false;
        DiscoverInputSchemaResult other = (DiscoverInputSchemaResult) obj;
        if (other.getInputSchema() == null ^ this.getInputSchema() == null)
            return false;
        if (other.getInputSchema() != null && other.getInputSchema().equals(this.getInputSchema()) == false)
            return false;
        if (other.getParsedInputRecords() == null ^ this.getParsedInputRecords() == null)
            return false;
        if (other.getParsedInputRecords() != null && other.getParsedInputRecords().equals(this.getParsedInputRecords()) == false)
            return false;
        if (other.getProcessedInputRecords() == null ^ this.getProcessedInputRecords() == null)
            return false;
        if (other.getProcessedInputRecords() != null && other.getProcessedInputRecords().equals(this.getProcessedInputRecords()) == false)
            return false;
        if (other.getRawInputRecords() == null ^ this.getRawInputRecords() == null)
            return false;
        if (other.getRawInputRecords() != null && other.getRawInputRecords().equals(this.getRawInputRecords()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInputSchema() == null) ? 0 : getInputSchema().hashCode());
        hashCode = prime * hashCode + ((getParsedInputRecords() == null) ? 0 : getParsedInputRecords().hashCode());
        hashCode = prime * hashCode + ((getProcessedInputRecords() == null) ? 0 : getProcessedInputRecords().hashCode());
        hashCode = prime * hashCode + ((getRawInputRecords() == null) ? 0 : getRawInputRecords().hashCode());
        return hashCode;
    }

    @Override
    public DiscoverInputSchemaResult clone() {
        try {
            return (DiscoverInputSchemaResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
