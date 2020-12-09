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
package com.amazonaws.services.globalaccelerator.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/CreateCustomRoutingAccelerator"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateCustomRoutingAcceleratorRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of a custom routing accelerator. The name can have a maximum of 64 characters, must contain only
     * alphanumeric characters or hyphens (-), and must not begin or end with a hyphen.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The value for the address type must be IPv4.
     * </p>
     */
    private String ipAddressType;
    /**
     * <p>
     * Indicates whether an accelerator is enabled. The value is true or false. The default value is true.
     * </p>
     * <p>
     * If the value is set to true, an accelerator cannot be deleted. If set to false, the accelerator can be deleted.
     * </p>
     */
    private Boolean enabled;
    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency—that is, the uniqueness—of the
     * request.
     * </p>
     */
    private String idempotencyToken;
    /**
     * <p>
     * Create tags for an accelerator.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/global-accelerator/latest/dg/tagging-in-global-accelerator.html">Tagging in AWS
     * Global Accelerator</a> in the <i>AWS Global Accelerator Developer Guide</i>.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name of a custom routing accelerator. The name can have a maximum of 64 characters, must contain only
     * alphanumeric characters or hyphens (-), and must not begin or end with a hyphen.
     * </p>
     * 
     * @param name
     *        The name of a custom routing accelerator. The name can have a maximum of 64 characters, must contain only
     *        alphanumeric characters or hyphens (-), and must not begin or end with a hyphen.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of a custom routing accelerator. The name can have a maximum of 64 characters, must contain only
     * alphanumeric characters or hyphens (-), and must not begin or end with a hyphen.
     * </p>
     * 
     * @return The name of a custom routing accelerator. The name can have a maximum of 64 characters, must contain only
     *         alphanumeric characters or hyphens (-), and must not begin or end with a hyphen.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of a custom routing accelerator. The name can have a maximum of 64 characters, must contain only
     * alphanumeric characters or hyphens (-), and must not begin or end with a hyphen.
     * </p>
     * 
     * @param name
     *        The name of a custom routing accelerator. The name can have a maximum of 64 characters, must contain only
     *        alphanumeric characters or hyphens (-), and must not begin or end with a hyphen.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCustomRoutingAcceleratorRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The value for the address type must be IPv4.
     * </p>
     * 
     * @param ipAddressType
     *        The value for the address type must be IPv4.
     * @see IpAddressType
     */

    public void setIpAddressType(String ipAddressType) {
        this.ipAddressType = ipAddressType;
    }

    /**
     * <p>
     * The value for the address type must be IPv4.
     * </p>
     * 
     * @return The value for the address type must be IPv4.
     * @see IpAddressType
     */

    public String getIpAddressType() {
        return this.ipAddressType;
    }

    /**
     * <p>
     * The value for the address type must be IPv4.
     * </p>
     * 
     * @param ipAddressType
     *        The value for the address type must be IPv4.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IpAddressType
     */

    public CreateCustomRoutingAcceleratorRequest withIpAddressType(String ipAddressType) {
        setIpAddressType(ipAddressType);
        return this;
    }

    /**
     * <p>
     * The value for the address type must be IPv4.
     * </p>
     * 
     * @param ipAddressType
     *        The value for the address type must be IPv4.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IpAddressType
     */

    public CreateCustomRoutingAcceleratorRequest withIpAddressType(IpAddressType ipAddressType) {
        this.ipAddressType = ipAddressType.toString();
        return this;
    }

    /**
     * <p>
     * Indicates whether an accelerator is enabled. The value is true or false. The default value is true.
     * </p>
     * <p>
     * If the value is set to true, an accelerator cannot be deleted. If set to false, the accelerator can be deleted.
     * </p>
     * 
     * @param enabled
     *        Indicates whether an accelerator is enabled. The value is true or false. The default value is true. </p>
     *        <p>
     *        If the value is set to true, an accelerator cannot be deleted. If set to false, the accelerator can be
     *        deleted.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Indicates whether an accelerator is enabled. The value is true or false. The default value is true.
     * </p>
     * <p>
     * If the value is set to true, an accelerator cannot be deleted. If set to false, the accelerator can be deleted.
     * </p>
     * 
     * @return Indicates whether an accelerator is enabled. The value is true or false. The default value is true. </p>
     *         <p>
     *         If the value is set to true, an accelerator cannot be deleted. If set to false, the accelerator can be
     *         deleted.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Indicates whether an accelerator is enabled. The value is true or false. The default value is true.
     * </p>
     * <p>
     * If the value is set to true, an accelerator cannot be deleted. If set to false, the accelerator can be deleted.
     * </p>
     * 
     * @param enabled
     *        Indicates whether an accelerator is enabled. The value is true or false. The default value is true. </p>
     *        <p>
     *        If the value is set to true, an accelerator cannot be deleted. If set to false, the accelerator can be
     *        deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCustomRoutingAcceleratorRequest withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * Indicates whether an accelerator is enabled. The value is true or false. The default value is true.
     * </p>
     * <p>
     * If the value is set to true, an accelerator cannot be deleted. If set to false, the accelerator can be deleted.
     * </p>
     * 
     * @return Indicates whether an accelerator is enabled. The value is true or false. The default value is true. </p>
     *         <p>
     *         If the value is set to true, an accelerator cannot be deleted. If set to false, the accelerator can be
     *         deleted.
     */

    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency—that is, the uniqueness—of the
     * request.
     * </p>
     * 
     * @param idempotencyToken
     *        A unique, case-sensitive identifier that you provide to ensure the idempotency—that is, the uniqueness—of
     *        the request.
     */

    public void setIdempotencyToken(String idempotencyToken) {
        this.idempotencyToken = idempotencyToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency—that is, the uniqueness—of the
     * request.
     * </p>
     * 
     * @return A unique, case-sensitive identifier that you provide to ensure the idempotency—that is, the uniqueness—of
     *         the request.
     */

    public String getIdempotencyToken() {
        return this.idempotencyToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency—that is, the uniqueness—of the
     * request.
     * </p>
     * 
     * @param idempotencyToken
     *        A unique, case-sensitive identifier that you provide to ensure the idempotency—that is, the uniqueness—of
     *        the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCustomRoutingAcceleratorRequest withIdempotencyToken(String idempotencyToken) {
        setIdempotencyToken(idempotencyToken);
        return this;
    }

    /**
     * <p>
     * Create tags for an accelerator.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/global-accelerator/latest/dg/tagging-in-global-accelerator.html">Tagging in AWS
     * Global Accelerator</a> in the <i>AWS Global Accelerator Developer Guide</i>.
     * </p>
     * 
     * @return Create tags for an accelerator.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/global-accelerator/latest/dg/tagging-in-global-accelerator.html"
     *         >Tagging in AWS Global Accelerator</a> in the <i>AWS Global Accelerator Developer Guide</i>.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Create tags for an accelerator.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/global-accelerator/latest/dg/tagging-in-global-accelerator.html">Tagging in AWS
     * Global Accelerator</a> in the <i>AWS Global Accelerator Developer Guide</i>.
     * </p>
     * 
     * @param tags
     *        Create tags for an accelerator.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/global-accelerator/latest/dg/tagging-in-global-accelerator.html">Tagging
     *        in AWS Global Accelerator</a> in the <i>AWS Global Accelerator Developer Guide</i>.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * Create tags for an accelerator.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/global-accelerator/latest/dg/tagging-in-global-accelerator.html">Tagging in AWS
     * Global Accelerator</a> in the <i>AWS Global Accelerator Developer Guide</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Create tags for an accelerator.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/global-accelerator/latest/dg/tagging-in-global-accelerator.html">Tagging
     *        in AWS Global Accelerator</a> in the <i>AWS Global Accelerator Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCustomRoutingAcceleratorRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Create tags for an accelerator.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/global-accelerator/latest/dg/tagging-in-global-accelerator.html">Tagging in AWS
     * Global Accelerator</a> in the <i>AWS Global Accelerator Developer Guide</i>.
     * </p>
     * 
     * @param tags
     *        Create tags for an accelerator.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/global-accelerator/latest/dg/tagging-in-global-accelerator.html">Tagging
     *        in AWS Global Accelerator</a> in the <i>AWS Global Accelerator Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCustomRoutingAcceleratorRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getIpAddressType() != null)
            sb.append("IpAddressType: ").append(getIpAddressType()).append(",");
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled()).append(",");
        if (getIdempotencyToken() != null)
            sb.append("IdempotencyToken: ").append(getIdempotencyToken()).append(",");
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

        if (obj instanceof CreateCustomRoutingAcceleratorRequest == false)
            return false;
        CreateCustomRoutingAcceleratorRequest other = (CreateCustomRoutingAcceleratorRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getIpAddressType() == null ^ this.getIpAddressType() == null)
            return false;
        if (other.getIpAddressType() != null && other.getIpAddressType().equals(this.getIpAddressType()) == false)
            return false;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getIdempotencyToken() == null ^ this.getIdempotencyToken() == null)
            return false;
        if (other.getIdempotencyToken() != null && other.getIdempotencyToken().equals(this.getIdempotencyToken()) == false)
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

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getIpAddressType() == null) ? 0 : getIpAddressType().hashCode());
        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getIdempotencyToken() == null) ? 0 : getIdempotencyToken().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateCustomRoutingAcceleratorRequest clone() {
        return (CreateCustomRoutingAcceleratorRequest) super.clone();
    }

}
