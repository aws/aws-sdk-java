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
 * The <code>ResourceChange</code> structure describes the resource and the action that AWS CloudFormation will perform
 * on it if you execute this change set.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/ResourceChange" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceChange implements Serializable, Cloneable {

    /**
     * <p>
     * The action that AWS CloudFormation takes on the resource, such as <code>Add</code> (adds a new resource),
     * <code>Modify</code> (changes a resource), or <code>Remove</code> (deletes a resource).
     * </p>
     */
    private String action;
    /**
     * <p>
     * The resource's logical ID, which is defined in the stack's template.
     * </p>
     */
    private String logicalResourceId;
    /**
     * <p>
     * The resource's physical ID (resource name). Resources that you are adding don't have physical IDs because they
     * haven't been created.
     * </p>
     */
    private String physicalResourceId;
    /**
     * <p>
     * The type of AWS CloudFormation resource, such as <code>AWS::S3::Bucket</code>.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * For the <code>Modify</code> action, indicates whether AWS CloudFormation will replace the resource by creating a
     * new one and deleting the old one. This value depends on the value of the <code>RequiresRecreation</code> property
     * in the <code>ResourceTargetDefinition</code> structure. For example, if the <code>RequiresRecreation</code> field
     * is <code>Always</code> and the <code>Evaluation</code> field is <code>Static</code>, <code>Replacement</code> is
     * <code>True</code>. If the <code>RequiresRecreation</code> field is <code>Always</code> and the
     * <code>Evaluation</code> field is <code>Dynamic</code>, <code>Replacement</code> is <code>Conditionally</code>.
     * </p>
     * <p>
     * If you have multiple changes with different <code>RequiresRecreation</code> values, the <code>Replacement</code>
     * value depends on the change with the most impact. A <code>RequiresRecreation</code> value of <code>Always</code>
     * has the most impact, followed by <code>Conditionally</code>, and then <code>Never</code>.
     * </p>
     */
    private String replacement;
    /**
     * <p>
     * For the <code>Modify</code> action, indicates which resource attribute is triggering this update, such as a
     * change in the resource attribute's <code>Metadata</code>, <code>Properties</code>, or <code>Tags</code>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> scope;
    /**
     * <p>
     * For the <code>Modify</code> action, a list of <code>ResourceChangeDetail</code> structures that describes the
     * changes that AWS CloudFormation will make to the resource.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ResourceChangeDetail> details;

    /**
     * <p>
     * The action that AWS CloudFormation takes on the resource, such as <code>Add</code> (adds a new resource),
     * <code>Modify</code> (changes a resource), or <code>Remove</code> (deletes a resource).
     * </p>
     * 
     * @param action
     *        The action that AWS CloudFormation takes on the resource, such as <code>Add</code> (adds a new resource),
     *        <code>Modify</code> (changes a resource), or <code>Remove</code> (deletes a resource).
     * @see ChangeAction
     */

    public void setAction(String action) {
        this.action = action;
    }

    /**
     * <p>
     * The action that AWS CloudFormation takes on the resource, such as <code>Add</code> (adds a new resource),
     * <code>Modify</code> (changes a resource), or <code>Remove</code> (deletes a resource).
     * </p>
     * 
     * @return The action that AWS CloudFormation takes on the resource, such as <code>Add</code> (adds a new resource),
     *         <code>Modify</code> (changes a resource), or <code>Remove</code> (deletes a resource).
     * @see ChangeAction
     */

    public String getAction() {
        return this.action;
    }

    /**
     * <p>
     * The action that AWS CloudFormation takes on the resource, such as <code>Add</code> (adds a new resource),
     * <code>Modify</code> (changes a resource), or <code>Remove</code> (deletes a resource).
     * </p>
     * 
     * @param action
     *        The action that AWS CloudFormation takes on the resource, such as <code>Add</code> (adds a new resource),
     *        <code>Modify</code> (changes a resource), or <code>Remove</code> (deletes a resource).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChangeAction
     */

    public ResourceChange withAction(String action) {
        setAction(action);
        return this;
    }

    /**
     * <p>
     * The action that AWS CloudFormation takes on the resource, such as <code>Add</code> (adds a new resource),
     * <code>Modify</code> (changes a resource), or <code>Remove</code> (deletes a resource).
     * </p>
     * 
     * @param action
     *        The action that AWS CloudFormation takes on the resource, such as <code>Add</code> (adds a new resource),
     *        <code>Modify</code> (changes a resource), or <code>Remove</code> (deletes a resource).
     * @see ChangeAction
     */

    public void setAction(ChangeAction action) {
        withAction(action);
    }

    /**
     * <p>
     * The action that AWS CloudFormation takes on the resource, such as <code>Add</code> (adds a new resource),
     * <code>Modify</code> (changes a resource), or <code>Remove</code> (deletes a resource).
     * </p>
     * 
     * @param action
     *        The action that AWS CloudFormation takes on the resource, such as <code>Add</code> (adds a new resource),
     *        <code>Modify</code> (changes a resource), or <code>Remove</code> (deletes a resource).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChangeAction
     */

    public ResourceChange withAction(ChangeAction action) {
        this.action = action.toString();
        return this;
    }

    /**
     * <p>
     * The resource's logical ID, which is defined in the stack's template.
     * </p>
     * 
     * @param logicalResourceId
     *        The resource's logical ID, which is defined in the stack's template.
     */

    public void setLogicalResourceId(String logicalResourceId) {
        this.logicalResourceId = logicalResourceId;
    }

    /**
     * <p>
     * The resource's logical ID, which is defined in the stack's template.
     * </p>
     * 
     * @return The resource's logical ID, which is defined in the stack's template.
     */

    public String getLogicalResourceId() {
        return this.logicalResourceId;
    }

    /**
     * <p>
     * The resource's logical ID, which is defined in the stack's template.
     * </p>
     * 
     * @param logicalResourceId
     *        The resource's logical ID, which is defined in the stack's template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceChange withLogicalResourceId(String logicalResourceId) {
        setLogicalResourceId(logicalResourceId);
        return this;
    }

    /**
     * <p>
     * The resource's physical ID (resource name). Resources that you are adding don't have physical IDs because they
     * haven't been created.
     * </p>
     * 
     * @param physicalResourceId
     *        The resource's physical ID (resource name). Resources that you are adding don't have physical IDs because
     *        they haven't been created.
     */

    public void setPhysicalResourceId(String physicalResourceId) {
        this.physicalResourceId = physicalResourceId;
    }

    /**
     * <p>
     * The resource's physical ID (resource name). Resources that you are adding don't have physical IDs because they
     * haven't been created.
     * </p>
     * 
     * @return The resource's physical ID (resource name). Resources that you are adding don't have physical IDs because
     *         they haven't been created.
     */

    public String getPhysicalResourceId() {
        return this.physicalResourceId;
    }

    /**
     * <p>
     * The resource's physical ID (resource name). Resources that you are adding don't have physical IDs because they
     * haven't been created.
     * </p>
     * 
     * @param physicalResourceId
     *        The resource's physical ID (resource name). Resources that you are adding don't have physical IDs because
     *        they haven't been created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceChange withPhysicalResourceId(String physicalResourceId) {
        setPhysicalResourceId(physicalResourceId);
        return this;
    }

    /**
     * <p>
     * The type of AWS CloudFormation resource, such as <code>AWS::S3::Bucket</code>.
     * </p>
     * 
     * @param resourceType
     *        The type of AWS CloudFormation resource, such as <code>AWS::S3::Bucket</code>.
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of AWS CloudFormation resource, such as <code>AWS::S3::Bucket</code>.
     * </p>
     * 
     * @return The type of AWS CloudFormation resource, such as <code>AWS::S3::Bucket</code>.
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The type of AWS CloudFormation resource, such as <code>AWS::S3::Bucket</code>.
     * </p>
     * 
     * @param resourceType
     *        The type of AWS CloudFormation resource, such as <code>AWS::S3::Bucket</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceChange withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * For the <code>Modify</code> action, indicates whether AWS CloudFormation will replace the resource by creating a
     * new one and deleting the old one. This value depends on the value of the <code>RequiresRecreation</code> property
     * in the <code>ResourceTargetDefinition</code> structure. For example, if the <code>RequiresRecreation</code> field
     * is <code>Always</code> and the <code>Evaluation</code> field is <code>Static</code>, <code>Replacement</code> is
     * <code>True</code>. If the <code>RequiresRecreation</code> field is <code>Always</code> and the
     * <code>Evaluation</code> field is <code>Dynamic</code>, <code>Replacement</code> is <code>Conditionally</code>.
     * </p>
     * <p>
     * If you have multiple changes with different <code>RequiresRecreation</code> values, the <code>Replacement</code>
     * value depends on the change with the most impact. A <code>RequiresRecreation</code> value of <code>Always</code>
     * has the most impact, followed by <code>Conditionally</code>, and then <code>Never</code>.
     * </p>
     * 
     * @param replacement
     *        For the <code>Modify</code> action, indicates whether AWS CloudFormation will replace the resource by
     *        creating a new one and deleting the old one. This value depends on the value of the
     *        <code>RequiresRecreation</code> property in the <code>ResourceTargetDefinition</code> structure. For
     *        example, if the <code>RequiresRecreation</code> field is <code>Always</code> and the
     *        <code>Evaluation</code> field is <code>Static</code>, <code>Replacement</code> is <code>True</code>. If
     *        the <code>RequiresRecreation</code> field is <code>Always</code> and the <code>Evaluation</code> field is
     *        <code>Dynamic</code>, <code>Replacement</code> is <code>Conditionally</code>.</p>
     *        <p>
     *        If you have multiple changes with different <code>RequiresRecreation</code> values, the
     *        <code>Replacement</code> value depends on the change with the most impact. A
     *        <code>RequiresRecreation</code> value of <code>Always</code> has the most impact, followed by
     *        <code>Conditionally</code>, and then <code>Never</code>.
     * @see Replacement
     */

    public void setReplacement(String replacement) {
        this.replacement = replacement;
    }

    /**
     * <p>
     * For the <code>Modify</code> action, indicates whether AWS CloudFormation will replace the resource by creating a
     * new one and deleting the old one. This value depends on the value of the <code>RequiresRecreation</code> property
     * in the <code>ResourceTargetDefinition</code> structure. For example, if the <code>RequiresRecreation</code> field
     * is <code>Always</code> and the <code>Evaluation</code> field is <code>Static</code>, <code>Replacement</code> is
     * <code>True</code>. If the <code>RequiresRecreation</code> field is <code>Always</code> and the
     * <code>Evaluation</code> field is <code>Dynamic</code>, <code>Replacement</code> is <code>Conditionally</code>.
     * </p>
     * <p>
     * If you have multiple changes with different <code>RequiresRecreation</code> values, the <code>Replacement</code>
     * value depends on the change with the most impact. A <code>RequiresRecreation</code> value of <code>Always</code>
     * has the most impact, followed by <code>Conditionally</code>, and then <code>Never</code>.
     * </p>
     * 
     * @return For the <code>Modify</code> action, indicates whether AWS CloudFormation will replace the resource by
     *         creating a new one and deleting the old one. This value depends on the value of the
     *         <code>RequiresRecreation</code> property in the <code>ResourceTargetDefinition</code> structure. For
     *         example, if the <code>RequiresRecreation</code> field is <code>Always</code> and the
     *         <code>Evaluation</code> field is <code>Static</code>, <code>Replacement</code> is <code>True</code>. If
     *         the <code>RequiresRecreation</code> field is <code>Always</code> and the <code>Evaluation</code> field is
     *         <code>Dynamic</code>, <code>Replacement</code> is <code>Conditionally</code>.</p>
     *         <p>
     *         If you have multiple changes with different <code>RequiresRecreation</code> values, the
     *         <code>Replacement</code> value depends on the change with the most impact. A
     *         <code>RequiresRecreation</code> value of <code>Always</code> has the most impact, followed by
     *         <code>Conditionally</code>, and then <code>Never</code>.
     * @see Replacement
     */

    public String getReplacement() {
        return this.replacement;
    }

    /**
     * <p>
     * For the <code>Modify</code> action, indicates whether AWS CloudFormation will replace the resource by creating a
     * new one and deleting the old one. This value depends on the value of the <code>RequiresRecreation</code> property
     * in the <code>ResourceTargetDefinition</code> structure. For example, if the <code>RequiresRecreation</code> field
     * is <code>Always</code> and the <code>Evaluation</code> field is <code>Static</code>, <code>Replacement</code> is
     * <code>True</code>. If the <code>RequiresRecreation</code> field is <code>Always</code> and the
     * <code>Evaluation</code> field is <code>Dynamic</code>, <code>Replacement</code> is <code>Conditionally</code>.
     * </p>
     * <p>
     * If you have multiple changes with different <code>RequiresRecreation</code> values, the <code>Replacement</code>
     * value depends on the change with the most impact. A <code>RequiresRecreation</code> value of <code>Always</code>
     * has the most impact, followed by <code>Conditionally</code>, and then <code>Never</code>.
     * </p>
     * 
     * @param replacement
     *        For the <code>Modify</code> action, indicates whether AWS CloudFormation will replace the resource by
     *        creating a new one and deleting the old one. This value depends on the value of the
     *        <code>RequiresRecreation</code> property in the <code>ResourceTargetDefinition</code> structure. For
     *        example, if the <code>RequiresRecreation</code> field is <code>Always</code> and the
     *        <code>Evaluation</code> field is <code>Static</code>, <code>Replacement</code> is <code>True</code>. If
     *        the <code>RequiresRecreation</code> field is <code>Always</code> and the <code>Evaluation</code> field is
     *        <code>Dynamic</code>, <code>Replacement</code> is <code>Conditionally</code>.</p>
     *        <p>
     *        If you have multiple changes with different <code>RequiresRecreation</code> values, the
     *        <code>Replacement</code> value depends on the change with the most impact. A
     *        <code>RequiresRecreation</code> value of <code>Always</code> has the most impact, followed by
     *        <code>Conditionally</code>, and then <code>Never</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Replacement
     */

    public ResourceChange withReplacement(String replacement) {
        setReplacement(replacement);
        return this;
    }

    /**
     * <p>
     * For the <code>Modify</code> action, indicates whether AWS CloudFormation will replace the resource by creating a
     * new one and deleting the old one. This value depends on the value of the <code>RequiresRecreation</code> property
     * in the <code>ResourceTargetDefinition</code> structure. For example, if the <code>RequiresRecreation</code> field
     * is <code>Always</code> and the <code>Evaluation</code> field is <code>Static</code>, <code>Replacement</code> is
     * <code>True</code>. If the <code>RequiresRecreation</code> field is <code>Always</code> and the
     * <code>Evaluation</code> field is <code>Dynamic</code>, <code>Replacement</code> is <code>Conditionally</code>.
     * </p>
     * <p>
     * If you have multiple changes with different <code>RequiresRecreation</code> values, the <code>Replacement</code>
     * value depends on the change with the most impact. A <code>RequiresRecreation</code> value of <code>Always</code>
     * has the most impact, followed by <code>Conditionally</code>, and then <code>Never</code>.
     * </p>
     * 
     * @param replacement
     *        For the <code>Modify</code> action, indicates whether AWS CloudFormation will replace the resource by
     *        creating a new one and deleting the old one. This value depends on the value of the
     *        <code>RequiresRecreation</code> property in the <code>ResourceTargetDefinition</code> structure. For
     *        example, if the <code>RequiresRecreation</code> field is <code>Always</code> and the
     *        <code>Evaluation</code> field is <code>Static</code>, <code>Replacement</code> is <code>True</code>. If
     *        the <code>RequiresRecreation</code> field is <code>Always</code> and the <code>Evaluation</code> field is
     *        <code>Dynamic</code>, <code>Replacement</code> is <code>Conditionally</code>.</p>
     *        <p>
     *        If you have multiple changes with different <code>RequiresRecreation</code> values, the
     *        <code>Replacement</code> value depends on the change with the most impact. A
     *        <code>RequiresRecreation</code> value of <code>Always</code> has the most impact, followed by
     *        <code>Conditionally</code>, and then <code>Never</code>.
     * @see Replacement
     */

    public void setReplacement(Replacement replacement) {
        withReplacement(replacement);
    }

    /**
     * <p>
     * For the <code>Modify</code> action, indicates whether AWS CloudFormation will replace the resource by creating a
     * new one and deleting the old one. This value depends on the value of the <code>RequiresRecreation</code> property
     * in the <code>ResourceTargetDefinition</code> structure. For example, if the <code>RequiresRecreation</code> field
     * is <code>Always</code> and the <code>Evaluation</code> field is <code>Static</code>, <code>Replacement</code> is
     * <code>True</code>. If the <code>RequiresRecreation</code> field is <code>Always</code> and the
     * <code>Evaluation</code> field is <code>Dynamic</code>, <code>Replacement</code> is <code>Conditionally</code>.
     * </p>
     * <p>
     * If you have multiple changes with different <code>RequiresRecreation</code> values, the <code>Replacement</code>
     * value depends on the change with the most impact. A <code>RequiresRecreation</code> value of <code>Always</code>
     * has the most impact, followed by <code>Conditionally</code>, and then <code>Never</code>.
     * </p>
     * 
     * @param replacement
     *        For the <code>Modify</code> action, indicates whether AWS CloudFormation will replace the resource by
     *        creating a new one and deleting the old one. This value depends on the value of the
     *        <code>RequiresRecreation</code> property in the <code>ResourceTargetDefinition</code> structure. For
     *        example, if the <code>RequiresRecreation</code> field is <code>Always</code> and the
     *        <code>Evaluation</code> field is <code>Static</code>, <code>Replacement</code> is <code>True</code>. If
     *        the <code>RequiresRecreation</code> field is <code>Always</code> and the <code>Evaluation</code> field is
     *        <code>Dynamic</code>, <code>Replacement</code> is <code>Conditionally</code>.</p>
     *        <p>
     *        If you have multiple changes with different <code>RequiresRecreation</code> values, the
     *        <code>Replacement</code> value depends on the change with the most impact. A
     *        <code>RequiresRecreation</code> value of <code>Always</code> has the most impact, followed by
     *        <code>Conditionally</code>, and then <code>Never</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Replacement
     */

    public ResourceChange withReplacement(Replacement replacement) {
        this.replacement = replacement.toString();
        return this;
    }

    /**
     * <p>
     * For the <code>Modify</code> action, indicates which resource attribute is triggering this update, such as a
     * change in the resource attribute's <code>Metadata</code>, <code>Properties</code>, or <code>Tags</code>.
     * </p>
     * 
     * @return For the <code>Modify</code> action, indicates which resource attribute is triggering this update, such as
     *         a change in the resource attribute's <code>Metadata</code>, <code>Properties</code>, or <code>Tags</code>
     *         .
     * @see ResourceAttribute
     */

    public java.util.List<String> getScope() {
        if (scope == null) {
            scope = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return scope;
    }

    /**
     * <p>
     * For the <code>Modify</code> action, indicates which resource attribute is triggering this update, such as a
     * change in the resource attribute's <code>Metadata</code>, <code>Properties</code>, or <code>Tags</code>.
     * </p>
     * 
     * @param scope
     *        For the <code>Modify</code> action, indicates which resource attribute is triggering this update, such as
     *        a change in the resource attribute's <code>Metadata</code>, <code>Properties</code>, or <code>Tags</code>.
     * @see ResourceAttribute
     */

    public void setScope(java.util.Collection<String> scope) {
        if (scope == null) {
            this.scope = null;
            return;
        }

        this.scope = new com.amazonaws.internal.SdkInternalList<String>(scope);
    }

    /**
     * <p>
     * For the <code>Modify</code> action, indicates which resource attribute is triggering this update, such as a
     * change in the resource attribute's <code>Metadata</code>, <code>Properties</code>, or <code>Tags</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setScope(java.util.Collection)} or {@link #withScope(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param scope
     *        For the <code>Modify</code> action, indicates which resource attribute is triggering this update, such as
     *        a change in the resource attribute's <code>Metadata</code>, <code>Properties</code>, or <code>Tags</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceAttribute
     */

    public ResourceChange withScope(String... scope) {
        if (this.scope == null) {
            setScope(new com.amazonaws.internal.SdkInternalList<String>(scope.length));
        }
        for (String ele : scope) {
            this.scope.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * For the <code>Modify</code> action, indicates which resource attribute is triggering this update, such as a
     * change in the resource attribute's <code>Metadata</code>, <code>Properties</code>, or <code>Tags</code>.
     * </p>
     * 
     * @param scope
     *        For the <code>Modify</code> action, indicates which resource attribute is triggering this update, such as
     *        a change in the resource attribute's <code>Metadata</code>, <code>Properties</code>, or <code>Tags</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceAttribute
     */

    public ResourceChange withScope(java.util.Collection<String> scope) {
        setScope(scope);
        return this;
    }

    /**
     * <p>
     * For the <code>Modify</code> action, indicates which resource attribute is triggering this update, such as a
     * change in the resource attribute's <code>Metadata</code>, <code>Properties</code>, or <code>Tags</code>.
     * </p>
     * 
     * @param scope
     *        For the <code>Modify</code> action, indicates which resource attribute is triggering this update, such as
     *        a change in the resource attribute's <code>Metadata</code>, <code>Properties</code>, or <code>Tags</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceAttribute
     */

    public ResourceChange withScope(ResourceAttribute... scope) {
        com.amazonaws.internal.SdkInternalList<String> scopeCopy = new com.amazonaws.internal.SdkInternalList<String>(scope.length);
        for (ResourceAttribute value : scope) {
            scopeCopy.add(value.toString());
        }
        if (getScope() == null) {
            setScope(scopeCopy);
        } else {
            getScope().addAll(scopeCopy);
        }
        return this;
    }

    /**
     * <p>
     * For the <code>Modify</code> action, a list of <code>ResourceChangeDetail</code> structures that describes the
     * changes that AWS CloudFormation will make to the resource.
     * </p>
     * 
     * @return For the <code>Modify</code> action, a list of <code>ResourceChangeDetail</code> structures that describes
     *         the changes that AWS CloudFormation will make to the resource.
     */

    public java.util.List<ResourceChangeDetail> getDetails() {
        if (details == null) {
            details = new com.amazonaws.internal.SdkInternalList<ResourceChangeDetail>();
        }
        return details;
    }

    /**
     * <p>
     * For the <code>Modify</code> action, a list of <code>ResourceChangeDetail</code> structures that describes the
     * changes that AWS CloudFormation will make to the resource.
     * </p>
     * 
     * @param details
     *        For the <code>Modify</code> action, a list of <code>ResourceChangeDetail</code> structures that describes
     *        the changes that AWS CloudFormation will make to the resource.
     */

    public void setDetails(java.util.Collection<ResourceChangeDetail> details) {
        if (details == null) {
            this.details = null;
            return;
        }

        this.details = new com.amazonaws.internal.SdkInternalList<ResourceChangeDetail>(details);
    }

    /**
     * <p>
     * For the <code>Modify</code> action, a list of <code>ResourceChangeDetail</code> structures that describes the
     * changes that AWS CloudFormation will make to the resource.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDetails(java.util.Collection)} or {@link #withDetails(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param details
     *        For the <code>Modify</code> action, a list of <code>ResourceChangeDetail</code> structures that describes
     *        the changes that AWS CloudFormation will make to the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceChange withDetails(ResourceChangeDetail... details) {
        if (this.details == null) {
            setDetails(new com.amazonaws.internal.SdkInternalList<ResourceChangeDetail>(details.length));
        }
        for (ResourceChangeDetail ele : details) {
            this.details.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * For the <code>Modify</code> action, a list of <code>ResourceChangeDetail</code> structures that describes the
     * changes that AWS CloudFormation will make to the resource.
     * </p>
     * 
     * @param details
     *        For the <code>Modify</code> action, a list of <code>ResourceChangeDetail</code> structures that describes
     *        the changes that AWS CloudFormation will make to the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceChange withDetails(java.util.Collection<ResourceChangeDetail> details) {
        setDetails(details);
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
        if (getAction() != null)
            sb.append("Action: ").append(getAction()).append(",");
        if (getLogicalResourceId() != null)
            sb.append("LogicalResourceId: ").append(getLogicalResourceId()).append(",");
        if (getPhysicalResourceId() != null)
            sb.append("PhysicalResourceId: ").append(getPhysicalResourceId()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getReplacement() != null)
            sb.append("Replacement: ").append(getReplacement()).append(",");
        if (getScope() != null)
            sb.append("Scope: ").append(getScope()).append(",");
        if (getDetails() != null)
            sb.append("Details: ").append(getDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourceChange == false)
            return false;
        ResourceChange other = (ResourceChange) obj;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getLogicalResourceId() == null ^ this.getLogicalResourceId() == null)
            return false;
        if (other.getLogicalResourceId() != null && other.getLogicalResourceId().equals(this.getLogicalResourceId()) == false)
            return false;
        if (other.getPhysicalResourceId() == null ^ this.getPhysicalResourceId() == null)
            return false;
        if (other.getPhysicalResourceId() != null && other.getPhysicalResourceId().equals(this.getPhysicalResourceId()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getReplacement() == null ^ this.getReplacement() == null)
            return false;
        if (other.getReplacement() != null && other.getReplacement().equals(this.getReplacement()) == false)
            return false;
        if (other.getScope() == null ^ this.getScope() == null)
            return false;
        if (other.getScope() != null && other.getScope().equals(this.getScope()) == false)
            return false;
        if (other.getDetails() == null ^ this.getDetails() == null)
            return false;
        if (other.getDetails() != null && other.getDetails().equals(this.getDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime * hashCode + ((getLogicalResourceId() == null) ? 0 : getLogicalResourceId().hashCode());
        hashCode = prime * hashCode + ((getPhysicalResourceId() == null) ? 0 : getPhysicalResourceId().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getReplacement() == null) ? 0 : getReplacement().hashCode());
        hashCode = prime * hashCode + ((getScope() == null) ? 0 : getScope().hashCode());
        hashCode = prime * hashCode + ((getDetails() == null) ? 0 : getDetails().hashCode());
        return hashCode;
    }

    @Override
    public ResourceChange clone() {
        try {
            return (ResourceChange) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
