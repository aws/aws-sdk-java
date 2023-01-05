/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.networkmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Creates a site-to-site VPN attachment.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/SiteToSiteVpnAttachment"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SiteToSiteVpnAttachment implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Provides details about a site-to-site VPN attachment.
     * </p>
     */
    private Attachment attachment;
    /**
     * <p>
     * The ARN of the site-to-site VPN attachment.
     * </p>
     */
    private String vpnConnectionArn;

    /**
     * <p>
     * Provides details about a site-to-site VPN attachment.
     * </p>
     * 
     * @param attachment
     *        Provides details about a site-to-site VPN attachment.
     */

    public void setAttachment(Attachment attachment) {
        this.attachment = attachment;
    }

    /**
     * <p>
     * Provides details about a site-to-site VPN attachment.
     * </p>
     * 
     * @return Provides details about a site-to-site VPN attachment.
     */

    public Attachment getAttachment() {
        return this.attachment;
    }

    /**
     * <p>
     * Provides details about a site-to-site VPN attachment.
     * </p>
     * 
     * @param attachment
     *        Provides details about a site-to-site VPN attachment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SiteToSiteVpnAttachment withAttachment(Attachment attachment) {
        setAttachment(attachment);
        return this;
    }

    /**
     * <p>
     * The ARN of the site-to-site VPN attachment.
     * </p>
     * 
     * @param vpnConnectionArn
     *        The ARN of the site-to-site VPN attachment.
     */

    public void setVpnConnectionArn(String vpnConnectionArn) {
        this.vpnConnectionArn = vpnConnectionArn;
    }

    /**
     * <p>
     * The ARN of the site-to-site VPN attachment.
     * </p>
     * 
     * @return The ARN of the site-to-site VPN attachment.
     */

    public String getVpnConnectionArn() {
        return this.vpnConnectionArn;
    }

    /**
     * <p>
     * The ARN of the site-to-site VPN attachment.
     * </p>
     * 
     * @param vpnConnectionArn
     *        The ARN of the site-to-site VPN attachment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SiteToSiteVpnAttachment withVpnConnectionArn(String vpnConnectionArn) {
        setVpnConnectionArn(vpnConnectionArn);
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
        if (getAttachment() != null)
            sb.append("Attachment: ").append(getAttachment()).append(",");
        if (getVpnConnectionArn() != null)
            sb.append("VpnConnectionArn: ").append(getVpnConnectionArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SiteToSiteVpnAttachment == false)
            return false;
        SiteToSiteVpnAttachment other = (SiteToSiteVpnAttachment) obj;
        if (other.getAttachment() == null ^ this.getAttachment() == null)
            return false;
        if (other.getAttachment() != null && other.getAttachment().equals(this.getAttachment()) == false)
            return false;
        if (other.getVpnConnectionArn() == null ^ this.getVpnConnectionArn() == null)
            return false;
        if (other.getVpnConnectionArn() != null && other.getVpnConnectionArn().equals(this.getVpnConnectionArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttachment() == null) ? 0 : getAttachment().hashCode());
        hashCode = prime * hashCode + ((getVpnConnectionArn() == null) ? 0 : getVpnConnectionArn().hashCode());
        return hashCode;
    }

    @Override
    public SiteToSiteVpnAttachment clone() {
        try {
            return (SiteToSiteVpnAttachment) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.networkmanager.model.transform.SiteToSiteVpnAttachmentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
