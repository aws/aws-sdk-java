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
public class TerminateInstancesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the terminated instances.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<InstanceStateChange> terminatingInstances;

    /**
     * <p>
     * Information about the terminated instances.
     * </p>
     * 
     * @return Information about the terminated instances.
     */

    public java.util.List<InstanceStateChange> getTerminatingInstances() {
        if (terminatingInstances == null) {
            terminatingInstances = new com.amazonaws.internal.SdkInternalList<InstanceStateChange>();
        }
        return terminatingInstances;
    }

    /**
     * <p>
     * Information about the terminated instances.
     * </p>
     * 
     * @param terminatingInstances
     *        Information about the terminated instances.
     */

    public void setTerminatingInstances(java.util.Collection<InstanceStateChange> terminatingInstances) {
        if (terminatingInstances == null) {
            this.terminatingInstances = null;
            return;
        }

        this.terminatingInstances = new com.amazonaws.internal.SdkInternalList<InstanceStateChange>(terminatingInstances);
    }

    /**
     * <p>
     * Information about the terminated instances.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTerminatingInstances(java.util.Collection)} or {@link #withTerminatingInstances(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param terminatingInstances
     *        Information about the terminated instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TerminateInstancesResult withTerminatingInstances(InstanceStateChange... terminatingInstances) {
        if (this.terminatingInstances == null) {
            setTerminatingInstances(new com.amazonaws.internal.SdkInternalList<InstanceStateChange>(terminatingInstances.length));
        }
        for (InstanceStateChange ele : terminatingInstances) {
            this.terminatingInstances.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the terminated instances.
     * </p>
     * 
     * @param terminatingInstances
     *        Information about the terminated instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TerminateInstancesResult withTerminatingInstances(java.util.Collection<InstanceStateChange> terminatingInstances) {
        setTerminatingInstances(terminatingInstances);
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
        if (getTerminatingInstances() != null)
            sb.append("TerminatingInstances: ").append(getTerminatingInstances());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TerminateInstancesResult == false)
            return false;
        TerminateInstancesResult other = (TerminateInstancesResult) obj;
        if (other.getTerminatingInstances() == null ^ this.getTerminatingInstances() == null)
            return false;
        if (other.getTerminatingInstances() != null && other.getTerminatingInstances().equals(this.getTerminatingInstances()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTerminatingInstances() == null) ? 0 : getTerminatingInstances().hashCode());
        return hashCode;
    }

    @Override
    public TerminateInstancesResult clone() {
        try {
            return (TerminateInstancesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
