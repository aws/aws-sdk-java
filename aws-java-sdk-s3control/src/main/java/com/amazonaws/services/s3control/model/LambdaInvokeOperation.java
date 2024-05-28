/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.s3control.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains the configuration parameters for a <code>Lambda Invoke</code> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/LambdaInvokeOperation" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LambdaInvokeOperation implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the Lambda function that the specified job will invoke on every object in the
     * manifest.
     * </p>
     */
    private String functionArn;
    /**
     * <p>
     * Specifies the schema version for the payload that Batch Operations sends when invoking an Lambda function.
     * Version <code>1.0</code> is the default. Version <code>2.0</code> is required when you use Batch Operations to
     * invoke Lambda functions that act on directory buckets, or if you need to specify <code>UserArguments</code>. For
     * more information, see <a href=
     * "https://aws.amazon.com/blogs/storage/automate-object-processing-in-amazon-s3-directory-buckets-with-s3-batch-operations-and-aws-lambda/"
     * >Automate object processing in Amazon S3 directory buckets with S3 Batch Operations and Lambda</a> in the
     * <i>Amazon Web Services Storage Blog</i>.
     * </p>
     * <important>
     * <p>
     * Ensure that your Lambda function code expects <code>InvocationSchemaVersion</code> <b>2.0</b> and uses bucket
     * name rather than bucket ARN. If the <code>InvocationSchemaVersion</code> does not match what your Lambda function
     * expects, your function might not work as expected.
     * </p>
     * </important> <note>
     * <p>
     * <b>Directory buckets</b> - To initiate Amazon Web Services Lambda function to perform custom actions on objects
     * in directory buckets, you must specify <code>2.0</code>.
     * </p>
     * </note>
     */
    private String invocationSchemaVersion;
    /**
     * <p>
     * Key-value pairs that are passed in the payload that Batch Operations sends when invoking an Lambda function. You
     * must specify <code>InvocationSchemaVersion</code> <b>2.0</b> for <code>LambdaInvoke</code> operations that
     * include <code>UserArguments</code>. For more information, see <a href=
     * "https://aws.amazon.com/blogs/storage/automate-object-processing-in-amazon-s3-directory-buckets-with-s3-batch-operations-and-aws-lambda/"
     * >Automate object processing in Amazon S3 directory buckets with S3 Batch Operations and Lambda</a> in the
     * <i>Amazon Web Services Storage Blog</i>.
     * </p>
     */
    private java.util.Map<String, String> userArguments;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the Lambda function that the specified job will invoke on every object in the
     * manifest.
     * </p>
     * 
     * @param functionArn
     *        The Amazon Resource Name (ARN) for the Lambda function that the specified job will invoke on every object
     *        in the manifest.
     */

    public void setFunctionArn(String functionArn) {
        this.functionArn = functionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the Lambda function that the specified job will invoke on every object in the
     * manifest.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the Lambda function that the specified job will invoke on every object
     *         in the manifest.
     */

    public String getFunctionArn() {
        return this.functionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the Lambda function that the specified job will invoke on every object in the
     * manifest.
     * </p>
     * 
     * @param functionArn
     *        The Amazon Resource Name (ARN) for the Lambda function that the specified job will invoke on every object
     *        in the manifest.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaInvokeOperation withFunctionArn(String functionArn) {
        setFunctionArn(functionArn);
        return this;
    }

    /**
     * <p>
     * Specifies the schema version for the payload that Batch Operations sends when invoking an Lambda function.
     * Version <code>1.0</code> is the default. Version <code>2.0</code> is required when you use Batch Operations to
     * invoke Lambda functions that act on directory buckets, or if you need to specify <code>UserArguments</code>. For
     * more information, see <a href=
     * "https://aws.amazon.com/blogs/storage/automate-object-processing-in-amazon-s3-directory-buckets-with-s3-batch-operations-and-aws-lambda/"
     * >Automate object processing in Amazon S3 directory buckets with S3 Batch Operations and Lambda</a> in the
     * <i>Amazon Web Services Storage Blog</i>.
     * </p>
     * <important>
     * <p>
     * Ensure that your Lambda function code expects <code>InvocationSchemaVersion</code> <b>2.0</b> and uses bucket
     * name rather than bucket ARN. If the <code>InvocationSchemaVersion</code> does not match what your Lambda function
     * expects, your function might not work as expected.
     * </p>
     * </important> <note>
     * <p>
     * <b>Directory buckets</b> - To initiate Amazon Web Services Lambda function to perform custom actions on objects
     * in directory buckets, you must specify <code>2.0</code>.
     * </p>
     * </note>
     * 
     * @param invocationSchemaVersion
     *        Specifies the schema version for the payload that Batch Operations sends when invoking an Lambda function.
     *        Version <code>1.0</code> is the default. Version <code>2.0</code> is required when you use Batch
     *        Operations to invoke Lambda functions that act on directory buckets, or if you need to specify
     *        <code>UserArguments</code>. For more information, see <a href=
     *        "https://aws.amazon.com/blogs/storage/automate-object-processing-in-amazon-s3-directory-buckets-with-s3-batch-operations-and-aws-lambda/"
     *        >Automate object processing in Amazon S3 directory buckets with S3 Batch Operations and Lambda</a> in the
     *        <i>Amazon Web Services Storage Blog</i>.</p> <important>
     *        <p>
     *        Ensure that your Lambda function code expects <code>InvocationSchemaVersion</code> <b>2.0</b> and uses
     *        bucket name rather than bucket ARN. If the <code>InvocationSchemaVersion</code> does not match what your
     *        Lambda function expects, your function might not work as expected.
     *        </p>
     *        </important> <note>
     *        <p>
     *        <b>Directory buckets</b> - To initiate Amazon Web Services Lambda function to perform custom actions on
     *        objects in directory buckets, you must specify <code>2.0</code>.
     *        </p>
     */

    public void setInvocationSchemaVersion(String invocationSchemaVersion) {
        this.invocationSchemaVersion = invocationSchemaVersion;
    }

    /**
     * <p>
     * Specifies the schema version for the payload that Batch Operations sends when invoking an Lambda function.
     * Version <code>1.0</code> is the default. Version <code>2.0</code> is required when you use Batch Operations to
     * invoke Lambda functions that act on directory buckets, or if you need to specify <code>UserArguments</code>. For
     * more information, see <a href=
     * "https://aws.amazon.com/blogs/storage/automate-object-processing-in-amazon-s3-directory-buckets-with-s3-batch-operations-and-aws-lambda/"
     * >Automate object processing in Amazon S3 directory buckets with S3 Batch Operations and Lambda</a> in the
     * <i>Amazon Web Services Storage Blog</i>.
     * </p>
     * <important>
     * <p>
     * Ensure that your Lambda function code expects <code>InvocationSchemaVersion</code> <b>2.0</b> and uses bucket
     * name rather than bucket ARN. If the <code>InvocationSchemaVersion</code> does not match what your Lambda function
     * expects, your function might not work as expected.
     * </p>
     * </important> <note>
     * <p>
     * <b>Directory buckets</b> - To initiate Amazon Web Services Lambda function to perform custom actions on objects
     * in directory buckets, you must specify <code>2.0</code>.
     * </p>
     * </note>
     * 
     * @return Specifies the schema version for the payload that Batch Operations sends when invoking an Lambda
     *         function. Version <code>1.0</code> is the default. Version <code>2.0</code> is required when you use
     *         Batch Operations to invoke Lambda functions that act on directory buckets, or if you need to specify
     *         <code>UserArguments</code>. For more information, see <a href=
     *         "https://aws.amazon.com/blogs/storage/automate-object-processing-in-amazon-s3-directory-buckets-with-s3-batch-operations-and-aws-lambda/"
     *         >Automate object processing in Amazon S3 directory buckets with S3 Batch Operations and Lambda</a> in the
     *         <i>Amazon Web Services Storage Blog</i>.</p> <important>
     *         <p>
     *         Ensure that your Lambda function code expects <code>InvocationSchemaVersion</code> <b>2.0</b> and uses
     *         bucket name rather than bucket ARN. If the <code>InvocationSchemaVersion</code> does not match what your
     *         Lambda function expects, your function might not work as expected.
     *         </p>
     *         </important> <note>
     *         <p>
     *         <b>Directory buckets</b> - To initiate Amazon Web Services Lambda function to perform custom actions on
     *         objects in directory buckets, you must specify <code>2.0</code>.
     *         </p>
     */

    public String getInvocationSchemaVersion() {
        return this.invocationSchemaVersion;
    }

    /**
     * <p>
     * Specifies the schema version for the payload that Batch Operations sends when invoking an Lambda function.
     * Version <code>1.0</code> is the default. Version <code>2.0</code> is required when you use Batch Operations to
     * invoke Lambda functions that act on directory buckets, or if you need to specify <code>UserArguments</code>. For
     * more information, see <a href=
     * "https://aws.amazon.com/blogs/storage/automate-object-processing-in-amazon-s3-directory-buckets-with-s3-batch-operations-and-aws-lambda/"
     * >Automate object processing in Amazon S3 directory buckets with S3 Batch Operations and Lambda</a> in the
     * <i>Amazon Web Services Storage Blog</i>.
     * </p>
     * <important>
     * <p>
     * Ensure that your Lambda function code expects <code>InvocationSchemaVersion</code> <b>2.0</b> and uses bucket
     * name rather than bucket ARN. If the <code>InvocationSchemaVersion</code> does not match what your Lambda function
     * expects, your function might not work as expected.
     * </p>
     * </important> <note>
     * <p>
     * <b>Directory buckets</b> - To initiate Amazon Web Services Lambda function to perform custom actions on objects
     * in directory buckets, you must specify <code>2.0</code>.
     * </p>
     * </note>
     * 
     * @param invocationSchemaVersion
     *        Specifies the schema version for the payload that Batch Operations sends when invoking an Lambda function.
     *        Version <code>1.0</code> is the default. Version <code>2.0</code> is required when you use Batch
     *        Operations to invoke Lambda functions that act on directory buckets, or if you need to specify
     *        <code>UserArguments</code>. For more information, see <a href=
     *        "https://aws.amazon.com/blogs/storage/automate-object-processing-in-amazon-s3-directory-buckets-with-s3-batch-operations-and-aws-lambda/"
     *        >Automate object processing in Amazon S3 directory buckets with S3 Batch Operations and Lambda</a> in the
     *        <i>Amazon Web Services Storage Blog</i>.</p> <important>
     *        <p>
     *        Ensure that your Lambda function code expects <code>InvocationSchemaVersion</code> <b>2.0</b> and uses
     *        bucket name rather than bucket ARN. If the <code>InvocationSchemaVersion</code> does not match what your
     *        Lambda function expects, your function might not work as expected.
     *        </p>
     *        </important> <note>
     *        <p>
     *        <b>Directory buckets</b> - To initiate Amazon Web Services Lambda function to perform custom actions on
     *        objects in directory buckets, you must specify <code>2.0</code>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaInvokeOperation withInvocationSchemaVersion(String invocationSchemaVersion) {
        setInvocationSchemaVersion(invocationSchemaVersion);
        return this;
    }

    /**
     * <p>
     * Key-value pairs that are passed in the payload that Batch Operations sends when invoking an Lambda function. You
     * must specify <code>InvocationSchemaVersion</code> <b>2.0</b> for <code>LambdaInvoke</code> operations that
     * include <code>UserArguments</code>. For more information, see <a href=
     * "https://aws.amazon.com/blogs/storage/automate-object-processing-in-amazon-s3-directory-buckets-with-s3-batch-operations-and-aws-lambda/"
     * >Automate object processing in Amazon S3 directory buckets with S3 Batch Operations and Lambda</a> in the
     * <i>Amazon Web Services Storage Blog</i>.
     * </p>
     * 
     * @return Key-value pairs that are passed in the payload that Batch Operations sends when invoking an Lambda
     *         function. You must specify <code>InvocationSchemaVersion</code> <b>2.0</b> for <code>LambdaInvoke</code>
     *         operations that include <code>UserArguments</code>. For more information, see <a href=
     *         "https://aws.amazon.com/blogs/storage/automate-object-processing-in-amazon-s3-directory-buckets-with-s3-batch-operations-and-aws-lambda/"
     *         >Automate object processing in Amazon S3 directory buckets with S3 Batch Operations and Lambda</a> in the
     *         <i>Amazon Web Services Storage Blog</i>.
     */

    public java.util.Map<String, String> getUserArguments() {
        return userArguments;
    }

    /**
     * <p>
     * Key-value pairs that are passed in the payload that Batch Operations sends when invoking an Lambda function. You
     * must specify <code>InvocationSchemaVersion</code> <b>2.0</b> for <code>LambdaInvoke</code> operations that
     * include <code>UserArguments</code>. For more information, see <a href=
     * "https://aws.amazon.com/blogs/storage/automate-object-processing-in-amazon-s3-directory-buckets-with-s3-batch-operations-and-aws-lambda/"
     * >Automate object processing in Amazon S3 directory buckets with S3 Batch Operations and Lambda</a> in the
     * <i>Amazon Web Services Storage Blog</i>.
     * </p>
     * 
     * @param userArguments
     *        Key-value pairs that are passed in the payload that Batch Operations sends when invoking an Lambda
     *        function. You must specify <code>InvocationSchemaVersion</code> <b>2.0</b> for <code>LambdaInvoke</code>
     *        operations that include <code>UserArguments</code>. For more information, see <a href=
     *        "https://aws.amazon.com/blogs/storage/automate-object-processing-in-amazon-s3-directory-buckets-with-s3-batch-operations-and-aws-lambda/"
     *        >Automate object processing in Amazon S3 directory buckets with S3 Batch Operations and Lambda</a> in the
     *        <i>Amazon Web Services Storage Blog</i>.
     */

    public void setUserArguments(java.util.Map<String, String> userArguments) {
        this.userArguments = userArguments;
    }

    /**
     * <p>
     * Key-value pairs that are passed in the payload that Batch Operations sends when invoking an Lambda function. You
     * must specify <code>InvocationSchemaVersion</code> <b>2.0</b> for <code>LambdaInvoke</code> operations that
     * include <code>UserArguments</code>. For more information, see <a href=
     * "https://aws.amazon.com/blogs/storage/automate-object-processing-in-amazon-s3-directory-buckets-with-s3-batch-operations-and-aws-lambda/"
     * >Automate object processing in Amazon S3 directory buckets with S3 Batch Operations and Lambda</a> in the
     * <i>Amazon Web Services Storage Blog</i>.
     * </p>
     * 
     * @param userArguments
     *        Key-value pairs that are passed in the payload that Batch Operations sends when invoking an Lambda
     *        function. You must specify <code>InvocationSchemaVersion</code> <b>2.0</b> for <code>LambdaInvoke</code>
     *        operations that include <code>UserArguments</code>. For more information, see <a href=
     *        "https://aws.amazon.com/blogs/storage/automate-object-processing-in-amazon-s3-directory-buckets-with-s3-batch-operations-and-aws-lambda/"
     *        >Automate object processing in Amazon S3 directory buckets with S3 Batch Operations and Lambda</a> in the
     *        <i>Amazon Web Services Storage Blog</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaInvokeOperation withUserArguments(java.util.Map<String, String> userArguments) {
        setUserArguments(userArguments);
        return this;
    }

    /**
     * Add a single UserArguments entry
     *
     * @see LambdaInvokeOperation#withUserArguments
     * @returns a reference to this object so that method calls can be chained together.
     */

    public LambdaInvokeOperation addUserArgumentsEntry(String key, String value) {
        if (null == this.userArguments) {
            this.userArguments = new java.util.HashMap<String, String>();
        }
        if (this.userArguments.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.userArguments.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into UserArguments.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaInvokeOperation clearUserArgumentsEntries() {
        this.userArguments = null;
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
        if (getFunctionArn() != null)
            sb.append("FunctionArn: ").append(getFunctionArn()).append(",");
        if (getInvocationSchemaVersion() != null)
            sb.append("InvocationSchemaVersion: ").append(getInvocationSchemaVersion()).append(",");
        if (getUserArguments() != null)
            sb.append("UserArguments: ").append(getUserArguments());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LambdaInvokeOperation == false)
            return false;
        LambdaInvokeOperation other = (LambdaInvokeOperation) obj;
        if (other.getFunctionArn() == null ^ this.getFunctionArn() == null)
            return false;
        if (other.getFunctionArn() != null && other.getFunctionArn().equals(this.getFunctionArn()) == false)
            return false;
        if (other.getInvocationSchemaVersion() == null ^ this.getInvocationSchemaVersion() == null)
            return false;
        if (other.getInvocationSchemaVersion() != null && other.getInvocationSchemaVersion().equals(this.getInvocationSchemaVersion()) == false)
            return false;
        if (other.getUserArguments() == null ^ this.getUserArguments() == null)
            return false;
        if (other.getUserArguments() != null && other.getUserArguments().equals(this.getUserArguments()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFunctionArn() == null) ? 0 : getFunctionArn().hashCode());
        hashCode = prime * hashCode + ((getInvocationSchemaVersion() == null) ? 0 : getInvocationSchemaVersion().hashCode());
        hashCode = prime * hashCode + ((getUserArguments() == null) ? 0 : getUserArguments().hashCode());
        return hashCode;
    }

    @Override
    public LambdaInvokeOperation clone() {
        try {
            return (LambdaInvokeOperation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
