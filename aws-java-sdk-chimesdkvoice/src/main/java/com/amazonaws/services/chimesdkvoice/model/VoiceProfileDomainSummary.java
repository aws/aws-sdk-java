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
 * A high-level overview of a voice profile domain.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/VoiceProfileDomainSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VoiceProfileDomainSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the voice profile domain summary.
     * </p>
     */
    private String voiceProfileDomainId;
    /**
     * <p>
     * The ARN of a voice profile in a voice profile domain summary.
     * </p>
     */
    private String voiceProfileDomainArn;
    /**
     * <p>
     * The name of the voice profile domain summary.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Describes the voice profile domain summary.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The time at which the voice profile domain summary was created.
     * </p>
     */
    private java.util.Date createdTimestamp;
    /**
     * <p>
     * The time at which the voice profile domain summary was last updated.
     * </p>
     */
    private java.util.Date updatedTimestamp;

    /**
     * <p>
     * The ID of the voice profile domain summary.
     * </p>
     * 
     * @param voiceProfileDomainId
     *        The ID of the voice profile domain summary.
     */

    public void setVoiceProfileDomainId(String voiceProfileDomainId) {
        this.voiceProfileDomainId = voiceProfileDomainId;
    }

    /**
     * <p>
     * The ID of the voice profile domain summary.
     * </p>
     * 
     * @return The ID of the voice profile domain summary.
     */

    public String getVoiceProfileDomainId() {
        return this.voiceProfileDomainId;
    }

    /**
     * <p>
     * The ID of the voice profile domain summary.
     * </p>
     * 
     * @param voiceProfileDomainId
     *        The ID of the voice profile domain summary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VoiceProfileDomainSummary withVoiceProfileDomainId(String voiceProfileDomainId) {
        setVoiceProfileDomainId(voiceProfileDomainId);
        return this;
    }

    /**
     * <p>
     * The ARN of a voice profile in a voice profile domain summary.
     * </p>
     * 
     * @param voiceProfileDomainArn
     *        The ARN of a voice profile in a voice profile domain summary.
     */

    public void setVoiceProfileDomainArn(String voiceProfileDomainArn) {
        this.voiceProfileDomainArn = voiceProfileDomainArn;
    }

    /**
     * <p>
     * The ARN of a voice profile in a voice profile domain summary.
     * </p>
     * 
     * @return The ARN of a voice profile in a voice profile domain summary.
     */

    public String getVoiceProfileDomainArn() {
        return this.voiceProfileDomainArn;
    }

    /**
     * <p>
     * The ARN of a voice profile in a voice profile domain summary.
     * </p>
     * 
     * @param voiceProfileDomainArn
     *        The ARN of a voice profile in a voice profile domain summary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VoiceProfileDomainSummary withVoiceProfileDomainArn(String voiceProfileDomainArn) {
        setVoiceProfileDomainArn(voiceProfileDomainArn);
        return this;
    }

    /**
     * <p>
     * The name of the voice profile domain summary.
     * </p>
     * 
     * @param name
     *        The name of the voice profile domain summary.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the voice profile domain summary.
     * </p>
     * 
     * @return The name of the voice profile domain summary.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the voice profile domain summary.
     * </p>
     * 
     * @param name
     *        The name of the voice profile domain summary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VoiceProfileDomainSummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Describes the voice profile domain summary.
     * </p>
     * 
     * @param description
     *        Describes the voice profile domain summary.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Describes the voice profile domain summary.
     * </p>
     * 
     * @return Describes the voice profile domain summary.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * Describes the voice profile domain summary.
     * </p>
     * 
     * @param description
     *        Describes the voice profile domain summary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VoiceProfileDomainSummary withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The time at which the voice profile domain summary was created.
     * </p>
     * 
     * @param createdTimestamp
     *        The time at which the voice profile domain summary was created.
     */

    public void setCreatedTimestamp(java.util.Date createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }

    /**
     * <p>
     * The time at which the voice profile domain summary was created.
     * </p>
     * 
     * @return The time at which the voice profile domain summary was created.
     */

    public java.util.Date getCreatedTimestamp() {
        return this.createdTimestamp;
    }

    /**
     * <p>
     * The time at which the voice profile domain summary was created.
     * </p>
     * 
     * @param createdTimestamp
     *        The time at which the voice profile domain summary was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VoiceProfileDomainSummary withCreatedTimestamp(java.util.Date createdTimestamp) {
        setCreatedTimestamp(createdTimestamp);
        return this;
    }

    /**
     * <p>
     * The time at which the voice profile domain summary was last updated.
     * </p>
     * 
     * @param updatedTimestamp
     *        The time at which the voice profile domain summary was last updated.
     */

    public void setUpdatedTimestamp(java.util.Date updatedTimestamp) {
        this.updatedTimestamp = updatedTimestamp;
    }

    /**
     * <p>
     * The time at which the voice profile domain summary was last updated.
     * </p>
     * 
     * @return The time at which the voice profile domain summary was last updated.
     */

    public java.util.Date getUpdatedTimestamp() {
        return this.updatedTimestamp;
    }

    /**
     * <p>
     * The time at which the voice profile domain summary was last updated.
     * </p>
     * 
     * @param updatedTimestamp
     *        The time at which the voice profile domain summary was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VoiceProfileDomainSummary withUpdatedTimestamp(java.util.Date updatedTimestamp) {
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

        if (obj instanceof VoiceProfileDomainSummary == false)
            return false;
        VoiceProfileDomainSummary other = (VoiceProfileDomainSummary) obj;
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
        hashCode = prime * hashCode + ((getCreatedTimestamp() == null) ? 0 : getCreatedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getUpdatedTimestamp() == null) ? 0 : getUpdatedTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public VoiceProfileDomainSummary clone() {
        try {
            return (VoiceProfileDomainSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chimesdkvoice.model.transform.VoiceProfileDomainSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
