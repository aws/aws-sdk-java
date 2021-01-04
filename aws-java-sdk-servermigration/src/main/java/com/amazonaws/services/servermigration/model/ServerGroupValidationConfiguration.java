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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Configuration for validating an instance.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/ServerGroupValidationConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServerGroupValidationConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the server group.
     * </p>
     */
    private String serverGroupId;
    /**
     * <p>
     * The validation configuration.
     * </p>
     */
    private java.util.List<ServerValidationConfiguration> serverValidationConfigurations;

    /**
     * <p>
     * The ID of the server group.
     * </p>
     * 
     * @param serverGroupId
     *        The ID of the server group.
     */

    public void setServerGroupId(String serverGroupId) {
        this.serverGroupId = serverGroupId;
    }

    /**
     * <p>
     * The ID of the server group.
     * </p>
     * 
     * @return The ID of the server group.
     */

    public String getServerGroupId() {
        return this.serverGroupId;
    }

    /**
     * <p>
     * The ID of the server group.
     * </p>
     * 
     * @param serverGroupId
     *        The ID of the server group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServerGroupValidationConfiguration withServerGroupId(String serverGroupId) {
        setServerGroupId(serverGroupId);
        return this;
    }

    /**
     * <p>
     * The validation configuration.
     * </p>
     * 
     * @return The validation configuration.
     */

    public java.util.List<ServerValidationConfiguration> getServerValidationConfigurations() {
        return serverValidationConfigurations;
    }

    /**
     * <p>
     * The validation configuration.
     * </p>
     * 
     * @param serverValidationConfigurations
     *        The validation configuration.
     */

    public void setServerValidationConfigurations(java.util.Collection<ServerValidationConfiguration> serverValidationConfigurations) {
        if (serverValidationConfigurations == null) {
            this.serverValidationConfigurations = null;
            return;
        }

        this.serverValidationConfigurations = new java.util.ArrayList<ServerValidationConfiguration>(serverValidationConfigurations);
    }

    /**
     * <p>
     * The validation configuration.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setServerValidationConfigurations(java.util.Collection)} or
     * {@link #withServerValidationConfigurations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param serverValidationConfigurations
     *        The validation configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServerGroupValidationConfiguration withServerValidationConfigurations(ServerValidationConfiguration... serverValidationConfigurations) {
        if (this.serverValidationConfigurations == null) {
            setServerValidationConfigurations(new java.util.ArrayList<ServerValidationConfiguration>(serverValidationConfigurations.length));
        }
        for (ServerValidationConfiguration ele : serverValidationConfigurations) {
            this.serverValidationConfigurations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The validation configuration.
     * </p>
     * 
     * @param serverValidationConfigurations
     *        The validation configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServerGroupValidationConfiguration withServerValidationConfigurations(
            java.util.Collection<ServerValidationConfiguration> serverValidationConfigurations) {
        setServerValidationConfigurations(serverValidationConfigurations);
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
        if (getServerGroupId() != null)
            sb.append("ServerGroupId: ").append(getServerGroupId()).append(",");
        if (getServerValidationConfigurations() != null)
            sb.append("ServerValidationConfigurations: ").append(getServerValidationConfigurations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ServerGroupValidationConfiguration == false)
            return false;
        ServerGroupValidationConfiguration other = (ServerGroupValidationConfiguration) obj;
        if (other.getServerGroupId() == null ^ this.getServerGroupId() == null)
            return false;
        if (other.getServerGroupId() != null && other.getServerGroupId().equals(this.getServerGroupId()) == false)
            return false;
        if (other.getServerValidationConfigurations() == null ^ this.getServerValidationConfigurations() == null)
            return false;
        if (other.getServerValidationConfigurations() != null
                && other.getServerValidationConfigurations().equals(this.getServerValidationConfigurations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServerGroupId() == null) ? 0 : getServerGroupId().hashCode());
        hashCode = prime * hashCode + ((getServerValidationConfigurations() == null) ? 0 : getServerValidationConfigurations().hashCode());
        return hashCode;
    }

    @Override
    public ServerGroupValidationConfiguration clone() {
        try {
            return (ServerGroupValidationConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.servermigration.model.transform.ServerGroupValidationConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
