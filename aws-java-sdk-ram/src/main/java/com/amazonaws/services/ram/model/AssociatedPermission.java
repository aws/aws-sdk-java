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
 * An object that describes a managed permission associated with a resource share.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/AssociatedPermission" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociatedPermission implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Name
     * (ARN)</a> of the associated managed permission.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The version of the permission currently associated with the resource share.
     * </p>
     */
    private String permissionVersion;
    /**
     * <p>
     * Indicates whether the associated resource share is using the default version of the permission.
     * </p>
     */
    private Boolean defaultVersion;
    /**
     * <p>
     * The resource type to which this permission applies.
     * </p>
     */
    private String resourceType;
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
     * The date and time when the association between the permission and the resource share was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedTime;
    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Name
     * (ARN)</a> of a resource share associated with this permission.
     * </p>
     */
    private String resourceShareArn;

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Name
     * (ARN)</a> of the associated managed permission.
     * </p>
     * 
     * @param arn
     *        The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource
     *        Name (ARN)</a> of the associated managed permission.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Name
     * (ARN)</a> of the associated managed permission.
     * </p>
     * 
     * @return The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource
     *         Name (ARN)</a> of the associated managed permission.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Name
     * (ARN)</a> of the associated managed permission.
     * </p>
     * 
     * @param arn
     *        The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource
     *        Name (ARN)</a> of the associated managed permission.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociatedPermission withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The version of the permission currently associated with the resource share.
     * </p>
     * 
     * @param permissionVersion
     *        The version of the permission currently associated with the resource share.
     */

    public void setPermissionVersion(String permissionVersion) {
        this.permissionVersion = permissionVersion;
    }

    /**
     * <p>
     * The version of the permission currently associated with the resource share.
     * </p>
     * 
     * @return The version of the permission currently associated with the resource share.
     */

    public String getPermissionVersion() {
        return this.permissionVersion;
    }

    /**
     * <p>
     * The version of the permission currently associated with the resource share.
     * </p>
     * 
     * @param permissionVersion
     *        The version of the permission currently associated with the resource share.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociatedPermission withPermissionVersion(String permissionVersion) {
        setPermissionVersion(permissionVersion);
        return this;
    }

    /**
     * <p>
     * Indicates whether the associated resource share is using the default version of the permission.
     * </p>
     * 
     * @param defaultVersion
     *        Indicates whether the associated resource share is using the default version of the permission.
     */

    public void setDefaultVersion(Boolean defaultVersion) {
        this.defaultVersion = defaultVersion;
    }

    /**
     * <p>
     * Indicates whether the associated resource share is using the default version of the permission.
     * </p>
     * 
     * @return Indicates whether the associated resource share is using the default version of the permission.
     */

    public Boolean getDefaultVersion() {
        return this.defaultVersion;
    }

    /**
     * <p>
     * Indicates whether the associated resource share is using the default version of the permission.
     * </p>
     * 
     * @param defaultVersion
     *        Indicates whether the associated resource share is using the default version of the permission.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociatedPermission withDefaultVersion(Boolean defaultVersion) {
        setDefaultVersion(defaultVersion);
        return this;
    }

    /**
     * <p>
     * Indicates whether the associated resource share is using the default version of the permission.
     * </p>
     * 
     * @return Indicates whether the associated resource share is using the default version of the permission.
     */

    public Boolean isDefaultVersion() {
        return this.defaultVersion;
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

    public AssociatedPermission withResourceType(String resourceType) {
        setResourceType(resourceType);
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
     */

    public AssociatedPermission withStatus(String status) {
        setStatus(status);
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

    public AssociatedPermission withFeatureSet(String featureSet) {
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

    public AssociatedPermission withFeatureSet(PermissionFeatureSet featureSet) {
        this.featureSet = featureSet.toString();
        return this;
    }

    /**
     * <p>
     * The date and time when the association between the permission and the resource share was last updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The date and time when the association between the permission and the resource share was last updated.
     */

    public void setLastUpdatedTime(java.util.Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    /**
     * <p>
     * The date and time when the association between the permission and the resource share was last updated.
     * </p>
     * 
     * @return The date and time when the association between the permission and the resource share was last updated.
     */

    public java.util.Date getLastUpdatedTime() {
        return this.lastUpdatedTime;
    }

    /**
     * <p>
     * The date and time when the association between the permission and the resource share was last updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The date and time when the association between the permission and the resource share was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociatedPermission withLastUpdatedTime(java.util.Date lastUpdatedTime) {
        setLastUpdatedTime(lastUpdatedTime);
        return this;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Name
     * (ARN)</a> of a resource share associated with this permission.
     * </p>
     * 
     * @param resourceShareArn
     *        The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource
     *        Name (ARN)</a> of a resource share associated with this permission.
     */

    public void setResourceShareArn(String resourceShareArn) {
        this.resourceShareArn = resourceShareArn;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Name
     * (ARN)</a> of a resource share associated with this permission.
     * </p>
     * 
     * @return The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource
     *         Name (ARN)</a> of a resource share associated with this permission.
     */

    public String getResourceShareArn() {
        return this.resourceShareArn;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Name
     * (ARN)</a> of a resource share associated with this permission.
     * </p>
     * 
     * @param resourceShareArn
     *        The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource
     *        Name (ARN)</a> of a resource share associated with this permission.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociatedPermission withResourceShareArn(String resourceShareArn) {
        setResourceShareArn(resourceShareArn);
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
        if (getPermissionVersion() != null)
            sb.append("PermissionVersion: ").append(getPermissionVersion()).append(",");
        if (getDefaultVersion() != null)
            sb.append("DefaultVersion: ").append(getDefaultVersion()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getFeatureSet() != null)
            sb.append("FeatureSet: ").append(getFeatureSet()).append(",");
        if (getLastUpdatedTime() != null)
            sb.append("LastUpdatedTime: ").append(getLastUpdatedTime()).append(",");
        if (getResourceShareArn() != null)
            sb.append("ResourceShareArn: ").append(getResourceShareArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociatedPermission == false)
            return false;
        AssociatedPermission other = (AssociatedPermission) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getPermissionVersion() == null ^ this.getPermissionVersion() == null)
            return false;
        if (other.getPermissionVersion() != null && other.getPermissionVersion().equals(this.getPermissionVersion()) == false)
            return false;
        if (other.getDefaultVersion() == null ^ this.getDefaultVersion() == null)
            return false;
        if (other.getDefaultVersion() != null && other.getDefaultVersion().equals(this.getDefaultVersion()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getFeatureSet() == null ^ this.getFeatureSet() == null)
            return false;
        if (other.getFeatureSet() != null && other.getFeatureSet().equals(this.getFeatureSet()) == false)
            return false;
        if (other.getLastUpdatedTime() == null ^ this.getLastUpdatedTime() == null)
            return false;
        if (other.getLastUpdatedTime() != null && other.getLastUpdatedTime().equals(this.getLastUpdatedTime()) == false)
            return false;
        if (other.getResourceShareArn() == null ^ this.getResourceShareArn() == null)
            return false;
        if (other.getResourceShareArn() != null && other.getResourceShareArn().equals(this.getResourceShareArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getPermissionVersion() == null) ? 0 : getPermissionVersion().hashCode());
        hashCode = prime * hashCode + ((getDefaultVersion() == null) ? 0 : getDefaultVersion().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getFeatureSet() == null) ? 0 : getFeatureSet().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedTime() == null) ? 0 : getLastUpdatedTime().hashCode());
        hashCode = prime * hashCode + ((getResourceShareArn() == null) ? 0 : getResourceShareArn().hashCode());
        return hashCode;
    }

    @Override
    public AssociatedPermission clone() {
        try {
            return (AssociatedPermission) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ram.model.transform.AssociatedPermissionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
