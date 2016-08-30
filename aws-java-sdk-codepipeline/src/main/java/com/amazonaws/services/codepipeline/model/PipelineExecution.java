/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not
 * use this file except in compliance with the License. A copy of the License is
 * located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.codepipeline.model;

import java.io.Serializable;

/**
 * <p>
 * Represents information about an execution of a pipeline.
 * </p>
 */
public class PipelineExecution implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the pipeline that was executed.
     * </p>
     */
    private String pipelineName;
    /**
     * <p>
     * The version number of the pipeline that was executed.
     * </p>
     */
    private Integer pipelineVersion;
    /**
     * <p>
     * The ID of the pipeline execution.
     * </p>
     */
    private String pipelineExecutionId;
    /**
     * <p>
     * The status of the pipeline execution.
     * </p>
     * <ul>
     * <li>
     * <p>
     * InProgress: The pipeline execution is currently running.
     * </p>
     * </li>
     * <li>
     * <p>
     * Succeeded: The pipeline execution completed successfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * Superseded: While this pipeline execution was waiting for the next stage
     * to be completed, a newer pipeline execution caught up and continued
     * through the pipeline instead.
     * </p>
     * </li>
     * <li>
     * <p>
     * Failed: The pipeline did not complete successfully.
     * </p>
     * </li>
     * </ul>
     */
    private String status;
    /**
     * <p>
     * A list of ArtifactRevisionInformation objects included in a pipeline
     * execution.
     * </p>
     */
    private java.util.List<ArtifactRevisionInformation> artifactRevisionInformations;

    /**
     * <p>
     * The name of the pipeline that was executed.
     * </p>
     * 
     * @param pipelineName
     *        The name of the pipeline that was executed.
     */

    public void setPipelineName(String pipelineName) {
        this.pipelineName = pipelineName;
    }

    /**
     * <p>
     * The name of the pipeline that was executed.
     * </p>
     * 
     * @return The name of the pipeline that was executed.
     */

    public String getPipelineName() {
        return this.pipelineName;
    }

    /**
     * <p>
     * The name of the pipeline that was executed.
     * </p>
     * 
     * @param pipelineName
     *        The name of the pipeline that was executed.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public PipelineExecution withPipelineName(String pipelineName) {
        setPipelineName(pipelineName);
        return this;
    }

    /**
     * <p>
     * The version number of the pipeline that was executed.
     * </p>
     * 
     * @param pipelineVersion
     *        The version number of the pipeline that was executed.
     */

    public void setPipelineVersion(Integer pipelineVersion) {
        this.pipelineVersion = pipelineVersion;
    }

    /**
     * <p>
     * The version number of the pipeline that was executed.
     * </p>
     * 
     * @return The version number of the pipeline that was executed.
     */

    public Integer getPipelineVersion() {
        return this.pipelineVersion;
    }

    /**
     * <p>
     * The version number of the pipeline that was executed.
     * </p>
     * 
     * @param pipelineVersion
     *        The version number of the pipeline that was executed.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public PipelineExecution withPipelineVersion(Integer pipelineVersion) {
        setPipelineVersion(pipelineVersion);
        return this;
    }

    /**
     * <p>
     * The ID of the pipeline execution.
     * </p>
     * 
     * @param pipelineExecutionId
     *        The ID of the pipeline execution.
     */

    public void setPipelineExecutionId(String pipelineExecutionId) {
        this.pipelineExecutionId = pipelineExecutionId;
    }

    /**
     * <p>
     * The ID of the pipeline execution.
     * </p>
     * 
     * @return The ID of the pipeline execution.
     */

    public String getPipelineExecutionId() {
        return this.pipelineExecutionId;
    }

    /**
     * <p>
     * The ID of the pipeline execution.
     * </p>
     * 
     * @param pipelineExecutionId
     *        The ID of the pipeline execution.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public PipelineExecution withPipelineExecutionId(String pipelineExecutionId) {
        setPipelineExecutionId(pipelineExecutionId);
        return this;
    }

    /**
     * <p>
     * The status of the pipeline execution.
     * </p>
     * <ul>
     * <li>
     * <p>
     * InProgress: The pipeline execution is currently running.
     * </p>
     * </li>
     * <li>
     * <p>
     * Succeeded: The pipeline execution completed successfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * Superseded: While this pipeline execution was waiting for the next stage
     * to be completed, a newer pipeline execution caught up and continued
     * through the pipeline instead.
     * </p>
     * </li>
     * <li>
     * <p>
     * Failed: The pipeline did not complete successfully.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the pipeline execution.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        InProgress: The pipeline execution is currently running.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Succeeded: The pipeline execution completed successfully.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Superseded: While this pipeline execution was waiting for the next
     *        stage to be completed, a newer pipeline execution caught up and
     *        continued through the pipeline instead.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Failed: The pipeline did not complete successfully.
     *        </p>
     *        </li>
     * @see PipelineExecutionStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the pipeline execution.
     * </p>
     * <ul>
     * <li>
     * <p>
     * InProgress: The pipeline execution is currently running.
     * </p>
     * </li>
     * <li>
     * <p>
     * Succeeded: The pipeline execution completed successfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * Superseded: While this pipeline execution was waiting for the next stage
     * to be completed, a newer pipeline execution caught up and continued
     * through the pipeline instead.
     * </p>
     * </li>
     * <li>
     * <p>
     * Failed: The pipeline did not complete successfully.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The status of the pipeline execution.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         InProgress: The pipeline execution is currently running.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Succeeded: The pipeline execution completed successfully.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Superseded: While this pipeline execution was waiting for the
     *         next stage to be completed, a newer pipeline execution caught up
     *         and continued through the pipeline instead.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Failed: The pipeline did not complete successfully.
     *         </p>
     *         </li>
     * @see PipelineExecutionStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the pipeline execution.
     * </p>
     * <ul>
     * <li>
     * <p>
     * InProgress: The pipeline execution is currently running.
     * </p>
     * </li>
     * <li>
     * <p>
     * Succeeded: The pipeline execution completed successfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * Superseded: While this pipeline execution was waiting for the next stage
     * to be completed, a newer pipeline execution caught up and continued
     * through the pipeline instead.
     * </p>
     * </li>
     * <li>
     * <p>
     * Failed: The pipeline did not complete successfully.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the pipeline execution.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        InProgress: The pipeline execution is currently running.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Succeeded: The pipeline execution completed successfully.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Superseded: While this pipeline execution was waiting for the next
     *        stage to be completed, a newer pipeline execution caught up and
     *        continued through the pipeline instead.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Failed: The pipeline did not complete successfully.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see PipelineExecutionStatus
     */

    public PipelineExecution withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the pipeline execution.
     * </p>
     * <ul>
     * <li>
     * <p>
     * InProgress: The pipeline execution is currently running.
     * </p>
     * </li>
     * <li>
     * <p>
     * Succeeded: The pipeline execution completed successfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * Superseded: While this pipeline execution was waiting for the next stage
     * to be completed, a newer pipeline execution caught up and continued
     * through the pipeline instead.
     * </p>
     * </li>
     * <li>
     * <p>
     * Failed: The pipeline did not complete successfully.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the pipeline execution.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        InProgress: The pipeline execution is currently running.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Succeeded: The pipeline execution completed successfully.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Superseded: While this pipeline execution was waiting for the next
     *        stage to be completed, a newer pipeline execution caught up and
     *        continued through the pipeline instead.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Failed: The pipeline did not complete successfully.
     *        </p>
     *        </li>
     * @see PipelineExecutionStatus
     */

    public void setStatus(PipelineExecutionStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The status of the pipeline execution.
     * </p>
     * <ul>
     * <li>
     * <p>
     * InProgress: The pipeline execution is currently running.
     * </p>
     * </li>
     * <li>
     * <p>
     * Succeeded: The pipeline execution completed successfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * Superseded: While this pipeline execution was waiting for the next stage
     * to be completed, a newer pipeline execution caught up and continued
     * through the pipeline instead.
     * </p>
     * </li>
     * <li>
     * <p>
     * Failed: The pipeline did not complete successfully.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the pipeline execution.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        InProgress: The pipeline execution is currently running.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Succeeded: The pipeline execution completed successfully.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Superseded: While this pipeline execution was waiting for the next
     *        stage to be completed, a newer pipeline execution caught up and
     *        continued through the pipeline instead.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Failed: The pipeline did not complete successfully.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see PipelineExecutionStatus
     */

    public PipelineExecution withStatus(PipelineExecutionStatus status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * A list of ArtifactRevisionInformation objects included in a pipeline
     * execution.
     * </p>
     * 
     * @return A list of ArtifactRevisionInformation objects included in a
     *         pipeline execution.
     */

    public java.util.List<ArtifactRevisionInformation> getArtifactRevisionInformations() {
        return artifactRevisionInformations;
    }

    /**
     * <p>
     * A list of ArtifactRevisionInformation objects included in a pipeline
     * execution.
     * </p>
     * 
     * @param artifactRevisionInformations
     *        A list of ArtifactRevisionInformation objects included in a
     *        pipeline execution.
     */

    public void setArtifactRevisionInformations(
            java.util.Collection<ArtifactRevisionInformation> artifactRevisionInformations) {
        if (artifactRevisionInformations == null) {
            this.artifactRevisionInformations = null;
            return;
        }

        this.artifactRevisionInformations = new java.util.ArrayList<ArtifactRevisionInformation>(
                artifactRevisionInformations);
    }

    /**
     * <p>
     * A list of ArtifactRevisionInformation objects included in a pipeline
     * execution.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setArtifactRevisionInformations(java.util.Collection)}
     * or {@link #withArtifactRevisionInformations(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param artifactRevisionInformations
     *        A list of ArtifactRevisionInformation objects included in a
     *        pipeline execution.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public PipelineExecution withArtifactRevisionInformations(
            ArtifactRevisionInformation... artifactRevisionInformations) {
        if (this.artifactRevisionInformations == null) {
            setArtifactRevisionInformations(new java.util.ArrayList<ArtifactRevisionInformation>(
                    artifactRevisionInformations.length));
        }
        for (ArtifactRevisionInformation ele : artifactRevisionInformations) {
            this.artifactRevisionInformations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of ArtifactRevisionInformation objects included in a pipeline
     * execution.
     * </p>
     * 
     * @param artifactRevisionInformations
     *        A list of ArtifactRevisionInformation objects included in a
     *        pipeline execution.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public PipelineExecution withArtifactRevisionInformations(
            java.util.Collection<ArtifactRevisionInformation> artifactRevisionInformations) {
        setArtifactRevisionInformations(artifactRevisionInformations);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
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
        if (getPipelineVersion() != null)
            sb.append("PipelineVersion: " + getPipelineVersion() + ",");
        if (getPipelineExecutionId() != null)
            sb.append("PipelineExecutionId: " + getPipelineExecutionId() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getArtifactRevisionInformations() != null)
            sb.append("ArtifactRevisionInformations: "
                    + getArtifactRevisionInformations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PipelineExecution == false)
            return false;
        PipelineExecution other = (PipelineExecution) obj;
        if (other.getPipelineName() == null ^ this.getPipelineName() == null)
            return false;
        if (other.getPipelineName() != null
                && other.getPipelineName().equals(this.getPipelineName()) == false)
            return false;
        if (other.getPipelineVersion() == null
                ^ this.getPipelineVersion() == null)
            return false;
        if (other.getPipelineVersion() != null
                && other.getPipelineVersion().equals(this.getPipelineVersion()) == false)
            return false;
        if (other.getPipelineExecutionId() == null
                ^ this.getPipelineExecutionId() == null)
            return false;
        if (other.getPipelineExecutionId() != null
                && other.getPipelineExecutionId().equals(
                        this.getPipelineExecutionId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null
                && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getArtifactRevisionInformations() == null
                ^ this.getArtifactRevisionInformations() == null)
            return false;
        if (other.getArtifactRevisionInformations() != null
                && other.getArtifactRevisionInformations().equals(
                        this.getArtifactRevisionInformations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getPipelineName() == null) ? 0 : getPipelineName()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getPipelineVersion() == null) ? 0 : getPipelineVersion()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getPipelineExecutionId() == null) ? 0
                        : getPipelineExecutionId().hashCode());
        hashCode = prime * hashCode
                + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime
                * hashCode
                + ((getArtifactRevisionInformations() == null) ? 0
                        : getArtifactRevisionInformations().hashCode());
        return hashCode;
    }

    @Override
    public PipelineExecution clone() {
        try {
            return (PipelineExecution) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
