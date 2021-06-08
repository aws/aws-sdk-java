/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Summary of edge packaging job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/EdgePackagingJobSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EdgePackagingJobSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the edge packaging job.
     * </p>
     */
    private String edgePackagingJobArn;
    /**
     * <p>
     * The name of the edge packaging job.
     * </p>
     */
    private String edgePackagingJobName;
    /**
     * <p>
     * The status of the edge packaging job.
     * </p>
     */
    private String edgePackagingJobStatus;
    /**
     * <p>
     * The name of the SageMaker Neo compilation job.
     * </p>
     */
    private String compilationJobName;
    /**
     * <p>
     * The name of the model.
     * </p>
     */
    private String modelName;
    /**
     * <p>
     * The version of the model.
     * </p>
     */
    private String modelVersion;
    /**
     * <p>
     * The timestamp of when the job was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The timestamp of when the edge packaging job was last updated.
     * </p>
     */
    private java.util.Date lastModifiedTime;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the edge packaging job.
     * </p>
     * 
     * @param edgePackagingJobArn
     *        The Amazon Resource Name (ARN) of the edge packaging job.
     */

    public void setEdgePackagingJobArn(String edgePackagingJobArn) {
        this.edgePackagingJobArn = edgePackagingJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the edge packaging job.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the edge packaging job.
     */

    public String getEdgePackagingJobArn() {
        return this.edgePackagingJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the edge packaging job.
     * </p>
     * 
     * @param edgePackagingJobArn
     *        The Amazon Resource Name (ARN) of the edge packaging job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EdgePackagingJobSummary withEdgePackagingJobArn(String edgePackagingJobArn) {
        setEdgePackagingJobArn(edgePackagingJobArn);
        return this;
    }

    /**
     * <p>
     * The name of the edge packaging job.
     * </p>
     * 
     * @param edgePackagingJobName
     *        The name of the edge packaging job.
     */

    public void setEdgePackagingJobName(String edgePackagingJobName) {
        this.edgePackagingJobName = edgePackagingJobName;
    }

    /**
     * <p>
     * The name of the edge packaging job.
     * </p>
     * 
     * @return The name of the edge packaging job.
     */

    public String getEdgePackagingJobName() {
        return this.edgePackagingJobName;
    }

    /**
     * <p>
     * The name of the edge packaging job.
     * </p>
     * 
     * @param edgePackagingJobName
     *        The name of the edge packaging job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EdgePackagingJobSummary withEdgePackagingJobName(String edgePackagingJobName) {
        setEdgePackagingJobName(edgePackagingJobName);
        return this;
    }

    /**
     * <p>
     * The status of the edge packaging job.
     * </p>
     * 
     * @param edgePackagingJobStatus
     *        The status of the edge packaging job.
     * @see EdgePackagingJobStatus
     */

    public void setEdgePackagingJobStatus(String edgePackagingJobStatus) {
        this.edgePackagingJobStatus = edgePackagingJobStatus;
    }

    /**
     * <p>
     * The status of the edge packaging job.
     * </p>
     * 
     * @return The status of the edge packaging job.
     * @see EdgePackagingJobStatus
     */

    public String getEdgePackagingJobStatus() {
        return this.edgePackagingJobStatus;
    }

    /**
     * <p>
     * The status of the edge packaging job.
     * </p>
     * 
     * @param edgePackagingJobStatus
     *        The status of the edge packaging job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EdgePackagingJobStatus
     */

    public EdgePackagingJobSummary withEdgePackagingJobStatus(String edgePackagingJobStatus) {
        setEdgePackagingJobStatus(edgePackagingJobStatus);
        return this;
    }

    /**
     * <p>
     * The status of the edge packaging job.
     * </p>
     * 
     * @param edgePackagingJobStatus
     *        The status of the edge packaging job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EdgePackagingJobStatus
     */

    public EdgePackagingJobSummary withEdgePackagingJobStatus(EdgePackagingJobStatus edgePackagingJobStatus) {
        this.edgePackagingJobStatus = edgePackagingJobStatus.toString();
        return this;
    }

    /**
     * <p>
     * The name of the SageMaker Neo compilation job.
     * </p>
     * 
     * @param compilationJobName
     *        The name of the SageMaker Neo compilation job.
     */

    public void setCompilationJobName(String compilationJobName) {
        this.compilationJobName = compilationJobName;
    }

    /**
     * <p>
     * The name of the SageMaker Neo compilation job.
     * </p>
     * 
     * @return The name of the SageMaker Neo compilation job.
     */

    public String getCompilationJobName() {
        return this.compilationJobName;
    }

    /**
     * <p>
     * The name of the SageMaker Neo compilation job.
     * </p>
     * 
     * @param compilationJobName
     *        The name of the SageMaker Neo compilation job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EdgePackagingJobSummary withCompilationJobName(String compilationJobName) {
        setCompilationJobName(compilationJobName);
        return this;
    }

    /**
     * <p>
     * The name of the model.
     * </p>
     * 
     * @param modelName
     *        The name of the model.
     */

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    /**
     * <p>
     * The name of the model.
     * </p>
     * 
     * @return The name of the model.
     */

    public String getModelName() {
        return this.modelName;
    }

    /**
     * <p>
     * The name of the model.
     * </p>
     * 
     * @param modelName
     *        The name of the model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EdgePackagingJobSummary withModelName(String modelName) {
        setModelName(modelName);
        return this;
    }

    /**
     * <p>
     * The version of the model.
     * </p>
     * 
     * @param modelVersion
     *        The version of the model.
     */

    public void setModelVersion(String modelVersion) {
        this.modelVersion = modelVersion;
    }

    /**
     * <p>
     * The version of the model.
     * </p>
     * 
     * @return The version of the model.
     */

    public String getModelVersion() {
        return this.modelVersion;
    }

    /**
     * <p>
     * The version of the model.
     * </p>
     * 
     * @param modelVersion
     *        The version of the model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EdgePackagingJobSummary withModelVersion(String modelVersion) {
        setModelVersion(modelVersion);
        return this;
    }

    /**
     * <p>
     * The timestamp of when the job was created.
     * </p>
     * 
     * @param creationTime
     *        The timestamp of when the job was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The timestamp of when the job was created.
     * </p>
     * 
     * @return The timestamp of when the job was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The timestamp of when the job was created.
     * </p>
     * 
     * @param creationTime
     *        The timestamp of when the job was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EdgePackagingJobSummary withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The timestamp of when the edge packaging job was last updated.
     * </p>
     * 
     * @param lastModifiedTime
     *        The timestamp of when the edge packaging job was last updated.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * The timestamp of when the edge packaging job was last updated.
     * </p>
     * 
     * @return The timestamp of when the edge packaging job was last updated.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * The timestamp of when the edge packaging job was last updated.
     * </p>
     * 
     * @param lastModifiedTime
     *        The timestamp of when the edge packaging job was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EdgePackagingJobSummary withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
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
        if (getEdgePackagingJobArn() != null)
            sb.append("EdgePackagingJobArn: ").append(getEdgePackagingJobArn()).append(",");
        if (getEdgePackagingJobName() != null)
            sb.append("EdgePackagingJobName: ").append(getEdgePackagingJobName()).append(",");
        if (getEdgePackagingJobStatus() != null)
            sb.append("EdgePackagingJobStatus: ").append(getEdgePackagingJobStatus()).append(",");
        if (getCompilationJobName() != null)
            sb.append("CompilationJobName: ").append(getCompilationJobName()).append(",");
        if (getModelName() != null)
            sb.append("ModelName: ").append(getModelName()).append(",");
        if (getModelVersion() != null)
            sb.append("ModelVersion: ").append(getModelVersion()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EdgePackagingJobSummary == false)
            return false;
        EdgePackagingJobSummary other = (EdgePackagingJobSummary) obj;
        if (other.getEdgePackagingJobArn() == null ^ this.getEdgePackagingJobArn() == null)
            return false;
        if (other.getEdgePackagingJobArn() != null && other.getEdgePackagingJobArn().equals(this.getEdgePackagingJobArn()) == false)
            return false;
        if (other.getEdgePackagingJobName() == null ^ this.getEdgePackagingJobName() == null)
            return false;
        if (other.getEdgePackagingJobName() != null && other.getEdgePackagingJobName().equals(this.getEdgePackagingJobName()) == false)
            return false;
        if (other.getEdgePackagingJobStatus() == null ^ this.getEdgePackagingJobStatus() == null)
            return false;
        if (other.getEdgePackagingJobStatus() != null && other.getEdgePackagingJobStatus().equals(this.getEdgePackagingJobStatus()) == false)
            return false;
        if (other.getCompilationJobName() == null ^ this.getCompilationJobName() == null)
            return false;
        if (other.getCompilationJobName() != null && other.getCompilationJobName().equals(this.getCompilationJobName()) == false)
            return false;
        if (other.getModelName() == null ^ this.getModelName() == null)
            return false;
        if (other.getModelName() != null && other.getModelName().equals(this.getModelName()) == false)
            return false;
        if (other.getModelVersion() == null ^ this.getModelVersion() == null)
            return false;
        if (other.getModelVersion() != null && other.getModelVersion().equals(this.getModelVersion()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEdgePackagingJobArn() == null) ? 0 : getEdgePackagingJobArn().hashCode());
        hashCode = prime * hashCode + ((getEdgePackagingJobName() == null) ? 0 : getEdgePackagingJobName().hashCode());
        hashCode = prime * hashCode + ((getEdgePackagingJobStatus() == null) ? 0 : getEdgePackagingJobStatus().hashCode());
        hashCode = prime * hashCode + ((getCompilationJobName() == null) ? 0 : getCompilationJobName().hashCode());
        hashCode = prime * hashCode + ((getModelName() == null) ? 0 : getModelName().hashCode());
        hashCode = prime * hashCode + ((getModelVersion() == null) ? 0 : getModelVersion().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        return hashCode;
    }

    @Override
    public EdgePackagingJobSummary clone() {
        try {
            return (EdgePackagingJobSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.EdgePackagingJobSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
