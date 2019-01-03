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
package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Google Cloud Messaging channel definition
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GCMChannelResponse" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GCMChannelResponse implements Serializable, Cloneable, StructuredPojo {

    /** The ID of the application to which the channel applies. */
    private String applicationId;
    /** When was this segment created */
    private String creationDate;
    /** The GCM API key from Google. */
    private String credential;
    /** If the channel is enabled for sending messages. */
    private Boolean enabled;
    /** Not used. Retained for backwards compatibility. */
    private Boolean hasCredential;
    /** Channel ID. Not used. Present only for backwards compatibility. */
    private String id;
    /** Is this channel archived */
    private Boolean isArchived;
    /** Who last updated this entry */
    private String lastModifiedBy;
    /** Last date this was updated */
    private String lastModifiedDate;
    /** The platform type. Will be GCM */
    private String platform;
    /** Version of channel */
    private Integer version;

    /**
     * The ID of the application to which the channel applies.
     * 
     * @param applicationId
     *        The ID of the application to which the channel applies.
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * The ID of the application to which the channel applies.
     * 
     * @return The ID of the application to which the channel applies.
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * The ID of the application to which the channel applies.
     * 
     * @param applicationId
     *        The ID of the application to which the channel applies.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GCMChannelResponse withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * When was this segment created
     * 
     * @param creationDate
     *        When was this segment created
     */

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * When was this segment created
     * 
     * @return When was this segment created
     */

    public String getCreationDate() {
        return this.creationDate;
    }

    /**
     * When was this segment created
     * 
     * @param creationDate
     *        When was this segment created
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GCMChannelResponse withCreationDate(String creationDate) {
        setCreationDate(creationDate);
        return this;
    }

    /**
     * The GCM API key from Google.
     * 
     * @param credential
     *        The GCM API key from Google.
     */

    public void setCredential(String credential) {
        this.credential = credential;
    }

    /**
     * The GCM API key from Google.
     * 
     * @return The GCM API key from Google.
     */

    public String getCredential() {
        return this.credential;
    }

    /**
     * The GCM API key from Google.
     * 
     * @param credential
     *        The GCM API key from Google.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GCMChannelResponse withCredential(String credential) {
        setCredential(credential);
        return this;
    }

    /**
     * If the channel is enabled for sending messages.
     * 
     * @param enabled
     *        If the channel is enabled for sending messages.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * If the channel is enabled for sending messages.
     * 
     * @return If the channel is enabled for sending messages.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * If the channel is enabled for sending messages.
     * 
     * @param enabled
     *        If the channel is enabled for sending messages.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GCMChannelResponse withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * If the channel is enabled for sending messages.
     * 
     * @return If the channel is enabled for sending messages.
     */

    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * Not used. Retained for backwards compatibility.
     * 
     * @param hasCredential
     *        Not used. Retained for backwards compatibility.
     */

    public void setHasCredential(Boolean hasCredential) {
        this.hasCredential = hasCredential;
    }

    /**
     * Not used. Retained for backwards compatibility.
     * 
     * @return Not used. Retained for backwards compatibility.
     */

    public Boolean getHasCredential() {
        return this.hasCredential;
    }

    /**
     * Not used. Retained for backwards compatibility.
     * 
     * @param hasCredential
     *        Not used. Retained for backwards compatibility.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GCMChannelResponse withHasCredential(Boolean hasCredential) {
        setHasCredential(hasCredential);
        return this;
    }

    /**
     * Not used. Retained for backwards compatibility.
     * 
     * @return Not used. Retained for backwards compatibility.
     */

    public Boolean isHasCredential() {
        return this.hasCredential;
    }

    /**
     * Channel ID. Not used. Present only for backwards compatibility.
     * 
     * @param id
     *        Channel ID. Not used. Present only for backwards compatibility.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * Channel ID. Not used. Present only for backwards compatibility.
     * 
     * @return Channel ID. Not used. Present only for backwards compatibility.
     */

    public String getId() {
        return this.id;
    }

    /**
     * Channel ID. Not used. Present only for backwards compatibility.
     * 
     * @param id
     *        Channel ID. Not used. Present only for backwards compatibility.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GCMChannelResponse withId(String id) {
        setId(id);
        return this;
    }

    /**
     * Is this channel archived
     * 
     * @param isArchived
     *        Is this channel archived
     */

    public void setIsArchived(Boolean isArchived) {
        this.isArchived = isArchived;
    }

    /**
     * Is this channel archived
     * 
     * @return Is this channel archived
     */

    public Boolean getIsArchived() {
        return this.isArchived;
    }

    /**
     * Is this channel archived
     * 
     * @param isArchived
     *        Is this channel archived
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GCMChannelResponse withIsArchived(Boolean isArchived) {
        setIsArchived(isArchived);
        return this;
    }

    /**
     * Is this channel archived
     * 
     * @return Is this channel archived
     */

    public Boolean isArchived() {
        return this.isArchived;
    }

    /**
     * Who last updated this entry
     * 
     * @param lastModifiedBy
     *        Who last updated this entry
     */

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    /**
     * Who last updated this entry
     * 
     * @return Who last updated this entry
     */

    public String getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
     * Who last updated this entry
     * 
     * @param lastModifiedBy
     *        Who last updated this entry
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GCMChannelResponse withLastModifiedBy(String lastModifiedBy) {
        setLastModifiedBy(lastModifiedBy);
        return this;
    }

    /**
     * Last date this was updated
     * 
     * @param lastModifiedDate
     *        Last date this was updated
     */

    public void setLastModifiedDate(String lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * Last date this was updated
     * 
     * @return Last date this was updated
     */

    public String getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    /**
     * Last date this was updated
     * 
     * @param lastModifiedDate
     *        Last date this was updated
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GCMChannelResponse withLastModifiedDate(String lastModifiedDate) {
        setLastModifiedDate(lastModifiedDate);
        return this;
    }

    /**
     * The platform type. Will be GCM
     * 
     * @param platform
     *        The platform type. Will be GCM
     */

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    /**
     * The platform type. Will be GCM
     * 
     * @return The platform type. Will be GCM
     */

    public String getPlatform() {
        return this.platform;
    }

    /**
     * The platform type. Will be GCM
     * 
     * @param platform
     *        The platform type. Will be GCM
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GCMChannelResponse withPlatform(String platform) {
        setPlatform(platform);
        return this;
    }

    /**
     * Version of channel
     * 
     * @param version
     *        Version of channel
     */

    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * Version of channel
     * 
     * @return Version of channel
     */

    public Integer getVersion() {
        return this.version;
    }

    /**
     * Version of channel
     * 
     * @param version
     *        Version of channel
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GCMChannelResponse withVersion(Integer version) {
        setVersion(version);
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
        if (getApplicationId() != null)
            sb.append("ApplicationId: ").append(getApplicationId()).append(",");
        if (getCreationDate() != null)
            sb.append("CreationDate: ").append(getCreationDate()).append(",");
        if (getCredential() != null)
            sb.append("Credential: ").append(getCredential()).append(",");
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled()).append(",");
        if (getHasCredential() != null)
            sb.append("HasCredential: ").append(getHasCredential()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getIsArchived() != null)
            sb.append("IsArchived: ").append(getIsArchived()).append(",");
        if (getLastModifiedBy() != null)
            sb.append("LastModifiedBy: ").append(getLastModifiedBy()).append(",");
        if (getLastModifiedDate() != null)
            sb.append("LastModifiedDate: ").append(getLastModifiedDate()).append(",");
        if (getPlatform() != null)
            sb.append("Platform: ").append(getPlatform()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GCMChannelResponse == false)
            return false;
        GCMChannelResponse other = (GCMChannelResponse) obj;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getCredential() == null ^ this.getCredential() == null)
            return false;
        if (other.getCredential() != null && other.getCredential().equals(this.getCredential()) == false)
            return false;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getHasCredential() == null ^ this.getHasCredential() == null)
            return false;
        if (other.getHasCredential() != null && other.getHasCredential().equals(this.getHasCredential()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getIsArchived() == null ^ this.getIsArchived() == null)
            return false;
        if (other.getIsArchived() != null && other.getIsArchived().equals(this.getIsArchived()) == false)
            return false;
        if (other.getLastModifiedBy() == null ^ this.getLastModifiedBy() == null)
            return false;
        if (other.getLastModifiedBy() != null && other.getLastModifiedBy().equals(this.getLastModifiedBy()) == false)
            return false;
        if (other.getLastModifiedDate() == null ^ this.getLastModifiedDate() == null)
            return false;
        if (other.getLastModifiedDate() != null && other.getLastModifiedDate().equals(this.getLastModifiedDate()) == false)
            return false;
        if (other.getPlatform() == null ^ this.getPlatform() == null)
            return false;
        if (other.getPlatform() != null && other.getPlatform().equals(this.getPlatform()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode + ((getCredential() == null) ? 0 : getCredential().hashCode());
        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getHasCredential() == null) ? 0 : getHasCredential().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getIsArchived() == null) ? 0 : getIsArchived().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedBy() == null) ? 0 : getLastModifiedBy().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedDate() == null) ? 0 : getLastModifiedDate().hashCode());
        hashCode = prime * hashCode + ((getPlatform() == null) ? 0 : getPlatform().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        return hashCode;
    }

    @Override
    public GCMChannelResponse clone() {
        try {
            return (GCMChannelResponse) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.GCMChannelResponseMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
