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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains details about a root. A root is a top-level parent node in the hierarchy of an organization that can contain
 * organizational units (OUs) and accounts. Every root contains every AWS account in the organization. Each root enables
 * the accounts to be organized in a different way and to have different policy types enabled for use in that root.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/Root" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Root implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier (ID) for the root.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a root ID string requires "r-" followed by
     * from 4 to 32 lower-case letters or digits.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the root.
     * </p>
     * <p>
     * For more information about ARNs in Organizations, see <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_permissions.html#orgs-permissions-arns">ARN
     * Formats Supported by Organizations</a> in the <i>AWS Organizations User Guide</i>.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The friendly name of the root.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> that is used to validate this parameter is a
     * string of any of the characters in the ASCII character range.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The types of policies that are currently enabled for the root and therefore can be attached to the root or to its
     * OUs or accounts.
     * </p>
     * <note>
     * <p>
     * Even if a policy type is shown as available in the organization, you can separately enable and disable them at
     * the root level by using <a>EnablePolicyType</a> and <a>DisablePolicyType</a>. Use <a>DescribeOrganization</a> to
     * see the availability of the policy types in that organization.
     * </p>
     * </note>
     */
    private java.util.List<PolicyTypeSummary> policyTypes;

    /**
     * <p>
     * The unique identifier (ID) for the root.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a root ID string requires "r-" followed by
     * from 4 to 32 lower-case letters or digits.
     * </p>
     * 
     * @param id
     *        The unique identifier (ID) for the root.</p>
     *        <p>
     *        The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a root ID string requires "r-"
     *        followed by from 4 to 32 lower-case letters or digits.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier (ID) for the root.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a root ID string requires "r-" followed by
     * from 4 to 32 lower-case letters or digits.
     * </p>
     * 
     * @return The unique identifier (ID) for the root.</p>
     *         <p>
     *         The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a root ID string requires "r-"
     *         followed by from 4 to 32 lower-case letters or digits.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique identifier (ID) for the root.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a root ID string requires "r-" followed by
     * from 4 to 32 lower-case letters or digits.
     * </p>
     * 
     * @param id
     *        The unique identifier (ID) for the root.</p>
     *        <p>
     *        The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a root ID string requires "r-"
     *        followed by from 4 to 32 lower-case letters or digits.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Root withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the root.
     * </p>
     * <p>
     * For more information about ARNs in Organizations, see <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_permissions.html#orgs-permissions-arns">ARN
     * Formats Supported by Organizations</a> in the <i>AWS Organizations User Guide</i>.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the root.</p>
     *        <p>
     *        For more information about ARNs in Organizations, see <a href=
     *        "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_permissions.html#orgs-permissions-arns"
     *        >ARN Formats Supported by Organizations</a> in the <i>AWS Organizations User Guide</i>.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the root.
     * </p>
     * <p>
     * For more information about ARNs in Organizations, see <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_permissions.html#orgs-permissions-arns">ARN
     * Formats Supported by Organizations</a> in the <i>AWS Organizations User Guide</i>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the root.</p>
     *         <p>
     *         For more information about ARNs in Organizations, see <a href=
     *         "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_permissions.html#orgs-permissions-arns"
     *         >ARN Formats Supported by Organizations</a> in the <i>AWS Organizations User Guide</i>.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the root.
     * </p>
     * <p>
     * For more information about ARNs in Organizations, see <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_permissions.html#orgs-permissions-arns">ARN
     * Formats Supported by Organizations</a> in the <i>AWS Organizations User Guide</i>.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the root.</p>
     *        <p>
     *        For more information about ARNs in Organizations, see <a href=
     *        "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_permissions.html#orgs-permissions-arns"
     *        >ARN Formats Supported by Organizations</a> in the <i>AWS Organizations User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Root withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The friendly name of the root.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> that is used to validate this parameter is a
     * string of any of the characters in the ASCII character range.
     * </p>
     * 
     * @param name
     *        The friendly name of the root.</p>
     *        <p>
     *        The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> that is used to validate this parameter is
     *        a string of any of the characters in the ASCII character range.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The friendly name of the root.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> that is used to validate this parameter is a
     * string of any of the characters in the ASCII character range.
     * </p>
     * 
     * @return The friendly name of the root.</p>
     *         <p>
     *         The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> that is used to validate this parameter
     *         is a string of any of the characters in the ASCII character range.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The friendly name of the root.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> that is used to validate this parameter is a
     * string of any of the characters in the ASCII character range.
     * </p>
     * 
     * @param name
     *        The friendly name of the root.</p>
     *        <p>
     *        The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> that is used to validate this parameter is
     *        a string of any of the characters in the ASCII character range.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Root withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The types of policies that are currently enabled for the root and therefore can be attached to the root or to its
     * OUs or accounts.
     * </p>
     * <note>
     * <p>
     * Even if a policy type is shown as available in the organization, you can separately enable and disable them at
     * the root level by using <a>EnablePolicyType</a> and <a>DisablePolicyType</a>. Use <a>DescribeOrganization</a> to
     * see the availability of the policy types in that organization.
     * </p>
     * </note>
     * 
     * @return The types of policies that are currently enabled for the root and therefore can be attached to the root
     *         or to its OUs or accounts.</p> <note>
     *         <p>
     *         Even if a policy type is shown as available in the organization, you can separately enable and disable
     *         them at the root level by using <a>EnablePolicyType</a> and <a>DisablePolicyType</a>. Use
     *         <a>DescribeOrganization</a> to see the availability of the policy types in that organization.
     *         </p>
     */

    public java.util.List<PolicyTypeSummary> getPolicyTypes() {
        return policyTypes;
    }

    /**
     * <p>
     * The types of policies that are currently enabled for the root and therefore can be attached to the root or to its
     * OUs or accounts.
     * </p>
     * <note>
     * <p>
     * Even if a policy type is shown as available in the organization, you can separately enable and disable them at
     * the root level by using <a>EnablePolicyType</a> and <a>DisablePolicyType</a>. Use <a>DescribeOrganization</a> to
     * see the availability of the policy types in that organization.
     * </p>
     * </note>
     * 
     * @param policyTypes
     *        The types of policies that are currently enabled for the root and therefore can be attached to the root or
     *        to its OUs or accounts.</p> <note>
     *        <p>
     *        Even if a policy type is shown as available in the organization, you can separately enable and disable
     *        them at the root level by using <a>EnablePolicyType</a> and <a>DisablePolicyType</a>. Use
     *        <a>DescribeOrganization</a> to see the availability of the policy types in that organization.
     *        </p>
     */

    public void setPolicyTypes(java.util.Collection<PolicyTypeSummary> policyTypes) {
        if (policyTypes == null) {
            this.policyTypes = null;
            return;
        }

        this.policyTypes = new java.util.ArrayList<PolicyTypeSummary>(policyTypes);
    }

    /**
     * <p>
     * The types of policies that are currently enabled for the root and therefore can be attached to the root or to its
     * OUs or accounts.
     * </p>
     * <note>
     * <p>
     * Even if a policy type is shown as available in the organization, you can separately enable and disable them at
     * the root level by using <a>EnablePolicyType</a> and <a>DisablePolicyType</a>. Use <a>DescribeOrganization</a> to
     * see the availability of the policy types in that organization.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPolicyTypes(java.util.Collection)} or {@link #withPolicyTypes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param policyTypes
     *        The types of policies that are currently enabled for the root and therefore can be attached to the root or
     *        to its OUs or accounts.</p> <note>
     *        <p>
     *        Even if a policy type is shown as available in the organization, you can separately enable and disable
     *        them at the root level by using <a>EnablePolicyType</a> and <a>DisablePolicyType</a>. Use
     *        <a>DescribeOrganization</a> to see the availability of the policy types in that organization.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Root withPolicyTypes(PolicyTypeSummary... policyTypes) {
        if (this.policyTypes == null) {
            setPolicyTypes(new java.util.ArrayList<PolicyTypeSummary>(policyTypes.length));
        }
        for (PolicyTypeSummary ele : policyTypes) {
            this.policyTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The types of policies that are currently enabled for the root and therefore can be attached to the root or to its
     * OUs or accounts.
     * </p>
     * <note>
     * <p>
     * Even if a policy type is shown as available in the organization, you can separately enable and disable them at
     * the root level by using <a>EnablePolicyType</a> and <a>DisablePolicyType</a>. Use <a>DescribeOrganization</a> to
     * see the availability of the policy types in that organization.
     * </p>
     * </note>
     * 
     * @param policyTypes
     *        The types of policies that are currently enabled for the root and therefore can be attached to the root or
     *        to its OUs or accounts.</p> <note>
     *        <p>
     *        Even if a policy type is shown as available in the organization, you can separately enable and disable
     *        them at the root level by using <a>EnablePolicyType</a> and <a>DisablePolicyType</a>. Use
     *        <a>DescribeOrganization</a> to see the availability of the policy types in that organization.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Root withPolicyTypes(java.util.Collection<PolicyTypeSummary> policyTypes) {
        setPolicyTypes(policyTypes);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getPolicyTypes() != null)
            sb.append("PolicyTypes: ").append(getPolicyTypes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Root == false)
            return false;
        Root other = (Root) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getPolicyTypes() == null ^ this.getPolicyTypes() == null)
            return false;
        if (other.getPolicyTypes() != null && other.getPolicyTypes().equals(this.getPolicyTypes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getPolicyTypes() == null) ? 0 : getPolicyTypes().hashCode());
        return hashCode;
    }

    @Override
    public Root clone() {
        try {
            return (Root) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.organizations.model.transform.RootMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
