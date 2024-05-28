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
 * An object specifying the measure and method by which to sort the utterance data.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/UtteranceDataSortBy" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UtteranceDataSortBy implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The measure by which to sort the utterance analytics data.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Count</code> – The number of utterances.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UtteranceTimestamp</code> – The date and time of the utterance.
     * </p>
     * </li>
     * </ul>
     */
    private String name;
    /**
     * <p>
     * Specifies whether to sort the results in ascending or descending order.
     * </p>
     */
    private String order;

    /**
     * <p>
     * The measure by which to sort the utterance analytics data.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Count</code> – The number of utterances.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UtteranceTimestamp</code> – The date and time of the utterance.
     * </p>
     * </li>
     * </ul>
     * 
     * @param name
     *        The measure by which to sort the utterance analytics data.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Count</code> – The number of utterances.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UtteranceTimestamp</code> – The date and time of the utterance.
     *        </p>
     *        </li>
     * @see AnalyticsUtteranceSortByName
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The measure by which to sort the utterance analytics data.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Count</code> – The number of utterances.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UtteranceTimestamp</code> – The date and time of the utterance.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The measure by which to sort the utterance analytics data.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Count</code> – The number of utterances.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>UtteranceTimestamp</code> – The date and time of the utterance.
     *         </p>
     *         </li>
     * @see AnalyticsUtteranceSortByName
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The measure by which to sort the utterance analytics data.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Count</code> – The number of utterances.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UtteranceTimestamp</code> – The date and time of the utterance.
     * </p>
     * </li>
     * </ul>
     * 
     * @param name
     *        The measure by which to sort the utterance analytics data.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Count</code> – The number of utterances.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UtteranceTimestamp</code> – The date and time of the utterance.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AnalyticsUtteranceSortByName
     */

    public UtteranceDataSortBy withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The measure by which to sort the utterance analytics data.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Count</code> – The number of utterances.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UtteranceTimestamp</code> – The date and time of the utterance.
     * </p>
     * </li>
     * </ul>
     * 
     * @param name
     *        The measure by which to sort the utterance analytics data.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Count</code> – The number of utterances.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UtteranceTimestamp</code> – The date and time of the utterance.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AnalyticsUtteranceSortByName
     */

    public UtteranceDataSortBy withName(AnalyticsUtteranceSortByName name) {
        this.name = name.toString();
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

    public UtteranceDataSortBy withOrder(String order) {
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

    public UtteranceDataSortBy withOrder(AnalyticsSortOrder order) {
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

        if (obj instanceof UtteranceDataSortBy == false)
            return false;
        UtteranceDataSortBy other = (UtteranceDataSortBy) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
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
        hashCode = prime * hashCode + ((getOrder() == null) ? 0 : getOrder().hashCode());
        return hashCode;
    }

    @Override
    public UtteranceDataSortBy clone() {
        try {
            return (UtteranceDataSortBy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.UtteranceDataSortByMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
