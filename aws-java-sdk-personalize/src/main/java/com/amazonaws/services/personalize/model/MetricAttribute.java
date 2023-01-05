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
package com.amazonaws.services.personalize.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information on a metric that a metric attribution reports on. For more information, see <a
 * href="https://docs.aws.amazon.com/personalize/latest/dg/measuring-recommendation-impact.html">Measuring impact of
 * recommendations</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/MetricAttribute" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MetricAttribute implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The metric's event type.
     * </p>
     */
    private String eventType;
    /**
     * <p>
     * The metric's name. The name helps you identify the metric in Amazon CloudWatch or Amazon S3.
     * </p>
     */
    private String metricName;
    /**
     * <p>
     * The attribute's expression. Available functions are <code>SUM()</code> or <code>SAMPLECOUNT()</code>. For SUM()
     * functions, provide the dataset type (either Interactions or Items) and column to sum as a parameter. For example
     * SUM(Items.PRICE).
     * </p>
     */
    private String expression;

    /**
     * <p>
     * The metric's event type.
     * </p>
     * 
     * @param eventType
     *        The metric's event type.
     */

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    /**
     * <p>
     * The metric's event type.
     * </p>
     * 
     * @return The metric's event type.
     */

    public String getEventType() {
        return this.eventType;
    }

    /**
     * <p>
     * The metric's event type.
     * </p>
     * 
     * @param eventType
     *        The metric's event type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricAttribute withEventType(String eventType) {
        setEventType(eventType);
        return this;
    }

    /**
     * <p>
     * The metric's name. The name helps you identify the metric in Amazon CloudWatch or Amazon S3.
     * </p>
     * 
     * @param metricName
     *        The metric's name. The name helps you identify the metric in Amazon CloudWatch or Amazon S3.
     */

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    /**
     * <p>
     * The metric's name. The name helps you identify the metric in Amazon CloudWatch or Amazon S3.
     * </p>
     * 
     * @return The metric's name. The name helps you identify the metric in Amazon CloudWatch or Amazon S3.
     */

    public String getMetricName() {
        return this.metricName;
    }

    /**
     * <p>
     * The metric's name. The name helps you identify the metric in Amazon CloudWatch or Amazon S3.
     * </p>
     * 
     * @param metricName
     *        The metric's name. The name helps you identify the metric in Amazon CloudWatch or Amazon S3.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricAttribute withMetricName(String metricName) {
        setMetricName(metricName);
        return this;
    }

    /**
     * <p>
     * The attribute's expression. Available functions are <code>SUM()</code> or <code>SAMPLECOUNT()</code>. For SUM()
     * functions, provide the dataset type (either Interactions or Items) and column to sum as a parameter. For example
     * SUM(Items.PRICE).
     * </p>
     * 
     * @param expression
     *        The attribute's expression. Available functions are <code>SUM()</code> or <code>SAMPLECOUNT()</code>. For
     *        SUM() functions, provide the dataset type (either Interactions or Items) and column to sum as a parameter.
     *        For example SUM(Items.PRICE).
     */

    public void setExpression(String expression) {
        this.expression = expression;
    }

    /**
     * <p>
     * The attribute's expression. Available functions are <code>SUM()</code> or <code>SAMPLECOUNT()</code>. For SUM()
     * functions, provide the dataset type (either Interactions or Items) and column to sum as a parameter. For example
     * SUM(Items.PRICE).
     * </p>
     * 
     * @return The attribute's expression. Available functions are <code>SUM()</code> or <code>SAMPLECOUNT()</code>. For
     *         SUM() functions, provide the dataset type (either Interactions or Items) and column to sum as a
     *         parameter. For example SUM(Items.PRICE).
     */

    public String getExpression() {
        return this.expression;
    }

    /**
     * <p>
     * The attribute's expression. Available functions are <code>SUM()</code> or <code>SAMPLECOUNT()</code>. For SUM()
     * functions, provide the dataset type (either Interactions or Items) and column to sum as a parameter. For example
     * SUM(Items.PRICE).
     * </p>
     * 
     * @param expression
     *        The attribute's expression. Available functions are <code>SUM()</code> or <code>SAMPLECOUNT()</code>. For
     *        SUM() functions, provide the dataset type (either Interactions or Items) and column to sum as a parameter.
     *        For example SUM(Items.PRICE).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricAttribute withExpression(String expression) {
        setExpression(expression);
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
        if (getEventType() != null)
            sb.append("EventType: ").append(getEventType()).append(",");
        if (getMetricName() != null)
            sb.append("MetricName: ").append(getMetricName()).append(",");
        if (getExpression() != null)
            sb.append("Expression: ").append(getExpression());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MetricAttribute == false)
            return false;
        MetricAttribute other = (MetricAttribute) obj;
        if (other.getEventType() == null ^ this.getEventType() == null)
            return false;
        if (other.getEventType() != null && other.getEventType().equals(this.getEventType()) == false)
            return false;
        if (other.getMetricName() == null ^ this.getMetricName() == null)
            return false;
        if (other.getMetricName() != null && other.getMetricName().equals(this.getMetricName()) == false)
            return false;
        if (other.getExpression() == null ^ this.getExpression() == null)
            return false;
        if (other.getExpression() != null && other.getExpression().equals(this.getExpression()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEventType() == null) ? 0 : getEventType().hashCode());
        hashCode = prime * hashCode + ((getMetricName() == null) ? 0 : getMetricName().hashCode());
        hashCode = prime * hashCode + ((getExpression() == null) ? 0 : getExpression().hashCode());
        return hashCode;
    }

    @Override
    public MetricAttribute clone() {
        try {
            return (MetricAttribute) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.personalize.model.transform.MetricAttributeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
