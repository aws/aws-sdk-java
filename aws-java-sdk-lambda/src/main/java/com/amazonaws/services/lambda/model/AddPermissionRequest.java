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
package com.amazonaws.services.lambda.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/AddPermission" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AddPermissionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the Lambda function, version, or alias.
     * </p>
     * <p class="title">
     * <b>Name formats</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Function name</b> - <code>my-function</code> (name-only), <code>my-function:v1</code> (with alias).
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Function ARN</b> - <code>arn:aws:lambda:us-west-2:123456789012:function:my-function</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Partial ARN</b> - <code>123456789012:function:my-function</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can append a version number or alias to any of the formats. The length constraint applies only to the full
     * ARN. If you specify only the function name, it is limited to 64 characters in length.
     * </p>
     */
    private String functionName;
    /**
     * <p>
     * A statement identifier that differentiates the statement from others in the same policy.
     * </p>
     */
    private String statementId;
    /**
     * <p>
     * The action that the principal can use on the function. For example, <code>lambda:InvokeFunction</code> or
     * <code>lambda:GetFunction</code>.
     * </p>
     */
    private String action;
    /**
     * <p>
     * The AWS service or account that invokes the function. If you specify a service, use <code>SourceArn</code> or
     * <code>SourceAccount</code> to limit who can invoke the function through that service.
     * </p>
     */
    private String principal;
    /**
     * <p>
     * For AWS services, the ARN of the AWS resource that invokes the function. For example, an Amazon S3 bucket or
     * Amazon SNS topic.
     * </p>
     */
    private String sourceArn;
    /**
     * <p>
     * For AWS services, the ID of the account that owns the resource. Use this instead of <code>SourceArn</code> to
     * grant permission to resources that are owned by another account (for example, all of an account's Amazon S3
     * buckets). Or use it together with <code>SourceArn</code> to ensure that the resource is owned by the specified
     * account. For example, an Amazon S3 bucket could be deleted by its owner and recreated by another account.
     * </p>
     */
    private String sourceAccount;
    /**
     * <p>
     * For Alexa Smart Home functions, a token that must be supplied by the invoker.
     * </p>
     */
    private String eventSourceToken;
    /**
     * <p>
     * Specify a version or alias to add permissions to a published version of the function.
     * </p>
     */
    private String qualifier;
    /**
     * <p>
     * Only update the policy if the revision ID matches the ID that's specified. Use this option to avoid modifying a
     * policy that has changed since you last read it.
     * </p>
     */
    private String revisionId;

    /**
     * <p>
     * The name of the Lambda function, version, or alias.
     * </p>
     * <p class="title">
     * <b>Name formats</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Function name</b> - <code>my-function</code> (name-only), <code>my-function:v1</code> (with alias).
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Function ARN</b> - <code>arn:aws:lambda:us-west-2:123456789012:function:my-function</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Partial ARN</b> - <code>123456789012:function:my-function</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can append a version number or alias to any of the formats. The length constraint applies only to the full
     * ARN. If you specify only the function name, it is limited to 64 characters in length.
     * </p>
     * 
     * @param functionName
     *        The name of the Lambda function, version, or alias.</p>
     *        <p class="title">
     *        <b>Name formats</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>Function name</b> - <code>my-function</code> (name-only), <code>my-function:v1</code> (with alias).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Function ARN</b> - <code>arn:aws:lambda:us-west-2:123456789012:function:my-function</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Partial ARN</b> - <code>123456789012:function:my-function</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        You can append a version number or alias to any of the formats. The length constraint applies only to the
     *        full ARN. If you specify only the function name, it is limited to 64 characters in length.
     */

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    /**
     * <p>
     * The name of the Lambda function, version, or alias.
     * </p>
     * <p class="title">
     * <b>Name formats</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Function name</b> - <code>my-function</code> (name-only), <code>my-function:v1</code> (with alias).
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Function ARN</b> - <code>arn:aws:lambda:us-west-2:123456789012:function:my-function</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Partial ARN</b> - <code>123456789012:function:my-function</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can append a version number or alias to any of the formats. The length constraint applies only to the full
     * ARN. If you specify only the function name, it is limited to 64 characters in length.
     * </p>
     * 
     * @return The name of the Lambda function, version, or alias.</p>
     *         <p class="title">
     *         <b>Name formats</b>
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>Function name</b> - <code>my-function</code> (name-only), <code>my-function:v1</code> (with alias).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Function ARN</b> - <code>arn:aws:lambda:us-west-2:123456789012:function:my-function</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Partial ARN</b> - <code>123456789012:function:my-function</code>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         You can append a version number or alias to any of the formats. The length constraint applies only to the
     *         full ARN. If you specify only the function name, it is limited to 64 characters in length.
     */

    public String getFunctionName() {
        return this.functionName;
    }

    /**
     * <p>
     * The name of the Lambda function, version, or alias.
     * </p>
     * <p class="title">
     * <b>Name formats</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Function name</b> - <code>my-function</code> (name-only), <code>my-function:v1</code> (with alias).
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Function ARN</b> - <code>arn:aws:lambda:us-west-2:123456789012:function:my-function</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Partial ARN</b> - <code>123456789012:function:my-function</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can append a version number or alias to any of the formats. The length constraint applies only to the full
     * ARN. If you specify only the function name, it is limited to 64 characters in length.
     * </p>
     * 
     * @param functionName
     *        The name of the Lambda function, version, or alias.</p>
     *        <p class="title">
     *        <b>Name formats</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>Function name</b> - <code>my-function</code> (name-only), <code>my-function:v1</code> (with alias).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Function ARN</b> - <code>arn:aws:lambda:us-west-2:123456789012:function:my-function</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Partial ARN</b> - <code>123456789012:function:my-function</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        You can append a version number or alias to any of the formats. The length constraint applies only to the
     *        full ARN. If you specify only the function name, it is limited to 64 characters in length.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddPermissionRequest withFunctionName(String functionName) {
        setFunctionName(functionName);
        return this;
    }

    /**
     * <p>
     * A statement identifier that differentiates the statement from others in the same policy.
     * </p>
     * 
     * @param statementId
     *        A statement identifier that differentiates the statement from others in the same policy.
     */

    public void setStatementId(String statementId) {
        this.statementId = statementId;
    }

    /**
     * <p>
     * A statement identifier that differentiates the statement from others in the same policy.
     * </p>
     * 
     * @return A statement identifier that differentiates the statement from others in the same policy.
     */

    public String getStatementId() {
        return this.statementId;
    }

    /**
     * <p>
     * A statement identifier that differentiates the statement from others in the same policy.
     * </p>
     * 
     * @param statementId
     *        A statement identifier that differentiates the statement from others in the same policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddPermissionRequest withStatementId(String statementId) {
        setStatementId(statementId);
        return this;
    }

    /**
     * <p>
     * The action that the principal can use on the function. For example, <code>lambda:InvokeFunction</code> or
     * <code>lambda:GetFunction</code>.
     * </p>
     * 
     * @param action
     *        The action that the principal can use on the function. For example, <code>lambda:InvokeFunction</code> or
     *        <code>lambda:GetFunction</code>.
     */

    public void setAction(String action) {
        this.action = action;
    }

    /**
     * <p>
     * The action that the principal can use on the function. For example, <code>lambda:InvokeFunction</code> or
     * <code>lambda:GetFunction</code>.
     * </p>
     * 
     * @return The action that the principal can use on the function. For example, <code>lambda:InvokeFunction</code> or
     *         <code>lambda:GetFunction</code>.
     */

    public String getAction() {
        return this.action;
    }

    /**
     * <p>
     * The action that the principal can use on the function. For example, <code>lambda:InvokeFunction</code> or
     * <code>lambda:GetFunction</code>.
     * </p>
     * 
     * @param action
     *        The action that the principal can use on the function. For example, <code>lambda:InvokeFunction</code> or
     *        <code>lambda:GetFunction</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddPermissionRequest withAction(String action) {
        setAction(action);
        return this;
    }

    /**
     * <p>
     * The AWS service or account that invokes the function. If you specify a service, use <code>SourceArn</code> or
     * <code>SourceAccount</code> to limit who can invoke the function through that service.
     * </p>
     * 
     * @param principal
     *        The AWS service or account that invokes the function. If you specify a service, use <code>SourceArn</code>
     *        or <code>SourceAccount</code> to limit who can invoke the function through that service.
     */

    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    /**
     * <p>
     * The AWS service or account that invokes the function. If you specify a service, use <code>SourceArn</code> or
     * <code>SourceAccount</code> to limit who can invoke the function through that service.
     * </p>
     * 
     * @return The AWS service or account that invokes the function. If you specify a service, use
     *         <code>SourceArn</code> or <code>SourceAccount</code> to limit who can invoke the function through that
     *         service.
     */

    public String getPrincipal() {
        return this.principal;
    }

    /**
     * <p>
     * The AWS service or account that invokes the function. If you specify a service, use <code>SourceArn</code> or
     * <code>SourceAccount</code> to limit who can invoke the function through that service.
     * </p>
     * 
     * @param principal
     *        The AWS service or account that invokes the function. If you specify a service, use <code>SourceArn</code>
     *        or <code>SourceAccount</code> to limit who can invoke the function through that service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddPermissionRequest withPrincipal(String principal) {
        setPrincipal(principal);
        return this;
    }

    /**
     * <p>
     * For AWS services, the ARN of the AWS resource that invokes the function. For example, an Amazon S3 bucket or
     * Amazon SNS topic.
     * </p>
     * 
     * @param sourceArn
     *        For AWS services, the ARN of the AWS resource that invokes the function. For example, an Amazon S3 bucket
     *        or Amazon SNS topic.
     */

    public void setSourceArn(String sourceArn) {
        this.sourceArn = sourceArn;
    }

    /**
     * <p>
     * For AWS services, the ARN of the AWS resource that invokes the function. For example, an Amazon S3 bucket or
     * Amazon SNS topic.
     * </p>
     * 
     * @return For AWS services, the ARN of the AWS resource that invokes the function. For example, an Amazon S3 bucket
     *         or Amazon SNS topic.
     */

    public String getSourceArn() {
        return this.sourceArn;
    }

    /**
     * <p>
     * For AWS services, the ARN of the AWS resource that invokes the function. For example, an Amazon S3 bucket or
     * Amazon SNS topic.
     * </p>
     * 
     * @param sourceArn
     *        For AWS services, the ARN of the AWS resource that invokes the function. For example, an Amazon S3 bucket
     *        or Amazon SNS topic.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddPermissionRequest withSourceArn(String sourceArn) {
        setSourceArn(sourceArn);
        return this;
    }

    /**
     * <p>
     * For AWS services, the ID of the account that owns the resource. Use this instead of <code>SourceArn</code> to
     * grant permission to resources that are owned by another account (for example, all of an account's Amazon S3
     * buckets). Or use it together with <code>SourceArn</code> to ensure that the resource is owned by the specified
     * account. For example, an Amazon S3 bucket could be deleted by its owner and recreated by another account.
     * </p>
     * 
     * @param sourceAccount
     *        For AWS services, the ID of the account that owns the resource. Use this instead of <code>SourceArn</code>
     *        to grant permission to resources that are owned by another account (for example, all of an account's
     *        Amazon S3 buckets). Or use it together with <code>SourceArn</code> to ensure that the resource is owned by
     *        the specified account. For example, an Amazon S3 bucket could be deleted by its owner and recreated by
     *        another account.
     */

    public void setSourceAccount(String sourceAccount) {
        this.sourceAccount = sourceAccount;
    }

    /**
     * <p>
     * For AWS services, the ID of the account that owns the resource. Use this instead of <code>SourceArn</code> to
     * grant permission to resources that are owned by another account (for example, all of an account's Amazon S3
     * buckets). Or use it together with <code>SourceArn</code> to ensure that the resource is owned by the specified
     * account. For example, an Amazon S3 bucket could be deleted by its owner and recreated by another account.
     * </p>
     * 
     * @return For AWS services, the ID of the account that owns the resource. Use this instead of
     *         <code>SourceArn</code> to grant permission to resources that are owned by another account (for example,
     *         all of an account's Amazon S3 buckets). Or use it together with <code>SourceArn</code> to ensure that the
     *         resource is owned by the specified account. For example, an Amazon S3 bucket could be deleted by its
     *         owner and recreated by another account.
     */

    public String getSourceAccount() {
        return this.sourceAccount;
    }

    /**
     * <p>
     * For AWS services, the ID of the account that owns the resource. Use this instead of <code>SourceArn</code> to
     * grant permission to resources that are owned by another account (for example, all of an account's Amazon S3
     * buckets). Or use it together with <code>SourceArn</code> to ensure that the resource is owned by the specified
     * account. For example, an Amazon S3 bucket could be deleted by its owner and recreated by another account.
     * </p>
     * 
     * @param sourceAccount
     *        For AWS services, the ID of the account that owns the resource. Use this instead of <code>SourceArn</code>
     *        to grant permission to resources that are owned by another account (for example, all of an account's
     *        Amazon S3 buckets). Or use it together with <code>SourceArn</code> to ensure that the resource is owned by
     *        the specified account. For example, an Amazon S3 bucket could be deleted by its owner and recreated by
     *        another account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddPermissionRequest withSourceAccount(String sourceAccount) {
        setSourceAccount(sourceAccount);
        return this;
    }

    /**
     * <p>
     * For Alexa Smart Home functions, a token that must be supplied by the invoker.
     * </p>
     * 
     * @param eventSourceToken
     *        For Alexa Smart Home functions, a token that must be supplied by the invoker.
     */

    public void setEventSourceToken(String eventSourceToken) {
        this.eventSourceToken = eventSourceToken;
    }

    /**
     * <p>
     * For Alexa Smart Home functions, a token that must be supplied by the invoker.
     * </p>
     * 
     * @return For Alexa Smart Home functions, a token that must be supplied by the invoker.
     */

    public String getEventSourceToken() {
        return this.eventSourceToken;
    }

    /**
     * <p>
     * For Alexa Smart Home functions, a token that must be supplied by the invoker.
     * </p>
     * 
     * @param eventSourceToken
     *        For Alexa Smart Home functions, a token that must be supplied by the invoker.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddPermissionRequest withEventSourceToken(String eventSourceToken) {
        setEventSourceToken(eventSourceToken);
        return this;
    }

    /**
     * <p>
     * Specify a version or alias to add permissions to a published version of the function.
     * </p>
     * 
     * @param qualifier
     *        Specify a version or alias to add permissions to a published version of the function.
     */

    public void setQualifier(String qualifier) {
        this.qualifier = qualifier;
    }

    /**
     * <p>
     * Specify a version or alias to add permissions to a published version of the function.
     * </p>
     * 
     * @return Specify a version or alias to add permissions to a published version of the function.
     */

    public String getQualifier() {
        return this.qualifier;
    }

    /**
     * <p>
     * Specify a version or alias to add permissions to a published version of the function.
     * </p>
     * 
     * @param qualifier
     *        Specify a version or alias to add permissions to a published version of the function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddPermissionRequest withQualifier(String qualifier) {
        setQualifier(qualifier);
        return this;
    }

    /**
     * <p>
     * Only update the policy if the revision ID matches the ID that's specified. Use this option to avoid modifying a
     * policy that has changed since you last read it.
     * </p>
     * 
     * @param revisionId
     *        Only update the policy if the revision ID matches the ID that's specified. Use this option to avoid
     *        modifying a policy that has changed since you last read it.
     */

    public void setRevisionId(String revisionId) {
        this.revisionId = revisionId;
    }

    /**
     * <p>
     * Only update the policy if the revision ID matches the ID that's specified. Use this option to avoid modifying a
     * policy that has changed since you last read it.
     * </p>
     * 
     * @return Only update the policy if the revision ID matches the ID that's specified. Use this option to avoid
     *         modifying a policy that has changed since you last read it.
     */

    public String getRevisionId() {
        return this.revisionId;
    }

    /**
     * <p>
     * Only update the policy if the revision ID matches the ID that's specified. Use this option to avoid modifying a
     * policy that has changed since you last read it.
     * </p>
     * 
     * @param revisionId
     *        Only update the policy if the revision ID matches the ID that's specified. Use this option to avoid
     *        modifying a policy that has changed since you last read it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddPermissionRequest withRevisionId(String revisionId) {
        setRevisionId(revisionId);
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
        if (getFunctionName() != null)
            sb.append("FunctionName: ").append(getFunctionName()).append(",");
        if (getStatementId() != null)
            sb.append("StatementId: ").append(getStatementId()).append(",");
        if (getAction() != null)
            sb.append("Action: ").append(getAction()).append(",");
        if (getPrincipal() != null)
            sb.append("Principal: ").append(getPrincipal()).append(",");
        if (getSourceArn() != null)
            sb.append("SourceArn: ").append(getSourceArn()).append(",");
        if (getSourceAccount() != null)
            sb.append("SourceAccount: ").append(getSourceAccount()).append(",");
        if (getEventSourceToken() != null)
            sb.append("EventSourceToken: ").append(getEventSourceToken()).append(",");
        if (getQualifier() != null)
            sb.append("Qualifier: ").append(getQualifier()).append(",");
        if (getRevisionId() != null)
            sb.append("RevisionId: ").append(getRevisionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AddPermissionRequest == false)
            return false;
        AddPermissionRequest other = (AddPermissionRequest) obj;
        if (other.getFunctionName() == null ^ this.getFunctionName() == null)
            return false;
        if (other.getFunctionName() != null && other.getFunctionName().equals(this.getFunctionName()) == false)
            return false;
        if (other.getStatementId() == null ^ this.getStatementId() == null)
            return false;
        if (other.getStatementId() != null && other.getStatementId().equals(this.getStatementId()) == false)
            return false;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getPrincipal() == null ^ this.getPrincipal() == null)
            return false;
        if (other.getPrincipal() != null && other.getPrincipal().equals(this.getPrincipal()) == false)
            return false;
        if (other.getSourceArn() == null ^ this.getSourceArn() == null)
            return false;
        if (other.getSourceArn() != null && other.getSourceArn().equals(this.getSourceArn()) == false)
            return false;
        if (other.getSourceAccount() == null ^ this.getSourceAccount() == null)
            return false;
        if (other.getSourceAccount() != null && other.getSourceAccount().equals(this.getSourceAccount()) == false)
            return false;
        if (other.getEventSourceToken() == null ^ this.getEventSourceToken() == null)
            return false;
        if (other.getEventSourceToken() != null && other.getEventSourceToken().equals(this.getEventSourceToken()) == false)
            return false;
        if (other.getQualifier() == null ^ this.getQualifier() == null)
            return false;
        if (other.getQualifier() != null && other.getQualifier().equals(this.getQualifier()) == false)
            return false;
        if (other.getRevisionId() == null ^ this.getRevisionId() == null)
            return false;
        if (other.getRevisionId() != null && other.getRevisionId().equals(this.getRevisionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFunctionName() == null) ? 0 : getFunctionName().hashCode());
        hashCode = prime * hashCode + ((getStatementId() == null) ? 0 : getStatementId().hashCode());
        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime * hashCode + ((getPrincipal() == null) ? 0 : getPrincipal().hashCode());
        hashCode = prime * hashCode + ((getSourceArn() == null) ? 0 : getSourceArn().hashCode());
        hashCode = prime * hashCode + ((getSourceAccount() == null) ? 0 : getSourceAccount().hashCode());
        hashCode = prime * hashCode + ((getEventSourceToken() == null) ? 0 : getEventSourceToken().hashCode());
        hashCode = prime * hashCode + ((getQualifier() == null) ? 0 : getQualifier().hashCode());
        hashCode = prime * hashCode + ((getRevisionId() == null) ? 0 : getRevisionId().hashCode());
        return hashCode;
    }

    @Override
    public AddPermissionRequest clone() {
        return (AddPermissionRequest) super.clone();
    }

}
