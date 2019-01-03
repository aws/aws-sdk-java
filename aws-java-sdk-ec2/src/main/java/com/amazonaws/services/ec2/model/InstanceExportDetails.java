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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes an instance to export.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/InstanceExportDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstanceExportDetails implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the resource being exported.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * The target virtualization environment.
     * </p>
     */
    private String targetEnvironment;

    /**
     * <p>
     * The ID of the resource being exported.
     * </p>
     * 
     * @param instanceId
     *        The ID of the resource being exported.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The ID of the resource being exported.
     * </p>
     * 
     * @return The ID of the resource being exported.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The ID of the resource being exported.
     * </p>
     * 
     * @param instanceId
     *        The ID of the resource being exported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceExportDetails withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * The target virtualization environment.
     * </p>
     * 
     * @param targetEnvironment
     *        The target virtualization environment.
     * @see ExportEnvironment
     */

    public void setTargetEnvironment(String targetEnvironment) {
        this.targetEnvironment = targetEnvironment;
    }

    /**
     * <p>
     * The target virtualization environment.
     * </p>
     * 
     * @return The target virtualization environment.
     * @see ExportEnvironment
     */

    public String getTargetEnvironment() {
        return this.targetEnvironment;
    }

    /**
     * <p>
     * The target virtualization environment.
     * </p>
     * 
     * @param targetEnvironment
     *        The target virtualization environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExportEnvironment
     */

    public InstanceExportDetails withTargetEnvironment(String targetEnvironment) {
        setTargetEnvironment(targetEnvironment);
        return this;
    }

    /**
     * <p>
     * The target virtualization environment.
     * </p>
     * 
     * @param targetEnvironment
     *        The target virtualization environment.
     * @see ExportEnvironment
     */

    public void setTargetEnvironment(ExportEnvironment targetEnvironment) {
        withTargetEnvironment(targetEnvironment);
    }

    /**
     * <p>
     * The target virtualization environment.
     * </p>
     * 
     * @param targetEnvironment
     *        The target virtualization environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExportEnvironment
     */

    public InstanceExportDetails withTargetEnvironment(ExportEnvironment targetEnvironment) {
        this.targetEnvironment = targetEnvironment.toString();
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
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getTargetEnvironment() != null)
            sb.append("TargetEnvironment: ").append(getTargetEnvironment());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceExportDetails == false)
            return false;
        InstanceExportDetails other = (InstanceExportDetails) obj;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getTargetEnvironment() == null ^ this.getTargetEnvironment() == null)
            return false;
        if (other.getTargetEnvironment() != null && other.getTargetEnvironment().equals(this.getTargetEnvironment()) == false)
            return false;
        return true;
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
    public InstanceExportDetails clone() {
        try {
            return (InstanceExportDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
