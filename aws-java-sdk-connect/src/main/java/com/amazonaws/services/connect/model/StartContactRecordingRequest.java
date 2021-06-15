/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/StartContactRecording" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartContactRecordingRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * The identifier of the contact.
     * </p>
     */
    private String contactId;
    /**
     * <p>
     * The identifier of the contact. This is the identifier of the contact associated with the first interaction with
     * the contact center.
     * </p>
     */
    private String initialContactId;
    /**
     * <p>
     * The person being recorded.
     * </p>
     */
    private VoiceRecordingConfiguration voiceRecordingConfiguration;

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * </p>
     * 
     * @param instanceId
     *        The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * </p>
     * 
     * @return The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * </p>
     * 
     * @param instanceId
     *        The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartContactRecordingRequest withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * The identifier of the contact.
     * </p>
     * 
     * @param contactId
     *        The identifier of the contact.
     */

    public void setContactId(String contactId) {
        this.contactId = contactId;
    }

    /**
     * <p>
     * The identifier of the contact.
     * </p>
     * 
     * @return The identifier of the contact.
     */

    public String getContactId() {
        return this.contactId;
    }

    /**
     * <p>
     * The identifier of the contact.
     * </p>
     * 
     * @param contactId
     *        The identifier of the contact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartContactRecordingRequest withContactId(String contactId) {
        setContactId(contactId);
        return this;
    }

    /**
     * <p>
     * The identifier of the contact. This is the identifier of the contact associated with the first interaction with
     * the contact center.
     * </p>
     * 
     * @param initialContactId
     *        The identifier of the contact. This is the identifier of the contact associated with the first interaction
     *        with the contact center.
     */

    public void setInitialContactId(String initialContactId) {
        this.initialContactId = initialContactId;
    }

    /**
     * <p>
     * The identifier of the contact. This is the identifier of the contact associated with the first interaction with
     * the contact center.
     * </p>
     * 
     * @return The identifier of the contact. This is the identifier of the contact associated with the first
     *         interaction with the contact center.
     */

    public String getInitialContactId() {
        return this.initialContactId;
    }

    /**
     * <p>
     * The identifier of the contact. This is the identifier of the contact associated with the first interaction with
     * the contact center.
     * </p>
     * 
     * @param initialContactId
     *        The identifier of the contact. This is the identifier of the contact associated with the first interaction
     *        with the contact center.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartContactRecordingRequest withInitialContactId(String initialContactId) {
        setInitialContactId(initialContactId);
        return this;
    }

    /**
     * <p>
     * The person being recorded.
     * </p>
     * 
     * @param voiceRecordingConfiguration
     *        The person being recorded.
     */

    public void setVoiceRecordingConfiguration(VoiceRecordingConfiguration voiceRecordingConfiguration) {
        this.voiceRecordingConfiguration = voiceRecordingConfiguration;
    }

    /**
     * <p>
     * The person being recorded.
     * </p>
     * 
     * @return The person being recorded.
     */

    public VoiceRecordingConfiguration getVoiceRecordingConfiguration() {
        return this.voiceRecordingConfiguration;
    }

    /**
     * <p>
     * The person being recorded.
     * </p>
     * 
     * @param voiceRecordingConfiguration
     *        The person being recorded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartContactRecordingRequest withVoiceRecordingConfiguration(VoiceRecordingConfiguration voiceRecordingConfiguration) {
        setVoiceRecordingConfiguration(voiceRecordingConfiguration);
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
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getContactId() != null)
            sb.append("ContactId: ").append(getContactId()).append(",");
        if (getInitialContactId() != null)
            sb.append("InitialContactId: ").append(getInitialContactId()).append(",");
        if (getVoiceRecordingConfiguration() != null)
            sb.append("VoiceRecordingConfiguration: ").append(getVoiceRecordingConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartContactRecordingRequest == false)
            return false;
        StartContactRecordingRequest other = (StartContactRecordingRequest) obj;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getContactId() == null ^ this.getContactId() == null)
            return false;
        if (other.getContactId() != null && other.getContactId().equals(this.getContactId()) == false)
            return false;
        if (other.getInitialContactId() == null ^ this.getInitialContactId() == null)
            return false;
        if (other.getInitialContactId() != null && other.getInitialContactId().equals(this.getInitialContactId()) == false)
            return false;
        if (other.getVoiceRecordingConfiguration() == null ^ this.getVoiceRecordingConfiguration() == null)
            return false;
        if (other.getVoiceRecordingConfiguration() != null && other.getVoiceRecordingConfiguration().equals(this.getVoiceRecordingConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getContactId() == null) ? 0 : getContactId().hashCode());
        hashCode = prime * hashCode + ((getInitialContactId() == null) ? 0 : getInitialContactId().hashCode());
        hashCode = prime * hashCode + ((getVoiceRecordingConfiguration() == null) ? 0 : getVoiceRecordingConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public StartContactRecordingRequest clone() {
        return (StartContactRecordingRequest) super.clone();
    }

}
