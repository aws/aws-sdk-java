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

/**
 * <p>
 * Container for response returned by <code> <a>DissociatePackage</a> </code> operation.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DissociatePackageResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * <code>DomainPackageDetails</code>
     * </p>
     */
    private DomainPackageDetails domainPackageDetails;

    /**
     * <p>
     * <code>DomainPackageDetails</code>
     * </p>
     * 
     * @param domainPackageDetails
     *        DomainPackageDetails
     */

    public void setDomainPackageDetails(DomainPackageDetails domainPackageDetails) {
        this.domainPackageDetails = domainPackageDetails;
    }

    /**
     * <p>
     * <code>DomainPackageDetails</code>
     * </p>
     * 
     * @return DomainPackageDetails
     */

    public DomainPackageDetails getDomainPackageDetails() {
        return this.domainPackageDetails;
    }

    /**
     * <p>
     * <code>DomainPackageDetails</code>
     * </p>
     * 
     * @param domainPackageDetails
     *        DomainPackageDetails
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DissociatePackageResult withDomainPackageDetails(DomainPackageDetails domainPackageDetails) {
        setDomainPackageDetails(domainPackageDetails);
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
        if (getDomainPackageDetails() != null)
            sb.append("DomainPackageDetails: ").append(getDomainPackageDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DissociatePackageResult == false)
            return false;
        DissociatePackageResult other = (DissociatePackageResult) obj;
        if (other.getDomainPackageDetails() == null ^ this.getDomainPackageDetails() == null)
            return false;
        if (other.getDomainPackageDetails() != null && other.getDomainPackageDetails().equals(this.getDomainPackageDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainPackageDetails() == null) ? 0 : getDomainPackageDetails().hashCode());
        return hashCode;
    }

    @Override
    public DissociatePackageResult clone() {
        try {
            return (DissociatePackageResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
