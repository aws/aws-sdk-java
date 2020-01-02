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
package com.amazonaws.services.codebuild.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the location where the run of a report is exported.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/ReportExportConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReportExportConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The export configuration type. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>S3</code>: The report results are exported to an S3 bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NO_EXPORT</code>: The report results are not exported.
     * </p>
     * </li>
     * </ul>
     */
    private String exportConfigType;
    /**
     * <p>
     * A <code>S3ReportExportConfig</code> object that contains information about the S3 bucket where the run of a
     * report is exported.
     * </p>
     */
    private S3ReportExportConfig s3Destination;

    /**
     * <p>
     * The export configuration type. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>S3</code>: The report results are exported to an S3 bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NO_EXPORT</code>: The report results are not exported.
     * </p>
     * </li>
     * </ul>
     * 
     * @param exportConfigType
     *        The export configuration type. Valid values are: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>S3</code>: The report results are exported to an S3 bucket.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NO_EXPORT</code>: The report results are not exported.
     *        </p>
     *        </li>
     * @see ReportExportConfigType
     */

    public void setExportConfigType(String exportConfigType) {
        this.exportConfigType = exportConfigType;
    }

    /**
     * <p>
     * The export configuration type. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>S3</code>: The report results are exported to an S3 bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NO_EXPORT</code>: The report results are not exported.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The export configuration type. Valid values are: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>S3</code>: The report results are exported to an S3 bucket.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NO_EXPORT</code>: The report results are not exported.
     *         </p>
     *         </li>
     * @see ReportExportConfigType
     */

    public String getExportConfigType() {
        return this.exportConfigType;
    }

    /**
     * <p>
     * The export configuration type. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>S3</code>: The report results are exported to an S3 bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NO_EXPORT</code>: The report results are not exported.
     * </p>
     * </li>
     * </ul>
     * 
     * @param exportConfigType
     *        The export configuration type. Valid values are: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>S3</code>: The report results are exported to an S3 bucket.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NO_EXPORT</code>: The report results are not exported.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReportExportConfigType
     */

    public ReportExportConfig withExportConfigType(String exportConfigType) {
        setExportConfigType(exportConfigType);
        return this;
    }

    /**
     * <p>
     * The export configuration type. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>S3</code>: The report results are exported to an S3 bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NO_EXPORT</code>: The report results are not exported.
     * </p>
     * </li>
     * </ul>
     * 
     * @param exportConfigType
     *        The export configuration type. Valid values are: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>S3</code>: The report results are exported to an S3 bucket.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NO_EXPORT</code>: The report results are not exported.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReportExportConfigType
     */

    public ReportExportConfig withExportConfigType(ReportExportConfigType exportConfigType) {
        this.exportConfigType = exportConfigType.toString();
        return this;
    }

    /**
     * <p>
     * A <code>S3ReportExportConfig</code> object that contains information about the S3 bucket where the run of a
     * report is exported.
     * </p>
     * 
     * @param s3Destination
     *        A <code>S3ReportExportConfig</code> object that contains information about the S3 bucket where the run of
     *        a report is exported.
     */

    public void setS3Destination(S3ReportExportConfig s3Destination) {
        this.s3Destination = s3Destination;
    }

    /**
     * <p>
     * A <code>S3ReportExportConfig</code> object that contains information about the S3 bucket where the run of a
     * report is exported.
     * </p>
     * 
     * @return A <code>S3ReportExportConfig</code> object that contains information about the S3 bucket where the run of
     *         a report is exported.
     */

    public S3ReportExportConfig getS3Destination() {
        return this.s3Destination;
    }

    /**
     * <p>
     * A <code>S3ReportExportConfig</code> object that contains information about the S3 bucket where the run of a
     * report is exported.
     * </p>
     * 
     * @param s3Destination
     *        A <code>S3ReportExportConfig</code> object that contains information about the S3 bucket where the run of
     *        a report is exported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReportExportConfig withS3Destination(S3ReportExportConfig s3Destination) {
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
        if (getExportConfigType() != null)
            sb.append("ExportConfigType: ").append(getExportConfigType()).append(",");
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

        if (obj instanceof ReportExportConfig == false)
            return false;
        ReportExportConfig other = (ReportExportConfig) obj;
        if (other.getExportConfigType() == null ^ this.getExportConfigType() == null)
            return false;
        if (other.getExportConfigType() != null && other.getExportConfigType().equals(this.getExportConfigType()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getExportConfigType() == null) ? 0 : getExportConfigType().hashCode());
        hashCode = prime * hashCode + ((getS3Destination() == null) ? 0 : getS3Destination().hashCode());
        return hashCode;
    }

    @Override
    public ReportExportConfig clone() {
        try {
            return (ReportExportConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codebuild.model.transform.ReportExportConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
