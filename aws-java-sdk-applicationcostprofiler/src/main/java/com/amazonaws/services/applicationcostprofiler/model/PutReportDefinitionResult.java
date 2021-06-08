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
package com.amazonaws.services.applicationcostprofiler.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWSApplicationCostProfiler-2020-09-10/PutReportDefinition"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutReportDefinitionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * ID of the report.
     * </p>
     */
    private String reportId;

    /**
     * <p>
     * ID of the report.
     * </p>
     * 
     * @param reportId
     *        ID of the report.
     */

    public void setReportId(String reportId) {
        this.reportId = reportId;
    }

    /**
     * <p>
     * ID of the report.
     * </p>
     * 
     * @return ID of the report.
     */

    public String getReportId() {
        return this.reportId;
    }

    /**
     * <p>
     * ID of the report.
     * </p>
     * 
     * @param reportId
     *        ID of the report.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutReportDefinitionResult withReportId(String reportId) {
        setReportId(reportId);
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
            sb.append("ReportId: ").append(getReportId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutReportDefinitionResult == false)
            return false;
        PutReportDefinitionResult other = (PutReportDefinitionResult) obj;
        if (other.getReportId() == null ^ this.getReportId() == null)
            return false;
        if (other.getReportId() != null && other.getReportId().equals(this.getReportId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReportId() == null) ? 0 : getReportId().hashCode());
        return hashCode;
    }

    @Override
    public PutReportDefinitionResult clone() {
        try {
            return (PutReportDefinitionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
