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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/voice-id-2021-09-27/DescribeSpeaker" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeSpeakerRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the domain that contains the speaker.
     * </p>
     */
    private String domainId;
    /**
     * <p>
     * The identifier of the speaker you are describing.
     * </p>
     */
    private String speakerId;

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

    public DescribeSpeakerRequest withDomainId(String domainId) {
        setDomainId(domainId);
        return this;
    }

    /**
     * <p>
     * The identifier of the speaker you are describing.
     * </p>
     * 
     * @param speakerId
     *        The identifier of the speaker you are describing.
     */

    public void setSpeakerId(String speakerId) {
        this.speakerId = speakerId;
    }

    /**
     * <p>
     * The identifier of the speaker you are describing.
     * </p>
     * 
     * @return The identifier of the speaker you are describing.
     */

    public String getSpeakerId() {
        return this.speakerId;
    }

    /**
     * <p>
     * The identifier of the speaker you are describing.
     * </p>
     * 
     * @param speakerId
     *        The identifier of the speaker you are describing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSpeakerRequest withSpeakerId(String speakerId) {
        setSpeakerId(speakerId);
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
        if (getDomainId() != null)
            sb.append("DomainId: ").append(getDomainId()).append(",");
        if (getSpeakerId() != null)
            sb.append("SpeakerId: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeSpeakerRequest == false)
            return false;
        DescribeSpeakerRequest other = (DescribeSpeakerRequest) obj;
        if (other.getDomainId() == null ^ this.getDomainId() == null)
            return false;
        if (other.getDomainId() != null && other.getDomainId().equals(this.getDomainId()) == false)
            return false;
        if (other.getSpeakerId() == null ^ this.getSpeakerId() == null)
            return false;
        if (other.getSpeakerId() != null && other.getSpeakerId().equals(this.getSpeakerId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainId() == null) ? 0 : getDomainId().hashCode());
        hashCode = prime * hashCode + ((getSpeakerId() == null) ? 0 : getSpeakerId().hashCode());
        return hashCode;
    }

    @Override
    public DescribeSpeakerRequest clone() {
        return (DescribeSpeakerRequest) super.clone();
    }

}
