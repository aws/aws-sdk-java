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
package com.amazonaws.services.qbusiness.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/GetWebExperience" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetWebExperienceResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the Amazon Q Business application linked to the web experience.
     * </p>
     */
    private String applicationId;
    /**
     * <p>
     * The identifier of the Amazon Q Business web experience.
     * </p>
     */
    private String webExperienceId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role with the permission to access the Amazon Q Business web experience and
     * required resources.
     * </p>
     */
    private String webExperienceArn;
    /**
     * <p>
     * The endpoint of your Amazon Q Business web experience.
     * </p>
     */
    private String defaultEndpoint;
    /**
     * <p>
     * The current status of the Amazon Q Business web experience. When the <code>Status</code> field value is
     * <code>FAILED</code>, the <code>ErrorMessage</code> field contains a description of the error that caused the data
     * source connector to fail.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The Unix timestamp when the Amazon Q Business web experience was last created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The Unix timestamp when the Amazon Q Business web experience was last updated.
     * </p>
     */
    private java.util.Date updatedAt;
    /**
     * <p>
     * The title for your Amazon Q Business web experience.
     * </p>
     */
    private String title;
    /**
     * <p>
     * The subtitle for your Amazon Q Business web experience.
     * </p>
     */
    private String subtitle;
    /**
     * <p>
     * The customized welcome message for end users of an Amazon Q Business web experience.
     * </p>
     */
    private String welcomeMessage;
    /**
     * <p>
     * Determines whether sample prompts are enabled in the web experience for an end user.
     * </p>
     */
    private String samplePromptsControlMode;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the service role attached to your web experience.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The authentication configuration information for your Amazon Q Business web experience.
     * </p>
     */
    @Deprecated
    private WebExperienceAuthConfiguration authenticationConfiguration;
    /**
     * <p>
     * When the <code>Status</code> field value is <code>FAILED</code>, the <code>ErrorMessage</code> field contains a
     * description of the error that caused the data source connector to fail.
     * </p>
     */
    private ErrorDetail error;

    /**
     * <p>
     * The identifier of the Amazon Q Business application linked to the web experience.
     * </p>
     * 
     * @param applicationId
     *        The identifier of the Amazon Q Business application linked to the web experience.
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The identifier of the Amazon Q Business application linked to the web experience.
     * </p>
     * 
     * @return The identifier of the Amazon Q Business application linked to the web experience.
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * <p>
     * The identifier of the Amazon Q Business application linked to the web experience.
     * </p>
     * 
     * @param applicationId
     *        The identifier of the Amazon Q Business application linked to the web experience.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWebExperienceResult withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * <p>
     * The identifier of the Amazon Q Business web experience.
     * </p>
     * 
     * @param webExperienceId
     *        The identifier of the Amazon Q Business web experience.
     */

    public void setWebExperienceId(String webExperienceId) {
        this.webExperienceId = webExperienceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Q Business web experience.
     * </p>
     * 
     * @return The identifier of the Amazon Q Business web experience.
     */

    public String getWebExperienceId() {
        return this.webExperienceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Q Business web experience.
     * </p>
     * 
     * @param webExperienceId
     *        The identifier of the Amazon Q Business web experience.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWebExperienceResult withWebExperienceId(String webExperienceId) {
        setWebExperienceId(webExperienceId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role with the permission to access the Amazon Q Business web experience and
     * required resources.
     * </p>
     * 
     * @param webExperienceArn
     *        The Amazon Resource Name (ARN) of the role with the permission to access the Amazon Q Business web
     *        experience and required resources.
     */

    public void setWebExperienceArn(String webExperienceArn) {
        this.webExperienceArn = webExperienceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role with the permission to access the Amazon Q Business web experience and
     * required resources.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the role with the permission to access the Amazon Q Business web
     *         experience and required resources.
     */

    public String getWebExperienceArn() {
        return this.webExperienceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role with the permission to access the Amazon Q Business web experience and
     * required resources.
     * </p>
     * 
     * @param webExperienceArn
     *        The Amazon Resource Name (ARN) of the role with the permission to access the Amazon Q Business web
     *        experience and required resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWebExperienceResult withWebExperienceArn(String webExperienceArn) {
        setWebExperienceArn(webExperienceArn);
        return this;
    }

    /**
     * <p>
     * The endpoint of your Amazon Q Business web experience.
     * </p>
     * 
     * @param defaultEndpoint
     *        The endpoint of your Amazon Q Business web experience.
     */

    public void setDefaultEndpoint(String defaultEndpoint) {
        this.defaultEndpoint = defaultEndpoint;
    }

    /**
     * <p>
     * The endpoint of your Amazon Q Business web experience.
     * </p>
     * 
     * @return The endpoint of your Amazon Q Business web experience.
     */

    public String getDefaultEndpoint() {
        return this.defaultEndpoint;
    }

    /**
     * <p>
     * The endpoint of your Amazon Q Business web experience.
     * </p>
     * 
     * @param defaultEndpoint
     *        The endpoint of your Amazon Q Business web experience.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWebExperienceResult withDefaultEndpoint(String defaultEndpoint) {
        setDefaultEndpoint(defaultEndpoint);
        return this;
    }

    /**
     * <p>
     * The current status of the Amazon Q Business web experience. When the <code>Status</code> field value is
     * <code>FAILED</code>, the <code>ErrorMessage</code> field contains a description of the error that caused the data
     * source connector to fail.
     * </p>
     * 
     * @param status
     *        The current status of the Amazon Q Business web experience. When the <code>Status</code> field value is
     *        <code>FAILED</code>, the <code>ErrorMessage</code> field contains a description of the error that caused
     *        the data source connector to fail.
     * @see WebExperienceStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the Amazon Q Business web experience. When the <code>Status</code> field value is
     * <code>FAILED</code>, the <code>ErrorMessage</code> field contains a description of the error that caused the data
     * source connector to fail.
     * </p>
     * 
     * @return The current status of the Amazon Q Business web experience. When the <code>Status</code> field value is
     *         <code>FAILED</code>, the <code>ErrorMessage</code> field contains a description of the error that caused
     *         the data source connector to fail.
     * @see WebExperienceStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the Amazon Q Business web experience. When the <code>Status</code> field value is
     * <code>FAILED</code>, the <code>ErrorMessage</code> field contains a description of the error that caused the data
     * source connector to fail.
     * </p>
     * 
     * @param status
     *        The current status of the Amazon Q Business web experience. When the <code>Status</code> field value is
     *        <code>FAILED</code>, the <code>ErrorMessage</code> field contains a description of the error that caused
     *        the data source connector to fail.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WebExperienceStatus
     */

    public GetWebExperienceResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current status of the Amazon Q Business web experience. When the <code>Status</code> field value is
     * <code>FAILED</code>, the <code>ErrorMessage</code> field contains a description of the error that caused the data
     * source connector to fail.
     * </p>
     * 
     * @param status
     *        The current status of the Amazon Q Business web experience. When the <code>Status</code> field value is
     *        <code>FAILED</code>, the <code>ErrorMessage</code> field contains a description of the error that caused
     *        the data source connector to fail.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WebExperienceStatus
     */

    public GetWebExperienceResult withStatus(WebExperienceStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The Unix timestamp when the Amazon Q Business web experience was last created.
     * </p>
     * 
     * @param createdAt
     *        The Unix timestamp when the Amazon Q Business web experience was last created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The Unix timestamp when the Amazon Q Business web experience was last created.
     * </p>
     * 
     * @return The Unix timestamp when the Amazon Q Business web experience was last created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The Unix timestamp when the Amazon Q Business web experience was last created.
     * </p>
     * 
     * @param createdAt
     *        The Unix timestamp when the Amazon Q Business web experience was last created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWebExperienceResult withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The Unix timestamp when the Amazon Q Business web experience was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The Unix timestamp when the Amazon Q Business web experience was last updated.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The Unix timestamp when the Amazon Q Business web experience was last updated.
     * </p>
     * 
     * @return The Unix timestamp when the Amazon Q Business web experience was last updated.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The Unix timestamp when the Amazon Q Business web experience was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The Unix timestamp when the Amazon Q Business web experience was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWebExperienceResult withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
        return this;
    }

    /**
     * <p>
     * The title for your Amazon Q Business web experience.
     * </p>
     * 
     * @param title
     *        The title for your Amazon Q Business web experience.
     */

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * <p>
     * The title for your Amazon Q Business web experience.
     * </p>
     * 
     * @return The title for your Amazon Q Business web experience.
     */

    public String getTitle() {
        return this.title;
    }

    /**
     * <p>
     * The title for your Amazon Q Business web experience.
     * </p>
     * 
     * @param title
     *        The title for your Amazon Q Business web experience.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWebExperienceResult withTitle(String title) {
        setTitle(title);
        return this;
    }

    /**
     * <p>
     * The subtitle for your Amazon Q Business web experience.
     * </p>
     * 
     * @param subtitle
     *        The subtitle for your Amazon Q Business web experience.
     */

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    /**
     * <p>
     * The subtitle for your Amazon Q Business web experience.
     * </p>
     * 
     * @return The subtitle for your Amazon Q Business web experience.
     */

    public String getSubtitle() {
        return this.subtitle;
    }

    /**
     * <p>
     * The subtitle for your Amazon Q Business web experience.
     * </p>
     * 
     * @param subtitle
     *        The subtitle for your Amazon Q Business web experience.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWebExperienceResult withSubtitle(String subtitle) {
        setSubtitle(subtitle);
        return this;
    }

    /**
     * <p>
     * The customized welcome message for end users of an Amazon Q Business web experience.
     * </p>
     * 
     * @param welcomeMessage
     *        The customized welcome message for end users of an Amazon Q Business web experience.
     */

    public void setWelcomeMessage(String welcomeMessage) {
        this.welcomeMessage = welcomeMessage;
    }

    /**
     * <p>
     * The customized welcome message for end users of an Amazon Q Business web experience.
     * </p>
     * 
     * @return The customized welcome message for end users of an Amazon Q Business web experience.
     */

    public String getWelcomeMessage() {
        return this.welcomeMessage;
    }

    /**
     * <p>
     * The customized welcome message for end users of an Amazon Q Business web experience.
     * </p>
     * 
     * @param welcomeMessage
     *        The customized welcome message for end users of an Amazon Q Business web experience.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWebExperienceResult withWelcomeMessage(String welcomeMessage) {
        setWelcomeMessage(welcomeMessage);
        return this;
    }

    /**
     * <p>
     * Determines whether sample prompts are enabled in the web experience for an end user.
     * </p>
     * 
     * @param samplePromptsControlMode
     *        Determines whether sample prompts are enabled in the web experience for an end user.
     * @see WebExperienceSamplePromptsControlMode
     */

    public void setSamplePromptsControlMode(String samplePromptsControlMode) {
        this.samplePromptsControlMode = samplePromptsControlMode;
    }

    /**
     * <p>
     * Determines whether sample prompts are enabled in the web experience for an end user.
     * </p>
     * 
     * @return Determines whether sample prompts are enabled in the web experience for an end user.
     * @see WebExperienceSamplePromptsControlMode
     */

    public String getSamplePromptsControlMode() {
        return this.samplePromptsControlMode;
    }

    /**
     * <p>
     * Determines whether sample prompts are enabled in the web experience for an end user.
     * </p>
     * 
     * @param samplePromptsControlMode
     *        Determines whether sample prompts are enabled in the web experience for an end user.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WebExperienceSamplePromptsControlMode
     */

    public GetWebExperienceResult withSamplePromptsControlMode(String samplePromptsControlMode) {
        setSamplePromptsControlMode(samplePromptsControlMode);
        return this;
    }

    /**
     * <p>
     * Determines whether sample prompts are enabled in the web experience for an end user.
     * </p>
     * 
     * @param samplePromptsControlMode
     *        Determines whether sample prompts are enabled in the web experience for an end user.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WebExperienceSamplePromptsControlMode
     */

    public GetWebExperienceResult withSamplePromptsControlMode(WebExperienceSamplePromptsControlMode samplePromptsControlMode) {
        this.samplePromptsControlMode = samplePromptsControlMode.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the service role attached to your web experience.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the service role attached to your web experience.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the service role attached to your web experience.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the service role attached to your web experience.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the service role attached to your web experience.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the service role attached to your web experience.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWebExperienceResult withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The authentication configuration information for your Amazon Q Business web experience.
     * </p>
     * 
     * @param authenticationConfiguration
     *        The authentication configuration information for your Amazon Q Business web experience.
     */
    @Deprecated
    public void setAuthenticationConfiguration(WebExperienceAuthConfiguration authenticationConfiguration) {
        this.authenticationConfiguration = authenticationConfiguration;
    }

    /**
     * <p>
     * The authentication configuration information for your Amazon Q Business web experience.
     * </p>
     * 
     * @return The authentication configuration information for your Amazon Q Business web experience.
     */
    @Deprecated
    public WebExperienceAuthConfiguration getAuthenticationConfiguration() {
        return this.authenticationConfiguration;
    }

    /**
     * <p>
     * The authentication configuration information for your Amazon Q Business web experience.
     * </p>
     * 
     * @param authenticationConfiguration
     *        The authentication configuration information for your Amazon Q Business web experience.
     * @return Returns a reference to this object so that method calls can be chained together.
     */
    @Deprecated
    public GetWebExperienceResult withAuthenticationConfiguration(WebExperienceAuthConfiguration authenticationConfiguration) {
        setAuthenticationConfiguration(authenticationConfiguration);
        return this;
    }

    /**
     * <p>
     * When the <code>Status</code> field value is <code>FAILED</code>, the <code>ErrorMessage</code> field contains a
     * description of the error that caused the data source connector to fail.
     * </p>
     * 
     * @param error
     *        When the <code>Status</code> field value is <code>FAILED</code>, the <code>ErrorMessage</code> field
     *        contains a description of the error that caused the data source connector to fail.
     */

    public void setError(ErrorDetail error) {
        this.error = error;
    }

    /**
     * <p>
     * When the <code>Status</code> field value is <code>FAILED</code>, the <code>ErrorMessage</code> field contains a
     * description of the error that caused the data source connector to fail.
     * </p>
     * 
     * @return When the <code>Status</code> field value is <code>FAILED</code>, the <code>ErrorMessage</code> field
     *         contains a description of the error that caused the data source connector to fail.
     */

    public ErrorDetail getError() {
        return this.error;
    }

    /**
     * <p>
     * When the <code>Status</code> field value is <code>FAILED</code>, the <code>ErrorMessage</code> field contains a
     * description of the error that caused the data source connector to fail.
     * </p>
     * 
     * @param error
     *        When the <code>Status</code> field value is <code>FAILED</code>, the <code>ErrorMessage</code> field
     *        contains a description of the error that caused the data source connector to fail.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWebExperienceResult withError(ErrorDetail error) {
        setError(error);
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
        if (getApplicationId() != null)
            sb.append("ApplicationId: ").append(getApplicationId()).append(",");
        if (getWebExperienceId() != null)
            sb.append("WebExperienceId: ").append(getWebExperienceId()).append(",");
        if (getWebExperienceArn() != null)
            sb.append("WebExperienceArn: ").append(getWebExperienceArn()).append(",");
        if (getDefaultEndpoint() != null)
            sb.append("DefaultEndpoint: ").append(getDefaultEndpoint()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt()).append(",");
        if (getTitle() != null)
            sb.append("Title: ").append(getTitle()).append(",");
        if (getSubtitle() != null)
            sb.append("Subtitle: ").append(getSubtitle()).append(",");
        if (getWelcomeMessage() != null)
            sb.append("WelcomeMessage: ").append(getWelcomeMessage()).append(",");
        if (getSamplePromptsControlMode() != null)
            sb.append("SamplePromptsControlMode: ").append(getSamplePromptsControlMode()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getAuthenticationConfiguration() != null)
            sb.append("AuthenticationConfiguration: ").append(getAuthenticationConfiguration()).append(",");
        if (getError() != null)
            sb.append("Error: ").append(getError());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetWebExperienceResult == false)
            return false;
        GetWebExperienceResult other = (GetWebExperienceResult) obj;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getWebExperienceId() == null ^ this.getWebExperienceId() == null)
            return false;
        if (other.getWebExperienceId() != null && other.getWebExperienceId().equals(this.getWebExperienceId()) == false)
            return false;
        if (other.getWebExperienceArn() == null ^ this.getWebExperienceArn() == null)
            return false;
        if (other.getWebExperienceArn() != null && other.getWebExperienceArn().equals(this.getWebExperienceArn()) == false)
            return false;
        if (other.getDefaultEndpoint() == null ^ this.getDefaultEndpoint() == null)
            return false;
        if (other.getDefaultEndpoint() != null && other.getDefaultEndpoint().equals(this.getDefaultEndpoint()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        if (other.getTitle() == null ^ this.getTitle() == null)
            return false;
        if (other.getTitle() != null && other.getTitle().equals(this.getTitle()) == false)
            return false;
        if (other.getSubtitle() == null ^ this.getSubtitle() == null)
            return false;
        if (other.getSubtitle() != null && other.getSubtitle().equals(this.getSubtitle()) == false)
            return false;
        if (other.getWelcomeMessage() == null ^ this.getWelcomeMessage() == null)
            return false;
        if (other.getWelcomeMessage() != null && other.getWelcomeMessage().equals(this.getWelcomeMessage()) == false)
            return false;
        if (other.getSamplePromptsControlMode() == null ^ this.getSamplePromptsControlMode() == null)
            return false;
        if (other.getSamplePromptsControlMode() != null && other.getSamplePromptsControlMode().equals(this.getSamplePromptsControlMode()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getAuthenticationConfiguration() == null ^ this.getAuthenticationConfiguration() == null)
            return false;
        if (other.getAuthenticationConfiguration() != null && other.getAuthenticationConfiguration().equals(this.getAuthenticationConfiguration()) == false)
            return false;
        if (other.getError() == null ^ this.getError() == null)
            return false;
        if (other.getError() != null && other.getError().equals(this.getError()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getWebExperienceId() == null) ? 0 : getWebExperienceId().hashCode());
        hashCode = prime * hashCode + ((getWebExperienceArn() == null) ? 0 : getWebExperienceArn().hashCode());
        hashCode = prime * hashCode + ((getDefaultEndpoint() == null) ? 0 : getDefaultEndpoint().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getTitle() == null) ? 0 : getTitle().hashCode());
        hashCode = prime * hashCode + ((getSubtitle() == null) ? 0 : getSubtitle().hashCode());
        hashCode = prime * hashCode + ((getWelcomeMessage() == null) ? 0 : getWelcomeMessage().hashCode());
        hashCode = prime * hashCode + ((getSamplePromptsControlMode() == null) ? 0 : getSamplePromptsControlMode().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getAuthenticationConfiguration() == null) ? 0 : getAuthenticationConfiguration().hashCode());
        hashCode = prime * hashCode + ((getError() == null) ? 0 : getError().hashCode());
        return hashCode;
    }

    @Override
    public GetWebExperienceResult clone() {
        try {
            return (GetWebExperienceResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
