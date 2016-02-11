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

/**
 * <p>
 * The code for the Lambda function.
 * </p>
 */
public class FunctionCode implements Serializable, Cloneable {

    /**
     * A zip file containing your deployment package. If you are using the
     * API directly, the zip file must be base64-encoded (if you are using
     * the AWS SDKs or the AWS CLI, the SDKs or CLI will do the encoding for
     * you). For more information about creating a .zip file, go to <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/intro-permission-model.html#lambda-intro-execution-role.html">Execution
     * Permissions</a> in the <i>AWS Lambda Developer Guide</i>.
     */
    private java.nio.ByteBuffer zipFile;

    /**
     * Amazon S3 bucket name where the .zip file containing your deployment
     * package is stored. This bucket must reside in the same AWS region
     * where you are creating the Lambda function.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 63<br/>
     * <b>Pattern: </b>^[0-9A-Za-z\.\-_]*(?<!\.)$<br/>
     */
    private String s3Bucket;

    /**
     * The Amazon S3 object (the deployment package) key name you want to
     * upload.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String s3Key;

    /**
     * The Amazon S3 object (the deployment package) version you want to
     * upload.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String s3ObjectVersion;

    /**
     * A zip file containing your deployment package. If you are using the
     * API directly, the zip file must be base64-encoded (if you are using
     * the AWS SDKs or the AWS CLI, the SDKs or CLI will do the encoding for
     * you). For more information about creating a .zip file, go to <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/intro-permission-model.html#lambda-intro-execution-role.html">Execution
     * Permissions</a> in the <i>AWS Lambda Developer Guide</i>.
     *
     * @return A zip file containing your deployment package. If you are using the
     *         API directly, the zip file must be base64-encoded (if you are using
     *         the AWS SDKs or the AWS CLI, the SDKs or CLI will do the encoding for
     *         you). For more information about creating a .zip file, go to <a
     *         href="http://docs.aws.amazon.com/lambda/latest/dg/intro-permission-model.html#lambda-intro-execution-role.html">Execution
     *         Permissions</a> in the <i>AWS Lambda Developer Guide</i>.
     */
    public java.nio.ByteBuffer getZipFile() {
        return zipFile;
    }
    
    /**
     * A zip file containing your deployment package. If you are using the
     * API directly, the zip file must be base64-encoded (if you are using
     * the AWS SDKs or the AWS CLI, the SDKs or CLI will do the encoding for
     * you). For more information about creating a .zip file, go to <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/intro-permission-model.html#lambda-intro-execution-role.html">Execution
     * Permissions</a> in the <i>AWS Lambda Developer Guide</i>.
     *
     * @param zipFile A zip file containing your deployment package. If you are using the
     *         API directly, the zip file must be base64-encoded (if you are using
     *         the AWS SDKs or the AWS CLI, the SDKs or CLI will do the encoding for
     *         you). For more information about creating a .zip file, go to <a
     *         href="http://docs.aws.amazon.com/lambda/latest/dg/intro-permission-model.html#lambda-intro-execution-role.html">Execution
     *         Permissions</a> in the <i>AWS Lambda Developer Guide</i>.
     */
    public void setZipFile(java.nio.ByteBuffer zipFile) {
        this.zipFile = zipFile;
    }
    
    /**
     * A zip file containing your deployment package. If you are using the
     * API directly, the zip file must be base64-encoded (if you are using
     * the AWS SDKs or the AWS CLI, the SDKs or CLI will do the encoding for
     * you). For more information about creating a .zip file, go to <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/intro-permission-model.html#lambda-intro-execution-role.html">Execution
     * Permissions</a> in the <i>AWS Lambda Developer Guide</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param zipFile A zip file containing your deployment package. If you are using the
     *         API directly, the zip file must be base64-encoded (if you are using
     *         the AWS SDKs or the AWS CLI, the SDKs or CLI will do the encoding for
     *         you). For more information about creating a .zip file, go to <a
     *         href="http://docs.aws.amazon.com/lambda/latest/dg/intro-permission-model.html#lambda-intro-execution-role.html">Execution
     *         Permissions</a> in the <i>AWS Lambda Developer Guide</i>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public FunctionCode withZipFile(java.nio.ByteBuffer zipFile) {
        this.zipFile = zipFile;
        return this;
    }

    /**
     * Amazon S3 bucket name where the .zip file containing your deployment
     * package is stored. This bucket must reside in the same AWS region
     * where you are creating the Lambda function.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 63<br/>
     * <b>Pattern: </b>^[0-9A-Za-z\.\-_]*(?<!\.)$<br/>
     *
     * @return Amazon S3 bucket name where the .zip file containing your deployment
     *         package is stored. This bucket must reside in the same AWS region
     *         where you are creating the Lambda function.
     */
    public String getS3Bucket() {
        return s3Bucket;
    }
    
