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
package com.amazonaws.services.devopsguru.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A statistic in a Performance Insights collection.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/PerformanceInsightsStat"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PerformanceInsightsStat implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The statistic type.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The value of the statistic.
     * </p>
     */
    private Double value;

    /**
     * <p>
     * The statistic type.
     * </p>
     * 
     * @param type
     *        The statistic type.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The statistic type.
     * </p>
     * 
     * @return The statistic type.
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The statistic type.
     * </p>
     * 
     * @param type
     *        The statistic type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PerformanceInsightsStat withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The value of the statistic.
     * </p>
     * 
     * @param value
     *        The value of the statistic.
     */

    public void setValue(Double value) {
        this.value = value;
    }

    /**
     * <p>
     * The value of the statistic.
     * </p>
     * 
     * @return The value of the statistic.
     */

    public Double getValue() {
        return this.value;
    }

    /**
     * <p>
     * The value of the statistic.
     * </p>
     * 
     * @param value
     *        The value of the statistic.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PerformanceInsightsStat withValue(Double value) {
        setValue(value);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PerformanceInsightsStat == false)
            return false;
        PerformanceInsightsStat other = (PerformanceInsightsStat) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public PerformanceInsightsStat clone() {
        try {
            return (PerformanceInsightsStat) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.devopsguru.model.transform.PerformanceInsightsStatMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
