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
package com.amazonaws.services.gamesparks.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/ListExtensionVersions" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListExtensionVersionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The maximum number of results to return.
     * </p>
     * <p>
     * Use this parameter with NextToken to get results as a set of sequential pages.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The name of the extension.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The namespace (qualifier) of the extension.
     * </p>
     */
    private String namespace;
    /**
     * <p>
     * The token that indicates the start of the next sequential page of results.
     * </p>
     * <p>
     * Use the token that is returned with a previous call to this operation. To start at the beginning of the result
     * set, do not specify a value.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The maximum number of results to return.
     * </p>
     * <p>
     * Use this parameter with NextToken to get results as a set of sequential pages.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return.</p>
     *        <p>
     *        Use this parameter with NextToken to get results as a set of sequential pages.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return.
     * </p>
     * <p>
     * Use this parameter with NextToken to get results as a set of sequential pages.
     * </p>
     * 
     * @return The maximum number of results to return.</p>
     *         <p>
     *         Use this parameter with NextToken to get results as a set of sequential pages.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return.
     * </p>
     * <p>
     * Use this parameter with NextToken to get results as a set of sequential pages.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return.</p>
     *        <p>
     *        Use this parameter with NextToken to get results as a set of sequential pages.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListExtensionVersionsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The name of the extension.
     * </p>
     * 
     * @param name
     *        The name of the extension.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the extension.
     * </p>
     * 
     * @return The name of the extension.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the extension.
     * </p>
     * 
     * @param name
     *        The name of the extension.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListExtensionVersionsRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The namespace (qualifier) of the extension.
     * </p>
     * 
     * @param namespace
     *        The namespace (qualifier) of the extension.
     */

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    /**
     * <p>
     * The namespace (qualifier) of the extension.
     * </p>
     * 
     * @return The namespace (qualifier) of the extension.
     */

    public String getNamespace() {
        return this.namespace;
    }

    /**
     * <p>
     * The namespace (qualifier) of the extension.
     * </p>
     * 
     * @param namespace
     *        The namespace (qualifier) of the extension.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListExtensionVersionsRequest withNamespace(String namespace) {
        setNamespace(namespace);
        return this;
    }

    /**
     * <p>
     * The token that indicates the start of the next sequential page of results.
     * </p>
     * <p>
     * Use the token that is returned with a previous call to this operation. To start at the beginning of the result
     * set, do not specify a value.
     * </p>
     * 
     * @param nextToken
     *        The token that indicates the start of the next sequential page of results.</p>
     *        <p>
     *        Use the token that is returned with a previous call to this operation. To start at the beginning of the
     *        result set, do not specify a value.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token that indicates the start of the next sequential page of results.
     * </p>
     * <p>
     * Use the token that is returned with a previous call to this operation. To start at the beginning of the result
     * set, do not specify a value.
     * </p>
     * 
     * @return The token that indicates the start of the next sequential page of results.</p>
     *         <p>
     *         Use the token that is returned with a previous call to this operation. To start at the beginning of the
     *         result set, do not specify a value.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token that indicates the start of the next sequential page of results.
     * </p>
     * <p>
     * Use the token that is returned with a previous call to this operation. To start at the beginning of the result
     * set, do not specify a value.
     * </p>
     * 
     * @param nextToken
     *        The token that indicates the start of the next sequential page of results.</p>
     *        <p>
     *        Use the token that is returned with a previous call to this operation. To start at the beginning of the
     *        result set, do not specify a value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListExtensionVersionsRequest withNextToken(String nextToken) {
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
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getNamespace() != null)
            sb.append("Namespace: ").append(getNamespace()).append(",");
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

        if (obj instanceof ListExtensionVersionsRequest == false)
            return false;
        ListExtensionVersionsRequest other = (ListExtensionVersionsRequest) obj;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getNamespace() == null ^ this.getNamespace() == null)
            return false;
        if (other.getNamespace() != null && other.getNamespace().equals(this.getNamespace()) == false)
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

        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getNamespace() == null) ? 0 : getNamespace().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListExtensionVersionsRequest clone() {
        return (ListExtensionVersionsRequest) super.clone();
    }

}
