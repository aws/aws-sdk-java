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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceResult;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeVpcEndpointConnectionNotificationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements
        Serializable, Cloneable {

    /**
     * <p>
     * One or more notifications.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ConnectionNotification> connectionNotificationSet;
    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * One or more notifications.
     * </p>
     * 
     * @return One or more notifications.
     */

    public java.util.List<ConnectionNotification> getConnectionNotificationSet() {
        if (connectionNotificationSet == null) {
            connectionNotificationSet = new com.amazonaws.internal.SdkInternalList<ConnectionNotification>();
        }
        return connectionNotificationSet;
    }

    /**
     * <p>
     * One or more notifications.
     * </p>
     * 
     * @param connectionNotificationSet
     *        One or more notifications.
     */

    public void setConnectionNotificationSet(java.util.Collection<ConnectionNotification> connectionNotificationSet) {
        if (connectionNotificationSet == null) {
            this.connectionNotificationSet = null;
            return;
        }

        this.connectionNotificationSet = new com.amazonaws.internal.SdkInternalList<ConnectionNotification>(connectionNotificationSet);
    }

    /**
     * <p>
     * One or more notifications.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConnectionNotificationSet(java.util.Collection)} or
     * {@link #withConnectionNotificationSet(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param connectionNotificationSet
     *        One or more notifications.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVpcEndpointConnectionNotificationsResult withConnectionNotificationSet(ConnectionNotification... connectionNotificationSet) {
        if (this.connectionNotificationSet == null) {
            setConnectionNotificationSet(new com.amazonaws.internal.SdkInternalList<ConnectionNotification>(connectionNotificationSet.length));
        }
        for (ConnectionNotification ele : connectionNotificationSet) {
            this.connectionNotificationSet.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more notifications.
     * </p>
     * 
     * @param connectionNotificationSet
     *        One or more notifications.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVpcEndpointConnectionNotificationsResult withConnectionNotificationSet(java.util.Collection<ConnectionNotification> connectionNotificationSet) {
        setConnectionNotificationSet(connectionNotificationSet);
        return this;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next page of results. This value is <code>null</code> when there are no
     *        more results to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     * 
     * @return The token to use to retrieve the next page of results. This value is <code>null</code> when there are no
     *         more results to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next page of results. This value is <code>null</code> when there are no
     *        more results to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVpcEndpointConnectionNotificationsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getConnectionNotificationSet() != null)
            sb.append("ConnectionNotificationSet: ").append(getConnectionNotificationSet()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeVpcEndpointConnectionNotificationsResult == false)
            return false;
        DescribeVpcEndpointConnectionNotificationsResult other = (DescribeVpcEndpointConnectionNotificationsResult) obj;
        if (other.getConnectionNotificationSet() == null ^ this.getConnectionNotificationSet() == null)
            return false;
        if (other.getConnectionNotificationSet() != null && other.getConnectionNotificationSet().equals(this.getConnectionNotificationSet()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConnectionNotificationSet() == null) ? 0 : getConnectionNotificationSet().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeVpcEndpointConnectionNotificationsResult clone() {
        try {
            return (DescribeVpcEndpointConnectionNotificationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
