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
package com.amazonaws.services.chimesdkvoice.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/ListVoiceConnectorGroups"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListVoiceConnectorGroupsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private java.util.List<VoiceConnectorGroup> voiceConnectorGroups;

    private String nextToken;

    /**
     * @return
     */

    public java.util.List<VoiceConnectorGroup> getVoiceConnectorGroups() {
        return voiceConnectorGroups;
    }

    /**
     * @param voiceConnectorGroups
     */

    public void setVoiceConnectorGroups(java.util.Collection<VoiceConnectorGroup> voiceConnectorGroups) {
        if (voiceConnectorGroups == null) {
            this.voiceConnectorGroups = null;
            return;
        }

        this.voiceConnectorGroups = new java.util.ArrayList<VoiceConnectorGroup>(voiceConnectorGroups);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVoiceConnectorGroups(java.util.Collection)} or {@link #withVoiceConnectorGroups(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param voiceConnectorGroups
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListVoiceConnectorGroupsResult withVoiceConnectorGroups(VoiceConnectorGroup... voiceConnectorGroups) {
        if (this.voiceConnectorGroups == null) {
            setVoiceConnectorGroups(new java.util.ArrayList<VoiceConnectorGroup>(voiceConnectorGroups.length));
        }
        for (VoiceConnectorGroup ele : voiceConnectorGroups) {
            this.voiceConnectorGroups.add(ele);
        }
        return this;
    }

    /**
     * @param voiceConnectorGroups
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListVoiceConnectorGroupsResult withVoiceConnectorGroups(java.util.Collection<VoiceConnectorGroup> voiceConnectorGroups) {
        setVoiceConnectorGroups(voiceConnectorGroups);
        return this;
    }

    /**
     * @param nextToken
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * @return
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @param nextToken
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListVoiceConnectorGroupsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getVoiceConnectorGroups() != null)
            sb.append("VoiceConnectorGroups: ").append(getVoiceConnectorGroups()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListVoiceConnectorGroupsResult == false)
            return false;
        ListVoiceConnectorGroupsResult other = (ListVoiceConnectorGroupsResult) obj;
        if (other.getVoiceConnectorGroups() == null ^ this.getVoiceConnectorGroups() == null)
            return false;
        if (other.getVoiceConnectorGroups() != null && other.getVoiceConnectorGroups().equals(this.getVoiceConnectorGroups()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVoiceConnectorGroups() == null) ? 0 : getVoiceConnectorGroups().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListVoiceConnectorGroupsResult clone() {
        try {
            return (ListVoiceConnectorGroupsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
