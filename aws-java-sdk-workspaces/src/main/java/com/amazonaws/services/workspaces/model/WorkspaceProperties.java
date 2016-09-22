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
package com.amazonaws.services.workspaces.model;

import java.io.Serializable;

/**
 * <p>
 * Describes the properties of a WorkSpace.
 * </p>
 */
public class WorkspaceProperties implements Serializable, Cloneable {

    /**
     * <p>
     * The running mode of the WorkSpace. AlwaysOn WorkSpaces are billed monthly. AutoStop WorkSpaces are billed by the
     * hour and stopped when no longer being used in order to save on costs.
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
     * The running mode of the WorkSpace. AlwaysOn WorkSpaces are billed monthly. AutoStop WorkSpaces are billed by the
     * hour and stopped when no longer being used in order to save on costs.
     * </p>
     * 
     * @param runningMode
     *        The running mode of the WorkSpace. AlwaysOn WorkSpaces are billed monthly. AutoStop WorkSpaces are billed
     *        by the hour and stopped when no longer being used in order to save on costs.
     * @see RunningMode
     */

    public void setRunningMode(String runningMode) {
        this.runningMode = runningMode;
    }

    /**
     * <p>
     * The running mode of the WorkSpace. AlwaysOn WorkSpaces are billed monthly. AutoStop WorkSpaces are billed by the
     * hour and stopped when no longer being used in order to save on costs.
     * </p>
     * 
     * @return The running mode of the WorkSpace. AlwaysOn WorkSpaces are billed monthly. AutoStop WorkSpaces are billed
     *         by the hour and stopped when no longer being used in order to save on costs.
     * @see RunningMode
     */

    public String getRunningMode() {
        return this.runningMode;
    }

    /**
     * <p>
     * The running mode of the WorkSpace. AlwaysOn WorkSpaces are billed monthly. AutoStop WorkSpaces are billed by the
     * hour and stopped when no longer being used in order to save on costs.
     * </p>
     * 
     * @param runningMode
     *        The running mode of the WorkSpace. AlwaysOn WorkSpaces are billed monthly. AutoStop WorkSpaces are billed
     *        by the hour and stopped when no longer being used in order to save on costs.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RunningMode
     */

    public WorkspaceProperties withRunningMode(String runningMode) {
        setRunningMode(runningMode);
        return this;
    }

    /**
     * <p>
     * The running mode of the WorkSpace. AlwaysOn WorkSpaces are billed monthly. AutoStop WorkSpaces are billed by the
     * hour and stopped when no longer being used in order to save on costs.
     * </p>
     * 
     * @param runningMode
     *        The running mode of the WorkSpace. AlwaysOn WorkSpaces are billed monthly. AutoStop WorkSpaces are billed
     *        by the hour and stopped when no longer being used in order to save on costs.
     * @see RunningMode
     */

    public void setRunningMode(RunningMode runningMode) {
        this.runningMode = runningMode.toString();
    }

    /**
     * <p>
     * The running mode of the WorkSpace. AlwaysOn WorkSpaces are billed monthly. AutoStop WorkSpaces are billed by the
     * hour and stopped when no longer being used in order to save on costs.
     * </p>
     * 
     * @param runningMode
     *        The running mode of the WorkSpace. AlwaysOn WorkSpaces are billed monthly. AutoStop WorkSpaces are billed
     *        by the hour and stopped when no longer being used in order to save on costs.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RunningMode
     */

    public WorkspaceProperties withRunningMode(RunningMode runningMode) {
        setRunningMode(runningMode);
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
        if (getRunningMode() != null)
            sb.append("RunningMode: " + getRunningMode() + ",");
        if (getRunningModeAutoStopTimeoutInMinutes() != null)
            sb.append("RunningModeAutoStopTimeoutInMinutes: " + getRunningModeAutoStopTimeoutInMinutes());
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRunningMode() == null) ? 0 : getRunningMode().hashCode());
        hashCode = prime * hashCode + ((getRunningModeAutoStopTimeoutInMinutes() == null) ? 0 : getRunningModeAutoStopTimeoutInMinutes().hashCode());
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
}
