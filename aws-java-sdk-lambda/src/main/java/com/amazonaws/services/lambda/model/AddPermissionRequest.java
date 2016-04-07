/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.lambda.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.lambda.AWSLambda#addPermission(AddPermissionRequest) AddPermission operation}.
 * <p>
 * Adds a permission to the resource policy associated with the specified
 * AWS Lambda function. You use resource policies to grant permissions to
 * event sources that use <i>push</i> model. In a <i>push</i> model,
 * event sources (such as Amazon S3 and custom applications) invoke your
 * Lambda function. Each permission you add to the resource policy allows
 * an event source, permission to invoke the Lambda function.
 * </p>
 * <p>
 * For information about the push model, see
 * <a href="http://docs.aws.amazon.com/lambda/latest/dg/lambda-introduction.html"> AWS Lambda: How it Works </a>
 * .
 * </p>
 * <p>
 * If you are using versioning, the permissions you add are specific to
 * the Lambda function version or alias you specify in the
 * <code>AddPermission</code> request via the <code>Qualifier</code>
 * parameter. For more information about versioning, see
 * <a href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html"> AWS Lambda Function Versioning and Aliases </a>
 * .
 * </p>
 * <p>
 * This operation requires permission for the
 * <code>lambda:AddPermission</code> action.
 * </p>
 *
 * @see com.amazonaws.services.lambda.AWSLambda#addPermission(AddPermissionRequest)
 */
