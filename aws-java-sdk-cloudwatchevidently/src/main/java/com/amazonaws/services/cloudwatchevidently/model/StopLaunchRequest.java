/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudwatchevidently.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/StopLaunch" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StopLaunchRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specify whether to consider the launch as <code>COMPLETED</code> or <code>CANCELLED</code> after it stops.
     * </p>
     */
    private String desiredState;
    /**
     * <p>
     * The name of the launch to stop.
     * </p>
     */
    private String launch;
    /**
     * <p>
     * The name or ARN of the project that contains the launch that you want to stop.
     * </p>
     */
    private String project;
    /**
     * <p>
     * A string that describes why you are stopping the launch.
     * </p>
     */
    private String reason;

    /**
     * <p>
     * Specify whether to consider the launch as <code>COMPLETED</code> or <code>CANCELLED</code> after it stops.
     * </p>
     * 
     * @param desiredState
     *        Specify whether to consider the launch as <code>COMPLETED</code> or <code>CANCELLED</code> after it stops.
     * @see LaunchStopDesiredState
     */

    public void setDesiredState(String desiredState) {
        this.desiredState = desiredState;
    }

    /**
     * <p>
     * Specify whether to consider the launch as <code>COMPLETED</code> or <code>CANCELLED</code> after it stops.
     * </p>
     * 
     * @return Specify whether to consider the launch as <code>COMPLETED</code> or <code>CANCELLED</code> after it
     *         stops.
     * @see LaunchStopDesiredState
     */

    public String getDesiredState() {
        return this.desiredState;
    }

    /**
     * <p>
     * Specify whether to consider the launch as <code>COMPLETED</code> or <code>CANCELLED</code> after it stops.
     * </p>
     * 
     * @param desiredState
     *        Specify whether to consider the launch as <code>COMPLETED</code> or <code>CANCELLED</code> after it stops.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LaunchStopDesiredState
     */

    public StopLaunchRequest withDesiredState(String desiredState) {
        setDesiredState(desiredState);
        return this;
    }

    /**
     * <p>
     * Specify whether to consider the launch as <code>COMPLETED</code> or <code>CANCELLED</code> after it stops.
     * </p>
     * 
     * @param desiredState
     *        Specify whether to consider the launch as <code>COMPLETED</code> or <code>CANCELLED</code> after it stops.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LaunchStopDesiredState
     */

    public StopLaunchRequest withDesiredState(LaunchStopDesiredState desiredState) {
        this.desiredState = desiredState.toString();
        return this;
    }

    /**
     * <p>
     * The name of the launch to stop.
     * </p>
     * 
     * @param launch
     *        The name of the launch to stop.
     */

    public void setLaunch(String launch) {
        this.launch = launch;
    }

    /**
     * <p>
     * The name of the launch to stop.
     * </p>
     * 
     * @return The name of the launch to stop.
     */

    public String getLaunch() {
        return this.launch;
    }

    /**
     * <p>
     * The name of the launch to stop.
     * </p>
     * 
     * @param launch
     *        The name of the launch to stop.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopLaunchRequest withLaunch(String launch) {
        setLaunch(launch);
        return this;
    }

    /**
     * <p>
     * The name or ARN of the project that contains the launch that you want to stop.
     * </p>
     * 
     * @param project
     *        The name or ARN of the project that contains the launch that you want to stop.
     */

    public void setProject(String project) {
        this.project = project;
    }

    /**
     * <p>
     * The name or ARN of the project that contains the launch that you want to stop.
     * </p>
     * 
     * @return The name or ARN of the project that contains the launch that you want to stop.
     */

    public String getProject() {
        return this.project;
    }

    /**
     * <p>
     * The name or ARN of the project that contains the launch that you want to stop.
     * </p>
     * 
     * @param project
     *        The name or ARN of the project that contains the launch that you want to stop.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopLaunchRequest withProject(String project) {
        setProject(project);
        return this;
    }

    /**
     * <p>
     * A string that describes why you are stopping the launch.
     * </p>
     * 
     * @param reason
     *        A string that describes why you are stopping the launch.
     */

    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * <p>
     * A string that describes why you are stopping the launch.
     * </p>
     * 
     * @return A string that describes why you are stopping the launch.
     */

    public String getReason() {
        return this.reason;
    }

    /**
     * <p>
     * A string that describes why you are stopping the launch.
     * </p>
     * 
     * @param reason
     *        A string that describes why you are stopping the launch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopLaunchRequest withReason(String reason) {
        setReason(reason);
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
        if (getDesiredState() != null)
            sb.append("DesiredState: ").append(getDesiredState()).append(",");
        if (getLaunch() != null)
            sb.append("Launch: ").append(getLaunch()).append(",");
        if (getProject() != null)
            sb.append("Project: ").append(getProject()).append(",");
        if (getReason() != null)
            sb.append("Reason: ").append(getReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StopLaunchRequest == false)
            return false;
        StopLaunchRequest other = (StopLaunchRequest) obj;
        if (other.getDesiredState() == null ^ this.getDesiredState() == null)
            return false;
        if (other.getDesiredState() != null && other.getDesiredState().equals(this.getDesiredState()) == false)
            return false;
        if (other.getLaunch() == null ^ this.getLaunch() == null)
            return false;
        if (other.getLaunch() != null && other.getLaunch().equals(this.getLaunch()) == false)
            return false;
        if (other.getProject() == null ^ this.getProject() == null)
            return false;
        if (other.getProject() != null && other.getProject().equals(this.getProject()) == false)
            return false;
        if (other.getReason() == null ^ this.getReason() == null)
            return false;
        if (other.getReason() != null && other.getReason().equals(this.getReason()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDesiredState() == null) ? 0 : getDesiredState().hashCode());
        hashCode = prime * hashCode + ((getLaunch() == null) ? 0 : getLaunch().hashCode());
        hashCode = prime * hashCode + ((getProject() == null) ? 0 : getProject().hashCode());
        hashCode = prime * hashCode + ((getReason() == null) ? 0 : getReason().hashCode());
        return hashCode;
    }

    @Override
    public StopLaunchRequest clone() {
        return (StopLaunchRequest) super.clone();
    }

}
