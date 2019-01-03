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
 * The result of a <code>CreateElasticsearchDomain</code> operation. Contains the status of the newly created
 * Elasticsearch domain.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateElasticsearchDomainResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The status of the newly created Elasticsearch domain.
     * </p>
     */
    private ElasticsearchDomainStatus domainStatus;

    /**
     * <p>
     * The status of the newly created Elasticsearch domain.
     * </p>
     * 
     * @param domainStatus
     *        The status of the newly created Elasticsearch domain.
     */

    public void setDomainStatus(ElasticsearchDomainStatus domainStatus) {
        this.domainStatus = domainStatus;
    }

    /**
     * <p>
     * The status of the newly created Elasticsearch domain.
     * </p>
     * 
     * @return The status of the newly created Elasticsearch domain.
     */

    public ElasticsearchDomainStatus getDomainStatus() {
        return this.domainStatus;
    }

    /**
     * <p>
     * The status of the newly created Elasticsearch domain.
     * </p>
     * 
     * @param domainStatus
     *        The status of the newly created Elasticsearch domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateElasticsearchDomainResult withDomainStatus(ElasticsearchDomainStatus domainStatus) {
        setDomainStatus(domainStatus);
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
        if (getDomainStatus() != null)
            sb.append("DomainStatus: ").append(getDomainStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateElasticsearchDomainResult == false)
            return false;
        CreateElasticsearchDomainResult other = (CreateElasticsearchDomainResult) obj;
        if (other.getDomainStatus() == null ^ this.getDomainStatus() == null)
            return false;
        if (other.getDomainStatus() != null && other.getDomainStatus().equals(this.getDomainStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainStatus() == null) ? 0 : getDomainStatus().hashCode());
        return hashCode;
    }

    @Override
    public CreateElasticsearchDomainResult clone() {
        try {
            return (CreateElasticsearchDomainResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
