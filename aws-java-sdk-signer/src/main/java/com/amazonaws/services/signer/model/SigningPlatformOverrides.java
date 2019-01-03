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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Any overrides that are applied to the signing configuration of an AWS Signer platform.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/signer-2017-08-25/SigningPlatformOverrides" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SigningPlatformOverrides implements Serializable, Cloneable, StructuredPojo {

    private SigningConfigurationOverrides signingConfiguration;

    /**
     * @param signingConfiguration
     */

    public void setSigningConfiguration(SigningConfigurationOverrides signingConfiguration) {
        this.signingConfiguration = signingConfiguration;
    }

    /**
     * @return
     */

    public SigningConfigurationOverrides getSigningConfiguration() {
        return this.signingConfiguration;
    }

    /**
     * @param signingConfiguration
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SigningPlatformOverrides withSigningConfiguration(SigningConfigurationOverrides signingConfiguration) {
        setSigningConfiguration(signingConfiguration);
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
        if (getSigningConfiguration() != null)
            sb.append("SigningConfiguration: ").append(getSigningConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SigningPlatformOverrides == false)
            return false;
        SigningPlatformOverrides other = (SigningPlatformOverrides) obj;
        if (other.getSigningConfiguration() == null ^ this.getSigningConfiguration() == null)
            return false;
        if (other.getSigningConfiguration() != null && other.getSigningConfiguration().equals(this.getSigningConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSigningConfiguration() == null) ? 0 : getSigningConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public SigningPlatformOverrides clone() {
        try {
            return (SigningPlatformOverrides) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.signer.model.transform.SigningPlatformOverridesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
