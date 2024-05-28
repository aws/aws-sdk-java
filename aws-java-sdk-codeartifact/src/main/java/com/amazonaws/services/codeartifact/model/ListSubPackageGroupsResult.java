/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.codeartifact.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/ListSubPackageGroups" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListSubPackageGroupsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of sub package groups for the requested package group.
     * </p>
     */
    private java.util.List<PackageGroupSummary> packageGroups;
    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of sub package groups for the requested package group.
     * </p>
     * 
     * @return A list of sub package groups for the requested package group.
     */

    public java.util.List<PackageGroupSummary> getPackageGroups() {
        return packageGroups;
    }

    /**
     * <p>
     * A list of sub package groups for the requested package group.
     * </p>
     * 
     * @param packageGroups
     *        A list of sub package groups for the requested package group.
     */

    public void setPackageGroups(java.util.Collection<PackageGroupSummary> packageGroups) {
        if (packageGroups == null) {
            this.packageGroups = null;
            return;
        }

        this.packageGroups = new java.util.ArrayList<PackageGroupSummary>(packageGroups);
    }

    /**
     * <p>
     * A list of sub package groups for the requested package group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPackageGroups(java.util.Collection)} or {@link #withPackageGroups(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param packageGroups
     *        A list of sub package groups for the requested package group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSubPackageGroupsResult withPackageGroups(PackageGroupSummary... packageGroups) {
        if (this.packageGroups == null) {
            setPackageGroups(new java.util.ArrayList<PackageGroupSummary>(packageGroups.length));
        }
        for (PackageGroupSummary ele : packageGroups) {
            this.packageGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of sub package groups for the requested package group.
     * </p>
     * 
     * @param packageGroups
     *        A list of sub package groups for the requested package group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSubPackageGroupsResult withPackageGroups(java.util.Collection<PackageGroupSummary> packageGroups) {
        setPackageGroups(packageGroups);
        return this;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     * 
     * @param nextToken
     *        If there are additional results, this is the token for the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     * 
     * @return If there are additional results, this is the token for the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     * 
     * @param nextToken
     *        If there are additional results, this is the token for the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSubPackageGroupsResult withNextToken(String nextToken) {
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
        if (getPackageGroups() != null)
            sb.append("PackageGroups: ").append(getPackageGroups()).append(",");
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

        if (obj instanceof ListSubPackageGroupsResult == false)
            return false;
        ListSubPackageGroupsResult other = (ListSubPackageGroupsResult) obj;
        if (other.getPackageGroups() == null ^ this.getPackageGroups() == null)
            return false;
        if (other.getPackageGroups() != null && other.getPackageGroups().equals(this.getPackageGroups()) == false)
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

        hashCode = prime * hashCode + ((getPackageGroups() == null) ? 0 : getPackageGroups().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListSubPackageGroupsResult clone() {
        try {
            return (ListSubPackageGroupsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
