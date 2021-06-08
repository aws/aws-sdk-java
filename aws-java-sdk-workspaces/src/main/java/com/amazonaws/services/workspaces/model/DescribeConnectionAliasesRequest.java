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
package com.amazonaws.services.workspaces.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DescribeConnectionAliases"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeConnectionAliasesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifiers of the connection aliases to describe.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> aliasIds;
    /**
     * <p>
     * The identifier of the directory associated with the connection alias.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * The maximum number of connection aliases to return.
     * </p>
     */
    private Integer limit;
    /**
     * <p>
     * If you received a <code>NextToken</code> from a previous call that was paginated, provide this token to receive
     * the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The identifiers of the connection aliases to describe.
     * </p>
     * 
     * @return The identifiers of the connection aliases to describe.
     */

    public java.util.List<String> getAliasIds() {
        if (aliasIds == null) {
            aliasIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return aliasIds;
    }

    /**
     * <p>
     * The identifiers of the connection aliases to describe.
     * </p>
     * 
     * @param aliasIds
     *        The identifiers of the connection aliases to describe.
     */

    public void setAliasIds(java.util.Collection<String> aliasIds) {
        if (aliasIds == null) {
            this.aliasIds = null;
            return;
        }

        this.aliasIds = new com.amazonaws.internal.SdkInternalList<String>(aliasIds);
    }

    /**
     * <p>
     * The identifiers of the connection aliases to describe.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAliasIds(java.util.Collection)} or {@link #withAliasIds(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param aliasIds
     *        The identifiers of the connection aliases to describe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConnectionAliasesRequest withAliasIds(String... aliasIds) {
        if (this.aliasIds == null) {
            setAliasIds(new com.amazonaws.internal.SdkInternalList<String>(aliasIds.length));
        }
        for (String ele : aliasIds) {
            this.aliasIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The identifiers of the connection aliases to describe.
     * </p>
     * 
     * @param aliasIds
     *        The identifiers of the connection aliases to describe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConnectionAliasesRequest withAliasIds(java.util.Collection<String> aliasIds) {
        setAliasIds(aliasIds);
        return this;
    }

    /**
     * <p>
     * The identifier of the directory associated with the connection alias.
     * </p>
     * 
     * @param resourceId
     *        The identifier of the directory associated with the connection alias.
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The identifier of the directory associated with the connection alias.
     * </p>
     * 
     * @return The identifier of the directory associated with the connection alias.
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * The identifier of the directory associated with the connection alias.
     * </p>
     * 
     * @param resourceId
     *        The identifier of the directory associated with the connection alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConnectionAliasesRequest withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * The maximum number of connection aliases to return.
     * </p>
     * 
     * @param limit
     *        The maximum number of connection aliases to return.
     */

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * The maximum number of connection aliases to return.
     * </p>
     * 
     * @return The maximum number of connection aliases to return.
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * The maximum number of connection aliases to return.
     * </p>
     * 
     * @param limit
     *        The maximum number of connection aliases to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConnectionAliasesRequest withLimit(Integer limit) {
        setLimit(limit);
        return this;
    }

    /**
     * <p>
     * If you received a <code>NextToken</code> from a previous call that was paginated, provide this token to receive
     * the next set of results.
     * </p>
     * 
     * @param nextToken
     *        If you received a <code>NextToken</code> from a previous call that was paginated, provide this token to
     *        receive the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If you received a <code>NextToken</code> from a previous call that was paginated, provide this token to receive
     * the next set of results.
     * </p>
     * 
     * @return If you received a <code>NextToken</code> from a previous call that was paginated, provide this token to
     *         receive the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If you received a <code>NextToken</code> from a previous call that was paginated, provide this token to receive
     * the next set of results.
     * </p>
     * 
     * @param nextToken
     *        If you received a <code>NextToken</code> from a previous call that was paginated, provide this token to
     *        receive the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConnectionAliasesRequest withNextToken(String nextToken) {
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
        if (getAliasIds() != null)
            sb.append("AliasIds: ").append(getAliasIds()).append(",");
        if (getResourceId() != null)
            sb.append("ResourceId: ").append(getResourceId()).append(",");
        if (getLimit() != null)
            sb.append("Limit: ").append(getLimit()).append(",");
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

        if (obj instanceof DescribeConnectionAliasesRequest == false)
            return false;
        DescribeConnectionAliasesRequest other = (DescribeConnectionAliasesRequest) obj;
        if (other.getAliasIds() == null ^ this.getAliasIds() == null)
            return false;
        if (other.getAliasIds() != null && other.getAliasIds().equals(this.getAliasIds()) == false)
            return false;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
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

        hashCode = prime * hashCode + ((getAliasIds() == null) ? 0 : getAliasIds().hashCode());
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeConnectionAliasesRequest clone() {
        return (DescribeConnectionAliasesRequest) super.clone();
    }

}
