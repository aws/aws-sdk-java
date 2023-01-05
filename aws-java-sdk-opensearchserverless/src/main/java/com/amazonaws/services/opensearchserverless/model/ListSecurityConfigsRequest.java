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
package com.amazonaws.services.opensearchserverless.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/ListSecurityConfigs"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListSecurityConfigsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * An optional parameter that specifies the maximum number of results to return. You can use <code>nextToken</code>
     * to get the next page of results. The default is 20.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * If your initial <code>ListSecurityConfigs</code> operation returns a <code>nextToken</code>, you can include the
     * returned <code>nextToken</code> in subsequent <code>ListSecurityConfigs</code> operations, which returns results
     * in the next page.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The type of security configuration.
     * </p>
     */
    private String type;

    /**
     * <p>
     * An optional parameter that specifies the maximum number of results to return. You can use <code>nextToken</code>
     * to get the next page of results. The default is 20.
     * </p>
     * 
     * @param maxResults
     *        An optional parameter that specifies the maximum number of results to return. You can use
     *        <code>nextToken</code> to get the next page of results. The default is 20.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * An optional parameter that specifies the maximum number of results to return. You can use <code>nextToken</code>
     * to get the next page of results. The default is 20.
     * </p>
     * 
     * @return An optional parameter that specifies the maximum number of results to return. You can use
     *         <code>nextToken</code> to get the next page of results. The default is 20.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * An optional parameter that specifies the maximum number of results to return. You can use <code>nextToken</code>
     * to get the next page of results. The default is 20.
     * </p>
     * 
     * @param maxResults
     *        An optional parameter that specifies the maximum number of results to return. You can use
     *        <code>nextToken</code> to get the next page of results. The default is 20.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSecurityConfigsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * If your initial <code>ListSecurityConfigs</code> operation returns a <code>nextToken</code>, you can include the
     * returned <code>nextToken</code> in subsequent <code>ListSecurityConfigs</code> operations, which returns results
     * in the next page.
     * </p>
     * 
     * @param nextToken
     *        If your initial <code>ListSecurityConfigs</code> operation returns a <code>nextToken</code>, you can
     *        include the returned <code>nextToken</code> in subsequent <code>ListSecurityConfigs</code> operations,
     *        which returns results in the next page.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If your initial <code>ListSecurityConfigs</code> operation returns a <code>nextToken</code>, you can include the
     * returned <code>nextToken</code> in subsequent <code>ListSecurityConfigs</code> operations, which returns results
     * in the next page.
     * </p>
     * 
     * @return If your initial <code>ListSecurityConfigs</code> operation returns a <code>nextToken</code>, you can
     *         include the returned <code>nextToken</code> in subsequent <code>ListSecurityConfigs</code> operations,
     *         which returns results in the next page.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If your initial <code>ListSecurityConfigs</code> operation returns a <code>nextToken</code>, you can include the
     * returned <code>nextToken</code> in subsequent <code>ListSecurityConfigs</code> operations, which returns results
     * in the next page.
     * </p>
     * 
     * @param nextToken
     *        If your initial <code>ListSecurityConfigs</code> operation returns a <code>nextToken</code>, you can
     *        include the returned <code>nextToken</code> in subsequent <code>ListSecurityConfigs</code> operations,
     *        which returns results in the next page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSecurityConfigsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The type of security configuration.
     * </p>
     * 
     * @param type
     *        The type of security configuration.
     * @see SecurityConfigType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of security configuration.
     * </p>
     * 
     * @return The type of security configuration.
     * @see SecurityConfigType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of security configuration.
     * </p>
     * 
     * @param type
     *        The type of security configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SecurityConfigType
     */

    public ListSecurityConfigsRequest withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of security configuration.
     * </p>
     * 
     * @param type
     *        The type of security configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SecurityConfigType
     */

    public ListSecurityConfigsRequest withType(SecurityConfigType type) {
        this.type = type.toString();
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
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListSecurityConfigsRequest == false)
            return false;
        ListSecurityConfigsRequest other = (ListSecurityConfigsRequest) obj;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public ListSecurityConfigsRequest clone() {
        return (ListSecurityConfigsRequest) super.clone();
    }

}
