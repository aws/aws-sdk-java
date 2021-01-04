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
package com.amazonaws.services.elasticsearch.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Container for request parameters to <code> <a>ListPackagesForDomain</a> </code> operation.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListPackagesForDomainRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the domain for which you want to list associated packages.
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * Limits results to a maximum number of packages.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * Used for pagination. Only necessary if a previous API call includes a non-null NextToken value. If provided,
     * returns results for the next page.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The name of the domain for which you want to list associated packages.
     * </p>
     * 
     * @param domainName
     *        The name of the domain for which you want to list associated packages.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The name of the domain for which you want to list associated packages.
     * </p>
     * 
     * @return The name of the domain for which you want to list associated packages.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * The name of the domain for which you want to list associated packages.
     * </p>
     * 
     * @param domainName
     *        The name of the domain for which you want to list associated packages.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPackagesForDomainRequest withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * Limits results to a maximum number of packages.
     * </p>
     * 
     * @param maxResults
     *        Limits results to a maximum number of packages.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Limits results to a maximum number of packages.
     * </p>
     * 
     * @return Limits results to a maximum number of packages.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * Limits results to a maximum number of packages.
     * </p>
     * 
     * @param maxResults
     *        Limits results to a maximum number of packages.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPackagesForDomainRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * Used for pagination. Only necessary if a previous API call includes a non-null NextToken value. If provided,
     * returns results for the next page.
     * </p>
     * 
     * @param nextToken
     *        Used for pagination. Only necessary if a previous API call includes a non-null NextToken value. If
     *        provided, returns results for the next page.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Used for pagination. Only necessary if a previous API call includes a non-null NextToken value. If provided,
     * returns results for the next page.
     * </p>
     * 
     * @return Used for pagination. Only necessary if a previous API call includes a non-null NextToken value. If
     *         provided, returns results for the next page.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Used for pagination. Only necessary if a previous API call includes a non-null NextToken value. If provided,
     * returns results for the next page.
     * </p>
     * 
     * @param nextToken
     *        Used for pagination. Only necessary if a previous API call includes a non-null NextToken value. If
     *        provided, returns results for the next page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPackagesForDomainRequest withNextToken(String nextToken) {
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

        if (obj instanceof ListPackagesForDomainRequest == false)
            return false;
        ListPackagesForDomainRequest other = (ListPackagesForDomainRequest) obj;
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

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListPackagesForDomainRequest clone() {
        return (ListPackagesForDomainRequest) super.clone();
    }

}
