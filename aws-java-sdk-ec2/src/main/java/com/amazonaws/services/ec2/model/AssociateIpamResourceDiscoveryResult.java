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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceResult;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociateIpamResourceDiscoveryResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * A resource discovery association. An associated resource discovery is a resource discovery that has been
     * associated with an IPAM.
     * </p>
     */
    private IpamResourceDiscoveryAssociation ipamResourceDiscoveryAssociation;

    /**
     * <p>
     * A resource discovery association. An associated resource discovery is a resource discovery that has been
     * associated with an IPAM.
     * </p>
     * 
     * @param ipamResourceDiscoveryAssociation
     *        A resource discovery association. An associated resource discovery is a resource discovery that has been
     *        associated with an IPAM.
     */

    public void setIpamResourceDiscoveryAssociation(IpamResourceDiscoveryAssociation ipamResourceDiscoveryAssociation) {
        this.ipamResourceDiscoveryAssociation = ipamResourceDiscoveryAssociation;
    }

    /**
     * <p>
     * A resource discovery association. An associated resource discovery is a resource discovery that has been
     * associated with an IPAM.
     * </p>
     * 
     * @return A resource discovery association. An associated resource discovery is a resource discovery that has been
     *         associated with an IPAM.
     */

    public IpamResourceDiscoveryAssociation getIpamResourceDiscoveryAssociation() {
        return this.ipamResourceDiscoveryAssociation;
    }

    /**
     * <p>
     * A resource discovery association. An associated resource discovery is a resource discovery that has been
     * associated with an IPAM.
     * </p>
     * 
     * @param ipamResourceDiscoveryAssociation
     *        A resource discovery association. An associated resource discovery is a resource discovery that has been
     *        associated with an IPAM.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateIpamResourceDiscoveryResult withIpamResourceDiscoveryAssociation(IpamResourceDiscoveryAssociation ipamResourceDiscoveryAssociation) {
        setIpamResourceDiscoveryAssociation(ipamResourceDiscoveryAssociation);
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
        if (getIpamResourceDiscoveryAssociation() != null)
            sb.append("IpamResourceDiscoveryAssociation: ").append(getIpamResourceDiscoveryAssociation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociateIpamResourceDiscoveryResult == false)
            return false;
        AssociateIpamResourceDiscoveryResult other = (AssociateIpamResourceDiscoveryResult) obj;
        if (other.getIpamResourceDiscoveryAssociation() == null ^ this.getIpamResourceDiscoveryAssociation() == null)
            return false;
        if (other.getIpamResourceDiscoveryAssociation() != null
                && other.getIpamResourceDiscoveryAssociation().equals(this.getIpamResourceDiscoveryAssociation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIpamResourceDiscoveryAssociation() == null) ? 0 : getIpamResourceDiscoveryAssociation().hashCode());
        return hashCode;
    }

    @Override
    public AssociateIpamResourceDiscoveryResult clone() {
        try {
            return (AssociateIpamResourceDiscoveryResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
