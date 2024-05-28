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
package com.amazonaws.services.ram.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a RAM managed permission.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/ResourceSharePermissionDetail" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceSharePermissionDetail implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Name
     * (ARN)</a> of this RAM managed permission.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The version of the permission described in this response.
     * </p>
     */
    private String version;
    /**
     * <p>
     * Specifies whether the version of the permission represented in this response is the default version for this
     * permission.
     * </p>
     */
    private Boolean defaultVersion;
    /**
     * <p>
     * The name of this permission.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The resource type to which this permission applies.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * The permission's effect and actions in JSON format. The <code>effect</code> indicates whether the specified
     * actions are allowed or denied. The <code>actions</code> list the operations to which the principal is granted or
     * denied access.
     * </p>
     */
    private String permission;
    /**
     * <p>
     * The date and time when the permission was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The date and time when the permission was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedTime;
    /**
     * <p>
     * Specifies whether the version of the permission represented in this response is the default version for all
     * resources of this resource type.
     * </p>
     */
    private Boolean isResourceTypeDefault;
    /**
     * <p>
     * The type of managed permission. This can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AWS_MANAGED</code> – Amazon Web Services created and manages this managed permission. You can associate it
     * with your resource shares, but you can't modify it.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CUSTOMER_MANAGED</code> – You, or another principal in your account created this managed permission. You
     * can associate it with your resource shares and create new versions that have different permissions.
     * </p>
     * </li>
     * </ul>
     */
    private String permissionType;
    /**
     * <p>
     * Indicates what features are available for this resource share. This parameter can have one of the following
     * values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>STANDARD</b> – A resource share that supports all functionality. These resource shares are visible to all
     * principals you share the resource share with. You can modify these resource shares in RAM using the console or
     * APIs. This resource share might have been created by RAM, or it might have been <b>CREATED_FROM_POLICY</b> and
     * then promoted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>CREATED_FROM_POLICY</b> – The customer manually shared a resource by attaching a resource-based policy. That
     * policy did not match any existing managed permissions, so RAM created this customer managed permission
     * automatically on the customer's behalf based on the attached policy document. This type of resource share is
     * visible only to the Amazon Web Services account that created it. You can't modify it in RAM unless you promote
     * it. For more information, see <a>PromoteResourceShareCreatedFromPolicy</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>PROMOTING_TO_STANDARD</b> – This resource share was originally <code>CREATED_FROM_POLICY</code>, but the
     * customer ran the <a>PromoteResourceShareCreatedFromPolicy</a> and that operation is still in progress. This value
     * changes to <code>STANDARD</code> when complete.
     * </p>
     * </li>
     * </ul>
     */
    private String featureSet;
    /**
     * <p>
     * The current status of the association between the permission and the resource share. The following are the
     * possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ATTACHABLE</code> – This permission or version can be associated with resource shares.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNATTACHABLE</code> – This permission or version can't currently be associated with resource shares.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> – This permission or version is in the process of being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETED</code> – This permission or version is deleted.
     * </p>
     * </li>
     * </ul>
     */
    private String status;
    /**
     * <p>
     * The tag key and value pairs attached to the resource share.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Name
     * (ARN)</a> of this RAM managed permission.
     * </p>
     * 
     * @param arn
     *        The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource
     *        Name (ARN)</a> of this RAM managed permission.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Name
     * (ARN)</a> of this RAM managed permission.
     * </p>
     * 
     * @return The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource
     *         Name (ARN)</a> of this RAM managed permission.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Name
     * (ARN)</a> of this RAM managed permission.
     * </p>
     * 
     * @param arn
     *        The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource
     *        Name (ARN)</a> of this RAM managed permission.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceSharePermissionDetail withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The version of the permission described in this response.
     * </p>
     * 
     * @param version
     *        The version of the permission described in this response.
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The version of the permission described in this response.
     * </p>
     * 
     * @return The version of the permission described in this response.
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The version of the permission described in this response.
     * </p>
     * 
     * @param version
     *        The version of the permission described in this response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceSharePermissionDetail withVersion(String version) {
        setVersion(version);
        return this;
    }

    /**
     * <p>
     * Specifies whether the version of the permission represented in this response is the default version for this
     * permission.
     * </p>
     * 
     * @param defaultVersion
     *        Specifies whether the version of the permission represented in this response is the default version for
     *        this permission.
     */

    public void setDefaultVersion(Boolean defaultVersion) {
        this.defaultVersion = defaultVersion;
    }

    /**
     * <p>
     * Specifies whether the version of the permission represented in this response is the default version for this
     * permission.
     * </p>
     * 
     * @return Specifies whether the version of the permission represented in this response is the default version for
     *         this permission.
     */

    public Boolean getDefaultVersion() {
        return this.defaultVersion;
    }

    /**
     * <p>
     * Specifies whether the version of the permission represented in this response is the default version for this
     * permission.
     * </p>
     * 
     * @param defaultVersion
     *        Specifies whether the version of the permission represented in this response is the default version for
     *        this permission.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceSharePermissionDetail withDefaultVersion(Boolean defaultVersion) {
        setDefaultVersion(defaultVersion);
        return this;
    }

    /**
     * <p>
     * Specifies whether the version of the permission represented in this response is the default version for this
     * permission.
     * </p>
     * 
     * @return Specifies whether the version of the permission represented in this response is the default version for
     *         this permission.
     */

    public Boolean isDefaultVersion() {
        return this.defaultVersion;
    }

    /**
     * <p>
     * The name of this permission.
     * </p>
     * 
     * @param name
     *        The name of this permission.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of this permission.
     * </p>
     * 
     * @return The name of this permission.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of this permission.
     * </p>
     * 
     * @param name
     *        The name of this permission.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceSharePermissionDetail withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The resource type to which this permission applies.
     * </p>
     * 
     * @param resourceType
     *        The resource type to which this permission applies.
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The resource type to which this permission applies.
     * </p>
     * 
     * @return The resource type to which this permission applies.
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The resource type to which this permission applies.
     * </p>
     * 
     * @param resourceType
     *        The resource type to which this permission applies.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceSharePermissionDetail withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The permission's effect and actions in JSON format. The <code>effect</code> indicates whether the specified
     * actions are allowed or denied. The <code>actions</code> list the operations to which the principal is granted or
     * denied access.
     * </p>
     * 
     * @param permission
     *        The permission's effect and actions in JSON format. The <code>effect</code> indicates whether the
     *        specified actions are allowed or denied. The <code>actions</code> list the operations to which the
     *        principal is granted or denied access.
     */

    public void setPermission(String permission) {
        this.permission = permission;
    }

    /**
     * <p>
     * The permission's effect and actions in JSON format. The <code>effect</code> indicates whether the specified
     * actions are allowed or denied. The <code>actions</code> list the operations to which the principal is granted or
     * denied access.
     * </p>
     * 
     * @return The permission's effect and actions in JSON format. The <code>effect</code> indicates whether the
     *         specified actions are allowed or denied. The <code>actions</code> list the operations to which the
     *         principal is granted or denied access.
     */

    public String getPermission() {
        return this.permission;
    }

    /**
     * <p>
     * The permission's effect and actions in JSON format. The <code>effect</code> indicates whether the specified
     * actions are allowed or denied. The <code>actions</code> list the operations to which the principal is granted or
     * denied access.
     * </p>
     * 
     * @param permission
     *        The permission's effect and actions in JSON format. The <code>effect</code> indicates whether the
     *        specified actions are allowed or denied. The <code>actions</code> list the operations to which the
     *        principal is granted or denied access.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceSharePermissionDetail withPermission(String permission) {
        setPermission(permission);
        return this;
    }

    /**
     * <p>
     * The date and time when the permission was created.
     * </p>
     * 
     * @param creationTime
     *        The date and time when the permission was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The date and time when the permission was created.
     * </p>
     * 
     * @return The date and time when the permission was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The date and time when the permission was created.
     * </p>
     * 
     * @param creationTime
     *        The date and time when the permission was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceSharePermissionDetail withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The date and time when the permission was last updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The date and time when the permission was last updated.
     */

    public void setLastUpdatedTime(java.util.Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    /**
     * <p>
     * The date and time when the permission was last updated.
     * </p>
     * 
     * @return The date and time when the permission was last updated.
     */

    public java.util.Date getLastUpdatedTime() {
        return this.lastUpdatedTime;
    }

    /**
     * <p>
     * The date and time when the permission was last updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The date and time when the permission was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceSharePermissionDetail withLastUpdatedTime(java.util.Date lastUpdatedTime) {
        setLastUpdatedTime(lastUpdatedTime);
        return this;
    }

    /**
     * <p>
     * Specifies whether the version of the permission represented in this response is the default version for all
     * resources of this resource type.
     * </p>
     * 
     * @param isResourceTypeDefault
     *        Specifies whether the version of the permission represented in this response is the default version for
     *        all resources of this resource type.
     */

    public void setIsResourceTypeDefault(Boolean isResourceTypeDefault) {
        this.isResourceTypeDefault = isResourceTypeDefault;
    }

    /**
     * <p>
     * Specifies whether the version of the permission represented in this response is the default version for all
     * resources of this resource type.
     * </p>
     * 
     * @return Specifies whether the version of the permission represented in this response is the default version for
     *         all resources of this resource type.
     */

    public Boolean getIsResourceTypeDefault() {
        return this.isResourceTypeDefault;
    }

    /**
     * <p>
     * Specifies whether the version of the permission represented in this response is the default version for all
     * resources of this resource type.
     * </p>
     * 
     * @param isResourceTypeDefault
     *        Specifies whether the version of the permission represented in this response is the default version for
     *        all resources of this resource type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceSharePermissionDetail withIsResourceTypeDefault(Boolean isResourceTypeDefault) {
        setIsResourceTypeDefault(isResourceTypeDefault);
        return this;
    }

    /**
     * <p>
     * Specifies whether the version of the permission represented in this response is the default version for all
     * resources of this resource type.
     * </p>
     * 
     * @return Specifies whether the version of the permission represented in this response is the default version for
     *         all resources of this resource type.
     */

    public Boolean isResourceTypeDefault() {
        return this.isResourceTypeDefault;
    }

    /**
     * <p>
     * The type of managed permission. This can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AWS_MANAGED</code> – Amazon Web Services created and manages this managed permission. You can associate it
     * with your resource shares, but you can't modify it.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CUSTOMER_MANAGED</code> – You, or another principal in your account created this managed permission. You
     * can associate it with your resource shares and create new versions that have different permissions.
     * </p>
     * </li>
     * </ul>
     * 
     * @param permissionType
     *        The type of managed permission. This can be one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>AWS_MANAGED</code> – Amazon Web Services created and manages this managed permission. You can
     *        associate it with your resource shares, but you can't modify it.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CUSTOMER_MANAGED</code> – You, or another principal in your account created this managed permission.
     *        You can associate it with your resource shares and create new versions that have different permissions.
     *        </p>
     *        </li>
     * @see PermissionType
     */

    public void setPermissionType(String permissionType) {
        this.permissionType = permissionType;
    }

    /**
     * <p>
     * The type of managed permission. This can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AWS_MANAGED</code> – Amazon Web Services created and manages this managed permission. You can associate it
     * with your resource shares, but you can't modify it.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CUSTOMER_MANAGED</code> – You, or another principal in your account created this managed permission. You
     * can associate it with your resource shares and create new versions that have different permissions.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The type of managed permission. This can be one of the following values:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>AWS_MANAGED</code> – Amazon Web Services created and manages this managed permission. You can
     *         associate it with your resource shares, but you can't modify it.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CUSTOMER_MANAGED</code> – You, or another principal in your account created this managed
     *         permission. You can associate it with your resource shares and create new versions that have different
     *         permissions.
     *         </p>
     *         </li>
     * @see PermissionType
     */

    public String getPermissionType() {
        return this.permissionType;
    }

    /**
     * <p>
     * The type of managed permission. This can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AWS_MANAGED</code> – Amazon Web Services created and manages this managed permission. You can associate it
     * with your resource shares, but you can't modify it.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CUSTOMER_MANAGED</code> – You, or another principal in your account created this managed permission. You
     * can associate it with your resource shares and create new versions that have different permissions.
     * </p>
     * </li>
     * </ul>
     * 
     * @param permissionType
     *        The type of managed permission. This can be one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>AWS_MANAGED</code> – Amazon Web Services created and manages this managed permission. You can
     *        associate it with your resource shares, but you can't modify it.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CUSTOMER_MANAGED</code> – You, or another principal in your account created this managed permission.
     *        You can associate it with your resource shares and create new versions that have different permissions.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PermissionType
     */

    public ResourceSharePermissionDetail withPermissionType(String permissionType) {
        setPermissionType(permissionType);
        return this;
    }

    /**
     * <p>
     * The type of managed permission. This can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AWS_MANAGED</code> – Amazon Web Services created and manages this managed permission. You can associate it
     * with your resource shares, but you can't modify it.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CUSTOMER_MANAGED</code> – You, or another principal in your account created this managed permission. You
     * can associate it with your resource shares and create new versions that have different permissions.
     * </p>
     * </li>
     * </ul>
     * 
     * @param permissionType
     *        The type of managed permission. This can be one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>AWS_MANAGED</code> – Amazon Web Services created and manages this managed permission. You can
     *        associate it with your resource shares, but you can't modify it.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CUSTOMER_MANAGED</code> – You, or another principal in your account created this managed permission.
     *        You can associate it with your resource shares and create new versions that have different permissions.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PermissionType
     */

    public ResourceSharePermissionDetail withPermissionType(PermissionType permissionType) {
        this.permissionType = permissionType.toString();
        return this;
    }

    /**
     * <p>
     * Indicates what features are available for this resource share. This parameter can have one of the following
     * values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>STANDARD</b> – A resource share that supports all functionality. These resource shares are visible to all
     * principals you share the resource share with. You can modify these resource shares in RAM using the console or
     * APIs. This resource share might have been created by RAM, or it might have been <b>CREATED_FROM_POLICY</b> and
     * then promoted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>CREATED_FROM_POLICY</b> – The customer manually shared a resource by attaching a resource-based policy. That
     * policy did not match any existing managed permissions, so RAM created this customer managed permission
     * automatically on the customer's behalf based on the attached policy document. This type of resource share is
     * visible only to the Amazon Web Services account that created it. You can't modify it in RAM unless you promote
     * it. For more information, see <a>PromoteResourceShareCreatedFromPolicy</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>PROMOTING_TO_STANDARD</b> – This resource share was originally <code>CREATED_FROM_POLICY</code>, but the
     * customer ran the <a>PromoteResourceShareCreatedFromPolicy</a> and that operation is still in progress. This value
     * changes to <code>STANDARD</code> when complete.
     * </p>
     * </li>
     * </ul>
     * 
     * @param featureSet
     *        Indicates what features are available for this resource share. This parameter can have one of the
     *        following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>STANDARD</b> – A resource share that supports all functionality. These resource shares are visible to
     *        all principals you share the resource share with. You can modify these resource shares in RAM using the
     *        console or APIs. This resource share might have been created by RAM, or it might have been
     *        <b>CREATED_FROM_POLICY</b> and then promoted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>CREATED_FROM_POLICY</b> – The customer manually shared a resource by attaching a resource-based policy.
     *        That policy did not match any existing managed permissions, so RAM created this customer managed
     *        permission automatically on the customer's behalf based on the attached policy document. This type of
     *        resource share is visible only to the Amazon Web Services account that created it. You can't modify it in
     *        RAM unless you promote it. For more information, see <a>PromoteResourceShareCreatedFromPolicy</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>PROMOTING_TO_STANDARD</b> – This resource share was originally <code>CREATED_FROM_POLICY</code>, but
     *        the customer ran the <a>PromoteResourceShareCreatedFromPolicy</a> and that operation is still in progress.
     *        This value changes to <code>STANDARD</code> when complete.
     *        </p>
     *        </li>
     * @see PermissionFeatureSet
     */

    public void setFeatureSet(String featureSet) {
        this.featureSet = featureSet;
    }

    /**
     * <p>
     * Indicates what features are available for this resource share. This parameter can have one of the following
     * values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>STANDARD</b> – A resource share that supports all functionality. These resource shares are visible to all
     * principals you share the resource share with. You can modify these resource shares in RAM using the console or
     * APIs. This resource share might have been created by RAM, or it might have been <b>CREATED_FROM_POLICY</b> and
     * then promoted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>CREATED_FROM_POLICY</b> – The customer manually shared a resource by attaching a resource-based policy. That
     * policy did not match any existing managed permissions, so RAM created this customer managed permission
     * automatically on the customer's behalf based on the attached policy document. This type of resource share is
     * visible only to the Amazon Web Services account that created it. You can't modify it in RAM unless you promote
     * it. For more information, see <a>PromoteResourceShareCreatedFromPolicy</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>PROMOTING_TO_STANDARD</b> – This resource share was originally <code>CREATED_FROM_POLICY</code>, but the
     * customer ran the <a>PromoteResourceShareCreatedFromPolicy</a> and that operation is still in progress. This value
     * changes to <code>STANDARD</code> when complete.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Indicates what features are available for this resource share. This parameter can have one of the
     *         following values:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>STANDARD</b> – A resource share that supports all functionality. These resource shares are visible to
     *         all principals you share the resource share with. You can modify these resource shares in RAM using the
     *         console or APIs. This resource share might have been created by RAM, or it might have been
     *         <b>CREATED_FROM_POLICY</b> and then promoted.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>CREATED_FROM_POLICY</b> – The customer manually shared a resource by attaching a resource-based
     *         policy. That policy did not match any existing managed permissions, so RAM created this customer managed
     *         permission automatically on the customer's behalf based on the attached policy document. This type of
     *         resource share is visible only to the Amazon Web Services account that created it. You can't modify it in
     *         RAM unless you promote it. For more information, see <a>PromoteResourceShareCreatedFromPolicy</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>PROMOTING_TO_STANDARD</b> – This resource share was originally <code>CREATED_FROM_POLICY</code>, but
     *         the customer ran the <a>PromoteResourceShareCreatedFromPolicy</a> and that operation is still in
     *         progress. This value changes to <code>STANDARD</code> when complete.
     *         </p>
     *         </li>
     * @see PermissionFeatureSet
     */

    public String getFeatureSet() {
        return this.featureSet;
    }

    /**
     * <p>
     * Indicates what features are available for this resource share. This parameter can have one of the following
     * values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>STANDARD</b> – A resource share that supports all functionality. These resource shares are visible to all
     * principals you share the resource share with. You can modify these resource shares in RAM using the console or
     * APIs. This resource share might have been created by RAM, or it might have been <b>CREATED_FROM_POLICY</b> and
     * then promoted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>CREATED_FROM_POLICY</b> – The customer manually shared a resource by attaching a resource-based policy. That
     * policy did not match any existing managed permissions, so RAM created this customer managed permission
     * automatically on the customer's behalf based on the attached policy document. This type of resource share is
     * visible only to the Amazon Web Services account that created it. You can't modify it in RAM unless you promote
     * it. For more information, see <a>PromoteResourceShareCreatedFromPolicy</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>PROMOTING_TO_STANDARD</b> – This resource share was originally <code>CREATED_FROM_POLICY</code>, but the
     * customer ran the <a>PromoteResourceShareCreatedFromPolicy</a> and that operation is still in progress. This value
     * changes to <code>STANDARD</code> when complete.
     * </p>
     * </li>
     * </ul>
     * 
     * @param featureSet
     *        Indicates what features are available for this resource share. This parameter can have one of the
     *        following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>STANDARD</b> – A resource share that supports all functionality. These resource shares are visible to
     *        all principals you share the resource share with. You can modify these resource shares in RAM using the
     *        console or APIs. This resource share might have been created by RAM, or it might have been
     *        <b>CREATED_FROM_POLICY</b> and then promoted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>CREATED_FROM_POLICY</b> – The customer manually shared a resource by attaching a resource-based policy.
     *        That policy did not match any existing managed permissions, so RAM created this customer managed
     *        permission automatically on the customer's behalf based on the attached policy document. This type of
     *        resource share is visible only to the Amazon Web Services account that created it. You can't modify it in
     *        RAM unless you promote it. For more information, see <a>PromoteResourceShareCreatedFromPolicy</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>PROMOTING_TO_STANDARD</b> – This resource share was originally <code>CREATED_FROM_POLICY</code>, but
     *        the customer ran the <a>PromoteResourceShareCreatedFromPolicy</a> and that operation is still in progress.
     *        This value changes to <code>STANDARD</code> when complete.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PermissionFeatureSet
     */

    public ResourceSharePermissionDetail withFeatureSet(String featureSet) {
        setFeatureSet(featureSet);
        return this;
    }

    /**
     * <p>
     * Indicates what features are available for this resource share. This parameter can have one of the following
     * values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>STANDARD</b> – A resource share that supports all functionality. These resource shares are visible to all
     * principals you share the resource share with. You can modify these resource shares in RAM using the console or
     * APIs. This resource share might have been created by RAM, or it might have been <b>CREATED_FROM_POLICY</b> and
     * then promoted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>CREATED_FROM_POLICY</b> – The customer manually shared a resource by attaching a resource-based policy. That
     * policy did not match any existing managed permissions, so RAM created this customer managed permission
     * automatically on the customer's behalf based on the attached policy document. This type of resource share is
     * visible only to the Amazon Web Services account that created it. You can't modify it in RAM unless you promote
     * it. For more information, see <a>PromoteResourceShareCreatedFromPolicy</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>PROMOTING_TO_STANDARD</b> – This resource share was originally <code>CREATED_FROM_POLICY</code>, but the
     * customer ran the <a>PromoteResourceShareCreatedFromPolicy</a> and that operation is still in progress. This value
     * changes to <code>STANDARD</code> when complete.
     * </p>
     * </li>
     * </ul>
     * 
     * @param featureSet
     *        Indicates what features are available for this resource share. This parameter can have one of the
     *        following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>STANDARD</b> – A resource share that supports all functionality. These resource shares are visible to
     *        all principals you share the resource share with. You can modify these resource shares in RAM using the
     *        console or APIs. This resource share might have been created by RAM, or it might have been
     *        <b>CREATED_FROM_POLICY</b> and then promoted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>CREATED_FROM_POLICY</b> – The customer manually shared a resource by attaching a resource-based policy.
     *        That policy did not match any existing managed permissions, so RAM created this customer managed
     *        permission automatically on the customer's behalf based on the attached policy document. This type of
     *        resource share is visible only to the Amazon Web Services account that created it. You can't modify it in
     *        RAM unless you promote it. For more information, see <a>PromoteResourceShareCreatedFromPolicy</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>PROMOTING_TO_STANDARD</b> – This resource share was originally <code>CREATED_FROM_POLICY</code>, but
     *        the customer ran the <a>PromoteResourceShareCreatedFromPolicy</a> and that operation is still in progress.
     *        This value changes to <code>STANDARD</code> when complete.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PermissionFeatureSet
     */

    public ResourceSharePermissionDetail withFeatureSet(PermissionFeatureSet featureSet) {
        this.featureSet = featureSet.toString();
        return this;
    }

    /**
     * <p>
     * The current status of the association between the permission and the resource share. The following are the
     * possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ATTACHABLE</code> – This permission or version can be associated with resource shares.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNATTACHABLE</code> – This permission or version can't currently be associated with resource shares.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> – This permission or version is in the process of being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETED</code> – This permission or version is deleted.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The current status of the association between the permission and the resource share. The following are the
     *        possible values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ATTACHABLE</code> – This permission or version can be associated with resource shares.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UNATTACHABLE</code> – This permission or version can't currently be associated with resource shares.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETING</code> – This permission or version is in the process of being deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETED</code> – This permission or version is deleted.
     *        </p>
     *        </li>
     * @see PermissionStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the association between the permission and the resource share. The following are the
     * possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ATTACHABLE</code> – This permission or version can be associated with resource shares.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNATTACHABLE</code> – This permission or version can't currently be associated with resource shares.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> – This permission or version is in the process of being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETED</code> – This permission or version is deleted.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The current status of the association between the permission and the resource share. The following are
     *         the possible values:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ATTACHABLE</code> – This permission or version can be associated with resource shares.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>UNATTACHABLE</code> – This permission or version can't currently be associated with resource
     *         shares.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DELETING</code> – This permission or version is in the process of being deleted.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DELETED</code> – This permission or version is deleted.
     *         </p>
     *         </li>
     * @see PermissionStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the association between the permission and the resource share. The following are the
     * possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ATTACHABLE</code> – This permission or version can be associated with resource shares.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNATTACHABLE</code> – This permission or version can't currently be associated with resource shares.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> – This permission or version is in the process of being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETED</code> – This permission or version is deleted.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The current status of the association between the permission and the resource share. The following are the
     *        possible values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ATTACHABLE</code> – This permission or version can be associated with resource shares.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UNATTACHABLE</code> – This permission or version can't currently be associated with resource shares.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETING</code> – This permission or version is in the process of being deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETED</code> – This permission or version is deleted.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PermissionStatus
     */

    public ResourceSharePermissionDetail withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current status of the association between the permission and the resource share. The following are the
     * possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ATTACHABLE</code> – This permission or version can be associated with resource shares.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNATTACHABLE</code> – This permission or version can't currently be associated with resource shares.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> – This permission or version is in the process of being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETED</code> – This permission or version is deleted.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The current status of the association between the permission and the resource share. The following are the
     *        possible values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ATTACHABLE</code> – This permission or version can be associated with resource shares.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UNATTACHABLE</code> – This permission or version can't currently be associated with resource shares.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETING</code> – This permission or version is in the process of being deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETED</code> – This permission or version is deleted.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PermissionStatus
     */

    public ResourceSharePermissionDetail withStatus(PermissionStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The tag key and value pairs attached to the resource share.
     * </p>
     * 
     * @return The tag key and value pairs attached to the resource share.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tag key and value pairs attached to the resource share.
     * </p>
     * 
     * @param tags
     *        The tag key and value pairs attached to the resource share.
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
     * The tag key and value pairs attached to the resource share.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tag key and value pairs attached to the resource share.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceSharePermissionDetail withTags(Tag... tags) {
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
     * The tag key and value pairs attached to the resource share.
     * </p>
     * 
     * @param tags
     *        The tag key and value pairs attached to the resource share.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceSharePermissionDetail withTags(java.util.Collection<Tag> tags) {
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion()).append(",");
        if (getDefaultVersion() != null)
            sb.append("DefaultVersion: ").append(getDefaultVersion()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getPermission() != null)
            sb.append("Permission: ").append(getPermission()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getLastUpdatedTime() != null)
            sb.append("LastUpdatedTime: ").append(getLastUpdatedTime()).append(",");
        if (getIsResourceTypeDefault() != null)
            sb.append("IsResourceTypeDefault: ").append(getIsResourceTypeDefault()).append(",");
        if (getPermissionType() != null)
            sb.append("PermissionType: ").append(getPermissionType()).append(",");
        if (getFeatureSet() != null)
            sb.append("FeatureSet: ").append(getFeatureSet()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
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

        if (obj instanceof ResourceSharePermissionDetail == false)
            return false;
        ResourceSharePermissionDetail other = (ResourceSharePermissionDetail) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getDefaultVersion() == null ^ this.getDefaultVersion() == null)
            return false;
        if (other.getDefaultVersion() != null && other.getDefaultVersion().equals(this.getDefaultVersion()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getPermission() == null ^ this.getPermission() == null)
            return false;
        if (other.getPermission() != null && other.getPermission().equals(this.getPermission()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastUpdatedTime() == null ^ this.getLastUpdatedTime() == null)
            return false;
        if (other.getLastUpdatedTime() != null && other.getLastUpdatedTime().equals(this.getLastUpdatedTime()) == false)
            return false;
        if (other.getIsResourceTypeDefault() == null ^ this.getIsResourceTypeDefault() == null)
            return false;
        if (other.getIsResourceTypeDefault() != null && other.getIsResourceTypeDefault().equals(this.getIsResourceTypeDefault()) == false)
            return false;
        if (other.getPermissionType() == null ^ this.getPermissionType() == null)
            return false;
        if (other.getPermissionType() != null && other.getPermissionType().equals(this.getPermissionType()) == false)
            return false;
        if (other.getFeatureSet() == null ^ this.getFeatureSet() == null)
            return false;
        if (other.getFeatureSet() != null && other.getFeatureSet().equals(this.getFeatureSet()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
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

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getDefaultVersion() == null) ? 0 : getDefaultVersion().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getPermission() == null) ? 0 : getPermission().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedTime() == null) ? 0 : getLastUpdatedTime().hashCode());
        hashCode = prime * hashCode + ((getIsResourceTypeDefault() == null) ? 0 : getIsResourceTypeDefault().hashCode());
        hashCode = prime * hashCode + ((getPermissionType() == null) ? 0 : getPermissionType().hashCode());
        hashCode = prime * hashCode + ((getFeatureSet() == null) ? 0 : getFeatureSet().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public ResourceSharePermissionDetail clone() {
        try {
            return (ResourceSharePermissionDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ram.model.transform.ResourceSharePermissionDetailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
