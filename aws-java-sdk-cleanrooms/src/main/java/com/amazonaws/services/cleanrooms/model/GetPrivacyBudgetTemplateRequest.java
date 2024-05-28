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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/GetPrivacyBudgetTemplate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetPrivacyBudgetTemplateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique identifier for one of your memberships for a collaboration. The privacy budget template is retrieved
     * from the collaboration that this membership belongs to. Accepts a membership ID.
     * </p>
     */
    private String membershipIdentifier;
    /**
     * <p>
     * A unique identifier for your privacy budget template.
     * </p>
     */
    private String privacyBudgetTemplateIdentifier;

    /**
     * <p>
     * A unique identifier for one of your memberships for a collaboration. The privacy budget template is retrieved
     * from the collaboration that this membership belongs to. Accepts a membership ID.
     * </p>
     * 
     * @param membershipIdentifier
     *        A unique identifier for one of your memberships for a collaboration. The privacy budget template is
     *        retrieved from the collaboration that this membership belongs to. Accepts a membership ID.
     */

    public void setMembershipIdentifier(String membershipIdentifier) {
        this.membershipIdentifier = membershipIdentifier;
    }

    /**
     * <p>
     * A unique identifier for one of your memberships for a collaboration. The privacy budget template is retrieved
     * from the collaboration that this membership belongs to. Accepts a membership ID.
     * </p>
     * 
     * @return A unique identifier for one of your memberships for a collaboration. The privacy budget template is
     *         retrieved from the collaboration that this membership belongs to. Accepts a membership ID.
     */

    public String getMembershipIdentifier() {
        return this.membershipIdentifier;
    }

    /**
     * <p>
     * A unique identifier for one of your memberships for a collaboration. The privacy budget template is retrieved
     * from the collaboration that this membership belongs to. Accepts a membership ID.
     * </p>
     * 
     * @param membershipIdentifier
     *        A unique identifier for one of your memberships for a collaboration. The privacy budget template is
     *        retrieved from the collaboration that this membership belongs to. Accepts a membership ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPrivacyBudgetTemplateRequest withMembershipIdentifier(String membershipIdentifier) {
        setMembershipIdentifier(membershipIdentifier);
        return this;
    }

    /**
     * <p>
     * A unique identifier for your privacy budget template.
     * </p>
     * 
     * @param privacyBudgetTemplateIdentifier
     *        A unique identifier for your privacy budget template.
     */

    public void setPrivacyBudgetTemplateIdentifier(String privacyBudgetTemplateIdentifier) {
        this.privacyBudgetTemplateIdentifier = privacyBudgetTemplateIdentifier;
    }

    /**
     * <p>
     * A unique identifier for your privacy budget template.
     * </p>
     * 
     * @return A unique identifier for your privacy budget template.
     */

    public String getPrivacyBudgetTemplateIdentifier() {
        return this.privacyBudgetTemplateIdentifier;
    }

    /**
     * <p>
     * A unique identifier for your privacy budget template.
     * </p>
     * 
     * @param privacyBudgetTemplateIdentifier
     *        A unique identifier for your privacy budget template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPrivacyBudgetTemplateRequest withPrivacyBudgetTemplateIdentifier(String privacyBudgetTemplateIdentifier) {
        setPrivacyBudgetTemplateIdentifier(privacyBudgetTemplateIdentifier);
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
            sb.append("PrivacyBudgetTemplateIdentifier: ").append(getPrivacyBudgetTemplateIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetPrivacyBudgetTemplateRequest == false)
            return false;
        GetPrivacyBudgetTemplateRequest other = (GetPrivacyBudgetTemplateRequest) obj;
        if (other.getMembershipIdentifier() == null ^ this.getMembershipIdentifier() == null)
            return false;
        if (other.getMembershipIdentifier() != null && other.getMembershipIdentifier().equals(this.getMembershipIdentifier()) == false)
            return false;
        if (other.getPrivacyBudgetTemplateIdentifier() == null ^ this.getPrivacyBudgetTemplateIdentifier() == null)
            return false;
        if (other.getPrivacyBudgetTemplateIdentifier() != null
                && other.getPrivacyBudgetTemplateIdentifier().equals(this.getPrivacyBudgetTemplateIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMembershipIdentifier() == null) ? 0 : getMembershipIdentifier().hashCode());
        hashCode = prime * hashCode + ((getPrivacyBudgetTemplateIdentifier() == null) ? 0 : getPrivacyBudgetTemplateIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public GetPrivacyBudgetTemplateRequest clone() {
        return (GetPrivacyBudgetTemplateRequest) super.clone();
    }

}
