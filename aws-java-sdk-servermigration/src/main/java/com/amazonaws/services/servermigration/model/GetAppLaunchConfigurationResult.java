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
package com.amazonaws.services.servermigration.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/GetAppLaunchConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetAppLaunchConfigurationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * ID of the application associated with the launch configuration.
     * </p>
     */
    private String appId;
    /**
     * <p>
     * Name of the service role in the customer's account that Amazon CloudFormation uses to launch the application.
     * </p>
     */
    private String roleName;
    /**
     * <p>
     * List of launch configurations for server groups in this application.
     * </p>
     */
    private java.util.List<ServerGroupLaunchConfiguration> serverGroupLaunchConfigurations;

    /**
     * <p>
     * ID of the application associated with the launch configuration.
     * </p>
     * 
     * @param appId
     *        ID of the application associated with the launch configuration.
     */

    public void setAppId(String appId) {
        this.appId = appId;
    }

    /**
     * <p>
     * ID of the application associated with the launch configuration.
     * </p>
     * 
     * @return ID of the application associated with the launch configuration.
     */

    public String getAppId() {
        return this.appId;
    }

    /**
     * <p>
     * ID of the application associated with the launch configuration.
     * </p>
     * 
     * @param appId
     *        ID of the application associated with the launch configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAppLaunchConfigurationResult withAppId(String appId) {
        setAppId(appId);
        return this;
    }

    /**
     * <p>
     * Name of the service role in the customer's account that Amazon CloudFormation uses to launch the application.
     * </p>
     * 
     * @param roleName
     *        Name of the service role in the customer's account that Amazon CloudFormation uses to launch the
     *        application.
     */

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    /**
     * <p>
     * Name of the service role in the customer's account that Amazon CloudFormation uses to launch the application.
     * </p>
     * 
     * @return Name of the service role in the customer's account that Amazon CloudFormation uses to launch the
     *         application.
     */

    public String getRoleName() {
        return this.roleName;
    }

    /**
     * <p>
     * Name of the service role in the customer's account that Amazon CloudFormation uses to launch the application.
     * </p>
     * 
     * @param roleName
     *        Name of the service role in the customer's account that Amazon CloudFormation uses to launch the
     *        application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAppLaunchConfigurationResult withRoleName(String roleName) {
        setRoleName(roleName);
        return this;
    }

    /**
     * <p>
     * List of launch configurations for server groups in this application.
     * </p>
     * 
     * @return List of launch configurations for server groups in this application.
     */

    public java.util.List<ServerGroupLaunchConfiguration> getServerGroupLaunchConfigurations() {
        return serverGroupLaunchConfigurations;
    }

    /**
     * <p>
     * List of launch configurations for server groups in this application.
     * </p>
     * 
     * @param serverGroupLaunchConfigurations
     *        List of launch configurations for server groups in this application.
     */

    public void setServerGroupLaunchConfigurations(java.util.Collection<ServerGroupLaunchConfiguration> serverGroupLaunchConfigurations) {
        if (serverGroupLaunchConfigurations == null) {
            this.serverGroupLaunchConfigurations = null;
            return;
        }

        this.serverGroupLaunchConfigurations = new java.util.ArrayList<ServerGroupLaunchConfiguration>(serverGroupLaunchConfigurations);
    }

    /**
     * <p>
     * List of launch configurations for server groups in this application.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setServerGroupLaunchConfigurations(java.util.Collection)} or
     * {@link #withServerGroupLaunchConfigurations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param serverGroupLaunchConfigurations
     *        List of launch configurations for server groups in this application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAppLaunchConfigurationResult withServerGroupLaunchConfigurations(ServerGroupLaunchConfiguration... serverGroupLaunchConfigurations) {
        if (this.serverGroupLaunchConfigurations == null) {
            setServerGroupLaunchConfigurations(new java.util.ArrayList<ServerGroupLaunchConfiguration>(serverGroupLaunchConfigurations.length));
        }
        for (ServerGroupLaunchConfiguration ele : serverGroupLaunchConfigurations) {
            this.serverGroupLaunchConfigurations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of launch configurations for server groups in this application.
     * </p>
     * 
     * @param serverGroupLaunchConfigurations
     *        List of launch configurations for server groups in this application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAppLaunchConfigurationResult withServerGroupLaunchConfigurations(
            java.util.Collection<ServerGroupLaunchConfiguration> serverGroupLaunchConfigurations) {
        setServerGroupLaunchConfigurations(serverGroupLaunchConfigurations);
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
        if (getAppId() != null)
            sb.append("AppId: ").append(getAppId()).append(",");
        if (getRoleName() != null)
            sb.append("RoleName: ").append(getRoleName()).append(",");
        if (getServerGroupLaunchConfigurations() != null)
            sb.append("ServerGroupLaunchConfigurations: ").append(getServerGroupLaunchConfigurations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAppLaunchConfigurationResult == false)
            return false;
        GetAppLaunchConfigurationResult other = (GetAppLaunchConfigurationResult) obj;
        if (other.getAppId() == null ^ this.getAppId() == null)
            return false;
        if (other.getAppId() != null && other.getAppId().equals(this.getAppId()) == false)
            return false;
        if (other.getRoleName() == null ^ this.getRoleName() == null)
            return false;
        if (other.getRoleName() != null && other.getRoleName().equals(this.getRoleName()) == false)
            return false;
        if (other.getServerGroupLaunchConfigurations() == null ^ this.getServerGroupLaunchConfigurations() == null)
            return false;
        if (other.getServerGroupLaunchConfigurations() != null
                && other.getServerGroupLaunchConfigurations().equals(this.getServerGroupLaunchConfigurations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAppId() == null) ? 0 : getAppId().hashCode());
        hashCode = prime * hashCode + ((getRoleName() == null) ? 0 : getRoleName().hashCode());
        hashCode = prime * hashCode + ((getServerGroupLaunchConfigurations() == null) ? 0 : getServerGroupLaunchConfigurations().hashCode());
        return hashCode;
    }

    @Override
    public GetAppLaunchConfigurationResult clone() {
        try {
            return (GetAppLaunchConfigurationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
