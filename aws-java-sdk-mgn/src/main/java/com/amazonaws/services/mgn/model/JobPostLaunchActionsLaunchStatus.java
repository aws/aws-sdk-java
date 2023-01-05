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
package com.amazonaws.services.mgn.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Launch Status of the Job Post Launch Actions.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/JobPostLaunchActionsLaunchStatus"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JobPostLaunchActionsLaunchStatus implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * AWS Systems Manager Document's execution ID of the of the Job Post Launch Actions.
     * </p>
     */
    private String executionID;
    /**
     * <p>
     * AWS Systems Manager Document's execution status.
     * </p>
     */
    private String executionStatus;
    /**
     * <p>
     * AWS Systems Manager Document's failure reason.
     * </p>
     */
    private String failureReason;
    /**
     * <p>
     * AWS Systems Manager's Document of the of the Job Post Launch Actions.
     * </p>
     */
    private SsmDocument ssmDocument;
    /**
     * <p>
     * AWS Systems Manager Document type.
     * </p>
     */
    private String ssmDocumentType;

    /**
     * <p>
     * AWS Systems Manager Document's execution ID of the of the Job Post Launch Actions.
     * </p>
     * 
     * @param executionID
     *        AWS Systems Manager Document's execution ID of the of the Job Post Launch Actions.
     */

    public void setExecutionID(String executionID) {
        this.executionID = executionID;
    }

    /**
     * <p>
     * AWS Systems Manager Document's execution ID of the of the Job Post Launch Actions.
     * </p>
     * 
     * @return AWS Systems Manager Document's execution ID of the of the Job Post Launch Actions.
     */

    public String getExecutionID() {
        return this.executionID;
    }

    /**
     * <p>
     * AWS Systems Manager Document's execution ID of the of the Job Post Launch Actions.
     * </p>
     * 
     * @param executionID
     *        AWS Systems Manager Document's execution ID of the of the Job Post Launch Actions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobPostLaunchActionsLaunchStatus withExecutionID(String executionID) {
        setExecutionID(executionID);
        return this;
    }

    /**
     * <p>
     * AWS Systems Manager Document's execution status.
     * </p>
     * 
     * @param executionStatus
     *        AWS Systems Manager Document's execution status.
     * @see PostLaunchActionExecutionStatus
     */

    public void setExecutionStatus(String executionStatus) {
        this.executionStatus = executionStatus;
    }

    /**
     * <p>
     * AWS Systems Manager Document's execution status.
     * </p>
     * 
     * @return AWS Systems Manager Document's execution status.
     * @see PostLaunchActionExecutionStatus
     */

    public String getExecutionStatus() {
        return this.executionStatus;
    }

    /**
     * <p>
     * AWS Systems Manager Document's execution status.
     * </p>
     * 
     * @param executionStatus
     *        AWS Systems Manager Document's execution status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PostLaunchActionExecutionStatus
     */

    public JobPostLaunchActionsLaunchStatus withExecutionStatus(String executionStatus) {
        setExecutionStatus(executionStatus);
        return this;
    }

    /**
     * <p>
     * AWS Systems Manager Document's execution status.
     * </p>
     * 
     * @param executionStatus
     *        AWS Systems Manager Document's execution status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PostLaunchActionExecutionStatus
     */

    public JobPostLaunchActionsLaunchStatus withExecutionStatus(PostLaunchActionExecutionStatus executionStatus) {
        this.executionStatus = executionStatus.toString();
        return this;
    }

    /**
     * <p>
     * AWS Systems Manager Document's failure reason.
     * </p>
     * 
     * @param failureReason
     *        AWS Systems Manager Document's failure reason.
     */

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * AWS Systems Manager Document's failure reason.
     * </p>
     * 
     * @return AWS Systems Manager Document's failure reason.
     */

    public String getFailureReason() {
        return this.failureReason;
    }

    /**
     * <p>
     * AWS Systems Manager Document's failure reason.
     * </p>
     * 
     * @param failureReason
     *        AWS Systems Manager Document's failure reason.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobPostLaunchActionsLaunchStatus withFailureReason(String failureReason) {
        setFailureReason(failureReason);
        return this;
    }

    /**
     * <p>
     * AWS Systems Manager's Document of the of the Job Post Launch Actions.
     * </p>
     * 
     * @param ssmDocument
     *        AWS Systems Manager's Document of the of the Job Post Launch Actions.
     */

    public void setSsmDocument(SsmDocument ssmDocument) {
        this.ssmDocument = ssmDocument;
    }

    /**
     * <p>
     * AWS Systems Manager's Document of the of the Job Post Launch Actions.
     * </p>
     * 
     * @return AWS Systems Manager's Document of the of the Job Post Launch Actions.
     */

    public SsmDocument getSsmDocument() {
        return this.ssmDocument;
    }

    /**
     * <p>
     * AWS Systems Manager's Document of the of the Job Post Launch Actions.
     * </p>
     * 
     * @param ssmDocument
     *        AWS Systems Manager's Document of the of the Job Post Launch Actions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobPostLaunchActionsLaunchStatus withSsmDocument(SsmDocument ssmDocument) {
        setSsmDocument(ssmDocument);
        return this;
    }

    /**
     * <p>
     * AWS Systems Manager Document type.
     * </p>
     * 
     * @param ssmDocumentType
     *        AWS Systems Manager Document type.
     * @see SsmDocumentType
     */

    public void setSsmDocumentType(String ssmDocumentType) {
        this.ssmDocumentType = ssmDocumentType;
    }

    /**
     * <p>
     * AWS Systems Manager Document type.
     * </p>
     * 
     * @return AWS Systems Manager Document type.
     * @see SsmDocumentType
     */

    public String getSsmDocumentType() {
        return this.ssmDocumentType;
    }

    /**
     * <p>
     * AWS Systems Manager Document type.
     * </p>
     * 
     * @param ssmDocumentType
     *        AWS Systems Manager Document type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SsmDocumentType
     */

    public JobPostLaunchActionsLaunchStatus withSsmDocumentType(String ssmDocumentType) {
        setSsmDocumentType(ssmDocumentType);
        return this;
    }

    /**
     * <p>
     * AWS Systems Manager Document type.
     * </p>
     * 
     * @param ssmDocumentType
     *        AWS Systems Manager Document type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SsmDocumentType
     */

    public JobPostLaunchActionsLaunchStatus withSsmDocumentType(SsmDocumentType ssmDocumentType) {
        this.ssmDocumentType = ssmDocumentType.toString();
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
        if (getExecutionID() != null)
            sb.append("ExecutionID: ").append(getExecutionID()).append(",");
        if (getExecutionStatus() != null)
            sb.append("ExecutionStatus: ").append(getExecutionStatus()).append(",");
        if (getFailureReason() != null)
            sb.append("FailureReason: ").append(getFailureReason()).append(",");
        if (getSsmDocument() != null)
            sb.append("SsmDocument: ").append(getSsmDocument()).append(",");
        if (getSsmDocumentType() != null)
            sb.append("SsmDocumentType: ").append(getSsmDocumentType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JobPostLaunchActionsLaunchStatus == false)
            return false;
        JobPostLaunchActionsLaunchStatus other = (JobPostLaunchActionsLaunchStatus) obj;
        if (other.getExecutionID() == null ^ this.getExecutionID() == null)
            return false;
        if (other.getExecutionID() != null && other.getExecutionID().equals(this.getExecutionID()) == false)
            return false;
        if (other.getExecutionStatus() == null ^ this.getExecutionStatus() == null)
            return false;
        if (other.getExecutionStatus() != null && other.getExecutionStatus().equals(this.getExecutionStatus()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        if (other.getSsmDocument() == null ^ this.getSsmDocument() == null)
            return false;
        if (other.getSsmDocument() != null && other.getSsmDocument().equals(this.getSsmDocument()) == false)
            return false;
        if (other.getSsmDocumentType() == null ^ this.getSsmDocumentType() == null)
            return false;
        if (other.getSsmDocumentType() != null && other.getSsmDocumentType().equals(this.getSsmDocumentType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExecutionID() == null) ? 0 : getExecutionID().hashCode());
        hashCode = prime * hashCode + ((getExecutionStatus() == null) ? 0 : getExecutionStatus().hashCode());
        hashCode = prime * hashCode + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        hashCode = prime * hashCode + ((getSsmDocument() == null) ? 0 : getSsmDocument().hashCode());
        hashCode = prime * hashCode + ((getSsmDocumentType() == null) ? 0 : getSsmDocumentType().hashCode());
        return hashCode;
    }

    @Override
    public JobPostLaunchActionsLaunchStatus clone() {
        try {
            return (JobPostLaunchActionsLaunchStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mgn.model.transform.JobPostLaunchActionsLaunchStatusMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
