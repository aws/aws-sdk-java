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
package com.amazonaws.services.ecr.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/UploadLayerPart" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UploadLayerPartRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The AWS account ID associated with the registry to which you are uploading layer parts. If you do not specify a
     * registry, the default registry is assumed.
     * </p>
     */
    private String registryId;
    /**
     * <p>
     * The name of the repository to which you are uploading layer parts.
     * </p>
     */
    private String repositoryName;
    /**
     * <p>
     * The upload ID from a previous <a>InitiateLayerUpload</a> operation to associate with the layer part upload.
     * </p>
     */
    private String uploadId;
    /**
     * <p>
     * The integer value of the first byte of the layer part.
     * </p>
     */
    private Long partFirstByte;
    /**
     * <p>
     * The integer value of the last byte of the layer part.
     * </p>
     */
    private Long partLastByte;
    /**
     * <p>
     * The base64-encoded layer part payload.
     * </p>
     */
    private java.nio.ByteBuffer layerPartBlob;

    /**
     * <p>
     * The AWS account ID associated with the registry to which you are uploading layer parts. If you do not specify a
     * registry, the default registry is assumed.
     * </p>
     * 
     * @param registryId
     *        The AWS account ID associated with the registry to which you are uploading layer parts. If you do not
     *        specify a registry, the default registry is assumed.
     */

    public void setRegistryId(String registryId) {
        this.registryId = registryId;
    }

    /**
     * <p>
     * The AWS account ID associated with the registry to which you are uploading layer parts. If you do not specify a
     * registry, the default registry is assumed.
     * </p>
     * 
     * @return The AWS account ID associated with the registry to which you are uploading layer parts. If you do not
     *         specify a registry, the default registry is assumed.
     */

    public String getRegistryId() {
        return this.registryId;
    }

    /**
     * <p>
     * The AWS account ID associated with the registry to which you are uploading layer parts. If you do not specify a
     * registry, the default registry is assumed.
     * </p>
     * 
     * @param registryId
     *        The AWS account ID associated with the registry to which you are uploading layer parts. If you do not
     *        specify a registry, the default registry is assumed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UploadLayerPartRequest withRegistryId(String registryId) {
        setRegistryId(registryId);
        return this;
    }

    /**
     * <p>
     * The name of the repository to which you are uploading layer parts.
     * </p>
     * 
     * @param repositoryName
     *        The name of the repository to which you are uploading layer parts.
     */

    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    /**
     * <p>
     * The name of the repository to which you are uploading layer parts.
     * </p>
     * 
     * @return The name of the repository to which you are uploading layer parts.
     */

    public String getRepositoryName() {
        return this.repositoryName;
    }

    /**
     * <p>
     * The name of the repository to which you are uploading layer parts.
     * </p>
     * 
     * @param repositoryName
     *        The name of the repository to which you are uploading layer parts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UploadLayerPartRequest withRepositoryName(String repositoryName) {
        setRepositoryName(repositoryName);
        return this;
    }

    /**
     * <p>
     * The upload ID from a previous <a>InitiateLayerUpload</a> operation to associate with the layer part upload.
     * </p>
     * 
     * @param uploadId
     *        The upload ID from a previous <a>InitiateLayerUpload</a> operation to associate with the layer part
     *        upload.
     */

    public void setUploadId(String uploadId) {
        this.uploadId = uploadId;
    }

    /**
     * <p>
     * The upload ID from a previous <a>InitiateLayerUpload</a> operation to associate with the layer part upload.
     * </p>
     * 
     * @return The upload ID from a previous <a>InitiateLayerUpload</a> operation to associate with the layer part
     *         upload.
     */

    public String getUploadId() {
        return this.uploadId;
    }

    /**
     * <p>
     * The upload ID from a previous <a>InitiateLayerUpload</a> operation to associate with the layer part upload.
     * </p>
     * 
     * @param uploadId
     *        The upload ID from a previous <a>InitiateLayerUpload</a> operation to associate with the layer part
     *        upload.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UploadLayerPartRequest withUploadId(String uploadId) {
        setUploadId(uploadId);
        return this;
    }

    /**
     * <p>
     * The integer value of the first byte of the layer part.
     * </p>
     * 
     * @param partFirstByte
     *        The integer value of the first byte of the layer part.
     */

    public void setPartFirstByte(Long partFirstByte) {
        this.partFirstByte = partFirstByte;
    }

    /**
     * <p>
     * The integer value of the first byte of the layer part.
     * </p>
     * 
     * @return The integer value of the first byte of the layer part.
     */

    public Long getPartFirstByte() {
        return this.partFirstByte;
    }

    /**
     * <p>
     * The integer value of the first byte of the layer part.
     * </p>
     * 
     * @param partFirstByte
     *        The integer value of the first byte of the layer part.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UploadLayerPartRequest withPartFirstByte(Long partFirstByte) {
        setPartFirstByte(partFirstByte);
        return this;
    }

    /**
     * <p>
     * The integer value of the last byte of the layer part.
     * </p>
     * 
     * @param partLastByte
     *        The integer value of the last byte of the layer part.
     */

    public void setPartLastByte(Long partLastByte) {
        this.partLastByte = partLastByte;
    }

    /**
     * <p>
     * The integer value of the last byte of the layer part.
     * </p>
     * 
     * @return The integer value of the last byte of the layer part.
     */

    public Long getPartLastByte() {
        return this.partLastByte;
    }

    /**
     * <p>
     * The integer value of the last byte of the layer part.
     * </p>
     * 
     * @param partLastByte
     *        The integer value of the last byte of the layer part.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UploadLayerPartRequest withPartLastByte(Long partLastByte) {
        setPartLastByte(partLastByte);
        return this;
    }

    /**
     * <p>
     * The base64-encoded layer part payload.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * <p>
     * Warning: ByteBuffers returned by the SDK are mutable. Changes to the content or position of the byte buffer will
     * be seen by all objects that have a reference to this object. It is recommended to call ByteBuffer.duplicate() or
     * ByteBuffer.asReadOnlyBuffer() before using or reading from the buffer. This behavior will be changed in a future
     * major version of the SDK.
     * </p>
     * 
     * @param layerPartBlob
     *        The base64-encoded layer part payload.
     */

    public void setLayerPartBlob(java.nio.ByteBuffer layerPartBlob) {
        this.layerPartBlob = layerPartBlob;
    }

    /**
     * <p>
     * The base64-encoded layer part payload.
     * </p>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return The base64-encoded layer part payload.
     */

    public java.nio.ByteBuffer getLayerPartBlob() {
        return this.layerPartBlob;
    }

    /**
     * <p>
     * The base64-encoded layer part payload.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * <p>
     * Warning: ByteBuffers returned by the SDK are mutable. Changes to the content or position of the byte buffer will
     * be seen by all objects that have a reference to this object. It is recommended to call ByteBuffer.duplicate() or
     * ByteBuffer.asReadOnlyBuffer() before using or reading from the buffer. This behavior will be changed in a future
     * major version of the SDK.
     * </p>
     * 
     * @param layerPartBlob
     *        The base64-encoded layer part payload.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UploadLayerPartRequest withLayerPartBlob(java.nio.ByteBuffer layerPartBlob) {
        setLayerPartBlob(layerPartBlob);
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
        if (getRegistryId() != null)
            sb.append("RegistryId: ").append(getRegistryId()).append(",");
        if (getRepositoryName() != null)
            sb.append("RepositoryName: ").append(getRepositoryName()).append(",");
        if (getUploadId() != null)
            sb.append("UploadId: ").append(getUploadId()).append(",");
        if (getPartFirstByte() != null)
            sb.append("PartFirstByte: ").append(getPartFirstByte()).append(",");
        if (getPartLastByte() != null)
            sb.append("PartLastByte: ").append(getPartLastByte()).append(",");
        if (getLayerPartBlob() != null)
            sb.append("LayerPartBlob: ").append(getLayerPartBlob());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UploadLayerPartRequest == false)
            return false;
        UploadLayerPartRequest other = (UploadLayerPartRequest) obj;
        if (other.getRegistryId() == null ^ this.getRegistryId() == null)
            return false;
        if (other.getRegistryId() != null && other.getRegistryId().equals(this.getRegistryId()) == false)
            return false;
        if (other.getRepositoryName() == null ^ this.getRepositoryName() == null)
            return false;
        if (other.getRepositoryName() != null && other.getRepositoryName().equals(this.getRepositoryName()) == false)
            return false;
        if (other.getUploadId() == null ^ this.getUploadId() == null)
            return false;
        if (other.getUploadId() != null && other.getUploadId().equals(this.getUploadId()) == false)
            return false;
        if (other.getPartFirstByte() == null ^ this.getPartFirstByte() == null)
            return false;
        if (other.getPartFirstByte() != null && other.getPartFirstByte().equals(this.getPartFirstByte()) == false)
            return false;
        if (other.getPartLastByte() == null ^ this.getPartLastByte() == null)
            return false;
        if (other.getPartLastByte() != null && other.getPartLastByte().equals(this.getPartLastByte()) == false)
            return false;
        if (other.getLayerPartBlob() == null ^ this.getLayerPartBlob() == null)
            return false;
        if (other.getLayerPartBlob() != null && other.getLayerPartBlob().equals(this.getLayerPartBlob()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRegistryId() == null) ? 0 : getRegistryId().hashCode());
        hashCode = prime * hashCode + ((getRepositoryName() == null) ? 0 : getRepositoryName().hashCode());
        hashCode = prime * hashCode + ((getUploadId() == null) ? 0 : getUploadId().hashCode());
        hashCode = prime * hashCode + ((getPartFirstByte() == null) ? 0 : getPartFirstByte().hashCode());
        hashCode = prime * hashCode + ((getPartLastByte() == null) ? 0 : getPartLastByte().hashCode());
        hashCode = prime * hashCode + ((getLayerPartBlob() == null) ? 0 : getLayerPartBlob().hashCode());
        return hashCode;
    }

    @Override
    public UploadLayerPartRequest clone() {
        return (UploadLayerPartRequest) super.clone();
    }

}
