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
package com.amazonaws.services.qbusiness.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Configuration information about the file upload during chat feature for your application.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/AppliedAttachmentsConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AppliedAttachmentsConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Information about whether file upload during chat functionality is activated for your application.
     * </p>
     */
    private String attachmentsControlMode;

    /**
     * <p>
     * Information about whether file upload during chat functionality is activated for your application.
     * </p>
     * 
     * @param attachmentsControlMode
     *        Information about whether file upload during chat functionality is activated for your application.
     * @see AttachmentsControlMode
     */

    public void setAttachmentsControlMode(String attachmentsControlMode) {
        this.attachmentsControlMode = attachmentsControlMode;
    }

    /**
     * <p>
     * Information about whether file upload during chat functionality is activated for your application.
     * </p>
     * 
     * @return Information about whether file upload during chat functionality is activated for your application.
     * @see AttachmentsControlMode
     */

    public String getAttachmentsControlMode() {
        return this.attachmentsControlMode;
    }

    /**
     * <p>
     * Information about whether file upload during chat functionality is activated for your application.
     * </p>
     * 
     * @param attachmentsControlMode
     *        Information about whether file upload during chat functionality is activated for your application.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AttachmentsControlMode
     */

    public AppliedAttachmentsConfiguration withAttachmentsControlMode(String attachmentsControlMode) {
        setAttachmentsControlMode(attachmentsControlMode);
        return this;
    }

    /**
     * <p>
     * Information about whether file upload during chat functionality is activated for your application.
     * </p>
     * 
     * @param attachmentsControlMode
     *        Information about whether file upload during chat functionality is activated for your application.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AttachmentsControlMode
     */

    public AppliedAttachmentsConfiguration withAttachmentsControlMode(AttachmentsControlMode attachmentsControlMode) {
        this.attachmentsControlMode = attachmentsControlMode.toString();
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
        if (getAttachmentsControlMode() != null)
            sb.append("AttachmentsControlMode: ").append(getAttachmentsControlMode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AppliedAttachmentsConfiguration == false)
            return false;
        AppliedAttachmentsConfiguration other = (AppliedAttachmentsConfiguration) obj;
        if (other.getAttachmentsControlMode() == null ^ this.getAttachmentsControlMode() == null)
            return false;
        if (other.getAttachmentsControlMode() != null && other.getAttachmentsControlMode().equals(this.getAttachmentsControlMode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttachmentsControlMode() == null) ? 0 : getAttachmentsControlMode().hashCode());
        return hashCode;
    }

    @Override
    public AppliedAttachmentsConfiguration clone() {
        try {
            return (AppliedAttachmentsConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.qbusiness.model.transform.AppliedAttachmentsConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
