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
package com.amazonaws.services.iotdeviceadvisor.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotdeviceadvisor-2020-09-18/GetSuiteRunReport" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSuiteRunReportResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Download URL of the qualification report.
     * </p>
     */
    private String qualificationReportDownloadUrl;

    /**
     * <p>
     * Download URL of the qualification report.
     * </p>
     * 
     * @param qualificationReportDownloadUrl
     *        Download URL of the qualification report.
     */

    public void setQualificationReportDownloadUrl(String qualificationReportDownloadUrl) {
        this.qualificationReportDownloadUrl = qualificationReportDownloadUrl;
    }

    /**
     * <p>
     * Download URL of the qualification report.
     * </p>
     * 
     * @return Download URL of the qualification report.
     */

    public String getQualificationReportDownloadUrl() {
        return this.qualificationReportDownloadUrl;
    }

    /**
     * <p>
     * Download URL of the qualification report.
     * </p>
     * 
     * @param qualificationReportDownloadUrl
     *        Download URL of the qualification report.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSuiteRunReportResult withQualificationReportDownloadUrl(String qualificationReportDownloadUrl) {
        setQualificationReportDownloadUrl(qualificationReportDownloadUrl);
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
        if (getQualificationReportDownloadUrl() != null)
            sb.append("QualificationReportDownloadUrl: ").append(getQualificationReportDownloadUrl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSuiteRunReportResult == false)
            return false;
        GetSuiteRunReportResult other = (GetSuiteRunReportResult) obj;
        if (other.getQualificationReportDownloadUrl() == null ^ this.getQualificationReportDownloadUrl() == null)
            return false;
        if (other.getQualificationReportDownloadUrl() != null
                && other.getQualificationReportDownloadUrl().equals(this.getQualificationReportDownloadUrl()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getQualificationReportDownloadUrl() == null) ? 0 : getQualificationReportDownloadUrl().hashCode());
        return hashCode;
    }

    @Override
    public GetSuiteRunReportResult clone() {
        try {
            return (GetSuiteRunReportResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
