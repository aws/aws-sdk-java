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
 * A high-level summary of a voice profile.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/VoiceProfileSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VoiceProfileSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the voice profile in a voice profile summary.
     * </p>
     */
    private String voiceProfileId;
    /**
     * <p>
     * The ARN of the voice profile in a voice profile summary.
     * </p>
     */
    private String voiceProfileArn;
    /**
     * <p>
     * The ID of the voice profile domain in a voice profile summary.
     * </p>
     */
    private String voiceProfileDomainId;
    /**
     * <p>
     * The time at which a voice profile summary was created.
     * </p>
     */
    private java.util.Date createdTimestamp;
    /**
     * <p>
     * The time at which a voice profile summary was last updated.
     * </p>
     */
    private java.util.Date updatedTimestamp;
    /**
     * <p>
     * Extends the life of the voice profile. You can use <code>UpdateVoiceProfile</code> to refresh an existing voice
     * profile's voice print and extend the life of the summary.
     * </p>
     */
    private java.util.Date expirationTimestamp;

    /**
     * <p>
     * The ID of the voice profile in a voice profile summary.
     * </p>
     * 
     * @param voiceProfileId
     *        The ID of the voice profile in a voice profile summary.
     */

    public void setVoiceProfileId(String voiceProfileId) {
        this.voiceProfileId = voiceProfileId;
    }

    /**
     * <p>
     * The ID of the voice profile in a voice profile summary.
     * </p>
     * 
     * @return The ID of the voice profile in a voice profile summary.
     */

    public String getVoiceProfileId() {
        return this.voiceProfileId;
    }

    /**
     * <p>
     * The ID of the voice profile in a voice profile summary.
     * </p>
     * 
     * @param voiceProfileId
     *        The ID of the voice profile in a voice profile summary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VoiceProfileSummary withVoiceProfileId(String voiceProfileId) {
        setVoiceProfileId(voiceProfileId);
        return this;
    }

    /**
     * <p>
     * The ARN of the voice profile in a voice profile summary.
     * </p>
     * 
     * @param voiceProfileArn
     *        The ARN of the voice profile in a voice profile summary.
     */

    public void setVoiceProfileArn(String voiceProfileArn) {
        this.voiceProfileArn = voiceProfileArn;
    }

    /**
     * <p>
     * The ARN of the voice profile in a voice profile summary.
     * </p>
     * 
     * @return The ARN of the voice profile in a voice profile summary.
     */

    public String getVoiceProfileArn() {
        return this.voiceProfileArn;
    }

    /**
     * <p>
     * The ARN of the voice profile in a voice profile summary.
     * </p>
     * 
     * @param voiceProfileArn
     *        The ARN of the voice profile in a voice profile summary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VoiceProfileSummary withVoiceProfileArn(String voiceProfileArn) {
        setVoiceProfileArn(voiceProfileArn);
        return this;
    }

    /**
     * <p>
     * The ID of the voice profile domain in a voice profile summary.
     * </p>
     * 
     * @param voiceProfileDomainId
     *        The ID of the voice profile domain in a voice profile summary.
     */

    public void setVoiceProfileDomainId(String voiceProfileDomainId) {
        this.voiceProfileDomainId = voiceProfileDomainId;
    }

    /**
     * <p>
     * The ID of the voice profile domain in a voice profile summary.
     * </p>
     * 
     * @return The ID of the voice profile domain in a voice profile summary.
     */

    public String getVoiceProfileDomainId() {
        return this.voiceProfileDomainId;
    }

    /**
     * <p>
     * The ID of the voice profile domain in a voice profile summary.
     * </p>
     * 
     * @param voiceProfileDomainId
     *        The ID of the voice profile domain in a voice profile summary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VoiceProfileSummary withVoiceProfileDomainId(String voiceProfileDomainId) {
        setVoiceProfileDomainId(voiceProfileDomainId);
        return this;
    }

    /**
     * <p>
     * The time at which a voice profile summary was created.
     * </p>
     * 
     * @param createdTimestamp
     *        The time at which a voice profile summary was created.
     */

    public void setCreatedTimestamp(java.util.Date createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }

    /**
     * <p>
     * The time at which a voice profile summary was created.
     * </p>
     * 
     * @return The time at which a voice profile summary was created.
     */

    public java.util.Date getCreatedTimestamp() {
        return this.createdTimestamp;
    }

    /**
     * <p>
     * The time at which a voice profile summary was created.
     * </p>
     * 
     * @param createdTimestamp
     *        The time at which a voice profile summary was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VoiceProfileSummary withCreatedTimestamp(java.util.Date createdTimestamp) {
        setCreatedTimestamp(createdTimestamp);
        return this;
    }

    /**
     * <p>
     * The time at which a voice profile summary was last updated.
     * </p>
     * 
     * @param updatedTimestamp
     *        The time at which a voice profile summary was last updated.
     */

    public void setUpdatedTimestamp(java.util.Date updatedTimestamp) {
        this.updatedTimestamp = updatedTimestamp;
    }

    /**
     * <p>
     * The time at which a voice profile summary was last updated.
     * </p>
     * 
     * @return The time at which a voice profile summary was last updated.
     */

    public java.util.Date getUpdatedTimestamp() {
        return this.updatedTimestamp;
    }

    /**
     * <p>
     * The time at which a voice profile summary was last updated.
     * </p>
     * 
     * @param updatedTimestamp
     *        The time at which a voice profile summary was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VoiceProfileSummary withUpdatedTimestamp(java.util.Date updatedTimestamp) {
        setUpdatedTimestamp(updatedTimestamp);
        return this;
    }

    /**
     * <p>
     * Extends the life of the voice profile. You can use <code>UpdateVoiceProfile</code> to refresh an existing voice
     * profile's voice print and extend the life of the summary.
     * </p>
     * 
     * @param expirationTimestamp
     *        Extends the life of the voice profile. You can use <code>UpdateVoiceProfile</code> to refresh an existing
     *        voice profile's voice print and extend the life of the summary.
     */

    public void setExpirationTimestamp(java.util.Date expirationTimestamp) {
        this.expirationTimestamp = expirationTimestamp;
    }

    /**
     * <p>
     * Extends the life of the voice profile. You can use <code>UpdateVoiceProfile</code> to refresh an existing voice
     * profile's voice print and extend the life of the summary.
     * </p>
     * 
     * @return Extends the life of the voice profile. You can use <code>UpdateVoiceProfile</code> to refresh an existing
     *         voice profile's voice print and extend the life of the summary.
     */

    public java.util.Date getExpirationTimestamp() {
        return this.expirationTimestamp;
    }

    /**
     * <p>
     * Extends the life of the voice profile. You can use <code>UpdateVoiceProfile</code> to refresh an existing voice
     * profile's voice print and extend the life of the summary.
     * </p>
     * 
     * @param expirationTimestamp
     *        Extends the life of the voice profile. You can use <code>UpdateVoiceProfile</code> to refresh an existing
     *        voice profile's voice print and extend the life of the summary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VoiceProfileSummary withExpirationTimestamp(java.util.Date expirationTimestamp) {
        setExpirationTimestamp(expirationTimestamp);
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
        if (getVoiceProfileId() != null)
            sb.append("VoiceProfileId: ").append(getVoiceProfileId()).append(",");
        if (getVoiceProfileArn() != null)
            sb.append("VoiceProfileArn: ").append("***Sensitive Data Redacted***").append(",");
        if (getVoiceProfileDomainId() != null)
            sb.append("VoiceProfileDomainId: ").append(getVoiceProfileDomainId()).append(",");
        if (getCreatedTimestamp() != null)
            sb.append("CreatedTimestamp: ").append(getCreatedTimestamp()).append(",");
        if (getUpdatedTimestamp() != null)
            sb.append("UpdatedTimestamp: ").append(getUpdatedTimestamp()).append(",");
        if (getExpirationTimestamp() != null)
            sb.append("ExpirationTimestamp: ").append(getExpirationTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VoiceProfileSummary == false)
            return false;
        VoiceProfileSummary other = (VoiceProfileSummary) obj;
        if (other.getVoiceProfileId() == null ^ this.getVoiceProfileId() == null)
            return false;
        if (other.getVoiceProfileId() != null && other.getVoiceProfileId().equals(this.getVoiceProfileId()) == false)
            return false;
        if (other.getVoiceProfileArn() == null ^ this.getVoiceProfileArn() == null)
            return false;
        if (other.getVoiceProfileArn() != null && other.getVoiceProfileArn().equals(this.getVoiceProfileArn()) == false)
            return false;
        if (other.getVoiceProfileDomainId() == null ^ this.getVoiceProfileDomainId() == null)
            return false;
        if (other.getVoiceProfileDomainId() != null && other.getVoiceProfileDomainId().equals(this.getVoiceProfileDomainId()) == false)
            return false;
        if (other.getCreatedTimestamp() == null ^ this.getCreatedTimestamp() == null)
            return false;
        if (other.getCreatedTimestamp() != null && other.getCreatedTimestamp().equals(this.getCreatedTimestamp()) == false)
            return false;
        if (other.getUpdatedTimestamp() == null ^ this.getUpdatedTimestamp() == null)
            return false;
        if (other.getUpdatedTimestamp() != null && other.getUpdatedTimestamp().equals(this.getUpdatedTimestamp()) == false)
            return false;
        if (other.getExpirationTimestamp() == null ^ this.getExpirationTimestamp() == null)
            return false;
        if (other.getExpirationTimestamp() != null && other.getExpirationTimestamp().equals(this.getExpirationTimestamp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVoiceProfileId() == null) ? 0 : getVoiceProfileId().hashCode());
        hashCode = prime * hashCode + ((getVoiceProfileArn() == null) ? 0 : getVoiceProfileArn().hashCode());
        hashCode = prime * hashCode + ((getVoiceProfileDomainId() == null) ? 0 : getVoiceProfileDomainId().hashCode());
        hashCode = prime * hashCode + ((getCreatedTimestamp() == null) ? 0 : getCreatedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getUpdatedTimestamp() == null) ? 0 : getUpdatedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getExpirationTimestamp() == null) ? 0 : getExpirationTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public VoiceProfileSummary clone() {
        try {
            return (VoiceProfileSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chimesdkvoice.model.transform.VoiceProfileSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
