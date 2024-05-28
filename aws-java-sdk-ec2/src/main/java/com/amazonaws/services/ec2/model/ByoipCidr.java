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

/**
 * <p>
 * Information about an address range that is provisioned for use with your Amazon Web Services resources through bring
 * your own IP addresses (BYOIP).
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ByoipCidr" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ByoipCidr implements Serializable, Cloneable {

    /**
     * <p>
     * The address range, in CIDR notation.
     * </p>
     */
    private String cidr;
    /**
     * <p>
     * The description of the address range.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The BYOIP CIDR associations with ASNs.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<AsnAssociation> asnAssociations;
    /**
     * <p>
     * Upon success, contains the ID of the address pool. Otherwise, contains an error message.
     * </p>
     */
    private String statusMessage;
    /**
     * <p>
     * The state of the address pool.
     * </p>
     */
    private String state;
    /**
     * <p>
     * If you have <a href="https://docs.aws.amazon.com/local-zones/latest/ug/how-local-zones-work.html">Local Zones</a>
     * enabled, you can choose a network border group for Local Zones when you provision and advertise a BYOIPv4 CIDR.
     * Choose the network border group carefully as the EIP and the Amazon Web Services resource it is associated with
     * must reside in the same network border group.
     * </p>
     * <p>
     * You can provision BYOIP address ranges to and advertise them in the following Local Zone network border groups:
     * </p>
     * <ul>
     * <li>
     * <p>
     * us-east-1-dfw-2
     * </p>
     * </li>
     * <li>
     * <p>
     * us-west-2-lax-1
     * </p>
     * </li>
     * <li>
     * <p>
     * us-west-2-phx-2
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * You cannot provision or advertise BYOIPv6 address ranges in Local Zones at this time.
     * </p>
     * </note>
     */
    private String networkBorderGroup;

    /**
     * <p>
     * The address range, in CIDR notation.
     * </p>
     * 
     * @param cidr
     *        The address range, in CIDR notation.
     */

    public void setCidr(String cidr) {
        this.cidr = cidr;
    }

    /**
     * <p>
     * The address range, in CIDR notation.
     * </p>
     * 
     * @return The address range, in CIDR notation.
     */

    public String getCidr() {
        return this.cidr;
    }

    /**
     * <p>
     * The address range, in CIDR notation.
     * </p>
     * 
     * @param cidr
     *        The address range, in CIDR notation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ByoipCidr withCidr(String cidr) {
        setCidr(cidr);
        return this;
    }

    /**
     * <p>
     * The description of the address range.
     * </p>
     * 
     * @param description
     *        The description of the address range.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the address range.
     * </p>
     * 
     * @return The description of the address range.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the address range.
     * </p>
     * 
     * @param description
     *        The description of the address range.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ByoipCidr withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The BYOIP CIDR associations with ASNs.
     * </p>
     * 
     * @return The BYOIP CIDR associations with ASNs.
     */

    public java.util.List<AsnAssociation> getAsnAssociations() {
        if (asnAssociations == null) {
            asnAssociations = new com.amazonaws.internal.SdkInternalList<AsnAssociation>();
        }
        return asnAssociations;
    }

    /**
     * <p>
     * The BYOIP CIDR associations with ASNs.
     * </p>
     * 
     * @param asnAssociations
     *        The BYOIP CIDR associations with ASNs.
     */

    public void setAsnAssociations(java.util.Collection<AsnAssociation> asnAssociations) {
        if (asnAssociations == null) {
            this.asnAssociations = null;
            return;
        }

        this.asnAssociations = new com.amazonaws.internal.SdkInternalList<AsnAssociation>(asnAssociations);
    }

    /**
     * <p>
     * The BYOIP CIDR associations with ASNs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAsnAssociations(java.util.Collection)} or {@link #withAsnAssociations(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param asnAssociations
     *        The BYOIP CIDR associations with ASNs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ByoipCidr withAsnAssociations(AsnAssociation... asnAssociations) {
        if (this.asnAssociations == null) {
            setAsnAssociations(new com.amazonaws.internal.SdkInternalList<AsnAssociation>(asnAssociations.length));
        }
        for (AsnAssociation ele : asnAssociations) {
            this.asnAssociations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The BYOIP CIDR associations with ASNs.
     * </p>
     * 
     * @param asnAssociations
     *        The BYOIP CIDR associations with ASNs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ByoipCidr withAsnAssociations(java.util.Collection<AsnAssociation> asnAssociations) {
        setAsnAssociations(asnAssociations);
        return this;
    }

    /**
     * <p>
     * Upon success, contains the ID of the address pool. Otherwise, contains an error message.
     * </p>
     * 
     * @param statusMessage
     *        Upon success, contains the ID of the address pool. Otherwise, contains an error message.
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * Upon success, contains the ID of the address pool. Otherwise, contains an error message.
     * </p>
     * 
     * @return Upon success, contains the ID of the address pool. Otherwise, contains an error message.
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * Upon success, contains the ID of the address pool. Otherwise, contains an error message.
     * </p>
     * 
     * @param statusMessage
     *        Upon success, contains the ID of the address pool. Otherwise, contains an error message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ByoipCidr withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
        return this;
    }

    /**
     * <p>
     * The state of the address pool.
     * </p>
     * 
     * @param state
     *        The state of the address pool.
     * @see ByoipCidrState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the address pool.
     * </p>
     * 
     * @return The state of the address pool.
     * @see ByoipCidrState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the address pool.
     * </p>
     * 
     * @param state
     *        The state of the address pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ByoipCidrState
     */

    public ByoipCidr withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of the address pool.
     * </p>
     * 
     * @param state
     *        The state of the address pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ByoipCidrState
     */

    public ByoipCidr withState(ByoipCidrState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * If you have <a href="https://docs.aws.amazon.com/local-zones/latest/ug/how-local-zones-work.html">Local Zones</a>
     * enabled, you can choose a network border group for Local Zones when you provision and advertise a BYOIPv4 CIDR.
     * Choose the network border group carefully as the EIP and the Amazon Web Services resource it is associated with
     * must reside in the same network border group.
     * </p>
     * <p>
     * You can provision BYOIP address ranges to and advertise them in the following Local Zone network border groups:
     * </p>
     * <ul>
     * <li>
     * <p>
     * us-east-1-dfw-2
     * </p>
     * </li>
     * <li>
     * <p>
     * us-west-2-lax-1
     * </p>
     * </li>
     * <li>
     * <p>
     * us-west-2-phx-2
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * You cannot provision or advertise BYOIPv6 address ranges in Local Zones at this time.
     * </p>
     * </note>
     * 
     * @param networkBorderGroup
     *        If you have <a href="https://docs.aws.amazon.com/local-zones/latest/ug/how-local-zones-work.html">Local
     *        Zones</a> enabled, you can choose a network border group for Local Zones when you provision and advertise
     *        a BYOIPv4 CIDR. Choose the network border group carefully as the EIP and the Amazon Web Services resource
     *        it is associated with must reside in the same network border group.</p>
     *        <p>
     *        You can provision BYOIP address ranges to and advertise them in the following Local Zone network border
     *        groups:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        us-east-1-dfw-2
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        us-west-2-lax-1
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        us-west-2-phx-2
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        You cannot provision or advertise BYOIPv6 address ranges in Local Zones at this time.
     *        </p>
     */

    public void setNetworkBorderGroup(String networkBorderGroup) {
        this.networkBorderGroup = networkBorderGroup;
    }

    /**
     * <p>
     * If you have <a href="https://docs.aws.amazon.com/local-zones/latest/ug/how-local-zones-work.html">Local Zones</a>
     * enabled, you can choose a network border group for Local Zones when you provision and advertise a BYOIPv4 CIDR.
     * Choose the network border group carefully as the EIP and the Amazon Web Services resource it is associated with
     * must reside in the same network border group.
     * </p>
     * <p>
     * You can provision BYOIP address ranges to and advertise them in the following Local Zone network border groups:
     * </p>
     * <ul>
     * <li>
     * <p>
     * us-east-1-dfw-2
     * </p>
     * </li>
     * <li>
     * <p>
     * us-west-2-lax-1
     * </p>
     * </li>
     * <li>
     * <p>
     * us-west-2-phx-2
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * You cannot provision or advertise BYOIPv6 address ranges in Local Zones at this time.
     * </p>
     * </note>
     * 
     * @return If you have <a href="https://docs.aws.amazon.com/local-zones/latest/ug/how-local-zones-work.html">Local
     *         Zones</a> enabled, you can choose a network border group for Local Zones when you provision and advertise
     *         a BYOIPv4 CIDR. Choose the network border group carefully as the EIP and the Amazon Web Services resource
     *         it is associated with must reside in the same network border group.</p>
     *         <p>
     *         You can provision BYOIP address ranges to and advertise them in the following Local Zone network border
     *         groups:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         us-east-1-dfw-2
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         us-west-2-lax-1
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         us-west-2-phx-2
     *         </p>
     *         </li>
     *         </ul>
     *         <note>
     *         <p>
     *         You cannot provision or advertise BYOIPv6 address ranges in Local Zones at this time.
     *         </p>
     */

    public String getNetworkBorderGroup() {
        return this.networkBorderGroup;
    }

    /**
     * <p>
     * If you have <a href="https://docs.aws.amazon.com/local-zones/latest/ug/how-local-zones-work.html">Local Zones</a>
     * enabled, you can choose a network border group for Local Zones when you provision and advertise a BYOIPv4 CIDR.
     * Choose the network border group carefully as the EIP and the Amazon Web Services resource it is associated with
     * must reside in the same network border group.
     * </p>
     * <p>
     * You can provision BYOIP address ranges to and advertise them in the following Local Zone network border groups:
     * </p>
     * <ul>
     * <li>
     * <p>
     * us-east-1-dfw-2
     * </p>
     * </li>
     * <li>
     * <p>
     * us-west-2-lax-1
     * </p>
     * </li>
     * <li>
     * <p>
     * us-west-2-phx-2
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * You cannot provision or advertise BYOIPv6 address ranges in Local Zones at this time.
     * </p>
     * </note>
     * 
     * @param networkBorderGroup
     *        If you have <a href="https://docs.aws.amazon.com/local-zones/latest/ug/how-local-zones-work.html">Local
     *        Zones</a> enabled, you can choose a network border group for Local Zones when you provision and advertise
     *        a BYOIPv4 CIDR. Choose the network border group carefully as the EIP and the Amazon Web Services resource
     *        it is associated with must reside in the same network border group.</p>
     *        <p>
     *        You can provision BYOIP address ranges to and advertise them in the following Local Zone network border
     *        groups:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        us-east-1-dfw-2
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        us-west-2-lax-1
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        us-west-2-phx-2
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        You cannot provision or advertise BYOIPv6 address ranges in Local Zones at this time.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ByoipCidr withNetworkBorderGroup(String networkBorderGroup) {
        setNetworkBorderGroup(networkBorderGroup);
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
        if (getCidr() != null)
            sb.append("Cidr: ").append(getCidr()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getAsnAssociations() != null)
            sb.append("AsnAssociations: ").append(getAsnAssociations()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append(getStatusMessage()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getNetworkBorderGroup() != null)
            sb.append("NetworkBorderGroup: ").append(getNetworkBorderGroup());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ByoipCidr == false)
            return false;
        ByoipCidr other = (ByoipCidr) obj;
        if (other.getCidr() == null ^ this.getCidr() == null)
            return false;
        if (other.getCidr() != null && other.getCidr().equals(this.getCidr()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getAsnAssociations() == null ^ this.getAsnAssociations() == null)
            return false;
        if (other.getAsnAssociations() != null && other.getAsnAssociations().equals(this.getAsnAssociations()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getNetworkBorderGroup() == null ^ this.getNetworkBorderGroup() == null)
            return false;
        if (other.getNetworkBorderGroup() != null && other.getNetworkBorderGroup().equals(this.getNetworkBorderGroup()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCidr() == null) ? 0 : getCidr().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getAsnAssociations() == null) ? 0 : getAsnAssociations().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getNetworkBorderGroup() == null) ? 0 : getNetworkBorderGroup().hashCode());
        return hashCode;
    }

    @Override
    public ByoipCidr clone() {
        try {
            return (ByoipCidr) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
