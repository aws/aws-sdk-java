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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreatePresignedDomainUrl" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreatePresignedDomainUrlRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The domain ID.
     * </p>
     */
    private String domainId;
    /**
     * <p>
     * The name of the UserProfile to sign-in as.
     * </p>
     */
    private String userProfileName;
    /**
     * <p>
     * The session expiration duration in seconds.
     * </p>
     */
    private Integer sessionExpirationDurationInSeconds;

    /**
     * <p>
     * The domain ID.
     * </p>
     * 
     * @param domainId
     *        The domain ID.
     */

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    /**
     * <p>
     * The domain ID.
     * </p>
     * 
     * @return The domain ID.
     */

    public String getDomainId() {
        return this.domainId;
    }

    /**
     * <p>
     * The domain ID.
     * </p>
     * 
     * @param domainId
     *        The domain ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePresignedDomainUrlRequest withDomainId(String domainId) {
        setDomainId(domainId);
        return this;
    }

    /**
     * <p>
     * The name of the UserProfile to sign-in as.
     * </p>
     * 
     * @param userProfileName
     *        The name of the UserProfile to sign-in as.
     */

    public void setUserProfileName(String userProfileName) {
        this.userProfileName = userProfileName;
    }

    /**
     * <p>
     * The name of the UserProfile to sign-in as.
     * </p>
     * 
     * @return The name of the UserProfile to sign-in as.
     */

    public String getUserProfileName() {
        return this.userProfileName;
    }

    /**
     * <p>
     * The name of the UserProfile to sign-in as.
     * </p>
     * 
     * @param userProfileName
     *        The name of the UserProfile to sign-in as.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePresignedDomainUrlRequest withUserProfileName(String userProfileName) {
        setUserProfileName(userProfileName);
        return this;
    }

    /**
     * <p>
     * The session expiration duration in seconds.
     * </p>
     * 
     * @param sessionExpirationDurationInSeconds
     *        The session expiration duration in seconds.
     */

    public void setSessionExpirationDurationInSeconds(Integer sessionExpirationDurationInSeconds) {
        this.sessionExpirationDurationInSeconds = sessionExpirationDurationInSeconds;
    }

    /**
     * <p>
     * The session expiration duration in seconds.
     * </p>
     * 
     * @return The session expiration duration in seconds.
     */

    public Integer getSessionExpirationDurationInSeconds() {
        return this.sessionExpirationDurationInSeconds;
    }

    /**
     * <p>
     * The session expiration duration in seconds.
     * </p>
     * 
     * @param sessionExpirationDurationInSeconds
     *        The session expiration duration in seconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePresignedDomainUrlRequest withSessionExpirationDurationInSeconds(Integer sessionExpirationDurationInSeconds) {
        setSessionExpirationDurationInSeconds(sessionExpirationDurationInSeconds);
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
        if (getSessionExpirationDurationInSeconds() != null)
            sb.append("SessionExpirationDurationInSeconds: ").append(getSessionExpirationDurationInSeconds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreatePresignedDomainUrlRequest == false)
            return false;
        CreatePresignedDomainUrlRequest other = (CreatePresignedDomainUrlRequest) obj;
        if (other.getDomainId() == null ^ this.getDomainId() == null)
            return false;
        if (other.getDomainId() != null && other.getDomainId().equals(this.getDomainId()) == false)
            return false;
        if (other.getUserProfileName() == null ^ this.getUserProfileName() == null)
            return false;
        if (other.getUserProfileName() != null && other.getUserProfileName().equals(this.getUserProfileName()) == false)
            return false;
        if (other.getSessionExpirationDurationInSeconds() == null ^ this.getSessionExpirationDurationInSeconds() == null)
            return false;
        if (other.getSessionExpirationDurationInSeconds() != null
                && other.getSessionExpirationDurationInSeconds().equals(this.getSessionExpirationDurationInSeconds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainId() == null) ? 0 : getDomainId().hashCode());
        hashCode = prime * hashCode + ((getUserProfileName() == null) ? 0 : getUserProfileName().hashCode());
        hashCode = prime * hashCode + ((getSessionExpirationDurationInSeconds() == null) ? 0 : getSessionExpirationDurationInSeconds().hashCode());
        return hashCode;
    }

    @Override
    public CreatePresignedDomainUrlRequest clone() {
        return (CreatePresignedDomainUrlRequest) super.clone();
    }

}
