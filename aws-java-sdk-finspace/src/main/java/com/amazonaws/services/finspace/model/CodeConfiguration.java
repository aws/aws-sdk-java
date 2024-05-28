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
package com.amazonaws.services.finspace.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The structure of the customer code available within the running cluster.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/CodeConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CodeConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A unique name for the S3 bucket.
     * </p>
     */
    private String s3Bucket;
    /**
     * <p>
     * The full S3 path (excluding bucket) to the .zip file. This file contains the code that is loaded onto the cluster
     * when it's started.
     * </p>
     */
    private String s3Key;
    /**
     * <p>
     * The version of an S3 object.
     * </p>
     */
    private String s3ObjectVersion;

    /**
     * <p>
     * A unique name for the S3 bucket.
     * </p>
     * 
     * @param s3Bucket
     *        A unique name for the S3 bucket.
     */

    public void setS3Bucket(String s3Bucket) {
        this.s3Bucket = s3Bucket;
    }

    /**
     * <p>
     * A unique name for the S3 bucket.
     * </p>
     * 
     * @return A unique name for the S3 bucket.
     */

    public String getS3Bucket() {
        return this.s3Bucket;
    }

    /**
     * <p>
     * A unique name for the S3 bucket.
     * </p>
     * 
     * @param s3Bucket
     *        A unique name for the S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeConfiguration withS3Bucket(String s3Bucket) {
        setS3Bucket(s3Bucket);
        return this;
    }

    /**
     * <p>
     * The full S3 path (excluding bucket) to the .zip file. This file contains the code that is loaded onto the cluster
     * when it's started.
     * </p>
     * 
     * @param s3Key
     *        The full S3 path (excluding bucket) to the .zip file. This file contains the code that is loaded onto the
     *        cluster when it's started.
     */

    public void setS3Key(String s3Key) {
        this.s3Key = s3Key;
    }

    /**
     * <p>
     * The full S3 path (excluding bucket) to the .zip file. This file contains the code that is loaded onto the cluster
     * when it's started.
     * </p>
     * 
     * @return The full S3 path (excluding bucket) to the .zip file. This file contains the code that is loaded onto the
     *         cluster when it's started.
     */

    public String getS3Key() {
        return this.s3Key;
    }

    /**
     * <p>
     * The full S3 path (excluding bucket) to the .zip file. This file contains the code that is loaded onto the cluster
     * when it's started.
     * </p>
     * 
     * @param s3Key
     *        The full S3 path (excluding bucket) to the .zip file. This file contains the code that is loaded onto the
     *        cluster when it's started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeConfiguration withS3Key(String s3Key) {
        setS3Key(s3Key);
        return this;
    }

    /**
     * <p>
     * The version of an S3 object.
     * </p>
     * 
     * @param s3ObjectVersion
     *        The version of an S3 object.
     */

    public void setS3ObjectVersion(String s3ObjectVersion) {
        this.s3ObjectVersion = s3ObjectVersion;
    }

    /**
     * <p>
     * The version of an S3 object.
     * </p>
     * 
     * @return The version of an S3 object.
     */

    public String getS3ObjectVersion() {
        return this.s3ObjectVersion;
    }

    /**
     * <p>
     * The version of an S3 object.
     * </p>
     * 
     * @param s3ObjectVersion
     *        The version of an S3 object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeConfiguration withS3ObjectVersion(String s3ObjectVersion) {
        setS3ObjectVersion(s3ObjectVersion);
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
            sb.append("S3ObjectVersion: ").append(getS3ObjectVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CodeConfiguration == false)
            return false;
        CodeConfiguration other = (CodeConfiguration) obj;
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3Bucket() == null) ? 0 : getS3Bucket().hashCode());
        hashCode = prime * hashCode + ((getS3Key() == null) ? 0 : getS3Key().hashCode());
        hashCode = prime * hashCode + ((getS3ObjectVersion() == null) ? 0 : getS3ObjectVersion().hashCode());
        return hashCode;
    }

    @Override
    public CodeConfiguration clone() {
        try {
            return (CodeConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.finspace.model.transform.CodeConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
