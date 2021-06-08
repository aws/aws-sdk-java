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
 * A summary of a model compilation job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CompilationJobSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CompilationJobSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the model compilation job that you want a summary for.
     * </p>
     */
    private String compilationJobName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model compilation job.
     * </p>
     */
    private String compilationJobArn;
    /**
     * <p>
     * The time when the model compilation job was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The time when the model compilation job started.
     * </p>
     */
    private java.util.Date compilationStartTime;
    /**
     * <p>
     * The time when the model compilation job completed.
     * </p>
     */
    private java.util.Date compilationEndTime;
    /**
     * <p>
     * The type of device that the model will run on after the compilation job has completed.
     * </p>
     */
    private String compilationTargetDevice;
    /**
     * <p>
     * The type of OS that the model will run on after the compilation job has completed.
     * </p>
     */
    private String compilationTargetPlatformOs;
    /**
     * <p>
     * The type of architecture that the model will run on after the compilation job has completed.
     * </p>
     */
    private String compilationTargetPlatformArch;
    /**
     * <p>
     * The type of accelerator that the model will run on after the compilation job has completed.
     * </p>
     */
    private String compilationTargetPlatformAccelerator;
    /**
     * <p>
     * The time when the model compilation job was last modified.
     * </p>
     */
    private java.util.Date lastModifiedTime;
    /**
     * <p>
     * The status of the model compilation job.
     * </p>
     */
    private String compilationJobStatus;

    /**
     * <p>
     * The name of the model compilation job that you want a summary for.
     * </p>
     * 
     * @param compilationJobName
     *        The name of the model compilation job that you want a summary for.
     */

    public void setCompilationJobName(String compilationJobName) {
        this.compilationJobName = compilationJobName;
    }

    /**
     * <p>
     * The name of the model compilation job that you want a summary for.
     * </p>
     * 
     * @return The name of the model compilation job that you want a summary for.
     */

    public String getCompilationJobName() {
        return this.compilationJobName;
    }

    /**
     * <p>
     * The name of the model compilation job that you want a summary for.
     * </p>
     * 
     * @param compilationJobName
     *        The name of the model compilation job that you want a summary for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CompilationJobSummary withCompilationJobName(String compilationJobName) {
        setCompilationJobName(compilationJobName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model compilation job.
     * </p>
     * 
     * @param compilationJobArn
     *        The Amazon Resource Name (ARN) of the model compilation job.
     */

    public void setCompilationJobArn(String compilationJobArn) {
        this.compilationJobArn = compilationJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model compilation job.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the model compilation job.
     */

    public String getCompilationJobArn() {
        return this.compilationJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model compilation job.
     * </p>
     * 
     * @param compilationJobArn
     *        The Amazon Resource Name (ARN) of the model compilation job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CompilationJobSummary withCompilationJobArn(String compilationJobArn) {
        setCompilationJobArn(compilationJobArn);
        return this;
    }

    /**
     * <p>
     * The time when the model compilation job was created.
     * </p>
     * 
     * @param creationTime
     *        The time when the model compilation job was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time when the model compilation job was created.
     * </p>
     * 
     * @return The time when the model compilation job was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time when the model compilation job was created.
     * </p>
     * 
     * @param creationTime
     *        The time when the model compilation job was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CompilationJobSummary withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The time when the model compilation job started.
     * </p>
     * 
     * @param compilationStartTime
     *        The time when the model compilation job started.
     */

    public void setCompilationStartTime(java.util.Date compilationStartTime) {
        this.compilationStartTime = compilationStartTime;
    }

    /**
     * <p>
     * The time when the model compilation job started.
     * </p>
     * 
     * @return The time when the model compilation job started.
     */

    public java.util.Date getCompilationStartTime() {
        return this.compilationStartTime;
    }

    /**
     * <p>
     * The time when the model compilation job started.
     * </p>
     * 
     * @param compilationStartTime
     *        The time when the model compilation job started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CompilationJobSummary withCompilationStartTime(java.util.Date compilationStartTime) {
        setCompilationStartTime(compilationStartTime);
        return this;
    }

    /**
     * <p>
     * The time when the model compilation job completed.
     * </p>
     * 
     * @param compilationEndTime
     *        The time when the model compilation job completed.
     */

    public void setCompilationEndTime(java.util.Date compilationEndTime) {
        this.compilationEndTime = compilationEndTime;
    }

    /**
     * <p>
     * The time when the model compilation job completed.
     * </p>
     * 
     * @return The time when the model compilation job completed.
     */

    public java.util.Date getCompilationEndTime() {
        return this.compilationEndTime;
    }

    /**
     * <p>
     * The time when the model compilation job completed.
     * </p>
     * 
     * @param compilationEndTime
     *        The time when the model compilation job completed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CompilationJobSummary withCompilationEndTime(java.util.Date compilationEndTime) {
        setCompilationEndTime(compilationEndTime);
        return this;
    }

    /**
     * <p>
     * The type of device that the model will run on after the compilation job has completed.
     * </p>
     * 
     * @param compilationTargetDevice
     *        The type of device that the model will run on after the compilation job has completed.
     * @see TargetDevice
     */

    public void setCompilationTargetDevice(String compilationTargetDevice) {
        this.compilationTargetDevice = compilationTargetDevice;
    }

    /**
     * <p>
     * The type of device that the model will run on after the compilation job has completed.
     * </p>
     * 
     * @return The type of device that the model will run on after the compilation job has completed.
     * @see TargetDevice
     */

    public String getCompilationTargetDevice() {
        return this.compilationTargetDevice;
    }

    /**
     * <p>
     * The type of device that the model will run on after the compilation job has completed.
     * </p>
     * 
     * @param compilationTargetDevice
     *        The type of device that the model will run on after the compilation job has completed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetDevice
     */

    public CompilationJobSummary withCompilationTargetDevice(String compilationTargetDevice) {
        setCompilationTargetDevice(compilationTargetDevice);
        return this;
    }

    /**
     * <p>
     * The type of device that the model will run on after the compilation job has completed.
     * </p>
     * 
     * @param compilationTargetDevice
     *        The type of device that the model will run on after the compilation job has completed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetDevice
     */

    public CompilationJobSummary withCompilationTargetDevice(TargetDevice compilationTargetDevice) {
        this.compilationTargetDevice = compilationTargetDevice.toString();
        return this;
    }

    /**
     * <p>
     * The type of OS that the model will run on after the compilation job has completed.
     * </p>
     * 
     * @param compilationTargetPlatformOs
     *        The type of OS that the model will run on after the compilation job has completed.
     * @see TargetPlatformOs
     */

    public void setCompilationTargetPlatformOs(String compilationTargetPlatformOs) {
        this.compilationTargetPlatformOs = compilationTargetPlatformOs;
    }

    /**
     * <p>
     * The type of OS that the model will run on after the compilation job has completed.
     * </p>
     * 
     * @return The type of OS that the model will run on after the compilation job has completed.
     * @see TargetPlatformOs
     */

    public String getCompilationTargetPlatformOs() {
        return this.compilationTargetPlatformOs;
    }

    /**
     * <p>
     * The type of OS that the model will run on after the compilation job has completed.
     * </p>
     * 
     * @param compilationTargetPlatformOs
     *        The type of OS that the model will run on after the compilation job has completed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetPlatformOs
     */

    public CompilationJobSummary withCompilationTargetPlatformOs(String compilationTargetPlatformOs) {
        setCompilationTargetPlatformOs(compilationTargetPlatformOs);
        return this;
    }

    /**
     * <p>
     * The type of OS that the model will run on after the compilation job has completed.
     * </p>
     * 
     * @param compilationTargetPlatformOs
     *        The type of OS that the model will run on after the compilation job has completed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetPlatformOs
     */

    public CompilationJobSummary withCompilationTargetPlatformOs(TargetPlatformOs compilationTargetPlatformOs) {
        this.compilationTargetPlatformOs = compilationTargetPlatformOs.toString();
        return this;
    }

    /**
     * <p>
     * The type of architecture that the model will run on after the compilation job has completed.
     * </p>
     * 
     * @param compilationTargetPlatformArch
     *        The type of architecture that the model will run on after the compilation job has completed.
     * @see TargetPlatformArch
     */

    public void setCompilationTargetPlatformArch(String compilationTargetPlatformArch) {
        this.compilationTargetPlatformArch = compilationTargetPlatformArch;
    }

    /**
     * <p>
     * The type of architecture that the model will run on after the compilation job has completed.
     * </p>
     * 
     * @return The type of architecture that the model will run on after the compilation job has completed.
     * @see TargetPlatformArch
     */

    public String getCompilationTargetPlatformArch() {
        return this.compilationTargetPlatformArch;
    }

    /**
     * <p>
     * The type of architecture that the model will run on after the compilation job has completed.
     * </p>
     * 
     * @param compilationTargetPlatformArch
     *        The type of architecture that the model will run on after the compilation job has completed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetPlatformArch
     */

    public CompilationJobSummary withCompilationTargetPlatformArch(String compilationTargetPlatformArch) {
        setCompilationTargetPlatformArch(compilationTargetPlatformArch);
        return this;
    }

    /**
     * <p>
     * The type of architecture that the model will run on after the compilation job has completed.
     * </p>
     * 
     * @param compilationTargetPlatformArch
     *        The type of architecture that the model will run on after the compilation job has completed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetPlatformArch
     */

    public CompilationJobSummary withCompilationTargetPlatformArch(TargetPlatformArch compilationTargetPlatformArch) {
        this.compilationTargetPlatformArch = compilationTargetPlatformArch.toString();
        return this;
    }

    /**
     * <p>
     * The type of accelerator that the model will run on after the compilation job has completed.
     * </p>
     * 
     * @param compilationTargetPlatformAccelerator
     *        The type of accelerator that the model will run on after the compilation job has completed.
     * @see TargetPlatformAccelerator
     */

    public void setCompilationTargetPlatformAccelerator(String compilationTargetPlatformAccelerator) {
        this.compilationTargetPlatformAccelerator = compilationTargetPlatformAccelerator;
    }

    /**
     * <p>
     * The type of accelerator that the model will run on after the compilation job has completed.
     * </p>
     * 
     * @return The type of accelerator that the model will run on after the compilation job has completed.
     * @see TargetPlatformAccelerator
     */

    public String getCompilationTargetPlatformAccelerator() {
        return this.compilationTargetPlatformAccelerator;
    }

    /**
     * <p>
     * The type of accelerator that the model will run on after the compilation job has completed.
     * </p>
     * 
     * @param compilationTargetPlatformAccelerator
     *        The type of accelerator that the model will run on after the compilation job has completed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetPlatformAccelerator
     */

    public CompilationJobSummary withCompilationTargetPlatformAccelerator(String compilationTargetPlatformAccelerator) {
        setCompilationTargetPlatformAccelerator(compilationTargetPlatformAccelerator);
        return this;
    }

    /**
     * <p>
     * The type of accelerator that the model will run on after the compilation job has completed.
     * </p>
     * 
     * @param compilationTargetPlatformAccelerator
     *        The type of accelerator that the model will run on after the compilation job has completed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetPlatformAccelerator
     */

    public CompilationJobSummary withCompilationTargetPlatformAccelerator(TargetPlatformAccelerator compilationTargetPlatformAccelerator) {
        this.compilationTargetPlatformAccelerator = compilationTargetPlatformAccelerator.toString();
        return this;
    }

    /**
     * <p>
     * The time when the model compilation job was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        The time when the model compilation job was last modified.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * The time when the model compilation job was last modified.
     * </p>
     * 
     * @return The time when the model compilation job was last modified.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * The time when the model compilation job was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        The time when the model compilation job was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CompilationJobSummary withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
        return this;
    }

    /**
     * <p>
     * The status of the model compilation job.
     * </p>
     * 
     * @param compilationJobStatus
     *        The status of the model compilation job.
     * @see CompilationJobStatus
     */

    public void setCompilationJobStatus(String compilationJobStatus) {
        this.compilationJobStatus = compilationJobStatus;
    }

    /**
     * <p>
     * The status of the model compilation job.
     * </p>
     * 
     * @return The status of the model compilation job.
     * @see CompilationJobStatus
     */

    public String getCompilationJobStatus() {
        return this.compilationJobStatus;
    }

    /**
     * <p>
     * The status of the model compilation job.
     * </p>
     * 
     * @param compilationJobStatus
     *        The status of the model compilation job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CompilationJobStatus
     */

    public CompilationJobSummary withCompilationJobStatus(String compilationJobStatus) {
        setCompilationJobStatus(compilationJobStatus);
        return this;
    }

    /**
     * <p>
     * The status of the model compilation job.
     * </p>
     * 
     * @param compilationJobStatus
     *        The status of the model compilation job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CompilationJobStatus
     */

    public CompilationJobSummary withCompilationJobStatus(CompilationJobStatus compilationJobStatus) {
        this.compilationJobStatus = compilationJobStatus.toString();
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
        if (getCompilationJobName() != null)
            sb.append("CompilationJobName: ").append(getCompilationJobName()).append(",");
        if (getCompilationJobArn() != null)
            sb.append("CompilationJobArn: ").append(getCompilationJobArn()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getCompilationStartTime() != null)
            sb.append("CompilationStartTime: ").append(getCompilationStartTime()).append(",");
        if (getCompilationEndTime() != null)
            sb.append("CompilationEndTime: ").append(getCompilationEndTime()).append(",");
        if (getCompilationTargetDevice() != null)
            sb.append("CompilationTargetDevice: ").append(getCompilationTargetDevice()).append(",");
        if (getCompilationTargetPlatformOs() != null)
            sb.append("CompilationTargetPlatformOs: ").append(getCompilationTargetPlatformOs()).append(",");
        if (getCompilationTargetPlatformArch() != null)
            sb.append("CompilationTargetPlatformArch: ").append(getCompilationTargetPlatformArch()).append(",");
        if (getCompilationTargetPlatformAccelerator() != null)
            sb.append("CompilationTargetPlatformAccelerator: ").append(getCompilationTargetPlatformAccelerator()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime()).append(",");
        if (getCompilationJobStatus() != null)
            sb.append("CompilationJobStatus: ").append(getCompilationJobStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CompilationJobSummary == false)
            return false;
        CompilationJobSummary other = (CompilationJobSummary) obj;
        if (other.getCompilationJobName() == null ^ this.getCompilationJobName() == null)
            return false;
        if (other.getCompilationJobName() != null && other.getCompilationJobName().equals(this.getCompilationJobName()) == false)
            return false;
        if (other.getCompilationJobArn() == null ^ this.getCompilationJobArn() == null)
            return false;
        if (other.getCompilationJobArn() != null && other.getCompilationJobArn().equals(this.getCompilationJobArn()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getCompilationStartTime() == null ^ this.getCompilationStartTime() == null)
            return false;
        if (other.getCompilationStartTime() != null && other.getCompilationStartTime().equals(this.getCompilationStartTime()) == false)
            return false;
        if (other.getCompilationEndTime() == null ^ this.getCompilationEndTime() == null)
            return false;
        if (other.getCompilationEndTime() != null && other.getCompilationEndTime().equals(this.getCompilationEndTime()) == false)
            return false;
        if (other.getCompilationTargetDevice() == null ^ this.getCompilationTargetDevice() == null)
            return false;
        if (other.getCompilationTargetDevice() != null && other.getCompilationTargetDevice().equals(this.getCompilationTargetDevice()) == false)
            return false;
        if (other.getCompilationTargetPlatformOs() == null ^ this.getCompilationTargetPlatformOs() == null)
            return false;
        if (other.getCompilationTargetPlatformOs() != null && other.getCompilationTargetPlatformOs().equals(this.getCompilationTargetPlatformOs()) == false)
            return false;
        if (other.getCompilationTargetPlatformArch() == null ^ this.getCompilationTargetPlatformArch() == null)
            return false;
        if (other.getCompilationTargetPlatformArch() != null
                && other.getCompilationTargetPlatformArch().equals(this.getCompilationTargetPlatformArch()) == false)
            return false;
        if (other.getCompilationTargetPlatformAccelerator() == null ^ this.getCompilationTargetPlatformAccelerator() == null)
            return false;
        if (other.getCompilationTargetPlatformAccelerator() != null
                && other.getCompilationTargetPlatformAccelerator().equals(this.getCompilationTargetPlatformAccelerator()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getCompilationJobStatus() == null ^ this.getCompilationJobStatus() == null)
            return false;
        if (other.getCompilationJobStatus() != null && other.getCompilationJobStatus().equals(this.getCompilationJobStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCompilationJobName() == null) ? 0 : getCompilationJobName().hashCode());
        hashCode = prime * hashCode + ((getCompilationJobArn() == null) ? 0 : getCompilationJobArn().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getCompilationStartTime() == null) ? 0 : getCompilationStartTime().hashCode());
        hashCode = prime * hashCode + ((getCompilationEndTime() == null) ? 0 : getCompilationEndTime().hashCode());
        hashCode = prime * hashCode + ((getCompilationTargetDevice() == null) ? 0 : getCompilationTargetDevice().hashCode());
        hashCode = prime * hashCode + ((getCompilationTargetPlatformOs() == null) ? 0 : getCompilationTargetPlatformOs().hashCode());
        hashCode = prime * hashCode + ((getCompilationTargetPlatformArch() == null) ? 0 : getCompilationTargetPlatformArch().hashCode());
        hashCode = prime * hashCode + ((getCompilationTargetPlatformAccelerator() == null) ? 0 : getCompilationTargetPlatformAccelerator().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode + ((getCompilationJobStatus() == null) ? 0 : getCompilationJobStatus().hashCode());
        return hashCode;
    }

    @Override
    public CompilationJobSummary clone() {
        try {
            return (CompilationJobSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.CompilationJobSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
