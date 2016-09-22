/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Represents information about a pipeline to a job worker.
 * </p>
 */
public class PipelineContext implements Serializable, Cloneable {

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
     * @param action
     */

    public void setAction(ActionContext action) {
        this.action = action;
    }

    /**
     * @return
     */

    public ActionContext getAction() {
        return this.action;
    }

    /**
     * @param action
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipelineContext withAction(ActionContext action) {
        setAction(action);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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
            sb.append("PipelineName: " + getPipelineName() + ",");
        if (getStage() != null)
            sb.append("Stage: " + getStage() + ",");
        if (getAction() != null)
            sb.append("Action: " + getAction());
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
}
