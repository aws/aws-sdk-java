/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.identitymanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/TagMFADevice" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TagMFADeviceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier for the IAM virtual MFA device to which you want to add tags. For virtual MFA devices, the
     * serial number is the same as the ARN.
     * </p>
     * <p>
     * This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of
     * the following characters: _+=,.@-
     * </p>
     */
    private String serialNumber;
    /**
     * <p>
     * The list of tags that you want to attach to the IAM virtual MFA device. Each tag consists of a key name and an
     * associated value.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * <p>
     * The unique identifier for the IAM virtual MFA device to which you want to add tags. For virtual MFA devices, the
     * serial number is the same as the ARN.
     * </p>
     * <p>
     * This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of
     * the following characters: _+=,.@-
     * </p>
     * 
     * @param serialNumber
     *        The unique identifier for the IAM virtual MFA device to which you want to add tags. For virtual MFA
     *        devices, the serial number is the same as the ARN.</p>
     *        <p>
     *        This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string
     *        of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also
     *        include any of the following characters: _+=,.@-
     */

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    /**
     * <p>
     * The unique identifier for the IAM virtual MFA device to which you want to add tags. For virtual MFA devices, the
     * serial number is the same as the ARN.
     * </p>
     * <p>
     * This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of
     * the following characters: _+=,.@-
     * </p>
     * 
     * @return The unique identifier for the IAM virtual MFA device to which you want to add tags. For virtual MFA
     *         devices, the serial number is the same as the ARN.</p>
     *         <p>
     *         This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string
     *         of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also
     *         include any of the following characters: _+=,.@-
     */

    public String getSerialNumber() {
        return this.serialNumber;
    }

    /**
     * <p>
     * The unique identifier for the IAM virtual MFA device to which you want to add tags. For virtual MFA devices, the
     * serial number is the same as the ARN.
     * </p>
     * <p>
     * This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of
     * the following characters: _+=,.@-
     * </p>
     * 
     * @param serialNumber
     *        The unique identifier for the IAM virtual MFA device to which you want to add tags. For virtual MFA
     *        devices, the serial number is the same as the ARN.</p>
     *        <p>
     *        This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string
     *        of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also
     *        include any of the following characters: _+=,.@-
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TagMFADeviceRequest withSerialNumber(String serialNumber) {
        setSerialNumber(serialNumber);
        return this;
    }

    /**
     * <p>
     * The list of tags that you want to attach to the IAM virtual MFA device. Each tag consists of a key name and an
     * associated value.
     * </p>
     * 
     * @return The list of tags that you want to attach to the IAM virtual MFA device. Each tag consists of a key name
     *         and an associated value.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * The list of tags that you want to attach to the IAM virtual MFA device. Each tag consists of a key name and an
     * associated value.
     * </p>
     * 
     * @param tags
     *        The list of tags that you want to attach to the IAM virtual MFA device. Each tag consists of a key name
     *        and an associated value.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * The list of tags that you want to attach to the IAM virtual MFA device. Each tag consists of a key name and an
     * associated value.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The list of tags that you want to attach to the IAM virtual MFA device. Each tag consists of a key name
     *        and an associated value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TagMFADeviceRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of tags that you want to attach to the IAM virtual MFA device. Each tag consists of a key name and an
     * associated value.
     * </p>
     * 
     * @param tags
     *        The list of tags that you want to attach to the IAM virtual MFA device. Each tag consists of a key name
     *        and an associated value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TagMFADeviceRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getSerialNumber() != null)
            sb.append("SerialNumber: ").append(getSerialNumber()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TagMFADeviceRequest == false)
            return false;
        TagMFADeviceRequest other = (TagMFADeviceRequest) obj;
        if (other.getSerialNumber() == null ^ this.getSerialNumber() == null)
            return false;
        if (other.getSerialNumber() != null && other.getSerialNumber().equals(this.getSerialNumber()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSerialNumber() == null) ? 0 : getSerialNumber().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public TagMFADeviceRequest clone() {
        return (TagMFADeviceRequest) super.clone();
    }

}
