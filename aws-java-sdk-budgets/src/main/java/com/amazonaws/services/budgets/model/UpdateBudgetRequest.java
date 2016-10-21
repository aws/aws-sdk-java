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
 * Request of UpdateBudget
 */
public class UpdateBudgetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private String accountId;

    private Budget newBudget;

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

    public UpdateBudgetRequest withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * @param newBudget
     */

    public void setNewBudget(Budget newBudget) {
        this.newBudget = newBudget;
    }

    /**
     * @return
     */

    public Budget getNewBudget() {
        return this.newBudget;
    }

    /**
     * @param newBudget
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBudgetRequest withNewBudget(Budget newBudget) {
        setNewBudget(newBudget);
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
        if (getNewBudget() != null)
            sb.append("NewBudget: " + getNewBudget());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateBudgetRequest == false)
            return false;
        UpdateBudgetRequest other = (UpdateBudgetRequest) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getNewBudget() == null ^ this.getNewBudget() == null)
            return false;
        if (other.getNewBudget() != null && other.getNewBudget().equals(this.getNewBudget()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getNewBudget() == null) ? 0 : getNewBudget().hashCode());
        return hashCode;
    }

    @Override
    public UpdateBudgetRequest clone() {
        return (UpdateBudgetRequest) super.clone();
    }
}
