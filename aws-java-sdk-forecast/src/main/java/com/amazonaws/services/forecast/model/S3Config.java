/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.forecast.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The path to the file(s) in an Amazon Simple Storage Service (Amazon S3) bucket, and an AWS Identity and Access
 * Management (IAM) role that Amazon Forecast can assume to access the file(s). Optionally, includes an AWS Key
 * Management Service (KMS) key. This object is part of the <a>DataSource</a> object that is submitted in the
 * <a>CreateDatasetImportJob</a> request, and part of the <a>DataDestination</a> object that is submitted in the
 * <a>CreateForecastExportJob</a> request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/S3Config" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3Config implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The path to an Amazon Simple Storage Service (Amazon S3) bucket or file(s) in an Amazon S3 bucket.
     * </p>
     */
    private String path;
    /**
     * <p>
     * The ARN of the AWS Identity and Access Management (IAM) role that Amazon Forecast can assume to access the Amazon
     * S3 bucket or files. If you provide a value for the <code>KMSKeyArn</code> key, the role must allow access to the
     * key.
     * </p>
     * <p>
     * Passing a role across AWS accounts is not allowed. If you pass a role that isn't in your account, you get an
     * <code>InvalidInputException</code> error.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of an AWS Key Management Service (KMS) key.
     * </p>
     */
    private String kMSKeyArn;

    /**
     * <p>
     * The path to an Amazon Simple Storage Service (Amazon S3) bucket or file(s) in an Amazon S3 bucket.
     * </p>
     * 
     * @param path
     *        The path to an Amazon Simple Storage Service (Amazon S3) bucket or file(s) in an Amazon S3 bucket.
     */

    public void setPath(String path) {
        this.path = path;
    }

    /**
     * <p>
     * The path to an Amazon Simple Storage Service (Amazon S3) bucket or file(s) in an Amazon S3 bucket.
     * </p>
     * 
     * @return The path to an Amazon Simple Storage Service (Amazon S3) bucket or file(s) in an Amazon S3 bucket.
     */

    public String getPath() {
        return this.path;
    }

    /**
     * <p>
     * The path to an Amazon Simple Storage Service (Amazon S3) bucket or file(s) in an Amazon S3 bucket.
     * </p>
     * 
     * @param path
     *        The path to an Amazon Simple Storage Service (Amazon S3) bucket or file(s) in an Amazon S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Config withPath(String path) {
        setPath(path);
        return this;
    }

    /**
     * <p>
     * The ARN of the AWS Identity and Access Management (IAM) role that Amazon Forecast can assume to access the Amazon
     * S3 bucket or files. If you provide a value for the <code>KMSKeyArn</code> key, the role must allow access to the
     * key.
     * </p>
     * <p>
     * Passing a role across AWS accounts is not allowed. If you pass a role that isn't in your account, you get an
     * <code>InvalidInputException</code> error.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the AWS Identity and Access Management (IAM) role that Amazon Forecast can assume to access the
     *        Amazon S3 bucket or files. If you provide a value for the <code>KMSKeyArn</code> key, the role must allow
     *        access to the key.</p>
     *        <p>
     *        Passing a role across AWS accounts is not allowed. If you pass a role that isn't in your account, you get
     *        an <code>InvalidInputException</code> error.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The ARN of the AWS Identity and Access Management (IAM) role that Amazon Forecast can assume to access the Amazon
     * S3 bucket or files. If you provide a value for the <code>KMSKeyArn</code> key, the role must allow access to the
     * key.
     * </p>
     * <p>
     * Passing a role across AWS accounts is not allowed. If you pass a role that isn't in your account, you get an
     * <code>InvalidInputException</code> error.
     * </p>
     * 
     * @return The ARN of the AWS Identity and Access Management (IAM) role that Amazon Forecast can assume to access
     *         the Amazon S3 bucket or files. If you provide a value for the <code>KMSKeyArn</code> key, the role must
     *         allow access to the key.</p>
     *         <p>
     *         Passing a role across AWS accounts is not allowed. If you pass a role that isn't in your account, you get
     *         an <code>InvalidInputException</code> error.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The ARN of the AWS Identity and Access Management (IAM) role that Amazon Forecast can assume to access the Amazon
     * S3 bucket or files. If you provide a value for the <code>KMSKeyArn</code> key, the role must allow access to the
     * key.
     * </p>
     * <p>
     * Passing a role across AWS accounts is not allowed. If you pass a role that isn't in your account, you get an
     * <code>InvalidInputException</code> error.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the AWS Identity and Access Management (IAM) role that Amazon Forecast can assume to access the
     *        Amazon S3 bucket or files. If you provide a value for the <code>KMSKeyArn</code> key, the role must allow
     *        access to the key.</p>
     *        <p>
     *        Passing a role across AWS accounts is not allowed. If you pass a role that isn't in your account, you get
     *        an <code>InvalidInputException</code> error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Config withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an AWS Key Management Service (KMS) key.
     * </p>
     * 
     * @param kMSKeyArn
     *        The Amazon Resource Name (ARN) of an AWS Key Management Service (KMS) key.
     */

    public void setKMSKeyArn(String kMSKeyArn) {
        this.kMSKeyArn = kMSKeyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an AWS Key Management Service (KMS) key.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of an AWS Key Management Service (KMS) key.
     */

    public String getKMSKeyArn() {
        return this.kMSKeyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an AWS Key Management Service (KMS) key.
     * </p>
     * 
     * @param kMSKeyArn
     *        The Amazon Resource Name (ARN) of an AWS Key Management Service (KMS) key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Config withKMSKeyArn(String kMSKeyArn) {
        setKMSKeyArn(kMSKeyArn);
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
        if (getPath() != null)
            sb.append("Path: ").append(getPath()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getKMSKeyArn() != null)
            sb.append("KMSKeyArn: ").append(getKMSKeyArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3Config == false)
            return false;
        S3Config other = (S3Config) obj;
        if (other.getPath() == null ^ this.getPath() == null)
            return false;
        if (other.getPath() != null && other.getPath().equals(this.getPath()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getKMSKeyArn() == null ^ this.getKMSKeyArn() == null)
            return false;
        if (other.getKMSKeyArn() != null && other.getKMSKeyArn().equals(this.getKMSKeyArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPath() == null) ? 0 : getPath().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getKMSKeyArn() == null) ? 0 : getKMSKeyArn().hashCode());
        return hashCode;
    }

    @Override
    public S3Config clone() {
        try {
            return (S3Config) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.forecast.model.transform.S3ConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
