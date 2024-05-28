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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/UpdateServiceNetworkVpcAssociation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateServiceNetworkVpcAssociationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The IDs of the security groups.
     * </p>
     */
    private java.util.List<String> securityGroupIds;
    /**
     * <p>
     * The ID or Amazon Resource Name (ARN) of the association.
     * </p>
     */
    private String serviceNetworkVpcAssociationIdentifier;

    /**
     * <p>
     * The IDs of the security groups.
     * </p>
     * 
     * @return The IDs of the security groups.
     */

    public java.util.List<String> getSecurityGroupIds() {
        return securityGroupIds;
    }

    /**
     * <p>
     * The IDs of the security groups.
     * </p>
     * 
     * @param securityGroupIds
     *        The IDs of the security groups.
     */

    public void setSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        if (securityGroupIds == null) {
            this.securityGroupIds = null;
            return;
        }

        this.securityGroupIds = new java.util.ArrayList<String>(securityGroupIds);
    }

    /**
     * <p>
     * The IDs of the security groups.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroupIds(java.util.Collection)} or {@link #withSecurityGroupIds(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param securityGroupIds
     *        The IDs of the security groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateServiceNetworkVpcAssociationRequest withSecurityGroupIds(String... securityGroupIds) {
        if (this.securityGroupIds == null) {
            setSecurityGroupIds(new java.util.ArrayList<String>(securityGroupIds.length));
        }
        for (String ele : securityGroupIds) {
            this.securityGroupIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the security groups.
     * </p>
     * 
     * @param securityGroupIds
     *        The IDs of the security groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateServiceNetworkVpcAssociationRequest withSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        setSecurityGroupIds(securityGroupIds);
        return this;
    }

    /**
     * <p>
     * The ID or Amazon Resource Name (ARN) of the association.
     * </p>
     * 
     * @param serviceNetworkVpcAssociationIdentifier
     *        The ID or Amazon Resource Name (ARN) of the association.
     */

    public void setServiceNetworkVpcAssociationIdentifier(String serviceNetworkVpcAssociationIdentifier) {
        this.serviceNetworkVpcAssociationIdentifier = serviceNetworkVpcAssociationIdentifier;
    }

    /**
     * <p>
     * The ID or Amazon Resource Name (ARN) of the association.
     * </p>
     * 
     * @return The ID or Amazon Resource Name (ARN) of the association.
     */

    public String getServiceNetworkVpcAssociationIdentifier() {
        return this.serviceNetworkVpcAssociationIdentifier;
    }

    /**
     * <p>
     * The ID or Amazon Resource Name (ARN) of the association.
     * </p>
     * 
     * @param serviceNetworkVpcAssociationIdentifier
     *        The ID or Amazon Resource Name (ARN) of the association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateServiceNetworkVpcAssociationRequest withServiceNetworkVpcAssociationIdentifier(String serviceNetworkVpcAssociationIdentifier) {
        setServiceNetworkVpcAssociationIdentifier(serviceNetworkVpcAssociationIdentifier);
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
        if (getSecurityGroupIds() != null)
            sb.append("SecurityGroupIds: ").append(getSecurityGroupIds()).append(",");
        if (getServiceNetworkVpcAssociationIdentifier() != null)
            sb.append("ServiceNetworkVpcAssociationIdentifier: ").append(getServiceNetworkVpcAssociationIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateServiceNetworkVpcAssociationRequest == false)
            return false;
        UpdateServiceNetworkVpcAssociationRequest other = (UpdateServiceNetworkVpcAssociationRequest) obj;
        if (other.getSecurityGroupIds() == null ^ this.getSecurityGroupIds() == null)
            return false;
        if (other.getSecurityGroupIds() != null && other.getSecurityGroupIds().equals(this.getSecurityGroupIds()) == false)
            return false;
        if (other.getServiceNetworkVpcAssociationIdentifier() == null ^ this.getServiceNetworkVpcAssociationIdentifier() == null)
            return false;
        if (other.getServiceNetworkVpcAssociationIdentifier() != null
                && other.getServiceNetworkVpcAssociationIdentifier().equals(this.getServiceNetworkVpcAssociationIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSecurityGroupIds() == null) ? 0 : getSecurityGroupIds().hashCode());
        hashCode = prime * hashCode + ((getServiceNetworkVpcAssociationIdentifier() == null) ? 0 : getServiceNetworkVpcAssociationIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public UpdateServiceNetworkVpcAssociationRequest clone() {
        return (UpdateServiceNetworkVpcAssociationRequest) super.clone();
    }

}
