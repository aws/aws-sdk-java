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
 * Contains information about a root, OU, or account that a policy is attached to.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/PolicyTargetSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PolicyTargetSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier (ID) of the policy target.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a target ID string requires one of the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Root: a string that begins with "r-" followed by from 4 to 32 lower-case letters or digits.
     * </p>
     * </li>
     * <li>
     * <p>
     * Account: a string that consists of exactly 12 digits.
     * </p>
     * </li>
     * <li>
     * <p>
     * Organizational unit (OU): a string that begins with "ou-" followed by from 4 to 32 lower-case letters or digits
     * (the ID of the root that the OU is in) followed by a second "-" dash and from 8 to 32 additional lower-case
     * letters or digits.
     * </p>
     * </li>
     * </ul>
     */
    private String targetId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the policy target.
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
     * The friendly name of the policy target.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> that is used to validate this parameter is a
     * string of any of the characters in the ASCII character range.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The type of the policy target.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The unique identifier (ID) of the policy target.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a target ID string requires one of the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Root: a string that begins with "r-" followed by from 4 to 32 lower-case letters or digits.
     * </p>
     * </li>
     * <li>
     * <p>
     * Account: a string that consists of exactly 12 digits.
     * </p>
     * </li>
     * <li>
     * <p>
     * Organizational unit (OU): a string that begins with "ou-" followed by from 4 to 32 lower-case letters or digits
     * (the ID of the root that the OU is in) followed by a second "-" dash and from 8 to 32 additional lower-case
     * letters or digits.
     * </p>
     * </li>
     * </ul>
     * 
     * @param targetId
     *        The unique identifier (ID) of the policy target.</p>
     *        <p>
     *        The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a target ID string requires one of the
     *        following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Root: a string that begins with "r-" followed by from 4 to 32 lower-case letters or digits.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Account: a string that consists of exactly 12 digits.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Organizational unit (OU): a string that begins with "ou-" followed by from 4 to 32 lower-case letters or
     *        digits (the ID of the root that the OU is in) followed by a second "-" dash and from 8 to 32 additional
     *        lower-case letters or digits.
     *        </p>
     *        </li>
     */

    public void setTargetId(String targetId) {
        this.targetId = targetId;
    }

    /**
     * <p>
     * The unique identifier (ID) of the policy target.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a target ID string requires one of the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Root: a string that begins with "r-" followed by from 4 to 32 lower-case letters or digits.
     * </p>
     * </li>
     * <li>
     * <p>
     * Account: a string that consists of exactly 12 digits.
     * </p>
     * </li>
     * <li>
     * <p>
     * Organizational unit (OU): a string that begins with "ou-" followed by from 4 to 32 lower-case letters or digits
     * (the ID of the root that the OU is in) followed by a second "-" dash and from 8 to 32 additional lower-case
     * letters or digits.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The unique identifier (ID) of the policy target.</p>
     *         <p>
     *         The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a target ID string requires one of
     *         the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Root: a string that begins with "r-" followed by from 4 to 32 lower-case letters or digits.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Account: a string that consists of exactly 12 digits.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Organizational unit (OU): a string that begins with "ou-" followed by from 4 to 32 lower-case letters or
     *         digits (the ID of the root that the OU is in) followed by a second "-" dash and from 8 to 32 additional
     *         lower-case letters or digits.
     *         </p>
     *         </li>
     */

    public String getTargetId() {
        return this.targetId;
    }

    /**
     * <p>
     * The unique identifier (ID) of the policy target.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a target ID string requires one of the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Root: a string that begins with "r-" followed by from 4 to 32 lower-case letters or digits.
     * </p>
     * </li>
     * <li>
     * <p>
     * Account: a string that consists of exactly 12 digits.
     * </p>
     * </li>
     * <li>
     * <p>
     * Organizational unit (OU): a string that begins with "ou-" followed by from 4 to 32 lower-case letters or digits
     * (the ID of the root that the OU is in) followed by a second "-" dash and from 8 to 32 additional lower-case
     * letters or digits.
     * </p>
     * </li>
     * </ul>
     * 
     * @param targetId
     *        The unique identifier (ID) of the policy target.</p>
     *        <p>
     *        The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a target ID string requires one of the
     *        following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Root: a string that begins with "r-" followed by from 4 to 32 lower-case letters or digits.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Account: a string that consists of exactly 12 digits.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Organizational unit (OU): a string that begins with "ou-" followed by from 4 to 32 lower-case letters or
     *        digits (the ID of the root that the OU is in) followed by a second "-" dash and from 8 to 32 additional
     *        lower-case letters or digits.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PolicyTargetSummary withTargetId(String targetId) {
        setTargetId(targetId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the policy target.
     * </p>
     * <p>
     * For more information about ARNs in Organizations, see <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_permissions.html#orgs-permissions-arns">ARN
     * Formats Supported by Organizations</a> in the <i>AWS Organizations User Guide</i>.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the policy target.</p>
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
     * The Amazon Resource Name (ARN) of the policy target.
     * </p>
     * <p>
     * For more information about ARNs in Organizations, see <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_permissions.html#orgs-permissions-arns">ARN
     * Formats Supported by Organizations</a> in the <i>AWS Organizations User Guide</i>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the policy target.</p>
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
     * The Amazon Resource Name (ARN) of the policy target.
     * </p>
     * <p>
     * For more information about ARNs in Organizations, see <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_permissions.html#orgs-permissions-arns">ARN
     * Formats Supported by Organizations</a> in the <i>AWS Organizations User Guide</i>.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the policy target.</p>
     *        <p>
     *        For more information about ARNs in Organizations, see <a href=
     *        "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_permissions.html#orgs-permissions-arns"
     *        >ARN Formats Supported by Organizations</a> in the <i>AWS Organizations User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PolicyTargetSummary withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The friendly name of the policy target.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> that is used to validate this parameter is a
     * string of any of the characters in the ASCII character range.
     * </p>
     * 
     * @param name
     *        The friendly name of the policy target.</p>
     *        <p>
     *        The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> that is used to validate this parameter is
     *        a string of any of the characters in the ASCII character range.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The friendly name of the policy target.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> that is used to validate this parameter is a
     * string of any of the characters in the ASCII character range.
     * </p>
     * 
     * @return The friendly name of the policy target.</p>
     *         <p>
     *         The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> that is used to validate this parameter
     *         is a string of any of the characters in the ASCII character range.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The friendly name of the policy target.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> that is used to validate this parameter is a
     * string of any of the characters in the ASCII character range.
     * </p>
     * 
     * @param name
     *        The friendly name of the policy target.</p>
     *        <p>
     *        The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> that is used to validate this parameter is
     *        a string of any of the characters in the ASCII character range.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PolicyTargetSummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The type of the policy target.
     * </p>
     * 
     * @param type
     *        The type of the policy target.
     * @see TargetType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the policy target.
     * </p>
     * 
     * @return The type of the policy target.
     * @see TargetType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the policy target.
     * </p>
     * 
     * @param type
     *        The type of the policy target.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetType
     */

    public PolicyTargetSummary withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of the policy target.
     * </p>
     * 
     * @param type
     *        The type of the policy target.
     * @see TargetType
     */

    public void setType(TargetType type) {
        withType(type);
    }

    /**
     * <p>
     * The type of the policy target.
     * </p>
     * 
     * @param type
     *        The type of the policy target.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetType
     */

    public PolicyTargetSummary withType(TargetType type) {
        this.type = type.toString();
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
        if (getTargetId() != null)
            sb.append("TargetId: ").append(getTargetId()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PolicyTargetSummary == false)
            return false;
        PolicyTargetSummary other = (PolicyTargetSummary) obj;
        if (other.getTargetId() == null ^ this.getTargetId() == null)
            return false;
        if (other.getTargetId() != null && other.getTargetId().equals(this.getTargetId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTargetId() == null) ? 0 : getTargetId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public PolicyTargetSummary clone() {
        try {
            return (PolicyTargetSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.organizations.model.transform.PolicyTargetSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
