/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.transfer.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/DescribeProfile" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeProfileRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the profile that you want described.
     * </p>
     */
    private String profileId;

    /**
     * <p>
     * The identifier of the profile that you want described.
     * </p>
     * 
     * @param profileId
     *        The identifier of the profile that you want described.
     */

    public void setProfileId(String profileId) {
        this.profileId = profileId;
    }

    /**
     * <p>
     * The identifier of the profile that you want described.
     * </p>
     * 
     * @return The identifier of the profile that you want described.
     */

    public String getProfileId() {
        return this.profileId;
    }

    /**
     * <p>
     * The identifier of the profile that you want described.
     * </p>
     * 
     * @param profileId
     *        The identifier of the profile that you want described.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProfileRequest withProfileId(String profileId) {
        setProfileId(profileId);
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
        if (getProfileId() != null)
            sb.append("ProfileId: ").append(getProfileId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeProfileRequest == false)
            return false;
        DescribeProfileRequest other = (DescribeProfileRequest) obj;
        if (other.getProfileId() == null ^ this.getProfileId() == null)
            return false;
        if (other.getProfileId() != null && other.getProfileId().equals(this.getProfileId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProfileId() == null) ? 0 : getProfileId().hashCode());
        return hashCode;
    }

    @Override
    public DescribeProfileRequest clone() {
        return (DescribeProfileRequest) super.clone();
    }

}
