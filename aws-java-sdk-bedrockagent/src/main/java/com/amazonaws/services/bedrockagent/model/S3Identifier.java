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
package com.amazonaws.services.bedrockagent.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about the S3 object containing the resource.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/S3Identifier" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3Identifier implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the S3 bucket.
     * </p>
     */
    private String s3BucketName;
    /**
     * <p>
     * The S3 object key containing the resource.
     * </p>
     */
    private String s3ObjectKey;

    /**
     * <p>
     * The name of the S3 bucket.
     * </p>
     * 
     * @param s3BucketName
     *        The name of the S3 bucket.
     */

    public void setS3BucketName(String s3BucketName) {
        this.s3BucketName = s3BucketName;
    }

    /**
     * <p>
     * The name of the S3 bucket.
     * </p>
     * 
     * @return The name of the S3 bucket.
     */

    public String getS3BucketName() {
        return this.s3BucketName;
    }

    /**
     * <p>
     * The name of the S3 bucket.
     * </p>
     * 
     * @param s3BucketName
     *        The name of the S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Identifier withS3BucketName(String s3BucketName) {
        setS3BucketName(s3BucketName);
        return this;
    }

    /**
     * <p>
     * The S3 object key containing the resource.
     * </p>
     * 
     * @param s3ObjectKey
     *        The S3 object key containing the resource.
     */

    public void setS3ObjectKey(String s3ObjectKey) {
        this.s3ObjectKey = s3ObjectKey;
    }

    /**
     * <p>
     * The S3 object key containing the resource.
     * </p>
     * 
     * @return The S3 object key containing the resource.
     */

    public String getS3ObjectKey() {
        return this.s3ObjectKey;
    }

    /**
     * <p>
     * The S3 object key containing the resource.
     * </p>
     * 
     * @param s3ObjectKey
     *        The S3 object key containing the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Identifier withS3ObjectKey(String s3ObjectKey) {
        setS3ObjectKey(s3ObjectKey);
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
        if (getS3BucketName() != null)
            sb.append("S3BucketName: ").append(getS3BucketName()).append(",");
        if (getS3ObjectKey() != null)
            sb.append("S3ObjectKey: ").append(getS3ObjectKey());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3Identifier == false)
            return false;
        S3Identifier other = (S3Identifier) obj;
        if (other.getS3BucketName() == null ^ this.getS3BucketName() == null)
            return false;
        if (other.getS3BucketName() != null && other.getS3BucketName().equals(this.getS3BucketName()) == false)
            return false;
        if (other.getS3ObjectKey() == null ^ this.getS3ObjectKey() == null)
            return false;
        if (other.getS3ObjectKey() != null && other.getS3ObjectKey().equals(this.getS3ObjectKey()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3BucketName() == null) ? 0 : getS3BucketName().hashCode());
        hashCode = prime * hashCode + ((getS3ObjectKey() == null) ? 0 : getS3ObjectKey().hashCode());
        return hashCode;
    }

    @Override
    public S3Identifier clone() {
        try {
            return (S3Identifier) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockagent.model.transform.S3IdentifierMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
