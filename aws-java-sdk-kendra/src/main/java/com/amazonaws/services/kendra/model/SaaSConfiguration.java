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
package com.amazonaws.services.kendra.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides the configuration information to connect to GitHub Enterprise Cloud (SaaS).
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/SaaSConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SaaSConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the organization of the GitHub Enterprise Cloud (SaaS) account you want to connect to. You can find
     * your organization name by logging into GitHub desktop and selecting <b>Your organizations</b> under your profile
     * picture dropdown.
     * </p>
     */
    private String organizationName;
    /**
     * <p>
     * The GitHub host URL or API endpoint URL. For example, <i>https://api.github.com</i>.
     * </p>
     */
    private String hostUrl;

    /**
     * <p>
     * The name of the organization of the GitHub Enterprise Cloud (SaaS) account you want to connect to. You can find
     * your organization name by logging into GitHub desktop and selecting <b>Your organizations</b> under your profile
     * picture dropdown.
     * </p>
     * 
     * @param organizationName
     *        The name of the organization of the GitHub Enterprise Cloud (SaaS) account you want to connect to. You can
     *        find your organization name by logging into GitHub desktop and selecting <b>Your organizations</b> under
     *        your profile picture dropdown.
     */

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    /**
     * <p>
     * The name of the organization of the GitHub Enterprise Cloud (SaaS) account you want to connect to. You can find
     * your organization name by logging into GitHub desktop and selecting <b>Your organizations</b> under your profile
     * picture dropdown.
     * </p>
     * 
     * @return The name of the organization of the GitHub Enterprise Cloud (SaaS) account you want to connect to. You
     *         can find your organization name by logging into GitHub desktop and selecting <b>Your organizations</b>
     *         under your profile picture dropdown.
     */

    public String getOrganizationName() {
        return this.organizationName;
    }

    /**
     * <p>
     * The name of the organization of the GitHub Enterprise Cloud (SaaS) account you want to connect to. You can find
     * your organization name by logging into GitHub desktop and selecting <b>Your organizations</b> under your profile
     * picture dropdown.
     * </p>
     * 
     * @param organizationName
     *        The name of the organization of the GitHub Enterprise Cloud (SaaS) account you want to connect to. You can
     *        find your organization name by logging into GitHub desktop and selecting <b>Your organizations</b> under
     *        your profile picture dropdown.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SaaSConfiguration withOrganizationName(String organizationName) {
        setOrganizationName(organizationName);
        return this;
    }

    /**
     * <p>
     * The GitHub host URL or API endpoint URL. For example, <i>https://api.github.com</i>.
     * </p>
     * 
     * @param hostUrl
     *        The GitHub host URL or API endpoint URL. For example, <i>https://api.github.com</i>.
     */

    public void setHostUrl(String hostUrl) {
        this.hostUrl = hostUrl;
    }

    /**
     * <p>
     * The GitHub host URL or API endpoint URL. For example, <i>https://api.github.com</i>.
     * </p>
     * 
     * @return The GitHub host URL or API endpoint URL. For example, <i>https://api.github.com</i>.
     */

    public String getHostUrl() {
        return this.hostUrl;
    }

    /**
     * <p>
     * The GitHub host URL or API endpoint URL. For example, <i>https://api.github.com</i>.
     * </p>
     * 
     * @param hostUrl
     *        The GitHub host URL or API endpoint URL. For example, <i>https://api.github.com</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SaaSConfiguration withHostUrl(String hostUrl) {
        setHostUrl(hostUrl);
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
        if (getOrganizationName() != null)
            sb.append("OrganizationName: ").append(getOrganizationName()).append(",");
        if (getHostUrl() != null)
            sb.append("HostUrl: ").append(getHostUrl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SaaSConfiguration == false)
            return false;
        SaaSConfiguration other = (SaaSConfiguration) obj;
        if (other.getOrganizationName() == null ^ this.getOrganizationName() == null)
            return false;
        if (other.getOrganizationName() != null && other.getOrganizationName().equals(this.getOrganizationName()) == false)
            return false;
        if (other.getHostUrl() == null ^ this.getHostUrl() == null)
            return false;
        if (other.getHostUrl() != null && other.getHostUrl().equals(this.getHostUrl()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOrganizationName() == null) ? 0 : getOrganizationName().hashCode());
        hashCode = prime * hashCode + ((getHostUrl() == null) ? 0 : getHostUrl().hashCode());
        return hashCode;
    }

    @Override
    public SaaSConfiguration clone() {
        try {
            return (SaaSConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kendra.model.transform.SaaSConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
