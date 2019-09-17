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
 * Contains details about an organization. An organization is a collection of accounts that are centrally managed
 * together using consolidated billing, organized hierarchically with organizational units (OUs), and controlled with
 * policies .
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
     * For more information about ARNs in Organizations, see <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_permissions.html#orgs-permissions-arns">ARN
     * Formats Supported by Organizations</a> in the <i>AWS Organizations User Guide</i>.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * Specifies the functionality that currently is available to the organization. If set to "ALL", then all features
     * are enabled and policies can be applied to accounts in the organization. If set to "CONSOLIDATED_BILLING", then
     * only consolidated billing functionality is available. For more information, see <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_org_support-all-features.html"
     * >Enabling All Features in Your Organization</a> in the <i>AWS Organizations User Guide</i>.
     * </p>
     */
    private String featureSet;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the account that is designated as the master account for the organization.
     * </p>
     * <p>
     * For more information about ARNs in Organizations, see <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_permissions.html#orgs-permissions-arns">ARN
     * Formats Supported by Organizations</a> in the <i>AWS Organizations User Guide</i>.
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
     * A list of policy types that are enabled for this organization. For example, if your organization has all features
     * enabled, then service control policies (SCPs) are included in the list.
     * </p>
     * <note>
     * <p>
     * Even if a policy type is shown as available in the organization, you can separately enable and disable them at
     * the root level by using <a>EnablePolicyType</a> and <a>DisablePolicyType</a>. Use <a>ListRoots</a> to see the
     * status of a policy type in that root.
     * </p>
     * </note>
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
     * For more information about ARNs in Organizations, see <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_permissions.html#orgs-permissions-arns">ARN
     * Formats Supported by Organizations</a> in the <i>AWS Organizations User Guide</i>.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of an organization.</p>
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
     * The Amazon Resource Name (ARN) of an organization.
     * </p>
     * <p>
     * For more information about ARNs in Organizations, see <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_permissions.html#orgs-permissions-arns">ARN
     * Formats Supported by Organizations</a> in the <i>AWS Organizations User Guide</i>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of an organization.</p>
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
     * The Amazon Resource Name (ARN) of an organization.
     * </p>
     * <p>
     * For more information about ARNs in Organizations, see <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_permissions.html#orgs-permissions-arns">ARN
     * Formats Supported by Organizations</a> in the <i>AWS Organizations User Guide</i>.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of an organization.</p>
     *        <p>
     *        For more information about ARNs in Organizations, see <a href=
     *        "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_permissions.html#orgs-permissions-arns"
     *        >ARN Formats Supported by Organizations</a> in the <i>AWS Organizations User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Organization withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * Specifies the functionality that currently is available to the organization. If set to "ALL", then all features
     * are enabled and policies can be applied to accounts in the organization. If set to "CONSOLIDATED_BILLING", then
     * only consolidated billing functionality is available. For more information, see <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_org_support-all-features.html"
     * >Enabling All Features in Your Organization</a> in the <i>AWS Organizations User Guide</i>.
     * </p>
     * 
     * @param featureSet
     *        Specifies the functionality that currently is available to the organization. If set to "ALL", then all
     *        features are enabled and policies can be applied to accounts in the organization. If set to
     *        "CONSOLIDATED_BILLING", then only consolidated billing functionality is available. For more information,
     *        see <a href=
     *        "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_org_support-all-features.html"
     *        >Enabling All Features in Your Organization</a> in the <i>AWS Organizations User Guide</i>.
     * @see OrganizationFeatureSet
     */

    public void setFeatureSet(String featureSet) {
        this.featureSet = featureSet;
    }

    /**
     * <p>
     * Specifies the functionality that currently is available to the organization. If set to "ALL", then all features
     * are enabled and policies can be applied to accounts in the organization. If set to "CONSOLIDATED_BILLING", then
     * only consolidated billing functionality is available. For more information, see <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_org_support-all-features.html"
     * >Enabling All Features in Your Organization</a> in the <i>AWS Organizations User Guide</i>.
     * </p>
     * 
     * @return Specifies the functionality that currently is available to the organization. If set to "ALL", then all
     *         features are enabled and policies can be applied to accounts in the organization. If set to
     *         "CONSOLIDATED_BILLING", then only consolidated billing functionality is available. For more information,
     *         see <a href=
     *         "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_org_support-all-features.html"
     *         >Enabling All Features in Your Organization</a> in the <i>AWS Organizations User Guide</i>.
     * @see OrganizationFeatureSet
     */

    public String getFeatureSet() {
        return this.featureSet;
    }

    /**
     * <p>
     * Specifies the functionality that currently is available to the organization. If set to "ALL", then all features
     * are enabled and policies can be applied to accounts in the organization. If set to "CONSOLIDATED_BILLING", then
     * only consolidated billing functionality is available. For more information, see <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_org_support-all-features.html"
     * >Enabling All Features in Your Organization</a> in the <i>AWS Organizations User Guide</i>.
     * </p>
     * 
     * @param featureSet
     *        Specifies the functionality that currently is available to the organization. If set to "ALL", then all
     *        features are enabled and policies can be applied to accounts in the organization. If set to
     *        "CONSOLIDATED_BILLING", then only consolidated billing functionality is available. For more information,
     *        see <a href=
     *        "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_org_support-all-features.html"
     *        >Enabling All Features in Your Organization</a> in the <i>AWS Organizations User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OrganizationFeatureSet
     */

    public Organization withFeatureSet(String featureSet) {
        setFeatureSet(featureSet);
        return this;
    }

    /**
     * <p>
     * Specifies the functionality that currently is available to the organization. If set to "ALL", then all features
     * are enabled and policies can be applied to accounts in the organization. If set to "CONSOLIDATED_BILLING", then
     * only consolidated billing functionality is available. For more information, see <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_org_support-all-features.html"
     * >Enabling All Features in Your Organization</a> in the <i>AWS Organizations User Guide</i>.
     * </p>
     * 
     * @param featureSet
     *        Specifies the functionality that currently is available to the organization. If set to "ALL", then all
     *        features are enabled and policies can be applied to accounts in the organization. If set to
     *        "CONSOLIDATED_BILLING", then only consolidated billing functionality is available. For more information,
     *        see <a href=
     *        "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_org_support-all-features.html"
     *        >Enabling All Features in Your Organization</a> in the <i>AWS Organizations User Guide</i>.
     * @see OrganizationFeatureSet
     */

    public void setFeatureSet(OrganizationFeatureSet featureSet) {
        withFeatureSet(featureSet);
    }

    /**
     * <p>
     * Specifies the functionality that currently is available to the organization. If set to "ALL", then all features
     * are enabled and policies can be applied to accounts in the organization. If set to "CONSOLIDATED_BILLING", then
     * only consolidated billing functionality is available. For more information, see <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_org_support-all-features.html"
     * >Enabling All Features in Your Organization</a> in the <i>AWS Organizations User Guide</i>.
     * </p>
     * 
     * @param featureSet
     *        Specifies the functionality that currently is available to the organization. If set to "ALL", then all
     *        features are enabled and policies can be applied to accounts in the organization. If set to
     *        "CONSOLIDATED_BILLING", then only consolidated billing functionality is available. For more information,
     *        see <a href=
     *        "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_org_support-all-features.html"
     *        >Enabling All Features in Your Organization</a> in the <i>AWS Organizations User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OrganizationFeatureSet
     */

    public Organization withFeatureSet(OrganizationFeatureSet featureSet) {
        this.featureSet = featureSet.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the account that is designated as the master account for the organization.
     * </p>
     * <p>
     * For more information about ARNs in Organizations, see <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_permissions.html#orgs-permissions-arns">ARN
     * Formats Supported by Organizations</a> in the <i>AWS Organizations User Guide</i>.
     * </p>
     * 
     * @param masterAccountArn
     *        The Amazon Resource Name (ARN) of the account that is designated as the master account for the
     *        organization.</p>
     *        <p>
     *        For more information about ARNs in Organizations, see <a href=
     *        "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_permissions.html#orgs-permissions-arns"
     *        >ARN Formats Supported by Organizations</a> in the <i>AWS Organizations User Guide</i>.
     */

    public void setMasterAccountArn(String masterAccountArn) {
        this.masterAccountArn = masterAccountArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the account that is designated as the master account for the organization.
     * </p>
     * <p>
     * For more information about ARNs in Organizations, see <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_permissions.html#orgs-permissions-arns">ARN
     * Formats Supported by Organizations</a> in the <i>AWS Organizations User Guide</i>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the account that is designated as the master account for the
     *         organization.</p>
     *         <p>
     *         For more information about ARNs in Organizations, see <a href=
     *         "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_permissions.html#orgs-permissions-arns"
     *         >ARN Formats Supported by Organizations</a> in the <i>AWS Organizations User Guide</i>.
     */

    public String getMasterAccountArn() {
        return this.masterAccountArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the account that is designated as the master account for the organization.
     * </p>
     * <p>
     * For more information about ARNs in Organizations, see <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_permissions.html#orgs-permissions-arns">ARN
     * Formats Supported by Organizations</a> in the <i>AWS Organizations User Guide</i>.
     * </p>
     * 
     * @param masterAccountArn
     *        The Amazon Resource Name (ARN) of the account that is designated as the master account for the
     *        organization.</p>
     *        <p>
     *        For more information about ARNs in Organizations, see <a href=
     *        "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_permissions.html#orgs-permissions-arns"
     *        >ARN Formats Supported by Organizations</a> in the <i>AWS Organizations User Guide</i>.
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
     * A list of policy types that are enabled for this organization. For example, if your organization has all features
     * enabled, then service control policies (SCPs) are included in the list.
     * </p>
     * <note>
     * <p>
     * Even if a policy type is shown as available in the organization, you can separately enable and disable them at
     * the root level by using <a>EnablePolicyType</a> and <a>DisablePolicyType</a>. Use <a>ListRoots</a> to see the
     * status of a policy type in that root.
     * </p>
     * </note>
     * 
     * @return A list of policy types that are enabled for this organization. For example, if your organization has all
     *         features enabled, then service control policies (SCPs) are included in the list.</p> <note>
     *         <p>
     *         Even if a policy type is shown as available in the organization, you can separately enable and disable
     *         them at the root level by using <a>EnablePolicyType</a> and <a>DisablePolicyType</a>. Use
     *         <a>ListRoots</a> to see the status of a policy type in that root.
     *         </p>
     */

    public java.util.List<PolicyTypeSummary> getAvailablePolicyTypes() {
        return availablePolicyTypes;
    }

    /**
     * <p>
     * A list of policy types that are enabled for this organization. For example, if your organization has all features
     * enabled, then service control policies (SCPs) are included in the list.
     * </p>
     * <note>
     * <p>
     * Even if a policy type is shown as available in the organization, you can separately enable and disable them at
     * the root level by using <a>EnablePolicyType</a> and <a>DisablePolicyType</a>. Use <a>ListRoots</a> to see the
     * status of a policy type in that root.
     * </p>
     * </note>
     * 
     * @param availablePolicyTypes
     *        A list of policy types that are enabled for this organization. For example, if your organization has all
     *        features enabled, then service control policies (SCPs) are included in the list.</p> <note>
     *        <p>
     *        Even if a policy type is shown as available in the organization, you can separately enable and disable
     *        them at the root level by using <a>EnablePolicyType</a> and <a>DisablePolicyType</a>. Use <a>ListRoots</a>
     *        to see the status of a policy type in that root.
     *        </p>
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
     * A list of policy types that are enabled for this organization. For example, if your organization has all features
     * enabled, then service control policies (SCPs) are included in the list.
     * </p>
     * <note>
     * <p>
     * Even if a policy type is shown as available in the organization, you can separately enable and disable them at
     * the root level by using <a>EnablePolicyType</a> and <a>DisablePolicyType</a>. Use <a>ListRoots</a> to see the
     * status of a policy type in that root.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAvailablePolicyTypes(java.util.Collection)} or {@link #withAvailablePolicyTypes(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param availablePolicyTypes
     *        A list of policy types that are enabled for this organization. For example, if your organization has all
     *        features enabled, then service control policies (SCPs) are included in the list.</p> <note>
     *        <p>
     *        Even if a policy type is shown as available in the organization, you can separately enable and disable
     *        them at the root level by using <a>EnablePolicyType</a> and <a>DisablePolicyType</a>. Use <a>ListRoots</a>
     *        to see the status of a policy type in that root.
     *        </p>
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
     * A list of policy types that are enabled for this organization. For example, if your organization has all features
     * enabled, then service control policies (SCPs) are included in the list.
     * </p>
     * <note>
     * <p>
     * Even if a policy type is shown as available in the organization, you can separately enable and disable them at
     * the root level by using <a>EnablePolicyType</a> and <a>DisablePolicyType</a>. Use <a>ListRoots</a> to see the
     * status of a policy type in that root.
     * </p>
     * </note>
     * 
     * @param availablePolicyTypes
     *        A list of policy types that are enabled for this organization. For example, if your organization has all
     *        features enabled, then service control policies (SCPs) are included in the list.</p> <note>
     *        <p>
     *        Even if a policy type is shown as available in the organization, you can separately enable and disable
     *        them at the root level by using <a>EnablePolicyType</a> and <a>DisablePolicyType</a>. Use <a>ListRoots</a>
     *        to see the status of a policy type in that root.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Organization withAvailablePolicyTypes(java.util.Collection<PolicyTypeSummary> availablePolicyTypes) {
        setAvailablePolicyTypes(availablePolicyTypes);
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
        if (getFeatureSet() != null)
            sb.append("FeatureSet: ").append(getFeatureSet()).append(",");
        if (getMasterAccountArn() != null)
            sb.append("MasterAccountArn: ").append(getMasterAccountArn()).append(",");
        if (getMasterAccountId() != null)
            sb.append("MasterAccountId: ").append(getMasterAccountId()).append(",");
        if (getMasterAccountEmail() != null)
            sb.append("MasterAccountEmail: ").append("***Sensitive Data Redacted***").append(",");
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
        if (other.getFeatureSet() == null ^ this.getFeatureSet() == null)
            return false;
        if (other.getFeatureSet() != null && other.getFeatureSet().equals(this.getFeatureSet()) == false)
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
        hashCode = prime * hashCode + ((getFeatureSet() == null) ? 0 : getFeatureSet().hashCode());
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
