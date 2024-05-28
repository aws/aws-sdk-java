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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/ListAccessGrants" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAccessGrantsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the Amazon Web Services account that is making this request.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * A pagination token to request the next page of results. Pass this value into a subsequent
     * <code>List Access Grants</code> request in order to retrieve the next page of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of access grants that you would like returned in the <code>List Access Grants</code> response.
     * If the results include the pagination token <code>NextToken</code>, make another call using the
     * <code>NextToken</code> to determine if there are more results.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The type of the grantee to which access has been granted. It can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>IAM</code> - An IAM user or role.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DIRECTORY_USER</code> - Your corporate directory user. You can use this option if you have added your
     * corporate identity directory to IAM Identity Center and associated the IAM Identity Center instance with your S3
     * Access Grants instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DIRECTORY_GROUP</code> - Your corporate directory group. You can use this option if you have added your
     * corporate identity directory to IAM Identity Center and associated the IAM Identity Center instance with your S3
     * Access Grants instance.
     * </p>
     * </li>
     * </ul>
     */
    private String granteeType;
    /**
     * <p>
     * The unique identifer of the <code>Grantee</code>. If the grantee type is <code>IAM</code>, the identifier is the
     * IAM Amazon Resource Name (ARN) of the user or role. If the grantee type is a directory user or group, the
     * identifier is 128-bit universally unique identifier (UUID) in the format
     * <code>a1b2c3d4-5678-90ab-cdef-EXAMPLE11111</code>. You can obtain this UUID from your Amazon Web Services IAM
     * Identity Center instance.
     * </p>
     */
    private String granteeIdentifier;
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

    public ListAccessGrantsRequest withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * A pagination token to request the next page of results. Pass this value into a subsequent
     * <code>List Access Grants</code> request in order to retrieve the next page of results.
     * </p>
     * 
     * @param nextToken
     *        A pagination token to request the next page of results. Pass this value into a subsequent
     *        <code>List Access Grants</code> request in order to retrieve the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A pagination token to request the next page of results. Pass this value into a subsequent
     * <code>List Access Grants</code> request in order to retrieve the next page of results.
     * </p>
     * 
     * @return A pagination token to request the next page of results. Pass this value into a subsequent
     *         <code>List Access Grants</code> request in order to retrieve the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A pagination token to request the next page of results. Pass this value into a subsequent
     * <code>List Access Grants</code> request in order to retrieve the next page of results.
     * </p>
     * 
     * @param nextToken
     *        A pagination token to request the next page of results. Pass this value into a subsequent
     *        <code>List Access Grants</code> request in order to retrieve the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAccessGrantsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of access grants that you would like returned in the <code>List Access Grants</code> response.
     * If the results include the pagination token <code>NextToken</code>, make another call using the
     * <code>NextToken</code> to determine if there are more results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of access grants that you would like returned in the <code>List Access Grants</code>
     *        response. If the results include the pagination token <code>NextToken</code>, make another call using the
     *        <code>NextToken</code> to determine if there are more results.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of access grants that you would like returned in the <code>List Access Grants</code> response.
     * If the results include the pagination token <code>NextToken</code>, make another call using the
     * <code>NextToken</code> to determine if there are more results.
     * </p>
     * 
     * @return The maximum number of access grants that you would like returned in the <code>List Access Grants</code>
     *         response. If the results include the pagination token <code>NextToken</code>, make another call using the
     *         <code>NextToken</code> to determine if there are more results.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of access grants that you would like returned in the <code>List Access Grants</code> response.
     * If the results include the pagination token <code>NextToken</code>, make another call using the
     * <code>NextToken</code> to determine if there are more results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of access grants that you would like returned in the <code>List Access Grants</code>
     *        response. If the results include the pagination token <code>NextToken</code>, make another call using the
     *        <code>NextToken</code> to determine if there are more results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAccessGrantsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The type of the grantee to which access has been granted. It can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>IAM</code> - An IAM user or role.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DIRECTORY_USER</code> - Your corporate directory user. You can use this option if you have added your
     * corporate identity directory to IAM Identity Center and associated the IAM Identity Center instance with your S3
     * Access Grants instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DIRECTORY_GROUP</code> - Your corporate directory group. You can use this option if you have added your
     * corporate identity directory to IAM Identity Center and associated the IAM Identity Center instance with your S3
     * Access Grants instance.
     * </p>
     * </li>
     * </ul>
     * 
     * @param granteeType
     *        The type of the grantee to which access has been granted. It can be one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>IAM</code> - An IAM user or role.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DIRECTORY_USER</code> - Your corporate directory user. You can use this option if you have added
     *        your corporate identity directory to IAM Identity Center and associated the IAM Identity Center instance
     *        with your S3 Access Grants instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DIRECTORY_GROUP</code> - Your corporate directory group. You can use this option if you have added
     *        your corporate identity directory to IAM Identity Center and associated the IAM Identity Center instance
     *        with your S3 Access Grants instance.
     *        </p>
     *        </li>
     * @see GranteeType
     */

    public void setGranteeType(String granteeType) {
        this.granteeType = granteeType;
    }

    /**
     * <p>
     * The type of the grantee to which access has been granted. It can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>IAM</code> - An IAM user or role.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DIRECTORY_USER</code> - Your corporate directory user. You can use this option if you have added your
     * corporate identity directory to IAM Identity Center and associated the IAM Identity Center instance with your S3
     * Access Grants instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DIRECTORY_GROUP</code> - Your corporate directory group. You can use this option if you have added your
     * corporate identity directory to IAM Identity Center and associated the IAM Identity Center instance with your S3
     * Access Grants instance.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The type of the grantee to which access has been granted. It can be one of the following values:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>IAM</code> - An IAM user or role.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DIRECTORY_USER</code> - Your corporate directory user. You can use this option if you have added
     *         your corporate identity directory to IAM Identity Center and associated the IAM Identity Center instance
     *         with your S3 Access Grants instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DIRECTORY_GROUP</code> - Your corporate directory group. You can use this option if you have added
     *         your corporate identity directory to IAM Identity Center and associated the IAM Identity Center instance
     *         with your S3 Access Grants instance.
     *         </p>
     *         </li>
     * @see GranteeType
     */

    public String getGranteeType() {
        return this.granteeType;
    }

    /**
     * <p>
     * The type of the grantee to which access has been granted. It can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>IAM</code> - An IAM user or role.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DIRECTORY_USER</code> - Your corporate directory user. You can use this option if you have added your
     * corporate identity directory to IAM Identity Center and associated the IAM Identity Center instance with your S3
     * Access Grants instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DIRECTORY_GROUP</code> - Your corporate directory group. You can use this option if you have added your
     * corporate identity directory to IAM Identity Center and associated the IAM Identity Center instance with your S3
     * Access Grants instance.
     * </p>
     * </li>
     * </ul>
     * 
     * @param granteeType
     *        The type of the grantee to which access has been granted. It can be one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>IAM</code> - An IAM user or role.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DIRECTORY_USER</code> - Your corporate directory user. You can use this option if you have added
     *        your corporate identity directory to IAM Identity Center and associated the IAM Identity Center instance
     *        with your S3 Access Grants instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DIRECTORY_GROUP</code> - Your corporate directory group. You can use this option if you have added
     *        your corporate identity directory to IAM Identity Center and associated the IAM Identity Center instance
     *        with your S3 Access Grants instance.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GranteeType
     */

    public ListAccessGrantsRequest withGranteeType(String granteeType) {
        setGranteeType(granteeType);
        return this;
    }

    /**
     * <p>
     * The type of the grantee to which access has been granted. It can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>IAM</code> - An IAM user or role.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DIRECTORY_USER</code> - Your corporate directory user. You can use this option if you have added your
     * corporate identity directory to IAM Identity Center and associated the IAM Identity Center instance with your S3
     * Access Grants instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DIRECTORY_GROUP</code> - Your corporate directory group. You can use this option if you have added your
     * corporate identity directory to IAM Identity Center and associated the IAM Identity Center instance with your S3
     * Access Grants instance.
     * </p>
     * </li>
     * </ul>
     * 
     * @param granteeType
     *        The type of the grantee to which access has been granted. It can be one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>IAM</code> - An IAM user or role.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DIRECTORY_USER</code> - Your corporate directory user. You can use this option if you have added
     *        your corporate identity directory to IAM Identity Center and associated the IAM Identity Center instance
     *        with your S3 Access Grants instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DIRECTORY_GROUP</code> - Your corporate directory group. You can use this option if you have added
     *        your corporate identity directory to IAM Identity Center and associated the IAM Identity Center instance
     *        with your S3 Access Grants instance.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GranteeType
     */

    public ListAccessGrantsRequest withGranteeType(GranteeType granteeType) {
        this.granteeType = granteeType.toString();
        return this;
    }

    /**
     * <p>
     * The unique identifer of the <code>Grantee</code>. If the grantee type is <code>IAM</code>, the identifier is the
     * IAM Amazon Resource Name (ARN) of the user or role. If the grantee type is a directory user or group, the
     * identifier is 128-bit universally unique identifier (UUID) in the format
     * <code>a1b2c3d4-5678-90ab-cdef-EXAMPLE11111</code>. You can obtain this UUID from your Amazon Web Services IAM
     * Identity Center instance.
     * </p>
     * 
     * @param granteeIdentifier
     *        The unique identifer of the <code>Grantee</code>. If the grantee type is <code>IAM</code>, the identifier
     *        is the IAM Amazon Resource Name (ARN) of the user or role. If the grantee type is a directory user or
     *        group, the identifier is 128-bit universally unique identifier (UUID) in the format
     *        <code>a1b2c3d4-5678-90ab-cdef-EXAMPLE11111</code>. You can obtain this UUID from your Amazon Web Services
     *        IAM Identity Center instance.
     */

    public void setGranteeIdentifier(String granteeIdentifier) {
        this.granteeIdentifier = granteeIdentifier;
    }

    /**
     * <p>
     * The unique identifer of the <code>Grantee</code>. If the grantee type is <code>IAM</code>, the identifier is the
     * IAM Amazon Resource Name (ARN) of the user or role. If the grantee type is a directory user or group, the
     * identifier is 128-bit universally unique identifier (UUID) in the format
     * <code>a1b2c3d4-5678-90ab-cdef-EXAMPLE11111</code>. You can obtain this UUID from your Amazon Web Services IAM
     * Identity Center instance.
     * </p>
     * 
     * @return The unique identifer of the <code>Grantee</code>. If the grantee type is <code>IAM</code>, the identifier
     *         is the IAM Amazon Resource Name (ARN) of the user or role. If the grantee type is a directory user or
     *         group, the identifier is 128-bit universally unique identifier (UUID) in the format
     *         <code>a1b2c3d4-5678-90ab-cdef-EXAMPLE11111</code>. You can obtain this UUID from your Amazon Web Services
     *         IAM Identity Center instance.
     */

    public String getGranteeIdentifier() {
        return this.granteeIdentifier;
    }

    /**
     * <p>
     * The unique identifer of the <code>Grantee</code>. If the grantee type is <code>IAM</code>, the identifier is the
     * IAM Amazon Resource Name (ARN) of the user or role. If the grantee type is a directory user or group, the
     * identifier is 128-bit universally unique identifier (UUID) in the format
     * <code>a1b2c3d4-5678-90ab-cdef-EXAMPLE11111</code>. You can obtain this UUID from your Amazon Web Services IAM
     * Identity Center instance.
     * </p>
     * 
     * @param granteeIdentifier
     *        The unique identifer of the <code>Grantee</code>. If the grantee type is <code>IAM</code>, the identifier
     *        is the IAM Amazon Resource Name (ARN) of the user or role. If the grantee type is a directory user or
     *        group, the identifier is 128-bit universally unique identifier (UUID) in the format
     *        <code>a1b2c3d4-5678-90ab-cdef-EXAMPLE11111</code>. You can obtain this UUID from your Amazon Web Services
     *        IAM Identity Center instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAccessGrantsRequest withGranteeIdentifier(String granteeIdentifier) {
        setGranteeIdentifier(granteeIdentifier);
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

    public ListAccessGrantsRequest withPermission(String permission) {
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

    public ListAccessGrantsRequest withPermission(Permission permission) {
        this.permission = permission.toString();
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

    public ListAccessGrantsRequest withGrantScope(String grantScope) {
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

    public ListAccessGrantsRequest withApplicationArn(String applicationArn) {
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
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getGranteeType() != null)
            sb.append("GranteeType: ").append(getGranteeType()).append(",");
        if (getGranteeIdentifier() != null)
            sb.append("GranteeIdentifier: ").append(getGranteeIdentifier()).append(",");
        if (getPermission() != null)
            sb.append("Permission: ").append(getPermission()).append(",");
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

        if (obj instanceof ListAccessGrantsRequest == false)
            return false;
        ListAccessGrantsRequest other = (ListAccessGrantsRequest) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getGranteeType() == null ^ this.getGranteeType() == null)
            return false;
        if (other.getGranteeType() != null && other.getGranteeType().equals(this.getGranteeType()) == false)
            return false;
        if (other.getGranteeIdentifier() == null ^ this.getGranteeIdentifier() == null)
            return false;
        if (other.getGranteeIdentifier() != null && other.getGranteeIdentifier().equals(this.getGranteeIdentifier()) == false)
            return false;
        if (other.getPermission() == null ^ this.getPermission() == null)
            return false;
        if (other.getPermission() != null && other.getPermission().equals(this.getPermission()) == false)
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

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getGranteeType() == null) ? 0 : getGranteeType().hashCode());
        hashCode = prime * hashCode + ((getGranteeIdentifier() == null) ? 0 : getGranteeIdentifier().hashCode());
        hashCode = prime * hashCode + ((getPermission() == null) ? 0 : getPermission().hashCode());
        hashCode = prime * hashCode + ((getGrantScope() == null) ? 0 : getGrantScope().hashCode());
        hashCode = prime * hashCode + ((getApplicationArn() == null) ? 0 : getApplicationArn().hashCode());
        return hashCode;
    }

    @Override
    public ListAccessGrantsRequest clone() {
        return (ListAccessGrantsRequest) super.clone();
    }

}
