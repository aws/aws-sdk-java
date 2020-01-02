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
package com.amazonaws.services.eks.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/DeleteFargateProfile" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteFargateProfileResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The deleted Fargate profile.
     * </p>
     */
    private FargateProfile fargateProfile;

    /**
     * <p>
     * The deleted Fargate profile.
     * </p>
     * 
     * @param fargateProfile
     *        The deleted Fargate profile.
     */

    public void setFargateProfile(FargateProfile fargateProfile) {
        this.fargateProfile = fargateProfile;
    }

    /**
     * <p>
     * The deleted Fargate profile.
     * </p>
     * 
     * @return The deleted Fargate profile.
     */

    public FargateProfile getFargateProfile() {
        return this.fargateProfile;
    }

    /**
     * <p>
     * The deleted Fargate profile.
     * </p>
     * 
     * @param fargateProfile
     *        The deleted Fargate profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteFargateProfileResult withFargateProfile(FargateProfile fargateProfile) {
        setFargateProfile(fargateProfile);
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
        if (getFargateProfile() != null)
            sb.append("FargateProfile: ").append(getFargateProfile());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteFargateProfileResult == false)
            return false;
        DeleteFargateProfileResult other = (DeleteFargateProfileResult) obj;
        if (other.getFargateProfile() == null ^ this.getFargateProfile() == null)
            return false;
        if (other.getFargateProfile() != null && other.getFargateProfile().equals(this.getFargateProfile()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFargateProfile() == null) ? 0 : getFargateProfile().hashCode());
        return hashCode;
    }

    @Override
    public DeleteFargateProfileResult clone() {
        try {
            return (DeleteFargateProfileResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
