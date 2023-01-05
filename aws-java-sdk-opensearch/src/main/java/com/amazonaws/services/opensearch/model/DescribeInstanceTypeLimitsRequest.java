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

/**
 * <p>
 * Container for the parameters to the <code>DescribeInstanceTypeLimits</code> operation.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeInstanceTypeLimitsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the domain. Only specify if you need the limits for an existing domain.
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * The OpenSearch Service instance type for which you need limit information.
     * </p>
     */
    private String instanceType;
    /**
     * <p>
     * Version of OpenSearch or Elasticsearch, in the format Elasticsearch_X.Y or OpenSearch_X.Y. Defaults to the latest
     * version of OpenSearch.
     * </p>
     */
    private String engineVersion;

    /**
     * <p>
     * The name of the domain. Only specify if you need the limits for an existing domain.
     * </p>
     * 
     * @param domainName
     *        The name of the domain. Only specify if you need the limits for an existing domain.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The name of the domain. Only specify if you need the limits for an existing domain.
     * </p>
     * 
     * @return The name of the domain. Only specify if you need the limits for an existing domain.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * The name of the domain. Only specify if you need the limits for an existing domain.
     * </p>
     * 
     * @param domainName
     *        The name of the domain. Only specify if you need the limits for an existing domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInstanceTypeLimitsRequest withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * The OpenSearch Service instance type for which you need limit information.
     * </p>
     * 
     * @param instanceType
     *        The OpenSearch Service instance type for which you need limit information.
     * @see OpenSearchPartitionInstanceType
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The OpenSearch Service instance type for which you need limit information.
     * </p>
     * 
     * @return The OpenSearch Service instance type for which you need limit information.
     * @see OpenSearchPartitionInstanceType
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * The OpenSearch Service instance type for which you need limit information.
     * </p>
     * 
     * @param instanceType
     *        The OpenSearch Service instance type for which you need limit information.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OpenSearchPartitionInstanceType
     */

    public DescribeInstanceTypeLimitsRequest withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * <p>
     * The OpenSearch Service instance type for which you need limit information.
     * </p>
     * 
     * @param instanceType
     *        The OpenSearch Service instance type for which you need limit information.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OpenSearchPartitionInstanceType
     */

    public DescribeInstanceTypeLimitsRequest withInstanceType(OpenSearchPartitionInstanceType instanceType) {
        this.instanceType = instanceType.toString();
        return this;
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

    public DescribeInstanceTypeLimitsRequest withEngineVersion(String engineVersion) {
        setEngineVersion(engineVersion);
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
        if (getEngineVersion() != null)
            sb.append("EngineVersion: ").append(getEngineVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeInstanceTypeLimitsRequest == false)
            return false;
        DescribeInstanceTypeLimitsRequest other = (DescribeInstanceTypeLimitsRequest) obj;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null)
            return false;
        if (other.getEngineVersion() != null && other.getEngineVersion().equals(this.getEngineVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        return hashCode;
    }

    @Override
    public DescribeInstanceTypeLimitsRequest clone() {
        return (DescribeInstanceTypeLimitsRequest) super.clone();
    }

}
