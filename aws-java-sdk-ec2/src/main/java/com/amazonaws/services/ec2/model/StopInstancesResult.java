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

import com.amazonaws.AmazonWebServiceResult;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StopInstancesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the stopped instances.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<InstanceStateChange> stoppingInstances;

    /**
     * <p>
     * Information about the stopped instances.
     * </p>
     * 
     * @return Information about the stopped instances.
     */

    public java.util.List<InstanceStateChange> getStoppingInstances() {
        if (stoppingInstances == null) {
            stoppingInstances = new com.amazonaws.internal.SdkInternalList<InstanceStateChange>();
        }
        return stoppingInstances;
    }

    /**
     * <p>
     * Information about the stopped instances.
     * </p>
     * 
     * @param stoppingInstances
     *        Information about the stopped instances.
     */

    public void setStoppingInstances(java.util.Collection<InstanceStateChange> stoppingInstances) {
        if (stoppingInstances == null) {
            this.stoppingInstances = null;
            return;
        }

        this.stoppingInstances = new com.amazonaws.internal.SdkInternalList<InstanceStateChange>(stoppingInstances);
    }

    /**
     * <p>
     * Information about the stopped instances.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStoppingInstances(java.util.Collection)} or {@link #withStoppingInstances(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param stoppingInstances
     *        Information about the stopped instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopInstancesResult withStoppingInstances(InstanceStateChange... stoppingInstances) {
        if (this.stoppingInstances == null) {
            setStoppingInstances(new com.amazonaws.internal.SdkInternalList<InstanceStateChange>(stoppingInstances.length));
        }
        for (InstanceStateChange ele : stoppingInstances) {
            this.stoppingInstances.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the stopped instances.
     * </p>
     * 
     * @param stoppingInstances
     *        Information about the stopped instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopInstancesResult withStoppingInstances(java.util.Collection<InstanceStateChange> stoppingInstances) {
        setStoppingInstances(stoppingInstances);
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
        if (getStoppingInstances() != null)
            sb.append("StoppingInstances: ").append(getStoppingInstances());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StopInstancesResult == false)
            return false;
        StopInstancesResult other = (StopInstancesResult) obj;
        if (other.getStoppingInstances() == null ^ this.getStoppingInstances() == null)
            return false;
        if (other.getStoppingInstances() != null && other.getStoppingInstances().equals(this.getStoppingInstances()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStoppingInstances() == null) ? 0 : getStoppingInstances().hashCode());
        return hashCode;
    }

    @Override
    public StopInstancesResult clone() {
        try {
            return (StopInstancesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
