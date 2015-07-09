/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.service.codecommit.model;

import java.io.Serializable;

/**
 * <p>
 * Represents the output of a list branches operation.
 * </p>
 */
public class ListBranchesResult implements Serializable, Cloneable {

    /**
     * <p>
     * The list of branch names.
     * </p>
     */
    private java.util.List<String> branches;
    /**
     * <p>
     * An enumeration token that returns the batch of the results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of branch names.
     * </p>
     * 
     * @return The list of branch names.
     */
    public java.util.List<String> getBranches() {
        return branches;
    }

    /**
     * <p>
     * The list of branch names.
     * </p>
     * 
     * @param branches
     *        The list of branch names.
     */
    public void setBranches(java.util.Collection<String> branches) {
        if (branches == null) {
            this.branches = null;
            return;
        }

        this.branches = new java.util.ArrayList<String>(branches);
    }

    /**
     * <p>
     * The list of branch names.
     * </p>
     * 
     * @param branches
     *        The list of branch names.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public ListBranchesResult withBranches(String... branches) {
        if (this.branches == null) {
            setBranches(new java.util.ArrayList<String>(branches.length));
        }
        for (String ele : branches) {
            this.branches.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of branch names.
     * </p>
     * 
     * @param branches
     *        The list of branch names.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public ListBranchesResult withBranches(java.util.Collection<String> branches) {
        setBranches(branches);
        return this;
    }

    /**
     * <p>
     * An enumeration token that returns the batch of the results.
     * </p>
     * 
     * @param nextToken
     *        An enumeration token that returns the batch of the results.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * An enumeration token that returns the batch of the results.
     * </p>
     * 
     * @return An enumeration token that returns the batch of the results.
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * An enumeration token that returns the batch of the results.
     * </p>
     * 
     * @param nextToken
     *        An enumeration token that returns the batch of the results.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public ListBranchesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
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
            sb.append("Branches: " + getBranches() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
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
        if (other.getBranches() != null
                && other.getBranches().equals(this.getBranches()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getBranches() == null) ? 0 : getBranches().hashCode());
        hashCode = prime * hashCode
                + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListBranchesResult clone() {
        try {
            return (ListBranchesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}