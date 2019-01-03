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
 * Request of UpdateSubscriber
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateSubscriberRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The <code>accountId</code> that is associated with the budget whose subscriber you want to update.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The name of the budget whose subscriber you want to update.
     * </p>
     */
    private String budgetName;
    /**
     * <p>
     * The notification whose subscriber you want to update.
     * </p>
     */
    private Notification notification;
    /**
     * <p>
     * The previous subscriber that is associated with a budget notification.
     * </p>
     */
    private Subscriber oldSubscriber;
    /**
     * <p>
     * The updated subscriber that is associated with a budget notification.
     * </p>
     */
    private Subscriber newSubscriber;

    /**
     * <p>
     * The <code>accountId</code> that is associated with the budget whose subscriber you want to update.
     * </p>
     * 
     * @param accountId
     *        The <code>accountId</code> that is associated with the budget whose subscriber you want to update.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The <code>accountId</code> that is associated with the budget whose subscriber you want to update.
     * </p>
     * 
     * @return The <code>accountId</code> that is associated with the budget whose subscriber you want to update.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The <code>accountId</code> that is associated with the budget whose subscriber you want to update.
     * </p>
     * 
     * @param accountId
     *        The <code>accountId</code> that is associated with the budget whose subscriber you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSubscriberRequest withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The name of the budget whose subscriber you want to update.
     * </p>
     * 
     * @param budgetName
     *        The name of the budget whose subscriber you want to update.
     */

    public void setBudgetName(String budgetName) {
        this.budgetName = budgetName;
    }

    /**
     * <p>
     * The name of the budget whose subscriber you want to update.
     * </p>
     * 
     * @return The name of the budget whose subscriber you want to update.
     */

    public String getBudgetName() {
        return this.budgetName;
    }

    /**
     * <p>
     * The name of the budget whose subscriber you want to update.
     * </p>
     * 
     * @param budgetName
     *        The name of the budget whose subscriber you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSubscriberRequest withBudgetName(String budgetName) {
        setBudgetName(budgetName);
        return this;
    }

    /**
     * <p>
     * The notification whose subscriber you want to update.
     * </p>
     * 
     * @param notification
     *        The notification whose subscriber you want to update.
     */

    public void setNotification(Notification notification) {
        this.notification = notification;
    }

    /**
     * <p>
     * The notification whose subscriber you want to update.
     * </p>
     * 
     * @return The notification whose subscriber you want to update.
     */

    public Notification getNotification() {
        return this.notification;
    }

    /**
     * <p>
     * The notification whose subscriber you want to update.
     * </p>
     * 
     * @param notification
     *        The notification whose subscriber you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSubscriberRequest withNotification(Notification notification) {
        setNotification(notification);
        return this;
    }

    /**
     * <p>
     * The previous subscriber that is associated with a budget notification.
     * </p>
     * 
     * @param oldSubscriber
     *        The previous subscriber that is associated with a budget notification.
     */

    public void setOldSubscriber(Subscriber oldSubscriber) {
        this.oldSubscriber = oldSubscriber;
    }

    /**
     * <p>
     * The previous subscriber that is associated with a budget notification.
     * </p>
     * 
     * @return The previous subscriber that is associated with a budget notification.
     */

    public Subscriber getOldSubscriber() {
        return this.oldSubscriber;
    }

    /**
     * <p>
     * The previous subscriber that is associated with a budget notification.
     * </p>
     * 
     * @param oldSubscriber
     *        The previous subscriber that is associated with a budget notification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSubscriberRequest withOldSubscriber(Subscriber oldSubscriber) {
        setOldSubscriber(oldSubscriber);
        return this;
    }

    /**
     * <p>
     * The updated subscriber that is associated with a budget notification.
     * </p>
     * 
     * @param newSubscriber
     *        The updated subscriber that is associated with a budget notification.
     */

    public void setNewSubscriber(Subscriber newSubscriber) {
        this.newSubscriber = newSubscriber;
    }

    /**
     * <p>
     * The updated subscriber that is associated with a budget notification.
     * </p>
     * 
     * @return The updated subscriber that is associated with a budget notification.
     */

    public Subscriber getNewSubscriber() {
        return this.newSubscriber;
    }

    /**
     * <p>
     * The updated subscriber that is associated with a budget notification.
     * </p>
     * 
     * @param newSubscriber
     *        The updated subscriber that is associated with a budget notification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSubscriberRequest withNewSubscriber(Subscriber newSubscriber) {
        setNewSubscriber(newSubscriber);
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
        if (getOldSubscriber() != null)
            sb.append("OldSubscriber: ").append(getOldSubscriber()).append(",");
        if (getNewSubscriber() != null)
            sb.append("NewSubscriber: ").append(getNewSubscriber());
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
