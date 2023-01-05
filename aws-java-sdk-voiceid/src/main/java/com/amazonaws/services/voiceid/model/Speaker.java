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
package com.amazonaws.services.voiceid.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains all the information about a speaker.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/voice-id-2021-09-27/Speaker" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Speaker implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A timestamp showing when the speaker is created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The client-provided identifier for the speaker.
     * </p>
     */
    private String customerSpeakerId;
    /**
     * <p>
     * The identifier of the domain that contains the speaker.
     * </p>
     */
    private String domainId;
    /**
     * <p>
     * The service-generated identifier for the speaker.
     * </p>
     */
    private String generatedSpeakerId;
    /**
     * <p>
     * The timestamp when the speaker was last accessed for enrollment, re-enrollment or a successful authentication.
     * This timestamp is accurate to one hour.
     * </p>
     */
    private java.util.Date lastAccessedAt;
    /**
     * <p>
     * The current status of the speaker.
     * </p>
     */
    private String status;
    /**
     * <p>
     * A timestamp showing the speaker's last update.
     * </p>
     */
    private java.util.Date updatedAt;

    /**
     * <p>
     * A timestamp showing when the speaker is created.
     * </p>
     * 
     * @param createdAt
     *        A timestamp showing when the speaker is created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * A timestamp showing when the speaker is created.
     * </p>
     * 
     * @return A timestamp showing when the speaker is created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * A timestamp showing when the speaker is created.
     * </p>
     * 
     * @param createdAt
     *        A timestamp showing when the speaker is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Speaker withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The client-provided identifier for the speaker.
     * </p>
     * 
     * @param customerSpeakerId
     *        The client-provided identifier for the speaker.
     */

    public void setCustomerSpeakerId(String customerSpeakerId) {
        this.customerSpeakerId = customerSpeakerId;
    }

    /**
     * <p>
     * The client-provided identifier for the speaker.
     * </p>
     * 
     * @return The client-provided identifier for the speaker.
     */

    public String getCustomerSpeakerId() {
        return this.customerSpeakerId;
    }

    /**
     * <p>
     * The client-provided identifier for the speaker.
     * </p>
     * 
     * @param customerSpeakerId
     *        The client-provided identifier for the speaker.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Speaker withCustomerSpeakerId(String customerSpeakerId) {
        setCustomerSpeakerId(customerSpeakerId);
        return this;
    }

    /**
     * <p>
     * The identifier of the domain that contains the speaker.
     * </p>
     * 
     * @param domainId
     *        The identifier of the domain that contains the speaker.
     */

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    /**
     * <p>
     * The identifier of the domain that contains the speaker.
     * </p>
     * 
     * @return The identifier of the domain that contains the speaker.
     */

    public String getDomainId() {
        return this.domainId;
    }

    /**
     * <p>
     * The identifier of the domain that contains the speaker.
     * </p>
     * 
     * @param domainId
     *        The identifier of the domain that contains the speaker.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Speaker withDomainId(String domainId) {
        setDomainId(domainId);
        return this;
    }

    /**
     * <p>
     * The service-generated identifier for the speaker.
     * </p>
     * 
     * @param generatedSpeakerId
     *        The service-generated identifier for the speaker.
     */

    public void setGeneratedSpeakerId(String generatedSpeakerId) {
        this.generatedSpeakerId = generatedSpeakerId;
    }

    /**
     * <p>
     * The service-generated identifier for the speaker.
     * </p>
     * 
     * @return The service-generated identifier for the speaker.
     */

    public String getGeneratedSpeakerId() {
        return this.generatedSpeakerId;
    }

    /**
     * <p>
     * The service-generated identifier for the speaker.
     * </p>
     * 
     * @param generatedSpeakerId
     *        The service-generated identifier for the speaker.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Speaker withGeneratedSpeakerId(String generatedSpeakerId) {
        setGeneratedSpeakerId(generatedSpeakerId);
        return this;
    }

    /**
     * <p>
     * The timestamp when the speaker was last accessed for enrollment, re-enrollment or a successful authentication.
     * This timestamp is accurate to one hour.
     * </p>
     * 
     * @param lastAccessedAt
     *        The timestamp when the speaker was last accessed for enrollment, re-enrollment or a successful
     *        authentication. This timestamp is accurate to one hour.
     */

    public void setLastAccessedAt(java.util.Date lastAccessedAt) {
        this.lastAccessedAt = lastAccessedAt;
    }

    /**
     * <p>
     * The timestamp when the speaker was last accessed for enrollment, re-enrollment or a successful authentication.
     * This timestamp is accurate to one hour.
     * </p>
     * 
     * @return The timestamp when the speaker was last accessed for enrollment, re-enrollment or a successful
     *         authentication. This timestamp is accurate to one hour.
     */

    public java.util.Date getLastAccessedAt() {
        return this.lastAccessedAt;
    }

    /**
     * <p>
     * The timestamp when the speaker was last accessed for enrollment, re-enrollment or a successful authentication.
     * This timestamp is accurate to one hour.
     * </p>
     * 
     * @param lastAccessedAt
     *        The timestamp when the speaker was last accessed for enrollment, re-enrollment or a successful
     *        authentication. This timestamp is accurate to one hour.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Speaker withLastAccessedAt(java.util.Date lastAccessedAt) {
        setLastAccessedAt(lastAccessedAt);
        return this;
    }

    /**
     * <p>
     * The current status of the speaker.
     * </p>
     * 
     * @param status
     *        The current status of the speaker.
     * @see SpeakerStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the speaker.
     * </p>
     * 
     * @return The current status of the speaker.
     * @see SpeakerStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the speaker.
     * </p>
     * 
     * @param status
     *        The current status of the speaker.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SpeakerStatus
     */

    public Speaker withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current status of the speaker.
     * </p>
     * 
     * @param status
     *        The current status of the speaker.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SpeakerStatus
     */

    public Speaker withStatus(SpeakerStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * A timestamp showing the speaker's last update.
     * </p>
     * 
     * @param updatedAt
     *        A timestamp showing the speaker's last update.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * A timestamp showing the speaker's last update.
     * </p>
     * 
     * @return A timestamp showing the speaker's last update.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * A timestamp showing the speaker's last update.
     * </p>
     * 
     * @param updatedAt
     *        A timestamp showing the speaker's last update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Speaker withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
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
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getCustomerSpeakerId() != null)
            sb.append("CustomerSpeakerId: ").append("***Sensitive Data Redacted***").append(",");
        if (getDomainId() != null)
            sb.append("DomainId: ").append(getDomainId()).append(",");
        if (getGeneratedSpeakerId() != null)
            sb.append("GeneratedSpeakerId: ").append(getGeneratedSpeakerId()).append(",");
        if (getLastAccessedAt() != null)
            sb.append("LastAccessedAt: ").append(getLastAccessedAt()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Speaker == false)
            return false;
        Speaker other = (Speaker) obj;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getCustomerSpeakerId() == null ^ this.getCustomerSpeakerId() == null)
            return false;
        if (other.getCustomerSpeakerId() != null && other.getCustomerSpeakerId().equals(this.getCustomerSpeakerId()) == false)
            return false;
        if (other.getDomainId() == null ^ this.getDomainId() == null)
            return false;
        if (other.getDomainId() != null && other.getDomainId().equals(this.getDomainId()) == false)
            return false;
        if (other.getGeneratedSpeakerId() == null ^ this.getGeneratedSpeakerId() == null)
            return false;
        if (other.getGeneratedSpeakerId() != null && other.getGeneratedSpeakerId().equals(this.getGeneratedSpeakerId()) == false)
            return false;
        if (other.getLastAccessedAt() == null ^ this.getLastAccessedAt() == null)
            return false;
        if (other.getLastAccessedAt() != null && other.getLastAccessedAt().equals(this.getLastAccessedAt()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getCustomerSpeakerId() == null) ? 0 : getCustomerSpeakerId().hashCode());
        hashCode = prime * hashCode + ((getDomainId() == null) ? 0 : getDomainId().hashCode());
        hashCode = prime * hashCode + ((getGeneratedSpeakerId() == null) ? 0 : getGeneratedSpeakerId().hashCode());
        hashCode = prime * hashCode + ((getLastAccessedAt() == null) ? 0 : getLastAccessedAt().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        return hashCode;
    }

    @Override
    public Speaker clone() {
        try {
            return (Speaker) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.voiceid.model.transform.SpeakerMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
