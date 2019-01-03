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
package com.amazonaws.services.codecommit.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Returns information about a specific Git blob object.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/BlobMetadata" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BlobMetadata implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The full ID of the blob.
     * </p>
     */
    private String blobId;
    /**
     * <p>
     * The path to the blob and any associated file name, if any.
     * </p>
     */
    private String path;
    /**
     * <p>
     * The file mode permissions of the blob. File mode permission codes include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>100644</code> indicates read/write
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>100755</code> indicates read/write/execute
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>160000</code> indicates a submodule
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>120000</code> indicates a symlink
     * </p>
     * </li>
     * </ul>
     */
    private String mode;

    /**
     * <p>
     * The full ID of the blob.
     * </p>
     * 
     * @param blobId
     *        The full ID of the blob.
     */

    public void setBlobId(String blobId) {
        this.blobId = blobId;
    }

    /**
     * <p>
     * The full ID of the blob.
     * </p>
     * 
     * @return The full ID of the blob.
     */

    public String getBlobId() {
        return this.blobId;
    }

    /**
     * <p>
     * The full ID of the blob.
     * </p>
     * 
     * @param blobId
     *        The full ID of the blob.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BlobMetadata withBlobId(String blobId) {
        setBlobId(blobId);
        return this;
    }

    /**
     * <p>
     * The path to the blob and any associated file name, if any.
     * </p>
     * 
     * @param path
     *        The path to the blob and any associated file name, if any.
     */

    public void setPath(String path) {
        this.path = path;
    }

    /**
     * <p>
     * The path to the blob and any associated file name, if any.
     * </p>
     * 
     * @return The path to the blob and any associated file name, if any.
     */

    public String getPath() {
        return this.path;
    }

    /**
     * <p>
     * The path to the blob and any associated file name, if any.
     * </p>
     * 
     * @param path
     *        The path to the blob and any associated file name, if any.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BlobMetadata withPath(String path) {
        setPath(path);
        return this;
    }

    /**
     * <p>
     * The file mode permissions of the blob. File mode permission codes include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>100644</code> indicates read/write
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>100755</code> indicates read/write/execute
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>160000</code> indicates a submodule
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>120000</code> indicates a symlink
     * </p>
     * </li>
     * </ul>
     * 
     * @param mode
     *        The file mode permissions of the blob. File mode permission codes include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>100644</code> indicates read/write
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>100755</code> indicates read/write/execute
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>160000</code> indicates a submodule
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>120000</code> indicates a symlink
     *        </p>
     *        </li>
     */

    public void setMode(String mode) {
        this.mode = mode;
    }

    /**
     * <p>
     * The file mode permissions of the blob. File mode permission codes include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>100644</code> indicates read/write
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>100755</code> indicates read/write/execute
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>160000</code> indicates a submodule
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>120000</code> indicates a symlink
     * </p>
     * </li>
     * </ul>
     * 
     * @return The file mode permissions of the blob. File mode permission codes include:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>100644</code> indicates read/write
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>100755</code> indicates read/write/execute
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>160000</code> indicates a submodule
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>120000</code> indicates a symlink
     *         </p>
     *         </li>
     */

    public String getMode() {
        return this.mode;
    }

    /**
     * <p>
     * The file mode permissions of the blob. File mode permission codes include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>100644</code> indicates read/write
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>100755</code> indicates read/write/execute
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>160000</code> indicates a submodule
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>120000</code> indicates a symlink
     * </p>
     * </li>
     * </ul>
     * 
     * @param mode
     *        The file mode permissions of the blob. File mode permission codes include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>100644</code> indicates read/write
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>100755</code> indicates read/write/execute
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>160000</code> indicates a submodule
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>120000</code> indicates a symlink
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BlobMetadata withMode(String mode) {
        setMode(mode);
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
        if (getBlobId() != null)
            sb.append("BlobId: ").append(getBlobId()).append(",");
        if (getPath() != null)
            sb.append("Path: ").append(getPath()).append(",");
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

        if (obj instanceof BlobMetadata == false)
            return false;
        BlobMetadata other = (BlobMetadata) obj;
        if (other.getBlobId() == null ^ this.getBlobId() == null)
            return false;
        if (other.getBlobId() != null && other.getBlobId().equals(this.getBlobId()) == false)
            return false;
        if (other.getPath() == null ^ this.getPath() == null)
            return false;
        if (other.getPath() != null && other.getPath().equals(this.getPath()) == false)
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

        hashCode = prime * hashCode + ((getBlobId() == null) ? 0 : getBlobId().hashCode());
        hashCode = prime * hashCode + ((getPath() == null) ? 0 : getPath().hashCode());
        hashCode = prime * hashCode + ((getMode() == null) ? 0 : getMode().hashCode());
        return hashCode;
    }

    @Override
    public BlobMetadata clone() {
        try {
            return (BlobMetadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codecommit.model.transform.BlobMetadataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
