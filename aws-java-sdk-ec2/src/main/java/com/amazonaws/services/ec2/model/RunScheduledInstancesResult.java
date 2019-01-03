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
 * <p>
 * Contains the output of RunScheduledInstances.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RunScheduledInstancesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The IDs of the newly launched instances.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> instanceIdSet;

    /**
     * <p>
     * The IDs of the newly launched instances.
     * </p>
     * 
     * @return The IDs of the newly launched instances.
     */

    public java.util.List<String> getInstanceIdSet() {
        if (instanceIdSet == null) {
            instanceIdSet = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return instanceIdSet;
    }

    /**
     * <p>
     * The IDs of the newly launched instances.
     * </p>
     * 
     * @param instanceIdSet
     *        The IDs of the newly launched instances.
     */

    public void setInstanceIdSet(java.util.Collection<String> instanceIdSet) {
        if (instanceIdSet == null) {
            this.instanceIdSet = null;
            return;
        }

        this.instanceIdSet = new com.amazonaws.internal.SdkInternalList<String>(instanceIdSet);
    }

    /**
     * <p>
     * The IDs of the newly launched instances.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInstanceIdSet(java.util.Collection)} or {@link #withInstanceIdSet(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param instanceIdSet
     *        The IDs of the newly launched instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunScheduledInstancesResult withInstanceIdSet(String... instanceIdSet) {
        if (this.instanceIdSet == null) {
            setInstanceIdSet(new com.amazonaws.internal.SdkInternalList<String>(instanceIdSet.length));
        }
        for (String ele : instanceIdSet) {
            this.instanceIdSet.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the newly launched instances.
     * </p>
     * 
     * @param instanceIdSet
     *        The IDs of the newly launched instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunScheduledInstancesResult withInstanceIdSet(java.util.Collection<String> instanceIdSet) {
        setInstanceIdSet(instanceIdSet);
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
        if (getInstanceIdSet() != null)
            sb.append("InstanceIdSet: ").append(getInstanceIdSet());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RunScheduledInstancesResult == false)
            return false;
        RunScheduledInstancesResult other = (RunScheduledInstancesResult) obj;
        if (other.getInstanceIdSet() == null ^ this.getInstanceIdSet() == null)
            return false;
        if (other.getInstanceIdSet() != null && other.getInstanceIdSet().equals(this.getInstanceIdSet()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceIdSet() == null) ? 0 : getInstanceIdSet().hashCode());
        return hashCode;
    }

    @Override
    public RunScheduledInstancesResult clone() {
        try {
            return (RunScheduledInstancesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
