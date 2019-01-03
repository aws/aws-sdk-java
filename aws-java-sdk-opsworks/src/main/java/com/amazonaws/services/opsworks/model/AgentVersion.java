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
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes an agent version.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/AgentVersion" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AgentVersion implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The agent version.
     * </p>
     */
    private String version;
    /**
     * <p>
     * The configuration manager.
     * </p>
     */
    private StackConfigurationManager configurationManager;

    /**
     * <p>
     * The agent version.
     * </p>
     * 
     * @param version
     *        The agent version.
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The agent version.
     * </p>
     * 
     * @return The agent version.
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The agent version.
     * </p>
     * 
     * @param version
     *        The agent version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentVersion withVersion(String version) {
        setVersion(version);
        return this;
    }

    /**
     * <p>
     * The configuration manager.
     * </p>
     * 
     * @param configurationManager
     *        The configuration manager.
     */

    public void setConfigurationManager(StackConfigurationManager configurationManager) {
        this.configurationManager = configurationManager;
    }

    /**
     * <p>
     * The configuration manager.
     * </p>
     * 
     * @return The configuration manager.
     */

    public StackConfigurationManager getConfigurationManager() {
        return this.configurationManager;
    }

    /**
     * <p>
     * The configuration manager.
     * </p>
     * 
     * @param configurationManager
     *        The configuration manager.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentVersion withConfigurationManager(StackConfigurationManager configurationManager) {
        setConfigurationManager(configurationManager);
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
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion()).append(",");
        if (getConfigurationManager() != null)
            sb.append("ConfigurationManager: ").append(getConfigurationManager());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AgentVersion == false)
            return false;
        AgentVersion other = (AgentVersion) obj;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getConfigurationManager() == null ^ this.getConfigurationManager() == null)
            return false;
        if (other.getConfigurationManager() != null && other.getConfigurationManager().equals(this.getConfigurationManager()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getConfigurationManager() == null) ? 0 : getConfigurationManager().hashCode());
        return hashCode;
    }

    @Override
    public AgentVersion clone() {
        try {
            return (AgentVersion) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.opsworks.model.transform.AgentVersionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
