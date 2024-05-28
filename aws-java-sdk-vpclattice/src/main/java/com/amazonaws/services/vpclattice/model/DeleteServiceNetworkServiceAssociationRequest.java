/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.vpclattice.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/DeleteServiceNetworkServiceAssociation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteServiceNetworkServiceAssociationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID or Amazon Resource Name (ARN) of the association.
     * </p>
     */
    private String serviceNetworkServiceAssociationIdentifier;

    /**
     * <p>
     * The ID or Amazon Resource Name (ARN) of the association.
     * </p>
     * 
     * @param serviceNetworkServiceAssociationIdentifier
     *        The ID or Amazon Resource Name (ARN) of the association.
     */

    public void setServiceNetworkServiceAssociationIdentifier(String serviceNetworkServiceAssociationIdentifier) {
        this.serviceNetworkServiceAssociationIdentifier = serviceNetworkServiceAssociationIdentifier;
    }

    /**
     * <p>
     * The ID or Amazon Resource Name (ARN) of the association.
     * </p>
     * 
     * @return The ID or Amazon Resource Name (ARN) of the association.
     */

    public String getServiceNetworkServiceAssociationIdentifier() {
        return this.serviceNetworkServiceAssociationIdentifier;
    }

    /**
     * <p>
     * The ID or Amazon Resource Name (ARN) of the association.
     * </p>
     * 
     * @param serviceNetworkServiceAssociationIdentifier
     *        The ID or Amazon Resource Name (ARN) of the association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteServiceNetworkServiceAssociationRequest withServiceNetworkServiceAssociationIdentifier(String serviceNetworkServiceAssociationIdentifier) {
        setServiceNetworkServiceAssociationIdentifier(serviceNetworkServiceAssociationIdentifier);
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
        if (getServiceNetworkServiceAssociationIdentifier() != null)
            sb.append("ServiceNetworkServiceAssociationIdentifier: ").append(getServiceNetworkServiceAssociationIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteServiceNetworkServiceAssociationRequest == false)
            return false;
        DeleteServiceNetworkServiceAssociationRequest other = (DeleteServiceNetworkServiceAssociationRequest) obj;
        if (other.getServiceNetworkServiceAssociationIdentifier() == null ^ this.getServiceNetworkServiceAssociationIdentifier() == null)
            return false;
        if (other.getServiceNetworkServiceAssociationIdentifier() != null
                && other.getServiceNetworkServiceAssociationIdentifier().equals(this.getServiceNetworkServiceAssociationIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getServiceNetworkServiceAssociationIdentifier() == null) ? 0 : getServiceNetworkServiceAssociationIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public DeleteServiceNetworkServiceAssociationRequest clone() {
        return (DeleteServiceNetworkServiceAssociationRequest) super.clone();
    }

}
