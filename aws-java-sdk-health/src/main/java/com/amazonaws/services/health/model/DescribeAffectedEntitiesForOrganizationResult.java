/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.health.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/health-2016-08-04/DescribeAffectedEntitiesForOrganization"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAffectedEntitiesForOrganizationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements
        Serializable, Cloneable {

    /**
     * <p>
     * A JSON set of elements including the <code>awsAccountId</code> and its <code>entityArn</code>,
     * <code>entityValue</code> and its <code>entityArn</code>, <code>lastUpdatedTime</code>, <code>statusCode</code>,
     * and <code>tags</code>.
     * </p>
     */
    private java.util.List<AffectedEntity> entities;
    /**
     * <p>
     * A JSON set of elements of the failed response, including the <code>awsAccountId</code>, <code>errorMessage</code>, <code>errorName</code>, and <code>eventArn</code>.
     * </p>
     */
    private java.util.List<OrganizationAffectedEntitiesErrorItem> failedSet;
    /**
     * <p>
     * If the results of a search are large, only a portion of the results are returned, and a <code>nextToken</code>
     * pagination token is returned in the response. To retrieve the next batch of results, reissue the search request
     * and include the returned token. When all results have been returned, the response does not contain a pagination
     * token value.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A JSON set of elements including the <code>awsAccountId</code> and its <code>entityArn</code>,
     * <code>entityValue</code> and its <code>entityArn</code>, <code>lastUpdatedTime</code>, <code>statusCode</code>,
     * and <code>tags</code>.
     * </p>
     * 
     * @return A JSON set of elements including the <code>awsAccountId</code> and its <code>entityArn</code>,
     *         <code>entityValue</code> and its <code>entityArn</code>, <code>lastUpdatedTime</code>,
     *         <code>statusCode</code>, and <code>tags</code>.
     */

    public java.util.List<AffectedEntity> getEntities() {
        return entities;
    }

    /**
     * <p>
     * A JSON set of elements including the <code>awsAccountId</code> and its <code>entityArn</code>,
     * <code>entityValue</code> and its <code>entityArn</code>, <code>lastUpdatedTime</code>, <code>statusCode</code>,
     * and <code>tags</code>.
     * </p>
     * 
     * @param entities
     *        A JSON set of elements including the <code>awsAccountId</code> and its <code>entityArn</code>,
     *        <code>entityValue</code> and its <code>entityArn</code>, <code>lastUpdatedTime</code>,
     *        <code>statusCode</code>, and <code>tags</code>.
     */

    public void setEntities(java.util.Collection<AffectedEntity> entities) {
        if (entities == null) {
            this.entities = null;
            return;
        }

        this.entities = new java.util.ArrayList<AffectedEntity>(entities);
    }

    /**
     * <p>
     * A JSON set of elements including the <code>awsAccountId</code> and its <code>entityArn</code>,
     * <code>entityValue</code> and its <code>entityArn</code>, <code>lastUpdatedTime</code>, <code>statusCode</code>,
     * and <code>tags</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEntities(java.util.Collection)} or {@link #withEntities(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param entities
     *        A JSON set of elements including the <code>awsAccountId</code> and its <code>entityArn</code>,
     *        <code>entityValue</code> and its <code>entityArn</code>, <code>lastUpdatedTime</code>,
     *        <code>statusCode</code>, and <code>tags</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAffectedEntitiesForOrganizationResult withEntities(AffectedEntity... entities) {
        if (this.entities == null) {
            setEntities(new java.util.ArrayList<AffectedEntity>(entities.length));
        }
        for (AffectedEntity ele : entities) {
            this.entities.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A JSON set of elements including the <code>awsAccountId</code> and its <code>entityArn</code>,
     * <code>entityValue</code> and its <code>entityArn</code>, <code>lastUpdatedTime</code>, <code>statusCode</code>,
     * and <code>tags</code>.
     * </p>
     * 
     * @param entities
     *        A JSON set of elements including the <code>awsAccountId</code> and its <code>entityArn</code>,
     *        <code>entityValue</code> and its <code>entityArn</code>, <code>lastUpdatedTime</code>,
     *        <code>statusCode</code>, and <code>tags</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAffectedEntitiesForOrganizationResult withEntities(java.util.Collection<AffectedEntity> entities) {
        setEntities(entities);
        return this;
    }

    /**
     * <p>
     * A JSON set of elements of the failed response, including the <code>awsAccountId</code>, <code>errorMessage</code>, <code>errorName</code>, and <code>eventArn</code>.
     * </p>
     * 
     * @return A JSON set of elements of the failed response, including the <code>awsAccountId</code>,
     *         <code>errorMessage</code>, <code>errorName</code>, and <code>eventArn</code>.
     */

    public java.util.List<OrganizationAffectedEntitiesErrorItem> getFailedSet() {
        return failedSet;
    }

    /**
     * <p>
     * A JSON set of elements of the failed response, including the <code>awsAccountId</code>, <code>errorMessage</code>, <code>errorName</code>, and <code>eventArn</code>.
     * </p>
     * 
     * @param failedSet
     *        A JSON set of elements of the failed response, including the <code>awsAccountId</code>,
     *        <code>errorMessage</code>, <code>errorName</code>, and <code>eventArn</code>.
     */

    public void setFailedSet(java.util.Collection<OrganizationAffectedEntitiesErrorItem> failedSet) {
        if (failedSet == null) {
            this.failedSet = null;
            return;
        }

        this.failedSet = new java.util.ArrayList<OrganizationAffectedEntitiesErrorItem>(failedSet);
    }

    /**
     * <p>
     * A JSON set of elements of the failed response, including the <code>awsAccountId</code>, <code>errorMessage</code>, <code>errorName</code>, and <code>eventArn</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFailedSet(java.util.Collection)} or {@link #withFailedSet(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param failedSet
     *        A JSON set of elements of the failed response, including the <code>awsAccountId</code>,
     *        <code>errorMessage</code>, <code>errorName</code>, and <code>eventArn</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAffectedEntitiesForOrganizationResult withFailedSet(OrganizationAffectedEntitiesErrorItem... failedSet) {
        if (this.failedSet == null) {
            setFailedSet(new java.util.ArrayList<OrganizationAffectedEntitiesErrorItem>(failedSet.length));
        }
        for (OrganizationAffectedEntitiesErrorItem ele : failedSet) {
            this.failedSet.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A JSON set of elements of the failed response, including the <code>awsAccountId</code>, <code>errorMessage</code>, <code>errorName</code>, and <code>eventArn</code>.
     * </p>
     * 
     * @param failedSet
     *        A JSON set of elements of the failed response, including the <code>awsAccountId</code>,
     *        <code>errorMessage</code>, <code>errorName</code>, and <code>eventArn</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAffectedEntitiesForOrganizationResult withFailedSet(java.util.Collection<OrganizationAffectedEntitiesErrorItem> failedSet) {
        setFailedSet(failedSet);
        return this;
    }

    /**
     * <p>
     * If the results of a search are large, only a portion of the results are returned, and a <code>nextToken</code>
     * pagination token is returned in the response. To retrieve the next batch of results, reissue the search request
     * and include the returned token. When all results have been returned, the response does not contain a pagination
     * token value.
     * </p>
     * 
     * @param nextToken
     *        If the results of a search are large, only a portion of the results are returned, and a
     *        <code>nextToken</code> pagination token is returned in the response. To retrieve the next batch of
     *        results, reissue the search request and include the returned token. When all results have been returned,
     *        the response does not contain a pagination token value.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the results of a search are large, only a portion of the results are returned, and a <code>nextToken</code>
     * pagination token is returned in the response. To retrieve the next batch of results, reissue the search request
     * and include the returned token. When all results have been returned, the response does not contain a pagination
     * token value.
     * </p>
     * 
     * @return If the results of a search are large, only a portion of the results are returned, and a
     *         <code>nextToken</code> pagination token is returned in the response. To retrieve the next batch of
     *         results, reissue the search request and include the returned token. When all results have been returned,
     *         the response does not contain a pagination token value.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the results of a search are large, only a portion of the results are returned, and a <code>nextToken</code>
     * pagination token is returned in the response. To retrieve the next batch of results, reissue the search request
     * and include the returned token. When all results have been returned, the response does not contain a pagination
     * token value.
     * </p>
     * 
     * @param nextToken
     *        If the results of a search are large, only a portion of the results are returned, and a
     *        <code>nextToken</code> pagination token is returned in the response. To retrieve the next batch of
     *        results, reissue the search request and include the returned token. When all results have been returned,
     *        the response does not contain a pagination token value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAffectedEntitiesForOrganizationResult withNextToken(String nextToken) {
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
        if (getEntities() != null)
            sb.append("Entities: ").append(getEntities()).append(",");
        if (getFailedSet() != null)
            sb.append("FailedSet: ").append(getFailedSet()).append(",");
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

        if (obj instanceof DescribeAffectedEntitiesForOrganizationResult == false)
            return false;
        DescribeAffectedEntitiesForOrganizationResult other = (DescribeAffectedEntitiesForOrganizationResult) obj;
        if (other.getEntities() == null ^ this.getEntities() == null)
            return false;
        if (other.getEntities() != null && other.getEntities().equals(this.getEntities()) == false)
            return false;
        if (other.getFailedSet() == null ^ this.getFailedSet() == null)
            return false;
        if (other.getFailedSet() != null && other.getFailedSet().equals(this.getFailedSet()) == false)
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

        hashCode = prime * hashCode + ((getEntities() == null) ? 0 : getEntities().hashCode());
        hashCode = prime * hashCode + ((getFailedSet() == null) ? 0 : getFailedSet().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeAffectedEntitiesForOrganizationResult clone() {
        try {
            return (DescribeAffectedEntitiesForOrganizationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
