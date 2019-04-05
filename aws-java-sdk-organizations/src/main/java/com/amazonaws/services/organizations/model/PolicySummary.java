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
 * Contains information about a policy, but does not include the content. To see the content of a policy, see
 * <a>DescribePolicy</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/PolicySummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PolicySummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier (ID) of the policy.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a policy ID string requires "p-" followed by
     * from 8 to 128 lower-case letters or digits.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the policy.
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
     * The friendly name of the policy.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> that is used to validate this parameter is a
     * string of any of the characters in the ASCII character range.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The description of the policy.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The type of policy.
     * </p>
     */
    private String type;
    /**
     * <p>
     * A boolean value that indicates whether the specified policy is an AWS managed policy. If true, then you can
     * attach the policy to roots, OUs, or accounts, but you cannot edit it.
     * </p>
     */
    private Boolean awsManaged;

    /**
     * <p>
     * The unique identifier (ID) of the policy.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a policy ID string requires "p-" followed by
     * from 8 to 128 lower-case letters or digits.
     * </p>
     * 
     * @param id
     *        The unique identifier (ID) of the policy.</p>
     *        <p>
     *        The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a policy ID string requires "p-"
     *        followed by from 8 to 128 lower-case letters or digits.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier (ID) of the policy.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a policy ID string requires "p-" followed by
     * from 8 to 128 lower-case letters or digits.
     * </p>
     * 
     * @return The unique identifier (ID) of the policy.</p>
     *         <p>
     *         The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a policy ID string requires "p-"
     *         followed by from 8 to 128 lower-case letters or digits.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique identifier (ID) of the policy.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a policy ID string requires "p-" followed by
     * from 8 to 128 lower-case letters or digits.
     * </p>
     * 
     * @param id
     *        The unique identifier (ID) of the policy.</p>
     *        <p>
     *        The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a policy ID string requires "p-"
     *        followed by from 8 to 128 lower-case letters or digits.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PolicySummary withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the policy.
     * </p>
     * <p>
     * For more information about ARNs in Organizations, see <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_permissions.html#orgs-permissions-arns">ARN
     * Formats Supported by Organizations</a> in the <i>AWS Organizations User Guide</i>.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the policy.</p>
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
     * The Amazon Resource Name (ARN) of the policy.
     * </p>
     * <p>
     * For more information about ARNs in Organizations, see <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_permissions.html#orgs-permissions-arns">ARN
     * Formats Supported by Organizations</a> in the <i>AWS Organizations User Guide</i>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the policy.</p>
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
     * The Amazon Resource Name (ARN) of the policy.
     * </p>
     * <p>
     * For more information about ARNs in Organizations, see <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_permissions.html#orgs-permissions-arns">ARN
     * Formats Supported by Organizations</a> in the <i>AWS Organizations User Guide</i>.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the policy.</p>
     *        <p>
     *        For more information about ARNs in Organizations, see <a href=
     *        "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_permissions.html#orgs-permissions-arns"
     *        >ARN Formats Supported by Organizations</a> in the <i>AWS Organizations User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PolicySummary withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The friendly name of the policy.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> that is used to validate this parameter is a
     * string of any of the characters in the ASCII character range.
     * </p>
     * 
     * @param name
     *        The friendly name of the policy.</p>
     *        <p>
     *        The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> that is used to validate this parameter is
     *        a string of any of the characters in the ASCII character range.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The friendly name of the policy.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> that is used to validate this parameter is a
     * string of any of the characters in the ASCII character range.
     * </p>
     * 
     * @return The friendly name of the policy.</p>
     *         <p>
     *         The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> that is used to validate this parameter
     *         is a string of any of the characters in the ASCII character range.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The friendly name of the policy.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> that is used to validate this parameter is a
     * string of any of the characters in the ASCII character range.
     * </p>
     * 
     * @param name
     *        The friendly name of the policy.</p>
     *        <p>
     *        The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> that is used to validate this parameter is
     *        a string of any of the characters in the ASCII character range.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PolicySummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The description of the policy.
     * </p>
     * 
     * @param description
     *        The description of the policy.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the policy.
     * </p>
     * 
     * @return The description of the policy.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the policy.
     * </p>
     * 
     * @param description
     *        The description of the policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PolicySummary withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The type of policy.
     * </p>
     * 
     * @param type
     *        The type of policy.
     * @see PolicyType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of policy.
     * </p>
     * 
     * @return The type of policy.
     * @see PolicyType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of policy.
     * </p>
     * 
     * @param type
     *        The type of policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PolicyType
     */

    public PolicySummary withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of policy.
     * </p>
     * 
     * @param type
     *        The type of policy.
     * @see PolicyType
     */

    public void setType(PolicyType type) {
        withType(type);
    }

    /**
     * <p>
     * The type of policy.
     * </p>
     * 
     * @param type
     *        The type of policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PolicyType
     */

    public PolicySummary withType(PolicyType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * A boolean value that indicates whether the specified policy is an AWS managed policy. If true, then you can
     * attach the policy to roots, OUs, or accounts, but you cannot edit it.
     * </p>
     * 
     * @param awsManaged
     *        A boolean value that indicates whether the specified policy is an AWS managed policy. If true, then you
     *        can attach the policy to roots, OUs, or accounts, but you cannot edit it.
     */

    public void setAwsManaged(Boolean awsManaged) {
        this.awsManaged = awsManaged;
    }

    /**
     * <p>
     * A boolean value that indicates whether the specified policy is an AWS managed policy. If true, then you can
     * attach the policy to roots, OUs, or accounts, but you cannot edit it.
     * </p>
     * 
     * @return A boolean value that indicates whether the specified policy is an AWS managed policy. If true, then you
     *         can attach the policy to roots, OUs, or accounts, but you cannot edit it.
     */

    public Boolean getAwsManaged() {
        return this.awsManaged;
    }

    /**
     * <p>
     * A boolean value that indicates whether the specified policy is an AWS managed policy. If true, then you can
     * attach the policy to roots, OUs, or accounts, but you cannot edit it.
     * </p>
     * 
     * @param awsManaged
     *        A boolean value that indicates whether the specified policy is an AWS managed policy. If true, then you
     *        can attach the policy to roots, OUs, or accounts, but you cannot edit it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PolicySummary withAwsManaged(Boolean awsManaged) {
        setAwsManaged(awsManaged);
        return this;
    }

    /**
     * <p>
     * A boolean value that indicates whether the specified policy is an AWS managed policy. If true, then you can
     * attach the policy to roots, OUs, or accounts, but you cannot edit it.
     * </p>
     * 
     * @return A boolean value that indicates whether the specified policy is an AWS managed policy. If true, then you
     *         can attach the policy to roots, OUs, or accounts, but you cannot edit it.
     */

    public Boolean isAwsManaged() {
        return this.awsManaged;
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getAwsManaged() != null)
            sb.append("AwsManaged: ").append(getAwsManaged());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PolicySummary == false)
            return false;
        PolicySummary other = (PolicySummary) obj;
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
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getAwsManaged() == null ^ this.getAwsManaged() == null)
            return false;
        if (other.getAwsManaged() != null && other.getAwsManaged().equals(this.getAwsManaged()) == false)
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
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getAwsManaged() == null) ? 0 : getAwsManaged().hashCode());
        return hashCode;
    }

    @Override
    public PolicySummary clone() {
        try {
            return (PolicySummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.organizations.model.transform.PolicySummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
