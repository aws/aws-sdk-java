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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The selective execution configuration applied to the pipeline run.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/SelectiveExecutionConfig" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SelectiveExecutionConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN from a reference execution of the current pipeline. Used to copy input collaterals needed for the
     * selected steps to run. The execution status of the pipeline can be either <code>Failed</code> or
     * <code>Success</code>.
     * </p>
     * <p>
     * This field is required if the steps you specify for <code>SelectedSteps</code> depend on output collaterals from
     * any non-specified pipeline steps. For more information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/pipelines-selective-ex.html">Selective Execution for
     * Pipeline Steps</a>.
     * </p>
     */
    private String sourcePipelineExecutionArn;
    /**
     * <p>
     * A list of pipeline steps to run. All step(s) in all path(s) between two selected steps should be included.
     * </p>
     */
    private java.util.List<SelectedStep> selectedSteps;

    /**
     * <p>
     * The ARN from a reference execution of the current pipeline. Used to copy input collaterals needed for the
     * selected steps to run. The execution status of the pipeline can be either <code>Failed</code> or
     * <code>Success</code>.
     * </p>
     * <p>
     * This field is required if the steps you specify for <code>SelectedSteps</code> depend on output collaterals from
     * any non-specified pipeline steps. For more information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/pipelines-selective-ex.html">Selective Execution for
     * Pipeline Steps</a>.
     * </p>
     * 
     * @param sourcePipelineExecutionArn
     *        The ARN from a reference execution of the current pipeline. Used to copy input collaterals needed for the
     *        selected steps to run. The execution status of the pipeline can be either <code>Failed</code> or
     *        <code>Success</code>.</p>
     *        <p>
     *        This field is required if the steps you specify for <code>SelectedSteps</code> depend on output
     *        collaterals from any non-specified pipeline steps. For more information, see <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/dg/pipelines-selective-ex.html">Selective Execution for
     *        Pipeline Steps</a>.
     */

    public void setSourcePipelineExecutionArn(String sourcePipelineExecutionArn) {
        this.sourcePipelineExecutionArn = sourcePipelineExecutionArn;
    }

    /**
     * <p>
     * The ARN from a reference execution of the current pipeline. Used to copy input collaterals needed for the
     * selected steps to run. The execution status of the pipeline can be either <code>Failed</code> or
     * <code>Success</code>.
     * </p>
     * <p>
     * This field is required if the steps you specify for <code>SelectedSteps</code> depend on output collaterals from
     * any non-specified pipeline steps. For more information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/pipelines-selective-ex.html">Selective Execution for
     * Pipeline Steps</a>.
     * </p>
     * 
     * @return The ARN from a reference execution of the current pipeline. Used to copy input collaterals needed for the
     *         selected steps to run. The execution status of the pipeline can be either <code>Failed</code> or
     *         <code>Success</code>.</p>
     *         <p>
     *         This field is required if the steps you specify for <code>SelectedSteps</code> depend on output
     *         collaterals from any non-specified pipeline steps. For more information, see <a
     *         href="https://docs.aws.amazon.com/sagemaker/latest/dg/pipelines-selective-ex.html">Selective Execution
     *         for Pipeline Steps</a>.
     */

    public String getSourcePipelineExecutionArn() {
        return this.sourcePipelineExecutionArn;
    }

    /**
     * <p>
     * The ARN from a reference execution of the current pipeline. Used to copy input collaterals needed for the
     * selected steps to run. The execution status of the pipeline can be either <code>Failed</code> or
     * <code>Success</code>.
     * </p>
     * <p>
     * This field is required if the steps you specify for <code>SelectedSteps</code> depend on output collaterals from
     * any non-specified pipeline steps. For more information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/pipelines-selective-ex.html">Selective Execution for
     * Pipeline Steps</a>.
     * </p>
     * 
     * @param sourcePipelineExecutionArn
     *        The ARN from a reference execution of the current pipeline. Used to copy input collaterals needed for the
     *        selected steps to run. The execution status of the pipeline can be either <code>Failed</code> or
     *        <code>Success</code>.</p>
     *        <p>
     *        This field is required if the steps you specify for <code>SelectedSteps</code> depend on output
     *        collaterals from any non-specified pipeline steps. For more information, see <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/dg/pipelines-selective-ex.html">Selective Execution for
     *        Pipeline Steps</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SelectiveExecutionConfig withSourcePipelineExecutionArn(String sourcePipelineExecutionArn) {
        setSourcePipelineExecutionArn(sourcePipelineExecutionArn);
        return this;
    }

    /**
     * <p>
     * A list of pipeline steps to run. All step(s) in all path(s) between two selected steps should be included.
     * </p>
     * 
     * @return A list of pipeline steps to run. All step(s) in all path(s) between two selected steps should be
     *         included.
     */

    public java.util.List<SelectedStep> getSelectedSteps() {
        return selectedSteps;
    }

    /**
     * <p>
     * A list of pipeline steps to run. All step(s) in all path(s) between two selected steps should be included.
     * </p>
     * 
     * @param selectedSteps
     *        A list of pipeline steps to run. All step(s) in all path(s) between two selected steps should be included.
     */

    public void setSelectedSteps(java.util.Collection<SelectedStep> selectedSteps) {
        if (selectedSteps == null) {
            this.selectedSteps = null;
            return;
        }

        this.selectedSteps = new java.util.ArrayList<SelectedStep>(selectedSteps);
    }

    /**
     * <p>
     * A list of pipeline steps to run. All step(s) in all path(s) between two selected steps should be included.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSelectedSteps(java.util.Collection)} or {@link #withSelectedSteps(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param selectedSteps
     *        A list of pipeline steps to run. All step(s) in all path(s) between two selected steps should be included.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SelectiveExecutionConfig withSelectedSteps(SelectedStep... selectedSteps) {
        if (this.selectedSteps == null) {
            setSelectedSteps(new java.util.ArrayList<SelectedStep>(selectedSteps.length));
        }
        for (SelectedStep ele : selectedSteps) {
            this.selectedSteps.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of pipeline steps to run. All step(s) in all path(s) between two selected steps should be included.
     * </p>
     * 
     * @param selectedSteps
     *        A list of pipeline steps to run. All step(s) in all path(s) between two selected steps should be included.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SelectiveExecutionConfig withSelectedSteps(java.util.Collection<SelectedStep> selectedSteps) {
        setSelectedSteps(selectedSteps);
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
        if (getSourcePipelineExecutionArn() != null)
            sb.append("SourcePipelineExecutionArn: ").append(getSourcePipelineExecutionArn()).append(",");
        if (getSelectedSteps() != null)
            sb.append("SelectedSteps: ").append(getSelectedSteps());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SelectiveExecutionConfig == false)
            return false;
        SelectiveExecutionConfig other = (SelectiveExecutionConfig) obj;
        if (other.getSourcePipelineExecutionArn() == null ^ this.getSourcePipelineExecutionArn() == null)
            return false;
        if (other.getSourcePipelineExecutionArn() != null && other.getSourcePipelineExecutionArn().equals(this.getSourcePipelineExecutionArn()) == false)
            return false;
        if (other.getSelectedSteps() == null ^ this.getSelectedSteps() == null)
            return false;
        if (other.getSelectedSteps() != null && other.getSelectedSteps().equals(this.getSelectedSteps()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSourcePipelineExecutionArn() == null) ? 0 : getSourcePipelineExecutionArn().hashCode());
        hashCode = prime * hashCode + ((getSelectedSteps() == null) ? 0 : getSelectedSteps().hashCode());
        return hashCode;
    }

    @Override
    public SelectiveExecutionConfig clone() {
        try {
            return (SelectiveExecutionConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.SelectiveExecutionConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
