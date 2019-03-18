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
package com.amazonaws.services.chime.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/DeleteVoiceConnectorTerminationCredentials"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteVoiceConnectorTerminationCredentialsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Chime Voice Connector ID.
     * </p>
     */
    private String voiceConnectorId;
    /**
     * <p>
     * The RFC2617 compliant username associated with the SIP credentials, in US-ASCII format.
     * </p>
     */
    private java.util.List<String> usernames;

    /**
     * <p>
     * The Amazon Chime Voice Connector ID.
     * </p>
     * 
     * @param voiceConnectorId
     *        The Amazon Chime Voice Connector ID.
     */

    public void setVoiceConnectorId(String voiceConnectorId) {
        this.voiceConnectorId = voiceConnectorId;
    }

    /**
     * <p>
     * The Amazon Chime Voice Connector ID.
     * </p>
     * 
     * @return The Amazon Chime Voice Connector ID.
     */

    public String getVoiceConnectorId() {
        return this.voiceConnectorId;
    }

    /**
     * <p>
     * The Amazon Chime Voice Connector ID.
     * </p>
     * 
     * @param voiceConnectorId
     *        The Amazon Chime Voice Connector ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteVoiceConnectorTerminationCredentialsRequest withVoiceConnectorId(String voiceConnectorId) {
        setVoiceConnectorId(voiceConnectorId);
        return this;
    }

    /**
     * <p>
     * The RFC2617 compliant username associated with the SIP credentials, in US-ASCII format.
     * </p>
     * 
     * @return The RFC2617 compliant username associated with the SIP credentials, in US-ASCII format.
     */

    public java.util.List<String> getUsernames() {
        return usernames;
    }

    /**
     * <p>
     * The RFC2617 compliant username associated with the SIP credentials, in US-ASCII format.
     * </p>
     * 
     * @param usernames
     *        The RFC2617 compliant username associated with the SIP credentials, in US-ASCII format.
     */

    public void setUsernames(java.util.Collection<String> usernames) {
        if (usernames == null) {
            this.usernames = null;
            return;
        }

        this.usernames = new java.util.ArrayList<String>(usernames);
    }

    /**
     * <p>
     * The RFC2617 compliant username associated with the SIP credentials, in US-ASCII format.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUsernames(java.util.Collection)} or {@link #withUsernames(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param usernames
     *        The RFC2617 compliant username associated with the SIP credentials, in US-ASCII format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteVoiceConnectorTerminationCredentialsRequest withUsernames(String... usernames) {
        if (this.usernames == null) {
            setUsernames(new java.util.ArrayList<String>(usernames.length));
        }
        for (String ele : usernames) {
            this.usernames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The RFC2617 compliant username associated with the SIP credentials, in US-ASCII format.
     * </p>
     * 
     * @param usernames
     *        The RFC2617 compliant username associated with the SIP credentials, in US-ASCII format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteVoiceConnectorTerminationCredentialsRequest withUsernames(java.util.Collection<String> usernames) {
        setUsernames(usernames);
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
        if (getVoiceConnectorId() != null)
            sb.append("VoiceConnectorId: ").append(getVoiceConnectorId()).append(",");
        if (getUsernames() != null)
            sb.append("Usernames: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteVoiceConnectorTerminationCredentialsRequest == false)
            return false;
        DeleteVoiceConnectorTerminationCredentialsRequest other = (DeleteVoiceConnectorTerminationCredentialsRequest) obj;
        if (other.getVoiceConnectorId() == null ^ this.getVoiceConnectorId() == null)
            return false;
        if (other.getVoiceConnectorId() != null && other.getVoiceConnectorId().equals(this.getVoiceConnectorId()) == false)
            return false;
        if (other.getUsernames() == null ^ this.getUsernames() == null)
            return false;
        if (other.getUsernames() != null && other.getUsernames().equals(this.getUsernames()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVoiceConnectorId() == null) ? 0 : getVoiceConnectorId().hashCode());
        hashCode = prime * hashCode + ((getUsernames() == null) ? 0 : getUsernames().hashCode());
        return hashCode;
    }

    @Override
    public DeleteVoiceConnectorTerminationCredentialsRequest clone() {
        return (DeleteVoiceConnectorTerminationCredentialsRequest) super.clone();
    }

}
