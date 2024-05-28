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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/CreateParticipantToken"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateParticipantTokenRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Application-provided attributes to encode into the token and attach to a stage. Map keys and values can contain
     * UTF-8 encoded text. The maximum length of this field is 1 KB total. <i>This field is exposed to all stage
     * participants and should not be used for personally identifying, confidential, or sensitive information.</i>
     * </p>
     */
    private java.util.Map<String, String> attributes;
    /**
     * <p>
     * Set of capabilities that the user is allowed to perform in the stage. Default: <code>PUBLISH, SUBSCRIBE</code>.
     * </p>
     */
    private java.util.List<String> capabilities;
    /**
     * <p>
     * Duration (in minutes), after which the token expires. Default: 720 (12 hours).
     * </p>
     */
    private Integer duration;
    /**
     * <p>
     * ARN of the stage to which this token is scoped.
     * </p>
     */
    private String stageArn;
    /**
     * <p>
     * Name that can be specified to help identify the token. This can be any UTF-8 encoded text. <i>This field is
     * exposed to all stage participants and should not be used for personally identifying, confidential, or sensitive
     * information.</i>
     * </p>
     */
    private String userId;

    /**
     * <p>
     * Application-provided attributes to encode into the token and attach to a stage. Map keys and values can contain
     * UTF-8 encoded text. The maximum length of this field is 1 KB total. <i>This field is exposed to all stage
     * participants and should not be used for personally identifying, confidential, or sensitive information.</i>
     * </p>
     * 
     * @return Application-provided attributes to encode into the token and attach to a stage. Map keys and values can
     *         contain UTF-8 encoded text. The maximum length of this field is 1 KB total. <i>This field is exposed to
     *         all stage participants and should not be used for personally identifying, confidential, or sensitive
     *         information.</i>
     */

    public java.util.Map<String, String> getAttributes() {
        return attributes;
    }

    /**
     * <p>
     * Application-provided attributes to encode into the token and attach to a stage. Map keys and values can contain
     * UTF-8 encoded text. The maximum length of this field is 1 KB total. <i>This field is exposed to all stage
     * participants and should not be used for personally identifying, confidential, or sensitive information.</i>
     * </p>
     * 
     * @param attributes
     *        Application-provided attributes to encode into the token and attach to a stage. Map keys and values can
     *        contain UTF-8 encoded text. The maximum length of this field is 1 KB total. <i>This field is exposed to
     *        all stage participants and should not be used for personally identifying, confidential, or sensitive
     *        information.</i>
     */

    public void setAttributes(java.util.Map<String, String> attributes) {
        this.attributes = attributes;
    }

    /**
     * <p>
     * Application-provided attributes to encode into the token and attach to a stage. Map keys and values can contain
     * UTF-8 encoded text. The maximum length of this field is 1 KB total. <i>This field is exposed to all stage
     * participants and should not be used for personally identifying, confidential, or sensitive information.</i>
     * </p>
     * 
     * @param attributes
     *        Application-provided attributes to encode into the token and attach to a stage. Map keys and values can
     *        contain UTF-8 encoded text. The maximum length of this field is 1 KB total. <i>This field is exposed to
     *        all stage participants and should not be used for personally identifying, confidential, or sensitive
     *        information.</i>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateParticipantTokenRequest withAttributes(java.util.Map<String, String> attributes) {
        setAttributes(attributes);
        return this;
    }

    /**
     * Add a single Attributes entry
     *
     * @see CreateParticipantTokenRequest#withAttributes
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateParticipantTokenRequest addAttributesEntry(String key, String value) {
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

    public CreateParticipantTokenRequest clearAttributesEntries() {
        this.attributes = null;
        return this;
    }

    /**
     * <p>
     * Set of capabilities that the user is allowed to perform in the stage. Default: <code>PUBLISH, SUBSCRIBE</code>.
     * </p>
     * 
     * @return Set of capabilities that the user is allowed to perform in the stage. Default:
     *         <code>PUBLISH, SUBSCRIBE</code>.
     * @see ParticipantTokenCapability
     */

    public java.util.List<String> getCapabilities() {
        return capabilities;
    }

    /**
     * <p>
     * Set of capabilities that the user is allowed to perform in the stage. Default: <code>PUBLISH, SUBSCRIBE</code>.
     * </p>
     * 
     * @param capabilities
     *        Set of capabilities that the user is allowed to perform in the stage. Default:
     *        <code>PUBLISH, SUBSCRIBE</code>.
     * @see ParticipantTokenCapability
     */

    public void setCapabilities(java.util.Collection<String> capabilities) {
        if (capabilities == null) {
            this.capabilities = null;
            return;
        }

        this.capabilities = new java.util.ArrayList<String>(capabilities);
    }

    /**
     * <p>
     * Set of capabilities that the user is allowed to perform in the stage. Default: <code>PUBLISH, SUBSCRIBE</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCapabilities(java.util.Collection)} or {@link #withCapabilities(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param capabilities
     *        Set of capabilities that the user is allowed to perform in the stage. Default:
     *        <code>PUBLISH, SUBSCRIBE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ParticipantTokenCapability
     */

    public CreateParticipantTokenRequest withCapabilities(String... capabilities) {
        if (this.capabilities == null) {
            setCapabilities(new java.util.ArrayList<String>(capabilities.length));
        }
        for (String ele : capabilities) {
            this.capabilities.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Set of capabilities that the user is allowed to perform in the stage. Default: <code>PUBLISH, SUBSCRIBE</code>.
     * </p>
     * 
     * @param capabilities
     *        Set of capabilities that the user is allowed to perform in the stage. Default:
     *        <code>PUBLISH, SUBSCRIBE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ParticipantTokenCapability
     */

    public CreateParticipantTokenRequest withCapabilities(java.util.Collection<String> capabilities) {
        setCapabilities(capabilities);
        return this;
    }

    /**
     * <p>
     * Set of capabilities that the user is allowed to perform in the stage. Default: <code>PUBLISH, SUBSCRIBE</code>.
     * </p>
     * 
     * @param capabilities
     *        Set of capabilities that the user is allowed to perform in the stage. Default:
     *        <code>PUBLISH, SUBSCRIBE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ParticipantTokenCapability
     */

    public CreateParticipantTokenRequest withCapabilities(ParticipantTokenCapability... capabilities) {
        java.util.ArrayList<String> capabilitiesCopy = new java.util.ArrayList<String>(capabilities.length);
        for (ParticipantTokenCapability value : capabilities) {
            capabilitiesCopy.add(value.toString());
        }
        if (getCapabilities() == null) {
            setCapabilities(capabilitiesCopy);
        } else {
            getCapabilities().addAll(capabilitiesCopy);
        }
        return this;
    }

    /**
     * <p>
     * Duration (in minutes), after which the token expires. Default: 720 (12 hours).
     * </p>
     * 
     * @param duration
     *        Duration (in minutes), after which the token expires. Default: 720 (12 hours).
     */

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    /**
     * <p>
     * Duration (in minutes), after which the token expires. Default: 720 (12 hours).
     * </p>
     * 
     * @return Duration (in minutes), after which the token expires. Default: 720 (12 hours).
     */

    public Integer getDuration() {
        return this.duration;
    }

    /**
     * <p>
     * Duration (in minutes), after which the token expires. Default: 720 (12 hours).
     * </p>
     * 
     * @param duration
     *        Duration (in minutes), after which the token expires. Default: 720 (12 hours).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateParticipantTokenRequest withDuration(Integer duration) {
        setDuration(duration);
        return this;
    }

    /**
     * <p>
     * ARN of the stage to which this token is scoped.
     * </p>
     * 
     * @param stageArn
     *        ARN of the stage to which this token is scoped.
     */

    public void setStageArn(String stageArn) {
        this.stageArn = stageArn;
    }

    /**
     * <p>
     * ARN of the stage to which this token is scoped.
     * </p>
     * 
     * @return ARN of the stage to which this token is scoped.
     */

    public String getStageArn() {
        return this.stageArn;
    }

    /**
     * <p>
     * ARN of the stage to which this token is scoped.
     * </p>
     * 
     * @param stageArn
     *        ARN of the stage to which this token is scoped.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateParticipantTokenRequest withStageArn(String stageArn) {
        setStageArn(stageArn);
        return this;
    }

    /**
     * <p>
     * Name that can be specified to help identify the token. This can be any UTF-8 encoded text. <i>This field is
     * exposed to all stage participants and should not be used for personally identifying, confidential, or sensitive
     * information.</i>
     * </p>
     * 
     * @param userId
     *        Name that can be specified to help identify the token. This can be any UTF-8 encoded text. <i>This field
     *        is exposed to all stage participants and should not be used for personally identifying, confidential, or
     *        sensitive information.</i>
     */

    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * <p>
     * Name that can be specified to help identify the token. This can be any UTF-8 encoded text. <i>This field is
     * exposed to all stage participants and should not be used for personally identifying, confidential, or sensitive
     * information.</i>
     * </p>
     * 
     * @return Name that can be specified to help identify the token. This can be any UTF-8 encoded text. <i>This field
     *         is exposed to all stage participants and should not be used for personally identifying, confidential, or
     *         sensitive information.</i>
     */

    public String getUserId() {
        return this.userId;
    }

    /**
     * <p>
     * Name that can be specified to help identify the token. This can be any UTF-8 encoded text. <i>This field is
     * exposed to all stage participants and should not be used for personally identifying, confidential, or sensitive
     * information.</i>
     * </p>
     * 
     * @param userId
     *        Name that can be specified to help identify the token. This can be any UTF-8 encoded text. <i>This field
     *        is exposed to all stage participants and should not be used for personally identifying, confidential, or
     *        sensitive information.</i>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateParticipantTokenRequest withUserId(String userId) {
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
        if (getCapabilities() != null)
            sb.append("Capabilities: ").append(getCapabilities()).append(",");
        if (getDuration() != null)
            sb.append("Duration: ").append(getDuration()).append(",");
        if (getStageArn() != null)
            sb.append("StageArn: ").append(getStageArn()).append(",");
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

        if (obj instanceof CreateParticipantTokenRequest == false)
            return false;
        CreateParticipantTokenRequest other = (CreateParticipantTokenRequest) obj;
        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        if (other.getCapabilities() == null ^ this.getCapabilities() == null)
            return false;
        if (other.getCapabilities() != null && other.getCapabilities().equals(this.getCapabilities()) == false)
            return false;
        if (other.getDuration() == null ^ this.getDuration() == null)
            return false;
        if (other.getDuration() != null && other.getDuration().equals(this.getDuration()) == false)
            return false;
        if (other.getStageArn() == null ^ this.getStageArn() == null)
            return false;
        if (other.getStageArn() != null && other.getStageArn().equals(this.getStageArn()) == false)
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
        hashCode = prime * hashCode + ((getCapabilities() == null) ? 0 : getCapabilities().hashCode());
        hashCode = prime * hashCode + ((getDuration() == null) ? 0 : getDuration().hashCode());
        hashCode = prime * hashCode + ((getStageArn() == null) ? 0 : getStageArn().hashCode());
        hashCode = prime * hashCode + ((getUserId() == null) ? 0 : getUserId().hashCode());
        return hashCode;
    }

    @Override
    public CreateParticipantTokenRequest clone() {
        return (CreateParticipantTokenRequest) super.clone();
    }

}
