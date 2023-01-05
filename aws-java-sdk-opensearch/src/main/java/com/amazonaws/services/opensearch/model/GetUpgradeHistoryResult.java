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
package com.amazonaws.services.opensearch.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Container for the response returned by the <code>GetUpgradeHistory</code> operation.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetUpgradeHistoryResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of objects corresponding to each upgrade or upgrade eligibility check performed on a domain.
     * </p>
     */
    private java.util.List<UpgradeHistory> upgradeHistories;
    /**
     * <p>
     * When <code>nextToken</code> is returned, there are more results available. The value of <code>nextToken</code> is
     * a unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of objects corresponding to each upgrade or upgrade eligibility check performed on a domain.
     * </p>
     * 
     * @return A list of objects corresponding to each upgrade or upgrade eligibility check performed on a domain.
     */

    public java.util.List<UpgradeHistory> getUpgradeHistories() {
        return upgradeHistories;
    }

    /**
     * <p>
     * A list of objects corresponding to each upgrade or upgrade eligibility check performed on a domain.
     * </p>
     * 
     * @param upgradeHistories
     *        A list of objects corresponding to each upgrade or upgrade eligibility check performed on a domain.
     */

    public void setUpgradeHistories(java.util.Collection<UpgradeHistory> upgradeHistories) {
        if (upgradeHistories == null) {
            this.upgradeHistories = null;
            return;
        }

        this.upgradeHistories = new java.util.ArrayList<UpgradeHistory>(upgradeHistories);
    }

    /**
     * <p>
     * A list of objects corresponding to each upgrade or upgrade eligibility check performed on a domain.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUpgradeHistories(java.util.Collection)} or {@link #withUpgradeHistories(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param upgradeHistories
     *        A list of objects corresponding to each upgrade or upgrade eligibility check performed on a domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetUpgradeHistoryResult withUpgradeHistories(UpgradeHistory... upgradeHistories) {
        if (this.upgradeHistories == null) {
            setUpgradeHistories(new java.util.ArrayList<UpgradeHistory>(upgradeHistories.length));
        }
        for (UpgradeHistory ele : upgradeHistories) {
            this.upgradeHistories.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of objects corresponding to each upgrade or upgrade eligibility check performed on a domain.
     * </p>
     * 
     * @param upgradeHistories
     *        A list of objects corresponding to each upgrade or upgrade eligibility check performed on a domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetUpgradeHistoryResult withUpgradeHistories(java.util.Collection<UpgradeHistory> upgradeHistories) {
        setUpgradeHistories(upgradeHistories);
        return this;
    }

    /**
     * <p>
     * When <code>nextToken</code> is returned, there are more results available. The value of <code>nextToken</code> is
     * a unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
     * </p>
     * 
     * @param nextToken
     *        When <code>nextToken</code> is returned, there are more results available. The value of
     *        <code>nextToken</code> is a unique pagination token for each page. Make the call again using the returned
     *        token to retrieve the next page.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * When <code>nextToken</code> is returned, there are more results available. The value of <code>nextToken</code> is
     * a unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
     * </p>
     * 
     * @return When <code>nextToken</code> is returned, there are more results available. The value of
     *         <code>nextToken</code> is a unique pagination token for each page. Make the call again using the returned
     *         token to retrieve the next page.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * When <code>nextToken</code> is returned, there are more results available. The value of <code>nextToken</code> is
     * a unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
     * </p>
     * 
     * @param nextToken
     *        When <code>nextToken</code> is returned, there are more results available. The value of
     *        <code>nextToken</code> is a unique pagination token for each page. Make the call again using the returned
     *        token to retrieve the next page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetUpgradeHistoryResult withNextToken(String nextToken) {
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
        if (getUpgradeHistories() != null)
            sb.append("UpgradeHistories: ").append(getUpgradeHistories()).append(",");
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

        if (obj instanceof GetUpgradeHistoryResult == false)
            return false;
        GetUpgradeHistoryResult other = (GetUpgradeHistoryResult) obj;
        if (other.getUpgradeHistories() == null ^ this.getUpgradeHistories() == null)
            return false;
        if (other.getUpgradeHistories() != null && other.getUpgradeHistories().equals(this.getUpgradeHistories()) == false)
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

        hashCode = prime * hashCode + ((getUpgradeHistories() == null) ? 0 : getUpgradeHistories().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetUpgradeHistoryResult clone() {
        try {
            return (GetUpgradeHistoryResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
