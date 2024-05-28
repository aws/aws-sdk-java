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
package com.amazonaws.services.pinpointsmsvoicev2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DeleteRegistrationAttachment"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteRegistrationAttachmentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier for the registration attachment.
     * </p>
     */
    private String registrationAttachmentId;

    /**
     * <p>
     * The unique identifier for the registration attachment.
     * </p>
     * 
     * @param registrationAttachmentId
     *        The unique identifier for the registration attachment.
     */

    public void setRegistrationAttachmentId(String registrationAttachmentId) {
        this.registrationAttachmentId = registrationAttachmentId;
    }

    /**
     * <p>
     * The unique identifier for the registration attachment.
     * </p>
     * 
     * @return The unique identifier for the registration attachment.
     */

    public String getRegistrationAttachmentId() {
        return this.registrationAttachmentId;
    }

    /**
     * <p>
     * The unique identifier for the registration attachment.
     * </p>
     * 
     * @param registrationAttachmentId
     *        The unique identifier for the registration attachment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteRegistrationAttachmentRequest withRegistrationAttachmentId(String registrationAttachmentId) {
        setRegistrationAttachmentId(registrationAttachmentId);
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
        if (getRegistrationAttachmentId() != null)
            sb.append("RegistrationAttachmentId: ").append(getRegistrationAttachmentId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteRegistrationAttachmentRequest == false)
            return false;
        DeleteRegistrationAttachmentRequest other = (DeleteRegistrationAttachmentRequest) obj;
        if (other.getRegistrationAttachmentId() == null ^ this.getRegistrationAttachmentId() == null)
            return false;
        if (other.getRegistrationAttachmentId() != null && other.getRegistrationAttachmentId().equals(this.getRegistrationAttachmentId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRegistrationAttachmentId() == null) ? 0 : getRegistrationAttachmentId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteRegistrationAttachmentRequest clone() {
        return (DeleteRegistrationAttachmentRequest) super.clone();
    }

}
