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
package com.amazonaws.services.amplify.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Result structure for the update Domain Association request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/UpdateDomainAssociation" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateDomainAssociationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Domain Association structure.
     * </p>
     */
    private DomainAssociation domainAssociation;

    /**
     * <p>
     * Domain Association structure.
     * </p>
     * 
     * @param domainAssociation
     *        Domain Association structure.
     */

    public void setDomainAssociation(DomainAssociation domainAssociation) {
        this.domainAssociation = domainAssociation;
    }

    /**
     * <p>
     * Domain Association structure.
     * </p>
     * 
     * @return Domain Association structure.
     */

    public DomainAssociation getDomainAssociation() {
        return this.domainAssociation;
    }

    /**
     * <p>
     * Domain Association structure.
     * </p>
     * 
     * @param domainAssociation
     *        Domain Association structure.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDomainAssociationResult withDomainAssociation(DomainAssociation domainAssociation) {
        setDomainAssociation(domainAssociation);
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
        if (getDomainAssociation() != null)
            sb.append("DomainAssociation: ").append(getDomainAssociation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateDomainAssociationResult == false)
            return false;
        UpdateDomainAssociationResult other = (UpdateDomainAssociationResult) obj;
        if (other.getDomainAssociation() == null ^ this.getDomainAssociation() == null)
            return false;
        if (other.getDomainAssociation() != null && other.getDomainAssociation().equals(this.getDomainAssociation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainAssociation() == null) ? 0 : getDomainAssociation().hashCode());
        return hashCode;
    }

    @Override
    public UpdateDomainAssociationResult clone() {
        try {
            return (UpdateDomainAssociationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
