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
package com.amazonaws.services.cloud9.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloud9-2017-09-23/UpdateEnvironmentMembership" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateEnvironmentMembershipResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the environment member whose settings were changed.
     * </p>
     */
    private EnvironmentMember membership;

    /**
     * <p>
     * Information about the environment member whose settings were changed.
     * </p>
     * 
     * @param membership
     *        Information about the environment member whose settings were changed.
     */

    public void setMembership(EnvironmentMember membership) {
        this.membership = membership;
    }

    /**
     * <p>
     * Information about the environment member whose settings were changed.
     * </p>
     * 
     * @return Information about the environment member whose settings were changed.
     */

    public EnvironmentMember getMembership() {
        return this.membership;
    }

    /**
     * <p>
     * Information about the environment member whose settings were changed.
     * </p>
     * 
     * @param membership
     *        Information about the environment member whose settings were changed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEnvironmentMembershipResult withMembership(EnvironmentMember membership) {
        setMembership(membership);
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
        if (getMembership() != null)
            sb.append("Membership: ").append(getMembership());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateEnvironmentMembershipResult == false)
            return false;
        UpdateEnvironmentMembershipResult other = (UpdateEnvironmentMembershipResult) obj;
        if (other.getMembership() == null ^ this.getMembership() == null)
            return false;
        if (other.getMembership() != null && other.getMembership().equals(this.getMembership()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMembership() == null) ? 0 : getMembership().hashCode());
        return hashCode;
    }

    @Override
    public UpdateEnvironmentMembershipResult clone() {
        try {
            return (UpdateEnvironmentMembershipResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
