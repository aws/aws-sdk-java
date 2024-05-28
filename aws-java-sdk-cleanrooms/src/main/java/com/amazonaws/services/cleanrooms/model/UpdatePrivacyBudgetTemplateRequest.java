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
package com.amazonaws.services.cleanrooms.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/UpdatePrivacyBudgetTemplate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdatePrivacyBudgetTemplateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique identifier for one of your memberships for a collaboration. The privacy budget template is updated in
     * the collaboration that this membership belongs to. Accepts a membership ID.
     * </p>
     */
    private String membershipIdentifier;
    /**
     * <p>
     * A unique identifier for your privacy budget template that you want to update.
     * </p>
     */
    private String privacyBudgetTemplateIdentifier;
    /**
     * <p>
     * Specifies the type of the privacy budget template.
     * </p>
     */
    private String privacyBudgetType;
    /**
     * <p>
     * Specifies the epsilon and noise parameters for the privacy budget template.
     * </p>
     */
    private PrivacyBudgetTemplateUpdateParameters parameters;

    /**
     * <p>
     * A unique identifier for one of your memberships for a collaboration. The privacy budget template is updated in
     * the collaboration that this membership belongs to. Accepts a membership ID.
     * </p>
     * 
     * @param membershipIdentifier
     *        A unique identifier for one of your memberships for a collaboration. The privacy budget template is
     *        updated in the collaboration that this membership belongs to. Accepts a membership ID.
     */

    public void setMembershipIdentifier(String membershipIdentifier) {
        this.membershipIdentifier = membershipIdentifier;
    }

    /**
     * <p>
     * A unique identifier for one of your memberships for a collaboration. The privacy budget template is updated in
     * the collaboration that this membership belongs to. Accepts a membership ID.
     * </p>
     * 
     * @return A unique identifier for one of your memberships for a collaboration. The privacy budget template is
     *         updated in the collaboration that this membership belongs to. Accepts a membership ID.
     */

    public String getMembershipIdentifier() {
        return this.membershipIdentifier;
    }

    /**
     * <p>
     * A unique identifier for one of your memberships for a collaboration. The privacy budget template is updated in
     * the collaboration that this membership belongs to. Accepts a membership ID.
     * </p>
     * 
     * @param membershipIdentifier
     *        A unique identifier for one of your memberships for a collaboration. The privacy budget template is
     *        updated in the collaboration that this membership belongs to. Accepts a membership ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePrivacyBudgetTemplateRequest withMembershipIdentifier(String membershipIdentifier) {
        setMembershipIdentifier(membershipIdentifier);
        return this;
    }

    /**
     * <p>
     * A unique identifier for your privacy budget template that you want to update.
     * </p>
     * 
     * @param privacyBudgetTemplateIdentifier
     *        A unique identifier for your privacy budget template that you want to update.
     */

    public void setPrivacyBudgetTemplateIdentifier(String privacyBudgetTemplateIdentifier) {
        this.privacyBudgetTemplateIdentifier = privacyBudgetTemplateIdentifier;
    }

    /**
     * <p>
     * A unique identifier for your privacy budget template that you want to update.
     * </p>
     * 
     * @return A unique identifier for your privacy budget template that you want to update.
     */

    public String getPrivacyBudgetTemplateIdentifier() {
        return this.privacyBudgetTemplateIdentifier;
    }

    /**
     * <p>
     * A unique identifier for your privacy budget template that you want to update.
     * </p>
     * 
     * @param privacyBudgetTemplateIdentifier
     *        A unique identifier for your privacy budget template that you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePrivacyBudgetTemplateRequest withPrivacyBudgetTemplateIdentifier(String privacyBudgetTemplateIdentifier) {
        setPrivacyBudgetTemplateIdentifier(privacyBudgetTemplateIdentifier);
        return this;
    }

    /**
     * <p>
     * Specifies the type of the privacy budget template.
     * </p>
     * 
     * @param privacyBudgetType
     *        Specifies the type of the privacy budget template.
     * @see PrivacyBudgetType
     */

    public void setPrivacyBudgetType(String privacyBudgetType) {
        this.privacyBudgetType = privacyBudgetType;
    }

    /**
     * <p>
     * Specifies the type of the privacy budget template.
     * </p>
     * 
     * @return Specifies the type of the privacy budget template.
     * @see PrivacyBudgetType
     */

    public String getPrivacyBudgetType() {
        return this.privacyBudgetType;
    }

    /**
     * <p>
     * Specifies the type of the privacy budget template.
     * </p>
     * 
     * @param privacyBudgetType
     *        Specifies the type of the privacy budget template.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PrivacyBudgetType
     */

    public UpdatePrivacyBudgetTemplateRequest withPrivacyBudgetType(String privacyBudgetType) {
        setPrivacyBudgetType(privacyBudgetType);
        return this;
    }

    /**
     * <p>
     * Specifies the type of the privacy budget template.
     * </p>
     * 
     * @param privacyBudgetType
     *        Specifies the type of the privacy budget template.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PrivacyBudgetType
     */

    public UpdatePrivacyBudgetTemplateRequest withPrivacyBudgetType(PrivacyBudgetType privacyBudgetType) {
        this.privacyBudgetType = privacyBudgetType.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the epsilon and noise parameters for the privacy budget template.
     * </p>
     * 
     * @param parameters
     *        Specifies the epsilon and noise parameters for the privacy budget template.
     */

    public void setParameters(PrivacyBudgetTemplateUpdateParameters parameters) {
        this.parameters = parameters;
    }

    /**
     * <p>
     * Specifies the epsilon and noise parameters for the privacy budget template.
     * </p>
     * 
     * @return Specifies the epsilon and noise parameters for the privacy budget template.
     */

    public PrivacyBudgetTemplateUpdateParameters getParameters() {
        return this.parameters;
    }

    /**
     * <p>
     * Specifies the epsilon and noise parameters for the privacy budget template.
     * </p>
     * 
     * @param parameters
     *        Specifies the epsilon and noise parameters for the privacy budget template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePrivacyBudgetTemplateRequest withParameters(PrivacyBudgetTemplateUpdateParameters parameters) {
        setParameters(parameters);
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
        if (getMembershipIdentifier() != null)
            sb.append("MembershipIdentifier: ").append(getMembershipIdentifier()).append(",");
        if (getPrivacyBudgetTemplateIdentifier() != null)
            sb.append("PrivacyBudgetTemplateIdentifier: ").append(getPrivacyBudgetTemplateIdentifier()).append(",");
        if (getPrivacyBudgetType() != null)
            sb.append("PrivacyBudgetType: ").append(getPrivacyBudgetType()).append(",");
        if (getParameters() != null)
            sb.append("Parameters: ").append(getParameters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdatePrivacyBudgetTemplateRequest == false)
            return false;
        UpdatePrivacyBudgetTemplateRequest other = (UpdatePrivacyBudgetTemplateRequest) obj;
        if (other.getMembershipIdentifier() == null ^ this.getMembershipIdentifier() == null)
            return false;
        if (other.getMembershipIdentifier() != null && other.getMembershipIdentifier().equals(this.getMembershipIdentifier()) == false)
            return false;
        if (other.getPrivacyBudgetTemplateIdentifier() == null ^ this.getPrivacyBudgetTemplateIdentifier() == null)
            return false;
        if (other.getPrivacyBudgetTemplateIdentifier() != null
                && other.getPrivacyBudgetTemplateIdentifier().equals(this.getPrivacyBudgetTemplateIdentifier()) == false)
            return false;
        if (other.getPrivacyBudgetType() == null ^ this.getPrivacyBudgetType() == null)
            return false;
        if (other.getPrivacyBudgetType() != null && other.getPrivacyBudgetType().equals(this.getPrivacyBudgetType()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMembershipIdentifier() == null) ? 0 : getMembershipIdentifier().hashCode());
        hashCode = prime * hashCode + ((getPrivacyBudgetTemplateIdentifier() == null) ? 0 : getPrivacyBudgetTemplateIdentifier().hashCode());
        hashCode = prime * hashCode + ((getPrivacyBudgetType() == null) ? 0 : getPrivacyBudgetType().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        return hashCode;
    }

    @Override
    public UpdatePrivacyBudgetTemplateRequest clone() {
        return (UpdatePrivacyBudgetTemplateRequest) super.clone();
    }

}
