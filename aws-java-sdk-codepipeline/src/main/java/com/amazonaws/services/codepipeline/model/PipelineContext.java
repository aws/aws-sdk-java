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
 * Represents information about a pipeline to a job worker.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/PipelineContext" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PipelineContext implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the pipeline. This is a user-specified value. Pipeline names must be unique across all pipeline names
     * under an Amazon Web Services account.
     * </p>
     */
    private String pipelineName;
    /**
     * <p>
     * The stage of the pipeline.
     * </p>
     */
    private StageContext stage;
    /**
     * <p>
     * The context of an action to a job worker within the stage of a pipeline.
     * </p>
     */
    private ActionContext action;

    /**
     * <p>
     * The name of the pipeline. This is a user-specified value. Pipeline names must be unique across all pipeline names
     * under an Amazon Web Services account.
     * </p>
     * 
     * @param pipelineName
     *        The name of the pipeline. This is a user-specified value. Pipeline names must be unique across all
     *        pipeline names under an Amazon Web Services account.
     */

    public void setPipelineName(String pipelineName) {
        this.pipelineName = pipelineName;
    }

    /**
     * <p>
     * The name of the pipeline. This is a user-specified value. Pipeline names must be unique across all pipeline names
     * under an Amazon Web Services account.
     * </p>
     * 
     * @return The name of the pipeline. This is a user-specified value. Pipeline names must be unique across all
     *         pipeline names under an Amazon Web Services account.
     */

    public String getPipelineName() {
        return this.pipelineName;
    }

    /**
     * <p>
     * The name of the pipeline. This is a user-specified value. Pipeline names must be unique across all pipeline names
     * under an Amazon Web Services account.
     * </p>
     * 
     * @param pipelineName
     *        The name of the pipeline. This is a user-specified value. Pipeline names must be unique across all
     *        pipeline names under an Amazon Web Services account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipelineContext withPipelineName(String pipelineName) {
        setPipelineName(pipelineName);
        return this;
    }

    /**
     * <p>
     * The stage of the pipeline.
     * </p>
     * 
     * @param stage
     *        The stage of the pipeline.
     */

    public void setStage(StageContext stage) {
        this.stage = stage;
    }

    /**
     * <p>
     * The stage of the pipeline.
     * </p>
     * 
     * @return The stage of the pipeline.
     */

    public StageContext getStage() {
        return this.stage;
    }

    /**
     * <p>
     * The stage of the pipeline.
     * </p>
     * 
     * @param stage
     *        The stage of the pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipelineContext withStage(StageContext stage) {
        setStage(stage);
        return this;
    }

    /**
     * <p>
     * The context of an action to a job worker within the stage of a pipeline.
     * </p>
     * 
     * @param action
     *        The context of an action to a job worker within the stage of a pipeline.
     */

    public void setAction(ActionContext action) {
        this.action = action;
    }

    /**
     * <p>
     * The context of an action to a job worker within the stage of a pipeline.
     * </p>
     * 
     * @return The context of an action to a job worker within the stage of a pipeline.
     */

    public ActionContext getAction() {
        return this.action;
    }

    /**
     * <p>
     * The context of an action to a job worker within the stage of a pipeline.
     * </p>
     * 
     * @param action
     *        The context of an action to a job worker within the stage of a pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipelineContext withAction(ActionContext action) {
        setAction(action);
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
        if (getStage() != null)
            sb.append("Stage: ").append(getStage()).append(",");
        if (getAction() != null)
            sb.append("Action: ").append(getAction());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PipelineContext == false)
            return false;
        PipelineContext other = (PipelineContext) obj;
        if (other.getPipelineName() == null ^ this.getPipelineName() == null)
            return false;
        if (other.getPipelineName() != null && other.getPipelineName().equals(this.getPipelineName()) == false)
            return false;
        if (other.getStage() == null ^ this.getStage() == null)
            return false;
        if (other.getStage() != null && other.getStage().equals(this.getStage()) == false)
            return false;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPipelineName() == null) ? 0 : getPipelineName().hashCode());
        hashCode = prime * hashCode + ((getStage() == null) ? 0 : getStage().hashCode());
        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        return hashCode;
    }

    @Override
    public PipelineContext clone() {
        try {
            return (PipelineContext) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codepipeline.model.transform.PipelineContextMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
