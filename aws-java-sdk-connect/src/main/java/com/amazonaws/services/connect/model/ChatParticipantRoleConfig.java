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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Configuration information for the chat participant role.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ChatParticipantRoleConfig" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ChatParticipantRoleConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of participant timers. You can specify any unique combination of role and timer type. Duplicate entries
     * error out the request with a 400.
     * </p>
     */
    private java.util.List<ParticipantTimerConfiguration> participantTimerConfigList;

    /**
     * <p>
     * A list of participant timers. You can specify any unique combination of role and timer type. Duplicate entries
     * error out the request with a 400.
     * </p>
     * 
     * @return A list of participant timers. You can specify any unique combination of role and timer type. Duplicate
     *         entries error out the request with a 400.
     */

    public java.util.List<ParticipantTimerConfiguration> getParticipantTimerConfigList() {
        return participantTimerConfigList;
    }

    /**
     * <p>
     * A list of participant timers. You can specify any unique combination of role and timer type. Duplicate entries
     * error out the request with a 400.
     * </p>
     * 
     * @param participantTimerConfigList
     *        A list of participant timers. You can specify any unique combination of role and timer type. Duplicate
     *        entries error out the request with a 400.
     */

    public void setParticipantTimerConfigList(java.util.Collection<ParticipantTimerConfiguration> participantTimerConfigList) {
        if (participantTimerConfigList == null) {
            this.participantTimerConfigList = null;
            return;
        }

        this.participantTimerConfigList = new java.util.ArrayList<ParticipantTimerConfiguration>(participantTimerConfigList);
    }

    /**
     * <p>
     * A list of participant timers. You can specify any unique combination of role and timer type. Duplicate entries
     * error out the request with a 400.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setParticipantTimerConfigList(java.util.Collection)} or
     * {@link #withParticipantTimerConfigList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param participantTimerConfigList
     *        A list of participant timers. You can specify any unique combination of role and timer type. Duplicate
     *        entries error out the request with a 400.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChatParticipantRoleConfig withParticipantTimerConfigList(ParticipantTimerConfiguration... participantTimerConfigList) {
        if (this.participantTimerConfigList == null) {
            setParticipantTimerConfigList(new java.util.ArrayList<ParticipantTimerConfiguration>(participantTimerConfigList.length));
        }
        for (ParticipantTimerConfiguration ele : participantTimerConfigList) {
            this.participantTimerConfigList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of participant timers. You can specify any unique combination of role and timer type. Duplicate entries
     * error out the request with a 400.
     * </p>
     * 
     * @param participantTimerConfigList
     *        A list of participant timers. You can specify any unique combination of role and timer type. Duplicate
     *        entries error out the request with a 400.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChatParticipantRoleConfig withParticipantTimerConfigList(java.util.Collection<ParticipantTimerConfiguration> participantTimerConfigList) {
        setParticipantTimerConfigList(participantTimerConfigList);
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
        if (getParticipantTimerConfigList() != null)
            sb.append("ParticipantTimerConfigList: ").append(getParticipantTimerConfigList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ChatParticipantRoleConfig == false)
            return false;
        ChatParticipantRoleConfig other = (ChatParticipantRoleConfig) obj;
        if (other.getParticipantTimerConfigList() == null ^ this.getParticipantTimerConfigList() == null)
            return false;
        if (other.getParticipantTimerConfigList() != null && other.getParticipantTimerConfigList().equals(this.getParticipantTimerConfigList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getParticipantTimerConfigList() == null) ? 0 : getParticipantTimerConfigList().hashCode());
        return hashCode;
    }

    @Override
    public ChatParticipantRoleConfig clone() {
        try {
            return (ChatParticipantRoleConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.ChatParticipantRoleConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
