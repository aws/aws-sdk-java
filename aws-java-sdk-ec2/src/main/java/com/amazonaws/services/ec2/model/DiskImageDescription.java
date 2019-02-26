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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes a disk image.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DiskImageDescription" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DiskImageDescription implements Serializable, Cloneable {

    /**
     * <p>
     * The checksum computed for the disk image.
     * </p>
     */
    private String checksum;
    /**
     * <p>
     * The disk image format.
     * </p>
     */
    private String format;
    /**
     * <p>
     * A presigned URL for the import manifest stored in Amazon S3. For information about creating a presigned URL for
     * an Amazon S3 object, read the "Query String Request Authentication Alternative" section of the <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/RESTAuthentication.html">Authenticating REST Requests</a>
     * topic in the <i>Amazon Simple Storage Service Developer Guide</i>.
     * </p>
     * <p>
     * For information about the import manifest referenced by this API action, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/manifest.html">VM Import Manifest</a>.
     * </p>
     */
    private String importManifestUrl;
    /**
     * <p>
     * The size of the disk image, in GiB.
     * </p>
     */
    private Long size;

    /**
     * <p>
     * The checksum computed for the disk image.
     * </p>
     * 
     * @param checksum
     *        The checksum computed for the disk image.
     */

    public void setChecksum(String checksum) {
        this.checksum = checksum;
    }

    /**
     * <p>
     * The checksum computed for the disk image.
     * </p>
     * 
     * @return The checksum computed for the disk image.
     */

    public String getChecksum() {
        return this.checksum;
    }

    /**
     * <p>
     * The checksum computed for the disk image.
     * </p>
     * 
     * @param checksum
     *        The checksum computed for the disk image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DiskImageDescription withChecksum(String checksum) {
        setChecksum(checksum);
        return this;
    }

    /**
     * <p>
     * The disk image format.
     * </p>
     * 
     * @param format
     *        The disk image format.
     * @see DiskImageFormat
     */

    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * <p>
     * The disk image format.
     * </p>
     * 
     * @return The disk image format.
     * @see DiskImageFormat
     */

    public String getFormat() {
        return this.format;
    }

    /**
     * <p>
     * The disk image format.
     * </p>
     * 
     * @param format
     *        The disk image format.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DiskImageFormat
     */

    public DiskImageDescription withFormat(String format) {
        setFormat(format);
        return this;
    }

    /**
     * <p>
     * The disk image format.
     * </p>
     * 
     * @param format
     *        The disk image format.
     * @see DiskImageFormat
     */

    public void setFormat(DiskImageFormat format) {
        withFormat(format);
    }

    /**
     * <p>
     * The disk image format.
     * </p>
     * 
     * @param format
     *        The disk image format.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DiskImageFormat
     */

    public DiskImageDescription withFormat(DiskImageFormat format) {
        this.format = format.toString();
        return this;
    }

    /**
     * <p>
     * A presigned URL for the import manifest stored in Amazon S3. For information about creating a presigned URL for
     * an Amazon S3 object, read the "Query String Request Authentication Alternative" section of the <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/RESTAuthentication.html">Authenticating REST Requests</a>
     * topic in the <i>Amazon Simple Storage Service Developer Guide</i>.
     * </p>
     * <p>
     * For information about the import manifest referenced by this API action, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/manifest.html">VM Import Manifest</a>.
     * </p>
     * 
     * @param importManifestUrl
     *        A presigned URL for the import manifest stored in Amazon S3. For information about creating a presigned
     *        URL for an Amazon S3 object, read the "Query String Request Authentication Alternative" section of the <a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/dev/RESTAuthentication.html">Authenticating REST
     *        Requests</a> topic in the <i>Amazon Simple Storage Service Developer Guide</i>.</p>
     *        <p>
     *        For information about the import manifest referenced by this API action, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/manifest.html">VM Import Manifest</a>.
     */

    public void setImportManifestUrl(String importManifestUrl) {
        this.importManifestUrl = importManifestUrl;
    }

    /**
     * <p>
     * A presigned URL for the import manifest stored in Amazon S3. For information about creating a presigned URL for
     * an Amazon S3 object, read the "Query String Request Authentication Alternative" section of the <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/RESTAuthentication.html">Authenticating REST Requests</a>
     * topic in the <i>Amazon Simple Storage Service Developer Guide</i>.
     * </p>
     * <p>
     * For information about the import manifest referenced by this API action, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/manifest.html">VM Import Manifest</a>.
     * </p>
     * 
     * @return A presigned URL for the import manifest stored in Amazon S3. For information about creating a presigned
     *         URL for an Amazon S3 object, read the "Query String Request Authentication Alternative" section of the <a
     *         href="https://docs.aws.amazon.com/AmazonS3/latest/dev/RESTAuthentication.html">Authenticating REST
     *         Requests</a> topic in the <i>Amazon Simple Storage Service Developer Guide</i>.</p>
     *         <p>
     *         For information about the import manifest referenced by this API action, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/manifest.html">VM Import Manifest</a>.
     */

    public String getImportManifestUrl() {
        return this.importManifestUrl;
    }

    /**
     * <p>
     * A presigned URL for the import manifest stored in Amazon S3. For information about creating a presigned URL for
     * an Amazon S3 object, read the "Query String Request Authentication Alternative" section of the <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/RESTAuthentication.html">Authenticating REST Requests</a>
     * topic in the <i>Amazon Simple Storage Service Developer Guide</i>.
     * </p>
     * <p>
     * For information about the import manifest referenced by this API action, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/manifest.html">VM Import Manifest</a>.
     * </p>
     * 
     * @param importManifestUrl
     *        A presigned URL for the import manifest stored in Amazon S3. For information about creating a presigned
     *        URL for an Amazon S3 object, read the "Query String Request Authentication Alternative" section of the <a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/dev/RESTAuthentication.html">Authenticating REST
     *        Requests</a> topic in the <i>Amazon Simple Storage Service Developer Guide</i>.</p>
     *        <p>
     *        For information about the import manifest referenced by this API action, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/manifest.html">VM Import Manifest</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DiskImageDescription withImportManifestUrl(String importManifestUrl) {
        setImportManifestUrl(importManifestUrl);
        return this;
    }

    /**
     * <p>
     * The size of the disk image, in GiB.
     * </p>
     * 
     * @param size
     *        The size of the disk image, in GiB.
     */

    public void setSize(Long size) {
        this.size = size;
    }

    /**
     * <p>
     * The size of the disk image, in GiB.
     * </p>
     * 
     * @return The size of the disk image, in GiB.
     */

    public Long getSize() {
        return this.size;
    }

    /**
     * <p>
     * The size of the disk image, in GiB.
     * </p>
     * 
     * @param size
     *        The size of the disk image, in GiB.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DiskImageDescription withSize(Long size) {
        setSize(size);
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
        if (getChecksum() != null)
            sb.append("Checksum: ").append(getChecksum()).append(",");
        if (getFormat() != null)
            sb.append("Format: ").append(getFormat()).append(",");
        if (getImportManifestUrl() != null)
            sb.append("ImportManifestUrl: ").append(getImportManifestUrl()).append(",");
        if (getSize() != null)
            sb.append("Size: ").append(getSize());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DiskImageDescription == false)
            return false;
        DiskImageDescription other = (DiskImageDescription) obj;
        if (other.getChecksum() == null ^ this.getChecksum() == null)
            return false;
        if (other.getChecksum() != null && other.getChecksum().equals(this.getChecksum()) == false)
            return false;
        if (other.getFormat() == null ^ this.getFormat() == null)
            return false;
        if (other.getFormat() != null && other.getFormat().equals(this.getFormat()) == false)
            return false;
        if (other.getImportManifestUrl() == null ^ this.getImportManifestUrl() == null)
            return false;
        if (other.getImportManifestUrl() != null && other.getImportManifestUrl().equals(this.getImportManifestUrl()) == false)
            return false;
        if (other.getSize() == null ^ this.getSize() == null)
            return false;
        if (other.getSize() != null && other.getSize().equals(this.getSize()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChecksum() == null) ? 0 : getChecksum().hashCode());
        hashCode = prime * hashCode + ((getFormat() == null) ? 0 : getFormat().hashCode());
        hashCode = prime * hashCode + ((getImportManifestUrl() == null) ? 0 : getImportManifestUrl().hashCode());
        hashCode = prime * hashCode + ((getSize() == null) ? 0 : getSize().hashCode());
        return hashCode;
    }

    @Override
    public DiskImageDescription clone() {
        try {
            return (DiskImageDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
