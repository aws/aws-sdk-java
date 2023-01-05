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
package com.amazonaws.services.chimesdkmeetings.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An optional category of meeting features that contains audio-specific configurations, such as operating parameters
 * for Amazon Voice Focus.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-meetings-2021-07-15/AudioFeatures" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AudioFeatures implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Makes echo reduction available to clients who connect to the meeting.
     * </p>
     */
    private String echoReduction;

    /**
     * <p>
     * Makes echo reduction available to clients who connect to the meeting.
     * </p>
     * 
     * @param echoReduction
     *        Makes echo reduction available to clients who connect to the meeting.
     * @see MeetingFeatureStatus
     */

    public void setEchoReduction(String echoReduction) {
        this.echoReduction = echoReduction;
    }

    /**
     * <p>
     * Makes echo reduction available to clients who connect to the meeting.
     * </p>
     * 
     * @return Makes echo reduction available to clients who connect to the meeting.
     * @see MeetingFeatureStatus
     */

    public String getEchoReduction() {
        return this.echoReduction;
    }

    /**
     * <p>
     * Makes echo reduction available to clients who connect to the meeting.
     * </p>
     * 
     * @param echoReduction
     *        Makes echo reduction available to clients who connect to the meeting.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MeetingFeatureStatus
     */

    public AudioFeatures withEchoReduction(String echoReduction) {
        setEchoReduction(echoReduction);
        return this;
    }

    /**
     * <p>
     * Makes echo reduction available to clients who connect to the meeting.
     * </p>
     * 
     * @param echoReduction
     *        Makes echo reduction available to clients who connect to the meeting.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MeetingFeatureStatus
     */

    public AudioFeatures withEchoReduction(MeetingFeatureStatus echoReduction) {
        this.echoReduction = echoReduction.toString();
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
        if (getEchoReduction() != null)
            sb.append("EchoReduction: ").append(getEchoReduction());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AudioFeatures == false)
            return false;
        AudioFeatures other = (AudioFeatures) obj;
        if (other.getEchoReduction() == null ^ this.getEchoReduction() == null)
            return false;
        if (other.getEchoReduction() != null && other.getEchoReduction().equals(this.getEchoReduction()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEchoReduction() == null) ? 0 : getEchoReduction().hashCode());
        return hashCode;
    }

    @Override
    public AudioFeatures clone() {
        try {
            return (AudioFeatures) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chimesdkmeetings.model.transform.AudioFeaturesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
