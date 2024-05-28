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
package com.amazonaws.services.inspector2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/CreateSbomExport" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateSbomExportRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The output format for the software bill of materials (SBOM) report.
     * </p>
     */
    private String reportFormat;
    /**
     * <p>
     * The resource filter criteria for the software bill of materials (SBOM) report.
     * </p>
     */
    private ResourceFilterCriteria resourceFilterCriteria;

    private Destination s3Destination;

    /**
     * <p>
     * The output format for the software bill of materials (SBOM) report.
     * </p>
     * 
     * @param reportFormat
     *        The output format for the software bill of materials (SBOM) report.
     * @see SbomReportFormat
     */

    public void setReportFormat(String reportFormat) {
        this.reportFormat = reportFormat;
    }

    /**
     * <p>
     * The output format for the software bill of materials (SBOM) report.
     * </p>
     * 
     * @return The output format for the software bill of materials (SBOM) report.
     * @see SbomReportFormat
     */

    public String getReportFormat() {
        return this.reportFormat;
    }

    /**
     * <p>
     * The output format for the software bill of materials (SBOM) report.
     * </p>
     * 
     * @param reportFormat
     *        The output format for the software bill of materials (SBOM) report.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SbomReportFormat
     */

    public CreateSbomExportRequest withReportFormat(String reportFormat) {
        setReportFormat(reportFormat);
        return this;
    }

    /**
     * <p>
     * The output format for the software bill of materials (SBOM) report.
     * </p>
     * 
     * @param reportFormat
     *        The output format for the software bill of materials (SBOM) report.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SbomReportFormat
     */

    public CreateSbomExportRequest withReportFormat(SbomReportFormat reportFormat) {
        this.reportFormat = reportFormat.toString();
        return this;
    }

    /**
     * <p>
     * The resource filter criteria for the software bill of materials (SBOM) report.
     * </p>
     * 
     * @param resourceFilterCriteria
     *        The resource filter criteria for the software bill of materials (SBOM) report.
     */

    public void setResourceFilterCriteria(ResourceFilterCriteria resourceFilterCriteria) {
        this.resourceFilterCriteria = resourceFilterCriteria;
    }

    /**
     * <p>
     * The resource filter criteria for the software bill of materials (SBOM) report.
     * </p>
     * 
     * @return The resource filter criteria for the software bill of materials (SBOM) report.
     */

    public ResourceFilterCriteria getResourceFilterCriteria() {
        return this.resourceFilterCriteria;
    }

    /**
     * <p>
     * The resource filter criteria for the software bill of materials (SBOM) report.
     * </p>
     * 
     * @param resourceFilterCriteria
     *        The resource filter criteria for the software bill of materials (SBOM) report.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSbomExportRequest withResourceFilterCriteria(ResourceFilterCriteria resourceFilterCriteria) {
        setResourceFilterCriteria(resourceFilterCriteria);
        return this;
    }

    /**
     * @param s3Destination
     */

    public void setS3Destination(Destination s3Destination) {
        this.s3Destination = s3Destination;
    }

    /**
     * @return
     */

    public Destination getS3Destination() {
        return this.s3Destination;
    }

    /**
     * @param s3Destination
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSbomExportRequest withS3Destination(Destination s3Destination) {
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
        if (getReportFormat() != null)
            sb.append("ReportFormat: ").append(getReportFormat()).append(",");
        if (getResourceFilterCriteria() != null)
            sb.append("ResourceFilterCriteria: ").append(getResourceFilterCriteria()).append(",");
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

        if (obj instanceof CreateSbomExportRequest == false)
            return false;
        CreateSbomExportRequest other = (CreateSbomExportRequest) obj;
        if (other.getReportFormat() == null ^ this.getReportFormat() == null)
            return false;
        if (other.getReportFormat() != null && other.getReportFormat().equals(this.getReportFormat()) == false)
            return false;
        if (other.getResourceFilterCriteria() == null ^ this.getResourceFilterCriteria() == null)
            return false;
        if (other.getResourceFilterCriteria() != null && other.getResourceFilterCriteria().equals(this.getResourceFilterCriteria()) == false)
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

        hashCode = prime * hashCode + ((getReportFormat() == null) ? 0 : getReportFormat().hashCode());
        hashCode = prime * hashCode + ((getResourceFilterCriteria() == null) ? 0 : getResourceFilterCriteria().hashCode());
        hashCode = prime * hashCode + ((getS3Destination() == null) ? 0 : getS3Destination().hashCode());
        return hashCode;
    }

    @Override
    public CreateSbomExportRequest clone() {
        return (CreateSbomExportRequest) super.clone();
    }

}
