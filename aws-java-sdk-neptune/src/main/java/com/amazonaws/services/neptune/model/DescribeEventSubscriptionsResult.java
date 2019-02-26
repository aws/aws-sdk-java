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
package com.amazonaws.services.neptune.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Data returned by the <b>DescribeEventSubscriptions</b> action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptune-2014-10-31/DescribeEventSubscriptions" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeEventSubscriptionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An optional pagination token provided by a previous DescribeOrderableDBInstanceOptions request. If this parameter
     * is specified, the response includes only records beyond the marker, up to the value specified by
     * <code>MaxRecords</code>.
     * </p>
     */
    private String marker;
    /**
     * <p>
     * A list of EventSubscriptions data types.
     * </p>
     */
    private java.util.List<EventSubscription> eventSubscriptionsList;

    /**
     * <p>
     * An optional pagination token provided by a previous DescribeOrderableDBInstanceOptions request. If this parameter
     * is specified, the response includes only records beyond the marker, up to the value specified by
     * <code>MaxRecords</code>.
     * </p>
     * 
     * @param marker
     *        An optional pagination token provided by a previous DescribeOrderableDBInstanceOptions request. If this
     *        parameter is specified, the response includes only records beyond the marker, up to the value specified by
     *        <code>MaxRecords</code>.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous DescribeOrderableDBInstanceOptions request. If this parameter
     * is specified, the response includes only records beyond the marker, up to the value specified by
     * <code>MaxRecords</code>.
     * </p>
     * 
     * @return An optional pagination token provided by a previous DescribeOrderableDBInstanceOptions request. If this
     *         parameter is specified, the response includes only records beyond the marker, up to the value specified
     *         by <code>MaxRecords</code>.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous DescribeOrderableDBInstanceOptions request. If this parameter
     * is specified, the response includes only records beyond the marker, up to the value specified by
     * <code>MaxRecords</code>.
     * </p>
     * 
     * @param marker
     *        An optional pagination token provided by a previous DescribeOrderableDBInstanceOptions request. If this
     *        parameter is specified, the response includes only records beyond the marker, up to the value specified by
     *        <code>MaxRecords</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEventSubscriptionsResult withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * A list of EventSubscriptions data types.
     * </p>
     * 
     * @return A list of EventSubscriptions data types.
     */

    public java.util.List<EventSubscription> getEventSubscriptionsList() {
        return eventSubscriptionsList;
    }

    /**
     * <p>
     * A list of EventSubscriptions data types.
     * </p>
     * 
     * @param eventSubscriptionsList
     *        A list of EventSubscriptions data types.
     */

    public void setEventSubscriptionsList(java.util.Collection<EventSubscription> eventSubscriptionsList) {
        if (eventSubscriptionsList == null) {
            this.eventSubscriptionsList = null;
            return;
        }

        this.eventSubscriptionsList = new java.util.ArrayList<EventSubscription>(eventSubscriptionsList);
    }

    /**
     * <p>
     * A list of EventSubscriptions data types.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEventSubscriptionsList(java.util.Collection)} or
     * {@link #withEventSubscriptionsList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param eventSubscriptionsList
     *        A list of EventSubscriptions data types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEventSubscriptionsResult withEventSubscriptionsList(EventSubscription... eventSubscriptionsList) {
        if (this.eventSubscriptionsList == null) {
            setEventSubscriptionsList(new java.util.ArrayList<EventSubscription>(eventSubscriptionsList.length));
        }
        for (EventSubscription ele : eventSubscriptionsList) {
            this.eventSubscriptionsList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of EventSubscriptions data types.
     * </p>
     * 
     * @param eventSubscriptionsList
     *        A list of EventSubscriptions data types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEventSubscriptionsResult withEventSubscriptionsList(java.util.Collection<EventSubscription> eventSubscriptionsList) {
        setEventSubscriptionsList(eventSubscriptionsList);
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
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker()).append(",");
        if (getEventSubscriptionsList() != null)
            sb.append("EventSubscriptionsList: ").append(getEventSubscriptionsList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeEventSubscriptionsResult == false)
            return false;
        DescribeEventSubscriptionsResult other = (DescribeEventSubscriptionsResult) obj;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getEventSubscriptionsList() == null ^ this.getEventSubscriptionsList() == null)
            return false;
        if (other.getEventSubscriptionsList() != null && other.getEventSubscriptionsList().equals(this.getEventSubscriptionsList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getEventSubscriptionsList() == null) ? 0 : getEventSubscriptionsList().hashCode());
        return hashCode;
    }

    @Override
    public DescribeEventSubscriptionsResult clone() {
        try {
            return (DescribeEventSubscriptionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
