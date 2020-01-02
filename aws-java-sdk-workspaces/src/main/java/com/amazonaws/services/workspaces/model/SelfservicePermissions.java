/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Describes the self-service permissions for a directory. For more information, see <a
 * href="https://docs.aws.amazon.com/workspaces/latest/adminguide/enable-user-self-service-workspace-management.html"
 * >Enable Self-Service WorkSpace Management Capabilities for Your Users</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/SelfservicePermissions" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SelfservicePermissions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies whether users can restart their WorkSpace.
     * </p>
     */
    private String restartWorkspace;
    /**
     * <p>
     * Specifies whether users can increase the volume size of the drives on their WorkSpace.
     * </p>
     */
    private String increaseVolumeSize;
    /**
     * <p>
     * Specifies whether users can change the compute type (bundle) for their WorkSpace.
     * </p>
     */
    private String changeComputeType;
    /**
     * <p>
     * Specifies whether users can switch the running mode of their WorkSpace.
     * </p>
     */
    private String switchRunningMode;
    /**
     * <p>
     * Specifies whether users can rebuild the operating system of a WorkSpace to its original state.
     * </p>
     */
    private String rebuildWorkspace;

    /**
     * <p>
     * Specifies whether users can restart their WorkSpace.
     * </p>
     * 
     * @param restartWorkspace
     *        Specifies whether users can restart their WorkSpace.
     * @see ReconnectEnum
     */

    public void setRestartWorkspace(String restartWorkspace) {
        this.restartWorkspace = restartWorkspace;
    }

    /**
     * <p>
     * Specifies whether users can restart their WorkSpace.
     * </p>
     * 
     * @return Specifies whether users can restart their WorkSpace.
     * @see ReconnectEnum
     */

    public String getRestartWorkspace() {
        return this.restartWorkspace;
    }

    /**
     * <p>
     * Specifies whether users can restart their WorkSpace.
     * </p>
     * 
     * @param restartWorkspace
     *        Specifies whether users can restart their WorkSpace.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReconnectEnum
     */

    public SelfservicePermissions withRestartWorkspace(String restartWorkspace) {
        setRestartWorkspace(restartWorkspace);
        return this;
    }

    /**
     * <p>
     * Specifies whether users can restart their WorkSpace.
     * </p>
     * 
     * @param restartWorkspace
     *        Specifies whether users can restart their WorkSpace.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReconnectEnum
     */

    public SelfservicePermissions withRestartWorkspace(ReconnectEnum restartWorkspace) {
        this.restartWorkspace = restartWorkspace.toString();
        return this;
    }

    /**
     * <p>
     * Specifies whether users can increase the volume size of the drives on their WorkSpace.
     * </p>
     * 
     * @param increaseVolumeSize
     *        Specifies whether users can increase the volume size of the drives on their WorkSpace.
     * @see ReconnectEnum
     */

    public void setIncreaseVolumeSize(String increaseVolumeSize) {
        this.increaseVolumeSize = increaseVolumeSize;
    }

    /**
     * <p>
     * Specifies whether users can increase the volume size of the drives on their WorkSpace.
     * </p>
     * 
     * @return Specifies whether users can increase the volume size of the drives on their WorkSpace.
     * @see ReconnectEnum
     */

    public String getIncreaseVolumeSize() {
        return this.increaseVolumeSize;
    }

    /**
     * <p>
     * Specifies whether users can increase the volume size of the drives on their WorkSpace.
     * </p>
     * 
     * @param increaseVolumeSize
     *        Specifies whether users can increase the volume size of the drives on their WorkSpace.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReconnectEnum
     */

    public SelfservicePermissions withIncreaseVolumeSize(String increaseVolumeSize) {
        setIncreaseVolumeSize(increaseVolumeSize);
        return this;
    }

    /**
     * <p>
     * Specifies whether users can increase the volume size of the drives on their WorkSpace.
     * </p>
     * 
     * @param increaseVolumeSize
     *        Specifies whether users can increase the volume size of the drives on their WorkSpace.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReconnectEnum
     */

    public SelfservicePermissions withIncreaseVolumeSize(ReconnectEnum increaseVolumeSize) {
        this.increaseVolumeSize = increaseVolumeSize.toString();
        return this;
    }

    /**
     * <p>
     * Specifies whether users can change the compute type (bundle) for their WorkSpace.
     * </p>
     * 
     * @param changeComputeType
     *        Specifies whether users can change the compute type (bundle) for their WorkSpace.
     * @see ReconnectEnum
     */

    public void setChangeComputeType(String changeComputeType) {
        this.changeComputeType = changeComputeType;
    }

    /**
     * <p>
     * Specifies whether users can change the compute type (bundle) for their WorkSpace.
     * </p>
     * 
     * @return Specifies whether users can change the compute type (bundle) for their WorkSpace.
     * @see ReconnectEnum
     */

    public String getChangeComputeType() {
        return this.changeComputeType;
    }

    /**
     * <p>
     * Specifies whether users can change the compute type (bundle) for their WorkSpace.
     * </p>
     * 
     * @param changeComputeType
     *        Specifies whether users can change the compute type (bundle) for their WorkSpace.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReconnectEnum
     */

    public SelfservicePermissions withChangeComputeType(String changeComputeType) {
        setChangeComputeType(changeComputeType);
        return this;
    }

    /**
     * <p>
     * Specifies whether users can change the compute type (bundle) for their WorkSpace.
     * </p>
     * 
     * @param changeComputeType
     *        Specifies whether users can change the compute type (bundle) for their WorkSpace.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReconnectEnum
     */

    public SelfservicePermissions withChangeComputeType(ReconnectEnum changeComputeType) {
        this.changeComputeType = changeComputeType.toString();
        return this;
    }

    /**
     * <p>
     * Specifies whether users can switch the running mode of their WorkSpace.
     * </p>
     * 
     * @param switchRunningMode
     *        Specifies whether users can switch the running mode of their WorkSpace.
     * @see ReconnectEnum
     */

    public void setSwitchRunningMode(String switchRunningMode) {
        this.switchRunningMode = switchRunningMode;
    }

    /**
     * <p>
     * Specifies whether users can switch the running mode of their WorkSpace.
     * </p>
     * 
     * @return Specifies whether users can switch the running mode of their WorkSpace.
     * @see ReconnectEnum
     */

    public String getSwitchRunningMode() {
        return this.switchRunningMode;
    }

    /**
     * <p>
     * Specifies whether users can switch the running mode of their WorkSpace.
     * </p>
     * 
     * @param switchRunningMode
     *        Specifies whether users can switch the running mode of their WorkSpace.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReconnectEnum
     */

    public SelfservicePermissions withSwitchRunningMode(String switchRunningMode) {
        setSwitchRunningMode(switchRunningMode);
        return this;
    }

    /**
     * <p>
     * Specifies whether users can switch the running mode of their WorkSpace.
     * </p>
     * 
     * @param switchRunningMode
     *        Specifies whether users can switch the running mode of their WorkSpace.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReconnectEnum
     */

    public SelfservicePermissions withSwitchRunningMode(ReconnectEnum switchRunningMode) {
        this.switchRunningMode = switchRunningMode.toString();
        return this;
    }

    /**
     * <p>
     * Specifies whether users can rebuild the operating system of a WorkSpace to its original state.
     * </p>
     * 
     * @param rebuildWorkspace
     *        Specifies whether users can rebuild the operating system of a WorkSpace to its original state.
     * @see ReconnectEnum
     */

    public void setRebuildWorkspace(String rebuildWorkspace) {
        this.rebuildWorkspace = rebuildWorkspace;
    }

    /**
     * <p>
     * Specifies whether users can rebuild the operating system of a WorkSpace to its original state.
     * </p>
     * 
     * @return Specifies whether users can rebuild the operating system of a WorkSpace to its original state.
     * @see ReconnectEnum
     */

    public String getRebuildWorkspace() {
        return this.rebuildWorkspace;
    }

    /**
     * <p>
     * Specifies whether users can rebuild the operating system of a WorkSpace to its original state.
     * </p>
     * 
     * @param rebuildWorkspace
     *        Specifies whether users can rebuild the operating system of a WorkSpace to its original state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReconnectEnum
     */

    public SelfservicePermissions withRebuildWorkspace(String rebuildWorkspace) {
        setRebuildWorkspace(rebuildWorkspace);
        return this;
    }

    /**
     * <p>
     * Specifies whether users can rebuild the operating system of a WorkSpace to its original state.
     * </p>
     * 
     * @param rebuildWorkspace
     *        Specifies whether users can rebuild the operating system of a WorkSpace to its original state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReconnectEnum
     */

    public SelfservicePermissions withRebuildWorkspace(ReconnectEnum rebuildWorkspace) {
        this.rebuildWorkspace = rebuildWorkspace.toString();
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
        if (getRestartWorkspace() != null)
            sb.append("RestartWorkspace: ").append(getRestartWorkspace()).append(",");
        if (getIncreaseVolumeSize() != null)
            sb.append("IncreaseVolumeSize: ").append(getIncreaseVolumeSize()).append(",");
        if (getChangeComputeType() != null)
            sb.append("ChangeComputeType: ").append(getChangeComputeType()).append(",");
        if (getSwitchRunningMode() != null)
            sb.append("SwitchRunningMode: ").append(getSwitchRunningMode()).append(",");
        if (getRebuildWorkspace() != null)
            sb.append("RebuildWorkspace: ").append(getRebuildWorkspace());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SelfservicePermissions == false)
            return false;
        SelfservicePermissions other = (SelfservicePermissions) obj;
        if (other.getRestartWorkspace() == null ^ this.getRestartWorkspace() == null)
            return false;
        if (other.getRestartWorkspace() != null && other.getRestartWorkspace().equals(this.getRestartWorkspace()) == false)
            return false;
        if (other.getIncreaseVolumeSize() == null ^ this.getIncreaseVolumeSize() == null)
            return false;
        if (other.getIncreaseVolumeSize() != null && other.getIncreaseVolumeSize().equals(this.getIncreaseVolumeSize()) == false)
            return false;
        if (other.getChangeComputeType() == null ^ this.getChangeComputeType() == null)
            return false;
        if (other.getChangeComputeType() != null && other.getChangeComputeType().equals(this.getChangeComputeType()) == false)
            return false;
        if (other.getSwitchRunningMode() == null ^ this.getSwitchRunningMode() == null)
            return false;
        if (other.getSwitchRunningMode() != null && other.getSwitchRunningMode().equals(this.getSwitchRunningMode()) == false)
            return false;
        if (other.getRebuildWorkspace() == null ^ this.getRebuildWorkspace() == null)
            return false;
        if (other.getRebuildWorkspace() != null && other.getRebuildWorkspace().equals(this.getRebuildWorkspace()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRestartWorkspace() == null) ? 0 : getRestartWorkspace().hashCode());
        hashCode = prime * hashCode + ((getIncreaseVolumeSize() == null) ? 0 : getIncreaseVolumeSize().hashCode());
        hashCode = prime * hashCode + ((getChangeComputeType() == null) ? 0 : getChangeComputeType().hashCode());
        hashCode = prime * hashCode + ((getSwitchRunningMode() == null) ? 0 : getSwitchRunningMode().hashCode());
        hashCode = prime * hashCode + ((getRebuildWorkspace() == null) ? 0 : getRebuildWorkspace().hashCode());
        return hashCode;
    }

    @Override
    public SelfservicePermissions clone() {
        try {
            return (SelfservicePermissions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.workspaces.model.transform.SelfservicePermissionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
