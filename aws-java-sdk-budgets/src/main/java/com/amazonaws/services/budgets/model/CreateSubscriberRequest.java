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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Request of CreateSubscriber
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateSubscriberRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The <code>accountId</code> that is associated with the budget that you want to create a subscriber for.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The name of the budget that you want to subscribe to. Budget names must be unique within an account.
     * </p>
     */
    private String budgetName;
    /**
     * <p>
     * The notification that you want to create a subscriber for.
     * </p>
     */
    private Notification notification;
    /**
     * <p>
     * The subscriber that you want to associate with a budget notification.
     * </p>
     */
    private Subscriber subscriber;

    /**
     * <p>
     * The <code>accountId</code> that is associated with the budget that you want to create a subscriber for.
     * </p>
     * 
     * @param accountId
     *        The <code>accountId</code> that is associated with the budget that you want to create a subscriber for.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The <code>accountId</code> that is associated with the budget that you want to create a subscriber for.
     * </p>
     * 
     * @return The <code>accountId</code> that is associated with the budget that you want to create a subscriber for.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The <code>accountId</code> that is associated with the budget that you want to create a subscriber for.
     * </p>
     * 
     * @param accountId
     *        The <code>accountId</code> that is associated with the budget that you want to create a subscriber for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSubscriberRequest withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The name of the budget that you want to subscribe to. Budget names must be unique within an account.
     * </p>
     * 
     * @param budgetName
     *        The name of the budget that you want to subscribe to. Budget names must be unique within an account.
     */

    public void setBudgetName(String budgetName) {
        this.budgetName = budgetName;
    }

    /**
     * <p>
     * The name of the budget that you want to subscribe to. Budget names must be unique within an account.
     * </p>
     * 
     * @return The name of the budget that you want to subscribe to. Budget names must be unique within an account.
     */

    public String getBudgetName() {
        return this.budgetName;
    }

    /**
     * <p>
     * The name of the budget that you want to subscribe to. Budget names must be unique within an account.
     * </p>
     * 
     * @param budgetName
     *        The name of the budget that you want to subscribe to. Budget names must be unique within an account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSubscriberRequest withBudgetName(String budgetName) {
        setBudgetName(budgetName);
        return this;
    }

    /**
     * <p>
     * The notification that you want to create a subscriber for.
     * </p>
     * 
     * @param notification
     *        The notification that you want to create a subscriber for.
     */

    public void setNotification(Notification notification) {
        this.notification = notification;
    }

    /**
     * <p>
     * The notification that you want to create a subscriber for.
     * </p>
     * 
     * @return The notification that you want to create a subscriber for.
     */

    public Notification getNotification() {
        return this.notification;
    }

    /**
     * <p>
     * The notification that you want to create a subscriber for.
     * </p>
     * 
     * @param notification
     *        The notification that you want to create a subscriber for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSubscriberRequest withNotification(Notification notification) {
        setNotification(notification);
        return this;
    }

    /**
     * <p>
     * The subscriber that you want to associate with a budget notification.
     * </p>
     * 
     * @param subscriber
     *        The subscriber that you want to associate with a budget notification.
     */

    public void setSubscriber(Subscriber subscriber) {
        this.subscriber = subscriber;
    }

    /**
     * <p>
     * The subscriber that you want to associate with a budget notification.
     * </p>
     * 
     * @return The subscriber that you want to associate with a budget notification.
     */

    public Subscriber getSubscriber() {
        return this.subscriber;
    }

    /**
     * <p>
     * The subscriber that you want to associate with a budget notification.
     * </p>
     * 
     * @param subscriber
     *        The subscriber that you want to associate with a budget notification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSubscriberRequest withSubscriber(Subscriber subscriber) {
        setSubscriber(subscriber);
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
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
        if (getBudgetName() != null)
            sb.append("BudgetName: ").append(getBudgetName()).append(",");
        if (getNotification() != null)
            sb.append("Notification: ").append(getNotification()).append(",");
        if (getSubscriber() != null)
            sb.append("Subscriber: ").append(getSubscriber());
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