    /**
     * Amazon S3 bucket name where the .zip file containing your deployment
     * package is stored. This bucket must reside in the same AWS region
     * where you are creating the Lambda function.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 63<br/>
     * <b>Pattern: </b>^[0-9A-Za-z\.\-_]*(?<!\.)$<br/>
     *
     * @param s3Bucket Amazon S3 bucket name where the .zip file containing your deployment
     *         package is stored. This bucket must reside in the same AWS region
     *         where you are creating the Lambda function.
     */
    public void setS3Bucket(String s3Bucket) {
        this.s3Bucket = s3Bucket;
    }
    
    /**
     * Amazon S3 bucket name where the .zip file containing your deployment
     * package is stored. This bucket must reside in the same AWS region
     * where you are creating the Lambda function.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 63<br/>
     * <b>Pattern: </b>^[0-9A-Za-z\.\-_]*(?<!\.)$<br/>
     *
     * @param s3Bucket Amazon S3 bucket name where the .zip file containing your deployment
     *         package is stored. This bucket must reside in the same AWS region
     *         where you are creating the Lambda function.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public FunctionCode withS3Bucket(String s3Bucket) {
        this.s3Bucket = s3Bucket;
        return this;
    }

    /**
     * The Amazon S3 object (the deployment package) key name you want to
     * upload.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return The Amazon S3 object (the deployment package) key name you want to
     *         upload.
     */
    public String getS3Key() {
        return s3Key;
    }
    
    /**
     * The Amazon S3 object (the deployment package) key name you want to
     * upload.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param s3Key The Amazon S3 object (the deployment package) key name you want to
     *         upload.
     */
    public void setS3Key(String s3Key) {
        this.s3Key = s3Key;
    }
    
    /**
     * The Amazon S3 object (the deployment package) key name you want to
     * upload.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param s3Key The Amazon S3 object (the deployment package) key name you want to
     *         upload.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public FunctionCode withS3Key(String s3Key) {
        this.s3Key = s3Key;
        return this;
    }

    /**
     * The Amazon S3 object (the deployment package) version you want to
     * upload.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return The Amazon S3 object (the deployment package) version you want to
     *         upload.
     */
    public String getS3ObjectVersion() {
        return s3ObjectVersion;
    }
    
    /**
     * The Amazon S3 object (the deployment package) version you want to
     * upload.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param s3ObjectVersion The Amazon S3 object (the deployment package) version you want to
     *         upload.
     */
    public void setS3ObjectVersion(String s3ObjectVersion) {
        this.s3ObjectVersion = s3ObjectVersion;
    }
    
    /**
     * The Amazon S3 object (the deployment package) version you want to
     * upload.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param s3ObjectVersion The Amazon S3 object (the deployment package) version you want to
     *         upload.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public FunctionCode withS3ObjectVersion(String s3ObjectVersion) {
        this.s3ObjectVersion = s3ObjectVersion;
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
        if (getZipFile() != null) sb.append("ZipFile: " + getZipFile() + ",");
        if (getS3Bucket() != null) sb.append("S3Bucket: " + getS3Bucket() + ",");
        if (getS3Key() != null) sb.append("S3Key: " + getS3Key() + ",");
        if (getS3ObjectVersion() != null) sb.append("S3ObjectVersion: " + getS3ObjectVersion() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getZipFile() == null) ? 0 : getZipFile().hashCode()); 
        hashCode = prime * hashCode + ((getS3Bucket() == null) ? 0 : getS3Bucket().hashCode()); 
        hashCode = prime * hashCode + ((getS3Key() == null) ? 0 : getS3Key().hashCode()); 
        hashCode = prime * hashCode + ((getS3ObjectVersion() == null) ? 0 : getS3ObjectVersion().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof FunctionCode == false) return false;
        FunctionCode other = (FunctionCode)obj;
        
        if (other.getZipFile() == null ^ this.getZipFile() == null) return false;
        if (other.getZipFile() != null && other.getZipFile().equals(this.getZipFile()) == false) return false; 
        if (other.getS3Bucket() == null ^ this.getS3Bucket() == null) return false;
        if (other.getS3Bucket() != null && other.getS3Bucket().equals(this.getS3Bucket()) == false) return false; 
        if (other.getS3Key() == null ^ this.getS3Key() == null) return false;
        if (other.getS3Key() != null && other.getS3Key().equals(this.getS3Key()) == false) return false; 
        if (other.getS3ObjectVersion() == null ^ this.getS3ObjectVersion() == null) return false;
        if (other.getS3ObjectVersion() != null && other.getS3ObjectVersion().equals(this.getS3ObjectVersion()) == false) return false; 
        return true;
    }
    
    @Override
    public FunctionCode clone() {
        try {
            return (FunctionCode) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    