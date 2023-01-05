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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/voice-id-2021-09-27/OptOutSpeaker" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OptOutSpeakerResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Details about the opted-out speaker.
     * </p>
     */
    private Speaker speaker;

    /**
     * <p>
     * Details about the opted-out speaker.
     * </p>
     * 
     * @param speaker
     *        Details about the opted-out speaker.
     */

    public void setSpeaker(Speaker speaker) {
        this.speaker = speaker;
    }

    /**
     * <p>
     * Details about the opted-out speaker.
     * </p>
     * 
     * @return Details about the opted-out speaker.
     */

    public Speaker getSpeaker() {
        return this.speaker;
    }

    /**
     * <p>
     * Details about the opted-out speaker.
     * </p>
     * 
     * @param speaker
     *        Details about the opted-out speaker.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OptOutSpeakerResult withSpeaker(Speaker speaker) {
        setSpeaker(speaker);
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
        if (getSpeaker() != null)
            sb.append("Speaker: ").append(getSpeaker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OptOutSpeakerResult == false)
            return false;
        OptOutSpeakerResult other = (OptOutSpeakerResult) obj;
        if (other.getSpeaker() == null ^ this.getSpeaker() == null)
            return false;
        if (other.getSpeaker() != null && other.getSpeaker().equals(this.getSpeaker()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSpeaker() == null) ? 0 : getSpeaker().hashCode());
        return hashCode;
    }

    @Override
    public OptOutSpeakerResult clone() {
        try {
            return (OptOutSpeakerResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
