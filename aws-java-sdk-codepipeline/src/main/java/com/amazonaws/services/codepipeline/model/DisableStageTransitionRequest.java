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
 * Represents the input of a DisableStageTransition action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/DisableStageTransition"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DisableStageTransitionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the pipeline in which you want to disable the flow of artifacts from one stage to another.
     * </p>
     */
    private String pipelineName;
    /**
     * <p>
     * The name of the stage where you want to disable the inbound or outbound transition of artifacts.
     * </p>
     */
    private String stageName;
    /**
     * <p>
     * Specifies whether artifacts will be prevented from transitioning into the stage and being processed by the
     * actions in that stage (inbound), or prevented from transitioning from the stage after they have been processed by
     * the actions in that stage (outbound).
     * </p>
     */
    private String transitionType;
    /**
     * <p>
     * The reason given to the user why a stage is disabled, such as waiting for manual approval or manual tests. This
     * message is displayed in the pipeline console UI.
     * </p>
     */
    private String reason;

    /**
     * <p>
     * The name of the pipeline in which you want to disable the flow of artifacts from one stage to another.
     * </p>
     * 
     * @param pipelineName
     *        The name of the pipeline in which you want to disable the flow of artifacts from one stage to another.
     */

    public void setPipelineName(String pipelineName) {
        this.pipelineName = pipelineName;
    }

    /**
     * <p>
     * The name of the pipeline in which you want to disable the flow of artifacts from one stage to another.
     * </p>
     * 
     * @return The name of the pipeline in which you want to disable the flow of artifacts from one stage to another.
     */

    public String getPipelineName() {
        return this.pipelineName;
    }

    /**
     * <p>
     * The name of the pipeline in which you want to disable the flow of artifacts from one stage to another.
     * </p>
     * 
     * @param pipelineName
     *        The name of the pipeline in which you want to disable the flow of artifacts from one stage to another.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisableStageTransitionRequest withPipelineName(String pipelineName) {
        setPipelineName(pipelineName);
        return this;
    }

    /**
     * <p>
     * The name of the stage where you want to disable the inbound or outbound transition of artifacts.
     * </p>
     * 
     * @param stageName
     *        The name of the stage where you want to disable the inbound or outbound transition of artifacts.
     */

    public void setStageName(String stageName) {
        this.stageName = stageName;
    }

    /**
     * <p>
     * The name of the stage where you want to disable the inbound or outbound transition of artifacts.
     * </p>
     * 
     * @return The name of the stage where you want to disable the inbound or outbound transition of artifacts.
     */

    public String getStageName() {
        return this.stageName;
    }

    /**
     * <p>
     * The name of the stage where you want to disable the inbound or outbound transition of artifacts.
     * </p>
     * 
     * @param stageName
     *        The name of the stage where you want to disable the inbound or outbound transition of artifacts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisableStageTransitionRequest withStageName(String stageName) {
        setStageName(stageName);
        return this;
    }

    /**
     * <p>
     * Specifies whether artifacts will be prevented from transitioning into the stage and being processed by the
     * actions in that stage (inbound), or prevented from transitioning from the stage after they have been processed by
     * the actions in that stage (outbound).
     * </p>
     * 
     * @param transitionType
     *        Specifies whether artifacts will be prevented from transitioning into the stage and being processed by the
     *        actions in that stage (inbound), or prevented from transitioning from the stage after they have been
     *        processed by the actions in that stage (outbound).
     * @see StageTransitionType
     */

    public void setTransitionType(String transitionType) {
        this.transitionType = transitionType;
    }

    /**
     * <p>
     * Specifies whether artifacts will be prevented from transitioning into the stage and being processed by the
     * actions in that stage (inbound), or prevented from transitioning from the stage after they have been processed by
     * the actions in that stage (outbound).
     * </p>
     * 
     * @return Specifies whether artifacts will be prevented from transitioning into the stage and being processed by
     *         the actions in that stage (inbound), or prevented from transitioning from the stage after they have been
     *         processed by the actions in that stage (outbound).
     * @see StageTransitionType
     */

    public String getTransitionType() {
        return this.transitionType;
    }

    /**
     * <p>
     * Specifies whether artifacts will be prevented from transitioning into the stage and being processed by the
     * actions in that stage (inbound), or prevented from transitioning from the stage after they have been processed by
     * the actions in that stage (outbound).
     * </p>
     * 
     * @param transitionType
     *        Specifies whether artifacts will be prevented from transitioning into the stage and being processed by the
     *        actions in that stage (inbound), or prevented from transitioning from the stage after they have been
     *        processed by the actions in that stage (outbound).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StageTransitionType
     */

    public DisableStageTransitionRequest withTransitionType(String transitionType) {
        setTransitionType(transitionType);
        return this;
    }

    /**
     * <p>
     * Specifies whether artifacts will be prevented from transitioning into the stage and being processed by the
     * actions in that stage (inbound), or prevented from transitioning from the stage after they have been processed by
     * the actions in that stage (outbound).
     * </p>
     * 
     * @param transitionType
     *        Specifies whether artifacts will be prevented from transitioning into the stage and being processed by the
     *        actions in that stage (inbound), or prevented from transitioning from the stage after they have been
     *        processed by the actions in that stage (outbound).
     * @see StageTransitionType
     */

    public void setTransitionType(StageTransitionType transitionType) {
        withTransitionType(transitionType);
    }

    /**
     * <p>
     * Specifies whether artifacts will be prevented from transitioning into the stage and being processed by the
     * actions in that stage (inbound), or prevented from transitioning from the stage after they have been processed by
     * the actions in that stage (outbound).
     * </p>
     * 
     * @param transitionType
     *        Specifies whether artifacts will be prevented from transitioning into the stage and being processed by the
     *        actions in that stage (inbound), or prevented from transitioning from the stage after they have been
     *        processed by the actions in that stage (outbound).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StageTransitionType
     */

    public DisableStageTransitionRequest withTransitionType(StageTransitionType transitionType) {
        this.transitionType = transitionType.toString();
        return this;
    }

    /**
     * <p>
     * The reason given to the user why a stage is disabled, such as waiting for manual approval or manual tests. This
     * message is displayed in the pipeline console UI.
     * </p>
     * 
     * @param reason
     *        The reason given to the user why a stage is disabled, such as waiting for manual approval or manual tests.
     *        This message is displayed in the pipeline console UI.
     */

    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * <p>
     * The reason given to the user why a stage is disabled, such as waiting for manual approval or manual tests. This
     * message is displayed in the pipeline console UI.
     * </p>
     * 
     * @return The reason given to the user why a stage is disabled, such as waiting for manual approval or manual
     *         tests. This message is displayed in the pipeline console UI.
     */

    public String getReason() {
        return this.reason;
    }

    /**
     * <p>
     * The reason given to the user why a stage is disabled, such as waiting for manual approval or manual tests. This
     * message is displayed in the pipeline console UI.
     * </p>
     * 
     * @param reason
     *        The reason given to the user why a stage is disabled, such as waiting for manual approval or manual tests.
     *        This message is displayed in the pipeline console UI.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisableStageTransitionRequest withReason(String reason) {
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
        if (getStageName() != null)
            sb.append("StageName: ").append(getStageName()).append(",");
        if (getTransitionType() != null)
            sb.append("TransitionType: ").append(getTransitionType()).append(",");
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

        if (obj instanceof DisableStageTransitionRequest == false)
            return false;
        DisableStageTransitionRequest other = (DisableStageTransitionRequest) obj;
        if (other.getPipelineName() == null ^ this.getPipelineName() == null)
            return false;
        if (other.getPipelineName() != null && other.getPipelineName().equals(this.getPipelineName()) == false)
            return false;
        if (other.getStageName() == null ^ this.getStageName() == null)
            return false;
        if (other.getStageName() != null && other.getStageName().equals(this.getStageName()) == false)
            return false;
        if (other.getTransitionType() == null ^ this.getTransitionType() == null)
            return false;
        if (other.getTransitionType() != null && other.getTransitionType().equals(this.getTransitionType()) == false)
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
        hashCode = prime * hashCode + ((getStageName() == null) ? 0 : getStageName().hashCode());
        hashCode = prime * hashCode + ((getTransitionType() == null) ? 0 : getTransitionType().hashCode());
        hashCode = prime * hashCode + ((getReason() == null) ? 0 : getReason().hashCode());
        return hashCode;
    }

    @Override
    public DisableStageTransitionRequest clone() {
        return (DisableStageTransitionRequest) super.clone();
    }

}
