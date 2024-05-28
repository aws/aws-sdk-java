/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The termination policy for the Amazon EBS volume when the task exits. For more information, see <a
 * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ebs-volumes.html#ebs-volume-types">Amazon ECS
 * volume termination policy</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/TaskManagedEBSVolumeTerminationPolicy"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TaskManagedEBSVolumeTerminationPolicy implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates whether the volume should be deleted on when the task stops. If a value of <code>true</code> is
     * specified, &#x2028;Amazon ECS deletes the Amazon EBS volume on your behalf when the task goes into the
     * <code>STOPPED</code> state. If no value is specified, the &#x2028;default value is <code>true</code> is used.
     * When set to <code>false</code>, Amazon ECS leaves the volume in your &#x2028;account.
     * </p>
     */
    private Boolean deleteOnTermination;

    /**
     * <p>
     * Indicates whether the volume should be deleted on when the task stops. If a value of <code>true</code> is
     * specified, &#x2028;Amazon ECS deletes the Amazon EBS volume on your behalf when the task goes into the
     * <code>STOPPED</code> state. If no value is specified, the &#x2028;default value is <code>true</code> is used.
     * When set to <code>false</code>, Amazon ECS leaves the volume in your &#x2028;account.
     * </p>
     * 
     * @param deleteOnTermination
     *        Indicates whether the volume should be deleted on when the task stops. If a value of <code>true</code> is
     *        specified, &#x2028;Amazon ECS deletes the Amazon EBS volume on your behalf when the task goes into the
     *        <code>STOPPED</code> state. If no value is specified, the &#x2028;default value is <code>true</code> is
     *        used. When set to <code>false</code>, Amazon ECS leaves the volume in your &#x2028;account.
     */

    public void setDeleteOnTermination(Boolean deleteOnTermination) {
        this.deleteOnTermination = deleteOnTermination;
    }

    /**
     * <p>
     * Indicates whether the volume should be deleted on when the task stops. If a value of <code>true</code> is
     * specified, &#x2028;Amazon ECS deletes the Amazon EBS volume on your behalf when the task goes into the
     * <code>STOPPED</code> state. If no value is specified, the &#x2028;default value is <code>true</code> is used.
     * When set to <code>false</code>, Amazon ECS leaves the volume in your &#x2028;account.
     * </p>
     * 
     * @return Indicates whether the volume should be deleted on when the task stops. If a value of <code>true</code> is
     *         specified, &#x2028;Amazon ECS deletes the Amazon EBS volume on your behalf when the task goes into the
     *         <code>STOPPED</code> state. If no value is specified, the &#x2028;default value is <code>true</code> is
     *         used. When set to <code>false</code>, Amazon ECS leaves the volume in your &#x2028;account.
     */

    public Boolean getDeleteOnTermination() {
        return this.deleteOnTermination;
    }

    /**
     * <p>
     * Indicates whether the volume should be deleted on when the task stops. If a value of <code>true</code> is
     * specified, &#x2028;Amazon ECS deletes the Amazon EBS volume on your behalf when the task goes into the
     * <code>STOPPED</code> state. If no value is specified, the &#x2028;default value is <code>true</code> is used.
     * When set to <code>false</code>, Amazon ECS leaves the volume in your &#x2028;account.
     * </p>
     * 
     * @param deleteOnTermination
     *        Indicates whether the volume should be deleted on when the task stops. If a value of <code>true</code> is
     *        specified, &#x2028;Amazon ECS deletes the Amazon EBS volume on your behalf when the task goes into the
     *        <code>STOPPED</code> state. If no value is specified, the &#x2028;default value is <code>true</code> is
     *        used. When set to <code>false</code>, Amazon ECS leaves the volume in your &#x2028;account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskManagedEBSVolumeTerminationPolicy withDeleteOnTermination(Boolean deleteOnTermination) {
        setDeleteOnTermination(deleteOnTermination);
        return this;
    }

    /**
     * <p>
     * Indicates whether the volume should be deleted on when the task stops. If a value of <code>true</code> is
     * specified, &#x2028;Amazon ECS deletes the Amazon EBS volume on your behalf when the task goes into the
     * <code>STOPPED</code> state. If no value is specified, the &#x2028;default value is <code>true</code> is used.
     * When set to <code>false</code>, Amazon ECS leaves the volume in your &#x2028;account.
     * </p>
     * 
     * @return Indicates whether the volume should be deleted on when the task stops. If a value of <code>true</code> is
     *         specified, &#x2028;Amazon ECS deletes the Amazon EBS volume on your behalf when the task goes into the
     *         <code>STOPPED</code> state. If no value is specified, the &#x2028;default value is <code>true</code> is
     *         used. When set to <code>false</code>, Amazon ECS leaves the volume in your &#x2028;account.
     */

    public Boolean isDeleteOnTermination() {
        return this.deleteOnTermination;
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
        if (getDeleteOnTermination() != null)
            sb.append("DeleteOnTermination: ").append(getDeleteOnTermination());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TaskManagedEBSVolumeTerminationPolicy == false)
            return false;
        TaskManagedEBSVolumeTerminationPolicy other = (TaskManagedEBSVolumeTerminationPolicy) obj;
        if (other.getDeleteOnTermination() == null ^ this.getDeleteOnTermination() == null)
            return false;
        if (other.getDeleteOnTermination() != null && other.getDeleteOnTermination().equals(this.getDeleteOnTermination()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeleteOnTermination() == null) ? 0 : getDeleteOnTermination().hashCode());
        return hashCode;
    }

    @Override
    public TaskManagedEBSVolumeTerminationPolicy clone() {
        try {
            return (TaskManagedEBSVolumeTerminationPolicy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ecs.model.transform.TaskManagedEBSVolumeTerminationPolicyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
