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
package com.amazonaws.services.migrationhuborchestrator.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/StopWorkflow"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StopWorkflowResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the migration workflow.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the migration workflow.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The status of the migration workflow.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The status message of the migration workflow.
     * </p>
     */
    private String statusMessage;
    /**
     * <p>
     * The time at which the migration workflow was stopped.
     * </p>
     */
    private java.util.Date lastStopTime;

    /**
     * <p>
     * The ID of the migration workflow.
     * </p>
     * 
     * @param id
     *        The ID of the migration workflow.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the migration workflow.
     * </p>
     * 
     * @return The ID of the migration workflow.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the migration workflow.
     * </p>
     * 
     * @param id
     *        The ID of the migration workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopWorkflowResult withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the migration workflow.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the migration workflow.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the migration workflow.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the migration workflow.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the migration workflow.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the migration workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopWorkflowResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The status of the migration workflow.
     * </p>
     * 
     * @param status
     *        The status of the migration workflow.
     * @see MigrationWorkflowStatusEnum
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the migration workflow.
     * </p>
     * 
     * @return The status of the migration workflow.
     * @see MigrationWorkflowStatusEnum
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the migration workflow.
     * </p>
     * 
     * @param status
     *        The status of the migration workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MigrationWorkflowStatusEnum
     */

    public StopWorkflowResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the migration workflow.
     * </p>
     * 
     * @param status
     *        The status of the migration workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MigrationWorkflowStatusEnum
     */

    public StopWorkflowResult withStatus(MigrationWorkflowStatusEnum status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The status message of the migration workflow.
     * </p>
     * 
     * @param statusMessage
     *        The status message of the migration workflow.
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * The status message of the migration workflow.
     * </p>
     * 
     * @return The status message of the migration workflow.
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * The status message of the migration workflow.
     * </p>
     * 
     * @param statusMessage
     *        The status message of the migration workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopWorkflowResult withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
        return this;
    }

    /**
     * <p>
     * The time at which the migration workflow was stopped.
     * </p>
     * 
     * @param lastStopTime
     *        The time at which the migration workflow was stopped.
     */

    public void setLastStopTime(java.util.Date lastStopTime) {
        this.lastStopTime = lastStopTime;
    }

    /**
     * <p>
     * The time at which the migration workflow was stopped.
     * </p>
     * 
     * @return The time at which the migration workflow was stopped.
     */

    public java.util.Date getLastStopTime() {
        return this.lastStopTime;
    }

    /**
     * <p>
     * The time at which the migration workflow was stopped.
     * </p>
     * 
     * @param lastStopTime
     *        The time at which the migration workflow was stopped.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopWorkflowResult withLastStopTime(java.util.Date lastStopTime) {
        setLastStopTime(lastStopTime);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append(getStatusMessage()).append(",");
        if (getLastStopTime() != null)
            sb.append("LastStopTime: ").append(getLastStopTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StopWorkflowResult == false)
            return false;
        StopWorkflowResult other = (StopWorkflowResult) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        if (other.getLastStopTime() == null ^ this.getLastStopTime() == null)
            return false;
        if (other.getLastStopTime() != null && other.getLastStopTime().equals(this.getLastStopTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getLastStopTime() == null) ? 0 : getLastStopTime().hashCode());
        return hashCode;
    }

    @Override
    public StopWorkflowResult clone() {
        try {
            return (StopWorkflowResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
