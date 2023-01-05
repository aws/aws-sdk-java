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
public class ModifyVerifiedAccessEndpointResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Web Services Verified Access endpoint details.
     * </p>
     */
    private VerifiedAccessEndpoint verifiedAccessEndpoint;

    /**
     * <p>
     * The Amazon Web Services Verified Access endpoint details.
     * </p>
     * 
     * @param verifiedAccessEndpoint
     *        The Amazon Web Services Verified Access endpoint details.
     */

    public void setVerifiedAccessEndpoint(VerifiedAccessEndpoint verifiedAccessEndpoint) {
        this.verifiedAccessEndpoint = verifiedAccessEndpoint;
    }

    /**
     * <p>
     * The Amazon Web Services Verified Access endpoint details.
     * </p>
     * 
     * @return The Amazon Web Services Verified Access endpoint details.
     */

    public VerifiedAccessEndpoint getVerifiedAccessEndpoint() {
        return this.verifiedAccessEndpoint;
    }

    /**
     * <p>
     * The Amazon Web Services Verified Access endpoint details.
     * </p>
     * 
     * @param verifiedAccessEndpoint
     *        The Amazon Web Services Verified Access endpoint details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyVerifiedAccessEndpointResult withVerifiedAccessEndpoint(VerifiedAccessEndpoint verifiedAccessEndpoint) {
        setVerifiedAccessEndpoint(verifiedAccessEndpoint);
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
        if (getVerifiedAccessEndpoint() != null)
            sb.append("VerifiedAccessEndpoint: ").append(getVerifiedAccessEndpoint());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyVerifiedAccessEndpointResult == false)
            return false;
        ModifyVerifiedAccessEndpointResult other = (ModifyVerifiedAccessEndpointResult) obj;
        if (other.getVerifiedAccessEndpoint() == null ^ this.getVerifiedAccessEndpoint() == null)
            return false;
        if (other.getVerifiedAccessEndpoint() != null && other.getVerifiedAccessEndpoint().equals(this.getVerifiedAccessEndpoint()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVerifiedAccessEndpoint() == null) ? 0 : getVerifiedAccessEndpoint().hashCode());
        return hashCode;
    }

    @Override
    public ModifyVerifiedAccessEndpointResult clone() {
        try {
            return (ModifyVerifiedAccessEndpointResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
