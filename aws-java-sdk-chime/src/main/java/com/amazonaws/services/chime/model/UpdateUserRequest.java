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
package com.amazonaws.services.chime.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/UpdateUser" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateUserRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Chime account ID.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The user ID.
     * </p>
     */
    private String userId;
    /**
     * <p>
     * The user license type to update. This must be a supported license type for the Amazon Chime account that the user
     * belongs to.
     * </p>
     */
    private String licenseType;
    /**
     * <p>
     * The user type.
     * </p>
     */
    private String userType;
    /**
     * <p>
     * The Alexa for Business metadata.
     * </p>
     */
    private AlexaForBusinessMetadata alexaForBusinessMetadata;

    /**
     * <p>
     * The Amazon Chime account ID.
     * </p>
     * 
     * @param accountId
     *        The Amazon Chime account ID.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The Amazon Chime account ID.
     * </p>
     * 
     * @return The Amazon Chime account ID.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The Amazon Chime account ID.
     * </p>
     * 
     * @param accountId
     *        The Amazon Chime account ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUserRequest withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The user ID.
     * </p>
     * 
     * @param userId
     *        The user ID.
     */

    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * <p>
     * The user ID.
     * </p>
     * 
     * @return The user ID.
     */

    public String getUserId() {
        return this.userId;
    }

    /**
     * <p>
     * The user ID.
     * </p>
     * 
     * @param userId
     *        The user ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUserRequest withUserId(String userId) {
        setUserId(userId);
        return this;
    }

    /**
     * <p>
     * The user license type to update. This must be a supported license type for the Amazon Chime account that the user
     * belongs to.
     * </p>
     * 
     * @param licenseType
     *        The user license type to update. This must be a supported license type for the Amazon Chime account that
     *        the user belongs to.
     * @see License
     */

    public void setLicenseType(String licenseType) {
        this.licenseType = licenseType;
    }

    /**
     * <p>
     * The user license type to update. This must be a supported license type for the Amazon Chime account that the user
     * belongs to.
     * </p>
     * 
     * @return The user license type to update. This must be a supported license type for the Amazon Chime account that
     *         the user belongs to.
     * @see License
     */

    public String getLicenseType() {
        return this.licenseType;
    }

    /**
     * <p>
     * The user license type to update. This must be a supported license type for the Amazon Chime account that the user
     * belongs to.
     * </p>
     * 
     * @param licenseType
     *        The user license type to update. This must be a supported license type for the Amazon Chime account that
     *        the user belongs to.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see License
     */

    public UpdateUserRequest withLicenseType(String licenseType) {
        setLicenseType(licenseType);
        return this;
    }

    /**
     * <p>
     * The user license type to update. This must be a supported license type for the Amazon Chime account that the user
     * belongs to.
     * </p>
     * 
     * @param licenseType
     *        The user license type to update. This must be a supported license type for the Amazon Chime account that
     *        the user belongs to.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see License
     */

    public UpdateUserRequest withLicenseType(License licenseType) {
        this.licenseType = licenseType.toString();
        return this;
    }

    /**
     * <p>
     * The user type.
     * </p>
     * 
     * @param userType
     *        The user type.
     * @see UserType
     */

    public void setUserType(String userType) {
        this.userType = userType;
    }

    /**
     * <p>
     * The user type.
     * </p>
     * 
     * @return The user type.
     * @see UserType
     */

    public String getUserType() {
        return this.userType;
    }

    /**
     * <p>
     * The user type.
     * </p>
     * 
     * @param userType
     *        The user type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UserType
     */

    public UpdateUserRequest withUserType(String userType) {
        setUserType(userType);
        return this;
    }

    /**
     * <p>
     * The user type.
     * </p>
     * 
     * @param userType
     *        The user type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UserType
     */

    public UpdateUserRequest withUserType(UserType userType) {
        this.userType = userType.toString();
        return this;
    }

    /**
     * <p>
     * The Alexa for Business metadata.
     * </p>
     * 
     * @param alexaForBusinessMetadata
     *        The Alexa for Business metadata.
     */

    public void setAlexaForBusinessMetadata(AlexaForBusinessMetadata alexaForBusinessMetadata) {
        this.alexaForBusinessMetadata = alexaForBusinessMetadata;
    }

    /**
     * <p>
     * The Alexa for Business metadata.
     * </p>
     * 
     * @return The Alexa for Business metadata.
     */

    public AlexaForBusinessMetadata getAlexaForBusinessMetadata() {
        return this.alexaForBusinessMetadata;
    }

    /**
     * <p>
     * The Alexa for Business metadata.
     * </p>
     * 
     * @param alexaForBusinessMetadata
     *        The Alexa for Business metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUserRequest withAlexaForBusinessMetadata(AlexaForBusinessMetadata alexaForBusinessMetadata) {
        setAlexaForBusinessMetadata(alexaForBusinessMetadata);
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
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
        if (getUserId() != null)
            sb.append("UserId: ").append(getUserId()).append(",");
        if (getLicenseType() != null)
            sb.append("LicenseType: ").append(getLicenseType()).append(",");
        if (getUserType() != null)
            sb.append("UserType: ").append(getUserType()).append(",");
        if (getAlexaForBusinessMetadata() != null)
            sb.append("AlexaForBusinessMetadata: ").append(getAlexaForBusinessMetadata());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateUserRequest == false)
            return false;
        UpdateUserRequest other = (UpdateUserRequest) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getUserId() == null ^ this.getUserId() == null)
            return false;
        if (other.getUserId() != null && other.getUserId().equals(this.getUserId()) == false)
            return false;
        if (other.getLicenseType() == null ^ this.getLicenseType() == null)
            return false;
        if (other.getLicenseType() != null && other.getLicenseType().equals(this.getLicenseType()) == false)
            return false;
        if (other.getUserType() == null ^ this.getUserType() == null)
            return false;
        if (other.getUserType() != null && other.getUserType().equals(this.getUserType()) == false)
            return false;
        if (other.getAlexaForBusinessMetadata() == null ^ this.getAlexaForBusinessMetadata() == null)
            return false;
        if (other.getAlexaForBusinessMetadata() != null && other.getAlexaForBusinessMetadata().equals(this.getAlexaForBusinessMetadata()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getUserId() == null) ? 0 : getUserId().hashCode());
        hashCode = prime * hashCode + ((getLicenseType() == null) ? 0 : getLicenseType().hashCode());
        hashCode = prime * hashCode + ((getUserType() == null) ? 0 : getUserType().hashCode());
        hashCode = prime * hashCode + ((getAlexaForBusinessMetadata() == null) ? 0 : getAlexaForBusinessMetadata().hashCode());
        return hashCode;
    }

    @Override
    public UpdateUserRequest clone() {
        return (UpdateUserRequest) super.clone();
    }

}
