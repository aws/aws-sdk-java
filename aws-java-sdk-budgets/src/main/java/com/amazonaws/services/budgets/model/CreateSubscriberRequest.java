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
 * Request of CreateSubscriber
 */
public class CreateSubscriberRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private String accountId;

    private String budgetName;

    private Notification notification;

    private Subscriber subscriber;

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

    public CreateSubscriberRequest withAccountId(String accountId) {
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

    public CreateSubscriberRequest withBudgetName(String budgetName) {
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

    public CreateSubscriberRequest withNotification(Notification notification) {
        setNotification(notification);
        return this;
    }

    /**
     * @param subscriber
     */

    public void setSubscriber(Subscriber subscriber) {
        this.subscriber = subscriber;
    }

    /**
     * @return
     */

    public Subscriber getSubscriber() {
        return this.subscriber;
    }

    /**
     * @param subscriber
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSubscriberRequest withSubscriber(Subscriber subscriber) {
        setSubscriber(subscriber);
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
        if (getSubscriber() != null)
            sb.append("Subscriber: " + getSubscriber());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateSubscriberRequest == false)
            return false;
        CreateSubscriberRequest other = (CreateSubscriberRequest) obj;
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
        if (other.getSubscriber() == null ^ this.getSubscriber() == null)
            return false;
        if (other.getSubscriber() != null && other.getSubscriber().equals(this.getSubscriber()) == false)
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
        hashCode = prime * hashCode + ((getSubscriber() == null) ? 0 : getSubscriber().hashCode());
        return hashCode;
    }

    @Override
    public CreateSubscriberRequest clone() {
        return (CreateSubscriberRequest) super.clone();
    }
}
