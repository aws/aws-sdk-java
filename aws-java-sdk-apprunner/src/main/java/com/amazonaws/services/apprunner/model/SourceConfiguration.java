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
package com.amazonaws.services.apprunner.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the source deployed to an AWS App Runner service. It can be a code or an image repository.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/SourceConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SourceConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The description of a source code repository.
     * </p>
     * <p>
     * You must provide either this member or <code>ImageRepository</code> (but not both).
     * </p>
     */
    private CodeRepository codeRepository;
    /**
     * <p>
     * The description of a source image repository.
     * </p>
     * <p>
     * You must provide either this member or <code>CodeRepository</code> (but not both).
     * </p>
     */
    private ImageRepository imageRepository;
    /**
     * <p>
     * If <code>true</code>, continuous integration from the source repository is enabled for the App Runner service.
     * Each repository change (source code commit or new image version) starts a deployment.
     * </p>
     * <p>
     * Default: <code>true</code>
     * </p>
     */
    private Boolean autoDeploymentsEnabled;
    /**
     * <p>
     * Describes the resources that are needed to authenticate access to some source repositories.
     * </p>
     */
    private AuthenticationConfiguration authenticationConfiguration;

    /**
     * <p>
     * The description of a source code repository.
     * </p>
     * <p>
     * You must provide either this member or <code>ImageRepository</code> (but not both).
     * </p>
     * 
     * @param codeRepository
     *        The description of a source code repository.</p>
     *        <p>
     *        You must provide either this member or <code>ImageRepository</code> (but not both).
     */

    public void setCodeRepository(CodeRepository codeRepository) {
        this.codeRepository = codeRepository;
    }

    /**
     * <p>
     * The description of a source code repository.
     * </p>
     * <p>
     * You must provide either this member or <code>ImageRepository</code> (but not both).
     * </p>
     * 
     * @return The description of a source code repository.</p>
     *         <p>
     *         You must provide either this member or <code>ImageRepository</code> (but not both).
     */

    public CodeRepository getCodeRepository() {
        return this.codeRepository;
    }

    /**
     * <p>
     * The description of a source code repository.
     * </p>
     * <p>
     * You must provide either this member or <code>ImageRepository</code> (but not both).
     * </p>
     * 
     * @param codeRepository
     *        The description of a source code repository.</p>
     *        <p>
     *        You must provide either this member or <code>ImageRepository</code> (but not both).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceConfiguration withCodeRepository(CodeRepository codeRepository) {
        setCodeRepository(codeRepository);
        return this;
    }

    /**
     * <p>
     * The description of a source image repository.
     * </p>
     * <p>
     * You must provide either this member or <code>CodeRepository</code> (but not both).
     * </p>
     * 
     * @param imageRepository
     *        The description of a source image repository.</p>
     *        <p>
     *        You must provide either this member or <code>CodeRepository</code> (but not both).
     */

    public void setImageRepository(ImageRepository imageRepository) {
        this.imageRepository = imageRepository;
    }

    /**
     * <p>
     * The description of a source image repository.
     * </p>
     * <p>
     * You must provide either this member or <code>CodeRepository</code> (but not both).
     * </p>
     * 
     * @return The description of a source image repository.</p>
     *         <p>
     *         You must provide either this member or <code>CodeRepository</code> (but not both).
     */

    public ImageRepository getImageRepository() {
        return this.imageRepository;
    }

    /**
     * <p>
     * The description of a source image repository.
     * </p>
     * <p>
     * You must provide either this member or <code>CodeRepository</code> (but not both).
     * </p>
     * 
     * @param imageRepository
     *        The description of a source image repository.</p>
     *        <p>
     *        You must provide either this member or <code>CodeRepository</code> (but not both).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceConfiguration withImageRepository(ImageRepository imageRepository) {
        setImageRepository(imageRepository);
        return this;
    }

    /**
     * <p>
     * If <code>true</code>, continuous integration from the source repository is enabled for the App Runner service.
     * Each repository change (source code commit or new image version) starts a deployment.
     * </p>
     * <p>
     * Default: <code>true</code>
     * </p>
     * 
     * @param autoDeploymentsEnabled
     *        If <code>true</code>, continuous integration from the source repository is enabled for the App Runner
     *        service. Each repository change (source code commit or new image version) starts a deployment.</p>
     *        <p>
     *        Default: <code>true</code>
     */

    public void setAutoDeploymentsEnabled(Boolean autoDeploymentsEnabled) {
        this.autoDeploymentsEnabled = autoDeploymentsEnabled;
    }

    /**
     * <p>
     * If <code>true</code>, continuous integration from the source repository is enabled for the App Runner service.
     * Each repository change (source code commit or new image version) starts a deployment.
     * </p>
     * <p>
     * Default: <code>true</code>
     * </p>
     * 
     * @return If <code>true</code>, continuous integration from the source repository is enabled for the App Runner
     *         service. Each repository change (source code commit or new image version) starts a deployment.</p>
     *         <p>
     *         Default: <code>true</code>
     */

    public Boolean getAutoDeploymentsEnabled() {
        return this.autoDeploymentsEnabled;
    }

    /**
     * <p>
     * If <code>true</code>, continuous integration from the source repository is enabled for the App Runner service.
     * Each repository change (source code commit or new image version) starts a deployment.
     * </p>
     * <p>
     * Default: <code>true</code>
     * </p>
     * 
     * @param autoDeploymentsEnabled
     *        If <code>true</code>, continuous integration from the source repository is enabled for the App Runner
     *        service. Each repository change (source code commit or new image version) starts a deployment.</p>
     *        <p>
     *        Default: <code>true</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceConfiguration withAutoDeploymentsEnabled(Boolean autoDeploymentsEnabled) {
        setAutoDeploymentsEnabled(autoDeploymentsEnabled);
        return this;
    }

    /**
     * <p>
     * If <code>true</code>, continuous integration from the source repository is enabled for the App Runner service.
     * Each repository change (source code commit or new image version) starts a deployment.
     * </p>
     * <p>
     * Default: <code>true</code>
     * </p>
     * 
     * @return If <code>true</code>, continuous integration from the source repository is enabled for the App Runner
     *         service. Each repository change (source code commit or new image version) starts a deployment.</p>
     *         <p>
     *         Default: <code>true</code>
     */

    public Boolean isAutoDeploymentsEnabled() {
        return this.autoDeploymentsEnabled;
    }

    /**
     * <p>
     * Describes the resources that are needed to authenticate access to some source repositories.
     * </p>
     * 
     * @param authenticationConfiguration
     *        Describes the resources that are needed to authenticate access to some source repositories.
     */

    public void setAuthenticationConfiguration(AuthenticationConfiguration authenticationConfiguration) {
        this.authenticationConfiguration = authenticationConfiguration;
    }

    /**
     * <p>
     * Describes the resources that are needed to authenticate access to some source repositories.
     * </p>
     * 
     * @return Describes the resources that are needed to authenticate access to some source repositories.
     */

    public AuthenticationConfiguration getAuthenticationConfiguration() {
        return this.authenticationConfiguration;
    }

    /**
     * <p>
     * Describes the resources that are needed to authenticate access to some source repositories.
     * </p>
     * 
     * @param authenticationConfiguration
     *        Describes the resources that are needed to authenticate access to some source repositories.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceConfiguration withAuthenticationConfiguration(AuthenticationConfiguration authenticationConfiguration) {
        setAuthenticationConfiguration(authenticationConfiguration);
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
        if (getCodeRepository() != null)
            sb.append("CodeRepository: ").append(getCodeRepository()).append(",");
        if (getImageRepository() != null)
            sb.append("ImageRepository: ").append(getImageRepository()).append(",");
        if (getAutoDeploymentsEnabled() != null)
            sb.append("AutoDeploymentsEnabled: ").append(getAutoDeploymentsEnabled()).append(",");
        if (getAuthenticationConfiguration() != null)
            sb.append("AuthenticationConfiguration: ").append(getAuthenticationConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SourceConfiguration == false)
            return false;
        SourceConfiguration other = (SourceConfiguration) obj;
        if (other.getCodeRepository() == null ^ this.getCodeRepository() == null)
            return false;
        if (other.getCodeRepository() != null && other.getCodeRepository().equals(this.getCodeRepository()) == false)
            return false;
        if (other.getImageRepository() == null ^ this.getImageRepository() == null)
            return false;
        if (other.getImageRepository() != null && other.getImageRepository().equals(this.getImageRepository()) == false)
            return false;
        if (other.getAutoDeploymentsEnabled() == null ^ this.getAutoDeploymentsEnabled() == null)
            return false;
        if (other.getAutoDeploymentsEnabled() != null && other.getAutoDeploymentsEnabled().equals(this.getAutoDeploymentsEnabled()) == false)
            return false;
        if (other.getAuthenticationConfiguration() == null ^ this.getAuthenticationConfiguration() == null)
            return false;
        if (other.getAuthenticationConfiguration() != null && other.getAuthenticationConfiguration().equals(this.getAuthenticationConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCodeRepository() == null) ? 0 : getCodeRepository().hashCode());
        hashCode = prime * hashCode + ((getImageRepository() == null) ? 0 : getImageRepository().hashCode());
        hashCode = prime * hashCode + ((getAutoDeploymentsEnabled() == null) ? 0 : getAutoDeploymentsEnabled().hashCode());
        hashCode = prime * hashCode + ((getAuthenticationConfiguration() == null) ? 0 : getAuthenticationConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public SourceConfiguration clone() {
        try {
            return (SourceConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.apprunner.model.transform.SourceConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
