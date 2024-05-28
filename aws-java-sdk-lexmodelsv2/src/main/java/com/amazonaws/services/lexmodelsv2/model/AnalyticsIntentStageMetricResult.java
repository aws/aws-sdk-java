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
package com.amazonaws.services.lexmodelsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object containing the results for an intent stage metric you requested.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/AnalyticsIntentStageMetricResult"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AnalyticsIntentStageMetricResult implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The metric that you requested.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Count</code> – The number of times the intent stage occurred.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Success</code> – The number of times the intent stage succeeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failure</code> – The number of times the intent stage failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Dropped</code> – The number of times the user dropped the intent stage.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Retry</code> – The number of times the bot tried to elicit a response from the user at this stage.
     * </p>
     * </li>
     * </ul>
     */
    private String name;
    /**
     * <p>
     * The summary statistic that you requested to calculate.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Sum</code> – The total count for the category you provide in <code>name</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Average</code> – The total count divided by the number of intent stages in the category you provide in
     * <code>name</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Max</code> – The highest count in the category you provide in <code>name</code>.
     * </p>
     * </li>
     * </ul>
     */
    private String statistic;
    /**
     * <p>
     * The value of the summary statistic for the metric that you requested.
     * </p>
     */
    private Double value;

    /**
     * <p>
     * The metric that you requested.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Count</code> – The number of times the intent stage occurred.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Success</code> – The number of times the intent stage succeeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failure</code> – The number of times the intent stage failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Dropped</code> – The number of times the user dropped the intent stage.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Retry</code> – The number of times the bot tried to elicit a response from the user at this stage.
     * </p>
     * </li>
     * </ul>
     * 
     * @param name
     *        The metric that you requested.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Count</code> – The number of times the intent stage occurred.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Success</code> – The number of times the intent stage succeeded.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Failure</code> – The number of times the intent stage failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Dropped</code> – The number of times the user dropped the intent stage.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Retry</code> – The number of times the bot tried to elicit a response from the user at this stage.
     *        </p>
     *        </li>
     * @see AnalyticsIntentStageMetricName
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The metric that you requested.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Count</code> – The number of times the intent stage occurred.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Success</code> – The number of times the intent stage succeeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failure</code> – The number of times the intent stage failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Dropped</code> – The number of times the user dropped the intent stage.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Retry</code> – The number of times the bot tried to elicit a response from the user at this stage.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The metric that you requested.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Count</code> – The number of times the intent stage occurred.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Success</code> – The number of times the intent stage succeeded.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Failure</code> – The number of times the intent stage failed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Dropped</code> – The number of times the user dropped the intent stage.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Retry</code> – The number of times the bot tried to elicit a response from the user at this stage.
     *         </p>
     *         </li>
     * @see AnalyticsIntentStageMetricName
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The metric that you requested.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Count</code> – The number of times the intent stage occurred.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Success</code> – The number of times the intent stage succeeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failure</code> – The number of times the intent stage failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Dropped</code> – The number of times the user dropped the intent stage.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Retry</code> – The number of times the bot tried to elicit a response from the user at this stage.
     * </p>
     * </li>
     * </ul>
     * 
     * @param name
     *        The metric that you requested.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Count</code> – The number of times the intent stage occurred.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Success</code> – The number of times the intent stage succeeded.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Failure</code> – The number of times the intent stage failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Dropped</code> – The number of times the user dropped the intent stage.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Retry</code> – The number of times the bot tried to elicit a response from the user at this stage.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AnalyticsIntentStageMetricName
     */

    public AnalyticsIntentStageMetricResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The metric that you requested.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Count</code> – The number of times the intent stage occurred.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Success</code> – The number of times the intent stage succeeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failure</code> – The number of times the intent stage failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Dropped</code> – The number of times the user dropped the intent stage.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Retry</code> – The number of times the bot tried to elicit a response from the user at this stage.
     * </p>
     * </li>
     * </ul>
     * 
     * @param name
     *        The metric that you requested.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Count</code> – The number of times the intent stage occurred.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Success</code> – The number of times the intent stage succeeded.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Failure</code> – The number of times the intent stage failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Dropped</code> – The number of times the user dropped the intent stage.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Retry</code> – The number of times the bot tried to elicit a response from the user at this stage.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AnalyticsIntentStageMetricName
     */

    public AnalyticsIntentStageMetricResult withName(AnalyticsIntentStageMetricName name) {
        this.name = name.toString();
        return this;
    }

    /**
     * <p>
     * The summary statistic that you requested to calculate.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Sum</code> – The total count for the category you provide in <code>name</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Average</code> – The total count divided by the number of intent stages in the category you provide in
     * <code>name</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Max</code> – The highest count in the category you provide in <code>name</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param statistic
     *        The summary statistic that you requested to calculate.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Sum</code> – The total count for the category you provide in <code>name</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Average</code> – The total count divided by the number of intent stages in the category you provide
     *        in <code>name</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Max</code> – The highest count in the category you provide in <code>name</code>.
     *        </p>
     *        </li>
     * @see AnalyticsMetricStatistic
     */

    public void setStatistic(String statistic) {
        this.statistic = statistic;
    }

    /**
     * <p>
     * The summary statistic that you requested to calculate.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Sum</code> – The total count for the category you provide in <code>name</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Average</code> – The total count divided by the number of intent stages in the category you provide in
     * <code>name</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Max</code> – The highest count in the category you provide in <code>name</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The summary statistic that you requested to calculate.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Sum</code> – The total count for the category you provide in <code>name</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Average</code> – The total count divided by the number of intent stages in the category you provide
     *         in <code>name</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Max</code> – The highest count in the category you provide in <code>name</code>.
     *         </p>
     *         </li>
     * @see AnalyticsMetricStatistic
     */

    public String getStatistic() {
        return this.statistic;
    }

    /**
     * <p>
     * The summary statistic that you requested to calculate.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Sum</code> – The total count for the category you provide in <code>name</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Average</code> – The total count divided by the number of intent stages in the category you provide in
     * <code>name</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Max</code> – The highest count in the category you provide in <code>name</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param statistic
     *        The summary statistic that you requested to calculate.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Sum</code> – The total count for the category you provide in <code>name</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Average</code> – The total count divided by the number of intent stages in the category you provide
     *        in <code>name</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Max</code> – The highest count in the category you provide in <code>name</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AnalyticsMetricStatistic
     */

    public AnalyticsIntentStageMetricResult withStatistic(String statistic) {
        setStatistic(statistic);
        return this;
    }

    /**
     * <p>
     * The summary statistic that you requested to calculate.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Sum</code> – The total count for the category you provide in <code>name</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Average</code> – The total count divided by the number of intent stages in the category you provide in
     * <code>name</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Max</code> – The highest count in the category you provide in <code>name</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param statistic
     *        The summary statistic that you requested to calculate.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Sum</code> – The total count for the category you provide in <code>name</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Average</code> – The total count divided by the number of intent stages in the category you provide
     *        in <code>name</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Max</code> – The highest count in the category you provide in <code>name</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AnalyticsMetricStatistic
     */

    public AnalyticsIntentStageMetricResult withStatistic(AnalyticsMetricStatistic statistic) {
        this.statistic = statistic.toString();
        return this;
    }

    /**
     * <p>
     * The value of the summary statistic for the metric that you requested.
     * </p>
     * 
     * @param value
     *        The value of the summary statistic for the metric that you requested.
     */

    public void setValue(Double value) {
        this.value = value;
    }

    /**
     * <p>
     * The value of the summary statistic for the metric that you requested.
     * </p>
     * 
     * @return The value of the summary statistic for the metric that you requested.
     */

    public Double getValue() {
        return this.value;
    }

    /**
     * <p>
     * The value of the summary statistic for the metric that you requested.
     * </p>
     * 
     * @param value
     *        The value of the summary statistic for the metric that you requested.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalyticsIntentStageMetricResult withValue(Double value) {
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getStatistic() != null)
            sb.append("Statistic: ").append(getStatistic()).append(",");
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

        if (obj instanceof AnalyticsIntentStageMetricResult == false)
            return false;
        AnalyticsIntentStageMetricResult other = (AnalyticsIntentStageMetricResult) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getStatistic() == null ^ this.getStatistic() == null)
            return false;
        if (other.getStatistic() != null && other.getStatistic().equals(this.getStatistic()) == false)
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

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStatistic() == null) ? 0 : getStatistic().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public AnalyticsIntentStageMetricResult clone() {
        try {
            return (AnalyticsIntentStageMetricResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.AnalyticsIntentStageMetricResultMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
