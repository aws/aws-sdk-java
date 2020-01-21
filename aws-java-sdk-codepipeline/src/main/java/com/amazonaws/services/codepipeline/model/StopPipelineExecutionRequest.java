/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/StopPipelineExecution" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StopPipelineExecutionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the pipeline to stop.
     * </p>
     */
    private String pipelineName;
    /**
     * <p>
     * The ID of the pipeline execution to be stopped in the current stage. Use the <code>GetPipelineState</code> action
     * to retrieve the current pipelineExecutionId.
     * </p>
     */
    private String pipelineExecutionId;
    /**
     * <p>
     * Use this option to stop the pipeline execution by abandoning, rather than finishing, in-progress actions.
     * </p>
     * <note>
     * <p>
     * This option can lead to failed or out-of-sequence tasks.
     * </p>
     * </note>
     */
    private Boolean abandon;
    /**
     * <p>
     * Use this option to enter comments, such as the reason the pipeline was stopped.
     * </p>
     */
    private String reason;

    /**
     * <p>
     * The name of the pipeline to stop.
     * </p>
     * 
     * @param pipelineName
     *        The name of the pipeline to stop.
     */

    public void setPipelineName(String pipelineName) {
        this.pipelineName = pipelineName;
    }

    /**
     * <p>
     * The name of the pipeline to stop.
     * </p>
     * 
     * @return The name of the pipeline to stop.
     */

    public String getPipelineName() {
        return this.pipelineName;
    }

    /**
     * <p>
     * The name of the pipeline to stop.
     * </p>
     * 
     * @param pipelineName
     *        The name of the pipeline to stop.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopPipelineExecutionRequest withPipelineName(String pipelineName) {
        setPipelineName(pipelineName);
        return this;
    }

    /**
     * <p>
     * The ID of the pipeline execution to be stopped in the current stage. Use the <code>GetPipelineState</code> action
     * to retrieve the current pipelineExecutionId.
     * </p>
     * 
     * @param pipelineExecutionId
     *        The ID of the pipeline execution to be stopped in the current stage. Use the <code>GetPipelineState</code>
     *        action to retrieve the current pipelineExecutionId.
     */

    public void setPipelineExecutionId(String pipelineExecutionId) {
        this.pipelineExecutionId = pipelineExecutionId;
    }

    /**
     * <p>
     * The ID of the pipeline execution to be stopped in the current stage. Use the <code>GetPipelineState</code> action
     * to retrieve the current pipelineExecutionId.
     * </p>
     * 
     * @return The ID of the pipeline execution to be stopped in the current stage. Use the
     *         <code>GetPipelineState</code> action to retrieve the current pipelineExecutionId.
     */

    public String getPipelineExecutionId() {
        return this.pipelineExecutionId;
    }

    /**
     * <p>
     * The ID of the pipeline execution to be stopped in the current stage. Use the <code>GetPipelineState</code> action
     * to retrieve the current pipelineExecutionId.
     * </p>
     * 
     * @param pipelineExecutionId
     *        The ID of the pipeline execution to be stopped in the current stage. Use the <code>GetPipelineState</code>
     *        action to retrieve the current pipelineExecutionId.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopPipelineExecutionRequest withPipelineExecutionId(String pipelineExecutionId) {
        setPipelineExecutionId(pipelineExecutionId);
        return this;
    }

    /**
     * <p>
     * Use this option to stop the pipeline execution by abandoning, rather than finishing, in-progress actions.
     * </p>
     * <note>
     * <p>
     * This option can lead to failed or out-of-sequence tasks.
     * </p>
     * </note>
     * 
     * @param abandon
     *        Use this option to stop the pipeline execution by abandoning, rather than finishing, in-progress
     *        actions.</p> <note>
     *        <p>
     *        This option can lead to failed or out-of-sequence tasks.
     *        </p>
     */

    public void setAbandon(Boolean abandon) {
        this.abandon = abandon;
    }

    /**
     * <p>
     * Use this option to stop the pipeline execution by abandoning, rather than finishing, in-progress actions.
     * </p>
     * <note>
     * <p>
     * This option can lead to failed or out-of-sequence tasks.
     * </p>
     * </note>
     * 
     * @return Use this option to stop the pipeline execution by abandoning, rather than finishing, in-progress
     *         actions.</p> <note>
     *         <p>
     *         This option can lead to failed or out-of-sequence tasks.
     *         </p>
     */

    public Boolean getAbandon() {
        return this.abandon;
    }

    /**
     * <p>
     * Use this option to stop the pipeline execution by abandoning, rather than finishing, in-progress actions.
     * </p>
     * <note>
     * <p>
     * This option can lead to failed or out-of-sequence tasks.
     * </p>
     * </note>
     * 
     * @param abandon
     *        Use this option to stop the pipeline execution by abandoning, rather than finishing, in-progress
     *        actions.</p> <note>
     *        <p>
     *        This option can lead to failed or out-of-sequence tasks.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopPipelineExecutionRequest withAbandon(Boolean abandon) {
        setAbandon(abandon);
        return this;
    }

    /**
     * <p>
     * Use this option to stop the pipeline execution by abandoning, rather than finishing, in-progress actions.
     * </p>
     * <note>
     * <p>
     * This option can lead to failed or out-of-sequence tasks.
     * </p>
     * </note>
     * 
     * @return Use this option to stop the pipeline execution by abandoning, rather than finishing, in-progress
     *         actions.</p> <note>
     *         <p>
     *         This option can lead to failed or out-of-sequence tasks.
     *         </p>
     */

    public Boolean isAbandon() {
        return this.abandon;
    }

    /**
     * <p>
     * Use this option to enter comments, such as the reason the pipeline was stopped.
     * </p>
     * 
     * @param reason
     *        Use this option to enter comments, such as the reason the pipeline was stopped.
     */

    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * <p>
     * Use this option to enter comments, such as the reason the pipeline was stopped.
     * </p>
     * 
     * @return Use this option to enter comments, such as the reason the pipeline was stopped.
     */

    public String getReason() {
        return this.reason;
    }

    /**
     * <p>
     * Use this option to enter comments, such as the reason the pipeline was stopped.
     * </p>
     * 
     * @param reason
     *        Use this option to enter comments, such as the reason the pipeline was stopped.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopPipelineExecutionRequest withReason(String reason) {
        setReason(reason);
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
        if (getPipelineExecutionId() != null)
            sb.append("PipelineExecutionId: ").append(getPipelineExecutionId()).append(",");
        if (getAbandon() != null)
            sb.append("Abandon: ").append(getAbandon()).append(",");
        if (getReason() != null)
            sb.append("Reason: ").append(getReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StopPipelineExecutionRequest == false)
            return false;
        StopPipelineExecutionRequest other = (StopPipelineExecutionRequest) obj;
        if (other.getPipelineName() == null ^ this.getPipelineName() == null)
            return false;
        if (other.getPipelineName() != null && other.getPipelineName().equals(this.getPipelineName()) == false)
            return false;
        if (other.getPipelineExecutionId() == null ^ this.getPipelineExecutionId() == null)
            return false;
        if (other.getPipelineExecutionId() != null && other.getPipelineExecutionId().equals(this.getPipelineExecutionId()) == false)
            return false;
        if (other.getAbandon() == null ^ this.getAbandon() == null)
            return false;
        if (other.getAbandon() != null && other.getAbandon().equals(this.getAbandon()) == false)
            return false;
        if (other.getReason() == null ^ this.getReason() == null)
            return false;
        if (other.getReason() != null && other.getReason().equals(this.getReason()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPipelineName() == null) ? 0 : getPipelineName().hashCode());
        hashCode = prime * hashCode + ((getPipelineExecutionId() == null) ? 0 : getPipelineExecutionId().hashCode());
        hashCode = prime * hashCode + ((getAbandon() == null) ? 0 : getAbandon().hashCode());
        hashCode = prime * hashCode + ((getReason() == null) ? 0 : getReason().hashCode());
        return hashCode;
    }

    @Override
    public StopPipelineExecutionRequest clone() {
        return (StopPipelineExecutionRequest) super.clone();
    }

}
