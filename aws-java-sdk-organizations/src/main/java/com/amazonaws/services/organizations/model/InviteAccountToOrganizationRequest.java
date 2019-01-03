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
     * If you specify <code>"Type": "ACCOUNT"</code>, then you must provide the AWS account ID number as the
     * <code>Id</code>. If you specify <code>"Type": "EMAIL"</code>, then you must specify the email address that is
     * associated with the account.
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
     * If you specify <code>"Type": "ACCOUNT"</code>, then you must provide the AWS account ID number as the
     * <code>Id</code>. If you specify <code>"Type": "EMAIL"</code>, then you must specify the email address that is
     * associated with the account.
     * </p>
     * <p>
     * <code>--target Id=diego@example.com,Type=EMAIL</code>
     * </p>
     * 
     * @param target
     *        The identifier (ID) of the AWS account that you want to invite to join your organization. This is a JSON
     *        object that contains the following elements: </p>
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
     *        If you specify <code>"Type": "ACCOUNT"</code>, then you must provide the AWS account ID number as the
     *        <code>Id</code>. If you specify <code>"Type": "EMAIL"</code>, then you must specify the email address that
     *        is associated with the account.
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
     * If you specify <code>"Type": "ACCOUNT"</code>, then you must provide the AWS account ID number as the
     * <code>Id</code>. If you specify <code>"Type": "EMAIL"</code>, then you must specify the email address that is
     * associated with the account.
     * </p>
     * <p>
     * <code>--target Id=diego@example.com,Type=EMAIL</code>
     * </p>
     * 
     * @return The identifier (ID) of the AWS account that you want to invite to join your organization. This is a JSON
     *         object that contains the following elements: </p>
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
     *         If you specify <code>"Type": "ACCOUNT"</code>, then you must provide the AWS account ID number as the
     *         <code>Id</code>. If you specify <code>"Type": "EMAIL"</code>, then you must specify the email address
     *         that is associated with the account.
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
     * If you specify <code>"Type": "ACCOUNT"</code>, then you must provide the AWS account ID number as the
     * <code>Id</code>. If you specify <code>"Type": "EMAIL"</code>, then you must specify the email address that is
     * associated with the account.
     * </p>
     * <p>
     * <code>--target Id=diego@example.com,Type=EMAIL</code>
     * </p>
     * 
     * @param target
     *        The identifier (ID) of the AWS account that you want to invite to join your organization. This is a JSON
     *        object that contains the following elements: </p>
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
     *        If you specify <code>"Type": "ACCOUNT"</code>, then you must provide the AWS account ID number as the
     *        <code>Id</code>. If you specify <code>"Type": "EMAIL"</code>, then you must specify the email address that
     *        is associated with the account.
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
            sb.append("Notes: ").append("***Sensitive Data Redacted***");
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTarget() == null) ? 0 : getTarget().hashCode());
        hashCode = prime * hashCode + ((getNotes() == null) ? 0 : getNotes().hashCode());
        return hashCode;
    }

    @Override
    public InviteAccountToOrganizationRequest clone() {
        return (InviteAccountToOrganizationRequest) super.clone();
    }

}
