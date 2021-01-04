/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/signer-2017-08-25/ListProfilePermissions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListProfilePermissionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Name of the signing profile containing the cross-account permissions.
     * </p>
     */
    private String profileName;
    /**
     * <p>
     * String for specifying the next set of paginated results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Name of the signing profile containing the cross-account permissions.
     * </p>
     * 
     * @param profileName
     *        Name of the signing profile containing the cross-account permissions.
     */

    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }

    /**
     * <p>
     * Name of the signing profile containing the cross-account permissions.
     * </p>
     * 
     * @return Name of the signing profile containing the cross-account permissions.
     */

    public String getProfileName() {
        return this.profileName;
    }

    /**
     * <p>
     * Name of the signing profile containing the cross-account permissions.
     * </p>
     * 
     * @param profileName
     *        Name of the signing profile containing the cross-account permissions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProfilePermissionsRequest withProfileName(String profileName) {
        setProfileName(profileName);
        return this;
    }

    /**
     * <p>
     * String for specifying the next set of paginated results.
     * </p>
     * 
     * @param nextToken
     *        String for specifying the next set of paginated results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * String for specifying the next set of paginated results.
     * </p>
     * 
     * @return String for specifying the next set of paginated results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * String for specifying the next set of paginated results.
     * </p>
     * 
     * @param nextToken
     *        String for specifying the next set of paginated results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProfilePermissionsRequest withNextToken(String nextToken) {
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
        if (getProfileName() != null)
            sb.append("ProfileName: ").append(getProfileName()).append(",");
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

        if (obj instanceof ListProfilePermissionsRequest == false)
            return false;
        ListProfilePermissionsRequest other = (ListProfilePermissionsRequest) obj;
        if (other.getProfileName() == null ^ this.getProfileName() == null)
            return false;
        if (other.getProfileName() != null && other.getProfileName().equals(this.getProfileName()) == false)
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

        hashCode = prime * hashCode + ((getProfileName() == null) ? 0 : getProfileName().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListProfilePermissionsRequest clone() {
        return (ListProfilePermissionsRequest) super.clone();
    }

}
