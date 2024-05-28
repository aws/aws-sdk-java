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
package com.amazonaws.services.artifact.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/artifact-2018-05-10/GetReportMetadata" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetReportMetadataRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Unique resource ID for the report resource.
     * </p>
     */
    private String reportId;
    /**
     * <p>
     * Version for the report resource.
     * </p>
     */
    private Long reportVersion;

    /**
     * <p>
     * Unique resource ID for the report resource.
     * </p>
     * 
     * @param reportId
     *        Unique resource ID for the report resource.
     */

    public void setReportId(String reportId) {
        this.reportId = reportId;
    }

    /**
     * <p>
     * Unique resource ID for the report resource.
     * </p>
     * 
     * @return Unique resource ID for the report resource.
     */

    public String getReportId() {
        return this.reportId;
    }

    /**
     * <p>
     * Unique resource ID for the report resource.
     * </p>
     * 
     * @param reportId
     *        Unique resource ID for the report resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetReportMetadataRequest withReportId(String reportId) {
        setReportId(reportId);
        return this;
    }

    /**
     * <p>
     * Version for the report resource.
     * </p>
     * 
     * @param reportVersion
     *        Version for the report resource.
     */

    public void setReportVersion(Long reportVersion) {
        this.reportVersion = reportVersion;
    }

    /**
     * <p>
     * Version for the report resource.
     * </p>
     * 
     * @return Version for the report resource.
     */

    public Long getReportVersion() {
        return this.reportVersion;
    }

    /**
     * <p>
     * Version for the report resource.
     * </p>
     * 
     * @param reportVersion
     *        Version for the report resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetReportMetadataRequest withReportVersion(Long reportVersion) {
        setReportVersion(reportVersion);
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
        if (getReportId() != null)
            sb.append("ReportId: ").append(getReportId()).append(",");
        if (getReportVersion() != null)
            sb.append("ReportVersion: ").append(getReportVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetReportMetadataRequest == false)
            return false;
        GetReportMetadataRequest other = (GetReportMetadataRequest) obj;
        if (other.getReportId() == null ^ this.getReportId() == null)
            return false;
        if (other.getReportId() != null && other.getReportId().equals(this.getReportId()) == false)
            return false;
        if (other.getReportVersion() == null ^ this.getReportVersion() == null)
            return false;
        if (other.getReportVersion() != null && other.getReportVersion().equals(this.getReportVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReportId() == null) ? 0 : getReportId().hashCode());
        hashCode = prime * hashCode + ((getReportVersion() == null) ? 0 : getReportVersion().hashCode());
        return hashCode;
    }

    @Override
    public GetReportMetadataRequest clone() {
        return (GetReportMetadataRequest) super.clone();
    }

}
