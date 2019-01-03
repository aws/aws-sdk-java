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
package com.amazonaws.services.ecs.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/DescribeContainerInstances" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeContainerInstancesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of container instances.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ContainerInstance> containerInstances;
    /**
     * <p>
     * Any failures associated with the call.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Failure> failures;

    /**
     * <p>
     * The list of container instances.
     * </p>
     * 
     * @return The list of container instances.
     */

    public java.util.List<ContainerInstance> getContainerInstances() {
        if (containerInstances == null) {
            containerInstances = new com.amazonaws.internal.SdkInternalList<ContainerInstance>();
        }
        return containerInstances;
    }

    /**
     * <p>
     * The list of container instances.
     * </p>
     * 
     * @param containerInstances
     *        The list of container instances.
     */

    public void setContainerInstances(java.util.Collection<ContainerInstance> containerInstances) {
        if (containerInstances == null) {
            this.containerInstances = null;
            return;
        }

        this.containerInstances = new com.amazonaws.internal.SdkInternalList<ContainerInstance>(containerInstances);
    }

    /**
     * <p>
     * The list of container instances.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setContainerInstances(java.util.Collection)} or {@link #withContainerInstances(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param containerInstances
     *        The list of container instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeContainerInstancesResult withContainerInstances(ContainerInstance... containerInstances) {
        if (this.containerInstances == null) {
            setContainerInstances(new com.amazonaws.internal.SdkInternalList<ContainerInstance>(containerInstances.length));
        }
        for (ContainerInstance ele : containerInstances) {
            this.containerInstances.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of container instances.
     * </p>
     * 
     * @param containerInstances
     *        The list of container instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeContainerInstancesResult withContainerInstances(java.util.Collection<ContainerInstance> containerInstances) {
        setContainerInstances(containerInstances);
        return this;
    }

    /**
     * <p>
     * Any failures associated with the call.
     * </p>
     * 
     * @return Any failures associated with the call.
     */

    public java.util.List<Failure> getFailures() {
        if (failures == null) {
            failures = new com.amazonaws.internal.SdkInternalList<Failure>();
        }
        return failures;
    }

    /**
     * <p>
     * Any failures associated with the call.
     * </p>
     * 
     * @param failures
     *        Any failures associated with the call.
     */

    public void setFailures(java.util.Collection<Failure> failures) {
        if (failures == null) {
            this.failures = null;
            return;
        }

        this.failures = new com.amazonaws.internal.SdkInternalList<Failure>(failures);
    }

    /**
     * <p>
     * Any failures associated with the call.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFailures(java.util.Collection)} or {@link #withFailures(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param failures
     *        Any failures associated with the call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeContainerInstancesResult withFailures(Failure... failures) {
        if (this.failures == null) {
            setFailures(new com.amazonaws.internal.SdkInternalList<Failure>(failures.length));
        }
        for (Failure ele : failures) {
            this.failures.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Any failures associated with the call.
     * </p>
     * 
     * @param failures
     *        Any failures associated with the call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeContainerInstancesResult withFailures(java.util.Collection<Failure> failures) {
        setFailures(failures);
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
        if (getContainerInstances() != null)
            sb.append("ContainerInstances: ").append(getContainerInstances()).append(",");
        if (getFailures() != null)
            sb.append("Failures: ").append(getFailures());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeContainerInstancesResult == false)
            return false;
        DescribeContainerInstancesResult other = (DescribeContainerInstancesResult) obj;
        if (other.getContainerInstances() == null ^ this.getContainerInstances() == null)
            return false;
        if (other.getContainerInstances() != null && other.getContainerInstances().equals(this.getContainerInstances()) == false)
            return false;
        if (other.getFailures() == null ^ this.getFailures() == null)
            return false;
        if (other.getFailures() != null && other.getFailures().equals(this.getFailures()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContainerInstances() == null) ? 0 : getContainerInstances().hashCode());
        hashCode = prime * hashCode + ((getFailures() == null) ? 0 : getFailures().hashCode());
        return hashCode;
    }

    @Override
    public DescribeContainerInstancesResult clone() {
        try {
            return (DescribeContainerInstancesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
