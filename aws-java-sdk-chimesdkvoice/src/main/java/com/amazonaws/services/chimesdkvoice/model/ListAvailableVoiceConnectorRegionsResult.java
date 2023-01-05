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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/ListAvailableVoiceConnectorRegions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAvailableVoiceConnectorRegionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    private java.util.List<String> voiceConnectorRegions;

    /**
     * @return
     * @see VoiceConnectorAwsRegion
     */

    public java.util.List<String> getVoiceConnectorRegions() {
        return voiceConnectorRegions;
    }

    /**
     * @param voiceConnectorRegions
     * @see VoiceConnectorAwsRegion
     */

    public void setVoiceConnectorRegions(java.util.Collection<String> voiceConnectorRegions) {
        if (voiceConnectorRegions == null) {
            this.voiceConnectorRegions = null;
            return;
        }

        this.voiceConnectorRegions = new java.util.ArrayList<String>(voiceConnectorRegions);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVoiceConnectorRegions(java.util.Collection)} or
     * {@link #withVoiceConnectorRegions(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param voiceConnectorRegions
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VoiceConnectorAwsRegion
     */

    public ListAvailableVoiceConnectorRegionsResult withVoiceConnectorRegions(String... voiceConnectorRegions) {
        if (this.voiceConnectorRegions == null) {
            setVoiceConnectorRegions(new java.util.ArrayList<String>(voiceConnectorRegions.length));
        }
        for (String ele : voiceConnectorRegions) {
            this.voiceConnectorRegions.add(ele);
        }
        return this;
    }

    /**
     * @param voiceConnectorRegions
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VoiceConnectorAwsRegion
     */

    public ListAvailableVoiceConnectorRegionsResult withVoiceConnectorRegions(java.util.Collection<String> voiceConnectorRegions) {
        setVoiceConnectorRegions(voiceConnectorRegions);
        return this;
    }

    /**
     * @param voiceConnectorRegions
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VoiceConnectorAwsRegion
     */

    public ListAvailableVoiceConnectorRegionsResult withVoiceConnectorRegions(VoiceConnectorAwsRegion... voiceConnectorRegions) {
        java.util.ArrayList<String> voiceConnectorRegionsCopy = new java.util.ArrayList<String>(voiceConnectorRegions.length);
        for (VoiceConnectorAwsRegion value : voiceConnectorRegions) {
            voiceConnectorRegionsCopy.add(value.toString());
        }
        if (getVoiceConnectorRegions() == null) {
            setVoiceConnectorRegions(voiceConnectorRegionsCopy);
        } else {
            getVoiceConnectorRegions().addAll(voiceConnectorRegionsCopy);
        }
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
        if (getVoiceConnectorRegions() != null)
            sb.append("VoiceConnectorRegions: ").append(getVoiceConnectorRegions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListAvailableVoiceConnectorRegionsResult == false)
            return false;
        ListAvailableVoiceConnectorRegionsResult other = (ListAvailableVoiceConnectorRegionsResult) obj;
        if (other.getVoiceConnectorRegions() == null ^ this.getVoiceConnectorRegions() == null)
            return false;
        if (other.getVoiceConnectorRegions() != null && other.getVoiceConnectorRegions().equals(this.getVoiceConnectorRegions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVoiceConnectorRegions() == null) ? 0 : getVoiceConnectorRegions().hashCode());
        return hashCode;
    }

    @Override
    public ListAvailableVoiceConnectorRegionsResult clone() {
        try {
            return (ListAvailableVoiceConnectorRegionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
