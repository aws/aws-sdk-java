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
package com.amazonaws.services.inspector2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/ListCoverageStatistics" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListCoverageStatisticsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array with the number for each group.
     * </p>
     */
    private java.util.List<Counts> countsByGroup;
    /**
     * <p>
     * A token to use for paginating results that are returned in the response. Set the value of this parameter to null
     * for the first request to a list action. For subsequent calls, use the <code>NextToken</code> value returned from
     * the previous request to continue listing results after the first page.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The total number for all groups.
     * </p>
     */
    private Long totalCounts;

    /**
     * <p>
     * An array with the number for each group.
     * </p>
     * 
     * @return An array with the number for each group.
     */

    public java.util.List<Counts> getCountsByGroup() {
        return countsByGroup;
    }

    /**
     * <p>
     * An array with the number for each group.
     * </p>
     * 
     * @param countsByGroup
     *        An array with the number for each group.
     */

    public void setCountsByGroup(java.util.Collection<Counts> countsByGroup) {
        if (countsByGroup == null) {
            this.countsByGroup = null;
            return;
        }

        this.countsByGroup = new java.util.ArrayList<Counts>(countsByGroup);
    }

    /**
     * <p>
     * An array with the number for each group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCountsByGroup(java.util.Collection)} or {@link #withCountsByGroup(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param countsByGroup
     *        An array with the number for each group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCoverageStatisticsResult withCountsByGroup(Counts... countsByGroup) {
        if (this.countsByGroup == null) {
            setCountsByGroup(new java.util.ArrayList<Counts>(countsByGroup.length));
        }
        for (Counts ele : countsByGroup) {
            this.countsByGroup.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array with the number for each group.
     * </p>
     * 
     * @param countsByGroup
     *        An array with the number for each group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCoverageStatisticsResult withCountsByGroup(java.util.Collection<Counts> countsByGroup) {
        setCountsByGroup(countsByGroup);
        return this;
    }

    /**
     * <p>
     * A token to use for paginating results that are returned in the response. Set the value of this parameter to null
     * for the first request to a list action. For subsequent calls, use the <code>NextToken</code> value returned from
     * the previous request to continue listing results after the first page.
     * </p>
     * 
     * @param nextToken
     *        A token to use for paginating results that are returned in the response. Set the value of this parameter
     *        to null for the first request to a list action. For subsequent calls, use the <code>NextToken</code> value
     *        returned from the previous request to continue listing results after the first page.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token to use for paginating results that are returned in the response. Set the value of this parameter to null
     * for the first request to a list action. For subsequent calls, use the <code>NextToken</code> value returned from
     * the previous request to continue listing results after the first page.
     * </p>
     * 
     * @return A token to use for paginating results that are returned in the response. Set the value of this parameter
     *         to null for the first request to a list action. For subsequent calls, use the <code>NextToken</code>
     *         value returned from the previous request to continue listing results after the first page.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token to use for paginating results that are returned in the response. Set the value of this parameter to null
     * for the first request to a list action. For subsequent calls, use the <code>NextToken</code> value returned from
     * the previous request to continue listing results after the first page.
     * </p>
     * 
     * @param nextToken
     *        A token to use for paginating results that are returned in the response. Set the value of this parameter
     *        to null for the first request to a list action. For subsequent calls, use the <code>NextToken</code> value
     *        returned from the previous request to continue listing results after the first page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCoverageStatisticsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The total number for all groups.
     * </p>
     * 
     * @param totalCounts
     *        The total number for all groups.
     */

    public void setTotalCounts(Long totalCounts) {
        this.totalCounts = totalCounts;
    }

    /**
     * <p>
     * The total number for all groups.
     * </p>
     * 
     * @return The total number for all groups.
     */

    public Long getTotalCounts() {
        return this.totalCounts;
    }

    /**
     * <p>
     * The total number for all groups.
     * </p>
     * 
     * @param totalCounts
     *        The total number for all groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCoverageStatisticsResult withTotalCounts(Long totalCounts) {
        setTotalCounts(totalCounts);
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
        if (getCountsByGroup() != null)
            sb.append("CountsByGroup: ").append(getCountsByGroup()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getTotalCounts() != null)
            sb.append("TotalCounts: ").append(getTotalCounts());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListCoverageStatisticsResult == false)
            return false;
        ListCoverageStatisticsResult other = (ListCoverageStatisticsResult) obj;
        if (other.getCountsByGroup() == null ^ this.getCountsByGroup() == null)
            return false;
        if (other.getCountsByGroup() != null && other.getCountsByGroup().equals(this.getCountsByGroup()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getTotalCounts() == null ^ this.getTotalCounts() == null)
            return false;
        if (other.getTotalCounts() != null && other.getTotalCounts().equals(this.getTotalCounts()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCountsByGroup() == null) ? 0 : getCountsByGroup().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getTotalCounts() == null) ? 0 : getTotalCounts().hashCode());
        return hashCode;
    }

    @Override
    public ListCoverageStatisticsResult clone() {
        try {
            return (ListCoverageStatisticsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
