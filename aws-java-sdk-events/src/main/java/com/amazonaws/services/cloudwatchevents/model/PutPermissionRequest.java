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
package com.amazonaws.services.cloudwatchevents.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/events-2015-10-07/PutPermission" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutPermissionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The action that you are enabling the other account to perform. Currently, this must be
     * <code>events:PutEvents</code>.
     * </p>
     */
    private String action;
    /**
     * <p>
     * The 12-digit AWS account ID that you are permitting to put events to your default event bus. Specify "*" to
     * permit any account to put events to your default event bus.
     * </p>
     * <p>
     * If you specify "*" without specifying <code>Condition</code>, avoid creating rules that may match undesirable
     * events. To create more secure rules, make sure that the event pattern for each rule contains an
     * <code>account</code> field with a specific account ID from which to receive events. Rules with an account field
     * do not match any events sent from other accounts.
     * </p>
     */
    private String principal;
    /**
     * <p>
     * An identifier string for the external account that you are granting permissions to. If you later want to revoke
     * the permission for this external account, specify this <code>StatementId</code> when you run
     * <a>RemovePermission</a>.
     * </p>
     */
    private String statementId;
    /**
     * <p>
     * This parameter enables you to limit the permission to accounts that fulfill a certain condition, such as being a
     * member of a certain AWS organization. For more information about AWS Organizations, see <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_introduction.html">What Is AWS
     * Organizations</a> in the <i>AWS Organizations User Guide</i>.
     * </p>
     * <p>
     * If you specify <code>Condition</code> with an AWS organization ID, and specify "*" as the value for
     * <code>Principal</code>, you grant permission to all the accounts in the named organization.
     * </p>
     * <p>
     * The <code>Condition</code> is a JSON string which must contain <code>Type</code>, <code>Key</code>, and
     * <code>Value</code> fields.
     * </p>
     */
    private Condition condition;

    /**
     * <p>
     * The action that you are enabling the other account to perform. Currently, this must be
     * <code>events:PutEvents</code>.
     * </p>
     * 
     * @param action
     *        The action that you are enabling the other account to perform. Currently, this must be
     *        <code>events:PutEvents</code>.
     */

    public void setAction(String action) {
        this.action = action;
    }

    /**
     * <p>
     * The action that you are enabling the other account to perform. Currently, this must be
     * <code>events:PutEvents</code>.
     * </p>
     * 
     * @return The action that you are enabling the other account to perform. Currently, this must be
     *         <code>events:PutEvents</code>.
     */

    public String getAction() {
        return this.action;
    }

    /**
     * <p>
     * The action that you are enabling the other account to perform. Currently, this must be
     * <code>events:PutEvents</code>.
     * </p>
     * 
     * @param action
     *        The action that you are enabling the other account to perform. Currently, this must be
     *        <code>events:PutEvents</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutPermissionRequest withAction(String action) {
        setAction(action);
        return this;
    }

    /**
     * <p>
     * The 12-digit AWS account ID that you are permitting to put events to your default event bus. Specify "*" to
     * permit any account to put events to your default event bus.
     * </p>
     * <p>
     * If you specify "*" without specifying <code>Condition</code>, avoid creating rules that may match undesirable
     * events. To create more secure rules, make sure that the event pattern for each rule contains an
     * <code>account</code> field with a specific account ID from which to receive events. Rules with an account field
     * do not match any events sent from other accounts.
     * </p>
     * 
     * @param principal
     *        The 12-digit AWS account ID that you are permitting to put events to your default event bus. Specify "*"
     *        to permit any account to put events to your default event bus.</p>
     *        <p>
     *        If you specify "*" without specifying <code>Condition</code>, avoid creating rules that may match
     *        undesirable events. To create more secure rules, make sure that the event pattern for each rule contains
     *        an <code>account</code> field with a specific account ID from which to receive events. Rules with an
     *        account field do not match any events sent from other accounts.
     */

    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    /**
     * <p>
     * The 12-digit AWS account ID that you are permitting to put events to your default event bus. Specify "*" to
     * permit any account to put events to your default event bus.
     * </p>
     * <p>
     * If you specify "*" without specifying <code>Condition</code>, avoid creating rules that may match undesirable
     * events. To create more secure rules, make sure that the event pattern for each rule contains an
     * <code>account</code> field with a specific account ID from which to receive events. Rules with an account field
     * do not match any events sent from other accounts.
     * </p>
     * 
     * @return The 12-digit AWS account ID that you are permitting to put events to your default event bus. Specify "*"
     *         to permit any account to put events to your default event bus.</p>
     *         <p>
     *         If you specify "*" without specifying <code>Condition</code>, avoid creating rules that may match
     *         undesirable events. To create more secure rules, make sure that the event pattern for each rule contains
     *         an <code>account</code> field with a specific account ID from which to receive events. Rules with an
     *         account field do not match any events sent from other accounts.
     */

    public String getPrincipal() {
        return this.principal;
    }

    /**
     * <p>
     * The 12-digit AWS account ID that you are permitting to put events to your default event bus. Specify "*" to
     * permit any account to put events to your default event bus.
     * </p>
     * <p>
     * If you specify "*" without specifying <code>Condition</code>, avoid creating rules that may match undesirable
     * events. To create more secure rules, make sure that the event pattern for each rule contains an
     * <code>account</code> field with a specific account ID from which to receive events. Rules with an account field
     * do not match any events sent from other accounts.
     * </p>
     * 
     * @param principal
     *        The 12-digit AWS account ID that you are permitting to put events to your default event bus. Specify "*"
     *        to permit any account to put events to your default event bus.</p>
     *        <p>
     *        If you specify "*" without specifying <code>Condition</code>, avoid creating rules that may match
     *        undesirable events. To create more secure rules, make sure that the event pattern for each rule contains
     *        an <code>account</code> field with a specific account ID from which to receive events. Rules with an
     *        account field do not match any events sent from other accounts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutPermissionRequest withPrincipal(String principal) {
        setPrincipal(principal);
        return this;
    }

    /**
     * <p>
     * An identifier string for the external account that you are granting permissions to. If you later want to revoke
     * the permission for this external account, specify this <code>StatementId</code> when you run
     * <a>RemovePermission</a>.
     * </p>
     * 
     * @param statementId
     *        An identifier string for the external account that you are granting permissions to. If you later want to
     *        revoke the permission for this external account, specify this <code>StatementId</code> when you run
     *        <a>RemovePermission</a>.
     */

    public void setStatementId(String statementId) {
        this.statementId = statementId;
    }

    /**
     * <p>
     * An identifier string for the external account that you are granting permissions to. If you later want to revoke
     * the permission for this external account, specify this <code>StatementId</code> when you run
     * <a>RemovePermission</a>.
     * </p>
     * 
     * @return An identifier string for the external account that you are granting permissions to. If you later want to
     *         revoke the permission for this external account, specify this <code>StatementId</code> when you run
     *         <a>RemovePermission</a>.
     */

    public String getStatementId() {
        return this.statementId;
    }

    /**
     * <p>
     * An identifier string for the external account that you are granting permissions to. If you later want to revoke
     * the permission for this external account, specify this <code>StatementId</code> when you run
     * <a>RemovePermission</a>.
     * </p>
     * 
     * @param statementId
     *        An identifier string for the external account that you are granting permissions to. If you later want to
     *        revoke the permission for this external account, specify this <code>StatementId</code> when you run
     *        <a>RemovePermission</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutPermissionRequest withStatementId(String statementId) {
        setStatementId(statementId);
        return this;
    }

    /**
     * <p>
     * This parameter enables you to limit the permission to accounts that fulfill a certain condition, such as being a
     * member of a certain AWS organization. For more information about AWS Organizations, see <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_introduction.html">What Is AWS
     * Organizations</a> in the <i>AWS Organizations User Guide</i>.
     * </p>
     * <p>
     * If you specify <code>Condition</code> with an AWS organization ID, and specify "*" as the value for
     * <code>Principal</code>, you grant permission to all the accounts in the named organization.
     * </p>
     * <p>
     * The <code>Condition</code> is a JSON string which must contain <code>Type</code>, <code>Key</code>, and
     * <code>Value</code> fields.
     * </p>
     * 
     * @param condition
     *        This parameter enables you to limit the permission to accounts that fulfill a certain condition, such as
     *        being a member of a certain AWS organization. For more information about AWS Organizations, see <a
     *        href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_introduction.html">What Is AWS
     *        Organizations</a> in the <i>AWS Organizations User Guide</i>.</p>
     *        <p>
     *        If you specify <code>Condition</code> with an AWS organization ID, and specify "*" as the value for
     *        <code>Principal</code>, you grant permission to all the accounts in the named organization.
     *        </p>
     *        <p>
     *        The <code>Condition</code> is a JSON string which must contain <code>Type</code>, <code>Key</code>, and
     *        <code>Value</code> fields.
     */

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    /**
     * <p>
     * This parameter enables you to limit the permission to accounts that fulfill a certain condition, such as being a
     * member of a certain AWS organization. For more information about AWS Organizations, see <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_introduction.html">What Is AWS
     * Organizations</a> in the <i>AWS Organizations User Guide</i>.
     * </p>
     * <p>
     * If you specify <code>Condition</code> with an AWS organization ID, and specify "*" as the value for
     * <code>Principal</code>, you grant permission to all the accounts in the named organization.
     * </p>
     * <p>
     * The <code>Condition</code> is a JSON string which must contain <code>Type</code>, <code>Key</code>, and
     * <code>Value</code> fields.
     * </p>
     * 
     * @return This parameter enables you to limit the permission to accounts that fulfill a certain condition, such as
     *         being a member of a certain AWS organization. For more information about AWS Organizations, see <a
     *         href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_introduction.html">What Is AWS
     *         Organizations</a> in the <i>AWS Organizations User Guide</i>.</p>
     *         <p>
     *         If you specify <code>Condition</code> with an AWS organization ID, and specify "*" as the value for
     *         <code>Principal</code>, you grant permission to all the accounts in the named organization.
     *         </p>
     *         <p>
     *         The <code>Condition</code> is a JSON string which must contain <code>Type</code>, <code>Key</code>, and
     *         <code>Value</code> fields.
     */

    public Condition getCondition() {
        return this.condition;
    }

    /**
     * <p>
     * This parameter enables you to limit the permission to accounts that fulfill a certain condition, such as being a
     * member of a certain AWS organization. For more information about AWS Organizations, see <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_introduction.html">What Is AWS
     * Organizations</a> in the <i>AWS Organizations User Guide</i>.
     * </p>
     * <p>
     * If you specify <code>Condition</code> with an AWS organization ID, and specify "*" as the value for
     * <code>Principal</code>, you grant permission to all the accounts in the named organization.
     * </p>
     * <p>
     * The <code>Condition</code> is a JSON string which must contain <code>Type</code>, <code>Key</code>, and
     * <code>Value</code> fields.
     * </p>
     * 
     * @param condition
     *        This parameter enables you to limit the permission to accounts that fulfill a certain condition, such as
     *        being a member of a certain AWS organization. For more information about AWS Organizations, see <a
     *        href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_introduction.html">What Is AWS
     *        Organizations</a> in the <i>AWS Organizations User Guide</i>.</p>
     *        <p>
     *        If you specify <code>Condition</code> with an AWS organization ID, and specify "*" as the value for
     *        <code>Principal</code>, you grant permission to all the accounts in the named organization.
     *        </p>
     *        <p>
     *        The <code>Condition</code> is a JSON string which must contain <code>Type</code>, <code>Key</code>, and
     *        <code>Value</code> fields.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutPermissionRequest withCondition(Condition condition) {
        setCondition(condition);
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
        if (getAction() != null)
            sb.append("Action: ").append(getAction()).append(",");
        if (getPrincipal() != null)
            sb.append("Principal: ").append(getPrincipal()).append(",");
        if (getStatementId() != null)
            sb.append("StatementId: ").append(getStatementId()).append(",");
        if (getCondition() != null)
            sb.append("Condition: ").append(getCondition());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutPermissionRequest == false)
            return false;
        PutPermissionRequest other = (PutPermissionRequest) obj;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getPrincipal() == null ^ this.getPrincipal() == null)
            return false;
        if (other.getPrincipal() != null && other.getPrincipal().equals(this.getPrincipal()) == false)
            return false;
        if (other.getStatementId() == null ^ this.getStatementId() == null)
            return false;
        if (other.getStatementId() != null && other.getStatementId().equals(this.getStatementId()) == false)
            return false;
        if (other.getCondition() == null ^ this.getCondition() == null)
            return false;
        if (other.getCondition() != null && other.getCondition().equals(this.getCondition()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime * hashCode + ((getPrincipal() == null) ? 0 : getPrincipal().hashCode());
        hashCode = prime * hashCode + ((getStatementId() == null) ? 0 : getStatementId().hashCode());
        hashCode = prime * hashCode + ((getCondition() == null) ? 0 : getCondition().hashCode());
        return hashCode;
    }

    @Override
    public PutPermissionRequest clone() {
        return (PutPermissionRequest) super.clone();
    }

}
