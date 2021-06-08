/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeBudgetActionHistoriesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The historical record of the budget action resource.
     * </p>
     */
    private java.util.List<ActionHistory> actionHistories;

    private String nextToken;

    /**
     * <p>
     * The historical record of the budget action resource.
     * </p>
     * 
     * @return The historical record of the budget action resource.
     */

    public java.util.List<ActionHistory> getActionHistories() {
        return actionHistories;
    }

    /**
     * <p>
     * The historical record of the budget action resource.
     * </p>
     * 
     * @param actionHistories
     *        The historical record of the budget action resource.
     */

    public void setActionHistories(java.util.Collection<ActionHistory> actionHistories) {
        if (actionHistories == null) {
            this.actionHistories = null;
            return;
        }

        this.actionHistories = new java.util.ArrayList<ActionHistory>(actionHistories);
    }

    /**
     * <p>
     * The historical record of the budget action resource.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setActionHistories(java.util.Collection)} or {@link #withActionHistories(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param actionHistories
     *        The historical record of the budget action resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBudgetActionHistoriesResult withActionHistories(ActionHistory... actionHistories) {
        if (this.actionHistories == null) {
            setActionHistories(new java.util.ArrayList<ActionHistory>(actionHistories.length));
        }
        for (ActionHistory ele : actionHistories) {
            this.actionHistories.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The historical record of the budget action resource.
     * </p>
     * 
     * @param actionHistories
     *        The historical record of the budget action resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBudgetActionHistoriesResult withActionHistories(java.util.Collection<ActionHistory> actionHistories) {
        setActionHistories(actionHistories);
        return this;
    }

    /**
     * @param nextToken
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * @return
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @param nextToken
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBudgetActionHistoriesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getActionHistories() != null)
            sb.append("ActionHistories: ").append(getActionHistories()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeBudgetActionHistoriesResult == false)
            return false;
        DescribeBudgetActionHistoriesResult other = (DescribeBudgetActionHistoriesResult) obj;
        if (other.getActionHistories() == null ^ this.getActionHistories() == null)
            return false;
        if (other.getActionHistories() != null && other.getActionHistories().equals(this.getActionHistories()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActionHistories() == null) ? 0 : getActionHistories().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeBudgetActionHistoriesResult clone() {
        try {
            return (DescribeBudgetActionHistoriesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
