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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The dimension of a metric.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MetricDimension implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A unique identifier for the dimension.
     * </p>
     */
    private String dimensionName;
    /**
     * <p>
     * Defines how the <code>dimensionValues</code> of a dimension are interpreted. For example, for dimension type
     * TOPIC_FILTER, the <code>IN</code> operator, a message will be counted only if its topic matches one of the topic
     * filters. With <code>NOT_IN</code> operator, a message will be counted only if it doesn't match any of the topic
     * filters. The operator is optional: if it's not provided (is <code>null</code>), it will be interpreted as
     * <code>IN</code>.
     * </p>
     */
    private String operator;

    /**
     * <p>
     * A unique identifier for the dimension.
     * </p>
     * 
     * @param dimensionName
     *        A unique identifier for the dimension.
     */

    public void setDimensionName(String dimensionName) {
        this.dimensionName = dimensionName;
    }

    /**
     * <p>
     * A unique identifier for the dimension.
     * </p>
     * 
     * @return A unique identifier for the dimension.
     */

    public String getDimensionName() {
        return this.dimensionName;
    }

    /**
     * <p>
     * A unique identifier for the dimension.
     * </p>
     * 
     * @param dimensionName
     *        A unique identifier for the dimension.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricDimension withDimensionName(String dimensionName) {
        setDimensionName(dimensionName);
        return this;
    }

    /**
     * <p>
     * Defines how the <code>dimensionValues</code> of a dimension are interpreted. For example, for dimension type
     * TOPIC_FILTER, the <code>IN</code> operator, a message will be counted only if its topic matches one of the topic
     * filters. With <code>NOT_IN</code> operator, a message will be counted only if it doesn't match any of the topic
     * filters. The operator is optional: if it's not provided (is <code>null</code>), it will be interpreted as
     * <code>IN</code>.
     * </p>
     * 
     * @param operator
     *        Defines how the <code>dimensionValues</code> of a dimension are interpreted. For example, for dimension
     *        type TOPIC_FILTER, the <code>IN</code> operator, a message will be counted only if its topic matches one
     *        of the topic filters. With <code>NOT_IN</code> operator, a message will be counted only if it doesn't
     *        match any of the topic filters. The operator is optional: if it's not provided (is <code>null</code>), it
     *        will be interpreted as <code>IN</code>.
     * @see DimensionValueOperator
     */

    public void setOperator(String operator) {
        this.operator = operator;
    }

    /**
     * <p>
     * Defines how the <code>dimensionValues</code> of a dimension are interpreted. For example, for dimension type
     * TOPIC_FILTER, the <code>IN</code> operator, a message will be counted only if its topic matches one of the topic
     * filters. With <code>NOT_IN</code> operator, a message will be counted only if it doesn't match any of the topic
     * filters. The operator is optional: if it's not provided (is <code>null</code>), it will be interpreted as
     * <code>IN</code>.
     * </p>
     * 
     * @return Defines how the <code>dimensionValues</code> of a dimension are interpreted. For example, for dimension
     *         type TOPIC_FILTER, the <code>IN</code> operator, a message will be counted only if its topic matches one
     *         of the topic filters. With <code>NOT_IN</code> operator, a message will be counted only if it doesn't
     *         match any of the topic filters. The operator is optional: if it's not provided (is <code>null</code>), it
     *         will be interpreted as <code>IN</code>.
     * @see DimensionValueOperator
     */

    public String getOperator() {
        return this.operator;
    }

    /**
     * <p>
     * Defines how the <code>dimensionValues</code> of a dimension are interpreted. For example, for dimension type
     * TOPIC_FILTER, the <code>IN</code> operator, a message will be counted only if its topic matches one of the topic
     * filters. With <code>NOT_IN</code> operator, a message will be counted only if it doesn't match any of the topic
     * filters. The operator is optional: if it's not provided (is <code>null</code>), it will be interpreted as
     * <code>IN</code>.
     * </p>
     * 
     * @param operator
     *        Defines how the <code>dimensionValues</code> of a dimension are interpreted. For example, for dimension
     *        type TOPIC_FILTER, the <code>IN</code> operator, a message will be counted only if its topic matches one
     *        of the topic filters. With <code>NOT_IN</code> operator, a message will be counted only if it doesn't
     *        match any of the topic filters. The operator is optional: if it's not provided (is <code>null</code>), it
     *        will be interpreted as <code>IN</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DimensionValueOperator
     */

    public MetricDimension withOperator(String operator) {
        setOperator(operator);
        return this;
    }

    /**
     * <p>
     * Defines how the <code>dimensionValues</code> of a dimension are interpreted. For example, for dimension type
     * TOPIC_FILTER, the <code>IN</code> operator, a message will be counted only if its topic matches one of the topic
     * filters. With <code>NOT_IN</code> operator, a message will be counted only if it doesn't match any of the topic
     * filters. The operator is optional: if it's not provided (is <code>null</code>), it will be interpreted as
     * <code>IN</code>.
     * </p>
     * 
     * @param operator
     *        Defines how the <code>dimensionValues</code> of a dimension are interpreted. For example, for dimension
     *        type TOPIC_FILTER, the <code>IN</code> operator, a message will be counted only if its topic matches one
     *        of the topic filters. With <code>NOT_IN</code> operator, a message will be counted only if it doesn't
     *        match any of the topic filters. The operator is optional: if it's not provided (is <code>null</code>), it
     *        will be interpreted as <code>IN</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DimensionValueOperator
     */

    public MetricDimension withOperator(DimensionValueOperator operator) {
        this.operator = operator.toString();
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
        if (getDimensionName() != null)
            sb.append("DimensionName: ").append(getDimensionName()).append(",");
        if (getOperator() != null)
            sb.append("Operator: ").append(getOperator());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MetricDimension == false)
            return false;
        MetricDimension other = (MetricDimension) obj;
        if (other.getDimensionName() == null ^ this.getDimensionName() == null)
            return false;
        if (other.getDimensionName() != null && other.getDimensionName().equals(this.getDimensionName()) == false)
            return false;
        if (other.getOperator() == null ^ this.getOperator() == null)
            return false;
        if (other.getOperator() != null && other.getOperator().equals(this.getOperator()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDimensionName() == null) ? 0 : getDimensionName().hashCode());
        hashCode = prime * hashCode + ((getOperator() == null) ? 0 : getOperator().hashCode());
        return hashCode;
    }

    @Override
    public MetricDimension clone() {
        try {
            return (MetricDimension) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.MetricDimensionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
