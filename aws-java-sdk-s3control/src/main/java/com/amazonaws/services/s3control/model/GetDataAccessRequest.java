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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GetDataAccess" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDataAccessRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the Amazon Web Services account that is making this request.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The S3 URI path of the data to which you are requesting temporary access credentials. If the requesting account
     * has an access grant for this data, S3 Access Grants vends temporary access credentials in the response.
     * </p>
     */
    private String target;
    /**
     * <p>
     * The type of permission granted to your S3 data, which can be set to one of the following values:
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
     * The session duration, in seconds, of the temporary access credential that S3 Access Grants vends to the grantee
     * or client application. The default value is 1 hour, but the grantee can specify a range from 900 seconds (15
     * minutes) up to 43200 seconds (12 hours). If the grantee requests a value higher than this maximum, the operation
     * fails.
     * </p>
     */
    private Integer durationSeconds;
    /**
     * <p>
     * The scope of the temporary access credential that S3 Access Grants vends to the grantee or client application.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Default</code> – The scope of the returned temporary access token is the scope of the grant that is closest
     * to the target scope.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Minimal</code> – The scope of the returned temporary access token is the same as the requested target scope
     * as long as the requested scope is the same as or a subset of the grant scope.
     * </p>
     * </li>
     * </ul>
     */
    private String privilege;
    /**
     * <p>
     * The type of <code>Target</code>. The only possible value is <code>Object</code>. Pass this value if the target
     * data that you would like to access is a path to an object. Do not pass this value if the target data is a bucket
     * or a bucket and a prefix.
     * </p>
     */
    private String targetType;

    /**
     * <p>
     * The ID of the Amazon Web Services account that is making this request.
     * </p>
     * 
     * @param accountId
     *        The ID of the Amazon Web Services account that is making this request.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services account that is making this request.
     * </p>
     * 
     * @return The ID of the Amazon Web Services account that is making this request.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services account that is making this request.
     * </p>
     * 
     * @param accountId
     *        The ID of the Amazon Web Services account that is making this request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataAccessRequest withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The S3 URI path of the data to which you are requesting temporary access credentials. If the requesting account
     * has an access grant for this data, S3 Access Grants vends temporary access credentials in the response.
     * </p>
     * 
     * @param target
     *        The S3 URI path of the data to which you are requesting temporary access credentials. If the requesting
     *        account has an access grant for this data, S3 Access Grants vends temporary access credentials in the
     *        response.
     */

    public void setTarget(String target) {
        this.target = target;
    }

    /**
     * <p>
     * The S3 URI path of the data to which you are requesting temporary access credentials. If the requesting account
     * has an access grant for this data, S3 Access Grants vends temporary access credentials in the response.
     * </p>
     * 
     * @return The S3 URI path of the data to which you are requesting temporary access credentials. If the requesting
     *         account has an access grant for this data, S3 Access Grants vends temporary access credentials in the
     *         response.
     */

    public String getTarget() {
        return this.target;
    }

    /**
     * <p>
     * The S3 URI path of the data to which you are requesting temporary access credentials. If the requesting account
     * has an access grant for this data, S3 Access Grants vends temporary access credentials in the response.
     * </p>
     * 
     * @param target
     *        The S3 URI path of the data to which you are requesting temporary access credentials. If the requesting
     *        account has an access grant for this data, S3 Access Grants vends temporary access credentials in the
     *        response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataAccessRequest withTarget(String target) {
        setTarget(target);
        return this;
    }

    /**
     * <p>
     * The type of permission granted to your S3 data, which can be set to one of the following values:
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
     *        The type of permission granted to your S3 data, which can be set to one of the following values:</p>
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
     * The type of permission granted to your S3 data, which can be set to one of the following values:
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
     * @return The type of permission granted to your S3 data, which can be set to one of the following values:</p>
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
     * The type of permission granted to your S3 data, which can be set to one of the following values:
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
     *        The type of permission granted to your S3 data, which can be set to one of the following values:</p>
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

    public GetDataAccessRequest withPermission(String permission) {
        setPermission(permission);
        return this;
    }

    /**
     * <p>
     * The type of permission granted to your S3 data, which can be set to one of the following values:
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
     *        The type of permission granted to your S3 data, which can be set to one of the following values:</p>
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

    public GetDataAccessRequest withPermission(Permission permission) {
        this.permission = permission.toString();
        return this;
    }

    /**
     * <p>
     * The session duration, in seconds, of the temporary access credential that S3 Access Grants vends to the grantee
     * or client application. The default value is 1 hour, but the grantee can specify a range from 900 seconds (15
     * minutes) up to 43200 seconds (12 hours). If the grantee requests a value higher than this maximum, the operation
     * fails.
     * </p>
     * 
     * @param durationSeconds
     *        The session duration, in seconds, of the temporary access credential that S3 Access Grants vends to the
     *        grantee or client application. The default value is 1 hour, but the grantee can specify a range from 900
     *        seconds (15 minutes) up to 43200 seconds (12 hours). If the grantee requests a value higher than this
     *        maximum, the operation fails.
     */

    public void setDurationSeconds(Integer durationSeconds) {
        this.durationSeconds = durationSeconds;
    }

    /**
     * <p>
     * The session duration, in seconds, of the temporary access credential that S3 Access Grants vends to the grantee
     * or client application. The default value is 1 hour, but the grantee can specify a range from 900 seconds (15
     * minutes) up to 43200 seconds (12 hours). If the grantee requests a value higher than this maximum, the operation
     * fails.
     * </p>
     * 
     * @return The session duration, in seconds, of the temporary access credential that S3 Access Grants vends to the
     *         grantee or client application. The default value is 1 hour, but the grantee can specify a range from 900
     *         seconds (15 minutes) up to 43200 seconds (12 hours). If the grantee requests a value higher than this
     *         maximum, the operation fails.
     */

    public Integer getDurationSeconds() {
        return this.durationSeconds;
    }

    /**
     * <p>
     * The session duration, in seconds, of the temporary access credential that S3 Access Grants vends to the grantee
     * or client application. The default value is 1 hour, but the grantee can specify a range from 900 seconds (15
     * minutes) up to 43200 seconds (12 hours). If the grantee requests a value higher than this maximum, the operation
     * fails.
     * </p>
     * 
     * @param durationSeconds
     *        The session duration, in seconds, of the temporary access credential that S3 Access Grants vends to the
     *        grantee or client application. The default value is 1 hour, but the grantee can specify a range from 900
     *        seconds (15 minutes) up to 43200 seconds (12 hours). If the grantee requests a value higher than this
     *        maximum, the operation fails.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataAccessRequest withDurationSeconds(Integer durationSeconds) {
        setDurationSeconds(durationSeconds);
        return this;
    }

    /**
     * <p>
     * The scope of the temporary access credential that S3 Access Grants vends to the grantee or client application.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Default</code> – The scope of the returned temporary access token is the scope of the grant that is closest
     * to the target scope.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Minimal</code> – The scope of the returned temporary access token is the same as the requested target scope
     * as long as the requested scope is the same as or a subset of the grant scope.
     * </p>
     * </li>
     * </ul>
     * 
     * @param privilege
     *        The scope of the temporary access credential that S3 Access Grants vends to the grantee or client
     *        application. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Default</code> – The scope of the returned temporary access token is the scope of the grant that is
     *        closest to the target scope.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Minimal</code> – The scope of the returned temporary access token is the same as the requested
     *        target scope as long as the requested scope is the same as or a subset of the grant scope.
     *        </p>
     *        </li>
     * @see Privilege
     */

    public void setPrivilege(String privilege) {
        this.privilege = privilege;
    }

    /**
     * <p>
     * The scope of the temporary access credential that S3 Access Grants vends to the grantee or client application.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Default</code> – The scope of the returned temporary access token is the scope of the grant that is closest
     * to the target scope.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Minimal</code> – The scope of the returned temporary access token is the same as the requested target scope
     * as long as the requested scope is the same as or a subset of the grant scope.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The scope of the temporary access credential that S3 Access Grants vends to the grantee or client
     *         application. </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Default</code> – The scope of the returned temporary access token is the scope of the grant that is
     *         closest to the target scope.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Minimal</code> – The scope of the returned temporary access token is the same as the requested
     *         target scope as long as the requested scope is the same as or a subset of the grant scope.
     *         </p>
     *         </li>
     * @see Privilege
     */

    public String getPrivilege() {
        return this.privilege;
    }

    /**
     * <p>
     * The scope of the temporary access credential that S3 Access Grants vends to the grantee or client application.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Default</code> – The scope of the returned temporary access token is the scope of the grant that is closest
     * to the target scope.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Minimal</code> – The scope of the returned temporary access token is the same as the requested target scope
     * as long as the requested scope is the same as or a subset of the grant scope.
     * </p>
     * </li>
     * </ul>
     * 
     * @param privilege
     *        The scope of the temporary access credential that S3 Access Grants vends to the grantee or client
     *        application. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Default</code> – The scope of the returned temporary access token is the scope of the grant that is
     *        closest to the target scope.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Minimal</code> – The scope of the returned temporary access token is the same as the requested
     *        target scope as long as the requested scope is the same as or a subset of the grant scope.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Privilege
     */

    public GetDataAccessRequest withPrivilege(String privilege) {
        setPrivilege(privilege);
        return this;
    }

    /**
     * <p>
     * The scope of the temporary access credential that S3 Access Grants vends to the grantee or client application.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Default</code> – The scope of the returned temporary access token is the scope of the grant that is closest
     * to the target scope.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Minimal</code> – The scope of the returned temporary access token is the same as the requested target scope
     * as long as the requested scope is the same as or a subset of the grant scope.
     * </p>
     * </li>
     * </ul>
     * 
     * @param privilege
     *        The scope of the temporary access credential that S3 Access Grants vends to the grantee or client
     *        application. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Default</code> – The scope of the returned temporary access token is the scope of the grant that is
     *        closest to the target scope.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Minimal</code> – The scope of the returned temporary access token is the same as the requested
     *        target scope as long as the requested scope is the same as or a subset of the grant scope.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Privilege
     */

    public GetDataAccessRequest withPrivilege(Privilege privilege) {
        this.privilege = privilege.toString();
        return this;
    }

    /**
     * <p>
     * The type of <code>Target</code>. The only possible value is <code>Object</code>. Pass this value if the target
     * data that you would like to access is a path to an object. Do not pass this value if the target data is a bucket
     * or a bucket and a prefix.
     * </p>
     * 
     * @param targetType
     *        The type of <code>Target</code>. The only possible value is <code>Object</code>. Pass this value if the
     *        target data that you would like to access is a path to an object. Do not pass this value if the target
     *        data is a bucket or a bucket and a prefix.
     * @see S3PrefixType
     */

    public void setTargetType(String targetType) {
        this.targetType = targetType;
    }

    /**
     * <p>
     * The type of <code>Target</code>. The only possible value is <code>Object</code>. Pass this value if the target
     * data that you would like to access is a path to an object. Do not pass this value if the target data is a bucket
     * or a bucket and a prefix.
     * </p>
     * 
     * @return The type of <code>Target</code>. The only possible value is <code>Object</code>. Pass this value if the
     *         target data that you would like to access is a path to an object. Do not pass this value if the target
     *         data is a bucket or a bucket and a prefix.
     * @see S3PrefixType
     */

    public String getTargetType() {
        return this.targetType;
    }

    /**
     * <p>
     * The type of <code>Target</code>. The only possible value is <code>Object</code>. Pass this value if the target
     * data that you would like to access is a path to an object. Do not pass this value if the target data is a bucket
     * or a bucket and a prefix.
     * </p>
     * 
     * @param targetType
     *        The type of <code>Target</code>. The only possible value is <code>Object</code>. Pass this value if the
     *        target data that you would like to access is a path to an object. Do not pass this value if the target
     *        data is a bucket or a bucket and a prefix.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see S3PrefixType
     */

    public GetDataAccessRequest withTargetType(String targetType) {
        setTargetType(targetType);
        return this;
    }

    /**
     * <p>
     * The type of <code>Target</code>. The only possible value is <code>Object</code>. Pass this value if the target
     * data that you would like to access is a path to an object. Do not pass this value if the target data is a bucket
     * or a bucket and a prefix.
     * </p>
     * 
     * @param targetType
     *        The type of <code>Target</code>. The only possible value is <code>Object</code>. Pass this value if the
     *        target data that you would like to access is a path to an object. Do not pass this value if the target
     *        data is a bucket or a bucket and a prefix.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see S3PrefixType
     */

    public GetDataAccessRequest withTargetType(S3PrefixType targetType) {
        this.targetType = targetType.toString();
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
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
        if (getTarget() != null)
            sb.append("Target: ").append(getTarget()).append(",");
        if (getPermission() != null)
            sb.append("Permission: ").append(getPermission()).append(",");
        if (getDurationSeconds() != null)
            sb.append("DurationSeconds: ").append(getDurationSeconds()).append(",");
        if (getPrivilege() != null)
            sb.append("Privilege: ").append(getPrivilege()).append(",");
        if (getTargetType() != null)
            sb.append("TargetType: ").append(getTargetType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDataAccessRequest == false)
            return false;
        GetDataAccessRequest other = (GetDataAccessRequest) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getTarget() == null ^ this.getTarget() == null)
            return false;
        if (other.getTarget() != null && other.getTarget().equals(this.getTarget()) == false)
            return false;
        if (other.getPermission() == null ^ this.getPermission() == null)
            return false;
        if (other.getPermission() != null && other.getPermission().equals(this.getPermission()) == false)
            return false;
        if (other.getDurationSeconds() == null ^ this.getDurationSeconds() == null)
            return false;
        if (other.getDurationSeconds() != null && other.getDurationSeconds().equals(this.getDurationSeconds()) == false)
            return false;
        if (other.getPrivilege() == null ^ this.getPrivilege() == null)
            return false;
        if (other.getPrivilege() != null && other.getPrivilege().equals(this.getPrivilege()) == false)
            return false;
        if (other.getTargetType() == null ^ this.getTargetType() == null)
            return false;
        if (other.getTargetType() != null && other.getTargetType().equals(this.getTargetType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getTarget() == null) ? 0 : getTarget().hashCode());
        hashCode = prime * hashCode + ((getPermission() == null) ? 0 : getPermission().hashCode());
        hashCode = prime * hashCode + ((getDurationSeconds() == null) ? 0 : getDurationSeconds().hashCode());
        hashCode = prime * hashCode + ((getPrivilege() == null) ? 0 : getPrivilege().hashCode());
        hashCode = prime * hashCode + ((getTargetType() == null) ? 0 : getTargetType().hashCode());
        return hashCode;
    }

    @Override
    public GetDataAccessRequest clone() {
        return (GetDataAccessRequest) super.clone();
    }

}
