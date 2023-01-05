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
public class ModifyVerifiedAccessTrustProviderResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The ID of the Amazon Web Services Verified Access trust provider.
     * </p>
     */
    private VerifiedAccessTrustProvider verifiedAccessTrustProvider;

    /**
     * <p>
     * The ID of the Amazon Web Services Verified Access trust provider.
     * </p>
     * 
     * @param verifiedAccessTrustProvider
     *        The ID of the Amazon Web Services Verified Access trust provider.
     */

    public void setVerifiedAccessTrustProvider(VerifiedAccessTrustProvider verifiedAccessTrustProvider) {
        this.verifiedAccessTrustProvider = verifiedAccessTrustProvider;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services Verified Access trust provider.
     * </p>
     * 
     * @return The ID of the Amazon Web Services Verified Access trust provider.
     */

    public VerifiedAccessTrustProvider getVerifiedAccessTrustProvider() {
        return this.verifiedAccessTrustProvider;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services Verified Access trust provider.
     * </p>
     * 
     * @param verifiedAccessTrustProvider
     *        The ID of the Amazon Web Services Verified Access trust provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyVerifiedAccessTrustProviderResult withVerifiedAccessTrustProvider(VerifiedAccessTrustProvider verifiedAccessTrustProvider) {
        setVerifiedAccessTrustProvider(verifiedAccessTrustProvider);
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
        if (getVerifiedAccessTrustProvider() != null)
            sb.append("VerifiedAccessTrustProvider: ").append(getVerifiedAccessTrustProvider());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyVerifiedAccessTrustProviderResult == false)
            return false;
        ModifyVerifiedAccessTrustProviderResult other = (ModifyVerifiedAccessTrustProviderResult) obj;
        if (other.getVerifiedAccessTrustProvider() == null ^ this.getVerifiedAccessTrustProvider() == null)
            return false;
        if (other.getVerifiedAccessTrustProvider() != null && other.getVerifiedAccessTrustProvider().equals(this.getVerifiedAccessTrustProvider()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVerifiedAccessTrustProvider() == null) ? 0 : getVerifiedAccessTrustProvider().hashCode());
        return hashCode;
    }

    @Override
    public ModifyVerifiedAccessTrustProviderResult clone() {
        try {
            return (ModifyVerifiedAccessTrustProviderResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
