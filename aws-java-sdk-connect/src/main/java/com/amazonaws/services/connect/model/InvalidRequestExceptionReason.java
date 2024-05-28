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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Reason why the request was invalid.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/InvalidRequestExceptionReason"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InvalidRequestExceptionReason implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Reason why the StartAttachedFiledUpload request was invalid.
     * </p>
     */
    private String attachedFileInvalidRequestExceptionReason;

    /**
     * <p>
     * Reason why the StartAttachedFiledUpload request was invalid.
     * </p>
     * 
     * @param attachedFileInvalidRequestExceptionReason
     *        Reason why the StartAttachedFiledUpload request was invalid.
     * @see AttachedFileInvalidRequestExceptionReason
     */

    public void setAttachedFileInvalidRequestExceptionReason(String attachedFileInvalidRequestExceptionReason) {
        this.attachedFileInvalidRequestExceptionReason = attachedFileInvalidRequestExceptionReason;
    }

    /**
     * <p>
     * Reason why the StartAttachedFiledUpload request was invalid.
     * </p>
     * 
     * @return Reason why the StartAttachedFiledUpload request was invalid.
     * @see AttachedFileInvalidRequestExceptionReason
     */

    public String getAttachedFileInvalidRequestExceptionReason() {
        return this.attachedFileInvalidRequestExceptionReason;
    }

    /**
     * <p>
     * Reason why the StartAttachedFiledUpload request was invalid.
     * </p>
     * 
     * @param attachedFileInvalidRequestExceptionReason
     *        Reason why the StartAttachedFiledUpload request was invalid.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AttachedFileInvalidRequestExceptionReason
     */

    public InvalidRequestExceptionReason withAttachedFileInvalidRequestExceptionReason(String attachedFileInvalidRequestExceptionReason) {
        setAttachedFileInvalidRequestExceptionReason(attachedFileInvalidRequestExceptionReason);
        return this;
    }

    /**
     * <p>
     * Reason why the StartAttachedFiledUpload request was invalid.
     * </p>
     * 
     * @param attachedFileInvalidRequestExceptionReason
     *        Reason why the StartAttachedFiledUpload request was invalid.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AttachedFileInvalidRequestExceptionReason
     */

    public InvalidRequestExceptionReason withAttachedFileInvalidRequestExceptionReason(
            AttachedFileInvalidRequestExceptionReason attachedFileInvalidRequestExceptionReason) {
        this.attachedFileInvalidRequestExceptionReason = attachedFileInvalidRequestExceptionReason.toString();
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
        if (getAttachedFileInvalidRequestExceptionReason() != null)
            sb.append("AttachedFileInvalidRequestExceptionReason: ").append(getAttachedFileInvalidRequestExceptionReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InvalidRequestExceptionReason == false)
            return false;
        InvalidRequestExceptionReason other = (InvalidRequestExceptionReason) obj;
        if (other.getAttachedFileInvalidRequestExceptionReason() == null ^ this.getAttachedFileInvalidRequestExceptionReason() == null)
            return false;
        if (other.getAttachedFileInvalidRequestExceptionReason() != null
                && other.getAttachedFileInvalidRequestExceptionReason().equals(this.getAttachedFileInvalidRequestExceptionReason()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAttachedFileInvalidRequestExceptionReason() == null) ? 0 : getAttachedFileInvalidRequestExceptionReason().hashCode());
        return hashCode;
    }

    @Override
    public InvalidRequestExceptionReason clone() {
        try {
            return (InvalidRequestExceptionReason) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.InvalidRequestExceptionReasonMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
