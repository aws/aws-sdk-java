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
package com.amazonaws.services.datazone.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/CreateUserProfile" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateUserProfileRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique, case-sensitive identifier that is provided to ensure the idempotency of the request.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The identifier of the Amazon DataZone domain in which a user profile is created.
     * </p>
     */
    private String domainIdentifier;
    /**
     * <p>
     * The identifier of the user for which the user profile is created.
     * </p>
     */
    private String userIdentifier;
    /**
     * <p>
     * The user type of the user for which the user profile is created.
     * </p>
     */
    private String userType;

    /**
     * <p>
     * A unique, case-sensitive identifier that is provided to ensure the idempotency of the request.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive identifier that is provided to ensure the idempotency of the request.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that is provided to ensure the idempotency of the request.
     * </p>
     * 
     * @return A unique, case-sensitive identifier that is provided to ensure the idempotency of the request.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that is provided to ensure the idempotency of the request.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive identifier that is provided to ensure the idempotency of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserProfileRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The identifier of the Amazon DataZone domain in which a user profile is created.
     * </p>
     * 
     * @param domainIdentifier
     *        The identifier of the Amazon DataZone domain in which a user profile is created.
     */

    public void setDomainIdentifier(String domainIdentifier) {
        this.domainIdentifier = domainIdentifier;
    }

    /**
     * <p>
     * The identifier of the Amazon DataZone domain in which a user profile is created.
     * </p>
     * 
     * @return The identifier of the Amazon DataZone domain in which a user profile is created.
     */

    public String getDomainIdentifier() {
        return this.domainIdentifier;
    }

    /**
     * <p>
     * The identifier of the Amazon DataZone domain in which a user profile is created.
     * </p>
     * 
     * @param domainIdentifier
     *        The identifier of the Amazon DataZone domain in which a user profile is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserProfileRequest withDomainIdentifier(String domainIdentifier) {
        setDomainIdentifier(domainIdentifier);
        return this;
    }

    /**
     * <p>
     * The identifier of the user for which the user profile is created.
     * </p>
     * 
     * @param userIdentifier
     *        The identifier of the user for which the user profile is created.
     */

    public void setUserIdentifier(String userIdentifier) {
        this.userIdentifier = userIdentifier;
    }

    /**
     * <p>
     * The identifier of the user for which the user profile is created.
     * </p>
     * 
     * @return The identifier of the user for which the user profile is created.
     */

    public String getUserIdentifier() {
        return this.userIdentifier;
    }

    /**
     * <p>
     * The identifier of the user for which the user profile is created.
     * </p>
     * 
     * @param userIdentifier
     *        The identifier of the user for which the user profile is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserProfileRequest withUserIdentifier(String userIdentifier) {
        setUserIdentifier(userIdentifier);
        return this;
    }

    /**
     * <p>
     * The user type of the user for which the user profile is created.
     * </p>
     * 
     * @param userType
     *        The user type of the user for which the user profile is created.
     * @see UserType
     */

    public void setUserType(String userType) {
        this.userType = userType;
    }

    /**
     * <p>
     * The user type of the user for which the user profile is created.
     * </p>
     * 
     * @return The user type of the user for which the user profile is created.
     * @see UserType
     */

    public String getUserType() {
        return this.userType;
    }

    /**
     * <p>
     * The user type of the user for which the user profile is created.
     * </p>
     * 
     * @param userType
     *        The user type of the user for which the user profile is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UserType
     */

    public CreateUserProfileRequest withUserType(String userType) {
        setUserType(userType);
        return this;
    }

    /**
     * <p>
     * The user type of the user for which the user profile is created.
     * </p>
     * 
     * @param userType
     *        The user type of the user for which the user profile is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UserType
     */

    public CreateUserProfileRequest withUserType(UserType userType) {
        this.userType = userType.toString();
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
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getDomainIdentifier() != null)
            sb.append("DomainIdentifier: ").append(getDomainIdentifier()).append(",");
        if (getUserIdentifier() != null)
            sb.append("UserIdentifier: ").append(getUserIdentifier()).append(",");
        if (getUserType() != null)
            sb.append("UserType: ").append(getUserType());
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
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getDomainIdentifier() == null ^ this.getDomainIdentifier() == null)
            return false;
        if (other.getDomainIdentifier() != null && other.getDomainIdentifier().equals(this.getDomainIdentifier()) == false)
            return false;
        if (other.getUserIdentifier() == null ^ this.getUserIdentifier() == null)
            return false;
        if (other.getUserIdentifier() != null && other.getUserIdentifier().equals(this.getUserIdentifier()) == false)
            return false;
        if (other.getUserType() == null ^ this.getUserType() == null)
            return false;
        if (other.getUserType() != null && other.getUserType().equals(this.getUserType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getDomainIdentifier() == null) ? 0 : getDomainIdentifier().hashCode());
        hashCode = prime * hashCode + ((getUserIdentifier() == null) ? 0 : getUserIdentifier().hashCode());
        hashCode = prime * hashCode + ((getUserType() == null) ? 0 : getUserType().hashCode());
        return hashCode;
    }

    @Override
    public CreateUserProfileRequest clone() {
        return (CreateUserProfileRequest) super.clone();
    }

}
