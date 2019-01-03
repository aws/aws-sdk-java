/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cognitoidp.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Represents the response from the server from the request to get information about the user.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/GetUser" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetUserResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The user name of the user you wish to retrieve from the get user request.
     * </p>
     */
    private String username;
    /**
     * <p>
     * An array of name-value pairs representing user attributes.
     * </p>
     * <p>
     * For custom attributes, you must prepend the <code>custom:</code> prefix to the attribute name.
     * </p>
     */
    private java.util.List<AttributeType> userAttributes;
    /**
     * <p>
     * Specifies the options for MFA (e.g., email or phone number).
     * </p>
     */
    private java.util.List<MFAOptionType> mFAOptions;
    /**
     * <p>
     * The user's preferred MFA setting.
     * </p>
     */
    private String preferredMfaSetting;
    /**
     * <p>
     * The list of the user's MFA settings.
     * </p>
     */
    private java.util.List<String> userMFASettingList;

    /**
     * <p>
     * The user name of the user you wish to retrieve from the get user request.
     * </p>
     * 
     * @param username
     *        The user name of the user you wish to retrieve from the get user request.
     */

    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * <p>
     * The user name of the user you wish to retrieve from the get user request.
     * </p>
     * 
     * @return The user name of the user you wish to retrieve from the get user request.
     */

    public String getUsername() {
        return this.username;
    }

    /**
     * <p>
     * The user name of the user you wish to retrieve from the get user request.
     * </p>
     * 
     * @param username
     *        The user name of the user you wish to retrieve from the get user request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetUserResult withUsername(String username) {
        setUsername(username);
        return this;
    }

    /**
     * <p>
     * An array of name-value pairs representing user attributes.
     * </p>
     * <p>
     * For custom attributes, you must prepend the <code>custom:</code> prefix to the attribute name.
     * </p>
     * 
     * @return An array of name-value pairs representing user attributes.</p>
     *         <p>
     *         For custom attributes, you must prepend the <code>custom:</code> prefix to the attribute name.
     */

    public java.util.List<AttributeType> getUserAttributes() {
        return userAttributes;
    }

    /**
     * <p>
     * An array of name-value pairs representing user attributes.
     * </p>
     * <p>
     * For custom attributes, you must prepend the <code>custom:</code> prefix to the attribute name.
     * </p>
     * 
     * @param userAttributes
     *        An array of name-value pairs representing user attributes.</p>
     *        <p>
     *        For custom attributes, you must prepend the <code>custom:</code> prefix to the attribute name.
     */

    public void setUserAttributes(java.util.Collection<AttributeType> userAttributes) {
        if (userAttributes == null) {
            this.userAttributes = null;
            return;
        }

        this.userAttributes = new java.util.ArrayList<AttributeType>(userAttributes);
    }

    /**
     * <p>
     * An array of name-value pairs representing user attributes.
     * </p>
     * <p>
     * For custom attributes, you must prepend the <code>custom:</code> prefix to the attribute name.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUserAttributes(java.util.Collection)} or {@link #withUserAttributes(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param userAttributes
     *        An array of name-value pairs representing user attributes.</p>
     *        <p>
     *        For custom attributes, you must prepend the <code>custom:</code> prefix to the attribute name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetUserResult withUserAttributes(AttributeType... userAttributes) {
        if (this.userAttributes == null) {
            setUserAttributes(new java.util.ArrayList<AttributeType>(userAttributes.length));
        }
        for (AttributeType ele : userAttributes) {
            this.userAttributes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of name-value pairs representing user attributes.
     * </p>
     * <p>
     * For custom attributes, you must prepend the <code>custom:</code> prefix to the attribute name.
     * </p>
     * 
     * @param userAttributes
     *        An array of name-value pairs representing user attributes.</p>
     *        <p>
     *        For custom attributes, you must prepend the <code>custom:</code> prefix to the attribute name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetUserResult withUserAttributes(java.util.Collection<AttributeType> userAttributes) {
        setUserAttributes(userAttributes);
        return this;
    }

    /**
     * <p>
     * Specifies the options for MFA (e.g., email or phone number).
     * </p>
     * 
     * @return Specifies the options for MFA (e.g., email or phone number).
     */

    public java.util.List<MFAOptionType> getMFAOptions() {
        return mFAOptions;
    }

    /**
     * <p>
     * Specifies the options for MFA (e.g., email or phone number).
     * </p>
     * 
     * @param mFAOptions
     *        Specifies the options for MFA (e.g., email or phone number).
     */

    public void setMFAOptions(java.util.Collection<MFAOptionType> mFAOptions) {
        if (mFAOptions == null) {
            this.mFAOptions = null;
            return;
        }

        this.mFAOptions = new java.util.ArrayList<MFAOptionType>(mFAOptions);
    }

    /**
     * <p>
     * Specifies the options for MFA (e.g., email or phone number).
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMFAOptions(java.util.Collection)} or {@link #withMFAOptions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param mFAOptions
     *        Specifies the options for MFA (e.g., email or phone number).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetUserResult withMFAOptions(MFAOptionType... mFAOptions) {
        if (this.mFAOptions == null) {
            setMFAOptions(new java.util.ArrayList<MFAOptionType>(mFAOptions.length));
        }
        for (MFAOptionType ele : mFAOptions) {
            this.mFAOptions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the options for MFA (e.g., email or phone number).
     * </p>
     * 
     * @param mFAOptions
     *        Specifies the options for MFA (e.g., email or phone number).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetUserResult withMFAOptions(java.util.Collection<MFAOptionType> mFAOptions) {
        setMFAOptions(mFAOptions);
        return this;
    }

    /**
     * <p>
     * The user's preferred MFA setting.
     * </p>
     * 
     * @param preferredMfaSetting
     *        The user's preferred MFA setting.
     */

    public void setPreferredMfaSetting(String preferredMfaSetting) {
        this.preferredMfaSetting = preferredMfaSetting;
    }

    /**
     * <p>
     * The user's preferred MFA setting.
     * </p>
     * 
     * @return The user's preferred MFA setting.
     */

    public String getPreferredMfaSetting() {
        return this.preferredMfaSetting;
    }

    /**
     * <p>
     * The user's preferred MFA setting.
     * </p>
     * 
     * @param preferredMfaSetting
     *        The user's preferred MFA setting.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetUserResult withPreferredMfaSetting(String preferredMfaSetting) {
        setPreferredMfaSetting(preferredMfaSetting);
        return this;
    }

    /**
     * <p>
     * The list of the user's MFA settings.
     * </p>
     * 
     * @return The list of the user's MFA settings.
     */

    public java.util.List<String> getUserMFASettingList() {
        return userMFASettingList;
    }

    /**
     * <p>
     * The list of the user's MFA settings.
     * </p>
     * 
     * @param userMFASettingList
     *        The list of the user's MFA settings.
     */

    public void setUserMFASettingList(java.util.Collection<String> userMFASettingList) {
        if (userMFASettingList == null) {
            this.userMFASettingList = null;
            return;
        }

        this.userMFASettingList = new java.util.ArrayList<String>(userMFASettingList);
    }

    /**
     * <p>
     * The list of the user's MFA settings.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUserMFASettingList(java.util.Collection)} or {@link #withUserMFASettingList(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param userMFASettingList
     *        The list of the user's MFA settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetUserResult withUserMFASettingList(String... userMFASettingList) {
        if (this.userMFASettingList == null) {
            setUserMFASettingList(new java.util.ArrayList<String>(userMFASettingList.length));
        }
        for (String ele : userMFASettingList) {
            this.userMFASettingList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of the user's MFA settings.
     * </p>
     * 
     * @param userMFASettingList
     *        The list of the user's MFA settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetUserResult withUserMFASettingList(java.util.Collection<String> userMFASettingList) {
        setUserMFASettingList(userMFASettingList);
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
        if (getUsername() != null)
            sb.append("Username: ").append("***Sensitive Data Redacted***").append(",");
        if (getUserAttributes() != null)
            sb.append("UserAttributes: ").append(getUserAttributes()).append(",");
        if (getMFAOptions() != null)
            sb.append("MFAOptions: ").append(getMFAOptions()).append(",");
        if (getPreferredMfaSetting() != null)
            sb.append("PreferredMfaSetting: ").append(getPreferredMfaSetting()).append(",");
        if (getUserMFASettingList() != null)
            sb.append("UserMFASettingList: ").append(getUserMFASettingList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetUserResult == false)
            return false;
        GetUserResult other = (GetUserResult) obj;
        if (other.getUsername() == null ^ this.getUsername() == null)
            return false;
        if (other.getUsername() != null && other.getUsername().equals(this.getUsername()) == false)
            return false;
        if (other.getUserAttributes() == null ^ this.getUserAttributes() == null)
            return false;
        if (other.getUserAttributes() != null && other.getUserAttributes().equals(this.getUserAttributes()) == false)
            return false;
        if (other.getMFAOptions() == null ^ this.getMFAOptions() == null)
            return false;
        if (other.getMFAOptions() != null && other.getMFAOptions().equals(this.getMFAOptions()) == false)
            return false;
        if (other.getPreferredMfaSetting() == null ^ this.getPreferredMfaSetting() == null)
            return false;
        if (other.getPreferredMfaSetting() != null && other.getPreferredMfaSetting().equals(this.getPreferredMfaSetting()) == false)
            return false;
        if (other.getUserMFASettingList() == null ^ this.getUserMFASettingList() == null)
            return false;
        if (other.getUserMFASettingList() != null && other.getUserMFASettingList().equals(this.getUserMFASettingList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUsername() == null) ? 0 : getUsername().hashCode());
        hashCode = prime * hashCode + ((getUserAttributes() == null) ? 0 : getUserAttributes().hashCode());
        hashCode = prime * hashCode + ((getMFAOptions() == null) ? 0 : getMFAOptions().hashCode());
        hashCode = prime * hashCode + ((getPreferredMfaSetting() == null) ? 0 : getPreferredMfaSetting().hashCode());
        hashCode = prime * hashCode + ((getUserMFASettingList() == null) ? 0 : getUserMFASettingList().hashCode());
        return hashCode;
    }

    @Override
    public GetUserResult clone() {
        try {
            return (GetUserResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
