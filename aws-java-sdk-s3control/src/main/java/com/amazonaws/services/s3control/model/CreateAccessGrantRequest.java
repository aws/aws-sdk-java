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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/CreateAccessGrant" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateAccessGrantRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the Amazon Web Services account that is making this request.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The ID of the registered location to which you are granting access. S3 Access Grants assigns this ID when you
     * register the location. S3 Access Grants assigns the ID <code>default</code> to the default location
     * <code>s3://</code> and assigns an auto-generated ID to other locations that you register.
     * </p>
     * <p>
     * If you are passing the <code>default</code> location, you cannot create an access grant for the entire default
     * location. You must also specify a bucket or a bucket and prefix in the <code>Subprefix</code> field.
     * </p>
     */
    private String accessGrantsLocationId;
    /**
     * <p>
     * The configuration options of the grant location. The grant location is the S3 path to the data to which you are
     * granting access. It contains the <code>S3SubPrefix</code> field. The grant scope is the result of appending the
     * subprefix to the location scope of the registered location.
     * </p>
     */
    private AccessGrantsLocationConfiguration accessGrantsLocationConfiguration;
    /**
     * <p>
     * The user, group, or role to which you are granting access. You can grant access to an IAM user or role. If you
     * have added your corporate directory to Amazon Web Services IAM Identity Center and associated your Identity
     * Center instance with your S3 Access Grants instance, the grantee can also be a corporate directory user or group.
     * </p>
     */
    private Grantee grantee;
    /**
     * <p>
     * The type of access that you are granting to your S3 data, which can be set to one of the following values:
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
     * The Amazon Resource Name (ARN) of an Amazon Web Services IAM Identity Center application associated with your
     * Identity Center instance. If an application ARN is included in the request to create an access grant, the grantee
     * can only access the S3 data through this application.
     * </p>
     */
    private String applicationArn;
    /**
     * <p>
     * The type of <code>S3SubPrefix</code>. The only possible value is <code>Object</code>. Pass this value if the
     * access grant scope is an object. Do not pass this value if the access grant scope is a bucket or a bucket and a
     * prefix.
     * </p>
     */
    private String s3PrefixType;
    /**
     * <p>
     * The Amazon Web Services resource tags that you are adding to the access grant. Each tag is a label consisting of
     * a user-defined key and value. Tags can help you manage, identify, organize, search for, and filter resources.
     * </p>
     */
    private java.util.List<Tag> tags;

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

    public CreateAccessGrantRequest withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The ID of the registered location to which you are granting access. S3 Access Grants assigns this ID when you
     * register the location. S3 Access Grants assigns the ID <code>default</code> to the default location
     * <code>s3://</code> and assigns an auto-generated ID to other locations that you register.
     * </p>
     * <p>
     * If you are passing the <code>default</code> location, you cannot create an access grant for the entire default
     * location. You must also specify a bucket or a bucket and prefix in the <code>Subprefix</code> field.
     * </p>
     * 
     * @param accessGrantsLocationId
     *        The ID of the registered location to which you are granting access. S3 Access Grants assigns this ID when
     *        you register the location. S3 Access Grants assigns the ID <code>default</code> to the default location
     *        <code>s3://</code> and assigns an auto-generated ID to other locations that you register. </p>
     *        <p>
     *        If you are passing the <code>default</code> location, you cannot create an access grant for the entire
     *        default location. You must also specify a bucket or a bucket and prefix in the <code>Subprefix</code>
     *        field.
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
     * <p>
     * If you are passing the <code>default</code> location, you cannot create an access grant for the entire default
     * location. You must also specify a bucket or a bucket and prefix in the <code>Subprefix</code> field.
     * </p>
     * 
     * @return The ID of the registered location to which you are granting access. S3 Access Grants assigns this ID when
     *         you register the location. S3 Access Grants assigns the ID <code>default</code> to the default location
     *         <code>s3://</code> and assigns an auto-generated ID to other locations that you register. </p>
     *         <p>
     *         If you are passing the <code>default</code> location, you cannot create an access grant for the entire
     *         default location. You must also specify a bucket or a bucket and prefix in the <code>Subprefix</code>
     *         field.
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
     * <p>
     * If you are passing the <code>default</code> location, you cannot create an access grant for the entire default
     * location. You must also specify a bucket or a bucket and prefix in the <code>Subprefix</code> field.
     * </p>
     * 
     * @param accessGrantsLocationId
     *        The ID of the registered location to which you are granting access. S3 Access Grants assigns this ID when
     *        you register the location. S3 Access Grants assigns the ID <code>default</code> to the default location
     *        <code>s3://</code> and assigns an auto-generated ID to other locations that you register. </p>
     *        <p>
     *        If you are passing the <code>default</code> location, you cannot create an access grant for the entire
     *        default location. You must also specify a bucket or a bucket and prefix in the <code>Subprefix</code>
     *        field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAccessGrantRequest withAccessGrantsLocationId(String accessGrantsLocationId) {
        setAccessGrantsLocationId(accessGrantsLocationId);
        return this;
    }

    /**
     * <p>
     * The configuration options of the grant location. The grant location is the S3 path to the data to which you are
     * granting access. It contains the <code>S3SubPrefix</code> field. The grant scope is the result of appending the
     * subprefix to the location scope of the registered location.
     * </p>
     * 
     * @param accessGrantsLocationConfiguration
     *        The configuration options of the grant location. The grant location is the S3 path to the data to which
     *        you are granting access. It contains the <code>S3SubPrefix</code> field. The grant scope is the result of
     *        appending the subprefix to the location scope of the registered location.
     */

    public void setAccessGrantsLocationConfiguration(AccessGrantsLocationConfiguration accessGrantsLocationConfiguration) {
        this.accessGrantsLocationConfiguration = accessGrantsLocationConfiguration;
    }

    /**
     * <p>
     * The configuration options of the grant location. The grant location is the S3 path to the data to which you are
     * granting access. It contains the <code>S3SubPrefix</code> field. The grant scope is the result of appending the
     * subprefix to the location scope of the registered location.
     * </p>
     * 
     * @return The configuration options of the grant location. The grant location is the S3 path to the data to which
     *         you are granting access. It contains the <code>S3SubPrefix</code> field. The grant scope is the result of
     *         appending the subprefix to the location scope of the registered location.
     */

    public AccessGrantsLocationConfiguration getAccessGrantsLocationConfiguration() {
        return this.accessGrantsLocationConfiguration;
    }

    /**
     * <p>
     * The configuration options of the grant location. The grant location is the S3 path to the data to which you are
     * granting access. It contains the <code>S3SubPrefix</code> field. The grant scope is the result of appending the
     * subprefix to the location scope of the registered location.
     * </p>
     * 
     * @param accessGrantsLocationConfiguration
     *        The configuration options of the grant location. The grant location is the S3 path to the data to which
     *        you are granting access. It contains the <code>S3SubPrefix</code> field. The grant scope is the result of
     *        appending the subprefix to the location scope of the registered location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAccessGrantRequest withAccessGrantsLocationConfiguration(AccessGrantsLocationConfiguration accessGrantsLocationConfiguration) {
        setAccessGrantsLocationConfiguration(accessGrantsLocationConfiguration);
        return this;
    }

    /**
     * <p>
     * The user, group, or role to which you are granting access. You can grant access to an IAM user or role. If you
     * have added your corporate directory to Amazon Web Services IAM Identity Center and associated your Identity
     * Center instance with your S3 Access Grants instance, the grantee can also be a corporate directory user or group.
     * </p>
     * 
     * @param grantee
     *        The user, group, or role to which you are granting access. You can grant access to an IAM user or role. If
     *        you have added your corporate directory to Amazon Web Services IAM Identity Center and associated your
     *        Identity Center instance with your S3 Access Grants instance, the grantee can also be a corporate
     *        directory user or group.
     */

    public void setGrantee(Grantee grantee) {
        this.grantee = grantee;
    }

    /**
     * <p>
     * The user, group, or role to which you are granting access. You can grant access to an IAM user or role. If you
     * have added your corporate directory to Amazon Web Services IAM Identity Center and associated your Identity
     * Center instance with your S3 Access Grants instance, the grantee can also be a corporate directory user or group.
     * </p>
     * 
     * @return The user, group, or role to which you are granting access. You can grant access to an IAM user or role.
     *         If you have added your corporate directory to Amazon Web Services IAM Identity Center and associated your
     *         Identity Center instance with your S3 Access Grants instance, the grantee can also be a corporate
     *         directory user or group.
     */

    public Grantee getGrantee() {
        return this.grantee;
    }

    /**
     * <p>
     * The user, group, or role to which you are granting access. You can grant access to an IAM user or role. If you
     * have added your corporate directory to Amazon Web Services IAM Identity Center and associated your Identity
     * Center instance with your S3 Access Grants instance, the grantee can also be a corporate directory user or group.
     * </p>
     * 
     * @param grantee
     *        The user, group, or role to which you are granting access. You can grant access to an IAM user or role. If
     *        you have added your corporate directory to Amazon Web Services IAM Identity Center and associated your
     *        Identity Center instance with your S3 Access Grants instance, the grantee can also be a corporate
     *        directory user or group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAccessGrantRequest withGrantee(Grantee grantee) {
        setGrantee(grantee);
        return this;
    }

    /**
     * <p>
     * The type of access that you are granting to your S3 data, which can be set to one of the following values:
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
     *        The type of access that you are granting to your S3 data, which can be set to one of the following
     *        values:</p>
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
     * The type of access that you are granting to your S3 data, which can be set to one of the following values:
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
     * @return The type of access that you are granting to your S3 data, which can be set to one of the following
     *         values:</p>
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
     * The type of access that you are granting to your S3 data, which can be set to one of the following values:
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
     *        The type of access that you are granting to your S3 data, which can be set to one of the following
     *        values:</p>
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

    public CreateAccessGrantRequest withPermission(String permission) {
        setPermission(permission);
        return this;
    }

    /**
     * <p>
     * The type of access that you are granting to your S3 data, which can be set to one of the following values:
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
     *        The type of access that you are granting to your S3 data, which can be set to one of the following
     *        values:</p>
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

    public CreateAccessGrantRequest withPermission(Permission permission) {
        this.permission = permission.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an Amazon Web Services IAM Identity Center application associated with your
     * Identity Center instance. If an application ARN is included in the request to create an access grant, the grantee
     * can only access the S3 data through this application.
     * </p>
     * 
     * @param applicationArn
     *        The Amazon Resource Name (ARN) of an Amazon Web Services IAM Identity Center application associated with
     *        your Identity Center instance. If an application ARN is included in the request to create an access grant,
     *        the grantee can only access the S3 data through this application.
     */

    public void setApplicationArn(String applicationArn) {
        this.applicationArn = applicationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an Amazon Web Services IAM Identity Center application associated with your
     * Identity Center instance. If an application ARN is included in the request to create an access grant, the grantee
     * can only access the S3 data through this application.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of an Amazon Web Services IAM Identity Center application associated with
     *         your Identity Center instance. If an application ARN is included in the request to create an access
     *         grant, the grantee can only access the S3 data through this application.
     */

    public String getApplicationArn() {
        return this.applicationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an Amazon Web Services IAM Identity Center application associated with your
     * Identity Center instance. If an application ARN is included in the request to create an access grant, the grantee
     * can only access the S3 data through this application.
     * </p>
     * 
     * @param applicationArn
     *        The Amazon Resource Name (ARN) of an Amazon Web Services IAM Identity Center application associated with
     *        your Identity Center instance. If an application ARN is included in the request to create an access grant,
     *        the grantee can only access the S3 data through this application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAccessGrantRequest withApplicationArn(String applicationArn) {
        setApplicationArn(applicationArn);
        return this;
    }

    /**
     * <p>
     * The type of <code>S3SubPrefix</code>. The only possible value is <code>Object</code>. Pass this value if the
     * access grant scope is an object. Do not pass this value if the access grant scope is a bucket or a bucket and a
     * prefix.
     * </p>
     * 
     * @param s3PrefixType
     *        The type of <code>S3SubPrefix</code>. The only possible value is <code>Object</code>. Pass this value if
     *        the access grant scope is an object. Do not pass this value if the access grant scope is a bucket or a
     *        bucket and a prefix.
     * @see S3PrefixType
     */

    public void setS3PrefixType(String s3PrefixType) {
        this.s3PrefixType = s3PrefixType;
    }

    /**
     * <p>
     * The type of <code>S3SubPrefix</code>. The only possible value is <code>Object</code>. Pass this value if the
     * access grant scope is an object. Do not pass this value if the access grant scope is a bucket or a bucket and a
     * prefix.
     * </p>
     * 
     * @return The type of <code>S3SubPrefix</code>. The only possible value is <code>Object</code>. Pass this value if
     *         the access grant scope is an object. Do not pass this value if the access grant scope is a bucket or a
     *         bucket and a prefix.
     * @see S3PrefixType
     */

    public String getS3PrefixType() {
        return this.s3PrefixType;
    }

    /**
     * <p>
     * The type of <code>S3SubPrefix</code>. The only possible value is <code>Object</code>. Pass this value if the
     * access grant scope is an object. Do not pass this value if the access grant scope is a bucket or a bucket and a
     * prefix.
     * </p>
     * 
     * @param s3PrefixType
     *        The type of <code>S3SubPrefix</code>. The only possible value is <code>Object</code>. Pass this value if
     *        the access grant scope is an object. Do not pass this value if the access grant scope is a bucket or a
     *        bucket and a prefix.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see S3PrefixType
     */

    public CreateAccessGrantRequest withS3PrefixType(String s3PrefixType) {
        setS3PrefixType(s3PrefixType);
        return this;
    }

    /**
     * <p>
     * The type of <code>S3SubPrefix</code>. The only possible value is <code>Object</code>. Pass this value if the
     * access grant scope is an object. Do not pass this value if the access grant scope is a bucket or a bucket and a
     * prefix.
     * </p>
     * 
     * @param s3PrefixType
     *        The type of <code>S3SubPrefix</code>. The only possible value is <code>Object</code>. Pass this value if
     *        the access grant scope is an object. Do not pass this value if the access grant scope is a bucket or a
     *        bucket and a prefix.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see S3PrefixType
     */

    public CreateAccessGrantRequest withS3PrefixType(S3PrefixType s3PrefixType) {
        this.s3PrefixType = s3PrefixType.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services resource tags that you are adding to the access grant. Each tag is a label consisting of
     * a user-defined key and value. Tags can help you manage, identify, organize, search for, and filter resources.
     * </p>
     * 
     * @return The Amazon Web Services resource tags that you are adding to the access grant. Each tag is a label
     *         consisting of a user-defined key and value. Tags can help you manage, identify, organize, search for, and
     *         filter resources.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The Amazon Web Services resource tags that you are adding to the access grant. Each tag is a label consisting of
     * a user-defined key and value. Tags can help you manage, identify, organize, search for, and filter resources.
     * </p>
     * 
     * @param tags
     *        The Amazon Web Services resource tags that you are adding to the access grant. Each tag is a label
     *        consisting of a user-defined key and value. Tags can help you manage, identify, organize, search for, and
     *        filter resources.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * The Amazon Web Services resource tags that you are adding to the access grant. Each tag is a label consisting of
     * a user-defined key and value. Tags can help you manage, identify, organize, search for, and filter resources.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The Amazon Web Services resource tags that you are adding to the access grant. Each tag is a label
     *        consisting of a user-defined key and value. Tags can help you manage, identify, organize, search for, and
     *        filter resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAccessGrantRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services resource tags that you are adding to the access grant. Each tag is a label consisting of
     * a user-defined key and value. Tags can help you manage, identify, organize, search for, and filter resources.
     * </p>
     * 
     * @param tags
     *        The Amazon Web Services resource tags that you are adding to the access grant. Each tag is a label
     *        consisting of a user-defined key and value. Tags can help you manage, identify, organize, search for, and
     *        filter resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAccessGrantRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getAccessGrantsLocationId() != null)
            sb.append("AccessGrantsLocationId: ").append(getAccessGrantsLocationId()).append(",");
        if (getAccessGrantsLocationConfiguration() != null)
            sb.append("AccessGrantsLocationConfiguration: ").append(getAccessGrantsLocationConfiguration()).append(",");
        if (getGrantee() != null)
            sb.append("Grantee: ").append(getGrantee()).append(",");
        if (getPermission() != null)
            sb.append("Permission: ").append(getPermission()).append(",");
        if (getApplicationArn() != null)
            sb.append("ApplicationArn: ").append(getApplicationArn()).append(",");
        if (getS3PrefixType() != null)
            sb.append("S3PrefixType: ").append(getS3PrefixType()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateAccessGrantRequest == false)
            return false;
        CreateAccessGrantRequest other = (CreateAccessGrantRequest) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
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
        if (other.getGrantee() == null ^ this.getGrantee() == null)
            return false;
        if (other.getGrantee() != null && other.getGrantee().equals(this.getGrantee()) == false)
            return false;
        if (other.getPermission() == null ^ this.getPermission() == null)
            return false;
        if (other.getPermission() != null && other.getPermission().equals(this.getPermission()) == false)
            return false;
        if (other.getApplicationArn() == null ^ this.getApplicationArn() == null)
            return false;
        if (other.getApplicationArn() != null && other.getApplicationArn().equals(this.getApplicationArn()) == false)
            return false;
        if (other.getS3PrefixType() == null ^ this.getS3PrefixType() == null)
            return false;
        if (other.getS3PrefixType() != null && other.getS3PrefixType().equals(this.getS3PrefixType()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getAccessGrantsLocationId() == null) ? 0 : getAccessGrantsLocationId().hashCode());
        hashCode = prime * hashCode + ((getAccessGrantsLocationConfiguration() == null) ? 0 : getAccessGrantsLocationConfiguration().hashCode());
        hashCode = prime * hashCode + ((getGrantee() == null) ? 0 : getGrantee().hashCode());
        hashCode = prime * hashCode + ((getPermission() == null) ? 0 : getPermission().hashCode());
        hashCode = prime * hashCode + ((getApplicationArn() == null) ? 0 : getApplicationArn().hashCode());
        hashCode = prime * hashCode + ((getS3PrefixType() == null) ? 0 : getS3PrefixType().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateAccessGrantRequest clone() {
        return (CreateAccessGrantRequest) super.clone();
    }

}
