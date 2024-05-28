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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Modifies the configuration of the specified device-based Amazon Web Services Verified Access trust provider.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ModifyVerifiedAccessTrustProviderDeviceOptions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyVerifiedAccessTrustProviderDeviceOptions implements Serializable, Cloneable {

    /**
     * <p>
     * The URL Amazon Web Services Verified Access will use to verify the authenticity of the device tokens.
     * </p>
     */
    private String publicSigningKeyUrl;

    /**
     * <p>
     * The URL Amazon Web Services Verified Access will use to verify the authenticity of the device tokens.
     * </p>
     * 
     * @param publicSigningKeyUrl
     *        The URL Amazon Web Services Verified Access will use to verify the authenticity of the device tokens.
     */

    public void setPublicSigningKeyUrl(String publicSigningKeyUrl) {
        this.publicSigningKeyUrl = publicSigningKeyUrl;
    }

    /**
     * <p>
     * The URL Amazon Web Services Verified Access will use to verify the authenticity of the device tokens.
     * </p>
     * 
     * @return The URL Amazon Web Services Verified Access will use to verify the authenticity of the device tokens.
     */

    public String getPublicSigningKeyUrl() {
        return this.publicSigningKeyUrl;
    }

    /**
     * <p>
     * The URL Amazon Web Services Verified Access will use to verify the authenticity of the device tokens.
     * </p>
     * 
     * @param publicSigningKeyUrl
     *        The URL Amazon Web Services Verified Access will use to verify the authenticity of the device tokens.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyVerifiedAccessTrustProviderDeviceOptions withPublicSigningKeyUrl(String publicSigningKeyUrl) {
        setPublicSigningKeyUrl(publicSigningKeyUrl);
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
        if (getPublicSigningKeyUrl() != null)
            sb.append("PublicSigningKeyUrl: ").append(getPublicSigningKeyUrl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyVerifiedAccessTrustProviderDeviceOptions == false)
            return false;
        ModifyVerifiedAccessTrustProviderDeviceOptions other = (ModifyVerifiedAccessTrustProviderDeviceOptions) obj;
        if (other.getPublicSigningKeyUrl() == null ^ this.getPublicSigningKeyUrl() == null)
            return false;
        if (other.getPublicSigningKeyUrl() != null && other.getPublicSigningKeyUrl().equals(this.getPublicSigningKeyUrl()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPublicSigningKeyUrl() == null) ? 0 : getPublicSigningKeyUrl().hashCode());
        return hashCode;
    }

    @Override
    public ModifyVerifiedAccessTrustProviderDeviceOptions clone() {
        try {
            return (ModifyVerifiedAccessTrustProviderDeviceOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
