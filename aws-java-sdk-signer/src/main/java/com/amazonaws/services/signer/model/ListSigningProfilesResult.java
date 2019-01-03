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
package com.amazonaws.services.signer.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/signer-2017-08-25/ListSigningProfiles" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListSigningProfilesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of profiles that are available in the AWS account. This includes profiles with the status of
     * <code>CANCELED</code> if the <code>includeCanceled</code> parameter is set to <code>true</code>.
     * </p>
     */
    private java.util.List<SigningProfile> profiles;
    /**
     * <p>
     * Value for specifying the next set of paginated results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of profiles that are available in the AWS account. This includes profiles with the status of
     * <code>CANCELED</code> if the <code>includeCanceled</code> parameter is set to <code>true</code>.
     * </p>
     * 
     * @return A list of profiles that are available in the AWS account. This includes profiles with the status of
     *         <code>CANCELED</code> if the <code>includeCanceled</code> parameter is set to <code>true</code>.
     */

    public java.util.List<SigningProfile> getProfiles() {
        return profiles;
    }

    /**
     * <p>
     * A list of profiles that are available in the AWS account. This includes profiles with the status of
     * <code>CANCELED</code> if the <code>includeCanceled</code> parameter is set to <code>true</code>.
     * </p>
     * 
     * @param profiles
     *        A list of profiles that are available in the AWS account. This includes profiles with the status of
     *        <code>CANCELED</code> if the <code>includeCanceled</code> parameter is set to <code>true</code>.
     */

    public void setProfiles(java.util.Collection<SigningProfile> profiles) {
        if (profiles == null) {
            this.profiles = null;
            return;
        }

        this.profiles = new java.util.ArrayList<SigningProfile>(profiles);
    }

    /**
     * <p>
     * A list of profiles that are available in the AWS account. This includes profiles with the status of
     * <code>CANCELED</code> if the <code>includeCanceled</code> parameter is set to <code>true</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProfiles(java.util.Collection)} or {@link #withProfiles(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param profiles
     *        A list of profiles that are available in the AWS account. This includes profiles with the status of
     *        <code>CANCELED</code> if the <code>includeCanceled</code> parameter is set to <code>true</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSigningProfilesResult withProfiles(SigningProfile... profiles) {
        if (this.profiles == null) {
            setProfiles(new java.util.ArrayList<SigningProfile>(profiles.length));
        }
        for (SigningProfile ele : profiles) {
            this.profiles.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of profiles that are available in the AWS account. This includes profiles with the status of
     * <code>CANCELED</code> if the <code>includeCanceled</code> parameter is set to <code>true</code>.
     * </p>
     * 
     * @param profiles
     *        A list of profiles that are available in the AWS account. This includes profiles with the status of
     *        <code>CANCELED</code> if the <code>includeCanceled</code> parameter is set to <code>true</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSigningProfilesResult withProfiles(java.util.Collection<SigningProfile> profiles) {
        setProfiles(profiles);
        return this;
    }

    /**
     * <p>
     * Value for specifying the next set of paginated results to return.
     * </p>
     * 
     * @param nextToken
     *        Value for specifying the next set of paginated results to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Value for specifying the next set of paginated results to return.
     * </p>
     * 
     * @return Value for specifying the next set of paginated results to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Value for specifying the next set of paginated results to return.
     * </p>
     * 
     * @param nextToken
     *        Value for specifying the next set of paginated results to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSigningProfilesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getProfiles() != null)
            sb.append("Profiles: ").append(getProfiles()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListSigningProfilesResult == false)
            return false;
        ListSigningProfilesResult other = (ListSigningProfilesResult) obj;
        if (other.getProfiles() == null ^ this.getProfiles() == null)
            return false;
        if (other.getProfiles() != null && other.getProfiles().equals(this.getProfiles()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProfiles() == null) ? 0 : getProfiles().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListSigningProfilesResult clone() {
        try {
            return (ListSigningProfilesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
