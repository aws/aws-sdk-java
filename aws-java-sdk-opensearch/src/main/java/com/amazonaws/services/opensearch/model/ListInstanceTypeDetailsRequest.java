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
package com.amazonaws.services.opensearch.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListInstanceTypeDetailsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Version of OpenSearch or Elasticsearch, in the format Elasticsearch_X.Y or OpenSearch_X.Y. Defaults to the latest
     * version of OpenSearch.
     * </p>
     */
    private String engineVersion;
    /**
     * <p>
     * Name of the domain to list instance type details for.
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * An optional parameter that specifies the maximum number of results to return. You can use <code>nextToken</code>
     * to get the next page of results.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * If your initial <code>ListInstanceTypeDetails</code> operation returns a <code>nextToken</code>, you can include
     * the returned <code>nextToken</code> in subsequent <code>ListInstanceTypeDetails</code> operations, which returns
     * results in the next page.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Version of OpenSearch or Elasticsearch, in the format Elasticsearch_X.Y or OpenSearch_X.Y. Defaults to the latest
     * version of OpenSearch.
     * </p>
     * 
     * @param engineVersion
     *        Version of OpenSearch or Elasticsearch, in the format Elasticsearch_X.Y or OpenSearch_X.Y. Defaults to the
     *        latest version of OpenSearch.
     */

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * Version of OpenSearch or Elasticsearch, in the format Elasticsearch_X.Y or OpenSearch_X.Y. Defaults to the latest
     * version of OpenSearch.
     * </p>
     * 
     * @return Version of OpenSearch or Elasticsearch, in the format Elasticsearch_X.Y or OpenSearch_X.Y. Defaults to
     *         the latest version of OpenSearch.
     */

    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * <p>
     * Version of OpenSearch or Elasticsearch, in the format Elasticsearch_X.Y or OpenSearch_X.Y. Defaults to the latest
     * version of OpenSearch.
     * </p>
     * 
     * @param engineVersion
     *        Version of OpenSearch or Elasticsearch, in the format Elasticsearch_X.Y or OpenSearch_X.Y. Defaults to the
     *        latest version of OpenSearch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInstanceTypeDetailsRequest withEngineVersion(String engineVersion) {
        setEngineVersion(engineVersion);
        return this;
    }

    /**
     * <p>
     * Name of the domain to list instance type details for.
     * </p>
     * 
     * @param domainName
     *        Name of the domain to list instance type details for.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * Name of the domain to list instance type details for.
     * </p>
     * 
     * @return Name of the domain to list instance type details for.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * Name of the domain to list instance type details for.
     * </p>
     * 
     * @param domainName
     *        Name of the domain to list instance type details for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInstanceTypeDetailsRequest withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * An optional parameter that specifies the maximum number of results to return. You can use <code>nextToken</code>
     * to get the next page of results.
     * </p>
     * 
     * @param maxResults
     *        An optional parameter that specifies the maximum number of results to return. You can use
     *        <code>nextToken</code> to get the next page of results.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * An optional parameter that specifies the maximum number of results to return. You can use <code>nextToken</code>
     * to get the next page of results.
     * </p>
     * 
     * @return An optional parameter that specifies the maximum number of results to return. You can use
     *         <code>nextToken</code> to get the next page of results.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * An optional parameter that specifies the maximum number of results to return. You can use <code>nextToken</code>
     * to get the next page of results.
     * </p>
     * 
     * @param maxResults
     *        An optional parameter that specifies the maximum number of results to return. You can use
     *        <code>nextToken</code> to get the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInstanceTypeDetailsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * If your initial <code>ListInstanceTypeDetails</code> operation returns a <code>nextToken</code>, you can include
     * the returned <code>nextToken</code> in subsequent <code>ListInstanceTypeDetails</code> operations, which returns
     * results in the next page.
     * </p>
     * 
     * @param nextToken
     *        If your initial <code>ListInstanceTypeDetails</code> operation returns a <code>nextToken</code>, you can
     *        include the returned <code>nextToken</code> in subsequent <code>ListInstanceTypeDetails</code> operations,
     *        which returns results in the next page.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If your initial <code>ListInstanceTypeDetails</code> operation returns a <code>nextToken</code>, you can include
     * the returned <code>nextToken</code> in subsequent <code>ListInstanceTypeDetails</code> operations, which returns
     * results in the next page.
     * </p>
     * 
     * @return If your initial <code>ListInstanceTypeDetails</code> operation returns a <code>nextToken</code>, you can
     *         include the returned <code>nextToken</code> in subsequent <code>ListInstanceTypeDetails</code>
     *         operations, which returns results in the next page.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If your initial <code>ListInstanceTypeDetails</code> operation returns a <code>nextToken</code>, you can include
     * the returned <code>nextToken</code> in subsequent <code>ListInstanceTypeDetails</code> operations, which returns
     * results in the next page.
     * </p>
     * 
     * @param nextToken
     *        If your initial <code>ListInstanceTypeDetails</code> operation returns a <code>nextToken</code>, you can
     *        include the returned <code>nextToken</code> in subsequent <code>ListInstanceTypeDetails</code> operations,
     *        which returns results in the next page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInstanceTypeDetailsRequest withNextToken(String nextToken) {
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
        if (getEngineVersion() != null)
            sb.append("EngineVersion: ").append(getEngineVersion()).append(",");
        if (getDomainName() != null)
            sb.append("DomainName: ").append(getDomainName()).append(",");
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

        if (obj instanceof ListInstanceTypeDetailsRequest == false)
            return false;
        ListInstanceTypeDetailsRequest other = (ListInstanceTypeDetailsRequest) obj;
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null)
            return false;
        if (other.getEngineVersion() != null && other.getEngineVersion().equals(this.getEngineVersion()) == false)
            return false;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
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

        hashCode = prime * hashCode + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListInstanceTypeDetailsRequest clone() {
        return (ListInstanceTypeDetailsRequest) super.clone();
    }

}
