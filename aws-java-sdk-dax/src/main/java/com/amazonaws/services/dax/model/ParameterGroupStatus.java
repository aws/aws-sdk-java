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
package com.amazonaws.services.dax.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The status of a parameter group.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dax-2017-04-19/ParameterGroupStatus" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ParameterGroupStatus implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the parameter group.
     * </p>
     */
    private String parameterGroupName;
    /**
     * <p>
     * The status of parameter updates.
     * </p>
     */
    private String parameterApplyStatus;
    /**
     * <p>
     * The node IDs of one or more nodes to be rebooted.
     * </p>
     */
    private java.util.List<String> nodeIdsToReboot;

    /**
     * <p>
     * The name of the parameter group.
     * </p>
     * 
     * @param parameterGroupName
     *        The name of the parameter group.
     */

    public void setParameterGroupName(String parameterGroupName) {
        this.parameterGroupName = parameterGroupName;
    }

    /**
     * <p>
     * The name of the parameter group.
     * </p>
     * 
     * @return The name of the parameter group.
     */

    public String getParameterGroupName() {
        return this.parameterGroupName;
    }

    /**
     * <p>
     * The name of the parameter group.
     * </p>
     * 
     * @param parameterGroupName
     *        The name of the parameter group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterGroupStatus withParameterGroupName(String parameterGroupName) {
        setParameterGroupName(parameterGroupName);
        return this;
    }

    /**
     * <p>
     * The status of parameter updates.
     * </p>
     * 
     * @param parameterApplyStatus
     *        The status of parameter updates.
     */

    public void setParameterApplyStatus(String parameterApplyStatus) {
        this.parameterApplyStatus = parameterApplyStatus;
    }

    /**
     * <p>
     * The status of parameter updates.
     * </p>
     * 
     * @return The status of parameter updates.
     */

    public String getParameterApplyStatus() {
        return this.parameterApplyStatus;
    }

    /**
     * <p>
     * The status of parameter updates.
     * </p>
     * 
     * @param parameterApplyStatus
     *        The status of parameter updates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterGroupStatus withParameterApplyStatus(String parameterApplyStatus) {
        setParameterApplyStatus(parameterApplyStatus);
        return this;
    }

    /**
     * <p>
     * The node IDs of one or more nodes to be rebooted.
     * </p>
     * 
     * @return The node IDs of one or more nodes to be rebooted.
     */

    public java.util.List<String> getNodeIdsToReboot() {
        return nodeIdsToReboot;
    }

    /**
     * <p>
     * The node IDs of one or more nodes to be rebooted.
     * </p>
     * 
     * @param nodeIdsToReboot
     *        The node IDs of one or more nodes to be rebooted.
     */

    public void setNodeIdsToReboot(java.util.Collection<String> nodeIdsToReboot) {
        if (nodeIdsToReboot == null) {
            this.nodeIdsToReboot = null;
            return;
        }

        this.nodeIdsToReboot = new java.util.ArrayList<String>(nodeIdsToReboot);
    }

    /**
     * <p>
     * The node IDs of one or more nodes to be rebooted.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNodeIdsToReboot(java.util.Collection)} or {@link #withNodeIdsToReboot(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param nodeIdsToReboot
     *        The node IDs of one or more nodes to be rebooted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterGroupStatus withNodeIdsToReboot(String... nodeIdsToReboot) {
        if (this.nodeIdsToReboot == null) {
            setNodeIdsToReboot(new java.util.ArrayList<String>(nodeIdsToReboot.length));
        }
        for (String ele : nodeIdsToReboot) {
            this.nodeIdsToReboot.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The node IDs of one or more nodes to be rebooted.
     * </p>
     * 
     * @param nodeIdsToReboot
     *        The node IDs of one or more nodes to be rebooted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterGroupStatus withNodeIdsToReboot(java.util.Collection<String> nodeIdsToReboot) {
        setNodeIdsToReboot(nodeIdsToReboot);
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
        if (getParameterGroupName() != null)
            sb.append("ParameterGroupName: ").append(getParameterGroupName()).append(",");
        if (getParameterApplyStatus() != null)
            sb.append("ParameterApplyStatus: ").append(getParameterApplyStatus()).append(",");
        if (getNodeIdsToReboot() != null)
            sb.append("NodeIdsToReboot: ").append(getNodeIdsToReboot());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ParameterGroupStatus == false)
            return false;
        ParameterGroupStatus other = (ParameterGroupStatus) obj;
        if (other.getParameterGroupName() == null ^ this.getParameterGroupName() == null)
            return false;
        if (other.getParameterGroupName() != null && other.getParameterGroupName().equals(this.getParameterGroupName()) == false)
            return false;
        if (other.getParameterApplyStatus() == null ^ this.getParameterApplyStatus() == null)
            return false;
        if (other.getParameterApplyStatus() != null && other.getParameterApplyStatus().equals(this.getParameterApplyStatus()) == false)
            return false;
        if (other.getNodeIdsToReboot() == null ^ this.getNodeIdsToReboot() == null)
            return false;
        if (other.getNodeIdsToReboot() != null && other.getNodeIdsToReboot().equals(this.getNodeIdsToReboot()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getParameterGroupName() == null) ? 0 : getParameterGroupName().hashCode());
        hashCode = prime * hashCode + ((getParameterApplyStatus() == null) ? 0 : getParameterApplyStatus().hashCode());
        hashCode = prime * hashCode + ((getNodeIdsToReboot() == null) ? 0 : getNodeIdsToReboot().hashCode());
        return hashCode;
    }

    @Override
    public ParameterGroupStatus clone() {
        try {
            return (ParameterGroupStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dax.model.transform.ParameterGroupStatusMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
