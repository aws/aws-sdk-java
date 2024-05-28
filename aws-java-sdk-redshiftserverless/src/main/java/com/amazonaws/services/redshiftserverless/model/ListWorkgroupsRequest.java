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
package com.amazonaws.services.redshiftserverless.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/ListWorkgroups" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListWorkgroupsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * An optional parameter that specifies the maximum number of results to return. You can use <code>nextToken</code>
     * to display the next page of results.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * If your initial ListWorkgroups operation returns a <code>nextToken</code>, you can include the returned
     * <code>nextToken</code> in following ListNamespaces operations, which returns results in the next page.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The owner Amazon Web Services account for the Amazon Redshift Serverless workgroup.
     * </p>
     */
    private String ownerAccount;

    /**
     * <p>
     * An optional parameter that specifies the maximum number of results to return. You can use <code>nextToken</code>
     * to display the next page of results.
     * </p>
     * 
     * @param maxResults
     *        An optional parameter that specifies the maximum number of results to return. You can use
     *        <code>nextToken</code> to display the next page of results.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * An optional parameter that specifies the maximum number of results to return. You can use <code>nextToken</code>
     * to display the next page of results.
     * </p>
     * 
     * @return An optional parameter that specifies the maximum number of results to return. You can use
     *         <code>nextToken</code> to display the next page of results.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * An optional parameter that specifies the maximum number of results to return. You can use <code>nextToken</code>
     * to display the next page of results.
     * </p>
     * 
     * @param maxResults
     *        An optional parameter that specifies the maximum number of results to return. You can use
     *        <code>nextToken</code> to display the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWorkgroupsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * If your initial ListWorkgroups operation returns a <code>nextToken</code>, you can include the returned
     * <code>nextToken</code> in following ListNamespaces operations, which returns results in the next page.
     * </p>
     * 
     * @param nextToken
     *        If your initial ListWorkgroups operation returns a <code>nextToken</code>, you can include the returned
     *        <code>nextToken</code> in following ListNamespaces operations, which returns results in the next page.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If your initial ListWorkgroups operation returns a <code>nextToken</code>, you can include the returned
     * <code>nextToken</code> in following ListNamespaces operations, which returns results in the next page.
     * </p>
     * 
     * @return If your initial ListWorkgroups operation returns a <code>nextToken</code>, you can include the returned
     *         <code>nextToken</code> in following ListNamespaces operations, which returns results in the next page.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If your initial ListWorkgroups operation returns a <code>nextToken</code>, you can include the returned
     * <code>nextToken</code> in following ListNamespaces operations, which returns results in the next page.
     * </p>
     * 
     * @param nextToken
     *        If your initial ListWorkgroups operation returns a <code>nextToken</code>, you can include the returned
     *        <code>nextToken</code> in following ListNamespaces operations, which returns results in the next page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWorkgroupsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The owner Amazon Web Services account for the Amazon Redshift Serverless workgroup.
     * </p>
     * 
     * @param ownerAccount
     *        The owner Amazon Web Services account for the Amazon Redshift Serverless workgroup.
     */

    public void setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
    }

    /**
     * <p>
     * The owner Amazon Web Services account for the Amazon Redshift Serverless workgroup.
     * </p>
     * 
     * @return The owner Amazon Web Services account for the Amazon Redshift Serverless workgroup.
     */

    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * <p>
     * The owner Amazon Web Services account for the Amazon Redshift Serverless workgroup.
     * </p>
     * 
     * @param ownerAccount
     *        The owner Amazon Web Services account for the Amazon Redshift Serverless workgroup.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWorkgroupsRequest withOwnerAccount(String ownerAccount) {
        setOwnerAccount(ownerAccount);
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
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getOwnerAccount() != null)
            sb.append("OwnerAccount: ").append(getOwnerAccount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListWorkgroupsRequest == false)
            return false;
        ListWorkgroupsRequest other = (ListWorkgroupsRequest) obj;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getOwnerAccount() == null ^ this.getOwnerAccount() == null)
            return false;
        if (other.getOwnerAccount() != null && other.getOwnerAccount().equals(this.getOwnerAccount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getOwnerAccount() == null) ? 0 : getOwnerAccount().hashCode());
        return hashCode;
    }

    @Override
    public ListWorkgroupsRequest clone() {
        return (ListWorkgroupsRequest) super.clone();
    }

}
