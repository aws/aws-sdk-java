/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Describes an instance export task.
 * </p>
 */
public class InstanceExportDetails implements Serializable {

    /**
     * The ID of the resource being exported.
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
     * The ID of the resource being exported.
     *
     * @return The ID of the resource being exported.
     */
    public String getInstanceId() {
        return instanceId;
    }
    
    /**
     * The ID of the resource being exported.
     *
     * @param instanceId The ID of the resource being exported.
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }
    
    /**
     * The ID of the resource being exported.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceId The ID of the resource being exported.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public InstanceExportDetails withInstanceId(String instanceId) {
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
    public InstanceExportDetails withTargetEnvironment(String targetEnvironment) {
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
    public InstanceExportDetails withTargetEnvironment(ExportEnvironment targetEnvironment) {
        this.targetEnvironment = targetEnvironment.toString();
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
        if (getInstanceId() != null) sb.append("InstanceId: " + getInstanceId() + ",");
        if (getTargetEnvironment() != null) sb.append("TargetEnvironment: " + getTargetEnvironment() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode()); 
        hashCode = prime * hashCode + ((getTargetEnvironment() == null) ? 0 : getTargetEnvironment().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof InstanceExportDetails == false) return false;
        InstanceExportDetails other = (InstanceExportDetails)obj;
        
        if (other.getInstanceId() == null ^ this.getInstanceId() == null) return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false) return false; 
        if (other.getTargetEnvironment() == null ^ this.getTargetEnvironment() == null) return false;
        if (other.getTargetEnvironment() != null && other.getTargetEnvironment().equals(this.getTargetEnvironment()) == false) return false; 
        return true;
    }
    
}
    