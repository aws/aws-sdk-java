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
package com.amazonaws.services.codedeploy.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the location of application artifacts stored in Amazon S3.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/S3Location" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3Location implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the Amazon S3 bucket where the application revision is stored.
     * </p>
     */
    private String bucket;
    /**
     * <p>
     * The name of the Amazon S3 object that represents the bundled artifacts for the application revision.
     * </p>
     */
    private String key;
    /**
     * <p>
     * The file type of the application revision. Must be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * tar: A tar archive file.
     * </p>
     * </li>
     * <li>
     * <p>
     * tgz: A compressed tar archive file.
     * </p>
     * </li>
     * <li>
     * <p>
     * zip: A zip archive file.
     * </p>
     * </li>
     * </ul>
     */
    private String bundleType;
    /**
     * <p>
     * A specific version of the Amazon S3 object that represents the bundled artifacts for the application revision.
     * </p>
     * <p>
     * If the version is not specified, the system uses the most recent version by default.
     * </p>
     */
    private String version;
    /**
     * <p>
     * The ETag of the Amazon S3 object that represents the bundled artifacts for the application revision.
     * </p>
     * <p>
     * If the ETag is not specified as an input parameter, ETag validation of the object is skipped.
     * </p>
     */
    private String eTag;

    /**
     * <p>
     * The name of the Amazon S3 bucket where the application revision is stored.
     * </p>
     * 
     * @param bucket
     *        The name of the Amazon S3 bucket where the application revision is stored.
     */

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * <p>
     * The name of the Amazon S3 bucket where the application revision is stored.
     * </p>
     * 
     * @return The name of the Amazon S3 bucket where the application revision is stored.
     */

    public String getBucket() {
        return this.bucket;
    }

    /**
     * <p>
     * The name of the Amazon S3 bucket where the application revision is stored.
     * </p>
     * 
     * @param bucket
     *        The name of the Amazon S3 bucket where the application revision is stored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Location withBucket(String bucket) {
        setBucket(bucket);
        return this;
    }

    /**
     * <p>
     * The name of the Amazon S3 object that represents the bundled artifacts for the application revision.
     * </p>
     * 
     * @param key
     *        The name of the Amazon S3 object that represents the bundled artifacts for the application revision.
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The name of the Amazon S3 object that represents the bundled artifacts for the application revision.
     * </p>
     * 
     * @return The name of the Amazon S3 object that represents the bundled artifacts for the application revision.
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * The name of the Amazon S3 object that represents the bundled artifacts for the application revision.
     * </p>
     * 
     * @param key
     *        The name of the Amazon S3 object that represents the bundled artifacts for the application revision.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Location withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * The file type of the application revision. Must be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * tar: A tar archive file.
     * </p>
     * </li>
     * <li>
     * <p>
     * tgz: A compressed tar archive file.
     * </p>
     * </li>
     * <li>
     * <p>
     * zip: A zip archive file.
     * </p>
     * </li>
     * </ul>
     * 
     * @param bundleType
     *        The file type of the application revision. Must be one of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        tar: A tar archive file.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        tgz: A compressed tar archive file.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        zip: A zip archive file.
     *        </p>
     *        </li>
     * @see BundleType
     */

    public void setBundleType(String bundleType) {
        this.bundleType = bundleType;
    }

    /**
     * <p>
     * The file type of the application revision. Must be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * tar: A tar archive file.
     * </p>
     * </li>
     * <li>
     * <p>
     * tgz: A compressed tar archive file.
     * </p>
     * </li>
     * <li>
     * <p>
     * zip: A zip archive file.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The file type of the application revision. Must be one of the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         tar: A tar archive file.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         tgz: A compressed tar archive file.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         zip: A zip archive file.
     *         </p>
     *         </li>
     * @see BundleType
     */

    public String getBundleType() {
        return this.bundleType;
    }

    /**
     * <p>
     * The file type of the application revision. Must be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * tar: A tar archive file.
     * </p>
     * </li>
     * <li>
     * <p>
     * tgz: A compressed tar archive file.
     * </p>
     * </li>
     * <li>
     * <p>
     * zip: A zip archive file.
     * </p>
     * </li>
     * </ul>
     * 
     * @param bundleType
     *        The file type of the application revision. Must be one of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        tar: A tar archive file.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        tgz: A compressed tar archive file.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        zip: A zip archive file.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BundleType
     */

    public S3Location withBundleType(String bundleType) {
        setBundleType(bundleType);
        return this;
    }

    /**
     * <p>
     * The file type of the application revision. Must be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * tar: A tar archive file.
     * </p>
     * </li>
     * <li>
     * <p>
     * tgz: A compressed tar archive file.
     * </p>
     * </li>
     * <li>
     * <p>
     * zip: A zip archive file.
     * </p>
     * </li>
     * </ul>
     * 
     * @param bundleType
     *        The file type of the application revision. Must be one of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        tar: A tar archive file.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        tgz: A compressed tar archive file.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        zip: A zip archive file.
     *        </p>
     *        </li>
     * @see BundleType
     */

    public void setBundleType(BundleType bundleType) {
        withBundleType(bundleType);
    }

    /**
     * <p>
     * The file type of the application revision. Must be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * tar: A tar archive file.
     * </p>
     * </li>
     * <li>
     * <p>
     * tgz: A compressed tar archive file.
     * </p>
     * </li>
     * <li>
     * <p>
     * zip: A zip archive file.
     * </p>
     * </li>
     * </ul>
     * 
     * @param bundleType
     *        The file type of the application revision. Must be one of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        tar: A tar archive file.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        tgz: A compressed tar archive file.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        zip: A zip archive file.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BundleType
     */

    public S3Location withBundleType(BundleType bundleType) {
        this.bundleType = bundleType.toString();
        return this;
    }

    /**
     * <p>
     * A specific version of the Amazon S3 object that represents the bundled artifacts for the application revision.
     * </p>
     * <p>
     * If the version is not specified, the system uses the most recent version by default.
     * </p>
     * 
     * @param version
     *        A specific version of the Amazon S3 object that represents the bundled artifacts for the application
     *        revision.</p>
     *        <p>
     *        If the version is not specified, the system uses the most recent version by default.
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * A specific version of the Amazon S3 object that represents the bundled artifacts for the application revision.
     * </p>
     * <p>
     * If the version is not specified, the system uses the most recent version by default.
     * </p>
     * 
     * @return A specific version of the Amazon S3 object that represents the bundled artifacts for the application
     *         revision.</p>
     *         <p>
     *         If the version is not specified, the system uses the most recent version by default.
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * A specific version of the Amazon S3 object that represents the bundled artifacts for the application revision.
     * </p>
     * <p>
     * If the version is not specified, the system uses the most recent version by default.
     * </p>
     * 
     * @param version
     *        A specific version of the Amazon S3 object that represents the bundled artifacts for the application
     *        revision.</p>
     *        <p>
     *        If the version is not specified, the system uses the most recent version by default.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Location withVersion(String version) {
        setVersion(version);
        return this;
    }

    /**
     * <p>
     * The ETag of the Amazon S3 object that represents the bundled artifacts for the application revision.
     * </p>
     * <p>
     * If the ETag is not specified as an input parameter, ETag validation of the object is skipped.
     * </p>
     * 
     * @param eTag
     *        The ETag of the Amazon S3 object that represents the bundled artifacts for the application revision.</p>
     *        <p>
     *        If the ETag is not specified as an input parameter, ETag validation of the object is skipped.
     */

    public void setETag(String eTag) {
        this.eTag = eTag;
    }

    /**
     * <p>
     * The ETag of the Amazon S3 object that represents the bundled artifacts for the application revision.
     * </p>
     * <p>
     * If the ETag is not specified as an input parameter, ETag validation of the object is skipped.
     * </p>
     * 
     * @return The ETag of the Amazon S3 object that represents the bundled artifacts for the application revision.</p>
     *         <p>
     *         If the ETag is not specified as an input parameter, ETag validation of the object is skipped.
     */

    public String getETag() {
        return this.eTag;
    }

    /**
     * <p>
     * The ETag of the Amazon S3 object that represents the bundled artifacts for the application revision.
     * </p>
     * <p>
     * If the ETag is not specified as an input parameter, ETag validation of the object is skipped.
     * </p>
     * 
     * @param eTag
     *        The ETag of the Amazon S3 object that represents the bundled artifacts for the application revision.</p>
     *        <p>
     *        If the ETag is not specified as an input parameter, ETag validation of the object is skipped.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Location withETag(String eTag) {
        setETag(eTag);
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
        if (getBucket() != null)
            sb.append("Bucket: ").append(getBucket()).append(",");
        if (getKey() != null)
            sb.append("Key: ").append(getKey()).append(",");
        if (getBundleType() != null)
            sb.append("BundleType: ").append(getBundleType()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion()).append(",");
        if (getETag() != null)
            sb.append("ETag: ").append(getETag());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3Location == false)
            return false;
        S3Location other = (S3Location) obj;
        if (other.getBucket() == null ^ this.getBucket() == null)
            return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false)
            return false;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getBundleType() == null ^ this.getBundleType() == null)
            return false;
        if (other.getBundleType() != null && other.getBundleType().equals(this.getBundleType()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getETag() == null ^ this.getETag() == null)
            return false;
        if (other.getETag() != null && other.getETag().equals(this.getETag()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucket() == null) ? 0 : getBucket().hashCode());
        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getBundleType() == null) ? 0 : getBundleType().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getETag() == null) ? 0 : getETag().hashCode());
        return hashCode;
    }

    @Override
    public S3Location clone() {
        try {
            return (S3Location) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codedeploy.model.transform.S3LocationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
