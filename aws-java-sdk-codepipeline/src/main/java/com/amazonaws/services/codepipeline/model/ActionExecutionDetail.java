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
package com.amazonaws.services.codepipeline.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Returns information about an execution of an action, including the action execution ID, and the name, version, and
 * timing of the action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/ActionExecutionDetail" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ActionExecutionDetail implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The pipeline execution ID for the action execution.
     * </p>
     */
    private String pipelineExecutionId;
    /**
     * <p>
     * The action execution ID.
     * </p>
     */
    private String actionExecutionId;
    /**
     * <p>
     * The version of the pipeline where the action was run.
     * </p>
     */
    private Integer pipelineVersion;
    /**
     * <p>
     * The name of the stage that contains the action.
     * </p>
     */
    private String stageName;
    /**
     * <p>
     * The name of the action.
     * </p>
     */
    private String actionName;
    /**
     * <p>
     * The start time of the action execution.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The last update time of the action execution.
     * </p>
     */
    private java.util.Date lastUpdateTime;
    /**
     * <p>
     * The status of the action execution. Status categories are InProgress, Succeeded, and Failed.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Input details for the action execution, such as role ARN, Region, and input artifacts.
     * </p>
     */
    private ActionExecutionInput input;
    /**
     * <p>
     * Output details for the action execution, such as the action execution result.
     * </p>
     */
    private ActionExecutionOutput output;

    /**
     * <p>
     * The pipeline execution ID for the action execution.
     * </p>
     * 
     * @param pipelineExecutionId
     *        The pipeline execution ID for the action execution.
     */

    public void setPipelineExecutionId(String pipelineExecutionId) {
        this.pipelineExecutionId = pipelineExecutionId;
    }

    /**
     * <p>
     * The pipeline execution ID for the action execution.
     * </p>
     * 
     * @return The pipeline execution ID for the action execution.
     */

    public String getPipelineExecutionId() {
        return this.pipelineExecutionId;
    }

    /**
     * <p>
     * The pipeline execution ID for the action execution.
     * </p>
     * 
     * @param pipelineExecutionId
     *        The pipeline execution ID for the action execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionExecutionDetail withPipelineExecutionId(String pipelineExecutionId) {
        setPipelineExecutionId(pipelineExecutionId);
        return this;
    }

    /**
     * <p>
     * The action execution ID.
     * </p>
     * 
     * @param actionExecutionId
     *        The action execution ID.
     */

    public void setActionExecutionId(String actionExecutionId) {
        this.actionExecutionId = actionExecutionId;
    }

    /**
     * <p>
     * The action execution ID.
     * </p>
     * 
     * @return The action execution ID.
     */

    public String getActionExecutionId() {
        return this.actionExecutionId;
    }

    /**
     * <p>
     * The action execution ID.
     * </p>
     * 
     * @param actionExecutionId
     *        The action execution ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionExecutionDetail withActionExecutionId(String actionExecutionId) {
        setActionExecutionId(actionExecutionId);
        return this;
    }

    /**
     * <p>
     * The version of the pipeline where the action was run.
     * </p>
     * 
     * @param pipelineVersion
     *        The version of the pipeline where the action was run.
     */

    public void setPipelineVersion(Integer pipelineVersion) {
        this.pipelineVersion = pipelineVersion;
    }

    /**
     * <p>
     * The version of the pipeline where the action was run.
     * </p>
     * 
     * @return The version of the pipeline where the action was run.
     */

    public Integer getPipelineVersion() {
        return this.pipelineVersion;
    }

    /**
     * <p>
     * The version of the pipeline where the action was run.
     * </p>
     * 
     * @param pipelineVersion
     *        The version of the pipeline where the action was run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionExecutionDetail withPipelineVersion(Integer pipelineVersion) {
        setPipelineVersion(pipelineVersion);
        return this;
    }

    /**
     * <p>
     * The name of the stage that contains the action.
     * </p>
     * 
     * @param stageName
     *        The name of the stage that contains the action.
     */

    public void setStageName(String stageName) {
        this.stageName = stageName;
    }

    /**
     * <p>
     * The name of the stage that contains the action.
     * </p>
     * 
     * @return The name of the stage that contains the action.
     */

    public String getStageName() {
        return this.stageName;
    }

    /**
     * <p>
     * The name of the stage that contains the action.
     * </p>
     * 
     * @param stageName
     *        The name of the stage that contains the action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionExecutionDetail withStageName(String stageName) {
        setStageName(stageName);
        return this;
    }

    /**
     * <p>
     * The name of the action.
     * </p>
     * 
     * @param actionName
     *        The name of the action.
     */

    public void setActionName(String actionName) {
        this.actionName = actionName;
    }

    /**
     * <p>
     * The name of the action.
     * </p>
     * 
     * @return The name of the action.
     */

    public String getActionName() {
        return this.actionName;
    }

    /**
     * <p>
     * The name of the action.
     * </p>
     * 
     * @param actionName
     *        The name of the action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionExecutionDetail withActionName(String actionName) {
        setActionName(actionName);
        return this;
    }

    /**
     * <p>
     * The start time of the action execution.
     * </p>
     * 
     * @param startTime
     *        The start time of the action execution.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The start time of the action execution.
     * </p>
     * 
     * @return The start time of the action execution.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The start time of the action execution.
     * </p>
     * 
     * @param startTime
     *        The start time of the action execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionExecutionDetail withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The last update time of the action execution.
     * </p>
     * 
     * @param lastUpdateTime
     *        The last update time of the action execution.
     */

    public void setLastUpdateTime(java.util.Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    /**
     * <p>
     * The last update time of the action execution.
     * </p>
     * 
     * @return The last update time of the action execution.
     */

    public java.util.Date getLastUpdateTime() {
        return this.lastUpdateTime;
    }

    /**
     * <p>
     * The last update time of the action execution.
     * </p>
     * 
     * @param lastUpdateTime
     *        The last update time of the action execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionExecutionDetail withLastUpdateTime(java.util.Date lastUpdateTime) {
        setLastUpdateTime(lastUpdateTime);
        return this;
    }

    /**
     * <p>
     * The status of the action execution. Status categories are InProgress, Succeeded, and Failed.
     * </p>
     * 
     * @param status
     *        The status of the action execution. Status categories are InProgress, Succeeded, and Failed.
     * @see ActionExecutionStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the action execution. Status categories are InProgress, Succeeded, and Failed.
     * </p>
     * 
     * @return The status of the action execution. Status categories are InProgress, Succeeded, and Failed.
     * @see ActionExecutionStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the action execution. Status categories are InProgress, Succeeded, and Failed.
     * </p>
     * 
     * @param status
     *        The status of the action execution. Status categories are InProgress, Succeeded, and Failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActionExecutionStatus
     */

    public ActionExecutionDetail withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the action execution. Status categories are InProgress, Succeeded, and Failed.
     * </p>
     * 
     * @param status
     *        The status of the action execution. Status categories are InProgress, Succeeded, and Failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActionExecutionStatus
     */

    public ActionExecutionDetail withStatus(ActionExecutionStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Input details for the action execution, such as role ARN, Region, and input artifacts.
     * </p>
     * 
     * @param input
     *        Input details for the action execution, such as role ARN, Region, and input artifacts.
     */

    public void setInput(ActionExecutionInput input) {
        this.input = input;
    }

    /**
     * <p>
     * Input details for the action execution, such as role ARN, Region, and input artifacts.
     * </p>
     * 
     * @return Input details for the action execution, such as role ARN, Region, and input artifacts.
     */

    public ActionExecutionInput getInput() {
        return this.input;
    }

    /**
     * <p>
     * Input details for the action execution, such as role ARN, Region, and input artifacts.
     * </p>
     * 
     * @param input
     *        Input details for the action execution, such as role ARN, Region, and input artifacts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionExecutionDetail withInput(ActionExecutionInput input) {
        setInput(input);
        return this;
    }

    /**
     * <p>
     * Output details for the action execution, such as the action execution result.
     * </p>
     * 
     * @param output
     *        Output details for the action execution, such as the action execution result.
     */

    public void setOutput(ActionExecutionOutput output) {
        this.output = output;
    }

    /**
     * <p>
     * Output details for the action execution, such as the action execution result.
     * </p>
     * 
     * @return Output details for the action execution, such as the action execution result.
     */

    public ActionExecutionOutput getOutput() {
        return this.output;
    }

    /**
     * <p>
     * Output details for the action execution, such as the action execution result.
     * </p>
     * 
     * @param output
     *        Output details for the action execution, such as the action execution result.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionExecutionDetail withOutput(ActionExecutionOutput output) {
        setOutput(output);
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
        if (getPipelineExecutionId() != null)
            sb.append("PipelineExecutionId: ").append(getPipelineExecutionId()).append(",");
        if (getActionExecutionId() != null)
            sb.append("ActionExecutionId: ").append(getActionExecutionId()).append(",");
        if (getPipelineVersion() != null)
            sb.append("PipelineVersion: ").append(getPipelineVersion()).append(",");
        if (getStageName() != null)
            sb.append("StageName: ").append(getStageName()).append(",");
        if (getActionName() != null)
            sb.append("ActionName: ").append(getActionName()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getLastUpdateTime() != null)
            sb.append("LastUpdateTime: ").append(getLastUpdateTime()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getInput() != null)
            sb.append("Input: ").append(getInput()).append(",");
        if (getOutput() != null)
            sb.append("Output: ").append(getOutput());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ActionExecutionDetail == false)
            return false;
        ActionExecutionDetail other = (ActionExecutionDetail) obj;
        if (other.getPipelineExecutionId() == null ^ this.getPipelineExecutionId() == null)
            return false;
        if (other.getPipelineExecutionId() != null && other.getPipelineExecutionId().equals(this.getPipelineExecutionId()) == false)
            return false;
        if (other.getActionExecutionId() == null ^ this.getActionExecutionId() == null)
            return false;
        if (other.getActionExecutionId() != null && other.getActionExecutionId().equals(this.getActionExecutionId()) == false)
            return false;
        if (other.getPipelineVersion() == null ^ this.getPipelineVersion() == null)
            return false;
        if (other.getPipelineVersion() != null && other.getPipelineVersion().equals(this.getPipelineVersion()) == false)
            return false;
        if (other.getStageName() == null ^ this.getStageName() == null)
            return false;
        if (other.getStageName() != null && other.getStageName().equals(this.getStageName()) == false)
            return false;
        if (other.getActionName() == null ^ this.getActionName() == null)
            return false;
        if (other.getActionName() != null && other.getActionName().equals(this.getActionName()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getLastUpdateTime() == null ^ this.getLastUpdateTime() == null)
            return false;
        if (other.getLastUpdateTime() != null && other.getLastUpdateTime().equals(this.getLastUpdateTime()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getInput() == null ^ this.getInput() == null)
            return false;
        if (other.getInput() != null && other.getInput().equals(this.getInput()) == false)
            return false;
        if (other.getOutput() == null ^ this.getOutput() == null)
            return false;
        if (other.getOutput() != null && other.getOutput().equals(this.getOutput()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPipelineExecutionId() == null) ? 0 : getPipelineExecutionId().hashCode());
        hashCode = prime * hashCode + ((getActionExecutionId() == null) ? 0 : getActionExecutionId().hashCode());
        hashCode = prime * hashCode + ((getPipelineVersion() == null) ? 0 : getPipelineVersion().hashCode());
        hashCode = prime * hashCode + ((getStageName() == null) ? 0 : getStageName().hashCode());
        hashCode = prime * hashCode + ((getActionName() == null) ? 0 : getActionName().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getLastUpdateTime() == null) ? 0 : getLastUpdateTime().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getInput() == null) ? 0 : getInput().hashCode());
        hashCode = prime * hashCode + ((getOutput() == null) ? 0 : getOutput().hashCode());
        return hashCode;
    }

    @Override
    public ActionExecutionDetail clone() {
        try {
            return (ActionExecutionDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codepipeline.model.transform.ActionExecutionDetailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
