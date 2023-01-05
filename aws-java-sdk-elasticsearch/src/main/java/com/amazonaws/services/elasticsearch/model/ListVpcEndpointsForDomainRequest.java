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
package com.amazonaws.services.elasticsearch.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Container for request parameters to the <code><a>ListVpcEndpointsForDomain</a></code> operation. Specifies the domain
 * whose VPC endpoints will be listed.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListVpcEndpointsForDomainRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Name of the ElasticSearch domain whose VPC endpoints are to be listed.
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * Provides an identifier to allow retrieval of paginated results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Name of the ElasticSearch domain whose VPC endpoints are to be listed.
     * </p>
     * 
     * @param domainName
     *        Name of the ElasticSearch domain whose VPC endpoints are to be listed.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * Name of the ElasticSearch domain whose VPC endpoints are to be listed.
     * </p>
     * 
     * @return Name of the ElasticSearch domain whose VPC endpoints are to be listed.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * Name of the ElasticSearch domain whose VPC endpoints are to be listed.
     * </p>
     * 
     * @param domainName
     *        Name of the ElasticSearch domain whose VPC endpoints are to be listed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListVpcEndpointsForDomainRequest withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * Provides an identifier to allow retrieval of paginated results.
     * </p>
     * 
     * @param nextToken
     *        Provides an identifier to allow retrieval of paginated results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Provides an identifier to allow retrieval of paginated results.
     * </p>
     * 
     * @return Provides an identifier to allow retrieval of paginated results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Provides an identifier to allow retrieval of paginated results.
     * </p>
     * 
     * @param nextToken
     *        Provides an identifier to allow retrieval of paginated results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListVpcEndpointsForDomainRequest withNextToken(String nextToken) {
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

        if (obj instanceof ListVpcEndpointsForDomainRequest == false)
            return false;
        ListVpcEndpointsForDomainRequest other = (ListVpcEndpointsForDomainRequest) obj;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
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
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListVpcEndpointsForDomainRequest clone() {
        return (ListVpcEndpointsForDomainRequest) super.clone();
    }

}
