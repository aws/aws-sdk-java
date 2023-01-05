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
package com.amazonaws.services.workmail.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/PutInboundDmarcSettings" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutInboundDmarcSettingsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the organization that you are applying the DMARC policy to.
     * </p>
     */
    private String organizationId;
    /**
     * <p>
     * Enforces or suspends a policy after it's applied.
     * </p>
     */
    private Boolean enforced;

    /**
     * <p>
     * The ID of the organization that you are applying the DMARC policy to.
     * </p>
     * 
     * @param organizationId
     *        The ID of the organization that you are applying the DMARC policy to.
     */

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    /**
     * <p>
     * The ID of the organization that you are applying the DMARC policy to.
     * </p>
     * 
     * @return The ID of the organization that you are applying the DMARC policy to.
     */

    public String getOrganizationId() {
        return this.organizationId;
    }

    /**
     * <p>
     * The ID of the organization that you are applying the DMARC policy to.
     * </p>
     * 
     * @param organizationId
     *        The ID of the organization that you are applying the DMARC policy to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutInboundDmarcSettingsRequest withOrganizationId(String organizationId) {
        setOrganizationId(organizationId);
        return this;
    }

    /**
     * <p>
     * Enforces or suspends a policy after it's applied.
     * </p>
     * 
     * @param enforced
     *        Enforces or suspends a policy after it's applied.
     */

    public void setEnforced(Boolean enforced) {
        this.enforced = enforced;
    }

    /**
     * <p>
     * Enforces or suspends a policy after it's applied.
     * </p>
     * 
     * @return Enforces or suspends a policy after it's applied.
     */

    public Boolean getEnforced() {
        return this.enforced;
    }

    /**
     * <p>
     * Enforces or suspends a policy after it's applied.
     * </p>
     * 
     * @param enforced
     *        Enforces or suspends a policy after it's applied.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutInboundDmarcSettingsRequest withEnforced(Boolean enforced) {
        setEnforced(enforced);
        return this;
    }

    /**
     * <p>
     * Enforces or suspends a policy after it's applied.
     * </p>
     * 
     * @return Enforces or suspends a policy after it's applied.
     */

    public Boolean isEnforced() {
        return this.enforced;
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
        if (getOrganizationId() != null)
            sb.append("OrganizationId: ").append(getOrganizationId()).append(",");
        if (getEnforced() != null)
            sb.append("Enforced: ").append(getEnforced());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutInboundDmarcSettingsRequest == false)
            return false;
        PutInboundDmarcSettingsRequest other = (PutInboundDmarcSettingsRequest) obj;
        if (other.getOrganizationId() == null ^ this.getOrganizationId() == null)
            return false;
        if (other.getOrganizationId() != null && other.getOrganizationId().equals(this.getOrganizationId()) == false)
            return false;
        if (other.getEnforced() == null ^ this.getEnforced() == null)
            return false;
        if (other.getEnforced() != null && other.getEnforced().equals(this.getEnforced()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOrganizationId() == null) ? 0 : getOrganizationId().hashCode());
        hashCode = prime * hashCode + ((getEnforced() == null) ? 0 : getEnforced().hashCode());
        return hashCode;
    }

    @Override
    public PutInboundDmarcSettingsRequest clone() {
        return (PutInboundDmarcSettingsRequest) super.clone();
    }

}
