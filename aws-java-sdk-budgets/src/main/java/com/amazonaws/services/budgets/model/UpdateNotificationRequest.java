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
 * Request of UpdateNotification
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateNotificationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The <code>accountId</code> that is associated with the budget whose notification you want to update.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The name of the budget whose notification you want to update.
     * </p>
     */
    private String budgetName;
    /**
     * <p>
     * The previous notification that is associated with a budget.
     * </p>
     */
    private Notification oldNotification;
    /**
     * <p>
     * The updated notification to be associated with a budget.
     * </p>
     */
    private Notification newNotification;

    /**
     * <p>
     * The <code>accountId</code> that is associated with the budget whose notification you want to update.
     * </p>
     * 
     * @param accountId
     *        The <code>accountId</code> that is associated with the budget whose notification you want to update.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The <code>accountId</code> that is associated with the budget whose notification you want to update.
     * </p>
     * 
     * @return The <code>accountId</code> that is associated with the budget whose notification you want to update.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The <code>accountId</code> that is associated with the budget whose notification you want to update.
     * </p>
     * 
     * @param accountId
     *        The <code>accountId</code> that is associated with the budget whose notification you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateNotificationRequest withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The name of the budget whose notification you want to update.
     * </p>
     * 
     * @param budgetName
     *        The name of the budget whose notification you want to update.
     */

    public void setBudgetName(String budgetName) {
        this.budgetName = budgetName;
    }

    /**
     * <p>
     * The name of the budget whose notification you want to update.
     * </p>
     * 
     * @return The name of the budget whose notification you want to update.
     */

    public String getBudgetName() {
        return this.budgetName;
    }

    /**
     * <p>
     * The name of the budget whose notification you want to update.
     * </p>
     * 
     * @param budgetName
     *        The name of the budget whose notification you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateNotificationRequest withBudgetName(String budgetName) {
        setBudgetName(budgetName);
        return this;
    }

    /**
     * <p>
     * The previous notification that is associated with a budget.
     * </p>
     * 
     * @param oldNotification
     *        The previous notification that is associated with a budget.
     */

    public void setOldNotification(Notification oldNotification) {
        this.oldNotification = oldNotification;
    }

    /**
     * <p>
     * The previous notification that is associated with a budget.
     * </p>
     * 
     * @return The previous notification that is associated with a budget.
     */

    public Notification getOldNotification() {
        return this.oldNotification;
    }

    /**
     * <p>
     * The previous notification that is associated with a budget.
     * </p>
     * 
     * @param oldNotification
     *        The previous notification that is associated with a budget.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateNotificationRequest withOldNotification(Notification oldNotification) {
        setOldNotification(oldNotification);
        return this;
    }

    /**
     * <p>
     * The updated notification to be associated with a budget.
     * </p>
     * 
     * @param newNotification
     *        The updated notification to be associated with a budget.
     */

    public void setNewNotification(Notification newNotification) {
        this.newNotification = newNotification;
    }

    /**
     * <p>
     * The updated notification to be associated with a budget.
     * </p>
     * 
     * @return The updated notification to be associated with a budget.
     */

    public Notification getNewNotification() {
        return this.newNotification;
    }

    /**
     * <p>
     * The updated notification to be associated with a budget.
     * </p>
     * 
     * @param newNotification
     *        The updated notification to be associated with a budget.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateNotificationRequest withNewNotification(Notification newNotification) {
        setNewNotification(newNotification);
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
        if (getOldNotification() != null)
            sb.append("OldNotification: ").append(getOldNotification()).append(",");
        if (getNewNotification() != null)
            sb.append("NewNotification: ").append(getNewNotification());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateNotificationRequest == false)
            return false;
        UpdateNotificationRequest other = (UpdateNotificationRequest) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getBudgetName() == null ^ this.getBudgetName() == null)
            return false;
        if (other.getBudgetName() != null && other.getBudgetName().equals(this.getBudgetName()) == false)
            return false;
        if (other.getOldNotification() == null ^ this.getOldNotification() == null)
            return false;
        if (other.getOldNotification() != null && other.getOldNotification().equals(this.getOldNotification()) == false)
            return false;
        if (other.getNewNotification() == null ^ this.getNewNotification() == null)
            return false;
        if (other.getNewNotification() != null && other.getNewNotification().equals(this.getNewNotification()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getBudgetName() == null) ? 0 : getBudgetName().hashCode());
        hashCode = prime * hashCode + ((getOldNotification() == null) ? 0 : getOldNotification().hashCode());
        hashCode = prime * hashCode + ((getNewNotification() == null) ? 0 : getNewNotification().hashCode());
        return hashCode;
    }

    @Override
    public UpdateNotificationRequest clone() {
        return (UpdateNotificationRequest) super.clone();
    }

}
