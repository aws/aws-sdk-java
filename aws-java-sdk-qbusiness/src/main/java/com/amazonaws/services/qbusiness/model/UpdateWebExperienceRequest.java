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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/UpdateWebExperience" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateWebExperienceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the Amazon Q Business application attached to the web experience.
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
     * The Amazon Resource Name (ARN) of the role with permission to access the Amazon Q Business web experience and
     * required resources.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The authentication configuration of the Amazon Q Business web experience.
     * </p>
     */
    @Deprecated
    private WebExperienceAuthConfiguration authenticationConfiguration;
    /**
     * <p>
     * The title of the Amazon Q Business web experience.
     * </p>
     */
    private String title;
    /**
     * <p>
     * The subtitle of the Amazon Q Business web experience.
     * </p>
     */
    private String subtitle;
    /**
     * <p>
     * A customized welcome message for an end user in an Amazon Q Business web experience.
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
     * The identifier of the Amazon Q Business application attached to the web experience.
     * </p>
     * 
     * @param applicationId
     *        The identifier of the Amazon Q Business application attached to the web experience.
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The identifier of the Amazon Q Business application attached to the web experience.
     * </p>
     * 
     * @return The identifier of the Amazon Q Business application attached to the web experience.
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * <p>
     * The identifier of the Amazon Q Business application attached to the web experience.
     * </p>
     * 
     * @param applicationId
     *        The identifier of the Amazon Q Business application attached to the web experience.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWebExperienceRequest withApplicationId(String applicationId) {
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

    public UpdateWebExperienceRequest withWebExperienceId(String webExperienceId) {
        setWebExperienceId(webExperienceId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role with permission to access the Amazon Q Business web experience and
     * required resources.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the role with permission to access the Amazon Q Business web experience
     *        and required resources.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role with permission to access the Amazon Q Business web experience and
     * required resources.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the role with permission to access the Amazon Q Business web experience
     *         and required resources.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role with permission to access the Amazon Q Business web experience and
     * required resources.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the role with permission to access the Amazon Q Business web experience
     *        and required resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWebExperienceRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The authentication configuration of the Amazon Q Business web experience.
     * </p>
     * 
     * @param authenticationConfiguration
     *        The authentication configuration of the Amazon Q Business web experience.
     */
    @Deprecated
    public void setAuthenticationConfiguration(WebExperienceAuthConfiguration authenticationConfiguration) {
        this.authenticationConfiguration = authenticationConfiguration;
    }

    /**
     * <p>
     * The authentication configuration of the Amazon Q Business web experience.
     * </p>
     * 
     * @return The authentication configuration of the Amazon Q Business web experience.
     */
    @Deprecated
    public WebExperienceAuthConfiguration getAuthenticationConfiguration() {
        return this.authenticationConfiguration;
    }

    /**
     * <p>
     * The authentication configuration of the Amazon Q Business web experience.
     * </p>
     * 
     * @param authenticationConfiguration
     *        The authentication configuration of the Amazon Q Business web experience.
     * @return Returns a reference to this object so that method calls can be chained together.
     */
    @Deprecated
    public UpdateWebExperienceRequest withAuthenticationConfiguration(WebExperienceAuthConfiguration authenticationConfiguration) {
        setAuthenticationConfiguration(authenticationConfiguration);
        return this;
    }

    /**
     * <p>
     * The title of the Amazon Q Business web experience.
     * </p>
     * 
     * @param title
     *        The title of the Amazon Q Business web experience.
     */

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * <p>
     * The title of the Amazon Q Business web experience.
     * </p>
     * 
     * @return The title of the Amazon Q Business web experience.
     */

    public String getTitle() {
        return this.title;
    }

    /**
     * <p>
     * The title of the Amazon Q Business web experience.
     * </p>
     * 
     * @param title
     *        The title of the Amazon Q Business web experience.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWebExperienceRequest withTitle(String title) {
        setTitle(title);
        return this;
    }

    /**
     * <p>
     * The subtitle of the Amazon Q Business web experience.
     * </p>
     * 
     * @param subtitle
     *        The subtitle of the Amazon Q Business web experience.
     */

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    /**
     * <p>
     * The subtitle of the Amazon Q Business web experience.
     * </p>
     * 
     * @return The subtitle of the Amazon Q Business web experience.
     */

    public String getSubtitle() {
        return this.subtitle;
    }

    /**
     * <p>
     * The subtitle of the Amazon Q Business web experience.
     * </p>
     * 
     * @param subtitle
     *        The subtitle of the Amazon Q Business web experience.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWebExperienceRequest withSubtitle(String subtitle) {
        setSubtitle(subtitle);
        return this;
    }

    /**
     * <p>
     * A customized welcome message for an end user in an Amazon Q Business web experience.
     * </p>
     * 
     * @param welcomeMessage
     *        A customized welcome message for an end user in an Amazon Q Business web experience.
     */

    public void setWelcomeMessage(String welcomeMessage) {
        this.welcomeMessage = welcomeMessage;
    }

    /**
     * <p>
     * A customized welcome message for an end user in an Amazon Q Business web experience.
     * </p>
     * 
     * @return A customized welcome message for an end user in an Amazon Q Business web experience.
     */

    public String getWelcomeMessage() {
        return this.welcomeMessage;
    }

    /**
     * <p>
     * A customized welcome message for an end user in an Amazon Q Business web experience.
     * </p>
     * 
     * @param welcomeMessage
     *        A customized welcome message for an end user in an Amazon Q Business web experience.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWebExperienceRequest withWelcomeMessage(String welcomeMessage) {
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

    public UpdateWebExperienceRequest withSamplePromptsControlMode(String samplePromptsControlMode) {
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

    public UpdateWebExperienceRequest withSamplePromptsControlMode(WebExperienceSamplePromptsControlMode samplePromptsControlMode) {
        this.samplePromptsControlMode = samplePromptsControlMode.toString();
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
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getAuthenticationConfiguration() != null)
            sb.append("AuthenticationConfiguration: ").append(getAuthenticationConfiguration()).append(",");
        if (getTitle() != null)
            sb.append("Title: ").append(getTitle()).append(",");
        if (getSubtitle() != null)
            sb.append("Subtitle: ").append(getSubtitle()).append(",");
        if (getWelcomeMessage() != null)
            sb.append("WelcomeMessage: ").append(getWelcomeMessage()).append(",");
        if (getSamplePromptsControlMode() != null)
            sb.append("SamplePromptsControlMode: ").append(getSamplePromptsControlMode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateWebExperienceRequest == false)
            return false;
        UpdateWebExperienceRequest other = (UpdateWebExperienceRequest) obj;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getWebExperienceId() == null ^ this.getWebExperienceId() == null)
            return false;
        if (other.getWebExperienceId() != null && other.getWebExperienceId().equals(this.getWebExperienceId()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getAuthenticationConfiguration() == null ^ this.getAuthenticationConfiguration() == null)
            return false;
        if (other.getAuthenticationConfiguration() != null && other.getAuthenticationConfiguration().equals(this.getAuthenticationConfiguration()) == false)
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getWebExperienceId() == null) ? 0 : getWebExperienceId().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getAuthenticationConfiguration() == null) ? 0 : getAuthenticationConfiguration().hashCode());
        hashCode = prime * hashCode + ((getTitle() == null) ? 0 : getTitle().hashCode());
        hashCode = prime * hashCode + ((getSubtitle() == null) ? 0 : getSubtitle().hashCode());
        hashCode = prime * hashCode + ((getWelcomeMessage() == null) ? 0 : getWelcomeMessage().hashCode());
        hashCode = prime * hashCode + ((getSamplePromptsControlMode() == null) ? 0 : getSamplePromptsControlMode().hashCode());
        return hashCode;
    }

    @Override
    public UpdateWebExperienceRequest clone() {
        return (UpdateWebExperienceRequest) super.clone();
    }

}
