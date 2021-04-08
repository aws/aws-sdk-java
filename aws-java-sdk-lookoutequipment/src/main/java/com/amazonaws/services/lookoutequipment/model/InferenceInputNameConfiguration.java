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
package com.amazonaws.services.lookoutequipment.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * &gt;&gt; Specifies configuration information for the input data for the inference, including timestamp format and
 * delimiter.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/InferenceInputNameConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InferenceInputNameConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The format of the timestamp, whether Epoch time, or standard, with or without hyphens (-).
     * </p>
     */
    private String timestampFormat;
    /**
     * <p>
     * Indicates the delimiter character used between items in the data.
     * </p>
     */
    private String componentTimestampDelimiter;

    /**
     * <p>
     * The format of the timestamp, whether Epoch time, or standard, with or without hyphens (-).
     * </p>
     * 
     * @param timestampFormat
     *        The format of the timestamp, whether Epoch time, or standard, with or without hyphens (-).
     */

    public void setTimestampFormat(String timestampFormat) {
        this.timestampFormat = timestampFormat;
    }

    /**
     * <p>
     * The format of the timestamp, whether Epoch time, or standard, with or without hyphens (-).
     * </p>
     * 
     * @return The format of the timestamp, whether Epoch time, or standard, with or without hyphens (-).
     */

    public String getTimestampFormat() {
        return this.timestampFormat;
    }

    /**
     * <p>
     * The format of the timestamp, whether Epoch time, or standard, with or without hyphens (-).
     * </p>
     * 
     * @param timestampFormat
     *        The format of the timestamp, whether Epoch time, or standard, with or without hyphens (-).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InferenceInputNameConfiguration withTimestampFormat(String timestampFormat) {
        setTimestampFormat(timestampFormat);
        return this;
    }

    /**
     * <p>
     * Indicates the delimiter character used between items in the data.
     * </p>
     * 
     * @param componentTimestampDelimiter
     *        Indicates the delimiter character used between items in the data.
     */

    public void setComponentTimestampDelimiter(String componentTimestampDelimiter) {
        this.componentTimestampDelimiter = componentTimestampDelimiter;
    }

    /**
     * <p>
     * Indicates the delimiter character used between items in the data.
     * </p>
     * 
     * @return Indicates the delimiter character used between items in the data.
     */

    public String getComponentTimestampDelimiter() {
        return this.componentTimestampDelimiter;
    }

    /**
     * <p>
     * Indicates the delimiter character used between items in the data.
     * </p>
     * 
     * @param componentTimestampDelimiter
     *        Indicates the delimiter character used between items in the data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InferenceInputNameConfiguration withComponentTimestampDelimiter(String componentTimestampDelimiter) {
        setComponentTimestampDelimiter(componentTimestampDelimiter);
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
        if (getTimestampFormat() != null)
            sb.append("TimestampFormat: ").append(getTimestampFormat()).append(",");
        if (getComponentTimestampDelimiter() != null)
            sb.append("ComponentTimestampDelimiter: ").append(getComponentTimestampDelimiter());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InferenceInputNameConfiguration == false)
            return false;
        InferenceInputNameConfiguration other = (InferenceInputNameConfiguration) obj;
        if (other.getTimestampFormat() == null ^ this.getTimestampFormat() == null)
            return false;
        if (other.getTimestampFormat() != null && other.getTimestampFormat().equals(this.getTimestampFormat()) == false)
            return false;
        if (other.getComponentTimestampDelimiter() == null ^ this.getComponentTimestampDelimiter() == null)
            return false;
        if (other.getComponentTimestampDelimiter() != null && other.getComponentTimestampDelimiter().equals(this.getComponentTimestampDelimiter()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTimestampFormat() == null) ? 0 : getTimestampFormat().hashCode());
        hashCode = prime * hashCode + ((getComponentTimestampDelimiter() == null) ? 0 : getComponentTimestampDelimiter().hashCode());
        return hashCode;
    }

    @Override
    public InferenceInputNameConfiguration clone() {
        try {
            return (InferenceInputNameConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lookoutequipment.model.transform.InferenceInputNameConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
