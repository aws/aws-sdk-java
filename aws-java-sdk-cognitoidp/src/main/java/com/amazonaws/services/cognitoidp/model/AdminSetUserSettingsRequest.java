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
package com.amazonaws.services.cognitoidp.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * You can use this parameter to set an MFA configuration that uses the SMS delivery medium.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/AdminSetUserSettings" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AdminSetUserSettingsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the user pool that contains the user that you are setting options for.
     * </p>
     */
    private String userPoolId;
    /**
     * <p>
     * The user name of the user that you are setting options for.
     * </p>
     */
    private String username;
    /**
     * <p>
     * You can use this parameter only to set an SMS configuration that uses SMS for delivery.
     * </p>
     */
    private java.util.List<MFAOptionType> mFAOptions;

    /**
     * <p>
     * The ID of the user pool that contains the user that you are setting options for.
     * </p>
     * 
     * @param userPoolId
     *        The ID of the user pool that contains the user that you are setting options for.
     */

    public void setUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
    }

    /**
     * <p>
     * The ID of the user pool that contains the user that you are setting options for.
     * </p>
     * 
     * @return The ID of the user pool that contains the user that you are setting options for.
     */

    public String getUserPoolId() {
        return this.userPoolId;
    }

    /**
     * <p>
     * The ID of the user pool that contains the user that you are setting options for.
     * </p>
     * 
     * @param userPoolId
     *        The ID of the user pool that contains the user that you are setting options for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdminSetUserSettingsRequest withUserPoolId(String userPoolId) {
        setUserPoolId(userPoolId);
        return this;
    }

    /**
     * <p>
     * The user name of the user that you are setting options for.
     * </p>
     * 
     * @param username
     *        The user name of the user that you are setting options for.
     */

    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * <p>
     * The user name of the user that you are setting options for.
     * </p>
     * 
     * @return The user name of the user that you are setting options for.
     */

    public String getUsername() {
        return this.username;
    }

    /**
     * <p>
     * The user name of the user that you are setting options for.
     * </p>
     * 
     * @param username
     *        The user name of the user that you are setting options for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdminSetUserSettingsRequest withUsername(String username) {
        setUsername(username);
        return this;
    }

    /**
     * <p>
     * You can use this parameter only to set an SMS configuration that uses SMS for delivery.
     * </p>
     * 
     * @return You can use this parameter only to set an SMS configuration that uses SMS for delivery.
     */

    public java.util.List<MFAOptionType> getMFAOptions() {
        return mFAOptions;
    }

    /**
     * <p>
     * You can use this parameter only to set an SMS configuration that uses SMS for delivery.
     * </p>
     * 
     * @param mFAOptions
     *        You can use this parameter only to set an SMS configuration that uses SMS for delivery.
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
     * You can use this parameter only to set an SMS configuration that uses SMS for delivery.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMFAOptions(java.util.Collection)} or {@link #withMFAOptions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param mFAOptions
     *        You can use this parameter only to set an SMS configuration that uses SMS for delivery.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdminSetUserSettingsRequest withMFAOptions(MFAOptionType... mFAOptions) {
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
     * You can use this parameter only to set an SMS configuration that uses SMS for delivery.
     * </p>
     * 
     * @param mFAOptions
     *        You can use this parameter only to set an SMS configuration that uses SMS for delivery.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdminSetUserSettingsRequest withMFAOptions(java.util.Collection<MFAOptionType> mFAOptions) {
        setMFAOptions(mFAOptions);
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
        if (getUserPoolId() != null)
            sb.append("UserPoolId: ").append(getUserPoolId()).append(",");
        if (getUsername() != null)
            sb.append("Username: ").append("***Sensitive Data Redacted***").append(",");
        if (getMFAOptions() != null)
            sb.append("MFAOptions: ").append(getMFAOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AdminSetUserSettingsRequest == false)
            return false;
        AdminSetUserSettingsRequest other = (AdminSetUserSettingsRequest) obj;
        if (other.getUserPoolId() == null ^ this.getUserPoolId() == null)
            return false;
        if (other.getUserPoolId() != null && other.getUserPoolId().equals(this.getUserPoolId()) == false)
            return false;
        if (other.getUsername() == null ^ this.getUsername() == null)
            return false;
        if (other.getUsername() != null && other.getUsername().equals(this.getUsername()) == false)
            return false;
        if (other.getMFAOptions() == null ^ this.getMFAOptions() == null)
            return false;
        if (other.getMFAOptions() != null && other.getMFAOptions().equals(this.getMFAOptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserPoolId() == null) ? 0 : getUserPoolId().hashCode());
        hashCode = prime * hashCode + ((getUsername() == null) ? 0 : getUsername().hashCode());
        hashCode = prime * hashCode + ((getMFAOptions() == null) ? 0 : getMFAOptions().hashCode());
        return hashCode;
    }

    @Override
    public AdminSetUserSettingsRequest clone() {
        return (AdminSetUserSettingsRequest) super.clone();
    }

}
