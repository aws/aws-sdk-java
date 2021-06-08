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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/ListSchemas" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListSchemasRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A wrapper structure that may contain the registry name and Amazon Resource Name (ARN).
     * </p>
     */
    private RegistryId registryId;
    /**
     * <p>
     * Maximum number of results required per page. If the value is not supplied, this will be defaulted to 25 per page.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * A continuation token, if this is a continuation call.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A wrapper structure that may contain the registry name and Amazon Resource Name (ARN).
     * </p>
     * 
     * @param registryId
     *        A wrapper structure that may contain the registry name and Amazon Resource Name (ARN).
     */

    public void setRegistryId(RegistryId registryId) {
        this.registryId = registryId;
    }

    /**
     * <p>
     * A wrapper structure that may contain the registry name and Amazon Resource Name (ARN).
     * </p>
     * 
     * @return A wrapper structure that may contain the registry name and Amazon Resource Name (ARN).
     */

    public RegistryId getRegistryId() {
        return this.registryId;
    }

    /**
     * <p>
     * A wrapper structure that may contain the registry name and Amazon Resource Name (ARN).
     * </p>
     * 
     * @param registryId
     *        A wrapper structure that may contain the registry name and Amazon Resource Name (ARN).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSchemasRequest withRegistryId(RegistryId registryId) {
        setRegistryId(registryId);
        return this;
    }

    /**
     * <p>
     * Maximum number of results required per page. If the value is not supplied, this will be defaulted to 25 per page.
     * </p>
     * 
     * @param maxResults
     *        Maximum number of results required per page. If the value is not supplied, this will be defaulted to 25
     *        per page.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Maximum number of results required per page. If the value is not supplied, this will be defaulted to 25 per page.
     * </p>
     * 
     * @return Maximum number of results required per page. If the value is not supplied, this will be defaulted to 25
     *         per page.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * Maximum number of results required per page. If the value is not supplied, this will be defaulted to 25 per page.
     * </p>
     * 
     * @param maxResults
     *        Maximum number of results required per page. If the value is not supplied, this will be defaulted to 25
     *        per page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSchemasRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * A continuation token, if this is a continuation call.
     * </p>
     * 
     * @param nextToken
     *        A continuation token, if this is a continuation call.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A continuation token, if this is a continuation call.
     * </p>
     * 
     * @return A continuation token, if this is a continuation call.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A continuation token, if this is a continuation call.
     * </p>
     * 
     * @param nextToken
     *        A continuation token, if this is a continuation call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSchemasRequest withNextToken(String nextToken) {
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
        if (getRegistryId() != null)
            sb.append("RegistryId: ").append(getRegistryId()).append(",");
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

        if (obj instanceof ListSchemasRequest == false)
            return false;
        ListSchemasRequest other = (ListSchemasRequest) obj;
        if (other.getRegistryId() == null ^ this.getRegistryId() == null)
            return false;
        if (other.getRegistryId() != null && other.getRegistryId().equals(this.getRegistryId()) == false)
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

        hashCode = prime * hashCode + ((getRegistryId() == null) ? 0 : getRegistryId().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListSchemasRequest clone() {
        return (ListSchemasRequest) super.clone();
    }

}
