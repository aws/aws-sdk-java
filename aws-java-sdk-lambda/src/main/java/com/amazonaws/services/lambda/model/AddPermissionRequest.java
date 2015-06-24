/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Adds a permission to the access policy associated with the specified
 * AWS Lambda function. In a "push event" model, the access policy
 * attached to the Lambda function grants Amazon S3 or a user application
 * permission for the Lambda <code>lambda:Invoke</code> action. For
 * information about the push model, see
 * <a href="http://docs.aws.amazon.com/lambda/latest/dg/lambda-introduction.html"> AWS Lambda: How it Works </a>
 * . Each Lambda function has one access policy associated with it. You
 * can use the <code>AddPermission</code> API to add a permission to the
 * policy. You have one access policy but it can have multiple permission
 * statements.
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
     * Name of the Lambda function whose access policy you are updating by
     * adding a new permission. <p> You can specify an unqualified function
     * name (for example, "Thumbnail") or you can specify Amazon Resource
     * Name (ARN) of the function (for example,
     * "arn:aws:lambda:us-west-2:account-id:function:ThumbNail"). AWS Lambda
     * also allows you to specify only the account ID qualifier (for example,
     * "account-id:Thumbnail"). Note that the length constraint applies only
     * to the ARN. If you specify only the function name, it is limited to 64
     * character in length.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 111<br/>
     * <b>Pattern: </b>(arn:aws:lambda:)?([a-z]{2}-[a-z]+-\d{1}:)?(\d{12}:)?(function:)?([a-zA-Z0-9-_]+)<br/>
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
     * action is a string starting with "lambda:" followed by the API name
     * (see <a>Operations</a>). For example, "lambda:CreateFunction". You can
     * use wildcard ("lambda:*") to grant permission for all AWS Lambda
     * actions.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(lambda:[*]|lambda:[a-zA-Z]+|[*])<br/>
     */
    private String action;

    /**
     * The principal who is getting this permission. It can be Amazon S3
     * service Principal ("s3.amazonaws.com") if you want Amazon S3 to invoke
     * the function, an AWS account ID if you are granting cross-account
     * permission, or any valid AWS service principal such as
     * "sns.amazonaws.com". For example, you might want to allow a custom
     * application in another AWS account to push events to AWS Lambda by
     * invoking your function.
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

    /**
     * Name of the Lambda function whose access policy you are updating by
     * adding a new permission. <p> You can specify an unqualified function
     * name (for example, "Thumbnail") or you can specify Amazon Resource
     * Name (ARN) of the function (for example,
     * "arn:aws:lambda:us-west-2:account-id:function:ThumbNail"). AWS Lambda
     * also allows you to specify only the account ID qualifier (for example,
     * "account-id:Thumbnail"). Note that the length constraint applies only
     * to the ARN. If you specify only the function name, it is limited to 64
     * character in length.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 111<br/>
     * <b>Pattern: </b>(arn:aws:lambda:)?([a-z]{2}-[a-z]+-\d{1}:)?(\d{12}:)?(function:)?([a-zA-Z0-9-_]+)<br/>
     *
     * @return Name of the Lambda function whose access policy you are updating by
     *         adding a new permission. <p> You can specify an unqualified function
     *         name (for example, "Thumbnail") or you can specify Amazon Resource
     *         Name (ARN) of the function (for example,
     *         "arn:aws:lambda:us-west-2:account-id:function:ThumbNail"). AWS Lambda
     *         also allows you to specify only the account ID qualifier (for example,
     *         "account-id:Thumbnail"). Note that the length constraint applies only
     *         to the ARN. If you specify only the function name, it is limited to 64
     *         character in length.
     */
    public String getFunctionName() {
        return functionName;
    }
    
    /**
     * Name of the Lambda function whose access policy you are updating by
     * adding a new permission. <p> You can specify an unqualified function
     * name (for example, "Thumbnail") or you can specify Amazon Resource
     * Name (ARN) of the function (for example,
     * "arn:aws:lambda:us-west-2:account-id:function:ThumbNail"). AWS Lambda
     * also allows you to specify only the account ID qualifier (for example,
     * "account-id:Thumbnail"). Note that the length constraint applies only
     * to the ARN. If you specify only the function name, it is limited to 64
     * character in length.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 111<br/>
     * <b>Pattern: </b>(arn:aws:lambda:)?([a-z]{2}-[a-z]+-\d{1}:)?(\d{12}:)?(function:)?([a-zA-Z0-9-_]+)<br/>
     *
     * @param functionName Name of the Lambda function whose access policy you are updating by
     *         adding a new permission. <p> You can specify an unqualified function
     *         name (for example, "Thumbnail") or you can specify Amazon Resource
     *         Name (ARN) of the function (for example,
     *         "arn:aws:lambda:us-west-2:account-id:function:ThumbNail"). AWS Lambda
     *         also allows you to specify only the account ID qualifier (for example,
     *         "account-id:Thumbnail"). Note that the length constraint applies only
     *         to the ARN. If you specify only the function name, it is limited to 64
     *         character in length.
     */
    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }
    
    /**
     * Name of the Lambda function whose access policy you are updating by
     * adding a new permission. <p> You can specify an unqualified function
     * name (for example, "Thumbnail") or you can specify Amazon Resource
     * Name (ARN) of the function (for example,
     * "arn:aws:lambda:us-west-2:account-id:function:ThumbNail"). AWS Lambda
     * also allows you to specify only the account ID qualifier (for example,
     * "account-id:Thumbnail"). Note that the length constraint applies only
     * to the ARN. If you specify only the function name, it is limited to 64
     * character in length.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 111<br/>
     * <b>Pattern: </b>(arn:aws:lambda:)?([a-z]{2}-[a-z]+-\d{1}:)?(\d{12}:)?(function:)?([a-zA-Z0-9-_]+)<br/>
     *
     * @param functionName Name of the Lambda function whose access policy you are updating by
     *         adding a new permission. <p> You can specify an unqualified function
     *         name (for example, "Thumbnail") or you can specify Amazon Resource
     *         Name (ARN) of the function (for example,
     *         "arn:aws:lambda:us-west-2:account-id:function:ThumbNail"). AWS Lambda
     *         also allows you to specify only the account ID qualifier (for example,
     *         "account-id:Thumbnail"). Note that the length constraint applies only
     *         to the ARN. If you specify only the function name, it is limited to 64
     *         character in length.
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
     * action is a string starting with "lambda:" followed by the API name
     * (see <a>Operations</a>). For example, "lambda:CreateFunction". You can
     * use wildcard ("lambda:*") to grant permission for all AWS Lambda
     * actions.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(lambda:[*]|lambda:[a-zA-Z]+|[*])<br/>
     *
     * @return The AWS Lambda action you want to allow in this statement. Each Lambda
     *         action is a string starting with "lambda:" followed by the API name
     *         (see <a>Operations</a>). For example, "lambda:CreateFunction". You can
     *         use wildcard ("lambda:*") to grant permission for all AWS Lambda
     *         actions.
     */
    public String getAction() {
        return action;
    }
    
    /**
     * The AWS Lambda action you want to allow in this statement. Each Lambda
     * action is a string starting with "lambda:" followed by the API name
     * (see <a>Operations</a>). For example, "lambda:CreateFunction". You can
     * use wildcard ("lambda:*") to grant permission for all AWS Lambda
     * actions.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(lambda:[*]|lambda:[a-zA-Z]+|[*])<br/>
     *
     * @param action The AWS Lambda action you want to allow in this statement. Each Lambda
     *         action is a string starting with "lambda:" followed by the API name
     *         (see <a>Operations</a>). For example, "lambda:CreateFunction". You can
     *         use wildcard ("lambda:*") to grant permission for all AWS Lambda
     *         actions.
     */
    public void setAction(String action) {
        this.action = action;
    }
    
    /**
     * The AWS Lambda action you want to allow in this statement. Each Lambda
     * action is a string starting with "lambda:" followed by the API name
     * (see <a>Operations</a>). For example, "lambda:CreateFunction". You can
     * use wildcard ("lambda:*") to grant permission for all AWS Lambda
     * actions.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(lambda:[*]|lambda:[a-zA-Z]+|[*])<br/>
     *
     * @param action The AWS Lambda action you want to allow in this statement. Each Lambda
     *         action is a string starting with "lambda:" followed by the API name
     *         (see <a>Operations</a>). For example, "lambda:CreateFunction". You can
     *         use wildcard ("lambda:*") to grant permission for all AWS Lambda
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
     * service Principal ("s3.amazonaws.com") if you want Amazon S3 to invoke
     * the function, an AWS account ID if you are granting cross-account
     * permission, or any valid AWS service principal such as
     * "sns.amazonaws.com". For example, you might want to allow a custom
     * application in another AWS account to push events to AWS Lambda by
     * invoking your function.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @return The principal who is getting this permission. It can be Amazon S3
     *         service Principal ("s3.amazonaws.com") if you want Amazon S3 to invoke
     *         the function, an AWS account ID if you are granting cross-account
     *         permission, or any valid AWS service principal such as
     *         "sns.amazonaws.com". For example, you might want to allow a custom
     *         application in another AWS account to push events to AWS Lambda by
     *         invoking your function.
     */
    public String getPrincipal() {
        return principal;
    }
    
    /**
     * The principal who is getting this permission. It can be Amazon S3
     * service Principal ("s3.amazonaws.com") if you want Amazon S3 to invoke
     * the function, an AWS account ID if you are granting cross-account
     * permission, or any valid AWS service principal such as
     * "sns.amazonaws.com". For example, you might want to allow a custom
     * application in another AWS account to push events to AWS Lambda by
     * invoking your function.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param principal The principal who is getting this permission. It can be Amazon S3
     *         service Principal ("s3.amazonaws.com") if you want Amazon S3 to invoke
     *         the function, an AWS account ID if you are granting cross-account
     *         permission, or any valid AWS service principal such as
     *         "sns.amazonaws.com". For example, you might want to allow a custom
     *         application in another AWS account to push events to AWS Lambda by
     *         invoking your function.
     */
    public void setPrincipal(String principal) {
        this.principal = principal;
    }
    
    /**
     * The principal who is getting this permission. It can be Amazon S3
     * service Principal ("s3.amazonaws.com") if you want Amazon S3 to invoke
     * the function, an AWS account ID if you are granting cross-account
     * permission, or any valid AWS service principal such as
     * "sns.amazonaws.com". For example, you might want to allow a custom
     * application in another AWS account to push events to AWS Lambda by
     * invoking your function.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param principal The principal who is getting this permission. It can be Amazon S3
     *         service Principal ("s3.amazonaws.com") if you want Amazon S3 to invoke
     *         the function, an AWS account ID if you are granting cross-account
     *         permission, or any valid AWS service principal such as
     *         "sns.amazonaws.com". For example, you might want to allow a custom
     *         application in another AWS account to push events to AWS Lambda by
     *         invoking your function.
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
        if (getSourceAccount() != null) sb.append("SourceAccount: " + getSourceAccount() );
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
        return true;
    }
    
    @Override
    public AddPermissionRequest clone() {
        
            return (AddPermissionRequest) super.clone();
    }

}
    