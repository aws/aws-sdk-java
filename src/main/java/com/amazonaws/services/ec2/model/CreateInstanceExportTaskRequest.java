/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.ec2.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#createInstanceExportTask(CreateInstanceExportTaskRequest) CreateInstanceExportTask operation}.
 * <p>
 * Exports a running or stopped instance to an Amazon S3 bucket.
 * </p>
 * <p>
 * For information about the supported operating systems, image formats,
 * and known limitations for the types of instances you can export, see
 * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ExportingEC2Instances.html"> Exporting EC2 Instances </a>
 * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#createInstanceExportTask(CreateInstanceExportTaskRequest)
 */
public class CreateInstanceExportTaskRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * A description for the conversion task or the resource being exported.
     * The maximum length is 255 bytes.
     */
    private String description;

    /**
     * The ID of the instance.
     */
    private String instanceId;

    /**
     * The target virtualization environment.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>citrix, vmware, microsoft
     */
    private String targetEnvironment;

    /**
     * 
     */
    private ExportToS3TaskSpecification exportToS3Task;

    /**
     * A description for the conversion task or the resource being exported.
     * The maximum length is 255 bytes.
     *
     * @return A description for the conversion task or the resource being exported.
     *         The maximum length is 255 bytes.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * A description for the conversion task or the resource being exported.
     * The maximum length is 255 bytes.
     *
     * @param description A description for the conversion task or the resource being exported.
     *         The maximum length is 255 bytes.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * A description for the conversion task or the resource being exported.
     * The maximum length is 255 bytes.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param description A description for the conversion task or the resource being exported.
     *         The maximum length is 255 bytes.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateInstanceExportTaskRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * The ID of the instance.
     *
     * @return The ID of the instance.
     */
    public String getInstanceId() {
        return instanceId;
    }
    
    /**
     * The ID of the instance.
     *
     * @param instanceId The ID of the instance.
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }
    
    /**
     * The ID of the instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceId The ID of the instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateInstanceExportTaskRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * The target virtualization environment.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>citrix, vmware, microsoft
     *
     * @return The target virtualization environment.
     *
     * @see ExportEnvironment
     */
    public String getTargetEnvironment() {
        return targetEnvironment;
    }
    
    /**
     * The target virtualization environment.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>citrix, vmware, microsoft
     *
     * @param targetEnvironment The target virtualization environment.
     *
     * @see ExportEnvironment
     */
    public void setTargetEnvironment(String targetEnvironment) {
        this.targetEnvironment = targetEnvironment;
    }
    
    /**
     * The target virtualization environment.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>citrix, vmware, microsoft
     *
     * @param targetEnvironment The target virtualization environment.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see ExportEnvironment
     */
    public CreateInstanceExportTaskRequest withTargetEnvironment(String targetEnvironment) {
        this.targetEnvironment = targetEnvironment;
        return this;
    }

    /**
     * The target virtualization environment.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>citrix, vmware, microsoft
     *
     * @param targetEnvironment The target virtualization environment.
     *
     * @see ExportEnvironment
     */
    public void setTargetEnvironment(ExportEnvironment targetEnvironment) {
        this.targetEnvironment = targetEnvironment.toString();
    }
    
    /**
     * The target virtualization environment.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>citrix, vmware, microsoft
     *
     * @param targetEnvironment The target virtualization environment.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see ExportEnvironment
     */
    public CreateInstanceExportTaskRequest withTargetEnvironment(ExportEnvironment targetEnvironment) {
        this.targetEnvironment = targetEnvironment.toString();
        return this;
    }

    /**
     * 
     *
     * @return 
     */
    public ExportToS3TaskSpecification getExportToS3Task() {
        return exportToS3Task;
    }
    
    /**
     * 
     *
     * @param exportToS3Task 
     */
    public void setExportToS3Task(ExportToS3TaskSpecification exportToS3Task) {
        this.exportToS3Task = exportToS3Task;
    }
    
    /**
     * 
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param exportToS3Task 
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateInstanceExportTaskRequest withExportToS3Task(ExportToS3TaskSpecification exportToS3Task) {
        this.exportToS3Task = exportToS3Task;
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
        if (getDescription() != null) sb.append("Description: " + getDescription() + ",");
        if (getInstanceId() != null) sb.append("InstanceId: " + getInstanceId() + ",");
        if (getTargetEnvironment() != null) sb.append("TargetEnvironment: " + getTargetEnvironment() + ",");
        if (getExportToS3Task() != null) sb.append("ExportToS3Task: " + getExportToS3Task() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode()); 
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode()); 
        hashCode = prime * hashCode + ((getTargetEnvironment() == null) ? 0 : getTargetEnvironment().hashCode()); 
        hashCode = prime * hashCode + ((getExportToS3Task() == null) ? 0 : getExportToS3Task().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateInstanceExportTaskRequest == false) return false;
        CreateInstanceExportTaskRequest other = (CreateInstanceExportTaskRequest)obj;
        
        if (other.getDescription() == null ^ this.getDescription() == null) return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false) return false; 
        if (other.getInstanceId() == null ^ this.getInstanceId() == null) return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false) return false; 
        if (other.getTargetEnvironment() == null ^ this.getTargetEnvironment() == null) return false;
        if (other.getTargetEnvironment() != null && other.getTargetEnvironment().equals(this.getTargetEnvironment()) == false) return false; 
        if (other.getExportToS3Task() == null ^ this.getExportToS3Task() == null) return false;
        if (other.getExportToS3Task() != null && other.getExportToS3Task().equals(this.getExportToS3Task()) == false) return false; 
        return true;
    }
    
}
    