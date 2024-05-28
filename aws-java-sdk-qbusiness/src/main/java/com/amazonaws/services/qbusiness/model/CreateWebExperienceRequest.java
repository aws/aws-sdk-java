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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/CreateWebExperience" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateWebExperienceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the Amazon Q Business web experience.
     * </p>
     */
    private String applicationId;
    /**
     * <p>
     * The title for your Amazon Q Business web experience.
     * </p>
     */
    private String title;
    /**
     * <p>
     * A subtitle to personalize your Amazon Q Business web experience.
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
     * A list of key-value pairs that identify or categorize your Amazon Q Business web experience. You can also use
     * tags to help control access to the web experience. Tag keys and values can consist of Unicode letters, digits,
     * white space, and any of the following symbols: _ . : / = + - @.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * A token you provide to identify a request to create an Amazon Q Business web experience.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * The identifier of the Amazon Q Business web experience.
     * </p>
     * 
     * @param applicationId
     *        The identifier of the Amazon Q Business web experience.
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The identifier of the Amazon Q Business web experience.
     * </p>
     * 
     * @return The identifier of the Amazon Q Business web experience.
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * <p>
     * The identifier of the Amazon Q Business web experience.
     * </p>
     * 
     * @param applicationId
     *        The identifier of the Amazon Q Business web experience.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWebExperienceRequest withApplicationId(String applicationId) {
        setApplicationId(applicationId);
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

    public CreateWebExperienceRequest withTitle(String title) {
        setTitle(title);
        return this;
    }

    /**
     * <p>
     * A subtitle to personalize your Amazon Q Business web experience.
     * </p>
     * 
     * @param subtitle
     *        A subtitle to personalize your Amazon Q Business web experience.
     */

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    /**
     * <p>
     * A subtitle to personalize your Amazon Q Business web experience.
     * </p>
     * 
     * @return A subtitle to personalize your Amazon Q Business web experience.
     */

    public String getSubtitle() {
        return this.subtitle;
    }

    /**
     * <p>
     * A subtitle to personalize your Amazon Q Business web experience.
     * </p>
     * 
     * @param subtitle
     *        A subtitle to personalize your Amazon Q Business web experience.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWebExperienceRequest withSubtitle(String subtitle) {
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

    public CreateWebExperienceRequest withWelcomeMessage(String welcomeMessage) {
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

    public CreateWebExperienceRequest withSamplePromptsControlMode(String samplePromptsControlMode) {
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

    public CreateWebExperienceRequest withSamplePromptsControlMode(WebExperienceSamplePromptsControlMode samplePromptsControlMode) {
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

    public CreateWebExperienceRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * A list of key-value pairs that identify or categorize your Amazon Q Business web experience. You can also use
     * tags to help control access to the web experience. Tag keys and values can consist of Unicode letters, digits,
     * white space, and any of the following symbols: _ . : / = + - @.
     * </p>
     * 
     * @return A list of key-value pairs that identify or categorize your Amazon Q Business web experience. You can also
     *         use tags to help control access to the web experience. Tag keys and values can consist of Unicode
     *         letters, digits, white space, and any of the following symbols: _ . : / = + - @.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of key-value pairs that identify or categorize your Amazon Q Business web experience. You can also use
     * tags to help control access to the web experience. Tag keys and values can consist of Unicode letters, digits,
     * white space, and any of the following symbols: _ . : / = + - @.
     * </p>
     * 
     * @param tags
     *        A list of key-value pairs that identify or categorize your Amazon Q Business web experience. You can also
     *        use tags to help control access to the web experience. Tag keys and values can consist of Unicode letters,
     *        digits, white space, and any of the following symbols: _ . : / = + - @.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * A list of key-value pairs that identify or categorize your Amazon Q Business web experience. You can also use
     * tags to help control access to the web experience. Tag keys and values can consist of Unicode letters, digits,
     * white space, and any of the following symbols: _ . : / = + - @.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of key-value pairs that identify or categorize your Amazon Q Business web experience. You can also
     *        use tags to help control access to the web experience. Tag keys and values can consist of Unicode letters,
     *        digits, white space, and any of the following symbols: _ . : / = + - @.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWebExperienceRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of key-value pairs that identify or categorize your Amazon Q Business web experience. You can also use
     * tags to help control access to the web experience. Tag keys and values can consist of Unicode letters, digits,
     * white space, and any of the following symbols: _ . : / = + - @.
     * </p>
     * 
     * @param tags
     *        A list of key-value pairs that identify or categorize your Amazon Q Business web experience. You can also
     *        use tags to help control access to the web experience. Tag keys and values can consist of Unicode letters,
     *        digits, white space, and any of the following symbols: _ . : / = + - @.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWebExperienceRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * A token you provide to identify a request to create an Amazon Q Business web experience.
     * </p>
     * 
     * @param clientToken
     *        A token you provide to identify a request to create an Amazon Q Business web experience.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A token you provide to identify a request to create an Amazon Q Business web experience.
     * </p>
     * 
     * @return A token you provide to identify a request to create an Amazon Q Business web experience.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A token you provide to identify a request to create an Amazon Q Business web experience.
     * </p>
     * 
     * @param clientToken
     *        A token you provide to identify a request to create an Amazon Q Business web experience.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWebExperienceRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
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
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateWebExperienceRequest == false)
            return false;
        CreateWebExperienceRequest other = (CreateWebExperienceRequest) obj;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
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
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getTitle() == null) ? 0 : getTitle().hashCode());
        hashCode = prime * hashCode + ((getSubtitle() == null) ? 0 : getSubtitle().hashCode());
        hashCode = prime * hashCode + ((getWelcomeMessage() == null) ? 0 : getWelcomeMessage().hashCode());
        hashCode = prime * hashCode + ((getSamplePromptsControlMode() == null) ? 0 : getSamplePromptsControlMode().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public CreateWebExperienceRequest clone() {
        return (CreateWebExperienceRequest) super.clone();
    }

}
