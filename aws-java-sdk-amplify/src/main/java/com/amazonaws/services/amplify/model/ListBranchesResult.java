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
package com.amazonaws.services.amplify.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Result structure for list branches request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/ListBranches" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListBranchesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * List of branches for an Amplify App.
     * </p>
     */
    private java.util.List<Branch> branches;
    /**
     * <p>
     * Pagination token. If non-null pagination token is returned in a result, then pass its value in another request to
     * fetch more entries.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * List of branches for an Amplify App.
     * </p>
     * 
     * @return List of branches for an Amplify App.
     */

    public java.util.List<Branch> getBranches() {
        return branches;
    }

    /**
     * <p>
     * List of branches for an Amplify App.
     * </p>
     * 
     * @param branches
     *        List of branches for an Amplify App.
     */

    public void setBranches(java.util.Collection<Branch> branches) {
        if (branches == null) {
            this.branches = null;
            return;
        }

        this.branches = new java.util.ArrayList<Branch>(branches);
    }

    /**
     * <p>
     * List of branches for an Amplify App.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBranches(java.util.Collection)} or {@link #withBranches(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param branches
     *        List of branches for an Amplify App.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBranchesResult withBranches(Branch... branches) {
        if (this.branches == null) {
            setBranches(new java.util.ArrayList<Branch>(branches.length));
        }
        for (Branch ele : branches) {
            this.branches.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of branches for an Amplify App.
     * </p>
     * 
     * @param branches
     *        List of branches for an Amplify App.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBranchesResult withBranches(java.util.Collection<Branch> branches) {
        setBranches(branches);
        return this;
    }

    /**
     * <p>
     * Pagination token. If non-null pagination token is returned in a result, then pass its value in another request to
     * fetch more entries.
     * </p>
     * 
     * @param nextToken
     *        Pagination token. If non-null pagination token is returned in a result, then pass its value in another
     *        request to fetch more entries.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Pagination token. If non-null pagination token is returned in a result, then pass its value in another request to
     * fetch more entries.
     * </p>
     * 
     * @return Pagination token. If non-null pagination token is returned in a result, then pass its value in another
     *         request to fetch more entries.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Pagination token. If non-null pagination token is returned in a result, then pass its value in another request to
     * fetch more entries.
     * </p>
     * 
     * @param nextToken
     *        Pagination token. If non-null pagination token is returned in a result, then pass its value in another
     *        request to fetch more entries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBranchesResult withNextToken(String nextToken) {
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
        if (getBranches() != null)
            sb.append("Branches: ").append(getBranches()).append(",");
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

        if (obj instanceof ListBranchesResult == false)
            return false;
        ListBranchesResult other = (ListBranchesResult) obj;
        if (other.getBranches() == null ^ this.getBranches() == null)
            return false;
        if (other.getBranches() != null && other.getBranches().equals(this.getBranches()) == false)
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

        hashCode = prime * hashCode + ((getBranches() == null) ? 0 : getBranches().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListBranchesResult clone() {
        try {
            return (ListBranchesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
