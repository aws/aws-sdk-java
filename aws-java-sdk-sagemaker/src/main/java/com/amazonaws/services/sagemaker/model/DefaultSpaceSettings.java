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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A collection of settings that apply to spaces created in the Domain.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DefaultSpaceSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DefaultSpaceSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The execution role for the space.
     * </p>
     */
    private String executionRole;
    /**
     * <p>
     * The security groups for the Amazon Virtual Private Cloud that the space uses for communication.
     * </p>
     */
    private java.util.List<String> securityGroups;

    private JupyterServerAppSettings jupyterServerAppSettings;

    private KernelGatewayAppSettings kernelGatewayAppSettings;

    /**
     * <p>
     * The execution role for the space.
     * </p>
     * 
     * @param executionRole
     *        The execution role for the space.
     */

    public void setExecutionRole(String executionRole) {
        this.executionRole = executionRole;
    }

    /**
     * <p>
     * The execution role for the space.
     * </p>
     * 
     * @return The execution role for the space.
     */

    public String getExecutionRole() {
        return this.executionRole;
    }

    /**
     * <p>
     * The execution role for the space.
     * </p>
     * 
     * @param executionRole
     *        The execution role for the space.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DefaultSpaceSettings withExecutionRole(String executionRole) {
        setExecutionRole(executionRole);
        return this;
    }

    /**
     * <p>
     * The security groups for the Amazon Virtual Private Cloud that the space uses for communication.
     * </p>
     * 
     * @return The security groups for the Amazon Virtual Private Cloud that the space uses for communication.
     */

    public java.util.List<String> getSecurityGroups() {
        return securityGroups;
    }

    /**
     * <p>
     * The security groups for the Amazon Virtual Private Cloud that the space uses for communication.
     * </p>
     * 
     * @param securityGroups
     *        The security groups for the Amazon Virtual Private Cloud that the space uses for communication.
     */

    public void setSecurityGroups(java.util.Collection<String> securityGroups) {
        if (securityGroups == null) {
            this.securityGroups = null;
            return;
        }

        this.securityGroups = new java.util.ArrayList<String>(securityGroups);
    }

    /**
     * <p>
     * The security groups for the Amazon Virtual Private Cloud that the space uses for communication.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroups(java.util.Collection)} or {@link #withSecurityGroups(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param securityGroups
     *        The security groups for the Amazon Virtual Private Cloud that the space uses for communication.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DefaultSpaceSettings withSecurityGroups(String... securityGroups) {
        if (this.securityGroups == null) {
            setSecurityGroups(new java.util.ArrayList<String>(securityGroups.length));
        }
        for (String ele : securityGroups) {
            this.securityGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The security groups for the Amazon Virtual Private Cloud that the space uses for communication.
     * </p>
     * 
     * @param securityGroups
     *        The security groups for the Amazon Virtual Private Cloud that the space uses for communication.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DefaultSpaceSettings withSecurityGroups(java.util.Collection<String> securityGroups) {
        setSecurityGroups(securityGroups);
        return this;
    }

    /**
     * @param jupyterServerAppSettings
     */

    public void setJupyterServerAppSettings(JupyterServerAppSettings jupyterServerAppSettings) {
        this.jupyterServerAppSettings = jupyterServerAppSettings;
    }

    /**
     * @return
     */

    public JupyterServerAppSettings getJupyterServerAppSettings() {
        return this.jupyterServerAppSettings;
    }

    /**
     * @param jupyterServerAppSettings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DefaultSpaceSettings withJupyterServerAppSettings(JupyterServerAppSettings jupyterServerAppSettings) {
        setJupyterServerAppSettings(jupyterServerAppSettings);
        return this;
    }

    /**
     * @param kernelGatewayAppSettings
     */

    public void setKernelGatewayAppSettings(KernelGatewayAppSettings kernelGatewayAppSettings) {
        this.kernelGatewayAppSettings = kernelGatewayAppSettings;
    }

    /**
     * @return
     */

    public KernelGatewayAppSettings getKernelGatewayAppSettings() {
        return this.kernelGatewayAppSettings;
    }

    /**
     * @param kernelGatewayAppSettings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DefaultSpaceSettings withKernelGatewayAppSettings(KernelGatewayAppSettings kernelGatewayAppSettings) {
        setKernelGatewayAppSettings(kernelGatewayAppSettings);
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
        if (getExecutionRole() != null)
            sb.append("ExecutionRole: ").append(getExecutionRole()).append(",");
        if (getSecurityGroups() != null)
            sb.append("SecurityGroups: ").append(getSecurityGroups()).append(",");
        if (getJupyterServerAppSettings() != null)
            sb.append("JupyterServerAppSettings: ").append(getJupyterServerAppSettings()).append(",");
        if (getKernelGatewayAppSettings() != null)
            sb.append("KernelGatewayAppSettings: ").append(getKernelGatewayAppSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DefaultSpaceSettings == false)
            return false;
        DefaultSpaceSettings other = (DefaultSpaceSettings) obj;
        if (other.getExecutionRole() == null ^ this.getExecutionRole() == null)
            return false;
        if (other.getExecutionRole() != null && other.getExecutionRole().equals(this.getExecutionRole()) == false)
            return false;
        if (other.getSecurityGroups() == null ^ this.getSecurityGroups() == null)
            return false;
        if (other.getSecurityGroups() != null && other.getSecurityGroups().equals(this.getSecurityGroups()) == false)
            return false;
        if (other.getJupyterServerAppSettings() == null ^ this.getJupyterServerAppSettings() == null)
            return false;
        if (other.getJupyterServerAppSettings() != null && other.getJupyterServerAppSettings().equals(this.getJupyterServerAppSettings()) == false)
            return false;
        if (other.getKernelGatewayAppSettings() == null ^ this.getKernelGatewayAppSettings() == null)
            return false;
        if (other.getKernelGatewayAppSettings() != null && other.getKernelGatewayAppSettings().equals(this.getKernelGatewayAppSettings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExecutionRole() == null) ? 0 : getExecutionRole().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroups() == null) ? 0 : getSecurityGroups().hashCode());
        hashCode = prime * hashCode + ((getJupyterServerAppSettings() == null) ? 0 : getJupyterServerAppSettings().hashCode());
        hashCode = prime * hashCode + ((getKernelGatewayAppSettings() == null) ? 0 : getKernelGatewayAppSettings().hashCode());
        return hashCode;
    }

    @Override
    public DefaultSpaceSettings clone() {
        try {
            return (DefaultSpaceSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.DefaultSpaceSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
