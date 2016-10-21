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
 * Request of UpdateSubscriber
 */
public class UpdateSubscriberRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private String accountId;

    private String budgetName;

    private Notification notification;

    private Subscriber oldSubscriber;

    private Subscriber newSubscriber;

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

    public UpdateSubscriberRequest withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * @param budgetName
     */

    public void setBudgetName(String budgetName) {
        this.budgetName = budgetName;
    }

    /**
     * @return
     */

    public String getBudgetName() {
        return this.budgetName;
    }

    /**
     * @param budgetName
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSubscriberRequest withBudgetName(String budgetName) {
        setBudgetName(budgetName);
        return this;
    }

    /**
     * @param notification
     */

    public void setNotification(Notification notification) {
        this.notification = notification;
    }

    /**
     * @return
     */

    public Notification getNotification() {
        return this.notification;
    }

    /**
     * @param notification
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSubscriberRequest withNotification(Notification notification) {
        setNotification(notification);
        return this;
    }

    /**
     * @param oldSubscriber
     */

    public void setOldSubscriber(Subscriber oldSubscriber) {
        this.oldSubscriber = oldSubscriber;
    }

    /**
     * @return
     */

    public Subscriber getOldSubscriber() {
        return this.oldSubscriber;
    }

    /**
     * @param oldSubscriber
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSubscriberRequest withOldSubscriber(Subscriber oldSubscriber) {
        setOldSubscriber(oldSubscriber);
        return this;
    }

    /**
     * @param newSubscriber
     */

    public void setNewSubscriber(Subscriber newSubscriber) {
        this.newSubscriber = newSubscriber;
    }

    /**
     * @return
     */

    public Subscriber getNewSubscriber() {
        return this.newSubscriber;
    }

    /**
     * @param newSubscriber
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSubscriberRequest withNewSubscriber(Subscriber newSubscriber) {
        setNewSubscriber(newSubscriber);
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
        if (getBudgetName() != null)
            sb.append("BudgetName: " + getBudgetName() + ",");
        if (getNotification() != null)
            sb.append("Notification: " + getNotification() + ",");
        if (getOldSubscriber() != null)
            sb.append("OldSubscriber: " + getOldSubscriber() + ",");
        if (getNewSubscriber() != null)
            sb.append("NewSubscriber: " + getNewSubscriber());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateSubscriberRequest == false)
            return false;
        UpdateSubscriberRequest other = (UpdateSubscriberRequest) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getBudgetName() == null ^ this.getBudgetName() == null)
            return false;
        if (other.getBudgetName() != null && other.getBudgetName().equals(this.getBudgetName()) == false)
            return false;
        if (other.getNotification() == null ^ this.getNotification() == null)
            return false;
        if (other.getNotification() != null && other.getNotification().equals(this.getNotification()) == false)
            return false;
        if (other.getOldSubscriber() == null ^ this.getOldSubscriber() == null)
            return false;
        if (other.getOldSubscriber() != null && other.getOldSubscriber().equals(this.getOldSubscriber()) == false)
            return false;
        if (other.getNewSubscriber() == null ^ this.getNewSubscriber() == null)
            return false;
        if (other.getNewSubscriber() != null && other.getNewSubscriber().equals(this.getNewSubscriber()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getBudgetName() == null) ? 0 : getBudgetName().hashCode());
        hashCode = prime * hashCode + ((getNotification() == null) ? 0 : getNotification().hashCode());
        hashCode = prime * hashCode + ((getOldSubscriber() == null) ? 0 : getOldSubscriber().hashCode());
        hashCode = prime * hashCode + ((getNewSubscriber() == null) ? 0 : getNewSubscriber().hashCode());
        return hashCode;
    }

    @Override
    public UpdateSubscriberRequest clone() {
        return (UpdateSubscriberRequest) super.clone();
    }
}
