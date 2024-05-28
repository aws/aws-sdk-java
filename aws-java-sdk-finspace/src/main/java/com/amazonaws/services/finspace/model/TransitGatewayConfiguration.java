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
package com.amazonaws.services.finspace.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The structure of the transit gateway and network configuration that is used to connect the kdb environment to an
 * internal network.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/TransitGatewayConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TransitGatewayConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the transit gateway created by the customer to connect outbound traffics from kdb network to
     * your internal network.
     * </p>
     */
    private String transitGatewayID;
    /**
     * <p>
     * The routing CIDR on behalf of kdb environment. It could be any "/26 range in the 100.64.0.0 CIDR space. After
     * providing, it will be added to the customer's transit gateway routing table so that the traffics could be routed
     * to kdb network.
     * </p>
     */
    private String routableCIDRSpace;
    /**
     * <p>
     * The rules that define how you manage the outbound traffic from kdb network to your internal network.
     * </p>
     */
    private java.util.List<NetworkACLEntry> attachmentNetworkAclConfiguration;

    /**
     * <p>
     * The identifier of the transit gateway created by the customer to connect outbound traffics from kdb network to
     * your internal network.
     * </p>
     * 
     * @param transitGatewayID
     *        The identifier of the transit gateway created by the customer to connect outbound traffics from kdb
     *        network to your internal network.
     */

    public void setTransitGatewayID(String transitGatewayID) {
        this.transitGatewayID = transitGatewayID;
    }

    /**
     * <p>
     * The identifier of the transit gateway created by the customer to connect outbound traffics from kdb network to
     * your internal network.
     * </p>
     * 
     * @return The identifier of the transit gateway created by the customer to connect outbound traffics from kdb
     *         network to your internal network.
     */

    public String getTransitGatewayID() {
        return this.transitGatewayID;
    }

    /**
     * <p>
     * The identifier of the transit gateway created by the customer to connect outbound traffics from kdb network to
     * your internal network.
     * </p>
     * 
     * @param transitGatewayID
     *        The identifier of the transit gateway created by the customer to connect outbound traffics from kdb
     *        network to your internal network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitGatewayConfiguration withTransitGatewayID(String transitGatewayID) {
        setTransitGatewayID(transitGatewayID);
        return this;
    }

    /**
     * <p>
     * The routing CIDR on behalf of kdb environment. It could be any "/26 range in the 100.64.0.0 CIDR space. After
     * providing, it will be added to the customer's transit gateway routing table so that the traffics could be routed
     * to kdb network.
     * </p>
     * 
     * @param routableCIDRSpace
     *        The routing CIDR on behalf of kdb environment. It could be any "/26 range in the 100.64.0.0 CIDR space.
     *        After providing, it will be added to the customer's transit gateway routing table so that the traffics
     *        could be routed to kdb network.
     */

    public void setRoutableCIDRSpace(String routableCIDRSpace) {
        this.routableCIDRSpace = routableCIDRSpace;
    }

    /**
     * <p>
     * The routing CIDR on behalf of kdb environment. It could be any "/26 range in the 100.64.0.0 CIDR space. After
     * providing, it will be added to the customer's transit gateway routing table so that the traffics could be routed
     * to kdb network.
     * </p>
     * 
     * @return The routing CIDR on behalf of kdb environment. It could be any "/26 range in the 100.64.0.0 CIDR space.
     *         After providing, it will be added to the customer's transit gateway routing table so that the traffics
     *         could be routed to kdb network.
     */

    public String getRoutableCIDRSpace() {
        return this.routableCIDRSpace;
    }

    /**
     * <p>
     * The routing CIDR on behalf of kdb environment. It could be any "/26 range in the 100.64.0.0 CIDR space. After
     * providing, it will be added to the customer's transit gateway routing table so that the traffics could be routed
     * to kdb network.
     * </p>
     * 
     * @param routableCIDRSpace
     *        The routing CIDR on behalf of kdb environment. It could be any "/26 range in the 100.64.0.0 CIDR space.
     *        After providing, it will be added to the customer's transit gateway routing table so that the traffics
     *        could be routed to kdb network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitGatewayConfiguration withRoutableCIDRSpace(String routableCIDRSpace) {
        setRoutableCIDRSpace(routableCIDRSpace);
        return this;
    }

    /**
     * <p>
     * The rules that define how you manage the outbound traffic from kdb network to your internal network.
     * </p>
     * 
     * @return The rules that define how you manage the outbound traffic from kdb network to your internal network.
     */

    public java.util.List<NetworkACLEntry> getAttachmentNetworkAclConfiguration() {
        return attachmentNetworkAclConfiguration;
    }

    /**
     * <p>
     * The rules that define how you manage the outbound traffic from kdb network to your internal network.
     * </p>
     * 
     * @param attachmentNetworkAclConfiguration
     *        The rules that define how you manage the outbound traffic from kdb network to your internal network.
     */

    public void setAttachmentNetworkAclConfiguration(java.util.Collection<NetworkACLEntry> attachmentNetworkAclConfiguration) {
        if (attachmentNetworkAclConfiguration == null) {
            this.attachmentNetworkAclConfiguration = null;
            return;
        }

        this.attachmentNetworkAclConfiguration = new java.util.ArrayList<NetworkACLEntry>(attachmentNetworkAclConfiguration);
    }

    /**
     * <p>
     * The rules that define how you manage the outbound traffic from kdb network to your internal network.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAttachmentNetworkAclConfiguration(java.util.Collection)} or
     * {@link #withAttachmentNetworkAclConfiguration(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param attachmentNetworkAclConfiguration
     *        The rules that define how you manage the outbound traffic from kdb network to your internal network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitGatewayConfiguration withAttachmentNetworkAclConfiguration(NetworkACLEntry... attachmentNetworkAclConfiguration) {
        if (this.attachmentNetworkAclConfiguration == null) {
            setAttachmentNetworkAclConfiguration(new java.util.ArrayList<NetworkACLEntry>(attachmentNetworkAclConfiguration.length));
        }
        for (NetworkACLEntry ele : attachmentNetworkAclConfiguration) {
            this.attachmentNetworkAclConfiguration.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The rules that define how you manage the outbound traffic from kdb network to your internal network.
     * </p>
     * 
     * @param attachmentNetworkAclConfiguration
     *        The rules that define how you manage the outbound traffic from kdb network to your internal network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitGatewayConfiguration withAttachmentNetworkAclConfiguration(java.util.Collection<NetworkACLEntry> attachmentNetworkAclConfiguration) {
        setAttachmentNetworkAclConfiguration(attachmentNetworkAclConfiguration);
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
        if (getTransitGatewayID() != null)
            sb.append("TransitGatewayID: ").append(getTransitGatewayID()).append(",");
        if (getRoutableCIDRSpace() != null)
            sb.append("RoutableCIDRSpace: ").append(getRoutableCIDRSpace()).append(",");
        if (getAttachmentNetworkAclConfiguration() != null)
            sb.append("AttachmentNetworkAclConfiguration: ").append(getAttachmentNetworkAclConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TransitGatewayConfiguration == false)
            return false;
        TransitGatewayConfiguration other = (TransitGatewayConfiguration) obj;
        if (other.getTransitGatewayID() == null ^ this.getTransitGatewayID() == null)
            return false;
        if (other.getTransitGatewayID() != null && other.getTransitGatewayID().equals(this.getTransitGatewayID()) == false)
            return false;
        if (other.getRoutableCIDRSpace() == null ^ this.getRoutableCIDRSpace() == null)
            return false;
        if (other.getRoutableCIDRSpace() != null && other.getRoutableCIDRSpace().equals(this.getRoutableCIDRSpace()) == false)
            return false;
        if (other.getAttachmentNetworkAclConfiguration() == null ^ this.getAttachmentNetworkAclConfiguration() == null)
            return false;
        if (other.getAttachmentNetworkAclConfiguration() != null
                && other.getAttachmentNetworkAclConfiguration().equals(this.getAttachmentNetworkAclConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTransitGatewayID() == null) ? 0 : getTransitGatewayID().hashCode());
        hashCode = prime * hashCode + ((getRoutableCIDRSpace() == null) ? 0 : getRoutableCIDRSpace().hashCode());
        hashCode = prime * hashCode + ((getAttachmentNetworkAclConfiguration() == null) ? 0 : getAttachmentNetworkAclConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public TransitGatewayConfiguration clone() {
        try {
            return (TransitGatewayConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.finspace.model.transform.TransitGatewayConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
