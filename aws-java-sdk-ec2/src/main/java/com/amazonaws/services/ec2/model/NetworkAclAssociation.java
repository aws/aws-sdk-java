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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes an association between a network ACL and a subnet.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/NetworkAclAssociation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NetworkAclAssociation implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the association between a network ACL and a subnet.
     * </p>
     */
    private String networkAclAssociationId;
    /**
     * <p>
     * The ID of the network ACL.
     * </p>
     */
    private String networkAclId;
    /**
     * <p>
     * The ID of the subnet.
     * </p>
     */
    private String subnetId;

    /**
     * <p>
     * The ID of the association between a network ACL and a subnet.
     * </p>
     * 
     * @param networkAclAssociationId
     *        The ID of the association between a network ACL and a subnet.
     */

    public void setNetworkAclAssociationId(String networkAclAssociationId) {
        this.networkAclAssociationId = networkAclAssociationId;
    }

    /**
     * <p>
     * The ID of the association between a network ACL and a subnet.
     * </p>
     * 
     * @return The ID of the association between a network ACL and a subnet.
     */

    public String getNetworkAclAssociationId() {
        return this.networkAclAssociationId;
    }

    /**
     * <p>
     * The ID of the association between a network ACL and a subnet.
     * </p>
     * 
     * @param networkAclAssociationId
     *        The ID of the association between a network ACL and a subnet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkAclAssociation withNetworkAclAssociationId(String networkAclAssociationId) {
        setNetworkAclAssociationId(networkAclAssociationId);
        return this;
    }

    /**
     * <p>
     * The ID of the network ACL.
     * </p>
     * 
     * @param networkAclId
     *        The ID of the network ACL.
     */

    public void setNetworkAclId(String networkAclId) {
        this.networkAclId = networkAclId;
    }

    /**
     * <p>
     * The ID of the network ACL.
     * </p>
     * 
     * @return The ID of the network ACL.
     */

    public String getNetworkAclId() {
        return this.networkAclId;
    }

    /**
     * <p>
     * The ID of the network ACL.
     * </p>
     * 
     * @param networkAclId
     *        The ID of the network ACL.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkAclAssociation withNetworkAclId(String networkAclId) {
        setNetworkAclId(networkAclId);
        return this;
    }

    /**
     * <p>
     * The ID of the subnet.
     * </p>
     * 
     * @param subnetId
     *        The ID of the subnet.
     */

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    /**
     * <p>
     * The ID of the subnet.
     * </p>
     * 
     * @return The ID of the subnet.
     */

    public String getSubnetId() {
        return this.subnetId;
    }

    /**
     * <p>
     * The ID of the subnet.
     * </p>
     * 
     * @param subnetId
     *        The ID of the subnet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkAclAssociation withSubnetId(String subnetId) {
        setSubnetId(subnetId);
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
        if (getNetworkAclAssociationId() != null)
            sb.append("NetworkAclAssociationId: ").append(getNetworkAclAssociationId()).append(",");
        if (getNetworkAclId() != null)
            sb.append("NetworkAclId: ").append(getNetworkAclId()).append(",");
        if (getSubnetId() != null)
            sb.append("SubnetId: ").append(getSubnetId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NetworkAclAssociation == false)
            return false;
        NetworkAclAssociation other = (NetworkAclAssociation) obj;
        if (other.getNetworkAclAssociationId() == null ^ this.getNetworkAclAssociationId() == null)
            return false;
        if (other.getNetworkAclAssociationId() != null && other.getNetworkAclAssociationId().equals(this.getNetworkAclAssociationId()) == false)
            return false;
        if (other.getNetworkAclId() == null ^ this.getNetworkAclId() == null)
            return false;
        if (other.getNetworkAclId() != null && other.getNetworkAclId().equals(this.getNetworkAclId()) == false)
            return false;
        if (other.getSubnetId() == null ^ this.getSubnetId() == null)
            return false;
        if (other.getSubnetId() != null && other.getSubnetId().equals(this.getSubnetId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNetworkAclAssociationId() == null) ? 0 : getNetworkAclAssociationId().hashCode());
        hashCode = prime * hashCode + ((getNetworkAclId() == null) ? 0 : getNetworkAclId().hashCode());
        hashCode = prime * hashCode + ((getSubnetId() == null) ? 0 : getSubnetId().hashCode());
        return hashCode;
    }

    @Override
    public NetworkAclAssociation clone() {
        try {
            return (NetworkAclAssociation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
