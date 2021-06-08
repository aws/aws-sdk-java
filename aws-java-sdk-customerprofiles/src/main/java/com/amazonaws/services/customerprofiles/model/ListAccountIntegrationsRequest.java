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
package com.amazonaws.services.customerprofiles.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/ListAccountIntegrations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAccountIntegrationsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The URI of the S3 bucket or any other type of data source.
     * </p>
     */
    private String uri;
    /**
     * <p>
     * The pagination token from the previous ListAccountIntegrations API call.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of objects returned per page.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The URI of the S3 bucket or any other type of data source.
     * </p>
     * 
     * @param uri
     *        The URI of the S3 bucket or any other type of data source.
     */

    public void setUri(String uri) {
        this.uri = uri;
    }

    /**
     * <p>
     * The URI of the S3 bucket or any other type of data source.
     * </p>
     * 
     * @return The URI of the S3 bucket or any other type of data source.
     */

    public String getUri() {
        return this.uri;
    }

    /**
     * <p>
     * The URI of the S3 bucket or any other type of data source.
     * </p>
     * 
     * @param uri
     *        The URI of the S3 bucket or any other type of data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAccountIntegrationsRequest withUri(String uri) {
        setUri(uri);
        return this;
    }

    /**
     * <p>
     * The pagination token from the previous ListAccountIntegrations API call.
     * </p>
     * 
     * @param nextToken
     *        The pagination token from the previous ListAccountIntegrations API call.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token from the previous ListAccountIntegrations API call.
     * </p>
     * 
     * @return The pagination token from the previous ListAccountIntegrations API call.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token from the previous ListAccountIntegrations API call.
     * </p>
     * 
     * @param nextToken
     *        The pagination token from the previous ListAccountIntegrations API call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAccountIntegrationsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

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

    public ListAccountIntegrationsRequest withMaxResults(Integer maxResults) {
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
        if (getUri() != null)
            sb.append("Uri: ").append(getUri()).append(",");
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

        if (obj instanceof ListAccountIntegrationsRequest == false)
            return false;
        ListAccountIntegrationsRequest other = (ListAccountIntegrationsRequest) obj;
        if (other.getUri() == null ^ this.getUri() == null)
            return false;
        if (other.getUri() != null && other.getUri().equals(this.getUri()) == false)
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

        hashCode = prime * hashCode + ((getUri() == null) ? 0 : getUri().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListAccountIntegrationsRequest clone() {
        return (ListAccountIntegrationsRequest) super.clone();
    }

}
