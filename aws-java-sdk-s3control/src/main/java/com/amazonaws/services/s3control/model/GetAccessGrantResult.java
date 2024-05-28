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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GetAccessGrant" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetAccessGrantResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.services.s3control.S3ControlResponseMetadata> implements
        Serializable, Cloneable {

    /**
     * <p>
     * The date and time when you created the access grant.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The ID of the access grant. S3 Access Grants auto-generates this ID when you create the access grant.
     * </p>
     */
    private String accessGrantId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the access grant.
     * </p>
     */
    private String accessGrantArn;
    /**
     * <p>
     * The user, group, or role to which you are granting access. You can grant access to an IAM user or role. If you
     * have added a corporate directory to Amazon Web Services IAM Identity Center and associated this Identity Center
     * instance with the S3 Access Grants instance, the grantee can also be a corporate directory user or group.
     * </p>
     */
    private Grantee grantee;
    /**
     * <p>
     * The type of permission that was granted in the access grant. Can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>READ</code> – Grant read-only access to the S3 data.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WRITE</code> – Grant write-only access to the S3 data.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>READWRITE</code> – Grant both read and write access to the S3 data.
     * </p>
     * </li>
     * </ul>
     */
    private String permission;
    /**
     * <p>
     * The ID of the registered location to which you are granting access. S3 Access Grants assigns this ID when you
     * register the location. S3 Access Grants assigns the ID <code>default</code> to the default location
     * <code>s3://</code> and assigns an auto-generated ID to other locations that you register.
     * </p>
     */
    private String accessGrantsLocationId;
    /**
     * <p>
     * The configuration options of the grant location. The grant location is the S3 path to the data to which you are
     * granting access.
     * </p>
     */
    private AccessGrantsLocationConfiguration accessGrantsLocationConfiguration;
    /**
     * <p>
     * The S3 path of the data to which you are granting access. It is the result of appending the
     * <code>Subprefix</code> to the location scope.
     * </p>
     */
    private String grantScope;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of an Amazon Web Services IAM Identity Center application associated with your
     * Identity Center instance. If the grant includes an application ARN, the grantee can only access the S3 data
     * through this application.
     * </p>
     */
    private String applicationArn;

    /**
     * <p>
     * The date and time when you created the access grant.
     * </p>
     * 
     * @param createdAt
     *        The date and time when you created the access grant.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The date and time when you created the access grant.
     * </p>
     * 
     * @return The date and time when you created the access grant.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The date and time when you created the access grant.
     * </p>
     * 
     * @param createdAt
     *        The date and time when you created the access grant.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAccessGrantResult withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The ID of the access grant. S3 Access Grants auto-generates this ID when you create the access grant.
     * </p>
     * 
     * @param accessGrantId
     *        The ID of the access grant. S3 Access Grants auto-generates this ID when you create the access grant.
     */

    public void setAccessGrantId(String accessGrantId) {
        this.accessGrantId = accessGrantId;
    }

    /**
     * <p>
     * The ID of the access grant. S3 Access Grants auto-generates this ID when you create the access grant.
     * </p>
     * 
     * @return The ID of the access grant. S3 Access Grants auto-generates this ID when you create the access grant.
     */

    public String getAccessGrantId() {
        return this.accessGrantId;
    }

    /**
     * <p>
     * The ID of the access grant. S3 Access Grants auto-generates this ID when you create the access grant.
     * </p>
     * 
     * @param accessGrantId
     *        The ID of the access grant. S3 Access Grants auto-generates this ID when you create the access grant.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAccessGrantResult withAccessGrantId(String accessGrantId) {
        setAccessGrantId(accessGrantId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the access grant.
     * </p>
     * 
     * @param accessGrantArn
     *        The Amazon Resource Name (ARN) of the access grant.
     */

    public void setAccessGrantArn(String accessGrantArn) {
        this.accessGrantArn = accessGrantArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the access grant.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the access grant.
     */

    public String getAccessGrantArn() {
        return this.accessGrantArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the access grant.
     * </p>
     * 
     * @param accessGrantArn
     *        The Amazon Resource Name (ARN) of the access grant.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAccessGrantResult withAccessGrantArn(String accessGrantArn) {
        setAccessGrantArn(accessGrantArn);
        return this;
    }

    /**
     * <p>
     * The user, group, or role to which you are granting access. You can grant access to an IAM user or role. If you
     * have added a corporate directory to Amazon Web Services IAM Identity Center and associated this Identity Center
     * instance with the S3 Access Grants instance, the grantee can also be a corporate directory user or group.
     * </p>
     * 
     * @param grantee
     *        The user, group, or role to which you are granting access. You can grant access to an IAM user or role. If
     *        you have added a corporate directory to Amazon Web Services IAM Identity Center and associated this
     *        Identity Center instance with the S3 Access Grants instance, the grantee can also be a corporate directory
     *        user or group.
     */

    public void setGrantee(Grantee grantee) {
        this.grantee = grantee;
    }

    /**
     * <p>
     * The user, group, or role to which you are granting access. You can grant access to an IAM user or role. If you
     * have added a corporate directory to Amazon Web Services IAM Identity Center and associated this Identity Center
     * instance with the S3 Access Grants instance, the grantee can also be a corporate directory user or group.
     * </p>
     * 
     * @return The user, group, or role to which you are granting access. You can grant access to an IAM user or role.
     *         If you have added a corporate directory to Amazon Web Services IAM Identity Center and associated this
     *         Identity Center instance with the S3 Access Grants instance, the grantee can also be a corporate
     *         directory user or group.
     */

    public Grantee getGrantee() {
        return this.grantee;
    }

    /**
     * <p>
     * The user, group, or role to which you are granting access. You can grant access to an IAM user or role. If you
     * have added a corporate directory to Amazon Web Services IAM Identity Center and associated this Identity Center
     * instance with the S3 Access Grants instance, the grantee can also be a corporate directory user or group.
     * </p>
     * 
     * @param grantee
     *        The user, group, or role to which you are granting access. You can grant access to an IAM user or role. If
     *        you have added a corporate directory to Amazon Web Services IAM Identity Center and associated this
     *        Identity Center instance with the S3 Access Grants instance, the grantee can also be a corporate directory
     *        user or group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAccessGrantResult withGrantee(Grantee grantee) {
        setGrantee(grantee);
        return this;
    }

    /**
     * <p>
     * The type of permission that was granted in the access grant. Can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>READ</code> – Grant read-only access to the S3 data.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WRITE</code> – Grant write-only access to the S3 data.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>READWRITE</code> – Grant both read and write access to the S3 data.
     * </p>
     * </li>
     * </ul>
     * 
     * @param permission
     *        The type of permission that was granted in the access grant. Can be one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>READ</code> – Grant read-only access to the S3 data.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>WRITE</code> – Grant write-only access to the S3 data.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>READWRITE</code> – Grant both read and write access to the S3 data.
     *        </p>
     *        </li>
     * @see Permission
     */

    public void setPermission(String permission) {
        this.permission = permission;
    }

    /**
     * <p>
     * The type of permission that was granted in the access grant. Can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>READ</code> – Grant read-only access to the S3 data.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WRITE</code> – Grant write-only access to the S3 data.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>READWRITE</code> – Grant both read and write access to the S3 data.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The type of permission that was granted in the access grant. Can be one of the following values:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>READ</code> – Grant read-only access to the S3 data.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>WRITE</code> – Grant write-only access to the S3 data.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>READWRITE</code> – Grant both read and write access to the S3 data.
     *         </p>
     *         </li>
     * @see Permission
     */

    public String getPermission() {
        return this.permission;
    }

    /**
     * <p>
     * The type of permission that was granted in the access grant. Can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>READ</code> – Grant read-only access to the S3 data.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WRITE</code> – Grant write-only access to the S3 data.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>READWRITE</code> – Grant both read and write access to the S3 data.
     * </p>
     * </li>
     * </ul>
     * 
     * @param permission
     *        The type of permission that was granted in the access grant. Can be one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>READ</code> – Grant read-only access to the S3 data.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>WRITE</code> – Grant write-only access to the S3 data.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>READWRITE</code> – Grant both read and write access to the S3 data.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Permission
     */

    public GetAccessGrantResult withPermission(String permission) {
        setPermission(permission);
        return this;
    }

    /**
     * <p>
     * The type of permission that was granted in the access grant. Can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>READ</code> – Grant read-only access to the S3 data.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WRITE</code> – Grant write-only access to the S3 data.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>READWRITE</code> – Grant both read and write access to the S3 data.
     * </p>
     * </li>
     * </ul>
     * 
     * @param permission
     *        The type of permission that was granted in the access grant. Can be one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>READ</code> – Grant read-only access to the S3 data.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>WRITE</code> – Grant write-only access to the S3 data.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>READWRITE</code> – Grant both read and write access to the S3 data.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Permission
     */

    public GetAccessGrantResult withPermission(Permission permission) {
        this.permission = permission.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the registered location to which you are granting access. S3 Access Grants assigns this ID when you
     * register the location. S3 Access Grants assigns the ID <code>default</code> to the default location
     * <code>s3://</code> and assigns an auto-generated ID to other locations that you register.
     * </p>
     * 
     * @param accessGrantsLocationId
     *        The ID of the registered location to which you are granting access. S3 Access Grants assigns this ID when
     *        you register the location. S3 Access Grants assigns the ID <code>default</code> to the default location
     *        <code>s3://</code> and assigns an auto-generated ID to other locations that you register.
     */

    public void setAccessGrantsLocationId(String accessGrantsLocationId) {
        this.accessGrantsLocationId = accessGrantsLocationId;
    }

    /**
     * <p>
     * The ID of the registered location to which you are granting access. S3 Access Grants assigns this ID when you
     * register the location. S3 Access Grants assigns the ID <code>default</code> to the default location
     * <code>s3://</code> and assigns an auto-generated ID to other locations that you register.
     * </p>
     * 
     * @return The ID of the registered location to which you are granting access. S3 Access Grants assigns this ID when
     *         you register the location. S3 Access Grants assigns the ID <code>default</code> to the default location
     *         <code>s3://</code> and assigns an auto-generated ID to other locations that you register.
     */

    public String getAccessGrantsLocationId() {
        return this.accessGrantsLocationId;
    }

    /**
     * <p>
     * The ID of the registered location to which you are granting access. S3 Access Grants assigns this ID when you
     * register the location. S3 Access Grants assigns the ID <code>default</code> to the default location
     * <code>s3://</code> and assigns an auto-generated ID to other locations that you register.
     * </p>
     * 
     * @param accessGrantsLocationId
     *        The ID of the registered location to which you are granting access. S3 Access Grants assigns this ID when
     *        you register the location. S3 Access Grants assigns the ID <code>default</code> to the default location
     *        <code>s3://</code> and assigns an auto-generated ID to other locations that you register.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAccessGrantResult withAccessGrantsLocationId(String accessGrantsLocationId) {
        setAccessGrantsLocationId(accessGrantsLocationId);
        return this;
    }

    /**
     * <p>
     * The configuration options of the grant location. The grant location is the S3 path to the data to which you are
     * granting access.
     * </p>
     * 
     * @param accessGrantsLocationConfiguration
     *        The configuration options of the grant location. The grant location is the S3 path to the data to which
     *        you are granting access.
     */

    public void setAccessGrantsLocationConfiguration(AccessGrantsLocationConfiguration accessGrantsLocationConfiguration) {
        this.accessGrantsLocationConfiguration = accessGrantsLocationConfiguration;
    }

    /**
     * <p>
     * The configuration options of the grant location. The grant location is the S3 path to the data to which you are
     * granting access.
     * </p>
     * 
     * @return The configuration options of the grant location. The grant location is the S3 path to the data to which
     *         you are granting access.
     */

    public AccessGrantsLocationConfiguration getAccessGrantsLocationConfiguration() {
        return this.accessGrantsLocationConfiguration;
    }

    /**
     * <p>
     * The configuration options of the grant location. The grant location is the S3 path to the data to which you are
     * granting access.
     * </p>
     * 
     * @param accessGrantsLocationConfiguration
     *        The configuration options of the grant location. The grant location is the S3 path to the data to which
     *        you are granting access.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAccessGrantResult withAccessGrantsLocationConfiguration(AccessGrantsLocationConfiguration accessGrantsLocationConfiguration) {
        setAccessGrantsLocationConfiguration(accessGrantsLocationConfiguration);
        return this;
    }

    /**
     * <p>
     * The S3 path of the data to which you are granting access. It is the result of appending the
     * <code>Subprefix</code> to the location scope.
     * </p>
     * 
     * @param grantScope
     *        The S3 path of the data to which you are granting access. It is the result of appending the
     *        <code>Subprefix</code> to the location scope.
     */

    public void setGrantScope(String grantScope) {
        this.grantScope = grantScope;
    }

    /**
     * <p>
     * The S3 path of the data to which you are granting access. It is the result of appending the
     * <code>Subprefix</code> to the location scope.
     * </p>
     * 
     * @return The S3 path of the data to which you are granting access. It is the result of appending the
     *         <code>Subprefix</code> to the location scope.
     */

    public String getGrantScope() {
        return this.grantScope;
    }

    /**
     * <p>
     * The S3 path of the data to which you are granting access. It is the result of appending the
     * <code>Subprefix</code> to the location scope.
     * </p>
     * 
     * @param grantScope
     *        The S3 path of the data to which you are granting access. It is the result of appending the
     *        <code>Subprefix</code> to the location scope.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAccessGrantResult withGrantScope(String grantScope) {
        setGrantScope(grantScope);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an Amazon Web Services IAM Identity Center application associated with your
     * Identity Center instance. If the grant includes an application ARN, the grantee can only access the S3 data
     * through this application.
     * </p>
     * 
     * @param applicationArn
     *        The Amazon Resource Name (ARN) of an Amazon Web Services IAM Identity Center application associated with
     *        your Identity Center instance. If the grant includes an application ARN, the grantee can only access the
     *        S3 data through this application.
     */

    public void setApplicationArn(String applicationArn) {
        this.applicationArn = applicationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an Amazon Web Services IAM Identity Center application associated with your
     * Identity Center instance. If the grant includes an application ARN, the grantee can only access the S3 data
     * through this application.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of an Amazon Web Services IAM Identity Center application associated with
     *         your Identity Center instance. If the grant includes an application ARN, the grantee can only access the
     *         S3 data through this application.
     */

    public String getApplicationArn() {
        return this.applicationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an Amazon Web Services IAM Identity Center application associated with your
     * Identity Center instance. If the grant includes an application ARN, the grantee can only access the S3 data
     * through this application.
     * </p>
     * 
     * @param applicationArn
     *        The Amazon Resource Name (ARN) of an Amazon Web Services IAM Identity Center application associated with
     *        your Identity Center instance. If the grant includes an application ARN, the grantee can only access the
     *        S3 data through this application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAccessGrantResult withApplicationArn(String applicationArn) {
        setApplicationArn(applicationArn);
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
        if (getAccessGrantId() != null)
            sb.append("AccessGrantId: ").append(getAccessGrantId()).append(",");
        if (getAccessGrantArn() != null)
            sb.append("AccessGrantArn: ").append(getAccessGrantArn()).append(",");
        if (getGrantee() != null)
            sb.append("Grantee: ").append(getGrantee()).append(",");
        if (getPermission() != null)
            sb.append("Permission: ").append(getPermission()).append(",");
        if (getAccessGrantsLocationId() != null)
            sb.append("AccessGrantsLocationId: ").append(getAccessGrantsLocationId()).append(",");
        if (getAccessGrantsLocationConfiguration() != null)
            sb.append("AccessGrantsLocationConfiguration: ").append(getAccessGrantsLocationConfiguration()).append(",");
        if (getGrantScope() != null)
            sb.append("GrantScope: ").append(getGrantScope()).append(",");
        if (getApplicationArn() != null)
            sb.append("ApplicationArn: ").append(getApplicationArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAccessGrantResult == false)
            return false;
        GetAccessGrantResult other = (GetAccessGrantResult) obj;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getAccessGrantId() == null ^ this.getAccessGrantId() == null)
            return false;
        if (other.getAccessGrantId() != null && other.getAccessGrantId().equals(this.getAccessGrantId()) == false)
            return false;
        if (other.getAccessGrantArn() == null ^ this.getAccessGrantArn() == null)
            return false;
        if (other.getAccessGrantArn() != null && other.getAccessGrantArn().equals(this.getAccessGrantArn()) == false)
            return false;
        if (other.getGrantee() == null ^ this.getGrantee() == null)
            return false;
        if (other.getGrantee() != null && other.getGrantee().equals(this.getGrantee()) == false)
            return false;
        if (other.getPermission() == null ^ this.getPermission() == null)
            return false;
        if (other.getPermission() != null && other.getPermission().equals(this.getPermission()) == false)
            return false;
        if (other.getAccessGrantsLocationId() == null ^ this.getAccessGrantsLocationId() == null)
            return false;
        if (other.getAccessGrantsLocationId() != null && other.getAccessGrantsLocationId().equals(this.getAccessGrantsLocationId()) == false)
            return false;
        if (other.getAccessGrantsLocationConfiguration() == null ^ this.getAccessGrantsLocationConfiguration() == null)
            return false;
        if (other.getAccessGrantsLocationConfiguration() != null
                && other.getAccessGrantsLocationConfiguration().equals(this.getAccessGrantsLocationConfiguration()) == false)
            return false;
        if (other.getGrantScope() == null ^ this.getGrantScope() == null)
            return false;
        if (other.getGrantScope() != null && other.getGrantScope().equals(this.getGrantScope()) == false)
            return false;
        if (other.getApplicationArn() == null ^ this.getApplicationArn() == null)
            return false;
        if (other.getApplicationArn() != null && other.getApplicationArn().equals(this.getApplicationArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getAccessGrantId() == null) ? 0 : getAccessGrantId().hashCode());
        hashCode = prime * hashCode + ((getAccessGrantArn() == null) ? 0 : getAccessGrantArn().hashCode());
        hashCode = prime * hashCode + ((getGrantee() == null) ? 0 : getGrantee().hashCode());
        hashCode = prime * hashCode + ((getPermission() == null) ? 0 : getPermission().hashCode());
        hashCode = prime * hashCode + ((getAccessGrantsLocationId() == null) ? 0 : getAccessGrantsLocationId().hashCode());
        hashCode = prime * hashCode + ((getAccessGrantsLocationConfiguration() == null) ? 0 : getAccessGrantsLocationConfiguration().hashCode());
        hashCode = prime * hashCode + ((getGrantScope() == null) ? 0 : getGrantScope().hashCode());
        hashCode = prime * hashCode + ((getApplicationArn() == null) ? 0 : getApplicationArn().hashCode());
        return hashCode;
    }

    @Override
    public GetAccessGrantResult clone() {
        try {
            return (GetAccessGrantResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
