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
 * Placeholder documentation for InputAttachment
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/InputAttachment" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InputAttachment implements Serializable, Cloneable, StructuredPojo {

    /**
     * User-specified name for the attachment. This is required if the user wants to use this input in an input switch
     * action.
     */
    private String inputAttachmentName;
    /** The ID of the input */
    private String inputId;
    /** Settings of an input (caption selector, etc.) */
    private InputSettings inputSettings;

    /**
     * User-specified name for the attachment. This is required if the user wants to use this input in an input switch
     * action.
     * 
     * @param inputAttachmentName
     *        User-specified name for the attachment. This is required if the user wants to use this input in an input
     *        switch action.
     */

    public void setInputAttachmentName(String inputAttachmentName) {
        this.inputAttachmentName = inputAttachmentName;
    }

    /**
     * User-specified name for the attachment. This is required if the user wants to use this input in an input switch
     * action.
     * 
     * @return User-specified name for the attachment. This is required if the user wants to use this input in an input
     *         switch action.
     */

    public String getInputAttachmentName() {
        return this.inputAttachmentName;
    }

    /**
     * User-specified name for the attachment. This is required if the user wants to use this input in an input switch
     * action.
     * 
     * @param inputAttachmentName
     *        User-specified name for the attachment. This is required if the user wants to use this input in an input
     *        switch action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputAttachment withInputAttachmentName(String inputAttachmentName) {
        setInputAttachmentName(inputAttachmentName);
        return this;
    }

    /**
     * The ID of the input
     * 
     * @param inputId
     *        The ID of the input
     */

    public void setInputId(String inputId) {
        this.inputId = inputId;
    }

    /**
     * The ID of the input
     * 
     * @return The ID of the input
     */

    public String getInputId() {
        return this.inputId;
    }

    /**
     * The ID of the input
     * 
     * @param inputId
     *        The ID of the input
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputAttachment withInputId(String inputId) {
        setInputId(inputId);
        return this;
    }

    /**
     * Settings of an input (caption selector, etc.)
     * 
     * @param inputSettings
     *        Settings of an input (caption selector, etc.)
     */

    public void setInputSettings(InputSettings inputSettings) {
        this.inputSettings = inputSettings;
    }

    /**
     * Settings of an input (caption selector, etc.)
     * 
     * @return Settings of an input (caption selector, etc.)
     */

    public InputSettings getInputSettings() {
        return this.inputSettings;
    }

    /**
     * Settings of an input (caption selector, etc.)
     * 
     * @param inputSettings
     *        Settings of an input (caption selector, etc.)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputAttachment withInputSettings(InputSettings inputSettings) {
        setInputSettings(inputSettings);
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
        if (getInputAttachmentName() != null)
            sb.append("InputAttachmentName: ").append(getInputAttachmentName()).append(",");
        if (getInputId() != null)
            sb.append("InputId: ").append(getInputId()).append(",");
        if (getInputSettings() != null)
            sb.append("InputSettings: ").append(getInputSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InputAttachment == false)
            return false;
        InputAttachment other = (InputAttachment) obj;
        if (other.getInputAttachmentName() == null ^ this.getInputAttachmentName() == null)
            return false;
        if (other.getInputAttachmentName() != null && other.getInputAttachmentName().equals(this.getInputAttachmentName()) == false)
            return false;
        if (other.getInputId() == null ^ this.getInputId() == null)
            return false;
        if (other.getInputId() != null && other.getInputId().equals(this.getInputId()) == false)
            return false;
        if (other.getInputSettings() == null ^ this.getInputSettings() == null)
            return false;
        if (other.getInputSettings() != null && other.getInputSettings().equals(this.getInputSettings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInputAttachmentName() == null) ? 0 : getInputAttachmentName().hashCode());
        hashCode = prime * hashCode + ((getInputId() == null) ? 0 : getInputId().hashCode());
        hashCode = prime * hashCode + ((getInputSettings() == null) ? 0 : getInputSettings().hashCode());
        return hashCode;
    }

    @Override
    public InputAttachment clone() {
        try {
            return (InputAttachment) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.InputAttachmentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
