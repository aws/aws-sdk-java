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
package com.amazonaws.services.transfer.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/ImportHostKey" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImportHostKeyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the server that contains the host key that you are importing.
     * </p>
     */
    private String serverId;
    /**
     * <p>
     * The public key portion of an SSH key pair.
     * </p>
     * <p>
     * Transfer Family accepts RSA, ECDSA, and ED25519 keys.
     * </p>
     */
    private String hostKeyBody;
    /**
     * <p>
     * The text description that identifies this host key.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Key-value pairs that can be used to group and search for host keys.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The identifier of the server that contains the host key that you are importing.
     * </p>
     * 
     * @param serverId
     *        The identifier of the server that contains the host key that you are importing.
     */

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    /**
     * <p>
     * The identifier of the server that contains the host key that you are importing.
     * </p>
     * 
     * @return The identifier of the server that contains the host key that you are importing.
     */

    public String getServerId() {
        return this.serverId;
    }

    /**
     * <p>
     * The identifier of the server that contains the host key that you are importing.
     * </p>
     * 
     * @param serverId
     *        The identifier of the server that contains the host key that you are importing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportHostKeyRequest withServerId(String serverId) {
        setServerId(serverId);
        return this;
    }

    /**
     * <p>
     * The public key portion of an SSH key pair.
     * </p>
     * <p>
     * Transfer Family accepts RSA, ECDSA, and ED25519 keys.
     * </p>
     * 
     * @param hostKeyBody
     *        The public key portion of an SSH key pair.</p>
     *        <p>
     *        Transfer Family accepts RSA, ECDSA, and ED25519 keys.
     */

    public void setHostKeyBody(String hostKeyBody) {
        this.hostKeyBody = hostKeyBody;
    }

    /**
     * <p>
     * The public key portion of an SSH key pair.
     * </p>
     * <p>
     * Transfer Family accepts RSA, ECDSA, and ED25519 keys.
     * </p>
     * 
     * @return The public key portion of an SSH key pair.</p>
     *         <p>
     *         Transfer Family accepts RSA, ECDSA, and ED25519 keys.
     */

    public String getHostKeyBody() {
        return this.hostKeyBody;
    }

    /**
     * <p>
     * The public key portion of an SSH key pair.
     * </p>
     * <p>
     * Transfer Family accepts RSA, ECDSA, and ED25519 keys.
     * </p>
     * 
     * @param hostKeyBody
     *        The public key portion of an SSH key pair.</p>
     *        <p>
     *        Transfer Family accepts RSA, ECDSA, and ED25519 keys.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportHostKeyRequest withHostKeyBody(String hostKeyBody) {
        setHostKeyBody(hostKeyBody);
        return this;
    }

    /**
     * <p>
     * The text description that identifies this host key.
     * </p>
     * 
     * @param description
     *        The text description that identifies this host key.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The text description that identifies this host key.
     * </p>
     * 
     * @return The text description that identifies this host key.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The text description that identifies this host key.
     * </p>
     * 
     * @param description
     *        The text description that identifies this host key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportHostKeyRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Key-value pairs that can be used to group and search for host keys.
     * </p>
     * 
     * @return Key-value pairs that can be used to group and search for host keys.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Key-value pairs that can be used to group and search for host keys.
     * </p>
     * 
     * @param tags
     *        Key-value pairs that can be used to group and search for host keys.
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
     * Key-value pairs that can be used to group and search for host keys.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Key-value pairs that can be used to group and search for host keys.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportHostKeyRequest withTags(Tag... tags) {
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
     * Key-value pairs that can be used to group and search for host keys.
     * </p>
     * 
     * @param tags
     *        Key-value pairs that can be used to group and search for host keys.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportHostKeyRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getServerId() != null)
            sb.append("ServerId: ").append(getServerId()).append(",");
        if (getHostKeyBody() != null)
            sb.append("HostKeyBody: ").append("***Sensitive Data Redacted***").append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
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

        if (obj instanceof ImportHostKeyRequest == false)
            return false;
        ImportHostKeyRequest other = (ImportHostKeyRequest) obj;
        if (other.getServerId() == null ^ this.getServerId() == null)
            return false;
        if (other.getServerId() != null && other.getServerId().equals(this.getServerId()) == false)
            return false;
        if (other.getHostKeyBody() == null ^ this.getHostKeyBody() == null)
            return false;
        if (other.getHostKeyBody() != null && other.getHostKeyBody().equals(this.getHostKeyBody()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
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

        hashCode = prime * hashCode + ((getServerId() == null) ? 0 : getServerId().hashCode());
        hashCode = prime * hashCode + ((getHostKeyBody() == null) ? 0 : getHostKeyBody().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public ImportHostKeyRequest clone() {
        return (ImportHostKeyRequest) super.clone();
    }

}
