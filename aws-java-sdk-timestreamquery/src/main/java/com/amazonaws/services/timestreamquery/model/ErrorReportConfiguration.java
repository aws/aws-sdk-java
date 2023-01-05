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
package com.amazonaws.services.timestreamquery.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Configuration required for error reporting.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-query-2018-11-01/ErrorReportConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ErrorReportConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The S3 configuration for the error reports.
     * </p>
     */
    private S3Configuration s3Configuration;

    /**
     * <p>
     * The S3 configuration for the error reports.
     * </p>
     * 
     * @param s3Configuration
     *        The S3 configuration for the error reports.
     */

    public void setS3Configuration(S3Configuration s3Configuration) {
        this.s3Configuration = s3Configuration;
    }

    /**
     * <p>
     * The S3 configuration for the error reports.
     * </p>
     * 
     * @return The S3 configuration for the error reports.
     */

    public S3Configuration getS3Configuration() {
        return this.s3Configuration;
    }

    /**
     * <p>
     * The S3 configuration for the error reports.
     * </p>
     * 
     * @param s3Configuration
     *        The S3 configuration for the error reports.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ErrorReportConfiguration withS3Configuration(S3Configuration s3Configuration) {
        setS3Configuration(s3Configuration);
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
        if (getS3Configuration() != null)
            sb.append("S3Configuration: ").append(getS3Configuration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ErrorReportConfiguration == false)
            return false;
        ErrorReportConfiguration other = (ErrorReportConfiguration) obj;
        if (other.getS3Configuration() == null ^ this.getS3Configuration() == null)
            return false;
        if (other.getS3Configuration() != null && other.getS3Configuration().equals(this.getS3Configuration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3Configuration() == null) ? 0 : getS3Configuration().hashCode());
        return hashCode;
    }

    @Override
    public ErrorReportConfiguration clone() {
        try {
            return (ErrorReportConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.timestreamquery.model.transform.ErrorReportConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
