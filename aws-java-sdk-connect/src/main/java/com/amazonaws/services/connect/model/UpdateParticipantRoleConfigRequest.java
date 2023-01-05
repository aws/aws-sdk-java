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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateParticipantRoleConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateParticipantRoleConfigRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * The identifier of the contact in this instance of Amazon Connect.
     * </p>
     */
    private String contactId;
    /**
     * <p>
     * The Amazon Connect channel you want to configure.
     * </p>
     */
    private UpdateParticipantRoleConfigChannelInfo channelConfiguration;

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

    public UpdateParticipantRoleConfigRequest withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * The identifier of the contact in this instance of Amazon Connect.
     * </p>
     * 
     * @param contactId
     *        The identifier of the contact in this instance of Amazon Connect.
     */

    public void setContactId(String contactId) {
        this.contactId = contactId;
    }

    /**
     * <p>
     * The identifier of the contact in this instance of Amazon Connect.
     * </p>
     * 
     * @return The identifier of the contact in this instance of Amazon Connect.
     */

    public String getContactId() {
        return this.contactId;
    }

    /**
     * <p>
     * The identifier of the contact in this instance of Amazon Connect.
     * </p>
     * 
     * @param contactId
     *        The identifier of the contact in this instance of Amazon Connect.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateParticipantRoleConfigRequest withContactId(String contactId) {
        setContactId(contactId);
        return this;
    }

    /**
     * <p>
     * The Amazon Connect channel you want to configure.
     * </p>
     * 
     * @param channelConfiguration
     *        The Amazon Connect channel you want to configure.
     */

    public void setChannelConfiguration(UpdateParticipantRoleConfigChannelInfo channelConfiguration) {
        this.channelConfiguration = channelConfiguration;
    }

    /**
     * <p>
     * The Amazon Connect channel you want to configure.
     * </p>
     * 
     * @return The Amazon Connect channel you want to configure.
     */

    public UpdateParticipantRoleConfigChannelInfo getChannelConfiguration() {
        return this.channelConfiguration;
    }

    /**
     * <p>
     * The Amazon Connect channel you want to configure.
     * </p>
     * 
     * @param channelConfiguration
     *        The Amazon Connect channel you want to configure.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateParticipantRoleConfigRequest withChannelConfiguration(UpdateParticipantRoleConfigChannelInfo channelConfiguration) {
        setChannelConfiguration(channelConfiguration);
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
        if (getChannelConfiguration() != null)
            sb.append("ChannelConfiguration: ").append(getChannelConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateParticipantRoleConfigRequest == false)
            return false;
        UpdateParticipantRoleConfigRequest other = (UpdateParticipantRoleConfigRequest) obj;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getContactId() == null ^ this.getContactId() == null)
            return false;
        if (other.getContactId() != null && other.getContactId().equals(this.getContactId()) == false)
            return false;
        if (other.getChannelConfiguration() == null ^ this.getChannelConfiguration() == null)
            return false;
        if (other.getChannelConfiguration() != null && other.getChannelConfiguration().equals(this.getChannelConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getContactId() == null) ? 0 : getContactId().hashCode());
        hashCode = prime * hashCode + ((getChannelConfiguration() == null) ? 0 : getChannelConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public UpdateParticipantRoleConfigRequest clone() {
        return (UpdateParticipantRoleConfigRequest) super.clone();
    }

}
