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
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Scte35Input Schedule Action Settings
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/Scte35InputScheduleActionSettings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Scte35InputScheduleActionSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * In fixed mode, enter the name of the input attachment that you want to use as a SCTE-35 input. (Don't enter the
     * ID of the input.)"
     */
    private String inputAttachmentNameReference;
    /** Whether the SCTE-35 input should be the active input or a fixed input. */
    private String mode;

    /**
     * In fixed mode, enter the name of the input attachment that you want to use as a SCTE-35 input. (Don't enter the
     * ID of the input.)"
     * 
     * @param inputAttachmentNameReference
     *        In fixed mode, enter the name of the input attachment that you want to use as a SCTE-35 input. (Don't
     *        enter the ID of the input.)"
     */

    public void setInputAttachmentNameReference(String inputAttachmentNameReference) {
        this.inputAttachmentNameReference = inputAttachmentNameReference;
    }

    /**
     * In fixed mode, enter the name of the input attachment that you want to use as a SCTE-35 input. (Don't enter the
     * ID of the input.)"
     * 
     * @return In fixed mode, enter the name of the input attachment that you want to use as a SCTE-35 input. (Don't
     *         enter the ID of the input.)"
     */

    public String getInputAttachmentNameReference() {
        return this.inputAttachmentNameReference;
    }

    /**
     * In fixed mode, enter the name of the input attachment that you want to use as a SCTE-35 input. (Don't enter the
     * ID of the input.)"
     * 
     * @param inputAttachmentNameReference
     *        In fixed mode, enter the name of the input attachment that you want to use as a SCTE-35 input. (Don't
     *        enter the ID of the input.)"
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Scte35InputScheduleActionSettings withInputAttachmentNameReference(String inputAttachmentNameReference) {
        setInputAttachmentNameReference(inputAttachmentNameReference);
        return this;
    }

    /**
     * Whether the SCTE-35 input should be the active input or a fixed input.
     * 
     * @param mode
     *        Whether the SCTE-35 input should be the active input or a fixed input.
     * @see Scte35InputMode
     */

    public void setMode(String mode) {
        this.mode = mode;
    }

    /**
     * Whether the SCTE-35 input should be the active input or a fixed input.
     * 
     * @return Whether the SCTE-35 input should be the active input or a fixed input.
     * @see Scte35InputMode
     */

    public String getMode() {
        return this.mode;
    }

    /**
     * Whether the SCTE-35 input should be the active input or a fixed input.
     * 
     * @param mode
     *        Whether the SCTE-35 input should be the active input or a fixed input.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Scte35InputMode
     */

    public Scte35InputScheduleActionSettings withMode(String mode) {
        setMode(mode);
        return this;
    }

    /**
     * Whether the SCTE-35 input should be the active input or a fixed input.
     * 
     * @param mode
     *        Whether the SCTE-35 input should be the active input or a fixed input.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Scte35InputMode
     */

    public Scte35InputScheduleActionSettings withMode(Scte35InputMode mode) {
        this.mode = mode.toString();
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
            sb.append("InputAttachmentNameReference: ").append(getInputAttachmentNameReference()).append(",");
        if (getMode() != null)
            sb.append("Mode: ").append(getMode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Scte35InputScheduleActionSettings == false)
            return false;
        Scte35InputScheduleActionSettings other = (Scte35InputScheduleActionSettings) obj;
        if (other.getInputAttachmentNameReference() == null ^ this.getInputAttachmentNameReference() == null)
            return false;
        if (other.getInputAttachmentNameReference() != null && other.getInputAttachmentNameReference().equals(this.getInputAttachmentNameReference()) == false)
            return false;
        if (other.getMode() == null ^ this.getMode() == null)
            return false;
        if (other.getMode() != null && other.getMode().equals(this.getMode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInputAttachmentNameReference() == null) ? 0 : getInputAttachmentNameReference().hashCode());
        hashCode = prime * hashCode + ((getMode() == null) ? 0 : getMode().hashCode());
        return hashCode;
    }

    @Override
    public Scte35InputScheduleActionSettings clone() {
        try {
            return (Scte35InputScheduleActionSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.Scte35InputScheduleActionSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
