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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/CreateVirtualMFADevice" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateVirtualMFADeviceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The path for the virtual MFA device. For more information about paths, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM identifiers</a> in the <i>IAM
     * User Guide</i>.
     * </p>
     * <p>
     * This parameter is optional. If it is not included, it defaults to a slash (/).
     * </p>
     * <p>
     * This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of either a forward slash (/) by itself or a string that must begin and end with forward
     * slashes. In addition, it can contain any ASCII character from the ! (<code>\u0021</code>) through the DEL
     * character (<code>\u007F</code>), including most punctuation characters, digits, and upper and lowercased letters.
     * </p>
     */
    private String path;
    /**
     * <p>
     * The name of the virtual MFA device. Use with path to uniquely identify a virtual MFA device.
     * </p>
     * <p>
     * This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of
     * the following characters: _+=,.@-
     * </p>
     */
    private String virtualMFADeviceName;
    /**
     * <p>
     * A list of tags that you want to attach to the new IAM virtual MFA device. Each tag consists of a key name and an
     * associated value. For more information about tagging, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html">Tagging IAM resources</a> in the <i>IAM User
     * Guide</i>.
     * </p>
     * <note>
     * <p>
     * If any one of the tags is invalid or if you exceed the allowed maximum number of tags, then the entire request
     * fails and the resource is not created.
     * </p>
     * </note>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * <p>
     * The path for the virtual MFA device. For more information about paths, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM identifiers</a> in the <i>IAM
     * User Guide</i>.
     * </p>
     * <p>
     * This parameter is optional. If it is not included, it defaults to a slash (/).
     * </p>
     * <p>
     * This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of either a forward slash (/) by itself or a string that must begin and end with forward
     * slashes. In addition, it can contain any ASCII character from the ! (<code>\u0021</code>) through the DEL
     * character (<code>\u007F</code>), including most punctuation characters, digits, and upper and lowercased letters.
     * </p>
     * 
     * @param path
     *        The path for the virtual MFA device. For more information about paths, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM identifiers</a> in the
     *        <i>IAM User Guide</i>.</p>
     *        <p>
     *        This parameter is optional. If it is not included, it defaults to a slash (/).
     *        </p>
     *        <p>
     *        This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string
     *        of characters consisting of either a forward slash (/) by itself or a string that must begin and end with
     *        forward slashes. In addition, it can contain any ASCII character from the ! (<code>\u0021</code>) through
     *        the DEL character (<code>\u007F</code>), including most punctuation characters, digits, and upper and
     *        lowercased letters.
     */

    public void setPath(String path) {
        this.path = path;
    }

    /**
     * <p>
     * The path for the virtual MFA device. For more information about paths, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM identifiers</a> in the <i>IAM
     * User Guide</i>.
     * </p>
     * <p>
     * This parameter is optional. If it is not included, it defaults to a slash (/).
     * </p>
     * <p>
     * This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of either a forward slash (/) by itself or a string that must begin and end with forward
     * slashes. In addition, it can contain any ASCII character from the ! (<code>\u0021</code>) through the DEL
     * character (<code>\u007F</code>), including most punctuation characters, digits, and upper and lowercased letters.
     * </p>
     * 
     * @return The path for the virtual MFA device. For more information about paths, see <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM identifiers</a> in the
     *         <i>IAM User Guide</i>.</p>
     *         <p>
     *         This parameter is optional. If it is not included, it defaults to a slash (/).
     *         </p>
     *         <p>
     *         This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string
     *         of characters consisting of either a forward slash (/) by itself or a string that must begin and end with
     *         forward slashes. In addition, it can contain any ASCII character from the ! (<code>\u0021</code>) through
     *         the DEL character (<code>\u007F</code>), including most punctuation characters, digits, and upper and
     *         lowercased letters.
     */

    public String getPath() {
        return this.path;
    }

    /**
     * <p>
     * The path for the virtual MFA device. For more information about paths, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM identifiers</a> in the <i>IAM
     * User Guide</i>.
     * </p>
     * <p>
     * This parameter is optional. If it is not included, it defaults to a slash (/).
     * </p>
     * <p>
     * This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of either a forward slash (/) by itself or a string that must begin and end with forward
     * slashes. In addition, it can contain any ASCII character from the ! (<code>\u0021</code>) through the DEL
     * character (<code>\u007F</code>), including most punctuation characters, digits, and upper and lowercased letters.
     * </p>
     * 
     * @param path
     *        The path for the virtual MFA device. For more information about paths, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM identifiers</a> in the
     *        <i>IAM User Guide</i>.</p>
     *        <p>
     *        This parameter is optional. If it is not included, it defaults to a slash (/).
     *        </p>
     *        <p>
     *        This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string
     *        of characters consisting of either a forward slash (/) by itself or a string that must begin and end with
     *        forward slashes. In addition, it can contain any ASCII character from the ! (<code>\u0021</code>) through
     *        the DEL character (<code>\u007F</code>), including most punctuation characters, digits, and upper and
     *        lowercased letters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVirtualMFADeviceRequest withPath(String path) {
        setPath(path);
        return this;
    }

    /**
     * <p>
     * The name of the virtual MFA device. Use with path to uniquely identify a virtual MFA device.
     * </p>
     * <p>
     * This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of
     * the following characters: _+=,.@-
     * </p>
     * 
     * @param virtualMFADeviceName
     *        The name of the virtual MFA device. Use with path to uniquely identify a virtual MFA device.</p>
     *        <p>
     *        This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string
     *        of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also
     *        include any of the following characters: _+=,.@-
     */

    public void setVirtualMFADeviceName(String virtualMFADeviceName) {
        this.virtualMFADeviceName = virtualMFADeviceName;
    }

    /**
     * <p>
     * The name of the virtual MFA device. Use with path to uniquely identify a virtual MFA device.
     * </p>
     * <p>
     * This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of
     * the following characters: _+=,.@-
     * </p>
     * 
     * @return The name of the virtual MFA device. Use with path to uniquely identify a virtual MFA device.</p>
     *         <p>
     *         This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string
     *         of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also
     *         include any of the following characters: _+=,.@-
     */

    public String getVirtualMFADeviceName() {
        return this.virtualMFADeviceName;
    }

    /**
     * <p>
     * The name of the virtual MFA device. Use with path to uniquely identify a virtual MFA device.
     * </p>
     * <p>
     * This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of
     * the following characters: _+=,.@-
     * </p>
     * 
     * @param virtualMFADeviceName
     *        The name of the virtual MFA device. Use with path to uniquely identify a virtual MFA device.</p>
     *        <p>
     *        This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string
     *        of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also
     *        include any of the following characters: _+=,.@-
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVirtualMFADeviceRequest withVirtualMFADeviceName(String virtualMFADeviceName) {
        setVirtualMFADeviceName(virtualMFADeviceName);
        return this;
    }

    /**
     * <p>
     * A list of tags that you want to attach to the new IAM virtual MFA device. Each tag consists of a key name and an
     * associated value. For more information about tagging, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html">Tagging IAM resources</a> in the <i>IAM User
     * Guide</i>.
     * </p>
     * <note>
     * <p>
     * If any one of the tags is invalid or if you exceed the allowed maximum number of tags, then the entire request
     * fails and the resource is not created.
     * </p>
     * </note>
     * 
     * @return A list of tags that you want to attach to the new IAM virtual MFA device. Each tag consists of a key name
     *         and an associated value. For more information about tagging, see <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html">Tagging IAM resources</a> in the
     *         <i>IAM User Guide</i>.</p> <note>
     *         <p>
     *         If any one of the tags is invalid or if you exceed the allowed maximum number of tags, then the entire
     *         request fails and the resource is not created.
     *         </p>
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * A list of tags that you want to attach to the new IAM virtual MFA device. Each tag consists of a key name and an
     * associated value. For more information about tagging, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html">Tagging IAM resources</a> in the <i>IAM User
     * Guide</i>.
     * </p>
     * <note>
     * <p>
     * If any one of the tags is invalid or if you exceed the allowed maximum number of tags, then the entire request
     * fails and the resource is not created.
     * </p>
     * </note>
     * 
     * @param tags
     *        A list of tags that you want to attach to the new IAM virtual MFA device. Each tag consists of a key name
     *        and an associated value. For more information about tagging, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html">Tagging IAM resources</a> in the
     *        <i>IAM User Guide</i>.</p> <note>
     *        <p>
     *        If any one of the tags is invalid or if you exceed the allowed maximum number of tags, then the entire
     *        request fails and the resource is not created.
     *        </p>
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
     * A list of tags that you want to attach to the new IAM virtual MFA device. Each tag consists of a key name and an
     * associated value. For more information about tagging, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html">Tagging IAM resources</a> in the <i>IAM User
     * Guide</i>.
     * </p>
     * <note>
     * <p>
     * If any one of the tags is invalid or if you exceed the allowed maximum number of tags, then the entire request
     * fails and the resource is not created.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of tags that you want to attach to the new IAM virtual MFA device. Each tag consists of a key name
     *        and an associated value. For more information about tagging, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html">Tagging IAM resources</a> in the
     *        <i>IAM User Guide</i>.</p> <note>
     *        <p>
     *        If any one of the tags is invalid or if you exceed the allowed maximum number of tags, then the entire
     *        request fails and the resource is not created.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVirtualMFADeviceRequest withTags(Tag... tags) {
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
     * A list of tags that you want to attach to the new IAM virtual MFA device. Each tag consists of a key name and an
     * associated value. For more information about tagging, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html">Tagging IAM resources</a> in the <i>IAM User
     * Guide</i>.
     * </p>
     * <note>
     * <p>
     * If any one of the tags is invalid or if you exceed the allowed maximum number of tags, then the entire request
     * fails and the resource is not created.
     * </p>
     * </note>
     * 
     * @param tags
     *        A list of tags that you want to attach to the new IAM virtual MFA device. Each tag consists of a key name
     *        and an associated value. For more information about tagging, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html">Tagging IAM resources</a> in the
     *        <i>IAM User Guide</i>.</p> <note>
     *        <p>
     *        If any one of the tags is invalid or if you exceed the allowed maximum number of tags, then the entire
     *        request fails and the resource is not created.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVirtualMFADeviceRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getPath() != null)
            sb.append("Path: ").append(getPath()).append(",");
        if (getVirtualMFADeviceName() != null)
            sb.append("VirtualMFADeviceName: ").append(getVirtualMFADeviceName()).append(",");
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

        if (obj instanceof CreateVirtualMFADeviceRequest == false)
            return false;
        CreateVirtualMFADeviceRequest other = (CreateVirtualMFADeviceRequest) obj;
        if (other.getPath() == null ^ this.getPath() == null)
            return false;
        if (other.getPath() != null && other.getPath().equals(this.getPath()) == false)
            return false;
        if (other.getVirtualMFADeviceName() == null ^ this.getVirtualMFADeviceName() == null)
            return false;
        if (other.getVirtualMFADeviceName() != null && other.getVirtualMFADeviceName().equals(this.getVirtualMFADeviceName()) == false)
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

        hashCode = prime * hashCode + ((getPath() == null) ? 0 : getPath().hashCode());
        hashCode = prime * hashCode + ((getVirtualMFADeviceName() == null) ? 0 : getVirtualMFADeviceName().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateVirtualMFADeviceRequest clone() {
        return (CreateVirtualMFADeviceRequest) super.clone();
    }

}
