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
package com.amazonaws.services.servermigration.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/PutAppValidationConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutAppValidationConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the application.
     * </p>
     */
    private String appId;
    /**
     * <p>
     * The configuration for application validation.
     * </p>
     */
    private java.util.List<AppValidationConfiguration> appValidationConfigurations;
    /**
     * <p>
     * The configuration for instance validation.
     * </p>
     */
    private java.util.List<ServerGroupValidationConfiguration> serverGroupValidationConfigurations;

    /**
     * <p>
     * The ID of the application.
     * </p>
     * 
     * @param appId
     *        The ID of the application.
     */

    public void setAppId(String appId) {
        this.appId = appId;
    }

    /**
     * <p>
     * The ID of the application.
     * </p>
     * 
     * @return The ID of the application.
     */

    public String getAppId() {
        return this.appId;
    }

    /**
     * <p>
     * The ID of the application.
     * </p>
     * 
     * @param appId
     *        The ID of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutAppValidationConfigurationRequest withAppId(String appId) {
        setAppId(appId);
        return this;
    }

    /**
     * <p>
     * The configuration for application validation.
     * </p>
     * 
     * @return The configuration for application validation.
     */

    public java.util.List<AppValidationConfiguration> getAppValidationConfigurations() {
        return appValidationConfigurations;
    }

    /**
     * <p>
     * The configuration for application validation.
     * </p>
     * 
     * @param appValidationConfigurations
     *        The configuration for application validation.
     */

    public void setAppValidationConfigurations(java.util.Collection<AppValidationConfiguration> appValidationConfigurations) {
        if (appValidationConfigurations == null) {
            this.appValidationConfigurations = null;
            return;
        }

        this.appValidationConfigurations = new java.util.ArrayList<AppValidationConfiguration>(appValidationConfigurations);
    }

    /**
     * <p>
     * The configuration for application validation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAppValidationConfigurations(java.util.Collection)} or
     * {@link #withAppValidationConfigurations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param appValidationConfigurations
     *        The configuration for application validation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutAppValidationConfigurationRequest withAppValidationConfigurations(AppValidationConfiguration... appValidationConfigurations) {
        if (this.appValidationConfigurations == null) {
            setAppValidationConfigurations(new java.util.ArrayList<AppValidationConfiguration>(appValidationConfigurations.length));
        }
        for (AppValidationConfiguration ele : appValidationConfigurations) {
            this.appValidationConfigurations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The configuration for application validation.
     * </p>
     * 
     * @param appValidationConfigurations
     *        The configuration for application validation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutAppValidationConfigurationRequest withAppValidationConfigurations(java.util.Collection<AppValidationConfiguration> appValidationConfigurations) {
        setAppValidationConfigurations(appValidationConfigurations);
        return this;
    }

    /**
     * <p>
     * The configuration for instance validation.
     * </p>
     * 
     * @return The configuration for instance validation.
     */

    public java.util.List<ServerGroupValidationConfiguration> getServerGroupValidationConfigurations() {
        return serverGroupValidationConfigurations;
    }

    /**
     * <p>
     * The configuration for instance validation.
     * </p>
     * 
     * @param serverGroupValidationConfigurations
     *        The configuration for instance validation.
     */

    public void setServerGroupValidationConfigurations(java.util.Collection<ServerGroupValidationConfiguration> serverGroupValidationConfigurations) {
        if (serverGroupValidationConfigurations == null) {
            this.serverGroupValidationConfigurations = null;
            return;
        }

        this.serverGroupValidationConfigurations = new java.util.ArrayList<ServerGroupValidationConfiguration>(serverGroupValidationConfigurations);
    }

    /**
     * <p>
     * The configuration for instance validation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setServerGroupValidationConfigurations(java.util.Collection)} or
     * {@link #withServerGroupValidationConfigurations(java.util.Collection)} if you want to override the existing
     * values.
     * </p>
     * 
     * @param serverGroupValidationConfigurations
     *        The configuration for instance validation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutAppValidationConfigurationRequest withServerGroupValidationConfigurations(
            ServerGroupValidationConfiguration... serverGroupValidationConfigurations) {
        if (this.serverGroupValidationConfigurations == null) {
            setServerGroupValidationConfigurations(new java.util.ArrayList<ServerGroupValidationConfiguration>(serverGroupValidationConfigurations.length));
        }
        for (ServerGroupValidationConfiguration ele : serverGroupValidationConfigurations) {
            this.serverGroupValidationConfigurations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The configuration for instance validation.
     * </p>
     * 
     * @param serverGroupValidationConfigurations
     *        The configuration for instance validation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutAppValidationConfigurationRequest withServerGroupValidationConfigurations(
            java.util.Collection<ServerGroupValidationConfiguration> serverGroupValidationConfigurations) {
        setServerGroupValidationConfigurations(serverGroupValidationConfigurations);
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
        if (getAppValidationConfigurations() != null)
            sb.append("AppValidationConfigurations: ").append(getAppValidationConfigurations()).append(",");
        if (getServerGroupValidationConfigurations() != null)
            sb.append("ServerGroupValidationConfigurations: ").append(getServerGroupValidationConfigurations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutAppValidationConfigurationRequest == false)
            return false;
        PutAppValidationConfigurationRequest other = (PutAppValidationConfigurationRequest) obj;
        if (other.getAppId() == null ^ this.getAppId() == null)
            return false;
        if (other.getAppId() != null && other.getAppId().equals(this.getAppId()) == false)
            return false;
        if (other.getAppValidationConfigurations() == null ^ this.getAppValidationConfigurations() == null)
            return false;
        if (other.getAppValidationConfigurations() != null && other.getAppValidationConfigurations().equals(this.getAppValidationConfigurations()) == false)
            return false;
        if (other.getServerGroupValidationConfigurations() == null ^ this.getServerGroupValidationConfigurations() == null)
            return false;
        if (other.getServerGroupValidationConfigurations() != null
                && other.getServerGroupValidationConfigurations().equals(this.getServerGroupValidationConfigurations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAppId() == null) ? 0 : getAppId().hashCode());
        hashCode = prime * hashCode + ((getAppValidationConfigurations() == null) ? 0 : getAppValidationConfigurations().hashCode());
        hashCode = prime * hashCode + ((getServerGroupValidationConfigurations() == null) ? 0 : getServerGroupValidationConfigurations().hashCode());
        return hashCode;
    }

    @Override
    public PutAppValidationConfigurationRequest clone() {
        return (PutAppValidationConfigurationRequest) super.clone();
    }

}
