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
package com.amazonaws.services.entityresolution.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/ListProviderServices"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListProviderServicesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The maximum number of objects returned per page.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The pagination token from the previous API call.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The name of the provider. This name is typically the company name.
     * </p>
     */
    private String providerName;

    /**
     * <p>
     * The maximum number of objects returned per page.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of objects returned per page.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of objects returned per page.
     * </p>
     * 
     * @return The maximum number of objects returned per page.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of objects returned per page.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of objects returned per page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProviderServicesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The pagination token from the previous API call.
     * </p>
     * 
     * @param nextToken
     *        The pagination token from the previous API call.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token from the previous API call.
     * </p>
     * 
     * @return The pagination token from the previous API call.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token from the previous API call.
     * </p>
     * 
     * @param nextToken
     *        The pagination token from the previous API call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProviderServicesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The name of the provider. This name is typically the company name.
     * </p>
     * 
     * @param providerName
     *        The name of the provider. This name is typically the company name.
     */

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    /**
     * <p>
     * The name of the provider. This name is typically the company name.
     * </p>
     * 
     * @return The name of the provider. This name is typically the company name.
     */

    public String getProviderName() {
        return this.providerName;
    }

    /**
     * <p>
     * The name of the provider. This name is typically the company name.
     * </p>
     * 
     * @param providerName
     *        The name of the provider. This name is typically the company name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProviderServicesRequest withProviderName(String providerName) {
        setProviderName(providerName);
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
        if (getProviderName() != null)
            sb.append("ProviderName: ").append(getProviderName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListProviderServicesRequest == false)
            return false;
        ListProviderServicesRequest other = (ListProviderServicesRequest) obj;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getProviderName() == null ^ this.getProviderName() == null)
            return false;
        if (other.getProviderName() != null && other.getProviderName().equals(this.getProviderName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getProviderName() == null) ? 0 : getProviderName().hashCode());
        return hashCode;
    }

    @Override
    public ListProviderServicesRequest clone() {
        return (ListProviderServicesRequest) super.clone();
    }

}
