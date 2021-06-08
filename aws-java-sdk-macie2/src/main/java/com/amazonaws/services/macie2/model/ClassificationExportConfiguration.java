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
package com.amazonaws.services.macie2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies where to store data classification results, and the encryption settings to use when storing results in that
 * location. Currently, you can store classification results only in an S3 bucket.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/ClassificationExportConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ClassificationExportConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The S3 bucket to store data classification results in, and the encryption settings to use when storing results in
     * that bucket.
     * </p>
     */
    private S3Destination s3Destination;

    /**
     * <p>
     * The S3 bucket to store data classification results in, and the encryption settings to use when storing results in
     * that bucket.
     * </p>
     * 
     * @param s3Destination
     *        The S3 bucket to store data classification results in, and the encryption settings to use when storing
     *        results in that bucket.
     */

    public void setS3Destination(S3Destination s3Destination) {
        this.s3Destination = s3Destination;
    }

    /**
     * <p>
     * The S3 bucket to store data classification results in, and the encryption settings to use when storing results in
     * that bucket.
     * </p>
     * 
     * @return The S3 bucket to store data classification results in, and the encryption settings to use when storing
     *         results in that bucket.
     */

    public S3Destination getS3Destination() {
        return this.s3Destination;
    }

    /**
     * <p>
     * The S3 bucket to store data classification results in, and the encryption settings to use when storing results in
     * that bucket.
     * </p>
     * 
     * @param s3Destination
     *        The S3 bucket to store data classification results in, and the encryption settings to use when storing
     *        results in that bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClassificationExportConfiguration withS3Destination(S3Destination s3Destination) {
        setS3Destination(s3Destination);
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
        if (getS3Destination() != null)
            sb.append("S3Destination: ").append(getS3Destination());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ClassificationExportConfiguration == false)
            return false;
        ClassificationExportConfiguration other = (ClassificationExportConfiguration) obj;
        if (other.getS3Destination() == null ^ this.getS3Destination() == null)
            return false;
        if (other.getS3Destination() != null && other.getS3Destination().equals(this.getS3Destination()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3Destination() == null) ? 0 : getS3Destination().hashCode());
        return hashCode;
    }

    @Override
    public ClassificationExportConfiguration clone() {
        try {
            return (ClassificationExportConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.macie2.model.transform.ClassificationExportConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
