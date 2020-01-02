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
package com.amazonaws.services.robomaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about S3 keys.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/S3KeyOutput" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3KeyOutput implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The S3 key.
     * </p>
     */
    private String s3Key;
    /**
     * <p>
     * The etag for the object.
     * </p>
     */
    private String etag;

    /**
     * <p>
     * The S3 key.
     * </p>
     * 
     * @param s3Key
     *        The S3 key.
     */

    public void setS3Key(String s3Key) {
        this.s3Key = s3Key;
    }

    /**
     * <p>
     * The S3 key.
     * </p>
     * 
     * @return The S3 key.
     */

    public String getS3Key() {
        return this.s3Key;
    }

    /**
     * <p>
     * The S3 key.
     * </p>
     * 
     * @param s3Key
     *        The S3 key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3KeyOutput withS3Key(String s3Key) {
        setS3Key(s3Key);
        return this;
    }

    /**
     * <p>
     * The etag for the object.
     * </p>
     * 
     * @param etag
     *        The etag for the object.
     */

    public void setEtag(String etag) {
        this.etag = etag;
    }

    /**
     * <p>
     * The etag for the object.
     * </p>
     * 
     * @return The etag for the object.
     */

    public String getEtag() {
        return this.etag;
    }

    /**
     * <p>
     * The etag for the object.
     * </p>
     * 
     * @param etag
     *        The etag for the object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3KeyOutput withEtag(String etag) {
        setEtag(etag);
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
        if (getS3Key() != null)
            sb.append("S3Key: ").append(getS3Key()).append(",");
        if (getEtag() != null)
            sb.append("Etag: ").append(getEtag());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3KeyOutput == false)
            return false;
        S3KeyOutput other = (S3KeyOutput) obj;
        if (other.getS3Key() == null ^ this.getS3Key() == null)
            return false;
        if (other.getS3Key() != null && other.getS3Key().equals(this.getS3Key()) == false)
            return false;
        if (other.getEtag() == null ^ this.getEtag() == null)
            return false;
        if (other.getEtag() != null && other.getEtag().equals(this.getEtag()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3Key() == null) ? 0 : getS3Key().hashCode());
        hashCode = prime * hashCode + ((getEtag() == null) ? 0 : getEtag().hashCode());
        return hashCode;
    }

    @Override
    public S3KeyOutput clone() {
        try {
            return (S3KeyOutput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.robomaker.model.transform.S3KeyOutputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
