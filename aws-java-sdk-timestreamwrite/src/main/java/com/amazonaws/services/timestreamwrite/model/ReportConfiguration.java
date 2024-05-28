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
package com.amazonaws.services.timestreamwrite.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Report configuration for a batch load task. This contains details about where error reports are stored.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-write-2018-11-01/ReportConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReportConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Configuration of an S3 location to write error reports and events for a batch load.
     * </p>
     */
    private ReportS3Configuration reportS3Configuration;

    /**
     * <p>
     * Configuration of an S3 location to write error reports and events for a batch load.
     * </p>
     * 
     * @param reportS3Configuration
     *        Configuration of an S3 location to write error reports and events for a batch load.
     */

    public void setReportS3Configuration(ReportS3Configuration reportS3Configuration) {
        this.reportS3Configuration = reportS3Configuration;
    }

    /**
     * <p>
     * Configuration of an S3 location to write error reports and events for a batch load.
     * </p>
     * 
     * @return Configuration of an S3 location to write error reports and events for a batch load.
     */

    public ReportS3Configuration getReportS3Configuration() {
        return this.reportS3Configuration;
    }

    /**
     * <p>
     * Configuration of an S3 location to write error reports and events for a batch load.
     * </p>
     * 
     * @param reportS3Configuration
     *        Configuration of an S3 location to write error reports and events for a batch load.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReportConfiguration withReportS3Configuration(ReportS3Configuration reportS3Configuration) {
        setReportS3Configuration(reportS3Configuration);
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
        if (getReportS3Configuration() != null)
            sb.append("ReportS3Configuration: ").append(getReportS3Configuration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReportConfiguration == false)
            return false;
        ReportConfiguration other = (ReportConfiguration) obj;
        if (other.getReportS3Configuration() == null ^ this.getReportS3Configuration() == null)
            return false;
        if (other.getReportS3Configuration() != null && other.getReportS3Configuration().equals(this.getReportS3Configuration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReportS3Configuration() == null) ? 0 : getReportS3Configuration().hashCode());
        return hashCode;
    }

    @Override
    public ReportConfiguration clone() {
        try {
            return (ReportConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.timestreamwrite.model.transform.ReportConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