public class AddPermissionRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * Name of the Lambda function whose resource policy you are updating by
     * adding a new permission. <p> You can specify a function name (for
     * example, <code>Thumbnail</code>) or you can specify Amazon Resource
     * Name (ARN) of the function (for example,
     * <code>arn:aws:lambda:us-west-2:account-id:function:ThumbNail</code>).
     * AWS Lambda also allows you to specify partial ARN (for example,
     * <code>account-id:Thumbnail</code>). Note that the length constraint
     * applies only to the ARN. If you specify only the function name, it is
     * limited to 64 character in length.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 140<br/>
     * <b>Pattern: </b>(arn:aws:lambda:)?([a-z]{2}-[a-z]+-\d{1}:)?(\d{12}:)?(function:)?([a-zA-Z0-9-_]+)(:(\$LATEST|[a-zA-Z0-9-_]+))?<br/>
     */
    private String functionName;

    /**
     * A unique statement identifier.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>([a-zA-Z0-9-_]+)<br/>
     */
    private String statementId;

    /**
     * The AWS Lambda action you want to allow in this statement. Each Lambda
     * action is a string starting with <code>lambda:</code> followed by the
     * API name (see <a>Operations</a>). For example,
     * <code>lambda:CreateFunction</code>. You can use wildcard
     * (<code>lambda:*</code>) to grant permission for all AWS Lambda
     * actions.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(lambda:[*]|lambda:[a-zA-Z]+|[*])<br/>
     */
    private String action;

    /**
     * The principal who is getting this permission. It can be Amazon S3
     * service Principal (<code>s3.amazonaws.com</code>) if you want Amazon
     * S3 to invoke the function, an AWS account ID if you are granting
     * cross-account permission, or any valid AWS service principal such as
     * <code>sns.amazonaws.com</code>. For example, you might want to allow a
     * custom application in another AWS account to push events to AWS Lambda
     * by invoking your function.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*<br/>
     */
    private String principal;

    /**
     * This is optional; however, when granting Amazon S3 permission to
     * invoke your function, you should specify this field with the bucket
     * Amazon Resource Name (ARN) as its value. This ensures that only events
     * generated from the specified bucket can invoke the function.
     * <important>If you add a permission for the Amazon S3 principal without
     * providing the source ARN, any AWS account that creates a mapping to
     * your function ARN can send events to invoke your Lambda function from
     * Amazon S3.</important>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws:([a-zA-Z0-9\-])+:([a-z]{2}-[a-z]+-\d{1})?:(\d{12})?:(.*)<br/>
     */
    private String sourceArn;

    /**
     * The AWS account ID (without a hyphen) of the source owner. For
     * example, if the <code>SourceArn</code> identifies a bucket, then this
     * is the bucket owner's account ID. You can use this additional
     * condition to ensure the bucket you specify is owned by a specific
     * account (it is possible the bucket owner deleted the bucket and some
     * other AWS account created the bucket). You can also use this condition
     * to specify all sources (that is, you don't specify the
     * <code>SourceArn</code>) owned by a specific account.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\d{12}<br/>
     */
    private String sourceAccount;

    private String eventSourceToken;

    /**
     * You can use this optional query parameter to describe a qualified ARN
     * using a function version or an alias name. The permission will then
     * apply to the specific qualified ARN. For example, if you specify
     * function version 2 as the qualifier, then permission applies only when
     * request is made using qualified function ARN:
     * <p><code>arn:aws:lambda:aws-region:acct-id:function:function-name:2</code>
     * <p>If you specify an alias name, for example <code>PROD</code>, then
     * the permission is valid only for requests made using the alias ARN:
     * <p><code>arn:aws:lambda:aws-region:acct-id:function:function-name:PROD</code>
     * <p>If the qualifier is not specified, the permission is valid only
     * when requests is made using unqualified function ARN.
     * <p><code>arn:aws:lambda:aws-region:acct-id:function:function-name</code>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>(|[a-zA-Z0-9$_-]+)<br/>
     */
    private String qualifier;

    /**
     * Name of the Lambda function whose resource policy you are updating by
     * adding a new permission. <p> You can specify a function name (for
     * example, <code>Thumbnail</code>) or you can specify Amazon Resource
     * Name (ARN) of the function (for example,
     * <code>arn:aws:lambda:us-west-2:account-id:function:ThumbNail</code>).
     * AWS Lambda also allows you to specify partial ARN (for example,
     * <code>account-id:Thumbnail</code>). Note that the length constraint
     * applies only to the ARN. If you specify only the function name, it is
     * limited to 64 character in length.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 140<br/>
     * <b>Pattern: </b>(arn:aws:lambda:)?([a-z]{2}-[a-z]+-\d{1}:)?(\d{12}:)?(function:)?([a-zA-Z0-9-_]+)(:(\$LATEST|[a-zA-Z0-9-_]+))?<br/>
     *
     * @return Name of the Lambda function whose resource policy you are updating by
     *         adding a new permission. <p> You can specify a function name (for
     *         example, <code>Thumbnail</code>) or you can specify Amazon Resource
     *         Name (ARN) of the function (for example,
     *         <code>arn:aws:lambda:us-west-2:account-id:function:ThumbNail</code>).
     *         AWS Lambda also allows you to specify partial ARN (for example,
     *         <code>account-id:Thumbnail</code>). Note that the length constraint
     *         applies only to the ARN. If you specify only the function name, it is
     *         limited to 64 character in length.
     */
    public String getFunctionName() {
        return functionName;
    }
    
    /**
     * Name of the Lambda function whose resource policy you are updating by
     * adding a new permission. <p> You can specify a function name (for
     * example, <code>Thumbnail</code>) or you can specify Amazon Resource
     * Name (ARN) of the function (for example,
     * <code>arn:aws:lambda:us-west-2:account-id:function:ThumbNail</code>).
     * AWS Lambda also allows you to specify partial ARN (for example,
     * <code>account-id:Thumbnail</code>). Note that the length constraint
     * applies only to the ARN. If you specify only the function name, it is
     * limited to 64 character in length.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 140<br/>
     * <b>Pattern: </b>(arn:aws:lambda:)?([a-z]{2}-[a-z]+-\d{1}:)?(\d{12}:)?(function:)?([a-zA-Z0-9-_]+)(:(\$LATEST|[a-zA-Z0-9-_]+))?<br/>
     *
     * @param functionName Name of the Lambda function whose resource policy you are updating by
     *         adding a new permission. <p> You can specify a function name (for
     *         example, <code>Thumbnail</code>) or you can specify Amazon Resource
     *         Name (ARN) of the function (for example,
     *         <code>arn:aws:lambda:us-west-2:account-id:function:ThumbNail</code>).
     *         AWS Lambda also allows you to specify partial ARN (for example,
     *         <code>account-id:Thumbnail</code>). Note that the length constraint
     *         applies only to the ARN. If you specify only the function name, it is
     *         limited to 64 character in length.
     */
    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }
    
    /**
     * Name of the Lambda function whose resource policy you are updating by
     * adding a new permission. <p> You can specify a function name (for
     * example, <code>Thumbnail</code>) or you can specify Amazon Resource
     * Name (ARN) of the function (for example,
     * <code>arn:aws:lambda:us-west-2:account-id:function:ThumbNail</code>).
     * AWS Lambda also allows you to specify partial ARN (for example,
     * <code>account-id:Thumbnail</code>). Note that the length constraint
     * applies only to the ARN. If you specify only the function name, it is
     * limited to 64 character in length.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 140<br/>
     * <b>Pattern: </b>(arn:aws:lambda:)?([a-z]{2}-[a-z]+-\d{1}:)?(\d{12}:)?(function:)?([a-zA-Z0-9-_]+)(:(\$LATEST|[a-zA-Z0-9-_]+))?<br/>
     *
     * @param functionName Name of the Lambda function whose resource policy you are updating by
     *         adding a new permission. <p> You can specify a function name (for
     *         example, <code>Thumbnail</code>) or you can specify Amazon Resource
     *         Name (ARN) of the function (for example,
     *         <code>arn:aws:lambda:us-west-2:account-id:function:ThumbNail</code>).
     *         AWS Lambda also allows you to specify partial ARN (for example,
     *         <code>account-id:Thumbnail</code>). Note that the length constraint
     *         applies only to the ARN. If you specify only the function name, it is
     *         limited to 64 character in length.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AddPermissionRequest withFunctionName(String functionName) {
        this.functionName = functionName;
        return this;
    }

    /**
     * A unique statement identifier.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>([a-zA-Z0-9-_]+)<br/>
     *
     * @return A unique statement identifier.
     */
    public String getStatementId() {
        return statementId;
    }
    
    /**
     * A unique statement identifier.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>([a-zA-Z0-9-_]+)<br/>
     *
     * @param statementId A unique statement identifier.
     */
    public void setStatementId(String statementId) {
        this.statementId = statementId;
    }
    
    /**
     * A unique statement identifier.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>([a-zA-Z0-9-_]+)<br/>
     *
     * @param statementId A unique statement identifier.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AddPermissionRequest withStatementId(String statementId) {
        this.statementId = statementId;
        return this;
    }

    /**
     * The AWS Lambda action you want to allow in this statement. Each Lambda
     * action is a string starting with <code>lambda:</code> followed by the
     * API name (see <a>Operations</a>). For example,
     * <code>lambda:CreateFunction</code>. You can use wildcard
     * (<code>lambda:*</code>) to grant permission for all AWS Lambda
     * actions.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(lambda:[*]|lambda:[a-zA-Z]+|[*])<br/>
     *
     * @return The AWS Lambda action you want to allow in this statement. Each Lambda
     *         action is a string starting with <code>lambda:</code> followed by the
     *         API name (see <a>Operations</a>). For example,
     *         <code>lambda:CreateFunction</code>. You can use wildcard
     *         (<code>lambda:*</code>) to grant permission for all AWS Lambda
     *         actions.
     */
    public String getAction() {
        return action;
    }
    
    /**
     * The AWS Lambda action you want to allow in this statement. Each Lambda
     * action is a string starting with <code>lambda:</code> followed by the
     * API name (see <a>Operations</a>). For example,
     * <code>lambda:CreateFunction</code>. You can use wildcard
     * (<code>lambda:*</code>) to grant permission for all AWS Lambda
     * actions.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(lambda:[*]|lambda:[a-zA-Z]+|[*])<br/>
     *
     * @param action The AWS Lambda action you want to allow in this statement. Each Lambda
     *         action is a string starting with <code>lambda:</code> followed by the
     *         API name (see <a>Operations</a>). For example,
     *         <code>lambda:CreateFunction</code>. You can use wildcard
     *         (<code>lambda:*</code>) to grant permission for all AWS Lambda
     *         actions.
     */
    public void setAction(String action) {
        this.action = action;
    }
    
    /**
     * The AWS Lambda action you want to allow in this statement. Each Lambda
     * action is a string starting with <code>lambda:</code> followed by the
     * API name (see <a>Operations</a>). For example,
     * <code>lambda:CreateFunction</code>. You can use wildcard
     * (<code>lambda:*</code>) to grant permission for all AWS Lambda
     * actions.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(lambda:[*]|lambda:[a-zA-Z]+|[*])<br/>
     *
     * @param action The AWS Lambda action you want to allow in this statement. Each Lambda
     *         action is a string starting with <code>lambda:</code> followed by the
     *         API name (see <a>Operations</a>). For example,
     *         <code>lambda:CreateFunction</code>. You can use wildcard
     *         (<code>lambda:*</code>) to grant permission for all AWS Lambda
     *         actions.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AddPermissionRequest withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * The principal who is getting this permission. It can be Amazon S3
     * service Principal (<code>s3.amazonaws.com</code>) if you want Amazon
     * S3 to invoke the function, an AWS account ID if you are granting
     * cross-account permission, or any valid AWS service principal such as
     * <code>sns.amazonaws.com</code>. For example, you might want to allow a
     * custom application in another AWS account to push events to AWS Lambda
     * by invoking your function.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @return The principal who is getting this permission. It can be Amazon S3
     *         service Principal (<code>s3.amazonaws.com</code>) if you want Amazon
     *         S3 to invoke the function, an AWS account ID if you are granting
     *         cross-account permission, or any valid AWS service principal such as
     *         <code>sns.amazonaws.com</code>. For example, you might want to allow a
     *         custom application in another AWS account to push events to AWS Lambda
     *         by invoking your function.
     */
    public String getPrincipal() {
        return principal;
    }
    
    /**
     * The principal who is getting this permission. It can be Amazon S3
     * service Principal (<code>s3.amazonaws.com</code>) if you want Amazon
     * S3 to invoke the function, an AWS account ID if you are granting
     * cross-account permission, or any valid AWS service principal such as
     * <code>sns.amazonaws.com</code>. For example, you might want to allow a
     * custom application in another AWS account to push events to AWS Lambda
     * by invoking your function.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param principal The principal who is getting this permission. It can be Amazon S3
     *         service Principal (<code>s3.amazonaws.com</code>) if you want Amazon
     *         S3 to invoke the function, an AWS account ID if you are granting
     *         cross-account permission, or any valid AWS service principal such as
     *         <code>sns.amazonaws.com</code>. For example, you might want to allow a
     *         custom application in another AWS account to push events to AWS Lambda
     *         by invoking your function.
     */
    public void setPrincipal(String principal) {
        this.principal = principal;
    }
    
    /**
     * The principal who is getting this permission. It can be Amazon S3
     * service Principal (<code>s3.amazonaws.com</code>) if you want Amazon
     * S3 to invoke the function, an AWS account ID if you are granting
     * cross-account permission, or any valid AWS service principal such as
     * <code>sns.amazonaws.com</code>. For example, you might want to allow a
     * custom application in another AWS account to push events to AWS Lambda
     * by invoking your function.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param principal The principal who is getting this permission. It can be Amazon S3
     *         service Principal (<code>s3.amazonaws.com</code>) if you want Amazon
     *         S3 to invoke the function, an AWS account ID if you are granting
     *         cross-account permission, or any valid AWS service principal such as
     *         <code>sns.amazonaws.com</code>. For example, you might want to allow a
     *         custom application in another AWS account to push events to AWS Lambda
     *         by invoking your function.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AddPermissionRequest withPrincipal(String principal) {
        this.principal = principal;
        return this;
    }

    /**
     * This is optional; however, when granting Amazon S3 permission to
     * invoke your function, you should specify this field with the bucket
     * Amazon Resource Name (ARN) as its value. This ensures that only events
     * generated from the specified bucket can invoke the function.
     * <important>If you add a permission for the Amazon S3 principal without
     * providing the source ARN, any AWS account that creates a mapping to
     * your function ARN can send events to invoke your Lambda function from
     * Amazon S3.</important>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws:([a-zA-Z0-9\-])+:([a-z]{2}-[a-z]+-\d{1})?:(\d{12})?:(.*)<br/>
     *
     * @return This is optional; however, when granting Amazon S3 permission to
     *         invoke your function, you should specify this field with the bucket
     *         Amazon Resource Name (ARN) as its value. This ensures that only events
     *         generated from the specified bucket can invoke the function.
     *         <important>If you add a permission for the Amazon S3 principal without
     *         providing the source ARN, any AWS account that creates a mapping to
     *         your function ARN can send events to invoke your Lambda function from
     *         Amazon S3.</important>
     */
    public String getSourceArn() {
        return sourceArn;
    }
    
    /**
     * This is optional; however, when granting Amazon S3 permission to
     * invoke your function, you should specify this field with the bucket
     * Amazon Resource Name (ARN) as its value. This ensures that only events
     * generated from the specified bucket can invoke the function.
     * <important>If you add a permission for the Amazon S3 principal without
     * providing the source ARN, any AWS account that creates a mapping to
     * your function ARN can send events to invoke your Lambda function from
     * Amazon S3.</important>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws:([a-zA-Z0-9\-])+:([a-z]{2}-[a-z]+-\d{1})?:(\d{12})?:(.*)<br/>
     *
     * @param sourceArn This is optional; however, when granting Amazon S3 permission to
     *         invoke your function, you should specify this field with the bucket
     *         Amazon Resource Name (ARN) as its value. This ensures that only events
     *         generated from the specified bucket can invoke the function.
     *         <important>If you add a permission for the Amazon S3 principal without
     *         providing the source ARN, any AWS account that creates a mapping to
     *         your function ARN can send events to invoke your Lambda function from
     *         Amazon S3.</important>
     */
    public void setSourceArn(String sourceArn) {
        this.sourceArn = sourceArn;
    }
    
    /**
     * This is optional; however, when granting Amazon S3 permission to
     * invoke your function, you should specify this field with the bucket
     * Amazon Resource Name (ARN) as its value. This ensures that only events
     * generated from the specified bucket can invoke the function.
     * <important>If you add a permission for the Amazon S3 principal without
     * providing the source ARN, any AWS account that creates a mapping to
     * your function ARN can send events to invoke your Lambda function from
     * Amazon S3.</important>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws:([a-zA-Z0-9\-])+:([a-z]{2}-[a-z]+-\d{1})?:(\d{12})?:(.*)<br/>
     *
     * @param sourceArn This is optional; however, when granting Amazon S3 permission to
     *         invoke your function, you should specify this field with the bucket
     *         Amazon Resource Name (ARN) as its value. This ensures that only events
     *         generated from the specified bucket can invoke the function.
     *         <important>If you add a permission for the Amazon S3 principal without
     *         providing the source ARN, any AWS account that creates a mapping to
     *         your function ARN can send events to invoke your Lambda function from
     *         Amazon S3.</important>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AddPermissionRequest withSourceArn(String sourceArn) {
        this.sourceArn = sourceArn;
        return this;
    }

    /**
     * The AWS account ID (without a hyphen) of the source owner. For
     * example, if the <code>SourceArn</code> identifies a bucket, then this
     * is the bucket owner's account ID. You can use this additional
     * condition to ensure the bucket you specify is owned by a specific
     * account (it is possible the bucket owner deleted the bucket and some
     * other AWS account created the bucket). You can also use this condition
     * to specify all sources (that is, you don't specify the
     * <code>SourceArn</code>) owned by a specific account.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\d{12}<br/>
     *
     * @return The AWS account ID (without a hyphen) of the source owner. For
     *         example, if the <code>SourceArn</code> identifies a bucket, then this
     *         is the bucket owner's account ID. You can use this additional
     *         condition to ensure the bucket you specify is owned by a specific
     *         account (it is possible the bucket owner deleted the bucket and some
     *         other AWS account created the bucket). You can also use this condition
     *         to specify all sources (that is, you don't specify the
     *         <code>SourceArn</code>) owned by a specific account.
     */
    public String getSourceAccount() {
        return sourceAccount;
    }
    
    /**
     * The AWS account ID (without a hyphen) of the source owner. For
     * example, if the <code>SourceArn</code> identifies a bucket, then this
     * is the bucket owner's account ID. You can use this additional
     * condition to ensure the bucket you specify is owned by a specific
     * account (it is possible the bucket owner deleted the bucket and some
     * other AWS account created the bucket). You can also use this condition
     * to specify all sources (that is, you don't specify the
     * <code>SourceArn</code>) owned by a specific account.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\d{12}<br/>
     *
     * @param sourceAccount The AWS account ID (without a hyphen) of the source owner. For
     *         example, if the <code>SourceArn</code> identifies a bucket, then this
     *         is the bucket owner's account ID. You can use this additional
     *         condition to ensure the bucket you specify is owned by a specific
     *         account (it is possible the bucket owner deleted the bucket and some
     *         other AWS account created the bucket). You can also use this condition
     *         to specify all sources (that is, you don't specify the
     *         <code>SourceArn</code>) owned by a specific account.
     */
    public void setSourceAccount(String sourceAccount) {
        this.sourceAccount = sourceAccount;
    }
    
    /**
     * The AWS account ID (without a hyphen) of the source owner. For
     * example, if the <code>SourceArn</code> identifies a bucket, then this
     * is the bucket owner's account ID. You can use this additional
     * condition to ensure the bucket you specify is owned by a specific
     * account (it is possible the bucket owner deleted the bucket and some
     * other AWS account created the bucket). You can also use this condition
     * to specify all sources (that is, you don't specify the
     * <code>SourceArn</code>) owned by a specific account.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\d{12}<br/>
     *
     * @param sourceAccount The AWS account ID (without a hyphen) of the source owner. For
     *         example, if the <code>SourceArn</code> identifies a bucket, then this
     *         is the bucket owner's account ID. You can use this additional
     *         condition to ensure the bucket you specify is owned by a specific
     *         account (it is possible the bucket owner deleted the bucket and some
     *         other AWS account created the bucket). You can also use this condition
     *         to specify all sources (that is, you don't specify the
     *         <code>SourceArn</code>) owned by a specific account.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AddPermissionRequest withSourceAccount(String sourceAccount) {
        this.sourceAccount = sourceAccount;
        return this;
    }

    /**
     * Returns the value of the EventSourceToken property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[a-zA-Z0-9._\-]+<br/>
     *
     * @return The value of the EventSourceToken property for this object.
     */
    public String getEventSourceToken() {
        return eventSourceToken;
    }
    
    /**
     * Sets the value of the EventSourceToken property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[a-zA-Z0-9._\-]+<br/>
     *
     * @param eventSourceToken The new value for the EventSourceToken property for this object.
     */
    public void setEventSourceToken(String eventSourceToken) {
        this.eventSourceToken = eventSourceToken;
    }
    
    /**
     * Sets the value of the EventSourceToken property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[a-zA-Z0-9._\-]+<br/>
     *
     * @param eventSourceToken The new value for the EventSourceToken property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AddPermissionRequest withEventSourceToken(String eventSourceToken) {
        this.eventSourceToken = eventSourceToken;
        return this;
    }

    /**
     * You can use this optional query parameter to describe a qualified ARN
     * using a function version or an alias name. The permission will then
     * apply to the specific qualified ARN. For example, if you specify
     * function version 2 as the qualifier, then permission applies only when
     * request is made using qualified function ARN:
     * <p><code>arn:aws:lambda:aws-region:acct-id:function:function-name:2</code>
     * <p>If you specify an alias name, for example <code>PROD</code>, then
     * the permission is valid only for requests made using the alias ARN:
     * <p><code>arn:aws:lambda:aws-region:acct-id:function:function-name:PROD</code>
     * <p>If the qualifier is not specified, the permission is valid only
     * when requests is made using unqualified function ARN.
     * <p><code>arn:aws:lambda:aws-region:acct-id:function:function-name</code>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>(|[a-zA-Z0-9$_-]+)<br/>
     *
     * @return You can use this optional query parameter to describe a qualified ARN
     *         using a function version or an alias name. The permission will then
     *         apply to the specific qualified ARN. For example, if you specify
     *         function version 2 as the qualifier, then permission applies only when
     *         request is made using qualified function ARN:
     *         <p><code>arn:aws:lambda:aws-region:acct-id:function:function-name:2</code>
     *         <p>If you specify an alias name, for example <code>PROD</code>, then
     *         the permission is valid only for requests made using the alias ARN:
     *         <p><code>arn:aws:lambda:aws-region:acct-id:function:function-name:PROD</code>
     *         <p>If the qualifier is not specified, the permission is valid only
     *         when requests is made using unqualified function ARN.
     *         <p><code>arn:aws:lambda:aws-region:acct-id:function:function-name</code>
     */
    public String getQualifier() {
        return qualifier;
    }
    
    /**
     * You can use this optional query parameter to describe a qualified ARN
     * using a function version or an alias name. The permission will then
     * apply to the specific qualified ARN. For example, if you specify
     * function version 2 as the qualifier, then permission applies only when
     * request is made using qualified function ARN:
     * <p><code>arn:aws:lambda:aws-region:acct-id:function:function-name:2</code>
     * <p>If you specify an alias name, for example <code>PROD</code>, then
     * the permission is valid only for requests made using the alias ARN:
     * <p><code>arn:aws:lambda:aws-region:acct-id:function:function-name:PROD</code>
     * <p>If the qualifier is not specified, the permission is valid only
     * when requests is made using unqualified function ARN.
     * <p><code>arn:aws:lambda:aws-region:acct-id:function:function-name</code>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>(|[a-zA-Z0-9$_-]+)<br/>
     *
     * @param qualifier You can use this optional query parameter to describe a qualified ARN
     *         using a function version or an alias name. The permission will then
     *         apply to the specific qualified ARN. For example, if you specify
     *         function version 2 as the qualifier, then permission applies only when
     *         request is made using qualified function ARN:
     *         <p><code>arn:aws:lambda:aws-region:acct-id:function:function-name:2</code>
     *         <p>If you specify an alias name, for example <code>PROD</code>, then
     *         the permission is valid only for requests made using the alias ARN:
     *         <p><code>arn:aws:lambda:aws-region:acct-id:function:function-name:PROD</code>
     *         <p>If the qualifier is not specified, the permission is valid only
     *         when requests is made using unqualified function ARN.
     *         <p><code>arn:aws:lambda:aws-region:acct-id:function:function-name</code>
     */
    public void setQualifier(String qualifier) {
        this.qualifier = qualifier;
    }
    
    /**
     * You can use this optional query parameter to describe a qualified ARN
     * using a function version or an alias name. The permission will then
     * apply to the specific qualified ARN. For example, if you specify
     * function version 2 as the qualifier, then permission applies only when
     * request is made using qualified function ARN:
     * <p><code>arn:aws:lambda:aws-region:acct-id:function:function-name:2</code>
     * <p>If you specify an alias name, for example <code>PROD</code>, then
     * the permission is valid only for requests made using the alias ARN:
     * <p><code>arn:aws:lambda:aws-region:acct-id:function:function-name:PROD</code>
     * <p>If the qualifier is not specified, the permission is valid only
     * when requests is made using unqualified function ARN.
     * <p><code>arn:aws:lambda:aws-region:acct-id:function:function-name</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>(|[a-zA-Z0-9$_-]+)<br/>
     *
     * @param qualifier You can use this optional query parameter to describe a qualified ARN
     *         using a function version or an alias name. The permission will then
     *         apply to the specific qualified ARN. For example, if you specify
     *         function version 2 as the qualifier, then permission applies only when
     *         request is made using qualified function ARN:
     *         <p><code>arn:aws:lambda:aws-region:acct-id:function:function-name:2</code>
     *         <p>If you specify an alias name, for example <code>PROD</code>, then
     *         the permission is valid only for requests made using the alias ARN:
     *         <p><code>arn:aws:lambda:aws-region:acct-id:function:function-name:PROD</code>
     *         <p>If the qualifier is not specified, the permission is valid only
     *         when requests is made using unqualified function ARN.
     *         <p><code>arn:aws:lambda:aws-region:acct-id:function:function-name</code>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AddPermissionRequest withQualifier(String qualifier) {
        this.qualifier = qualifier;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getFunctionName() != null) sb.append("FunctionName: " + getFunctionName() + ",");
        if (getStatementId() != null) sb.append("StatementId: " + getStatementId() + ",");
        if (getAction() != null) sb.append("Action: " + getAction() + ",");
        if (getPrincipal() != null) sb.append("Principal: " + getPrincipal() + ",");
        if (getSourceArn() != null) sb.append("SourceArn: " + getSourceArn() + ",");
        if (getSourceAccount() != null) sb.append("SourceAccount: " + getSourceAccount() + ",");
        if (getEventSourceToken() != null) sb.append("EventSourceToken: " + getEventSourceToken() + ",");
        if (getQualifier() != null) sb.append("Qualifier: " + getQualifier() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof AddPermissionRequest == false) return false;
        AddPermissionRequest other = (AddPermissionRequest)obj;
        
        if (other.getFunctionName() == null ^ this.getFunctionName() == null) return false;
        if (other.getFunctionName() != null && other.getFunctionName().equals(this.getFunctionName()) == false) return false; 
        if (other.getStatementId() == null ^ this.getStatementId() == null) return false;
        if (other.getStatementId() != null && other.getStatementId().equals(this.getStatementId()) == false) return false; 
        if (other.getAction() == null ^ this.getAction() == null) return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false) return false; 
        if (other.getPrincipal() == null ^ this.getPrincipal() == null) return false;
        if (other.getPrincipal() != null && other.getPrincipal().equals(this.getPrincipal()) == false) return false; 
        if (other.getSourceArn() == null ^ this.getSourceArn() == null) return false;
        if (other.getSourceArn() != null && other.getSourceArn().equals(this.getSourceArn()) == false) return false; 
        if (other.getSourceAccount() == null ^ this.getSourceAccount() == null) return false;
        if (other.getSourceAccount() != null && other.getSourceAccount().equals(this.getSourceAccount()) == false) return false; 
        if (other.getEventSourceToken() == null ^ this.getEventSourceToken() == null) return false;
        if (other.getEventSourceToken() != null && other.getEventSourceToken().equals(this.getEventSourceToken()) == false) return false; 
        if (other.getQualifier() == null ^ this.getQualifier() == null) return false;
        if (other.getQualifier() != null && other.getQualifier().equals(this.getQualifier()) == false) return false; 
        return true;
    }
    
    @Override
    public AddPermissionRequest clone() {
        
            return (AddPermissionRequest) super.clone();
    }

}
    