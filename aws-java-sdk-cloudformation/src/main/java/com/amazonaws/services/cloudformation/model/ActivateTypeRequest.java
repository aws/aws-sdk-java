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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/ActivateType" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ActivateTypeRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The extension type.
     * </p>
     * <p>
     * Conditional: You must specify <code>PublicTypeArn</code>, or <code>TypeName</code>, <code>Type</code>, and
     * <code>PublisherId</code>.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The Amazon Resource Number (ARN) of the public extension.
     * </p>
     * <p>
     * Conditional: You must specify <code>PublicTypeArn</code>, or <code>TypeName</code>, <code>Type</code>, and
     * <code>PublisherId</code>.
     * </p>
     */
    private String publicTypeArn;
    /**
     * <p>
     * The ID of the extension publisher.
     * </p>
     * <p>
     * Conditional: You must specify <code>PublicTypeArn</code>, or <code>TypeName</code>, <code>Type</code>, and
     * <code>PublisherId</code>.
     * </p>
     */
    private String publisherId;
    /**
     * <p>
     * The name of the extension.
     * </p>
     * <p>
     * Conditional: You must specify <code>PublicTypeArn</code>, or <code>TypeName</code>, <code>Type</code>, and
     * <code>PublisherId</code>.
     * </p>
     */
    private String typeName;
    /**
     * <p>
     * An alias to assign to the public extension, in this account and region. If you specify an alias for the
     * extension, CloudFormation treats the alias as the extension type name within this account and region. You must
     * use the alias to refer to the extension in your templates, API calls, and CloudFormation console.
     * </p>
     * <p>
     * An extension alias must be unique within a given account and region. You can activate the same public resource
     * multiple times in the same account and region, using different type name aliases.
     * </p>
     */
    private String typeNameAlias;
    /**
     * <p>
     * Whether to automatically update the extension in this account and region when a new <i>minor</i> version is
     * published by the extension publisher. Major versions released by the publisher must be manually updated.
     * </p>
     * <p>
     * The default is <code>true</code>.
     * </p>
     */
    private Boolean autoUpdate;

    private LoggingConfig loggingConfig;
    /**
     * <p>
     * The name of the IAM execution role to use to activate the extension.
     * </p>
     */
    private String executionRoleArn;
    /**
     * <p>
     * Manually updates a previously-activated type to a new major or minor version, if available. You can also use this
     * parameter to update the value of <code>AutoUpdate</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>MAJOR</code>: CloudFormation updates the extension to the newest major version, if one is available.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MINOR</code>: CloudFormation updates the extension to the newest minor version, if one is available.
     * </p>
     * </li>
     * </ul>
     */
    private String versionBump;
    /**
     * <p>
     * The major version of this extension you want to activate, if multiple major versions are available. The default
     * is the latest major version. CloudFormation uses the latest available <i>minor</i> version of the major version
     * selected.
     * </p>
     * <p>
     * You can specify <code>MajorVersion</code> or <code>VersionBump</code>, but not both.
     * </p>
     */
    private Long majorVersion;

    /**
     * <p>
     * The extension type.
     * </p>
     * <p>
     * Conditional: You must specify <code>PublicTypeArn</code>, or <code>TypeName</code>, <code>Type</code>, and
     * <code>PublisherId</code>.
     * </p>
     * 
     * @param type
     *        The extension type.</p>
     *        <p>
     *        Conditional: You must specify <code>PublicTypeArn</code>, or <code>TypeName</code>, <code>Type</code>, and
     *        <code>PublisherId</code>.
     * @see ThirdPartyType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The extension type.
     * </p>
     * <p>
     * Conditional: You must specify <code>PublicTypeArn</code>, or <code>TypeName</code>, <code>Type</code>, and
     * <code>PublisherId</code>.
     * </p>
     * 
     * @return The extension type.</p>
     *         <p>
     *         Conditional: You must specify <code>PublicTypeArn</code>, or <code>TypeName</code>, <code>Type</code>,
     *         and <code>PublisherId</code>.
     * @see ThirdPartyType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The extension type.
     * </p>
     * <p>
     * Conditional: You must specify <code>PublicTypeArn</code>, or <code>TypeName</code>, <code>Type</code>, and
     * <code>PublisherId</code>.
     * </p>
     * 
     * @param type
     *        The extension type.</p>
     *        <p>
     *        Conditional: You must specify <code>PublicTypeArn</code>, or <code>TypeName</code>, <code>Type</code>, and
     *        <code>PublisherId</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ThirdPartyType
     */

    public ActivateTypeRequest withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The extension type.
     * </p>
     * <p>
     * Conditional: You must specify <code>PublicTypeArn</code>, or <code>TypeName</code>, <code>Type</code>, and
     * <code>PublisherId</code>.
     * </p>
     * 
     * @param type
     *        The extension type.</p>
     *        <p>
     *        Conditional: You must specify <code>PublicTypeArn</code>, or <code>TypeName</code>, <code>Type</code>, and
     *        <code>PublisherId</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ThirdPartyType
     */

    public ActivateTypeRequest withType(ThirdPartyType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the public extension.
     * </p>
     * <p>
     * Conditional: You must specify <code>PublicTypeArn</code>, or <code>TypeName</code>, <code>Type</code>, and
     * <code>PublisherId</code>.
     * </p>
     * 
     * @param publicTypeArn
     *        The Amazon Resource Number (ARN) of the public extension.</p>
     *        <p>
     *        Conditional: You must specify <code>PublicTypeArn</code>, or <code>TypeName</code>, <code>Type</code>, and
     *        <code>PublisherId</code>.
     */

    public void setPublicTypeArn(String publicTypeArn) {
        this.publicTypeArn = publicTypeArn;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the public extension.
     * </p>
     * <p>
     * Conditional: You must specify <code>PublicTypeArn</code>, or <code>TypeName</code>, <code>Type</code>, and
     * <code>PublisherId</code>.
     * </p>
     * 
     * @return The Amazon Resource Number (ARN) of the public extension.</p>
     *         <p>
     *         Conditional: You must specify <code>PublicTypeArn</code>, or <code>TypeName</code>, <code>Type</code>,
     *         and <code>PublisherId</code>.
     */

    public String getPublicTypeArn() {
        return this.publicTypeArn;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the public extension.
     * </p>
     * <p>
     * Conditional: You must specify <code>PublicTypeArn</code>, or <code>TypeName</code>, <code>Type</code>, and
     * <code>PublisherId</code>.
     * </p>
     * 
     * @param publicTypeArn
     *        The Amazon Resource Number (ARN) of the public extension.</p>
     *        <p>
     *        Conditional: You must specify <code>PublicTypeArn</code>, or <code>TypeName</code>, <code>Type</code>, and
     *        <code>PublisherId</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActivateTypeRequest withPublicTypeArn(String publicTypeArn) {
        setPublicTypeArn(publicTypeArn);
        return this;
    }

    /**
     * <p>
     * The ID of the extension publisher.
     * </p>
     * <p>
     * Conditional: You must specify <code>PublicTypeArn</code>, or <code>TypeName</code>, <code>Type</code>, and
     * <code>PublisherId</code>.
     * </p>
     * 
     * @param publisherId
     *        The ID of the extension publisher.</p>
     *        <p>
     *        Conditional: You must specify <code>PublicTypeArn</code>, or <code>TypeName</code>, <code>Type</code>, and
     *        <code>PublisherId</code>.
     */

    public void setPublisherId(String publisherId) {
        this.publisherId = publisherId;
    }

    /**
     * <p>
     * The ID of the extension publisher.
     * </p>
     * <p>
     * Conditional: You must specify <code>PublicTypeArn</code>, or <code>TypeName</code>, <code>Type</code>, and
     * <code>PublisherId</code>.
     * </p>
     * 
     * @return The ID of the extension publisher.</p>
     *         <p>
     *         Conditional: You must specify <code>PublicTypeArn</code>, or <code>TypeName</code>, <code>Type</code>,
     *         and <code>PublisherId</code>.
     */

    public String getPublisherId() {
        return this.publisherId;
    }

    /**
     * <p>
     * The ID of the extension publisher.
     * </p>
     * <p>
     * Conditional: You must specify <code>PublicTypeArn</code>, or <code>TypeName</code>, <code>Type</code>, and
     * <code>PublisherId</code>.
     * </p>
     * 
     * @param publisherId
     *        The ID of the extension publisher.</p>
     *        <p>
     *        Conditional: You must specify <code>PublicTypeArn</code>, or <code>TypeName</code>, <code>Type</code>, and
     *        <code>PublisherId</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActivateTypeRequest withPublisherId(String publisherId) {
        setPublisherId(publisherId);
        return this;
    }

    /**
     * <p>
     * The name of the extension.
     * </p>
     * <p>
     * Conditional: You must specify <code>PublicTypeArn</code>, or <code>TypeName</code>, <code>Type</code>, and
     * <code>PublisherId</code>.
     * </p>
     * 
     * @param typeName
     *        The name of the extension.</p>
     *        <p>
     *        Conditional: You must specify <code>PublicTypeArn</code>, or <code>TypeName</code>, <code>Type</code>, and
     *        <code>PublisherId</code>.
     */

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    /**
     * <p>
     * The name of the extension.
     * </p>
     * <p>
     * Conditional: You must specify <code>PublicTypeArn</code>, or <code>TypeName</code>, <code>Type</code>, and
     * <code>PublisherId</code>.
     * </p>
     * 
     * @return The name of the extension.</p>
     *         <p>
     *         Conditional: You must specify <code>PublicTypeArn</code>, or <code>TypeName</code>, <code>Type</code>,
     *         and <code>PublisherId</code>.
     */

    public String getTypeName() {
        return this.typeName;
    }

    /**
     * <p>
     * The name of the extension.
     * </p>
     * <p>
     * Conditional: You must specify <code>PublicTypeArn</code>, or <code>TypeName</code>, <code>Type</code>, and
     * <code>PublisherId</code>.
     * </p>
     * 
     * @param typeName
     *        The name of the extension.</p>
     *        <p>
     *        Conditional: You must specify <code>PublicTypeArn</code>, or <code>TypeName</code>, <code>Type</code>, and
     *        <code>PublisherId</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActivateTypeRequest withTypeName(String typeName) {
        setTypeName(typeName);
        return this;
    }

    /**
     * <p>
     * An alias to assign to the public extension, in this account and region. If you specify an alias for the
     * extension, CloudFormation treats the alias as the extension type name within this account and region. You must
     * use the alias to refer to the extension in your templates, API calls, and CloudFormation console.
     * </p>
     * <p>
     * An extension alias must be unique within a given account and region. You can activate the same public resource
     * multiple times in the same account and region, using different type name aliases.
     * </p>
     * 
     * @param typeNameAlias
     *        An alias to assign to the public extension, in this account and region. If you specify an alias for the
     *        extension, CloudFormation treats the alias as the extension type name within this account and region. You
     *        must use the alias to refer to the extension in your templates, API calls, and CloudFormation console.</p>
     *        <p>
     *        An extension alias must be unique within a given account and region. You can activate the same public
     *        resource multiple times in the same account and region, using different type name aliases.
     */

    public void setTypeNameAlias(String typeNameAlias) {
        this.typeNameAlias = typeNameAlias;
    }

    /**
     * <p>
     * An alias to assign to the public extension, in this account and region. If you specify an alias for the
     * extension, CloudFormation treats the alias as the extension type name within this account and region. You must
     * use the alias to refer to the extension in your templates, API calls, and CloudFormation console.
     * </p>
     * <p>
     * An extension alias must be unique within a given account and region. You can activate the same public resource
     * multiple times in the same account and region, using different type name aliases.
     * </p>
     * 
     * @return An alias to assign to the public extension, in this account and region. If you specify an alias for the
     *         extension, CloudFormation treats the alias as the extension type name within this account and region. You
     *         must use the alias to refer to the extension in your templates, API calls, and CloudFormation
     *         console.</p>
     *         <p>
     *         An extension alias must be unique within a given account and region. You can activate the same public
     *         resource multiple times in the same account and region, using different type name aliases.
     */

    public String getTypeNameAlias() {
        return this.typeNameAlias;
    }

    /**
     * <p>
     * An alias to assign to the public extension, in this account and region. If you specify an alias for the
     * extension, CloudFormation treats the alias as the extension type name within this account and region. You must
     * use the alias to refer to the extension in your templates, API calls, and CloudFormation console.
     * </p>
     * <p>
     * An extension alias must be unique within a given account and region. You can activate the same public resource
     * multiple times in the same account and region, using different type name aliases.
     * </p>
     * 
     * @param typeNameAlias
     *        An alias to assign to the public extension, in this account and region. If you specify an alias for the
     *        extension, CloudFormation treats the alias as the extension type name within this account and region. You
     *        must use the alias to refer to the extension in your templates, API calls, and CloudFormation console.</p>
     *        <p>
     *        An extension alias must be unique within a given account and region. You can activate the same public
     *        resource multiple times in the same account and region, using different type name aliases.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActivateTypeRequest withTypeNameAlias(String typeNameAlias) {
        setTypeNameAlias(typeNameAlias);
        return this;
    }

    /**
     * <p>
     * Whether to automatically update the extension in this account and region when a new <i>minor</i> version is
     * published by the extension publisher. Major versions released by the publisher must be manually updated.
     * </p>
     * <p>
     * The default is <code>true</code>.
     * </p>
     * 
     * @param autoUpdate
     *        Whether to automatically update the extension in this account and region when a new <i>minor</i> version
     *        is published by the extension publisher. Major versions released by the publisher must be manually
     *        updated.</p>
     *        <p>
     *        The default is <code>true</code>.
     */

    public void setAutoUpdate(Boolean autoUpdate) {
        this.autoUpdate = autoUpdate;
    }

    /**
     * <p>
     * Whether to automatically update the extension in this account and region when a new <i>minor</i> version is
     * published by the extension publisher. Major versions released by the publisher must be manually updated.
     * </p>
     * <p>
     * The default is <code>true</code>.
     * </p>
     * 
     * @return Whether to automatically update the extension in this account and region when a new <i>minor</i> version
     *         is published by the extension publisher. Major versions released by the publisher must be manually
     *         updated.</p>
     *         <p>
     *         The default is <code>true</code>.
     */

    public Boolean getAutoUpdate() {
        return this.autoUpdate;
    }

    /**
     * <p>
     * Whether to automatically update the extension in this account and region when a new <i>minor</i> version is
     * published by the extension publisher. Major versions released by the publisher must be manually updated.
     * </p>
     * <p>
     * The default is <code>true</code>.
     * </p>
     * 
     * @param autoUpdate
     *        Whether to automatically update the extension in this account and region when a new <i>minor</i> version
     *        is published by the extension publisher. Major versions released by the publisher must be manually
     *        updated.</p>
     *        <p>
     *        The default is <code>true</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActivateTypeRequest withAutoUpdate(Boolean autoUpdate) {
        setAutoUpdate(autoUpdate);
        return this;
    }

    /**
     * <p>
     * Whether to automatically update the extension in this account and region when a new <i>minor</i> version is
     * published by the extension publisher. Major versions released by the publisher must be manually updated.
     * </p>
     * <p>
     * The default is <code>true</code>.
     * </p>
     * 
     * @return Whether to automatically update the extension in this account and region when a new <i>minor</i> version
     *         is published by the extension publisher. Major versions released by the publisher must be manually
     *         updated.</p>
     *         <p>
     *         The default is <code>true</code>.
     */

    public Boolean isAutoUpdate() {
        return this.autoUpdate;
    }

    /**
     * @param loggingConfig
     */

    public void setLoggingConfig(LoggingConfig loggingConfig) {
        this.loggingConfig = loggingConfig;
    }

    /**
     * @return
     */

    public LoggingConfig getLoggingConfig() {
        return this.loggingConfig;
    }

    /**
     * @param loggingConfig
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActivateTypeRequest withLoggingConfig(LoggingConfig loggingConfig) {
        setLoggingConfig(loggingConfig);
        return this;
    }

    /**
     * <p>
     * The name of the IAM execution role to use to activate the extension.
     * </p>
     * 
     * @param executionRoleArn
     *        The name of the IAM execution role to use to activate the extension.
     */

    public void setExecutionRoleArn(String executionRoleArn) {
        this.executionRoleArn = executionRoleArn;
    }

    /**
     * <p>
     * The name of the IAM execution role to use to activate the extension.
     * </p>
     * 
     * @return The name of the IAM execution role to use to activate the extension.
     */

    public String getExecutionRoleArn() {
        return this.executionRoleArn;
    }

    /**
     * <p>
     * The name of the IAM execution role to use to activate the extension.
     * </p>
     * 
     * @param executionRoleArn
     *        The name of the IAM execution role to use to activate the extension.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActivateTypeRequest withExecutionRoleArn(String executionRoleArn) {
        setExecutionRoleArn(executionRoleArn);
        return this;
    }

    /**
     * <p>
     * Manually updates a previously-activated type to a new major or minor version, if available. You can also use this
     * parameter to update the value of <code>AutoUpdate</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>MAJOR</code>: CloudFormation updates the extension to the newest major version, if one is available.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MINOR</code>: CloudFormation updates the extension to the newest minor version, if one is available.
     * </p>
     * </li>
     * </ul>
     * 
     * @param versionBump
     *        Manually updates a previously-activated type to a new major or minor version, if available. You can also
     *        use this parameter to update the value of <code>AutoUpdate</code>.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>MAJOR</code>: CloudFormation updates the extension to the newest major version, if one is available.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MINOR</code>: CloudFormation updates the extension to the newest minor version, if one is available.
     *        </p>
     *        </li>
     * @see VersionBump
     */

    public void setVersionBump(String versionBump) {
        this.versionBump = versionBump;
    }

    /**
     * <p>
     * Manually updates a previously-activated type to a new major or minor version, if available. You can also use this
     * parameter to update the value of <code>AutoUpdate</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>MAJOR</code>: CloudFormation updates the extension to the newest major version, if one is available.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MINOR</code>: CloudFormation updates the extension to the newest minor version, if one is available.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Manually updates a previously-activated type to a new major or minor version, if available. You can also
     *         use this parameter to update the value of <code>AutoUpdate</code>.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>MAJOR</code>: CloudFormation updates the extension to the newest major version, if one is
     *         available.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>MINOR</code>: CloudFormation updates the extension to the newest minor version, if one is
     *         available.
     *         </p>
     *         </li>
     * @see VersionBump
     */

    public String getVersionBump() {
        return this.versionBump;
    }

    /**
     * <p>
     * Manually updates a previously-activated type to a new major or minor version, if available. You can also use this
     * parameter to update the value of <code>AutoUpdate</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>MAJOR</code>: CloudFormation updates the extension to the newest major version, if one is available.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MINOR</code>: CloudFormation updates the extension to the newest minor version, if one is available.
     * </p>
     * </li>
     * </ul>
     * 
     * @param versionBump
     *        Manually updates a previously-activated type to a new major or minor version, if available. You can also
     *        use this parameter to update the value of <code>AutoUpdate</code>.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>MAJOR</code>: CloudFormation updates the extension to the newest major version, if one is available.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MINOR</code>: CloudFormation updates the extension to the newest minor version, if one is available.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VersionBump
     */

    public ActivateTypeRequest withVersionBump(String versionBump) {
        setVersionBump(versionBump);
        return this;
    }

    /**
     * <p>
     * Manually updates a previously-activated type to a new major or minor version, if available. You can also use this
     * parameter to update the value of <code>AutoUpdate</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>MAJOR</code>: CloudFormation updates the extension to the newest major version, if one is available.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MINOR</code>: CloudFormation updates the extension to the newest minor version, if one is available.
     * </p>
     * </li>
     * </ul>
     * 
     * @param versionBump
     *        Manually updates a previously-activated type to a new major or minor version, if available. You can also
     *        use this parameter to update the value of <code>AutoUpdate</code>.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>MAJOR</code>: CloudFormation updates the extension to the newest major version, if one is available.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MINOR</code>: CloudFormation updates the extension to the newest minor version, if one is available.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VersionBump
     */

    public ActivateTypeRequest withVersionBump(VersionBump versionBump) {
        this.versionBump = versionBump.toString();
        return this;
    }

    /**
     * <p>
     * The major version of this extension you want to activate, if multiple major versions are available. The default
     * is the latest major version. CloudFormation uses the latest available <i>minor</i> version of the major version
     * selected.
     * </p>
     * <p>
     * You can specify <code>MajorVersion</code> or <code>VersionBump</code>, but not both.
     * </p>
     * 
     * @param majorVersion
     *        The major version of this extension you want to activate, if multiple major versions are available. The
     *        default is the latest major version. CloudFormation uses the latest available <i>minor</i> version of the
     *        major version selected.</p>
     *        <p>
     *        You can specify <code>MajorVersion</code> or <code>VersionBump</code>, but not both.
     */

    public void setMajorVersion(Long majorVersion) {
        this.majorVersion = majorVersion;
    }

    /**
     * <p>
     * The major version of this extension you want to activate, if multiple major versions are available. The default
     * is the latest major version. CloudFormation uses the latest available <i>minor</i> version of the major version
     * selected.
     * </p>
     * <p>
     * You can specify <code>MajorVersion</code> or <code>VersionBump</code>, but not both.
     * </p>
     * 
     * @return The major version of this extension you want to activate, if multiple major versions are available. The
     *         default is the latest major version. CloudFormation uses the latest available <i>minor</i> version of the
     *         major version selected.</p>
     *         <p>
     *         You can specify <code>MajorVersion</code> or <code>VersionBump</code>, but not both.
     */

    public Long getMajorVersion() {
        return this.majorVersion;
    }

    /**
     * <p>
     * The major version of this extension you want to activate, if multiple major versions are available. The default
     * is the latest major version. CloudFormation uses the latest available <i>minor</i> version of the major version
     * selected.
     * </p>
     * <p>
     * You can specify <code>MajorVersion</code> or <code>VersionBump</code>, but not both.
     * </p>
     * 
     * @param majorVersion
     *        The major version of this extension you want to activate, if multiple major versions are available. The
     *        default is the latest major version. CloudFormation uses the latest available <i>minor</i> version of the
     *        major version selected.</p>
     *        <p>
     *        You can specify <code>MajorVersion</code> or <code>VersionBump</code>, but not both.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActivateTypeRequest withMajorVersion(Long majorVersion) {
        setMajorVersion(majorVersion);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getPublicTypeArn() != null)
            sb.append("PublicTypeArn: ").append(getPublicTypeArn()).append(",");
        if (getPublisherId() != null)
            sb.append("PublisherId: ").append(getPublisherId()).append(",");
        if (getTypeName() != null)
            sb.append("TypeName: ").append(getTypeName()).append(",");
        if (getTypeNameAlias() != null)
            sb.append("TypeNameAlias: ").append(getTypeNameAlias()).append(",");
        if (getAutoUpdate() != null)
            sb.append("AutoUpdate: ").append(getAutoUpdate()).append(",");
        if (getLoggingConfig() != null)
            sb.append("LoggingConfig: ").append(getLoggingConfig()).append(",");
        if (getExecutionRoleArn() != null)
            sb.append("ExecutionRoleArn: ").append(getExecutionRoleArn()).append(",");
        if (getVersionBump() != null)
            sb.append("VersionBump: ").append(getVersionBump()).append(",");
        if (getMajorVersion() != null)
            sb.append("MajorVersion: ").append(getMajorVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ActivateTypeRequest == false)
            return false;
        ActivateTypeRequest other = (ActivateTypeRequest) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getPublicTypeArn() == null ^ this.getPublicTypeArn() == null)
            return false;
        if (other.getPublicTypeArn() != null && other.getPublicTypeArn().equals(this.getPublicTypeArn()) == false)
            return false;
        if (other.getPublisherId() == null ^ this.getPublisherId() == null)
            return false;
        if (other.getPublisherId() != null && other.getPublisherId().equals(this.getPublisherId()) == false)
            return false;
        if (other.getTypeName() == null ^ this.getTypeName() == null)
            return false;
        if (other.getTypeName() != null && other.getTypeName().equals(this.getTypeName()) == false)
            return false;
        if (other.getTypeNameAlias() == null ^ this.getTypeNameAlias() == null)
            return false;
        if (other.getTypeNameAlias() != null && other.getTypeNameAlias().equals(this.getTypeNameAlias()) == false)
            return false;
        if (other.getAutoUpdate() == null ^ this.getAutoUpdate() == null)
            return false;
        if (other.getAutoUpdate() != null && other.getAutoUpdate().equals(this.getAutoUpdate()) == false)
            return false;
        if (other.getLoggingConfig() == null ^ this.getLoggingConfig() == null)
            return false;
        if (other.getLoggingConfig() != null && other.getLoggingConfig().equals(this.getLoggingConfig()) == false)
            return false;
        if (other.getExecutionRoleArn() == null ^ this.getExecutionRoleArn() == null)
            return false;
        if (other.getExecutionRoleArn() != null && other.getExecutionRoleArn().equals(this.getExecutionRoleArn()) == false)
            return false;
        if (other.getVersionBump() == null ^ this.getVersionBump() == null)
            return false;
        if (other.getVersionBump() != null && other.getVersionBump().equals(this.getVersionBump()) == false)
            return false;
        if (other.getMajorVersion() == null ^ this.getMajorVersion() == null)
            return false;
        if (other.getMajorVersion() != null && other.getMajorVersion().equals(this.getMajorVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getPublicTypeArn() == null) ? 0 : getPublicTypeArn().hashCode());
        hashCode = prime * hashCode + ((getPublisherId() == null) ? 0 : getPublisherId().hashCode());
        hashCode = prime * hashCode + ((getTypeName() == null) ? 0 : getTypeName().hashCode());
        hashCode = prime * hashCode + ((getTypeNameAlias() == null) ? 0 : getTypeNameAlias().hashCode());
        hashCode = prime * hashCode + ((getAutoUpdate() == null) ? 0 : getAutoUpdate().hashCode());
        hashCode = prime * hashCode + ((getLoggingConfig() == null) ? 0 : getLoggingConfig().hashCode());
        hashCode = prime * hashCode + ((getExecutionRoleArn() == null) ? 0 : getExecutionRoleArn().hashCode());
        hashCode = prime * hashCode + ((getVersionBump() == null) ? 0 : getVersionBump().hashCode());
        hashCode = prime * hashCode + ((getMajorVersion() == null) ? 0 : getMajorVersion().hashCode());
        return hashCode;
    }

    @Override
    public ActivateTypeRequest clone() {
        return (ActivateTypeRequest) super.clone();
    }

}
