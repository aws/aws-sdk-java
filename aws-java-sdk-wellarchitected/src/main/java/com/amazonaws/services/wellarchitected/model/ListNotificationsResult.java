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
package com.amazonaws.services.wellarchitected.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/ListNotifications" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListNotificationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * List of lens notification summaries in a workload.
     * </p>
     */
    private java.util.List<NotificationSummary> notificationSummaries;

    private String nextToken;

    /**
     * <p>
     * List of lens notification summaries in a workload.
     * </p>
     * 
     * @return List of lens notification summaries in a workload.
     */

    public java.util.List<NotificationSummary> getNotificationSummaries() {
        return notificationSummaries;
    }

    /**
     * <p>
     * List of lens notification summaries in a workload.
     * </p>
     * 
     * @param notificationSummaries
     *        List of lens notification summaries in a workload.
     */

    public void setNotificationSummaries(java.util.Collection<NotificationSummary> notificationSummaries) {
        if (notificationSummaries == null) {
            this.notificationSummaries = null;
            return;
        }

        this.notificationSummaries = new java.util.ArrayList<NotificationSummary>(notificationSummaries);
    }

    /**
     * <p>
     * List of lens notification summaries in a workload.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNotificationSummaries(java.util.Collection)} or
     * {@link #withNotificationSummaries(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param notificationSummaries
     *        List of lens notification summaries in a workload.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListNotificationsResult withNotificationSummaries(NotificationSummary... notificationSummaries) {
        if (this.notificationSummaries == null) {
            setNotificationSummaries(new java.util.ArrayList<NotificationSummary>(notificationSummaries.length));
        }
        for (NotificationSummary ele : notificationSummaries) {
            this.notificationSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of lens notification summaries in a workload.
     * </p>
     * 
     * @param notificationSummaries
     *        List of lens notification summaries in a workload.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListNotificationsResult withNotificationSummaries(java.util.Collection<NotificationSummary> notificationSummaries) {
        setNotificationSummaries(notificationSummaries);
        return this;
    }

    /**
     * @param nextToken
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * @return
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @param nextToken
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListNotificationsResult withNextToken(String nextToken) {
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
        if (getNotificationSummaries() != null)
            sb.append("NotificationSummaries: ").append(getNotificationSummaries()).append(",");
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

        if (obj instanceof ListNotificationsResult == false)
            return false;
        ListNotificationsResult other = (ListNotificationsResult) obj;
        if (other.getNotificationSummaries() == null ^ this.getNotificationSummaries() == null)
            return false;
        if (other.getNotificationSummaries() != null && other.getNotificationSummaries().equals(this.getNotificationSummaries()) == false)
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

        hashCode = prime * hashCode + ((getNotificationSummaries() == null) ? 0 : getNotificationSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListNotificationsResult clone() {
        try {
            return (ListNotificationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
