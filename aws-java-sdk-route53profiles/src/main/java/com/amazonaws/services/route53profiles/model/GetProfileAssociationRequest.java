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
package com.amazonaws.services.route53profiles.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53profiles-2018-05-10/GetProfileAssociation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetProfileAssociationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the association you want to get information about.
     * </p>
     */
    private String profileAssociationId;

    /**
     * <p>
     * The identifier of the association you want to get information about.
     * </p>
     * 
     * @param profileAssociationId
     *        The identifier of the association you want to get information about.
     */

    public void setProfileAssociationId(String profileAssociationId) {
        this.profileAssociationId = profileAssociationId;
    }

    /**
     * <p>
     * The identifier of the association you want to get information about.
     * </p>
     * 
     * @return The identifier of the association you want to get information about.
     */

    public String getProfileAssociationId() {
        return this.profileAssociationId;
    }

    /**
     * <p>
     * The identifier of the association you want to get information about.
     * </p>
     * 
     * @param profileAssociationId
     *        The identifier of the association you want to get information about.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetProfileAssociationRequest withProfileAssociationId(String profileAssociationId) {
        setProfileAssociationId(profileAssociationId);
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
        if (getProfileAssociationId() != null)
            sb.append("ProfileAssociationId: ").append(getProfileAssociationId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetProfileAssociationRequest == false)
            return false;
        GetProfileAssociationRequest other = (GetProfileAssociationRequest) obj;
        if (other.getProfileAssociationId() == null ^ this.getProfileAssociationId() == null)
            return false;
        if (other.getProfileAssociationId() != null && other.getProfileAssociationId().equals(this.getProfileAssociationId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProfileAssociationId() == null) ? 0 : getProfileAssociationId().hashCode());
        return hashCode;
    }

    @Override
    public GetProfileAssociationRequest clone() {
        return (GetProfileAssociationRequest) super.clone();
    }

}
