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
 * Represents the input of a PutActionRevision action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/PutActionRevision" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutActionRevisionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the pipeline that will start processing the revision to the source.
     * </p>
     */
    private String pipelineName;
    /**
     * <p>
     * The name of the stage that contains the action that will act upon the revision.
     * </p>
     */
    private String stageName;
    /**
     * <p>
     * The name of the action that will process the revision.
     * </p>
     */
    private String actionName;
    /**
     * <p>
     * Represents information about the version (or revision) of an action.
     * </p>
     */
    private ActionRevision actionRevision;

    /**
     * <p>
     * The name of the pipeline that will start processing the revision to the source.
     * </p>
     * 
     * @param pipelineName
     *        The name of the pipeline that will start processing the revision to the source.
     */

    public void setPipelineName(String pipelineName) {
        this.pipelineName = pipelineName;
    }

    /**
     * <p>
     * The name of the pipeline that will start processing the revision to the source.
     * </p>
     * 
     * @return The name of the pipeline that will start processing the revision to the source.
     */

    public String getPipelineName() {
        return this.pipelineName;
    }

    /**
     * <p>
     * The name of the pipeline that will start processing the revision to the source.
     * </p>
     * 
     * @param pipelineName
     *        The name of the pipeline that will start processing the revision to the source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutActionRevisionRequest withPipelineName(String pipelineName) {
        setPipelineName(pipelineName);
        return this;
    }

    /**
     * <p>
     * The name of the stage that contains the action that will act upon the revision.
     * </p>
     * 
     * @param stageName
     *        The name of the stage that contains the action that will act upon the revision.
     */

    public void setStageName(String stageName) {
        this.stageName = stageName;
    }

    /**
     * <p>
     * The name of the stage that contains the action that will act upon the revision.
     * </p>
     * 
     * @return The name of the stage that contains the action that will act upon the revision.
     */

    public String getStageName() {
        return this.stageName;
    }

    /**
     * <p>
     * The name of the stage that contains the action that will act upon the revision.
     * </p>
     * 
     * @param stageName
     *        The name of the stage that contains the action that will act upon the revision.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutActionRevisionRequest withStageName(String stageName) {
        setStageName(stageName);
        return this;
    }

    /**
     * <p>
     * The name of the action that will process the revision.
     * </p>
     * 
     * @param actionName
     *        The name of the action that will process the revision.
     */

    public void setActionName(String actionName) {
        this.actionName = actionName;
    }

    /**
     * <p>
     * The name of the action that will process the revision.
     * </p>
     * 
     * @return The name of the action that will process the revision.
     */

    public String getActionName() {
        return this.actionName;
    }

    /**
     * <p>
     * The name of the action that will process the revision.
     * </p>
     * 
     * @param actionName
     *        The name of the action that will process the revision.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutActionRevisionRequest withActionName(String actionName) {
        setActionName(actionName);
        return this;
    }

    /**
     * <p>
     * Represents information about the version (or revision) of an action.
     * </p>
     * 
     * @param actionRevision
     *        Represents information about the version (or revision) of an action.
     */

    public void setActionRevision(ActionRevision actionRevision) {
        this.actionRevision = actionRevision;
    }

    /**
     * <p>
     * Represents information about the version (or revision) of an action.
     * </p>
     * 
     * @return Represents information about the version (or revision) of an action.
     */

    public ActionRevision getActionRevision() {
        return this.actionRevision;
    }

    /**
     * <p>
     * Represents information about the version (or revision) of an action.
     * </p>
     * 
     * @param actionRevision
     *        Represents information about the version (or revision) of an action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutActionRevisionRequest withActionRevision(ActionRevision actionRevision) {
        setActionRevision(actionRevision);
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
        if (getActionName() != null)
            sb.append("ActionName: ").append(getActionName()).append(",");
        if (getActionRevision() != null)
            sb.append("ActionRevision: ").append(getActionRevision());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutActionRevisionRequest == false)
            return false;
        PutActionRevisionRequest other = (PutActionRevisionRequest) obj;
        if (other.getPipelineName() == null ^ this.getPipelineName() == null)
            return false;
        if (other.getPipelineName() != null && other.getPipelineName().equals(this.getPipelineName()) == false)
            return false;
        if (other.getStageName() == null ^ this.getStageName() == null)
            return false;
        if (other.getStageName() != null && other.getStageName().equals(this.getStageName()) == false)
            return false;
        if (other.getActionName() == null ^ this.getActionName() == null)
            return false;
        if (other.getActionName() != null && other.getActionName().equals(this.getActionName()) == false)
            return false;
        if (other.getActionRevision() == null ^ this.getActionRevision() == null)
            return false;
        if (other.getActionRevision() != null && other.getActionRevision().equals(this.getActionRevision()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPipelineName() == null) ? 0 : getPipelineName().hashCode());
        hashCode = prime * hashCode + ((getStageName() == null) ? 0 : getStageName().hashCode());
        hashCode = prime * hashCode + ((getActionName() == null) ? 0 : getActionName().hashCode());
        hashCode = prime * hashCode + ((getActionRevision() == null) ? 0 : getActionRevision().hashCode());
        return hashCode;
    }

    @Override
    public PutActionRevisionRequest clone() {
        return (PutActionRevisionRequest) super.clone();
    }

}
