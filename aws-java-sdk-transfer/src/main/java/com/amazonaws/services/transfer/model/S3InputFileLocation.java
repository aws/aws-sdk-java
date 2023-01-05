/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.transfer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the customer input S3 file location. If it is used inside
 * <code>copyStepDetails.DestinationFileLocation</code>, it should be the S3 copy destination.
 * </p>
 * <p>
 * You need to provide the bucket and key. The key can represent either a path or a file. This is determined by whether
 * or not you end the key value with the forward slash (/) character. If the final character is "/", then your file is
 * copied to the folder, and its name does not change. If, rather, the final character is alphanumeric, your uploaded
 * file is renamed to the path value. In this case, if a file with that name already exists, it is overwritten.
 * </p>
 * <p>
 * For example, if your path is <code>shared-files/bob/</code>, your uploaded files are copied to the
 * <code>shared-files/bob/</code>, folder. If your path is <code>shared-files/today</code>, each uploaded file is copied
 * to the <code>shared-files</code> folder and named <code>today</code>: each upload overwrites the previous version of
 * the <i>bob</i> file.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/S3InputFileLocation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3InputFileLocation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the S3 bucket for the customer input file.
     * </p>
     */
    private String bucket;
    /**
     * <p>
     * The name assigned to the file when it was created in Amazon S3. You use the object key to retrieve the object.
     * </p>
     */
    private String key;

    /**
     * <p>
     * Specifies the S3 bucket for the customer input file.
     * </p>
     * 
     * @param bucket
     *        Specifies the S3 bucket for the customer input file.
     */

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * <p>
     * Specifies the S3 bucket for the customer input file.
     * </p>
     * 
     * @return Specifies the S3 bucket for the customer input file.
     */

    public String getBucket() {
        return this.bucket;
    }

    /**
     * <p>
     * Specifies the S3 bucket for the customer input file.
     * </p>
     * 
     * @param bucket
     *        Specifies the S3 bucket for the customer input file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3InputFileLocation withBucket(String bucket) {
        setBucket(bucket);
        return this;
    }

    /**
     * <p>
     * The name assigned to the file when it was created in Amazon S3. You use the object key to retrieve the object.
     * </p>
     * 
     * @param key
     *        The name assigned to the file when it was created in Amazon S3. You use the object key to retrieve the
     *        object.
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The name assigned to the file when it was created in Amazon S3. You use the object key to retrieve the object.
     * </p>
     * 
     * @return The name assigned to the file when it was created in Amazon S3. You use the object key to retrieve the
     *         object.
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * The name assigned to the file when it was created in Amazon S3. You use the object key to retrieve the object.
     * </p>
     * 
     * @param key
     *        The name assigned to the file when it was created in Amazon S3. You use the object key to retrieve the
     *        object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3InputFileLocation withKey(String key) {
        setKey(key);
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
            sb.append("Key: ").append(getKey());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3InputFileLocation == false)
            return false;
        S3InputFileLocation other = (S3InputFileLocation) obj;
        if (other.getBucket() == null ^ this.getBucket() == null)
            return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false)
            return false;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucket() == null) ? 0 : getBucket().hashCode());
        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        return hashCode;
    }

    @Override
    public S3InputFileLocation clone() {
        try {
            return (S3InputFileLocation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.transfer.model.transform.S3InputFileLocationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
