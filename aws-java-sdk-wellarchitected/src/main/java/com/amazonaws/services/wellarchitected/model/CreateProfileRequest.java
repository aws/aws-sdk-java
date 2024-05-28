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
package com.amazonaws.services.wellarchitected.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/CreateProfile" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateProfileRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Name of the profile.
     * </p>
     */
    private String profileName;
    /**
     * <p>
     * The profile description.
     * </p>
     */
    private String profileDescription;
    /**
     * <p>
     * The profile questions.
     * </p>
     */
    private java.util.List<ProfileQuestionUpdate> profileQuestions;

    private String clientRequestToken;
    /**
     * <p>
     * The tags assigned to the profile.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * Name of the profile.
     * </p>
     * 
     * @param profileName
     *        Name of the profile.
     */

    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }

    /**
     * <p>
     * Name of the profile.
     * </p>
     * 
     * @return Name of the profile.
     */

    public String getProfileName() {
        return this.profileName;
    }

    /**
     * <p>
     * Name of the profile.
     * </p>
     * 
     * @param profileName
     *        Name of the profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProfileRequest withProfileName(String profileName) {
        setProfileName(profileName);
        return this;
    }

    /**
     * <p>
     * The profile description.
     * </p>
     * 
     * @param profileDescription
     *        The profile description.
     */

    public void setProfileDescription(String profileDescription) {
        this.profileDescription = profileDescription;
    }

    /**
     * <p>
     * The profile description.
     * </p>
     * 
     * @return The profile description.
     */

    public String getProfileDescription() {
        return this.profileDescription;
    }

    /**
     * <p>
     * The profile description.
     * </p>
     * 
     * @param profileDescription
     *        The profile description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProfileRequest withProfileDescription(String profileDescription) {
        setProfileDescription(profileDescription);
        return this;
    }

    /**
     * <p>
     * The profile questions.
     * </p>
     * 
     * @return The profile questions.
     */

    public java.util.List<ProfileQuestionUpdate> getProfileQuestions() {
        return profileQuestions;
    }

    /**
     * <p>
     * The profile questions.
     * </p>
     * 
     * @param profileQuestions
     *        The profile questions.
     */

    public void setProfileQuestions(java.util.Collection<ProfileQuestionUpdate> profileQuestions) {
        if (profileQuestions == null) {
            this.profileQuestions = null;
            return;
        }

        this.profileQuestions = new java.util.ArrayList<ProfileQuestionUpdate>(profileQuestions);
    }

    /**
     * <p>
     * The profile questions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProfileQuestions(java.util.Collection)} or {@link #withProfileQuestions(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param profileQuestions
     *        The profile questions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProfileRequest withProfileQuestions(ProfileQuestionUpdate... profileQuestions) {
        if (this.profileQuestions == null) {
            setProfileQuestions(new java.util.ArrayList<ProfileQuestionUpdate>(profileQuestions.length));
        }
        for (ProfileQuestionUpdate ele : profileQuestions) {
            this.profileQuestions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The profile questions.
     * </p>
     * 
     * @param profileQuestions
     *        The profile questions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProfileRequest withProfileQuestions(java.util.Collection<ProfileQuestionUpdate> profileQuestions) {
        setProfileQuestions(profileQuestions);
        return this;
    }

    /**
     * @param clientRequestToken
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * @return
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * @param clientRequestToken
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProfileRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
        return this;
    }

    /**
     * <p>
     * The tags assigned to the profile.
     * </p>
     * 
     * @return The tags assigned to the profile.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags assigned to the profile.
     * </p>
     * 
     * @param tags
     *        The tags assigned to the profile.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags assigned to the profile.
     * </p>
     * 
     * @param tags
     *        The tags assigned to the profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProfileRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateProfileRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateProfileRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProfileRequest clearTagsEntries() {
        this.tags = null;
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
        if (getProfileName() != null)
            sb.append("ProfileName: ").append(getProfileName()).append(",");
        if (getProfileDescription() != null)
            sb.append("ProfileDescription: ").append(getProfileDescription()).append(",");
        if (getProfileQuestions() != null)
            sb.append("ProfileQuestions: ").append(getProfileQuestions()).append(",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateProfileRequest == false)
            return false;
        CreateProfileRequest other = (CreateProfileRequest) obj;
        if (other.getProfileName() == null ^ this.getProfileName() == null)
            return false;
        if (other.getProfileName() != null && other.getProfileName().equals(this.getProfileName()) == false)
            return false;
        if (other.getProfileDescription() == null ^ this.getProfileDescription() == null)
            return false;
        if (other.getProfileDescription() != null && other.getProfileDescription().equals(this.getProfileDescription()) == false)
            return false;
        if (other.getProfileQuestions() == null ^ this.getProfileQuestions() == null)
            return false;
        if (other.getProfileQuestions() != null && other.getProfileQuestions().equals(this.getProfileQuestions()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProfileName() == null) ? 0 : getProfileName().hashCode());
        hashCode = prime * hashCode + ((getProfileDescription() == null) ? 0 : getProfileDescription().hashCode());
        hashCode = prime * hashCode + ((getProfileQuestions() == null) ? 0 : getProfileQuestions().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateProfileRequest clone() {
        return (CreateProfileRequest) super.clone();
    }

}
