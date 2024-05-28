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
 * The SageMaker Canvas application settings.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CanvasAppSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CanvasAppSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Time series forecast settings for the SageMaker Canvas application.
     * </p>
     */
    private TimeSeriesForecastingSettings timeSeriesForecastingSettings;
    /**
     * <p>
     * The model registry settings for the SageMaker Canvas application.
     * </p>
     */
    private ModelRegisterSettings modelRegisterSettings;
    /**
     * <p>
     * The workspace settings for the SageMaker Canvas application.
     * </p>
     */
    private WorkspaceSettings workspaceSettings;
    /**
     * <p>
     * The settings for connecting to an external data source with OAuth.
     * </p>
     */
    private java.util.List<IdentityProviderOAuthSetting> identityProviderOAuthSettings;
    /**
     * <p>
     * The model deployment settings for the SageMaker Canvas application.
     * </p>
     */
    private DirectDeploySettings directDeploySettings;
    /**
     * <p>
     * The settings for document querying.
     * </p>
     */
    private KendraSettings kendraSettings;
    /**
     * <p>
     * The generative AI settings for the SageMaker Canvas application.
     * </p>
     */
    private GenerativeAiSettings generativeAiSettings;

    /**
     * <p>
     * Time series forecast settings for the SageMaker Canvas application.
     * </p>
     * 
     * @param timeSeriesForecastingSettings
     *        Time series forecast settings for the SageMaker Canvas application.
     */

    public void setTimeSeriesForecastingSettings(TimeSeriesForecastingSettings timeSeriesForecastingSettings) {
        this.timeSeriesForecastingSettings = timeSeriesForecastingSettings;
    }

    /**
     * <p>
     * Time series forecast settings for the SageMaker Canvas application.
     * </p>
     * 
     * @return Time series forecast settings for the SageMaker Canvas application.
     */

    public TimeSeriesForecastingSettings getTimeSeriesForecastingSettings() {
        return this.timeSeriesForecastingSettings;
    }

    /**
     * <p>
     * Time series forecast settings for the SageMaker Canvas application.
     * </p>
     * 
     * @param timeSeriesForecastingSettings
     *        Time series forecast settings for the SageMaker Canvas application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CanvasAppSettings withTimeSeriesForecastingSettings(TimeSeriesForecastingSettings timeSeriesForecastingSettings) {
        setTimeSeriesForecastingSettings(timeSeriesForecastingSettings);
        return this;
    }

    /**
     * <p>
     * The model registry settings for the SageMaker Canvas application.
     * </p>
     * 
     * @param modelRegisterSettings
     *        The model registry settings for the SageMaker Canvas application.
     */

    public void setModelRegisterSettings(ModelRegisterSettings modelRegisterSettings) {
        this.modelRegisterSettings = modelRegisterSettings;
    }

    /**
     * <p>
     * The model registry settings for the SageMaker Canvas application.
     * </p>
     * 
     * @return The model registry settings for the SageMaker Canvas application.
     */

    public ModelRegisterSettings getModelRegisterSettings() {
        return this.modelRegisterSettings;
    }

    /**
     * <p>
     * The model registry settings for the SageMaker Canvas application.
     * </p>
     * 
     * @param modelRegisterSettings
     *        The model registry settings for the SageMaker Canvas application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CanvasAppSettings withModelRegisterSettings(ModelRegisterSettings modelRegisterSettings) {
        setModelRegisterSettings(modelRegisterSettings);
        return this;
    }

    /**
     * <p>
     * The workspace settings for the SageMaker Canvas application.
     * </p>
     * 
     * @param workspaceSettings
     *        The workspace settings for the SageMaker Canvas application.
     */

    public void setWorkspaceSettings(WorkspaceSettings workspaceSettings) {
        this.workspaceSettings = workspaceSettings;
    }

    /**
     * <p>
     * The workspace settings for the SageMaker Canvas application.
     * </p>
     * 
     * @return The workspace settings for the SageMaker Canvas application.
     */

    public WorkspaceSettings getWorkspaceSettings() {
        return this.workspaceSettings;
    }

    /**
     * <p>
     * The workspace settings for the SageMaker Canvas application.
     * </p>
     * 
     * @param workspaceSettings
     *        The workspace settings for the SageMaker Canvas application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CanvasAppSettings withWorkspaceSettings(WorkspaceSettings workspaceSettings) {
        setWorkspaceSettings(workspaceSettings);
        return this;
    }

    /**
     * <p>
     * The settings for connecting to an external data source with OAuth.
     * </p>
     * 
     * @return The settings for connecting to an external data source with OAuth.
     */

    public java.util.List<IdentityProviderOAuthSetting> getIdentityProviderOAuthSettings() {
        return identityProviderOAuthSettings;
    }

    /**
     * <p>
     * The settings for connecting to an external data source with OAuth.
     * </p>
     * 
     * @param identityProviderOAuthSettings
     *        The settings for connecting to an external data source with OAuth.
     */

    public void setIdentityProviderOAuthSettings(java.util.Collection<IdentityProviderOAuthSetting> identityProviderOAuthSettings) {
        if (identityProviderOAuthSettings == null) {
            this.identityProviderOAuthSettings = null;
            return;
        }

        this.identityProviderOAuthSettings = new java.util.ArrayList<IdentityProviderOAuthSetting>(identityProviderOAuthSettings);
    }

    /**
     * <p>
     * The settings for connecting to an external data source with OAuth.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIdentityProviderOAuthSettings(java.util.Collection)} or
     * {@link #withIdentityProviderOAuthSettings(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param identityProviderOAuthSettings
     *        The settings for connecting to an external data source with OAuth.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CanvasAppSettings withIdentityProviderOAuthSettings(IdentityProviderOAuthSetting... identityProviderOAuthSettings) {
        if (this.identityProviderOAuthSettings == null) {
            setIdentityProviderOAuthSettings(new java.util.ArrayList<IdentityProviderOAuthSetting>(identityProviderOAuthSettings.length));
        }
        for (IdentityProviderOAuthSetting ele : identityProviderOAuthSettings) {
            this.identityProviderOAuthSettings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The settings for connecting to an external data source with OAuth.
     * </p>
     * 
     * @param identityProviderOAuthSettings
     *        The settings for connecting to an external data source with OAuth.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CanvasAppSettings withIdentityProviderOAuthSettings(java.util.Collection<IdentityProviderOAuthSetting> identityProviderOAuthSettings) {
        setIdentityProviderOAuthSettings(identityProviderOAuthSettings);
        return this;
    }

    /**
     * <p>
     * The model deployment settings for the SageMaker Canvas application.
     * </p>
     * 
     * @param directDeploySettings
     *        The model deployment settings for the SageMaker Canvas application.
     */

    public void setDirectDeploySettings(DirectDeploySettings directDeploySettings) {
        this.directDeploySettings = directDeploySettings;
    }

    /**
     * <p>
     * The model deployment settings for the SageMaker Canvas application.
     * </p>
     * 
     * @return The model deployment settings for the SageMaker Canvas application.
     */

    public DirectDeploySettings getDirectDeploySettings() {
        return this.directDeploySettings;
    }

    /**
     * <p>
     * The model deployment settings for the SageMaker Canvas application.
     * </p>
     * 
     * @param directDeploySettings
     *        The model deployment settings for the SageMaker Canvas application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CanvasAppSettings withDirectDeploySettings(DirectDeploySettings directDeploySettings) {
        setDirectDeploySettings(directDeploySettings);
        return this;
    }

    /**
     * <p>
     * The settings for document querying.
     * </p>
     * 
     * @param kendraSettings
     *        The settings for document querying.
     */

    public void setKendraSettings(KendraSettings kendraSettings) {
        this.kendraSettings = kendraSettings;
    }

    /**
     * <p>
     * The settings for document querying.
     * </p>
     * 
     * @return The settings for document querying.
     */

    public KendraSettings getKendraSettings() {
        return this.kendraSettings;
    }

    /**
     * <p>
     * The settings for document querying.
     * </p>
     * 
     * @param kendraSettings
     *        The settings for document querying.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CanvasAppSettings withKendraSettings(KendraSettings kendraSettings) {
        setKendraSettings(kendraSettings);
        return this;
    }

    /**
     * <p>
     * The generative AI settings for the SageMaker Canvas application.
     * </p>
     * 
     * @param generativeAiSettings
     *        The generative AI settings for the SageMaker Canvas application.
     */

    public void setGenerativeAiSettings(GenerativeAiSettings generativeAiSettings) {
        this.generativeAiSettings = generativeAiSettings;
    }

    /**
     * <p>
     * The generative AI settings for the SageMaker Canvas application.
     * </p>
     * 
     * @return The generative AI settings for the SageMaker Canvas application.
     */

    public GenerativeAiSettings getGenerativeAiSettings() {
        return this.generativeAiSettings;
    }

    /**
     * <p>
     * The generative AI settings for the SageMaker Canvas application.
     * </p>
     * 
     * @param generativeAiSettings
     *        The generative AI settings for the SageMaker Canvas application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CanvasAppSettings withGenerativeAiSettings(GenerativeAiSettings generativeAiSettings) {
        setGenerativeAiSettings(generativeAiSettings);
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
        if (getTimeSeriesForecastingSettings() != null)
            sb.append("TimeSeriesForecastingSettings: ").append(getTimeSeriesForecastingSettings()).append(",");
        if (getModelRegisterSettings() != null)
            sb.append("ModelRegisterSettings: ").append(getModelRegisterSettings()).append(",");
        if (getWorkspaceSettings() != null)
            sb.append("WorkspaceSettings: ").append(getWorkspaceSettings()).append(",");
        if (getIdentityProviderOAuthSettings() != null)
            sb.append("IdentityProviderOAuthSettings: ").append(getIdentityProviderOAuthSettings()).append(",");
        if (getDirectDeploySettings() != null)
            sb.append("DirectDeploySettings: ").append(getDirectDeploySettings()).append(",");
        if (getKendraSettings() != null)
            sb.append("KendraSettings: ").append(getKendraSettings()).append(",");
        if (getGenerativeAiSettings() != null)
            sb.append("GenerativeAiSettings: ").append(getGenerativeAiSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CanvasAppSettings == false)
            return false;
        CanvasAppSettings other = (CanvasAppSettings) obj;
        if (other.getTimeSeriesForecastingSettings() == null ^ this.getTimeSeriesForecastingSettings() == null)
            return false;
        if (other.getTimeSeriesForecastingSettings() != null
                && other.getTimeSeriesForecastingSettings().equals(this.getTimeSeriesForecastingSettings()) == false)
            return false;
        if (other.getModelRegisterSettings() == null ^ this.getModelRegisterSettings() == null)
            return false;
        if (other.getModelRegisterSettings() != null && other.getModelRegisterSettings().equals(this.getModelRegisterSettings()) == false)
            return false;
        if (other.getWorkspaceSettings() == null ^ this.getWorkspaceSettings() == null)
            return false;
        if (other.getWorkspaceSettings() != null && other.getWorkspaceSettings().equals(this.getWorkspaceSettings()) == false)
            return false;
        if (other.getIdentityProviderOAuthSettings() == null ^ this.getIdentityProviderOAuthSettings() == null)
            return false;
        if (other.getIdentityProviderOAuthSettings() != null
                && other.getIdentityProviderOAuthSettings().equals(this.getIdentityProviderOAuthSettings()) == false)
            return false;
        if (other.getDirectDeploySettings() == null ^ this.getDirectDeploySettings() == null)
            return false;
        if (other.getDirectDeploySettings() != null && other.getDirectDeploySettings().equals(this.getDirectDeploySettings()) == false)
            return false;
        if (other.getKendraSettings() == null ^ this.getKendraSettings() == null)
            return false;
        if (other.getKendraSettings() != null && other.getKendraSettings().equals(this.getKendraSettings()) == false)
            return false;
        if (other.getGenerativeAiSettings() == null ^ this.getGenerativeAiSettings() == null)
            return false;
        if (other.getGenerativeAiSettings() != null && other.getGenerativeAiSettings().equals(this.getGenerativeAiSettings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTimeSeriesForecastingSettings() == null) ? 0 : getTimeSeriesForecastingSettings().hashCode());
        hashCode = prime * hashCode + ((getModelRegisterSettings() == null) ? 0 : getModelRegisterSettings().hashCode());
        hashCode = prime * hashCode + ((getWorkspaceSettings() == null) ? 0 : getWorkspaceSettings().hashCode());
        hashCode = prime * hashCode + ((getIdentityProviderOAuthSettings() == null) ? 0 : getIdentityProviderOAuthSettings().hashCode());
        hashCode = prime * hashCode + ((getDirectDeploySettings() == null) ? 0 : getDirectDeploySettings().hashCode());
        hashCode = prime * hashCode + ((getKendraSettings() == null) ? 0 : getKendraSettings().hashCode());
        hashCode = prime * hashCode + ((getGenerativeAiSettings() == null) ? 0 : getGenerativeAiSettings().hashCode());
        return hashCode;
    }

    @Override
    public CanvasAppSettings clone() {
        try {
            return (CanvasAppSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.CanvasAppSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
