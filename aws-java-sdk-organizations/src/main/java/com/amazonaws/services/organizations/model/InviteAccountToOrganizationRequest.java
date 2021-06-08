/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/InviteAccountToOrganization"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InviteAccountToOrganizationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier (ID) of the AWS account that you want to invite to join your organization. This is a JSON object
     * that contains the following elements:
     * </p>
     * <p>
     * <code>{ "Type": "ACCOUNT", "Id": "&lt;<i> <b>account id number</b> </i>&gt;" }</code>
     * </p>
     * <p>
     * If you use the AWS CLI, you can submit this as a single string, similar to the following example:
     * </p>
     * <p>
     * <code>--target Id=123456789012,Type=ACCOUNT</code>
     * </p>
     * <p>
     * If you specify <code>"Type": "ACCOUNT"</code>, you must provide the AWS account ID number as the <code>Id</code>.
     * If you specify <code>"Type": "EMAIL"</code>, you must specify the email address that is associated with the
     * account.
     * </p>
     * <p>
     * <code>--target Id=diego@example.com,Type=EMAIL</code>
     * </p>
     */
    private HandshakeParty target;
    /**
     * <p>
     * Additional information that you want to include in the generated email to the recipient account owner.
     * </p>
     */
    private String notes;
    /**
     * <p>
     * A list of tags that you want to attach to the account when it becomes a member of the organization. For each tag
     * in the list, you must specify both a tag key and a value. You can set the value to an empty string, but you can't
     * set it to <code>null</code>. For more information about tagging, see <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_tagging.html">Tagging AWS Organizations
     * resources</a> in the AWS Organizations User Guide.
     * </p>
     * <important>
     * <p>
     * Any tags in the request are checked for compliance with any applicable tag policies when the request is made. The
     * request is rejected if the tags in the request don't match the requirements of the policy at that time. Tag
     * policy compliance is <i> <b>not</b> </i> checked again when the invitation is accepted and the tags are actually
     * attached to the account. That means that if the tag policy changes between the invitation and the acceptance,
     * then that tags could potentially be non-compliant.
     * </p>
     * </important> <note>
     * <p>
     * If any one of the tags is invalid or if you exceed the allowed number of tags for an account, then the entire
     * request fails and invitations are not sent.
     * </p>
     * </note>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The identifier (ID) of the AWS account that you want to invite to join your organization. This is a JSON object
     * that contains the following elements:
     * </p>
     * <p>
     * <code>{ "Type": "ACCOUNT", "Id": "&lt;<i> <b>account id number</b> </i>&gt;" }</code>
     * </p>
     * <p>
     * If you use the AWS CLI, you can submit this as a single string, similar to the following example:
     * </p>
     * <p>
     * <code>--target Id=123456789012,Type=ACCOUNT</code>
     * </p>
     * <p>
     * If you specify <code>"Type": "ACCOUNT"</code>, you must provide the AWS account ID number as the <code>Id</code>.
     * If you specify <code>"Type": "EMAIL"</code>, you must specify the email address that is associated with the
     * account.
     * </p>
     * <p>
     * <code>--target Id=diego@example.com,Type=EMAIL</code>
     * </p>
     * 
     * @param target
     *        The identifier (ID) of the AWS account that you want to invite to join your organization. This is a JSON
     *        object that contains the following elements:</p>
     *        <p>
     *        <code>{ "Type": "ACCOUNT", "Id": "&lt;<i> <b>account id number</b> </i>&gt;" }</code>
     *        </p>
     *        <p>
     *        If you use the AWS CLI, you can submit this as a single string, similar to the following example:
     *        </p>
     *        <p>
     *        <code>--target Id=123456789012,Type=ACCOUNT</code>
     *        </p>
     *        <p>
     *        If you specify <code>"Type": "ACCOUNT"</code>, you must provide the AWS account ID number as the
     *        <code>Id</code>. If you specify <code>"Type": "EMAIL"</code>, you must specify the email address that is
     *        associated with the account.
     *        </p>
     *        <p>
     *        <code>--target Id=diego@example.com,Type=EMAIL</code>
     */

    public void setTarget(HandshakeParty target) {
        this.target = target;
    }

    /**
     * <p>
     * The identifier (ID) of the AWS account that you want to invite to join your organization. This is a JSON object
     * that contains the following elements:
     * </p>
     * <p>
     * <code>{ "Type": "ACCOUNT", "Id": "&lt;<i> <b>account id number</b> </i>&gt;" }</code>
     * </p>
     * <p>
     * If you use the AWS CLI, you can submit this as a single string, similar to the following example:
     * </p>
     * <p>
     * <code>--target Id=123456789012,Type=ACCOUNT</code>
     * </p>
     * <p>
     * If you specify <code>"Type": "ACCOUNT"</code>, you must provide the AWS account ID number as the <code>Id</code>.
     * If you specify <code>"Type": "EMAIL"</code>, you must specify the email address that is associated with the
     * account.
     * </p>
     * <p>
     * <code>--target Id=diego@example.com,Type=EMAIL</code>
     * </p>
     * 
     * @return The identifier (ID) of the AWS account that you want to invite to join your organization. This is a JSON
     *         object that contains the following elements:</p>
     *         <p>
     *         <code>{ "Type": "ACCOUNT", "Id": "&lt;<i> <b>account id number</b> </i>&gt;" }</code>
     *         </p>
     *         <p>
     *         If you use the AWS CLI, you can submit this as a single string, similar to the following example:
     *         </p>
     *         <p>
     *         <code>--target Id=123456789012,Type=ACCOUNT</code>
     *         </p>
     *         <p>
     *         If you specify <code>"Type": "ACCOUNT"</code>, you must provide the AWS account ID number as the
     *         <code>Id</code>. If you specify <code>"Type": "EMAIL"</code>, you must specify the email address that is
     *         associated with the account.
     *         </p>
     *         <p>
     *         <code>--target Id=diego@example.com,Type=EMAIL</code>
     */

    public HandshakeParty getTarget() {
        return this.target;
    }

    /**
     * <p>
     * The identifier (ID) of the AWS account that you want to invite to join your organization. This is a JSON object
     * that contains the following elements:
     * </p>
     * <p>
     * <code>{ "Type": "ACCOUNT", "Id": "&lt;<i> <b>account id number</b> </i>&gt;" }</code>
     * </p>
     * <p>
     * If you use the AWS CLI, you can submit this as a single string, similar to the following example:
     * </p>
     * <p>
     * <code>--target Id=123456789012,Type=ACCOUNT</code>
     * </p>
     * <p>
     * If you specify <code>"Type": "ACCOUNT"</code>, you must provide the AWS account ID number as the <code>Id</code>.
     * If you specify <code>"Type": "EMAIL"</code>, you must specify the email address that is associated with the
     * account.
     * </p>
     * <p>
     * <code>--target Id=diego@example.com,Type=EMAIL</code>
     * </p>
     * 
     * @param target
     *        The identifier (ID) of the AWS account that you want to invite to join your organization. This is a JSON
     *        object that contains the following elements:</p>
     *        <p>
     *        <code>{ "Type": "ACCOUNT", "Id": "&lt;<i> <b>account id number</b> </i>&gt;" }</code>
     *        </p>
     *        <p>
     *        If you use the AWS CLI, you can submit this as a single string, similar to the following example:
     *        </p>
     *        <p>
     *        <code>--target Id=123456789012,Type=ACCOUNT</code>
     *        </p>
     *        <p>
     *        If you specify <code>"Type": "ACCOUNT"</code>, you must provide the AWS account ID number as the
     *        <code>Id</code>. If you specify <code>"Type": "EMAIL"</code>, you must specify the email address that is
     *        associated with the account.
     *        </p>
     *        <p>
     *        <code>--target Id=diego@example.com,Type=EMAIL</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InviteAccountToOrganizationRequest withTarget(HandshakeParty target) {
        setTarget(target);
        return this;
    }

    /**
     * <p>
     * Additional information that you want to include in the generated email to the recipient account owner.
     * </p>
     * 
     * @param notes
     *        Additional information that you want to include in the generated email to the recipient account owner.
     */

    public void setNotes(String notes) {
        this.notes = notes;
    }

    /**
     * <p>
     * Additional information that you want to include in the generated email to the recipient account owner.
     * </p>
     * 
     * @return Additional information that you want to include in the generated email to the recipient account owner.
     */

    public String getNotes() {
        return this.notes;
    }

    /**
     * <p>
     * Additional information that you want to include in the generated email to the recipient account owner.
     * </p>
     * 
     * @param notes
     *        Additional information that you want to include in the generated email to the recipient account owner.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InviteAccountToOrganizationRequest withNotes(String notes) {
        setNotes(notes);
        return this;
    }

    /**
     * <p>
     * A list of tags that you want to attach to the account when it becomes a member of the organization. For each tag
     * in the list, you must specify both a tag key and a value. You can set the value to an empty string, but you can't
     * set it to <code>null</code>. For more information about tagging, see <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_tagging.html">Tagging AWS Organizations
     * resources</a> in the AWS Organizations User Guide.
     * </p>
     * <important>
     * <p>
     * Any tags in the request are checked for compliance with any applicable tag policies when the request is made. The
     * request is rejected if the tags in the request don't match the requirements of the policy at that time. Tag
     * policy compliance is <i> <b>not</b> </i> checked again when the invitation is accepted and the tags are actually
     * attached to the account. That means that if the tag policy changes between the invitation and the acceptance,
     * then that tags could potentially be non-compliant.
     * </p>
     * </important> <note>
     * <p>
     * If any one of the tags is invalid or if you exceed the allowed number of tags for an account, then the entire
     * request fails and invitations are not sent.
     * </p>
     * </note>
     * 
     * @return A list of tags that you want to attach to the account when it becomes a member of the organization. For
     *         each tag in the list, you must specify both a tag key and a value. You can set the value to an empty
     *         string, but you can't set it to <code>null</code>. For more information about tagging, see <a
     *         href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_tagging.html">Tagging AWS
     *         Organizations resources</a> in the AWS Organizations User Guide.</p> <important>
     *         <p>
     *         Any tags in the request are checked for compliance with any applicable tag policies when the request is
     *         made. The request is rejected if the tags in the request don't match the requirements of the policy at
     *         that time. Tag policy compliance is <i> <b>not</b> </i> checked again when the invitation is accepted and
     *         the tags are actually attached to the account. That means that if the tag policy changes between the
     *         invitation and the acceptance, then that tags could potentially be non-compliant.
     *         </p>
     *         </important> <note>
     *         <p>
     *         If any one of the tags is invalid or if you exceed the allowed number of tags for an account, then the
     *         entire request fails and invitations are not sent.
     *         </p>
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of tags that you want to attach to the account when it becomes a member of the organization. For each tag
     * in the list, you must specify both a tag key and a value. You can set the value to an empty string, but you can't
     * set it to <code>null</code>. For more information about tagging, see <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_tagging.html">Tagging AWS Organizations
     * resources</a> in the AWS Organizations User Guide.
     * </p>
     * <important>
     * <p>
     * Any tags in the request are checked for compliance with any applicable tag policies when the request is made. The
     * request is rejected if the tags in the request don't match the requirements of the policy at that time. Tag
     * policy compliance is <i> <b>not</b> </i> checked again when the invitation is accepted and the tags are actually
     * attached to the account. That means that if the tag policy changes between the invitation and the acceptance,
     * then that tags could potentially be non-compliant.
     * </p>
     * </important> <note>
     * <p>
     * If any one of the tags is invalid or if you exceed the allowed number of tags for an account, then the entire
     * request fails and invitations are not sent.
     * </p>
     * </note>
     * 
     * @param tags
     *        A list of tags that you want to attach to the account when it becomes a member of the organization. For
     *        each tag in the list, you must specify both a tag key and a value. You can set the value to an empty
     *        string, but you can't set it to <code>null</code>. For more information about tagging, see <a
     *        href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_tagging.html">Tagging AWS
     *        Organizations resources</a> in the AWS Organizations User Guide.</p> <important>
     *        <p>
     *        Any tags in the request are checked for compliance with any applicable tag policies when the request is
     *        made. The request is rejected if the tags in the request don't match the requirements of the policy at
     *        that time. Tag policy compliance is <i> <b>not</b> </i> checked again when the invitation is accepted and
     *        the tags are actually attached to the account. That means that if the tag policy changes between the
     *        invitation and the acceptance, then that tags could potentially be non-compliant.
     *        </p>
     *        </important> <note>
     *        <p>
     *        If any one of the tags is invalid or if you exceed the allowed number of tags for an account, then the
     *        entire request fails and invitations are not sent.
     *        </p>
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * A list of tags that you want to attach to the account when it becomes a member of the organization. For each tag
     * in the list, you must specify both a tag key and a value. You can set the value to an empty string, but you can't
     * set it to <code>null</code>. For more information about tagging, see <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_tagging.html">Tagging AWS Organizations
     * resources</a> in the AWS Organizations User Guide.
     * </p>
     * <important>
     * <p>
     * Any tags in the request are checked for compliance with any applicable tag policies when the request is made. The
     * request is rejected if the tags in the request don't match the requirements of the policy at that time. Tag
     * policy compliance is <i> <b>not</b> </i> checked again when the invitation is accepted and the tags are actually
     * attached to the account. That means that if the tag policy changes between the invitation and the acceptance,
     * then that tags could potentially be non-compliant.
     * </p>
     * </important> <note>
     * <p>
     * If any one of the tags is invalid or if you exceed the allowed number of tags for an account, then the entire
     * request fails and invitations are not sent.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of tags that you want to attach to the account when it becomes a member of the organization. For
     *        each tag in the list, you must specify both a tag key and a value. You can set the value to an empty
     *        string, but you can't set it to <code>null</code>. For more information about tagging, see <a
     *        href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_tagging.html">Tagging AWS
     *        Organizations resources</a> in the AWS Organizations User Guide.</p> <important>
     *        <p>
     *        Any tags in the request are checked for compliance with any applicable tag policies when the request is
     *        made. The request is rejected if the tags in the request don't match the requirements of the policy at
     *        that time. Tag policy compliance is <i> <b>not</b> </i> checked again when the invitation is accepted and
     *        the tags are actually attached to the account. That means that if the tag policy changes between the
     *        invitation and the acceptance, then that tags could potentially be non-compliant.
     *        </p>
     *        </important> <note>
     *        <p>
     *        If any one of the tags is invalid or if you exceed the allowed number of tags for an account, then the
     *        entire request fails and invitations are not sent.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InviteAccountToOrganizationRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of tags that you want to attach to the account when it becomes a member of the organization. For each tag
     * in the list, you must specify both a tag key and a value. You can set the value to an empty string, but you can't
     * set it to <code>null</code>. For more information about tagging, see <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_tagging.html">Tagging AWS Organizations
     * resources</a> in the AWS Organizations User Guide.
     * </p>
     * <important>
     * <p>
     * Any tags in the request are checked for compliance with any applicable tag policies when the request is made. The
     * request is rejected if the tags in the request don't match the requirements of the policy at that time. Tag
     * policy compliance is <i> <b>not</b> </i> checked again when the invitation is accepted and the tags are actually
     * attached to the account. That means that if the tag policy changes between the invitation and the acceptance,
     * then that tags could potentially be non-compliant.
     * </p>
     * </important> <note>
     * <p>
     * If any one of the tags is invalid or if you exceed the allowed number of tags for an account, then the entire
     * request fails and invitations are not sent.
     * </p>
     * </note>
     * 
     * @param tags
     *        A list of tags that you want to attach to the account when it becomes a member of the organization. For
     *        each tag in the list, you must specify both a tag key and a value. You can set the value to an empty
     *        string, but you can't set it to <code>null</code>. For more information about tagging, see <a
     *        href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_tagging.html">Tagging AWS
     *        Organizations resources</a> in the AWS Organizations User Guide.</p> <important>
     *        <p>
     *        Any tags in the request are checked for compliance with any applicable tag policies when the request is
     *        made. The request is rejected if the tags in the request don't match the requirements of the policy at
     *        that time. Tag policy compliance is <i> <b>not</b> </i> checked again when the invitation is accepted and
     *        the tags are actually attached to the account. That means that if the tag policy changes between the
     *        invitation and the acceptance, then that tags could potentially be non-compliant.
     *        </p>
     *        </important> <note>
     *        <p>
     *        If any one of the tags is invalid or if you exceed the allowed number of tags for an account, then the
     *        entire request fails and invitations are not sent.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InviteAccountToOrganizationRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getTarget() != null)
            sb.append("Target: ").append(getTarget()).append(",");
        if (getNotes() != null)
            sb.append("Notes: ").append("***Sensitive Data Redacted***").append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InviteAccountToOrganizationRequest == false)
            return false;
        InviteAccountToOrganizationRequest other = (InviteAccountToOrganizationRequest) obj;
        if (other.getTarget() == null ^ this.getTarget() == null)
            return false;
        if (other.getTarget() != null && other.getTarget().equals(this.getTarget()) == false)
            return false;
        if (other.getNotes() == null ^ this.getNotes() == null)
            return false;
        if (other.getNotes() != null && other.getNotes().equals(this.getNotes()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTarget() == null) ? 0 : getTarget().hashCode());
        hashCode = prime * hashCode + ((getNotes() == null) ? 0 : getNotes().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public InviteAccountToOrganizationRequest clone() {
        return (InviteAccountToOrganizationRequest) super.clone();
    }

}
