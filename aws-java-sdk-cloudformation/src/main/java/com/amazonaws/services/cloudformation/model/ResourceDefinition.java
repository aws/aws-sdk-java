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
package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A resource included in a generated template. This data type is used with the <code>CreateGeneratedTemplate</code> and
 * <code>UpdateGeneratedTemplate</code> API actions.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/ResourceDefinition" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceDefinition implements Serializable, Cloneable {

    /**
     * <p>
     * The type of the resource, such as <code>AWS::DynamoDB::Table</code>. For the list of supported resources, see <a
     * href
     * ="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/resource-import-supported-resources.html">IaC
     * generator supported resource types</a> in the <i>CloudFormation User Guide</i>
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * The logical resource id for this resource in the generated template.
     * </p>
     */
    private String logicalResourceId;
    /**
     * <p>
     * A list of up to 256 key-value pairs that identifies the scanned resource. The key is the name of one of the
     * primary identifiers for the resource. (Primary identifiers are specified in the <code>primaryIdentifier</code>
     * list in the resource schema.) The value is the value of that primary identifier. For example, for a
     * <code>AWS::DynamoDB::Table</code> resource, the primary identifiers is <code>TableName</code> so the key-value
     * pair could be <code>"TableName": "MyDDBTable"</code>. For more information, see <a href=
     * "https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/resource-type-schema.html#schema-properties-primaryidentifier"
     * >primaryIdentifier</a> in the <i>CloudFormation Command Line Interface User guide for extension development</i>.
     * </p>
     */
    private java.util.Map<String, String> resourceIdentifier;

    /**
     * <p>
     * The type of the resource, such as <code>AWS::DynamoDB::Table</code>. For the list of supported resources, see <a
     * href
     * ="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/resource-import-supported-resources.html">IaC
     * generator supported resource types</a> in the <i>CloudFormation User Guide</i>
     * </p>
     * 
     * @param resourceType
     *        The type of the resource, such as <code>AWS::DynamoDB::Table</code>. For the list of supported resources,
     *        see <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/resource-import-supported-resources.html"
     *        >IaC generator supported resource types</a> in the <i>CloudFormation User Guide</i>
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of the resource, such as <code>AWS::DynamoDB::Table</code>. For the list of supported resources, see <a
     * href
     * ="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/resource-import-supported-resources.html">IaC
     * generator supported resource types</a> in the <i>CloudFormation User Guide</i>
     * </p>
     * 
     * @return The type of the resource, such as <code>AWS::DynamoDB::Table</code>. For the list of supported resources,
     *         see <a href=
     *         "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/resource-import-supported-resources.html"
     *         >IaC generator supported resource types</a> in the <i>CloudFormation User Guide</i>
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The type of the resource, such as <code>AWS::DynamoDB::Table</code>. For the list of supported resources, see <a
     * href
     * ="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/resource-import-supported-resources.html">IaC
     * generator supported resource types</a> in the <i>CloudFormation User Guide</i>
     * </p>
     * 
     * @param resourceType
     *        The type of the resource, such as <code>AWS::DynamoDB::Table</code>. For the list of supported resources,
     *        see <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/resource-import-supported-resources.html"
     *        >IaC generator supported resource types</a> in the <i>CloudFormation User Guide</i>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDefinition withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The logical resource id for this resource in the generated template.
     * </p>
     * 
     * @param logicalResourceId
     *        The logical resource id for this resource in the generated template.
     */

    public void setLogicalResourceId(String logicalResourceId) {
        this.logicalResourceId = logicalResourceId;
    }

    /**
     * <p>
     * The logical resource id for this resource in the generated template.
     * </p>
     * 
     * @return The logical resource id for this resource in the generated template.
     */

    public String getLogicalResourceId() {
        return this.logicalResourceId;
    }

    /**
     * <p>
     * The logical resource id for this resource in the generated template.
     * </p>
     * 
     * @param logicalResourceId
     *        The logical resource id for this resource in the generated template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDefinition withLogicalResourceId(String logicalResourceId) {
        setLogicalResourceId(logicalResourceId);
        return this;
    }

    /**
     * <p>
     * A list of up to 256 key-value pairs that identifies the scanned resource. The key is the name of one of the
     * primary identifiers for the resource. (Primary identifiers are specified in the <code>primaryIdentifier</code>
     * list in the resource schema.) The value is the value of that primary identifier. For example, for a
     * <code>AWS::DynamoDB::Table</code> resource, the primary identifiers is <code>TableName</code> so the key-value
     * pair could be <code>"TableName": "MyDDBTable"</code>. For more information, see <a href=
     * "https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/resource-type-schema.html#schema-properties-primaryidentifier"
     * >primaryIdentifier</a> in the <i>CloudFormation Command Line Interface User guide for extension development</i>.
     * </p>
     * 
     * @return A list of up to 256 key-value pairs that identifies the scanned resource. The key is the name of one of
     *         the primary identifiers for the resource. (Primary identifiers are specified in the
     *         <code>primaryIdentifier</code> list in the resource schema.) The value is the value of that primary
     *         identifier. For example, for a <code>AWS::DynamoDB::Table</code> resource, the primary identifiers is
     *         <code>TableName</code> so the key-value pair could be <code>"TableName": "MyDDBTable"</code>. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/resource-type-schema.html#schema-properties-primaryidentifier"
     *         >primaryIdentifier</a> in the <i>CloudFormation Command Line Interface User guide for extension
     *         development</i>.
     */

    public java.util.Map<String, String> getResourceIdentifier() {
        return resourceIdentifier;
    }

    /**
     * <p>
     * A list of up to 256 key-value pairs that identifies the scanned resource. The key is the name of one of the
     * primary identifiers for the resource. (Primary identifiers are specified in the <code>primaryIdentifier</code>
     * list in the resource schema.) The value is the value of that primary identifier. For example, for a
     * <code>AWS::DynamoDB::Table</code> resource, the primary identifiers is <code>TableName</code> so the key-value
     * pair could be <code>"TableName": "MyDDBTable"</code>. For more information, see <a href=
     * "https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/resource-type-schema.html#schema-properties-primaryidentifier"
     * >primaryIdentifier</a> in the <i>CloudFormation Command Line Interface User guide for extension development</i>.
     * </p>
     * 
     * @param resourceIdentifier
     *        A list of up to 256 key-value pairs that identifies the scanned resource. The key is the name of one of
     *        the primary identifiers for the resource. (Primary identifiers are specified in the
     *        <code>primaryIdentifier</code> list in the resource schema.) The value is the value of that primary
     *        identifier. For example, for a <code>AWS::DynamoDB::Table</code> resource, the primary identifiers is
     *        <code>TableName</code> so the key-value pair could be <code>"TableName": "MyDDBTable"</code>. For more
     *        information, see <a href=
     *        "https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/resource-type-schema.html#schema-properties-primaryidentifier"
     *        >primaryIdentifier</a> in the <i>CloudFormation Command Line Interface User guide for extension
     *        development</i>.
     */

    public void setResourceIdentifier(java.util.Map<String, String> resourceIdentifier) {
        this.resourceIdentifier = resourceIdentifier;
    }

    /**
     * <p>
     * A list of up to 256 key-value pairs that identifies the scanned resource. The key is the name of one of the
     * primary identifiers for the resource. (Primary identifiers are specified in the <code>primaryIdentifier</code>
     * list in the resource schema.) The value is the value of that primary identifier. For example, for a
     * <code>AWS::DynamoDB::Table</code> resource, the primary identifiers is <code>TableName</code> so the key-value
     * pair could be <code>"TableName": "MyDDBTable"</code>. For more information, see <a href=
     * "https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/resource-type-schema.html#schema-properties-primaryidentifier"
     * >primaryIdentifier</a> in the <i>CloudFormation Command Line Interface User guide for extension development</i>.
     * </p>
     * 
     * @param resourceIdentifier
     *        A list of up to 256 key-value pairs that identifies the scanned resource. The key is the name of one of
     *        the primary identifiers for the resource. (Primary identifiers are specified in the
     *        <code>primaryIdentifier</code> list in the resource schema.) The value is the value of that primary
     *        identifier. For example, for a <code>AWS::DynamoDB::Table</code> resource, the primary identifiers is
     *        <code>TableName</code> so the key-value pair could be <code>"TableName": "MyDDBTable"</code>. For more
     *        information, see <a href=
     *        "https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/resource-type-schema.html#schema-properties-primaryidentifier"
     *        >primaryIdentifier</a> in the <i>CloudFormation Command Line Interface User guide for extension
     *        development</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDefinition withResourceIdentifier(java.util.Map<String, String> resourceIdentifier) {
        setResourceIdentifier(resourceIdentifier);
        return this;
    }

    /**
     * Add a single ResourceIdentifier entry
     *
     * @see ResourceDefinition#withResourceIdentifier
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDefinition addResourceIdentifierEntry(String key, String value) {
        if (null == this.resourceIdentifier) {
            this.resourceIdentifier = new java.util.HashMap<String, String>();
        }
        if (this.resourceIdentifier.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.resourceIdentifier.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ResourceIdentifier.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDefinition clearResourceIdentifierEntries() {
        this.resourceIdentifier = null;
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
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getLogicalResourceId() != null)
            sb.append("LogicalResourceId: ").append(getLogicalResourceId()).append(",");
        if (getResourceIdentifier() != null)
            sb.append("ResourceIdentifier: ").append(getResourceIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourceDefinition == false)
            return false;
        ResourceDefinition other = (ResourceDefinition) obj;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getLogicalResourceId() == null ^ this.getLogicalResourceId() == null)
            return false;
        if (other.getLogicalResourceId() != null && other.getLogicalResourceId().equals(this.getLogicalResourceId()) == false)
            return false;
        if (other.getResourceIdentifier() == null ^ this.getResourceIdentifier() == null)
            return false;
        if (other.getResourceIdentifier() != null && other.getResourceIdentifier().equals(this.getResourceIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getLogicalResourceId() == null) ? 0 : getLogicalResourceId().hashCode());
        hashCode = prime * hashCode + ((getResourceIdentifier() == null) ? 0 : getResourceIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public ResourceDefinition clone() {
        try {
            return (ResourceDefinition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
