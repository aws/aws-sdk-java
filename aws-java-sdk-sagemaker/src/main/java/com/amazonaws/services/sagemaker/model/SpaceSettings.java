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
 * A collection of space settings.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/SpaceSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SpaceSettings implements Serializable, Cloneable, StructuredPojo {

    private JupyterServerAppSettings jupyterServerAppSettings;

    private KernelGatewayAppSettings kernelGatewayAppSettings;

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

    public SpaceSettings withJupyterServerAppSettings(JupyterServerAppSettings jupyterServerAppSettings) {
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

    public SpaceSettings withKernelGatewayAppSettings(KernelGatewayAppSettings kernelGatewayAppSettings) {
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

        if (obj instanceof SpaceSettings == false)
            return false;
        SpaceSettings other = (SpaceSettings) obj;
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

        hashCode = prime * hashCode + ((getJupyterServerAppSettings() == null) ? 0 : getJupyterServerAppSettings().hashCode());
        hashCode = prime * hashCode + ((getKernelGatewayAppSettings() == null) ? 0 : getKernelGatewayAppSettings().hashCode());
        return hashCode;
    }

    @Override
    public SpaceSettings clone() {
        try {
            return (SpaceSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.SpaceSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
