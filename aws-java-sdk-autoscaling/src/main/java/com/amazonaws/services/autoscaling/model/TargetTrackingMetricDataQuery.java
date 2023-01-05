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
package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The metric data to return. Also defines whether this call is returning data for one metric only, or whether it is
 * performing a math expression on the values of returned metric statistics to create a new time series. A time series
 * is a series of data points, each of which is associated with a timestamp.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/TargetTrackingMetricDataQuery"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TargetTrackingMetricDataQuery implements Serializable, Cloneable {

    /**
     * <p>
     * A short name that identifies the object's results in the response. This name must be unique among all
     * <code>TargetTrackingMetricDataQuery</code> objects specified for a single scaling policy. If you are performing
     * math expressions on this set of data, this name represents that data and can serve as a variable in the
     * mathematical expression. The valid characters are letters, numbers, and underscores. The first character must be
     * a lowercase letter.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The math expression to perform on the returned data, if this object is performing a math expression. This
     * expression can use the <code>Id</code> of the other metrics to refer to those metrics, and can also use the
     * <code>Id</code> of other expressions to use the result of those expressions.
     * </p>
     * <p>
     * Conditional: Within each <code>TargetTrackingMetricDataQuery</code> object, you must specify either
     * <code>Expression</code> or <code>MetricStat</code>, but not both.
     * </p>
     */
    private String expression;
    /**
     * <p>
     * Information about the metric data to return.
     * </p>
     * <p>
     * Conditional: Within each <code>TargetTrackingMetricDataQuery</code> object, you must specify either
     * <code>Expression</code> or <code>MetricStat</code>, but not both.
     * </p>
     */
    private TargetTrackingMetricStat metricStat;
    /**
     * <p>
     * A human-readable label for this metric or expression. This is especially useful if this is a math expression, so
     * that you know what the value represents.
     * </p>
     */
    private String label;
    /**
     * <p>
     * Indicates whether to return the timestamps and raw data values of this metric.
     * </p>
     * <p>
     * If you use any math expressions, specify <code>true</code> for this value for only the final math expression that
     * the metric specification is based on. You must specify <code>false</code> for <code>ReturnData</code> for all the
     * other metrics and expressions used in the metric specification.
     * </p>
     * <p>
     * If you are only retrieving metrics and not performing any math expressions, do not specify anything for
     * <code>ReturnData</code>. This sets it to its default (<code>true</code>).
     * </p>
     */
    private Boolean returnData;

    /**
     * <p>
     * A short name that identifies the object's results in the response. This name must be unique among all
     * <code>TargetTrackingMetricDataQuery</code> objects specified for a single scaling policy. If you are performing
     * math expressions on this set of data, this name represents that data and can serve as a variable in the
     * mathematical expression. The valid characters are letters, numbers, and underscores. The first character must be
     * a lowercase letter.
     * </p>
     * 
     * @param id
     *        A short name that identifies the object's results in the response. This name must be unique among all
     *        <code>TargetTrackingMetricDataQuery</code> objects specified for a single scaling policy. If you are
     *        performing math expressions on this set of data, this name represents that data and can serve as a
     *        variable in the mathematical expression. The valid characters are letters, numbers, and underscores. The
     *        first character must be a lowercase letter.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * A short name that identifies the object's results in the response. This name must be unique among all
     * <code>TargetTrackingMetricDataQuery</code> objects specified for a single scaling policy. If you are performing
     * math expressions on this set of data, this name represents that data and can serve as a variable in the
     * mathematical expression. The valid characters are letters, numbers, and underscores. The first character must be
     * a lowercase letter.
     * </p>
     * 
     * @return A short name that identifies the object's results in the response. This name must be unique among all
     *         <code>TargetTrackingMetricDataQuery</code> objects specified for a single scaling policy. If you are
     *         performing math expressions on this set of data, this name represents that data and can serve as a
     *         variable in the mathematical expression. The valid characters are letters, numbers, and underscores. The
     *         first character must be a lowercase letter.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * A short name that identifies the object's results in the response. This name must be unique among all
     * <code>TargetTrackingMetricDataQuery</code> objects specified for a single scaling policy. If you are performing
     * math expressions on this set of data, this name represents that data and can serve as a variable in the
     * mathematical expression. The valid characters are letters, numbers, and underscores. The first character must be
     * a lowercase letter.
     * </p>
     * 
     * @param id
     *        A short name that identifies the object's results in the response. This name must be unique among all
     *        <code>TargetTrackingMetricDataQuery</code> objects specified for a single scaling policy. If you are
     *        performing math expressions on this set of data, this name represents that data and can serve as a
     *        variable in the mathematical expression. The valid characters are letters, numbers, and underscores. The
     *        first character must be a lowercase letter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetTrackingMetricDataQuery withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The math expression to perform on the returned data, if this object is performing a math expression. This
     * expression can use the <code>Id</code> of the other metrics to refer to those metrics, and can also use the
     * <code>Id</code> of other expressions to use the result of those expressions.
     * </p>
     * <p>
     * Conditional: Within each <code>TargetTrackingMetricDataQuery</code> object, you must specify either
     * <code>Expression</code> or <code>MetricStat</code>, but not both.
     * </p>
     * 
     * @param expression
     *        The math expression to perform on the returned data, if this object is performing a math expression. This
     *        expression can use the <code>Id</code> of the other metrics to refer to those metrics, and can also use
     *        the <code>Id</code> of other expressions to use the result of those expressions. </p>
     *        <p>
     *        Conditional: Within each <code>TargetTrackingMetricDataQuery</code> object, you must specify either
     *        <code>Expression</code> or <code>MetricStat</code>, but not both.
     */

    public void setExpression(String expression) {
        this.expression = expression;
    }

    /**
     * <p>
     * The math expression to perform on the returned data, if this object is performing a math expression. This
     * expression can use the <code>Id</code> of the other metrics to refer to those metrics, and can also use the
     * <code>Id</code> of other expressions to use the result of those expressions.
     * </p>
     * <p>
     * Conditional: Within each <code>TargetTrackingMetricDataQuery</code> object, you must specify either
     * <code>Expression</code> or <code>MetricStat</code>, but not both.
     * </p>
     * 
     * @return The math expression to perform on the returned data, if this object is performing a math expression. This
     *         expression can use the <code>Id</code> of the other metrics to refer to those metrics, and can also use
     *         the <code>Id</code> of other expressions to use the result of those expressions. </p>
     *         <p>
     *         Conditional: Within each <code>TargetTrackingMetricDataQuery</code> object, you must specify either
     *         <code>Expression</code> or <code>MetricStat</code>, but not both.
     */

    public String getExpression() {
        return this.expression;
    }

    /**
     * <p>
     * The math expression to perform on the returned data, if this object is performing a math expression. This
     * expression can use the <code>Id</code> of the other metrics to refer to those metrics, and can also use the
     * <code>Id</code> of other expressions to use the result of those expressions.
     * </p>
     * <p>
     * Conditional: Within each <code>TargetTrackingMetricDataQuery</code> object, you must specify either
     * <code>Expression</code> or <code>MetricStat</code>, but not both.
     * </p>
     * 
     * @param expression
     *        The math expression to perform on the returned data, if this object is performing a math expression. This
     *        expression can use the <code>Id</code> of the other metrics to refer to those metrics, and can also use
     *        the <code>Id</code> of other expressions to use the result of those expressions. </p>
     *        <p>
     *        Conditional: Within each <code>TargetTrackingMetricDataQuery</code> object, you must specify either
     *        <code>Expression</code> or <code>MetricStat</code>, but not both.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetTrackingMetricDataQuery withExpression(String expression) {
        setExpression(expression);
        return this;
    }

    /**
     * <p>
     * Information about the metric data to return.
     * </p>
     * <p>
     * Conditional: Within each <code>TargetTrackingMetricDataQuery</code> object, you must specify either
     * <code>Expression</code> or <code>MetricStat</code>, but not both.
     * </p>
     * 
     * @param metricStat
     *        Information about the metric data to return.</p>
     *        <p>
     *        Conditional: Within each <code>TargetTrackingMetricDataQuery</code> object, you must specify either
     *        <code>Expression</code> or <code>MetricStat</code>, but not both.
     */

    public void setMetricStat(TargetTrackingMetricStat metricStat) {
        this.metricStat = metricStat;
    }

    /**
     * <p>
     * Information about the metric data to return.
     * </p>
     * <p>
     * Conditional: Within each <code>TargetTrackingMetricDataQuery</code> object, you must specify either
     * <code>Expression</code> or <code>MetricStat</code>, but not both.
     * </p>
     * 
     * @return Information about the metric data to return.</p>
     *         <p>
     *         Conditional: Within each <code>TargetTrackingMetricDataQuery</code> object, you must specify either
     *         <code>Expression</code> or <code>MetricStat</code>, but not both.
     */

    public TargetTrackingMetricStat getMetricStat() {
        return this.metricStat;
    }

    /**
     * <p>
     * Information about the metric data to return.
     * </p>
     * <p>
     * Conditional: Within each <code>TargetTrackingMetricDataQuery</code> object, you must specify either
     * <code>Expression</code> or <code>MetricStat</code>, but not both.
     * </p>
     * 
     * @param metricStat
     *        Information about the metric data to return.</p>
     *        <p>
     *        Conditional: Within each <code>TargetTrackingMetricDataQuery</code> object, you must specify either
     *        <code>Expression</code> or <code>MetricStat</code>, but not both.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetTrackingMetricDataQuery withMetricStat(TargetTrackingMetricStat metricStat) {
        setMetricStat(metricStat);
        return this;
    }

    /**
     * <p>
     * A human-readable label for this metric or expression. This is especially useful if this is a math expression, so
     * that you know what the value represents.
     * </p>
     * 
     * @param label
     *        A human-readable label for this metric or expression. This is especially useful if this is a math
     *        expression, so that you know what the value represents.
     */

    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * <p>
     * A human-readable label for this metric or expression. This is especially useful if this is a math expression, so
     * that you know what the value represents.
     * </p>
     * 
     * @return A human-readable label for this metric or expression. This is especially useful if this is a math
     *         expression, so that you know what the value represents.
     */

    public String getLabel() {
        return this.label;
    }

    /**
     * <p>
     * A human-readable label for this metric or expression. This is especially useful if this is a math expression, so
     * that you know what the value represents.
     * </p>
     * 
     * @param label
     *        A human-readable label for this metric or expression. This is especially useful if this is a math
     *        expression, so that you know what the value represents.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetTrackingMetricDataQuery withLabel(String label) {
        setLabel(label);
        return this;
    }

    /**
     * <p>
     * Indicates whether to return the timestamps and raw data values of this metric.
     * </p>
     * <p>
     * If you use any math expressions, specify <code>true</code> for this value for only the final math expression that
     * the metric specification is based on. You must specify <code>false</code> for <code>ReturnData</code> for all the
     * other metrics and expressions used in the metric specification.
     * </p>
     * <p>
     * If you are only retrieving metrics and not performing any math expressions, do not specify anything for
     * <code>ReturnData</code>. This sets it to its default (<code>true</code>).
     * </p>
     * 
     * @param returnData
     *        Indicates whether to return the timestamps and raw data values of this metric. </p>
     *        <p>
     *        If you use any math expressions, specify <code>true</code> for this value for only the final math
     *        expression that the metric specification is based on. You must specify <code>false</code> for
     *        <code>ReturnData</code> for all the other metrics and expressions used in the metric specification.
     *        </p>
     *        <p>
     *        If you are only retrieving metrics and not performing any math expressions, do not specify anything for
     *        <code>ReturnData</code>. This sets it to its default (<code>true</code>).
     */

    public void setReturnData(Boolean returnData) {
        this.returnData = returnData;
    }

    /**
     * <p>
     * Indicates whether to return the timestamps and raw data values of this metric.
     * </p>
     * <p>
     * If you use any math expressions, specify <code>true</code> for this value for only the final math expression that
     * the metric specification is based on. You must specify <code>false</code> for <code>ReturnData</code> for all the
     * other metrics and expressions used in the metric specification.
     * </p>
     * <p>
     * If you are only retrieving metrics and not performing any math expressions, do not specify anything for
     * <code>ReturnData</code>. This sets it to its default (<code>true</code>).
     * </p>
     * 
     * @return Indicates whether to return the timestamps and raw data values of this metric. </p>
     *         <p>
     *         If you use any math expressions, specify <code>true</code> for this value for only the final math
     *         expression that the metric specification is based on. You must specify <code>false</code> for
     *         <code>ReturnData</code> for all the other metrics and expressions used in the metric specification.
     *         </p>
     *         <p>
     *         If you are only retrieving metrics and not performing any math expressions, do not specify anything for
     *         <code>ReturnData</code>. This sets it to its default (<code>true</code>).
     */

    public Boolean getReturnData() {
        return this.returnData;
    }

    /**
     * <p>
     * Indicates whether to return the timestamps and raw data values of this metric.
     * </p>
     * <p>
     * If you use any math expressions, specify <code>true</code> for this value for only the final math expression that
     * the metric specification is based on. You must specify <code>false</code> for <code>ReturnData</code> for all the
     * other metrics and expressions used in the metric specification.
     * </p>
     * <p>
     * If you are only retrieving metrics and not performing any math expressions, do not specify anything for
     * <code>ReturnData</code>. This sets it to its default (<code>true</code>).
     * </p>
     * 
     * @param returnData
     *        Indicates whether to return the timestamps and raw data values of this metric. </p>
     *        <p>
     *        If you use any math expressions, specify <code>true</code> for this value for only the final math
     *        expression that the metric specification is based on. You must specify <code>false</code> for
     *        <code>ReturnData</code> for all the other metrics and expressions used in the metric specification.
     *        </p>
     *        <p>
     *        If you are only retrieving metrics and not performing any math expressions, do not specify anything for
     *        <code>ReturnData</code>. This sets it to its default (<code>true</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetTrackingMetricDataQuery withReturnData(Boolean returnData) {
        setReturnData(returnData);
        return this;
    }

    /**
     * <p>
     * Indicates whether to return the timestamps and raw data values of this metric.
     * </p>
     * <p>
     * If you use any math expressions, specify <code>true</code> for this value for only the final math expression that
     * the metric specification is based on. You must specify <code>false</code> for <code>ReturnData</code> for all the
     * other metrics and expressions used in the metric specification.
     * </p>
     * <p>
     * If you are only retrieving metrics and not performing any math expressions, do not specify anything for
     * <code>ReturnData</code>. This sets it to its default (<code>true</code>).
     * </p>
     * 
     * @return Indicates whether to return the timestamps and raw data values of this metric. </p>
     *         <p>
     *         If you use any math expressions, specify <code>true</code> for this value for only the final math
     *         expression that the metric specification is based on. You must specify <code>false</code> for
     *         <code>ReturnData</code> for all the other metrics and expressions used in the metric specification.
     *         </p>
     *         <p>
     *         If you are only retrieving metrics and not performing any math expressions, do not specify anything for
     *         <code>ReturnData</code>. This sets it to its default (<code>true</code>).
     */

    public Boolean isReturnData() {
        return this.returnData;
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getExpression() != null)
            sb.append("Expression: ").append(getExpression()).append(",");
        if (getMetricStat() != null)
            sb.append("MetricStat: ").append(getMetricStat()).append(",");
        if (getLabel() != null)
            sb.append("Label: ").append(getLabel()).append(",");
        if (getReturnData() != null)
            sb.append("ReturnData: ").append(getReturnData());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TargetTrackingMetricDataQuery == false)
            return false;
        TargetTrackingMetricDataQuery other = (TargetTrackingMetricDataQuery) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getExpression() == null ^ this.getExpression() == null)
            return false;
        if (other.getExpression() != null && other.getExpression().equals(this.getExpression()) == false)
            return false;
        if (other.getMetricStat() == null ^ this.getMetricStat() == null)
            return false;
        if (other.getMetricStat() != null && other.getMetricStat().equals(this.getMetricStat()) == false)
            return false;
        if (other.getLabel() == null ^ this.getLabel() == null)
            return false;
        if (other.getLabel() != null && other.getLabel().equals(this.getLabel()) == false)
            return false;
        if (other.getReturnData() == null ^ this.getReturnData() == null)
            return false;
        if (other.getReturnData() != null && other.getReturnData().equals(this.getReturnData()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getExpression() == null) ? 0 : getExpression().hashCode());
        hashCode = prime * hashCode + ((getMetricStat() == null) ? 0 : getMetricStat().hashCode());
        hashCode = prime * hashCode + ((getLabel() == null) ? 0 : getLabel().hashCode());
        hashCode = prime * hashCode + ((getReturnData() == null) ? 0 : getReturnData().hashCode());
        return hashCode;
    }

    @Override
    public TargetTrackingMetricDataQuery clone() {
        try {
            return (TargetTrackingMetricDataQuery) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
