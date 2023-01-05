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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The model latency threshold.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ModelLatencyThreshold" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModelLatencyThreshold implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The model latency percentile threshold.
     * </p>
     */
    private String percentile;
    /**
     * <p>
     * The model latency percentile value in milliseconds.
     * </p>
     */
    private Integer valueInMilliseconds;

    /**
     * <p>
     * The model latency percentile threshold.
     * </p>
     * 
     * @param percentile
     *        The model latency percentile threshold.
     */

    public void setPercentile(String percentile) {
        this.percentile = percentile;
    }

    /**
     * <p>
     * The model latency percentile threshold.
     * </p>
     * 
     * @return The model latency percentile threshold.
     */

    public String getPercentile() {
        return this.percentile;
    }

    /**
     * <p>
     * The model latency percentile threshold.
     * </p>
     * 
     * @param percentile
     *        The model latency percentile threshold.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelLatencyThreshold withPercentile(String percentile) {
        setPercentile(percentile);
        return this;
    }

    /**
     * <p>
     * The model latency percentile value in milliseconds.
     * </p>
     * 
     * @param valueInMilliseconds
     *        The model latency percentile value in milliseconds.
     */

    public void setValueInMilliseconds(Integer valueInMilliseconds) {
        this.valueInMilliseconds = valueInMilliseconds;
    }

    /**
     * <p>
     * The model latency percentile value in milliseconds.
     * </p>
     * 
     * @return The model latency percentile value in milliseconds.
     */

    public Integer getValueInMilliseconds() {
        return this.valueInMilliseconds;
    }

    /**
     * <p>
     * The model latency percentile value in milliseconds.
     * </p>
     * 
     * @param valueInMilliseconds
     *        The model latency percentile value in milliseconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelLatencyThreshold withValueInMilliseconds(Integer valueInMilliseconds) {
        setValueInMilliseconds(valueInMilliseconds);
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
        if (getPercentile() != null)
            sb.append("Percentile: ").append(getPercentile()).append(",");
        if (getValueInMilliseconds() != null)
            sb.append("ValueInMilliseconds: ").append(getValueInMilliseconds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModelLatencyThreshold == false)
            return false;
        ModelLatencyThreshold other = (ModelLatencyThreshold) obj;
        if (other.getPercentile() == null ^ this.getPercentile() == null)
            return false;
        if (other.getPercentile() != null && other.getPercentile().equals(this.getPercentile()) == false)
            return false;
        if (other.getValueInMilliseconds() == null ^ this.getValueInMilliseconds() == null)
            return false;
        if (other.getValueInMilliseconds() != null && other.getValueInMilliseconds().equals(this.getValueInMilliseconds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPercentile() == null) ? 0 : getPercentile().hashCode());
        hashCode = prime * hashCode + ((getValueInMilliseconds() == null) ? 0 : getValueInMilliseconds().hashCode());
        return hashCode;
    }

    @Override
    public ModelLatencyThreshold clone() {
        try {
            return (ModelLatencyThreshold) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.ModelLatencyThresholdMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
