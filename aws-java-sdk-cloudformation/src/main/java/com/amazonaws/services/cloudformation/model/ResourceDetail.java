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
 * Details about a resource in a generated template
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/ResourceDetail" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceDetail implements Serializable, Cloneable {

    /**
     * <p>
     * The type of the resource, such as <code>AWS::DynamoDB::Table</code>. For the list of supported resources, see <a
     * href
     * ="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/resource-import-supported-resources.html">IaC
     * generator supported resource types</a> In the <i>CloudFormation User Guide</i>
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * The logical id for this resource in the final generated template.
     * </p>
     */
    private String logicalResourceId;
    /**
     * <p>
     * A list of up to 256 key-value pairs that identifies the resource in the generated template. The key is the name
     * of one of the primary identifiers for the resource. (Primary identifiers are specified in the
     * <code>primaryIdentifier</code> list in the resource schema.) The value is the value of that primary identifier.
     * For example, for a <code>AWS::DynamoDB::Table</code> resource, the primary identifiers is <code>TableName</code>
     * so the key-value pair could be <code>"TableName": "MyDDBTable"</code>. For more information, see <a href=
     * "https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/resource-type-schema.html#schema-properties-primaryidentifier"
     * >primaryIdentifier</a> in the <i>CloudFormation Command Line Interface User guide for extension development</i>.
     * </p>
     */
    private java.util.Map<String, String> resourceIdentifier;
    /**
     * <p>
     * Status of the processing of a resource in a generated template.
     * </p>
     * <dl>
     * <dt>InProgress</dt>
     * <dd>
     * <p>
     * The resource processing is still in progress.
     * </p>
     * </dd>
     * <dt>Complete</dt>
     * <dd>
     * <p>
     * The resource processing is complete.
     * </p>
     * </dd>
     * <dt>Pending</dt>
     * <dd>
     * <p>
     * The resource processing is pending.
     * </p>
     * </dd>
     * <dt>Failed</dt>
     * <dd>
     * <p>
     * The resource processing has failed.
     * </p>
     * </dd>
     * </dl>
     */
    private String resourceStatus;
    /**
     * <p>
     * The reason for the resource detail, providing more information if a failure happened.
     * </p>
     */
    private String resourceStatusReason;
    /**
     * <p>
     * The warnings generated for this resource.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<WarningDetail> warnings;

    /**
     * <p>
     * The type of the resource, such as <code>AWS::DynamoDB::Table</code>. For the list of supported resources, see <a
     * href
     * ="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/resource-import-supported-resources.html">IaC
     * generator supported resource types</a> In the <i>CloudFormation User Guide</i>
     * </p>
     * 
     * @param resourceType
     *        The type of the resource, such as <code>AWS::DynamoDB::Table</code>. For the list of supported resources,
     *        see <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/resource-import-supported-resources.html"
     *        >IaC generator supported resource types</a> In the <i>CloudFormation User Guide</i>
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of the resource, such as <code>AWS::DynamoDB::Table</code>. For the list of supported resources, see <a
     * href
     * ="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/resource-import-supported-resources.html">IaC
     * generator supported resource types</a> In the <i>CloudFormation User Guide</i>
     * </p>
     * 
     * @return The type of the resource, such as <code>AWS::DynamoDB::Table</code>. For the list of supported resources,
     *         see <a href=
     *         "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/resource-import-supported-resources.html"
     *         >IaC generator supported resource types</a> In the <i>CloudFormation User Guide</i>
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The type of the resource, such as <code>AWS::DynamoDB::Table</code>. For the list of supported resources, see <a
     * href
     * ="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/resource-import-supported-resources.html">IaC
     * generator supported resource types</a> In the <i>CloudFormation User Guide</i>
     * </p>
     * 
     * @param resourceType
     *        The type of the resource, such as <code>AWS::DynamoDB::Table</code>. For the list of supported resources,
     *        see <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/resource-import-supported-resources.html"
     *        >IaC generator supported resource types</a> In the <i>CloudFormation User Guide</i>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDetail withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The logical id for this resource in the final generated template.
     * </p>
     * 
     * @param logicalResourceId
     *        The logical id for this resource in the final generated template.
     */

    public void setLogicalResourceId(String logicalResourceId) {
        this.logicalResourceId = logicalResourceId;
    }

    /**
     * <p>
     * The logical id for this resource in the final generated template.
     * </p>
     * 
     * @return The logical id for this resource in the final generated template.
     */

    public String getLogicalResourceId() {
        return this.logicalResourceId;
    }

    /**
     * <p>
     * The logical id for this resource in the final generated template.
     * </p>
     * 
     * @param logicalResourceId
     *        The logical id for this resource in the final generated template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDetail withLogicalResourceId(String logicalResourceId) {
        setLogicalResourceId(logicalResourceId);
        return this;
    }

    /**
     * <p>
     * A list of up to 256 key-value pairs that identifies the resource in the generated template. The key is the name
     * of one of the primary identifiers for the resource. (Primary identifiers are specified in the
     * <code>primaryIdentifier</code> list in the resource schema.) The value is the value of that primary identifier.
     * For example, for a <code>AWS::DynamoDB::Table</code> resource, the primary identifiers is <code>TableName</code>
     * so the key-value pair could be <code>"TableName": "MyDDBTable"</code>. For more information, see <a href=
     * "https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/resource-type-schema.html#schema-properties-primaryidentifier"
     * >primaryIdentifier</a> in the <i>CloudFormation Command Line Interface User guide for extension development</i>.
     * </p>
     * 
     * @return A list of up to 256 key-value pairs that identifies the resource in the generated template. The key is
     *         the name of one of the primary identifiers for the resource. (Primary identifiers are specified in the
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
     * A list of up to 256 key-value pairs that identifies the resource in the generated template. The key is the name
     * of one of the primary identifiers for the resource. (Primary identifiers are specified in the
     * <code>primaryIdentifier</code> list in the resource schema.) The value is the value of that primary identifier.
     * For example, for a <code>AWS::DynamoDB::Table</code> resource, the primary identifiers is <code>TableName</code>
     * so the key-value pair could be <code>"TableName": "MyDDBTable"</code>. For more information, see <a href=
     * "https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/resource-type-schema.html#schema-properties-primaryidentifier"
     * >primaryIdentifier</a> in the <i>CloudFormation Command Line Interface User guide for extension development</i>.
     * </p>
     * 
     * @param resourceIdentifier
     *        A list of up to 256 key-value pairs that identifies the resource in the generated template. The key is the
     *        name of one of the primary identifiers for the resource. (Primary identifiers are specified in the
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
     * A list of up to 256 key-value pairs that identifies the resource in the generated template. The key is the name
     * of one of the primary identifiers for the resource. (Primary identifiers are specified in the
     * <code>primaryIdentifier</code> list in the resource schema.) The value is the value of that primary identifier.
     * For example, for a <code>AWS::DynamoDB::Table</code> resource, the primary identifiers is <code>TableName</code>
     * so the key-value pair could be <code>"TableName": "MyDDBTable"</code>. For more information, see <a href=
     * "https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/resource-type-schema.html#schema-properties-primaryidentifier"
     * >primaryIdentifier</a> in the <i>CloudFormation Command Line Interface User guide for extension development</i>.
     * </p>
     * 
     * @param resourceIdentifier
     *        A list of up to 256 key-value pairs that identifies the resource in the generated template. The key is the
     *        name of one of the primary identifiers for the resource. (Primary identifiers are specified in the
     *        <code>primaryIdentifier</code> list in the resource schema.) The value is the value of that primary
     *        identifier. For example, for a <code>AWS::DynamoDB::Table</code> resource, the primary identifiers is
     *        <code>TableName</code> so the key-value pair could be <code>"TableName": "MyDDBTable"</code>. For more
     *        information, see <a href=
     *        "https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/resource-type-schema.html#schema-properties-primaryidentifier"
     *        >primaryIdentifier</a> in the <i>CloudFormation Command Line Interface User guide for extension
     *        development</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDetail withResourceIdentifier(java.util.Map<String, String> resourceIdentifier) {
        setResourceIdentifier(resourceIdentifier);
        return this;
    }

    /**
     * Add a single ResourceIdentifier entry
     *
     * @see ResourceDetail#withResourceIdentifier
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDetail addResourceIdentifierEntry(String key, String value) {
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

    public ResourceDetail clearResourceIdentifierEntries() {
        this.resourceIdentifier = null;
        return this;
    }

    /**
     * <p>
     * Status of the processing of a resource in a generated template.
     * </p>
     * <dl>
     * <dt>InProgress</dt>
     * <dd>
     * <p>
     * The resource processing is still in progress.
     * </p>
     * </dd>
     * <dt>Complete</dt>
     * <dd>
     * <p>
     * The resource processing is complete.
     * </p>
     * </dd>
     * <dt>Pending</dt>
     * <dd>
     * <p>
     * The resource processing is pending.
     * </p>
     * </dd>
     * <dt>Failed</dt>
     * <dd>
     * <p>
     * The resource processing has failed.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param resourceStatus
     *        Status of the processing of a resource in a generated template.</p>
     *        <dl>
     *        <dt>InProgress</dt>
     *        <dd>
     *        <p>
     *        The resource processing is still in progress.
     *        </p>
     *        </dd>
     *        <dt>Complete</dt>
     *        <dd>
     *        <p>
     *        The resource processing is complete.
     *        </p>
     *        </dd>
     *        <dt>Pending</dt>
     *        <dd>
     *        <p>
     *        The resource processing is pending.
     *        </p>
     *        </dd>
     *        <dt>Failed</dt>
     *        <dd>
     *        <p>
     *        The resource processing has failed.
     *        </p>
     *        </dd>
     * @see GeneratedTemplateResourceStatus
     */

    public void setResourceStatus(String resourceStatus) {
        this.resourceStatus = resourceStatus;
    }

    /**
     * <p>
     * Status of the processing of a resource in a generated template.
     * </p>
     * <dl>
     * <dt>InProgress</dt>
     * <dd>
     * <p>
     * The resource processing is still in progress.
     * </p>
     * </dd>
     * <dt>Complete</dt>
     * <dd>
     * <p>
     * The resource processing is complete.
     * </p>
     * </dd>
     * <dt>Pending</dt>
     * <dd>
     * <p>
     * The resource processing is pending.
     * </p>
     * </dd>
     * <dt>Failed</dt>
     * <dd>
     * <p>
     * The resource processing has failed.
     * </p>
     * </dd>
     * </dl>
     * 
     * @return Status of the processing of a resource in a generated template.</p>
     *         <dl>
     *         <dt>InProgress</dt>
     *         <dd>
     *         <p>
     *         The resource processing is still in progress.
     *         </p>
     *         </dd>
     *         <dt>Complete</dt>
     *         <dd>
     *         <p>
     *         The resource processing is complete.
     *         </p>
     *         </dd>
     *         <dt>Pending</dt>
     *         <dd>
     *         <p>
     *         The resource processing is pending.
     *         </p>
     *         </dd>
     *         <dt>Failed</dt>
     *         <dd>
     *         <p>
     *         The resource processing has failed.
     *         </p>
     *         </dd>
     * @see GeneratedTemplateResourceStatus
     */

    public String getResourceStatus() {
        return this.resourceStatus;
    }

    /**
     * <p>
     * Status of the processing of a resource in a generated template.
     * </p>
     * <dl>
     * <dt>InProgress</dt>
     * <dd>
     * <p>
     * The resource processing is still in progress.
     * </p>
     * </dd>
     * <dt>Complete</dt>
     * <dd>
     * <p>
     * The resource processing is complete.
     * </p>
     * </dd>
     * <dt>Pending</dt>
     * <dd>
     * <p>
     * The resource processing is pending.
     * </p>
     * </dd>
     * <dt>Failed</dt>
     * <dd>
     * <p>
     * The resource processing has failed.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param resourceStatus
     *        Status of the processing of a resource in a generated template.</p>
     *        <dl>
     *        <dt>InProgress</dt>
     *        <dd>
     *        <p>
     *        The resource processing is still in progress.
     *        </p>
     *        </dd>
     *        <dt>Complete</dt>
     *        <dd>
     *        <p>
     *        The resource processing is complete.
     *        </p>
     *        </dd>
     *        <dt>Pending</dt>
     *        <dd>
     *        <p>
     *        The resource processing is pending.
     *        </p>
     *        </dd>
     *        <dt>Failed</dt>
     *        <dd>
     *        <p>
     *        The resource processing has failed.
     *        </p>
     *        </dd>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GeneratedTemplateResourceStatus
     */

    public ResourceDetail withResourceStatus(String resourceStatus) {
        setResourceStatus(resourceStatus);
        return this;
    }

    /**
     * <p>
     * Status of the processing of a resource in a generated template.
     * </p>
     * <dl>
     * <dt>InProgress</dt>
     * <dd>
     * <p>
     * The resource processing is still in progress.
     * </p>
     * </dd>
     * <dt>Complete</dt>
     * <dd>
     * <p>
     * The resource processing is complete.
     * </p>
     * </dd>
     * <dt>Pending</dt>
     * <dd>
     * <p>
     * The resource processing is pending.
     * </p>
     * </dd>
     * <dt>Failed</dt>
     * <dd>
     * <p>
     * The resource processing has failed.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param resourceStatus
     *        Status of the processing of a resource in a generated template.</p>
     *        <dl>
     *        <dt>InProgress</dt>
     *        <dd>
     *        <p>
     *        The resource processing is still in progress.
     *        </p>
     *        </dd>
     *        <dt>Complete</dt>
     *        <dd>
     *        <p>
     *        The resource processing is complete.
     *        </p>
     *        </dd>
     *        <dt>Pending</dt>
     *        <dd>
     *        <p>
     *        The resource processing is pending.
     *        </p>
     *        </dd>
     *        <dt>Failed</dt>
     *        <dd>
     *        <p>
     *        The resource processing has failed.
     *        </p>
     *        </dd>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GeneratedTemplateResourceStatus
     */

    public ResourceDetail withResourceStatus(GeneratedTemplateResourceStatus resourceStatus) {
        this.resourceStatus = resourceStatus.toString();
        return this;
    }

    /**
     * <p>
     * The reason for the resource detail, providing more information if a failure happened.
     * </p>
     * 
     * @param resourceStatusReason
     *        The reason for the resource detail, providing more information if a failure happened.
     */

    public void setResourceStatusReason(String resourceStatusReason) {
        this.resourceStatusReason = resourceStatusReason;
    }

    /**
     * <p>
     * The reason for the resource detail, providing more information if a failure happened.
     * </p>
     * 
     * @return The reason for the resource detail, providing more information if a failure happened.
     */

    public String getResourceStatusReason() {
        return this.resourceStatusReason;
    }

    /**
     * <p>
     * The reason for the resource detail, providing more information if a failure happened.
     * </p>
     * 
     * @param resourceStatusReason
     *        The reason for the resource detail, providing more information if a failure happened.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDetail withResourceStatusReason(String resourceStatusReason) {
        setResourceStatusReason(resourceStatusReason);
        return this;
    }

    /**
     * <p>
     * The warnings generated for this resource.
     * </p>
     * 
     * @return The warnings generated for this resource.
     */

    public java.util.List<WarningDetail> getWarnings() {
        if (warnings == null) {
            warnings = new com.amazonaws.internal.SdkInternalList<WarningDetail>();
        }
        return warnings;
    }

    /**
     * <p>
     * The warnings generated for this resource.
     * </p>
     * 
     * @param warnings
     *        The warnings generated for this resource.
     */

    public void setWarnings(java.util.Collection<WarningDetail> warnings) {
        if (warnings == null) {
            this.warnings = null;
            return;
        }

        this.warnings = new com.amazonaws.internal.SdkInternalList<WarningDetail>(warnings);
    }

    /**
     * <p>
     * The warnings generated for this resource.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setWarnings(java.util.Collection)} or {@link #withWarnings(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param warnings
     *        The warnings generated for this resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDetail withWarnings(WarningDetail... warnings) {
        if (this.warnings == null) {
            setWarnings(new com.amazonaws.internal.SdkInternalList<WarningDetail>(warnings.length));
        }
        for (WarningDetail ele : warnings) {
            this.warnings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The warnings generated for this resource.
     * </p>
     * 
     * @param warnings
     *        The warnings generated for this resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDetail withWarnings(java.util.Collection<WarningDetail> warnings) {
        setWarnings(warnings);
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
            sb.append("ResourceIdentifier: ").append(getResourceIdentifier()).append(",");
        if (getResourceStatus() != null)
            sb.append("ResourceStatus: ").append(getResourceStatus()).append(",");
        if (getResourceStatusReason() != null)
            sb.append("ResourceStatusReason: ").append(getResourceStatusReason()).append(",");
        if (getWarnings() != null)
            sb.append("Warnings: ").append(getWarnings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourceDetail == false)
            return false;
        ResourceDetail other = (ResourceDetail) obj;
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
        if (other.getResourceStatus() == null ^ this.getResourceStatus() == null)
            return false;
        if (other.getResourceStatus() != null && other.getResourceStatus().equals(this.getResourceStatus()) == false)
            return false;
        if (other.getResourceStatusReason() == null ^ this.getResourceStatusReason() == null)
            return false;
        if (other.getResourceStatusReason() != null && other.getResourceStatusReason().equals(this.getResourceStatusReason()) == false)
            return false;
        if (other.getWarnings() == null ^ this.getWarnings() == null)
            return false;
        if (other.getWarnings() != null && other.getWarnings().equals(this.getWarnings()) == false)
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
        hashCode = prime * hashCode + ((getResourceStatus() == null) ? 0 : getResourceStatus().hashCode());
        hashCode = prime * hashCode + ((getResourceStatusReason() == null) ? 0 : getResourceStatusReason().hashCode());
        hashCode = prime * hashCode + ((getWarnings() == null) ? 0 : getWarnings().hashCode());
        return hashCode;
    }

    @Override
    public ResourceDetail clone() {
        try {
            return (ResourceDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
