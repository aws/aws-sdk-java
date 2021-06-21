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
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/DescribeType" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeTypeResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the extension.
     * </p>
     */
    private String arn;
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
     * If the extension is a public third-party type you have activated with a type name alias, CloudFormation returns
     * the type name alias. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_ActivateType.html">ActivateType</a>.
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
     * Whether the specified extension version is set as the default version.
     * </p>
     * <p>
     * This applies only to private extensions you have registered in your account, and extensions published by Amazon.
     * For public third-party extensions, whether or not they are activated in your account, CloudFormation returns
     * <code>null</code>.
     * </p>
     */
    private Boolean isDefaultVersion;
    /**
     * <p>
     * The contract test status of the registered extension version. To return the extension test status of a specifc
     * extension version, you must specify <code>VersionId</code>.
     * </p>
     * <p>
     * This applies only to registered private extension versions. CloudFormation does not return this information for
     * public extensions, whether or not they are activated in your account.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PASSED</code>: The extension has passed all its contract tests.
     * </p>
     * <p>
     * An extension must have a test status of <code>PASSED</code> before it can be published. For more information, see
     * <a href="https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/resource-type-publish.html">Publishing
     * extensions to make them available for public use</a> in the <i>CloudFormation Command Line Interface User
     * Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code>: The extension has failed one or more contract tests.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code>: Contract tests are currently being performed on the extension.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_TESTED</code>: Contract tests have not been performed on the extension.
     * </p>
     * </li>
     * </ul>
     */
    private String typeTestsStatus;
    /**
     * <p>
     * The description of the test status. To return the extension test status of a specifc extension version, you must
     * specify <code>VersionId</code>.
     * </p>
     * <p>
     * This applies only to registered private extension versions. CloudFormation does not return this information for
     * public extensions, whether or not they are activated in your account.
     * </p>
     */
    private String typeTestsStatusDescription;
    /**
     * <p>
     * The description of the extension.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The schema that defines the extension.
     * </p>
     * <p>
     * For more information on extension schemas, see <a
     * href="https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/resource-type-schema.html">Resource
     * Provider Schema</a> in the <i>CloudFormation CLI User Guide</i>.
     * </p>
     */
    private String schema;
    /**
     * <p>
     * For resource type extensions, the provisioning behavior of the resource type. AWS CloudFormation determines the
     * provisioning type during registration, based on the types of handlers in the schema handler package submitted.
     * </p>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FULLY_MUTABLE</code>: The resource type includes an update handler to process updates to the type during
     * stack update operations.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IMMUTABLE</code>: The resource type does not include an update handler, so the type cannot be updated and
     * must instead be replaced during stack update operations.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NON_PROVISIONABLE</code>: The resource type does not include all of the following handlers, and therefore
     * cannot actually be provisioned.
     * </p>
     * <ul>
     * <li>
     * <p>
     * create
     * </p>
     * </li>
     * <li>
     * <p>
     * read
     * </p>
     * </li>
     * <li>
     * <p>
     * delete
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     */
    private String provisioningType;
    /**
     * <p>
     * The deprecation status of the extension version.
     * </p>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LIVE</code>: The extension is activated or registered and can be used in CloudFormation operations,
     * dependent on its provisioning behavior and visibility scope.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DEPRECATED</code>: The extension has been deactivated or deregistered and can no longer be used in
     * CloudFormation operations.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For public third-party extensions, CloudFormation returns <code>null</code>.
     * </p>
     */
    private String deprecatedStatus;
    /**
     * <p>
     * Contains logging configuration information for private extensions. This applies only to private extensions you
     * have registered in your account. For public extensions, both those provided by Amazon and published by third
     * parties, CloudFormation returns <code>null</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_RegisterType.html">RegisterType</a>.
     * </p>
     */
    private LoggingConfig loggingConfig;
    /**
     * <p>
     * For extensions that are modules, the public third-party extensions that must be activated in your account in
     * order for the module itself to be activated.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<RequiredActivatedType> requiredActivatedTypes;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM execution role used to register the extension. This applies only to
     * private extensions you have registered in your account. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_RegisterType.html">RegisterType</a>.
     * </p>
     * <p/>
     * <p>
     * If the registered extension calls any AWS APIs, you must create an <i> <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles.html">IAM execution role</a> </i> that includes
     * the necessary permissions to call those AWS APIs, and provision that execution role in your account.
     * CloudFormation then assumes that execution role to provide your extension with the appropriate credentials.
     * </p>
     */
    private String executionRoleArn;
    /**
     * <p>
     * The scope at which the extension is visible and usable in CloudFormation operations.
     * </p>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PRIVATE</code>: The extension is only visible and usable within the account in which it is registered. AWS
     * CloudFormation marks any extensions you register as <code>PRIVATE</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PUBLIC</code>: The extension is publically visible and usable within any Amazon account.
     * </p>
     * </li>
     * </ul>
     */
    private String visibility;
    /**
     * <p>
     * The URL of the source code for the extension.
     * </p>
     */
    private String sourceUrl;
    /**
     * <p>
     * The URL of a page providing detailed documentation for this extension.
     * </p>
     */
    private String documentationUrl;
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
     */
    private java.util.Date lastUpdated;
    /**
     * <p>
     * When the specified private extension version was registered or activated in your account.
     * </p>
     */
    private java.util.Date timeCreated;
    /**
     * <p>
     * A JSON string that represent the current configuration data for the extension in this account and region.
     * </p>
     * <p>
     * To set the configuration data for an extension, use <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_SetTypeConfiguration.html"
     * >SetTypeConfiguration</a>. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/registry-register.html#registry-set-configuration"
     * >Configuring extensions at the account level</a> in the <i>CloudFormation User Guide</i>.
     * </p>
     */
    private String configurationSchema;
    /**
     * <p>
     * The publisher ID of the extension publisher.
     * </p>
     * <p>
     * This applies only to public third-party extensions. For private registered extensions, and extensions provided by
     * Amazon, CloudFormation returns <code>null</code>.
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
     * For public extensions that have been activated for this account and region, the Amazon Resource Name (ARN) of the
     * public extension.
     * </p>
     */
    private String originalTypeArn;
    /**
     * <p>
     * The version number of a public third-party extension.
     * </p>
     * <p>
     * This applies only if you specify a public extension you have activated in your account, or specify a public
     * extension without specifying a version. For all other extensions, CloudFormation returns <code>null</code>.
     * </p>
     */
    private String publicVersionNumber;
    /**
     * <p>
     * The latest version of a public extension <i>that is available</i> for use.
     * </p>
     * <p>
     * This only applies if you specify a public extension, and you do not specify a version. For all other requests,
     * CloudFormation returns <code>null</code>.
     * </p>
     */
    private String latestPublicVersion;
    /**
     * <p>
     * Whether or not the extension is activated in the account and region.
     * </p>
     * <p>
     * This only applies to public third-party extensions. For all other extensions, CloudFormation returns
     * <code>null</code>.
     * </p>
     */
    private Boolean isActivated;
    /**
     * <p>
     * Whether CloudFormation automatically updates the extension in this account and region when a new <i>minor</i>
     * version is published by the extension publisher. Major versions released by the publisher must be manually
     * updated. For more information, see <a
     * href="AWSCloudFormation/latest/UserGuide/registry-public.html#registry-public-enable">Activating public
     * extensions for use in your account</a> in the <i>AWS CloudFormation User Guide</i>.
     * </p>
     */
    private Boolean autoUpdate;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the extension.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the extension.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the extension.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the extension.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the extension.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the extension.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTypeResult withArn(String arn) {
        setArn(arn);
        return this;
    }

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

    public DescribeTypeResult withType(String type) {
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

    public DescribeTypeResult withType(RegistryType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The name of the extension.
     * </p>
     * <p>
     * If the extension is a public third-party type you have activated with a type name alias, CloudFormation returns
     * the type name alias. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_ActivateType.html">ActivateType</a>.
     * </p>
     * 
     * @param typeName
     *        The name of the extension.</p>
     *        <p>
     *        If the extension is a public third-party type you have activated with a type name alias, CloudFormation
     *        returns the type name alias. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_ActivateType.html"
     *        >ActivateType</a>.
     */

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    /**
     * <p>
     * The name of the extension.
     * </p>
     * <p>
     * If the extension is a public third-party type you have activated with a type name alias, CloudFormation returns
     * the type name alias. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_ActivateType.html">ActivateType</a>.
     * </p>
     * 
     * @return The name of the extension.</p>
     *         <p>
     *         If the extension is a public third-party type you have activated with a type name alias, CloudFormation
     *         returns the type name alias. For more information, see <a
     *         href="https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_ActivateType.html"
     *         >ActivateType</a>.
     */

    public String getTypeName() {
        return this.typeName;
    }

    /**
     * <p>
     * The name of the extension.
     * </p>
     * <p>
     * If the extension is a public third-party type you have activated with a type name alias, CloudFormation returns
     * the type name alias. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_ActivateType.html">ActivateType</a>.
     * </p>
     * 
     * @param typeName
     *        The name of the extension.</p>
     *        <p>
     *        If the extension is a public third-party type you have activated with a type name alias, CloudFormation
     *        returns the type name alias. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_ActivateType.html"
     *        >ActivateType</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTypeResult withTypeName(String typeName) {
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

    public DescribeTypeResult withDefaultVersionId(String defaultVersionId) {
        setDefaultVersionId(defaultVersionId);
        return this;
    }

    /**
     * <p>
     * Whether the specified extension version is set as the default version.
     * </p>
     * <p>
     * This applies only to private extensions you have registered in your account, and extensions published by Amazon.
     * For public third-party extensions, whether or not they are activated in your account, CloudFormation returns
     * <code>null</code>.
     * </p>
     * 
     * @param isDefaultVersion
     *        Whether the specified extension version is set as the default version.</p>
     *        <p>
     *        This applies only to private extensions you have registered in your account, and extensions published by
     *        Amazon. For public third-party extensions, whether or not they are activated in your account,
     *        CloudFormation returns <code>null</code>.
     */

    public void setIsDefaultVersion(Boolean isDefaultVersion) {
        this.isDefaultVersion = isDefaultVersion;
    }

    /**
     * <p>
     * Whether the specified extension version is set as the default version.
     * </p>
     * <p>
     * This applies only to private extensions you have registered in your account, and extensions published by Amazon.
     * For public third-party extensions, whether or not they are activated in your account, CloudFormation returns
     * <code>null</code>.
     * </p>
     * 
     * @return Whether the specified extension version is set as the default version.</p>
     *         <p>
     *         This applies only to private extensions you have registered in your account, and extensions published by
     *         Amazon. For public third-party extensions, whether or not they are activated in your account,
     *         CloudFormation returns <code>null</code>.
     */

    public Boolean getIsDefaultVersion() {
        return this.isDefaultVersion;
    }

    /**
     * <p>
     * Whether the specified extension version is set as the default version.
     * </p>
     * <p>
     * This applies only to private extensions you have registered in your account, and extensions published by Amazon.
     * For public third-party extensions, whether or not they are activated in your account, CloudFormation returns
     * <code>null</code>.
     * </p>
     * 
     * @param isDefaultVersion
     *        Whether the specified extension version is set as the default version.</p>
     *        <p>
     *        This applies only to private extensions you have registered in your account, and extensions published by
     *        Amazon. For public third-party extensions, whether or not they are activated in your account,
     *        CloudFormation returns <code>null</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTypeResult withIsDefaultVersion(Boolean isDefaultVersion) {
        setIsDefaultVersion(isDefaultVersion);
        return this;
    }

    /**
     * <p>
     * Whether the specified extension version is set as the default version.
     * </p>
     * <p>
     * This applies only to private extensions you have registered in your account, and extensions published by Amazon.
     * For public third-party extensions, whether or not they are activated in your account, CloudFormation returns
     * <code>null</code>.
     * </p>
     * 
     * @return Whether the specified extension version is set as the default version.</p>
     *         <p>
     *         This applies only to private extensions you have registered in your account, and extensions published by
     *         Amazon. For public third-party extensions, whether or not they are activated in your account,
     *         CloudFormation returns <code>null</code>.
     */

    public Boolean isDefaultVersion() {
        return this.isDefaultVersion;
    }

    /**
     * <p>
     * The contract test status of the registered extension version. To return the extension test status of a specifc
     * extension version, you must specify <code>VersionId</code>.
     * </p>
     * <p>
     * This applies only to registered private extension versions. CloudFormation does not return this information for
     * public extensions, whether or not they are activated in your account.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PASSED</code>: The extension has passed all its contract tests.
     * </p>
     * <p>
     * An extension must have a test status of <code>PASSED</code> before it can be published. For more information, see
     * <a href="https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/resource-type-publish.html">Publishing
     * extensions to make them available for public use</a> in the <i>CloudFormation Command Line Interface User
     * Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code>: The extension has failed one or more contract tests.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code>: Contract tests are currently being performed on the extension.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_TESTED</code>: Contract tests have not been performed on the extension.
     * </p>
     * </li>
     * </ul>
     * 
     * @param typeTestsStatus
     *        The contract test status of the registered extension version. To return the extension test status of a
     *        specifc extension version, you must specify <code>VersionId</code>. </p>
     *        <p>
     *        This applies only to registered private extension versions. CloudFormation does not return this
     *        information for public extensions, whether or not they are activated in your account.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PASSED</code>: The extension has passed all its contract tests.
     *        </p>
     *        <p>
     *        An extension must have a test status of <code>PASSED</code> before it can be published. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/resource-type-publish.html"
     *        >Publishing extensions to make them available for public use</a> in the <i>CloudFormation Command Line
     *        Interface User Guide</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code>: The extension has failed one or more contract tests.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IN_PROGRESS</code>: Contract tests are currently being performed on the extension.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NOT_TESTED</code>: Contract tests have not been performed on the extension.
     *        </p>
     *        </li>
     * @see TypeTestsStatus
     */

    public void setTypeTestsStatus(String typeTestsStatus) {
        this.typeTestsStatus = typeTestsStatus;
    }

    /**
     * <p>
     * The contract test status of the registered extension version. To return the extension test status of a specifc
     * extension version, you must specify <code>VersionId</code>.
     * </p>
     * <p>
     * This applies only to registered private extension versions. CloudFormation does not return this information for
     * public extensions, whether or not they are activated in your account.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PASSED</code>: The extension has passed all its contract tests.
     * </p>
     * <p>
     * An extension must have a test status of <code>PASSED</code> before it can be published. For more information, see
     * <a href="https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/resource-type-publish.html">Publishing
     * extensions to make them available for public use</a> in the <i>CloudFormation Command Line Interface User
     * Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code>: The extension has failed one or more contract tests.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code>: Contract tests are currently being performed on the extension.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_TESTED</code>: Contract tests have not been performed on the extension.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The contract test status of the registered extension version. To return the extension test status of a
     *         specifc extension version, you must specify <code>VersionId</code>. </p>
     *         <p>
     *         This applies only to registered private extension versions. CloudFormation does not return this
     *         information for public extensions, whether or not they are activated in your account.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>PASSED</code>: The extension has passed all its contract tests.
     *         </p>
     *         <p>
     *         An extension must have a test status of <code>PASSED</code> before it can be published. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/resource-type-publish.html"
     *         >Publishing extensions to make them available for public use</a> in the <i>CloudFormation Command Line
     *         Interface User Guide</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FAILED</code>: The extension has failed one or more contract tests.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>IN_PROGRESS</code>: Contract tests are currently being performed on the extension.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NOT_TESTED</code>: Contract tests have not been performed on the extension.
     *         </p>
     *         </li>
     * @see TypeTestsStatus
     */

    public String getTypeTestsStatus() {
        return this.typeTestsStatus;
    }

    /**
     * <p>
     * The contract test status of the registered extension version. To return the extension test status of a specifc
     * extension version, you must specify <code>VersionId</code>.
     * </p>
     * <p>
     * This applies only to registered private extension versions. CloudFormation does not return this information for
     * public extensions, whether or not they are activated in your account.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PASSED</code>: The extension has passed all its contract tests.
     * </p>
     * <p>
     * An extension must have a test status of <code>PASSED</code> before it can be published. For more information, see
     * <a href="https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/resource-type-publish.html">Publishing
     * extensions to make them available for public use</a> in the <i>CloudFormation Command Line Interface User
     * Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code>: The extension has failed one or more contract tests.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code>: Contract tests are currently being performed on the extension.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_TESTED</code>: Contract tests have not been performed on the extension.
     * </p>
     * </li>
     * </ul>
     * 
     * @param typeTestsStatus
     *        The contract test status of the registered extension version. To return the extension test status of a
     *        specifc extension version, you must specify <code>VersionId</code>. </p>
     *        <p>
     *        This applies only to registered private extension versions. CloudFormation does not return this
     *        information for public extensions, whether or not they are activated in your account.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PASSED</code>: The extension has passed all its contract tests.
     *        </p>
     *        <p>
     *        An extension must have a test status of <code>PASSED</code> before it can be published. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/resource-type-publish.html"
     *        >Publishing extensions to make them available for public use</a> in the <i>CloudFormation Command Line
     *        Interface User Guide</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code>: The extension has failed one or more contract tests.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IN_PROGRESS</code>: Contract tests are currently being performed on the extension.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NOT_TESTED</code>: Contract tests have not been performed on the extension.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TypeTestsStatus
     */

    public DescribeTypeResult withTypeTestsStatus(String typeTestsStatus) {
        setTypeTestsStatus(typeTestsStatus);
        return this;
    }

    /**
     * <p>
     * The contract test status of the registered extension version. To return the extension test status of a specifc
     * extension version, you must specify <code>VersionId</code>.
     * </p>
     * <p>
     * This applies only to registered private extension versions. CloudFormation does not return this information for
     * public extensions, whether or not they are activated in your account.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PASSED</code>: The extension has passed all its contract tests.
     * </p>
     * <p>
     * An extension must have a test status of <code>PASSED</code> before it can be published. For more information, see
     * <a href="https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/resource-type-publish.html">Publishing
     * extensions to make them available for public use</a> in the <i>CloudFormation Command Line Interface User
     * Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code>: The extension has failed one or more contract tests.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code>: Contract tests are currently being performed on the extension.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_TESTED</code>: Contract tests have not been performed on the extension.
     * </p>
     * </li>
     * </ul>
     * 
     * @param typeTestsStatus
     *        The contract test status of the registered extension version. To return the extension test status of a
     *        specifc extension version, you must specify <code>VersionId</code>. </p>
     *        <p>
     *        This applies only to registered private extension versions. CloudFormation does not return this
     *        information for public extensions, whether or not they are activated in your account.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PASSED</code>: The extension has passed all its contract tests.
     *        </p>
     *        <p>
     *        An extension must have a test status of <code>PASSED</code> before it can be published. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/resource-type-publish.html"
     *        >Publishing extensions to make them available for public use</a> in the <i>CloudFormation Command Line
     *        Interface User Guide</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code>: The extension has failed one or more contract tests.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IN_PROGRESS</code>: Contract tests are currently being performed on the extension.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NOT_TESTED</code>: Contract tests have not been performed on the extension.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TypeTestsStatus
     */

    public DescribeTypeResult withTypeTestsStatus(TypeTestsStatus typeTestsStatus) {
        this.typeTestsStatus = typeTestsStatus.toString();
        return this;
    }

    /**
     * <p>
     * The description of the test status. To return the extension test status of a specifc extension version, you must
     * specify <code>VersionId</code>.
     * </p>
     * <p>
     * This applies only to registered private extension versions. CloudFormation does not return this information for
     * public extensions, whether or not they are activated in your account.
     * </p>
     * 
     * @param typeTestsStatusDescription
     *        The description of the test status. To return the extension test status of a specifc extension version,
     *        you must specify <code>VersionId</code>. </p>
     *        <p>
     *        This applies only to registered private extension versions. CloudFormation does not return this
     *        information for public extensions, whether or not they are activated in your account.
     */

    public void setTypeTestsStatusDescription(String typeTestsStatusDescription) {
        this.typeTestsStatusDescription = typeTestsStatusDescription;
    }

    /**
     * <p>
     * The description of the test status. To return the extension test status of a specifc extension version, you must
     * specify <code>VersionId</code>.
     * </p>
     * <p>
     * This applies only to registered private extension versions. CloudFormation does not return this information for
     * public extensions, whether or not they are activated in your account.
     * </p>
     * 
     * @return The description of the test status. To return the extension test status of a specifc extension version,
     *         you must specify <code>VersionId</code>. </p>
     *         <p>
     *         This applies only to registered private extension versions. CloudFormation does not return this
     *         information for public extensions, whether or not they are activated in your account.
     */

    public String getTypeTestsStatusDescription() {
        return this.typeTestsStatusDescription;
    }

    /**
     * <p>
     * The description of the test status. To return the extension test status of a specifc extension version, you must
     * specify <code>VersionId</code>.
     * </p>
     * <p>
     * This applies only to registered private extension versions. CloudFormation does not return this information for
     * public extensions, whether or not they are activated in your account.
     * </p>
     * 
     * @param typeTestsStatusDescription
     *        The description of the test status. To return the extension test status of a specifc extension version,
     *        you must specify <code>VersionId</code>. </p>
     *        <p>
     *        This applies only to registered private extension versions. CloudFormation does not return this
     *        information for public extensions, whether or not they are activated in your account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTypeResult withTypeTestsStatusDescription(String typeTestsStatusDescription) {
        setTypeTestsStatusDescription(typeTestsStatusDescription);
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

    public DescribeTypeResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The schema that defines the extension.
     * </p>
     * <p>
     * For more information on extension schemas, see <a
     * href="https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/resource-type-schema.html">Resource
     * Provider Schema</a> in the <i>CloudFormation CLI User Guide</i>.
     * </p>
     * 
     * @param schema
     *        The schema that defines the extension.</p>
     *        <p>
     *        For more information on extension schemas, see <a
     *        href="https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/resource-type-schema.html">Resource
     *        Provider Schema</a> in the <i>CloudFormation CLI User Guide</i>.
     */

    public void setSchema(String schema) {
        this.schema = schema;
    }

    /**
     * <p>
     * The schema that defines the extension.
     * </p>
     * <p>
     * For more information on extension schemas, see <a
     * href="https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/resource-type-schema.html">Resource
     * Provider Schema</a> in the <i>CloudFormation CLI User Guide</i>.
     * </p>
     * 
     * @return The schema that defines the extension.</p>
     *         <p>
     *         For more information on extension schemas, see <a
     *         href="https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/resource-type-schema.html">Resource
     *         Provider Schema</a> in the <i>CloudFormation CLI User Guide</i>.
     */

    public String getSchema() {
        return this.schema;
    }

    /**
     * <p>
     * The schema that defines the extension.
     * </p>
     * <p>
     * For more information on extension schemas, see <a
     * href="https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/resource-type-schema.html">Resource
     * Provider Schema</a> in the <i>CloudFormation CLI User Guide</i>.
     * </p>
     * 
     * @param schema
     *        The schema that defines the extension.</p>
     *        <p>
     *        For more information on extension schemas, see <a
     *        href="https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/resource-type-schema.html">Resource
     *        Provider Schema</a> in the <i>CloudFormation CLI User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTypeResult withSchema(String schema) {
        setSchema(schema);
        return this;
    }

    /**
     * <p>
     * For resource type extensions, the provisioning behavior of the resource type. AWS CloudFormation determines the
     * provisioning type during registration, based on the types of handlers in the schema handler package submitted.
     * </p>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FULLY_MUTABLE</code>: The resource type includes an update handler to process updates to the type during
     * stack update operations.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IMMUTABLE</code>: The resource type does not include an update handler, so the type cannot be updated and
     * must instead be replaced during stack update operations.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NON_PROVISIONABLE</code>: The resource type does not include all of the following handlers, and therefore
     * cannot actually be provisioned.
     * </p>
     * <ul>
     * <li>
     * <p>
     * create
     * </p>
     * </li>
     * <li>
     * <p>
     * read
     * </p>
     * </li>
     * <li>
     * <p>
     * delete
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param provisioningType
     *        For resource type extensions, the provisioning behavior of the resource type. AWS CloudFormation
     *        determines the provisioning type during registration, based on the types of handlers in the schema handler
     *        package submitted.</p>
     *        <p>
     *        Valid values include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>FULLY_MUTABLE</code>: The resource type includes an update handler to process updates to the type
     *        during stack update operations.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IMMUTABLE</code>: The resource type does not include an update handler, so the type cannot be
     *        updated and must instead be replaced during stack update operations.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NON_PROVISIONABLE</code>: The resource type does not include all of the following handlers, and
     *        therefore cannot actually be provisioned.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        create
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        read
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        delete
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     * @see ProvisioningType
     */

    public void setProvisioningType(String provisioningType) {
        this.provisioningType = provisioningType;
    }

    /**
     * <p>
     * For resource type extensions, the provisioning behavior of the resource type. AWS CloudFormation determines the
     * provisioning type during registration, based on the types of handlers in the schema handler package submitted.
     * </p>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FULLY_MUTABLE</code>: The resource type includes an update handler to process updates to the type during
     * stack update operations.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IMMUTABLE</code>: The resource type does not include an update handler, so the type cannot be updated and
     * must instead be replaced during stack update operations.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NON_PROVISIONABLE</code>: The resource type does not include all of the following handlers, and therefore
     * cannot actually be provisioned.
     * </p>
     * <ul>
     * <li>
     * <p>
     * create
     * </p>
     * </li>
     * <li>
     * <p>
     * read
     * </p>
     * </li>
     * <li>
     * <p>
     * delete
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @return For resource type extensions, the provisioning behavior of the resource type. AWS CloudFormation
     *         determines the provisioning type during registration, based on the types of handlers in the schema
     *         handler package submitted.</p>
     *         <p>
     *         Valid values include:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>FULLY_MUTABLE</code>: The resource type includes an update handler to process updates to the type
     *         during stack update operations.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>IMMUTABLE</code>: The resource type does not include an update handler, so the type cannot be
     *         updated and must instead be replaced during stack update operations.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NON_PROVISIONABLE</code>: The resource type does not include all of the following handlers, and
     *         therefore cannot actually be provisioned.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         create
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         read
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         delete
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     * @see ProvisioningType
     */

    public String getProvisioningType() {
        return this.provisioningType;
    }

    /**
     * <p>
     * For resource type extensions, the provisioning behavior of the resource type. AWS CloudFormation determines the
     * provisioning type during registration, based on the types of handlers in the schema handler package submitted.
     * </p>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FULLY_MUTABLE</code>: The resource type includes an update handler to process updates to the type during
     * stack update operations.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IMMUTABLE</code>: The resource type does not include an update handler, so the type cannot be updated and
     * must instead be replaced during stack update operations.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NON_PROVISIONABLE</code>: The resource type does not include all of the following handlers, and therefore
     * cannot actually be provisioned.
     * </p>
     * <ul>
     * <li>
     * <p>
     * create
     * </p>
     * </li>
     * <li>
     * <p>
     * read
     * </p>
     * </li>
     * <li>
     * <p>
     * delete
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param provisioningType
     *        For resource type extensions, the provisioning behavior of the resource type. AWS CloudFormation
     *        determines the provisioning type during registration, based on the types of handlers in the schema handler
     *        package submitted.</p>
     *        <p>
     *        Valid values include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>FULLY_MUTABLE</code>: The resource type includes an update handler to process updates to the type
     *        during stack update operations.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IMMUTABLE</code>: The resource type does not include an update handler, so the type cannot be
     *        updated and must instead be replaced during stack update operations.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NON_PROVISIONABLE</code>: The resource type does not include all of the following handlers, and
     *        therefore cannot actually be provisioned.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        create
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        read
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        delete
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProvisioningType
     */

    public DescribeTypeResult withProvisioningType(String provisioningType) {
        setProvisioningType(provisioningType);
        return this;
    }

    /**
     * <p>
     * For resource type extensions, the provisioning behavior of the resource type. AWS CloudFormation determines the
     * provisioning type during registration, based on the types of handlers in the schema handler package submitted.
     * </p>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FULLY_MUTABLE</code>: The resource type includes an update handler to process updates to the type during
     * stack update operations.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IMMUTABLE</code>: The resource type does not include an update handler, so the type cannot be updated and
     * must instead be replaced during stack update operations.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NON_PROVISIONABLE</code>: The resource type does not include all of the following handlers, and therefore
     * cannot actually be provisioned.
     * </p>
     * <ul>
     * <li>
     * <p>
     * create
     * </p>
     * </li>
     * <li>
     * <p>
     * read
     * </p>
     * </li>
     * <li>
     * <p>
     * delete
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param provisioningType
     *        For resource type extensions, the provisioning behavior of the resource type. AWS CloudFormation
     *        determines the provisioning type during registration, based on the types of handlers in the schema handler
     *        package submitted.</p>
     *        <p>
     *        Valid values include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>FULLY_MUTABLE</code>: The resource type includes an update handler to process updates to the type
     *        during stack update operations.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IMMUTABLE</code>: The resource type does not include an update handler, so the type cannot be
     *        updated and must instead be replaced during stack update operations.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NON_PROVISIONABLE</code>: The resource type does not include all of the following handlers, and
     *        therefore cannot actually be provisioned.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        create
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        read
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        delete
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProvisioningType
     */

    public DescribeTypeResult withProvisioningType(ProvisioningType provisioningType) {
        this.provisioningType = provisioningType.toString();
        return this;
    }

    /**
     * <p>
     * The deprecation status of the extension version.
     * </p>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LIVE</code>: The extension is activated or registered and can be used in CloudFormation operations,
     * dependent on its provisioning behavior and visibility scope.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DEPRECATED</code>: The extension has been deactivated or deregistered and can no longer be used in
     * CloudFormation operations.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For public third-party extensions, CloudFormation returns <code>null</code>.
     * </p>
     * 
     * @param deprecatedStatus
     *        The deprecation status of the extension version.</p>
     *        <p>
     *        Valid values include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>LIVE</code>: The extension is activated or registered and can be used in CloudFormation operations,
     *        dependent on its provisioning behavior and visibility scope.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DEPRECATED</code>: The extension has been deactivated or deregistered and can no longer be used in
     *        CloudFormation operations.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For public third-party extensions, CloudFormation returns <code>null</code>.
     * @see DeprecatedStatus
     */

    public void setDeprecatedStatus(String deprecatedStatus) {
        this.deprecatedStatus = deprecatedStatus;
    }

    /**
     * <p>
     * The deprecation status of the extension version.
     * </p>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LIVE</code>: The extension is activated or registered and can be used in CloudFormation operations,
     * dependent on its provisioning behavior and visibility scope.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DEPRECATED</code>: The extension has been deactivated or deregistered and can no longer be used in
     * CloudFormation operations.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For public third-party extensions, CloudFormation returns <code>null</code>.
     * </p>
     * 
     * @return The deprecation status of the extension version.</p>
     *         <p>
     *         Valid values include:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>LIVE</code>: The extension is activated or registered and can be used in CloudFormation operations,
     *         dependent on its provisioning behavior and visibility scope.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DEPRECATED</code>: The extension has been deactivated or deregistered and can no longer be used in
     *         CloudFormation operations.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For public third-party extensions, CloudFormation returns <code>null</code>.
     * @see DeprecatedStatus
     */

    public String getDeprecatedStatus() {
        return this.deprecatedStatus;
    }

    /**
     * <p>
     * The deprecation status of the extension version.
     * </p>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LIVE</code>: The extension is activated or registered and can be used in CloudFormation operations,
     * dependent on its provisioning behavior and visibility scope.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DEPRECATED</code>: The extension has been deactivated or deregistered and can no longer be used in
     * CloudFormation operations.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For public third-party extensions, CloudFormation returns <code>null</code>.
     * </p>
     * 
     * @param deprecatedStatus
     *        The deprecation status of the extension version.</p>
     *        <p>
     *        Valid values include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>LIVE</code>: The extension is activated or registered and can be used in CloudFormation operations,
     *        dependent on its provisioning behavior and visibility scope.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DEPRECATED</code>: The extension has been deactivated or deregistered and can no longer be used in
     *        CloudFormation operations.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For public third-party extensions, CloudFormation returns <code>null</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeprecatedStatus
     */

    public DescribeTypeResult withDeprecatedStatus(String deprecatedStatus) {
        setDeprecatedStatus(deprecatedStatus);
        return this;
    }

    /**
     * <p>
     * The deprecation status of the extension version.
     * </p>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LIVE</code>: The extension is activated or registered and can be used in CloudFormation operations,
     * dependent on its provisioning behavior and visibility scope.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DEPRECATED</code>: The extension has been deactivated or deregistered and can no longer be used in
     * CloudFormation operations.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For public third-party extensions, CloudFormation returns <code>null</code>.
     * </p>
     * 
     * @param deprecatedStatus
     *        The deprecation status of the extension version.</p>
     *        <p>
     *        Valid values include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>LIVE</code>: The extension is activated or registered and can be used in CloudFormation operations,
     *        dependent on its provisioning behavior and visibility scope.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DEPRECATED</code>: The extension has been deactivated or deregistered and can no longer be used in
     *        CloudFormation operations.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For public third-party extensions, CloudFormation returns <code>null</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeprecatedStatus
     */

    public DescribeTypeResult withDeprecatedStatus(DeprecatedStatus deprecatedStatus) {
        this.deprecatedStatus = deprecatedStatus.toString();
        return this;
    }

    /**
     * <p>
     * Contains logging configuration information for private extensions. This applies only to private extensions you
     * have registered in your account. For public extensions, both those provided by Amazon and published by third
     * parties, CloudFormation returns <code>null</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_RegisterType.html">RegisterType</a>.
     * </p>
     * 
     * @param loggingConfig
     *        Contains logging configuration information for private extensions. This applies only to private extensions
     *        you have registered in your account. For public extensions, both those provided by Amazon and published by
     *        third parties, CloudFormation returns <code>null</code>. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_RegisterType.html"
     *        >RegisterType</a>.
     */

    public void setLoggingConfig(LoggingConfig loggingConfig) {
        this.loggingConfig = loggingConfig;
    }

    /**
     * <p>
     * Contains logging configuration information for private extensions. This applies only to private extensions you
     * have registered in your account. For public extensions, both those provided by Amazon and published by third
     * parties, CloudFormation returns <code>null</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_RegisterType.html">RegisterType</a>.
     * </p>
     * 
     * @return Contains logging configuration information for private extensions. This applies only to private
     *         extensions you have registered in your account. For public extensions, both those provided by Amazon and
     *         published by third parties, CloudFormation returns <code>null</code>. For more information, see <a
     *         href="https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_RegisterType.html"
     *         >RegisterType</a>.
     */

    public LoggingConfig getLoggingConfig() {
        return this.loggingConfig;
    }

    /**
     * <p>
     * Contains logging configuration information for private extensions. This applies only to private extensions you
     * have registered in your account. For public extensions, both those provided by Amazon and published by third
     * parties, CloudFormation returns <code>null</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_RegisterType.html">RegisterType</a>.
     * </p>
     * 
     * @param loggingConfig
     *        Contains logging configuration information for private extensions. This applies only to private extensions
     *        you have registered in your account. For public extensions, both those provided by Amazon and published by
     *        third parties, CloudFormation returns <code>null</code>. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_RegisterType.html"
     *        >RegisterType</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTypeResult withLoggingConfig(LoggingConfig loggingConfig) {
        setLoggingConfig(loggingConfig);
        return this;
    }

    /**
     * <p>
     * For extensions that are modules, the public third-party extensions that must be activated in your account in
     * order for the module itself to be activated.
     * </p>
     * 
     * @return For extensions that are modules, the public third-party extensions that must be activated in your account
     *         in order for the module itself to be activated.
     */

    public java.util.List<RequiredActivatedType> getRequiredActivatedTypes() {
        if (requiredActivatedTypes == null) {
            requiredActivatedTypes = new com.amazonaws.internal.SdkInternalList<RequiredActivatedType>();
        }
        return requiredActivatedTypes;
    }

    /**
     * <p>
     * For extensions that are modules, the public third-party extensions that must be activated in your account in
     * order for the module itself to be activated.
     * </p>
     * 
     * @param requiredActivatedTypes
     *        For extensions that are modules, the public third-party extensions that must be activated in your account
     *        in order for the module itself to be activated.
     */

    public void setRequiredActivatedTypes(java.util.Collection<RequiredActivatedType> requiredActivatedTypes) {
        if (requiredActivatedTypes == null) {
            this.requiredActivatedTypes = null;
            return;
        }

        this.requiredActivatedTypes = new com.amazonaws.internal.SdkInternalList<RequiredActivatedType>(requiredActivatedTypes);
    }

    /**
     * <p>
     * For extensions that are modules, the public third-party extensions that must be activated in your account in
     * order for the module itself to be activated.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRequiredActivatedTypes(java.util.Collection)} or
     * {@link #withRequiredActivatedTypes(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param requiredActivatedTypes
     *        For extensions that are modules, the public third-party extensions that must be activated in your account
     *        in order for the module itself to be activated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTypeResult withRequiredActivatedTypes(RequiredActivatedType... requiredActivatedTypes) {
        if (this.requiredActivatedTypes == null) {
            setRequiredActivatedTypes(new com.amazonaws.internal.SdkInternalList<RequiredActivatedType>(requiredActivatedTypes.length));
        }
        for (RequiredActivatedType ele : requiredActivatedTypes) {
            this.requiredActivatedTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * For extensions that are modules, the public third-party extensions that must be activated in your account in
     * order for the module itself to be activated.
     * </p>
     * 
     * @param requiredActivatedTypes
     *        For extensions that are modules, the public third-party extensions that must be activated in your account
     *        in order for the module itself to be activated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTypeResult withRequiredActivatedTypes(java.util.Collection<RequiredActivatedType> requiredActivatedTypes) {
        setRequiredActivatedTypes(requiredActivatedTypes);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM execution role used to register the extension. This applies only to
     * private extensions you have registered in your account. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_RegisterType.html">RegisterType</a>.
     * </p>
     * <p/>
     * <p>
     * If the registered extension calls any AWS APIs, you must create an <i> <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles.html">IAM execution role</a> </i> that includes
     * the necessary permissions to call those AWS APIs, and provision that execution role in your account.
     * CloudFormation then assumes that execution role to provide your extension with the appropriate credentials.
     * </p>
     * 
     * @param executionRoleArn
     *        The Amazon Resource Name (ARN) of the IAM execution role used to register the extension. This applies only
     *        to private extensions you have registered in your account. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_RegisterType.html"
     *        >RegisterType</a>.</p>
     *        <p/>
     *        <p>
     *        If the registered extension calls any AWS APIs, you must create an <i> <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles.html">IAM execution role</a> </i> that
     *        includes the necessary permissions to call those AWS APIs, and provision that execution role in your
     *        account. CloudFormation then assumes that execution role to provide your extension with the appropriate
     *        credentials.
     */

    public void setExecutionRoleArn(String executionRoleArn) {
        this.executionRoleArn = executionRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM execution role used to register the extension. This applies only to
     * private extensions you have registered in your account. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_RegisterType.html">RegisterType</a>.
     * </p>
     * <p/>
     * <p>
     * If the registered extension calls any AWS APIs, you must create an <i> <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles.html">IAM execution role</a> </i> that includes
     * the necessary permissions to call those AWS APIs, and provision that execution role in your account.
     * CloudFormation then assumes that execution role to provide your extension with the appropriate credentials.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the IAM execution role used to register the extension. This applies
     *         only to private extensions you have registered in your account. For more information, see <a
     *         href="https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_RegisterType.html"
     *         >RegisterType</a>.</p>
     *         <p/>
     *         <p>
     *         If the registered extension calls any AWS APIs, you must create an <i> <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles.html">IAM execution role</a> </i> that
     *         includes the necessary permissions to call those AWS APIs, and provision that execution role in your
     *         account. CloudFormation then assumes that execution role to provide your extension with the appropriate
     *         credentials.
     */

    public String getExecutionRoleArn() {
        return this.executionRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM execution role used to register the extension. This applies only to
     * private extensions you have registered in your account. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_RegisterType.html">RegisterType</a>.
     * </p>
     * <p/>
     * <p>
     * If the registered extension calls any AWS APIs, you must create an <i> <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles.html">IAM execution role</a> </i> that includes
     * the necessary permissions to call those AWS APIs, and provision that execution role in your account.
     * CloudFormation then assumes that execution role to provide your extension with the appropriate credentials.
     * </p>
     * 
     * @param executionRoleArn
     *        The Amazon Resource Name (ARN) of the IAM execution role used to register the extension. This applies only
     *        to private extensions you have registered in your account. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_RegisterType.html"
     *        >RegisterType</a>.</p>
     *        <p/>
     *        <p>
     *        If the registered extension calls any AWS APIs, you must create an <i> <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles.html">IAM execution role</a> </i> that
     *        includes the necessary permissions to call those AWS APIs, and provision that execution role in your
     *        account. CloudFormation then assumes that execution role to provide your extension with the appropriate
     *        credentials.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTypeResult withExecutionRoleArn(String executionRoleArn) {
        setExecutionRoleArn(executionRoleArn);
        return this;
    }

    /**
     * <p>
     * The scope at which the extension is visible and usable in CloudFormation operations.
     * </p>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PRIVATE</code>: The extension is only visible and usable within the account in which it is registered. AWS
     * CloudFormation marks any extensions you register as <code>PRIVATE</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PUBLIC</code>: The extension is publically visible and usable within any Amazon account.
     * </p>
     * </li>
     * </ul>
     * 
     * @param visibility
     *        The scope at which the extension is visible and usable in CloudFormation operations.</p>
     *        <p>
     *        Valid values include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PRIVATE</code>: The extension is only visible and usable within the account in which it is
     *        registered. AWS CloudFormation marks any extensions you register as <code>PRIVATE</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PUBLIC</code>: The extension is publically visible and usable within any Amazon account.
     *        </p>
     *        </li>
     * @see Visibility
     */

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    /**
     * <p>
     * The scope at which the extension is visible and usable in CloudFormation operations.
     * </p>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PRIVATE</code>: The extension is only visible and usable within the account in which it is registered. AWS
     * CloudFormation marks any extensions you register as <code>PRIVATE</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PUBLIC</code>: The extension is publically visible and usable within any Amazon account.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The scope at which the extension is visible and usable in CloudFormation operations.</p>
     *         <p>
     *         Valid values include:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>PRIVATE</code>: The extension is only visible and usable within the account in which it is
     *         registered. AWS CloudFormation marks any extensions you register as <code>PRIVATE</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>PUBLIC</code>: The extension is publically visible and usable within any Amazon account.
     *         </p>
     *         </li>
     * @see Visibility
     */

    public String getVisibility() {
        return this.visibility;
    }

    /**
     * <p>
     * The scope at which the extension is visible and usable in CloudFormation operations.
     * </p>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PRIVATE</code>: The extension is only visible and usable within the account in which it is registered. AWS
     * CloudFormation marks any extensions you register as <code>PRIVATE</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PUBLIC</code>: The extension is publically visible and usable within any Amazon account.
     * </p>
     * </li>
     * </ul>
     * 
     * @param visibility
     *        The scope at which the extension is visible and usable in CloudFormation operations.</p>
     *        <p>
     *        Valid values include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PRIVATE</code>: The extension is only visible and usable within the account in which it is
     *        registered. AWS CloudFormation marks any extensions you register as <code>PRIVATE</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PUBLIC</code>: The extension is publically visible and usable within any Amazon account.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Visibility
     */

    public DescribeTypeResult withVisibility(String visibility) {
        setVisibility(visibility);
        return this;
    }

    /**
     * <p>
     * The scope at which the extension is visible and usable in CloudFormation operations.
     * </p>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PRIVATE</code>: The extension is only visible and usable within the account in which it is registered. AWS
     * CloudFormation marks any extensions you register as <code>PRIVATE</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PUBLIC</code>: The extension is publically visible and usable within any Amazon account.
     * </p>
     * </li>
     * </ul>
     * 
     * @param visibility
     *        The scope at which the extension is visible and usable in CloudFormation operations.</p>
     *        <p>
     *        Valid values include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PRIVATE</code>: The extension is only visible and usable within the account in which it is
     *        registered. AWS CloudFormation marks any extensions you register as <code>PRIVATE</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PUBLIC</code>: The extension is publically visible and usable within any Amazon account.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Visibility
     */

    public DescribeTypeResult withVisibility(Visibility visibility) {
        this.visibility = visibility.toString();
        return this;
    }

    /**
     * <p>
     * The URL of the source code for the extension.
     * </p>
     * 
     * @param sourceUrl
     *        The URL of the source code for the extension.
     */

    public void setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
    }

    /**
     * <p>
     * The URL of the source code for the extension.
     * </p>
     * 
     * @return The URL of the source code for the extension.
     */

    public String getSourceUrl() {
        return this.sourceUrl;
    }

    /**
     * <p>
     * The URL of the source code for the extension.
     * </p>
     * 
     * @param sourceUrl
     *        The URL of the source code for the extension.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTypeResult withSourceUrl(String sourceUrl) {
        setSourceUrl(sourceUrl);
        return this;
    }

    /**
     * <p>
     * The URL of a page providing detailed documentation for this extension.
     * </p>
     * 
     * @param documentationUrl
     *        The URL of a page providing detailed documentation for this extension.
     */

    public void setDocumentationUrl(String documentationUrl) {
        this.documentationUrl = documentationUrl;
    }

    /**
     * <p>
     * The URL of a page providing detailed documentation for this extension.
     * </p>
     * 
     * @return The URL of a page providing detailed documentation for this extension.
     */

    public String getDocumentationUrl() {
        return this.documentationUrl;
    }

    /**
     * <p>
     * The URL of a page providing detailed documentation for this extension.
     * </p>
     * 
     * @param documentationUrl
     *        The URL of a page providing detailed documentation for this extension.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTypeResult withDocumentationUrl(String documentationUrl) {
        setDocumentationUrl(documentationUrl);
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
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTypeResult withLastUpdated(java.util.Date lastUpdated) {
        setLastUpdated(lastUpdated);
        return this;
    }

    /**
     * <p>
     * When the specified private extension version was registered or activated in your account.
     * </p>
     * 
     * @param timeCreated
     *        When the specified private extension version was registered or activated in your account.
     */

    public void setTimeCreated(java.util.Date timeCreated) {
        this.timeCreated = timeCreated;
    }

    /**
     * <p>
     * When the specified private extension version was registered or activated in your account.
     * </p>
     * 
     * @return When the specified private extension version was registered or activated in your account.
     */

    public java.util.Date getTimeCreated() {
        return this.timeCreated;
    }

    /**
     * <p>
     * When the specified private extension version was registered or activated in your account.
     * </p>
     * 
     * @param timeCreated
     *        When the specified private extension version was registered or activated in your account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTypeResult withTimeCreated(java.util.Date timeCreated) {
        setTimeCreated(timeCreated);
        return this;
    }

    /**
     * <p>
     * A JSON string that represent the current configuration data for the extension in this account and region.
     * </p>
     * <p>
     * To set the configuration data for an extension, use <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_SetTypeConfiguration.html"
     * >SetTypeConfiguration</a>. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/registry-register.html#registry-set-configuration"
     * >Configuring extensions at the account level</a> in the <i>CloudFormation User Guide</i>.
     * </p>
     * 
     * @param configurationSchema
     *        A JSON string that represent the current configuration data for the extension in this account and
     *        region.</p>
     *        <p>
     *        To set the configuration data for an extension, use <a
     *        href="https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_SetTypeConfiguration.html"
     *        >SetTypeConfiguration</a>. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/registry-register.html#registry-set-configuration"
     *        >Configuring extensions at the account level</a> in the <i>CloudFormation User Guide</i>.
     */

    public void setConfigurationSchema(String configurationSchema) {
        this.configurationSchema = configurationSchema;
    }

    /**
     * <p>
     * A JSON string that represent the current configuration data for the extension in this account and region.
     * </p>
     * <p>
     * To set the configuration data for an extension, use <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_SetTypeConfiguration.html"
     * >SetTypeConfiguration</a>. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/registry-register.html#registry-set-configuration"
     * >Configuring extensions at the account level</a> in the <i>CloudFormation User Guide</i>.
     * </p>
     * 
     * @return A JSON string that represent the current configuration data for the extension in this account and
     *         region.</p>
     *         <p>
     *         To set the configuration data for an extension, use <a
     *         href="https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_SetTypeConfiguration.html"
     *         >SetTypeConfiguration</a>. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/registry-register.html#registry-set-configuration"
     *         >Configuring extensions at the account level</a> in the <i>CloudFormation User Guide</i>.
     */

    public String getConfigurationSchema() {
        return this.configurationSchema;
    }

    /**
     * <p>
     * A JSON string that represent the current configuration data for the extension in this account and region.
     * </p>
     * <p>
     * To set the configuration data for an extension, use <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_SetTypeConfiguration.html"
     * >SetTypeConfiguration</a>. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/registry-register.html#registry-set-configuration"
     * >Configuring extensions at the account level</a> in the <i>CloudFormation User Guide</i>.
     * </p>
     * 
     * @param configurationSchema
     *        A JSON string that represent the current configuration data for the extension in this account and
     *        region.</p>
     *        <p>
     *        To set the configuration data for an extension, use <a
     *        href="https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_SetTypeConfiguration.html"
     *        >SetTypeConfiguration</a>. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/registry-register.html#registry-set-configuration"
     *        >Configuring extensions at the account level</a> in the <i>CloudFormation User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTypeResult withConfigurationSchema(String configurationSchema) {
        setConfigurationSchema(configurationSchema);
        return this;
    }

    /**
     * <p>
     * The publisher ID of the extension publisher.
     * </p>
     * <p>
     * This applies only to public third-party extensions. For private registered extensions, and extensions provided by
     * Amazon, CloudFormation returns <code>null</code>.
     * </p>
     * 
     * @param publisherId
     *        The publisher ID of the extension publisher.</p>
     *        <p>
     *        This applies only to public third-party extensions. For private registered extensions, and extensions
     *        provided by Amazon, CloudFormation returns <code>null</code>.
     */

    public void setPublisherId(String publisherId) {
        this.publisherId = publisherId;
    }

    /**
     * <p>
     * The publisher ID of the extension publisher.
     * </p>
     * <p>
     * This applies only to public third-party extensions. For private registered extensions, and extensions provided by
     * Amazon, CloudFormation returns <code>null</code>.
     * </p>
     * 
     * @return The publisher ID of the extension publisher.</p>
     *         <p>
     *         This applies only to public third-party extensions. For private registered extensions, and extensions
     *         provided by Amazon, CloudFormation returns <code>null</code>.
     */

    public String getPublisherId() {
        return this.publisherId;
    }

    /**
     * <p>
     * The publisher ID of the extension publisher.
     * </p>
     * <p>
     * This applies only to public third-party extensions. For private registered extensions, and extensions provided by
     * Amazon, CloudFormation returns <code>null</code>.
     * </p>
     * 
     * @param publisherId
     *        The publisher ID of the extension publisher.</p>
     *        <p>
     *        This applies only to public third-party extensions. For private registered extensions, and extensions
     *        provided by Amazon, CloudFormation returns <code>null</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTypeResult withPublisherId(String publisherId) {
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

    public DescribeTypeResult withOriginalTypeName(String originalTypeName) {
        setOriginalTypeName(originalTypeName);
        return this;
    }

    /**
     * <p>
     * For public extensions that have been activated for this account and region, the Amazon Resource Name (ARN) of the
     * public extension.
     * </p>
     * 
     * @param originalTypeArn
     *        For public extensions that have been activated for this account and region, the Amazon Resource Name (ARN)
     *        of the public extension.
     */

    public void setOriginalTypeArn(String originalTypeArn) {
        this.originalTypeArn = originalTypeArn;
    }

    /**
     * <p>
     * For public extensions that have been activated for this account and region, the Amazon Resource Name (ARN) of the
     * public extension.
     * </p>
     * 
     * @return For public extensions that have been activated for this account and region, the Amazon Resource Name
     *         (ARN) of the public extension.
     */

    public String getOriginalTypeArn() {
        return this.originalTypeArn;
    }

    /**
     * <p>
     * For public extensions that have been activated for this account and region, the Amazon Resource Name (ARN) of the
     * public extension.
     * </p>
     * 
     * @param originalTypeArn
     *        For public extensions that have been activated for this account and region, the Amazon Resource Name (ARN)
     *        of the public extension.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTypeResult withOriginalTypeArn(String originalTypeArn) {
        setOriginalTypeArn(originalTypeArn);
        return this;
    }

    /**
     * <p>
     * The version number of a public third-party extension.
     * </p>
     * <p>
     * This applies only if you specify a public extension you have activated in your account, or specify a public
     * extension without specifying a version. For all other extensions, CloudFormation returns <code>null</code>.
     * </p>
     * 
     * @param publicVersionNumber
     *        The version number of a public third-party extension.</p>
     *        <p>
     *        This applies only if you specify a public extension you have activated in your account, or specify a
     *        public extension without specifying a version. For all other extensions, CloudFormation returns
     *        <code>null</code>.
     */

    public void setPublicVersionNumber(String publicVersionNumber) {
        this.publicVersionNumber = publicVersionNumber;
    }

    /**
     * <p>
     * The version number of a public third-party extension.
     * </p>
     * <p>
     * This applies only if you specify a public extension you have activated in your account, or specify a public
     * extension without specifying a version. For all other extensions, CloudFormation returns <code>null</code>.
     * </p>
     * 
     * @return The version number of a public third-party extension.</p>
     *         <p>
     *         This applies only if you specify a public extension you have activated in your account, or specify a
     *         public extension without specifying a version. For all other extensions, CloudFormation returns
     *         <code>null</code>.
     */

    public String getPublicVersionNumber() {
        return this.publicVersionNumber;
    }

    /**
     * <p>
     * The version number of a public third-party extension.
     * </p>
     * <p>
     * This applies only if you specify a public extension you have activated in your account, or specify a public
     * extension without specifying a version. For all other extensions, CloudFormation returns <code>null</code>.
     * </p>
     * 
     * @param publicVersionNumber
     *        The version number of a public third-party extension.</p>
     *        <p>
     *        This applies only if you specify a public extension you have activated in your account, or specify a
     *        public extension without specifying a version. For all other extensions, CloudFormation returns
     *        <code>null</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTypeResult withPublicVersionNumber(String publicVersionNumber) {
        setPublicVersionNumber(publicVersionNumber);
        return this;
    }

    /**
     * <p>
     * The latest version of a public extension <i>that is available</i> for use.
     * </p>
     * <p>
     * This only applies if you specify a public extension, and you do not specify a version. For all other requests,
     * CloudFormation returns <code>null</code>.
     * </p>
     * 
     * @param latestPublicVersion
     *        The latest version of a public extension <i>that is available</i> for use.</p>
     *        <p>
     *        This only applies if you specify a public extension, and you do not specify a version. For all other
     *        requests, CloudFormation returns <code>null</code>.
     */

    public void setLatestPublicVersion(String latestPublicVersion) {
        this.latestPublicVersion = latestPublicVersion;
    }

    /**
     * <p>
     * The latest version of a public extension <i>that is available</i> for use.
     * </p>
     * <p>
     * This only applies if you specify a public extension, and you do not specify a version. For all other requests,
     * CloudFormation returns <code>null</code>.
     * </p>
     * 
     * @return The latest version of a public extension <i>that is available</i> for use.</p>
     *         <p>
     *         This only applies if you specify a public extension, and you do not specify a version. For all other
     *         requests, CloudFormation returns <code>null</code>.
     */

    public String getLatestPublicVersion() {
        return this.latestPublicVersion;
    }

    /**
     * <p>
     * The latest version of a public extension <i>that is available</i> for use.
     * </p>
     * <p>
     * This only applies if you specify a public extension, and you do not specify a version. For all other requests,
     * CloudFormation returns <code>null</code>.
     * </p>
     * 
     * @param latestPublicVersion
     *        The latest version of a public extension <i>that is available</i> for use.</p>
     *        <p>
     *        This only applies if you specify a public extension, and you do not specify a version. For all other
     *        requests, CloudFormation returns <code>null</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTypeResult withLatestPublicVersion(String latestPublicVersion) {
        setLatestPublicVersion(latestPublicVersion);
        return this;
    }

    /**
     * <p>
     * Whether or not the extension is activated in the account and region.
     * </p>
     * <p>
     * This only applies to public third-party extensions. For all other extensions, CloudFormation returns
     * <code>null</code>.
     * </p>
     * 
     * @param isActivated
     *        Whether or not the extension is activated in the account and region.</p>
     *        <p>
     *        This only applies to public third-party extensions. For all other extensions, CloudFormation returns
     *        <code>null</code>.
     */

    public void setIsActivated(Boolean isActivated) {
        this.isActivated = isActivated;
    }

    /**
     * <p>
     * Whether or not the extension is activated in the account and region.
     * </p>
     * <p>
     * This only applies to public third-party extensions. For all other extensions, CloudFormation returns
     * <code>null</code>.
     * </p>
     * 
     * @return Whether or not the extension is activated in the account and region.</p>
     *         <p>
     *         This only applies to public third-party extensions. For all other extensions, CloudFormation returns
     *         <code>null</code>.
     */

    public Boolean getIsActivated() {
        return this.isActivated;
    }

    /**
     * <p>
     * Whether or not the extension is activated in the account and region.
     * </p>
     * <p>
     * This only applies to public third-party extensions. For all other extensions, CloudFormation returns
     * <code>null</code>.
     * </p>
     * 
     * @param isActivated
     *        Whether or not the extension is activated in the account and region.</p>
     *        <p>
     *        This only applies to public third-party extensions. For all other extensions, CloudFormation returns
     *        <code>null</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTypeResult withIsActivated(Boolean isActivated) {
        setIsActivated(isActivated);
        return this;
    }

    /**
     * <p>
     * Whether or not the extension is activated in the account and region.
     * </p>
     * <p>
     * This only applies to public third-party extensions. For all other extensions, CloudFormation returns
     * <code>null</code>.
     * </p>
     * 
     * @return Whether or not the extension is activated in the account and region.</p>
     *         <p>
     *         This only applies to public third-party extensions. For all other extensions, CloudFormation returns
     *         <code>null</code>.
     */

    public Boolean isActivated() {
        return this.isActivated;
    }

    /**
     * <p>
     * Whether CloudFormation automatically updates the extension in this account and region when a new <i>minor</i>
     * version is published by the extension publisher. Major versions released by the publisher must be manually
     * updated. For more information, see <a
     * href="AWSCloudFormation/latest/UserGuide/registry-public.html#registry-public-enable">Activating public
     * extensions for use in your account</a> in the <i>AWS CloudFormation User Guide</i>.
     * </p>
     * 
     * @param autoUpdate
     *        Whether CloudFormation automatically updates the extension in this account and region when a new
     *        <i>minor</i> version is published by the extension publisher. Major versions released by the publisher
     *        must be manually updated. For more information, see <a
     *        href="AWSCloudFormation/latest/UserGuide/registry-public.html#registry-public-enable">Activating public
     *        extensions for use in your account</a> in the <i>AWS CloudFormation User Guide</i>.
     */

    public void setAutoUpdate(Boolean autoUpdate) {
        this.autoUpdate = autoUpdate;
    }

    /**
     * <p>
     * Whether CloudFormation automatically updates the extension in this account and region when a new <i>minor</i>
     * version is published by the extension publisher. Major versions released by the publisher must be manually
     * updated. For more information, see <a
     * href="AWSCloudFormation/latest/UserGuide/registry-public.html#registry-public-enable">Activating public
     * extensions for use in your account</a> in the <i>AWS CloudFormation User Guide</i>.
     * </p>
     * 
     * @return Whether CloudFormation automatically updates the extension in this account and region when a new
     *         <i>minor</i> version is published by the extension publisher. Major versions released by the publisher
     *         must be manually updated. For more information, see <a
     *         href="AWSCloudFormation/latest/UserGuide/registry-public.html#registry-public-enable">Activating public
     *         extensions for use in your account</a> in the <i>AWS CloudFormation User Guide</i>.
     */

    public Boolean getAutoUpdate() {
        return this.autoUpdate;
    }

    /**
     * <p>
     * Whether CloudFormation automatically updates the extension in this account and region when a new <i>minor</i>
     * version is published by the extension publisher. Major versions released by the publisher must be manually
     * updated. For more information, see <a
     * href="AWSCloudFormation/latest/UserGuide/registry-public.html#registry-public-enable">Activating public
     * extensions for use in your account</a> in the <i>AWS CloudFormation User Guide</i>.
     * </p>
     * 
     * @param autoUpdate
     *        Whether CloudFormation automatically updates the extension in this account and region when a new
     *        <i>minor</i> version is published by the extension publisher. Major versions released by the publisher
     *        must be manually updated. For more information, see <a
     *        href="AWSCloudFormation/latest/UserGuide/registry-public.html#registry-public-enable">Activating public
     *        extensions for use in your account</a> in the <i>AWS CloudFormation User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTypeResult withAutoUpdate(Boolean autoUpdate) {
        setAutoUpdate(autoUpdate);
        return this;
    }

    /**
     * <p>
     * Whether CloudFormation automatically updates the extension in this account and region when a new <i>minor</i>
     * version is published by the extension publisher. Major versions released by the publisher must be manually
     * updated. For more information, see <a
     * href="AWSCloudFormation/latest/UserGuide/registry-public.html#registry-public-enable">Activating public
     * extensions for use in your account</a> in the <i>AWS CloudFormation User Guide</i>.
     * </p>
     * 
     * @return Whether CloudFormation automatically updates the extension in this account and region when a new
     *         <i>minor</i> version is published by the extension publisher. Major versions released by the publisher
     *         must be manually updated. For more information, see <a
     *         href="AWSCloudFormation/latest/UserGuide/registry-public.html#registry-public-enable">Activating public
     *         extensions for use in your account</a> in the <i>AWS CloudFormation User Guide</i>.
     */

    public Boolean isAutoUpdate() {
        return this.autoUpdate;
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getTypeName() != null)
            sb.append("TypeName: ").append(getTypeName()).append(",");
        if (getDefaultVersionId() != null)
            sb.append("DefaultVersionId: ").append(getDefaultVersionId()).append(",");
        if (getIsDefaultVersion() != null)
            sb.append("IsDefaultVersion: ").append(getIsDefaultVersion()).append(",");
        if (getTypeTestsStatus() != null)
            sb.append("TypeTestsStatus: ").append(getTypeTestsStatus()).append(",");
        if (getTypeTestsStatusDescription() != null)
            sb.append("TypeTestsStatusDescription: ").append(getTypeTestsStatusDescription()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getSchema() != null)
            sb.append("Schema: ").append(getSchema()).append(",");
        if (getProvisioningType() != null)
            sb.append("ProvisioningType: ").append(getProvisioningType()).append(",");
        if (getDeprecatedStatus() != null)
            sb.append("DeprecatedStatus: ").append(getDeprecatedStatus()).append(",");
        if (getLoggingConfig() != null)
            sb.append("LoggingConfig: ").append(getLoggingConfig()).append(",");
        if (getRequiredActivatedTypes() != null)
            sb.append("RequiredActivatedTypes: ").append(getRequiredActivatedTypes()).append(",");
        if (getExecutionRoleArn() != null)
            sb.append("ExecutionRoleArn: ").append(getExecutionRoleArn()).append(",");
        if (getVisibility() != null)
            sb.append("Visibility: ").append(getVisibility()).append(",");
        if (getSourceUrl() != null)
            sb.append("SourceUrl: ").append(getSourceUrl()).append(",");
        if (getDocumentationUrl() != null)
            sb.append("DocumentationUrl: ").append(getDocumentationUrl()).append(",");
        if (getLastUpdated() != null)
            sb.append("LastUpdated: ").append(getLastUpdated()).append(",");
        if (getTimeCreated() != null)
            sb.append("TimeCreated: ").append(getTimeCreated()).append(",");
        if (getConfigurationSchema() != null)
            sb.append("ConfigurationSchema: ").append(getConfigurationSchema()).append(",");
        if (getPublisherId() != null)
            sb.append("PublisherId: ").append(getPublisherId()).append(",");
        if (getOriginalTypeName() != null)
            sb.append("OriginalTypeName: ").append(getOriginalTypeName()).append(",");
        if (getOriginalTypeArn() != null)
            sb.append("OriginalTypeArn: ").append(getOriginalTypeArn()).append(",");
        if (getPublicVersionNumber() != null)
            sb.append("PublicVersionNumber: ").append(getPublicVersionNumber()).append(",");
        if (getLatestPublicVersion() != null)
            sb.append("LatestPublicVersion: ").append(getLatestPublicVersion()).append(",");
        if (getIsActivated() != null)
            sb.append("IsActivated: ").append(getIsActivated()).append(",");
        if (getAutoUpdate() != null)
            sb.append("AutoUpdate: ").append(getAutoUpdate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeTypeResult == false)
            return false;
        DescribeTypeResult other = (DescribeTypeResult) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
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
        if (other.getIsDefaultVersion() == null ^ this.getIsDefaultVersion() == null)
            return false;
        if (other.getIsDefaultVersion() != null && other.getIsDefaultVersion().equals(this.getIsDefaultVersion()) == false)
            return false;
        if (other.getTypeTestsStatus() == null ^ this.getTypeTestsStatus() == null)
            return false;
        if (other.getTypeTestsStatus() != null && other.getTypeTestsStatus().equals(this.getTypeTestsStatus()) == false)
            return false;
        if (other.getTypeTestsStatusDescription() == null ^ this.getTypeTestsStatusDescription() == null)
            return false;
        if (other.getTypeTestsStatusDescription() != null && other.getTypeTestsStatusDescription().equals(this.getTypeTestsStatusDescription()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getSchema() == null ^ this.getSchema() == null)
            return false;
        if (other.getSchema() != null && other.getSchema().equals(this.getSchema()) == false)
            return false;
        if (other.getProvisioningType() == null ^ this.getProvisioningType() == null)
            return false;
        if (other.getProvisioningType() != null && other.getProvisioningType().equals(this.getProvisioningType()) == false)
            return false;
        if (other.getDeprecatedStatus() == null ^ this.getDeprecatedStatus() == null)
            return false;
        if (other.getDeprecatedStatus() != null && other.getDeprecatedStatus().equals(this.getDeprecatedStatus()) == false)
            return false;
        if (other.getLoggingConfig() == null ^ this.getLoggingConfig() == null)
            return false;
        if (other.getLoggingConfig() != null && other.getLoggingConfig().equals(this.getLoggingConfig()) == false)
            return false;
        if (other.getRequiredActivatedTypes() == null ^ this.getRequiredActivatedTypes() == null)
            return false;
        if (other.getRequiredActivatedTypes() != null && other.getRequiredActivatedTypes().equals(this.getRequiredActivatedTypes()) == false)
            return false;
        if (other.getExecutionRoleArn() == null ^ this.getExecutionRoleArn() == null)
            return false;
        if (other.getExecutionRoleArn() != null && other.getExecutionRoleArn().equals(this.getExecutionRoleArn()) == false)
            return false;
        if (other.getVisibility() == null ^ this.getVisibility() == null)
            return false;
        if (other.getVisibility() != null && other.getVisibility().equals(this.getVisibility()) == false)
            return false;
        if (other.getSourceUrl() == null ^ this.getSourceUrl() == null)
            return false;
        if (other.getSourceUrl() != null && other.getSourceUrl().equals(this.getSourceUrl()) == false)
            return false;
        if (other.getDocumentationUrl() == null ^ this.getDocumentationUrl() == null)
            return false;
        if (other.getDocumentationUrl() != null && other.getDocumentationUrl().equals(this.getDocumentationUrl()) == false)
            return false;
        if (other.getLastUpdated() == null ^ this.getLastUpdated() == null)
            return false;
        if (other.getLastUpdated() != null && other.getLastUpdated().equals(this.getLastUpdated()) == false)
            return false;
        if (other.getTimeCreated() == null ^ this.getTimeCreated() == null)
            return false;
        if (other.getTimeCreated() != null && other.getTimeCreated().equals(this.getTimeCreated()) == false)
            return false;
        if (other.getConfigurationSchema() == null ^ this.getConfigurationSchema() == null)
            return false;
        if (other.getConfigurationSchema() != null && other.getConfigurationSchema().equals(this.getConfigurationSchema()) == false)
            return false;
        if (other.getPublisherId() == null ^ this.getPublisherId() == null)
            return false;
        if (other.getPublisherId() != null && other.getPublisherId().equals(this.getPublisherId()) == false)
            return false;
        if (other.getOriginalTypeName() == null ^ this.getOriginalTypeName() == null)
            return false;
        if (other.getOriginalTypeName() != null && other.getOriginalTypeName().equals(this.getOriginalTypeName()) == false)
            return false;
        if (other.getOriginalTypeArn() == null ^ this.getOriginalTypeArn() == null)
            return false;
        if (other.getOriginalTypeArn() != null && other.getOriginalTypeArn().equals(this.getOriginalTypeArn()) == false)
            return false;
        if (other.getPublicVersionNumber() == null ^ this.getPublicVersionNumber() == null)
            return false;
        if (other.getPublicVersionNumber() != null && other.getPublicVersionNumber().equals(this.getPublicVersionNumber()) == false)
            return false;
        if (other.getLatestPublicVersion() == null ^ this.getLatestPublicVersion() == null)
            return false;
        if (other.getLatestPublicVersion() != null && other.getLatestPublicVersion().equals(this.getLatestPublicVersion()) == false)
            return false;
        if (other.getIsActivated() == null ^ this.getIsActivated() == null)
            return false;
        if (other.getIsActivated() != null && other.getIsActivated().equals(this.getIsActivated()) == false)
            return false;
        if (other.getAutoUpdate() == null ^ this.getAutoUpdate() == null)
            return false;
        if (other.getAutoUpdate() != null && other.getAutoUpdate().equals(this.getAutoUpdate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getTypeName() == null) ? 0 : getTypeName().hashCode());
        hashCode = prime * hashCode + ((getDefaultVersionId() == null) ? 0 : getDefaultVersionId().hashCode());
        hashCode = prime * hashCode + ((getIsDefaultVersion() == null) ? 0 : getIsDefaultVersion().hashCode());
        hashCode = prime * hashCode + ((getTypeTestsStatus() == null) ? 0 : getTypeTestsStatus().hashCode());
        hashCode = prime * hashCode + ((getTypeTestsStatusDescription() == null) ? 0 : getTypeTestsStatusDescription().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getSchema() == null) ? 0 : getSchema().hashCode());
        hashCode = prime * hashCode + ((getProvisioningType() == null) ? 0 : getProvisioningType().hashCode());
        hashCode = prime * hashCode + ((getDeprecatedStatus() == null) ? 0 : getDeprecatedStatus().hashCode());
        hashCode = prime * hashCode + ((getLoggingConfig() == null) ? 0 : getLoggingConfig().hashCode());
        hashCode = prime * hashCode + ((getRequiredActivatedTypes() == null) ? 0 : getRequiredActivatedTypes().hashCode());
        hashCode = prime * hashCode + ((getExecutionRoleArn() == null) ? 0 : getExecutionRoleArn().hashCode());
        hashCode = prime * hashCode + ((getVisibility() == null) ? 0 : getVisibility().hashCode());
        hashCode = prime * hashCode + ((getSourceUrl() == null) ? 0 : getSourceUrl().hashCode());
        hashCode = prime * hashCode + ((getDocumentationUrl() == null) ? 0 : getDocumentationUrl().hashCode());
        hashCode = prime * hashCode + ((getLastUpdated() == null) ? 0 : getLastUpdated().hashCode());
        hashCode = prime * hashCode + ((getTimeCreated() == null) ? 0 : getTimeCreated().hashCode());
        hashCode = prime * hashCode + ((getConfigurationSchema() == null) ? 0 : getConfigurationSchema().hashCode());
        hashCode = prime * hashCode + ((getPublisherId() == null) ? 0 : getPublisherId().hashCode());
        hashCode = prime * hashCode + ((getOriginalTypeName() == null) ? 0 : getOriginalTypeName().hashCode());
        hashCode = prime * hashCode + ((getOriginalTypeArn() == null) ? 0 : getOriginalTypeArn().hashCode());
        hashCode = prime * hashCode + ((getPublicVersionNumber() == null) ? 0 : getPublicVersionNumber().hashCode());
        hashCode = prime * hashCode + ((getLatestPublicVersion() == null) ? 0 : getLatestPublicVersion().hashCode());
        hashCode = prime * hashCode + ((getIsActivated() == null) ? 0 : getIsActivated().hashCode());
        hashCode = prime * hashCode + ((getAutoUpdate() == null) ? 0 : getAutoUpdate().hashCode());
        return hashCode;
    }

    @Override
    public DescribeTypeResult clone() {
        try {
            return (DescribeTypeResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
