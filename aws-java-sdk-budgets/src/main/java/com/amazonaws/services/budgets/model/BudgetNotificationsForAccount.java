/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The budget name and associated notifications for an account.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BudgetNotificationsForAccount implements Serializable, Cloneable, StructuredPojo {

    private java.util.List<Notification> notifications;

    private String budgetName;

    /**
     * @return
     */

    public java.util.List<Notification> getNotifications() {
        return notifications;
    }

    /**
     * @param notifications
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
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNotifications(java.util.Collection)} or {@link #withNotifications(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param notifications
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BudgetNotificationsForAccount withNotifications(Notification... notifications) {
        if (this.notifications == null) {
            setNotifications(new java.util.ArrayList<Notification>(notifications.length));
        }
        for (Notification ele : notifications) {
            this.notifications.add(ele);
        }
        return this;
    }

    /**
     * @param notifications
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BudgetNotificationsForAccount withNotifications(java.util.Collection<Notification> notifications) {
        setNotifications(notifications);
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

    public BudgetNotificationsForAccount withBudgetName(String budgetName) {
        setBudgetName(budgetName);
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
        if (getBudgetName() != null)
            sb.append("BudgetName: ").append(getBudgetName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BudgetNotificationsForAccount == false)
            return false;
        BudgetNotificationsForAccount other = (BudgetNotificationsForAccount) obj;
        if (other.getNotifications() == null ^ this.getNotifications() == null)
            return false;
        if (other.getNotifications() != null && other.getNotifications().equals(this.getNotifications()) == false)
            return false;
        if (other.getBudgetName() == null ^ this.getBudgetName() == null)
            return false;
        if (other.getBudgetName() != null && other.getBudgetName().equals(this.getBudgetName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNotifications() == null) ? 0 : getNotifications().hashCode());
        hashCode = prime * hashCode + ((getBudgetName() == null) ? 0 : getBudgetName().hashCode());
        return hashCode;
    }

    @Override
    public BudgetNotificationsForAccount clone() {
        try {
            return (BudgetNotificationsForAccount) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.budgets.model.transform.BudgetNotificationsForAccountMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
