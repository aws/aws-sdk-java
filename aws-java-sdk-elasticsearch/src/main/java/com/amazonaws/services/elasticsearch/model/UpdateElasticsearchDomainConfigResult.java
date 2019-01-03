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

/**
 * <p>
 * The result of an <code>UpdateElasticsearchDomain</code> request. Contains the status of the Elasticsearch domain
 * being updated.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateElasticsearchDomainConfigResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The status of the updated Elasticsearch domain.
     * </p>
     */
    private ElasticsearchDomainConfig domainConfig;

    /**
     * <p>
     * The status of the updated Elasticsearch domain.
     * </p>
     * 
     * @param domainConfig
     *        The status of the updated Elasticsearch domain.
     */

    public void setDomainConfig(ElasticsearchDomainConfig domainConfig) {
        this.domainConfig = domainConfig;
    }

    /**
     * <p>
     * The status of the updated Elasticsearch domain.
     * </p>
     * 
     * @return The status of the updated Elasticsearch domain.
     */

    public ElasticsearchDomainConfig getDomainConfig() {
        return this.domainConfig;
    }

    /**
     * <p>
     * The status of the updated Elasticsearch domain.
     * </p>
     * 
     * @param domainConfig
     *        The status of the updated Elasticsearch domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateElasticsearchDomainConfigResult withDomainConfig(ElasticsearchDomainConfig domainConfig) {
        setDomainConfig(domainConfig);
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
        if (getDomainConfig() != null)
            sb.append("DomainConfig: ").append(getDomainConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateElasticsearchDomainConfigResult == false)
            return false;
        UpdateElasticsearchDomainConfigResult other = (UpdateElasticsearchDomainConfigResult) obj;
        if (other.getDomainConfig() == null ^ this.getDomainConfig() == null)
            return false;
        if (other.getDomainConfig() != null && other.getDomainConfig().equals(this.getDomainConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainConfig() == null) ? 0 : getDomainConfig().hashCode());
        return hashCode;
    }

    @Override
    public UpdateElasticsearchDomainConfigResult clone() {
        try {
            return (UpdateElasticsearchDomainConfigResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
