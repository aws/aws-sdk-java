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
package com.amazonaws.services.customerprofiles.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The S3 location where Identity Resolution Jobs write result files.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/ExportingLocation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExportingLocation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Information about the S3 location where Identity Resolution Jobs write result files.
     * </p>
     */
    private S3ExportingLocation s3Exporting;

    /**
     * <p>
     * Information about the S3 location where Identity Resolution Jobs write result files.
     * </p>
     * 
     * @param s3Exporting
     *        Information about the S3 location where Identity Resolution Jobs write result files.
     */

    public void setS3Exporting(S3ExportingLocation s3Exporting) {
        this.s3Exporting = s3Exporting;
    }

    /**
     * <p>
     * Information about the S3 location where Identity Resolution Jobs write result files.
     * </p>
     * 
     * @return Information about the S3 location where Identity Resolution Jobs write result files.
     */

    public S3ExportingLocation getS3Exporting() {
        return this.s3Exporting;
    }

    /**
     * <p>
     * Information about the S3 location where Identity Resolution Jobs write result files.
     * </p>
     * 
     * @param s3Exporting
     *        Information about the S3 location where Identity Resolution Jobs write result files.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportingLocation withS3Exporting(S3ExportingLocation s3Exporting) {
        setS3Exporting(s3Exporting);
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
        if (getS3Exporting() != null)
            sb.append("S3Exporting: ").append(getS3Exporting());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExportingLocation == false)
            return false;
        ExportingLocation other = (ExportingLocation) obj;
        if (other.getS3Exporting() == null ^ this.getS3Exporting() == null)
            return false;
        if (other.getS3Exporting() != null && other.getS3Exporting().equals(this.getS3Exporting()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3Exporting() == null) ? 0 : getS3Exporting().hashCode());
        return hashCode;
    }

    @Override
    public ExportingLocation clone() {
        try {
            return (ExportingLocation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.customerprofiles.model.transform.ExportingLocationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
