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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The summary metadata that describes an analysis.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/AnalysisSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AnalysisSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the analysis.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The ID of the analysis. This ID displays in the URL.
     * </p>
     */
    private String analysisId;
    /**
     * <p>
     * The name of the analysis. This name is displayed in the QuickSight console.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The last known status for the analysis.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The time that the analysis was created.
     * </p>
     */
    private java.util.Date createdTime;
    /**
     * <p>
     * The time that the analysis was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedTime;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the analysis.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) for the analysis.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the analysis.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the analysis.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the analysis.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) for the analysis.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalysisSummary withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The ID of the analysis. This ID displays in the URL.
     * </p>
     * 
     * @param analysisId
     *        The ID of the analysis. This ID displays in the URL.
     */

    public void setAnalysisId(String analysisId) {
        this.analysisId = analysisId;
    }

    /**
     * <p>
     * The ID of the analysis. This ID displays in the URL.
     * </p>
     * 
     * @return The ID of the analysis. This ID displays in the URL.
     */

    public String getAnalysisId() {
        return this.analysisId;
    }

    /**
     * <p>
     * The ID of the analysis. This ID displays in the URL.
     * </p>
     * 
     * @param analysisId
     *        The ID of the analysis. This ID displays in the URL.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalysisSummary withAnalysisId(String analysisId) {
        setAnalysisId(analysisId);
        return this;
    }

    /**
     * <p>
     * The name of the analysis. This name is displayed in the QuickSight console.
     * </p>
     * 
     * @param name
     *        The name of the analysis. This name is displayed in the QuickSight console.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the analysis. This name is displayed in the QuickSight console.
     * </p>
     * 
     * @return The name of the analysis. This name is displayed in the QuickSight console.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the analysis. This name is displayed in the QuickSight console.
     * </p>
     * 
     * @param name
     *        The name of the analysis. This name is displayed in the QuickSight console.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalysisSummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The last known status for the analysis.
     * </p>
     * 
     * @param status
     *        The last known status for the analysis.
     * @see ResourceStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The last known status for the analysis.
     * </p>
     * 
     * @return The last known status for the analysis.
     * @see ResourceStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The last known status for the analysis.
     * </p>
     * 
     * @param status
     *        The last known status for the analysis.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceStatus
     */

    public AnalysisSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The last known status for the analysis.
     * </p>
     * 
     * @param status
     *        The last known status for the analysis.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceStatus
     */

    public AnalysisSummary withStatus(ResourceStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The time that the analysis was created.
     * </p>
     * 
     * @param createdTime
     *        The time that the analysis was created.
     */

    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * The time that the analysis was created.
     * </p>
     * 
     * @return The time that the analysis was created.
     */

    public java.util.Date getCreatedTime() {
        return this.createdTime;
    }

    /**
     * <p>
     * The time that the analysis was created.
     * </p>
     * 
     * @param createdTime
     *        The time that the analysis was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalysisSummary withCreatedTime(java.util.Date createdTime) {
        setCreatedTime(createdTime);
        return this;
    }

    /**
     * <p>
     * The time that the analysis was last updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The time that the analysis was last updated.
     */

    public void setLastUpdatedTime(java.util.Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    /**
     * <p>
     * The time that the analysis was last updated.
     * </p>
     * 
     * @return The time that the analysis was last updated.
     */

    public java.util.Date getLastUpdatedTime() {
        return this.lastUpdatedTime;
    }

    /**
     * <p>
     * The time that the analysis was last updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The time that the analysis was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalysisSummary withLastUpdatedTime(java.util.Date lastUpdatedTime) {
        setLastUpdatedTime(lastUpdatedTime);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getAnalysisId() != null)
            sb.append("AnalysisId: ").append(getAnalysisId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: ").append(getCreatedTime()).append(",");
        if (getLastUpdatedTime() != null)
            sb.append("LastUpdatedTime: ").append(getLastUpdatedTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AnalysisSummary == false)
            return false;
        AnalysisSummary other = (AnalysisSummary) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getAnalysisId() == null ^ this.getAnalysisId() == null)
            return false;
        if (other.getAnalysisId() != null && other.getAnalysisId().equals(this.getAnalysisId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        if (other.getLastUpdatedTime() == null ^ this.getLastUpdatedTime() == null)
            return false;
        if (other.getLastUpdatedTime() != null && other.getLastUpdatedTime().equals(this.getLastUpdatedTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getAnalysisId() == null) ? 0 : getAnalysisId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedTime() == null) ? 0 : getLastUpdatedTime().hashCode());
        return hashCode;
    }

    @Override
    public AnalysisSummary clone() {
        try {
            return (AnalysisSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.AnalysisSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
