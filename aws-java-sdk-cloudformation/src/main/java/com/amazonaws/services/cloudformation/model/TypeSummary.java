/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains summary information about the specified CloudFormation extension.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/TypeSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TypeSummary implements Serializable, Cloneable {

    /**
     * <p>
     * The kind of extension.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The name of the extension.
     * </p>
     * <p>
     * If you specified a <code>TypeNameAlias</code> when you <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_ActivateType.html">activate this
     * extension</a> in your account and region, CloudFormation considers that alias as the type name.
     * </p>
     */
    private String typeName;
    /**
     * <p>
     * The ID of the default version of the extension. The default version is used when the extension version is not
     * specified.
     * </p>
     * <p>
     * This applies only to private extensions you have registered in your account. For public extensions, both those
     * provided by Amazon and published by third parties, CloudFormation returns <code>null</code>. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_RegisterType.html">RegisterType</a>.
     * </p>
     * <p>
     * To set the default version of an extension, use <code> <a>SetTypeDefaultVersion</a> </code>.
     * </p>
     */
    private String defaultVersionId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the extension.
     * </p>
     */
    private String typeArn;
    /**
     * <p>
     * When the specified extension version was registered. This applies only to:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Private extensions you have registered in your account. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_RegisterType.html">RegisterType</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Public extensions you have activated in your account with auto-update specified. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_ActivateType.html">ActivateType</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For all other extension types, CloudFormation returns <code>null</code>.
     * </p>
     */
    private java.util.Date lastUpdated;
    /**
     * <p>
     * The description of the extension.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The ID of the extension publisher, if the extension is published by a third party. Extensions published by Amazon
     * do not return a publisher ID.
     * </p>
     */
    private String publisherId;
    /**
     * <p>
     * For public extensions that have been activated for this account and region, the type name of the public
     * extension.
     * </p>
     * <p>
     * If you specified a <code>TypeNameAlias</code> when enabling the extension in this account and region,
     * CloudFormation treats that alias as the extension's type name within the account and region, not the type name of
     * the public extension. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/registry-public.html#registry-public-enable-alias"
     * >Specifying aliases to refer to extensions</a> in the <i>CloudFormation User Guide</i>.
     * </p>
     */
    private String originalTypeName;
    /**
     * <p>
     * For public extensions that have been activated for this account and region, the version of the public extension
     * to be used for CloudFormation operations in this account and region.
     * </p>
     * <p>
     * How you specified <code>AutoUpdate</code> when enabling the extension affects whether CloudFormation
     * automatically updates the extention in this account and region when a new version is released. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/registry-public.html#registry-public-enable-auto"
     * >Setting CloudFormation to automatically use new versions of extensions</a> in the <i>CloudFormation User
     * Guide</i>.
     * </p>
     */
    private String publicVersionNumber;
    /**
     * <p>
     * For public extensions that have been activated for this account and region, the latest version of the public
     * extension <i>that is available</i>. For any extensions other than activated third-arty extensions, CloudFormation
     * returns <code>null</code>.
     * </p>
     * <p>
     * How you specified <code>AutoUpdate</code> when enabling the extension affects whether CloudFormation
     * automatically updates the extention in this account and region when a new version is released. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/registry-public.html#registry-public-enable-auto"
     * >Setting CloudFormation to automatically use new versions of extensions</a> in the <i>CloudFormation User
     * Guide</i>.
     * </p>
     */
    private String latestPublicVersion;
    /**
     * <p>
     * The service used to verify the publisher identity.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/publish-extension.html">Registering your
     * account to publish CloudFormation extensions</a> in the <i> CFN-CLI User Guide for Extension Development</i>.
     * </p>
     */
    private String publisherIdentity;
    /**
     * <p>
     * The publisher name, as defined in the public profile for that publisher in the service used to verify the
     * publisher identity.
     * </p>
     */
    private String publisherName;
    /**
     * <p>
     * Whether or not the extension is activated for this account and region.
     * </p>
     * <p>
     * This applies only to third-party public extensions. Extensions published by Amazon are activated by default.
     * </p>
     */
    private Boolean isActivated;

    /**
     * <p>
     * The kind of extension.
     * </p>
     * 
     * @param type
     *        The kind of extension.
     * @see RegistryType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The kind of extension.
     * </p>
     * 
     * @return The kind of extension.
     * @see RegistryType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The kind of extension.
     * </p>
     * 
     * @param type
     *        The kind of extension.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RegistryType
     */

    public TypeSummary withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The kind of extension.
     * </p>
     * 
     * @param type
     *        The kind of extension.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RegistryType
     */

    public TypeSummary withType(RegistryType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The name of the extension.
     * </p>
     * <p>
     * If you specified a <code>TypeNameAlias</code> when you <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_ActivateType.html">activate this
     * extension</a> in your account and region, CloudFormation considers that alias as the type name.
     * </p>
     * 
     * @param typeName
     *        The name of the extension.</p>
     *        <p>
     *        If you specified a <code>TypeNameAlias</code> when you <a
     *        href="https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_ActivateType.html">activate
     *        this extension</a> in your account and region, CloudFormation considers that alias as the type name.
     */

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    /**
     * <p>
     * The name of the extension.
     * </p>
     * <p>
     * If you specified a <code>TypeNameAlias</code> when you <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_ActivateType.html">activate this
     * extension</a> in your account and region, CloudFormation considers that alias as the type name.
     * </p>
     * 
     * @return The name of the extension.</p>
     *         <p>
     *         If you specified a <code>TypeNameAlias</code> when you <a
     *         href="https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_ActivateType.html">activate
     *         this extension</a> in your account and region, CloudFormation considers that alias as the type name.
     */

    public String getTypeName() {
        return this.typeName;
    }

    /**
     * <p>
     * The name of the extension.
     * </p>
     * <p>
     * If you specified a <code>TypeNameAlias</code> when you <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_ActivateType.html">activate this
     * extension</a> in your account and region, CloudFormation considers that alias as the type name.
     * </p>
     * 
     * @param typeName
     *        The name of the extension.</p>
     *        <p>
     *        If you specified a <code>TypeNameAlias</code> when you <a
     *        href="https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_ActivateType.html">activate
     *        this extension</a> in your account and region, CloudFormation considers that alias as the type name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TypeSummary withTypeName(String typeName) {
        setTypeName(typeName);
        return this;
    }

    /**
     * <p>
     * The ID of the default version of the extension. The default version is used when the extension version is not
     * specified.
     * </p>
     * <p>
     * This applies only to private extensions you have registered in your account. For public extensions, both those
     * provided by Amazon and published by third parties, CloudFormation returns <code>null</code>. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_RegisterType.html">RegisterType</a>.
     * </p>
     * <p>
     * To set the default version of an extension, use <code> <a>SetTypeDefaultVersion</a> </code>.
     * </p>
     * 
     * @param defaultVersionId
     *        The ID of the default version of the extension. The default version is used when the extension version is
     *        not specified.</p>
     *        <p>
     *        This applies only to private extensions you have registered in your account. For public extensions, both
     *        those provided by Amazon and published by third parties, CloudFormation returns <code>null</code>. For
     *        more information, see <a
     *        href="https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_RegisterType.html"
     *        >RegisterType</a>.
     *        </p>
     *        <p>
     *        To set the default version of an extension, use <code> <a>SetTypeDefaultVersion</a> </code>.
     */

    public void setDefaultVersionId(String defaultVersionId) {
        this.defaultVersionId = defaultVersionId;
    }

    /**
     * <p>
     * The ID of the default version of the extension. The default version is used when the extension version is not
     * specified.
     * </p>
     * <p>
     * This applies only to private extensions you have registered in your account. For public extensions, both those
     * provided by Amazon and published by third parties, CloudFormation returns <code>null</code>. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_RegisterType.html">RegisterType</a>.
     * </p>
     * <p>
     * To set the default version of an extension, use <code> <a>SetTypeDefaultVersion</a> </code>.
     * </p>
     * 
     * @return The ID of the default version of the extension. The default version is used when the extension version is
     *         not specified.</p>
     *         <p>
     *         This applies only to private extensions you have registered in your account. For public extensions, both
     *         those provided by Amazon and published by third parties, CloudFormation returns <code>null</code>. For
     *         more information, see <a
     *         href="https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_RegisterType.html"
     *         >RegisterType</a>.
     *         </p>
     *         <p>
     *         To set the default version of an extension, use <code> <a>SetTypeDefaultVersion</a> </code>.
     */

    public String getDefaultVersionId() {
        return this.defaultVersionId;
    }

    /**
     * <p>
     * The ID of the default version of the extension. The default version is used when the extension version is not
     * specified.
     * </p>
     * <p>
     * This applies only to private extensions you have registered in your account. For public extensions, both those
     * provided by Amazon and published by third parties, CloudFormation returns <code>null</code>. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_RegisterType.html">RegisterType</a>.
     * </p>
     * <p>
     * To set the default version of an extension, use <code> <a>SetTypeDefaultVersion</a> </code>.
     * </p>
     * 
     * @param defaultVersionId
     *        The ID of the default version of the extension. The default version is used when the extension version is
     *        not specified.</p>
     *        <p>
     *        This applies only to private extensions you have registered in your account. For public extensions, both
     *        those provided by Amazon and published by third parties, CloudFormation returns <code>null</code>. For
     *        more information, see <a
     *        href="https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_RegisterType.html"
     *        >RegisterType</a>.
     *        </p>
     *        <p>
     *        To set the default version of an extension, use <code> <a>SetTypeDefaultVersion</a> </code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TypeSummary withDefaultVersionId(String defaultVersionId) {
        setDefaultVersionId(defaultVersionId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the extension.
     * </p>
     * 
     * @param typeArn
     *        The Amazon Resource Name (ARN) of the extension.
     */

    public void setTypeArn(String typeArn) {
        this.typeArn = typeArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the extension.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the extension.
     */

    public String getTypeArn() {
        return this.typeArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the extension.
     * </p>
     * 
     * @param typeArn
     *        The Amazon Resource Name (ARN) of the extension.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TypeSummary withTypeArn(String typeArn) {
        setTypeArn(typeArn);
        return this;
    }

    /**
     * <p>
     * When the specified extension version was registered. This applies only to:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Private extensions you have registered in your account. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_RegisterType.html">RegisterType</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Public extensions you have activated in your account with auto-update specified. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_ActivateType.html">ActivateType</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For all other extension types, CloudFormation returns <code>null</code>.
     * </p>
     * 
     * @param lastUpdated
     *        When the specified extension version was registered. This applies only to:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Private extensions you have registered in your account. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_RegisterType.html"
     *        >RegisterType</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Public extensions you have activated in your account with auto-update specified. For more information, see
     *        <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_ActivateType.html">
     *        ActivateType</a>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For all other extension types, CloudFormation returns <code>null</code>.
     */

    public void setLastUpdated(java.util.Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    /**
     * <p>
     * When the specified extension version was registered. This applies only to:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Private extensions you have registered in your account. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_RegisterType.html">RegisterType</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Public extensions you have activated in your account with auto-update specified. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_ActivateType.html">ActivateType</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For all other extension types, CloudFormation returns <code>null</code>.
     * </p>
     * 
     * @return When the specified extension version was registered. This applies only to:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Private extensions you have registered in your account. For more information, see <a
     *         href="https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_RegisterType.html"
     *         >RegisterType</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Public extensions you have activated in your account with auto-update specified. For more information,
     *         see <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_ActivateType.html">
     *         ActivateType</a>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For all other extension types, CloudFormation returns <code>null</code>.
     */

    public java.util.Date getLastUpdated() {
        return this.lastUpdated;
    }

    /**
     * <p>
     * When the specified extension version was registered. This applies only to:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Private extensions you have registered in your account. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_RegisterType.html">RegisterType</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Public extensions you have activated in your account with auto-update specified. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_ActivateType.html">ActivateType</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For all other extension types, CloudFormation returns <code>null</code>.
     * </p>
     * 
     * @param lastUpdated
     *        When the specified extension version was registered. This applies only to:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Private extensions you have registered in your account. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_RegisterType.html"
     *        >RegisterType</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Public extensions you have activated in your account with auto-update specified. For more information, see
     *        <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_ActivateType.html">
     *        ActivateType</a>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For all other extension types, CloudFormation returns <code>null</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TypeSummary withLastUpdated(java.util.Date lastUpdated) {
        setLastUpdated(lastUpdated);
        return this;
    }

    /**
     * <p>
     * The description of the extension.
     * </p>
     * 
     * @param description
     *        The description of the extension.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the extension.
     * </p>
     * 
     * @return The description of the extension.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the extension.
     * </p>
     * 
     * @param description
     *        The description of the extension.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TypeSummary withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The ID of the extension publisher, if the extension is published by a third party. Extensions published by Amazon
     * do not return a publisher ID.
     * </p>
     * 
     * @param publisherId
     *        The ID of the extension publisher, if the extension is published by a third party. Extensions published by
     *        Amazon do not return a publisher ID.
     */

    public void setPublisherId(String publisherId) {
        this.publisherId = publisherId;
    }

    /**
     * <p>
     * The ID of the extension publisher, if the extension is published by a third party. Extensions published by Amazon
     * do not return a publisher ID.
     * </p>
     * 
     * @return The ID of the extension publisher, if the extension is published by a third party. Extensions published
     *         by Amazon do not return a publisher ID.
     */

    public String getPublisherId() {
        return this.publisherId;
    }

    /**
     * <p>
     * The ID of the extension publisher, if the extension is published by a third party. Extensions published by Amazon
     * do not return a publisher ID.
     * </p>
     * 
     * @param publisherId
     *        The ID of the extension publisher, if the extension is published by a third party. Extensions published by
     *        Amazon do not return a publisher ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TypeSummary withPublisherId(String publisherId) {
        setPublisherId(publisherId);
        return this;
    }

    /**
     * <p>
     * For public extensions that have been activated for this account and region, the type name of the public
     * extension.
     * </p>
     * <p>
     * If you specified a <code>TypeNameAlias</code> when enabling the extension in this account and region,
     * CloudFormation treats that alias as the extension's type name within the account and region, not the type name of
     * the public extension. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/registry-public.html#registry-public-enable-alias"
     * >Specifying aliases to refer to extensions</a> in the <i>CloudFormation User Guide</i>.
     * </p>
     * 
     * @param originalTypeName
     *        For public extensions that have been activated for this account and region, the type name of the public
     *        extension.</p>
     *        <p>
     *        If you specified a <code>TypeNameAlias</code> when enabling the extension in this account and region,
     *        CloudFormation treats that alias as the extension's type name within the account and region, not the type
     *        name of the public extension. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/registry-public.html#registry-public-enable-alias"
     *        >Specifying aliases to refer to extensions</a> in the <i>CloudFormation User Guide</i>.
     */

    public void setOriginalTypeName(String originalTypeName) {
        this.originalTypeName = originalTypeName;
    }

    /**
     * <p>
     * For public extensions that have been activated for this account and region, the type name of the public
     * extension.
     * </p>
     * <p>
     * If you specified a <code>TypeNameAlias</code> when enabling the extension in this account and region,
     * CloudFormation treats that alias as the extension's type name within the account and region, not the type name of
     * the public extension. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/registry-public.html#registry-public-enable-alias"
     * >Specifying aliases to refer to extensions</a> in the <i>CloudFormation User Guide</i>.
     * </p>
     * 
     * @return For public extensions that have been activated for this account and region, the type name of the public
     *         extension.</p>
     *         <p>
     *         If you specified a <code>TypeNameAlias</code> when enabling the extension in this account and region,
     *         CloudFormation treats that alias as the extension's type name within the account and region, not the type
     *         name of the public extension. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/registry-public.html#registry-public-enable-alias"
     *         >Specifying aliases to refer to extensions</a> in the <i>CloudFormation User Guide</i>.
     */

    public String getOriginalTypeName() {
        return this.originalTypeName;
    }

    /**
     * <p>
     * For public extensions that have been activated for this account and region, the type name of the public
     * extension.
     * </p>
     * <p>
     * If you specified a <code>TypeNameAlias</code> when enabling the extension in this account and region,
     * CloudFormation treats that alias as the extension's type name within the account and region, not the type name of
     * the public extension. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/registry-public.html#registry-public-enable-alias"
     * >Specifying aliases to refer to extensions</a> in the <i>CloudFormation User Guide</i>.
     * </p>
     * 
     * @param originalTypeName
     *        For public extensions that have been activated for this account and region, the type name of the public
     *        extension.</p>
     *        <p>
     *        If you specified a <code>TypeNameAlias</code> when enabling the extension in this account and region,
     *        CloudFormation treats that alias as the extension's type name within the account and region, not the type
     *        name of the public extension. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/registry-public.html#registry-public-enable-alias"
     *        >Specifying aliases to refer to extensions</a> in the <i>CloudFormation User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TypeSummary withOriginalTypeName(String originalTypeName) {
        setOriginalTypeName(originalTypeName);
        return this;
    }

    /**
     * <p>
     * For public extensions that have been activated for this account and region, the version of the public extension
     * to be used for CloudFormation operations in this account and region.
     * </p>
     * <p>
     * How you specified <code>AutoUpdate</code> when enabling the extension affects whether CloudFormation
     * automatically updates the extention in this account and region when a new version is released. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/registry-public.html#registry-public-enable-auto"
     * >Setting CloudFormation to automatically use new versions of extensions</a> in the <i>CloudFormation User
     * Guide</i>.
     * </p>
     * 
     * @param publicVersionNumber
     *        For public extensions that have been activated for this account and region, the version of the public
     *        extension to be used for CloudFormation operations in this account and region.</p>
     *        <p>
     *        How you specified <code>AutoUpdate</code> when enabling the extension affects whether CloudFormation
     *        automatically updates the extention in this account and region when a new version is released. For more
     *        information, see <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/registry-public.html#registry-public-enable-auto"
     *        >Setting CloudFormation to automatically use new versions of extensions</a> in the <i>CloudFormation User
     *        Guide</i>.
     */

    public void setPublicVersionNumber(String publicVersionNumber) {
        this.publicVersionNumber = publicVersionNumber;
    }

    /**
     * <p>
     * For public extensions that have been activated for this account and region, the version of the public extension
     * to be used for CloudFormation operations in this account and region.
     * </p>
     * <p>
     * How you specified <code>AutoUpdate</code> when enabling the extension affects whether CloudFormation
     * automatically updates the extention in this account and region when a new version is released. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/registry-public.html#registry-public-enable-auto"
     * >Setting CloudFormation to automatically use new versions of extensions</a> in the <i>CloudFormation User
     * Guide</i>.
     * </p>
     * 
     * @return For public extensions that have been activated for this account and region, the version of the public
     *         extension to be used for CloudFormation operations in this account and region.</p>
     *         <p>
     *         How you specified <code>AutoUpdate</code> when enabling the extension affects whether CloudFormation
     *         automatically updates the extention in this account and region when a new version is released. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/registry-public.html#registry-public-enable-auto"
     *         >Setting CloudFormation to automatically use new versions of extensions</a> in the <i>CloudFormation User
     *         Guide</i>.
     */

    public String getPublicVersionNumber() {
        return this.publicVersionNumber;
    }

    /**
     * <p>
     * For public extensions that have been activated for this account and region, the version of the public extension
     * to be used for CloudFormation operations in this account and region.
     * </p>
     * <p>
     * How you specified <code>AutoUpdate</code> when enabling the extension affects whether CloudFormation
     * automatically updates the extention in this account and region when a new version is released. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/registry-public.html#registry-public-enable-auto"
     * >Setting CloudFormation to automatically use new versions of extensions</a> in the <i>CloudFormation User
     * Guide</i>.
     * </p>
     * 
     * @param publicVersionNumber
     *        For public extensions that have been activated for this account and region, the version of the public
     *        extension to be used for CloudFormation operations in this account and region.</p>
     *        <p>
     *        How you specified <code>AutoUpdate</code> when enabling the extension affects whether CloudFormation
     *        automatically updates the extention in this account and region when a new version is released. For more
     *        information, see <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/registry-public.html#registry-public-enable-auto"
     *        >Setting CloudFormation to automatically use new versions of extensions</a> in the <i>CloudFormation User
     *        Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TypeSummary withPublicVersionNumber(String publicVersionNumber) {
        setPublicVersionNumber(publicVersionNumber);
        return this;
    }

    /**
     * <p>
     * For public extensions that have been activated for this account and region, the latest version of the public
     * extension <i>that is available</i>. For any extensions other than activated third-arty extensions, CloudFormation
     * returns <code>null</code>.
     * </p>
     * <p>
     * How you specified <code>AutoUpdate</code> when enabling the extension affects whether CloudFormation
     * automatically updates the extention in this account and region when a new version is released. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/registry-public.html#registry-public-enable-auto"
     * >Setting CloudFormation to automatically use new versions of extensions</a> in the <i>CloudFormation User
     * Guide</i>.
     * </p>
     * 
     * @param latestPublicVersion
     *        For public extensions that have been activated for this account and region, the latest version of the
     *        public extension <i>that is available</i>. For any extensions other than activated third-arty extensions,
     *        CloudFormation returns <code>null</code>.</p>
     *        <p>
     *        How you specified <code>AutoUpdate</code> when enabling the extension affects whether CloudFormation
     *        automatically updates the extention in this account and region when a new version is released. For more
     *        information, see <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/registry-public.html#registry-public-enable-auto"
     *        >Setting CloudFormation to automatically use new versions of extensions</a> in the <i>CloudFormation User
     *        Guide</i>.
     */

    public void setLatestPublicVersion(String latestPublicVersion) {
        this.latestPublicVersion = latestPublicVersion;
    }

    /**
     * <p>
     * For public extensions that have been activated for this account and region, the latest version of the public
     * extension <i>that is available</i>. For any extensions other than activated third-arty extensions, CloudFormation
     * returns <code>null</code>.
     * </p>
     * <p>
     * How you specified <code>AutoUpdate</code> when enabling the extension affects whether CloudFormation
     * automatically updates the extention in this account and region when a new version is released. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/registry-public.html#registry-public-enable-auto"
     * >Setting CloudFormation to automatically use new versions of extensions</a> in the <i>CloudFormation User
     * Guide</i>.
     * </p>
     * 
     * @return For public extensions that have been activated for this account and region, the latest version of the
     *         public extension <i>that is available</i>. For any extensions other than activated third-arty extensions,
     *         CloudFormation returns <code>null</code>.</p>
     *         <p>
     *         How you specified <code>AutoUpdate</code> when enabling the extension affects whether CloudFormation
     *         automatically updates the extention in this account and region when a new version is released. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/registry-public.html#registry-public-enable-auto"
     *         >Setting CloudFormation to automatically use new versions of extensions</a> in the <i>CloudFormation User
     *         Guide</i>.
     */

    public String getLatestPublicVersion() {
        return this.latestPublicVersion;
    }

    /**
     * <p>
     * For public extensions that have been activated for this account and region, the latest version of the public
     * extension <i>that is available</i>. For any extensions other than activated third-arty extensions, CloudFormation
     * returns <code>null</code>.
     * </p>
     * <p>
     * How you specified <code>AutoUpdate</code> when enabling the extension affects whether CloudFormation
     * automatically updates the extention in this account and region when a new version is released. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/registry-public.html#registry-public-enable-auto"
     * >Setting CloudFormation to automatically use new versions of extensions</a> in the <i>CloudFormation User
     * Guide</i>.
     * </p>
     * 
     * @param latestPublicVersion
     *        For public extensions that have been activated for this account and region, the latest version of the
     *        public extension <i>that is available</i>. For any extensions other than activated third-arty extensions,
     *        CloudFormation returns <code>null</code>.</p>
     *        <p>
     *        How you specified <code>AutoUpdate</code> when enabling the extension affects whether CloudFormation
     *        automatically updates the extention in this account and region when a new version is released. For more
     *        information, see <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/registry-public.html#registry-public-enable-auto"
     *        >Setting CloudFormation to automatically use new versions of extensions</a> in the <i>CloudFormation User
     *        Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TypeSummary withLatestPublicVersion(String latestPublicVersion) {
        setLatestPublicVersion(latestPublicVersion);
        return this;
    }

    /**
     * <p>
     * The service used to verify the publisher identity.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/publish-extension.html">Registering your
     * account to publish CloudFormation extensions</a> in the <i> CFN-CLI User Guide for Extension Development</i>.
     * </p>
     * 
     * @param publisherIdentity
     *        The service used to verify the publisher identity.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/publish-extension.html">Registering
     *        your account to publish CloudFormation extensions</a> in the <i> CFN-CLI User Guide for Extension
     *        Development</i>.
     * @see IdentityProvider
     */

    public void setPublisherIdentity(String publisherIdentity) {
        this.publisherIdentity = publisherIdentity;
    }

    /**
     * <p>
     * The service used to verify the publisher identity.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/publish-extension.html">Registering your
     * account to publish CloudFormation extensions</a> in the <i> CFN-CLI User Guide for Extension Development</i>.
     * </p>
     * 
     * @return The service used to verify the publisher identity.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/publish-extension.html">Registering
     *         your account to publish CloudFormation extensions</a> in the <i> CFN-CLI User Guide for Extension
     *         Development</i>.
     * @see IdentityProvider
     */

    public String getPublisherIdentity() {
        return this.publisherIdentity;
    }

    /**
     * <p>
     * The service used to verify the publisher identity.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/publish-extension.html">Registering your
     * account to publish CloudFormation extensions</a> in the <i> CFN-CLI User Guide for Extension Development</i>.
     * </p>
     * 
     * @param publisherIdentity
     *        The service used to verify the publisher identity.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/publish-extension.html">Registering
     *        your account to publish CloudFormation extensions</a> in the <i> CFN-CLI User Guide for Extension
     *        Development</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IdentityProvider
     */

    public TypeSummary withPublisherIdentity(String publisherIdentity) {
        setPublisherIdentity(publisherIdentity);
        return this;
    }

    /**
     * <p>
     * The service used to verify the publisher identity.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/publish-extension.html">Registering your
     * account to publish CloudFormation extensions</a> in the <i> CFN-CLI User Guide for Extension Development</i>.
     * </p>
     * 
     * @param publisherIdentity
     *        The service used to verify the publisher identity.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/publish-extension.html">Registering
     *        your account to publish CloudFormation extensions</a> in the <i> CFN-CLI User Guide for Extension
     *        Development</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IdentityProvider
     */

    public TypeSummary withPublisherIdentity(IdentityProvider publisherIdentity) {
        this.publisherIdentity = publisherIdentity.toString();
        return this;
    }

    /**
     * <p>
     * The publisher name, as defined in the public profile for that publisher in the service used to verify the
     * publisher identity.
     * </p>
     * 
     * @param publisherName
     *        The publisher name, as defined in the public profile for that publisher in the service used to verify the
     *        publisher identity.
     */

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    /**
     * <p>
     * The publisher name, as defined in the public profile for that publisher in the service used to verify the
     * publisher identity.
     * </p>
     * 
     * @return The publisher name, as defined in the public profile for that publisher in the service used to verify the
     *         publisher identity.
     */

    public String getPublisherName() {
        return this.publisherName;
    }

    /**
     * <p>
     * The publisher name, as defined in the public profile for that publisher in the service used to verify the
     * publisher identity.
     * </p>
     * 
     * @param publisherName
     *        The publisher name, as defined in the public profile for that publisher in the service used to verify the
     *        publisher identity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TypeSummary withPublisherName(String publisherName) {
        setPublisherName(publisherName);
        return this;
    }

    /**
     * <p>
     * Whether or not the extension is activated for this account and region.
     * </p>
     * <p>
     * This applies only to third-party public extensions. Extensions published by Amazon are activated by default.
     * </p>
     * 
     * @param isActivated
     *        Whether or not the extension is activated for this account and region. </p>
     *        <p>
     *        This applies only to third-party public extensions. Extensions published by Amazon are activated by
     *        default.
     */

    public void setIsActivated(Boolean isActivated) {
        this.isActivated = isActivated;
    }

    /**
     * <p>
     * Whether or not the extension is activated for this account and region.
     * </p>
     * <p>
     * This applies only to third-party public extensions. Extensions published by Amazon are activated by default.
     * </p>
     * 
     * @return Whether or not the extension is activated for this account and region. </p>
     *         <p>
     *         This applies only to third-party public extensions. Extensions published by Amazon are activated by
     *         default.
     */

    public Boolean getIsActivated() {
        return this.isActivated;
    }

    /**
     * <p>
     * Whether or not the extension is activated for this account and region.
     * </p>
     * <p>
     * This applies only to third-party public extensions. Extensions published by Amazon are activated by default.
     * </p>
     * 
     * @param isActivated
     *        Whether or not the extension is activated for this account and region. </p>
     *        <p>
     *        This applies only to third-party public extensions. Extensions published by Amazon are activated by
     *        default.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TypeSummary withIsActivated(Boolean isActivated) {
        setIsActivated(isActivated);
        return this;
    }

    /**
     * <p>
     * Whether or not the extension is activated for this account and region.
     * </p>
     * <p>
     * This applies only to third-party public extensions. Extensions published by Amazon are activated by default.
     * </p>
     * 
     * @return Whether or not the extension is activated for this account and region. </p>
     *         <p>
     *         This applies only to third-party public extensions. Extensions published by Amazon are activated by
     *         default.
     */

    public Boolean isActivated() {
        return this.isActivated;
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getTypeName() != null)
            sb.append("TypeName: ").append(getTypeName()).append(",");
        if (getDefaultVersionId() != null)
            sb.append("DefaultVersionId: ").append(getDefaultVersionId()).append(",");
        if (getTypeArn() != null)
            sb.append("TypeArn: ").append(getTypeArn()).append(",");
        if (getLastUpdated() != null)
            sb.append("LastUpdated: ").append(getLastUpdated()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getPublisherId() != null)
            sb.append("PublisherId: ").append(getPublisherId()).append(",");
        if (getOriginalTypeName() != null)
            sb.append("OriginalTypeName: ").append(getOriginalTypeName()).append(",");
        if (getPublicVersionNumber() != null)
            sb.append("PublicVersionNumber: ").append(getPublicVersionNumber()).append(",");
        if (getLatestPublicVersion() != null)
            sb.append("LatestPublicVersion: ").append(getLatestPublicVersion()).append(",");
        if (getPublisherIdentity() != null)
            sb.append("PublisherIdentity: ").append(getPublisherIdentity()).append(",");
        if (getPublisherName() != null)
            sb.append("PublisherName: ").append(getPublisherName()).append(",");
        if (getIsActivated() != null)
            sb.append("IsActivated: ").append(getIsActivated());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TypeSummary == false)
            return false;
        TypeSummary other = (TypeSummary) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getTypeName() == null ^ this.getTypeName() == null)
            return false;
        if (other.getTypeName() != null && other.getTypeName().equals(this.getTypeName()) == false)
            return false;
        if (other.getDefaultVersionId() == null ^ this.getDefaultVersionId() == null)
            return false;
        if (other.getDefaultVersionId() != null && other.getDefaultVersionId().equals(this.getDefaultVersionId()) == false)
            return false;
        if (other.getTypeArn() == null ^ this.getTypeArn() == null)
            return false;
        if (other.getTypeArn() != null && other.getTypeArn().equals(this.getTypeArn()) == false)
            return false;
        if (other.getLastUpdated() == null ^ this.getLastUpdated() == null)
            return false;
        if (other.getLastUpdated() != null && other.getLastUpdated().equals(this.getLastUpdated()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getPublisherId() == null ^ this.getPublisherId() == null)
            return false;
        if (other.getPublisherId() != null && other.getPublisherId().equals(this.getPublisherId()) == false)
            return false;
        if (other.getOriginalTypeName() == null ^ this.getOriginalTypeName() == null)
            return false;
        if (other.getOriginalTypeName() != null && other.getOriginalTypeName().equals(this.getOriginalTypeName()) == false)
            return false;
        if (other.getPublicVersionNumber() == null ^ this.getPublicVersionNumber() == null)
            return false;
        if (other.getPublicVersionNumber() != null && other.getPublicVersionNumber().equals(this.getPublicVersionNumber()) == false)
            return false;
        if (other.getLatestPublicVersion() == null ^ this.getLatestPublicVersion() == null)
            return false;
        if (other.getLatestPublicVersion() != null && other.getLatestPublicVersion().equals(this.getLatestPublicVersion()) == false)
            return false;
        if (other.getPublisherIdentity() == null ^ this.getPublisherIdentity() == null)
            return false;
        if (other.getPublisherIdentity() != null && other.getPublisherIdentity().equals(this.getPublisherIdentity()) == false)
            return false;
        if (other.getPublisherName() == null ^ this.getPublisherName() == null)
            return false;
        if (other.getPublisherName() != null && other.getPublisherName().equals(this.getPublisherName()) == false)
            return false;
        if (other.getIsActivated() == null ^ this.getIsActivated() == null)
            return false;
        if (other.getIsActivated() != null && other.getIsActivated().equals(this.getIsActivated()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getTypeName() == null) ? 0 : getTypeName().hashCode());
        hashCode = prime * hashCode + ((getDefaultVersionId() == null) ? 0 : getDefaultVersionId().hashCode());
        hashCode = prime * hashCode + ((getTypeArn() == null) ? 0 : getTypeArn().hashCode());
        hashCode = prime * hashCode + ((getLastUpdated() == null) ? 0 : getLastUpdated().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getPublisherId() == null) ? 0 : getPublisherId().hashCode());
        hashCode = prime * hashCode + ((getOriginalTypeName() == null) ? 0 : getOriginalTypeName().hashCode());
        hashCode = prime * hashCode + ((getPublicVersionNumber() == null) ? 0 : getPublicVersionNumber().hashCode());
        hashCode = prime * hashCode + ((getLatestPublicVersion() == null) ? 0 : getLatestPublicVersion().hashCode());
        hashCode = prime * hashCode + ((getPublisherIdentity() == null) ? 0 : getPublisherIdentity().hashCode());
        hashCode = prime * hashCode + ((getPublisherName() == null) ? 0 : getPublisherName().hashCode());
        hashCode = prime * hashCode + ((getIsActivated() == null) ? 0 : getIsActivated().hashCode());
        return hashCode;
    }

    @Override
    public TypeSummary clone() {
        try {
            return (TypeSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
