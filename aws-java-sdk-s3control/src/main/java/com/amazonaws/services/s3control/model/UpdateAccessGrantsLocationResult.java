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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/UpdateAccessGrantsLocation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateAccessGrantsLocationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.services.s3control.S3ControlResponseMetadata>
        implements Serializable, Cloneable {

    /**
     * <p>
     * The date and time when you registered the location.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The ID of the registered location to which you are granting access. S3 Access Grants assigned this ID when you
     * registered the location. S3 Access Grants assigns the ID <code>default</code> to the default location
     * <code>s3://</code> and assigns an auto-generated ID to other locations that you register.
     * </p>
     */
    private String accessGrantsLocationId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the registered location that you are updating.
     * </p>
     */
    private String accessGrantsLocationArn;
    /**
     * <p>
     * The S3 URI path of the location that you are updating. You cannot update the scope of the registered location.
     * The location scope can be the default S3 location <code>s3://</code>, the S3 path to a bucket
     * <code>s3://&lt;bucket&gt;</code>, or the S3 path to a bucket and prefix
     * <code>s3://&lt;bucket&gt;/&lt;prefix&gt;</code>.
     * </p>
     */
    private String locationScope;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role of the registered location. S3 Access Grants assumes this role to
     * manage access to the registered location.
     * </p>
     */
    private String iAMRoleArn;

    /**
     * <p>
     * The date and time when you registered the location.
     * </p>
     * 
     * @param createdAt
     *        The date and time when you registered the location.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The date and time when you registered the location.
     * </p>
     * 
     * @return The date and time when you registered the location.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The date and time when you registered the location.
     * </p>
     * 
     * @param createdAt
     *        The date and time when you registered the location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAccessGrantsLocationResult withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The ID of the registered location to which you are granting access. S3 Access Grants assigned this ID when you
     * registered the location. S3 Access Grants assigns the ID <code>default</code> to the default location
     * <code>s3://</code> and assigns an auto-generated ID to other locations that you register.
     * </p>
     * 
     * @param accessGrantsLocationId
     *        The ID of the registered location to which you are granting access. S3 Access Grants assigned this ID when
     *        you registered the location. S3 Access Grants assigns the ID <code>default</code> to the default location
     *        <code>s3://</code> and assigns an auto-generated ID to other locations that you register.
     */

    public void setAccessGrantsLocationId(String accessGrantsLocationId) {
        this.accessGrantsLocationId = accessGrantsLocationId;
    }

    /**
     * <p>
     * The ID of the registered location to which you are granting access. S3 Access Grants assigned this ID when you
     * registered the location. S3 Access Grants assigns the ID <code>default</code> to the default location
     * <code>s3://</code> and assigns an auto-generated ID to other locations that you register.
     * </p>
     * 
     * @return The ID of the registered location to which you are granting access. S3 Access Grants assigned this ID
     *         when you registered the location. S3 Access Grants assigns the ID <code>default</code> to the default
     *         location <code>s3://</code> and assigns an auto-generated ID to other locations that you register.
     */

    public String getAccessGrantsLocationId() {
        return this.accessGrantsLocationId;
    }

    /**
     * <p>
     * The ID of the registered location to which you are granting access. S3 Access Grants assigned this ID when you
     * registered the location. S3 Access Grants assigns the ID <code>default</code> to the default location
     * <code>s3://</code> and assigns an auto-generated ID to other locations that you register.
     * </p>
     * 
     * @param accessGrantsLocationId
     *        The ID of the registered location to which you are granting access. S3 Access Grants assigned this ID when
     *        you registered the location. S3 Access Grants assigns the ID <code>default</code> to the default location
     *        <code>s3://</code> and assigns an auto-generated ID to other locations that you register.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAccessGrantsLocationResult withAccessGrantsLocationId(String accessGrantsLocationId) {
        setAccessGrantsLocationId(accessGrantsLocationId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the registered location that you are updating.
     * </p>
     * 
     * @param accessGrantsLocationArn
     *        The Amazon Resource Name (ARN) of the registered location that you are updating.
     */

    public void setAccessGrantsLocationArn(String accessGrantsLocationArn) {
        this.accessGrantsLocationArn = accessGrantsLocationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the registered location that you are updating.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the registered location that you are updating.
     */

    public String getAccessGrantsLocationArn() {
        return this.accessGrantsLocationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the registered location that you are updating.
     * </p>
     * 
     * @param accessGrantsLocationArn
     *        The Amazon Resource Name (ARN) of the registered location that you are updating.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAccessGrantsLocationResult withAccessGrantsLocationArn(String accessGrantsLocationArn) {
        setAccessGrantsLocationArn(accessGrantsLocationArn);
        return this;
    }

    /**
     * <p>
     * The S3 URI path of the location that you are updating. You cannot update the scope of the registered location.
     * The location scope can be the default S3 location <code>s3://</code>, the S3 path to a bucket
     * <code>s3://&lt;bucket&gt;</code>, or the S3 path to a bucket and prefix
     * <code>s3://&lt;bucket&gt;/&lt;prefix&gt;</code>.
     * </p>
     * 
     * @param locationScope
     *        The S3 URI path of the location that you are updating. You cannot update the scope of the registered
     *        location. The location scope can be the default S3 location <code>s3://</code>, the S3 path to a bucket
     *        <code>s3://&lt;bucket&gt;</code>, or the S3 path to a bucket and prefix
     *        <code>s3://&lt;bucket&gt;/&lt;prefix&gt;</code>.
     */

    public void setLocationScope(String locationScope) {
        this.locationScope = locationScope;
    }

    /**
     * <p>
     * The S3 URI path of the location that you are updating. You cannot update the scope of the registered location.
     * The location scope can be the default S3 location <code>s3://</code>, the S3 path to a bucket
     * <code>s3://&lt;bucket&gt;</code>, or the S3 path to a bucket and prefix
     * <code>s3://&lt;bucket&gt;/&lt;prefix&gt;</code>.
     * </p>
     * 
     * @return The S3 URI path of the location that you are updating. You cannot update the scope of the registered
     *         location. The location scope can be the default S3 location <code>s3://</code>, the S3 path to a bucket
     *         <code>s3://&lt;bucket&gt;</code>, or the S3 path to a bucket and prefix
     *         <code>s3://&lt;bucket&gt;/&lt;prefix&gt;</code>.
     */

    public String getLocationScope() {
        return this.locationScope;
    }

    /**
     * <p>
     * The S3 URI path of the location that you are updating. You cannot update the scope of the registered location.
     * The location scope can be the default S3 location <code>s3://</code>, the S3 path to a bucket
     * <code>s3://&lt;bucket&gt;</code>, or the S3 path to a bucket and prefix
     * <code>s3://&lt;bucket&gt;/&lt;prefix&gt;</code>.
     * </p>
     * 
     * @param locationScope
     *        The S3 URI path of the location that you are updating. You cannot update the scope of the registered
     *        location. The location scope can be the default S3 location <code>s3://</code>, the S3 path to a bucket
     *        <code>s3://&lt;bucket&gt;</code>, or the S3 path to a bucket and prefix
     *        <code>s3://&lt;bucket&gt;/&lt;prefix&gt;</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAccessGrantsLocationResult withLocationScope(String locationScope) {
        setLocationScope(locationScope);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role of the registered location. S3 Access Grants assumes this role to
     * manage access to the registered location.
     * </p>
     * 
     * @param iAMRoleArn
     *        The Amazon Resource Name (ARN) of the IAM role of the registered location. S3 Access Grants assumes this
     *        role to manage access to the registered location.
     */

    public void setIAMRoleArn(String iAMRoleArn) {
        this.iAMRoleArn = iAMRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role of the registered location. S3 Access Grants assumes this role to
     * manage access to the registered location.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the IAM role of the registered location. S3 Access Grants assumes this
     *         role to manage access to the registered location.
     */

    public String getIAMRoleArn() {
        return this.iAMRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role of the registered location. S3 Access Grants assumes this role to
     * manage access to the registered location.
     * </p>
     * 
     * @param iAMRoleArn
     *        The Amazon Resource Name (ARN) of the IAM role of the registered location. S3 Access Grants assumes this
     *        role to manage access to the registered location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAccessGrantsLocationResult withIAMRoleArn(String iAMRoleArn) {
        setIAMRoleArn(iAMRoleArn);
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
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getAccessGrantsLocationId() != null)
            sb.append("AccessGrantsLocationId: ").append(getAccessGrantsLocationId()).append(",");
        if (getAccessGrantsLocationArn() != null)
            sb.append("AccessGrantsLocationArn: ").append(getAccessGrantsLocationArn()).append(",");
        if (getLocationScope() != null)
            sb.append("LocationScope: ").append(getLocationScope()).append(",");
        if (getIAMRoleArn() != null)
            sb.append("IAMRoleArn: ").append(getIAMRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateAccessGrantsLocationResult == false)
            return false;
        UpdateAccessGrantsLocationResult other = (UpdateAccessGrantsLocationResult) obj;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getAccessGrantsLocationId() == null ^ this.getAccessGrantsLocationId() == null)
            return false;
        if (other.getAccessGrantsLocationId() != null && other.getAccessGrantsLocationId().equals(this.getAccessGrantsLocationId()) == false)
            return false;
        if (other.getAccessGrantsLocationArn() == null ^ this.getAccessGrantsLocationArn() == null)
            return false;
        if (other.getAccessGrantsLocationArn() != null && other.getAccessGrantsLocationArn().equals(this.getAccessGrantsLocationArn()) == false)
            return false;
        if (other.getLocationScope() == null ^ this.getLocationScope() == null)
            return false;
        if (other.getLocationScope() != null && other.getLocationScope().equals(this.getLocationScope()) == false)
            return false;
        if (other.getIAMRoleArn() == null ^ this.getIAMRoleArn() == null)
            return false;
        if (other.getIAMRoleArn() != null && other.getIAMRoleArn().equals(this.getIAMRoleArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getAccessGrantsLocationId() == null) ? 0 : getAccessGrantsLocationId().hashCode());
        hashCode = prime * hashCode + ((getAccessGrantsLocationArn() == null) ? 0 : getAccessGrantsLocationArn().hashCode());
        hashCode = prime * hashCode + ((getLocationScope() == null) ? 0 : getLocationScope().hashCode());
        hashCode = prime * hashCode + ((getIAMRoleArn() == null) ? 0 : getIAMRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public UpdateAccessGrantsLocationResult clone() {
        try {
            return (UpdateAccessGrantsLocationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
