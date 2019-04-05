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
package com.amazonaws.services.workspaces.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a WorkSpace.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/WorkspaceProperties" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WorkspaceProperties implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The running mode. For more information, see <a
     * href="https://docs.aws.amazon.com/workspaces/latest/adminguide/running-mode.html">Manage the WorkSpace Running
     * Mode</a>.
     * </p>
     */
    private String runningMode;
    /**
     * <p>
     * The time after a user logs off when WorkSpaces are automatically stopped. Configured in 60 minute intervals.
     * </p>
     */
    private Integer runningModeAutoStopTimeoutInMinutes;
    /**
     * <p>
     * The size of the root volume.
     * </p>
     */
    private Integer rootVolumeSizeGib;
    /**
     * <p>
     * The size of the user storage.
     * </p>
     */
    private Integer userVolumeSizeGib;
    /**
     * <p>
     * The compute type. For more information, see <a
     * href="http://aws.amazon.com/workspaces/details/#Amazon_WorkSpaces_Bundles">Amazon WorkSpaces Bundles</a>.
     * </p>
     */
    private String computeTypeName;

    /**
     * <p>
     * The running mode. For more information, see <a
     * href="https://docs.aws.amazon.com/workspaces/latest/adminguide/running-mode.html">Manage the WorkSpace Running
     * Mode</a>.
     * </p>
     * 
     * @param runningMode
     *        The running mode. For more information, see <a
     *        href="https://docs.aws.amazon.com/workspaces/latest/adminguide/running-mode.html">Manage the WorkSpace
     *        Running Mode</a>.
     * @see RunningMode
     */

    public void setRunningMode(String runningMode) {
        this.runningMode = runningMode;
    }

    /**
     * <p>
     * The running mode. For more information, see <a
     * href="https://docs.aws.amazon.com/workspaces/latest/adminguide/running-mode.html">Manage the WorkSpace Running
     * Mode</a>.
     * </p>
     * 
     * @return The running mode. For more information, see <a
     *         href="https://docs.aws.amazon.com/workspaces/latest/adminguide/running-mode.html">Manage the WorkSpace
     *         Running Mode</a>.
     * @see RunningMode
     */

    public String getRunningMode() {
        return this.runningMode;
    }

    /**
     * <p>
     * The running mode. For more information, see <a
     * href="https://docs.aws.amazon.com/workspaces/latest/adminguide/running-mode.html">Manage the WorkSpace Running
     * Mode</a>.
     * </p>
     * 
     * @param runningMode
     *        The running mode. For more information, see <a
     *        href="https://docs.aws.amazon.com/workspaces/latest/adminguide/running-mode.html">Manage the WorkSpace
     *        Running Mode</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RunningMode
     */

    public WorkspaceProperties withRunningMode(String runningMode) {
        setRunningMode(runningMode);
        return this;
    }

    /**
     * <p>
     * The running mode. For more information, see <a
     * href="https://docs.aws.amazon.com/workspaces/latest/adminguide/running-mode.html">Manage the WorkSpace Running
     * Mode</a>.
     * </p>
     * 
     * @param runningMode
     *        The running mode. For more information, see <a
     *        href="https://docs.aws.amazon.com/workspaces/latest/adminguide/running-mode.html">Manage the WorkSpace
     *        Running Mode</a>.
     * @see RunningMode
     */

    public void setRunningMode(RunningMode runningMode) {
        withRunningMode(runningMode);
    }

    /**
     * <p>
     * The running mode. For more information, see <a
     * href="https://docs.aws.amazon.com/workspaces/latest/adminguide/running-mode.html">Manage the WorkSpace Running
     * Mode</a>.
     * </p>
     * 
     * @param runningMode
     *        The running mode. For more information, see <a
     *        href="https://docs.aws.amazon.com/workspaces/latest/adminguide/running-mode.html">Manage the WorkSpace
     *        Running Mode</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RunningMode
     */

    public WorkspaceProperties withRunningMode(RunningMode runningMode) {
        this.runningMode = runningMode.toString();
        return this;
    }

    /**
     * <p>
     * The time after a user logs off when WorkSpaces are automatically stopped. Configured in 60 minute intervals.
     * </p>
     * 
     * @param runningModeAutoStopTimeoutInMinutes
     *        The time after a user logs off when WorkSpaces are automatically stopped. Configured in 60 minute
     *        intervals.
     */

    public void setRunningModeAutoStopTimeoutInMinutes(Integer runningModeAutoStopTimeoutInMinutes) {
        this.runningModeAutoStopTimeoutInMinutes = runningModeAutoStopTimeoutInMinutes;
    }

    /**
     * <p>
     * The time after a user logs off when WorkSpaces are automatically stopped. Configured in 60 minute intervals.
     * </p>
     * 
     * @return The time after a user logs off when WorkSpaces are automatically stopped. Configured in 60 minute
     *         intervals.
     */

    public Integer getRunningModeAutoStopTimeoutInMinutes() {
        return this.runningModeAutoStopTimeoutInMinutes;
    }

    /**
     * <p>
     * The time after a user logs off when WorkSpaces are automatically stopped. Configured in 60 minute intervals.
     * </p>
     * 
     * @param runningModeAutoStopTimeoutInMinutes
     *        The time after a user logs off when WorkSpaces are automatically stopped. Configured in 60 minute
     *        intervals.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkspaceProperties withRunningModeAutoStopTimeoutInMinutes(Integer runningModeAutoStopTimeoutInMinutes) {
        setRunningModeAutoStopTimeoutInMinutes(runningModeAutoStopTimeoutInMinutes);
        return this;
    }

    /**
     * <p>
     * The size of the root volume.
     * </p>
     * 
     * @param rootVolumeSizeGib
     *        The size of the root volume.
     */

    public void setRootVolumeSizeGib(Integer rootVolumeSizeGib) {
        this.rootVolumeSizeGib = rootVolumeSizeGib;
    }

    /**
     * <p>
     * The size of the root volume.
     * </p>
     * 
     * @return The size of the root volume.
     */

    public Integer getRootVolumeSizeGib() {
        return this.rootVolumeSizeGib;
    }

    /**
     * <p>
     * The size of the root volume.
     * </p>
     * 
     * @param rootVolumeSizeGib
     *        The size of the root volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkspaceProperties withRootVolumeSizeGib(Integer rootVolumeSizeGib) {
        setRootVolumeSizeGib(rootVolumeSizeGib);
        return this;
    }

    /**
     * <p>
     * The size of the user storage.
     * </p>
     * 
     * @param userVolumeSizeGib
     *        The size of the user storage.
     */

    public void setUserVolumeSizeGib(Integer userVolumeSizeGib) {
        this.userVolumeSizeGib = userVolumeSizeGib;
    }

    /**
     * <p>
     * The size of the user storage.
     * </p>
     * 
     * @return The size of the user storage.
     */

    public Integer getUserVolumeSizeGib() {
        return this.userVolumeSizeGib;
    }

    /**
     * <p>
     * The size of the user storage.
     * </p>
     * 
     * @param userVolumeSizeGib
     *        The size of the user storage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkspaceProperties withUserVolumeSizeGib(Integer userVolumeSizeGib) {
        setUserVolumeSizeGib(userVolumeSizeGib);
        return this;
    }

    /**
     * <p>
     * The compute type. For more information, see <a
     * href="http://aws.amazon.com/workspaces/details/#Amazon_WorkSpaces_Bundles">Amazon WorkSpaces Bundles</a>.
     * </p>
     * 
     * @param computeTypeName
     *        The compute type. For more information, see <a
     *        href="http://aws.amazon.com/workspaces/details/#Amazon_WorkSpaces_Bundles">Amazon WorkSpaces Bundles</a>.
     * @see Compute
     */

    public void setComputeTypeName(String computeTypeName) {
        this.computeTypeName = computeTypeName;
    }

    /**
     * <p>
     * The compute type. For more information, see <a
     * href="http://aws.amazon.com/workspaces/details/#Amazon_WorkSpaces_Bundles">Amazon WorkSpaces Bundles</a>.
     * </p>
     * 
     * @return The compute type. For more information, see <a
     *         href="http://aws.amazon.com/workspaces/details/#Amazon_WorkSpaces_Bundles">Amazon WorkSpaces Bundles</a>.
     * @see Compute
     */

    public String getComputeTypeName() {
        return this.computeTypeName;
    }

    /**
     * <p>
     * The compute type. For more information, see <a
     * href="http://aws.amazon.com/workspaces/details/#Amazon_WorkSpaces_Bundles">Amazon WorkSpaces Bundles</a>.
     * </p>
     * 
     * @param computeTypeName
     *        The compute type. For more information, see <a
     *        href="http://aws.amazon.com/workspaces/details/#Amazon_WorkSpaces_Bundles">Amazon WorkSpaces Bundles</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Compute
     */

    public WorkspaceProperties withComputeTypeName(String computeTypeName) {
        setComputeTypeName(computeTypeName);
        return this;
    }

    /**
     * <p>
     * The compute type. For more information, see <a
     * href="http://aws.amazon.com/workspaces/details/#Amazon_WorkSpaces_Bundles">Amazon WorkSpaces Bundles</a>.
     * </p>
     * 
     * @param computeTypeName
     *        The compute type. For more information, see <a
     *        href="http://aws.amazon.com/workspaces/details/#Amazon_WorkSpaces_Bundles">Amazon WorkSpaces Bundles</a>.
     * @see Compute
     */

    public void setComputeTypeName(Compute computeTypeName) {
        withComputeTypeName(computeTypeName);
    }

    /**
     * <p>
     * The compute type. For more information, see <a
     * href="http://aws.amazon.com/workspaces/details/#Amazon_WorkSpaces_Bundles">Amazon WorkSpaces Bundles</a>.
     * </p>
     * 
     * @param computeTypeName
     *        The compute type. For more information, see <a
     *        href="http://aws.amazon.com/workspaces/details/#Amazon_WorkSpaces_Bundles">Amazon WorkSpaces Bundles</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Compute
     */

    public WorkspaceProperties withComputeTypeName(Compute computeTypeName) {
        this.computeTypeName = computeTypeName.toString();
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
        if (getRunningMode() != null)
            sb.append("RunningMode: ").append(getRunningMode()).append(",");
        if (getRunningModeAutoStopTimeoutInMinutes() != null)
            sb.append("RunningModeAutoStopTimeoutInMinutes: ").append(getRunningModeAutoStopTimeoutInMinutes()).append(",");
        if (getRootVolumeSizeGib() != null)
            sb.append("RootVolumeSizeGib: ").append(getRootVolumeSizeGib()).append(",");
        if (getUserVolumeSizeGib() != null)
            sb.append("UserVolumeSizeGib: ").append(getUserVolumeSizeGib()).append(",");
        if (getComputeTypeName() != null)
            sb.append("ComputeTypeName: ").append(getComputeTypeName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WorkspaceProperties == false)
            return false;
        WorkspaceProperties other = (WorkspaceProperties) obj;
        if (other.getRunningMode() == null ^ this.getRunningMode() == null)
            return false;
        if (other.getRunningMode() != null && other.getRunningMode().equals(this.getRunningMode()) == false)
            return false;
        if (other.getRunningModeAutoStopTimeoutInMinutes() == null ^ this.getRunningModeAutoStopTimeoutInMinutes() == null)
            return false;
        if (other.getRunningModeAutoStopTimeoutInMinutes() != null
                && other.getRunningModeAutoStopTimeoutInMinutes().equals(this.getRunningModeAutoStopTimeoutInMinutes()) == false)
            return false;
        if (other.getRootVolumeSizeGib() == null ^ this.getRootVolumeSizeGib() == null)
            return false;
        if (other.getRootVolumeSizeGib() != null && other.getRootVolumeSizeGib().equals(this.getRootVolumeSizeGib()) == false)
            return false;
        if (other.getUserVolumeSizeGib() == null ^ this.getUserVolumeSizeGib() == null)
            return false;
        if (other.getUserVolumeSizeGib() != null && other.getUserVolumeSizeGib().equals(this.getUserVolumeSizeGib()) == false)
            return false;
        if (other.getComputeTypeName() == null ^ this.getComputeTypeName() == null)
            return false;
        if (other.getComputeTypeName() != null && other.getComputeTypeName().equals(this.getComputeTypeName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRunningMode() == null) ? 0 : getRunningMode().hashCode());
        hashCode = prime * hashCode + ((getRunningModeAutoStopTimeoutInMinutes() == null) ? 0 : getRunningModeAutoStopTimeoutInMinutes().hashCode());
        hashCode = prime * hashCode + ((getRootVolumeSizeGib() == null) ? 0 : getRootVolumeSizeGib().hashCode());
        hashCode = prime * hashCode + ((getUserVolumeSizeGib() == null) ? 0 : getUserVolumeSizeGib().hashCode());
        hashCode = prime * hashCode + ((getComputeTypeName() == null) ? 0 : getComputeTypeName().hashCode());
        return hashCode;
    }

    @Override
    public WorkspaceProperties clone() {
        try {
            return (WorkspaceProperties) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.workspaces.model.transform.WorkspacePropertiesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
