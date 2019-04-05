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
package com.amazonaws.services.robomaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Configuration information for a deployment launch.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/DeploymentLaunchConfig" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeploymentLaunchConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The package name.
     * </p>
     */
    private String packageName;
    /**
     * <p>
     * The deployment pre-launch file. This file will be executed prior to the launch file.
     * </p>
     */
    private String preLaunchFile;
    /**
     * <p>
     * The launch file name.
     * </p>
     */
    private String launchFile;
    /**
     * <p>
     * The deployment post-launch file. This file will be executed after the launch file.
     * </p>
     */
    private String postLaunchFile;
    /**
     * <p>
     * An array of key/value pairs specifying environment variables for the robot application
     * </p>
     */
    private java.util.Map<String, String> environmentVariables;

    /**
     * <p>
     * The package name.
     * </p>
     * 
     * @param packageName
     *        The package name.
     */

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    /**
     * <p>
     * The package name.
     * </p>
     * 
     * @return The package name.
     */

    public String getPackageName() {
        return this.packageName;
    }

    /**
     * <p>
     * The package name.
     * </p>
     * 
     * @param packageName
     *        The package name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentLaunchConfig withPackageName(String packageName) {
        setPackageName(packageName);
        return this;
    }

    /**
     * <p>
     * The deployment pre-launch file. This file will be executed prior to the launch file.
     * </p>
     * 
     * @param preLaunchFile
     *        The deployment pre-launch file. This file will be executed prior to the launch file.
     */

    public void setPreLaunchFile(String preLaunchFile) {
        this.preLaunchFile = preLaunchFile;
    }

    /**
     * <p>
     * The deployment pre-launch file. This file will be executed prior to the launch file.
     * </p>
     * 
     * @return The deployment pre-launch file. This file will be executed prior to the launch file.
     */

    public String getPreLaunchFile() {
        return this.preLaunchFile;
    }

    /**
     * <p>
     * The deployment pre-launch file. This file will be executed prior to the launch file.
     * </p>
     * 
     * @param preLaunchFile
     *        The deployment pre-launch file. This file will be executed prior to the launch file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentLaunchConfig withPreLaunchFile(String preLaunchFile) {
        setPreLaunchFile(preLaunchFile);
        return this;
    }

    /**
     * <p>
     * The launch file name.
     * </p>
     * 
     * @param launchFile
     *        The launch file name.
     */

    public void setLaunchFile(String launchFile) {
        this.launchFile = launchFile;
    }

    /**
     * <p>
     * The launch file name.
     * </p>
     * 
     * @return The launch file name.
     */

    public String getLaunchFile() {
        return this.launchFile;
    }

    /**
     * <p>
     * The launch file name.
     * </p>
     * 
     * @param launchFile
     *        The launch file name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentLaunchConfig withLaunchFile(String launchFile) {
        setLaunchFile(launchFile);
        return this;
    }

    /**
     * <p>
     * The deployment post-launch file. This file will be executed after the launch file.
     * </p>
     * 
     * @param postLaunchFile
     *        The deployment post-launch file. This file will be executed after the launch file.
     */

    public void setPostLaunchFile(String postLaunchFile) {
        this.postLaunchFile = postLaunchFile;
    }

    /**
     * <p>
     * The deployment post-launch file. This file will be executed after the launch file.
     * </p>
     * 
     * @return The deployment post-launch file. This file will be executed after the launch file.
     */

    public String getPostLaunchFile() {
        return this.postLaunchFile;
    }

    /**
     * <p>
     * The deployment post-launch file. This file will be executed after the launch file.
     * </p>
     * 
     * @param postLaunchFile
     *        The deployment post-launch file. This file will be executed after the launch file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentLaunchConfig withPostLaunchFile(String postLaunchFile) {
        setPostLaunchFile(postLaunchFile);
        return this;
    }

    /**
     * <p>
     * An array of key/value pairs specifying environment variables for the robot application
     * </p>
     * 
     * @return An array of key/value pairs specifying environment variables for the robot application
     */

    public java.util.Map<String, String> getEnvironmentVariables() {
        return environmentVariables;
    }

    /**
     * <p>
     * An array of key/value pairs specifying environment variables for the robot application
     * </p>
     * 
     * @param environmentVariables
     *        An array of key/value pairs specifying environment variables for the robot application
     */

    public void setEnvironmentVariables(java.util.Map<String, String> environmentVariables) {
        this.environmentVariables = environmentVariables;
    }

    /**
     * <p>
     * An array of key/value pairs specifying environment variables for the robot application
     * </p>
     * 
     * @param environmentVariables
     *        An array of key/value pairs specifying environment variables for the robot application
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentLaunchConfig withEnvironmentVariables(java.util.Map<String, String> environmentVariables) {
        setEnvironmentVariables(environmentVariables);
        return this;
    }

    public DeploymentLaunchConfig addEnvironmentVariablesEntry(String key, String value) {
        if (null == this.environmentVariables) {
            this.environmentVariables = new java.util.HashMap<String, String>();
        }
        if (this.environmentVariables.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.environmentVariables.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into EnvironmentVariables.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentLaunchConfig clearEnvironmentVariablesEntries() {
        this.environmentVariables = null;
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
        if (getPackageName() != null)
            sb.append("PackageName: ").append(getPackageName()).append(",");
        if (getPreLaunchFile() != null)
            sb.append("PreLaunchFile: ").append(getPreLaunchFile()).append(",");
        if (getLaunchFile() != null)
            sb.append("LaunchFile: ").append(getLaunchFile()).append(",");
        if (getPostLaunchFile() != null)
            sb.append("PostLaunchFile: ").append(getPostLaunchFile()).append(",");
        if (getEnvironmentVariables() != null)
            sb.append("EnvironmentVariables: ").append(getEnvironmentVariables());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeploymentLaunchConfig == false)
            return false;
        DeploymentLaunchConfig other = (DeploymentLaunchConfig) obj;
        if (other.getPackageName() == null ^ this.getPackageName() == null)
            return false;
        if (other.getPackageName() != null && other.getPackageName().equals(this.getPackageName()) == false)
            return false;
        if (other.getPreLaunchFile() == null ^ this.getPreLaunchFile() == null)
            return false;
        if (other.getPreLaunchFile() != null && other.getPreLaunchFile().equals(this.getPreLaunchFile()) == false)
            return false;
        if (other.getLaunchFile() == null ^ this.getLaunchFile() == null)
            return false;
        if (other.getLaunchFile() != null && other.getLaunchFile().equals(this.getLaunchFile()) == false)
            return false;
        if (other.getPostLaunchFile() == null ^ this.getPostLaunchFile() == null)
            return false;
        if (other.getPostLaunchFile() != null && other.getPostLaunchFile().equals(this.getPostLaunchFile()) == false)
            return false;
        if (other.getEnvironmentVariables() == null ^ this.getEnvironmentVariables() == null)
            return false;
        if (other.getEnvironmentVariables() != null && other.getEnvironmentVariables().equals(this.getEnvironmentVariables()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPackageName() == null) ? 0 : getPackageName().hashCode());
        hashCode = prime * hashCode + ((getPreLaunchFile() == null) ? 0 : getPreLaunchFile().hashCode());
        hashCode = prime * hashCode + ((getLaunchFile() == null) ? 0 : getLaunchFile().hashCode());
        hashCode = prime * hashCode + ((getPostLaunchFile() == null) ? 0 : getPostLaunchFile().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentVariables() == null) ? 0 : getEnvironmentVariables().hashCode());
        return hashCode;
    }

    @Override
    public DeploymentLaunchConfig clone() {
        try {
            return (DeploymentLaunchConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.robomaker.model.transform.DeploymentLaunchConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
