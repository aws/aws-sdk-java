/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.textract.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Sets whether or not your output will go to a user created bucket. Used to set the name of the bucket, and the prefix
 * on the output file.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/textract-2018-06-27/OutputConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OutputConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the bucket your output will go to.
     * </p>
     */
    private String s3Bucket;
    /**
     * <p>
     * The prefix of the object key that the output will be saved to. When not enabled, the prefix will be
     * “textract_output".
     * </p>
     */
    private String s3Prefix;

    /**
     * <p>
     * The name of the bucket your output will go to.
     * </p>
     * 
     * @param s3Bucket
     *        The name of the bucket your output will go to.
     */

    public void setS3Bucket(String s3Bucket) {
        this.s3Bucket = s3Bucket;
    }

    /**
     * <p>
     * The name of the bucket your output will go to.
     * </p>
     * 
     * @return The name of the bucket your output will go to.
     */

    public String getS3Bucket() {
        return this.s3Bucket;
    }

    /**
     * <p>
     * The name of the bucket your output will go to.
     * </p>
     * 
     * @param s3Bucket
     *        The name of the bucket your output will go to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OutputConfig withS3Bucket(String s3Bucket) {
        setS3Bucket(s3Bucket);
        return this;
    }

    /**
     * <p>
     * The prefix of the object key that the output will be saved to. When not enabled, the prefix will be
     * “textract_output".
     * </p>
     * 
     * @param s3Prefix
     *        The prefix of the object key that the output will be saved to. When not enabled, the prefix will be
     *        “textract_output".
     */

    public void setS3Prefix(String s3Prefix) {
        this.s3Prefix = s3Prefix;
    }

    /**
     * <p>
     * The prefix of the object key that the output will be saved to. When not enabled, the prefix will be
     * “textract_output".
     * </p>
     * 
     * @return The prefix of the object key that the output will be saved to. When not enabled, the prefix will be
     *         “textract_output".
     */

    public String getS3Prefix() {
        return this.s3Prefix;
    }

    /**
     * <p>
     * The prefix of the object key that the output will be saved to. When not enabled, the prefix will be
     * “textract_output".
     * </p>
     * 
     * @param s3Prefix
     *        The prefix of the object key that the output will be saved to. When not enabled, the prefix will be
     *        “textract_output".
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OutputConfig withS3Prefix(String s3Prefix) {
        setS3Prefix(s3Prefix);
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
        if (getS3Prefix() != null)
            sb.append("S3Prefix: ").append(getS3Prefix());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OutputConfig == false)
            return false;
        OutputConfig other = (OutputConfig) obj;
        if (other.getS3Bucket() == null ^ this.getS3Bucket() == null)
            return false;
        if (other.getS3Bucket() != null && other.getS3Bucket().equals(this.getS3Bucket()) == false)
            return false;
        if (other.getS3Prefix() == null ^ this.getS3Prefix() == null)
            return false;
        if (other.getS3Prefix() != null && other.getS3Prefix().equals(this.getS3Prefix()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3Bucket() == null) ? 0 : getS3Bucket().hashCode());
        hashCode = prime * hashCode + ((getS3Prefix() == null) ? 0 : getS3Prefix().hashCode());
        return hashCode;
    }

    @Override
    public OutputConfig clone() {
        try {
            return (OutputConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.textract.model.transform.OutputConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
