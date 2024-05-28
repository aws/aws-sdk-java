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
 * Contains the metric and the summary statistic you want to calculate, and the order in which to sort the results, for
 * the intents in the bot.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/AnalyticsIntentMetric"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AnalyticsIntentMetric implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The metric for which you want to get intent summary statistics.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Count</code> – The number of times the intent was invoked.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Success</code> – The number of times the intent succeeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failure</code> – The number of times the intent failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Switched</code> – The number of times there was a switch to a different intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Dropped</code> – The number of times the user dropped the intent.
     * </p>
     * </li>
     * </ul>
     */
    private String name;
    /**
     * <p>
     * The summary statistic to calculate.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Sum</code> – The total count for the category you provide in <code>name</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Average</code> – The total count divided by the number of intents in the category you provide in
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
     * Specifies whether to sort the results in ascending or descending order.
     * </p>
     */
    private String order;

    /**
     * <p>
     * The metric for which you want to get intent summary statistics.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Count</code> – The number of times the intent was invoked.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Success</code> – The number of times the intent succeeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failure</code> – The number of times the intent failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Switched</code> – The number of times there was a switch to a different intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Dropped</code> – The number of times the user dropped the intent.
     * </p>
     * </li>
     * </ul>
     * 
     * @param name
     *        The metric for which you want to get intent summary statistics.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Count</code> – The number of times the intent was invoked.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Success</code> – The number of times the intent succeeded.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Failure</code> – The number of times the intent failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Switched</code> – The number of times there was a switch to a different intent.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Dropped</code> – The number of times the user dropped the intent.
     *        </p>
     *        </li>
     * @see AnalyticsIntentMetricName
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The metric for which you want to get intent summary statistics.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Count</code> – The number of times the intent was invoked.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Success</code> – The number of times the intent succeeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failure</code> – The number of times the intent failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Switched</code> – The number of times there was a switch to a different intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Dropped</code> – The number of times the user dropped the intent.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The metric for which you want to get intent summary statistics.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Count</code> – The number of times the intent was invoked.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Success</code> – The number of times the intent succeeded.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Failure</code> – The number of times the intent failed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Switched</code> – The number of times there was a switch to a different intent.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Dropped</code> – The number of times the user dropped the intent.
     *         </p>
     *         </li>
     * @see AnalyticsIntentMetricName
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The metric for which you want to get intent summary statistics.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Count</code> – The number of times the intent was invoked.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Success</code> – The number of times the intent succeeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failure</code> – The number of times the intent failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Switched</code> – The number of times there was a switch to a different intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Dropped</code> – The number of times the user dropped the intent.
     * </p>
     * </li>
     * </ul>
     * 
     * @param name
     *        The metric for which you want to get intent summary statistics.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Count</code> – The number of times the intent was invoked.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Success</code> – The number of times the intent succeeded.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Failure</code> – The number of times the intent failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Switched</code> – The number of times there was a switch to a different intent.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Dropped</code> – The number of times the user dropped the intent.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AnalyticsIntentMetricName
     */

    public AnalyticsIntentMetric withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The metric for which you want to get intent summary statistics.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Count</code> – The number of times the intent was invoked.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Success</code> – The number of times the intent succeeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failure</code> – The number of times the intent failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Switched</code> – The number of times there was a switch to a different intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Dropped</code> – The number of times the user dropped the intent.
     * </p>
     * </li>
     * </ul>
     * 
     * @param name
     *        The metric for which you want to get intent summary statistics.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Count</code> – The number of times the intent was invoked.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Success</code> – The number of times the intent succeeded.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Failure</code> – The number of times the intent failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Switched</code> – The number of times there was a switch to a different intent.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Dropped</code> – The number of times the user dropped the intent.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AnalyticsIntentMetricName
     */

    public AnalyticsIntentMetric withName(AnalyticsIntentMetricName name) {
        this.name = name.toString();
        return this;
    }

    /**
     * <p>
     * The summary statistic to calculate.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Sum</code> – The total count for the category you provide in <code>name</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Average</code> – The total count divided by the number of intents in the category you provide in
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
     *        The summary statistic to calculate.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Sum</code> – The total count for the category you provide in <code>name</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Average</code> – The total count divided by the number of intents in the category you provide in
     *        <code>name</code>.
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
     * The summary statistic to calculate.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Sum</code> – The total count for the category you provide in <code>name</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Average</code> – The total count divided by the number of intents in the category you provide in
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
     * @return The summary statistic to calculate.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Sum</code> – The total count for the category you provide in <code>name</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Average</code> – The total count divided by the number of intents in the category you provide in
     *         <code>name</code>.
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
     * The summary statistic to calculate.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Sum</code> – The total count for the category you provide in <code>name</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Average</code> – The total count divided by the number of intents in the category you provide in
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
     *        The summary statistic to calculate.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Sum</code> – The total count for the category you provide in <code>name</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Average</code> – The total count divided by the number of intents in the category you provide in
     *        <code>name</code>.
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

    public AnalyticsIntentMetric withStatistic(String statistic) {
        setStatistic(statistic);
        return this;
    }

    /**
     * <p>
     * The summary statistic to calculate.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Sum</code> – The total count for the category you provide in <code>name</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Average</code> – The total count divided by the number of intents in the category you provide in
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
     *        The summary statistic to calculate.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Sum</code> – The total count for the category you provide in <code>name</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Average</code> – The total count divided by the number of intents in the category you provide in
     *        <code>name</code>.
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

    public AnalyticsIntentMetric withStatistic(AnalyticsMetricStatistic statistic) {
        this.statistic = statistic.toString();
        return this;
    }

    /**
     * <p>
     * Specifies whether to sort the results in ascending or descending order.
     * </p>
     * 
     * @param order
     *        Specifies whether to sort the results in ascending or descending order.
     * @see AnalyticsSortOrder
     */

    public void setOrder(String order) {
        this.order = order;
    }

    /**
     * <p>
     * Specifies whether to sort the results in ascending or descending order.
     * </p>
     * 
     * @return Specifies whether to sort the results in ascending or descending order.
     * @see AnalyticsSortOrder
     */

    public String getOrder() {
        return this.order;
    }

    /**
     * <p>
     * Specifies whether to sort the results in ascending or descending order.
     * </p>
     * 
     * @param order
     *        Specifies whether to sort the results in ascending or descending order.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AnalyticsSortOrder
     */

    public AnalyticsIntentMetric withOrder(String order) {
        setOrder(order);
        return this;
    }

    /**
     * <p>
     * Specifies whether to sort the results in ascending or descending order.
     * </p>
     * 
     * @param order
     *        Specifies whether to sort the results in ascending or descending order.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AnalyticsSortOrder
     */

    public AnalyticsIntentMetric withOrder(AnalyticsSortOrder order) {
        this.order = order.toString();
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
        if (getOrder() != null)
            sb.append("Order: ").append(getOrder());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AnalyticsIntentMetric == false)
            return false;
        AnalyticsIntentMetric other = (AnalyticsIntentMetric) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getStatistic() == null ^ this.getStatistic() == null)
            return false;
        if (other.getStatistic() != null && other.getStatistic().equals(this.getStatistic()) == false)
            return false;
        if (other.getOrder() == null ^ this.getOrder() == null)
            return false;
        if (other.getOrder() != null && other.getOrder().equals(this.getOrder()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStatistic() == null) ? 0 : getStatistic().hashCode());
        hashCode = prime * hashCode + ((getOrder() == null) ? 0 : getOrder().hashCode());
        return hashCode;
    }

    @Override
    public AnalyticsIntentMetric clone() {
        try {
            return (AnalyticsIntentMetric) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.AnalyticsIntentMetricMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
