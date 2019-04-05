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
package com.amazonaws.services.organizations.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/UpdatePolicy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdatePolicyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier (ID) of the policy that you want to update.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a policy ID string requires "p-" followed by
     * from 8 to 128 lower-case letters or digits.
     * </p>
     */
    private String policyId;
    /**
     * <p>
     * If provided, the new name for the policy.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> that is used to validate this parameter is a
     * string of any of the characters in the ASCII character range.
     * </p>
     */
    private String name;
    /**
     * <p>
     * If provided, the new description for the policy.
     * </p>
     */
    private String description;
    /**
     * <p>
     * If provided, the new content for the policy. The text must be correctly formatted JSON that complies with the
     * syntax for the policy's type. For more information, see <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_scp-syntax.html">Service Control
     * Policy Syntax</a> in the <i>AWS Organizations User Guide</i>.
     * </p>
     */
    private String content;

    /**
     * <p>
     * The unique identifier (ID) of the policy that you want to update.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a policy ID string requires "p-" followed by
     * from 8 to 128 lower-case letters or digits.
     * </p>
     * 
     * @param policyId
     *        The unique identifier (ID) of the policy that you want to update.</p>
     *        <p>
     *        The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a policy ID string requires "p-"
     *        followed by from 8 to 128 lower-case letters or digits.
     */

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    /**
     * <p>
     * The unique identifier (ID) of the policy that you want to update.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a policy ID string requires "p-" followed by
     * from 8 to 128 lower-case letters or digits.
     * </p>
     * 
     * @return The unique identifier (ID) of the policy that you want to update.</p>
     *         <p>
     *         The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a policy ID string requires "p-"
     *         followed by from 8 to 128 lower-case letters or digits.
     */

    public String getPolicyId() {
        return this.policyId;
    }

    /**
     * <p>
     * The unique identifier (ID) of the policy that you want to update.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a policy ID string requires "p-" followed by
     * from 8 to 128 lower-case letters or digits.
     * </p>
     * 
     * @param policyId
     *        The unique identifier (ID) of the policy that you want to update.</p>
     *        <p>
     *        The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a policy ID string requires "p-"
     *        followed by from 8 to 128 lower-case letters or digits.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePolicyRequest withPolicyId(String policyId) {
        setPolicyId(policyId);
        return this;
    }

    /**
     * <p>
     * If provided, the new name for the policy.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> that is used to validate this parameter is a
     * string of any of the characters in the ASCII character range.
     * </p>
     * 
     * @param name
     *        If provided, the new name for the policy.</p>
     *        <p>
     *        The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> that is used to validate this parameter is
     *        a string of any of the characters in the ASCII character range.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * If provided, the new name for the policy.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> that is used to validate this parameter is a
     * string of any of the characters in the ASCII character range.
     * </p>
     * 
     * @return If provided, the new name for the policy.</p>
     *         <p>
     *         The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> that is used to validate this parameter
     *         is a string of any of the characters in the ASCII character range.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * If provided, the new name for the policy.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> that is used to validate this parameter is a
     * string of any of the characters in the ASCII character range.
     * </p>
     * 
     * @param name
     *        If provided, the new name for the policy.</p>
     *        <p>
     *        The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> that is used to validate this parameter is
     *        a string of any of the characters in the ASCII character range.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePolicyRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * If provided, the new description for the policy.
     * </p>
     * 
     * @param description
     *        If provided, the new description for the policy.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * If provided, the new description for the policy.
     * </p>
     * 
     * @return If provided, the new description for the policy.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * If provided, the new description for the policy.
     * </p>
     * 
     * @param description
     *        If provided, the new description for the policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePolicyRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * If provided, the new content for the policy. The text must be correctly formatted JSON that complies with the
     * syntax for the policy's type. For more information, see <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_scp-syntax.html">Service Control
     * Policy Syntax</a> in the <i>AWS Organizations User Guide</i>.
     * </p>
     * 
     * @param content
     *        If provided, the new content for the policy. The text must be correctly formatted JSON that complies with
     *        the syntax for the policy's type. For more information, see <a
     *        href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_scp-syntax.html">Service
     *        Control Policy Syntax</a> in the <i>AWS Organizations User Guide</i>.
     */

    public void setContent(String content) {
        this.content = content;
    }

    /**
     * <p>
     * If provided, the new content for the policy. The text must be correctly formatted JSON that complies with the
     * syntax for the policy's type. For more information, see <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_scp-syntax.html">Service Control
     * Policy Syntax</a> in the <i>AWS Organizations User Guide</i>.
     * </p>
     * 
     * @return If provided, the new content for the policy. The text must be correctly formatted JSON that complies with
     *         the syntax for the policy's type. For more information, see <a
     *         href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_scp-syntax.html">Service
     *         Control Policy Syntax</a> in the <i>AWS Organizations User Guide</i>.
     */

    public String getContent() {
        return this.content;
    }

    /**
     * <p>
     * If provided, the new content for the policy. The text must be correctly formatted JSON that complies with the
     * syntax for the policy's type. For more information, see <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_scp-syntax.html">Service Control
     * Policy Syntax</a> in the <i>AWS Organizations User Guide</i>.
     * </p>
     * 
     * @param content
     *        If provided, the new content for the policy. The text must be correctly formatted JSON that complies with
     *        the syntax for the policy's type. For more information, see <a
     *        href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_scp-syntax.html">Service
     *        Control Policy Syntax</a> in the <i>AWS Organizations User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePolicyRequest withContent(String content) {
        setContent(content);
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
        if (getPolicyId() != null)
            sb.append("PolicyId: ").append(getPolicyId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getContent() != null)
            sb.append("Content: ").append(getContent());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdatePolicyRequest == false)
            return false;
        UpdatePolicyRequest other = (UpdatePolicyRequest) obj;
        if (other.getPolicyId() == null ^ this.getPolicyId() == null)
            return false;
        if (other.getPolicyId() != null && other.getPolicyId().equals(this.getPolicyId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getContent() == null ^ this.getContent() == null)
            return false;
        if (other.getContent() != null && other.getContent().equals(this.getContent()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPolicyId() == null) ? 0 : getPolicyId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getContent() == null) ? 0 : getContent().hashCode());
        return hashCode;
    }

    @Override
    public UpdatePolicyRequest clone() {
        return (UpdatePolicyRequest) super.clone();
    }

}
