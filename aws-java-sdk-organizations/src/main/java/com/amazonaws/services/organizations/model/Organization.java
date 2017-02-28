/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Contains details about an organization. An organization is a collection of accounts that are centrally managed
 * together using consolidated billing, organized hierarchically with organizational units (OUs), and controlled with
 * organization control policies (OCPs).
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/Organization" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Organization implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier (ID) of an organization.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for an organization ID string requires "o-"
     * followed by from 10 to 32 lower-case letters or digits.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of an organization.
     * </p>
     * <p>
     * For more information about ARNs, see <a
     * href="http://docs.aws.amazon.com/http:/docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     * Resource Names (ARNs) and AWS Service Namespaces</a> in the <i>AWS General Reference</i>.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * Specifies the mode of operation that currently applies to all accounts in the organization. If full-control mode
     * is enabled, then organization control policies (OCPs) can be applied to accounts in the organization. If not,
     * then only shared billing functionality is available. For more information, see <a
     * href="http://docs.aws.amazon.com/http:/docs.aws.amazon.com/IAM/latest/orgs_operating-modes.html">Organization
     * Operating Modes</a> in the <i>AWS Organizations User Guide</i>.
     * </p>
     */
    private String mode;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the account that is designated as the master account for the organization.
     * </p>
     * <p>
     * For more information about ARNs, see <a
     * href="http://docs.aws.amazon.com/http:/docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     * Resource Names (ARNs) and AWS Service Namespaces</a> in the <i>AWS General Reference</i>.
     * </p>
     */
    private String masterAccountArn;
    /**
     * <p>
     * The unique identifier (ID) of the master account of an organization.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for an account ID string requires exactly 12
     * digits.
     * </p>
     */
    private String masterAccountId;
    /**
     * <p>
     * The email address that is associated with the AWS account that is designated as the master account for the
     * organization.
     * </p>
     */
    private String masterAccountEmail;
    /**
     * <p>
     * A list of policy types that are enabled for this organization. For example, if your organization is in
     * full-control mode, then service control policies (SCPs) are included in the list.
     * </p>
     */
    private java.util.List<PolicyTypeSummary> availablePolicyTypes;

    /**
     * <p>
     * The unique identifier (ID) of an organization.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for an organization ID string requires "o-"
     * followed by from 10 to 32 lower-case letters or digits.
     * </p>
     * 
     * @param id
     *        The unique identifier (ID) of an organization.</p>
     *        <p>
     *        The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for an organization ID string requires
     *        "o-" followed by from 10 to 32 lower-case letters or digits.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier (ID) of an organization.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for an organization ID string requires "o-"
     * followed by from 10 to 32 lower-case letters or digits.
     * </p>
     * 
     * @return The unique identifier (ID) of an organization.</p>
     *         <p>
     *         The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for an organization ID string requires
     *         "o-" followed by from 10 to 32 lower-case letters or digits.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique identifier (ID) of an organization.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for an organization ID string requires "o-"
     * followed by from 10 to 32 lower-case letters or digits.
     * </p>
     * 
     * @param id
     *        The unique identifier (ID) of an organization.</p>
     *        <p>
     *        The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for an organization ID string requires
     *        "o-" followed by from 10 to 32 lower-case letters or digits.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Organization withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an organization.
     * </p>
     * <p>
     * For more information about ARNs, see <a
     * href="http://docs.aws.amazon.com/http:/docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     * Resource Names (ARNs) and AWS Service Namespaces</a> in the <i>AWS General Reference</i>.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of an organization.</p>
     *        <p>
     *        For more information about ARNs, see <a href=
     *        "http://docs.aws.amazon.com/http:/docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     *        >Amazon Resource Names (ARNs) and AWS Service Namespaces</a> in the <i>AWS General Reference</i>.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an organization.
     * </p>
     * <p>
     * For more information about ARNs, see <a
     * href="http://docs.aws.amazon.com/http:/docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     * Resource Names (ARNs) and AWS Service Namespaces</a> in the <i>AWS General Reference</i>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of an organization.</p>
     *         <p>
     *         For more information about ARNs, see <a href=
     *         "http://docs.aws.amazon.com/http:/docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     *         >Amazon Resource Names (ARNs) and AWS Service Namespaces</a> in the <i>AWS General Reference</i>.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an organization.
     * </p>
     * <p>
     * For more information about ARNs, see <a
     * href="http://docs.aws.amazon.com/http:/docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     * Resource Names (ARNs) and AWS Service Namespaces</a> in the <i>AWS General Reference</i>.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of an organization.</p>
     *        <p>
     *        For more information about ARNs, see <a href=
     *        "http://docs.aws.amazon.com/http:/docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     *        >Amazon Resource Names (ARNs) and AWS Service Namespaces</a> in the <i>AWS General Reference</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Organization withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * Specifies the mode of operation that currently applies to all accounts in the organization. If full-control mode
     * is enabled, then organization control policies (OCPs) can be applied to accounts in the organization. If not,
     * then only shared billing functionality is available. For more information, see <a
     * href="http://docs.aws.amazon.com/http:/docs.aws.amazon.com/IAM/latest/orgs_operating-modes.html">Organization
     * Operating Modes</a> in the <i>AWS Organizations User Guide</i>.
     * </p>
     * 
     * @param mode
     *        Specifies the mode of operation that currently applies to all accounts in the organization. If
     *        full-control mode is enabled, then organization control policies (OCPs) can be applied to accounts in the
     *        organization. If not, then only shared billing functionality is available. For more information, see <a
     *        href
     *        ="http://docs.aws.amazon.com/http:/docs.aws.amazon.com/IAM/latest/orgs_operating-modes.html">Organization
     *        Operating Modes</a> in the <i>AWS Organizations User Guide</i>.
     * @see OrganizationMode
     */

    public void setMode(String mode) {
        this.mode = mode;
    }

    /**
     * <p>
     * Specifies the mode of operation that currently applies to all accounts in the organization. If full-control mode
     * is enabled, then organization control policies (OCPs) can be applied to accounts in the organization. If not,
     * then only shared billing functionality is available. For more information, see <a
     * href="http://docs.aws.amazon.com/http:/docs.aws.amazon.com/IAM/latest/orgs_operating-modes.html">Organization
     * Operating Modes</a> in the <i>AWS Organizations User Guide</i>.
     * </p>
     * 
     * @return Specifies the mode of operation that currently applies to all accounts in the organization. If
     *         full-control mode is enabled, then organization control policies (OCPs) can be applied to accounts in the
     *         organization. If not, then only shared billing functionality is available. For more information, see <a
     *         href="http://docs.aws.amazon.com/http:/docs.aws.amazon.com/IAM/latest/orgs_operating-modes.html">
     *         Organization Operating Modes</a> in the <i>AWS Organizations User Guide</i>.
     * @see OrganizationMode
     */

    public String getMode() {
        return this.mode;
    }

    /**
     * <p>
     * Specifies the mode of operation that currently applies to all accounts in the organization. If full-control mode
     * is enabled, then organization control policies (OCPs) can be applied to accounts in the organization. If not,
     * then only shared billing functionality is available. For more information, see <a
     * href="http://docs.aws.amazon.com/http:/docs.aws.amazon.com/IAM/latest/orgs_operating-modes.html">Organization
     * Operating Modes</a> in the <i>AWS Organizations User Guide</i>.
     * </p>
     * 
     * @param mode
     *        Specifies the mode of operation that currently applies to all accounts in the organization. If
     *        full-control mode is enabled, then organization control policies (OCPs) can be applied to accounts in the
     *        organization. If not, then only shared billing functionality is available. For more information, see <a
     *        href
     *        ="http://docs.aws.amazon.com/http:/docs.aws.amazon.com/IAM/latest/orgs_operating-modes.html">Organization
     *        Operating Modes</a> in the <i>AWS Organizations User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OrganizationMode
     */

    public Organization withMode(String mode) {
        setMode(mode);
        return this;
    }

    /**
     * <p>
     * Specifies the mode of operation that currently applies to all accounts in the organization. If full-control mode
     * is enabled, then organization control policies (OCPs) can be applied to accounts in the organization. If not,
     * then only shared billing functionality is available. For more information, see <a
     * href="http://docs.aws.amazon.com/http:/docs.aws.amazon.com/IAM/latest/orgs_operating-modes.html">Organization
     * Operating Modes</a> in the <i>AWS Organizations User Guide</i>.
     * </p>
     * 
     * @param mode
     *        Specifies the mode of operation that currently applies to all accounts in the organization. If
     *        full-control mode is enabled, then organization control policies (OCPs) can be applied to accounts in the
     *        organization. If not, then only shared billing functionality is available. For more information, see <a
     *        href
     *        ="http://docs.aws.amazon.com/http:/docs.aws.amazon.com/IAM/latest/orgs_operating-modes.html">Organization
     *        Operating Modes</a> in the <i>AWS Organizations User Guide</i>.
     * @see OrganizationMode
     */

    public void setMode(OrganizationMode mode) {
        this.mode = mode.toString();
    }

    /**
     * <p>
     * Specifies the mode of operation that currently applies to all accounts in the organization. If full-control mode
     * is enabled, then organization control policies (OCPs) can be applied to accounts in the organization. If not,
     * then only shared billing functionality is available. For more information, see <a
     * href="http://docs.aws.amazon.com/http:/docs.aws.amazon.com/IAM/latest/orgs_operating-modes.html">Organization
     * Operating Modes</a> in the <i>AWS Organizations User Guide</i>.
     * </p>
     * 
     * @param mode
     *        Specifies the mode of operation that currently applies to all accounts in the organization. If
     *        full-control mode is enabled, then organization control policies (OCPs) can be applied to accounts in the
     *        organization. If not, then only shared billing functionality is available. For more information, see <a
     *        href
     *        ="http://docs.aws.amazon.com/http:/docs.aws.amazon.com/IAM/latest/orgs_operating-modes.html">Organization
     *        Operating Modes</a> in the <i>AWS Organizations User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OrganizationMode
     */

    public Organization withMode(OrganizationMode mode) {
        setMode(mode);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the account that is designated as the master account for the organization.
     * </p>
     * <p>
     * For more information about ARNs, see <a
     * href="http://docs.aws.amazon.com/http:/docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     * Resource Names (ARNs) and AWS Service Namespaces</a> in the <i>AWS General Reference</i>.
     * </p>
     * 
     * @param masterAccountArn
     *        The Amazon Resource Name (ARN) of the account that is designated as the master account for the
     *        organization.</p>
     *        <p>
     *        For more information about ARNs, see <a href=
     *        "http://docs.aws.amazon.com/http:/docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     *        >Amazon Resource Names (ARNs) and AWS Service Namespaces</a> in the <i>AWS General Reference</i>.
     */

    public void setMasterAccountArn(String masterAccountArn) {
        this.masterAccountArn = masterAccountArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the account that is designated as the master account for the organization.
     * </p>
     * <p>
     * For more information about ARNs, see <a
     * href="http://docs.aws.amazon.com/http:/docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     * Resource Names (ARNs) and AWS Service Namespaces</a> in the <i>AWS General Reference</i>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the account that is designated as the master account for the
     *         organization.</p>
     *         <p>
     *         For more information about ARNs, see <a href=
     *         "http://docs.aws.amazon.com/http:/docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     *         >Amazon Resource Names (ARNs) and AWS Service Namespaces</a> in the <i>AWS General Reference</i>.
     */

    public String getMasterAccountArn() {
        return this.masterAccountArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the account that is designated as the master account for the organization.
     * </p>
     * <p>
     * For more information about ARNs, see <a
     * href="http://docs.aws.amazon.com/http:/docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     * Resource Names (ARNs) and AWS Service Namespaces</a> in the <i>AWS General Reference</i>.
     * </p>
     * 
     * @param masterAccountArn
     *        The Amazon Resource Name (ARN) of the account that is designated as the master account for the
     *        organization.</p>
     *        <p>
     *        For more information about ARNs, see <a href=
     *        "http://docs.aws.amazon.com/http:/docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     *        >Amazon Resource Names (ARNs) and AWS Service Namespaces</a> in the <i>AWS General Reference</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Organization withMasterAccountArn(String masterAccountArn) {
        setMasterAccountArn(masterAccountArn);
        return this;
    }

    /**
     * <p>
     * The unique identifier (ID) of the master account of an organization.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for an account ID string requires exactly 12
     * digits.
     * </p>
     * 
     * @param masterAccountId
     *        The unique identifier (ID) of the master account of an organization.</p>
     *        <p>
     *        The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for an account ID string requires exactly
     *        12 digits.
     */

    public void setMasterAccountId(String masterAccountId) {
        this.masterAccountId = masterAccountId;
    }

    /**
     * <p>
     * The unique identifier (ID) of the master account of an organization.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for an account ID string requires exactly 12
     * digits.
     * </p>
     * 
     * @return The unique identifier (ID) of the master account of an organization.</p>
     *         <p>
     *         The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for an account ID string requires exactly
     *         12 digits.
     */

    public String getMasterAccountId() {
        return this.masterAccountId;
    }

    /**
     * <p>
     * The unique identifier (ID) of the master account of an organization.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for an account ID string requires exactly 12
     * digits.
     * </p>
     * 
     * @param masterAccountId
     *        The unique identifier (ID) of the master account of an organization.</p>
     *        <p>
     *        The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for an account ID string requires exactly
     *        12 digits.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Organization withMasterAccountId(String masterAccountId) {
        setMasterAccountId(masterAccountId);
        return this;
    }

    /**
     * <p>
     * The email address that is associated with the AWS account that is designated as the master account for the
     * organization.
     * </p>
     * 
     * @param masterAccountEmail
     *        The email address that is associated with the AWS account that is designated as the master account for the
     *        organization.
     */

    public void setMasterAccountEmail(String masterAccountEmail) {
        this.masterAccountEmail = masterAccountEmail;
    }

    /**
     * <p>
     * The email address that is associated with the AWS account that is designated as the master account for the
     * organization.
     * </p>
     * 
     * @return The email address that is associated with the AWS account that is designated as the master account for
     *         the organization.
     */

    public String getMasterAccountEmail() {
        return this.masterAccountEmail;
    }

    /**
     * <p>
     * The email address that is associated with the AWS account that is designated as the master account for the
     * organization.
     * </p>
     * 
     * @param masterAccountEmail
     *        The email address that is associated with the AWS account that is designated as the master account for the
     *        organization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Organization withMasterAccountEmail(String masterAccountEmail) {
        setMasterAccountEmail(masterAccountEmail);
        return this;
    }

    /**
     * <p>
     * A list of policy types that are enabled for this organization. For example, if your organization is in
     * full-control mode, then service control policies (SCPs) are included in the list.
     * </p>
     * 
     * @return A list of policy types that are enabled for this organization. For example, if your organization is in
     *         full-control mode, then service control policies (SCPs) are included in the list.
     */

    public java.util.List<PolicyTypeSummary> getAvailablePolicyTypes() {
        return availablePolicyTypes;
    }

    /**
     * <p>
     * A list of policy types that are enabled for this organization. For example, if your organization is in
     * full-control mode, then service control policies (SCPs) are included in the list.
     * </p>
     * 
     * @param availablePolicyTypes
     *        A list of policy types that are enabled for this organization. For example, if your organization is in
     *        full-control mode, then service control policies (SCPs) are included in the list.
     */

    public void setAvailablePolicyTypes(java.util.Collection<PolicyTypeSummary> availablePolicyTypes) {
        if (availablePolicyTypes == null) {
            this.availablePolicyTypes = null;
            return;
        }

        this.availablePolicyTypes = new java.util.ArrayList<PolicyTypeSummary>(availablePolicyTypes);
    }

    /**
     * <p>
     * A list of policy types that are enabled for this organization. For example, if your organization is in
     * full-control mode, then service control policies (SCPs) are included in the list.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAvailablePolicyTypes(java.util.Collection)} or {@link #withAvailablePolicyTypes(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param availablePolicyTypes
     *        A list of policy types that are enabled for this organization. For example, if your organization is in
     *        full-control mode, then service control policies (SCPs) are included in the list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Organization withAvailablePolicyTypes(PolicyTypeSummary... availablePolicyTypes) {
        if (this.availablePolicyTypes == null) {
            setAvailablePolicyTypes(new java.util.ArrayList<PolicyTypeSummary>(availablePolicyTypes.length));
        }
        for (PolicyTypeSummary ele : availablePolicyTypes) {
            this.availablePolicyTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of policy types that are enabled for this organization. For example, if your organization is in
     * full-control mode, then service control policies (SCPs) are included in the list.
     * </p>
     * 
     * @param availablePolicyTypes
     *        A list of policy types that are enabled for this organization. For example, if your organization is in
     *        full-control mode, then service control policies (SCPs) are included in the list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Organization withAvailablePolicyTypes(java.util.Collection<PolicyTypeSummary> availablePolicyTypes) {
        setAvailablePolicyTypes(availablePolicyTypes);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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
        if (getMode() != null)
            sb.append("Mode: ").append(getMode()).append(",");
        if (getMasterAccountArn() != null)
            sb.append("MasterAccountArn: ").append(getMasterAccountArn()).append(",");
        if (getMasterAccountId() != null)
            sb.append("MasterAccountId: ").append(getMasterAccountId()).append(",");
        if (getMasterAccountEmail() != null)
            sb.append("MasterAccountEmail: ").append(getMasterAccountEmail()).append(",");
        if (getAvailablePolicyTypes() != null)
            sb.append("AvailablePolicyTypes: ").append(getAvailablePolicyTypes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Organization == false)
            return false;
        Organization other = (Organization) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getMode() == null ^ this.getMode() == null)
            return false;
        if (other.getMode() != null && other.getMode().equals(this.getMode()) == false)
            return false;
        if (other.getMasterAccountArn() == null ^ this.getMasterAccountArn() == null)
            return false;
        if (other.getMasterAccountArn() != null && other.getMasterAccountArn().equals(this.getMasterAccountArn()) == false)
            return false;
        if (other.getMasterAccountId() == null ^ this.getMasterAccountId() == null)
            return false;
        if (other.getMasterAccountId() != null && other.getMasterAccountId().equals(this.getMasterAccountId()) == false)
            return false;
        if (other.getMasterAccountEmail() == null ^ this.getMasterAccountEmail() == null)
            return false;
        if (other.getMasterAccountEmail() != null && other.getMasterAccountEmail().equals(this.getMasterAccountEmail()) == false)
            return false;
        if (other.getAvailablePolicyTypes() == null ^ this.getAvailablePolicyTypes() == null)
            return false;
        if (other.getAvailablePolicyTypes() != null && other.getAvailablePolicyTypes().equals(this.getAvailablePolicyTypes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getMode() == null) ? 0 : getMode().hashCode());
        hashCode = prime * hashCode + ((getMasterAccountArn() == null) ? 0 : getMasterAccountArn().hashCode());
        hashCode = prime * hashCode + ((getMasterAccountId() == null) ? 0 : getMasterAccountId().hashCode());
        hashCode = prime * hashCode + ((getMasterAccountEmail() == null) ? 0 : getMasterAccountEmail().hashCode());
        hashCode = prime * hashCode + ((getAvailablePolicyTypes() == null) ? 0 : getAvailablePolicyTypes().hashCode());
        return hashCode;
    }

    @Override
    public Organization clone() {
        try {
            return (Organization) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.organizations.model.transform.OrganizationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
