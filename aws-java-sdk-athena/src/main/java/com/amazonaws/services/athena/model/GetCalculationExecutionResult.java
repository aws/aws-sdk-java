/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.athena.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/GetCalculationExecution" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetCalculationExecutionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The calculation execution UUID.
     * </p>
     */
    private String calculationExecutionId;
    /**
     * <p>
     * The session ID that the calculation ran in.
     * </p>
     */
    private String sessionId;
    /**
     * <p>
     * The description of the calculation execution.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The Amazon S3 location in which calculation results are stored.
     * </p>
     */
    private String workingDirectory;
    /**
     * <p>
     * Contains information about the status of the calculation.
     * </p>
     */
    private CalculationStatus status;
    /**
     * <p>
     * Contains information about the data processing unit (DPU) execution time and progress. This field is populated
     * only when statistics are available.
     * </p>
     */
    private CalculationStatistics statistics;
    /**
     * <p>
     * Contains result information. This field is populated only if the calculation is completed.
     * </p>
     */
    private CalculationResult result;

    /**
     * <p>
     * The calculation execution UUID.
     * </p>
     * 
     * @param calculationExecutionId
     *        The calculation execution UUID.
     */

    public void setCalculationExecutionId(String calculationExecutionId) {
        this.calculationExecutionId = calculationExecutionId;
    }

    /**
     * <p>
     * The calculation execution UUID.
     * </p>
     * 
     * @return The calculation execution UUID.
     */

    public String getCalculationExecutionId() {
        return this.calculationExecutionId;
    }

    /**
     * <p>
     * The calculation execution UUID.
     * </p>
     * 
     * @param calculationExecutionId
     *        The calculation execution UUID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCalculationExecutionResult withCalculationExecutionId(String calculationExecutionId) {
        setCalculationExecutionId(calculationExecutionId);
        return this;
    }

    /**
     * <p>
     * The session ID that the calculation ran in.
     * </p>
     * 
     * @param sessionId
     *        The session ID that the calculation ran in.
     */

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    /**
     * <p>
     * The session ID that the calculation ran in.
     * </p>
     * 
     * @return The session ID that the calculation ran in.
     */

    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * <p>
     * The session ID that the calculation ran in.
     * </p>
     * 
     * @param sessionId
     *        The session ID that the calculation ran in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCalculationExecutionResult withSessionId(String sessionId) {
        setSessionId(sessionId);
        return this;
    }

    /**
     * <p>
     * The description of the calculation execution.
     * </p>
     * 
     * @param description
     *        The description of the calculation execution.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the calculation execution.
     * </p>
     * 
     * @return The description of the calculation execution.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the calculation execution.
     * </p>
     * 
     * @param description
     *        The description of the calculation execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCalculationExecutionResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 location in which calculation results are stored.
     * </p>
     * 
     * @param workingDirectory
     *        The Amazon S3 location in which calculation results are stored.
     */

    public void setWorkingDirectory(String workingDirectory) {
        this.workingDirectory = workingDirectory;
    }

    /**
     * <p>
     * The Amazon S3 location in which calculation results are stored.
     * </p>
     * 
     * @return The Amazon S3 location in which calculation results are stored.
     */

    public String getWorkingDirectory() {
        return this.workingDirectory;
    }

    /**
     * <p>
     * The Amazon S3 location in which calculation results are stored.
     * </p>
     * 
     * @param workingDirectory
     *        The Amazon S3 location in which calculation results are stored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCalculationExecutionResult withWorkingDirectory(String workingDirectory) {
        setWorkingDirectory(workingDirectory);
        return this;
    }

    /**
     * <p>
     * Contains information about the status of the calculation.
     * </p>
     * 
     * @param status
     *        Contains information about the status of the calculation.
     */

    public void setStatus(CalculationStatus status) {
        this.status = status;
    }

    /**
     * <p>
     * Contains information about the status of the calculation.
     * </p>
     * 
     * @return Contains information about the status of the calculation.
     */

    public CalculationStatus getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Contains information about the status of the calculation.
     * </p>
     * 
     * @param status
     *        Contains information about the status of the calculation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCalculationExecutionResult withStatus(CalculationStatus status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Contains information about the data processing unit (DPU) execution time and progress. This field is populated
     * only when statistics are available.
     * </p>
     * 
     * @param statistics
     *        Contains information about the data processing unit (DPU) execution time and progress. This field is
     *        populated only when statistics are available.
     */

    public void setStatistics(CalculationStatistics statistics) {
        this.statistics = statistics;
    }

    /**
     * <p>
     * Contains information about the data processing unit (DPU) execution time and progress. This field is populated
     * only when statistics are available.
     * </p>
     * 
     * @return Contains information about the data processing unit (DPU) execution time and progress. This field is
     *         populated only when statistics are available.
     */

    public CalculationStatistics getStatistics() {
        return this.statistics;
    }

    /**
     * <p>
     * Contains information about the data processing unit (DPU) execution time and progress. This field is populated
     * only when statistics are available.
     * </p>
     * 
     * @param statistics
     *        Contains information about the data processing unit (DPU) execution time and progress. This field is
     *        populated only when statistics are available.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCalculationExecutionResult withStatistics(CalculationStatistics statistics) {
        setStatistics(statistics);
        return this;
    }

    /**
     * <p>
     * Contains result information. This field is populated only if the calculation is completed.
     * </p>
     * 
     * @param result
     *        Contains result information. This field is populated only if the calculation is completed.
     */

    public void setResult(CalculationResult result) {
        this.result = result;
    }

    /**
     * <p>
     * Contains result information. This field is populated only if the calculation is completed.
     * </p>
     * 
     * @return Contains result information. This field is populated only if the calculation is completed.
     */

    public CalculationResult getResult() {
        return this.result;
    }

    /**
     * <p>
     * Contains result information. This field is populated only if the calculation is completed.
     * </p>
     * 
     * @param result
     *        Contains result information. This field is populated only if the calculation is completed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCalculationExecutionResult withResult(CalculationResult result) {
        setResult(result);
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
        if (getCalculationExecutionId() != null)
            sb.append("CalculationExecutionId: ").append(getCalculationExecutionId()).append(",");
        if (getSessionId() != null)
            sb.append("SessionId: ").append(getSessionId()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getWorkingDirectory() != null)
            sb.append("WorkingDirectory: ").append(getWorkingDirectory()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatistics() != null)
            sb.append("Statistics: ").append(getStatistics()).append(",");
        if (getResult() != null)
            sb.append("Result: ").append(getResult());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetCalculationExecutionResult == false)
            return false;
        GetCalculationExecutionResult other = (GetCalculationExecutionResult) obj;
        if (other.getCalculationExecutionId() == null ^ this.getCalculationExecutionId() == null)
            return false;
        if (other.getCalculationExecutionId() != null && other.getCalculationExecutionId().equals(this.getCalculationExecutionId()) == false)
            return false;
        if (other.getSessionId() == null ^ this.getSessionId() == null)
            return false;
        if (other.getSessionId() != null && other.getSessionId().equals(this.getSessionId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getWorkingDirectory() == null ^ this.getWorkingDirectory() == null)
            return false;
        if (other.getWorkingDirectory() != null && other.getWorkingDirectory().equals(this.getWorkingDirectory()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatistics() == null ^ this.getStatistics() == null)
            return false;
        if (other.getStatistics() != null && other.getStatistics().equals(this.getStatistics()) == false)
            return false;
        if (other.getResult() == null ^ this.getResult() == null)
            return false;
        if (other.getResult() != null && other.getResult().equals(this.getResult()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCalculationExecutionId() == null) ? 0 : getCalculationExecutionId().hashCode());
        hashCode = prime * hashCode + ((getSessionId() == null) ? 0 : getSessionId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getWorkingDirectory() == null) ? 0 : getWorkingDirectory().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatistics() == null) ? 0 : getStatistics().hashCode());
        hashCode = prime * hashCode + ((getResult() == null) ? 0 : getResult().hashCode());
        return hashCode;
    }

    @Override
    public GetCalculationExecutionResult clone() {
        try {
            return (GetCalculationExecutionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
