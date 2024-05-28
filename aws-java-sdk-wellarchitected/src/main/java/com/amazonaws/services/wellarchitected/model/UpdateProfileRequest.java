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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/UpdateProfile" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateProfileRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The profile ARN.
     * </p>
     */
    private String profileArn;
    /**
     * <p>
     * The profile description.
     * </p>
     */
    private String profileDescription;
    /**
     * <p>
     * Profile questions.
     * </p>
     */
    private java.util.List<ProfileQuestionUpdate> profileQuestions;

    /**
     * <p>
     * The profile ARN.
     * </p>
     * 
     * @param profileArn
     *        The profile ARN.
     */

    public void setProfileArn(String profileArn) {
        this.profileArn = profileArn;
    }

    /**
     * <p>
     * The profile ARN.
     * </p>
     * 
     * @return The profile ARN.
     */

    public String getProfileArn() {
        return this.profileArn;
    }

    /**
     * <p>
     * The profile ARN.
     * </p>
     * 
     * @param profileArn
     *        The profile ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProfileRequest withProfileArn(String profileArn) {
        setProfileArn(profileArn);
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

    public UpdateProfileRequest withProfileDescription(String profileDescription) {
        setProfileDescription(profileDescription);
        return this;
    }

    /**
     * <p>
     * Profile questions.
     * </p>
     * 
     * @return Profile questions.
     */

    public java.util.List<ProfileQuestionUpdate> getProfileQuestions() {
        return profileQuestions;
    }

    /**
     * <p>
     * Profile questions.
     * </p>
     * 
     * @param profileQuestions
     *        Profile questions.
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
     * Profile questions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProfileQuestions(java.util.Collection)} or {@link #withProfileQuestions(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param profileQuestions
     *        Profile questions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProfileRequest withProfileQuestions(ProfileQuestionUpdate... profileQuestions) {
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
     * Profile questions.
     * </p>
     * 
     * @param profileQuestions
     *        Profile questions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProfileRequest withProfileQuestions(java.util.Collection<ProfileQuestionUpdate> profileQuestions) {
        setProfileQuestions(profileQuestions);
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
        if (getProfileArn() != null)
            sb.append("ProfileArn: ").append(getProfileArn()).append(",");
        if (getProfileDescription() != null)
            sb.append("ProfileDescription: ").append(getProfileDescription()).append(",");
        if (getProfileQuestions() != null)
            sb.append("ProfileQuestions: ").append(getProfileQuestions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateProfileRequest == false)
            return false;
        UpdateProfileRequest other = (UpdateProfileRequest) obj;
        if (other.getProfileArn() == null ^ this.getProfileArn() == null)
            return false;
        if (other.getProfileArn() != null && other.getProfileArn().equals(this.getProfileArn()) == false)
            return false;
        if (other.getProfileDescription() == null ^ this.getProfileDescription() == null)
            return false;
        if (other.getProfileDescription() != null && other.getProfileDescription().equals(this.getProfileDescription()) == false)
            return false;
        if (other.getProfileQuestions() == null ^ this.getProfileQuestions() == null)
            return false;
        if (other.getProfileQuestions() != null && other.getProfileQuestions().equals(this.getProfileQuestions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProfileArn() == null) ? 0 : getProfileArn().hashCode());
        hashCode = prime * hashCode + ((getProfileDescription() == null) ? 0 : getProfileDescription().hashCode());
        hashCode = prime * hashCode + ((getProfileQuestions() == null) ? 0 : getProfileQuestions().hashCode());
        return hashCode;
    }

    @Override
    public UpdateProfileRequest clone() {
        return (UpdateProfileRequest) super.clone();
    }

}
