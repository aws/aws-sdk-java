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
package com.amazonaws.services.databasemigrationservice.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about an exported metadata model assessment.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/ExportMetadataModelAssessmentResultEntry"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExportMetadataModelAssessmentResultEntry implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The object key for the object containing the exported metadata model assessment.
     * </p>
     */
    private String s3ObjectKey;
    /**
     * <p>
     * The URL for the object containing the exported metadata model assessment.
     * </p>
     */
    private String objectURL;

    /**
     * <p>
     * The object key for the object containing the exported metadata model assessment.
     * </p>
     * 
     * @param s3ObjectKey
     *        The object key for the object containing the exported metadata model assessment.
     */

    public void setS3ObjectKey(String s3ObjectKey) {
        this.s3ObjectKey = s3ObjectKey;
    }

    /**
     * <p>
     * The object key for the object containing the exported metadata model assessment.
     * </p>
     * 
     * @return The object key for the object containing the exported metadata model assessment.
     */

    public String getS3ObjectKey() {
        return this.s3ObjectKey;
    }

    /**
     * <p>
     * The object key for the object containing the exported metadata model assessment.
     * </p>
     * 
     * @param s3ObjectKey
     *        The object key for the object containing the exported metadata model assessment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportMetadataModelAssessmentResultEntry withS3ObjectKey(String s3ObjectKey) {
        setS3ObjectKey(s3ObjectKey);
        return this;
    }

    /**
     * <p>
     * The URL for the object containing the exported metadata model assessment.
     * </p>
     * 
     * @param objectURL
     *        The URL for the object containing the exported metadata model assessment.
     */

    public void setObjectURL(String objectURL) {
        this.objectURL = objectURL;
    }

    /**
     * <p>
     * The URL for the object containing the exported metadata model assessment.
     * </p>
     * 
     * @return The URL for the object containing the exported metadata model assessment.
     */

    public String getObjectURL() {
        return this.objectURL;
    }

    /**
     * <p>
     * The URL for the object containing the exported metadata model assessment.
     * </p>
     * 
     * @param objectURL
     *        The URL for the object containing the exported metadata model assessment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportMetadataModelAssessmentResultEntry withObjectURL(String objectURL) {
        setObjectURL(objectURL);
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
        if (getS3ObjectKey() != null)
            sb.append("S3ObjectKey: ").append(getS3ObjectKey()).append(",");
        if (getObjectURL() != null)
            sb.append("ObjectURL: ").append(getObjectURL());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExportMetadataModelAssessmentResultEntry == false)
            return false;
        ExportMetadataModelAssessmentResultEntry other = (ExportMetadataModelAssessmentResultEntry) obj;
        if (other.getS3ObjectKey() == null ^ this.getS3ObjectKey() == null)
            return false;
        if (other.getS3ObjectKey() != null && other.getS3ObjectKey().equals(this.getS3ObjectKey()) == false)
            return false;
        if (other.getObjectURL() == null ^ this.getObjectURL() == null)
            return false;
        if (other.getObjectURL() != null && other.getObjectURL().equals(this.getObjectURL()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3ObjectKey() == null) ? 0 : getS3ObjectKey().hashCode());
        hashCode = prime * hashCode + ((getObjectURL() == null) ? 0 : getObjectURL().hashCode());
        return hashCode;
    }

    @Override
    public ExportMetadataModelAssessmentResultEntry clone() {
        try {
            return (ExportMetadataModelAssessmentResultEntry) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.databasemigrationservice.model.transform.ExportMetadataModelAssessmentResultEntryMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
