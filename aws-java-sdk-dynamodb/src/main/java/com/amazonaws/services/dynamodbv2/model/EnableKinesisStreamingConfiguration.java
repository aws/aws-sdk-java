/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Enables setting the configuration for Kinesis Streaming.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/EnableKinesisStreamingConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EnableKinesisStreamingConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Toggle for the precision of Kinesis data stream timestamp. The values are either <code>MILLISECOND</code> or
     * <code>MICROSECOND</code>.
     * </p>
     */
    private String approximateCreationDateTimePrecision;

    /**
     * <p>
     * Toggle for the precision of Kinesis data stream timestamp. The values are either <code>MILLISECOND</code> or
     * <code>MICROSECOND</code>.
     * </p>
     * 
     * @param approximateCreationDateTimePrecision
     *        Toggle for the precision of Kinesis data stream timestamp. The values are either <code>MILLISECOND</code>
     *        or <code>MICROSECOND</code>.
     * @see ApproximateCreationDateTimePrecision
     */

    public void setApproximateCreationDateTimePrecision(String approximateCreationDateTimePrecision) {
        this.approximateCreationDateTimePrecision = approximateCreationDateTimePrecision;
    }

    /**
     * <p>
     * Toggle for the precision of Kinesis data stream timestamp. The values are either <code>MILLISECOND</code> or
     * <code>MICROSECOND</code>.
     * </p>
     * 
     * @return Toggle for the precision of Kinesis data stream timestamp. The values are either <code>MILLISECOND</code>
     *         or <code>MICROSECOND</code>.
     * @see ApproximateCreationDateTimePrecision
     */

    public String getApproximateCreationDateTimePrecision() {
        return this.approximateCreationDateTimePrecision;
    }

    /**
     * <p>
     * Toggle for the precision of Kinesis data stream timestamp. The values are either <code>MILLISECOND</code> or
     * <code>MICROSECOND</code>.
     * </p>
     * 
     * @param approximateCreationDateTimePrecision
     *        Toggle for the precision of Kinesis data stream timestamp. The values are either <code>MILLISECOND</code>
     *        or <code>MICROSECOND</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApproximateCreationDateTimePrecision
     */

    public EnableKinesisStreamingConfiguration withApproximateCreationDateTimePrecision(String approximateCreationDateTimePrecision) {
        setApproximateCreationDateTimePrecision(approximateCreationDateTimePrecision);
        return this;
    }

    /**
     * <p>
     * Toggle for the precision of Kinesis data stream timestamp. The values are either <code>MILLISECOND</code> or
     * <code>MICROSECOND</code>.
     * </p>
     * 
     * @param approximateCreationDateTimePrecision
     *        Toggle for the precision of Kinesis data stream timestamp. The values are either <code>MILLISECOND</code>
     *        or <code>MICROSECOND</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApproximateCreationDateTimePrecision
     */

    public EnableKinesisStreamingConfiguration withApproximateCreationDateTimePrecision(
            ApproximateCreationDateTimePrecision approximateCreationDateTimePrecision) {
        this.approximateCreationDateTimePrecision = approximateCreationDateTimePrecision.toString();
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
        if (getApproximateCreationDateTimePrecision() != null)
            sb.append("ApproximateCreationDateTimePrecision: ").append(getApproximateCreationDateTimePrecision());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EnableKinesisStreamingConfiguration == false)
            return false;
        EnableKinesisStreamingConfiguration other = (EnableKinesisStreamingConfiguration) obj;
        if (other.getApproximateCreationDateTimePrecision() == null ^ this.getApproximateCreationDateTimePrecision() == null)
            return false;
        if (other.getApproximateCreationDateTimePrecision() != null
                && other.getApproximateCreationDateTimePrecision().equals(this.getApproximateCreationDateTimePrecision()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApproximateCreationDateTimePrecision() == null) ? 0 : getApproximateCreationDateTimePrecision().hashCode());
        return hashCode;
    }

    @Override
    public EnableKinesisStreamingConfiguration clone() {
        try {
            return (EnableKinesisStreamingConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dynamodbv2.model.transform.EnableKinesisStreamingConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
