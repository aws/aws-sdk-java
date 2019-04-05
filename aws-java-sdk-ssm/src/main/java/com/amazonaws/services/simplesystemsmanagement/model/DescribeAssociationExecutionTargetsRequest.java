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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeAssociationExecutionTargets"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAssociationExecutionTargetsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The association ID that includes the execution for which you want to view details.
     * </p>
     */
    private String associationId;
    /**
     * <p>
     * The execution ID for which you want to view details.
     * </p>
     */
    private String executionId;
    /**
     * <p>
     * Filters for the request. You can specify the following filters and values.
     * </p>
     * <p>
     * Status (EQUAL)
     * </p>
     * <p>
     * ResourceId (EQUAL)
     * </p>
     * <p>
     * ResourceType (EQUAL)
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<AssociationExecutionTargetsFilter> filters;
    /**
     * <p>
     * The maximum number of items to return for this call. The call also returns a token that you can specify in a
     * subsequent call to get the next set of results.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * A token to start the list. Use this token to get the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The association ID that includes the execution for which you want to view details.
     * </p>
     * 
     * @param associationId
     *        The association ID that includes the execution for which you want to view details.
     */

    public void setAssociationId(String associationId) {
        this.associationId = associationId;
    }

    /**
     * <p>
     * The association ID that includes the execution for which you want to view details.
     * </p>
     * 
     * @return The association ID that includes the execution for which you want to view details.
     */

    public String getAssociationId() {
        return this.associationId;
    }

    /**
     * <p>
     * The association ID that includes the execution for which you want to view details.
     * </p>
     * 
     * @param associationId
     *        The association ID that includes the execution for which you want to view details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAssociationExecutionTargetsRequest withAssociationId(String associationId) {
        setAssociationId(associationId);
        return this;
    }

    /**
     * <p>
     * The execution ID for which you want to view details.
     * </p>
     * 
     * @param executionId
     *        The execution ID for which you want to view details.
     */

    public void setExecutionId(String executionId) {
        this.executionId = executionId;
    }

    /**
     * <p>
     * The execution ID for which you want to view details.
     * </p>
     * 
     * @return The execution ID for which you want to view details.
     */

    public String getExecutionId() {
        return this.executionId;
    }

    /**
     * <p>
     * The execution ID for which you want to view details.
     * </p>
     * 
     * @param executionId
     *        The execution ID for which you want to view details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAssociationExecutionTargetsRequest withExecutionId(String executionId) {
        setExecutionId(executionId);
        return this;
    }

    /**
     * <p>
     * Filters for the request. You can specify the following filters and values.
     * </p>
     * <p>
     * Status (EQUAL)
     * </p>
     * <p>
     * ResourceId (EQUAL)
     * </p>
     * <p>
     * ResourceType (EQUAL)
     * </p>
     * 
     * @return Filters for the request. You can specify the following filters and values.</p>
     *         <p>
     *         Status (EQUAL)
     *         </p>
     *         <p>
     *         ResourceId (EQUAL)
     *         </p>
     *         <p>
     *         ResourceType (EQUAL)
     */

    public java.util.List<AssociationExecutionTargetsFilter> getFilters() {
        if (filters == null) {
            filters = new com.amazonaws.internal.SdkInternalList<AssociationExecutionTargetsFilter>();
        }
        return filters;
    }

    /**
     * <p>
     * Filters for the request. You can specify the following filters and values.
     * </p>
     * <p>
     * Status (EQUAL)
     * </p>
     * <p>
     * ResourceId (EQUAL)
     * </p>
     * <p>
     * ResourceType (EQUAL)
     * </p>
     * 
     * @param filters
     *        Filters for the request. You can specify the following filters and values.</p>
     *        <p>
     *        Status (EQUAL)
     *        </p>
     *        <p>
     *        ResourceId (EQUAL)
     *        </p>
     *        <p>
     *        ResourceType (EQUAL)
     */

    public void setFilters(java.util.Collection<AssociationExecutionTargetsFilter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new com.amazonaws.internal.SdkInternalList<AssociationExecutionTargetsFilter>(filters);
    }

    /**
     * <p>
     * Filters for the request. You can specify the following filters and values.
     * </p>
     * <p>
     * Status (EQUAL)
     * </p>
     * <p>
     * ResourceId (EQUAL)
     * </p>
     * <p>
     * ResourceType (EQUAL)
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        Filters for the request. You can specify the following filters and values.</p>
     *        <p>
     *        Status (EQUAL)
     *        </p>
     *        <p>
     *        ResourceId (EQUAL)
     *        </p>
     *        <p>
     *        ResourceType (EQUAL)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAssociationExecutionTargetsRequest withFilters(AssociationExecutionTargetsFilter... filters) {
        if (this.filters == null) {
            setFilters(new com.amazonaws.internal.SdkInternalList<AssociationExecutionTargetsFilter>(filters.length));
        }
        for (AssociationExecutionTargetsFilter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Filters for the request. You can specify the following filters and values.
     * </p>
     * <p>
     * Status (EQUAL)
     * </p>
     * <p>
     * ResourceId (EQUAL)
     * </p>
     * <p>
     * ResourceType (EQUAL)
     * </p>
     * 
     * @param filters
     *        Filters for the request. You can specify the following filters and values.</p>
     *        <p>
     *        Status (EQUAL)
     *        </p>
     *        <p>
     *        ResourceId (EQUAL)
     *        </p>
     *        <p>
     *        ResourceType (EQUAL)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAssociationExecutionTargetsRequest withFilters(java.util.Collection<AssociationExecutionTargetsFilter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The maximum number of items to return for this call. The call also returns a token that you can specify in a
     * subsequent call to get the next set of results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of items to return for this call. The call also returns a token that you can specify in
     *        a subsequent call to get the next set of results.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of items to return for this call. The call also returns a token that you can specify in a
     * subsequent call to get the next set of results.
     * </p>
     * 
     * @return The maximum number of items to return for this call. The call also returns a token that you can specify
     *         in a subsequent call to get the next set of results.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of items to return for this call. The call also returns a token that you can specify in a
     * subsequent call to get the next set of results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of items to return for this call. The call also returns a token that you can specify in
     *        a subsequent call to get the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAssociationExecutionTargetsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * A token to start the list. Use this token to get the next set of results.
     * </p>
     * 
     * @param nextToken
     *        A token to start the list. Use this token to get the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token to start the list. Use this token to get the next set of results.
     * </p>
     * 
     * @return A token to start the list. Use this token to get the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token to start the list. Use this token to get the next set of results.
     * </p>
     * 
     * @param nextToken
     *        A token to start the list. Use this token to get the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAssociationExecutionTargetsRequest withNextToken(String nextToken) {
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
        if (getAssociationId() != null)
            sb.append("AssociationId: ").append(getAssociationId()).append(",");
        if (getExecutionId() != null)
            sb.append("ExecutionId: ").append(getExecutionId()).append(",");
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
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

        if (obj instanceof DescribeAssociationExecutionTargetsRequest == false)
            return false;
        DescribeAssociationExecutionTargetsRequest other = (DescribeAssociationExecutionTargetsRequest) obj;
        if (other.getAssociationId() == null ^ this.getAssociationId() == null)
            return false;
        if (other.getAssociationId() != null && other.getAssociationId().equals(this.getAssociationId()) == false)
            return false;
        if (other.getExecutionId() == null ^ this.getExecutionId() == null)
            return false;
        if (other.getExecutionId() != null && other.getExecutionId().equals(this.getExecutionId()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
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

        hashCode = prime * hashCode + ((getAssociationId() == null) ? 0 : getAssociationId().hashCode());
        hashCode = prime * hashCode + ((getExecutionId() == null) ? 0 : getExecutionId().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeAssociationExecutionTargetsRequest clone() {
        return (DescribeAssociationExecutionTargetsRequest) super.clone();
    }

}
