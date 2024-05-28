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

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.AdvertiseByoipCidrRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AdvertiseByoipCidrRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<AdvertiseByoipCidrRequest> {

    /**
     * <p>
     * The address range, in CIDR notation. This must be the exact range that you provisioned. You can't advertise only
     * a portion of the provisioned range.
     * </p>
     */
    private String cidr;
    /**
     * <p>
     * The public 2-byte or 4-byte ASN that you want to advertise.
     * </p>
     */
    private String asn;
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
     * The address range, in CIDR notation. This must be the exact range that you provisioned. You can't advertise only
     * a portion of the provisioned range.
     * </p>
     * 
     * @param cidr
     *        The address range, in CIDR notation. This must be the exact range that you provisioned. You can't
     *        advertise only a portion of the provisioned range.
     */

    public void setCidr(String cidr) {
        this.cidr = cidr;
    }

    /**
     * <p>
     * The address range, in CIDR notation. This must be the exact range that you provisioned. You can't advertise only
     * a portion of the provisioned range.
     * </p>
     * 
     * @return The address range, in CIDR notation. This must be the exact range that you provisioned. You can't
     *         advertise only a portion of the provisioned range.
     */

    public String getCidr() {
        return this.cidr;
    }

    /**
     * <p>
     * The address range, in CIDR notation. This must be the exact range that you provisioned. You can't advertise only
     * a portion of the provisioned range.
     * </p>
     * 
     * @param cidr
     *        The address range, in CIDR notation. This must be the exact range that you provisioned. You can't
     *        advertise only a portion of the provisioned range.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdvertiseByoipCidrRequest withCidr(String cidr) {
        setCidr(cidr);
        return this;
    }

    /**
     * <p>
     * The public 2-byte or 4-byte ASN that you want to advertise.
     * </p>
     * 
     * @param asn
     *        The public 2-byte or 4-byte ASN that you want to advertise.
     */

    public void setAsn(String asn) {
        this.asn = asn;
    }

    /**
     * <p>
     * The public 2-byte or 4-byte ASN that you want to advertise.
     * </p>
     * 
     * @return The public 2-byte or 4-byte ASN that you want to advertise.
     */

    public String getAsn() {
        return this.asn;
    }

    /**
     * <p>
     * The public 2-byte or 4-byte ASN that you want to advertise.
     * </p>
     * 
     * @param asn
     *        The public 2-byte or 4-byte ASN that you want to advertise.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdvertiseByoipCidrRequest withAsn(String asn) {
        setAsn(asn);
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

    public AdvertiseByoipCidrRequest withNetworkBorderGroup(String networkBorderGroup) {
        setNetworkBorderGroup(networkBorderGroup);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<AdvertiseByoipCidrRequest> getDryRunRequest() {
        Request<AdvertiseByoipCidrRequest> request = new AdvertiseByoipCidrRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getAsn() != null)
            sb.append("Asn: ").append(getAsn()).append(",");
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

        if (obj instanceof AdvertiseByoipCidrRequest == false)
            return false;
        AdvertiseByoipCidrRequest other = (AdvertiseByoipCidrRequest) obj;
        if (other.getCidr() == null ^ this.getCidr() == null)
            return false;
        if (other.getCidr() != null && other.getCidr().equals(this.getCidr()) == false)
            return false;
        if (other.getAsn() == null ^ this.getAsn() == null)
            return false;
        if (other.getAsn() != null && other.getAsn().equals(this.getAsn()) == false)
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
        hashCode = prime * hashCode + ((getAsn() == null) ? 0 : getAsn().hashCode());
        hashCode = prime * hashCode + ((getNetworkBorderGroup() == null) ? 0 : getNetworkBorderGroup().hashCode());
        return hashCode;
    }

    @Override
    public AdvertiseByoipCidrRequest clone() {
        return (AdvertiseByoipCidrRequest) super.clone();
    }
}
