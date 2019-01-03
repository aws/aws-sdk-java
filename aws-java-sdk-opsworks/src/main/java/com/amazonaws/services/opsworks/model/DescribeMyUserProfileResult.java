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
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains the response to a <code>DescribeMyUserProfile</code> request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DescribeMyUserProfile" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeMyUserProfileResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A <code>UserProfile</code> object that describes the user's SSH information.
     * </p>
     */
    private SelfUserProfile userProfile;

    /**
     * <p>
     * A <code>UserProfile</code> object that describes the user's SSH information.
     * </p>
     * 
     * @param userProfile
     *        A <code>UserProfile</code> object that describes the user's SSH information.
     */

    public void setUserProfile(SelfUserProfile userProfile) {
        this.userProfile = userProfile;
    }

    /**
     * <p>
     * A <code>UserProfile</code> object that describes the user's SSH information.
     * </p>
     * 
     * @return A <code>UserProfile</code> object that describes the user's SSH information.
     */

    public SelfUserProfile getUserProfile() {
        return this.userProfile;
    }

    /**
     * <p>
     * A <code>UserProfile</code> object that describes the user's SSH information.
     * </p>
     * 
     * @param userProfile
     *        A <code>UserProfile</code> object that describes the user's SSH information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMyUserProfileResult withUserProfile(SelfUserProfile userProfile) {
        setUserProfile(userProfile);
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
        if (getUserProfile() != null)
            sb.append("UserProfile: ").append(getUserProfile());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeMyUserProfileResult == false)
            return false;
        DescribeMyUserProfileResult other = (DescribeMyUserProfileResult) obj;
        if (other.getUserProfile() == null ^ this.getUserProfile() == null)
            return false;
        if (other.getUserProfile() != null && other.getUserProfile().equals(this.getUserProfile()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserProfile() == null) ? 0 : getUserProfile().hashCode());
        return hashCode;
    }

    @Override
    public DescribeMyUserProfileResult clone() {
        try {
            return (DescribeMyUserProfileResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
