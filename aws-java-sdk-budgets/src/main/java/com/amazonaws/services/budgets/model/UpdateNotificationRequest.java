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
 * Request of UpdateNotification
 */
public class UpdateNotificationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private String accountId;

    private String budgetName;

    private Notification oldNotification;

    private Notification newNotification;

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

    public UpdateNotificationRequest withAccountId(String accountId) {
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

    public UpdateNotificationRequest withBudgetName(String budgetName) {
        setBudgetName(budgetName);
        return this;
    }

    /**
     * @param oldNotification
     */

    public void setOldNotification(Notification oldNotification) {
        this.oldNotification = oldNotification;
    }

    /**
     * @return
     */

    public Notification getOldNotification() {
        return this.oldNotification;
    }

    /**
     * @param oldNotification
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateNotificationRequest withOldNotification(Notification oldNotification) {
        setOldNotification(oldNotification);
        return this;
    }

    /**
     * @param newNotification
     */

    public void setNewNotification(Notification newNotification) {
        this.newNotification = newNotification;
    }

    /**
     * @return
     */

    public Notification getNewNotification() {
        return this.newNotification;
    }

    /**
     * @param newNotification
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateNotificationRequest withNewNotification(Notification newNotification) {
        setNewNotification(newNotification);
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
        if (getOldNotification() != null)
            sb.append("OldNotification: " + getOldNotification() + ",");
        if (getNewNotification() != null)
            sb.append("NewNotification: " + getNewNotification());
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
