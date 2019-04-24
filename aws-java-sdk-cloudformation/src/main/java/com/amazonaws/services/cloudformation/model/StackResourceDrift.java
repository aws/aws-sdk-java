/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Contains the drift information for a resource that has been checked for drift. This includes actual and expected
 * property values for resources in which AWS CloudFormation has detected drift. Only resource properties explicitly
 * defined in the stack template are checked for drift. For more information, see <a
 * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift.html">Detecting
 * Unregulated Configuration Changes to Stacks and Resources</a>.
 * </p>
 * <p>
 * Resources that do not currently support drift detection cannot be checked. For a list of resources that support drift
 * detection, see <a
 * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift-resource-list.html"
 * >Resources that Support Drift Detection</a>.
 * </p>
 * <p>
 * Use <a>DetectStackResourceDrift</a> to detect drift on individual resources, or <a>DetectStackDrift</a> to detect
 * drift on all resources in a given stack that support drift detection.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/StackResourceDrift" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StackResourceDrift implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the stack.
     * </p>
     */
    private String stackId;
    /**
     * <p>
     * The logical name of the resource specified in the template.
     * </p>
     */
    private String logicalResourceId;
    /**
     * <p>
     * The name or unique identifier that corresponds to a physical instance ID of a resource supported by AWS
     * CloudFormation.
     * </p>
     */
    private String physicalResourceId;
    /**
     * <p>
     * Context information that enables AWS CloudFormation to uniquely identify a resource. AWS CloudFormation uses
     * context key-value pairs in cases where a resource's logical and physical IDs are not enough to uniquely identify
     * that resource. Each context key-value pair specifies a unique resource that contains the targeted resource.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<PhysicalResourceIdContextKeyValuePair> physicalResourceIdContext;
    /**
     * <p>
     * The type of the resource.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * A JSON structure containing the expected property values of the stack resource, as defined in the stack template
     * and any values specified as template parameters.
     * </p>
     * <p>
     * For resources whose <code>StackResourceDriftStatus</code> is <code>DELETED</code>, this structure will not be
     * present.
     * </p>
     */
    private String expectedProperties;
    /**
     * <p>
     * A JSON structure containing the actual property values of the stack resource.
     * </p>
     * <p>
     * For resources whose <code>StackResourceDriftStatus</code> is <code>DELETED</code>, this structure will not be
     * present.
     * </p>
     */
    private String actualProperties;
    /**
     * <p>
     * A collection of the resource properties whose actual values differ from their expected values. These will be
     * present only for resources whose <code>StackResourceDriftStatus</code> is <code>MODIFIED</code>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<PropertyDifference> propertyDifferences;
    /**
     * <p>
     * Status of the resource's actual configuration compared to its expected configuration
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DELETED</code>: The resource differs from its expected template configuration because the resource has been
     * deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MODIFIED</code>: One or more resource properties differ from their expected values (as defined in the stack
     * template and any values specified as template parameters).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_SYNC</code>: The resources's actual configuration matches its expected template configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_CHECKED</code>: AWS CloudFormation does not currently return this value.
     * </p>
     * </li>
     * </ul>
     */
    private String stackResourceDriftStatus;
    /**
     * <p>
     * Time at which AWS CloudFormation performed drift detection on the stack resource.
     * </p>
     */
    private java.util.Date timestamp;

    /**
     * <p>
     * The ID of the stack.
     * </p>
     * 
     * @param stackId
     *        The ID of the stack.
     */

    public void setStackId(String stackId) {
        this.stackId = stackId;
    }

    /**
     * <p>
     * The ID of the stack.
     * </p>
     * 
     * @return The ID of the stack.
     */

    public String getStackId() {
        return this.stackId;
    }

    /**
     * <p>
     * The ID of the stack.
     * </p>
     * 
     * @param stackId
     *        The ID of the stack.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StackResourceDrift withStackId(String stackId) {
        setStackId(stackId);
        return this;
    }

    /**
     * <p>
     * The logical name of the resource specified in the template.
     * </p>
     * 
     * @param logicalResourceId
     *        The logical name of the resource specified in the template.
     */

    public void setLogicalResourceId(String logicalResourceId) {
        this.logicalResourceId = logicalResourceId;
    }

    /**
     * <p>
     * The logical name of the resource specified in the template.
     * </p>
     * 
     * @return The logical name of the resource specified in the template.
     */

    public String getLogicalResourceId() {
        return this.logicalResourceId;
    }

    /**
     * <p>
     * The logical name of the resource specified in the template.
     * </p>
     * 
     * @param logicalResourceId
     *        The logical name of the resource specified in the template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StackResourceDrift withLogicalResourceId(String logicalResourceId) {
        setLogicalResourceId(logicalResourceId);
        return this;
    }

    /**
     * <p>
     * The name or unique identifier that corresponds to a physical instance ID of a resource supported by AWS
     * CloudFormation.
     * </p>
     * 
     * @param physicalResourceId
     *        The name or unique identifier that corresponds to a physical instance ID of a resource supported by AWS
     *        CloudFormation.
     */

    public void setPhysicalResourceId(String physicalResourceId) {
        this.physicalResourceId = physicalResourceId;
    }

    /**
     * <p>
     * The name or unique identifier that corresponds to a physical instance ID of a resource supported by AWS
     * CloudFormation.
     * </p>
     * 
     * @return The name or unique identifier that corresponds to a physical instance ID of a resource supported by AWS
     *         CloudFormation.
     */

    public String getPhysicalResourceId() {
        return this.physicalResourceId;
    }

    /**
     * <p>
     * The name or unique identifier that corresponds to a physical instance ID of a resource supported by AWS
     * CloudFormation.
     * </p>
     * 
     * @param physicalResourceId
     *        The name or unique identifier that corresponds to a physical instance ID of a resource supported by AWS
     *        CloudFormation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StackResourceDrift withPhysicalResourceId(String physicalResourceId) {
        setPhysicalResourceId(physicalResourceId);
        return this;
    }

    /**
     * <p>
     * Context information that enables AWS CloudFormation to uniquely identify a resource. AWS CloudFormation uses
     * context key-value pairs in cases where a resource's logical and physical IDs are not enough to uniquely identify
     * that resource. Each context key-value pair specifies a unique resource that contains the targeted resource.
     * </p>
     * 
     * @return Context information that enables AWS CloudFormation to uniquely identify a resource. AWS CloudFormation
     *         uses context key-value pairs in cases where a resource's logical and physical IDs are not enough to
     *         uniquely identify that resource. Each context key-value pair specifies a unique resource that contains
     *         the targeted resource.
     */

    public java.util.List<PhysicalResourceIdContextKeyValuePair> getPhysicalResourceIdContext() {
        if (physicalResourceIdContext == null) {
            physicalResourceIdContext = new com.amazonaws.internal.SdkInternalList<PhysicalResourceIdContextKeyValuePair>();
        }
        return physicalResourceIdContext;
    }

    /**
     * <p>
     * Context information that enables AWS CloudFormation to uniquely identify a resource. AWS CloudFormation uses
     * context key-value pairs in cases where a resource's logical and physical IDs are not enough to uniquely identify
     * that resource. Each context key-value pair specifies a unique resource that contains the targeted resource.
     * </p>
     * 
     * @param physicalResourceIdContext
     *        Context information that enables AWS CloudFormation to uniquely identify a resource. AWS CloudFormation
     *        uses context key-value pairs in cases where a resource's logical and physical IDs are not enough to
     *        uniquely identify that resource. Each context key-value pair specifies a unique resource that contains the
     *        targeted resource.
     */

    public void setPhysicalResourceIdContext(java.util.Collection<PhysicalResourceIdContextKeyValuePair> physicalResourceIdContext) {
        if (physicalResourceIdContext == null) {
            this.physicalResourceIdContext = null;
            return;
        }

        this.physicalResourceIdContext = new com.amazonaws.internal.SdkInternalList<PhysicalResourceIdContextKeyValuePair>(physicalResourceIdContext);
    }

    /**
     * <p>
     * Context information that enables AWS CloudFormation to uniquely identify a resource. AWS CloudFormation uses
     * context key-value pairs in cases where a resource's logical and physical IDs are not enough to uniquely identify
     * that resource. Each context key-value pair specifies a unique resource that contains the targeted resource.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPhysicalResourceIdContext(java.util.Collection)} or
     * {@link #withPhysicalResourceIdContext(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param physicalResourceIdContext
     *        Context information that enables AWS CloudFormation to uniquely identify a resource. AWS CloudFormation
     *        uses context key-value pairs in cases where a resource's logical and physical IDs are not enough to
     *        uniquely identify that resource. Each context key-value pair specifies a unique resource that contains the
     *        targeted resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StackResourceDrift withPhysicalResourceIdContext(PhysicalResourceIdContextKeyValuePair... physicalResourceIdContext) {
        if (this.physicalResourceIdContext == null) {
            setPhysicalResourceIdContext(new com.amazonaws.internal.SdkInternalList<PhysicalResourceIdContextKeyValuePair>(physicalResourceIdContext.length));
        }
        for (PhysicalResourceIdContextKeyValuePair ele : physicalResourceIdContext) {
            this.physicalResourceIdContext.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Context information that enables AWS CloudFormation to uniquely identify a resource. AWS CloudFormation uses
     * context key-value pairs in cases where a resource's logical and physical IDs are not enough to uniquely identify
     * that resource. Each context key-value pair specifies a unique resource that contains the targeted resource.
     * </p>
     * 
     * @param physicalResourceIdContext
     *        Context information that enables AWS CloudFormation to uniquely identify a resource. AWS CloudFormation
     *        uses context key-value pairs in cases where a resource's logical and physical IDs are not enough to
     *        uniquely identify that resource. Each context key-value pair specifies a unique resource that contains the
     *        targeted resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StackResourceDrift withPhysicalResourceIdContext(java.util.Collection<PhysicalResourceIdContextKeyValuePair> physicalResourceIdContext) {
        setPhysicalResourceIdContext(physicalResourceIdContext);
        return this;
    }

    /**
     * <p>
     * The type of the resource.
     * </p>
     * 
     * @param resourceType
     *        The type of the resource.
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of the resource.
     * </p>
     * 
     * @return The type of the resource.
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The type of the resource.
     * </p>
     * 
     * @param resourceType
     *        The type of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StackResourceDrift withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * A JSON structure containing the expected property values of the stack resource, as defined in the stack template
     * and any values specified as template parameters.
     * </p>
     * <p>
     * For resources whose <code>StackResourceDriftStatus</code> is <code>DELETED</code>, this structure will not be
     * present.
     * </p>
     * 
     * @param expectedProperties
     *        A JSON structure containing the expected property values of the stack resource, as defined in the stack
     *        template and any values specified as template parameters. </p>
     *        <p>
     *        For resources whose <code>StackResourceDriftStatus</code> is <code>DELETED</code>, this structure will not
     *        be present.
     */

    public void setExpectedProperties(String expectedProperties) {
        this.expectedProperties = expectedProperties;
    }

    /**
     * <p>
     * A JSON structure containing the expected property values of the stack resource, as defined in the stack template
     * and any values specified as template parameters.
     * </p>
     * <p>
     * For resources whose <code>StackResourceDriftStatus</code> is <code>DELETED</code>, this structure will not be
     * present.
     * </p>
     * 
     * @return A JSON structure containing the expected property values of the stack resource, as defined in the stack
     *         template and any values specified as template parameters. </p>
     *         <p>
     *         For resources whose <code>StackResourceDriftStatus</code> is <code>DELETED</code>, this structure will
     *         not be present.
     */

    public String getExpectedProperties() {
        return this.expectedProperties;
    }

    /**
     * <p>
     * A JSON structure containing the expected property values of the stack resource, as defined in the stack template
     * and any values specified as template parameters.
     * </p>
     * <p>
     * For resources whose <code>StackResourceDriftStatus</code> is <code>DELETED</code>, this structure will not be
     * present.
     * </p>
     * 
     * @param expectedProperties
     *        A JSON structure containing the expected property values of the stack resource, as defined in the stack
     *        template and any values specified as template parameters. </p>
     *        <p>
     *        For resources whose <code>StackResourceDriftStatus</code> is <code>DELETED</code>, this structure will not
     *        be present.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StackResourceDrift withExpectedProperties(String expectedProperties) {
        setExpectedProperties(expectedProperties);
        return this;
    }

    /**
     * <p>
     * A JSON structure containing the actual property values of the stack resource.
     * </p>
     * <p>
     * For resources whose <code>StackResourceDriftStatus</code> is <code>DELETED</code>, this structure will not be
     * present.
     * </p>
     * 
     * @param actualProperties
     *        A JSON structure containing the actual property values of the stack resource.</p>
     *        <p>
     *        For resources whose <code>StackResourceDriftStatus</code> is <code>DELETED</code>, this structure will not
     *        be present.
     */

    public void setActualProperties(String actualProperties) {
        this.actualProperties = actualProperties;
    }

    /**
     * <p>
     * A JSON structure containing the actual property values of the stack resource.
     * </p>
     * <p>
     * For resources whose <code>StackResourceDriftStatus</code> is <code>DELETED</code>, this structure will not be
     * present.
     * </p>
     * 
     * @return A JSON structure containing the actual property values of the stack resource.</p>
     *         <p>
     *         For resources whose <code>StackResourceDriftStatus</code> is <code>DELETED</code>, this structure will
     *         not be present.
     */

    public String getActualProperties() {
        return this.actualProperties;
    }

    /**
     * <p>
     * A JSON structure containing the actual property values of the stack resource.
     * </p>
     * <p>
     * For resources whose <code>StackResourceDriftStatus</code> is <code>DELETED</code>, this structure will not be
     * present.
     * </p>
     * 
     * @param actualProperties
     *        A JSON structure containing the actual property values of the stack resource.</p>
     *        <p>
     *        For resources whose <code>StackResourceDriftStatus</code> is <code>DELETED</code>, this structure will not
     *        be present.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StackResourceDrift withActualProperties(String actualProperties) {
        setActualProperties(actualProperties);
        return this;
    }

    /**
     * <p>
     * A collection of the resource properties whose actual values differ from their expected values. These will be
     * present only for resources whose <code>StackResourceDriftStatus</code> is <code>MODIFIED</code>.
     * </p>
     * 
     * @return A collection of the resource properties whose actual values differ from their expected values. These will
     *         be present only for resources whose <code>StackResourceDriftStatus</code> is <code>MODIFIED</code>.
     */

    public java.util.List<PropertyDifference> getPropertyDifferences() {
        if (propertyDifferences == null) {
            propertyDifferences = new com.amazonaws.internal.SdkInternalList<PropertyDifference>();
        }
        return propertyDifferences;
    }

    /**
     * <p>
     * A collection of the resource properties whose actual values differ from their expected values. These will be
     * present only for resources whose <code>StackResourceDriftStatus</code> is <code>MODIFIED</code>.
     * </p>
     * 
     * @param propertyDifferences
     *        A collection of the resource properties whose actual values differ from their expected values. These will
     *        be present only for resources whose <code>StackResourceDriftStatus</code> is <code>MODIFIED</code>.
     */

    public void setPropertyDifferences(java.util.Collection<PropertyDifference> propertyDifferences) {
        if (propertyDifferences == null) {
            this.propertyDifferences = null;
            return;
        }

        this.propertyDifferences = new com.amazonaws.internal.SdkInternalList<PropertyDifference>(propertyDifferences);
    }

    /**
     * <p>
     * A collection of the resource properties whose actual values differ from their expected values. These will be
     * present only for resources whose <code>StackResourceDriftStatus</code> is <code>MODIFIED</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPropertyDifferences(java.util.Collection)} or {@link #withPropertyDifferences(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param propertyDifferences
     *        A collection of the resource properties whose actual values differ from their expected values. These will
     *        be present only for resources whose <code>StackResourceDriftStatus</code> is <code>MODIFIED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StackResourceDrift withPropertyDifferences(PropertyDifference... propertyDifferences) {
        if (this.propertyDifferences == null) {
            setPropertyDifferences(new com.amazonaws.internal.SdkInternalList<PropertyDifference>(propertyDifferences.length));
        }
        for (PropertyDifference ele : propertyDifferences) {
            this.propertyDifferences.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A collection of the resource properties whose actual values differ from their expected values. These will be
     * present only for resources whose <code>StackResourceDriftStatus</code> is <code>MODIFIED</code>.
     * </p>
     * 
     * @param propertyDifferences
     *        A collection of the resource properties whose actual values differ from their expected values. These will
     *        be present only for resources whose <code>StackResourceDriftStatus</code> is <code>MODIFIED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StackResourceDrift withPropertyDifferences(java.util.Collection<PropertyDifference> propertyDifferences) {
        setPropertyDifferences(propertyDifferences);
        return this;
    }

    /**
     * <p>
     * Status of the resource's actual configuration compared to its expected configuration
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DELETED</code>: The resource differs from its expected template configuration because the resource has been
     * deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MODIFIED</code>: One or more resource properties differ from their expected values (as defined in the stack
     * template and any values specified as template parameters).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_SYNC</code>: The resources's actual configuration matches its expected template configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_CHECKED</code>: AWS CloudFormation does not currently return this value.
     * </p>
     * </li>
     * </ul>
     * 
     * @param stackResourceDriftStatus
     *        Status of the resource's actual configuration compared to its expected configuration</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DELETED</code>: The resource differs from its expected template configuration because the resource
     *        has been deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MODIFIED</code>: One or more resource properties differ from their expected values (as defined in
     *        the stack template and any values specified as template parameters).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IN_SYNC</code>: The resources's actual configuration matches its expected template configuration.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NOT_CHECKED</code>: AWS CloudFormation does not currently return this value.
     *        </p>
     *        </li>
     * @see StackResourceDriftStatus
     */

    public void setStackResourceDriftStatus(String stackResourceDriftStatus) {
        this.stackResourceDriftStatus = stackResourceDriftStatus;
    }

    /**
     * <p>
     * Status of the resource's actual configuration compared to its expected configuration
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DELETED</code>: The resource differs from its expected template configuration because the resource has been
     * deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MODIFIED</code>: One or more resource properties differ from their expected values (as defined in the stack
     * template and any values specified as template parameters).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_SYNC</code>: The resources's actual configuration matches its expected template configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_CHECKED</code>: AWS CloudFormation does not currently return this value.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Status of the resource's actual configuration compared to its expected configuration</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>DELETED</code>: The resource differs from its expected template configuration because the resource
     *         has been deleted.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>MODIFIED</code>: One or more resource properties differ from their expected values (as defined in
     *         the stack template and any values specified as template parameters).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>IN_SYNC</code>: The resources's actual configuration matches its expected template configuration.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NOT_CHECKED</code>: AWS CloudFormation does not currently return this value.
     *         </p>
     *         </li>
     * @see StackResourceDriftStatus
     */

    public String getStackResourceDriftStatus() {
        return this.stackResourceDriftStatus;
    }

    /**
     * <p>
     * Status of the resource's actual configuration compared to its expected configuration
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DELETED</code>: The resource differs from its expected template configuration because the resource has been
     * deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MODIFIED</code>: One or more resource properties differ from their expected values (as defined in the stack
     * template and any values specified as template parameters).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_SYNC</code>: The resources's actual configuration matches its expected template configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_CHECKED</code>: AWS CloudFormation does not currently return this value.
     * </p>
     * </li>
     * </ul>
     * 
     * @param stackResourceDriftStatus
     *        Status of the resource's actual configuration compared to its expected configuration</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DELETED</code>: The resource differs from its expected template configuration because the resource
     *        has been deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MODIFIED</code>: One or more resource properties differ from their expected values (as defined in
     *        the stack template and any values specified as template parameters).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IN_SYNC</code>: The resources's actual configuration matches its expected template configuration.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NOT_CHECKED</code>: AWS CloudFormation does not currently return this value.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StackResourceDriftStatus
     */

    public StackResourceDrift withStackResourceDriftStatus(String stackResourceDriftStatus) {
        setStackResourceDriftStatus(stackResourceDriftStatus);
        return this;
    }

    /**
     * <p>
     * Status of the resource's actual configuration compared to its expected configuration
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DELETED</code>: The resource differs from its expected template configuration because the resource has been
     * deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MODIFIED</code>: One or more resource properties differ from their expected values (as defined in the stack
     * template and any values specified as template parameters).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_SYNC</code>: The resources's actual configuration matches its expected template configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_CHECKED</code>: AWS CloudFormation does not currently return this value.
     * </p>
     * </li>
     * </ul>
     * 
     * @param stackResourceDriftStatus
     *        Status of the resource's actual configuration compared to its expected configuration</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DELETED</code>: The resource differs from its expected template configuration because the resource
     *        has been deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MODIFIED</code>: One or more resource properties differ from their expected values (as defined in
     *        the stack template and any values specified as template parameters).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IN_SYNC</code>: The resources's actual configuration matches its expected template configuration.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NOT_CHECKED</code>: AWS CloudFormation does not currently return this value.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StackResourceDriftStatus
     */

    public StackResourceDrift withStackResourceDriftStatus(StackResourceDriftStatus stackResourceDriftStatus) {
        this.stackResourceDriftStatus = stackResourceDriftStatus.toString();
        return this;
    }

    /**
     * <p>
     * Time at which AWS CloudFormation performed drift detection on the stack resource.
     * </p>
     * 
     * @param timestamp
     *        Time at which AWS CloudFormation performed drift detection on the stack resource.
     */

    public void setTimestamp(java.util.Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * <p>
     * Time at which AWS CloudFormation performed drift detection on the stack resource.
     * </p>
     * 
     * @return Time at which AWS CloudFormation performed drift detection on the stack resource.
     */

    public java.util.Date getTimestamp() {
        return this.timestamp;
    }

    /**
     * <p>
     * Time at which AWS CloudFormation performed drift detection on the stack resource.
     * </p>
     * 
     * @param timestamp
     *        Time at which AWS CloudFormation performed drift detection on the stack resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StackResourceDrift withTimestamp(java.util.Date timestamp) {
        setTimestamp(timestamp);
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
        if (getStackId() != null)
            sb.append("StackId: ").append(getStackId()).append(",");
        if (getLogicalResourceId() != null)
            sb.append("LogicalResourceId: ").append(getLogicalResourceId()).append(",");
        if (getPhysicalResourceId() != null)
            sb.append("PhysicalResourceId: ").append(getPhysicalResourceId()).append(",");
        if (getPhysicalResourceIdContext() != null)
            sb.append("PhysicalResourceIdContext: ").append(getPhysicalResourceIdContext()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getExpectedProperties() != null)
            sb.append("ExpectedProperties: ").append(getExpectedProperties()).append(",");
        if (getActualProperties() != null)
            sb.append("ActualProperties: ").append(getActualProperties()).append(",");
        if (getPropertyDifferences() != null)
            sb.append("PropertyDifferences: ").append(getPropertyDifferences()).append(",");
        if (getStackResourceDriftStatus() != null)
            sb.append("StackResourceDriftStatus: ").append(getStackResourceDriftStatus()).append(",");
        if (getTimestamp() != null)
            sb.append("Timestamp: ").append(getTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StackResourceDrift == false)
            return false;
        StackResourceDrift other = (StackResourceDrift) obj;
        if (other.getStackId() == null ^ this.getStackId() == null)
            return false;
        if (other.getStackId() != null && other.getStackId().equals(this.getStackId()) == false)
            return false;
        if (other.getLogicalResourceId() == null ^ this.getLogicalResourceId() == null)
            return false;
        if (other.getLogicalResourceId() != null && other.getLogicalResourceId().equals(this.getLogicalResourceId()) == false)
            return false;
        if (other.getPhysicalResourceId() == null ^ this.getPhysicalResourceId() == null)
            return false;
        if (other.getPhysicalResourceId() != null && other.getPhysicalResourceId().equals(this.getPhysicalResourceId()) == false)
            return false;
        if (other.getPhysicalResourceIdContext() == null ^ this.getPhysicalResourceIdContext() == null)
            return false;
        if (other.getPhysicalResourceIdContext() != null && other.getPhysicalResourceIdContext().equals(this.getPhysicalResourceIdContext()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getExpectedProperties() == null ^ this.getExpectedProperties() == null)
            return false;
        if (other.getExpectedProperties() != null && other.getExpectedProperties().equals(this.getExpectedProperties()) == false)
            return false;
        if (other.getActualProperties() == null ^ this.getActualProperties() == null)
            return false;
        if (other.getActualProperties() != null && other.getActualProperties().equals(this.getActualProperties()) == false)
            return false;
        if (other.getPropertyDifferences() == null ^ this.getPropertyDifferences() == null)
            return false;
        if (other.getPropertyDifferences() != null && other.getPropertyDifferences().equals(this.getPropertyDifferences()) == false)
            return false;
        if (other.getStackResourceDriftStatus() == null ^ this.getStackResourceDriftStatus() == null)
            return false;
        if (other.getStackResourceDriftStatus() != null && other.getStackResourceDriftStatus().equals(this.getStackResourceDriftStatus()) == false)
            return false;
        if (other.getTimestamp() == null ^ this.getTimestamp() == null)
            return false;
        if (other.getTimestamp() != null && other.getTimestamp().equals(this.getTimestamp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStackId() == null) ? 0 : getStackId().hashCode());
        hashCode = prime * hashCode + ((getLogicalResourceId() == null) ? 0 : getLogicalResourceId().hashCode());
        hashCode = prime * hashCode + ((getPhysicalResourceId() == null) ? 0 : getPhysicalResourceId().hashCode());
        hashCode = prime * hashCode + ((getPhysicalResourceIdContext() == null) ? 0 : getPhysicalResourceIdContext().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getExpectedProperties() == null) ? 0 : getExpectedProperties().hashCode());
        hashCode = prime * hashCode + ((getActualProperties() == null) ? 0 : getActualProperties().hashCode());
        hashCode = prime * hashCode + ((getPropertyDifferences() == null) ? 0 : getPropertyDifferences().hashCode());
        hashCode = prime * hashCode + ((getStackResourceDriftStatus() == null) ? 0 : getStackResourceDriftStatus().hashCode());
        hashCode = prime * hashCode + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public StackResourceDrift clone() {
        try {
            return (StackResourceDrift) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
