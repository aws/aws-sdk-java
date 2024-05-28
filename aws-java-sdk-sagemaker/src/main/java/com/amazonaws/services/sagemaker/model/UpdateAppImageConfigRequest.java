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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/UpdateAppImageConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateAppImageConfigRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the AppImageConfig to update.
     * </p>
     */
    private String appImageConfigName;
    /**
     * <p>
     * The new KernelGateway app to run on the image.
     * </p>
     */
    private KernelGatewayImageConfig kernelGatewayImageConfig;
    /**
     * <p>
     * The JupyterLab app running on the image.
     * </p>
     */
    private JupyterLabAppImageConfig jupyterLabAppImageConfig;
    /**
     * <p>
     * The Code Editor app running on the image.
     * </p>
     */
    private CodeEditorAppImageConfig codeEditorAppImageConfig;

    /**
     * <p>
     * The name of the AppImageConfig to update.
     * </p>
     * 
     * @param appImageConfigName
     *        The name of the AppImageConfig to update.
     */

    public void setAppImageConfigName(String appImageConfigName) {
        this.appImageConfigName = appImageConfigName;
    }

    /**
     * <p>
     * The name of the AppImageConfig to update.
     * </p>
     * 
     * @return The name of the AppImageConfig to update.
     */

    public String getAppImageConfigName() {
        return this.appImageConfigName;
    }

    /**
     * <p>
     * The name of the AppImageConfig to update.
     * </p>
     * 
     * @param appImageConfigName
     *        The name of the AppImageConfig to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAppImageConfigRequest withAppImageConfigName(String appImageConfigName) {
        setAppImageConfigName(appImageConfigName);
        return this;
    }

    /**
     * <p>
     * The new KernelGateway app to run on the image.
     * </p>
     * 
     * @param kernelGatewayImageConfig
     *        The new KernelGateway app to run on the image.
     */

    public void setKernelGatewayImageConfig(KernelGatewayImageConfig kernelGatewayImageConfig) {
        this.kernelGatewayImageConfig = kernelGatewayImageConfig;
    }

    /**
     * <p>
     * The new KernelGateway app to run on the image.
     * </p>
     * 
     * @return The new KernelGateway app to run on the image.
     */

    public KernelGatewayImageConfig getKernelGatewayImageConfig() {
        return this.kernelGatewayImageConfig;
    }

    /**
     * <p>
     * The new KernelGateway app to run on the image.
     * </p>
     * 
     * @param kernelGatewayImageConfig
     *        The new KernelGateway app to run on the image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAppImageConfigRequest withKernelGatewayImageConfig(KernelGatewayImageConfig kernelGatewayImageConfig) {
        setKernelGatewayImageConfig(kernelGatewayImageConfig);
        return this;
    }

    /**
     * <p>
     * The JupyterLab app running on the image.
     * </p>
     * 
     * @param jupyterLabAppImageConfig
     *        The JupyterLab app running on the image.
     */

    public void setJupyterLabAppImageConfig(JupyterLabAppImageConfig jupyterLabAppImageConfig) {
        this.jupyterLabAppImageConfig = jupyterLabAppImageConfig;
    }

    /**
     * <p>
     * The JupyterLab app running on the image.
     * </p>
     * 
     * @return The JupyterLab app running on the image.
     */

    public JupyterLabAppImageConfig getJupyterLabAppImageConfig() {
        return this.jupyterLabAppImageConfig;
    }

    /**
     * <p>
     * The JupyterLab app running on the image.
     * </p>
     * 
     * @param jupyterLabAppImageConfig
     *        The JupyterLab app running on the image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAppImageConfigRequest withJupyterLabAppImageConfig(JupyterLabAppImageConfig jupyterLabAppImageConfig) {
        setJupyterLabAppImageConfig(jupyterLabAppImageConfig);
        return this;
    }

    /**
     * <p>
     * The Code Editor app running on the image.
     * </p>
     * 
     * @param codeEditorAppImageConfig
     *        The Code Editor app running on the image.
     */

    public void setCodeEditorAppImageConfig(CodeEditorAppImageConfig codeEditorAppImageConfig) {
        this.codeEditorAppImageConfig = codeEditorAppImageConfig;
    }

    /**
     * <p>
     * The Code Editor app running on the image.
     * </p>
     * 
     * @return The Code Editor app running on the image.
     */

    public CodeEditorAppImageConfig getCodeEditorAppImageConfig() {
        return this.codeEditorAppImageConfig;
    }

    /**
     * <p>
     * The Code Editor app running on the image.
     * </p>
     * 
     * @param codeEditorAppImageConfig
     *        The Code Editor app running on the image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAppImageConfigRequest withCodeEditorAppImageConfig(CodeEditorAppImageConfig codeEditorAppImageConfig) {
        setCodeEditorAppImageConfig(codeEditorAppImageConfig);
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
        if (getAppImageConfigName() != null)
            sb.append("AppImageConfigName: ").append(getAppImageConfigName()).append(",");
        if (getKernelGatewayImageConfig() != null)
            sb.append("KernelGatewayImageConfig: ").append(getKernelGatewayImageConfig()).append(",");
        if (getJupyterLabAppImageConfig() != null)
            sb.append("JupyterLabAppImageConfig: ").append(getJupyterLabAppImageConfig()).append(",");
        if (getCodeEditorAppImageConfig() != null)
            sb.append("CodeEditorAppImageConfig: ").append(getCodeEditorAppImageConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateAppImageConfigRequest == false)
            return false;
        UpdateAppImageConfigRequest other = (UpdateAppImageConfigRequest) obj;
        if (other.getAppImageConfigName() == null ^ this.getAppImageConfigName() == null)
            return false;
        if (other.getAppImageConfigName() != null && other.getAppImageConfigName().equals(this.getAppImageConfigName()) == false)
            return false;
        if (other.getKernelGatewayImageConfig() == null ^ this.getKernelGatewayImageConfig() == null)
            return false;
        if (other.getKernelGatewayImageConfig() != null && other.getKernelGatewayImageConfig().equals(this.getKernelGatewayImageConfig()) == false)
            return false;
        if (other.getJupyterLabAppImageConfig() == null ^ this.getJupyterLabAppImageConfig() == null)
            return false;
        if (other.getJupyterLabAppImageConfig() != null && other.getJupyterLabAppImageConfig().equals(this.getJupyterLabAppImageConfig()) == false)
            return false;
        if (other.getCodeEditorAppImageConfig() == null ^ this.getCodeEditorAppImageConfig() == null)
            return false;
        if (other.getCodeEditorAppImageConfig() != null && other.getCodeEditorAppImageConfig().equals(this.getCodeEditorAppImageConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAppImageConfigName() == null) ? 0 : getAppImageConfigName().hashCode());
        hashCode = prime * hashCode + ((getKernelGatewayImageConfig() == null) ? 0 : getKernelGatewayImageConfig().hashCode());
        hashCode = prime * hashCode + ((getJupyterLabAppImageConfig() == null) ? 0 : getJupyterLabAppImageConfig().hashCode());
        hashCode = prime * hashCode + ((getCodeEditorAppImageConfig() == null) ? 0 : getCodeEditorAppImageConfig().hashCode());
        return hashCode;
    }

    @Override
    public UpdateAppImageConfigRequest clone() {
        return (UpdateAppImageConfigRequest) super.clone();
    }

}
