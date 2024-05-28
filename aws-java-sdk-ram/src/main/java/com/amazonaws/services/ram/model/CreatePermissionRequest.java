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
package com.amazonaws.services.ram.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/CreatePermission" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreatePermissionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the name of the customer managed permission. The name must be unique within the Amazon Web Services
     * Region.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Specifies the name of the resource type that this customer managed permission applies to.
     * </p>
     * <p>
     * The format is <code> <i>&lt;service-code&gt;</i>:<i>&lt;resource-type&gt;</i> </code> and is not case sensitive.
     * For example, to specify an Amazon EC2 Subnet, you can use the string <code>ec2:subnet</code>. To see the list of
     * valid values for this parameter, query the <a>ListResourceTypes</a> operation.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * A string in JSON format string that contains the following elements of a resource-based policy:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Effect</b>: must be set to <code>ALLOW</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Action</b>: specifies the actions that are allowed by this customer managed permission. The list must contain
     * only actions that are supported by the specified resource type. For a list of all actions supported by each
     * resource type, see <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/reference_policies_actions-resources-contextkeys.html"
     * >Actions, resources, and condition keys for Amazon Web Services services</a> in the <i>Identity and Access
     * Management User Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Condition</b>: (optional) specifies conditional parameters that must evaluate to true when a user attempts an
     * action for that action to be allowed. For more information about the Condition element, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_condition.html">IAM policies:
     * Condition element</a> in the <i>Identity and Access Management User Guide</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * This template can't include either the <code>Resource</code> or <code>Principal</code> elements. Those are both
     * filled in by RAM when it instantiates the resource-based policy on each resource shared using this managed
     * permission. The <code>Resource</code> comes from the ARN of the specific resource that you are sharing. The
     * <code>Principal</code> comes from the list of identities added to the resource share.
     * </p>
     */
    private String policyTemplate;
    /**
     * <p>
     * Specifies a unique, case-sensitive identifier that you provide to ensure the idempotency of the request. This
     * lets you safely retry the request without accidentally performing the same operation a second time. Passing the
     * same value to a later call to an operation requires that you also pass the same value for all other parameters.
     * We recommend that you use a <a href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID type of
     * value.</a>.
     * </p>
     * <p>
     * If you don't provide this value, then Amazon Web Services generates a random one for you.
     * </p>
     * <p>
     * If you retry the operation with the same <code>ClientToken</code>, but with different parameters, the retry fails
     * with an <code>IdempotentParameterMismatch</code> error.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * Specifies a list of one or more tag key and value pairs to attach to the permission.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * Specifies the name of the customer managed permission. The name must be unique within the Amazon Web Services
     * Region.
     * </p>
     * 
     * @param name
     *        Specifies the name of the customer managed permission. The name must be unique within the Amazon Web
     *        Services Region.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Specifies the name of the customer managed permission. The name must be unique within the Amazon Web Services
     * Region.
     * </p>
     * 
     * @return Specifies the name of the customer managed permission. The name must be unique within the Amazon Web
     *         Services Region.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Specifies the name of the customer managed permission. The name must be unique within the Amazon Web Services
     * Region.
     * </p>
     * 
     * @param name
     *        Specifies the name of the customer managed permission. The name must be unique within the Amazon Web
     *        Services Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePermissionRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Specifies the name of the resource type that this customer managed permission applies to.
     * </p>
     * <p>
     * The format is <code> <i>&lt;service-code&gt;</i>:<i>&lt;resource-type&gt;</i> </code> and is not case sensitive.
     * For example, to specify an Amazon EC2 Subnet, you can use the string <code>ec2:subnet</code>. To see the list of
     * valid values for this parameter, query the <a>ListResourceTypes</a> operation.
     * </p>
     * 
     * @param resourceType
     *        Specifies the name of the resource type that this customer managed permission applies to.</p>
     *        <p>
     *        The format is <code> <i>&lt;service-code&gt;</i>:<i>&lt;resource-type&gt;</i> </code> and is not case
     *        sensitive. For example, to specify an Amazon EC2 Subnet, you can use the string <code>ec2:subnet</code>.
     *        To see the list of valid values for this parameter, query the <a>ListResourceTypes</a> operation.
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * Specifies the name of the resource type that this customer managed permission applies to.
     * </p>
     * <p>
     * The format is <code> <i>&lt;service-code&gt;</i>:<i>&lt;resource-type&gt;</i> </code> and is not case sensitive.
     * For example, to specify an Amazon EC2 Subnet, you can use the string <code>ec2:subnet</code>. To see the list of
     * valid values for this parameter, query the <a>ListResourceTypes</a> operation.
     * </p>
     * 
     * @return Specifies the name of the resource type that this customer managed permission applies to.</p>
     *         <p>
     *         The format is <code> <i>&lt;service-code&gt;</i>:<i>&lt;resource-type&gt;</i> </code> and is not case
     *         sensitive. For example, to specify an Amazon EC2 Subnet, you can use the string <code>ec2:subnet</code>.
     *         To see the list of valid values for this parameter, query the <a>ListResourceTypes</a> operation.
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * Specifies the name of the resource type that this customer managed permission applies to.
     * </p>
     * <p>
     * The format is <code> <i>&lt;service-code&gt;</i>:<i>&lt;resource-type&gt;</i> </code> and is not case sensitive.
     * For example, to specify an Amazon EC2 Subnet, you can use the string <code>ec2:subnet</code>. To see the list of
     * valid values for this parameter, query the <a>ListResourceTypes</a> operation.
     * </p>
     * 
     * @param resourceType
     *        Specifies the name of the resource type that this customer managed permission applies to.</p>
     *        <p>
     *        The format is <code> <i>&lt;service-code&gt;</i>:<i>&lt;resource-type&gt;</i> </code> and is not case
     *        sensitive. For example, to specify an Amazon EC2 Subnet, you can use the string <code>ec2:subnet</code>.
     *        To see the list of valid values for this parameter, query the <a>ListResourceTypes</a> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePermissionRequest withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * A string in JSON format string that contains the following elements of a resource-based policy:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Effect</b>: must be set to <code>ALLOW</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Action</b>: specifies the actions that are allowed by this customer managed permission. The list must contain
     * only actions that are supported by the specified resource type. For a list of all actions supported by each
     * resource type, see <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/reference_policies_actions-resources-contextkeys.html"
     * >Actions, resources, and condition keys for Amazon Web Services services</a> in the <i>Identity and Access
     * Management User Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Condition</b>: (optional) specifies conditional parameters that must evaluate to true when a user attempts an
     * action for that action to be allowed. For more information about the Condition element, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_condition.html">IAM policies:
     * Condition element</a> in the <i>Identity and Access Management User Guide</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * This template can't include either the <code>Resource</code> or <code>Principal</code> elements. Those are both
     * filled in by RAM when it instantiates the resource-based policy on each resource shared using this managed
     * permission. The <code>Resource</code> comes from the ARN of the specific resource that you are sharing. The
     * <code>Principal</code> comes from the list of identities added to the resource share.
     * </p>
     * 
     * @param policyTemplate
     *        A string in JSON format string that contains the following elements of a resource-based policy:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>Effect</b>: must be set to <code>ALLOW</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Action</b>: specifies the actions that are allowed by this customer managed permission. The list must
     *        contain only actions that are supported by the specified resource type. For a list of all actions
     *        supported by each resource type, see <a href=
     *        "https://docs.aws.amazon.com/service-authorization/latest/reference/reference_policies_actions-resources-contextkeys.html"
     *        >Actions, resources, and condition keys for Amazon Web Services services</a> in the <i>Identity and Access
     *        Management User Guide</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Condition</b>: (optional) specifies conditional parameters that must evaluate to true when a user
     *        attempts an action for that action to be allowed. For more information about the Condition element, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_condition.html">IAM
     *        policies: Condition element</a> in the <i>Identity and Access Management User Guide</i>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        This template can't include either the <code>Resource</code> or <code>Principal</code> elements. Those are
     *        both filled in by RAM when it instantiates the resource-based policy on each resource shared using this
     *        managed permission. The <code>Resource</code> comes from the ARN of the specific resource that you are
     *        sharing. The <code>Principal</code> comes from the list of identities added to the resource share.
     */

    public void setPolicyTemplate(String policyTemplate) {
        this.policyTemplate = policyTemplate;
    }

    /**
     * <p>
     * A string in JSON format string that contains the following elements of a resource-based policy:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Effect</b>: must be set to <code>ALLOW</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Action</b>: specifies the actions that are allowed by this customer managed permission. The list must contain
     * only actions that are supported by the specified resource type. For a list of all actions supported by each
     * resource type, see <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/reference_policies_actions-resources-contextkeys.html"
     * >Actions, resources, and condition keys for Amazon Web Services services</a> in the <i>Identity and Access
     * Management User Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Condition</b>: (optional) specifies conditional parameters that must evaluate to true when a user attempts an
     * action for that action to be allowed. For more information about the Condition element, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_condition.html">IAM policies:
     * Condition element</a> in the <i>Identity and Access Management User Guide</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * This template can't include either the <code>Resource</code> or <code>Principal</code> elements. Those are both
     * filled in by RAM when it instantiates the resource-based policy on each resource shared using this managed
     * permission. The <code>Resource</code> comes from the ARN of the specific resource that you are sharing. The
     * <code>Principal</code> comes from the list of identities added to the resource share.
     * </p>
     * 
     * @return A string in JSON format string that contains the following elements of a resource-based policy:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>Effect</b>: must be set to <code>ALLOW</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Action</b>: specifies the actions that are allowed by this customer managed permission. The list must
     *         contain only actions that are supported by the specified resource type. For a list of all actions
     *         supported by each resource type, see <a href=
     *         "https://docs.aws.amazon.com/service-authorization/latest/reference/reference_policies_actions-resources-contextkeys.html"
     *         >Actions, resources, and condition keys for Amazon Web Services services</a> in the <i>Identity and
     *         Access Management User Guide</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Condition</b>: (optional) specifies conditional parameters that must evaluate to true when a user
     *         attempts an action for that action to be allowed. For more information about the Condition element, see
     *         <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_condition.html">IAM
     *         policies: Condition element</a> in the <i>Identity and Access Management User Guide</i>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         This template can't include either the <code>Resource</code> or <code>Principal</code> elements. Those
     *         are both filled in by RAM when it instantiates the resource-based policy on each resource shared using
     *         this managed permission. The <code>Resource</code> comes from the ARN of the specific resource that you
     *         are sharing. The <code>Principal</code> comes from the list of identities added to the resource share.
     */

    public String getPolicyTemplate() {
        return this.policyTemplate;
    }

    /**
     * <p>
     * A string in JSON format string that contains the following elements of a resource-based policy:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Effect</b>: must be set to <code>ALLOW</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Action</b>: specifies the actions that are allowed by this customer managed permission. The list must contain
     * only actions that are supported by the specified resource type. For a list of all actions supported by each
     * resource type, see <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/reference_policies_actions-resources-contextkeys.html"
     * >Actions, resources, and condition keys for Amazon Web Services services</a> in the <i>Identity and Access
     * Management User Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Condition</b>: (optional) specifies conditional parameters that must evaluate to true when a user attempts an
     * action for that action to be allowed. For more information about the Condition element, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_condition.html">IAM policies:
     * Condition element</a> in the <i>Identity and Access Management User Guide</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * This template can't include either the <code>Resource</code> or <code>Principal</code> elements. Those are both
     * filled in by RAM when it instantiates the resource-based policy on each resource shared using this managed
     * permission. The <code>Resource</code> comes from the ARN of the specific resource that you are sharing. The
     * <code>Principal</code> comes from the list of identities added to the resource share.
     * </p>
     * 
     * @param policyTemplate
     *        A string in JSON format string that contains the following elements of a resource-based policy:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>Effect</b>: must be set to <code>ALLOW</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Action</b>: specifies the actions that are allowed by this customer managed permission. The list must
     *        contain only actions that are supported by the specified resource type. For a list of all actions
     *        supported by each resource type, see <a href=
     *        "https://docs.aws.amazon.com/service-authorization/latest/reference/reference_policies_actions-resources-contextkeys.html"
     *        >Actions, resources, and condition keys for Amazon Web Services services</a> in the <i>Identity and Access
     *        Management User Guide</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Condition</b>: (optional) specifies conditional parameters that must evaluate to true when a user
     *        attempts an action for that action to be allowed. For more information about the Condition element, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_condition.html">IAM
     *        policies: Condition element</a> in the <i>Identity and Access Management User Guide</i>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        This template can't include either the <code>Resource</code> or <code>Principal</code> elements. Those are
     *        both filled in by RAM when it instantiates the resource-based policy on each resource shared using this
     *        managed permission. The <code>Resource</code> comes from the ARN of the specific resource that you are
     *        sharing. The <code>Principal</code> comes from the list of identities added to the resource share.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePermissionRequest withPolicyTemplate(String policyTemplate) {
        setPolicyTemplate(policyTemplate);
        return this;
    }

    /**
     * <p>
     * Specifies a unique, case-sensitive identifier that you provide to ensure the idempotency of the request. This
     * lets you safely retry the request without accidentally performing the same operation a second time. Passing the
     * same value to a later call to an operation requires that you also pass the same value for all other parameters.
     * We recommend that you use a <a href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID type of
     * value.</a>.
     * </p>
     * <p>
     * If you don't provide this value, then Amazon Web Services generates a random one for you.
     * </p>
     * <p>
     * If you retry the operation with the same <code>ClientToken</code>, but with different parameters, the retry fails
     * with an <code>IdempotentParameterMismatch</code> error.
     * </p>
     * 
     * @param clientToken
     *        Specifies a unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     *        This lets you safely retry the request without accidentally performing the same operation a second time.
     *        Passing the same value to a later call to an operation requires that you also pass the same value for all
     *        other parameters. We recommend that you use a <a
     *        href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID type of value.</a>.</p>
     *        <p>
     *        If you don't provide this value, then Amazon Web Services generates a random one for you.
     *        </p>
     *        <p>
     *        If you retry the operation with the same <code>ClientToken</code>, but with different parameters, the
     *        retry fails with an <code>IdempotentParameterMismatch</code> error.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Specifies a unique, case-sensitive identifier that you provide to ensure the idempotency of the request. This
     * lets you safely retry the request without accidentally performing the same operation a second time. Passing the
     * same value to a later call to an operation requires that you also pass the same value for all other parameters.
     * We recommend that you use a <a href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID type of
     * value.</a>.
     * </p>
     * <p>
     * If you don't provide this value, then Amazon Web Services generates a random one for you.
     * </p>
     * <p>
     * If you retry the operation with the same <code>ClientToken</code>, but with different parameters, the retry fails
     * with an <code>IdempotentParameterMismatch</code> error.
     * </p>
     * 
     * @return Specifies a unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     *         This lets you safely retry the request without accidentally performing the same operation a second time.
     *         Passing the same value to a later call to an operation requires that you also pass the same value for all
     *         other parameters. We recommend that you use a <a
     *         href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID type of value.</a>.</p>
     *         <p>
     *         If you don't provide this value, then Amazon Web Services generates a random one for you.
     *         </p>
     *         <p>
     *         If you retry the operation with the same <code>ClientToken</code>, but with different parameters, the
     *         retry fails with an <code>IdempotentParameterMismatch</code> error.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * Specifies a unique, case-sensitive identifier that you provide to ensure the idempotency of the request. This
     * lets you safely retry the request without accidentally performing the same operation a second time. Passing the
     * same value to a later call to an operation requires that you also pass the same value for all other parameters.
     * We recommend that you use a <a href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID type of
     * value.</a>.
     * </p>
     * <p>
     * If you don't provide this value, then Amazon Web Services generates a random one for you.
     * </p>
     * <p>
     * If you retry the operation with the same <code>ClientToken</code>, but with different parameters, the retry fails
     * with an <code>IdempotentParameterMismatch</code> error.
     * </p>
     * 
     * @param clientToken
     *        Specifies a unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     *        This lets you safely retry the request without accidentally performing the same operation a second time.
     *        Passing the same value to a later call to an operation requires that you also pass the same value for all
     *        other parameters. We recommend that you use a <a
     *        href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID type of value.</a>.</p>
     *        <p>
     *        If you don't provide this value, then Amazon Web Services generates a random one for you.
     *        </p>
     *        <p>
     *        If you retry the operation with the same <code>ClientToken</code>, but with different parameters, the
     *        retry fails with an <code>IdempotentParameterMismatch</code> error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePermissionRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * Specifies a list of one or more tag key and value pairs to attach to the permission.
     * </p>
     * 
     * @return Specifies a list of one or more tag key and value pairs to attach to the permission.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Specifies a list of one or more tag key and value pairs to attach to the permission.
     * </p>
     * 
     * @param tags
     *        Specifies a list of one or more tag key and value pairs to attach to the permission.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * Specifies a list of one or more tag key and value pairs to attach to the permission.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Specifies a list of one or more tag key and value pairs to attach to the permission.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePermissionRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies a list of one or more tag key and value pairs to attach to the permission.
     * </p>
     * 
     * @param tags
     *        Specifies a list of one or more tag key and value pairs to attach to the permission.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePermissionRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getPolicyTemplate() != null)
            sb.append("PolicyTemplate: ").append(getPolicyTemplate()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreatePermissionRequest == false)
            return false;
        CreatePermissionRequest other = (CreatePermissionRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getPolicyTemplate() == null ^ this.getPolicyTemplate() == null)
            return false;
        if (other.getPolicyTemplate() != null && other.getPolicyTemplate().equals(this.getPolicyTemplate()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getPolicyTemplate() == null) ? 0 : getPolicyTemplate().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreatePermissionRequest clone() {
        return (CreatePermissionRequest) super.clone();
    }

}
