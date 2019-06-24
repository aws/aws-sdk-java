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
package com.amazonaws.services.servicequotas.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/service-quotas-2019-06-24/GetAssociationForServiceQuotaTemplate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetAssociationForServiceQuotaTemplateResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * Specifies whether the template is <code>ASSOCIATED</code> or <code>DISASSOCIATED</code>. If the template is
     * <code>ASSOCIATED</code>, then it requests service quota increases for all new accounts created in your
     * organization.
     * </p>
     */
    private String serviceQuotaTemplateAssociationStatus;

    /**
     * <p>
     * Specifies whether the template is <code>ASSOCIATED</code> or <code>DISASSOCIATED</code>. If the template is
     * <code>ASSOCIATED</code>, then it requests service quota increases for all new accounts created in your
     * organization.
     * </p>
     * 
     * @param serviceQuotaTemplateAssociationStatus
     *        Specifies whether the template is <code>ASSOCIATED</code> or <code>DISASSOCIATED</code>. If the template
     *        is <code>ASSOCIATED</code>, then it requests service quota increases for all new accounts created in your
     *        organization.
     * @see ServiceQuotaTemplateAssociationStatus
     */

    public void setServiceQuotaTemplateAssociationStatus(String serviceQuotaTemplateAssociationStatus) {
        this.serviceQuotaTemplateAssociationStatus = serviceQuotaTemplateAssociationStatus;
    }

    /**
     * <p>
     * Specifies whether the template is <code>ASSOCIATED</code> or <code>DISASSOCIATED</code>. If the template is
     * <code>ASSOCIATED</code>, then it requests service quota increases for all new accounts created in your
     * organization.
     * </p>
     * 
     * @return Specifies whether the template is <code>ASSOCIATED</code> or <code>DISASSOCIATED</code>. If the template
     *         is <code>ASSOCIATED</code>, then it requests service quota increases for all new accounts created in your
     *         organization.
     * @see ServiceQuotaTemplateAssociationStatus
     */

    public String getServiceQuotaTemplateAssociationStatus() {
        return this.serviceQuotaTemplateAssociationStatus;
    }

    /**
     * <p>
     * Specifies whether the template is <code>ASSOCIATED</code> or <code>DISASSOCIATED</code>. If the template is
     * <code>ASSOCIATED</code>, then it requests service quota increases for all new accounts created in your
     * organization.
     * </p>
     * 
     * @param serviceQuotaTemplateAssociationStatus
     *        Specifies whether the template is <code>ASSOCIATED</code> or <code>DISASSOCIATED</code>. If the template
     *        is <code>ASSOCIATED</code>, then it requests service quota increases for all new accounts created in your
     *        organization.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceQuotaTemplateAssociationStatus
     */

    public GetAssociationForServiceQuotaTemplateResult withServiceQuotaTemplateAssociationStatus(String serviceQuotaTemplateAssociationStatus) {
        setServiceQuotaTemplateAssociationStatus(serviceQuotaTemplateAssociationStatus);
        return this;
    }

    /**
     * <p>
     * Specifies whether the template is <code>ASSOCIATED</code> or <code>DISASSOCIATED</code>. If the template is
     * <code>ASSOCIATED</code>, then it requests service quota increases for all new accounts created in your
     * organization.
     * </p>
     * 
     * @param serviceQuotaTemplateAssociationStatus
     *        Specifies whether the template is <code>ASSOCIATED</code> or <code>DISASSOCIATED</code>. If the template
     *        is <code>ASSOCIATED</code>, then it requests service quota increases for all new accounts created in your
     *        organization.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceQuotaTemplateAssociationStatus
     */

    public GetAssociationForServiceQuotaTemplateResult withServiceQuotaTemplateAssociationStatus(
            ServiceQuotaTemplateAssociationStatus serviceQuotaTemplateAssociationStatus) {
        this.serviceQuotaTemplateAssociationStatus = serviceQuotaTemplateAssociationStatus.toString();
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
        if (getServiceQuotaTemplateAssociationStatus() != null)
            sb.append("ServiceQuotaTemplateAssociationStatus: ").append(getServiceQuotaTemplateAssociationStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAssociationForServiceQuotaTemplateResult == false)
            return false;
        GetAssociationForServiceQuotaTemplateResult other = (GetAssociationForServiceQuotaTemplateResult) obj;
        if (other.getServiceQuotaTemplateAssociationStatus() == null ^ this.getServiceQuotaTemplateAssociationStatus() == null)
            return false;
        if (other.getServiceQuotaTemplateAssociationStatus() != null
                && other.getServiceQuotaTemplateAssociationStatus().equals(this.getServiceQuotaTemplateAssociationStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServiceQuotaTemplateAssociationStatus() == null) ? 0 : getServiceQuotaTemplateAssociationStatus().hashCode());
        return hashCode;
    }

    @Override
    public GetAssociationForServiceQuotaTemplateResult clone() {
        try {
            return (GetAssociationForServiceQuotaTemplateResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
