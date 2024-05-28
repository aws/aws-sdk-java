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
package com.amazonaws.services.codepipeline.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Returns a summary of a pipeline.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/PipelineSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PipelineSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the pipeline.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The version number of the pipeline.
     * </p>
     */
    private Integer version;
    /**
     * <p>
     * CodePipeline provides the following pipeline types, which differ in characteristics and price, so that you can
     * tailor your pipeline features and cost to the needs of your applications.
     * </p>
     * <ul>
     * <li>
     * <p>
     * V1 type pipelines have a JSON structure that contains standard pipeline, stage, and action-level parameters.
     * </p>
     * </li>
     * <li>
     * <p>
     * V2 type pipelines have the same structure as a V1 type, along with additional parameters for release safety and
     * trigger configuration.
     * </p>
     * </li>
     * </ul>
     * <important>
     * <p>
     * Including V2 parameters, such as triggers on Git tags, in the pipeline JSON when creating or updating a pipeline
     * will result in the pipeline having the V2 type of pipeline and the associated costs.
     * </p>
     * </important>
     * <p>
     * For information about pricing for CodePipeline, see <a
     * href="http://aws.amazon.com/codepipeline/pricing/">Pricing</a>.
     * </p>
     * <p>
     * For information about which type of pipeline to choose, see <a
     * href="https://docs.aws.amazon.com/codepipeline/latest/userguide/pipeline-types-planning.html">What type of
     * pipeline is right for me?</a>.
     * </p>
     */
    private String pipelineType;
    /**
     * <p>
     * The method that the pipeline will use to handle multiple executions. The default mode is SUPERSEDED.
     * </p>
     */
    private String executionMode;
    /**
     * <p>
     * The date and time the pipeline was created, in timestamp format.
     * </p>
     */
    private java.util.Date created;
    /**
     * <p>
     * The date and time of the last update to the pipeline, in timestamp format.
     * </p>
     */
    private java.util.Date updated;

    /**
     * <p>
     * The name of the pipeline.
     * </p>
     * 
     * @param name
     *        The name of the pipeline.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the pipeline.
     * </p>
     * 
     * @return The name of the pipeline.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the pipeline.
     * </p>
     * 
     * @param name
     *        The name of the pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipelineSummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The version number of the pipeline.
     * </p>
     * 
     * @param version
     *        The version number of the pipeline.
     */

    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * <p>
     * The version number of the pipeline.
     * </p>
     * 
     * @return The version number of the pipeline.
     */

    public Integer getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The version number of the pipeline.
     * </p>
     * 
     * @param version
     *        The version number of the pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipelineSummary withVersion(Integer version) {
        setVersion(version);
        return this;
    }

    /**
     * <p>
     * CodePipeline provides the following pipeline types, which differ in characteristics and price, so that you can
     * tailor your pipeline features and cost to the needs of your applications.
     * </p>
     * <ul>
     * <li>
     * <p>
     * V1 type pipelines have a JSON structure that contains standard pipeline, stage, and action-level parameters.
     * </p>
     * </li>
     * <li>
     * <p>
     * V2 type pipelines have the same structure as a V1 type, along with additional parameters for release safety and
     * trigger configuration.
     * </p>
     * </li>
     * </ul>
     * <important>
     * <p>
     * Including V2 parameters, such as triggers on Git tags, in the pipeline JSON when creating or updating a pipeline
     * will result in the pipeline having the V2 type of pipeline and the associated costs.
     * </p>
     * </important>
     * <p>
     * For information about pricing for CodePipeline, see <a
     * href="http://aws.amazon.com/codepipeline/pricing/">Pricing</a>.
     * </p>
     * <p>
     * For information about which type of pipeline to choose, see <a
     * href="https://docs.aws.amazon.com/codepipeline/latest/userguide/pipeline-types-planning.html">What type of
     * pipeline is right for me?</a>.
     * </p>
     * 
     * @param pipelineType
     *        CodePipeline provides the following pipeline types, which differ in characteristics and price, so that you
     *        can tailor your pipeline features and cost to the needs of your applications.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        V1 type pipelines have a JSON structure that contains standard pipeline, stage, and action-level
     *        parameters.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        V2 type pipelines have the same structure as a V1 type, along with additional parameters for release
     *        safety and trigger configuration.
     *        </p>
     *        </li>
     *        </ul>
     *        <important>
     *        <p>
     *        Including V2 parameters, such as triggers on Git tags, in the pipeline JSON when creating or updating a
     *        pipeline will result in the pipeline having the V2 type of pipeline and the associated costs.
     *        </p>
     *        </important>
     *        <p>
     *        For information about pricing for CodePipeline, see <a
     *        href="http://aws.amazon.com/codepipeline/pricing/">Pricing</a>.
     *        </p>
     *        <p>
     *        For information about which type of pipeline to choose, see <a
     *        href="https://docs.aws.amazon.com/codepipeline/latest/userguide/pipeline-types-planning.html">What type of
     *        pipeline is right for me?</a>.
     * @see PipelineType
     */

    public void setPipelineType(String pipelineType) {
        this.pipelineType = pipelineType;
    }

    /**
     * <p>
     * CodePipeline provides the following pipeline types, which differ in characteristics and price, so that you can
     * tailor your pipeline features and cost to the needs of your applications.
     * </p>
     * <ul>
     * <li>
     * <p>
     * V1 type pipelines have a JSON structure that contains standard pipeline, stage, and action-level parameters.
     * </p>
     * </li>
     * <li>
     * <p>
     * V2 type pipelines have the same structure as a V1 type, along with additional parameters for release safety and
     * trigger configuration.
     * </p>
     * </li>
     * </ul>
     * <important>
     * <p>
     * Including V2 parameters, such as triggers on Git tags, in the pipeline JSON when creating or updating a pipeline
     * will result in the pipeline having the V2 type of pipeline and the associated costs.
     * </p>
     * </important>
     * <p>
     * For information about pricing for CodePipeline, see <a
     * href="http://aws.amazon.com/codepipeline/pricing/">Pricing</a>.
     * </p>
     * <p>
     * For information about which type of pipeline to choose, see <a
     * href="https://docs.aws.amazon.com/codepipeline/latest/userguide/pipeline-types-planning.html">What type of
     * pipeline is right for me?</a>.
     * </p>
     * 
     * @return CodePipeline provides the following pipeline types, which differ in characteristics and price, so that
     *         you can tailor your pipeline features and cost to the needs of your applications.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         V1 type pipelines have a JSON structure that contains standard pipeline, stage, and action-level
     *         parameters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         V2 type pipelines have the same structure as a V1 type, along with additional parameters for release
     *         safety and trigger configuration.
     *         </p>
     *         </li>
     *         </ul>
     *         <important>
     *         <p>
     *         Including V2 parameters, such as triggers on Git tags, in the pipeline JSON when creating or updating a
     *         pipeline will result in the pipeline having the V2 type of pipeline and the associated costs.
     *         </p>
     *         </important>
     *         <p>
     *         For information about pricing for CodePipeline, see <a
     *         href="http://aws.amazon.com/codepipeline/pricing/">Pricing</a>.
     *         </p>
     *         <p>
     *         For information about which type of pipeline to choose, see <a
     *         href="https://docs.aws.amazon.com/codepipeline/latest/userguide/pipeline-types-planning.html">What type
     *         of pipeline is right for me?</a>.
     * @see PipelineType
     */

    public String getPipelineType() {
        return this.pipelineType;
    }

    /**
     * <p>
     * CodePipeline provides the following pipeline types, which differ in characteristics and price, so that you can
     * tailor your pipeline features and cost to the needs of your applications.
     * </p>
     * <ul>
     * <li>
     * <p>
     * V1 type pipelines have a JSON structure that contains standard pipeline, stage, and action-level parameters.
     * </p>
     * </li>
     * <li>
     * <p>
     * V2 type pipelines have the same structure as a V1 type, along with additional parameters for release safety and
     * trigger configuration.
     * </p>
     * </li>
     * </ul>
     * <important>
     * <p>
     * Including V2 parameters, such as triggers on Git tags, in the pipeline JSON when creating or updating a pipeline
     * will result in the pipeline having the V2 type of pipeline and the associated costs.
     * </p>
     * </important>
     * <p>
     * For information about pricing for CodePipeline, see <a
     * href="http://aws.amazon.com/codepipeline/pricing/">Pricing</a>.
     * </p>
     * <p>
     * For information about which type of pipeline to choose, see <a
     * href="https://docs.aws.amazon.com/codepipeline/latest/userguide/pipeline-types-planning.html">What type of
     * pipeline is right for me?</a>.
     * </p>
     * 
     * @param pipelineType
     *        CodePipeline provides the following pipeline types, which differ in characteristics and price, so that you
     *        can tailor your pipeline features and cost to the needs of your applications.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        V1 type pipelines have a JSON structure that contains standard pipeline, stage, and action-level
     *        parameters.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        V2 type pipelines have the same structure as a V1 type, along with additional parameters for release
     *        safety and trigger configuration.
     *        </p>
     *        </li>
     *        </ul>
     *        <important>
     *        <p>
     *        Including V2 parameters, such as triggers on Git tags, in the pipeline JSON when creating or updating a
     *        pipeline will result in the pipeline having the V2 type of pipeline and the associated costs.
     *        </p>
     *        </important>
     *        <p>
     *        For information about pricing for CodePipeline, see <a
     *        href="http://aws.amazon.com/codepipeline/pricing/">Pricing</a>.
     *        </p>
     *        <p>
     *        For information about which type of pipeline to choose, see <a
     *        href="https://docs.aws.amazon.com/codepipeline/latest/userguide/pipeline-types-planning.html">What type of
     *        pipeline is right for me?</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PipelineType
     */

    public PipelineSummary withPipelineType(String pipelineType) {
        setPipelineType(pipelineType);
        return this;
    }

    /**
     * <p>
     * CodePipeline provides the following pipeline types, which differ in characteristics and price, so that you can
     * tailor your pipeline features and cost to the needs of your applications.
     * </p>
     * <ul>
     * <li>
     * <p>
     * V1 type pipelines have a JSON structure that contains standard pipeline, stage, and action-level parameters.
     * </p>
     * </li>
     * <li>
     * <p>
     * V2 type pipelines have the same structure as a V1 type, along with additional parameters for release safety and
     * trigger configuration.
     * </p>
     * </li>
     * </ul>
     * <important>
     * <p>
     * Including V2 parameters, such as triggers on Git tags, in the pipeline JSON when creating or updating a pipeline
     * will result in the pipeline having the V2 type of pipeline and the associated costs.
     * </p>
     * </important>
     * <p>
     * For information about pricing for CodePipeline, see <a
     * href="http://aws.amazon.com/codepipeline/pricing/">Pricing</a>.
     * </p>
     * <p>
     * For information about which type of pipeline to choose, see <a
     * href="https://docs.aws.amazon.com/codepipeline/latest/userguide/pipeline-types-planning.html">What type of
     * pipeline is right for me?</a>.
     * </p>
     * 
     * @param pipelineType
     *        CodePipeline provides the following pipeline types, which differ in characteristics and price, so that you
     *        can tailor your pipeline features and cost to the needs of your applications.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        V1 type pipelines have a JSON structure that contains standard pipeline, stage, and action-level
     *        parameters.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        V2 type pipelines have the same structure as a V1 type, along with additional parameters for release
     *        safety and trigger configuration.
     *        </p>
     *        </li>
     *        </ul>
     *        <important>
     *        <p>
     *        Including V2 parameters, such as triggers on Git tags, in the pipeline JSON when creating or updating a
     *        pipeline will result in the pipeline having the V2 type of pipeline and the associated costs.
     *        </p>
     *        </important>
     *        <p>
     *        For information about pricing for CodePipeline, see <a
     *        href="http://aws.amazon.com/codepipeline/pricing/">Pricing</a>.
     *        </p>
     *        <p>
     *        For information about which type of pipeline to choose, see <a
     *        href="https://docs.aws.amazon.com/codepipeline/latest/userguide/pipeline-types-planning.html">What type of
     *        pipeline is right for me?</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PipelineType
     */

    public PipelineSummary withPipelineType(PipelineType pipelineType) {
        this.pipelineType = pipelineType.toString();
        return this;
    }

    /**
     * <p>
     * The method that the pipeline will use to handle multiple executions. The default mode is SUPERSEDED.
     * </p>
     * 
     * @param executionMode
     *        The method that the pipeline will use to handle multiple executions. The default mode is SUPERSEDED.
     * @see ExecutionMode
     */

    public void setExecutionMode(String executionMode) {
        this.executionMode = executionMode;
    }

    /**
     * <p>
     * The method that the pipeline will use to handle multiple executions. The default mode is SUPERSEDED.
     * </p>
     * 
     * @return The method that the pipeline will use to handle multiple executions. The default mode is SUPERSEDED.
     * @see ExecutionMode
     */

    public String getExecutionMode() {
        return this.executionMode;
    }

    /**
     * <p>
     * The method that the pipeline will use to handle multiple executions. The default mode is SUPERSEDED.
     * </p>
     * 
     * @param executionMode
     *        The method that the pipeline will use to handle multiple executions. The default mode is SUPERSEDED.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExecutionMode
     */

    public PipelineSummary withExecutionMode(String executionMode) {
        setExecutionMode(executionMode);
        return this;
    }

    /**
     * <p>
     * The method that the pipeline will use to handle multiple executions. The default mode is SUPERSEDED.
     * </p>
     * 
     * @param executionMode
     *        The method that the pipeline will use to handle multiple executions. The default mode is SUPERSEDED.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExecutionMode
     */

    public PipelineSummary withExecutionMode(ExecutionMode executionMode) {
        this.executionMode = executionMode.toString();
        return this;
    }

    /**
     * <p>
     * The date and time the pipeline was created, in timestamp format.
     * </p>
     * 
     * @param created
     *        The date and time the pipeline was created, in timestamp format.
     */

    public void setCreated(java.util.Date created) {
        this.created = created;
    }

    /**
     * <p>
     * The date and time the pipeline was created, in timestamp format.
     * </p>
     * 
     * @return The date and time the pipeline was created, in timestamp format.
     */

    public java.util.Date getCreated() {
        return this.created;
    }

    /**
     * <p>
     * The date and time the pipeline was created, in timestamp format.
     * </p>
     * 
     * @param created
     *        The date and time the pipeline was created, in timestamp format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipelineSummary withCreated(java.util.Date created) {
        setCreated(created);
        return this;
    }

    /**
     * <p>
     * The date and time of the last update to the pipeline, in timestamp format.
     * </p>
     * 
     * @param updated
     *        The date and time of the last update to the pipeline, in timestamp format.
     */

    public void setUpdated(java.util.Date updated) {
        this.updated = updated;
    }

    /**
     * <p>
     * The date and time of the last update to the pipeline, in timestamp format.
     * </p>
     * 
     * @return The date and time of the last update to the pipeline, in timestamp format.
     */

    public java.util.Date getUpdated() {
        return this.updated;
    }

    /**
     * <p>
     * The date and time of the last update to the pipeline, in timestamp format.
     * </p>
     * 
     * @param updated
     *        The date and time of the last update to the pipeline, in timestamp format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipelineSummary withUpdated(java.util.Date updated) {
        setUpdated(updated);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion()).append(",");
        if (getPipelineType() != null)
            sb.append("PipelineType: ").append(getPipelineType()).append(",");
        if (getExecutionMode() != null)
            sb.append("ExecutionMode: ").append(getExecutionMode()).append(",");
        if (getCreated() != null)
            sb.append("Created: ").append(getCreated()).append(",");
        if (getUpdated() != null)
            sb.append("Updated: ").append(getUpdated());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PipelineSummary == false)
            return false;
        PipelineSummary other = (PipelineSummary) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getPipelineType() == null ^ this.getPipelineType() == null)
            return false;
        if (other.getPipelineType() != null && other.getPipelineType().equals(this.getPipelineType()) == false)
            return false;
        if (other.getExecutionMode() == null ^ this.getExecutionMode() == null)
            return false;
        if (other.getExecutionMode() != null && other.getExecutionMode().equals(this.getExecutionMode()) == false)
            return false;
        if (other.getCreated() == null ^ this.getCreated() == null)
            return false;
        if (other.getCreated() != null && other.getCreated().equals(this.getCreated()) == false)
            return false;
        if (other.getUpdated() == null ^ this.getUpdated() == null)
            return false;
        if (other.getUpdated() != null && other.getUpdated().equals(this.getUpdated()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getPipelineType() == null) ? 0 : getPipelineType().hashCode());
        hashCode = prime * hashCode + ((getExecutionMode() == null) ? 0 : getExecutionMode().hashCode());
        hashCode = prime * hashCode + ((getCreated() == null) ? 0 : getCreated().hashCode());
        hashCode = prime * hashCode + ((getUpdated() == null) ? 0 : getUpdated().hashCode());
        return hashCode;
    }

    @Override
    public PipelineSummary clone() {
        try {
            return (PipelineSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codepipeline.model.transform.PipelineSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
