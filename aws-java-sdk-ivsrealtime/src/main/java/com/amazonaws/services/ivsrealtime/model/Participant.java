/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ivsrealtime.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Object describing a participant that has joined a stage.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/Participant" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Participant implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Application-provided attributes to encode into the token and attach to a stage. Map keys and values can contain
     * UTF-8 encoded text. The maximum length of this field is 1 KB total. <i>This field is exposed to all stage
     * participants and should not be used for personally identifying, confidential, or sensitive information</i>.
     * </p>
     */
    private java.util.Map<String, String> attributes;
    /**
     * <p>
     * The participant’s browser.
     * </p>
     */
    private String browserName;
    /**
     * <p>
     * The participant’s browser version.
     * </p>
     */
    private String browserVersion;
    /**
     * <p>
     * ISO 8601 timestamp (returned as a string) when the participant first joined the stage session.
     * </p>
     */
    private java.util.Date firstJoinTime;
    /**
     * <p>
     * The participant’s Internet Service Provider.
     * </p>
     */
    private String ispName;
    /**
     * <p>
     * The participant’s operating system.
     * </p>
     */
    private String osName;
    /**
     * <p>
     * The participant’s operating system version.
     * </p>
     */
    private String osVersion;
    /**
     * <p>
     * Unique identifier for this participant, assigned by IVS.
     * </p>
     */
    private String participantId;
    /**
     * <p>
     * Whether the participant ever published to the stage session.
     * </p>
     */
    private Boolean published;
    /**
     * <p>
     * The participant’s SDK version.
     * </p>
     */
    private String sdkVersion;
    /**
     * <p>
     * Whether the participant is connected to or disconnected from the stage.
     * </p>
     */
    private String state;
    /**
     * <p>
     * Customer-assigned name to help identify the token; this can be used to link a participant to a user in the
     * customer’s own systems. This can be any UTF-8 encoded text. <i>This field is exposed to all stage participants
     * and should not be used for personally identifying, confidential, or sensitive information</i>.
     * </p>
     */
    private String userId;

    /**
     * <p>
     * Application-provided attributes to encode into the token and attach to a stage. Map keys and values can contain
     * UTF-8 encoded text. The maximum length of this field is 1 KB total. <i>This field is exposed to all stage
     * participants and should not be used for personally identifying, confidential, or sensitive information</i>.
     * </p>
     * 
     * @return Application-provided attributes to encode into the token and attach to a stage. Map keys and values can
     *         contain UTF-8 encoded text. The maximum length of this field is 1 KB total. <i>This field is exposed to
     *         all stage participants and should not be used for personally identifying, confidential, or sensitive
     *         information</i>.
     */

    public java.util.Map<String, String> getAttributes() {
        return attributes;
    }

    /**
     * <p>
     * Application-provided attributes to encode into the token and attach to a stage. Map keys and values can contain
     * UTF-8 encoded text. The maximum length of this field is 1 KB total. <i>This field is exposed to all stage
     * participants and should not be used for personally identifying, confidential, or sensitive information</i>.
     * </p>
     * 
     * @param attributes
     *        Application-provided attributes to encode into the token and attach to a stage. Map keys and values can
     *        contain UTF-8 encoded text. The maximum length of this field is 1 KB total. <i>This field is exposed to
     *        all stage participants and should not be used for personally identifying, confidential, or sensitive
     *        information</i>.
     */

    public void setAttributes(java.util.Map<String, String> attributes) {
        this.attributes = attributes;
    }

    /**
     * <p>
     * Application-provided attributes to encode into the token and attach to a stage. Map keys and values can contain
     * UTF-8 encoded text. The maximum length of this field is 1 KB total. <i>This field is exposed to all stage
     * participants and should not be used for personally identifying, confidential, or sensitive information</i>.
     * </p>
     * 
     * @param attributes
     *        Application-provided attributes to encode into the token and attach to a stage. Map keys and values can
     *        contain UTF-8 encoded text. The maximum length of this field is 1 KB total. <i>This field is exposed to
     *        all stage participants and should not be used for personally identifying, confidential, or sensitive
     *        information</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Participant withAttributes(java.util.Map<String, String> attributes) {
        setAttributes(attributes);
        return this;
    }

    /**
     * Add a single Attributes entry
     *
     * @see Participant#withAttributes
     * @returns a reference to this object so that method calls can be chained together.
     */

    public Participant addAttributesEntry(String key, String value) {
        if (null == this.attributes) {
            this.attributes = new java.util.HashMap<String, String>();
        }
        if (this.attributes.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.attributes.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Attributes.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Participant clearAttributesEntries() {
        this.attributes = null;
        return this;
    }

    /**
     * <p>
     * The participant’s browser.
     * </p>
     * 
     * @param browserName
     *        The participant’s browser.
     */

    public void setBrowserName(String browserName) {
        this.browserName = browserName;
    }

    /**
     * <p>
     * The participant’s browser.
     * </p>
     * 
     * @return The participant’s browser.
     */

    public String getBrowserName() {
        return this.browserName;
    }

    /**
     * <p>
     * The participant’s browser.
     * </p>
     * 
     * @param browserName
     *        The participant’s browser.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Participant withBrowserName(String browserName) {
        setBrowserName(browserName);
        return this;
    }

    /**
     * <p>
     * The participant’s browser version.
     * </p>
     * 
     * @param browserVersion
     *        The participant’s browser version.
     */

    public void setBrowserVersion(String browserVersion) {
        this.browserVersion = browserVersion;
    }

    /**
     * <p>
     * The participant’s browser version.
     * </p>
     * 
     * @return The participant’s browser version.
     */

    public String getBrowserVersion() {
        return this.browserVersion;
    }

    /**
     * <p>
     * The participant’s browser version.
     * </p>
     * 
     * @param browserVersion
     *        The participant’s browser version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Participant withBrowserVersion(String browserVersion) {
        setBrowserVersion(browserVersion);
        return this;
    }

    /**
     * <p>
     * ISO 8601 timestamp (returned as a string) when the participant first joined the stage session.
     * </p>
     * 
     * @param firstJoinTime
     *        ISO 8601 timestamp (returned as a string) when the participant first joined the stage session.
     */

    public void setFirstJoinTime(java.util.Date firstJoinTime) {
        this.firstJoinTime = firstJoinTime;
    }

    /**
     * <p>
     * ISO 8601 timestamp (returned as a string) when the participant first joined the stage session.
     * </p>
     * 
     * @return ISO 8601 timestamp (returned as a string) when the participant first joined the stage session.
     */

    public java.util.Date getFirstJoinTime() {
        return this.firstJoinTime;
    }

    /**
     * <p>
     * ISO 8601 timestamp (returned as a string) when the participant first joined the stage session.
     * </p>
     * 
     * @param firstJoinTime
     *        ISO 8601 timestamp (returned as a string) when the participant first joined the stage session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Participant withFirstJoinTime(java.util.Date firstJoinTime) {
        setFirstJoinTime(firstJoinTime);
        return this;
    }

    /**
     * <p>
     * The participant’s Internet Service Provider.
     * </p>
     * 
     * @param ispName
     *        The participant’s Internet Service Provider.
     */

    public void setIspName(String ispName) {
        this.ispName = ispName;
    }

    /**
     * <p>
     * The participant’s Internet Service Provider.
     * </p>
     * 
     * @return The participant’s Internet Service Provider.
     */

    public String getIspName() {
        return this.ispName;
    }

    /**
     * <p>
     * The participant’s Internet Service Provider.
     * </p>
     * 
     * @param ispName
     *        The participant’s Internet Service Provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Participant withIspName(String ispName) {
        setIspName(ispName);
        return this;
    }

    /**
     * <p>
     * The participant’s operating system.
     * </p>
     * 
     * @param osName
     *        The participant’s operating system.
     */

    public void setOsName(String osName) {
        this.osName = osName;
    }

    /**
     * <p>
     * The participant’s operating system.
     * </p>
     * 
     * @return The participant’s operating system.
     */

    public String getOsName() {
        return this.osName;
    }

    /**
     * <p>
     * The participant’s operating system.
     * </p>
     * 
     * @param osName
     *        The participant’s operating system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Participant withOsName(String osName) {
        setOsName(osName);
        return this;
    }

    /**
     * <p>
     * The participant’s operating system version.
     * </p>
     * 
     * @param osVersion
     *        The participant’s operating system version.
     */

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    /**
     * <p>
     * The participant’s operating system version.
     * </p>
     * 
     * @return The participant’s operating system version.
     */

    public String getOsVersion() {
        return this.osVersion;
    }

    /**
     * <p>
     * The participant’s operating system version.
     * </p>
     * 
     * @param osVersion
     *        The participant’s operating system version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Participant withOsVersion(String osVersion) {
        setOsVersion(osVersion);
        return this;
    }

    /**
     * <p>
     * Unique identifier for this participant, assigned by IVS.
     * </p>
     * 
     * @param participantId
     *        Unique identifier for this participant, assigned by IVS.
     */

    public void setParticipantId(String participantId) {
        this.participantId = participantId;
    }

    /**
     * <p>
     * Unique identifier for this participant, assigned by IVS.
     * </p>
     * 
     * @return Unique identifier for this participant, assigned by IVS.
     */

    public String getParticipantId() {
        return this.participantId;
    }

    /**
     * <p>
     * Unique identifier for this participant, assigned by IVS.
     * </p>
     * 
     * @param participantId
     *        Unique identifier for this participant, assigned by IVS.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Participant withParticipantId(String participantId) {
        setParticipantId(participantId);
        return this;
    }

    /**
     * <p>
     * Whether the participant ever published to the stage session.
     * </p>
     * 
     * @param published
     *        Whether the participant ever published to the stage session.
     */

    public void setPublished(Boolean published) {
        this.published = published;
    }

    /**
     * <p>
     * Whether the participant ever published to the stage session.
     * </p>
     * 
     * @return Whether the participant ever published to the stage session.
     */

    public Boolean getPublished() {
        return this.published;
    }

    /**
     * <p>
     * Whether the participant ever published to the stage session.
     * </p>
     * 
     * @param published
     *        Whether the participant ever published to the stage session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Participant withPublished(Boolean published) {
        setPublished(published);
        return this;
    }

    /**
     * <p>
     * Whether the participant ever published to the stage session.
     * </p>
     * 
     * @return Whether the participant ever published to the stage session.
     */

    public Boolean isPublished() {
        return this.published;
    }

    /**
     * <p>
     * The participant’s SDK version.
     * </p>
     * 
     * @param sdkVersion
     *        The participant’s SDK version.
     */

    public void setSdkVersion(String sdkVersion) {
        this.sdkVersion = sdkVersion;
    }

    /**
     * <p>
     * The participant’s SDK version.
     * </p>
     * 
     * @return The participant’s SDK version.
     */

    public String getSdkVersion() {
        return this.sdkVersion;
    }

    /**
     * <p>
     * The participant’s SDK version.
     * </p>
     * 
     * @param sdkVersion
     *        The participant’s SDK version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Participant withSdkVersion(String sdkVersion) {
        setSdkVersion(sdkVersion);
        return this;
    }

    /**
     * <p>
     * Whether the participant is connected to or disconnected from the stage.
     * </p>
     * 
     * @param state
     *        Whether the participant is connected to or disconnected from the stage.
     * @see ParticipantState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * Whether the participant is connected to or disconnected from the stage.
     * </p>
     * 
     * @return Whether the participant is connected to or disconnected from the stage.
     * @see ParticipantState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * Whether the participant is connected to or disconnected from the stage.
     * </p>
     * 
     * @param state
     *        Whether the participant is connected to or disconnected from the stage.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ParticipantState
     */

    public Participant withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * Whether the participant is connected to or disconnected from the stage.
     * </p>
     * 
     * @param state
     *        Whether the participant is connected to or disconnected from the stage.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ParticipantState
     */

    public Participant withState(ParticipantState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * Customer-assigned name to help identify the token; this can be used to link a participant to a user in the
     * customer’s own systems. This can be any UTF-8 encoded text. <i>This field is exposed to all stage participants
     * and should not be used for personally identifying, confidential, or sensitive information</i>.
     * </p>
     * 
     * @param userId
     *        Customer-assigned name to help identify the token; this can be used to link a participant to a user in the
     *        customer’s own systems. This can be any UTF-8 encoded text. <i>This field is exposed to all stage
     *        participants and should not be used for personally identifying, confidential, or sensitive
     *        information</i>.
     */

    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * <p>
     * Customer-assigned name to help identify the token; this can be used to link a participant to a user in the
     * customer’s own systems. This can be any UTF-8 encoded text. <i>This field is exposed to all stage participants
     * and should not be used for personally identifying, confidential, or sensitive information</i>.
     * </p>
     * 
     * @return Customer-assigned name to help identify the token; this can be used to link a participant to a user in
     *         the customer’s own systems. This can be any UTF-8 encoded text. <i>This field is exposed to all stage
     *         participants and should not be used for personally identifying, confidential, or sensitive
     *         information</i>.
     */

    public String getUserId() {
        return this.userId;
    }

    /**
     * <p>
     * Customer-assigned name to help identify the token; this can be used to link a participant to a user in the
     * customer’s own systems. This can be any UTF-8 encoded text. <i>This field is exposed to all stage participants
     * and should not be used for personally identifying, confidential, or sensitive information</i>.
     * </p>
     * 
     * @param userId
     *        Customer-assigned name to help identify the token; this can be used to link a participant to a user in the
     *        customer’s own systems. This can be any UTF-8 encoded text. <i>This field is exposed to all stage
     *        participants and should not be used for personally identifying, confidential, or sensitive
     *        information</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Participant withUserId(String userId) {
        setUserId(userId);
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
        if (getAttributes() != null)
            sb.append("Attributes: ").append(getAttributes()).append(",");
        if (getBrowserName() != null)
            sb.append("BrowserName: ").append(getBrowserName()).append(",");
        if (getBrowserVersion() != null)
            sb.append("BrowserVersion: ").append(getBrowserVersion()).append(",");
        if (getFirstJoinTime() != null)
            sb.append("FirstJoinTime: ").append(getFirstJoinTime()).append(",");
        if (getIspName() != null)
            sb.append("IspName: ").append(getIspName()).append(",");
        if (getOsName() != null)
            sb.append("OsName: ").append(getOsName()).append(",");
        if (getOsVersion() != null)
            sb.append("OsVersion: ").append(getOsVersion()).append(",");
        if (getParticipantId() != null)
            sb.append("ParticipantId: ").append(getParticipantId()).append(",");
        if (getPublished() != null)
            sb.append("Published: ").append(getPublished()).append(",");
        if (getSdkVersion() != null)
            sb.append("SdkVersion: ").append(getSdkVersion()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getUserId() != null)
            sb.append("UserId: ").append(getUserId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Participant == false)
            return false;
        Participant other = (Participant) obj;
        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        if (other.getBrowserName() == null ^ this.getBrowserName() == null)
            return false;
        if (other.getBrowserName() != null && other.getBrowserName().equals(this.getBrowserName()) == false)
            return false;
        if (other.getBrowserVersion() == null ^ this.getBrowserVersion() == null)
            return false;
        if (other.getBrowserVersion() != null && other.getBrowserVersion().equals(this.getBrowserVersion()) == false)
            return false;
        if (other.getFirstJoinTime() == null ^ this.getFirstJoinTime() == null)
            return false;
        if (other.getFirstJoinTime() != null && other.getFirstJoinTime().equals(this.getFirstJoinTime()) == false)
            return false;
        if (other.getIspName() == null ^ this.getIspName() == null)
            return false;
        if (other.getIspName() != null && other.getIspName().equals(this.getIspName()) == false)
            return false;
        if (other.getOsName() == null ^ this.getOsName() == null)
            return false;
        if (other.getOsName() != null && other.getOsName().equals(this.getOsName()) == false)
            return false;
        if (other.getOsVersion() == null ^ this.getOsVersion() == null)
            return false;
        if (other.getOsVersion() != null && other.getOsVersion().equals(this.getOsVersion()) == false)
            return false;
        if (other.getParticipantId() == null ^ this.getParticipantId() == null)
            return false;
        if (other.getParticipantId() != null && other.getParticipantId().equals(this.getParticipantId()) == false)
            return false;
        if (other.getPublished() == null ^ this.getPublished() == null)
            return false;
        if (other.getPublished() != null && other.getPublished().equals(this.getPublished()) == false)
            return false;
        if (other.getSdkVersion() == null ^ this.getSdkVersion() == null)
            return false;
        if (other.getSdkVersion() != null && other.getSdkVersion().equals(this.getSdkVersion()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getUserId() == null ^ this.getUserId() == null)
            return false;
        if (other.getUserId() != null && other.getUserId().equals(this.getUserId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        hashCode = prime * hashCode + ((getBrowserName() == null) ? 0 : getBrowserName().hashCode());
        hashCode = prime * hashCode + ((getBrowserVersion() == null) ? 0 : getBrowserVersion().hashCode());
        hashCode = prime * hashCode + ((getFirstJoinTime() == null) ? 0 : getFirstJoinTime().hashCode());
        hashCode = prime * hashCode + ((getIspName() == null) ? 0 : getIspName().hashCode());
        hashCode = prime * hashCode + ((getOsName() == null) ? 0 : getOsName().hashCode());
        hashCode = prime * hashCode + ((getOsVersion() == null) ? 0 : getOsVersion().hashCode());
        hashCode = prime * hashCode + ((getParticipantId() == null) ? 0 : getParticipantId().hashCode());
        hashCode = prime * hashCode + ((getPublished() == null) ? 0 : getPublished().hashCode());
        hashCode = prime * hashCode + ((getSdkVersion() == null) ? 0 : getSdkVersion().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getUserId() == null) ? 0 : getUserId().hashCode());
        return hashCode;
    }

    @Override
    public Participant clone() {
        try {
            return (Participant) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ivsrealtime.model.transform.ParticipantMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
