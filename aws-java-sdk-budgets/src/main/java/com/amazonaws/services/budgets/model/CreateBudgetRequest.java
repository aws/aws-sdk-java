/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Request of CreateBudget
 */
public class CreateBudgetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private String accountId;

    private Budget budget;

    private java.util.List<NotificationWithSubscribers> notificationsWithSubscribers;

    /**
     * @param accountId
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * @return
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * @param accountId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBudgetRequest withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * @param budget
     */

    public void setBudget(Budget budget) {
        this.budget = budget;
    }

    /**
     * @return
     */

    public Budget getBudget() {
        return this.budget;
    }

    /**
     * @param budget
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBudgetRequest withBudget(Budget budget) {
        setBudget(budget);
        return this;
    }

    /**
     * @return
     */

    public java.util.List<NotificationWithSubscribers> getNotificationsWithSubscribers() {
        return notificationsWithSubscribers;
    }

    /**
     * @param notificationsWithSubscribers
     */

    public void setNotificationsWithSubscribers(java.util.Collection<NotificationWithSubscribers> notificationsWithSubscribers) {
        if (notificationsWithSubscribers == null) {
            this.notificationsWithSubscribers = null;
            return;
        }

        this.notificationsWithSubscribers = new java.util.ArrayList<NotificationWithSubscribers>(notificationsWithSubscribers);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNotificationsWithSubscribers(java.util.Collection)} or
     * {@link #withNotificationsWithSubscribers(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param notificationsWithSubscribers
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBudgetRequest withNotificationsWithSubscribers(NotificationWithSubscribers... notificationsWithSubscribers) {
        if (this.notificationsWithSubscribers == null) {
            setNotificationsWithSubscribers(new java.util.ArrayList<NotificationWithSubscribers>(notificationsWithSubscribers.length));
        }
        for (NotificationWithSubscribers ele : notificationsWithSubscribers) {
            this.notificationsWithSubscribers.add(ele);
        }
        return this;
    }

    /**
     * @param notificationsWithSubscribers
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBudgetRequest withNotificationsWithSubscribers(java.util.Collection<NotificationWithSubscribers> notificationsWithSubscribers) {
        setNotificationsWithSubscribers(notificationsWithSubscribers);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAccountId() != null)
            sb.append("AccountId: " + getAccountId() + ",");
        if (getBudget() != null)
            sb.append("Budget: " + getBudget() + ",");
        if (getNotificationsWithSubscribers() != null)
            sb.append("NotificationsWithSubscribers: " + getNotificationsWithSubscribers());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateBudgetRequest == false)
            return false;
        CreateBudgetRequest other = (CreateBudgetRequest) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getBudget() == null ^ this.getBudget() == null)
            return false;
        if (other.getBudget() != null && other.getBudget().equals(this.getBudget()) == false)
            return false;
        if (other.getNotificationsWithSubscribers() == null ^ this.getNotificationsWithSubscribers() == null)
            return false;
        if (other.getNotificationsWithSubscribers() != null && other.getNotificationsWithSubscribers().equals(this.getNotificationsWithSubscribers()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getBudget() == null) ? 0 : getBudget().hashCode());
        hashCode = prime * hashCode + ((getNotificationsWithSubscribers() == null) ? 0 : getNotificationsWithSubscribers().hashCode());
        return hashCode;
    }

    @Override
    public CreateBudgetRequest clone() {
        return (CreateBudgetRequest) super.clone();
    }
}
