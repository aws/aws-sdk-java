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
package com.amazonaws.services.datasync.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the detailed result of a <code>TaskExecution</code> operation. This result includes the time in
 * milliseconds spent in each phase, the status of the task execution, and the errors encountered.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/TaskExecutionResultDetail" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TaskExecutionResultDetail implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The total time in milliseconds that AWS DataSync spent in the PREPARING phase.
     * </p>
     */
    private Long prepareDuration;
    /**
     * <p>
     * The status of the PREPARING phase.
     * </p>
     */
    private String prepareStatus;
    /**
     * <p>
     * The total time in milliseconds that AWS DataSync spent in the TRANSFERRING phase.
     * </p>
     */
    private Long transferDuration;
    /**
     * <p>
     * The status of the TRANSFERRING Phase.
     * </p>
     */
    private String transferStatus;
    /**
     * <p>
     * The total time in milliseconds that AWS DataSync spent in the VERIFYING phase.
     * </p>
     */
    private Long verifyDuration;
    /**
     * <p>
     * The status of the VERIFYING Phase.
     * </p>
     */
    private String verifyStatus;
    /**
     * <p>
     * Errors that AWS DataSync encountered during execution of the task. You can use this error code to help
     * troubleshoot issues.
     * </p>
     */
    private String errorCode;
    /**
     * <p>
     * Detailed description of an error that was encountered during the task execution. You can use this information to
     * help troubleshoot issues.
     * </p>
     */
    private String errorDetail;

    /**
     * <p>
     * The total time in milliseconds that AWS DataSync spent in the PREPARING phase.
     * </p>
     * 
     * @param prepareDuration
     *        The total time in milliseconds that AWS DataSync spent in the PREPARING phase.
     */

    public void setPrepareDuration(Long prepareDuration) {
        this.prepareDuration = prepareDuration;
    }

    /**
     * <p>
     * The total time in milliseconds that AWS DataSync spent in the PREPARING phase.
     * </p>
     * 
     * @return The total time in milliseconds that AWS DataSync spent in the PREPARING phase.
     */

    public Long getPrepareDuration() {
        return this.prepareDuration;
    }

    /**
     * <p>
     * The total time in milliseconds that AWS DataSync spent in the PREPARING phase.
     * </p>
     * 
     * @param prepareDuration
     *        The total time in milliseconds that AWS DataSync spent in the PREPARING phase.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskExecutionResultDetail withPrepareDuration(Long prepareDuration) {
        setPrepareDuration(prepareDuration);
        return this;
    }

    /**
     * <p>
     * The status of the PREPARING phase.
     * </p>
     * 
     * @param prepareStatus
     *        The status of the PREPARING phase.
     * @see PhaseStatus
     */

    public void setPrepareStatus(String prepareStatus) {
        this.prepareStatus = prepareStatus;
    }

    /**
     * <p>
     * The status of the PREPARING phase.
     * </p>
     * 
     * @return The status of the PREPARING phase.
     * @see PhaseStatus
     */

    public String getPrepareStatus() {
        return this.prepareStatus;
    }

    /**
     * <p>
     * The status of the PREPARING phase.
     * </p>
     * 
     * @param prepareStatus
     *        The status of the PREPARING phase.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PhaseStatus
     */

    public TaskExecutionResultDetail withPrepareStatus(String prepareStatus) {
        setPrepareStatus(prepareStatus);
        return this;
    }

    /**
     * <p>
     * The status of the PREPARING phase.
     * </p>
     * 
     * @param prepareStatus
     *        The status of the PREPARING phase.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PhaseStatus
     */

    public TaskExecutionResultDetail withPrepareStatus(PhaseStatus prepareStatus) {
        this.prepareStatus = prepareStatus.toString();
        return this;
    }

    /**
     * <p>
     * The total time in milliseconds that AWS DataSync spent in the TRANSFERRING phase.
     * </p>
     * 
     * @param transferDuration
     *        The total time in milliseconds that AWS DataSync spent in the TRANSFERRING phase.
     */

    public void setTransferDuration(Long transferDuration) {
        this.transferDuration = transferDuration;
    }

    /**
     * <p>
     * The total time in milliseconds that AWS DataSync spent in the TRANSFERRING phase.
     * </p>
     * 
     * @return The total time in milliseconds that AWS DataSync spent in the TRANSFERRING phase.
     */

    public Long getTransferDuration() {
        return this.transferDuration;
    }

    /**
     * <p>
     * The total time in milliseconds that AWS DataSync spent in the TRANSFERRING phase.
     * </p>
     * 
     * @param transferDuration
     *        The total time in milliseconds that AWS DataSync spent in the TRANSFERRING phase.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskExecutionResultDetail withTransferDuration(Long transferDuration) {
        setTransferDuration(transferDuration);
        return this;
    }

    /**
     * <p>
     * The status of the TRANSFERRING Phase.
     * </p>
     * 
     * @param transferStatus
     *        The status of the TRANSFERRING Phase.
     * @see PhaseStatus
     */

    public void setTransferStatus(String transferStatus) {
        this.transferStatus = transferStatus;
    }

    /**
     * <p>
     * The status of the TRANSFERRING Phase.
     * </p>
     * 
     * @return The status of the TRANSFERRING Phase.
     * @see PhaseStatus
     */

    public String getTransferStatus() {
        return this.transferStatus;
    }

    /**
     * <p>
     * The status of the TRANSFERRING Phase.
     * </p>
     * 
     * @param transferStatus
     *        The status of the TRANSFERRING Phase.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PhaseStatus
     */

    public TaskExecutionResultDetail withTransferStatus(String transferStatus) {
        setTransferStatus(transferStatus);
        return this;
    }

    /**
     * <p>
     * The status of the TRANSFERRING Phase.
     * </p>
     * 
     * @param transferStatus
     *        The status of the TRANSFERRING Phase.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PhaseStatus
     */

    public TaskExecutionResultDetail withTransferStatus(PhaseStatus transferStatus) {
        this.transferStatus = transferStatus.toString();
        return this;
    }

    /**
     * <p>
     * The total time in milliseconds that AWS DataSync spent in the VERIFYING phase.
     * </p>
     * 
     * @param verifyDuration
     *        The total time in milliseconds that AWS DataSync spent in the VERIFYING phase.
     */

    public void setVerifyDuration(Long verifyDuration) {
        this.verifyDuration = verifyDuration;
    }

    /**
     * <p>
     * The total time in milliseconds that AWS DataSync spent in the VERIFYING phase.
     * </p>
     * 
     * @return The total time in milliseconds that AWS DataSync spent in the VERIFYING phase.
     */

    public Long getVerifyDuration() {
        return this.verifyDuration;
    }

    /**
     * <p>
     * The total time in milliseconds that AWS DataSync spent in the VERIFYING phase.
     * </p>
     * 
     * @param verifyDuration
     *        The total time in milliseconds that AWS DataSync spent in the VERIFYING phase.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskExecutionResultDetail withVerifyDuration(Long verifyDuration) {
        setVerifyDuration(verifyDuration);
        return this;
    }

    /**
     * <p>
     * The status of the VERIFYING Phase.
     * </p>
     * 
     * @param verifyStatus
     *        The status of the VERIFYING Phase.
     * @see PhaseStatus
     */

    public void setVerifyStatus(String verifyStatus) {
        this.verifyStatus = verifyStatus;
    }

    /**
     * <p>
     * The status of the VERIFYING Phase.
     * </p>
     * 
     * @return The status of the VERIFYING Phase.
     * @see PhaseStatus
     */

    public String getVerifyStatus() {
        return this.verifyStatus;
    }

    /**
     * <p>
     * The status of the VERIFYING Phase.
     * </p>
     * 
     * @param verifyStatus
     *        The status of the VERIFYING Phase.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PhaseStatus
     */

    public TaskExecutionResultDetail withVerifyStatus(String verifyStatus) {
        setVerifyStatus(verifyStatus);
        return this;
    }

    /**
     * <p>
     * The status of the VERIFYING Phase.
     * </p>
     * 
     * @param verifyStatus
     *        The status of the VERIFYING Phase.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PhaseStatus
     */

    public TaskExecutionResultDetail withVerifyStatus(PhaseStatus verifyStatus) {
        this.verifyStatus = verifyStatus.toString();
        return this;
    }

    /**
     * <p>
     * Errors that AWS DataSync encountered during execution of the task. You can use this error code to help
     * troubleshoot issues.
     * </p>
     * 
     * @param errorCode
     *        Errors that AWS DataSync encountered during execution of the task. You can use this error code to help
     *        troubleshoot issues.
     */

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * <p>
     * Errors that AWS DataSync encountered during execution of the task. You can use this error code to help
     * troubleshoot issues.
     * </p>
     * 
     * @return Errors that AWS DataSync encountered during execution of the task. You can use this error code to help
     *         troubleshoot issues.
     */

    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * <p>
     * Errors that AWS DataSync encountered during execution of the task. You can use this error code to help
     * troubleshoot issues.
     * </p>
     * 
     * @param errorCode
     *        Errors that AWS DataSync encountered during execution of the task. You can use this error code to help
     *        troubleshoot issues.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskExecutionResultDetail withErrorCode(String errorCode) {
        setErrorCode(errorCode);
        return this;
    }

    /**
     * <p>
     * Detailed description of an error that was encountered during the task execution. You can use this information to
     * help troubleshoot issues.
     * </p>
     * 
     * @param errorDetail
     *        Detailed description of an error that was encountered during the task execution. You can use this
     *        information to help troubleshoot issues.
     */

    public void setErrorDetail(String errorDetail) {
        this.errorDetail = errorDetail;
    }

    /**
     * <p>
     * Detailed description of an error that was encountered during the task execution. You can use this information to
     * help troubleshoot issues.
     * </p>
     * 
     * @return Detailed description of an error that was encountered during the task execution. You can use this
     *         information to help troubleshoot issues.
     */

    public String getErrorDetail() {
        return this.errorDetail;
    }

    /**
     * <p>
     * Detailed description of an error that was encountered during the task execution. You can use this information to
     * help troubleshoot issues.
     * </p>
     * 
     * @param errorDetail
     *        Detailed description of an error that was encountered during the task execution. You can use this
     *        information to help troubleshoot issues.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskExecutionResultDetail withErrorDetail(String errorDetail) {
        setErrorDetail(errorDetail);
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
        if (getPrepareDuration() != null)
            sb.append("PrepareDuration: ").append(getPrepareDuration()).append(",");
        if (getPrepareStatus() != null)
            sb.append("PrepareStatus: ").append(getPrepareStatus()).append(",");
        if (getTransferDuration() != null)
            sb.append("TransferDuration: ").append(getTransferDuration()).append(",");
        if (getTransferStatus() != null)
            sb.append("TransferStatus: ").append(getTransferStatus()).append(",");
        if (getVerifyDuration() != null)
            sb.append("VerifyDuration: ").append(getVerifyDuration()).append(",");
        if (getVerifyStatus() != null)
            sb.append("VerifyStatus: ").append(getVerifyStatus()).append(",");
        if (getErrorCode() != null)
            sb.append("ErrorCode: ").append(getErrorCode()).append(",");
        if (getErrorDetail() != null)
            sb.append("ErrorDetail: ").append(getErrorDetail());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TaskExecutionResultDetail == false)
            return false;
        TaskExecutionResultDetail other = (TaskExecutionResultDetail) obj;
        if (other.getPrepareDuration() == null ^ this.getPrepareDuration() == null)
            return false;
        if (other.getPrepareDuration() != null && other.getPrepareDuration().equals(this.getPrepareDuration()) == false)
            return false;
        if (other.getPrepareStatus() == null ^ this.getPrepareStatus() == null)
            return false;
        if (other.getPrepareStatus() != null && other.getPrepareStatus().equals(this.getPrepareStatus()) == false)
            return false;
        if (other.getTransferDuration() == null ^ this.getTransferDuration() == null)
            return false;
        if (other.getTransferDuration() != null && other.getTransferDuration().equals(this.getTransferDuration()) == false)
            return false;
        if (other.getTransferStatus() == null ^ this.getTransferStatus() == null)
            return false;
        if (other.getTransferStatus() != null && other.getTransferStatus().equals(this.getTransferStatus()) == false)
            return false;
        if (other.getVerifyDuration() == null ^ this.getVerifyDuration() == null)
            return false;
        if (other.getVerifyDuration() != null && other.getVerifyDuration().equals(this.getVerifyDuration()) == false)
            return false;
        if (other.getVerifyStatus() == null ^ this.getVerifyStatus() == null)
            return false;
        if (other.getVerifyStatus() != null && other.getVerifyStatus().equals(this.getVerifyStatus()) == false)
            return false;
        if (other.getErrorCode() == null ^ this.getErrorCode() == null)
            return false;
        if (other.getErrorCode() != null && other.getErrorCode().equals(this.getErrorCode()) == false)
            return false;
        if (other.getErrorDetail() == null ^ this.getErrorDetail() == null)
            return false;
        if (other.getErrorDetail() != null && other.getErrorDetail().equals(this.getErrorDetail()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPrepareDuration() == null) ? 0 : getPrepareDuration().hashCode());
        hashCode = prime * hashCode + ((getPrepareStatus() == null) ? 0 : getPrepareStatus().hashCode());
        hashCode = prime * hashCode + ((getTransferDuration() == null) ? 0 : getTransferDuration().hashCode());
        hashCode = prime * hashCode + ((getTransferStatus() == null) ? 0 : getTransferStatus().hashCode());
        hashCode = prime * hashCode + ((getVerifyDuration() == null) ? 0 : getVerifyDuration().hashCode());
        hashCode = prime * hashCode + ((getVerifyStatus() == null) ? 0 : getVerifyStatus().hashCode());
        hashCode = prime * hashCode + ((getErrorCode() == null) ? 0 : getErrorCode().hashCode());
        hashCode = prime * hashCode + ((getErrorDetail() == null) ? 0 : getErrorDetail().hashCode());
        return hashCode;
    }

    @Override
    public TaskExecutionResultDetail clone() {
        try {
            return (TaskExecutionResultDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.datasync.model.transform.TaskExecutionResultDetailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
