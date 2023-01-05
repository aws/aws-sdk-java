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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceResult;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateVerifiedAccessGroupResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the Verified Access group.
     * </p>
     */
    private VerifiedAccessGroup verifiedAccessGroup;

    /**
     * <p>
     * The ID of the Verified Access group.
     * </p>
     * 
     * @param verifiedAccessGroup
     *        The ID of the Verified Access group.
     */

    public void setVerifiedAccessGroup(VerifiedAccessGroup verifiedAccessGroup) {
        this.verifiedAccessGroup = verifiedAccessGroup;
    }

    /**
     * <p>
     * The ID of the Verified Access group.
     * </p>
     * 
     * @return The ID of the Verified Access group.
     */

    public VerifiedAccessGroup getVerifiedAccessGroup() {
        return this.verifiedAccessGroup;
    }

    /**
     * <p>
     * The ID of the Verified Access group.
     * </p>
     * 
     * @param verifiedAccessGroup
     *        The ID of the Verified Access group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVerifiedAccessGroupResult withVerifiedAccessGroup(VerifiedAccessGroup verifiedAccessGroup) {
        setVerifiedAccessGroup(verifiedAccessGroup);
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
        if (getVerifiedAccessGroup() != null)
            sb.append("VerifiedAccessGroup: ").append(getVerifiedAccessGroup());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateVerifiedAccessGroupResult == false)
            return false;
        CreateVerifiedAccessGroupResult other = (CreateVerifiedAccessGroupResult) obj;
        if (other.getVerifiedAccessGroup() == null ^ this.getVerifiedAccessGroup() == null)
            return false;
        if (other.getVerifiedAccessGroup() != null && other.getVerifiedAccessGroup().equals(this.getVerifiedAccessGroup()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVerifiedAccessGroup() == null) ? 0 : getVerifiedAccessGroup().hashCode());
        return hashCode;
    }

    @Override
    public CreateVerifiedAccessGroupResult clone() {
        try {
            return (CreateVerifiedAccessGroupResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
