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
package com.amazonaws.services.pi.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pi-2018-02-27/CreatePerformanceAnalysisReport" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreatePerformanceAnalysisReportResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * A unique identifier for the created analysis report.
     * </p>
     */
    private String analysisReportId;

    /**
     * <p>
     * A unique identifier for the created analysis report.
     * </p>
     * 
     * @param analysisReportId
     *        A unique identifier for the created analysis report.
     */

    public void setAnalysisReportId(String analysisReportId) {
        this.analysisReportId = analysisReportId;
    }

    /**
     * <p>
     * A unique identifier for the created analysis report.
     * </p>
     * 
     * @return A unique identifier for the created analysis report.
     */

    public String getAnalysisReportId() {
        return this.analysisReportId;
    }

    /**
     * <p>
     * A unique identifier for the created analysis report.
     * </p>
     * 
     * @param analysisReportId
     *        A unique identifier for the created analysis report.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePerformanceAnalysisReportResult withAnalysisReportId(String analysisReportId) {
        setAnalysisReportId(analysisReportId);
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
        if (getAnalysisReportId() != null)
            sb.append("AnalysisReportId: ").append(getAnalysisReportId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreatePerformanceAnalysisReportResult == false)
            return false;
        CreatePerformanceAnalysisReportResult other = (CreatePerformanceAnalysisReportResult) obj;
        if (other.getAnalysisReportId() == null ^ this.getAnalysisReportId() == null)
            return false;
        if (other.getAnalysisReportId() != null && other.getAnalysisReportId().equals(this.getAnalysisReportId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAnalysisReportId() == null) ? 0 : getAnalysisReportId().hashCode());
        return hashCode;
    }

    @Override
    public CreatePerformanceAnalysisReportResult clone() {
        try {
            return (CreatePerformanceAnalysisReportResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
