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
package com.amazonaws.services.worklink.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/worklink-2018-09-25/UpdateIdentityProviderConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateIdentityProviderConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the fleet.
     * </p>
     */
    private String fleetArn;
    /**
     * <p>
     * The type of identity provider.
     * </p>
     */
    private String identityProviderType;
    /**
     * <p>
     * The SAML metadata document provided by the customer’s identity provider. The existing
     * IdentityProviderSamlMetadata is unset if null is passed.
     * </p>
     */
    private String identityProviderSamlMetadata;

    /**
     * <p>
     * The ARN of the fleet.
     * </p>
     * 
     * @param fleetArn
     *        The ARN of the fleet.
     */

    public void setFleetArn(String fleetArn) {
        this.fleetArn = fleetArn;
    }

    /**
     * <p>
     * The ARN of the fleet.
     * </p>
     * 
     * @return The ARN of the fleet.
     */

    public String getFleetArn() {
        return this.fleetArn;
    }

    /**
     * <p>
     * The ARN of the fleet.
     * </p>
     * 
     * @param fleetArn
     *        The ARN of the fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateIdentityProviderConfigurationRequest withFleetArn(String fleetArn) {
        setFleetArn(fleetArn);
        return this;
    }

    /**
     * <p>
     * The type of identity provider.
     * </p>
     * 
     * @param identityProviderType
     *        The type of identity provider.
     * @see IdentityProviderType
     */

    public void setIdentityProviderType(String identityProviderType) {
        this.identityProviderType = identityProviderType;
    }

    /**
     * <p>
     * The type of identity provider.
     * </p>
     * 
     * @return The type of identity provider.
     * @see IdentityProviderType
     */

    public String getIdentityProviderType() {
        return this.identityProviderType;
    }

    /**
     * <p>
     * The type of identity provider.
     * </p>
     * 
     * @param identityProviderType
     *        The type of identity provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IdentityProviderType
     */

    public UpdateIdentityProviderConfigurationRequest withIdentityProviderType(String identityProviderType) {
        setIdentityProviderType(identityProviderType);
        return this;
    }

    /**
     * <p>
     * The type of identity provider.
     * </p>
     * 
     * @param identityProviderType
     *        The type of identity provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IdentityProviderType
     */

    public UpdateIdentityProviderConfigurationRequest withIdentityProviderType(IdentityProviderType identityProviderType) {
        this.identityProviderType = identityProviderType.toString();
        return this;
    }

    /**
     * <p>
     * The SAML metadata document provided by the customer’s identity provider. The existing
     * IdentityProviderSamlMetadata is unset if null is passed.
     * </p>
     * 
     * @param identityProviderSamlMetadata
     *        The SAML metadata document provided by the customer’s identity provider. The existing
     *        IdentityProviderSamlMetadata is unset if null is passed.
     */

    public void setIdentityProviderSamlMetadata(String identityProviderSamlMetadata) {
        this.identityProviderSamlMetadata = identityProviderSamlMetadata;
    }

    /**
     * <p>
     * The SAML metadata document provided by the customer’s identity provider. The existing
     * IdentityProviderSamlMetadata is unset if null is passed.
     * </p>
     * 
     * @return The SAML metadata document provided by the customer’s identity provider. The existing
     *         IdentityProviderSamlMetadata is unset if null is passed.
     */

    public String getIdentityProviderSamlMetadata() {
        return this.identityProviderSamlMetadata;
    }

    /**
     * <p>
     * The SAML metadata document provided by the customer’s identity provider. The existing
     * IdentityProviderSamlMetadata is unset if null is passed.
     * </p>
     * 
     * @param identityProviderSamlMetadata
     *        The SAML metadata document provided by the customer’s identity provider. The existing
     *        IdentityProviderSamlMetadata is unset if null is passed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateIdentityProviderConfigurationRequest withIdentityProviderSamlMetadata(String identityProviderSamlMetadata) {
        setIdentityProviderSamlMetadata(identityProviderSamlMetadata);
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
        if (getFleetArn() != null)
            sb.append("FleetArn: ").append(getFleetArn()).append(",");
        if (getIdentityProviderType() != null)
            sb.append("IdentityProviderType: ").append(getIdentityProviderType()).append(",");
        if (getIdentityProviderSamlMetadata() != null)
            sb.append("IdentityProviderSamlMetadata: ").append(getIdentityProviderSamlMetadata());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateIdentityProviderConfigurationRequest == false)
            return false;
        UpdateIdentityProviderConfigurationRequest other = (UpdateIdentityProviderConfigurationRequest) obj;
        if (other.getFleetArn() == null ^ this.getFleetArn() == null)
            return false;
        if (other.getFleetArn() != null && other.getFleetArn().equals(this.getFleetArn()) == false)
            return false;
        if (other.getIdentityProviderType() == null ^ this.getIdentityProviderType() == null)
            return false;
        if (other.getIdentityProviderType() != null && other.getIdentityProviderType().equals(this.getIdentityProviderType()) == false)
            return false;
        if (other.getIdentityProviderSamlMetadata() == null ^ this.getIdentityProviderSamlMetadata() == null)
            return false;
        if (other.getIdentityProviderSamlMetadata() != null && other.getIdentityProviderSamlMetadata().equals(this.getIdentityProviderSamlMetadata()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFleetArn() == null) ? 0 : getFleetArn().hashCode());
        hashCode = prime * hashCode + ((getIdentityProviderType() == null) ? 0 : getIdentityProviderType().hashCode());
        hashCode = prime * hashCode + ((getIdentityProviderSamlMetadata() == null) ? 0 : getIdentityProviderSamlMetadata().hashCode());
        return hashCode;
    }

    @Override
    public UpdateIdentityProviderConfigurationRequest clone() {
        return (UpdateIdentityProviderConfigurationRequest) super.clone();
    }

}
