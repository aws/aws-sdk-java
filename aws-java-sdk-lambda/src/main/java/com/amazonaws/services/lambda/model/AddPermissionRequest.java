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
     * The name of the Lambda function.
     * </p>
     * <p class="title">
     * <b>Name formats</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Function name</b> - <code>MyFunction</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Function ARN</b> - <code>arn:aws:lambda:us-west-2:123456789012:function:MyFunction</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Partial ARN</b> - <code>123456789012:function:MyFunction</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The length constraint applies only to the full ARN. If you specify only the function name, it is limited to 64
     * characters in length.
     * </p>
     */
    private String functionName;
    /**
     * <p>
     * A unique statement identifier.
     * </p>
     */
    private String statementId;
    /**
     * <p>
     * The AWS Lambda action you want to allow in this statement. Each Lambda action is a string starting with
     * <code>lambda:</code> followed by the API name . For example, <code>lambda:CreateFunction</code>. You can use
     * wildcard (<code>lambda:*</code>) to grant permission for all AWS Lambda actions.
     * </p>
     */
    private String action;
    /**
     * <p>
     * The principal who is getting this permission. The principal can be an AWS service (e.g.
     * <code>s3.amazonaws.com</code> or <code>sns.amazonaws.com</code>) for service triggers, or an account ID for
     * cross-account access. If you specify a service as a principal, use the <code>SourceArn</code> parameter to limit
     * who can invoke the function through that service.
     * </p>
     */
    private String principal;
    /**
     * <p>
     * The Amazon Resource Name of the invoker.
     * </p>
     * <important>
     * <p>
     * If you add a permission to a service principal without providing the source ARN, any AWS account that creates a
     * mapping to your function ARN can invoke your Lambda function.
     * </p>
     * </important>
     */
    private String sourceArn;
    /**
     * <p>
     * This parameter is used for S3 and SES. The AWS account ID (without a hyphen) of the source owner. For example, if
     * the <code>SourceArn</code> identifies a bucket, then this is the bucket owner's account ID. You can use this
     * additional condition to ensure the bucket you specify is owned by a specific account (it is possible the bucket
     * owner deleted the bucket and some other AWS account created the bucket). You can also use this condition to
     * specify all sources (that is, you don't specify the <code>SourceArn</code>) owned by a specific account.
     * </p>
     */
    private String sourceAccount;
    /**
     * <p>
     * A unique token that must be supplied by the principal invoking the function. This is currently only used for
     * Alexa Smart Home functions.
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
     * An optional value you can use to ensure you are updating the latest update of the function version or alias. If
     * the <code>RevisionID</code> you pass doesn't match the latest <code>RevisionId</code> of the function or alias,
     * it will fail with an error message, advising you to retrieve the latest function version or alias
     * <code>RevisionID</code> using either <a>GetFunction</a> or <a>GetAlias</a>
     * </p>
     */
    private String revisionId;

    /**
     * <p>
     * The name of the Lambda function.
     * </p>
     * <p class="title">
     * <b>Name formats</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Function name</b> - <code>MyFunction</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Function ARN</b> - <code>arn:aws:lambda:us-west-2:123456789012:function:MyFunction</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Partial ARN</b> - <code>123456789012:function:MyFunction</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The length constraint applies only to the full ARN. If you specify only the function name, it is limited to 64
     * characters in length.
     * </p>
     * 
     * @param functionName
     *        The name of the Lambda function.</p>
     *        <p class="title">
     *        <b>Name formats</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>Function name</b> - <code>MyFunction</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Function ARN</b> - <code>arn:aws:lambda:us-west-2:123456789012:function:MyFunction</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Partial ARN</b> - <code>123456789012:function:MyFunction</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The length constraint applies only to the full ARN. If you specify only the function name, it is limited
     *        to 64 characters in length.
     */

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    /**
     * <p>
     * The name of the Lambda function.
     * </p>
     * <p class="title">
     * <b>Name formats</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Function name</b> - <code>MyFunction</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Function ARN</b> - <code>arn:aws:lambda:us-west-2:123456789012:function:MyFunction</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Partial ARN</b> - <code>123456789012:function:MyFunction</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The length constraint applies only to the full ARN. If you specify only the function name, it is limited to 64
     * characters in length.
     * </p>
     * 
     * @return The name of the Lambda function.</p>
     *         <p class="title">
     *         <b>Name formats</b>
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>Function name</b> - <code>MyFunction</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Function ARN</b> - <code>arn:aws:lambda:us-west-2:123456789012:function:MyFunction</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Partial ARN</b> - <code>123456789012:function:MyFunction</code>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         The length constraint applies only to the full ARN. If you specify only the function name, it is limited
     *         to 64 characters in length.
     */

    public String getFunctionName() {
        return this.functionName;
    }

    /**
     * <p>
     * The name of the Lambda function.
     * </p>
     * <p class="title">
     * <b>Name formats</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Function name</b> - <code>MyFunction</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Function ARN</b> - <code>arn:aws:lambda:us-west-2:123456789012:function:MyFunction</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Partial ARN</b> - <code>123456789012:function:MyFunction</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The length constraint applies only to the full ARN. If you specify only the function name, it is limited to 64
     * characters in length.
     * </p>
     * 
     * @param functionName
     *        The name of the Lambda function.</p>
     *        <p class="title">
     *        <b>Name formats</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>Function name</b> - <code>MyFunction</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Function ARN</b> - <code>arn:aws:lambda:us-west-2:123456789012:function:MyFunction</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Partial ARN</b> - <code>123456789012:function:MyFunction</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The length constraint applies only to the full ARN. If you specify only the function name, it is limited
     *        to 64 characters in length.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddPermissionRequest withFunctionName(String functionName) {
        setFunctionName(functionName);
        return this;
    }

    /**
     * <p>
     * A unique statement identifier.
     * </p>
     * 
     * @param statementId
     *        A unique statement identifier.
     */

    public void setStatementId(String statementId) {
        this.statementId = statementId;
    }

    /**
     * <p>
     * A unique statement identifier.
     * </p>
     * 
     * @return A unique statement identifier.
     */

    public String getStatementId() {
        return this.statementId;
    }

    /**
     * <p>
     * A unique statement identifier.
     * </p>
     * 
     * @param statementId
     *        A unique statement identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddPermissionRequest withStatementId(String statementId) {
        setStatementId(statementId);
        return this;
    }

    /**
     * <p>
     * The AWS Lambda action you want to allow in this statement. Each Lambda action is a string starting with
     * <code>lambda:</code> followed by the API name . For example, <code>lambda:CreateFunction</code>. You can use
     * wildcard (<code>lambda:*</code>) to grant permission for all AWS Lambda actions.
     * </p>
     * 
     * @param action
     *        The AWS Lambda action you want to allow in this statement. Each Lambda action is a string starting with
     *        <code>lambda:</code> followed by the API name . For example, <code>lambda:CreateFunction</code>. You can
     *        use wildcard (<code>lambda:*</code>) to grant permission for all AWS Lambda actions.
     */

    public void setAction(String action) {
        this.action = action;
    }

    /**
     * <p>
     * The AWS Lambda action you want to allow in this statement. Each Lambda action is a string starting with
     * <code>lambda:</code> followed by the API name . For example, <code>lambda:CreateFunction</code>. You can use
     * wildcard (<code>lambda:*</code>) to grant permission for all AWS Lambda actions.
     * </p>
     * 
     * @return The AWS Lambda action you want to allow in this statement. Each Lambda action is a string starting with
     *         <code>lambda:</code> followed by the API name . For example, <code>lambda:CreateFunction</code>. You can
     *         use wildcard (<code>lambda:*</code>) to grant permission for all AWS Lambda actions.
     */

    public String getAction() {
        return this.action;
    }

    /**
     * <p>
     * The AWS Lambda action you want to allow in this statement. Each Lambda action is a string starting with
     * <code>lambda:</code> followed by the API name . For example, <code>lambda:CreateFunction</code>. You can use
     * wildcard (<code>lambda:*</code>) to grant permission for all AWS Lambda actions.
     * </p>
     * 
     * @param action
     *        The AWS Lambda action you want to allow in this statement. Each Lambda action is a string starting with
     *        <code>lambda:</code> followed by the API name . For example, <code>lambda:CreateFunction</code>. You can
     *        use wildcard (<code>lambda:*</code>) to grant permission for all AWS Lambda actions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddPermissionRequest withAction(String action) {
        setAction(action);
        return this;
    }

    /**
     * <p>
     * The principal who is getting this permission. The principal can be an AWS service (e.g.
     * <code>s3.amazonaws.com</code> or <code>sns.amazonaws.com</code>) for service triggers, or an account ID for
     * cross-account access. If you specify a service as a principal, use the <code>SourceArn</code> parameter to limit
     * who can invoke the function through that service.
     * </p>
     * 
     * @param principal
     *        The principal who is getting this permission. The principal can be an AWS service (e.g.
     *        <code>s3.amazonaws.com</code> or <code>sns.amazonaws.com</code>) for service triggers, or an account ID
     *        for cross-account access. If you specify a service as a principal, use the <code>SourceArn</code>
     *        parameter to limit who can invoke the function through that service.
     */

    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    /**
     * <p>
     * The principal who is getting this permission. The principal can be an AWS service (e.g.
     * <code>s3.amazonaws.com</code> or <code>sns.amazonaws.com</code>) for service triggers, or an account ID for
     * cross-account access. If you specify a service as a principal, use the <code>SourceArn</code> parameter to limit
     * who can invoke the function through that service.
     * </p>
     * 
     * @return The principal who is getting this permission. The principal can be an AWS service (e.g.
     *         <code>s3.amazonaws.com</code> or <code>sns.amazonaws.com</code>) for service triggers, or an account ID
     *         for cross-account access. If you specify a service as a principal, use the <code>SourceArn</code>
     *         parameter to limit who can invoke the function through that service.
     */

    public String getPrincipal() {
        return this.principal;
    }

    /**
     * <p>
     * The principal who is getting this permission. The principal can be an AWS service (e.g.
     * <code>s3.amazonaws.com</code> or <code>sns.amazonaws.com</code>) for service triggers, or an account ID for
     * cross-account access. If you specify a service as a principal, use the <code>SourceArn</code> parameter to limit
     * who can invoke the function through that service.
     * </p>
     * 
     * @param principal
     *        The principal who is getting this permission. The principal can be an AWS service (e.g.
     *        <code>s3.amazonaws.com</code> or <code>sns.amazonaws.com</code>) for service triggers, or an account ID
     *        for cross-account access. If you specify a service as a principal, use the <code>SourceArn</code>
     *        parameter to limit who can invoke the function through that service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddPermissionRequest withPrincipal(String principal) {
        setPrincipal(principal);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name of the invoker.
     * </p>
     * <important>
     * <p>
     * If you add a permission to a service principal without providing the source ARN, any AWS account that creates a
     * mapping to your function ARN can invoke your Lambda function.
     * </p>
     * </important>
     * 
     * @param sourceArn
     *        The Amazon Resource Name of the invoker. </p> <important>
     *        <p>
     *        If you add a permission to a service principal without providing the source ARN, any AWS account that
     *        creates a mapping to your function ARN can invoke your Lambda function.
     *        </p>
     */

    public void setSourceArn(String sourceArn) {
        this.sourceArn = sourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name of the invoker.
     * </p>
     * <important>
     * <p>
     * If you add a permission to a service principal without providing the source ARN, any AWS account that creates a
     * mapping to your function ARN can invoke your Lambda function.
     * </p>
     * </important>
     * 
     * @return The Amazon Resource Name of the invoker. </p> <important>
     *         <p>
     *         If you add a permission to a service principal without providing the source ARN, any AWS account that
     *         creates a mapping to your function ARN can invoke your Lambda function.
     *         </p>
     */

    public String getSourceArn() {
        return this.sourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name of the invoker.
     * </p>
     * <important>
     * <p>
     * If you add a permission to a service principal without providing the source ARN, any AWS account that creates a
     * mapping to your function ARN can invoke your Lambda function.
     * </p>
     * </important>
     * 
     * @param sourceArn
     *        The Amazon Resource Name of the invoker. </p> <important>
     *        <p>
     *        If you add a permission to a service principal without providing the source ARN, any AWS account that
     *        creates a mapping to your function ARN can invoke your Lambda function.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddPermissionRequest withSourceArn(String sourceArn) {
        setSourceArn(sourceArn);
        return this;
    }

    /**
     * <p>
     * This parameter is used for S3 and SES. The AWS account ID (without a hyphen) of the source owner. For example, if
     * the <code>SourceArn</code> identifies a bucket, then this is the bucket owner's account ID. You can use this
     * additional condition to ensure the bucket you specify is owned by a specific account (it is possible the bucket
     * owner deleted the bucket and some other AWS account created the bucket). You can also use this condition to
     * specify all sources (that is, you don't specify the <code>SourceArn</code>) owned by a specific account.
     * </p>
     * 
     * @param sourceAccount
     *        This parameter is used for S3 and SES. The AWS account ID (without a hyphen) of the source owner. For
     *        example, if the <code>SourceArn</code> identifies a bucket, then this is the bucket owner's account ID.
     *        You can use this additional condition to ensure the bucket you specify is owned by a specific account (it
     *        is possible the bucket owner deleted the bucket and some other AWS account created the bucket). You can
     *        also use this condition to specify all sources (that is, you don't specify the <code>SourceArn</code>)
     *        owned by a specific account.
     */

    public void setSourceAccount(String sourceAccount) {
        this.sourceAccount = sourceAccount;
    }

    /**
     * <p>
     * This parameter is used for S3 and SES. The AWS account ID (without a hyphen) of the source owner. For example, if
     * the <code>SourceArn</code> identifies a bucket, then this is the bucket owner's account ID. You can use this
     * additional condition to ensure the bucket you specify is owned by a specific account (it is possible the bucket
     * owner deleted the bucket and some other AWS account created the bucket). You can also use this condition to
     * specify all sources (that is, you don't specify the <code>SourceArn</code>) owned by a specific account.
     * </p>
     * 
     * @return This parameter is used for S3 and SES. The AWS account ID (without a hyphen) of the source owner. For
     *         example, if the <code>SourceArn</code> identifies a bucket, then this is the bucket owner's account ID.
     *         You can use this additional condition to ensure the bucket you specify is owned by a specific account (it
     *         is possible the bucket owner deleted the bucket and some other AWS account created the bucket). You can
     *         also use this condition to specify all sources (that is, you don't specify the <code>SourceArn</code>)
     *         owned by a specific account.
     */

    public String getSourceAccount() {
        return this.sourceAccount;
    }

    /**
     * <p>
     * This parameter is used for S3 and SES. The AWS account ID (without a hyphen) of the source owner. For example, if
     * the <code>SourceArn</code> identifies a bucket, then this is the bucket owner's account ID. You can use this
     * additional condition to ensure the bucket you specify is owned by a specific account (it is possible the bucket
     * owner deleted the bucket and some other AWS account created the bucket). You can also use this condition to
     * specify all sources (that is, you don't specify the <code>SourceArn</code>) owned by a specific account.
     * </p>
     * 
     * @param sourceAccount
     *        This parameter is used for S3 and SES. The AWS account ID (without a hyphen) of the source owner. For
     *        example, if the <code>SourceArn</code> identifies a bucket, then this is the bucket owner's account ID.
     *        You can use this additional condition to ensure the bucket you specify is owned by a specific account (it
     *        is possible the bucket owner deleted the bucket and some other AWS account created the bucket). You can
     *        also use this condition to specify all sources (that is, you don't specify the <code>SourceArn</code>)
     *        owned by a specific account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddPermissionRequest withSourceAccount(String sourceAccount) {
        setSourceAccount(sourceAccount);
        return this;
    }

    /**
     * <p>
     * A unique token that must be supplied by the principal invoking the function. This is currently only used for
     * Alexa Smart Home functions.
     * </p>
     * 
     * @param eventSourceToken
     *        A unique token that must be supplied by the principal invoking the function. This is currently only used
     *        for Alexa Smart Home functions.
     */

    public void setEventSourceToken(String eventSourceToken) {
        this.eventSourceToken = eventSourceToken;
    }

    /**
     * <p>
     * A unique token that must be supplied by the principal invoking the function. This is currently only used for
     * Alexa Smart Home functions.
     * </p>
     * 
     * @return A unique token that must be supplied by the principal invoking the function. This is currently only used
     *         for Alexa Smart Home functions.
     */

    public String getEventSourceToken() {
        return this.eventSourceToken;
    }

    /**
     * <p>
     * A unique token that must be supplied by the principal invoking the function. This is currently only used for
     * Alexa Smart Home functions.
     * </p>
     * 
     * @param eventSourceToken
     *        A unique token that must be supplied by the principal invoking the function. This is currently only used
     *        for Alexa Smart Home functions.
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
     * An optional value you can use to ensure you are updating the latest update of the function version or alias. If
     * the <code>RevisionID</code> you pass doesn't match the latest <code>RevisionId</code> of the function or alias,
     * it will fail with an error message, advising you to retrieve the latest function version or alias
     * <code>RevisionID</code> using either <a>GetFunction</a> or <a>GetAlias</a>
     * </p>
     * 
     * @param revisionId
     *        An optional value you can use to ensure you are updating the latest update of the function version or
     *        alias. If the <code>RevisionID</code> you pass doesn't match the latest <code>RevisionId</code> of the
     *        function or alias, it will fail with an error message, advising you to retrieve the latest function
     *        version or alias <code>RevisionID</code> using either <a>GetFunction</a> or <a>GetAlias</a>
     */

    public void setRevisionId(String revisionId) {
        this.revisionId = revisionId;
    }

    /**
     * <p>
     * An optional value you can use to ensure you are updating the latest update of the function version or alias. If
     * the <code>RevisionID</code> you pass doesn't match the latest <code>RevisionId</code> of the function or alias,
     * it will fail with an error message, advising you to retrieve the latest function version or alias
     * <code>RevisionID</code> using either <a>GetFunction</a> or <a>GetAlias</a>
     * </p>
     * 
     * @return An optional value you can use to ensure you are updating the latest update of the function version or
     *         alias. If the <code>RevisionID</code> you pass doesn't match the latest <code>RevisionId</code> of the
     *         function or alias, it will fail with an error message, advising you to retrieve the latest function
     *         version or alias <code>RevisionID</code> using either <a>GetFunction</a> or <a>GetAlias</a>
     */

    public String getRevisionId() {
        return this.revisionId;
    }

    /**
     * <p>
     * An optional value you can use to ensure you are updating the latest update of the function version or alias. If
     * the <code>RevisionID</code> you pass doesn't match the latest <code>RevisionId</code> of the function or alias,
     * it will fail with an error message, advising you to retrieve the latest function version or alias
     * <code>RevisionID</code> using either <a>GetFunction</a> or <a>GetAlias</a>
     * </p>
     * 
     * @param revisionId
     *        An optional value you can use to ensure you are updating the latest update of the function version or
     *        alias. If the <code>RevisionID</code> you pass doesn't match the latest <code>RevisionId</code> of the
     *        function or alias, it will fail with an error message, advising you to retrieve the latest function
     *        version or alias <code>RevisionID</code> using either <a>GetFunction</a> or <a>GetAlias</a>
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
