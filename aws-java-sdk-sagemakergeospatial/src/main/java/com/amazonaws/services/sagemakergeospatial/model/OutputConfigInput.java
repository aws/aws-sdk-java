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
package com.amazonaws.services.sagemakergeospatial.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The response structure for an OutputConfig returned by an ExportEarthObservationJob.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-geospatial-2020-05-27/OutputConfigInput"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OutputConfigInput implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Path to Amazon S3 storage location for the output configuration file.
     * </p>
     */
    private ExportS3DataInput s3Data;

    /**
     * <p>
     * Path to Amazon S3 storage location for the output configuration file.
     * </p>
     * 
     * @param s3Data
     *        Path to Amazon S3 storage location for the output configuration file.
     */

    public void setS3Data(ExportS3DataInput s3Data) {
        this.s3Data = s3Data;
    }

    /**
     * <p>
     * Path to Amazon S3 storage location for the output configuration file.
     * </p>
     * 
     * @return Path to Amazon S3 storage location for the output configuration file.
     */

    public ExportS3DataInput getS3Data() {
        return this.s3Data;
    }

    /**
     * <p>
     * Path to Amazon S3 storage location for the output configuration file.
     * </p>
     * 
     * @param s3Data
     *        Path to Amazon S3 storage location for the output configuration file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OutputConfigInput withS3Data(ExportS3DataInput s3Data) {
        setS3Data(s3Data);
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
        if (getS3Data() != null)
            sb.append("S3Data: ").append(getS3Data());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OutputConfigInput == false)
            return false;
        OutputConfigInput other = (OutputConfigInput) obj;
        if (other.getS3Data() == null ^ this.getS3Data() == null)
            return false;
        if (other.getS3Data() != null && other.getS3Data().equals(this.getS3Data()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3Data() == null) ? 0 : getS3Data().hashCode());
        return hashCode;
    }

    @Override
    public OutputConfigInput clone() {
        try {
            return (OutputConfigInput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemakergeospatial.model.transform.OutputConfigInputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
