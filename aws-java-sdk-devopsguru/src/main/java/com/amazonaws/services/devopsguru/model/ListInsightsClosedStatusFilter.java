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
package com.amazonaws.services.devopsguru.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Used to filter for insights that have the status <code>CLOSED</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/ListInsightsClosedStatusFilter"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListInsightsClosedStatusFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Use to filter for either <code>REACTIVE</code> or <code>PROACTIVE</code> insights.
     * </p>
     */
    private String type;
    /**
     * <p>
     * A time range used to specify when the behavior of the filtered insights ended.
     * </p>
     */
    private EndTimeRange endTimeRange;

    /**
     * <p>
     * Use to filter for either <code>REACTIVE</code> or <code>PROACTIVE</code> insights.
     * </p>
     * 
     * @param type
     *        Use to filter for either <code>REACTIVE</code> or <code>PROACTIVE</code> insights.
     * @see InsightType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Use to filter for either <code>REACTIVE</code> or <code>PROACTIVE</code> insights.
     * </p>
     * 
     * @return Use to filter for either <code>REACTIVE</code> or <code>PROACTIVE</code> insights.
     * @see InsightType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * Use to filter for either <code>REACTIVE</code> or <code>PROACTIVE</code> insights.
     * </p>
     * 
     * @param type
     *        Use to filter for either <code>REACTIVE</code> or <code>PROACTIVE</code> insights.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InsightType
     */

    public ListInsightsClosedStatusFilter withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * Use to filter for either <code>REACTIVE</code> or <code>PROACTIVE</code> insights.
     * </p>
     * 
     * @param type
     *        Use to filter for either <code>REACTIVE</code> or <code>PROACTIVE</code> insights.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InsightType
     */

    public ListInsightsClosedStatusFilter withType(InsightType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * A time range used to specify when the behavior of the filtered insights ended.
     * </p>
     * 
     * @param endTimeRange
     *        A time range used to specify when the behavior of the filtered insights ended.
     */

    public void setEndTimeRange(EndTimeRange endTimeRange) {
        this.endTimeRange = endTimeRange;
    }

    /**
     * <p>
     * A time range used to specify when the behavior of the filtered insights ended.
     * </p>
     * 
     * @return A time range used to specify when the behavior of the filtered insights ended.
     */

    public EndTimeRange getEndTimeRange() {
        return this.endTimeRange;
    }

    /**
     * <p>
     * A time range used to specify when the behavior of the filtered insights ended.
     * </p>
     * 
     * @param endTimeRange
     *        A time range used to specify when the behavior of the filtered insights ended.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInsightsClosedStatusFilter withEndTimeRange(EndTimeRange endTimeRange) {
        setEndTimeRange(endTimeRange);
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
        if (getEndTimeRange() != null)
            sb.append("EndTimeRange: ").append(getEndTimeRange());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListInsightsClosedStatusFilter == false)
            return false;
        ListInsightsClosedStatusFilter other = (ListInsightsClosedStatusFilter) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getEndTimeRange() == null ^ this.getEndTimeRange() == null)
            return false;
        if (other.getEndTimeRange() != null && other.getEndTimeRange().equals(this.getEndTimeRange()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getEndTimeRange() == null) ? 0 : getEndTimeRange().hashCode());
        return hashCode;
    }

    @Override
    public ListInsightsClosedStatusFilter clone() {
        try {
            return (ListInsightsClosedStatusFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.devopsguru.model.transform.ListInsightsClosedStatusFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
