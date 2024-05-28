/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
     * <p>
     * The Code Editor application settings.
     * </p>
     */
    private SpaceCodeEditorAppSettings codeEditorAppSettings;
    /**
     * <p>
     * The settings for the JupyterLab application.
     * </p>
     */
    private SpaceJupyterLabAppSettings jupyterLabAppSettings;
    /**
     * <p>
     * The type of app created within the space.
     * </p>
     */
    private String appType;
    /**
     * <p>
     * The storage settings for a space.
     * </p>
     */
    private SpaceStorageSettings spaceStorageSettings;
    /**
     * <p>
     * A file system, created by you, that you assign to a space for an Amazon SageMaker Domain. Permitted users can
     * access this file system in Amazon SageMaker Studio.
     * </p>
     */
    private java.util.List<CustomFileSystem> customFileSystems;

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
     * <p>
     * The Code Editor application settings.
     * </p>
     * 
     * @param codeEditorAppSettings
     *        The Code Editor application settings.
     */

    public void setCodeEditorAppSettings(SpaceCodeEditorAppSettings codeEditorAppSettings) {
        this.codeEditorAppSettings = codeEditorAppSettings;
    }

    /**
     * <p>
     * The Code Editor application settings.
     * </p>
     * 
     * @return The Code Editor application settings.
     */

    public SpaceCodeEditorAppSettings getCodeEditorAppSettings() {
        return this.codeEditorAppSettings;
    }

    /**
     * <p>
     * The Code Editor application settings.
     * </p>
     * 
     * @param codeEditorAppSettings
     *        The Code Editor application settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpaceSettings withCodeEditorAppSettings(SpaceCodeEditorAppSettings codeEditorAppSettings) {
        setCodeEditorAppSettings(codeEditorAppSettings);
        return this;
    }

    /**
     * <p>
     * The settings for the JupyterLab application.
     * </p>
     * 
     * @param jupyterLabAppSettings
     *        The settings for the JupyterLab application.
     */

    public void setJupyterLabAppSettings(SpaceJupyterLabAppSettings jupyterLabAppSettings) {
        this.jupyterLabAppSettings = jupyterLabAppSettings;
    }

    /**
     * <p>
     * The settings for the JupyterLab application.
     * </p>
     * 
     * @return The settings for the JupyterLab application.
     */

    public SpaceJupyterLabAppSettings getJupyterLabAppSettings() {
        return this.jupyterLabAppSettings;
    }

    /**
     * <p>
     * The settings for the JupyterLab application.
     * </p>
     * 
     * @param jupyterLabAppSettings
     *        The settings for the JupyterLab application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpaceSettings withJupyterLabAppSettings(SpaceJupyterLabAppSettings jupyterLabAppSettings) {
        setJupyterLabAppSettings(jupyterLabAppSettings);
        return this;
    }

    /**
     * <p>
     * The type of app created within the space.
     * </p>
     * 
     * @param appType
     *        The type of app created within the space.
     * @see AppType
     */

    public void setAppType(String appType) {
        this.appType = appType;
    }

    /**
     * <p>
     * The type of app created within the space.
     * </p>
     * 
     * @return The type of app created within the space.
     * @see AppType
     */

    public String getAppType() {
        return this.appType;
    }

    /**
     * <p>
     * The type of app created within the space.
     * </p>
     * 
     * @param appType
     *        The type of app created within the space.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AppType
     */

    public SpaceSettings withAppType(String appType) {
        setAppType(appType);
        return this;
    }

    /**
     * <p>
     * The type of app created within the space.
     * </p>
     * 
     * @param appType
     *        The type of app created within the space.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AppType
     */

    public SpaceSettings withAppType(AppType appType) {
        this.appType = appType.toString();
        return this;
    }

    /**
     * <p>
     * The storage settings for a space.
     * </p>
     * 
     * @param spaceStorageSettings
     *        The storage settings for a space.
     */

    public void setSpaceStorageSettings(SpaceStorageSettings spaceStorageSettings) {
        this.spaceStorageSettings = spaceStorageSettings;
    }

    /**
     * <p>
     * The storage settings for a space.
     * </p>
     * 
     * @return The storage settings for a space.
     */

    public SpaceStorageSettings getSpaceStorageSettings() {
        return this.spaceStorageSettings;
    }

    /**
     * <p>
     * The storage settings for a space.
     * </p>
     * 
     * @param spaceStorageSettings
     *        The storage settings for a space.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpaceSettings withSpaceStorageSettings(SpaceStorageSettings spaceStorageSettings) {
        setSpaceStorageSettings(spaceStorageSettings);
        return this;
    }

    /**
     * <p>
     * A file system, created by you, that you assign to a space for an Amazon SageMaker Domain. Permitted users can
     * access this file system in Amazon SageMaker Studio.
     * </p>
     * 
     * @return A file system, created by you, that you assign to a space for an Amazon SageMaker Domain. Permitted users
     *         can access this file system in Amazon SageMaker Studio.
     */

    public java.util.List<CustomFileSystem> getCustomFileSystems() {
        return customFileSystems;
    }

    /**
     * <p>
     * A file system, created by you, that you assign to a space for an Amazon SageMaker Domain. Permitted users can
     * access this file system in Amazon SageMaker Studio.
     * </p>
     * 
     * @param customFileSystems
     *        A file system, created by you, that you assign to a space for an Amazon SageMaker Domain. Permitted users
     *        can access this file system in Amazon SageMaker Studio.
     */

    public void setCustomFileSystems(java.util.Collection<CustomFileSystem> customFileSystems) {
        if (customFileSystems == null) {
            this.customFileSystems = null;
            return;
        }

        this.customFileSystems = new java.util.ArrayList<CustomFileSystem>(customFileSystems);
    }

    /**
     * <p>
     * A file system, created by you, that you assign to a space for an Amazon SageMaker Domain. Permitted users can
     * access this file system in Amazon SageMaker Studio.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCustomFileSystems(java.util.Collection)} or {@link #withCustomFileSystems(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param customFileSystems
     *        A file system, created by you, that you assign to a space for an Amazon SageMaker Domain. Permitted users
     *        can access this file system in Amazon SageMaker Studio.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpaceSettings withCustomFileSystems(CustomFileSystem... customFileSystems) {
        if (this.customFileSystems == null) {
            setCustomFileSystems(new java.util.ArrayList<CustomFileSystem>(customFileSystems.length));
        }
        for (CustomFileSystem ele : customFileSystems) {
            this.customFileSystems.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A file system, created by you, that you assign to a space for an Amazon SageMaker Domain. Permitted users can
     * access this file system in Amazon SageMaker Studio.
     * </p>
     * 
     * @param customFileSystems
     *        A file system, created by you, that you assign to a space for an Amazon SageMaker Domain. Permitted users
     *        can access this file system in Amazon SageMaker Studio.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpaceSettings withCustomFileSystems(java.util.Collection<CustomFileSystem> customFileSystems) {
        setCustomFileSystems(customFileSystems);
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
            sb.append("KernelGatewayAppSettings: ").append(getKernelGatewayAppSettings()).append(",");
        if (getCodeEditorAppSettings() != null)
            sb.append("CodeEditorAppSettings: ").append(getCodeEditorAppSettings()).append(",");
        if (getJupyterLabAppSettings() != null)
            sb.append("JupyterLabAppSettings: ").append(getJupyterLabAppSettings()).append(",");
        if (getAppType() != null)
            sb.append("AppType: ").append(getAppType()).append(",");
        if (getSpaceStorageSettings() != null)
            sb.append("SpaceStorageSettings: ").append(getSpaceStorageSettings()).append(",");
        if (getCustomFileSystems() != null)
            sb.append("CustomFileSystems: ").append(getCustomFileSystems());
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
        if (other.getCodeEditorAppSettings() == null ^ this.getCodeEditorAppSettings() == null)
            return false;
        if (other.getCodeEditorAppSettings() != null && other.getCodeEditorAppSettings().equals(this.getCodeEditorAppSettings()) == false)
            return false;
        if (other.getJupyterLabAppSettings() == null ^ this.getJupyterLabAppSettings() == null)
            return false;
        if (other.getJupyterLabAppSettings() != null && other.getJupyterLabAppSettings().equals(this.getJupyterLabAppSettings()) == false)
            return false;
        if (other.getAppType() == null ^ this.getAppType() == null)
            return false;
        if (other.getAppType() != null && other.getAppType().equals(this.getAppType()) == false)
            return false;
        if (other.getSpaceStorageSettings() == null ^ this.getSpaceStorageSettings() == null)
            return false;
        if (other.getSpaceStorageSettings() != null && other.getSpaceStorageSettings().equals(this.getSpaceStorageSettings()) == false)
            return false;
        if (other.getCustomFileSystems() == null ^ this.getCustomFileSystems() == null)
            return false;
        if (other.getCustomFileSystems() != null && other.getCustomFileSystems().equals(this.getCustomFileSystems()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJupyterServerAppSettings() == null) ? 0 : getJupyterServerAppSettings().hashCode());
        hashCode = prime * hashCode + ((getKernelGatewayAppSettings() == null) ? 0 : getKernelGatewayAppSettings().hashCode());
        hashCode = prime * hashCode + ((getCodeEditorAppSettings() == null) ? 0 : getCodeEditorAppSettings().hashCode());
        hashCode = prime * hashCode + ((getJupyterLabAppSettings() == null) ? 0 : getJupyterLabAppSettings().hashCode());
        hashCode = prime * hashCode + ((getAppType() == null) ? 0 : getAppType().hashCode());
        hashCode = prime * hashCode + ((getSpaceStorageSettings() == null) ? 0 : getSpaceStorageSettings().hashCode());
        hashCode = prime * hashCode + ((getCustomFileSystems() == null) ? 0 : getCustomFileSystems().hashCode());
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
