/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.health.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The number of events of each issue type. Returned by the <a>DescribeEventAggregates</a> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/health-2016-08-04/EventAggregate" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EventAggregate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The issue type for the associated count.
     * </p>
     */
    private String aggregateValue;
    /**
     * <p>
     * The number of events of the associated issue type.
     * </p>
     */
    private Integer count;

    /**
     * <p>
     * The issue type for the associated count.
     * </p>
     * 
     * @param aggregateValue
     *        The issue type for the associated count.
     */

    public void setAggregateValue(String aggregateValue) {
        this.aggregateValue = aggregateValue;
    }

    /**
     * <p>
     * The issue type for the associated count.
     * </p>
     * 
     * @return The issue type for the associated count.
     */

    public String getAggregateValue() {
        return this.aggregateValue;
    }

    /**
     * <p>
     * The issue type for the associated count.
     * </p>
     * 
     * @param aggregateValue
     *        The issue type for the associated count.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventAggregate withAggregateValue(String aggregateValue) {
        setAggregateValue(aggregateValue);
        return this;
    }

    /**
     * <p>
     * The number of events of the associated issue type.
     * </p>
     * 
     * @param count
     *        The number of events of the associated issue type.
     */

    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * <p>
     * The number of events of the associated issue type.
     * </p>
     * 
     * @return The number of events of the associated issue type.
     */

    public Integer getCount() {
        return this.count;
    }

    /**
     * <p>
     * The number of events of the associated issue type.
     * </p>
     * 
     * @param count
     *        The number of events of the associated issue type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventAggregate withCount(Integer count) {
        setCount(count);
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
        if (getAggregateValue() != null)
            sb.append("AggregateValue: ").append(getAggregateValue()).append(",");
        if (getCount() != null)
            sb.append("Count: ").append(getCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EventAggregate == false)
            return false;
        EventAggregate other = (EventAggregate) obj;
        if (other.getAggregateValue() == null ^ this.getAggregateValue() == null)
            return false;
        if (other.getAggregateValue() != null && other.getAggregateValue().equals(this.getAggregateValue()) == false)
            return false;
        if (other.getCount() == null ^ this.getCount() == null)
            return false;
        if (other.getCount() != null && other.getCount().equals(this.getCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAggregateValue() == null) ? 0 : getAggregateValue().hashCode());
        hashCode = prime * hashCode + ((getCount() == null) ? 0 : getCount().hashCode());
        return hashCode;
    }

    @Override
    public EventAggregate clone() {
        try {
            return (EventAggregate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.health.model.transform.EventAggregateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
