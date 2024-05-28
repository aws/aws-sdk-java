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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/CreatePermissionVersion" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreatePermissionVersionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     * Resource Name (ARN)</a> of the customer managed permission you're creating a new version for.
     * </p>
     */
    private String permissionArn;
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
     * Specifies the <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     * Resource Name (ARN)</a> of the customer managed permission you're creating a new version for.
     * </p>
     * 
     * @param permissionArn
     *        Specifies the <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     *        Resource Name (ARN)</a> of the customer managed permission you're creating a new version for.
     */

    public void setPermissionArn(String permissionArn) {
        this.permissionArn = permissionArn;
    }

    /**
     * <p>
     * Specifies the <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     * Resource Name (ARN)</a> of the customer managed permission you're creating a new version for.
     * </p>
     * 
     * @return Specifies the <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     *         Resource Name (ARN)</a> of the customer managed permission you're creating a new version for.
     */

    public String getPermissionArn() {
        return this.permissionArn;
    }

    /**
     * <p>
     * Specifies the <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     * Resource Name (ARN)</a> of the customer managed permission you're creating a new version for.
     * </p>
     * 
     * @param permissionArn
     *        Specifies the <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     *        Resource Name (ARN)</a> of the customer managed permission you're creating a new version for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePermissionVersionRequest withPermissionArn(String permissionArn) {
        setPermissionArn(permissionArn);
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

    public CreatePermissionVersionRequest withPolicyTemplate(String policyTemplate) {
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

    public CreatePermissionVersionRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
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
        if (getPermissionArn() != null)
            sb.append("PermissionArn: ").append(getPermissionArn()).append(",");
        if (getPolicyTemplate() != null)
            sb.append("PolicyTemplate: ").append(getPolicyTemplate()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreatePermissionVersionRequest == false)
            return false;
        CreatePermissionVersionRequest other = (CreatePermissionVersionRequest) obj;
        if (other.getPermissionArn() == null ^ this.getPermissionArn() == null)
            return false;
        if (other.getPermissionArn() != null && other.getPermissionArn().equals(this.getPermissionArn()) == false)
            return false;
        if (other.getPolicyTemplate() == null ^ this.getPolicyTemplate() == null)
            return false;
        if (other.getPolicyTemplate() != null && other.getPolicyTemplate().equals(this.getPolicyTemplate()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPermissionArn() == null) ? 0 : getPermissionArn().hashCode());
        hashCode = prime * hashCode + ((getPolicyTemplate() == null) ? 0 : getPolicyTemplate().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public CreatePermissionVersionRequest clone() {
        return (CreatePermissionVersionRequest) super.clone();
    }

}
