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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/CreateSchema" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateSchemaRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * This is a wrapper shape to contain the registry identity fields. If this is not provided, the default registry
     * will be used. The ARN format for the same will be:
     * <code>arn:aws:glue:us-east-2:&lt;customer id&gt;:registry/default-registry:random-5-letter-id</code>.
     * </p>
     */
    private RegistryId registryId;
    /**
     * <p>
     * Name of the schema to be created of max length of 255, and may only contain letters, numbers, hyphen, underscore,
     * dollar sign, or hash mark. No whitespace.
     * </p>
     */
    private String schemaName;
    /**
     * <p>
     * The data format of the schema definition. Currently <code>AVRO</code> and <code>JSON</code> are supported.
     * </p>
     */
    private String dataFormat;
    /**
     * <p>
     * The compatibility mode of the schema. The possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>NONE</i>: No compatibility mode applies. You can use this choice in development scenarios or if you do not
     * know the compatibility mode that you want to apply to schemas. Any new version added will be accepted without
     * undergoing a compatibility check.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>DISABLED</i>: This compatibility choice prevents versioning for a particular schema. You can use this choice
     * to prevent future versioning of a schema.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>BACKWARD</i>: This compatibility choice is recommended as it allows data receivers to read both the current
     * and one previous schema version. This means that for instance, a new schema version cannot drop data fields or
     * change the type of these fields, so they can't be read by readers using the previous version.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>BACKWARD_ALL</i>: This compatibility choice allows data receivers to read both the current and all previous
     * schema versions. You can use this choice when you need to delete fields or add optional fields, and check
     * compatibility against all previous schema versions.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>FORWARD</i>: This compatibility choice allows data receivers to read both the current and one next schema
     * version, but not necessarily later versions. You can use this choice when you need to add fields or delete
     * optional fields, but only check compatibility against the last schema version.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>FORWARD_ALL</i>: This compatibility choice allows data receivers to read written by producers of any new
     * registered schema. You can use this choice when you need to add fields or delete optional fields, and check
     * compatibility against all previous schema versions.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>FULL</i>: This compatibility choice allows data receivers to read data written by producers using the previous
     * or next version of the schema, but not necessarily earlier or later versions. You can use this choice when you
     * need to add or remove optional fields, but only check compatibility against the last schema version.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>FULL_ALL</i>: This compatibility choice allows data receivers to read data written by producers using all
     * previous schema versions. You can use this choice when you need to add or remove optional fields, and check
     * compatibility against all previous schema versions.
     * </p>
     * </li>
     * </ul>
     */
    private String compatibility;
    /**
     * <p>
     * An optional description of the schema. If description is not provided, there will not be any automatic default
     * value for this.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Amazon Web Services tags that contain a key value pair and may be searched by console, command line, or API. If
     * specified, follows the Amazon Web Services tags-on-create pattern.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The schema definition using the <code>DataFormat</code> setting for <code>SchemaName</code>.
     * </p>
     */
    private String schemaDefinition;

    /**
     * <p>
     * This is a wrapper shape to contain the registry identity fields. If this is not provided, the default registry
     * will be used. The ARN format for the same will be:
     * <code>arn:aws:glue:us-east-2:&lt;customer id&gt;:registry/default-registry:random-5-letter-id</code>.
     * </p>
     * 
     * @param registryId
     *        This is a wrapper shape to contain the registry identity fields. If this is not provided, the default
     *        registry will be used. The ARN format for the same will be:
     *        <code>arn:aws:glue:us-east-2:&lt;customer id&gt;:registry/default-registry:random-5-letter-id</code>.
     */

    public void setRegistryId(RegistryId registryId) {
        this.registryId = registryId;
    }

    /**
     * <p>
     * This is a wrapper shape to contain the registry identity fields. If this is not provided, the default registry
     * will be used. The ARN format for the same will be:
     * <code>arn:aws:glue:us-east-2:&lt;customer id&gt;:registry/default-registry:random-5-letter-id</code>.
     * </p>
     * 
     * @return This is a wrapper shape to contain the registry identity fields. If this is not provided, the default
     *         registry will be used. The ARN format for the same will be:
     *         <code>arn:aws:glue:us-east-2:&lt;customer id&gt;:registry/default-registry:random-5-letter-id</code>.
     */

    public RegistryId getRegistryId() {
        return this.registryId;
    }

    /**
     * <p>
     * This is a wrapper shape to contain the registry identity fields. If this is not provided, the default registry
     * will be used. The ARN format for the same will be:
     * <code>arn:aws:glue:us-east-2:&lt;customer id&gt;:registry/default-registry:random-5-letter-id</code>.
     * </p>
     * 
     * @param registryId
     *        This is a wrapper shape to contain the registry identity fields. If this is not provided, the default
     *        registry will be used. The ARN format for the same will be:
     *        <code>arn:aws:glue:us-east-2:&lt;customer id&gt;:registry/default-registry:random-5-letter-id</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSchemaRequest withRegistryId(RegistryId registryId) {
        setRegistryId(registryId);
        return this;
    }

    /**
     * <p>
     * Name of the schema to be created of max length of 255, and may only contain letters, numbers, hyphen, underscore,
     * dollar sign, or hash mark. No whitespace.
     * </p>
     * 
     * @param schemaName
     *        Name of the schema to be created of max length of 255, and may only contain letters, numbers, hyphen,
     *        underscore, dollar sign, or hash mark. No whitespace.
     */

    public void setSchemaName(String schemaName) {
        this.schemaName = schemaName;
    }

    /**
     * <p>
     * Name of the schema to be created of max length of 255, and may only contain letters, numbers, hyphen, underscore,
     * dollar sign, or hash mark. No whitespace.
     * </p>
     * 
     * @return Name of the schema to be created of max length of 255, and may only contain letters, numbers, hyphen,
     *         underscore, dollar sign, or hash mark. No whitespace.
     */

    public String getSchemaName() {
        return this.schemaName;
    }

    /**
     * <p>
     * Name of the schema to be created of max length of 255, and may only contain letters, numbers, hyphen, underscore,
     * dollar sign, or hash mark. No whitespace.
     * </p>
     * 
     * @param schemaName
     *        Name of the schema to be created of max length of 255, and may only contain letters, numbers, hyphen,
     *        underscore, dollar sign, or hash mark. No whitespace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSchemaRequest withSchemaName(String schemaName) {
        setSchemaName(schemaName);
        return this;
    }

    /**
     * <p>
     * The data format of the schema definition. Currently <code>AVRO</code> and <code>JSON</code> are supported.
     * </p>
     * 
     * @param dataFormat
     *        The data format of the schema definition. Currently <code>AVRO</code> and <code>JSON</code> are supported.
     * @see DataFormat
     */

    public void setDataFormat(String dataFormat) {
        this.dataFormat = dataFormat;
    }

    /**
     * <p>
     * The data format of the schema definition. Currently <code>AVRO</code> and <code>JSON</code> are supported.
     * </p>
     * 
     * @return The data format of the schema definition. Currently <code>AVRO</code> and <code>JSON</code> are
     *         supported.
     * @see DataFormat
     */

    public String getDataFormat() {
        return this.dataFormat;
    }

    /**
     * <p>
     * The data format of the schema definition. Currently <code>AVRO</code> and <code>JSON</code> are supported.
     * </p>
     * 
     * @param dataFormat
     *        The data format of the schema definition. Currently <code>AVRO</code> and <code>JSON</code> are supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataFormat
     */

    public CreateSchemaRequest withDataFormat(String dataFormat) {
        setDataFormat(dataFormat);
        return this;
    }

    /**
     * <p>
     * The data format of the schema definition. Currently <code>AVRO</code> and <code>JSON</code> are supported.
     * </p>
     * 
     * @param dataFormat
     *        The data format of the schema definition. Currently <code>AVRO</code> and <code>JSON</code> are supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataFormat
     */

    public CreateSchemaRequest withDataFormat(DataFormat dataFormat) {
        this.dataFormat = dataFormat.toString();
        return this;
    }

    /**
     * <p>
     * The compatibility mode of the schema. The possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>NONE</i>: No compatibility mode applies. You can use this choice in development scenarios or if you do not
     * know the compatibility mode that you want to apply to schemas. Any new version added will be accepted without
     * undergoing a compatibility check.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>DISABLED</i>: This compatibility choice prevents versioning for a particular schema. You can use this choice
     * to prevent future versioning of a schema.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>BACKWARD</i>: This compatibility choice is recommended as it allows data receivers to read both the current
     * and one previous schema version. This means that for instance, a new schema version cannot drop data fields or
     * change the type of these fields, so they can't be read by readers using the previous version.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>BACKWARD_ALL</i>: This compatibility choice allows data receivers to read both the current and all previous
     * schema versions. You can use this choice when you need to delete fields or add optional fields, and check
     * compatibility against all previous schema versions.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>FORWARD</i>: This compatibility choice allows data receivers to read both the current and one next schema
     * version, but not necessarily later versions. You can use this choice when you need to add fields or delete
     * optional fields, but only check compatibility against the last schema version.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>FORWARD_ALL</i>: This compatibility choice allows data receivers to read written by producers of any new
     * registered schema. You can use this choice when you need to add fields or delete optional fields, and check
     * compatibility against all previous schema versions.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>FULL</i>: This compatibility choice allows data receivers to read data written by producers using the previous
     * or next version of the schema, but not necessarily earlier or later versions. You can use this choice when you
     * need to add or remove optional fields, but only check compatibility against the last schema version.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>FULL_ALL</i>: This compatibility choice allows data receivers to read data written by producers using all
     * previous schema versions. You can use this choice when you need to add or remove optional fields, and check
     * compatibility against all previous schema versions.
     * </p>
     * </li>
     * </ul>
     * 
     * @param compatibility
     *        The compatibility mode of the schema. The possible values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <i>NONE</i>: No compatibility mode applies. You can use this choice in development scenarios or if you do
     *        not know the compatibility mode that you want to apply to schemas. Any new version added will be accepted
     *        without undergoing a compatibility check.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>DISABLED</i>: This compatibility choice prevents versioning for a particular schema. You can use this
     *        choice to prevent future versioning of a schema.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>BACKWARD</i>: This compatibility choice is recommended as it allows data receivers to read both the
     *        current and one previous schema version. This means that for instance, a new schema version cannot drop
     *        data fields or change the type of these fields, so they can't be read by readers using the previous
     *        version.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>BACKWARD_ALL</i>: This compatibility choice allows data receivers to read both the current and all
     *        previous schema versions. You can use this choice when you need to delete fields or add optional fields,
     *        and check compatibility against all previous schema versions.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>FORWARD</i>: This compatibility choice allows data receivers to read both the current and one next
     *        schema version, but not necessarily later versions. You can use this choice when you need to add fields or
     *        delete optional fields, but only check compatibility against the last schema version.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>FORWARD_ALL</i>: This compatibility choice allows data receivers to read written by producers of any
     *        new registered schema. You can use this choice when you need to add fields or delete optional fields, and
     *        check compatibility against all previous schema versions.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>FULL</i>: This compatibility choice allows data receivers to read data written by producers using the
     *        previous or next version of the schema, but not necessarily earlier or later versions. You can use this
     *        choice when you need to add or remove optional fields, but only check compatibility against the last
     *        schema version.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>FULL_ALL</i>: This compatibility choice allows data receivers to read data written by producers using
     *        all previous schema versions. You can use this choice when you need to add or remove optional fields, and
     *        check compatibility against all previous schema versions.
     *        </p>
     *        </li>
     * @see Compatibility
     */

    public void setCompatibility(String compatibility) {
        this.compatibility = compatibility;
    }

    /**
     * <p>
     * The compatibility mode of the schema. The possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>NONE</i>: No compatibility mode applies. You can use this choice in development scenarios or if you do not
     * know the compatibility mode that you want to apply to schemas. Any new version added will be accepted without
     * undergoing a compatibility check.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>DISABLED</i>: This compatibility choice prevents versioning for a particular schema. You can use this choice
     * to prevent future versioning of a schema.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>BACKWARD</i>: This compatibility choice is recommended as it allows data receivers to read both the current
     * and one previous schema version. This means that for instance, a new schema version cannot drop data fields or
     * change the type of these fields, so they can't be read by readers using the previous version.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>BACKWARD_ALL</i>: This compatibility choice allows data receivers to read both the current and all previous
     * schema versions. You can use this choice when you need to delete fields or add optional fields, and check
     * compatibility against all previous schema versions.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>FORWARD</i>: This compatibility choice allows data receivers to read both the current and one next schema
     * version, but not necessarily later versions. You can use this choice when you need to add fields or delete
     * optional fields, but only check compatibility against the last schema version.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>FORWARD_ALL</i>: This compatibility choice allows data receivers to read written by producers of any new
     * registered schema. You can use this choice when you need to add fields or delete optional fields, and check
     * compatibility against all previous schema versions.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>FULL</i>: This compatibility choice allows data receivers to read data written by producers using the previous
     * or next version of the schema, but not necessarily earlier or later versions. You can use this choice when you
     * need to add or remove optional fields, but only check compatibility against the last schema version.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>FULL_ALL</i>: This compatibility choice allows data receivers to read data written by producers using all
     * previous schema versions. You can use this choice when you need to add or remove optional fields, and check
     * compatibility against all previous schema versions.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The compatibility mode of the schema. The possible values are:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>NONE</i>: No compatibility mode applies. You can use this choice in development scenarios or if you do
     *         not know the compatibility mode that you want to apply to schemas. Any new version added will be accepted
     *         without undergoing a compatibility check.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>DISABLED</i>: This compatibility choice prevents versioning for a particular schema. You can use this
     *         choice to prevent future versioning of a schema.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>BACKWARD</i>: This compatibility choice is recommended as it allows data receivers to read both the
     *         current and one previous schema version. This means that for instance, a new schema version cannot drop
     *         data fields or change the type of these fields, so they can't be read by readers using the previous
     *         version.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>BACKWARD_ALL</i>: This compatibility choice allows data receivers to read both the current and all
     *         previous schema versions. You can use this choice when you need to delete fields or add optional fields,
     *         and check compatibility against all previous schema versions.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>FORWARD</i>: This compatibility choice allows data receivers to read both the current and one next
     *         schema version, but not necessarily later versions. You can use this choice when you need to add fields
     *         or delete optional fields, but only check compatibility against the last schema version.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>FORWARD_ALL</i>: This compatibility choice allows data receivers to read written by producers of any
     *         new registered schema. You can use this choice when you need to add fields or delete optional fields, and
     *         check compatibility against all previous schema versions.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>FULL</i>: This compatibility choice allows data receivers to read data written by producers using the
     *         previous or next version of the schema, but not necessarily earlier or later versions. You can use this
     *         choice when you need to add or remove optional fields, but only check compatibility against the last
     *         schema version.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>FULL_ALL</i>: This compatibility choice allows data receivers to read data written by producers using
     *         all previous schema versions. You can use this choice when you need to add or remove optional fields, and
     *         check compatibility against all previous schema versions.
     *         </p>
     *         </li>
     * @see Compatibility
     */

    public String getCompatibility() {
        return this.compatibility;
    }

    /**
     * <p>
     * The compatibility mode of the schema. The possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>NONE</i>: No compatibility mode applies. You can use this choice in development scenarios or if you do not
     * know the compatibility mode that you want to apply to schemas. Any new version added will be accepted without
     * undergoing a compatibility check.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>DISABLED</i>: This compatibility choice prevents versioning for a particular schema. You can use this choice
     * to prevent future versioning of a schema.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>BACKWARD</i>: This compatibility choice is recommended as it allows data receivers to read both the current
     * and one previous schema version. This means that for instance, a new schema version cannot drop data fields or
     * change the type of these fields, so they can't be read by readers using the previous version.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>BACKWARD_ALL</i>: This compatibility choice allows data receivers to read both the current and all previous
     * schema versions. You can use this choice when you need to delete fields or add optional fields, and check
     * compatibility against all previous schema versions.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>FORWARD</i>: This compatibility choice allows data receivers to read both the current and one next schema
     * version, but not necessarily later versions. You can use this choice when you need to add fields or delete
     * optional fields, but only check compatibility against the last schema version.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>FORWARD_ALL</i>: This compatibility choice allows data receivers to read written by producers of any new
     * registered schema. You can use this choice when you need to add fields or delete optional fields, and check
     * compatibility against all previous schema versions.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>FULL</i>: This compatibility choice allows data receivers to read data written by producers using the previous
     * or next version of the schema, but not necessarily earlier or later versions. You can use this choice when you
     * need to add or remove optional fields, but only check compatibility against the last schema version.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>FULL_ALL</i>: This compatibility choice allows data receivers to read data written by producers using all
     * previous schema versions. You can use this choice when you need to add or remove optional fields, and check
     * compatibility against all previous schema versions.
     * </p>
     * </li>
     * </ul>
     * 
     * @param compatibility
     *        The compatibility mode of the schema. The possible values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <i>NONE</i>: No compatibility mode applies. You can use this choice in development scenarios or if you do
     *        not know the compatibility mode that you want to apply to schemas. Any new version added will be accepted
     *        without undergoing a compatibility check.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>DISABLED</i>: This compatibility choice prevents versioning for a particular schema. You can use this
     *        choice to prevent future versioning of a schema.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>BACKWARD</i>: This compatibility choice is recommended as it allows data receivers to read both the
     *        current and one previous schema version. This means that for instance, a new schema version cannot drop
     *        data fields or change the type of these fields, so they can't be read by readers using the previous
     *        version.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>BACKWARD_ALL</i>: This compatibility choice allows data receivers to read both the current and all
     *        previous schema versions. You can use this choice when you need to delete fields or add optional fields,
     *        and check compatibility against all previous schema versions.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>FORWARD</i>: This compatibility choice allows data receivers to read both the current and one next
     *        schema version, but not necessarily later versions. You can use this choice when you need to add fields or
     *        delete optional fields, but only check compatibility against the last schema version.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>FORWARD_ALL</i>: This compatibility choice allows data receivers to read written by producers of any
     *        new registered schema. You can use this choice when you need to add fields or delete optional fields, and
     *        check compatibility against all previous schema versions.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>FULL</i>: This compatibility choice allows data receivers to read data written by producers using the
     *        previous or next version of the schema, but not necessarily earlier or later versions. You can use this
     *        choice when you need to add or remove optional fields, but only check compatibility against the last
     *        schema version.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>FULL_ALL</i>: This compatibility choice allows data receivers to read data written by producers using
     *        all previous schema versions. You can use this choice when you need to add or remove optional fields, and
     *        check compatibility against all previous schema versions.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Compatibility
     */

    public CreateSchemaRequest withCompatibility(String compatibility) {
        setCompatibility(compatibility);
        return this;
    }

    /**
     * <p>
     * The compatibility mode of the schema. The possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>NONE</i>: No compatibility mode applies. You can use this choice in development scenarios or if you do not
     * know the compatibility mode that you want to apply to schemas. Any new version added will be accepted without
     * undergoing a compatibility check.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>DISABLED</i>: This compatibility choice prevents versioning for a particular schema. You can use this choice
     * to prevent future versioning of a schema.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>BACKWARD</i>: This compatibility choice is recommended as it allows data receivers to read both the current
     * and one previous schema version. This means that for instance, a new schema version cannot drop data fields or
     * change the type of these fields, so they can't be read by readers using the previous version.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>BACKWARD_ALL</i>: This compatibility choice allows data receivers to read both the current and all previous
     * schema versions. You can use this choice when you need to delete fields or add optional fields, and check
     * compatibility against all previous schema versions.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>FORWARD</i>: This compatibility choice allows data receivers to read both the current and one next schema
     * version, but not necessarily later versions. You can use this choice when you need to add fields or delete
     * optional fields, but only check compatibility against the last schema version.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>FORWARD_ALL</i>: This compatibility choice allows data receivers to read written by producers of any new
     * registered schema. You can use this choice when you need to add fields or delete optional fields, and check
     * compatibility against all previous schema versions.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>FULL</i>: This compatibility choice allows data receivers to read data written by producers using the previous
     * or next version of the schema, but not necessarily earlier or later versions. You can use this choice when you
     * need to add or remove optional fields, but only check compatibility against the last schema version.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>FULL_ALL</i>: This compatibility choice allows data receivers to read data written by producers using all
     * previous schema versions. You can use this choice when you need to add or remove optional fields, and check
     * compatibility against all previous schema versions.
     * </p>
     * </li>
     * </ul>
     * 
     * @param compatibility
     *        The compatibility mode of the schema. The possible values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <i>NONE</i>: No compatibility mode applies. You can use this choice in development scenarios or if you do
     *        not know the compatibility mode that you want to apply to schemas. Any new version added will be accepted
     *        without undergoing a compatibility check.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>DISABLED</i>: This compatibility choice prevents versioning for a particular schema. You can use this
     *        choice to prevent future versioning of a schema.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>BACKWARD</i>: This compatibility choice is recommended as it allows data receivers to read both the
     *        current and one previous schema version. This means that for instance, a new schema version cannot drop
     *        data fields or change the type of these fields, so they can't be read by readers using the previous
     *        version.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>BACKWARD_ALL</i>: This compatibility choice allows data receivers to read both the current and all
     *        previous schema versions. You can use this choice when you need to delete fields or add optional fields,
     *        and check compatibility against all previous schema versions.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>FORWARD</i>: This compatibility choice allows data receivers to read both the current and one next
     *        schema version, but not necessarily later versions. You can use this choice when you need to add fields or
     *        delete optional fields, but only check compatibility against the last schema version.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>FORWARD_ALL</i>: This compatibility choice allows data receivers to read written by producers of any
     *        new registered schema. You can use this choice when you need to add fields or delete optional fields, and
     *        check compatibility against all previous schema versions.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>FULL</i>: This compatibility choice allows data receivers to read data written by producers using the
     *        previous or next version of the schema, but not necessarily earlier or later versions. You can use this
     *        choice when you need to add or remove optional fields, but only check compatibility against the last
     *        schema version.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>FULL_ALL</i>: This compatibility choice allows data receivers to read data written by producers using
     *        all previous schema versions. You can use this choice when you need to add or remove optional fields, and
     *        check compatibility against all previous schema versions.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Compatibility
     */

    public CreateSchemaRequest withCompatibility(Compatibility compatibility) {
        this.compatibility = compatibility.toString();
        return this;
    }

    /**
     * <p>
     * An optional description of the schema. If description is not provided, there will not be any automatic default
     * value for this.
     * </p>
     * 
     * @param description
     *        An optional description of the schema. If description is not provided, there will not be any automatic
     *        default value for this.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * An optional description of the schema. If description is not provided, there will not be any automatic default
     * value for this.
     * </p>
     * 
     * @return An optional description of the schema. If description is not provided, there will not be any automatic
     *         default value for this.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * An optional description of the schema. If description is not provided, there will not be any automatic default
     * value for this.
     * </p>
     * 
     * @param description
     *        An optional description of the schema. If description is not provided, there will not be any automatic
     *        default value for this.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSchemaRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Amazon Web Services tags that contain a key value pair and may be searched by console, command line, or API. If
     * specified, follows the Amazon Web Services tags-on-create pattern.
     * </p>
     * 
     * @return Amazon Web Services tags that contain a key value pair and may be searched by console, command line, or
     *         API. If specified, follows the Amazon Web Services tags-on-create pattern.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Amazon Web Services tags that contain a key value pair and may be searched by console, command line, or API. If
     * specified, follows the Amazon Web Services tags-on-create pattern.
     * </p>
     * 
     * @param tags
     *        Amazon Web Services tags that contain a key value pair and may be searched by console, command line, or
     *        API. If specified, follows the Amazon Web Services tags-on-create pattern.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Amazon Web Services tags that contain a key value pair and may be searched by console, command line, or API. If
     * specified, follows the Amazon Web Services tags-on-create pattern.
     * </p>
     * 
     * @param tags
     *        Amazon Web Services tags that contain a key value pair and may be searched by console, command line, or
     *        API. If specified, follows the Amazon Web Services tags-on-create pattern.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSchemaRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateSchemaRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateSchemaRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSchemaRequest clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The schema definition using the <code>DataFormat</code> setting for <code>SchemaName</code>.
     * </p>
     * 
     * @param schemaDefinition
     *        The schema definition using the <code>DataFormat</code> setting for <code>SchemaName</code>.
     */

    public void setSchemaDefinition(String schemaDefinition) {
        this.schemaDefinition = schemaDefinition;
    }

    /**
     * <p>
     * The schema definition using the <code>DataFormat</code> setting for <code>SchemaName</code>.
     * </p>
     * 
     * @return The schema definition using the <code>DataFormat</code> setting for <code>SchemaName</code>.
     */

    public String getSchemaDefinition() {
        return this.schemaDefinition;
    }

    /**
     * <p>
     * The schema definition using the <code>DataFormat</code> setting for <code>SchemaName</code>.
     * </p>
     * 
     * @param schemaDefinition
     *        The schema definition using the <code>DataFormat</code> setting for <code>SchemaName</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSchemaRequest withSchemaDefinition(String schemaDefinition) {
        setSchemaDefinition(schemaDefinition);
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
        if (getRegistryId() != null)
            sb.append("RegistryId: ").append(getRegistryId()).append(",");
        if (getSchemaName() != null)
            sb.append("SchemaName: ").append(getSchemaName()).append(",");
        if (getDataFormat() != null)
            sb.append("DataFormat: ").append(getDataFormat()).append(",");
        if (getCompatibility() != null)
            sb.append("Compatibility: ").append(getCompatibility()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getSchemaDefinition() != null)
            sb.append("SchemaDefinition: ").append(getSchemaDefinition());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateSchemaRequest == false)
            return false;
        CreateSchemaRequest other = (CreateSchemaRequest) obj;
        if (other.getRegistryId() == null ^ this.getRegistryId() == null)
            return false;
        if (other.getRegistryId() != null && other.getRegistryId().equals(this.getRegistryId()) == false)
            return false;
        if (other.getSchemaName() == null ^ this.getSchemaName() == null)
            return false;
        if (other.getSchemaName() != null && other.getSchemaName().equals(this.getSchemaName()) == false)
            return false;
        if (other.getDataFormat() == null ^ this.getDataFormat() == null)
            return false;
        if (other.getDataFormat() != null && other.getDataFormat().equals(this.getDataFormat()) == false)
            return false;
        if (other.getCompatibility() == null ^ this.getCompatibility() == null)
            return false;
        if (other.getCompatibility() != null && other.getCompatibility().equals(this.getCompatibility()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getSchemaDefinition() == null ^ this.getSchemaDefinition() == null)
            return false;
        if (other.getSchemaDefinition() != null && other.getSchemaDefinition().equals(this.getSchemaDefinition()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRegistryId() == null) ? 0 : getRegistryId().hashCode());
        hashCode = prime * hashCode + ((getSchemaName() == null) ? 0 : getSchemaName().hashCode());
        hashCode = prime * hashCode + ((getDataFormat() == null) ? 0 : getDataFormat().hashCode());
        hashCode = prime * hashCode + ((getCompatibility() == null) ? 0 : getCompatibility().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getSchemaDefinition() == null) ? 0 : getSchemaDefinition().hashCode());
        return hashCode;
    }

    @Override
    public CreateSchemaRequest clone() {
        return (CreateSchemaRequest) super.clone();
    }

}
