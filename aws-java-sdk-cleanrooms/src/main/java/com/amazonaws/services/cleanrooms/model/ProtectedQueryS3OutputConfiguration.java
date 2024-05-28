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
package com.amazonaws.services.cleanrooms.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains the configuration to write the query results to S3.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/ProtectedQueryS3OutputConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProtectedQueryS3OutputConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Intended file format of the result.
     * </p>
     */
    private String resultFormat;
    /**
     * <p>
     * The S3 bucket to unload the protected query results.
     * </p>
     */
    private String bucket;
    /**
     * <p>
     * The S3 prefix to unload the protected query results.
     * </p>
     */
    private String keyPrefix;

    /**
     * <p>
     * Intended file format of the result.
     * </p>
     * 
     * @param resultFormat
     *        Intended file format of the result.
     * @see ResultFormat
     */

    public void setResultFormat(String resultFormat) {
        this.resultFormat = resultFormat;
    }

    /**
     * <p>
     * Intended file format of the result.
     * </p>
     * 
     * @return Intended file format of the result.
     * @see ResultFormat
     */

    public String getResultFormat() {
        return this.resultFormat;
    }

    /**
     * <p>
     * Intended file format of the result.
     * </p>
     * 
     * @param resultFormat
     *        Intended file format of the result.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResultFormat
     */

    public ProtectedQueryS3OutputConfiguration withResultFormat(String resultFormat) {
        setResultFormat(resultFormat);
        return this;
    }

    /**
     * <p>
     * Intended file format of the result.
     * </p>
     * 
     * @param resultFormat
     *        Intended file format of the result.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResultFormat
     */

    public ProtectedQueryS3OutputConfiguration withResultFormat(ResultFormat resultFormat) {
        this.resultFormat = resultFormat.toString();
        return this;
    }

    /**
     * <p>
     * The S3 bucket to unload the protected query results.
     * </p>
     * 
     * @param bucket
     *        The S3 bucket to unload the protected query results.
     */

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * <p>
     * The S3 bucket to unload the protected query results.
     * </p>
     * 
     * @return The S3 bucket to unload the protected query results.
     */

    public String getBucket() {
        return this.bucket;
    }

    /**
     * <p>
     * The S3 bucket to unload the protected query results.
     * </p>
     * 
     * @param bucket
     *        The S3 bucket to unload the protected query results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProtectedQueryS3OutputConfiguration withBucket(String bucket) {
        setBucket(bucket);
        return this;
    }

    /**
     * <p>
     * The S3 prefix to unload the protected query results.
     * </p>
     * 
     * @param keyPrefix
     *        The S3 prefix to unload the protected query results.
     */

    public void setKeyPrefix(String keyPrefix) {
        this.keyPrefix = keyPrefix;
    }

    /**
     * <p>
     * The S3 prefix to unload the protected query results.
     * </p>
     * 
     * @return The S3 prefix to unload the protected query results.
     */

    public String getKeyPrefix() {
        return this.keyPrefix;
    }

    /**
     * <p>
     * The S3 prefix to unload the protected query results.
     * </p>
     * 
     * @param keyPrefix
     *        The S3 prefix to unload the protected query results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProtectedQueryS3OutputConfiguration withKeyPrefix(String keyPrefix) {
        setKeyPrefix(keyPrefix);
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
        if (getResultFormat() != null)
            sb.append("ResultFormat: ").append(getResultFormat()).append(",");
        if (getBucket() != null)
            sb.append("Bucket: ").append(getBucket()).append(",");
        if (getKeyPrefix() != null)
            sb.append("KeyPrefix: ").append(getKeyPrefix());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProtectedQueryS3OutputConfiguration == false)
            return false;
        ProtectedQueryS3OutputConfiguration other = (ProtectedQueryS3OutputConfiguration) obj;
        if (other.getResultFormat() == null ^ this.getResultFormat() == null)
            return false;
        if (other.getResultFormat() != null && other.getResultFormat().equals(this.getResultFormat()) == false)
            return false;
        if (other.getBucket() == null ^ this.getBucket() == null)
            return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false)
            return false;
        if (other.getKeyPrefix() == null ^ this.getKeyPrefix() == null)
            return false;
        if (other.getKeyPrefix() != null && other.getKeyPrefix().equals(this.getKeyPrefix()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResultFormat() == null) ? 0 : getResultFormat().hashCode());
        hashCode = prime * hashCode + ((getBucket() == null) ? 0 : getBucket().hashCode());
        hashCode = prime * hashCode + ((getKeyPrefix() == null) ? 0 : getKeyPrefix().hashCode());
        return hashCode;
    }

    @Override
    public ProtectedQueryS3OutputConfiguration clone() {
        try {
            return (ProtectedQueryS3OutputConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cleanrooms.model.transform.ProtectedQueryS3OutputConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
