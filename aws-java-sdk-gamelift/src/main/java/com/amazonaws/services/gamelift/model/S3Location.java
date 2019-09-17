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
package com.amazonaws.services.gamelift.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Location in Amazon Simple Storage Service (Amazon S3) where build or script files are stored for access by Amazon
 * GameLift. This location is specified in <a>CreateBuild</a>, <a>CreateScript</a>, and <a>UpdateScript</a> requests.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/S3Location" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3Location implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Amazon S3 bucket identifier. This is the name of the S3 bucket.
     * </p>
     */
    private String bucket;
    /**
     * <p>
     * Name of the zip file containing the build files or script files.
     * </p>
     */
    private String key;
    /**
     * <p>
     * Amazon Resource Name (<a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>) for
     * an IAM role that allows Amazon GameLift to access the S3 bucket.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * Version of the file, if object versioning is turned on for the bucket. Amazon GameLift uses this information when
     * retrieving files from an S3 bucket that you own. Use this parameter to specify a specific version of the file; if
     * not set, the latest version of the file is retrieved.
     * </p>
     */
    private String objectVersion;

    /**
     * <p>
     * Amazon S3 bucket identifier. This is the name of the S3 bucket.
     * </p>
     * 
     * @param bucket
     *        Amazon S3 bucket identifier. This is the name of the S3 bucket.
     */

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * <p>
     * Amazon S3 bucket identifier. This is the name of the S3 bucket.
     * </p>
     * 
     * @return Amazon S3 bucket identifier. This is the name of the S3 bucket.
     */

    public String getBucket() {
        return this.bucket;
    }

    /**
     * <p>
     * Amazon S3 bucket identifier. This is the name of the S3 bucket.
     * </p>
     * 
     * @param bucket
     *        Amazon S3 bucket identifier. This is the name of the S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Location withBucket(String bucket) {
        setBucket(bucket);
        return this;
    }

    /**
     * <p>
     * Name of the zip file containing the build files or script files.
     * </p>
     * 
     * @param key
     *        Name of the zip file containing the build files or script files.
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * Name of the zip file containing the build files or script files.
     * </p>
     * 
     * @return Name of the zip file containing the build files or script files.
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * Name of the zip file containing the build files or script files.
     * </p>
     * 
     * @param key
     *        Name of the zip file containing the build files or script files.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Location withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * Amazon Resource Name (<a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>) for
     * an IAM role that allows Amazon GameLift to access the S3 bucket.
     * </p>
     * 
     * @param roleArn
     *        Amazon Resource Name (<a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>) for an IAM role that
     *        allows Amazon GameLift to access the S3 bucket.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * Amazon Resource Name (<a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>) for
     * an IAM role that allows Amazon GameLift to access the S3 bucket.
     * </p>
     * 
     * @return Amazon Resource Name (<a
     *         href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>) for an IAM role that
     *         allows Amazon GameLift to access the S3 bucket.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * Amazon Resource Name (<a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>) for
     * an IAM role that allows Amazon GameLift to access the S3 bucket.
     * </p>
     * 
     * @param roleArn
     *        Amazon Resource Name (<a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>) for an IAM role that
     *        allows Amazon GameLift to access the S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Location withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * Version of the file, if object versioning is turned on for the bucket. Amazon GameLift uses this information when
     * retrieving files from an S3 bucket that you own. Use this parameter to specify a specific version of the file; if
     * not set, the latest version of the file is retrieved.
     * </p>
     * 
     * @param objectVersion
     *        Version of the file, if object versioning is turned on for the bucket. Amazon GameLift uses this
     *        information when retrieving files from an S3 bucket that you own. Use this parameter to specify a specific
     *        version of the file; if not set, the latest version of the file is retrieved.
     */

    public void setObjectVersion(String objectVersion) {
        this.objectVersion = objectVersion;
    }

    /**
     * <p>
     * Version of the file, if object versioning is turned on for the bucket. Amazon GameLift uses this information when
     * retrieving files from an S3 bucket that you own. Use this parameter to specify a specific version of the file; if
     * not set, the latest version of the file is retrieved.
     * </p>
     * 
     * @return Version of the file, if object versioning is turned on for the bucket. Amazon GameLift uses this
     *         information when retrieving files from an S3 bucket that you own. Use this parameter to specify a
     *         specific version of the file; if not set, the latest version of the file is retrieved.
     */

    public String getObjectVersion() {
        return this.objectVersion;
    }

    /**
     * <p>
     * Version of the file, if object versioning is turned on for the bucket. Amazon GameLift uses this information when
     * retrieving files from an S3 bucket that you own. Use this parameter to specify a specific version of the file; if
     * not set, the latest version of the file is retrieved.
     * </p>
     * 
     * @param objectVersion
     *        Version of the file, if object versioning is turned on for the bucket. Amazon GameLift uses this
     *        information when retrieving files from an S3 bucket that you own. Use this parameter to specify a specific
     *        version of the file; if not set, the latest version of the file is retrieved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Location withObjectVersion(String objectVersion) {
        setObjectVersion(objectVersion);
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
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getObjectVersion() != null)
            sb.append("ObjectVersion: ").append(getObjectVersion());
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
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getObjectVersion() == null ^ this.getObjectVersion() == null)
            return false;
        if (other.getObjectVersion() != null && other.getObjectVersion().equals(this.getObjectVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucket() == null) ? 0 : getBucket().hashCode());
        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getObjectVersion() == null) ? 0 : getObjectVersion().hashCode());
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
        com.amazonaws.services.gamelift.model.transform.S3LocationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
