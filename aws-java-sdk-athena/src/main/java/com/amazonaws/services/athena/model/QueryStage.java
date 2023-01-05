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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Stage statistics such as input and output rows and bytes, execution time and stage state. This information also
 * includes substages and the query stage plan.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/QueryStage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class QueryStage implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier for a stage.
     * </p>
     */
    private Long stageId;
    /**
     * <p>
     * State of the stage after query execution.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The number of bytes output from the stage after execution.
     * </p>
     */
    private Long outputBytes;
    /**
     * <p>
     * The number of rows output from the stage after execution.
     * </p>
     */
    private Long outputRows;
    /**
     * <p>
     * The number of bytes input into the stage for execution.
     * </p>
     */
    private Long inputBytes;
    /**
     * <p>
     * The number of rows input into the stage for execution.
     * </p>
     */
    private Long inputRows;
    /**
     * <p>
     * Time taken to execute this stage.
     * </p>
     */
    private Long executionTime;
    /**
     * <p>
     * Stage plan information such as name, identifier, sub plans, and source stages.
     * </p>
     */
    private QueryStagePlanNode queryStagePlan;
    /**
     * <p>
     * List of sub query stages that form this stage execution plan.
     * </p>
     */
    private java.util.List<QueryStage> subStages;

    /**
     * <p>
     * The identifier for a stage.
     * </p>
     * 
     * @param stageId
     *        The identifier for a stage.
     */

    public void setStageId(Long stageId) {
        this.stageId = stageId;
    }

    /**
     * <p>
     * The identifier for a stage.
     * </p>
     * 
     * @return The identifier for a stage.
     */

    public Long getStageId() {
        return this.stageId;
    }

    /**
     * <p>
     * The identifier for a stage.
     * </p>
     * 
     * @param stageId
     *        The identifier for a stage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryStage withStageId(Long stageId) {
        setStageId(stageId);
        return this;
    }

    /**
     * <p>
     * State of the stage after query execution.
     * </p>
     * 
     * @param state
     *        State of the stage after query execution.
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * State of the stage after query execution.
     * </p>
     * 
     * @return State of the stage after query execution.
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * State of the stage after query execution.
     * </p>
     * 
     * @param state
     *        State of the stage after query execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryStage withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The number of bytes output from the stage after execution.
     * </p>
     * 
     * @param outputBytes
     *        The number of bytes output from the stage after execution.
     */

    public void setOutputBytes(Long outputBytes) {
        this.outputBytes = outputBytes;
    }

    /**
     * <p>
     * The number of bytes output from the stage after execution.
     * </p>
     * 
     * @return The number of bytes output from the stage after execution.
     */

    public Long getOutputBytes() {
        return this.outputBytes;
    }

    /**
     * <p>
     * The number of bytes output from the stage after execution.
     * </p>
     * 
     * @param outputBytes
     *        The number of bytes output from the stage after execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryStage withOutputBytes(Long outputBytes) {
        setOutputBytes(outputBytes);
        return this;
    }

    /**
     * <p>
     * The number of rows output from the stage after execution.
     * </p>
     * 
     * @param outputRows
     *        The number of rows output from the stage after execution.
     */

    public void setOutputRows(Long outputRows) {
        this.outputRows = outputRows;
    }

    /**
     * <p>
     * The number of rows output from the stage after execution.
     * </p>
     * 
     * @return The number of rows output from the stage after execution.
     */

    public Long getOutputRows() {
        return this.outputRows;
    }

    /**
     * <p>
     * The number of rows output from the stage after execution.
     * </p>
     * 
     * @param outputRows
     *        The number of rows output from the stage after execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryStage withOutputRows(Long outputRows) {
        setOutputRows(outputRows);
        return this;
    }

    /**
     * <p>
     * The number of bytes input into the stage for execution.
     * </p>
     * 
     * @param inputBytes
     *        The number of bytes input into the stage for execution.
     */

    public void setInputBytes(Long inputBytes) {
        this.inputBytes = inputBytes;
    }

    /**
     * <p>
     * The number of bytes input into the stage for execution.
     * </p>
     * 
     * @return The number of bytes input into the stage for execution.
     */

    public Long getInputBytes() {
        return this.inputBytes;
    }

    /**
     * <p>
     * The number of bytes input into the stage for execution.
     * </p>
     * 
     * @param inputBytes
     *        The number of bytes input into the stage for execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryStage withInputBytes(Long inputBytes) {
        setInputBytes(inputBytes);
        return this;
    }

    /**
     * <p>
     * The number of rows input into the stage for execution.
     * </p>
     * 
     * @param inputRows
     *        The number of rows input into the stage for execution.
     */

    public void setInputRows(Long inputRows) {
        this.inputRows = inputRows;
    }

    /**
     * <p>
     * The number of rows input into the stage for execution.
     * </p>
     * 
     * @return The number of rows input into the stage for execution.
     */

    public Long getInputRows() {
        return this.inputRows;
    }

    /**
     * <p>
     * The number of rows input into the stage for execution.
     * </p>
     * 
     * @param inputRows
     *        The number of rows input into the stage for execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryStage withInputRows(Long inputRows) {
        setInputRows(inputRows);
        return this;
    }

    /**
     * <p>
     * Time taken to execute this stage.
     * </p>
     * 
     * @param executionTime
     *        Time taken to execute this stage.
     */

    public void setExecutionTime(Long executionTime) {
        this.executionTime = executionTime;
    }

    /**
     * <p>
     * Time taken to execute this stage.
     * </p>
     * 
     * @return Time taken to execute this stage.
     */

    public Long getExecutionTime() {
        return this.executionTime;
    }

    /**
     * <p>
     * Time taken to execute this stage.
     * </p>
     * 
     * @param executionTime
     *        Time taken to execute this stage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryStage withExecutionTime(Long executionTime) {
        setExecutionTime(executionTime);
        return this;
    }

    /**
     * <p>
     * Stage plan information such as name, identifier, sub plans, and source stages.
     * </p>
     * 
     * @param queryStagePlan
     *        Stage plan information such as name, identifier, sub plans, and source stages.
     */

    public void setQueryStagePlan(QueryStagePlanNode queryStagePlan) {
        this.queryStagePlan = queryStagePlan;
    }

    /**
     * <p>
     * Stage plan information such as name, identifier, sub plans, and source stages.
     * </p>
     * 
     * @return Stage plan information such as name, identifier, sub plans, and source stages.
     */

    public QueryStagePlanNode getQueryStagePlan() {
        return this.queryStagePlan;
    }

    /**
     * <p>
     * Stage plan information such as name, identifier, sub plans, and source stages.
     * </p>
     * 
     * @param queryStagePlan
     *        Stage plan information such as name, identifier, sub plans, and source stages.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryStage withQueryStagePlan(QueryStagePlanNode queryStagePlan) {
        setQueryStagePlan(queryStagePlan);
        return this;
    }

    /**
     * <p>
     * List of sub query stages that form this stage execution plan.
     * </p>
     * 
     * @return List of sub query stages that form this stage execution plan.
     */

    public java.util.List<QueryStage> getSubStages() {
        return subStages;
    }

    /**
     * <p>
     * List of sub query stages that form this stage execution plan.
     * </p>
     * 
     * @param subStages
     *        List of sub query stages that form this stage execution plan.
     */

    public void setSubStages(java.util.Collection<QueryStage> subStages) {
        if (subStages == null) {
            this.subStages = null;
            return;
        }

        this.subStages = new java.util.ArrayList<QueryStage>(subStages);
    }

    /**
     * <p>
     * List of sub query stages that form this stage execution plan.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubStages(java.util.Collection)} or {@link #withSubStages(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param subStages
     *        List of sub query stages that form this stage execution plan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryStage withSubStages(QueryStage... subStages) {
        if (this.subStages == null) {
            setSubStages(new java.util.ArrayList<QueryStage>(subStages.length));
        }
        for (QueryStage ele : subStages) {
            this.subStages.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of sub query stages that form this stage execution plan.
     * </p>
     * 
     * @param subStages
     *        List of sub query stages that form this stage execution plan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryStage withSubStages(java.util.Collection<QueryStage> subStages) {
        setSubStages(subStages);
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
        if (getStageId() != null)
            sb.append("StageId: ").append(getStageId()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getOutputBytes() != null)
            sb.append("OutputBytes: ").append(getOutputBytes()).append(",");
        if (getOutputRows() != null)
            sb.append("OutputRows: ").append(getOutputRows()).append(",");
        if (getInputBytes() != null)
            sb.append("InputBytes: ").append(getInputBytes()).append(",");
        if (getInputRows() != null)
            sb.append("InputRows: ").append(getInputRows()).append(",");
        if (getExecutionTime() != null)
            sb.append("ExecutionTime: ").append(getExecutionTime()).append(",");
        if (getQueryStagePlan() != null)
            sb.append("QueryStagePlan: ").append(getQueryStagePlan()).append(",");
        if (getSubStages() != null)
            sb.append("SubStages: ").append(getSubStages());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof QueryStage == false)
            return false;
        QueryStage other = (QueryStage) obj;
        if (other.getStageId() == null ^ this.getStageId() == null)
            return false;
        if (other.getStageId() != null && other.getStageId().equals(this.getStageId()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getOutputBytes() == null ^ this.getOutputBytes() == null)
            return false;
        if (other.getOutputBytes() != null && other.getOutputBytes().equals(this.getOutputBytes()) == false)
            return false;
        if (other.getOutputRows() == null ^ this.getOutputRows() == null)
            return false;
        if (other.getOutputRows() != null && other.getOutputRows().equals(this.getOutputRows()) == false)
            return false;
        if (other.getInputBytes() == null ^ this.getInputBytes() == null)
            return false;
        if (other.getInputBytes() != null && other.getInputBytes().equals(this.getInputBytes()) == false)
            return false;
        if (other.getInputRows() == null ^ this.getInputRows() == null)
            return false;
        if (other.getInputRows() != null && other.getInputRows().equals(this.getInputRows()) == false)
            return false;
        if (other.getExecutionTime() == null ^ this.getExecutionTime() == null)
            return false;
        if (other.getExecutionTime() != null && other.getExecutionTime().equals(this.getExecutionTime()) == false)
            return false;
        if (other.getQueryStagePlan() == null ^ this.getQueryStagePlan() == null)
            return false;
        if (other.getQueryStagePlan() != null && other.getQueryStagePlan().equals(this.getQueryStagePlan()) == false)
            return false;
        if (other.getSubStages() == null ^ this.getSubStages() == null)
            return false;
        if (other.getSubStages() != null && other.getSubStages().equals(this.getSubStages()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStageId() == null) ? 0 : getStageId().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getOutputBytes() == null) ? 0 : getOutputBytes().hashCode());
        hashCode = prime * hashCode + ((getOutputRows() == null) ? 0 : getOutputRows().hashCode());
        hashCode = prime * hashCode + ((getInputBytes() == null) ? 0 : getInputBytes().hashCode());
        hashCode = prime * hashCode + ((getInputRows() == null) ? 0 : getInputRows().hashCode());
        hashCode = prime * hashCode + ((getExecutionTime() == null) ? 0 : getExecutionTime().hashCode());
        hashCode = prime * hashCode + ((getQueryStagePlan() == null) ? 0 : getQueryStagePlan().hashCode());
        hashCode = prime * hashCode + ((getSubStages() == null) ? 0 : getSubStages().hashCode());
        return hashCode;
    }

    @Override
    public QueryStage clone() {
        try {
            return (QueryStage) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.athena.model.transform.QueryStageMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
