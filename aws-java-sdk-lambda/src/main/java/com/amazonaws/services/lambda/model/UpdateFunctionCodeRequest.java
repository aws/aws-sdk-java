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
public class UpdateFunctionCodeRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The existing Lambda function name whose code you want to replace.
     * </p>
     * <p>
     * You can specify a function name (for example, <code>Thumbnail</code>) or you can specify Amazon Resource Name
     * (ARN) of the function (for example, <code>arn:aws:lambda:us-west-2:account-id:function:ThumbNail</code>). AWS
     * Lambda also allows you to specify a partial ARN (for example, <code>account-id:Thumbnail</code>). Note that the
     * length constraint applies only to the ARN. If you specify only the function name, it is limited to 64 character
     * in length.
     * </p>
     */
    private String functionName;
    /**
     * <p>
     * The contents of your zip file containing your deployment package. If you are using the web API directly, the
     * contents of the zip file must be base64-encoded. If you are using the AWS SDKs or the AWS CLI, the SDKs or CLI
     * will do the encoding for you. For more information about creating a .zip file, go to <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/intro-permission-model.html#lambda-intro-execution-role.html"
     * >Execution Permissions</a> in the <i>AWS Lambda Developer Guide</i>.
     * </p>
     */
    private java.nio.ByteBuffer zipFile;
    /**
     * <p>
     * Amazon S3 bucket name where the .zip file containing your deployment package is stored. This bucket must reside
     * in the same AWS region where you are creating the Lambda function.
     * </p>
     */
    private String s3Bucket;
    /**
     * <p>
     * The Amazon S3 object (the deployment package) key name you want to upload.
     * </p>
     */
    private String s3Key;
    /**
     * <p>
     * The Amazon S3 object (the deployment package) version you want to upload.
     * </p>
     */
    private String s3ObjectVersion;
    /**
     * <p>
     * This boolean parameter can be used to request AWS Lambda to update the Lambda function and publish a version as
     * an atomic operation.
     * </p>
     */
    private Boolean publish;

    /**
     * <p>
     * The existing Lambda function name whose code you want to replace.
     * </p>
     * <p>
     * You can specify a function name (for example, <code>Thumbnail</code>) or you can specify Amazon Resource Name
     * (ARN) of the function (for example, <code>arn:aws:lambda:us-west-2:account-id:function:ThumbNail</code>). AWS
     * Lambda also allows you to specify a partial ARN (for example, <code>account-id:Thumbnail</code>). Note that the
     * length constraint applies only to the ARN. If you specify only the function name, it is limited to 64 character
     * in length.
     * </p>
     * 
     * @param functionName
     *        The existing Lambda function name whose code you want to replace.</p>
     *        <p>
     *        You can specify a function name (for example, <code>Thumbnail</code>) or you can specify Amazon Resource
     *        Name (ARN) of the function (for example,
     *        <code>arn:aws:lambda:us-west-2:account-id:function:ThumbNail</code>). AWS Lambda also allows you to
     *        specify a partial ARN (for example, <code>account-id:Thumbnail</code>). Note that the length constraint
     *        applies only to the ARN. If you specify only the function name, it is limited to 64 character in length.
     */

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    /**
     * <p>
     * The existing Lambda function name whose code you want to replace.
     * </p>
     * <p>
     * You can specify a function name (for example, <code>Thumbnail</code>) or you can specify Amazon Resource Name
     * (ARN) of the function (for example, <code>arn:aws:lambda:us-west-2:account-id:function:ThumbNail</code>). AWS
     * Lambda also allows you to specify a partial ARN (for example, <code>account-id:Thumbnail</code>). Note that the
     * length constraint applies only to the ARN. If you specify only the function name, it is limited to 64 character
     * in length.
     * </p>
     * 
     * @return The existing Lambda function name whose code you want to replace.</p>
     *         <p>
     *         You can specify a function name (for example, <code>Thumbnail</code>) or you can specify Amazon Resource
     *         Name (ARN) of the function (for example,
     *         <code>arn:aws:lambda:us-west-2:account-id:function:ThumbNail</code>). AWS Lambda also allows you to
     *         specify a partial ARN (for example, <code>account-id:Thumbnail</code>). Note that the length constraint
     *         applies only to the ARN. If you specify only the function name, it is limited to 64 character in length.
     */

    public String getFunctionName() {
        return this.functionName;
    }

    /**
     * <p>
     * The existing Lambda function name whose code you want to replace.
     * </p>
     * <p>
     * You can specify a function name (for example, <code>Thumbnail</code>) or you can specify Amazon Resource Name
     * (ARN) of the function (for example, <code>arn:aws:lambda:us-west-2:account-id:function:ThumbNail</code>). AWS
     * Lambda also allows you to specify a partial ARN (for example, <code>account-id:Thumbnail</code>). Note that the
     * length constraint applies only to the ARN. If you specify only the function name, it is limited to 64 character
     * in length.
     * </p>
     * 
     * @param functionName
     *        The existing Lambda function name whose code you want to replace.</p>
     *        <p>
     *        You can specify a function name (for example, <code>Thumbnail</code>) or you can specify Amazon Resource
     *        Name (ARN) of the function (for example,
     *        <code>arn:aws:lambda:us-west-2:account-id:function:ThumbNail</code>). AWS Lambda also allows you to
     *        specify a partial ARN (for example, <code>account-id:Thumbnail</code>). Note that the length constraint
     *        applies only to the ARN. If you specify only the function name, it is limited to 64 character in length.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFunctionCodeRequest withFunctionName(String functionName) {
        setFunctionName(functionName);
        return this;
    }

    /**
     * <p>
     * The contents of your zip file containing your deployment package. If you are using the web API directly, the
     * contents of the zip file must be base64-encoded. If you are using the AWS SDKs or the AWS CLI, the SDKs or CLI
     * will do the encoding for you. For more information about creating a .zip file, go to <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/intro-permission-model.html#lambda-intro-execution-role.html"
     * >Execution Permissions</a> in the <i>AWS Lambda Developer Guide</i>.
     * </p>
     * <p>
     * AWS SDK for Java performs a Base64 encoding on this field before sending this request to AWS service by default.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * <p>
     * Warning: ByteBuffers returned by the SDK are mutable. Changes to the content or position of the byte buffer will
     * be seen by all objects that have a reference to this object. It is recommended to call ByteBuffer.duplicate() or
     * ByteBuffer.asReadOnlyBuffer() before using or reading from the buffer. This behavior will be changed in a future
     * major version of the SDK.
     * </p>
     * 
     * @param zipFile
     *        The contents of your zip file containing your deployment package. If you are using the web API directly,
     *        the contents of the zip file must be base64-encoded. If you are using the AWS SDKs or the AWS CLI, the
     *        SDKs or CLI will do the encoding for you. For more information about creating a .zip file, go to <a href=
     *        "http://docs.aws.amazon.com/lambda/latest/dg/intro-permission-model.html#lambda-intro-execution-role.html"
     *        >Execution Permissions</a> in the <i>AWS Lambda Developer Guide</i>.
     */

    public void setZipFile(java.nio.ByteBuffer zipFile) {
        this.zipFile = zipFile;
    }

    /**
     * <p>
     * The contents of your zip file containing your deployment package. If you are using the web API directly, the
     * contents of the zip file must be base64-encoded. If you are using the AWS SDKs or the AWS CLI, the SDKs or CLI
     * will do the encoding for you. For more information about creating a .zip file, go to <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/intro-permission-model.html#lambda-intro-execution-role.html"
     * >Execution Permissions</a> in the <i>AWS Lambda Developer Guide</i>.
     * </p>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return The contents of your zip file containing your deployment package. If you are using the web API directly,
     *         the contents of the zip file must be base64-encoded. If you are using the AWS SDKs or the AWS CLI, the
     *         SDKs or CLI will do the encoding for you. For more information about creating a .zip file, go to <a href=
     *         "http://docs.aws.amazon.com/lambda/latest/dg/intro-permission-model.html#lambda-intro-execution-role.html"
     *         >Execution Permissions</a> in the <i>AWS Lambda Developer Guide</i>.
     */

    public java.nio.ByteBuffer getZipFile() {
        return this.zipFile;
    }

    /**
     * <p>
     * The contents of your zip file containing your deployment package. If you are using the web API directly, the
     * contents of the zip file must be base64-encoded. If you are using the AWS SDKs or the AWS CLI, the SDKs or CLI
     * will do the encoding for you. For more information about creating a .zip file, go to <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/intro-permission-model.html#lambda-intro-execution-role.html"
     * >Execution Permissions</a> in the <i>AWS Lambda Developer Guide</i>.
     * </p>
     * 
     * @param zipFile
     *        The contents of your zip file containing your deployment package. If you are using the web API directly,
     *        the contents of the zip file must be base64-encoded. If you are using the AWS SDKs or the AWS CLI, the
     *        SDKs or CLI will do the encoding for you. For more information about creating a .zip file, go to <a href=
     *        "http://docs.aws.amazon.com/lambda/latest/dg/intro-permission-model.html#lambda-intro-execution-role.html"
     *        >Execution Permissions</a> in the <i>AWS Lambda Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFunctionCodeRequest withZipFile(java.nio.ByteBuffer zipFile) {
        setZipFile(zipFile);
        return this;
    }

    /**
     * <p>
     * Amazon S3 bucket name where the .zip file containing your deployment package is stored. This bucket must reside
     * in the same AWS region where you are creating the Lambda function.
     * </p>
     * 
     * @param s3Bucket
     *        Amazon S3 bucket name where the .zip file containing your deployment package is stored. This bucket must
     *        reside in the same AWS region where you are creating the Lambda function.
     */

    public void setS3Bucket(String s3Bucket) {
        this.s3Bucket = s3Bucket;
    }

    /**
     * <p>
     * Amazon S3 bucket name where the .zip file containing your deployment package is stored. This bucket must reside
     * in the same AWS region where you are creating the Lambda function.
     * </p>
     * 
     * @return Amazon S3 bucket name where the .zip file containing your deployment package is stored. This bucket must
     *         reside in the same AWS region where you are creating the Lambda function.
     */

    public String getS3Bucket() {
        return this.s3Bucket;
    }

    /**
     * <p>
     * Amazon S3 bucket name where the .zip file containing your deployment package is stored. This bucket must reside
     * in the same AWS region where you are creating the Lambda function.
     * </p>
     * 
     * @param s3Bucket
     *        Amazon S3 bucket name where the .zip file containing your deployment package is stored. This bucket must
     *        reside in the same AWS region where you are creating the Lambda function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFunctionCodeRequest withS3Bucket(String s3Bucket) {
        setS3Bucket(s3Bucket);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 object (the deployment package) key name you want to upload.
     * </p>
     * 
     * @param s3Key
     *        The Amazon S3 object (the deployment package) key name you want to upload.
     */

    public void setS3Key(String s3Key) {
        this.s3Key = s3Key;
    }

    /**
     * <p>
     * The Amazon S3 object (the deployment package) key name you want to upload.
     * </p>
     * 
     * @return The Amazon S3 object (the deployment package) key name you want to upload.
     */

    public String getS3Key() {
        return this.s3Key;
    }

    /**
     * <p>
     * The Amazon S3 object (the deployment package) key name you want to upload.
     * </p>
     * 
     * @param s3Key
     *        The Amazon S3 object (the deployment package) key name you want to upload.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFunctionCodeRequest withS3Key(String s3Key) {
        setS3Key(s3Key);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 object (the deployment package) version you want to upload.
     * </p>
     * 
     * @param s3ObjectVersion
     *        The Amazon S3 object (the deployment package) version you want to upload.
     */

    public void setS3ObjectVersion(String s3ObjectVersion) {
        this.s3ObjectVersion = s3ObjectVersion;
    }

    /**
     * <p>
     * The Amazon S3 object (the deployment package) version you want to upload.
     * </p>
     * 
     * @return The Amazon S3 object (the deployment package) version you want to upload.
     */

    public String getS3ObjectVersion() {
        return this.s3ObjectVersion;
    }

    /**
     * <p>
     * The Amazon S3 object (the deployment package) version you want to upload.
     * </p>
     * 
     * @param s3ObjectVersion
     *        The Amazon S3 object (the deployment package) version you want to upload.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFunctionCodeRequest withS3ObjectVersion(String s3ObjectVersion) {
        setS3ObjectVersion(s3ObjectVersion);
        return this;
    }

    /**
     * <p>
     * This boolean parameter can be used to request AWS Lambda to update the Lambda function and publish a version as
     * an atomic operation.
     * </p>
     * 
     * @param publish
     *        This boolean parameter can be used to request AWS Lambda to update the Lambda function and publish a
     *        version as an atomic operation.
     */

    public void setPublish(Boolean publish) {
        this.publish = publish;
    }

    /**
     * <p>
     * This boolean parameter can be used to request AWS Lambda to update the Lambda function and publish a version as
     * an atomic operation.
     * </p>
     * 
     * @return This boolean parameter can be used to request AWS Lambda to update the Lambda function and publish a
     *         version as an atomic operation.
     */

    public Boolean getPublish() {
        return this.publish;
    }

    /**
     * <p>
     * This boolean parameter can be used to request AWS Lambda to update the Lambda function and publish a version as
     * an atomic operation.
     * </p>
     * 
     * @param publish
     *        This boolean parameter can be used to request AWS Lambda to update the Lambda function and publish a
     *        version as an atomic operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFunctionCodeRequest withPublish(Boolean publish) {
        setPublish(publish);
        return this;
    }

    /**
     * <p>
     * This boolean parameter can be used to request AWS Lambda to update the Lambda function and publish a version as
     * an atomic operation.
     * </p>
     * 
     * @return This boolean parameter can be used to request AWS Lambda to update the Lambda function and publish a
     *         version as an atomic operation.
     */

    public Boolean isPublish() {
        return this.publish;
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
        if (getZipFile() != null)
            sb.append("ZipFile: " + getZipFile() + ",");
        if (getS3Bucket() != null)
            sb.append("S3Bucket: " + getS3Bucket() + ",");
        if (getS3Key() != null)
            sb.append("S3Key: " + getS3Key() + ",");
        if (getS3ObjectVersion() != null)
            sb.append("S3ObjectVersion: " + getS3ObjectVersion() + ",");
        if (getPublish() != null)
            sb.append("Publish: " + getPublish());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateFunctionCodeRequest == false)
            return false;
        UpdateFunctionCodeRequest other = (UpdateFunctionCodeRequest) obj;
        if (other.getFunctionName() == null ^ this.getFunctionName() == null)
            return false;
        if (other.getFunctionName() != null && other.getFunctionName().equals(this.getFunctionName()) == false)
            return false;
        if (other.getZipFile() == null ^ this.getZipFile() == null)
            return false;
        if (other.getZipFile() != null && other.getZipFile().equals(this.getZipFile()) == false)
            return false;
        if (other.getS3Bucket() == null ^ this.getS3Bucket() == null)
            return false;
        if (other.getS3Bucket() != null && other.getS3Bucket().equals(this.getS3Bucket()) == false)
            return false;
        if (other.getS3Key() == null ^ this.getS3Key() == null)
            return false;
        if (other.getS3Key() != null && other.getS3Key().equals(this.getS3Key()) == false)
            return false;
        if (other.getS3ObjectVersion() == null ^ this.getS3ObjectVersion() == null)
            return false;
        if (other.getS3ObjectVersion() != null && other.getS3ObjectVersion().equals(this.getS3ObjectVersion()) == false)
            return false;
        if (other.getPublish() == null ^ this.getPublish() == null)
            return false;
        if (other.getPublish() != null && other.getPublish().equals(this.getPublish()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFunctionName() == null) ? 0 : getFunctionName().hashCode());
        hashCode = prime * hashCode + ((getZipFile() == null) ? 0 : getZipFile().hashCode());
        hashCode = prime * hashCode + ((getS3Bucket() == null) ? 0 : getS3Bucket().hashCode());
        hashCode = prime * hashCode + ((getS3Key() == null) ? 0 : getS3Key().hashCode());
        hashCode = prime * hashCode + ((getS3ObjectVersion() == null) ? 0 : getS3ObjectVersion().hashCode());
        hashCode = prime * hashCode + ((getPublish() == null) ? 0 : getPublish().hashCode());
        return hashCode;
    }

    @Override
    public UpdateFunctionCodeRequest clone() {
        return (UpdateFunctionCodeRequest) super.clone();
    }
}
