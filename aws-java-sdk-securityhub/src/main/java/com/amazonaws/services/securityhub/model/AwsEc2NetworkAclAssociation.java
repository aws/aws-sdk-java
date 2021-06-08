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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An association between the network ACL and a subnet.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsEc2NetworkAclAssociation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsEc2NetworkAclAssociation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the association between the network ACL and the subnet.
     * </p>
     */
    private String networkAclAssociationId;
    /**
     * <p>
     * The identifier of the network ACL.
     * </p>
     */
    private String networkAclId;
    /**
     * <p>
     * The identifier of the subnet that is associated with the network ACL.
     * </p>
     */
    private String subnetId;

    /**
     * <p>
     * The identifier of the association between the network ACL and the subnet.
     * </p>
     * 
     * @param networkAclAssociationId
     *        The identifier of the association between the network ACL and the subnet.
     */

    public void setNetworkAclAssociationId(String networkAclAssociationId) {
        this.networkAclAssociationId = networkAclAssociationId;
    }

    /**
     * <p>
     * The identifier of the association between the network ACL and the subnet.
     * </p>
     * 
     * @return The identifier of the association between the network ACL and the subnet.
     */

    public String getNetworkAclAssociationId() {
        return this.networkAclAssociationId;
    }

    /**
     * <p>
     * The identifier of the association between the network ACL and the subnet.
     * </p>
     * 
     * @param networkAclAssociationId
     *        The identifier of the association between the network ACL and the subnet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2NetworkAclAssociation withNetworkAclAssociationId(String networkAclAssociationId) {
        setNetworkAclAssociationId(networkAclAssociationId);
        return this;
    }

    /**
     * <p>
     * The identifier of the network ACL.
     * </p>
     * 
     * @param networkAclId
     *        The identifier of the network ACL.
     */

    public void setNetworkAclId(String networkAclId) {
        this.networkAclId = networkAclId;
    }

    /**
     * <p>
     * The identifier of the network ACL.
     * </p>
     * 
     * @return The identifier of the network ACL.
     */

    public String getNetworkAclId() {
        return this.networkAclId;
    }

    /**
     * <p>
     * The identifier of the network ACL.
     * </p>
     * 
     * @param networkAclId
     *        The identifier of the network ACL.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2NetworkAclAssociation withNetworkAclId(String networkAclId) {
        setNetworkAclId(networkAclId);
        return this;
    }

    /**
     * <p>
     * The identifier of the subnet that is associated with the network ACL.
     * </p>
     * 
     * @param subnetId
     *        The identifier of the subnet that is associated with the network ACL.
     */

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    /**
     * <p>
     * The identifier of the subnet that is associated with the network ACL.
     * </p>
     * 
     * @return The identifier of the subnet that is associated with the network ACL.
     */

    public String getSubnetId() {
        return this.subnetId;
    }

    /**
     * <p>
     * The identifier of the subnet that is associated with the network ACL.
     * </p>
     * 
     * @param subnetId
     *        The identifier of the subnet that is associated with the network ACL.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2NetworkAclAssociation withSubnetId(String subnetId) {
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

        if (obj instanceof AwsEc2NetworkAclAssociation == false)
            return false;
        AwsEc2NetworkAclAssociation other = (AwsEc2NetworkAclAssociation) obj;
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
    public AwsEc2NetworkAclAssociation clone() {
        try {
            return (AwsEc2NetworkAclAssociation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsEc2NetworkAclAssociationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
