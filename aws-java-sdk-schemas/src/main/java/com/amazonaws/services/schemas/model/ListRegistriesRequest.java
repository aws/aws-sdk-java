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
package com.amazonaws.services.schemas.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/schemas-2019-12-02/ListRegistries" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListRegistriesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private Integer limit;
    /**
     * <p>
     * The token that specifies the next page of results to return. To request the first page, leave NextToken empty.
     * The token will expire in 24 hours, and cannot be shared with other accounts.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Specifying this limits the results to only those registry names that start with the specified prefix.
     * </p>
     */
    private String registryNamePrefix;
    /**
     * <p>
     * Can be set to Local or AWS to limit responses to your custom registries, or the ones provided by AWS.
     * </p>
     */
    private String scope;

    /**
     * @param limit
     */

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * @return
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     * @param limit
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRegistriesRequest withLimit(Integer limit) {
        setLimit(limit);
        return this;
    }

    /**
     * <p>
     * The token that specifies the next page of results to return. To request the first page, leave NextToken empty.
     * The token will expire in 24 hours, and cannot be shared with other accounts.
     * </p>
     * 
     * @param nextToken
     *        The token that specifies the next page of results to return. To request the first page, leave NextToken
     *        empty. The token will expire in 24 hours, and cannot be shared with other accounts.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token that specifies the next page of results to return. To request the first page, leave NextToken empty.
     * The token will expire in 24 hours, and cannot be shared with other accounts.
     * </p>
     * 
     * @return The token that specifies the next page of results to return. To request the first page, leave NextToken
     *         empty. The token will expire in 24 hours, and cannot be shared with other accounts.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token that specifies the next page of results to return. To request the first page, leave NextToken empty.
     * The token will expire in 24 hours, and cannot be shared with other accounts.
     * </p>
     * 
     * @param nextToken
     *        The token that specifies the next page of results to return. To request the first page, leave NextToken
     *        empty. The token will expire in 24 hours, and cannot be shared with other accounts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRegistriesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Specifying this limits the results to only those registry names that start with the specified prefix.
     * </p>
     * 
     * @param registryNamePrefix
     *        Specifying this limits the results to only those registry names that start with the specified prefix.
     */

    public void setRegistryNamePrefix(String registryNamePrefix) {
        this.registryNamePrefix = registryNamePrefix;
    }

    /**
     * <p>
     * Specifying this limits the results to only those registry names that start with the specified prefix.
     * </p>
     * 
     * @return Specifying this limits the results to only those registry names that start with the specified prefix.
     */

    public String getRegistryNamePrefix() {
        return this.registryNamePrefix;
    }

    /**
     * <p>
     * Specifying this limits the results to only those registry names that start with the specified prefix.
     * </p>
     * 
     * @param registryNamePrefix
     *        Specifying this limits the results to only those registry names that start with the specified prefix.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRegistriesRequest withRegistryNamePrefix(String registryNamePrefix) {
        setRegistryNamePrefix(registryNamePrefix);
        return this;
    }

    /**
     * <p>
     * Can be set to Local or AWS to limit responses to your custom registries, or the ones provided by AWS.
     * </p>
     * 
     * @param scope
     *        Can be set to Local or AWS to limit responses to your custom registries, or the ones provided by AWS.
     */

    public void setScope(String scope) {
        this.scope = scope;
    }

    /**
     * <p>
     * Can be set to Local or AWS to limit responses to your custom registries, or the ones provided by AWS.
     * </p>
     * 
     * @return Can be set to Local or AWS to limit responses to your custom registries, or the ones provided by AWS.
     */

    public String getScope() {
        return this.scope;
    }

    /**
     * <p>
     * Can be set to Local or AWS to limit responses to your custom registries, or the ones provided by AWS.
     * </p>
     * 
     * @param scope
     *        Can be set to Local or AWS to limit responses to your custom registries, or the ones provided by AWS.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRegistriesRequest withScope(String scope) {
        setScope(scope);
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
        if (getLimit() != null)
            sb.append("Limit: ").append(getLimit()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getRegistryNamePrefix() != null)
            sb.append("RegistryNamePrefix: ").append(getRegistryNamePrefix()).append(",");
        if (getScope() != null)
            sb.append("Scope: ").append(getScope());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListRegistriesRequest == false)
            return false;
        ListRegistriesRequest other = (ListRegistriesRequest) obj;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getRegistryNamePrefix() == null ^ this.getRegistryNamePrefix() == null)
            return false;
        if (other.getRegistryNamePrefix() != null && other.getRegistryNamePrefix().equals(this.getRegistryNamePrefix()) == false)
            return false;
        if (other.getScope() == null ^ this.getScope() == null)
            return false;
        if (other.getScope() != null && other.getScope().equals(this.getScope()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getRegistryNamePrefix() == null) ? 0 : getRegistryNamePrefix().hashCode());
        hashCode = prime * hashCode + ((getScope() == null) ? 0 : getScope().hashCode());
        return hashCode;
    }

    @Override
    public ListRegistriesRequest clone() {
        return (ListRegistriesRequest) super.clone();
    }

}
