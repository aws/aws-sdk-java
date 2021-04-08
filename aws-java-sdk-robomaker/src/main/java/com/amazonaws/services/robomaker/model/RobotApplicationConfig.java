/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.robomaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Application configuration information for a robot.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/RobotApplicationConfig" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RobotApplicationConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The application information for the robot application.
     * </p>
     */
    private String application;
    /**
     * <p>
     * The version of the robot application.
     * </p>
     */
    private String applicationVersion;
    /**
     * <p>
     * The launch configuration for the robot application.
     * </p>
     */
    private LaunchConfig launchConfig;
    /**
     * <p>
     * The upload configurations for the robot application.
     * </p>
     */
    private java.util.List<UploadConfiguration> uploadConfigurations;
    /**
     * <p>
     * A Boolean indicating whether to use default upload configurations. By default, <code>.ros</code> and
     * <code>.gazebo</code> files are uploaded when the application terminates and all ROS topics will be recorded.
     * </p>
     * <p>
     * If you set this value, you must specify an <code>outputLocation</code>.
     * </p>
     */
    private Boolean useDefaultUploadConfigurations;
    /**
     * <p>
     * Information about tools configured for the robot application.
     * </p>
     */
    private java.util.List<Tool> tools;
    /**
     * <p>
     * A Boolean indicating whether to use default robot application tools. The default tools are rviz, rqt, terminal
     * and rosbag record. The default is <code>False</code>.
     * </p>
     */
    private Boolean useDefaultTools;

    /**
     * <p>
     * The application information for the robot application.
     * </p>
     * 
     * @param application
     *        The application information for the robot application.
     */

    public void setApplication(String application) {
        this.application = application;
    }

    /**
     * <p>
     * The application information for the robot application.
     * </p>
     * 
     * @return The application information for the robot application.
     */

    public String getApplication() {
        return this.application;
    }

    /**
     * <p>
     * The application information for the robot application.
     * </p>
     * 
     * @param application
     *        The application information for the robot application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RobotApplicationConfig withApplication(String application) {
        setApplication(application);
        return this;
    }

    /**
     * <p>
     * The version of the robot application.
     * </p>
     * 
     * @param applicationVersion
     *        The version of the robot application.
     */

    public void setApplicationVersion(String applicationVersion) {
        this.applicationVersion = applicationVersion;
    }

    /**
     * <p>
     * The version of the robot application.
     * </p>
     * 
     * @return The version of the robot application.
     */

    public String getApplicationVersion() {
        return this.applicationVersion;
    }

    /**
     * <p>
     * The version of the robot application.
     * </p>
     * 
     * @param applicationVersion
     *        The version of the robot application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RobotApplicationConfig withApplicationVersion(String applicationVersion) {
        setApplicationVersion(applicationVersion);
        return this;
    }

    /**
     * <p>
     * The launch configuration for the robot application.
     * </p>
     * 
     * @param launchConfig
     *        The launch configuration for the robot application.
     */

    public void setLaunchConfig(LaunchConfig launchConfig) {
        this.launchConfig = launchConfig;
    }

    /**
     * <p>
     * The launch configuration for the robot application.
     * </p>
     * 
     * @return The launch configuration for the robot application.
     */

    public LaunchConfig getLaunchConfig() {
        return this.launchConfig;
    }

    /**
     * <p>
     * The launch configuration for the robot application.
     * </p>
     * 
     * @param launchConfig
     *        The launch configuration for the robot application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RobotApplicationConfig withLaunchConfig(LaunchConfig launchConfig) {
        setLaunchConfig(launchConfig);
        return this;
    }

    /**
     * <p>
     * The upload configurations for the robot application.
     * </p>
     * 
     * @return The upload configurations for the robot application.
     */

    public java.util.List<UploadConfiguration> getUploadConfigurations() {
        return uploadConfigurations;
    }

    /**
     * <p>
     * The upload configurations for the robot application.
     * </p>
     * 
     * @param uploadConfigurations
     *        The upload configurations for the robot application.
     */

    public void setUploadConfigurations(java.util.Collection<UploadConfiguration> uploadConfigurations) {
        if (uploadConfigurations == null) {
            this.uploadConfigurations = null;
            return;
        }

        this.uploadConfigurations = new java.util.ArrayList<UploadConfiguration>(uploadConfigurations);
    }

    /**
     * <p>
     * The upload configurations for the robot application.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUploadConfigurations(java.util.Collection)} or {@link #withUploadConfigurations(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param uploadConfigurations
     *        The upload configurations for the robot application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RobotApplicationConfig withUploadConfigurations(UploadConfiguration... uploadConfigurations) {
        if (this.uploadConfigurations == null) {
            setUploadConfigurations(new java.util.ArrayList<UploadConfiguration>(uploadConfigurations.length));
        }
        for (UploadConfiguration ele : uploadConfigurations) {
            this.uploadConfigurations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The upload configurations for the robot application.
     * </p>
     * 
     * @param uploadConfigurations
     *        The upload configurations for the robot application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RobotApplicationConfig withUploadConfigurations(java.util.Collection<UploadConfiguration> uploadConfigurations) {
        setUploadConfigurations(uploadConfigurations);
        return this;
    }

    /**
     * <p>
     * A Boolean indicating whether to use default upload configurations. By default, <code>.ros</code> and
     * <code>.gazebo</code> files are uploaded when the application terminates and all ROS topics will be recorded.
     * </p>
     * <p>
     * If you set this value, you must specify an <code>outputLocation</code>.
     * </p>
     * 
     * @param useDefaultUploadConfigurations
     *        A Boolean indicating whether to use default upload configurations. By default, <code>.ros</code> and
     *        <code>.gazebo</code> files are uploaded when the application terminates and all ROS topics will be
     *        recorded.</p>
     *        <p>
     *        If you set this value, you must specify an <code>outputLocation</code>.
     */

    public void setUseDefaultUploadConfigurations(Boolean useDefaultUploadConfigurations) {
        this.useDefaultUploadConfigurations = useDefaultUploadConfigurations;
    }

    /**
     * <p>
     * A Boolean indicating whether to use default upload configurations. By default, <code>.ros</code> and
     * <code>.gazebo</code> files are uploaded when the application terminates and all ROS topics will be recorded.
     * </p>
     * <p>
     * If you set this value, you must specify an <code>outputLocation</code>.
     * </p>
     * 
     * @return A Boolean indicating whether to use default upload configurations. By default, <code>.ros</code> and
     *         <code>.gazebo</code> files are uploaded when the application terminates and all ROS topics will be
     *         recorded.</p>
     *         <p>
     *         If you set this value, you must specify an <code>outputLocation</code>.
     */

    public Boolean getUseDefaultUploadConfigurations() {
        return this.useDefaultUploadConfigurations;
    }

    /**
     * <p>
     * A Boolean indicating whether to use default upload configurations. By default, <code>.ros</code> and
     * <code>.gazebo</code> files are uploaded when the application terminates and all ROS topics will be recorded.
     * </p>
     * <p>
     * If you set this value, you must specify an <code>outputLocation</code>.
     * </p>
     * 
     * @param useDefaultUploadConfigurations
     *        A Boolean indicating whether to use default upload configurations. By default, <code>.ros</code> and
     *        <code>.gazebo</code> files are uploaded when the application terminates and all ROS topics will be
     *        recorded.</p>
     *        <p>
     *        If you set this value, you must specify an <code>outputLocation</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RobotApplicationConfig withUseDefaultUploadConfigurations(Boolean useDefaultUploadConfigurations) {
        setUseDefaultUploadConfigurations(useDefaultUploadConfigurations);
        return this;
    }

    /**
     * <p>
     * A Boolean indicating whether to use default upload configurations. By default, <code>.ros</code> and
     * <code>.gazebo</code> files are uploaded when the application terminates and all ROS topics will be recorded.
     * </p>
     * <p>
     * If you set this value, you must specify an <code>outputLocation</code>.
     * </p>
     * 
     * @return A Boolean indicating whether to use default upload configurations. By default, <code>.ros</code> and
     *         <code>.gazebo</code> files are uploaded when the application terminates and all ROS topics will be
     *         recorded.</p>
     *         <p>
     *         If you set this value, you must specify an <code>outputLocation</code>.
     */

    public Boolean isUseDefaultUploadConfigurations() {
        return this.useDefaultUploadConfigurations;
    }

    /**
     * <p>
     * Information about tools configured for the robot application.
     * </p>
     * 
     * @return Information about tools configured for the robot application.
     */

    public java.util.List<Tool> getTools() {
        return tools;
    }

    /**
     * <p>
     * Information about tools configured for the robot application.
     * </p>
     * 
     * @param tools
     *        Information about tools configured for the robot application.
     */

    public void setTools(java.util.Collection<Tool> tools) {
        if (tools == null) {
            this.tools = null;
            return;
        }

        this.tools = new java.util.ArrayList<Tool>(tools);
    }

    /**
     * <p>
     * Information about tools configured for the robot application.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTools(java.util.Collection)} or {@link #withTools(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tools
     *        Information about tools configured for the robot application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RobotApplicationConfig withTools(Tool... tools) {
        if (this.tools == null) {
            setTools(new java.util.ArrayList<Tool>(tools.length));
        }
        for (Tool ele : tools) {
            this.tools.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about tools configured for the robot application.
     * </p>
     * 
     * @param tools
     *        Information about tools configured for the robot application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RobotApplicationConfig withTools(java.util.Collection<Tool> tools) {
        setTools(tools);
        return this;
    }

    /**
     * <p>
     * A Boolean indicating whether to use default robot application tools. The default tools are rviz, rqt, terminal
     * and rosbag record. The default is <code>False</code>.
     * </p>
     * 
     * @param useDefaultTools
     *        A Boolean indicating whether to use default robot application tools. The default tools are rviz, rqt,
     *        terminal and rosbag record. The default is <code>False</code>.
     */

    public void setUseDefaultTools(Boolean useDefaultTools) {
        this.useDefaultTools = useDefaultTools;
    }

    /**
     * <p>
     * A Boolean indicating whether to use default robot application tools. The default tools are rviz, rqt, terminal
     * and rosbag record. The default is <code>False</code>.
     * </p>
     * 
     * @return A Boolean indicating whether to use default robot application tools. The default tools are rviz, rqt,
     *         terminal and rosbag record. The default is <code>False</code>.
     */

    public Boolean getUseDefaultTools() {
        return this.useDefaultTools;
    }

    /**
     * <p>
     * A Boolean indicating whether to use default robot application tools. The default tools are rviz, rqt, terminal
     * and rosbag record. The default is <code>False</code>.
     * </p>
     * 
     * @param useDefaultTools
     *        A Boolean indicating whether to use default robot application tools. The default tools are rviz, rqt,
     *        terminal and rosbag record. The default is <code>False</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RobotApplicationConfig withUseDefaultTools(Boolean useDefaultTools) {
        setUseDefaultTools(useDefaultTools);
        return this;
    }

    /**
     * <p>
     * A Boolean indicating whether to use default robot application tools. The default tools are rviz, rqt, terminal
     * and rosbag record. The default is <code>False</code>.
     * </p>
     * 
     * @return A Boolean indicating whether to use default robot application tools. The default tools are rviz, rqt,
     *         terminal and rosbag record. The default is <code>False</code>.
     */

    public Boolean isUseDefaultTools() {
        return this.useDefaultTools;
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
        if (getApplication() != null)
            sb.append("Application: ").append(getApplication()).append(",");
        if (getApplicationVersion() != null)
            sb.append("ApplicationVersion: ").append(getApplicationVersion()).append(",");
        if (getLaunchConfig() != null)
            sb.append("LaunchConfig: ").append(getLaunchConfig()).append(",");
        if (getUploadConfigurations() != null)
            sb.append("UploadConfigurations: ").append(getUploadConfigurations()).append(",");
        if (getUseDefaultUploadConfigurations() != null)
            sb.append("UseDefaultUploadConfigurations: ").append(getUseDefaultUploadConfigurations()).append(",");
        if (getTools() != null)
            sb.append("Tools: ").append(getTools()).append(",");
        if (getUseDefaultTools() != null)
            sb.append("UseDefaultTools: ").append(getUseDefaultTools());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RobotApplicationConfig == false)
            return false;
        RobotApplicationConfig other = (RobotApplicationConfig) obj;
        if (other.getApplication() == null ^ this.getApplication() == null)
            return false;
        if (other.getApplication() != null && other.getApplication().equals(this.getApplication()) == false)
            return false;
        if (other.getApplicationVersion() == null ^ this.getApplicationVersion() == null)
            return false;
        if (other.getApplicationVersion() != null && other.getApplicationVersion().equals(this.getApplicationVersion()) == false)
            return false;
        if (other.getLaunchConfig() == null ^ this.getLaunchConfig() == null)
            return false;
        if (other.getLaunchConfig() != null && other.getLaunchConfig().equals(this.getLaunchConfig()) == false)
            return false;
        if (other.getUploadConfigurations() == null ^ this.getUploadConfigurations() == null)
            return false;
        if (other.getUploadConfigurations() != null && other.getUploadConfigurations().equals(this.getUploadConfigurations()) == false)
            return false;
        if (other.getUseDefaultUploadConfigurations() == null ^ this.getUseDefaultUploadConfigurations() == null)
            return false;
        if (other.getUseDefaultUploadConfigurations() != null
                && other.getUseDefaultUploadConfigurations().equals(this.getUseDefaultUploadConfigurations()) == false)
            return false;
        if (other.getTools() == null ^ this.getTools() == null)
            return false;
        if (other.getTools() != null && other.getTools().equals(this.getTools()) == false)
            return false;
        if (other.getUseDefaultTools() == null ^ this.getUseDefaultTools() == null)
            return false;
        if (other.getUseDefaultTools() != null && other.getUseDefaultTools().equals(this.getUseDefaultTools()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplication() == null) ? 0 : getApplication().hashCode());
        hashCode = prime * hashCode + ((getApplicationVersion() == null) ? 0 : getApplicationVersion().hashCode());
        hashCode = prime * hashCode + ((getLaunchConfig() == null) ? 0 : getLaunchConfig().hashCode());
        hashCode = prime * hashCode + ((getUploadConfigurations() == null) ? 0 : getUploadConfigurations().hashCode());
        hashCode = prime * hashCode + ((getUseDefaultUploadConfigurations() == null) ? 0 : getUseDefaultUploadConfigurations().hashCode());
        hashCode = prime * hashCode + ((getTools() == null) ? 0 : getTools().hashCode());
        hashCode = prime * hashCode + ((getUseDefaultTools() == null) ? 0 : getUseDefaultTools().hashCode());
        return hashCode;
    }

    @Override
    public RobotApplicationConfig clone() {
        try {
            return (RobotApplicationConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.robomaker.model.transform.RobotApplicationConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
