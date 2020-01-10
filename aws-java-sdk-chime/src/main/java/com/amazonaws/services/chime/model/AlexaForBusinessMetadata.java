/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The Alexa for Business metadata associated with an Amazon Chime user, used to integrate Alexa for Business with a
 * device.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/AlexaForBusinessMetadata" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AlexaForBusinessMetadata implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Starts or stops Alexa for Business.
     * </p>
     */
    private Boolean isAlexaForBusinessEnabled;
    /**
     * <p>
     * The ARN of the room resource.
     * </p>
     */
    private String alexaForBusinessRoomArn;

    /**
     * <p>
     * Starts or stops Alexa for Business.
     * </p>
     * 
     * @param isAlexaForBusinessEnabled
     *        Starts or stops Alexa for Business.
     */

    public void setIsAlexaForBusinessEnabled(Boolean isAlexaForBusinessEnabled) {
        this.isAlexaForBusinessEnabled = isAlexaForBusinessEnabled;
    }

    /**
     * <p>
     * Starts or stops Alexa for Business.
     * </p>
     * 
     * @return Starts or stops Alexa for Business.
     */

    public Boolean getIsAlexaForBusinessEnabled() {
        return this.isAlexaForBusinessEnabled;
    }

    /**
     * <p>
     * Starts or stops Alexa for Business.
     * </p>
     * 
     * @param isAlexaForBusinessEnabled
     *        Starts or stops Alexa for Business.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlexaForBusinessMetadata withIsAlexaForBusinessEnabled(Boolean isAlexaForBusinessEnabled) {
        setIsAlexaForBusinessEnabled(isAlexaForBusinessEnabled);
        return this;
    }

    /**
     * <p>
     * Starts or stops Alexa for Business.
     * </p>
     * 
     * @return Starts or stops Alexa for Business.
     */

    public Boolean isAlexaForBusinessEnabled() {
        return this.isAlexaForBusinessEnabled;
    }

    /**
     * <p>
     * The ARN of the room resource.
     * </p>
     * 
     * @param alexaForBusinessRoomArn
     *        The ARN of the room resource.
     */

    public void setAlexaForBusinessRoomArn(String alexaForBusinessRoomArn) {
        this.alexaForBusinessRoomArn = alexaForBusinessRoomArn;
    }

    /**
     * <p>
     * The ARN of the room resource.
     * </p>
     * 
     * @return The ARN of the room resource.
     */

    public String getAlexaForBusinessRoomArn() {
        return this.alexaForBusinessRoomArn;
    }

    /**
     * <p>
     * The ARN of the room resource.
     * </p>
     * 
     * @param alexaForBusinessRoomArn
     *        The ARN of the room resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlexaForBusinessMetadata withAlexaForBusinessRoomArn(String alexaForBusinessRoomArn) {
        setAlexaForBusinessRoomArn(alexaForBusinessRoomArn);
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
        if (getIsAlexaForBusinessEnabled() != null)
            sb.append("IsAlexaForBusinessEnabled: ").append(getIsAlexaForBusinessEnabled()).append(",");
        if (getAlexaForBusinessRoomArn() != null)
            sb.append("AlexaForBusinessRoomArn: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AlexaForBusinessMetadata == false)
            return false;
        AlexaForBusinessMetadata other = (AlexaForBusinessMetadata) obj;
        if (other.getIsAlexaForBusinessEnabled() == null ^ this.getIsAlexaForBusinessEnabled() == null)
            return false;
        if (other.getIsAlexaForBusinessEnabled() != null && other.getIsAlexaForBusinessEnabled().equals(this.getIsAlexaForBusinessEnabled()) == false)
            return false;
        if (other.getAlexaForBusinessRoomArn() == null ^ this.getAlexaForBusinessRoomArn() == null)
            return false;
        if (other.getAlexaForBusinessRoomArn() != null && other.getAlexaForBusinessRoomArn().equals(this.getAlexaForBusinessRoomArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIsAlexaForBusinessEnabled() == null) ? 0 : getIsAlexaForBusinessEnabled().hashCode());
        hashCode = prime * hashCode + ((getAlexaForBusinessRoomArn() == null) ? 0 : getAlexaForBusinessRoomArn().hashCode());
        return hashCode;
    }

    @Override
    public AlexaForBusinessMetadata clone() {
        try {
            return (AlexaForBusinessMetadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chime.model.transform.AlexaForBusinessMetadataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
