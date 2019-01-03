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
package com.amazonaws.services.alexaforbusiness.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/UpdateConferenceProvider"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateConferenceProviderRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the conference provider.
     * </p>
     */
    private String conferenceProviderArn;
    /**
     * <p>
     * The type of the conference provider.
     * </p>
     */
    private String conferenceProviderType;
    /**
     * <p>
     * The IP endpoint and protocol for calling.
     * </p>
     */
    private IPDialIn iPDialIn;
    /**
     * <p>
     * The information for PSTN conferencing.
     * </p>
     */
    private PSTNDialIn pSTNDialIn;
    /**
     * <p>
     * The meeting settings for the conference provider.
     * </p>
     */
    private MeetingSetting meetingSetting;

    /**
     * <p>
     * The ARN of the conference provider.
     * </p>
     * 
     * @param conferenceProviderArn
     *        The ARN of the conference provider.
     */

    public void setConferenceProviderArn(String conferenceProviderArn) {
        this.conferenceProviderArn = conferenceProviderArn;
    }

    /**
     * <p>
     * The ARN of the conference provider.
     * </p>
     * 
     * @return The ARN of the conference provider.
     */

    public String getConferenceProviderArn() {
        return this.conferenceProviderArn;
    }

    /**
     * <p>
     * The ARN of the conference provider.
     * </p>
     * 
     * @param conferenceProviderArn
     *        The ARN of the conference provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateConferenceProviderRequest withConferenceProviderArn(String conferenceProviderArn) {
        setConferenceProviderArn(conferenceProviderArn);
        return this;
    }

    /**
     * <p>
     * The type of the conference provider.
     * </p>
     * 
     * @param conferenceProviderType
     *        The type of the conference provider.
     * @see ConferenceProviderType
     */

    public void setConferenceProviderType(String conferenceProviderType) {
        this.conferenceProviderType = conferenceProviderType;
    }

    /**
     * <p>
     * The type of the conference provider.
     * </p>
     * 
     * @return The type of the conference provider.
     * @see ConferenceProviderType
     */

    public String getConferenceProviderType() {
        return this.conferenceProviderType;
    }

    /**
     * <p>
     * The type of the conference provider.
     * </p>
     * 
     * @param conferenceProviderType
     *        The type of the conference provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConferenceProviderType
     */

    public UpdateConferenceProviderRequest withConferenceProviderType(String conferenceProviderType) {
        setConferenceProviderType(conferenceProviderType);
        return this;
    }

    /**
     * <p>
     * The type of the conference provider.
     * </p>
     * 
     * @param conferenceProviderType
     *        The type of the conference provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConferenceProviderType
     */

    public UpdateConferenceProviderRequest withConferenceProviderType(ConferenceProviderType conferenceProviderType) {
        this.conferenceProviderType = conferenceProviderType.toString();
        return this;
    }

    /**
     * <p>
     * The IP endpoint and protocol for calling.
     * </p>
     * 
     * @param iPDialIn
     *        The IP endpoint and protocol for calling.
     */

    public void setIPDialIn(IPDialIn iPDialIn) {
        this.iPDialIn = iPDialIn;
    }

    /**
     * <p>
     * The IP endpoint and protocol for calling.
     * </p>
     * 
     * @return The IP endpoint and protocol for calling.
     */

    public IPDialIn getIPDialIn() {
        return this.iPDialIn;
    }

    /**
     * <p>
     * The IP endpoint and protocol for calling.
     * </p>
     * 
     * @param iPDialIn
     *        The IP endpoint and protocol for calling.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateConferenceProviderRequest withIPDialIn(IPDialIn iPDialIn) {
        setIPDialIn(iPDialIn);
        return this;
    }

    /**
     * <p>
     * The information for PSTN conferencing.
     * </p>
     * 
     * @param pSTNDialIn
     *        The information for PSTN conferencing.
     */

    public void setPSTNDialIn(PSTNDialIn pSTNDialIn) {
        this.pSTNDialIn = pSTNDialIn;
    }

    /**
     * <p>
     * The information for PSTN conferencing.
     * </p>
     * 
     * @return The information for PSTN conferencing.
     */

    public PSTNDialIn getPSTNDialIn() {
        return this.pSTNDialIn;
    }

    /**
     * <p>
     * The information for PSTN conferencing.
     * </p>
     * 
     * @param pSTNDialIn
     *        The information for PSTN conferencing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateConferenceProviderRequest withPSTNDialIn(PSTNDialIn pSTNDialIn) {
        setPSTNDialIn(pSTNDialIn);
        return this;
    }

    /**
     * <p>
     * The meeting settings for the conference provider.
     * </p>
     * 
     * @param meetingSetting
     *        The meeting settings for the conference provider.
     */

    public void setMeetingSetting(MeetingSetting meetingSetting) {
        this.meetingSetting = meetingSetting;
    }

    /**
     * <p>
     * The meeting settings for the conference provider.
     * </p>
     * 
     * @return The meeting settings for the conference provider.
     */

    public MeetingSetting getMeetingSetting() {
        return this.meetingSetting;
    }

    /**
     * <p>
     * The meeting settings for the conference provider.
     * </p>
     * 
     * @param meetingSetting
     *        The meeting settings for the conference provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateConferenceProviderRequest withMeetingSetting(MeetingSetting meetingSetting) {
        setMeetingSetting(meetingSetting);
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
        if (getConferenceProviderArn() != null)
            sb.append("ConferenceProviderArn: ").append(getConferenceProviderArn()).append(",");
        if (getConferenceProviderType() != null)
            sb.append("ConferenceProviderType: ").append(getConferenceProviderType()).append(",");
        if (getIPDialIn() != null)
            sb.append("IPDialIn: ").append(getIPDialIn()).append(",");
        if (getPSTNDialIn() != null)
            sb.append("PSTNDialIn: ").append(getPSTNDialIn()).append(",");
        if (getMeetingSetting() != null)
            sb.append("MeetingSetting: ").append(getMeetingSetting());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateConferenceProviderRequest == false)
            return false;
        UpdateConferenceProviderRequest other = (UpdateConferenceProviderRequest) obj;
        if (other.getConferenceProviderArn() == null ^ this.getConferenceProviderArn() == null)
            return false;
        if (other.getConferenceProviderArn() != null && other.getConferenceProviderArn().equals(this.getConferenceProviderArn()) == false)
            return false;
        if (other.getConferenceProviderType() == null ^ this.getConferenceProviderType() == null)
            return false;
        if (other.getConferenceProviderType() != null && other.getConferenceProviderType().equals(this.getConferenceProviderType()) == false)
            return false;
        if (other.getIPDialIn() == null ^ this.getIPDialIn() == null)
            return false;
        if (other.getIPDialIn() != null && other.getIPDialIn().equals(this.getIPDialIn()) == false)
            return false;
        if (other.getPSTNDialIn() == null ^ this.getPSTNDialIn() == null)
            return false;
        if (other.getPSTNDialIn() != null && other.getPSTNDialIn().equals(this.getPSTNDialIn()) == false)
            return false;
        if (other.getMeetingSetting() == null ^ this.getMeetingSetting() == null)
            return false;
        if (other.getMeetingSetting() != null && other.getMeetingSetting().equals(this.getMeetingSetting()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConferenceProviderArn() == null) ? 0 : getConferenceProviderArn().hashCode());
        hashCode = prime * hashCode + ((getConferenceProviderType() == null) ? 0 : getConferenceProviderType().hashCode());
        hashCode = prime * hashCode + ((getIPDialIn() == null) ? 0 : getIPDialIn().hashCode());
        hashCode = prime * hashCode + ((getPSTNDialIn() == null) ? 0 : getPSTNDialIn().hashCode());
        hashCode = prime * hashCode + ((getMeetingSetting() == null) ? 0 : getMeetingSetting().hashCode());
        return hashCode;
    }

    @Override
    public UpdateConferenceProviderRequest clone() {
        return (UpdateConferenceProviderRequest) super.clone();
    }

}
