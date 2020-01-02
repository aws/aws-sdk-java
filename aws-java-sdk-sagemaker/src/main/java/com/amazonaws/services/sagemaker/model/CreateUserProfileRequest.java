/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateUserProfile" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateUserProfileRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the associated Domain.
     * </p>
     */
    private String domainId;
    /**
     * <p>
     * A name for the UserProfile.
     * </p>
     */
    private String userProfileName;
    /**
     * <p>
     * A specifier for the type of value specified in SingleSignOnUserValue. Currently, the only supported value is
     * "UserName". If the Domain's AuthMode is SSO, this field is required. If the Domain's AuthMode is not SSO, this
     * field cannot be specified.
     * </p>
     */
    private String singleSignOnUserIdentifier;
    /**
     * <p>
     * The username of the associated AWS Single Sign-On User for this UserProfile. If the Domain's AuthMode is SSO,
     * this field is required, and must match a valid username of a user in your directory. If the Domain's AuthMode is
     * not SSO, this field cannot be specified.
     * </p>
     */
    private String singleSignOnUserValue;
    /**
     * <p>
     * Each tag consists of a key and an optional value. Tag keys must be unique per resource.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * A collection of settings.
     * </p>
     */
    private UserSettings userSettings;

    /**
     * <p>
     * The ID of the associated Domain.
     * </p>
     * 
     * @param domainId
     *        The ID of the associated Domain.
     */

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    /**
     * <p>
     * The ID of the associated Domain.
     * </p>
     * 
     * @return The ID of the associated Domain.
     */

    public String getDomainId() {
        return this.domainId;
    }

    /**
     * <p>
     * The ID of the associated Domain.
     * </p>
     * 
     * @param domainId
     *        The ID of the associated Domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserProfileRequest withDomainId(String domainId) {
        setDomainId(domainId);
        return this;
    }

    /**
     * <p>
     * A name for the UserProfile.
     * </p>
     * 
     * @param userProfileName
     *        A name for the UserProfile.
     */

    public void setUserProfileName(String userProfileName) {
        this.userProfileName = userProfileName;
    }

    /**
     * <p>
     * A name for the UserProfile.
     * </p>
     * 
     * @return A name for the UserProfile.
     */

    public String getUserProfileName() {
        return this.userProfileName;
    }

    /**
     * <p>
     * A name for the UserProfile.
     * </p>
     * 
     * @param userProfileName
     *        A name for the UserProfile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserProfileRequest withUserProfileName(String userProfileName) {
        setUserProfileName(userProfileName);
        return this;
    }

    /**
     * <p>
     * A specifier for the type of value specified in SingleSignOnUserValue. Currently, the only supported value is
     * "UserName". If the Domain's AuthMode is SSO, this field is required. If the Domain's AuthMode is not SSO, this
     * field cannot be specified.
     * </p>
     * 
     * @param singleSignOnUserIdentifier
     *        A specifier for the type of value specified in SingleSignOnUserValue. Currently, the only supported value
     *        is "UserName". If the Domain's AuthMode is SSO, this field is required. If the Domain's AuthMode is not
     *        SSO, this field cannot be specified.
     */

    public void setSingleSignOnUserIdentifier(String singleSignOnUserIdentifier) {
        this.singleSignOnUserIdentifier = singleSignOnUserIdentifier;
    }

    /**
     * <p>
     * A specifier for the type of value specified in SingleSignOnUserValue. Currently, the only supported value is
     * "UserName". If the Domain's AuthMode is SSO, this field is required. If the Domain's AuthMode is not SSO, this
     * field cannot be specified.
     * </p>
     * 
     * @return A specifier for the type of value specified in SingleSignOnUserValue. Currently, the only supported value
     *         is "UserName". If the Domain's AuthMode is SSO, this field is required. If the Domain's AuthMode is not
     *         SSO, this field cannot be specified.
     */

    public String getSingleSignOnUserIdentifier() {
        return this.singleSignOnUserIdentifier;
    }

    /**
     * <p>
     * A specifier for the type of value specified in SingleSignOnUserValue. Currently, the only supported value is
     * "UserName". If the Domain's AuthMode is SSO, this field is required. If the Domain's AuthMode is not SSO, this
     * field cannot be specified.
     * </p>
     * 
     * @param singleSignOnUserIdentifier
     *        A specifier for the type of value specified in SingleSignOnUserValue. Currently, the only supported value
     *        is "UserName". If the Domain's AuthMode is SSO, this field is required. If the Domain's AuthMode is not
     *        SSO, this field cannot be specified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserProfileRequest withSingleSignOnUserIdentifier(String singleSignOnUserIdentifier) {
        setSingleSignOnUserIdentifier(singleSignOnUserIdentifier);
        return this;
    }

    /**
     * <p>
     * The username of the associated AWS Single Sign-On User for this UserProfile. If the Domain's AuthMode is SSO,
     * this field is required, and must match a valid username of a user in your directory. If the Domain's AuthMode is
     * not SSO, this field cannot be specified.
     * </p>
     * 
     * @param singleSignOnUserValue
     *        The username of the associated AWS Single Sign-On User for this UserProfile. If the Domain's AuthMode is
     *        SSO, this field is required, and must match a valid username of a user in your directory. If the Domain's
     *        AuthMode is not SSO, this field cannot be specified.
     */

    public void setSingleSignOnUserValue(String singleSignOnUserValue) {
        this.singleSignOnUserValue = singleSignOnUserValue;
    }

    /**
     * <p>
     * The username of the associated AWS Single Sign-On User for this UserProfile. If the Domain's AuthMode is SSO,
     * this field is required, and must match a valid username of a user in your directory. If the Domain's AuthMode is
     * not SSO, this field cannot be specified.
     * </p>
     * 
     * @return The username of the associated AWS Single Sign-On User for this UserProfile. If the Domain's AuthMode is
     *         SSO, this field is required, and must match a valid username of a user in your directory. If the Domain's
     *         AuthMode is not SSO, this field cannot be specified.
     */

    public String getSingleSignOnUserValue() {
        return this.singleSignOnUserValue;
    }

    /**
     * <p>
     * The username of the associated AWS Single Sign-On User for this UserProfile. If the Domain's AuthMode is SSO,
     * this field is required, and must match a valid username of a user in your directory. If the Domain's AuthMode is
     * not SSO, this field cannot be specified.
     * </p>
     * 
     * @param singleSignOnUserValue
     *        The username of the associated AWS Single Sign-On User for this UserProfile. If the Domain's AuthMode is
     *        SSO, this field is required, and must match a valid username of a user in your directory. If the Domain's
     *        AuthMode is not SSO, this field cannot be specified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserProfileRequest withSingleSignOnUserValue(String singleSignOnUserValue) {
        setSingleSignOnUserValue(singleSignOnUserValue);
        return this;
    }

    /**
     * <p>
     * Each tag consists of a key and an optional value. Tag keys must be unique per resource.
     * </p>
     * 
     * @return Each tag consists of a key and an optional value. Tag keys must be unique per resource.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Each tag consists of a key and an optional value. Tag keys must be unique per resource.
     * </p>
     * 
     * @param tags
     *        Each tag consists of a key and an optional value. Tag keys must be unique per resource.
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
     * Each tag consists of a key and an optional value. Tag keys must be unique per resource.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Each tag consists of a key and an optional value. Tag keys must be unique per resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserProfileRequest withTags(Tag... tags) {
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
     * Each tag consists of a key and an optional value. Tag keys must be unique per resource.
     * </p>
     * 
     * @param tags
     *        Each tag consists of a key and an optional value. Tag keys must be unique per resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserProfileRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * A collection of settings.
     * </p>
     * 
     * @param userSettings
     *        A collection of settings.
     */

    public void setUserSettings(UserSettings userSettings) {
        this.userSettings = userSettings;
    }

    /**
     * <p>
     * A collection of settings.
     * </p>
     * 
     * @return A collection of settings.
     */

    public UserSettings getUserSettings() {
        return this.userSettings;
    }

    /**
     * <p>
     * A collection of settings.
     * </p>
     * 
     * @param userSettings
     *        A collection of settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserProfileRequest withUserSettings(UserSettings userSettings) {
        setUserSettings(userSettings);
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
        if (getDomainId() != null)
            sb.append("DomainId: ").append(getDomainId()).append(",");
        if (getUserProfileName() != null)
            sb.append("UserProfileName: ").append(getUserProfileName()).append(",");
        if (getSingleSignOnUserIdentifier() != null)
            sb.append("SingleSignOnUserIdentifier: ").append(getSingleSignOnUserIdentifier()).append(",");
        if (getSingleSignOnUserValue() != null)
            sb.append("SingleSignOnUserValue: ").append(getSingleSignOnUserValue()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getUserSettings() != null)
            sb.append("UserSettings: ").append(getUserSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateUserProfileRequest == false)
            return false;
        CreateUserProfileRequest other = (CreateUserProfileRequest) obj;
        if (other.getDomainId() == null ^ this.getDomainId() == null)
            return false;
        if (other.getDomainId() != null && other.getDomainId().equals(this.getDomainId()) == false)
            return false;
        if (other.getUserProfileName() == null ^ this.getUserProfileName() == null)
            return false;
        if (other.getUserProfileName() != null && other.getUserProfileName().equals(this.getUserProfileName()) == false)
            return false;
        if (other.getSingleSignOnUserIdentifier() == null ^ this.getSingleSignOnUserIdentifier() == null)
            return false;
        if (other.getSingleSignOnUserIdentifier() != null && other.getSingleSignOnUserIdentifier().equals(this.getSingleSignOnUserIdentifier()) == false)
            return false;
        if (other.getSingleSignOnUserValue() == null ^ this.getSingleSignOnUserValue() == null)
            return false;
        if (other.getSingleSignOnUserValue() != null && other.getSingleSignOnUserValue().equals(this.getSingleSignOnUserValue()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getUserSettings() == null ^ this.getUserSettings() == null)
            return false;
        if (other.getUserSettings() != null && other.getUserSettings().equals(this.getUserSettings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainId() == null) ? 0 : getDomainId().hashCode());
        hashCode = prime * hashCode + ((getUserProfileName() == null) ? 0 : getUserProfileName().hashCode());
        hashCode = prime * hashCode + ((getSingleSignOnUserIdentifier() == null) ? 0 : getSingleSignOnUserIdentifier().hashCode());
        hashCode = prime * hashCode + ((getSingleSignOnUserValue() == null) ? 0 : getSingleSignOnUserValue().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getUserSettings() == null) ? 0 : getUserSettings().hashCode());
        return hashCode;
    }

    @Override
    public CreateUserProfileRequest clone() {
        return (CreateUserProfileRequest) super.clone();
    }

}
