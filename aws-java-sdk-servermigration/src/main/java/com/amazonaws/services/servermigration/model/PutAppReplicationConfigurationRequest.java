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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/PutAppReplicationConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutAppReplicationConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * ID of the application tassociated with the replication configuration.
     * </p>
     */
    private String appId;
    /**
     * <p>
     * Replication configurations for server groups in the application.
     * </p>
     */
    private java.util.List<ServerGroupReplicationConfiguration> serverGroupReplicationConfigurations;

    /**
     * <p>
     * ID of the application tassociated with the replication configuration.
     * </p>
     * 
     * @param appId
     *        ID of the application tassociated with the replication configuration.
     */

    public void setAppId(String appId) {
        this.appId = appId;
    }

    /**
     * <p>
     * ID of the application tassociated with the replication configuration.
     * </p>
     * 
     * @return ID of the application tassociated with the replication configuration.
     */

    public String getAppId() {
        return this.appId;
    }

    /**
     * <p>
     * ID of the application tassociated with the replication configuration.
     * </p>
     * 
     * @param appId
     *        ID of the application tassociated with the replication configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutAppReplicationConfigurationRequest withAppId(String appId) {
        setAppId(appId);
        return this;
    }

    /**
     * <p>
     * Replication configurations for server groups in the application.
     * </p>
     * 
     * @return Replication configurations for server groups in the application.
     */

    public java.util.List<ServerGroupReplicationConfiguration> getServerGroupReplicationConfigurations() {
        return serverGroupReplicationConfigurations;
    }

    /**
     * <p>
     * Replication configurations for server groups in the application.
     * </p>
     * 
     * @param serverGroupReplicationConfigurations
     *        Replication configurations for server groups in the application.
     */

    public void setServerGroupReplicationConfigurations(java.util.Collection<ServerGroupReplicationConfiguration> serverGroupReplicationConfigurations) {
        if (serverGroupReplicationConfigurations == null) {
            this.serverGroupReplicationConfigurations = null;
            return;
        }

        this.serverGroupReplicationConfigurations = new java.util.ArrayList<ServerGroupReplicationConfiguration>(serverGroupReplicationConfigurations);
    }

    /**
     * <p>
     * Replication configurations for server groups in the application.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setServerGroupReplicationConfigurations(java.util.Collection)} or
     * {@link #withServerGroupReplicationConfigurations(java.util.Collection)} if you want to override the existing
     * values.
     * </p>
     * 
     * @param serverGroupReplicationConfigurations
     *        Replication configurations for server groups in the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutAppReplicationConfigurationRequest withServerGroupReplicationConfigurations(
            ServerGroupReplicationConfiguration... serverGroupReplicationConfigurations) {
        if (this.serverGroupReplicationConfigurations == null) {
            setServerGroupReplicationConfigurations(new java.util.ArrayList<ServerGroupReplicationConfiguration>(serverGroupReplicationConfigurations.length));
        }
        for (ServerGroupReplicationConfiguration ele : serverGroupReplicationConfigurations) {
            this.serverGroupReplicationConfigurations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Replication configurations for server groups in the application.
     * </p>
     * 
     * @param serverGroupReplicationConfigurations
     *        Replication configurations for server groups in the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutAppReplicationConfigurationRequest withServerGroupReplicationConfigurations(
            java.util.Collection<ServerGroupReplicationConfiguration> serverGroupReplicationConfigurations) {
        setServerGroupReplicationConfigurations(serverGroupReplicationConfigurations);
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
        if (getServerGroupReplicationConfigurations() != null)
            sb.append("ServerGroupReplicationConfigurations: ").append(getServerGroupReplicationConfigurations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutAppReplicationConfigurationRequest == false)
            return false;
        PutAppReplicationConfigurationRequest other = (PutAppReplicationConfigurationRequest) obj;
        if (other.getAppId() == null ^ this.getAppId() == null)
            return false;
        if (other.getAppId() != null && other.getAppId().equals(this.getAppId()) == false)
            return false;
        if (other.getServerGroupReplicationConfigurations() == null ^ this.getServerGroupReplicationConfigurations() == null)
            return false;
        if (other.getServerGroupReplicationConfigurations() != null
                && other.getServerGroupReplicationConfigurations().equals(this.getServerGroupReplicationConfigurations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAppId() == null) ? 0 : getAppId().hashCode());
        hashCode = prime * hashCode + ((getServerGroupReplicationConfigurations() == null) ? 0 : getServerGroupReplicationConfigurations().hashCode());
        return hashCode;
    }

    @Override
    public PutAppReplicationConfigurationRequest clone() {
        return (PutAppReplicationConfigurationRequest) super.clone();
    }

}
