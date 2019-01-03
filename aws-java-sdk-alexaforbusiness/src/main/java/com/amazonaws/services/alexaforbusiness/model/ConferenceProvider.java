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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An entity that provides a conferencing solution. Alexa for Business acts as the voice interface and mediator that
 * connects users to their preferred conference provider. Examples of conference providers include Amazon Chime, Zoom,
 * Cisco, and Polycom.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/ConferenceProvider"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConferenceProvider implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the newly created conference provider.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The name of the conference provider.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The type of conference providers.
     * </p>
     */
    private String type;
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
     * The ARN of the newly created conference provider.
     * </p>
     * 
     * @param arn
     *        The ARN of the newly created conference provider.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the newly created conference provider.
     * </p>
     * 
     * @return The ARN of the newly created conference provider.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the newly created conference provider.
     * </p>
     * 
     * @param arn
     *        The ARN of the newly created conference provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConferenceProvider withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The name of the conference provider.
     * </p>
     * 
     * @param name
     *        The name of the conference provider.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the conference provider.
     * </p>
     * 
     * @return The name of the conference provider.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the conference provider.
     * </p>
     * 
     * @param name
     *        The name of the conference provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConferenceProvider withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The type of conference providers.
     * </p>
     * 
     * @param type
     *        The type of conference providers.
     * @see ConferenceProviderType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of conference providers.
     * </p>
     * 
     * @return The type of conference providers.
     * @see ConferenceProviderType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of conference providers.
     * </p>
     * 
     * @param type
     *        The type of conference providers.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConferenceProviderType
     */

    public ConferenceProvider withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of conference providers.
     * </p>
     * 
     * @param type
     *        The type of conference providers.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConferenceProviderType
     */

    public ConferenceProvider withType(ConferenceProviderType type) {
        this.type = type.toString();
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

    public ConferenceProvider withIPDialIn(IPDialIn iPDialIn) {
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

    public ConferenceProvider withPSTNDialIn(PSTNDialIn pSTNDialIn) {
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

    public ConferenceProvider withMeetingSetting(MeetingSetting meetingSetting) {
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
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

        if (obj instanceof ConferenceProvider == false)
            return false;
        ConferenceProvider other = (ConferenceProvider) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
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

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getIPDialIn() == null) ? 0 : getIPDialIn().hashCode());
        hashCode = prime * hashCode + ((getPSTNDialIn() == null) ? 0 : getPSTNDialIn().hashCode());
        hashCode = prime * hashCode + ((getMeetingSetting() == null) ? 0 : getMeetingSetting().hashCode());
        return hashCode;
    }

    @Override
    public ConferenceProvider clone() {
        try {
            return (ConferenceProvider) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.alexaforbusiness.model.transform.ConferenceProviderMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
