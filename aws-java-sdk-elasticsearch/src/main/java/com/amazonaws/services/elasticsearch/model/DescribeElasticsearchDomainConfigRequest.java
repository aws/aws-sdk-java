/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Container for the parameters to the <code>DescribeElasticsearchDomainConfig</code> operation. Specifies the domain
 * name for which you want configuration information.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeElasticsearchDomainConfigRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Elasticsearch domain that you want to get information about.
     * </p>
     */
    private String domainName;

    /**
     * <p>
     * The Elasticsearch domain that you want to get information about.
     * </p>
     * 
     * @param domainName
     *        The Elasticsearch domain that you want to get information about.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The Elasticsearch domain that you want to get information about.
     * </p>
     * 
     * @return The Elasticsearch domain that you want to get information about.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * The Elasticsearch domain that you want to get information about.
     * </p>
     * 
     * @param domainName
     *        The Elasticsearch domain that you want to get information about.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeElasticsearchDomainConfigRequest withDomainName(String domainName) {
        setDomainName(domainName);
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
            sb.append("DomainName: ").append(getDomainName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeElasticsearchDomainConfigRequest == false)
            return false;
        DescribeElasticsearchDomainConfigRequest other = (DescribeElasticsearchDomainConfigRequest) obj;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        return hashCode;
    }

    @Override
    public DescribeElasticsearchDomainConfigRequest clone() {
        return (DescribeElasticsearchDomainConfigRequest) super.clone();
    }

}
