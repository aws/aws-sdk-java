/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
     * The Amazon Resource Name (ARN) of the type.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The kind of type.
     * </p>
     * <p>
     * Currently the only valid value is <code>RESOURCE</code>.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The name of the registered type.
     * </p>
     */
    private String typeName;
    /**
     * <p>
     * The ID of the default version of the type. The default version is used when the type version is not specified.
     * </p>
     * <p>
     * To set the default version of a type, use <code> <a>SetTypeDefaultVersion</a> </code>.
     * </p>
     */
    private String defaultVersionId;
    /**
     * <p>
     * The description of the registered type.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The schema that defines the type.
     * </p>
     * <p>
     * For more information on type schemas, see <a
     * href="https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/resource-type-schema.html">Resource
     * Provider Schema</a> in the <i>CloudFormation CLI User Guide</i>.
     * </p>
     */
    private String schema;
    /**
     * <p>
     * The provisioning behavior of the type. AWS CloudFormation determines the provisioning type during registration,
     * based on the types of handlers in the schema handler package submitted.
     * </p>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FULLY_MUTABLE</code>: The type includes an update handler to process updates to the type during stack
     * update operations.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IMMUTABLE</code>: The type does not include an update handler, so the type cannot be updated and must
     * instead be replaced during stack update operations.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NON_PROVISIONABLE</code>: The type does not include all of the following handlers, and therefore cannot
     * actually be provisioned.
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
     * The deprecation status of the type.
     * </p>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LIVE</code>: The type is registered and can be used in CloudFormation operations, dependent on its
     * provisioning behavior and visibility scope.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DEPRECATED</code>: The type has been deregistered and can no longer be used in CloudFormation operations.
     * </p>
     * </li>
     * </ul>
     */
    private String deprecatedStatus;
    /**
     * <p>
     * Contains logging configuration information for a type.
     * </p>
     */
    private LoggingConfig loggingConfig;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM execution role used to register the type. If your resource type calls
     * AWS APIs in any of its handlers, you must create an <i> <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles.html">IAM execution role</a> </i> that includes
     * the necessary permissions to call those AWS APIs, and provision that execution role in your account.
     * CloudFormation then assumes that execution role to provide your resource type with the appropriate credentials.
     * </p>
     */
    private String executionRoleArn;
    /**
     * <p>
     * The scope at which the type is visible and usable in CloudFormation operations.
     * </p>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PRIVATE</code>: The type is only visible and usable within the account in which it is registered.
     * Currently, AWS CloudFormation marks any types you register as <code>PRIVATE</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PUBLIC</code>: The type is publically visible and usable within any Amazon account.
     * </p>
     * </li>
     * </ul>
     */
    private String visibility;
    /**
     * <p>
     * The URL of the source code for the type.
     * </p>
     */
    private String sourceUrl;
    /**
     * <p>
     * The URL of a page providing detailed documentation for this type.
     * </p>
     */
    private String documentationUrl;
    /**
     * <p>
     * When the specified type version was registered.
     * </p>
     */
    private java.util.Date lastUpdated;
    /**
     * <p>
     * When the specified type version was registered.
     * </p>
     */
    private java.util.Date timeCreated;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the type.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the type.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the type.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the type.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the type.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTypeResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The kind of type.
     * </p>
     * <p>
     * Currently the only valid value is <code>RESOURCE</code>.
     * </p>
     * 
     * @param type
     *        The kind of type. </p>
     *        <p>
     *        Currently the only valid value is <code>RESOURCE</code>.
     * @see RegistryType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The kind of type.
     * </p>
     * <p>
     * Currently the only valid value is <code>RESOURCE</code>.
     * </p>
     * 
     * @return The kind of type. </p>
     *         <p>
     *         Currently the only valid value is <code>RESOURCE</code>.
     * @see RegistryType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The kind of type.
     * </p>
     * <p>
     * Currently the only valid value is <code>RESOURCE</code>.
     * </p>
     * 
     * @param type
     *        The kind of type. </p>
     *        <p>
     *        Currently the only valid value is <code>RESOURCE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RegistryType
     */

    public DescribeTypeResult withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The kind of type.
     * </p>
     * <p>
     * Currently the only valid value is <code>RESOURCE</code>.
     * </p>
     * 
     * @param type
     *        The kind of type. </p>
     *        <p>
     *        Currently the only valid value is <code>RESOURCE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RegistryType
     */

    public DescribeTypeResult withType(RegistryType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The name of the registered type.
     * </p>
     * 
     * @param typeName
     *        The name of the registered type.
     */

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    /**
     * <p>
     * The name of the registered type.
     * </p>
     * 
     * @return The name of the registered type.
     */

    public String getTypeName() {
        return this.typeName;
    }

    /**
     * <p>
     * The name of the registered type.
     * </p>
     * 
     * @param typeName
     *        The name of the registered type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTypeResult withTypeName(String typeName) {
        setTypeName(typeName);
        return this;
    }

    /**
     * <p>
     * The ID of the default version of the type. The default version is used when the type version is not specified.
     * </p>
     * <p>
     * To set the default version of a type, use <code> <a>SetTypeDefaultVersion</a> </code>.
     * </p>
     * 
     * @param defaultVersionId
     *        The ID of the default version of the type. The default version is used when the type version is not
     *        specified.</p>
     *        <p>
     *        To set the default version of a type, use <code> <a>SetTypeDefaultVersion</a> </code>.
     */

    public void setDefaultVersionId(String defaultVersionId) {
        this.defaultVersionId = defaultVersionId;
    }

    /**
     * <p>
     * The ID of the default version of the type. The default version is used when the type version is not specified.
     * </p>
     * <p>
     * To set the default version of a type, use <code> <a>SetTypeDefaultVersion</a> </code>.
     * </p>
     * 
     * @return The ID of the default version of the type. The default version is used when the type version is not
     *         specified.</p>
     *         <p>
     *         To set the default version of a type, use <code> <a>SetTypeDefaultVersion</a> </code>.
     */

    public String getDefaultVersionId() {
        return this.defaultVersionId;
    }

    /**
     * <p>
     * The ID of the default version of the type. The default version is used when the type version is not specified.
     * </p>
     * <p>
     * To set the default version of a type, use <code> <a>SetTypeDefaultVersion</a> </code>.
     * </p>
     * 
     * @param defaultVersionId
     *        The ID of the default version of the type. The default version is used when the type version is not
     *        specified.</p>
     *        <p>
     *        To set the default version of a type, use <code> <a>SetTypeDefaultVersion</a> </code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTypeResult withDefaultVersionId(String defaultVersionId) {
        setDefaultVersionId(defaultVersionId);
        return this;
    }

    /**
     * <p>
     * The description of the registered type.
     * </p>
     * 
     * @param description
     *        The description of the registered type.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the registered type.
     * </p>
     * 
     * @return The description of the registered type.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the registered type.
     * </p>
     * 
     * @param description
     *        The description of the registered type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTypeResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The schema that defines the type.
     * </p>
     * <p>
     * For more information on type schemas, see <a
     * href="https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/resource-type-schema.html">Resource
     * Provider Schema</a> in the <i>CloudFormation CLI User Guide</i>.
     * </p>
     * 
     * @param schema
     *        The schema that defines the type.</p>
     *        <p>
     *        For more information on type schemas, see <a
     *        href="https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/resource-type-schema.html">Resource
     *        Provider Schema</a> in the <i>CloudFormation CLI User Guide</i>.
     */

    public void setSchema(String schema) {
        this.schema = schema;
    }

    /**
     * <p>
     * The schema that defines the type.
     * </p>
     * <p>
     * For more information on type schemas, see <a
     * href="https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/resource-type-schema.html">Resource
     * Provider Schema</a> in the <i>CloudFormation CLI User Guide</i>.
     * </p>
     * 
     * @return The schema that defines the type.</p>
     *         <p>
     *         For more information on type schemas, see <a
     *         href="https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/resource-type-schema.html">Resource
     *         Provider Schema</a> in the <i>CloudFormation CLI User Guide</i>.
     */

    public String getSchema() {
        return this.schema;
    }

    /**
     * <p>
     * The schema that defines the type.
     * </p>
     * <p>
     * For more information on type schemas, see <a
     * href="https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/resource-type-schema.html">Resource
     * Provider Schema</a> in the <i>CloudFormation CLI User Guide</i>.
     * </p>
     * 
     * @param schema
     *        The schema that defines the type.</p>
     *        <p>
     *        For more information on type schemas, see <a
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
     * The provisioning behavior of the type. AWS CloudFormation determines the provisioning type during registration,
     * based on the types of handlers in the schema handler package submitted.
     * </p>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FULLY_MUTABLE</code>: The type includes an update handler to process updates to the type during stack
     * update operations.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IMMUTABLE</code>: The type does not include an update handler, so the type cannot be updated and must
     * instead be replaced during stack update operations.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NON_PROVISIONABLE</code>: The type does not include all of the following handlers, and therefore cannot
     * actually be provisioned.
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
     *        The provisioning behavior of the type. AWS CloudFormation determines the provisioning type during
     *        registration, based on the types of handlers in the schema handler package submitted.</p>
     *        <p>
     *        Valid values include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>FULLY_MUTABLE</code>: The type includes an update handler to process updates to the type during
     *        stack update operations.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IMMUTABLE</code>: The type does not include an update handler, so the type cannot be updated and
     *        must instead be replaced during stack update operations.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NON_PROVISIONABLE</code>: The type does not include all of the following handlers, and therefore
     *        cannot actually be provisioned.
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
     * The provisioning behavior of the type. AWS CloudFormation determines the provisioning type during registration,
     * based on the types of handlers in the schema handler package submitted.
     * </p>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FULLY_MUTABLE</code>: The type includes an update handler to process updates to the type during stack
     * update operations.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IMMUTABLE</code>: The type does not include an update handler, so the type cannot be updated and must
     * instead be replaced during stack update operations.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NON_PROVISIONABLE</code>: The type does not include all of the following handlers, and therefore cannot
     * actually be provisioned.
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
     * @return The provisioning behavior of the type. AWS CloudFormation determines the provisioning type during
     *         registration, based on the types of handlers in the schema handler package submitted.</p>
     *         <p>
     *         Valid values include:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>FULLY_MUTABLE</code>: The type includes an update handler to process updates to the type during
     *         stack update operations.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>IMMUTABLE</code>: The type does not include an update handler, so the type cannot be updated and
     *         must instead be replaced during stack update operations.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NON_PROVISIONABLE</code>: The type does not include all of the following handlers, and therefore
     *         cannot actually be provisioned.
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
     * The provisioning behavior of the type. AWS CloudFormation determines the provisioning type during registration,
     * based on the types of handlers in the schema handler package submitted.
     * </p>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FULLY_MUTABLE</code>: The type includes an update handler to process updates to the type during stack
     * update operations.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IMMUTABLE</code>: The type does not include an update handler, so the type cannot be updated and must
     * instead be replaced during stack update operations.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NON_PROVISIONABLE</code>: The type does not include all of the following handlers, and therefore cannot
     * actually be provisioned.
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
     *        The provisioning behavior of the type. AWS CloudFormation determines the provisioning type during
     *        registration, based on the types of handlers in the schema handler package submitted.</p>
     *        <p>
     *        Valid values include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>FULLY_MUTABLE</code>: The type includes an update handler to process updates to the type during
     *        stack update operations.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IMMUTABLE</code>: The type does not include an update handler, so the type cannot be updated and
     *        must instead be replaced during stack update operations.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NON_PROVISIONABLE</code>: The type does not include all of the following handlers, and therefore
     *        cannot actually be provisioned.
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
     * The provisioning behavior of the type. AWS CloudFormation determines the provisioning type during registration,
     * based on the types of handlers in the schema handler package submitted.
     * </p>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FULLY_MUTABLE</code>: The type includes an update handler to process updates to the type during stack
     * update operations.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IMMUTABLE</code>: The type does not include an update handler, so the type cannot be updated and must
     * instead be replaced during stack update operations.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NON_PROVISIONABLE</code>: The type does not include all of the following handlers, and therefore cannot
     * actually be provisioned.
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
     *        The provisioning behavior of the type. AWS CloudFormation determines the provisioning type during
     *        registration, based on the types of handlers in the schema handler package submitted.</p>
     *        <p>
     *        Valid values include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>FULLY_MUTABLE</code>: The type includes an update handler to process updates to the type during
     *        stack update operations.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IMMUTABLE</code>: The type does not include an update handler, so the type cannot be updated and
     *        must instead be replaced during stack update operations.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NON_PROVISIONABLE</code>: The type does not include all of the following handlers, and therefore
     *        cannot actually be provisioned.
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
     * The deprecation status of the type.
     * </p>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LIVE</code>: The type is registered and can be used in CloudFormation operations, dependent on its
     * provisioning behavior and visibility scope.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DEPRECATED</code>: The type has been deregistered and can no longer be used in CloudFormation operations.
     * </p>
     * </li>
     * </ul>
     * 
     * @param deprecatedStatus
     *        The deprecation status of the type.</p>
     *        <p>
     *        Valid values include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>LIVE</code>: The type is registered and can be used in CloudFormation operations, dependent on its
     *        provisioning behavior and visibility scope.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DEPRECATED</code>: The type has been deregistered and can no longer be used in CloudFormation
     *        operations.
     *        </p>
     *        </li>
     * @see DeprecatedStatus
     */

    public void setDeprecatedStatus(String deprecatedStatus) {
        this.deprecatedStatus = deprecatedStatus;
    }

    /**
     * <p>
     * The deprecation status of the type.
     * </p>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LIVE</code>: The type is registered and can be used in CloudFormation operations, dependent on its
     * provisioning behavior and visibility scope.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DEPRECATED</code>: The type has been deregistered and can no longer be used in CloudFormation operations.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The deprecation status of the type.</p>
     *         <p>
     *         Valid values include:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>LIVE</code>: The type is registered and can be used in CloudFormation operations, dependent on its
     *         provisioning behavior and visibility scope.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DEPRECATED</code>: The type has been deregistered and can no longer be used in CloudFormation
     *         operations.
     *         </p>
     *         </li>
     * @see DeprecatedStatus
     */

    public String getDeprecatedStatus() {
        return this.deprecatedStatus;
    }

    /**
     * <p>
     * The deprecation status of the type.
     * </p>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LIVE</code>: The type is registered and can be used in CloudFormation operations, dependent on its
     * provisioning behavior and visibility scope.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DEPRECATED</code>: The type has been deregistered and can no longer be used in CloudFormation operations.
     * </p>
     * </li>
     * </ul>
     * 
     * @param deprecatedStatus
     *        The deprecation status of the type.</p>
     *        <p>
     *        Valid values include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>LIVE</code>: The type is registered and can be used in CloudFormation operations, dependent on its
     *        provisioning behavior and visibility scope.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DEPRECATED</code>: The type has been deregistered and can no longer be used in CloudFormation
     *        operations.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeprecatedStatus
     */

    public DescribeTypeResult withDeprecatedStatus(String deprecatedStatus) {
        setDeprecatedStatus(deprecatedStatus);
        return this;
    }

    /**
     * <p>
     * The deprecation status of the type.
     * </p>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LIVE</code>: The type is registered and can be used in CloudFormation operations, dependent on its
     * provisioning behavior and visibility scope.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DEPRECATED</code>: The type has been deregistered and can no longer be used in CloudFormation operations.
     * </p>
     * </li>
     * </ul>
     * 
     * @param deprecatedStatus
     *        The deprecation status of the type.</p>
     *        <p>
     *        Valid values include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>LIVE</code>: The type is registered and can be used in CloudFormation operations, dependent on its
     *        provisioning behavior and visibility scope.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DEPRECATED</code>: The type has been deregistered and can no longer be used in CloudFormation
     *        operations.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeprecatedStatus
     */

    public DescribeTypeResult withDeprecatedStatus(DeprecatedStatus deprecatedStatus) {
        this.deprecatedStatus = deprecatedStatus.toString();
        return this;
    }

    /**
     * <p>
     * Contains logging configuration information for a type.
     * </p>
     * 
     * @param loggingConfig
     *        Contains logging configuration information for a type.
     */

    public void setLoggingConfig(LoggingConfig loggingConfig) {
        this.loggingConfig = loggingConfig;
    }

    /**
     * <p>
     * Contains logging configuration information for a type.
     * </p>
     * 
     * @return Contains logging configuration information for a type.
     */

    public LoggingConfig getLoggingConfig() {
        return this.loggingConfig;
    }

    /**
     * <p>
     * Contains logging configuration information for a type.
     * </p>
     * 
     * @param loggingConfig
     *        Contains logging configuration information for a type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTypeResult withLoggingConfig(LoggingConfig loggingConfig) {
        setLoggingConfig(loggingConfig);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM execution role used to register the type. If your resource type calls
     * AWS APIs in any of its handlers, you must create an <i> <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles.html">IAM execution role</a> </i> that includes
     * the necessary permissions to call those AWS APIs, and provision that execution role in your account.
     * CloudFormation then assumes that execution role to provide your resource type with the appropriate credentials.
     * </p>
     * 
     * @param executionRoleArn
     *        The Amazon Resource Name (ARN) of the IAM execution role used to register the type. If your resource type
     *        calls AWS APIs in any of its handlers, you must create an <i> <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles.html">IAM execution role</a> </i> that
     *        includes the necessary permissions to call those AWS APIs, and provision that execution role in your
     *        account. CloudFormation then assumes that execution role to provide your resource type with the
     *        appropriate credentials.
     */

    public void setExecutionRoleArn(String executionRoleArn) {
        this.executionRoleArn = executionRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM execution role used to register the type. If your resource type calls
     * AWS APIs in any of its handlers, you must create an <i> <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles.html">IAM execution role</a> </i> that includes
     * the necessary permissions to call those AWS APIs, and provision that execution role in your account.
     * CloudFormation then assumes that execution role to provide your resource type with the appropriate credentials.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the IAM execution role used to register the type. If your resource type
     *         calls AWS APIs in any of its handlers, you must create an <i> <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles.html">IAM execution role</a> </i> that
     *         includes the necessary permissions to call those AWS APIs, and provision that execution role in your
     *         account. CloudFormation then assumes that execution role to provide your resource type with the
     *         appropriate credentials.
     */

    public String getExecutionRoleArn() {
        return this.executionRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM execution role used to register the type. If your resource type calls
     * AWS APIs in any of its handlers, you must create an <i> <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles.html">IAM execution role</a> </i> that includes
     * the necessary permissions to call those AWS APIs, and provision that execution role in your account.
     * CloudFormation then assumes that execution role to provide your resource type with the appropriate credentials.
     * </p>
     * 
     * @param executionRoleArn
     *        The Amazon Resource Name (ARN) of the IAM execution role used to register the type. If your resource type
     *        calls AWS APIs in any of its handlers, you must create an <i> <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles.html">IAM execution role</a> </i> that
     *        includes the necessary permissions to call those AWS APIs, and provision that execution role in your
     *        account. CloudFormation then assumes that execution role to provide your resource type with the
     *        appropriate credentials.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTypeResult withExecutionRoleArn(String executionRoleArn) {
        setExecutionRoleArn(executionRoleArn);
        return this;
    }

    /**
     * <p>
     * The scope at which the type is visible and usable in CloudFormation operations.
     * </p>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PRIVATE</code>: The type is only visible and usable within the account in which it is registered.
     * Currently, AWS CloudFormation marks any types you register as <code>PRIVATE</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PUBLIC</code>: The type is publically visible and usable within any Amazon account.
     * </p>
     * </li>
     * </ul>
     * 
     * @param visibility
     *        The scope at which the type is visible and usable in CloudFormation operations.</p>
     *        <p>
     *        Valid values include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PRIVATE</code>: The type is only visible and usable within the account in which it is registered.
     *        Currently, AWS CloudFormation marks any types you register as <code>PRIVATE</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PUBLIC</code>: The type is publically visible and usable within any Amazon account.
     *        </p>
     *        </li>
     * @see Visibility
     */

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    /**
     * <p>
     * The scope at which the type is visible and usable in CloudFormation operations.
     * </p>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PRIVATE</code>: The type is only visible and usable within the account in which it is registered.
     * Currently, AWS CloudFormation marks any types you register as <code>PRIVATE</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PUBLIC</code>: The type is publically visible and usable within any Amazon account.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The scope at which the type is visible and usable in CloudFormation operations.</p>
     *         <p>
     *         Valid values include:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>PRIVATE</code>: The type is only visible and usable within the account in which it is registered.
     *         Currently, AWS CloudFormation marks any types you register as <code>PRIVATE</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>PUBLIC</code>: The type is publically visible and usable within any Amazon account.
     *         </p>
     *         </li>
     * @see Visibility
     */

    public String getVisibility() {
        return this.visibility;
    }

    /**
     * <p>
     * The scope at which the type is visible and usable in CloudFormation operations.
     * </p>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PRIVATE</code>: The type is only visible and usable within the account in which it is registered.
     * Currently, AWS CloudFormation marks any types you register as <code>PRIVATE</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PUBLIC</code>: The type is publically visible and usable within any Amazon account.
     * </p>
     * </li>
     * </ul>
     * 
     * @param visibility
     *        The scope at which the type is visible and usable in CloudFormation operations.</p>
     *        <p>
     *        Valid values include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PRIVATE</code>: The type is only visible and usable within the account in which it is registered.
     *        Currently, AWS CloudFormation marks any types you register as <code>PRIVATE</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PUBLIC</code>: The type is publically visible and usable within any Amazon account.
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
     * The scope at which the type is visible and usable in CloudFormation operations.
     * </p>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PRIVATE</code>: The type is only visible and usable within the account in which it is registered.
     * Currently, AWS CloudFormation marks any types you register as <code>PRIVATE</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PUBLIC</code>: The type is publically visible and usable within any Amazon account.
     * </p>
     * </li>
     * </ul>
     * 
     * @param visibility
     *        The scope at which the type is visible and usable in CloudFormation operations.</p>
     *        <p>
     *        Valid values include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PRIVATE</code>: The type is only visible and usable within the account in which it is registered.
     *        Currently, AWS CloudFormation marks any types you register as <code>PRIVATE</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PUBLIC</code>: The type is publically visible and usable within any Amazon account.
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
     * The URL of the source code for the type.
     * </p>
     * 
     * @param sourceUrl
     *        The URL of the source code for the type.
     */

    public void setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
    }

    /**
     * <p>
     * The URL of the source code for the type.
     * </p>
     * 
     * @return The URL of the source code for the type.
     */

    public String getSourceUrl() {
        return this.sourceUrl;
    }

    /**
     * <p>
     * The URL of the source code for the type.
     * </p>
     * 
     * @param sourceUrl
     *        The URL of the source code for the type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTypeResult withSourceUrl(String sourceUrl) {
        setSourceUrl(sourceUrl);
        return this;
    }

    /**
     * <p>
     * The URL of a page providing detailed documentation for this type.
     * </p>
     * 
     * @param documentationUrl
     *        The URL of a page providing detailed documentation for this type.
     */

    public void setDocumentationUrl(String documentationUrl) {
        this.documentationUrl = documentationUrl;
    }

    /**
     * <p>
     * The URL of a page providing detailed documentation for this type.
     * </p>
     * 
     * @return The URL of a page providing detailed documentation for this type.
     */

    public String getDocumentationUrl() {
        return this.documentationUrl;
    }

    /**
     * <p>
     * The URL of a page providing detailed documentation for this type.
     * </p>
     * 
     * @param documentationUrl
     *        The URL of a page providing detailed documentation for this type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTypeResult withDocumentationUrl(String documentationUrl) {
        setDocumentationUrl(documentationUrl);
        return this;
    }

    /**
     * <p>
     * When the specified type version was registered.
     * </p>
     * 
     * @param lastUpdated
     *        When the specified type version was registered.
     */

    public void setLastUpdated(java.util.Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    /**
     * <p>
     * When the specified type version was registered.
     * </p>
     * 
     * @return When the specified type version was registered.
     */

    public java.util.Date getLastUpdated() {
        return this.lastUpdated;
    }

    /**
     * <p>
     * When the specified type version was registered.
     * </p>
     * 
     * @param lastUpdated
     *        When the specified type version was registered.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTypeResult withLastUpdated(java.util.Date lastUpdated) {
        setLastUpdated(lastUpdated);
        return this;
    }

    /**
     * <p>
     * When the specified type version was registered.
     * </p>
     * 
     * @param timeCreated
     *        When the specified type version was registered.
     */

    public void setTimeCreated(java.util.Date timeCreated) {
        this.timeCreated = timeCreated;
    }

    /**
     * <p>
     * When the specified type version was registered.
     * </p>
     * 
     * @return When the specified type version was registered.
     */

    public java.util.Date getTimeCreated() {
        return this.timeCreated;
    }

    /**
     * <p>
     * When the specified type version was registered.
     * </p>
     * 
     * @param timeCreated
     *        When the specified type version was registered.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTypeResult withTimeCreated(java.util.Date timeCreated) {
        setTimeCreated(timeCreated);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getTypeName() != null)
            sb.append("TypeName: ").append(getTypeName()).append(",");
        if (getDefaultVersionId() != null)
            sb.append("DefaultVersionId: ").append(getDefaultVersionId()).append(",");
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
            sb.append("TimeCreated: ").append(getTimeCreated());
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
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getSchema() == null) ? 0 : getSchema().hashCode());
        hashCode = prime * hashCode + ((getProvisioningType() == null) ? 0 : getProvisioningType().hashCode());
        hashCode = prime * hashCode + ((getDeprecatedStatus() == null) ? 0 : getDeprecatedStatus().hashCode());
        hashCode = prime * hashCode + ((getLoggingConfig() == null) ? 0 : getLoggingConfig().hashCode());
        hashCode = prime * hashCode + ((getExecutionRoleArn() == null) ? 0 : getExecutionRoleArn().hashCode());
        hashCode = prime * hashCode + ((getVisibility() == null) ? 0 : getVisibility().hashCode());
        hashCode = prime * hashCode + ((getSourceUrl() == null) ? 0 : getSourceUrl().hashCode());
        hashCode = prime * hashCode + ((getDocumentationUrl() == null) ? 0 : getDocumentationUrl().hashCode());
        hashCode = prime * hashCode + ((getLastUpdated() == null) ? 0 : getLastUpdated().hashCode());
        hashCode = prime * hashCode + ((getTimeCreated() == null) ? 0 : getTimeCreated().hashCode());
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
