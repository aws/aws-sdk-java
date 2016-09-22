/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the request to change a user password.
 * </p>
 */
public class ChangePasswordRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The old password in the change password request.
     * </p>
     */
    private String previousPassword;
    /**
     * <p>
     * The new password in the change password request.
     * </p>
     */
    private String proposedPassword;
    /**
     * <p>
     * The access token in the change password request.
     * </p>
     */
    private String accessToken;

    /**
     * <p>
     * The old password in the change password request.
     * </p>
     * 
     * @param previousPassword
     *        The old password in the change password request.
     */

    public void setPreviousPassword(String previousPassword) {
        this.previousPassword = previousPassword;
    }

    /**
     * <p>
     * The old password in the change password request.
     * </p>
     * 
     * @return The old password in the change password request.
     */

    public String getPreviousPassword() {
        return this.previousPassword;
    }

    /**
     * <p>
     * The old password in the change password request.
     * </p>
     * 
     * @param previousPassword
     *        The old password in the change password request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChangePasswordRequest withPreviousPassword(String previousPassword) {
        setPreviousPassword(previousPassword);
        return this;
    }

    /**
     * <p>
     * The new password in the change password request.
     * </p>
     * 
     * @param proposedPassword
     *        The new password in the change password request.
     */

    public void setProposedPassword(String proposedPassword) {
        this.proposedPassword = proposedPassword;
    }

    /**
     * <p>
     * The new password in the change password request.
     * </p>
     * 
     * @return The new password in the change password request.
     */

    public String getProposedPassword() {
        return this.proposedPassword;
    }

    /**
     * <p>
     * The new password in the change password request.
     * </p>
     * 
     * @param proposedPassword
     *        The new password in the change password request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChangePasswordRequest withProposedPassword(String proposedPassword) {
        setProposedPassword(proposedPassword);
        return this;
    }

    /**
     * <p>
     * The access token in the change password request.
     * </p>
     * 
     * @param accessToken
     *        The access token in the change password request.
     */

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    /**
     * <p>
     * The access token in the change password request.
     * </p>
     * 
     * @return The access token in the change password request.
     */

    public String getAccessToken() {
        return this.accessToken;
    }

    /**
     * <p>
     * The access token in the change password request.
     * </p>
     * 
     * @param accessToken
     *        The access token in the change password request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChangePasswordRequest withAccessToken(String accessToken) {
        setAccessToken(accessToken);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getPreviousPassword() != null)
            sb.append("PreviousPassword: " + getPreviousPassword() + ",");
        if (getProposedPassword() != null)
            sb.append("ProposedPassword: " + getProposedPassword() + ",");
        if (getAccessToken() != null)
            sb.append("AccessToken: " + getAccessToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ChangePasswordRequest == false)
            return false;
        ChangePasswordRequest other = (ChangePasswordRequest) obj;
        if (other.getPreviousPassword() == null ^ this.getPreviousPassword() == null)
            return false;
        if (other.getPreviousPassword() != null && other.getPreviousPassword().equals(this.getPreviousPassword()) == false)
            return false;
        if (other.getProposedPassword() == null ^ this.getProposedPassword() == null)
            return false;
        if (other.getProposedPassword() != null && other.getProposedPassword().equals(this.getProposedPassword()) == false)
            return false;
        if (other.getAccessToken() == null ^ this.getAccessToken() == null)
            return false;
        if (other.getAccessToken() != null && other.getAccessToken().equals(this.getAccessToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPreviousPassword() == null) ? 0 : getPreviousPassword().hashCode());
        hashCode = prime * hashCode + ((getProposedPassword() == null) ? 0 : getProposedPassword().hashCode());
        hashCode = prime * hashCode + ((getAccessToken() == null) ? 0 : getAccessToken().hashCode());
        return hashCode;
    }

    @Override
    public ChangePasswordRequest clone() {
        return (ChangePasswordRequest) super.clone();
    }
}
