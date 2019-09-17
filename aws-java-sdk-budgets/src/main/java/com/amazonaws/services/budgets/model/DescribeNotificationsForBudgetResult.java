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
package com.amazonaws.services.budgets.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Response of GetNotificationsForBudget
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeNotificationsForBudgetResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * A list of notifications that are associated with a budget.
     * </p>
     */
    private java.util.List<Notification> notifications;
    /**
     * <p>
     * The pagination token in the service response that indicates the next set of results that you can retrieve.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of notifications that are associated with a budget.
     * </p>
     * 
     * @return A list of notifications that are associated with a budget.
     */

    public java.util.List<Notification> getNotifications() {
        return notifications;
    }

    /**
     * <p>
     * A list of notifications that are associated with a budget.
     * </p>
     * 
     * @param notifications
     *        A list of notifications that are associated with a budget.
     */

    public void setNotifications(java.util.Collection<Notification> notifications) {
        if (notifications == null) {
            this.notifications = null;
            return;
        }

        this.notifications = new java.util.ArrayList<Notification>(notifications);
    }

    /**
     * <p>
     * A list of notifications that are associated with a budget.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNotifications(java.util.Collection)} or {@link #withNotifications(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param notifications
     *        A list of notifications that are associated with a budget.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNotificationsForBudgetResult withNotifications(Notification... notifications) {
        if (this.notifications == null) {
            setNotifications(new java.util.ArrayList<Notification>(notifications.length));
        }
        for (Notification ele : notifications) {
            this.notifications.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of notifications that are associated with a budget.
     * </p>
     * 
     * @param notifications
     *        A list of notifications that are associated with a budget.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNotificationsForBudgetResult withNotifications(java.util.Collection<Notification> notifications) {
        setNotifications(notifications);
        return this;
    }

    /**
     * <p>
     * The pagination token in the service response that indicates the next set of results that you can retrieve.
     * </p>
     * 
     * @param nextToken
     *        The pagination token in the service response that indicates the next set of results that you can retrieve.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token in the service response that indicates the next set of results that you can retrieve.
     * </p>
     * 
     * @return The pagination token in the service response that indicates the next set of results that you can
     *         retrieve.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token in the service response that indicates the next set of results that you can retrieve.
     * </p>
     * 
     * @param nextToken
     *        The pagination token in the service response that indicates the next set of results that you can retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNotificationsForBudgetResult withNextToken(String nextToken) {
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
        if (getNotifications() != null)
            sb.append("Notifications: ").append(getNotifications()).append(",");
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

        if (obj instanceof DescribeNotificationsForBudgetResult == false)
            return false;
        DescribeNotificationsForBudgetResult other = (DescribeNotificationsForBudgetResult) obj;
        if (other.getNotifications() == null ^ this.getNotifications() == null)
            return false;
        if (other.getNotifications() != null && other.getNotifications().equals(this.getNotifications()) == false)
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

        hashCode = prime * hashCode + ((getNotifications() == null) ? 0 : getNotifications().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeNotificationsForBudgetResult clone() {
        try {
            return (DescribeNotificationsForBudgetResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
