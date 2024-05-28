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
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GetAccessGrantsInstance" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetAccessGrantsInstanceResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.services.s3control.S3ControlResponseMetadata> implements
        Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the S3 Access Grants instance.
     * </p>
     */
    private String accessGrantsInstanceArn;
    /**
     * <p>
     * The ID of the S3 Access Grants instance. The ID is <code>default</code>. You can have one S3 Access Grants
     * instance per Region per account.
     * </p>
     */
    private String accessGrantsInstanceId;
    /**
     * <p>
     * If you associated your S3 Access Grants instance with an Amazon Web Services IAM Identity Center instance, this
     * field returns the Amazon Resource Name (ARN) of the Amazon Web Services IAM Identity Center instance application;
     * a subresource of the original Identity Center instance. S3 Access Grants creates this Identity Center application
     * for the specific S3 Access Grants instance.
     * </p>
     */
    private String identityCenterArn;
    /**
     * <p>
     * The date and time when you created the S3 Access Grants instance.
     * </p>
     */
    private java.util.Date createdAt;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the S3 Access Grants instance.
     * </p>
     * 
     * @param accessGrantsInstanceArn
     *        The Amazon Resource Name (ARN) of the S3 Access Grants instance.
     */

    public void setAccessGrantsInstanceArn(String accessGrantsInstanceArn) {
        this.accessGrantsInstanceArn = accessGrantsInstanceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the S3 Access Grants instance.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the S3 Access Grants instance.
     */

    public String getAccessGrantsInstanceArn() {
        return this.accessGrantsInstanceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the S3 Access Grants instance.
     * </p>
     * 
     * @param accessGrantsInstanceArn
     *        The Amazon Resource Name (ARN) of the S3 Access Grants instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAccessGrantsInstanceResult withAccessGrantsInstanceArn(String accessGrantsInstanceArn) {
        setAccessGrantsInstanceArn(accessGrantsInstanceArn);
        return this;
    }

    /**
     * <p>
     * The ID of the S3 Access Grants instance. The ID is <code>default</code>. You can have one S3 Access Grants
     * instance per Region per account.
     * </p>
     * 
     * @param accessGrantsInstanceId
     *        The ID of the S3 Access Grants instance. The ID is <code>default</code>. You can have one S3 Access Grants
     *        instance per Region per account.
     */

    public void setAccessGrantsInstanceId(String accessGrantsInstanceId) {
        this.accessGrantsInstanceId = accessGrantsInstanceId;
    }

    /**
     * <p>
     * The ID of the S3 Access Grants instance. The ID is <code>default</code>. You can have one S3 Access Grants
     * instance per Region per account.
     * </p>
     * 
     * @return The ID of the S3 Access Grants instance. The ID is <code>default</code>. You can have one S3 Access
     *         Grants instance per Region per account.
     */

    public String getAccessGrantsInstanceId() {
        return this.accessGrantsInstanceId;
    }

    /**
     * <p>
     * The ID of the S3 Access Grants instance. The ID is <code>default</code>. You can have one S3 Access Grants
     * instance per Region per account.
     * </p>
     * 
     * @param accessGrantsInstanceId
     *        The ID of the S3 Access Grants instance. The ID is <code>default</code>. You can have one S3 Access Grants
     *        instance per Region per account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAccessGrantsInstanceResult withAccessGrantsInstanceId(String accessGrantsInstanceId) {
        setAccessGrantsInstanceId(accessGrantsInstanceId);
        return this;
    }

    /**
     * <p>
     * If you associated your S3 Access Grants instance with an Amazon Web Services IAM Identity Center instance, this
     * field returns the Amazon Resource Name (ARN) of the Amazon Web Services IAM Identity Center instance application;
     * a subresource of the original Identity Center instance. S3 Access Grants creates this Identity Center application
     * for the specific S3 Access Grants instance.
     * </p>
     * 
     * @param identityCenterArn
     *        If you associated your S3 Access Grants instance with an Amazon Web Services IAM Identity Center instance,
     *        this field returns the Amazon Resource Name (ARN) of the Amazon Web Services IAM Identity Center instance
     *        application; a subresource of the original Identity Center instance. S3 Access Grants creates this
     *        Identity Center application for the specific S3 Access Grants instance.
     */

    public void setIdentityCenterArn(String identityCenterArn) {
        this.identityCenterArn = identityCenterArn;
    }

    /**
     * <p>
     * If you associated your S3 Access Grants instance with an Amazon Web Services IAM Identity Center instance, this
     * field returns the Amazon Resource Name (ARN) of the Amazon Web Services IAM Identity Center instance application;
     * a subresource of the original Identity Center instance. S3 Access Grants creates this Identity Center application
     * for the specific S3 Access Grants instance.
     * </p>
     * 
     * @return If you associated your S3 Access Grants instance with an Amazon Web Services IAM Identity Center
     *         instance, this field returns the Amazon Resource Name (ARN) of the Amazon Web Services IAM Identity
     *         Center instance application; a subresource of the original Identity Center instance. S3 Access Grants
     *         creates this Identity Center application for the specific S3 Access Grants instance.
     */

    public String getIdentityCenterArn() {
        return this.identityCenterArn;
    }

    /**
     * <p>
     * If you associated your S3 Access Grants instance with an Amazon Web Services IAM Identity Center instance, this
     * field returns the Amazon Resource Name (ARN) of the Amazon Web Services IAM Identity Center instance application;
     * a subresource of the original Identity Center instance. S3 Access Grants creates this Identity Center application
     * for the specific S3 Access Grants instance.
     * </p>
     * 
     * @param identityCenterArn
     *        If you associated your S3 Access Grants instance with an Amazon Web Services IAM Identity Center instance,
     *        this field returns the Amazon Resource Name (ARN) of the Amazon Web Services IAM Identity Center instance
     *        application; a subresource of the original Identity Center instance. S3 Access Grants creates this
     *        Identity Center application for the specific S3 Access Grants instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAccessGrantsInstanceResult withIdentityCenterArn(String identityCenterArn) {
        setIdentityCenterArn(identityCenterArn);
        return this;
    }

    /**
     * <p>
     * The date and time when you created the S3 Access Grants instance.
     * </p>
     * 
     * @param createdAt
     *        The date and time when you created the S3 Access Grants instance.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The date and time when you created the S3 Access Grants instance.
     * </p>
     * 
     * @return The date and time when you created the S3 Access Grants instance.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The date and time when you created the S3 Access Grants instance.
     * </p>
     * 
     * @param createdAt
     *        The date and time when you created the S3 Access Grants instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAccessGrantsInstanceResult withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
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
        if (getAccessGrantsInstanceArn() != null)
            sb.append("AccessGrantsInstanceArn: ").append(getAccessGrantsInstanceArn()).append(",");
        if (getAccessGrantsInstanceId() != null)
            sb.append("AccessGrantsInstanceId: ").append(getAccessGrantsInstanceId()).append(",");
        if (getIdentityCenterArn() != null)
            sb.append("IdentityCenterArn: ").append(getIdentityCenterArn()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAccessGrantsInstanceResult == false)
            return false;
        GetAccessGrantsInstanceResult other = (GetAccessGrantsInstanceResult) obj;
        if (other.getAccessGrantsInstanceArn() == null ^ this.getAccessGrantsInstanceArn() == null)
            return false;
        if (other.getAccessGrantsInstanceArn() != null && other.getAccessGrantsInstanceArn().equals(this.getAccessGrantsInstanceArn()) == false)
            return false;
        if (other.getAccessGrantsInstanceId() == null ^ this.getAccessGrantsInstanceId() == null)
            return false;
        if (other.getAccessGrantsInstanceId() != null && other.getAccessGrantsInstanceId().equals(this.getAccessGrantsInstanceId()) == false)
            return false;
        if (other.getIdentityCenterArn() == null ^ this.getIdentityCenterArn() == null)
            return false;
        if (other.getIdentityCenterArn() != null && other.getIdentityCenterArn().equals(this.getIdentityCenterArn()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccessGrantsInstanceArn() == null) ? 0 : getAccessGrantsInstanceArn().hashCode());
        hashCode = prime * hashCode + ((getAccessGrantsInstanceId() == null) ? 0 : getAccessGrantsInstanceId().hashCode());
        hashCode = prime * hashCode + ((getIdentityCenterArn() == null) ? 0 : getIdentityCenterArn().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        return hashCode;
    }

    @Override
    public GetAccessGrantsInstanceResult clone() {
        try {
            return (GetAccessGrantsInstanceResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
