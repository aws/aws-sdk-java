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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/CreateSiteToSiteVpnAttachment"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateSiteToSiteVpnAttachmentResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * Details about a site-to-site VPN attachment.
     * </p>
     */
    private SiteToSiteVpnAttachment siteToSiteVpnAttachment;

    /**
     * <p>
     * Details about a site-to-site VPN attachment.
     * </p>
     * 
     * @param siteToSiteVpnAttachment
     *        Details about a site-to-site VPN attachment.
     */

    public void setSiteToSiteVpnAttachment(SiteToSiteVpnAttachment siteToSiteVpnAttachment) {
        this.siteToSiteVpnAttachment = siteToSiteVpnAttachment;
    }

    /**
     * <p>
     * Details about a site-to-site VPN attachment.
     * </p>
     * 
     * @return Details about a site-to-site VPN attachment.
     */

    public SiteToSiteVpnAttachment getSiteToSiteVpnAttachment() {
        return this.siteToSiteVpnAttachment;
    }

    /**
     * <p>
     * Details about a site-to-site VPN attachment.
     * </p>
     * 
     * @param siteToSiteVpnAttachment
     *        Details about a site-to-site VPN attachment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSiteToSiteVpnAttachmentResult withSiteToSiteVpnAttachment(SiteToSiteVpnAttachment siteToSiteVpnAttachment) {
        setSiteToSiteVpnAttachment(siteToSiteVpnAttachment);
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
        if (getSiteToSiteVpnAttachment() != null)
            sb.append("SiteToSiteVpnAttachment: ").append(getSiteToSiteVpnAttachment());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateSiteToSiteVpnAttachmentResult == false)
            return false;
        CreateSiteToSiteVpnAttachmentResult other = (CreateSiteToSiteVpnAttachmentResult) obj;
        if (other.getSiteToSiteVpnAttachment() == null ^ this.getSiteToSiteVpnAttachment() == null)
            return false;
        if (other.getSiteToSiteVpnAttachment() != null && other.getSiteToSiteVpnAttachment().equals(this.getSiteToSiteVpnAttachment()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSiteToSiteVpnAttachment() == null) ? 0 : getSiteToSiteVpnAttachment().hashCode());
        return hashCode;
    }

    @Override
    public CreateSiteToSiteVpnAttachmentResult clone() {
        try {
            return (CreateSiteToSiteVpnAttachmentResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
