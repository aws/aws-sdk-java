/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;

/**
 * <p/>
 */
public class ModifyClusterParameterGroupResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the cluster parameter group.
     * </p>
     */
    private String parameterGroupName;
    /**
     * <p>
     * The status of the parameter group. For example, if you made a change to a parameter group name-value pair, then
     * the change could be pending a reboot of an associated cluster.
     * </p>
     */
    private String parameterGroupStatus;

    /**
     * <p>
     * The name of the cluster parameter group.
     * </p>
     * 
     * @param parameterGroupName
     *        The name of the cluster parameter group.
     */

    public void setParameterGroupName(String parameterGroupName) {
        this.parameterGroupName = parameterGroupName;
    }

    /**
     * <p>
     * The name of the cluster parameter group.
     * </p>
     * 
     * @return The name of the cluster parameter group.
     */

    public String getParameterGroupName() {
        return this.parameterGroupName;
    }

    /**
     * <p>
     * The name of the cluster parameter group.
     * </p>
     * 
     * @param parameterGroupName
     *        The name of the cluster parameter group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyClusterParameterGroupResult withParameterGroupName(String parameterGroupName) {
        setParameterGroupName(parameterGroupName);
        return this;
    }

    /**
     * <p>
     * The status of the parameter group. For example, if you made a change to a parameter group name-value pair, then
     * the change could be pending a reboot of an associated cluster.
     * </p>
     * 
     * @param parameterGroupStatus
     *        The status of the parameter group. For example, if you made a change to a parameter group name-value pair,
     *        then the change could be pending a reboot of an associated cluster.
     */

    public void setParameterGroupStatus(String parameterGroupStatus) {
        this.parameterGroupStatus = parameterGroupStatus;
    }

    /**
     * <p>
     * The status of the parameter group. For example, if you made a change to a parameter group name-value pair, then
     * the change could be pending a reboot of an associated cluster.
     * </p>
     * 
     * @return The status of the parameter group. For example, if you made a change to a parameter group name-value
     *         pair, then the change could be pending a reboot of an associated cluster.
     */

    public String getParameterGroupStatus() {
        return this.parameterGroupStatus;
    }

    /**
     * <p>
     * The status of the parameter group. For example, if you made a change to a parameter group name-value pair, then
     * the change could be pending a reboot of an associated cluster.
     * </p>
     * 
     * @param parameterGroupStatus
     *        The status of the parameter group. For example, if you made a change to a parameter group name-value pair,
     *        then the change could be pending a reboot of an associated cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyClusterParameterGroupResult withParameterGroupStatus(String parameterGroupStatus) {
        setParameterGroupStatus(parameterGroupStatus);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getParameterGroupName() != null)
            sb.append("ParameterGroupName: " + getParameterGroupName() + ",");
        if (getParameterGroupStatus() != null)
            sb.append("ParameterGroupStatus: " + getParameterGroupStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyClusterParameterGroupResult == false)
            return false;
        ModifyClusterParameterGroupResult other = (ModifyClusterParameterGroupResult) obj;
        if (other.getParameterGroupName() == null ^ this.getParameterGroupName() == null)
            return false;
        if (other.getParameterGroupName() != null && other.getParameterGroupName().equals(this.getParameterGroupName()) == false)
            return false;
        if (other.getParameterGroupStatus() == null ^ this.getParameterGroupStatus() == null)
            return false;
        if (other.getParameterGroupStatus() != null && other.getParameterGroupStatus().equals(this.getParameterGroupStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getParameterGroupName() == null) ? 0 : getParameterGroupName().hashCode());
        hashCode = prime * hashCode + ((getParameterGroupStatus() == null) ? 0 : getParameterGroupStatus().hashCode());
        return hashCode;
    }

    @Override
    public ModifyClusterParameterGroupResult clone() {
        try {
            return (ModifyClusterParameterGroupResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
