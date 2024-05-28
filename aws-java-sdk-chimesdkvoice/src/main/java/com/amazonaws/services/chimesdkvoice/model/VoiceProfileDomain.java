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
package com.amazonaws.services.chimesdkvoice.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A collection of voice profiles.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/VoiceProfileDomain" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VoiceProfileDomain implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the voice profile domain.
     * </p>
     */
    private String voiceProfileDomainId;
    /**
     * <p>
     * The voice profile domain's Amazon Resource Number (ARN).
     * </p>
     */
    private String voiceProfileDomainArn;
    /**
     * <p>
     * The name of the voice profile domain.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The description of the voice profile domain.
     * </p>
     */
    private String description;
    /**
     * <p>
     * A structure that contains the configuration settings for server-side encryption.
     * </p>
     */
    private ServerSideEncryptionConfiguration serverSideEncryptionConfiguration;
    /**
     * <p>
     * The time at which the voice profile domain was created.
     * </p>
     */
    private java.util.Date createdTimestamp;
    /**
     * <p>
     * The time at which the voice profile was last updated.
     * </p>
     */
    private java.util.Date updatedTimestamp;

    /**
     * <p>
     * The ID of the voice profile domain.
     * </p>
     * 
     * @param voiceProfileDomainId
     *        The ID of the voice profile domain.
     */

    public void setVoiceProfileDomainId(String voiceProfileDomainId) {
        this.voiceProfileDomainId = voiceProfileDomainId;
    }

    /**
     * <p>
     * The ID of the voice profile domain.
     * </p>
     * 
     * @return The ID of the voice profile domain.
     */

    public String getVoiceProfileDomainId() {
        return this.voiceProfileDomainId;
    }

    /**
     * <p>
     * The ID of the voice profile domain.
     * </p>
     * 
     * @param voiceProfileDomainId
     *        The ID of the voice profile domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VoiceProfileDomain withVoiceProfileDomainId(String voiceProfileDomainId) {
        setVoiceProfileDomainId(voiceProfileDomainId);
        return this;
    }

    /**
     * <p>
     * The voice profile domain's Amazon Resource Number (ARN).
     * </p>
     * 
     * @param voiceProfileDomainArn
     *        The voice profile domain's Amazon Resource Number (ARN).
     */

    public void setVoiceProfileDomainArn(String voiceProfileDomainArn) {
        this.voiceProfileDomainArn = voiceProfileDomainArn;
    }

    /**
     * <p>
     * The voice profile domain's Amazon Resource Number (ARN).
     * </p>
     * 
     * @return The voice profile domain's Amazon Resource Number (ARN).
     */

    public String getVoiceProfileDomainArn() {
        return this.voiceProfileDomainArn;
    }

    /**
     * <p>
     * The voice profile domain's Amazon Resource Number (ARN).
     * </p>
     * 
     * @param voiceProfileDomainArn
     *        The voice profile domain's Amazon Resource Number (ARN).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VoiceProfileDomain withVoiceProfileDomainArn(String voiceProfileDomainArn) {
        setVoiceProfileDomainArn(voiceProfileDomainArn);
        return this;
    }

    /**
     * <p>
     * The name of the voice profile domain.
     * </p>
     * 
     * @param name
     *        The name of the voice profile domain.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the voice profile domain.
     * </p>
     * 
     * @return The name of the voice profile domain.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the voice profile domain.
     * </p>
     * 
     * @param name
     *        The name of the voice profile domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VoiceProfileDomain withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The description of the voice profile domain.
     * </p>
     * 
     * @param description
     *        The description of the voice profile domain.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the voice profile domain.
     * </p>
     * 
     * @return The description of the voice profile domain.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the voice profile domain.
     * </p>
     * 
     * @param description
     *        The description of the voice profile domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VoiceProfileDomain withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A structure that contains the configuration settings for server-side encryption.
     * </p>
     * 
     * @param serverSideEncryptionConfiguration
     *        A structure that contains the configuration settings for server-side encryption.
     */

    public void setServerSideEncryptionConfiguration(ServerSideEncryptionConfiguration serverSideEncryptionConfiguration) {
        this.serverSideEncryptionConfiguration = serverSideEncryptionConfiguration;
    }

    /**
     * <p>
     * A structure that contains the configuration settings for server-side encryption.
     * </p>
     * 
     * @return A structure that contains the configuration settings for server-side encryption.
     */

    public ServerSideEncryptionConfiguration getServerSideEncryptionConfiguration() {
        return this.serverSideEncryptionConfiguration;
    }

    /**
     * <p>
     * A structure that contains the configuration settings for server-side encryption.
     * </p>
     * 
     * @param serverSideEncryptionConfiguration
     *        A structure that contains the configuration settings for server-side encryption.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VoiceProfileDomain withServerSideEncryptionConfiguration(ServerSideEncryptionConfiguration serverSideEncryptionConfiguration) {
        setServerSideEncryptionConfiguration(serverSideEncryptionConfiguration);
        return this;
    }

    /**
     * <p>
     * The time at which the voice profile domain was created.
     * </p>
     * 
     * @param createdTimestamp
     *        The time at which the voice profile domain was created.
     */

    public void setCreatedTimestamp(java.util.Date createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }

    /**
     * <p>
     * The time at which the voice profile domain was created.
     * </p>
     * 
     * @return The time at which the voice profile domain was created.
     */

    public java.util.Date getCreatedTimestamp() {
        return this.createdTimestamp;
    }

    /**
     * <p>
     * The time at which the voice profile domain was created.
     * </p>
     * 
     * @param createdTimestamp
     *        The time at which the voice profile domain was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VoiceProfileDomain withCreatedTimestamp(java.util.Date createdTimestamp) {
        setCreatedTimestamp(createdTimestamp);
        return this;
    }

    /**
     * <p>
     * The time at which the voice profile was last updated.
     * </p>
     * 
     * @param updatedTimestamp
     *        The time at which the voice profile was last updated.
     */

    public void setUpdatedTimestamp(java.util.Date updatedTimestamp) {
        this.updatedTimestamp = updatedTimestamp;
    }

    /**
     * <p>
     * The time at which the voice profile was last updated.
     * </p>
     * 
     * @return The time at which the voice profile was last updated.
     */

    public java.util.Date getUpdatedTimestamp() {
        return this.updatedTimestamp;
    }

    /**
     * <p>
     * The time at which the voice profile was last updated.
     * </p>
     * 
     * @param updatedTimestamp
     *        The time at which the voice profile was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VoiceProfileDomain withUpdatedTimestamp(java.util.Date updatedTimestamp) {
        setUpdatedTimestamp(updatedTimestamp);
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
        if (getVoiceProfileDomainId() != null)
            sb.append("VoiceProfileDomainId: ").append(getVoiceProfileDomainId()).append(",");
        if (getVoiceProfileDomainArn() != null)
            sb.append("VoiceProfileDomainArn: ").append("***Sensitive Data Redacted***").append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getServerSideEncryptionConfiguration() != null)
            sb.append("ServerSideEncryptionConfiguration: ").append(getServerSideEncryptionConfiguration()).append(",");
        if (getCreatedTimestamp() != null)
            sb.append("CreatedTimestamp: ").append(getCreatedTimestamp()).append(",");
        if (getUpdatedTimestamp() != null)
            sb.append("UpdatedTimestamp: ").append(getUpdatedTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VoiceProfileDomain == false)
            return false;
        VoiceProfileDomain other = (VoiceProfileDomain) obj;
        if (other.getVoiceProfileDomainId() == null ^ this.getVoiceProfileDomainId() == null)
            return false;
        if (other.getVoiceProfileDomainId() != null && other.getVoiceProfileDomainId().equals(this.getVoiceProfileDomainId()) == false)
            return false;
        if (other.getVoiceProfileDomainArn() == null ^ this.getVoiceProfileDomainArn() == null)
            return false;
        if (other.getVoiceProfileDomainArn() != null && other.getVoiceProfileDomainArn().equals(this.getVoiceProfileDomainArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getServerSideEncryptionConfiguration() == null ^ this.getServerSideEncryptionConfiguration() == null)
            return false;
        if (other.getServerSideEncryptionConfiguration() != null
                && other.getServerSideEncryptionConfiguration().equals(this.getServerSideEncryptionConfiguration()) == false)
            return false;
        if (other.getCreatedTimestamp() == null ^ this.getCreatedTimestamp() == null)
            return false;
        if (other.getCreatedTimestamp() != null && other.getCreatedTimestamp().equals(this.getCreatedTimestamp()) == false)
            return false;
        if (other.getUpdatedTimestamp() == null ^ this.getUpdatedTimestamp() == null)
            return false;
        if (other.getUpdatedTimestamp() != null && other.getUpdatedTimestamp().equals(this.getUpdatedTimestamp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVoiceProfileDomainId() == null) ? 0 : getVoiceProfileDomainId().hashCode());
        hashCode = prime * hashCode + ((getVoiceProfileDomainArn() == null) ? 0 : getVoiceProfileDomainArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getServerSideEncryptionConfiguration() == null) ? 0 : getServerSideEncryptionConfiguration().hashCode());
        hashCode = prime * hashCode + ((getCreatedTimestamp() == null) ? 0 : getCreatedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getUpdatedTimestamp() == null) ? 0 : getUpdatedTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public VoiceProfileDomain clone() {
        try {
            return (VoiceProfileDomain) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chimesdkvoice.model.transform.VoiceProfileDomainMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
