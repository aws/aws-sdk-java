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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The code for the Lambda function. You can specify either an object in Amazon S3, or upload a deployment package
 * directly.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsLambdaFunctionCode" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsLambdaFunctionCode implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An Amazon S3 bucket in the same AWS Region as your function. The bucket can be in a different AWS account.
     * </p>
     */
    private String s3Bucket;
    /**
     * <p>
     * The Amazon S3 key of the deployment package.
     * </p>
     */
    private String s3Key;
    /**
     * <p>
     * For versioned objects, the version of the deployment package object to use.
     * </p>
     */
    private String s3ObjectVersion;
    /**
     * <p>
     * The base64-encoded contents of the deployment package. AWS SDK and AWS CLI clients handle the encoding for you.
     * </p>
     */
    private String zipFile;

    /**
     * <p>
     * An Amazon S3 bucket in the same AWS Region as your function. The bucket can be in a different AWS account.
     * </p>
     * 
     * @param s3Bucket
     *        An Amazon S3 bucket in the same AWS Region as your function. The bucket can be in a different AWS account.
     */

    public void setS3Bucket(String s3Bucket) {
        this.s3Bucket = s3Bucket;
    }

    /**
     * <p>
     * An Amazon S3 bucket in the same AWS Region as your function. The bucket can be in a different AWS account.
     * </p>
     * 
     * @return An Amazon S3 bucket in the same AWS Region as your function. The bucket can be in a different AWS
     *         account.
     */

    public String getS3Bucket() {
        return this.s3Bucket;
    }

    /**
     * <p>
     * An Amazon S3 bucket in the same AWS Region as your function. The bucket can be in a different AWS account.
     * </p>
     * 
     * @param s3Bucket
     *        An Amazon S3 bucket in the same AWS Region as your function. The bucket can be in a different AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsLambdaFunctionCode withS3Bucket(String s3Bucket) {
        setS3Bucket(s3Bucket);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 key of the deployment package.
     * </p>
     * 
     * @param s3Key
     *        The Amazon S3 key of the deployment package.
     */

    public void setS3Key(String s3Key) {
        this.s3Key = s3Key;
    }

    /**
     * <p>
     * The Amazon S3 key of the deployment package.
     * </p>
     * 
     * @return The Amazon S3 key of the deployment package.
     */

    public String getS3Key() {
        return this.s3Key;
    }

    /**
     * <p>
     * The Amazon S3 key of the deployment package.
     * </p>
     * 
     * @param s3Key
     *        The Amazon S3 key of the deployment package.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsLambdaFunctionCode withS3Key(String s3Key) {
        setS3Key(s3Key);
        return this;
    }

    /**
     * <p>
     * For versioned objects, the version of the deployment package object to use.
     * </p>
     * 
     * @param s3ObjectVersion
     *        For versioned objects, the version of the deployment package object to use.
     */

    public void setS3ObjectVersion(String s3ObjectVersion) {
        this.s3ObjectVersion = s3ObjectVersion;
    }

    /**
     * <p>
     * For versioned objects, the version of the deployment package object to use.
     * </p>
     * 
     * @return For versioned objects, the version of the deployment package object to use.
     */

    public String getS3ObjectVersion() {
        return this.s3ObjectVersion;
    }

    /**
     * <p>
     * For versioned objects, the version of the deployment package object to use.
     * </p>
     * 
     * @param s3ObjectVersion
     *        For versioned objects, the version of the deployment package object to use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsLambdaFunctionCode withS3ObjectVersion(String s3ObjectVersion) {
        setS3ObjectVersion(s3ObjectVersion);
        return this;
    }

    /**
     * <p>
     * The base64-encoded contents of the deployment package. AWS SDK and AWS CLI clients handle the encoding for you.
     * </p>
     * 
     * @param zipFile
     *        The base64-encoded contents of the deployment package. AWS SDK and AWS CLI clients handle the encoding for
     *        you.
     */

    public void setZipFile(String zipFile) {
        this.zipFile = zipFile;
    }

    /**
     * <p>
     * The base64-encoded contents of the deployment package. AWS SDK and AWS CLI clients handle the encoding for you.
     * </p>
     * 
     * @return The base64-encoded contents of the deployment package. AWS SDK and AWS CLI clients handle the encoding
     *         for you.
     */

    public String getZipFile() {
        return this.zipFile;
    }

    /**
     * <p>
     * The base64-encoded contents of the deployment package. AWS SDK and AWS CLI clients handle the encoding for you.
     * </p>
     * 
     * @param zipFile
     *        The base64-encoded contents of the deployment package. AWS SDK and AWS CLI clients handle the encoding for
     *        you.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsLambdaFunctionCode withZipFile(String zipFile) {
        setZipFile(zipFile);
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
        if (getS3Bucket() != null)
            sb.append("S3Bucket: ").append(getS3Bucket()).append(",");
        if (getS3Key() != null)
            sb.append("S3Key: ").append(getS3Key()).append(",");
        if (getS3ObjectVersion() != null)
            sb.append("S3ObjectVersion: ").append(getS3ObjectVersion()).append(",");
        if (getZipFile() != null)
            sb.append("ZipFile: ").append(getZipFile());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsLambdaFunctionCode == false)
            return false;
        AwsLambdaFunctionCode other = (AwsLambdaFunctionCode) obj;
        if (other.getS3Bucket() == null ^ this.getS3Bucket() == null)
            return false;
        if (other.getS3Bucket() != null && other.getS3Bucket().equals(this.getS3Bucket()) == false)
            return false;
        if (other.getS3Key() == null ^ this.getS3Key() == null)
            return false;
        if (other.getS3Key() != null && other.getS3Key().equals(this.getS3Key()) == false)
            return false;
        if (other.getS3ObjectVersion() == null ^ this.getS3ObjectVersion() == null)
            return false;
        if (other.getS3ObjectVersion() != null && other.getS3ObjectVersion().equals(this.getS3ObjectVersion()) == false)
            return false;
        if (other.getZipFile() == null ^ this.getZipFile() == null)
            return false;
        if (other.getZipFile() != null && other.getZipFile().equals(this.getZipFile()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3Bucket() == null) ? 0 : getS3Bucket().hashCode());
        hashCode = prime * hashCode + ((getS3Key() == null) ? 0 : getS3Key().hashCode());
        hashCode = prime * hashCode + ((getS3ObjectVersion() == null) ? 0 : getS3ObjectVersion().hashCode());
        hashCode = prime * hashCode + ((getZipFile() == null) ? 0 : getZipFile().hashCode());
        return hashCode;
    }

    @Override
    public AwsLambdaFunctionCode clone() {
        try {
            return (AwsLambdaFunctionCode) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsLambdaFunctionCodeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
