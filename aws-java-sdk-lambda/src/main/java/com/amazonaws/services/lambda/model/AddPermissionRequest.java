/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 */
public class AddPermissionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Name of the Lambda function whose resource policy you are updating by adding a new permission.
     * </p>
     * <p>
     * You can specify a function name (for example, <code>Thumbnail</code>) or you can specify Amazon Resource Name
     * (ARN) of the function (for example, <code>arn:aws:lambda:us-west-2:account-id:function:ThumbNail</code>). AWS
     * Lambda also allows you to specify partial ARN (for example, <code>account-id:Thumbnail</code>). Note that the
     * length constraint applies only to the ARN. If you specify only the function name, it is limited to 64 character
     * in length.
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
     * The principal who is getting this permission. It can be Amazon S3 service Principal (
     * <code>s3.amazonaws.com</code>) if you want Amazon S3 to invoke the function, an AWS account ID if you are
     * granting cross-account permission, or any valid AWS service principal such as <code>sns.amazonaws.com</code>. For
     * example, you might want to allow a custom application in another AWS account to push events to AWS Lambda by
     * invoking your function.
     * </p>
     */
    private String principal;
    /**
     * <p>
     * This is optional; however, when granting Amazon S3 permission to invoke your function, you should specify this
     * field with the Amazon Resource Name (ARN) as its value. This ensures that only events generated from the
     * specified source can invoke the function.
     * </p>
     * <important>
     * <p>
     * If you add a permission for the Amazon S3 principal without providing the source ARN, any AWS account that
     * creates a mapping to your function ARN can send events to invoke your Lambda function from Amazon S3.
     * </p>
     * </important>
     */
    private String sourceArn;
    /**
     * <p>
     * This parameter is used for S3, SES, CloudWatch Logs and CloudWatch Rules only. The AWS account ID (without a
     * hyphen) of the source owner. For example, if the <code>SourceArn</code> identifies a bucket, then this is the
     * bucket owner's account ID. You can use this additional condition to ensure the bucket you specify is owned by a
     * specific account (it is possible the bucket owner deleted the bucket and some other AWS account created the
     * bucket). You can also use this condition to specify all sources (that is, you don't specify the
     * <code>SourceArn</code>) owned by a specific account.
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
     * You can use this optional query parameter to describe a qualified ARN using a function version or an alias name.
     * The permission will then apply to the specific qualified ARN. For example, if you specify function version 2 as
     * the qualifier, then permission applies only when request is made using qualified function ARN:
     * </p>
     * <p>
     * <code>arn:aws:lambda:aws-region:acct-id:function:function-name:2</code>
     * </p>
     * <p>
     * If you specify an alias name, for example <code>PROD</code>, then the permission is valid only for requests made
     * using the alias ARN:
     * </p>
     * <p>
     * <code>arn:aws:lambda:aws-region:acct-id:function:function-name:PROD</code>
     * </p>
     * <p>
     * If the qualifier is not specified, the permission is valid only when requests is made using unqualified function
     * ARN.
     * </p>
     * <p>
     * <code>arn:aws:lambda:aws-region:acct-id:function:function-name</code>
     * </p>
     */
    private String qualifier;

    /**
     * <p>
     * Name of the Lambda function whose resource policy you are updating by adding a new permission.
     * </p>
     * <p>
     * You can specify a function name (for example, <code>Thumbnail</code>) or you can specify Amazon Resource Name
     * (ARN) of the function (for example, <code>arn:aws:lambda:us-west-2:account-id:function:ThumbNail</code>). AWS
     * Lambda also allows you to specify partial ARN (for example, <code>account-id:Thumbnail</code>). Note that the
     * length constraint applies only to the ARN. If you specify only the function name, it is limited to 64 character
     * in length.
     * </p>
     * 
     * @param functionName
     *        Name of the Lambda function whose resource policy you are updating by adding a new permission.</p>
     *        <p>
     *        You can specify a function name (for example, <code>Thumbnail</code>) or you can specify Amazon Resource
     *        Name (ARN) of the function (for example,
     *        <code>arn:aws:lambda:us-west-2:account-id:function:ThumbNail</code>). AWS Lambda also allows you to
     *        specify partial ARN (for example, <code>account-id:Thumbnail</code>). Note that the length constraint
     *        applies only to the ARN. If you specify only the function name, it is limited to 64 character in length.
     */

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    /**
     * <p>
     * Name of the Lambda function whose resource policy you are updating by adding a new permission.
     * </p>
     * <p>
     * You can specify a function name (for example, <code>Thumbnail</code>) or you can specify Amazon Resource Name
     * (ARN) of the function (for example, <code>arn:aws:lambda:us-west-2:account-id:function:ThumbNail</code>). AWS
     * Lambda also allows you to specify partial ARN (for example, <code>account-id:Thumbnail</code>). Note that the
     * length constraint applies only to the ARN. If you specify only the function name, it is limited to 64 character
     * in length.
     * </p>
     * 
     * @return Name of the Lambda function whose resource policy you are updating by adding a new permission.</p>
     *         <p>
     *         You can specify a function name (for example, <code>Thumbnail</code>) or you can specify Amazon Resource
     *         Name (ARN) of the function (for example,
     *         <code>arn:aws:lambda:us-west-2:account-id:function:ThumbNail</code>). AWS Lambda also allows you to
     *         specify partial ARN (for example, <code>account-id:Thumbnail</code>). Note that the length constraint
     *         applies only to the ARN. If you specify only the function name, it is limited to 64 character in length.
     */

    public String getFunctionName() {
        return this.functionName;
    }

    /**
     * <p>
     * Name of the Lambda function whose resource policy you are updating by adding a new permission.
     * </p>
     * <p>
     * You can specify a function name (for example, <code>Thumbnail</code>) or you can specify Amazon Resource Name
     * (ARN) of the function (for example, <code>arn:aws:lambda:us-west-2:account-id:function:ThumbNail</code>). AWS
     * Lambda also allows you to specify partial ARN (for example, <code>account-id:Thumbnail</code>). Note that the
     * length constraint applies only to the ARN. If you specify only the function name, it is limited to 64 character
     * in length.
     * </p>
     * 
     * @param functionName
     *        Name of the Lambda function whose resource policy you are updating by adding a new permission.</p>
     *        <p>
     *        You can specify a function name (for example, <code>Thumbnail</code>) or you can specify Amazon Resource
     *        Name (ARN) of the function (for example,
     *        <code>arn:aws:lambda:us-west-2:account-id:function:ThumbNail</code>). AWS Lambda also allows you to
     *        specify partial ARN (for example, <code>account-id:Thumbnail</code>). Note that the length constraint
     *        applies only to the ARN. If you specify only the function name, it is limited to 64 character in length.
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
     * The principal who is getting this permission. It can be Amazon S3 service Principal (
     * <code>s3.amazonaws.com</code>) if you want Amazon S3 to invoke the function, an AWS account ID if you are
     * granting cross-account permission, or any valid AWS service principal such as <code>sns.amazonaws.com</code>. For
     * example, you might want to allow a custom application in another AWS account to push events to AWS Lambda by
     * invoking your function.
     * </p>
     * 
     * @param principal
     *        The principal who is getting this permission. It can be Amazon S3 service Principal (
     *        <code>s3.amazonaws.com</code>) if you want Amazon S3 to invoke the function, an AWS account ID if you are
     *        granting cross-account permission, or any valid AWS service principal such as
     *        <code>sns.amazonaws.com</code>. For example, you might want to allow a custom application in another AWS
     *        account to push events to AWS Lambda by invoking your function.
     */

    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    /**
     * <p>
     * The principal who is getting this permission. It can be Amazon S3 service Principal (
     * <code>s3.amazonaws.com</code>) if you want Amazon S3 to invoke the function, an AWS account ID if you are
     * granting cross-account permission, or any valid AWS service principal such as <code>sns.amazonaws.com</code>. For
     * example, you might want to allow a custom application in another AWS account to push events to AWS Lambda by
     * invoking your function.
     * </p>
     * 
     * @return The principal who is getting this permission. It can be Amazon S3 service Principal (
     *         <code>s3.amazonaws.com</code>) if you want Amazon S3 to invoke the function, an AWS account ID if you are
     *         granting cross-account permission, or any valid AWS service principal such as
     *         <code>sns.amazonaws.com</code>. For example, you might want to allow a custom application in another AWS
     *         account to push events to AWS Lambda by invoking your function.
     */

    public String getPrincipal() {
        return this.principal;
    }

    /**
     * <p>
     * The principal who is getting this permission. It can be Amazon S3 service Principal (
     * <code>s3.amazonaws.com</code>) if you want Amazon S3 to invoke the function, an AWS account ID if you are
     * granting cross-account permission, or any valid AWS service principal such as <code>sns.amazonaws.com</code>. For
     * example, you might want to allow a custom application in another AWS account to push events to AWS Lambda by
     * invoking your function.
     * </p>
     * 
     * @param principal
     *        The principal who is getting this permission. It can be Amazon S3 service Principal (
     *        <code>s3.amazonaws.com</code>) if you want Amazon S3 to invoke the function, an AWS account ID if you are
     *        granting cross-account permission, or any valid AWS service principal such as
     *        <code>sns.amazonaws.com</code>. For example, you might want to allow a custom application in another AWS
     *        account to push events to AWS Lambda by invoking your function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddPermissionRequest withPrincipal(String principal) {
        setPrincipal(principal);
        return this;
    }

    /**
     * <p>
     * This is optional; however, when granting Amazon S3 permission to invoke your function, you should specify this
     * field with the Amazon Resource Name (ARN) as its value. This ensures that only events generated from the
     * specified source can invoke the function.
     * </p>
     * <important>
     * <p>
     * If you add a permission for the Amazon S3 principal without providing the source ARN, any AWS account that
     * creates a mapping to your function ARN can send events to invoke your Lambda function from Amazon S3.
     * </p>
     * </important>
     * 
     * @param sourceArn
     *        This is optional; however, when granting Amazon S3 permission to invoke your function, you should specify
     *        this field with the Amazon Resource Name (ARN) as its value. This ensures that only events generated from
     *        the specified source can invoke the function.</p> <important>
     *        <p>
     *        If you add a permission for the Amazon S3 principal without providing the source ARN, any AWS account that
     *        creates a mapping to your function ARN can send events to invoke your Lambda function from Amazon S3.
     *        </p>
     */

    public void setSourceArn(String sourceArn) {
        this.sourceArn = sourceArn;
    }

    /**
     * <p>
     * This is optional; however, when granting Amazon S3 permission to invoke your function, you should specify this
     * field with the Amazon Resource Name (ARN) as its value. This ensures that only events generated from the
     * specified source can invoke the function.
     * </p>
     * <important>
     * <p>
     * If you add a permission for the Amazon S3 principal without providing the source ARN, any AWS account that
     * creates a mapping to your function ARN can send events to invoke your Lambda function from Amazon S3.
     * </p>
     * </important>
     * 
     * @return This is optional; however, when granting Amazon S3 permission to invoke your function, you should specify
     *         this field with the Amazon Resource Name (ARN) as its value. This ensures that only events generated from
     *         the specified source can invoke the function.</p> <important>
     *         <p>
     *         If you add a permission for the Amazon S3 principal without providing the source ARN, any AWS account
     *         that creates a mapping to your function ARN can send events to invoke your Lambda function from Amazon
     *         S3.
     *         </p>
     */

    public String getSourceArn() {
        return this.sourceArn;
    }

    /**
     * <p>
     * This is optional; however, when granting Amazon S3 permission to invoke your function, you should specify this
     * field with the Amazon Resource Name (ARN) as its value. This ensures that only events generated from the
     * specified source can invoke the function.
     * </p>
     * <important>
     * <p>
     * If you add a permission for the Amazon S3 principal without providing the source ARN, any AWS account that
     * creates a mapping to your function ARN can send events to invoke your Lambda function from Amazon S3.
     * </p>
     * </important>
     * 
     * @param sourceArn
     *        This is optional; however, when granting Amazon S3 permission to invoke your function, you should specify
     *        this field with the Amazon Resource Name (ARN) as its value. This ensures that only events generated from
     *        the specified source can invoke the function.</p> <important>
     *        <p>
     *        If you add a permission for the Amazon S3 principal without providing the source ARN, any AWS account that
     *        creates a mapping to your function ARN can send events to invoke your Lambda function from Amazon S3.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddPermissionRequest withSourceArn(String sourceArn) {
        setSourceArn(sourceArn);
        return this;
    }

    /**
     * <p>
     * This parameter is used for S3, SES, CloudWatch Logs and CloudWatch Rules only. The AWS account ID (without a
     * hyphen) of the source owner. For example, if the <code>SourceArn</code> identifies a bucket, then this is the
     * bucket owner's account ID. You can use this additional condition to ensure the bucket you specify is owned by a
     * specific account (it is possible the bucket owner deleted the bucket and some other AWS account created the
     * bucket). You can also use this condition to specify all sources (that is, you don't specify the
     * <code>SourceArn</code>) owned by a specific account.
     * </p>
     * 
     * @param sourceAccount
     *        This parameter is used for S3, SES, CloudWatch Logs and CloudWatch Rules only. The AWS account ID (without
     *        a hyphen) of the source owner. For example, if the <code>SourceArn</code> identifies a bucket, then this
     *        is the bucket owner's account ID. You can use this additional condition to ensure the bucket you specify
     *        is owned by a specific account (it is possible the bucket owner deleted the bucket and some other AWS
     *        account created the bucket). You can also use this condition to specify all sources (that is, you don't
     *        specify the <code>SourceArn</code>) owned by a specific account.
     */

    public void setSourceAccount(String sourceAccount) {
        this.sourceAccount = sourceAccount;
    }

    /**
     * <p>
     * This parameter is used for S3, SES, CloudWatch Logs and CloudWatch Rules only. The AWS account ID (without a
     * hyphen) of the source owner. For example, if the <code>SourceArn</code> identifies a bucket, then this is the
     * bucket owner's account ID. You can use this additional condition to ensure the bucket you specify is owned by a
     * specific account (it is possible the bucket owner deleted the bucket and some other AWS account created the
     * bucket). You can also use this condition to specify all sources (that is, you don't specify the
     * <code>SourceArn</code>) owned by a specific account.
     * </p>
     * 
     * @return This parameter is used for S3, SES, CloudWatch Logs and CloudWatch Rules only. The AWS account ID
     *         (without a hyphen) of the source owner. For example, if the <code>SourceArn</code> identifies a bucket,
     *         then this is the bucket owner's account ID. You can use this additional condition to ensure the bucket
     *         you specify is owned by a specific account (it is possible the bucket owner deleted the bucket and some
     *         other AWS account created the bucket). You can also use this condition to specify all sources (that is,
     *         you don't specify the <code>SourceArn</code>) owned by a specific account.
     */

    public String getSourceAccount() {
        return this.sourceAccount;
    }

    /**
     * <p>
     * This parameter is used for S3, SES, CloudWatch Logs and CloudWatch Rules only. The AWS account ID (without a
     * hyphen) of the source owner. For example, if the <code>SourceArn</code> identifies a bucket, then this is the
     * bucket owner's account ID. You can use this additional condition to ensure the bucket you specify is owned by a
     * specific account (it is possible the bucket owner deleted the bucket and some other AWS account created the
     * bucket). You can also use this condition to specify all sources (that is, you don't specify the
     * <code>SourceArn</code>) owned by a specific account.
     * </p>
     * 
     * @param sourceAccount
     *        This parameter is used for S3, SES, CloudWatch Logs and CloudWatch Rules only. The AWS account ID (without
     *        a hyphen) of the source owner. For example, if the <code>SourceArn</code> identifies a bucket, then this
     *        is the bucket owner's account ID. You can use this additional condition to ensure the bucket you specify
     *        is owned by a specific account (it is possible the bucket owner deleted the bucket and some other AWS
     *        account created the bucket). You can also use this condition to specify all sources (that is, you don't
     *        specify the <code>SourceArn</code>) owned by a specific account.
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
     * You can use this optional query parameter to describe a qualified ARN using a function version or an alias name.
     * The permission will then apply to the specific qualified ARN. For example, if you specify function version 2 as
     * the qualifier, then permission applies only when request is made using qualified function ARN:
     * </p>
     * <p>
     * <code>arn:aws:lambda:aws-region:acct-id:function:function-name:2</code>
     * </p>
     * <p>
     * If you specify an alias name, for example <code>PROD</code>, then the permission is valid only for requests made
     * using the alias ARN:
     * </p>
     * <p>
     * <code>arn:aws:lambda:aws-region:acct-id:function:function-name:PROD</code>
     * </p>
     * <p>
     * If the qualifier is not specified, the permission is valid only when requests is made using unqualified function
     * ARN.
     * </p>
     * <p>
     * <code>arn:aws:lambda:aws-region:acct-id:function:function-name</code>
     * </p>
     * 
     * @param qualifier
     *        You can use this optional query parameter to describe a qualified ARN using a function version or an alias
     *        name. The permission will then apply to the specific qualified ARN. For example, if you specify function
     *        version 2 as the qualifier, then permission applies only when request is made using qualified function
     *        ARN:</p>
     *        <p>
     *        <code>arn:aws:lambda:aws-region:acct-id:function:function-name:2</code>
     *        </p>
     *        <p>
     *        If you specify an alias name, for example <code>PROD</code>, then the permission is valid only for
     *        requests made using the alias ARN:
     *        </p>
     *        <p>
     *        <code>arn:aws:lambda:aws-region:acct-id:function:function-name:PROD</code>
     *        </p>
     *        <p>
     *        If the qualifier is not specified, the permission is valid only when requests is made using unqualified
     *        function ARN.
     *        </p>
     *        <p>
     *        <code>arn:aws:lambda:aws-region:acct-id:function:function-name</code>
     */

    public void setQualifier(String qualifier) {
        this.qualifier = qualifier;
    }

    /**
     * <p>
     * You can use this optional query parameter to describe a qualified ARN using a function version or an alias name.
     * The permission will then apply to the specific qualified ARN. For example, if you specify function version 2 as
     * the qualifier, then permission applies only when request is made using qualified function ARN:
     * </p>
     * <p>
     * <code>arn:aws:lambda:aws-region:acct-id:function:function-name:2</code>
     * </p>
     * <p>
     * If you specify an alias name, for example <code>PROD</code>, then the permission is valid only for requests made
     * using the alias ARN:
     * </p>
     * <p>
     * <code>arn:aws:lambda:aws-region:acct-id:function:function-name:PROD</code>
     * </p>
     * <p>
     * If the qualifier is not specified, the permission is valid only when requests is made using unqualified function
     * ARN.
     * </p>
     * <p>
     * <code>arn:aws:lambda:aws-region:acct-id:function:function-name</code>
     * </p>
     * 
     * @return You can use this optional query parameter to describe a qualified ARN using a function version or an
     *         alias name. The permission will then apply to the specific qualified ARN. For example, if you specify
     *         function version 2 as the qualifier, then permission applies only when request is made using qualified
     *         function ARN:</p>
     *         <p>
     *         <code>arn:aws:lambda:aws-region:acct-id:function:function-name:2</code>
     *         </p>
     *         <p>
     *         If you specify an alias name, for example <code>PROD</code>, then the permission is valid only for
     *         requests made using the alias ARN:
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:aws-region:acct-id:function:function-name:PROD</code>
     *         </p>
     *         <p>
     *         If the qualifier is not specified, the permission is valid only when requests is made using unqualified
     *         function ARN.
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:aws-region:acct-id:function:function-name</code>
     */

    public String getQualifier() {
        return this.qualifier;
    }

    /**
     * <p>
     * You can use this optional query parameter to describe a qualified ARN using a function version or an alias name.
     * The permission will then apply to the specific qualified ARN. For example, if you specify function version 2 as
     * the qualifier, then permission applies only when request is made using qualified function ARN:
     * </p>
     * <p>
     * <code>arn:aws:lambda:aws-region:acct-id:function:function-name:2</code>
     * </p>
     * <p>
     * If you specify an alias name, for example <code>PROD</code>, then the permission is valid only for requests made
     * using the alias ARN:
     * </p>
     * <p>
     * <code>arn:aws:lambda:aws-region:acct-id:function:function-name:PROD</code>
     * </p>
     * <p>
     * If the qualifier is not specified, the permission is valid only when requests is made using unqualified function
     * ARN.
     * </p>
     * <p>
     * <code>arn:aws:lambda:aws-region:acct-id:function:function-name</code>
     * </p>
     * 
     * @param qualifier
     *        You can use this optional query parameter to describe a qualified ARN using a function version or an alias
     *        name. The permission will then apply to the specific qualified ARN. For example, if you specify function
     *        version 2 as the qualifier, then permission applies only when request is made using qualified function
     *        ARN:</p>
     *        <p>
     *        <code>arn:aws:lambda:aws-region:acct-id:function:function-name:2</code>
     *        </p>
     *        <p>
     *        If you specify an alias name, for example <code>PROD</code>, then the permission is valid only for
     *        requests made using the alias ARN:
     *        </p>
     *        <p>
     *        <code>arn:aws:lambda:aws-region:acct-id:function:function-name:PROD</code>
     *        </p>
     *        <p>
     *        If the qualifier is not specified, the permission is valid only when requests is made using unqualified
     *        function ARN.
     *        </p>
     *        <p>
     *        <code>arn:aws:lambda:aws-region:acct-id:function:function-name</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddPermissionRequest withQualifier(String qualifier) {
        setQualifier(qualifier);
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
        if (getFunctionName() != null)
            sb.append("FunctionName: " + getFunctionName() + ",");
        if (getStatementId() != null)
            sb.append("StatementId: " + getStatementId() + ",");
        if (getAction() != null)
            sb.append("Action: " + getAction() + ",");
        if (getPrincipal() != null)
            sb.append("Principal: " + getPrincipal() + ",");
        if (getSourceArn() != null)
            sb.append("SourceArn: " + getSourceArn() + ",");
        if (getSourceAccount() != null)
            sb.append("SourceAccount: " + getSourceAccount() + ",");
        if (getEventSourceToken() != null)
            sb.append("EventSourceToken: " + getEventSourceToken() + ",");
        if (getQualifier() != null)
            sb.append("Qualifier: " + getQualifier());
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
        return hashCode;
    }

    @Override
    public AddPermissionRequest clone() {
        return (AddPermissionRequest) super.clone();
    }
}
