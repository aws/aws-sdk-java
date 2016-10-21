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

/**
 * Response of DescribeBudget
 */
public class DescribeBudgetResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private Budget budget;

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

    public DescribeBudgetResult withBudget(Budget budget) {
        setBudget(budget);
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
        if (getBudget() != null)
            sb.append("Budget: " + getBudget());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeBudgetResult == false)
            return false;
        DescribeBudgetResult other = (DescribeBudgetResult) obj;
        if (other.getBudget() == null ^ this.getBudget() == null)
            return false;
        if (other.getBudget() != null && other.getBudget().equals(this.getBudget()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBudget() == null) ? 0 : getBudget().hashCode());
        return hashCode;
    }

    @Override
    public DescribeBudgetResult clone() {
        try {
            return (DescribeBudgetResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
