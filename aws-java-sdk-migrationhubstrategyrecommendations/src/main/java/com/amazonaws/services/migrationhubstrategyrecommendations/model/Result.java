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
package com.amazonaws.services.migrationhubstrategyrecommendations.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The error in server analysis.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/Result" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Result implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The error in server analysis.
     * </p>
     */
    private AnalysisStatusUnion analysisStatus;
    /**
     * <p>
     * The error in server analysis.
     * </p>
     */
    private String analysisType;
    /**
     * <p>
     * The error in server analysis.
     * </p>
     */
    private java.util.List<AntipatternReportResult> antipatternReportResultList;
    /**
     * <p>
     * The error in server analysis.
     * </p>
     */
    private String statusMessage;

    /**
     * <p>
     * The error in server analysis.
     * </p>
     * 
     * @param analysisStatus
     *        The error in server analysis.
     */

    public void setAnalysisStatus(AnalysisStatusUnion analysisStatus) {
        this.analysisStatus = analysisStatus;
    }

    /**
     * <p>
     * The error in server analysis.
     * </p>
     * 
     * @return The error in server analysis.
     */

    public AnalysisStatusUnion getAnalysisStatus() {
        return this.analysisStatus;
    }

    /**
     * <p>
     * The error in server analysis.
     * </p>
     * 
     * @param analysisStatus
     *        The error in server analysis.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Result withAnalysisStatus(AnalysisStatusUnion analysisStatus) {
        setAnalysisStatus(analysisStatus);
        return this;
    }

    /**
     * <p>
     * The error in server analysis.
     * </p>
     * 
     * @param analysisType
     *        The error in server analysis.
     * @see AnalysisType
     */

    public void setAnalysisType(String analysisType) {
        this.analysisType = analysisType;
    }

    /**
     * <p>
     * The error in server analysis.
     * </p>
     * 
     * @return The error in server analysis.
     * @see AnalysisType
     */

    public String getAnalysisType() {
        return this.analysisType;
    }

    /**
     * <p>
     * The error in server analysis.
     * </p>
     * 
     * @param analysisType
     *        The error in server analysis.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AnalysisType
     */

    public Result withAnalysisType(String analysisType) {
        setAnalysisType(analysisType);
        return this;
    }

    /**
     * <p>
     * The error in server analysis.
     * </p>
     * 
     * @param analysisType
     *        The error in server analysis.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AnalysisType
     */

    public Result withAnalysisType(AnalysisType analysisType) {
        this.analysisType = analysisType.toString();
        return this;
    }

    /**
     * <p>
     * The error in server analysis.
     * </p>
     * 
     * @return The error in server analysis.
     */

    public java.util.List<AntipatternReportResult> getAntipatternReportResultList() {
        return antipatternReportResultList;
    }

    /**
     * <p>
     * The error in server analysis.
     * </p>
     * 
     * @param antipatternReportResultList
     *        The error in server analysis.
     */

    public void setAntipatternReportResultList(java.util.Collection<AntipatternReportResult> antipatternReportResultList) {
        if (antipatternReportResultList == null) {
            this.antipatternReportResultList = null;
            return;
        }

        this.antipatternReportResultList = new java.util.ArrayList<AntipatternReportResult>(antipatternReportResultList);
    }

    /**
     * <p>
     * The error in server analysis.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAntipatternReportResultList(java.util.Collection)} or
     * {@link #withAntipatternReportResultList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param antipatternReportResultList
     *        The error in server analysis.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Result withAntipatternReportResultList(AntipatternReportResult... antipatternReportResultList) {
        if (this.antipatternReportResultList == null) {
            setAntipatternReportResultList(new java.util.ArrayList<AntipatternReportResult>(antipatternReportResultList.length));
        }
        for (AntipatternReportResult ele : antipatternReportResultList) {
            this.antipatternReportResultList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The error in server analysis.
     * </p>
     * 
     * @param antipatternReportResultList
     *        The error in server analysis.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Result withAntipatternReportResultList(java.util.Collection<AntipatternReportResult> antipatternReportResultList) {
        setAntipatternReportResultList(antipatternReportResultList);
        return this;
    }

    /**
     * <p>
     * The error in server analysis.
     * </p>
     * 
     * @param statusMessage
     *        The error in server analysis.
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * The error in server analysis.
     * </p>
     * 
     * @return The error in server analysis.
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * The error in server analysis.
     * </p>
     * 
     * @param statusMessage
     *        The error in server analysis.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Result withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
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
        if (getAnalysisStatus() != null)
            sb.append("AnalysisStatus: ").append(getAnalysisStatus()).append(",");
        if (getAnalysisType() != null)
            sb.append("AnalysisType: ").append(getAnalysisType()).append(",");
        if (getAntipatternReportResultList() != null)
            sb.append("AntipatternReportResultList: ").append(getAntipatternReportResultList()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append(getStatusMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Result == false)
            return false;
        Result other = (Result) obj;
        if (other.getAnalysisStatus() == null ^ this.getAnalysisStatus() == null)
            return false;
        if (other.getAnalysisStatus() != null && other.getAnalysisStatus().equals(this.getAnalysisStatus()) == false)
            return false;
        if (other.getAnalysisType() == null ^ this.getAnalysisType() == null)
            return false;
        if (other.getAnalysisType() != null && other.getAnalysisType().equals(this.getAnalysisType()) == false)
            return false;
        if (other.getAntipatternReportResultList() == null ^ this.getAntipatternReportResultList() == null)
            return false;
        if (other.getAntipatternReportResultList() != null && other.getAntipatternReportResultList().equals(this.getAntipatternReportResultList()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAnalysisStatus() == null) ? 0 : getAnalysisStatus().hashCode());
        hashCode = prime * hashCode + ((getAnalysisType() == null) ? 0 : getAnalysisType().hashCode());
        hashCode = prime * hashCode + ((getAntipatternReportResultList() == null) ? 0 : getAntipatternReportResultList().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        return hashCode;
    }

    @Override
    public Result clone() {
        try {
            return (Result) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.migrationhubstrategyrecommendations.model.transform.ResultMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
