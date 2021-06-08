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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdateAnalysis" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateAnalysisResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the analysis that you're updating.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The ID of the analysis.
     * </p>
     */
    private String analysisId;
    /**
     * <p>
     * The update status of the last update that was made to the analysis.
     * </p>
     */
    private String updateStatus;
    /**
     * <p>
     * The HTTP status of the request.
     * </p>
     */
    private Integer status;
    /**
     * <p>
     * The AWS request ID for this operation.
     * </p>
     */
    private String requestId;

    /**
     * <p>
     * The ARN of the analysis that you're updating.
     * </p>
     * 
     * @param arn
     *        The ARN of the analysis that you're updating.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the analysis that you're updating.
     * </p>
     * 
     * @return The ARN of the analysis that you're updating.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the analysis that you're updating.
     * </p>
     * 
     * @param arn
     *        The ARN of the analysis that you're updating.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAnalysisResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The ID of the analysis.
     * </p>
     * 
     * @param analysisId
     *        The ID of the analysis.
     */

    public void setAnalysisId(String analysisId) {
        this.analysisId = analysisId;
    }

    /**
     * <p>
     * The ID of the analysis.
     * </p>
     * 
     * @return The ID of the analysis.
     */

    public String getAnalysisId() {
        return this.analysisId;
    }

    /**
     * <p>
     * The ID of the analysis.
     * </p>
     * 
     * @param analysisId
     *        The ID of the analysis.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAnalysisResult withAnalysisId(String analysisId) {
        setAnalysisId(analysisId);
        return this;
    }

    /**
     * <p>
     * The update status of the last update that was made to the analysis.
     * </p>
     * 
     * @param updateStatus
     *        The update status of the last update that was made to the analysis.
     * @see ResourceStatus
     */

    public void setUpdateStatus(String updateStatus) {
        this.updateStatus = updateStatus;
    }

    /**
     * <p>
     * The update status of the last update that was made to the analysis.
     * </p>
     * 
     * @return The update status of the last update that was made to the analysis.
     * @see ResourceStatus
     */

    public String getUpdateStatus() {
        return this.updateStatus;
    }

    /**
     * <p>
     * The update status of the last update that was made to the analysis.
     * </p>
     * 
     * @param updateStatus
     *        The update status of the last update that was made to the analysis.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceStatus
     */

    public UpdateAnalysisResult withUpdateStatus(String updateStatus) {
        setUpdateStatus(updateStatus);
        return this;
    }

    /**
     * <p>
     * The update status of the last update that was made to the analysis.
     * </p>
     * 
     * @param updateStatus
     *        The update status of the last update that was made to the analysis.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceStatus
     */

    public UpdateAnalysisResult withUpdateStatus(ResourceStatus updateStatus) {
        this.updateStatus = updateStatus.toString();
        return this;
    }

    /**
     * <p>
     * The HTTP status of the request.
     * </p>
     * 
     * @param status
     *        The HTTP status of the request.
     */

    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * <p>
     * The HTTP status of the request.
     * </p>
     * 
     * @return The HTTP status of the request.
     */

    public Integer getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The HTTP status of the request.
     * </p>
     * 
     * @param status
     *        The HTTP status of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAnalysisResult withStatus(Integer status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The AWS request ID for this operation.
     * </p>
     * 
     * @param requestId
     *        The AWS request ID for this operation.
     */

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * <p>
     * The AWS request ID for this operation.
     * </p>
     * 
     * @return The AWS request ID for this operation.
     */

    public String getRequestId() {
        return this.requestId;
    }

    /**
     * <p>
     * The AWS request ID for this operation.
     * </p>
     * 
     * @param requestId
     *        The AWS request ID for this operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAnalysisResult withRequestId(String requestId) {
        setRequestId(requestId);
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
        if (getUpdateStatus() != null)
            sb.append("UpdateStatus: ").append(getUpdateStatus()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getRequestId() != null)
            sb.append("RequestId: ").append(getRequestId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateAnalysisResult == false)
            return false;
        UpdateAnalysisResult other = (UpdateAnalysisResult) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getAnalysisId() == null ^ this.getAnalysisId() == null)
            return false;
        if (other.getAnalysisId() != null && other.getAnalysisId().equals(this.getAnalysisId()) == false)
            return false;
        if (other.getUpdateStatus() == null ^ this.getUpdateStatus() == null)
            return false;
        if (other.getUpdateStatus() != null && other.getUpdateStatus().equals(this.getUpdateStatus()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getRequestId() == null ^ this.getRequestId() == null)
            return false;
        if (other.getRequestId() != null && other.getRequestId().equals(this.getRequestId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getAnalysisId() == null) ? 0 : getAnalysisId().hashCode());
        hashCode = prime * hashCode + ((getUpdateStatus() == null) ? 0 : getUpdateStatus().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getRequestId() == null) ? 0 : getRequestId().hashCode());
        return hashCode;
    }

    @Override
    public UpdateAnalysisResult clone() {
        try {
            return (UpdateAnalysisResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
