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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/GetUserProfile" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetUserProfileRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * the ID of the Amazon DataZone domain the data portal of which you want to get.
     * </p>
     */
    private String domainIdentifier;
    /**
     * <p>
     * The type of the user profile.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The identifier of the user for which you want to get the user profile.
     * </p>
     */
    private String userIdentifier;

    /**
     * <p>
     * the ID of the Amazon DataZone domain the data portal of which you want to get.
     * </p>
     * 
     * @param domainIdentifier
     *        the ID of the Amazon DataZone domain the data portal of which you want to get.
     */

    public void setDomainIdentifier(String domainIdentifier) {
        this.domainIdentifier = domainIdentifier;
    }

    /**
     * <p>
     * the ID of the Amazon DataZone domain the data portal of which you want to get.
     * </p>
     * 
     * @return the ID of the Amazon DataZone domain the data portal of which you want to get.
     */

    public String getDomainIdentifier() {
        return this.domainIdentifier;
    }

    /**
     * <p>
     * the ID of the Amazon DataZone domain the data portal of which you want to get.
     * </p>
     * 
     * @param domainIdentifier
     *        the ID of the Amazon DataZone domain the data portal of which you want to get.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetUserProfileRequest withDomainIdentifier(String domainIdentifier) {
        setDomainIdentifier(domainIdentifier);
        return this;
    }

    /**
     * <p>
     * The type of the user profile.
     * </p>
     * 
     * @param type
     *        The type of the user profile.
     * @see UserProfileType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the user profile.
     * </p>
     * 
     * @return The type of the user profile.
     * @see UserProfileType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the user profile.
     * </p>
     * 
     * @param type
     *        The type of the user profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UserProfileType
     */

    public GetUserProfileRequest withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of the user profile.
     * </p>
     * 
     * @param type
     *        The type of the user profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UserProfileType
     */

    public GetUserProfileRequest withType(UserProfileType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The identifier of the user for which you want to get the user profile.
     * </p>
     * 
     * @param userIdentifier
     *        The identifier of the user for which you want to get the user profile.
     */

    public void setUserIdentifier(String userIdentifier) {
        this.userIdentifier = userIdentifier;
    }

    /**
     * <p>
     * The identifier of the user for which you want to get the user profile.
     * </p>
     * 
     * @return The identifier of the user for which you want to get the user profile.
     */

    public String getUserIdentifier() {
        return this.userIdentifier;
    }

    /**
     * <p>
     * The identifier of the user for which you want to get the user profile.
     * </p>
     * 
     * @param userIdentifier
     *        The identifier of the user for which you want to get the user profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetUserProfileRequest withUserIdentifier(String userIdentifier) {
        setUserIdentifier(userIdentifier);
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
        if (getDomainIdentifier() != null)
            sb.append("DomainIdentifier: ").append(getDomainIdentifier()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getUserIdentifier() != null)
            sb.append("UserIdentifier: ").append(getUserIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetUserProfileRequest == false)
            return false;
        GetUserProfileRequest other = (GetUserProfileRequest) obj;
        if (other.getDomainIdentifier() == null ^ this.getDomainIdentifier() == null)
            return false;
        if (other.getDomainIdentifier() != null && other.getDomainIdentifier().equals(this.getDomainIdentifier()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getUserIdentifier() == null ^ this.getUserIdentifier() == null)
            return false;
        if (other.getUserIdentifier() != null && other.getUserIdentifier().equals(this.getUserIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainIdentifier() == null) ? 0 : getDomainIdentifier().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getUserIdentifier() == null) ? 0 : getUserIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public GetUserProfileRequest clone() {
        return (GetUserProfileRequest) super.clone();
    }

}
