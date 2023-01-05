/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ecs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object representing the health status of the container instance.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/ContainerInstanceHealthStatus" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ContainerInstanceHealthStatus implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The overall health status of the container instance. This is an aggregate status of all container instance health
     * checks.
     * </p>
     */
    private String overallStatus;
    /**
     * <p>
     * An array of objects representing the details of the container instance health status.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<InstanceHealthCheckResult> details;

    /**
     * <p>
     * The overall health status of the container instance. This is an aggregate status of all container instance health
     * checks.
     * </p>
     * 
     * @param overallStatus
     *        The overall health status of the container instance. This is an aggregate status of all container instance
     *        health checks.
     * @see InstanceHealthCheckState
     */

    public void setOverallStatus(String overallStatus) {
        this.overallStatus = overallStatus;
    }

    /**
     * <p>
     * The overall health status of the container instance. This is an aggregate status of all container instance health
     * checks.
     * </p>
     * 
     * @return The overall health status of the container instance. This is an aggregate status of all container
     *         instance health checks.
     * @see InstanceHealthCheckState
     */

    public String getOverallStatus() {
        return this.overallStatus;
    }

    /**
     * <p>
     * The overall health status of the container instance. This is an aggregate status of all container instance health
     * checks.
     * </p>
     * 
     * @param overallStatus
     *        The overall health status of the container instance. This is an aggregate status of all container instance
     *        health checks.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceHealthCheckState
     */

    public ContainerInstanceHealthStatus withOverallStatus(String overallStatus) {
        setOverallStatus(overallStatus);
        return this;
    }

    /**
     * <p>
     * The overall health status of the container instance. This is an aggregate status of all container instance health
     * checks.
     * </p>
     * 
     * @param overallStatus
     *        The overall health status of the container instance. This is an aggregate status of all container instance
     *        health checks.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceHealthCheckState
     */

    public ContainerInstanceHealthStatus withOverallStatus(InstanceHealthCheckState overallStatus) {
        this.overallStatus = overallStatus.toString();
        return this;
    }

    /**
     * <p>
     * An array of objects representing the details of the container instance health status.
     * </p>
     * 
     * @return An array of objects representing the details of the container instance health status.
     */

    public java.util.List<InstanceHealthCheckResult> getDetails() {
        if (details == null) {
            details = new com.amazonaws.internal.SdkInternalList<InstanceHealthCheckResult>();
        }
        return details;
    }

    /**
     * <p>
     * An array of objects representing the details of the container instance health status.
     * </p>
     * 
     * @param details
     *        An array of objects representing the details of the container instance health status.
     */

    public void setDetails(java.util.Collection<InstanceHealthCheckResult> details) {
        if (details == null) {
            this.details = null;
            return;
        }

        this.details = new com.amazonaws.internal.SdkInternalList<InstanceHealthCheckResult>(details);
    }

    /**
     * <p>
     * An array of objects representing the details of the container instance health status.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDetails(java.util.Collection)} or {@link #withDetails(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param details
     *        An array of objects representing the details of the container instance health status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerInstanceHealthStatus withDetails(InstanceHealthCheckResult... details) {
        if (this.details == null) {
            setDetails(new com.amazonaws.internal.SdkInternalList<InstanceHealthCheckResult>(details.length));
        }
        for (InstanceHealthCheckResult ele : details) {
            this.details.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects representing the details of the container instance health status.
     * </p>
     * 
     * @param details
     *        An array of objects representing the details of the container instance health status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerInstanceHealthStatus withDetails(java.util.Collection<InstanceHealthCheckResult> details) {
        setDetails(details);
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
        if (getOverallStatus() != null)
            sb.append("OverallStatus: ").append(getOverallStatus()).append(",");
        if (getDetails() != null)
            sb.append("Details: ").append(getDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ContainerInstanceHealthStatus == false)
            return false;
        ContainerInstanceHealthStatus other = (ContainerInstanceHealthStatus) obj;
        if (other.getOverallStatus() == null ^ this.getOverallStatus() == null)
            return false;
        if (other.getOverallStatus() != null && other.getOverallStatus().equals(this.getOverallStatus()) == false)
            return false;
        if (other.getDetails() == null ^ this.getDetails() == null)
            return false;
        if (other.getDetails() != null && other.getDetails().equals(this.getDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOverallStatus() == null) ? 0 : getOverallStatus().hashCode());
        hashCode = prime * hashCode + ((getDetails() == null) ? 0 : getDetails().hashCode());
        return hashCode;
    }

    @Override
    public ContainerInstanceHealthStatus clone() {
        try {
            return (ContainerInstanceHealthStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ecs.model.transform.ContainerInstanceHealthStatusMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
