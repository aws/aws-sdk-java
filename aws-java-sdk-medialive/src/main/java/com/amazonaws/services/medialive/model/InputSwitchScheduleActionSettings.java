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
 * Settings for the action to switch an input.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/InputSwitchScheduleActionSettings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InputSwitchScheduleActionSettings implements Serializable, Cloneable, StructuredPojo {

    /** The name of the input attachment that should be switched to by this action. */
    private String inputAttachmentNameReference;

    /**
     * The name of the input attachment that should be switched to by this action.
     * 
     * @param inputAttachmentNameReference
     *        The name of the input attachment that should be switched to by this action.
     */

    public void setInputAttachmentNameReference(String inputAttachmentNameReference) {
        this.inputAttachmentNameReference = inputAttachmentNameReference;
    }

    /**
     * The name of the input attachment that should be switched to by this action.
     * 
     * @return The name of the input attachment that should be switched to by this action.
     */

    public String getInputAttachmentNameReference() {
        return this.inputAttachmentNameReference;
    }

    /**
     * The name of the input attachment that should be switched to by this action.
     * 
     * @param inputAttachmentNameReference
     *        The name of the input attachment that should be switched to by this action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputSwitchScheduleActionSettings withInputAttachmentNameReference(String inputAttachmentNameReference) {
        setInputAttachmentNameReference(inputAttachmentNameReference);
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
        if (getInputAttachmentNameReference() != null)
            sb.append("InputAttachmentNameReference: ").append(getInputAttachmentNameReference());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InputSwitchScheduleActionSettings == false)
            return false;
        InputSwitchScheduleActionSettings other = (InputSwitchScheduleActionSettings) obj;
        if (other.getInputAttachmentNameReference() == null ^ this.getInputAttachmentNameReference() == null)
            return false;
        if (other.getInputAttachmentNameReference() != null && other.getInputAttachmentNameReference().equals(this.getInputAttachmentNameReference()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInputAttachmentNameReference() == null) ? 0 : getInputAttachmentNameReference().hashCode());
        return hashCode;
    }

    @Override
    public InputSwitchScheduleActionSettings clone() {
        try {
            return (InputSwitchScheduleActionSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.InputSwitchScheduleActionSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
