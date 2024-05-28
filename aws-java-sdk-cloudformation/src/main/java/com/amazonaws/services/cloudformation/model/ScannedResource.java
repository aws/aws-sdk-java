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
 * A scanned resource returned by <code>ListResourceScanResources</code> or
 * <code>ListResourceScanRelatedResources</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/ScannedResource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ScannedResource implements Serializable, Cloneable {

    /**
     * <p>
     * The type of the resource, such as <code>AWS::DynamoDB::Table</code>. For the list of supported resources, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/resource-import-supported-resources.html">
     * Resource type support</a> In the <i>CloudFormation User Guide</i>
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * A list of up to 256 key-value pairs that identifies for the scanned resource. The key is the name of one of the
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
     * If <code>true</code>, the resource is managed by a CloudFormation stack.
     * </p>
     */
    private Boolean managedByStack;

    /**
     * <p>
     * The type of the resource, such as <code>AWS::DynamoDB::Table</code>. For the list of supported resources, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/resource-import-supported-resources.html">
     * Resource type support</a> In the <i>CloudFormation User Guide</i>
     * </p>
     * 
     * @param resourceType
     *        The type of the resource, such as <code>AWS::DynamoDB::Table</code>. For the list of supported resources,
     *        see <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/resource-import-supported-resources.html"
     *        >Resource type support</a> In the <i>CloudFormation User Guide</i>
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of the resource, such as <code>AWS::DynamoDB::Table</code>. For the list of supported resources, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/resource-import-supported-resources.html">
     * Resource type support</a> In the <i>CloudFormation User Guide</i>
     * </p>
     * 
     * @return The type of the resource, such as <code>AWS::DynamoDB::Table</code>. For the list of supported resources,
     *         see <a href=
     *         "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/resource-import-supported-resources.html"
     *         >Resource type support</a> In the <i>CloudFormation User Guide</i>
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The type of the resource, such as <code>AWS::DynamoDB::Table</code>. For the list of supported resources, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/resource-import-supported-resources.html">
     * Resource type support</a> In the <i>CloudFormation User Guide</i>
     * </p>
     * 
     * @param resourceType
     *        The type of the resource, such as <code>AWS::DynamoDB::Table</code>. For the list of supported resources,
     *        see <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/resource-import-supported-resources.html"
     *        >Resource type support</a> In the <i>CloudFormation User Guide</i>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScannedResource withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * A list of up to 256 key-value pairs that identifies for the scanned resource. The key is the name of one of the
     * primary identifiers for the resource. (Primary identifiers are specified in the <code>primaryIdentifier</code>
     * list in the resource schema.) The value is the value of that primary identifier. For example, for a
     * <code>AWS::DynamoDB::Table</code> resource, the primary identifiers is <code>TableName</code> so the key-value
     * pair could be <code>"TableName": "MyDDBTable"</code>. For more information, see <a href=
     * "https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/resource-type-schema.html#schema-properties-primaryidentifier"
     * >primaryIdentifier</a> in the <i>CloudFormation Command Line Interface User guide for extension development</i>.
     * </p>
     * 
     * @return A list of up to 256 key-value pairs that identifies for the scanned resource. The key is the name of one
     *         of the primary identifiers for the resource. (Primary identifiers are specified in the
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
     * A list of up to 256 key-value pairs that identifies for the scanned resource. The key is the name of one of the
     * primary identifiers for the resource. (Primary identifiers are specified in the <code>primaryIdentifier</code>
     * list in the resource schema.) The value is the value of that primary identifier. For example, for a
     * <code>AWS::DynamoDB::Table</code> resource, the primary identifiers is <code>TableName</code> so the key-value
     * pair could be <code>"TableName": "MyDDBTable"</code>. For more information, see <a href=
     * "https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/resource-type-schema.html#schema-properties-primaryidentifier"
     * >primaryIdentifier</a> in the <i>CloudFormation Command Line Interface User guide for extension development</i>.
     * </p>
     * 
     * @param resourceIdentifier
     *        A list of up to 256 key-value pairs that identifies for the scanned resource. The key is the name of one
     *        of the primary identifiers for the resource. (Primary identifiers are specified in the
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
     * A list of up to 256 key-value pairs that identifies for the scanned resource. The key is the name of one of the
     * primary identifiers for the resource. (Primary identifiers are specified in the <code>primaryIdentifier</code>
     * list in the resource schema.) The value is the value of that primary identifier. For example, for a
     * <code>AWS::DynamoDB::Table</code> resource, the primary identifiers is <code>TableName</code> so the key-value
     * pair could be <code>"TableName": "MyDDBTable"</code>. For more information, see <a href=
     * "https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/resource-type-schema.html#schema-properties-primaryidentifier"
     * >primaryIdentifier</a> in the <i>CloudFormation Command Line Interface User guide for extension development</i>.
     * </p>
     * 
     * @param resourceIdentifier
     *        A list of up to 256 key-value pairs that identifies for the scanned resource. The key is the name of one
     *        of the primary identifiers for the resource. (Primary identifiers are specified in the
     *        <code>primaryIdentifier</code> list in the resource schema.) The value is the value of that primary
     *        identifier. For example, for a <code>AWS::DynamoDB::Table</code> resource, the primary identifiers is
     *        <code>TableName</code> so the key-value pair could be <code>"TableName": "MyDDBTable"</code>. For more
     *        information, see <a href=
     *        "https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/resource-type-schema.html#schema-properties-primaryidentifier"
     *        >primaryIdentifier</a> in the <i>CloudFormation Command Line Interface User guide for extension
     *        development</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScannedResource withResourceIdentifier(java.util.Map<String, String> resourceIdentifier) {
        setResourceIdentifier(resourceIdentifier);
        return this;
    }

    /**
     * Add a single ResourceIdentifier entry
     *
     * @see ScannedResource#withResourceIdentifier
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ScannedResource addResourceIdentifierEntry(String key, String value) {
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

    public ScannedResource clearResourceIdentifierEntries() {
        this.resourceIdentifier = null;
        return this;
    }

    /**
     * <p>
     * If <code>true</code>, the resource is managed by a CloudFormation stack.
     * </p>
     * 
     * @param managedByStack
     *        If <code>true</code>, the resource is managed by a CloudFormation stack.
     */

    public void setManagedByStack(Boolean managedByStack) {
        this.managedByStack = managedByStack;
    }

    /**
     * <p>
     * If <code>true</code>, the resource is managed by a CloudFormation stack.
     * </p>
     * 
     * @return If <code>true</code>, the resource is managed by a CloudFormation stack.
     */

    public Boolean getManagedByStack() {
        return this.managedByStack;
    }

    /**
     * <p>
     * If <code>true</code>, the resource is managed by a CloudFormation stack.
     * </p>
     * 
     * @param managedByStack
     *        If <code>true</code>, the resource is managed by a CloudFormation stack.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScannedResource withManagedByStack(Boolean managedByStack) {
        setManagedByStack(managedByStack);
        return this;
    }

    /**
     * <p>
     * If <code>true</code>, the resource is managed by a CloudFormation stack.
     * </p>
     * 
     * @return If <code>true</code>, the resource is managed by a CloudFormation stack.
     */

    public Boolean isManagedByStack() {
        return this.managedByStack;
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
        if (getResourceIdentifier() != null)
            sb.append("ResourceIdentifier: ").append(getResourceIdentifier()).append(",");
        if (getManagedByStack() != null)
            sb.append("ManagedByStack: ").append(getManagedByStack());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ScannedResource == false)
            return false;
        ScannedResource other = (ScannedResource) obj;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getResourceIdentifier() == null ^ this.getResourceIdentifier() == null)
            return false;
        if (other.getResourceIdentifier() != null && other.getResourceIdentifier().equals(this.getResourceIdentifier()) == false)
            return false;
        if (other.getManagedByStack() == null ^ this.getManagedByStack() == null)
            return false;
        if (other.getManagedByStack() != null && other.getManagedByStack().equals(this.getManagedByStack()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getResourceIdentifier() == null) ? 0 : getResourceIdentifier().hashCode());
        hashCode = prime * hashCode + ((getManagedByStack() == null) ? 0 : getManagedByStack().hashCode());
        return hashCode;
    }

    @Override
    public ScannedResource clone() {
        try {
            return (ScannedResource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
