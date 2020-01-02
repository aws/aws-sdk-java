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
package com.amazonaws.services.kendra.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Document metadata files that contain information such as the document access control information, source URI,
 * document author, and custom attributes. Each metadata file contains metadata about a single document.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/DocumentsMetadataConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DocumentsMetadataConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A prefix used to filter metadata configuration files in the AWS S3 bucket. The S3 bucket might contain multiple
     * metadata files. Use <code>S3Prefix</code> to include only the desired metadata files.
     * </p>
     */
    private String s3Prefix;

    /**
     * <p>
     * A prefix used to filter metadata configuration files in the AWS S3 bucket. The S3 bucket might contain multiple
     * metadata files. Use <code>S3Prefix</code> to include only the desired metadata files.
     * </p>
     * 
     * @param s3Prefix
     *        A prefix used to filter metadata configuration files in the AWS S3 bucket. The S3 bucket might contain
     *        multiple metadata files. Use <code>S3Prefix</code> to include only the desired metadata files.
     */

    public void setS3Prefix(String s3Prefix) {
        this.s3Prefix = s3Prefix;
    }

    /**
     * <p>
     * A prefix used to filter metadata configuration files in the AWS S3 bucket. The S3 bucket might contain multiple
     * metadata files. Use <code>S3Prefix</code> to include only the desired metadata files.
     * </p>
     * 
     * @return A prefix used to filter metadata configuration files in the AWS S3 bucket. The S3 bucket might contain
     *         multiple metadata files. Use <code>S3Prefix</code> to include only the desired metadata files.
     */

    public String getS3Prefix() {
        return this.s3Prefix;
    }

    /**
     * <p>
     * A prefix used to filter metadata configuration files in the AWS S3 bucket. The S3 bucket might contain multiple
     * metadata files. Use <code>S3Prefix</code> to include only the desired metadata files.
     * </p>
     * 
     * @param s3Prefix
     *        A prefix used to filter metadata configuration files in the AWS S3 bucket. The S3 bucket might contain
     *        multiple metadata files. Use <code>S3Prefix</code> to include only the desired metadata files.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentsMetadataConfiguration withS3Prefix(String s3Prefix) {
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

        if (obj instanceof DocumentsMetadataConfiguration == false)
            return false;
        DocumentsMetadataConfiguration other = (DocumentsMetadataConfiguration) obj;
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

        hashCode = prime * hashCode + ((getS3Prefix() == null) ? 0 : getS3Prefix().hashCode());
        return hashCode;
    }

    @Override
    public DocumentsMetadataConfiguration clone() {
        try {
            return (DocumentsMetadataConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kendra.model.transform.DocumentsMetadataConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
