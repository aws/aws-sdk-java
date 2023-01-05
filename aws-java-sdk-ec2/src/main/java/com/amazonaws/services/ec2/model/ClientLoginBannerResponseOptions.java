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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Current state of options for customizable text banner that will be displayed on Amazon Web Services provided clients
 * when a VPN session is established.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ClientLoginBannerResponseOptions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ClientLoginBannerResponseOptions implements Serializable, Cloneable {

    /**
     * <p>
     * Current state of text banner feature.
     * </p>
     * <p>
     * Valid values: <code>true | false</code>
     * </p>
     */
    private Boolean enabled;
    /**
     * <p>
     * Customizable text that will be displayed in a banner on Amazon Web Services provided clients when a VPN session
     * is established. UTF-8 encoded characters only. Maximum of 1400 characters.
     * </p>
     */
    private String bannerText;

    /**
     * <p>
     * Current state of text banner feature.
     * </p>
     * <p>
     * Valid values: <code>true | false</code>
     * </p>
     * 
     * @param enabled
     *        Current state of text banner feature.</p>
     *        <p>
     *        Valid values: <code>true | false</code>
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Current state of text banner feature.
     * </p>
     * <p>
     * Valid values: <code>true | false</code>
     * </p>
     * 
     * @return Current state of text banner feature.</p>
     *         <p>
     *         Valid values: <code>true | false</code>
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Current state of text banner feature.
     * </p>
     * <p>
     * Valid values: <code>true | false</code>
     * </p>
     * 
     * @param enabled
     *        Current state of text banner feature.</p>
     *        <p>
     *        Valid values: <code>true | false</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClientLoginBannerResponseOptions withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * Current state of text banner feature.
     * </p>
     * <p>
     * Valid values: <code>true | false</code>
     * </p>
     * 
     * @return Current state of text banner feature.</p>
     *         <p>
     *         Valid values: <code>true | false</code>
     */

    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Customizable text that will be displayed in a banner on Amazon Web Services provided clients when a VPN session
     * is established. UTF-8 encoded characters only. Maximum of 1400 characters.
     * </p>
     * 
     * @param bannerText
     *        Customizable text that will be displayed in a banner on Amazon Web Services provided clients when a VPN
     *        session is established. UTF-8 encoded characters only. Maximum of 1400 characters.
     */

    public void setBannerText(String bannerText) {
        this.bannerText = bannerText;
    }

    /**
     * <p>
     * Customizable text that will be displayed in a banner on Amazon Web Services provided clients when a VPN session
     * is established. UTF-8 encoded characters only. Maximum of 1400 characters.
     * </p>
     * 
     * @return Customizable text that will be displayed in a banner on Amazon Web Services provided clients when a VPN
     *         session is established. UTF-8 encoded characters only. Maximum of 1400 characters.
     */

    public String getBannerText() {
        return this.bannerText;
    }

    /**
     * <p>
     * Customizable text that will be displayed in a banner on Amazon Web Services provided clients when a VPN session
     * is established. UTF-8 encoded characters only. Maximum of 1400 characters.
     * </p>
     * 
     * @param bannerText
     *        Customizable text that will be displayed in a banner on Amazon Web Services provided clients when a VPN
     *        session is established. UTF-8 encoded characters only. Maximum of 1400 characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClientLoginBannerResponseOptions withBannerText(String bannerText) {
        setBannerText(bannerText);
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
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled()).append(",");
        if (getBannerText() != null)
            sb.append("BannerText: ").append(getBannerText());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ClientLoginBannerResponseOptions == false)
            return false;
        ClientLoginBannerResponseOptions other = (ClientLoginBannerResponseOptions) obj;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getBannerText() == null ^ this.getBannerText() == null)
            return false;
        if (other.getBannerText() != null && other.getBannerText().equals(this.getBannerText()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getBannerText() == null) ? 0 : getBannerText().hashCode());
        return hashCode;
    }

    @Override
    public ClientLoginBannerResponseOptions clone() {
        try {
            return (ClientLoginBannerResponseOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
