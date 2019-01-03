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
 * Request of CreateNotification
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateNotificationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The <code>accountId</code> that is associated with the budget that you want to create a notification for.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The name of the budget that you want AWS to notify you about. Budget names must be unique within an account.
     * </p>
     */
    private String budgetName;
    /**
     * <p>
     * The notification that you want to create.
     * </p>
     */
    private Notification notification;
    /**
     * <p>
     * A list of subscribers that you want to associate with the notification. Each notification can have one SNS
     * subscriber and up to 10 email subscribers.
     * </p>
     */
    private java.util.List<Subscriber> subscribers;

    /**
     * <p>
     * The <code>accountId</code> that is associated with the budget that you want to create a notification for.
     * </p>
     * 
     * @param accountId
     *        The <code>accountId</code> that is associated with the budget that you want to create a notification for.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The <code>accountId</code> that is associated with the budget that you want to create a notification for.
     * </p>
     * 
     * @return The <code>accountId</code> that is associated with the budget that you want to create a notification for.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The <code>accountId</code> that is associated with the budget that you want to create a notification for.
     * </p>
     * 
     * @param accountId
     *        The <code>accountId</code> that is associated with the budget that you want to create a notification for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNotificationRequest withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The name of the budget that you want AWS to notify you about. Budget names must be unique within an account.
     * </p>
     * 
     * @param budgetName
     *        The name of the budget that you want AWS to notify you about. Budget names must be unique within an
     *        account.
     */

    public void setBudgetName(String budgetName) {
        this.budgetName = budgetName;
    }

    /**
     * <p>
     * The name of the budget that you want AWS to notify you about. Budget names must be unique within an account.
     * </p>
     * 
     * @return The name of the budget that you want AWS to notify you about. Budget names must be unique within an
     *         account.
     */

    public String getBudgetName() {
        return this.budgetName;
    }

    /**
     * <p>
     * The name of the budget that you want AWS to notify you about. Budget names must be unique within an account.
     * </p>
     * 
     * @param budgetName
     *        The name of the budget that you want AWS to notify you about. Budget names must be unique within an
     *        account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNotificationRequest withBudgetName(String budgetName) {
        setBudgetName(budgetName);
        return this;
    }

    /**
     * <p>
     * The notification that you want to create.
     * </p>
     * 
     * @param notification
     *        The notification that you want to create.
     */

    public void setNotification(Notification notification) {
        this.notification = notification;
    }

    /**
     * <p>
     * The notification that you want to create.
     * </p>
     * 
     * @return The notification that you want to create.
     */

    public Notification getNotification() {
        return this.notification;
    }

    /**
     * <p>
     * The notification that you want to create.
     * </p>
     * 
     * @param notification
     *        The notification that you want to create.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNotificationRequest withNotification(Notification notification) {
        setNotification(notification);
        return this;
    }

    /**
     * <p>
     * A list of subscribers that you want to associate with the notification. Each notification can have one SNS
     * subscriber and up to 10 email subscribers.
     * </p>
     * 
     * @return A list of subscribers that you want to associate with the notification. Each notification can have one
     *         SNS subscriber and up to 10 email subscribers.
     */

    public java.util.List<Subscriber> getSubscribers() {
        return subscribers;
    }

    /**
     * <p>
     * A list of subscribers that you want to associate with the notification. Each notification can have one SNS
     * subscriber and up to 10 email subscribers.
     * </p>
     * 
     * @param subscribers
     *        A list of subscribers that you want to associate with the notification. Each notification can have one SNS
     *        subscriber and up to 10 email subscribers.
     */

    public void setSubscribers(java.util.Collection<Subscriber> subscribers) {
        if (subscribers == null) {
            this.subscribers = null;
            return;
        }

        this.subscribers = new java.util.ArrayList<Subscriber>(subscribers);
    }

    /**
     * <p>
     * A list of subscribers that you want to associate with the notification. Each notification can have one SNS
     * subscriber and up to 10 email subscribers.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubscribers(java.util.Collection)} or {@link #withSubscribers(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param subscribers
     *        A list of subscribers that you want to associate with the notification. Each notification can have one SNS
     *        subscriber and up to 10 email subscribers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNotificationRequest withSubscribers(Subscriber... subscribers) {
        if (this.subscribers == null) {
            setSubscribers(new java.util.ArrayList<Subscriber>(subscribers.length));
        }
        for (Subscriber ele : subscribers) {
            this.subscribers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of subscribers that you want to associate with the notification. Each notification can have one SNS
     * subscriber and up to 10 email subscribers.
     * </p>
     * 
     * @param subscribers
     *        A list of subscribers that you want to associate with the notification. Each notification can have one SNS
     *        subscriber and up to 10 email subscribers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNotificationRequest withSubscribers(java.util.Collection<Subscriber> subscribers) {
        setSubscribers(subscribers);
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
        if (getSubscribers() != null)
            sb.append("Subscribers: ").append(getSubscribers());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateNotificationRequest == false)
            return false;
        CreateNotificationRequest other = (CreateNotificationRequest) obj;
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
        if (other.getSubscribers() == null ^ this.getSubscribers() == null)
            return false;
        if (other.getSubscribers() != null && other.getSubscribers().equals(this.getSubscribers()) == false)
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
        hashCode = prime * hashCode + ((getSubscribers() == null) ? 0 : getSubscribers().hashCode());
        return hashCode;
    }

    @Override
    public CreateNotificationRequest clone() {
        return (CreateNotificationRequest) super.clone();
    }

}
