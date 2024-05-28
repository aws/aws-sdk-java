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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/GetCisScanReport" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetCisScanReportResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The status.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The URL where a PDF or CSV of the CIS scan report can be downloaded.
     * </p>
     */
    private String url;

    /**
     * <p>
     * The status.
     * </p>
     * 
     * @param status
     *        The status.
     * @see CisReportStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status.
     * </p>
     * 
     * @return The status.
     * @see CisReportStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status.
     * </p>
     * 
     * @param status
     *        The status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CisReportStatus
     */

    public GetCisScanReportResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status.
     * </p>
     * 
     * @param status
     *        The status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CisReportStatus
     */

    public GetCisScanReportResult withStatus(CisReportStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The URL where a PDF or CSV of the CIS scan report can be downloaded.
     * </p>
     * 
     * @param url
     *        The URL where a PDF or CSV of the CIS scan report can be downloaded.
     */

    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * <p>
     * The URL where a PDF or CSV of the CIS scan report can be downloaded.
     * </p>
     * 
     * @return The URL where a PDF or CSV of the CIS scan report can be downloaded.
     */

    public String getUrl() {
        return this.url;
    }

    /**
     * <p>
     * The URL where a PDF or CSV of the CIS scan report can be downloaded.
     * </p>
     * 
     * @param url
     *        The URL where a PDF or CSV of the CIS scan report can be downloaded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCisScanReportResult withUrl(String url) {
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

        if (obj instanceof GetCisScanReportResult == false)
            return false;
        GetCisScanReportResult other = (GetCisScanReportResult) obj;
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
    public GetCisScanReportResult clone() {
        try {
            return (GetCisScanReportResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
