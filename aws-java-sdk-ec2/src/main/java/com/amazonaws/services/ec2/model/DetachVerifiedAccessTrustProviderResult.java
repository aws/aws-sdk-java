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
public class DetachVerifiedAccessTrustProviderResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The ID of the Amazon Web Services Verified Access trust provider.
     * </p>
     */
    private VerifiedAccessTrustProvider verifiedAccessTrustProvider;
    /**
     * <p>
     * The ID of the Amazon Web Services Verified Access instance.
     * </p>
     */
    private VerifiedAccessInstance verifiedAccessInstance;

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

    public DetachVerifiedAccessTrustProviderResult withVerifiedAccessTrustProvider(VerifiedAccessTrustProvider verifiedAccessTrustProvider) {
        setVerifiedAccessTrustProvider(verifiedAccessTrustProvider);
        return this;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services Verified Access instance.
     * </p>
     * 
     * @param verifiedAccessInstance
     *        The ID of the Amazon Web Services Verified Access instance.
     */

    public void setVerifiedAccessInstance(VerifiedAccessInstance verifiedAccessInstance) {
        this.verifiedAccessInstance = verifiedAccessInstance;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services Verified Access instance.
     * </p>
     * 
     * @return The ID of the Amazon Web Services Verified Access instance.
     */

    public VerifiedAccessInstance getVerifiedAccessInstance() {
        return this.verifiedAccessInstance;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services Verified Access instance.
     * </p>
     * 
     * @param verifiedAccessInstance
     *        The ID of the Amazon Web Services Verified Access instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetachVerifiedAccessTrustProviderResult withVerifiedAccessInstance(VerifiedAccessInstance verifiedAccessInstance) {
        setVerifiedAccessInstance(verifiedAccessInstance);
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
            sb.append("VerifiedAccessTrustProvider: ").append(getVerifiedAccessTrustProvider()).append(",");
        if (getVerifiedAccessInstance() != null)
            sb.append("VerifiedAccessInstance: ").append(getVerifiedAccessInstance());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DetachVerifiedAccessTrustProviderResult == false)
            return false;
        DetachVerifiedAccessTrustProviderResult other = (DetachVerifiedAccessTrustProviderResult) obj;
        if (other.getVerifiedAccessTrustProvider() == null ^ this.getVerifiedAccessTrustProvider() == null)
            return false;
        if (other.getVerifiedAccessTrustProvider() != null && other.getVerifiedAccessTrustProvider().equals(this.getVerifiedAccessTrustProvider()) == false)
            return false;
        if (other.getVerifiedAccessInstance() == null ^ this.getVerifiedAccessInstance() == null)
            return false;
        if (other.getVerifiedAccessInstance() != null && other.getVerifiedAccessInstance().equals(this.getVerifiedAccessInstance()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVerifiedAccessTrustProvider() == null) ? 0 : getVerifiedAccessTrustProvider().hashCode());
        hashCode = prime * hashCode + ((getVerifiedAccessInstance() == null) ? 0 : getVerifiedAccessInstance().hashCode());
        return hashCode;
    }

    @Override
    public DetachVerifiedAccessTrustProviderResult clone() {
        try {
            return (DetachVerifiedAccessTrustProviderResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
