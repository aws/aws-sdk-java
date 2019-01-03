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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input of a RetryStageExecution action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/RetryStageExecution" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RetryStageExecutionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the pipeline that contains the failed stage.
     * </p>
     */
    private String pipelineName;
    /**
     * <p>
     * The name of the failed stage to be retried.
     * </p>
     */
    private String stageName;
    /**
     * <p>
     * The ID of the pipeline execution in the failed stage to be retried. Use the <a>GetPipelineState</a> action to
     * retrieve the current pipelineExecutionId of the failed stage
     * </p>
     */
    private String pipelineExecutionId;
    /**
     * <p>
     * The scope of the retry attempt. Currently, the only supported value is FAILED_ACTIONS.
     * </p>
     */
    private String retryMode;

    /**
     * <p>
     * The name of the pipeline that contains the failed stage.
     * </p>
     * 
     * @param pipelineName
     *        The name of the pipeline that contains the failed stage.
     */

    public void setPipelineName(String pipelineName) {
        this.pipelineName = pipelineName;
    }

    /**
     * <p>
     * The name of the pipeline that contains the failed stage.
     * </p>
     * 
     * @return The name of the pipeline that contains the failed stage.
     */

    public String getPipelineName() {
        return this.pipelineName;
    }

    /**
     * <p>
     * The name of the pipeline that contains the failed stage.
     * </p>
     * 
     * @param pipelineName
     *        The name of the pipeline that contains the failed stage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RetryStageExecutionRequest withPipelineName(String pipelineName) {
        setPipelineName(pipelineName);
        return this;
    }

    /**
     * <p>
     * The name of the failed stage to be retried.
     * </p>
     * 
     * @param stageName
     *        The name of the failed stage to be retried.
     */

    public void setStageName(String stageName) {
        this.stageName = stageName;
    }

    /**
     * <p>
     * The name of the failed stage to be retried.
     * </p>
     * 
     * @return The name of the failed stage to be retried.
     */

    public String getStageName() {
        return this.stageName;
    }

    /**
     * <p>
     * The name of the failed stage to be retried.
     * </p>
     * 
     * @param stageName
     *        The name of the failed stage to be retried.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RetryStageExecutionRequest withStageName(String stageName) {
        setStageName(stageName);
        return this;
    }

    /**
     * <p>
     * The ID of the pipeline execution in the failed stage to be retried. Use the <a>GetPipelineState</a> action to
     * retrieve the current pipelineExecutionId of the failed stage
     * </p>
     * 
     * @param pipelineExecutionId
     *        The ID of the pipeline execution in the failed stage to be retried. Use the <a>GetPipelineState</a> action
     *        to retrieve the current pipelineExecutionId of the failed stage
     */

    public void setPipelineExecutionId(String pipelineExecutionId) {
        this.pipelineExecutionId = pipelineExecutionId;
    }

    /**
     * <p>
     * The ID of the pipeline execution in the failed stage to be retried. Use the <a>GetPipelineState</a> action to
     * retrieve the current pipelineExecutionId of the failed stage
     * </p>
     * 
     * @return The ID of the pipeline execution in the failed stage to be retried. Use the <a>GetPipelineState</a>
     *         action to retrieve the current pipelineExecutionId of the failed stage
     */

    public String getPipelineExecutionId() {
        return this.pipelineExecutionId;
    }

    /**
     * <p>
     * The ID of the pipeline execution in the failed stage to be retried. Use the <a>GetPipelineState</a> action to
     * retrieve the current pipelineExecutionId of the failed stage
     * </p>
     * 
     * @param pipelineExecutionId
     *        The ID of the pipeline execution in the failed stage to be retried. Use the <a>GetPipelineState</a> action
     *        to retrieve the current pipelineExecutionId of the failed stage
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RetryStageExecutionRequest withPipelineExecutionId(String pipelineExecutionId) {
        setPipelineExecutionId(pipelineExecutionId);
        return this;
    }

    /**
     * <p>
     * The scope of the retry attempt. Currently, the only supported value is FAILED_ACTIONS.
     * </p>
     * 
     * @param retryMode
     *        The scope of the retry attempt. Currently, the only supported value is FAILED_ACTIONS.
     * @see StageRetryMode
     */

    public void setRetryMode(String retryMode) {
        this.retryMode = retryMode;
    }

    /**
     * <p>
     * The scope of the retry attempt. Currently, the only supported value is FAILED_ACTIONS.
     * </p>
     * 
     * @return The scope of the retry attempt. Currently, the only supported value is FAILED_ACTIONS.
     * @see StageRetryMode
     */

    public String getRetryMode() {
        return this.retryMode;
    }

    /**
     * <p>
     * The scope of the retry attempt. Currently, the only supported value is FAILED_ACTIONS.
     * </p>
     * 
     * @param retryMode
     *        The scope of the retry attempt. Currently, the only supported value is FAILED_ACTIONS.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StageRetryMode
     */

    public RetryStageExecutionRequest withRetryMode(String retryMode) {
        setRetryMode(retryMode);
        return this;
    }

    /**
     * <p>
     * The scope of the retry attempt. Currently, the only supported value is FAILED_ACTIONS.
     * </p>
     * 
     * @param retryMode
     *        The scope of the retry attempt. Currently, the only supported value is FAILED_ACTIONS.
     * @see StageRetryMode
     */

    public void setRetryMode(StageRetryMode retryMode) {
        withRetryMode(retryMode);
    }

    /**
     * <p>
     * The scope of the retry attempt. Currently, the only supported value is FAILED_ACTIONS.
     * </p>
     * 
     * @param retryMode
     *        The scope of the retry attempt. Currently, the only supported value is FAILED_ACTIONS.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StageRetryMode
     */

    public RetryStageExecutionRequest withRetryMode(StageRetryMode retryMode) {
        this.retryMode = retryMode.toString();
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
        if (getPipelineName() != null)
            sb.append("PipelineName: ").append(getPipelineName()).append(",");
        if (getStageName() != null)
            sb.append("StageName: ").append(getStageName()).append(",");
        if (getPipelineExecutionId() != null)
            sb.append("PipelineExecutionId: ").append(getPipelineExecutionId()).append(",");
        if (getRetryMode() != null)
            sb.append("RetryMode: ").append(getRetryMode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RetryStageExecutionRequest == false)
            return false;
        RetryStageExecutionRequest other = (RetryStageExecutionRequest) obj;
        if (other.getPipelineName() == null ^ this.getPipelineName() == null)
            return false;
        if (other.getPipelineName() != null && other.getPipelineName().equals(this.getPipelineName()) == false)
            return false;
        if (other.getStageName() == null ^ this.getStageName() == null)
            return false;
        if (other.getStageName() != null && other.getStageName().equals(this.getStageName()) == false)
            return false;
        if (other.getPipelineExecutionId() == null ^ this.getPipelineExecutionId() == null)
            return false;
        if (other.getPipelineExecutionId() != null && other.getPipelineExecutionId().equals(this.getPipelineExecutionId()) == false)
            return false;
        if (other.getRetryMode() == null ^ this.getRetryMode() == null)
            return false;
        if (other.getRetryMode() != null && other.getRetryMode().equals(this.getRetryMode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPipelineName() == null) ? 0 : getPipelineName().hashCode());
        hashCode = prime * hashCode + ((getStageName() == null) ? 0 : getStageName().hashCode());
        hashCode = prime * hashCode + ((getPipelineExecutionId() == null) ? 0 : getPipelineExecutionId().hashCode());
        hashCode = prime * hashCode + ((getRetryMode() == null) ? 0 : getRetryMode().hashCode());
        return hashCode;
    }

    @Override
    public RetryStageExecutionRequest clone() {
        return (RetryStageExecutionRequest) super.clone();
    }

}
