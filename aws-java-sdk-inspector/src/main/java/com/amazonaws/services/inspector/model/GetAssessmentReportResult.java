/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.inspector.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector-2016-02-16/GetAssessmentReport" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetAssessmentReportResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the status of the request to generate an assessment report.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Specifies the URL where you can find the generated assessment report. This parameter is only returned if the
     * report is successfully generated.
     * </p>
     */
    private String url;

    /**
     * <p>
     * Specifies the status of the request to generate an assessment report.
     * </p>
     * 
     * @param status
     *        Specifies the status of the request to generate an assessment report.
     * @see ReportStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Specifies the status of the request to generate an assessment report.
     * </p>
     * 
     * @return Specifies the status of the request to generate an assessment report.
     * @see ReportStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Specifies the status of the request to generate an assessment report.
     * </p>
     * 
     * @param status
     *        Specifies the status of the request to generate an assessment report.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReportStatus
     */

    public GetAssessmentReportResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Specifies the status of the request to generate an assessment report.
     * </p>
     * 
     * @param status
     *        Specifies the status of the request to generate an assessment report.
     * @see ReportStatus
     */

    public void setStatus(ReportStatus status) {
        withStatus(status);
    }

    /**
     * <p>
     * Specifies the status of the request to generate an assessment report.
     * </p>
     * 
     * @param status
     *        Specifies the status of the request to generate an assessment report.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReportStatus
     */

    public GetAssessmentReportResult withStatus(ReportStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the URL where you can find the generated assessment report. This parameter is only returned if the
     * report is successfully generated.
     * </p>
     * 
     * @param url
     *        Specifies the URL where you can find the generated assessment report. This parameter is only returned if
     *        the report is successfully generated.
     */

    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * <p>
     * Specifies the URL where you can find the generated assessment report. This parameter is only returned if the
     * report is successfully generated.
     * </p>
     * 
     * @return Specifies the URL where you can find the generated assessment report. This parameter is only returned if
     *         the report is successfully generated.
     */

    public String getUrl() {
        return this.url;
    }

    /**
     * <p>
     * Specifies the URL where you can find the generated assessment report. This parameter is only returned if the
     * report is successfully generated.
     * </p>
     * 
     * @param url
     *        Specifies the URL where you can find the generated assessment report. This parameter is only returned if
     *        the report is successfully generated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAssessmentReportResult withUrl(String url) {
        setUrl(url);
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getUrl() != null)
            sb.append("Url: ").append(getUrl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAssessmentReportResult == false)
            return false;
        GetAssessmentReportResult other = (GetAssessmentReportResult) obj;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getUrl() == null ^ this.getUrl() == null)
            return false;
        if (other.getUrl() != null && other.getUrl().equals(this.getUrl()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getUrl() == null) ? 0 : getUrl().hashCode());
        return hashCode;
    }

    @Override
    public GetAssessmentReportResult clone() {
        try {
            return (GetAssessmentReportResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
