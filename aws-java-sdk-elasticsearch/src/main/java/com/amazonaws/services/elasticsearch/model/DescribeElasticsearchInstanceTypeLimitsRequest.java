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
 * Container for the parameters to <code> <a>DescribeElasticsearchInstanceTypeLimits</a> </code> operation.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeElasticsearchInstanceTypeLimitsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * DomainName represents the name of the Domain that we are trying to modify. This should be present only if we are
     * querying for Elasticsearch <code> <a>Limits</a> </code> for existing domain.
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * The instance type for an Elasticsearch cluster for which Elasticsearch <code> <a>Limits</a> </code> are needed.
     * </p>
     */
    private String instanceType;
    /**
     * <p>
     * Version of Elasticsearch for which <code> <a>Limits</a> </code> are needed.
     * </p>
     */
    private String elasticsearchVersion;

    /**
     * <p>
     * DomainName represents the name of the Domain that we are trying to modify. This should be present only if we are
     * querying for Elasticsearch <code> <a>Limits</a> </code> for existing domain.
     * </p>
     * 
     * @param domainName
     *        DomainName represents the name of the Domain that we are trying to modify. This should be present only if
     *        we are querying for Elasticsearch <code> <a>Limits</a> </code> for existing domain.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * DomainName represents the name of the Domain that we are trying to modify. This should be present only if we are
     * querying for Elasticsearch <code> <a>Limits</a> </code> for existing domain.
     * </p>
     * 
     * @return DomainName represents the name of the Domain that we are trying to modify. This should be present only if
     *         we are querying for Elasticsearch <code> <a>Limits</a> </code> for existing domain.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * DomainName represents the name of the Domain that we are trying to modify. This should be present only if we are
     * querying for Elasticsearch <code> <a>Limits</a> </code> for existing domain.
     * </p>
     * 
     * @param domainName
     *        DomainName represents the name of the Domain that we are trying to modify. This should be present only if
     *        we are querying for Elasticsearch <code> <a>Limits</a> </code> for existing domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeElasticsearchInstanceTypeLimitsRequest withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * The instance type for an Elasticsearch cluster for which Elasticsearch <code> <a>Limits</a> </code> are needed.
     * </p>
     * 
     * @param instanceType
     *        The instance type for an Elasticsearch cluster for which Elasticsearch <code> <a>Limits</a> </code> are
     *        needed.
     * @see ESPartitionInstanceType
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The instance type for an Elasticsearch cluster for which Elasticsearch <code> <a>Limits</a> </code> are needed.
     * </p>
     * 
     * @return The instance type for an Elasticsearch cluster for which Elasticsearch <code> <a>Limits</a> </code> are
     *         needed.
     * @see ESPartitionInstanceType
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * The instance type for an Elasticsearch cluster for which Elasticsearch <code> <a>Limits</a> </code> are needed.
     * </p>
     * 
     * @param instanceType
     *        The instance type for an Elasticsearch cluster for which Elasticsearch <code> <a>Limits</a> </code> are
     *        needed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ESPartitionInstanceType
     */

    public DescribeElasticsearchInstanceTypeLimitsRequest withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * <p>
     * The instance type for an Elasticsearch cluster for which Elasticsearch <code> <a>Limits</a> </code> are needed.
     * </p>
     * 
     * @param instanceType
     *        The instance type for an Elasticsearch cluster for which Elasticsearch <code> <a>Limits</a> </code> are
     *        needed.
     * @see ESPartitionInstanceType
     */

    public void setInstanceType(ESPartitionInstanceType instanceType) {
        withInstanceType(instanceType);
    }

    /**
     * <p>
     * The instance type for an Elasticsearch cluster for which Elasticsearch <code> <a>Limits</a> </code> are needed.
     * </p>
     * 
     * @param instanceType
     *        The instance type for an Elasticsearch cluster for which Elasticsearch <code> <a>Limits</a> </code> are
     *        needed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ESPartitionInstanceType
     */

    public DescribeElasticsearchInstanceTypeLimitsRequest withInstanceType(ESPartitionInstanceType instanceType) {
        this.instanceType = instanceType.toString();
        return this;
    }

    /**
     * <p>
     * Version of Elasticsearch for which <code> <a>Limits</a> </code> are needed.
     * </p>
     * 
     * @param elasticsearchVersion
     *        Version of Elasticsearch for which <code> <a>Limits</a> </code> are needed.
     */

    public void setElasticsearchVersion(String elasticsearchVersion) {
        this.elasticsearchVersion = elasticsearchVersion;
    }

    /**
     * <p>
     * Version of Elasticsearch for which <code> <a>Limits</a> </code> are needed.
     * </p>
     * 
     * @return Version of Elasticsearch for which <code> <a>Limits</a> </code> are needed.
     */

    public String getElasticsearchVersion() {
        return this.elasticsearchVersion;
    }

    /**
     * <p>
     * Version of Elasticsearch for which <code> <a>Limits</a> </code> are needed.
     * </p>
     * 
     * @param elasticsearchVersion
     *        Version of Elasticsearch for which <code> <a>Limits</a> </code> are needed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeElasticsearchInstanceTypeLimitsRequest withElasticsearchVersion(String elasticsearchVersion) {
        setElasticsearchVersion(elasticsearchVersion);
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
        if (getInstanceType() != null)
            sb.append("InstanceType: ").append(getInstanceType()).append(",");
        if (getElasticsearchVersion() != null)
            sb.append("ElasticsearchVersion: ").append(getElasticsearchVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeElasticsearchInstanceTypeLimitsRequest == false)
            return false;
        DescribeElasticsearchInstanceTypeLimitsRequest other = (DescribeElasticsearchInstanceTypeLimitsRequest) obj;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getElasticsearchVersion() == null ^ this.getElasticsearchVersion() == null)
            return false;
        if (other.getElasticsearchVersion() != null && other.getElasticsearchVersion().equals(this.getElasticsearchVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getElasticsearchVersion() == null) ? 0 : getElasticsearchVersion().hashCode());
        return hashCode;
    }

    @Override
    public DescribeElasticsearchInstanceTypeLimitsRequest clone() {
        return (DescribeElasticsearchInstanceTypeLimitsRequest) super.clone();
    }

}
