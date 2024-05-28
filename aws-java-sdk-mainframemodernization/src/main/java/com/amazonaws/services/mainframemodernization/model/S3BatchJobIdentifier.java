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
package com.amazonaws.services.mainframemodernization.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A batch job identifier in which the batch jobs to run are identified by an Amazon S3 location.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/S3BatchJobIdentifier" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3BatchJobIdentifier implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon S3 bucket that contains the batch job definitions.
     * </p>
     */
    private String bucket;
    /**
     * <p>
     * Identifies the batch job definition. This identifier can also point to any batch job definition that already
     * exists in the application or to one of the batch job definitions within the directory that is specified in
     * <code>keyPrefix</code>.
     * </p>
     */
    private JobIdentifier identifier;
    /**
     * <p>
     * The key prefix that specifies the path to the folder in the S3 bucket that has the batch job definitions.
     * </p>
     */
    private String keyPrefix;

    /**
     * <p>
     * The Amazon S3 bucket that contains the batch job definitions.
     * </p>
     * 
     * @param bucket
     *        The Amazon S3 bucket that contains the batch job definitions.
     */

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * <p>
     * The Amazon S3 bucket that contains the batch job definitions.
     * </p>
     * 
     * @return The Amazon S3 bucket that contains the batch job definitions.
     */

    public String getBucket() {
        return this.bucket;
    }

    /**
     * <p>
     * The Amazon S3 bucket that contains the batch job definitions.
     * </p>
     * 
     * @param bucket
     *        The Amazon S3 bucket that contains the batch job definitions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3BatchJobIdentifier withBucket(String bucket) {
        setBucket(bucket);
        return this;
    }

    /**
     * <p>
     * Identifies the batch job definition. This identifier can also point to any batch job definition that already
     * exists in the application or to one of the batch job definitions within the directory that is specified in
     * <code>keyPrefix</code>.
     * </p>
     * 
     * @param identifier
     *        Identifies the batch job definition. This identifier can also point to any batch job definition that
     *        already exists in the application or to one of the batch job definitions within the directory that is
     *        specified in <code>keyPrefix</code>.
     */

    public void setIdentifier(JobIdentifier identifier) {
        this.identifier = identifier;
    }

    /**
     * <p>
     * Identifies the batch job definition. This identifier can also point to any batch job definition that already
     * exists in the application or to one of the batch job definitions within the directory that is specified in
     * <code>keyPrefix</code>.
     * </p>
     * 
     * @return Identifies the batch job definition. This identifier can also point to any batch job definition that
     *         already exists in the application or to one of the batch job definitions within the directory that is
     *         specified in <code>keyPrefix</code>.
     */

    public JobIdentifier getIdentifier() {
        return this.identifier;
    }

    /**
     * <p>
     * Identifies the batch job definition. This identifier can also point to any batch job definition that already
     * exists in the application or to one of the batch job definitions within the directory that is specified in
     * <code>keyPrefix</code>.
     * </p>
     * 
     * @param identifier
     *        Identifies the batch job definition. This identifier can also point to any batch job definition that
     *        already exists in the application or to one of the batch job definitions within the directory that is
     *        specified in <code>keyPrefix</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3BatchJobIdentifier withIdentifier(JobIdentifier identifier) {
        setIdentifier(identifier);
        return this;
    }

    /**
     * <p>
     * The key prefix that specifies the path to the folder in the S3 bucket that has the batch job definitions.
     * </p>
     * 
     * @param keyPrefix
     *        The key prefix that specifies the path to the folder in the S3 bucket that has the batch job definitions.
     */

    public void setKeyPrefix(String keyPrefix) {
        this.keyPrefix = keyPrefix;
    }

    /**
     * <p>
     * The key prefix that specifies the path to the folder in the S3 bucket that has the batch job definitions.
     * </p>
     * 
     * @return The key prefix that specifies the path to the folder in the S3 bucket that has the batch job definitions.
     */

    public String getKeyPrefix() {
        return this.keyPrefix;
    }

    /**
     * <p>
     * The key prefix that specifies the path to the folder in the S3 bucket that has the batch job definitions.
     * </p>
     * 
     * @param keyPrefix
     *        The key prefix that specifies the path to the folder in the S3 bucket that has the batch job definitions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3BatchJobIdentifier withKeyPrefix(String keyPrefix) {
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
        if (getBucket() != null)
            sb.append("Bucket: ").append(getBucket()).append(",");
        if (getIdentifier() != null)
            sb.append("Identifier: ").append(getIdentifier()).append(",");
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

        if (obj instanceof S3BatchJobIdentifier == false)
            return false;
        S3BatchJobIdentifier other = (S3BatchJobIdentifier) obj;
        if (other.getBucket() == null ^ this.getBucket() == null)
            return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false)
            return false;
        if (other.getIdentifier() == null ^ this.getIdentifier() == null)
            return false;
        if (other.getIdentifier() != null && other.getIdentifier().equals(this.getIdentifier()) == false)
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

        hashCode = prime * hashCode + ((getBucket() == null) ? 0 : getBucket().hashCode());
        hashCode = prime * hashCode + ((getIdentifier() == null) ? 0 : getIdentifier().hashCode());
        hashCode = prime * hashCode + ((getKeyPrefix() == null) ? 0 : getKeyPrefix().hashCode());
        return hashCode;
    }

    @Override
    public S3BatchJobIdentifier clone() {
        try {
            return (S3BatchJobIdentifier) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mainframemodernization.model.transform.S3BatchJobIdentifierMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
