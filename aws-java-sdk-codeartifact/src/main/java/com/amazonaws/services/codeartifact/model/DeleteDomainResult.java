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
package com.amazonaws.services.codeartifact.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/DeleteDomain" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteDomainResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Contains information about the deleted domain after processing the request.
     * </p>
     */
    private DomainDescription domain;

    /**
     * <p>
     * Contains information about the deleted domain after processing the request.
     * </p>
     * 
     * @param domain
     *        Contains information about the deleted domain after processing the request.
     */

    public void setDomain(DomainDescription domain) {
        this.domain = domain;
    }

    /**
     * <p>
     * Contains information about the deleted domain after processing the request.
     * </p>
     * 
     * @return Contains information about the deleted domain after processing the request.
     */

    public DomainDescription getDomain() {
        return this.domain;
    }

    /**
     * <p>
     * Contains information about the deleted domain after processing the request.
     * </p>
     * 
     * @param domain
     *        Contains information about the deleted domain after processing the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteDomainResult withDomain(DomainDescription domain) {
        setDomain(domain);
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
        if (getDomain() != null)
            sb.append("Domain: ").append(getDomain());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteDomainResult == false)
            return false;
        DeleteDomainResult other = (DeleteDomainResult) obj;
        if (other.getDomain() == null ^ this.getDomain() == null)
            return false;
        if (other.getDomain() != null && other.getDomain().equals(this.getDomain()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomain() == null) ? 0 : getDomain().hashCode());
        return hashCode;
    }

    @Override
    public DeleteDomainResult clone() {
        try {
            return (DeleteDomainResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
