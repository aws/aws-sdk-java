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
package com.amazonaws.services.devopsguru.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/DescribeOrganizationResourceCollectionHealth"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeOrganizationResourceCollectionHealthRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * An Amazon Web Services resource collection type. This type specifies how analyzed Amazon Web Services resources
     * are defined. The two types of Amazon Web Services resource collections supported are Amazon Web Services
     * CloudFormation stacks and Amazon Web Services resources that contain the same Amazon Web Services tag. DevOps
     * Guru can be configured to analyze the Amazon Web Services resources that are defined in the stacks or that are
     * tagged using the same tag <i>key</i>. You can specify up to 500 Amazon Web Services CloudFormation stacks.
     * </p>
     */
    private String organizationResourceCollectionType;
    /**
     * <p>
     * The ID of the Amazon Web Services account.
     * </p>
     */
    private java.util.List<String> accountIds;
    /**
     * <p>
     * The ID of the organizational unit.
     * </p>
     */
    private java.util.List<String> organizationalUnitIds;
    /**
     * <p>
     * The pagination token to use to retrieve the next page of results for this operation. If this value is null, it
     * retrieves the first page.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of results to return with a single call. To retrieve the remaining results, make another call
     * with the returned <code>nextToken</code> value.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * An Amazon Web Services resource collection type. This type specifies how analyzed Amazon Web Services resources
     * are defined. The two types of Amazon Web Services resource collections supported are Amazon Web Services
     * CloudFormation stacks and Amazon Web Services resources that contain the same Amazon Web Services tag. DevOps
     * Guru can be configured to analyze the Amazon Web Services resources that are defined in the stacks or that are
     * tagged using the same tag <i>key</i>. You can specify up to 500 Amazon Web Services CloudFormation stacks.
     * </p>
     * 
     * @param organizationResourceCollectionType
     *        An Amazon Web Services resource collection type. This type specifies how analyzed Amazon Web Services
     *        resources are defined. The two types of Amazon Web Services resource collections supported are Amazon Web
     *        Services CloudFormation stacks and Amazon Web Services resources that contain the same Amazon Web Services
     *        tag. DevOps Guru can be configured to analyze the Amazon Web Services resources that are defined in the
     *        stacks or that are tagged using the same tag <i>key</i>. You can specify up to 500 Amazon Web Services
     *        CloudFormation stacks.
     * @see OrganizationResourceCollectionType
     */

    public void setOrganizationResourceCollectionType(String organizationResourceCollectionType) {
        this.organizationResourceCollectionType = organizationResourceCollectionType;
    }

    /**
     * <p>
     * An Amazon Web Services resource collection type. This type specifies how analyzed Amazon Web Services resources
     * are defined. The two types of Amazon Web Services resource collections supported are Amazon Web Services
     * CloudFormation stacks and Amazon Web Services resources that contain the same Amazon Web Services tag. DevOps
     * Guru can be configured to analyze the Amazon Web Services resources that are defined in the stacks or that are
     * tagged using the same tag <i>key</i>. You can specify up to 500 Amazon Web Services CloudFormation stacks.
     * </p>
     * 
     * @return An Amazon Web Services resource collection type. This type specifies how analyzed Amazon Web Services
     *         resources are defined. The two types of Amazon Web Services resource collections supported are Amazon Web
     *         Services CloudFormation stacks and Amazon Web Services resources that contain the same Amazon Web
     *         Services tag. DevOps Guru can be configured to analyze the Amazon Web Services resources that are defined
     *         in the stacks or that are tagged using the same tag <i>key</i>. You can specify up to 500 Amazon Web
     *         Services CloudFormation stacks.
     * @see OrganizationResourceCollectionType
     */

    public String getOrganizationResourceCollectionType() {
        return this.organizationResourceCollectionType;
    }

    /**
     * <p>
     * An Amazon Web Services resource collection type. This type specifies how analyzed Amazon Web Services resources
     * are defined. The two types of Amazon Web Services resource collections supported are Amazon Web Services
     * CloudFormation stacks and Amazon Web Services resources that contain the same Amazon Web Services tag. DevOps
     * Guru can be configured to analyze the Amazon Web Services resources that are defined in the stacks or that are
     * tagged using the same tag <i>key</i>. You can specify up to 500 Amazon Web Services CloudFormation stacks.
     * </p>
     * 
     * @param organizationResourceCollectionType
     *        An Amazon Web Services resource collection type. This type specifies how analyzed Amazon Web Services
     *        resources are defined. The two types of Amazon Web Services resource collections supported are Amazon Web
     *        Services CloudFormation stacks and Amazon Web Services resources that contain the same Amazon Web Services
     *        tag. DevOps Guru can be configured to analyze the Amazon Web Services resources that are defined in the
     *        stacks or that are tagged using the same tag <i>key</i>. You can specify up to 500 Amazon Web Services
     *        CloudFormation stacks.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OrganizationResourceCollectionType
     */

    public DescribeOrganizationResourceCollectionHealthRequest withOrganizationResourceCollectionType(String organizationResourceCollectionType) {
        setOrganizationResourceCollectionType(organizationResourceCollectionType);
        return this;
    }

    /**
     * <p>
     * An Amazon Web Services resource collection type. This type specifies how analyzed Amazon Web Services resources
     * are defined. The two types of Amazon Web Services resource collections supported are Amazon Web Services
     * CloudFormation stacks and Amazon Web Services resources that contain the same Amazon Web Services tag. DevOps
     * Guru can be configured to analyze the Amazon Web Services resources that are defined in the stacks or that are
     * tagged using the same tag <i>key</i>. You can specify up to 500 Amazon Web Services CloudFormation stacks.
     * </p>
     * 
     * @param organizationResourceCollectionType
     *        An Amazon Web Services resource collection type. This type specifies how analyzed Amazon Web Services
     *        resources are defined. The two types of Amazon Web Services resource collections supported are Amazon Web
     *        Services CloudFormation stacks and Amazon Web Services resources that contain the same Amazon Web Services
     *        tag. DevOps Guru can be configured to analyze the Amazon Web Services resources that are defined in the
     *        stacks or that are tagged using the same tag <i>key</i>. You can specify up to 500 Amazon Web Services
     *        CloudFormation stacks.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OrganizationResourceCollectionType
     */

    public DescribeOrganizationResourceCollectionHealthRequest withOrganizationResourceCollectionType(
            OrganizationResourceCollectionType organizationResourceCollectionType) {
        this.organizationResourceCollectionType = organizationResourceCollectionType.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services account.
     * </p>
     * 
     * @return The ID of the Amazon Web Services account.
     */

    public java.util.List<String> getAccountIds() {
        return accountIds;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services account.
     * </p>
     * 
     * @param accountIds
     *        The ID of the Amazon Web Services account.
     */

    public void setAccountIds(java.util.Collection<String> accountIds) {
        if (accountIds == null) {
            this.accountIds = null;
            return;
        }

        this.accountIds = new java.util.ArrayList<String>(accountIds);
    }

    /**
     * <p>
     * The ID of the Amazon Web Services account.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAccountIds(java.util.Collection)} or {@link #withAccountIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param accountIds
     *        The ID of the Amazon Web Services account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeOrganizationResourceCollectionHealthRequest withAccountIds(String... accountIds) {
        if (this.accountIds == null) {
            setAccountIds(new java.util.ArrayList<String>(accountIds.length));
        }
        for (String ele : accountIds) {
            this.accountIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services account.
     * </p>
     * 
     * @param accountIds
     *        The ID of the Amazon Web Services account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeOrganizationResourceCollectionHealthRequest withAccountIds(java.util.Collection<String> accountIds) {
        setAccountIds(accountIds);
        return this;
    }

    /**
     * <p>
     * The ID of the organizational unit.
     * </p>
     * 
     * @return The ID of the organizational unit.
     */

    public java.util.List<String> getOrganizationalUnitIds() {
        return organizationalUnitIds;
    }

    /**
     * <p>
     * The ID of the organizational unit.
     * </p>
     * 
     * @param organizationalUnitIds
     *        The ID of the organizational unit.
     */

    public void setOrganizationalUnitIds(java.util.Collection<String> organizationalUnitIds) {
        if (organizationalUnitIds == null) {
            this.organizationalUnitIds = null;
            return;
        }

        this.organizationalUnitIds = new java.util.ArrayList<String>(organizationalUnitIds);
    }

    /**
     * <p>
     * The ID of the organizational unit.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOrganizationalUnitIds(java.util.Collection)} or
     * {@link #withOrganizationalUnitIds(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param organizationalUnitIds
     *        The ID of the organizational unit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeOrganizationResourceCollectionHealthRequest withOrganizationalUnitIds(String... organizationalUnitIds) {
        if (this.organizationalUnitIds == null) {
            setOrganizationalUnitIds(new java.util.ArrayList<String>(organizationalUnitIds.length));
        }
        for (String ele : organizationalUnitIds) {
            this.organizationalUnitIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The ID of the organizational unit.
     * </p>
     * 
     * @param organizationalUnitIds
     *        The ID of the organizational unit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeOrganizationResourceCollectionHealthRequest withOrganizationalUnitIds(java.util.Collection<String> organizationalUnitIds) {
        setOrganizationalUnitIds(organizationalUnitIds);
        return this;
    }

    /**
     * <p>
     * The pagination token to use to retrieve the next page of results for this operation. If this value is null, it
     * retrieves the first page.
     * </p>
     * 
     * @param nextToken
     *        The pagination token to use to retrieve the next page of results for this operation. If this value is
     *        null, it retrieves the first page.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token to use to retrieve the next page of results for this operation. If this value is null, it
     * retrieves the first page.
     * </p>
     * 
     * @return The pagination token to use to retrieve the next page of results for this operation. If this value is
     *         null, it retrieves the first page.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token to use to retrieve the next page of results for this operation. If this value is null, it
     * retrieves the first page.
     * </p>
     * 
     * @param nextToken
     *        The pagination token to use to retrieve the next page of results for this operation. If this value is
     *        null, it retrieves the first page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeOrganizationResourceCollectionHealthRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return with a single call. To retrieve the remaining results, make another call
     * with the returned <code>nextToken</code> value.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return with a single call. To retrieve the remaining results, make
     *        another call with the returned <code>nextToken</code> value.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return with a single call. To retrieve the remaining results, make another call
     * with the returned <code>nextToken</code> value.
     * </p>
     * 
     * @return The maximum number of results to return with a single call. To retrieve the remaining results, make
     *         another call with the returned <code>nextToken</code> value.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return with a single call. To retrieve the remaining results, make another call
     * with the returned <code>nextToken</code> value.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return with a single call. To retrieve the remaining results, make
     *        another call with the returned <code>nextToken</code> value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeOrganizationResourceCollectionHealthRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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
        if (getOrganizationResourceCollectionType() != null)
            sb.append("OrganizationResourceCollectionType: ").append(getOrganizationResourceCollectionType()).append(",");
        if (getAccountIds() != null)
            sb.append("AccountIds: ").append(getAccountIds()).append(",");
        if (getOrganizationalUnitIds() != null)
            sb.append("OrganizationalUnitIds: ").append(getOrganizationalUnitIds()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeOrganizationResourceCollectionHealthRequest == false)
            return false;
        DescribeOrganizationResourceCollectionHealthRequest other = (DescribeOrganizationResourceCollectionHealthRequest) obj;
        if (other.getOrganizationResourceCollectionType() == null ^ this.getOrganizationResourceCollectionType() == null)
            return false;
        if (other.getOrganizationResourceCollectionType() != null
                && other.getOrganizationResourceCollectionType().equals(this.getOrganizationResourceCollectionType()) == false)
            return false;
        if (other.getAccountIds() == null ^ this.getAccountIds() == null)
            return false;
        if (other.getAccountIds() != null && other.getAccountIds().equals(this.getAccountIds()) == false)
            return false;
        if (other.getOrganizationalUnitIds() == null ^ this.getOrganizationalUnitIds() == null)
            return false;
        if (other.getOrganizationalUnitIds() != null && other.getOrganizationalUnitIds().equals(this.getOrganizationalUnitIds()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOrganizationResourceCollectionType() == null) ? 0 : getOrganizationResourceCollectionType().hashCode());
        hashCode = prime * hashCode + ((getAccountIds() == null) ? 0 : getAccountIds().hashCode());
        hashCode = prime * hashCode + ((getOrganizationalUnitIds() == null) ? 0 : getOrganizationalUnitIds().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public DescribeOrganizationResourceCollectionHealthRequest clone() {
        return (DescribeOrganizationResourceCollectionHealthRequest) super.clone();
    }

}
