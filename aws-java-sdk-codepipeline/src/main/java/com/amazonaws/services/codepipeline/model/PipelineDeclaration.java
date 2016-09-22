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
 * Represents the structure of actions and stages to be performed in the pipeline.
 * </p>
 */
public class PipelineDeclaration implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the action to be performed.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The Amazon Resource Name (ARN) for AWS CodePipeline to use to either perform actions with no actionRoleArn, or to
     * use to assume roles for actions with an actionRoleArn.
     * </p>
     */
    private String roleArn;

    private ArtifactStore artifactStore;
    /**
     * <p>
     * The stage in which to perform the action.
     * </p>
     */
    private java.util.List<StageDeclaration> stages;
    /**
     * <p>
     * The version number of the pipeline. A new pipeline always has a version number of 1. This number is automatically
     * incremented when a pipeline is updated.
     * </p>
     */
    private Integer version;

    /**
     * <p>
     * The name of the action to be performed.
     * </p>
     * 
     * @param name
     *        The name of the action to be performed.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the action to be performed.
     * </p>
     * 
     * @return The name of the action to be performed.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the action to be performed.
     * </p>
     * 
     * @param name
     *        The name of the action to be performed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipelineDeclaration withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for AWS CodePipeline to use to either perform actions with no actionRoleArn, or to
     * use to assume roles for actions with an actionRoleArn.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) for AWS CodePipeline to use to either perform actions with no
     *        actionRoleArn, or to use to assume roles for actions with an actionRoleArn.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for AWS CodePipeline to use to either perform actions with no actionRoleArn, or to
     * use to assume roles for actions with an actionRoleArn.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for AWS CodePipeline to use to either perform actions with no
     *         actionRoleArn, or to use to assume roles for actions with an actionRoleArn.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for AWS CodePipeline to use to either perform actions with no actionRoleArn, or to
     * use to assume roles for actions with an actionRoleArn.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) for AWS CodePipeline to use to either perform actions with no
     *        actionRoleArn, or to use to assume roles for actions with an actionRoleArn.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipelineDeclaration withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * @param artifactStore
     */

    public void setArtifactStore(ArtifactStore artifactStore) {
        this.artifactStore = artifactStore;
    }

    /**
     * @return
     */

    public ArtifactStore getArtifactStore() {
        return this.artifactStore;
    }

    /**
     * @param artifactStore
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipelineDeclaration withArtifactStore(ArtifactStore artifactStore) {
        setArtifactStore(artifactStore);
        return this;
    }

    /**
     * <p>
     * The stage in which to perform the action.
     * </p>
     * 
     * @return The stage in which to perform the action.
     */

    public java.util.List<StageDeclaration> getStages() {
        return stages;
    }

    /**
     * <p>
     * The stage in which to perform the action.
     * </p>
     * 
     * @param stages
     *        The stage in which to perform the action.
     */

    public void setStages(java.util.Collection<StageDeclaration> stages) {
        if (stages == null) {
            this.stages = null;
            return;
        }

        this.stages = new java.util.ArrayList<StageDeclaration>(stages);
    }

    /**
     * <p>
     * The stage in which to perform the action.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStages(java.util.Collection)} or {@link #withStages(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param stages
     *        The stage in which to perform the action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipelineDeclaration withStages(StageDeclaration... stages) {
        if (this.stages == null) {
            setStages(new java.util.ArrayList<StageDeclaration>(stages.length));
        }
        for (StageDeclaration ele : stages) {
            this.stages.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The stage in which to perform the action.
     * </p>
     * 
     * @param stages
     *        The stage in which to perform the action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipelineDeclaration withStages(java.util.Collection<StageDeclaration> stages) {
        setStages(stages);
        return this;
    }

    /**
     * <p>
     * The version number of the pipeline. A new pipeline always has a version number of 1. This number is automatically
     * incremented when a pipeline is updated.
     * </p>
     * 
     * @param version
     *        The version number of the pipeline. A new pipeline always has a version number of 1. This number is
     *        automatically incremented when a pipeline is updated.
     */

    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * <p>
     * The version number of the pipeline. A new pipeline always has a version number of 1. This number is automatically
     * incremented when a pipeline is updated.
     * </p>
     * 
     * @return The version number of the pipeline. A new pipeline always has a version number of 1. This number is
     *         automatically incremented when a pipeline is updated.
     */

    public Integer getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The version number of the pipeline. A new pipeline always has a version number of 1. This number is automatically
     * incremented when a pipeline is updated.
     * </p>
     * 
     * @param version
     *        The version number of the pipeline. A new pipeline always has a version number of 1. This number is
     *        automatically incremented when a pipeline is updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipelineDeclaration withVersion(Integer version) {
        setVersion(version);
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
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getRoleArn() != null)
            sb.append("RoleArn: " + getRoleArn() + ",");
        if (getArtifactStore() != null)
            sb.append("ArtifactStore: " + getArtifactStore() + ",");
        if (getStages() != null)
            sb.append("Stages: " + getStages() + ",");
        if (getVersion() != null)
            sb.append("Version: " + getVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PipelineDeclaration == false)
            return false;
        PipelineDeclaration other = (PipelineDeclaration) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getArtifactStore() == null ^ this.getArtifactStore() == null)
            return false;
        if (other.getArtifactStore() != null && other.getArtifactStore().equals(this.getArtifactStore()) == false)
            return false;
        if (other.getStages() == null ^ this.getStages() == null)
            return false;
        if (other.getStages() != null && other.getStages().equals(this.getStages()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getArtifactStore() == null) ? 0 : getArtifactStore().hashCode());
        hashCode = prime * hashCode + ((getStages() == null) ? 0 : getStages().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        return hashCode;
    }

    @Override
    public PipelineDeclaration clone() {
        try {
            return (PipelineDeclaration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
