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
package com.amazonaws.services.cloudsearchv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The result of a <code>UpdateDomainEndpointOptions</code> request. Contains the configuration and status of the
 * domain's endpoint options.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateDomainEndpointOptionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The newly-configured domain endpoint options.
     * </p>
     */
    private DomainEndpointOptionsStatus domainEndpointOptions;

    /**
     * <p>
     * The newly-configured domain endpoint options.
     * </p>
     * 
     * @param domainEndpointOptions
     *        The newly-configured domain endpoint options.
     */

    public void setDomainEndpointOptions(DomainEndpointOptionsStatus domainEndpointOptions) {
        this.domainEndpointOptions = domainEndpointOptions;
    }

    /**
     * <p>
     * The newly-configured domain endpoint options.
     * </p>
     * 
     * @return The newly-configured domain endpoint options.
     */

    public DomainEndpointOptionsStatus getDomainEndpointOptions() {
        return this.domainEndpointOptions;
    }

    /**
     * <p>
     * The newly-configured domain endpoint options.
     * </p>
     * 
     * @param domainEndpointOptions
     *        The newly-configured domain endpoint options.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDomainEndpointOptionsResult withDomainEndpointOptions(DomainEndpointOptionsStatus domainEndpointOptions) {
        setDomainEndpointOptions(domainEndpointOptions);
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
        if (getDomainEndpointOptions() != null)
            sb.append("DomainEndpointOptions: ").append(getDomainEndpointOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateDomainEndpointOptionsResult == false)
            return false;
        UpdateDomainEndpointOptionsResult other = (UpdateDomainEndpointOptionsResult) obj;
        if (other.getDomainEndpointOptions() == null ^ this.getDomainEndpointOptions() == null)
            return false;
        if (other.getDomainEndpointOptions() != null && other.getDomainEndpointOptions().equals(this.getDomainEndpointOptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainEndpointOptions() == null) ? 0 : getDomainEndpointOptions().hashCode());
        return hashCode;
    }

    @Override
    public UpdateDomainEndpointOptionsResult clone() {
        try {
            return (UpdateDomainEndpointOptionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
