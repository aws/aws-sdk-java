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
package com.amazonaws.services.workspacesweb.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The summary of IP access settings.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/IpAccessSettingsSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IpAccessSettingsSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The creation date timestamp of the IP access settings.
     * </p>
     */
    private java.util.Date creationDate;
    /**
     * <p>
     * The description of the IP access settings.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The display name of the IP access settings.
     * </p>
     */
    private String displayName;
    /**
     * <p>
     * The ARN of IP access settings.
     * </p>
     */
    private String ipAccessSettingsArn;

    /**
     * <p>
     * The creation date timestamp of the IP access settings.
     * </p>
     * 
     * @param creationDate
     *        The creation date timestamp of the IP access settings.
     */

    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The creation date timestamp of the IP access settings.
     * </p>
     * 
     * @return The creation date timestamp of the IP access settings.
     */

    public java.util.Date getCreationDate() {
        return this.creationDate;
    }

    /**
     * <p>
     * The creation date timestamp of the IP access settings.
     * </p>
     * 
     * @param creationDate
     *        The creation date timestamp of the IP access settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpAccessSettingsSummary withCreationDate(java.util.Date creationDate) {
        setCreationDate(creationDate);
        return this;
    }

    /**
     * <p>
     * The description of the IP access settings.
     * </p>
     * 
     * @param description
     *        The description of the IP access settings.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the IP access settings.
     * </p>
     * 
     * @return The description of the IP access settings.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the IP access settings.
     * </p>
     * 
     * @param description
     *        The description of the IP access settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpAccessSettingsSummary withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The display name of the IP access settings.
     * </p>
     * 
     * @param displayName
     *        The display name of the IP access settings.
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The display name of the IP access settings.
     * </p>
     * 
     * @return The display name of the IP access settings.
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * The display name of the IP access settings.
     * </p>
     * 
     * @param displayName
     *        The display name of the IP access settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpAccessSettingsSummary withDisplayName(String displayName) {
        setDisplayName(displayName);
        return this;
    }

    /**
     * <p>
     * The ARN of IP access settings.
     * </p>
     * 
     * @param ipAccessSettingsArn
     *        The ARN of IP access settings.
     */

    public void setIpAccessSettingsArn(String ipAccessSettingsArn) {
        this.ipAccessSettingsArn = ipAccessSettingsArn;
    }

    /**
     * <p>
     * The ARN of IP access settings.
     * </p>
     * 
     * @return The ARN of IP access settings.
     */

    public String getIpAccessSettingsArn() {
        return this.ipAccessSettingsArn;
    }

    /**
     * <p>
     * The ARN of IP access settings.
     * </p>
     * 
     * @param ipAccessSettingsArn
     *        The ARN of IP access settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpAccessSettingsSummary withIpAccessSettingsArn(String ipAccessSettingsArn) {
        setIpAccessSettingsArn(ipAccessSettingsArn);
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
        if (getCreationDate() != null)
            sb.append("CreationDate: ").append(getCreationDate()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append("***Sensitive Data Redacted***").append(",");
        if (getDisplayName() != null)
            sb.append("DisplayName: ").append("***Sensitive Data Redacted***").append(",");
        if (getIpAccessSettingsArn() != null)
            sb.append("IpAccessSettingsArn: ").append(getIpAccessSettingsArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IpAccessSettingsSummary == false)
            return false;
        IpAccessSettingsSummary other = (IpAccessSettingsSummary) obj;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getIpAccessSettingsArn() == null ^ this.getIpAccessSettingsArn() == null)
            return false;
        if (other.getIpAccessSettingsArn() != null && other.getIpAccessSettingsArn().equals(this.getIpAccessSettingsArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getIpAccessSettingsArn() == null) ? 0 : getIpAccessSettingsArn().hashCode());
        return hashCode;
    }

    @Override
    public IpAccessSettingsSummary clone() {
        try {
            return (IpAccessSettingsSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.workspacesweb.model.transform.IpAccessSettingsSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
