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
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Avail Blanking
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/AvailBlanking" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AvailBlanking implements Serializable, Cloneable, StructuredPojo {

    /** Blanking image to be used. Leave empty for solid black. Only bmp and png images are supported. */
    private InputLocation availBlankingImage;
    /** When set to enabled, causes video, audio and captions to be blanked when insertion metadata is added. */
    private String state;

    /**
     * Blanking image to be used. Leave empty for solid black. Only bmp and png images are supported.
     * 
     * @param availBlankingImage
     *        Blanking image to be used. Leave empty for solid black. Only bmp and png images are supported.
     */

    public void setAvailBlankingImage(InputLocation availBlankingImage) {
        this.availBlankingImage = availBlankingImage;
    }

    /**
     * Blanking image to be used. Leave empty for solid black. Only bmp and png images are supported.
     * 
     * @return Blanking image to be used. Leave empty for solid black. Only bmp and png images are supported.
     */

    public InputLocation getAvailBlankingImage() {
        return this.availBlankingImage;
    }

    /**
     * Blanking image to be used. Leave empty for solid black. Only bmp and png images are supported.
     * 
     * @param availBlankingImage
     *        Blanking image to be used. Leave empty for solid black. Only bmp and png images are supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AvailBlanking withAvailBlankingImage(InputLocation availBlankingImage) {
        setAvailBlankingImage(availBlankingImage);
        return this;
    }

    /**
     * When set to enabled, causes video, audio and captions to be blanked when insertion metadata is added.
     * 
     * @param state
     *        When set to enabled, causes video, audio and captions to be blanked when insertion metadata is added.
     * @see AvailBlankingState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * When set to enabled, causes video, audio and captions to be blanked when insertion metadata is added.
     * 
     * @return When set to enabled, causes video, audio and captions to be blanked when insertion metadata is added.
     * @see AvailBlankingState
     */

    public String getState() {
        return this.state;
    }

    /**
     * When set to enabled, causes video, audio and captions to be blanked when insertion metadata is added.
     * 
     * @param state
     *        When set to enabled, causes video, audio and captions to be blanked when insertion metadata is added.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AvailBlankingState
     */

    public AvailBlanking withState(String state) {
        setState(state);
        return this;
    }

    /**
     * When set to enabled, causes video, audio and captions to be blanked when insertion metadata is added.
     * 
     * @param state
     *        When set to enabled, causes video, audio and captions to be blanked when insertion metadata is added.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AvailBlankingState
     */

    public AvailBlanking withState(AvailBlankingState state) {
        this.state = state.toString();
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
        if (getAvailBlankingImage() != null)
            sb.append("AvailBlankingImage: ").append(getAvailBlankingImage()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AvailBlanking == false)
            return false;
        AvailBlanking other = (AvailBlanking) obj;
        if (other.getAvailBlankingImage() == null ^ this.getAvailBlankingImage() == null)
            return false;
        if (other.getAvailBlankingImage() != null && other.getAvailBlankingImage().equals(this.getAvailBlankingImage()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAvailBlankingImage() == null) ? 0 : getAvailBlankingImage().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        return hashCode;
    }

    @Override
    public AvailBlanking clone() {
        try {
            return (AvailBlanking) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.AvailBlankingMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
