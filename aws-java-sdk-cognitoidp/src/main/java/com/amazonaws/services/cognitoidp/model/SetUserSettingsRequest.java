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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the request to set user settings.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/SetUserSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SetUserSettingsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The access token for the set user settings request.
     * </p>
     */
    private String accessToken;
    /**
     * <p>
     * Specifies the options for MFA (e.g., email or phone number).
     * </p>
     */
    private java.util.List<MFAOptionType> mFAOptions;

    /**
     * <p>
     * The access token for the set user settings request.
     * </p>
     * 
     * @param accessToken
     *        The access token for the set user settings request.
     */

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    /**
     * <p>
     * The access token for the set user settings request.
     * </p>
     * 
     * @return The access token for the set user settings request.
     */

    public String getAccessToken() {
        return this.accessToken;
    }

    /**
     * <p>
     * The access token for the set user settings request.
     * </p>
     * 
     * @param accessToken
     *        The access token for the set user settings request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetUserSettingsRequest withAccessToken(String accessToken) {
        setAccessToken(accessToken);
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

    public SetUserSettingsRequest withMFAOptions(MFAOptionType... mFAOptions) {
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

    public SetUserSettingsRequest withMFAOptions(java.util.Collection<MFAOptionType> mFAOptions) {
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
        if (getAccessToken() != null)
            sb.append("AccessToken: ").append("***Sensitive Data Redacted***").append(",");
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

        if (obj instanceof SetUserSettingsRequest == false)
            return false;
        SetUserSettingsRequest other = (SetUserSettingsRequest) obj;
        if (other.getAccessToken() == null ^ this.getAccessToken() == null)
            return false;
        if (other.getAccessToken() != null && other.getAccessToken().equals(this.getAccessToken()) == false)
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

        hashCode = prime * hashCode + ((getAccessToken() == null) ? 0 : getAccessToken().hashCode());
        hashCode = prime * hashCode + ((getMFAOptions() == null) ? 0 : getMFAOptions().hashCode());
        return hashCode;
    }

    @Override
    public SetUserSettingsRequest clone() {
        return (SetUserSettingsRequest) super.clone();
    }

}
