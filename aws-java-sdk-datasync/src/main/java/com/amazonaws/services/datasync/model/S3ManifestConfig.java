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
package com.amazonaws.services.datasync.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the S3 bucket where you're hosting the manifest that you want DataSync to use. For more information and
 * configuration examples, see <a
 * href="https://docs.aws.amazon.com/datasync/latest/userguide/transferring-with-manifest.html">Specifying what DataSync
 * transfers by using a manifest</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/S3ManifestConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3ManifestConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the Amazon S3 object key of your manifest. This can include a prefix (for example,
     * <code>prefix/my-manifest.csv</code>).
     * </p>
     */
    private String manifestObjectPath;
    /**
     * <p>
     * Specifies the Identity and Access Management (IAM) role that allows DataSync to access your manifest. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/transferring-with-manifest.html#transferring-with-manifest-access"
     * >Providing DataSync access to your manifest</a>.
     * </p>
     */
    private String bucketAccessRoleArn;
    /**
     * <p>
     * Specifies the Amazon Resource Name (ARN) of the S3 bucket where you're hosting your manifest.
     * </p>
     */
    private String s3BucketArn;
    /**
     * <p>
     * Specifies the object version ID of the manifest that you want DataSync to use. If you don't set this, DataSync
     * uses the latest version of the object.
     * </p>
     */
    private String manifestObjectVersionId;

    /**
     * <p>
     * Specifies the Amazon S3 object key of your manifest. This can include a prefix (for example,
     * <code>prefix/my-manifest.csv</code>).
     * </p>
     * 
     * @param manifestObjectPath
     *        Specifies the Amazon S3 object key of your manifest. This can include a prefix (for example,
     *        <code>prefix/my-manifest.csv</code>).
     */

    public void setManifestObjectPath(String manifestObjectPath) {
        this.manifestObjectPath = manifestObjectPath;
    }

    /**
     * <p>
     * Specifies the Amazon S3 object key of your manifest. This can include a prefix (for example,
     * <code>prefix/my-manifest.csv</code>).
     * </p>
     * 
     * @return Specifies the Amazon S3 object key of your manifest. This can include a prefix (for example,
     *         <code>prefix/my-manifest.csv</code>).
     */

    public String getManifestObjectPath() {
        return this.manifestObjectPath;
    }

    /**
     * <p>
     * Specifies the Amazon S3 object key of your manifest. This can include a prefix (for example,
     * <code>prefix/my-manifest.csv</code>).
     * </p>
     * 
     * @param manifestObjectPath
     *        Specifies the Amazon S3 object key of your manifest. This can include a prefix (for example,
     *        <code>prefix/my-manifest.csv</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3ManifestConfig withManifestObjectPath(String manifestObjectPath) {
        setManifestObjectPath(manifestObjectPath);
        return this;
    }

    /**
     * <p>
     * Specifies the Identity and Access Management (IAM) role that allows DataSync to access your manifest. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/transferring-with-manifest.html#transferring-with-manifest-access"
     * >Providing DataSync access to your manifest</a>.
     * </p>
     * 
     * @param bucketAccessRoleArn
     *        Specifies the Identity and Access Management (IAM) role that allows DataSync to access your manifest. For
     *        more information, see <a href=
     *        "https://docs.aws.amazon.com/datasync/latest/userguide/transferring-with-manifest.html#transferring-with-manifest-access"
     *        >Providing DataSync access to your manifest</a>.
     */

    public void setBucketAccessRoleArn(String bucketAccessRoleArn) {
        this.bucketAccessRoleArn = bucketAccessRoleArn;
    }

    /**
     * <p>
     * Specifies the Identity and Access Management (IAM) role that allows DataSync to access your manifest. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/transferring-with-manifest.html#transferring-with-manifest-access"
     * >Providing DataSync access to your manifest</a>.
     * </p>
     * 
     * @return Specifies the Identity and Access Management (IAM) role that allows DataSync to access your manifest. For
     *         more information, see <a href=
     *         "https://docs.aws.amazon.com/datasync/latest/userguide/transferring-with-manifest.html#transferring-with-manifest-access"
     *         >Providing DataSync access to your manifest</a>.
     */

    public String getBucketAccessRoleArn() {
        return this.bucketAccessRoleArn;
    }

    /**
     * <p>
     * Specifies the Identity and Access Management (IAM) role that allows DataSync to access your manifest. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/transferring-with-manifest.html#transferring-with-manifest-access"
     * >Providing DataSync access to your manifest</a>.
     * </p>
     * 
     * @param bucketAccessRoleArn
     *        Specifies the Identity and Access Management (IAM) role that allows DataSync to access your manifest. For
     *        more information, see <a href=
     *        "https://docs.aws.amazon.com/datasync/latest/userguide/transferring-with-manifest.html#transferring-with-manifest-access"
     *        >Providing DataSync access to your manifest</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3ManifestConfig withBucketAccessRoleArn(String bucketAccessRoleArn) {
        setBucketAccessRoleArn(bucketAccessRoleArn);
        return this;
    }

    /**
     * <p>
     * Specifies the Amazon Resource Name (ARN) of the S3 bucket where you're hosting your manifest.
     * </p>
     * 
     * @param s3BucketArn
     *        Specifies the Amazon Resource Name (ARN) of the S3 bucket where you're hosting your manifest.
     */

    public void setS3BucketArn(String s3BucketArn) {
        this.s3BucketArn = s3BucketArn;
    }

    /**
     * <p>
     * Specifies the Amazon Resource Name (ARN) of the S3 bucket where you're hosting your manifest.
     * </p>
     * 
     * @return Specifies the Amazon Resource Name (ARN) of the S3 bucket where you're hosting your manifest.
     */

    public String getS3BucketArn() {
        return this.s3BucketArn;
    }

    /**
     * <p>
     * Specifies the Amazon Resource Name (ARN) of the S3 bucket where you're hosting your manifest.
     * </p>
     * 
     * @param s3BucketArn
     *        Specifies the Amazon Resource Name (ARN) of the S3 bucket where you're hosting your manifest.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3ManifestConfig withS3BucketArn(String s3BucketArn) {
        setS3BucketArn(s3BucketArn);
        return this;
    }

    /**
     * <p>
     * Specifies the object version ID of the manifest that you want DataSync to use. If you don't set this, DataSync
     * uses the latest version of the object.
     * </p>
     * 
     * @param manifestObjectVersionId
     *        Specifies the object version ID of the manifest that you want DataSync to use. If you don't set this,
     *        DataSync uses the latest version of the object.
     */

    public void setManifestObjectVersionId(String manifestObjectVersionId) {
        this.manifestObjectVersionId = manifestObjectVersionId;
    }

    /**
     * <p>
     * Specifies the object version ID of the manifest that you want DataSync to use. If you don't set this, DataSync
     * uses the latest version of the object.
     * </p>
     * 
     * @return Specifies the object version ID of the manifest that you want DataSync to use. If you don't set this,
     *         DataSync uses the latest version of the object.
     */

    public String getManifestObjectVersionId() {
        return this.manifestObjectVersionId;
    }

    /**
     * <p>
     * Specifies the object version ID of the manifest that you want DataSync to use. If you don't set this, DataSync
     * uses the latest version of the object.
     * </p>
     * 
     * @param manifestObjectVersionId
     *        Specifies the object version ID of the manifest that you want DataSync to use. If you don't set this,
     *        DataSync uses the latest version of the object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3ManifestConfig withManifestObjectVersionId(String manifestObjectVersionId) {
        setManifestObjectVersionId(manifestObjectVersionId);
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
        if (getManifestObjectPath() != null)
            sb.append("ManifestObjectPath: ").append(getManifestObjectPath()).append(",");
        if (getBucketAccessRoleArn() != null)
            sb.append("BucketAccessRoleArn: ").append(getBucketAccessRoleArn()).append(",");
        if (getS3BucketArn() != null)
            sb.append("S3BucketArn: ").append(getS3BucketArn()).append(",");
        if (getManifestObjectVersionId() != null)
            sb.append("ManifestObjectVersionId: ").append(getManifestObjectVersionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3ManifestConfig == false)
            return false;
        S3ManifestConfig other = (S3ManifestConfig) obj;
        if (other.getManifestObjectPath() == null ^ this.getManifestObjectPath() == null)
            return false;
        if (other.getManifestObjectPath() != null && other.getManifestObjectPath().equals(this.getManifestObjectPath()) == false)
            return false;
        if (other.getBucketAccessRoleArn() == null ^ this.getBucketAccessRoleArn() == null)
            return false;
        if (other.getBucketAccessRoleArn() != null && other.getBucketAccessRoleArn().equals(this.getBucketAccessRoleArn()) == false)
            return false;
        if (other.getS3BucketArn() == null ^ this.getS3BucketArn() == null)
            return false;
        if (other.getS3BucketArn() != null && other.getS3BucketArn().equals(this.getS3BucketArn()) == false)
            return false;
        if (other.getManifestObjectVersionId() == null ^ this.getManifestObjectVersionId() == null)
            return false;
        if (other.getManifestObjectVersionId() != null && other.getManifestObjectVersionId().equals(this.getManifestObjectVersionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getManifestObjectPath() == null) ? 0 : getManifestObjectPath().hashCode());
        hashCode = prime * hashCode + ((getBucketAccessRoleArn() == null) ? 0 : getBucketAccessRoleArn().hashCode());
        hashCode = prime * hashCode + ((getS3BucketArn() == null) ? 0 : getS3BucketArn().hashCode());
        hashCode = prime * hashCode + ((getManifestObjectVersionId() == null) ? 0 : getManifestObjectVersionId().hashCode());
        return hashCode;
    }

    @Override
    public S3ManifestConfig clone() {
        try {
            return (S3ManifestConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.datasync.model.transform.S3ManifestConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
