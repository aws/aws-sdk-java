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
package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/PutResourcePolicy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutResourcePolicyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the DynamoDB resource to which the policy will be attached. The resources you
     * can specify include tables and streams.
     * </p>
     * <p>
     * You can control index permissions using the base table's policy. To specify the same permission level for your
     * table and its indexes, you can provide both the table and index Amazon Resource Name (ARN)s in the
     * <code>Resource</code> field of a given <code>Statement</code> in your policy document. Alternatively, to specify
     * different permissions for your table, indexes, or both, you can define multiple <code>Statement</code> fields in
     * your policy document.
     * </p>
     */
    private String resourceArn;
    /**
     * <p>
     * An Amazon Web Services resource-based policy document in JSON format.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The maximum size supported for a resource-based policy document is 20 KB. DynamoDB counts whitespaces when
     * calculating the size of a policy against this limit.
     * </p>
     * </li>
     * <li>
     * <p>
     * Within a resource-based policy, if the action for a DynamoDB service-linked role (SLR) to replicate data for a
     * global table is denied, adding or deleting a replica will fail with an error.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For a full list of all considerations that apply while attaching a resource-based policy, see <a
     * href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/rbac-considerations.html">Resource-based
     * policy considerations</a>.
     * </p>
     */
    private String policy;
    /**
     * <p>
     * A string value that you can use to conditionally update your policy. You can provide the revision ID of your
     * existing policy to make mutating requests against that policy.
     * </p>
     * <note>
     * <p>
     * When you provide an expected revision ID, if the revision ID of the existing policy on the resource doesn't match
     * or if there's no policy attached to the resource, your request will be rejected with a
     * <code>PolicyNotFoundException</code>.
     * </p>
     * </note>
     * <p>
     * To conditionally attach a policy when no policy exists for the resource, specify <code>NO_POLICY</code> for the
     * revision ID.
     * </p>
     */
    private String expectedRevisionId;
    /**
     * <p>
     * Set this parameter to <code>true</code> to confirm that you want to remove your permissions to change the policy
     * of this resource in the future.
     * </p>
     */
    private Boolean confirmRemoveSelfResourceAccess;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the DynamoDB resource to which the policy will be attached. The resources you
     * can specify include tables and streams.
     * </p>
     * <p>
     * You can control index permissions using the base table's policy. To specify the same permission level for your
     * table and its indexes, you can provide both the table and index Amazon Resource Name (ARN)s in the
     * <code>Resource</code> field of a given <code>Statement</code> in your policy document. Alternatively, to specify
     * different permissions for your table, indexes, or both, you can define multiple <code>Statement</code> fields in
     * your policy document.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) of the DynamoDB resource to which the policy will be attached. The
     *        resources you can specify include tables and streams.</p>
     *        <p>
     *        You can control index permissions using the base table's policy. To specify the same permission level for
     *        your table and its indexes, you can provide both the table and index Amazon Resource Name (ARN)s in the
     *        <code>Resource</code> field of a given <code>Statement</code> in your policy document. Alternatively, to
     *        specify different permissions for your table, indexes, or both, you can define multiple
     *        <code>Statement</code> fields in your policy document.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the DynamoDB resource to which the policy will be attached. The resources you
     * can specify include tables and streams.
     * </p>
     * <p>
     * You can control index permissions using the base table's policy. To specify the same permission level for your
     * table and its indexes, you can provide both the table and index Amazon Resource Name (ARN)s in the
     * <code>Resource</code> field of a given <code>Statement</code> in your policy document. Alternatively, to specify
     * different permissions for your table, indexes, or both, you can define multiple <code>Statement</code> fields in
     * your policy document.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the DynamoDB resource to which the policy will be attached. The
     *         resources you can specify include tables and streams.</p>
     *         <p>
     *         You can control index permissions using the base table's policy. To specify the same permission level for
     *         your table and its indexes, you can provide both the table and index Amazon Resource Name (ARN)s in the
     *         <code>Resource</code> field of a given <code>Statement</code> in your policy document. Alternatively, to
     *         specify different permissions for your table, indexes, or both, you can define multiple
     *         <code>Statement</code> fields in your policy document.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the DynamoDB resource to which the policy will be attached. The resources you
     * can specify include tables and streams.
     * </p>
     * <p>
     * You can control index permissions using the base table's policy. To specify the same permission level for your
     * table and its indexes, you can provide both the table and index Amazon Resource Name (ARN)s in the
     * <code>Resource</code> field of a given <code>Statement</code> in your policy document. Alternatively, to specify
     * different permissions for your table, indexes, or both, you can define multiple <code>Statement</code> fields in
     * your policy document.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) of the DynamoDB resource to which the policy will be attached. The
     *        resources you can specify include tables and streams.</p>
     *        <p>
     *        You can control index permissions using the base table's policy. To specify the same permission level for
     *        your table and its indexes, you can provide both the table and index Amazon Resource Name (ARN)s in the
     *        <code>Resource</code> field of a given <code>Statement</code> in your policy document. Alternatively, to
     *        specify different permissions for your table, indexes, or both, you can define multiple
     *        <code>Statement</code> fields in your policy document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutResourcePolicyRequest withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

    /**
     * <p>
     * An Amazon Web Services resource-based policy document in JSON format.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The maximum size supported for a resource-based policy document is 20 KB. DynamoDB counts whitespaces when
     * calculating the size of a policy against this limit.
     * </p>
     * </li>
     * <li>
     * <p>
     * Within a resource-based policy, if the action for a DynamoDB service-linked role (SLR) to replicate data for a
     * global table is denied, adding or deleting a replica will fail with an error.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For a full list of all considerations that apply while attaching a resource-based policy, see <a
     * href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/rbac-considerations.html">Resource-based
     * policy considerations</a>.
     * </p>
     * 
     * @param policy
     *        An Amazon Web Services resource-based policy document in JSON format.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        The maximum size supported for a resource-based policy document is 20 KB. DynamoDB counts whitespaces when
     *        calculating the size of a policy against this limit.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Within a resource-based policy, if the action for a DynamoDB service-linked role (SLR) to replicate data
     *        for a global table is denied, adding or deleting a replica will fail with an error.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For a full list of all considerations that apply while attaching a resource-based policy, see <a
     *        href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/rbac-considerations.html"
     *        >Resource-based policy considerations</a>.
     */

    public void setPolicy(String policy) {
        this.policy = policy;
    }

    /**
     * <p>
     * An Amazon Web Services resource-based policy document in JSON format.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The maximum size supported for a resource-based policy document is 20 KB. DynamoDB counts whitespaces when
     * calculating the size of a policy against this limit.
     * </p>
     * </li>
     * <li>
     * <p>
     * Within a resource-based policy, if the action for a DynamoDB service-linked role (SLR) to replicate data for a
     * global table is denied, adding or deleting a replica will fail with an error.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For a full list of all considerations that apply while attaching a resource-based policy, see <a
     * href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/rbac-considerations.html">Resource-based
     * policy considerations</a>.
     * </p>
     * 
     * @return An Amazon Web Services resource-based policy document in JSON format.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         The maximum size supported for a resource-based policy document is 20 KB. DynamoDB counts whitespaces
     *         when calculating the size of a policy against this limit.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Within a resource-based policy, if the action for a DynamoDB service-linked role (SLR) to replicate data
     *         for a global table is denied, adding or deleting a replica will fail with an error.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For a full list of all considerations that apply while attaching a resource-based policy, see <a
     *         href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/rbac-considerations.html"
     *         >Resource-based policy considerations</a>.
     */

    public String getPolicy() {
        return this.policy;
    }

    /**
     * <p>
     * An Amazon Web Services resource-based policy document in JSON format.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The maximum size supported for a resource-based policy document is 20 KB. DynamoDB counts whitespaces when
     * calculating the size of a policy against this limit.
     * </p>
     * </li>
     * <li>
     * <p>
     * Within a resource-based policy, if the action for a DynamoDB service-linked role (SLR) to replicate data for a
     * global table is denied, adding or deleting a replica will fail with an error.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For a full list of all considerations that apply while attaching a resource-based policy, see <a
     * href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/rbac-considerations.html">Resource-based
     * policy considerations</a>.
     * </p>
     * 
     * @param policy
     *        An Amazon Web Services resource-based policy document in JSON format.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        The maximum size supported for a resource-based policy document is 20 KB. DynamoDB counts whitespaces when
     *        calculating the size of a policy against this limit.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Within a resource-based policy, if the action for a DynamoDB service-linked role (SLR) to replicate data
     *        for a global table is denied, adding or deleting a replica will fail with an error.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For a full list of all considerations that apply while attaching a resource-based policy, see <a
     *        href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/rbac-considerations.html"
     *        >Resource-based policy considerations</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutResourcePolicyRequest withPolicy(String policy) {
        setPolicy(policy);
        return this;
    }

    /**
     * <p>
     * A string value that you can use to conditionally update your policy. You can provide the revision ID of your
     * existing policy to make mutating requests against that policy.
     * </p>
     * <note>
     * <p>
     * When you provide an expected revision ID, if the revision ID of the existing policy on the resource doesn't match
     * or if there's no policy attached to the resource, your request will be rejected with a
     * <code>PolicyNotFoundException</code>.
     * </p>
     * </note>
     * <p>
     * To conditionally attach a policy when no policy exists for the resource, specify <code>NO_POLICY</code> for the
     * revision ID.
     * </p>
     * 
     * @param expectedRevisionId
     *        A string value that you can use to conditionally update your policy. You can provide the revision ID of
     *        your existing policy to make mutating requests against that policy.</p> <note>
     *        <p>
     *        When you provide an expected revision ID, if the revision ID of the existing policy on the resource
     *        doesn't match or if there's no policy attached to the resource, your request will be rejected with a
     *        <code>PolicyNotFoundException</code>.
     *        </p>
     *        </note>
     *        <p>
     *        To conditionally attach a policy when no policy exists for the resource, specify <code>NO_POLICY</code>
     *        for the revision ID.
     */

    public void setExpectedRevisionId(String expectedRevisionId) {
        this.expectedRevisionId = expectedRevisionId;
    }

    /**
     * <p>
     * A string value that you can use to conditionally update your policy. You can provide the revision ID of your
     * existing policy to make mutating requests against that policy.
     * </p>
     * <note>
     * <p>
     * When you provide an expected revision ID, if the revision ID of the existing policy on the resource doesn't match
     * or if there's no policy attached to the resource, your request will be rejected with a
     * <code>PolicyNotFoundException</code>.
     * </p>
     * </note>
     * <p>
     * To conditionally attach a policy when no policy exists for the resource, specify <code>NO_POLICY</code> for the
     * revision ID.
     * </p>
     * 
     * @return A string value that you can use to conditionally update your policy. You can provide the revision ID of
     *         your existing policy to make mutating requests against that policy.</p> <note>
     *         <p>
     *         When you provide an expected revision ID, if the revision ID of the existing policy on the resource
     *         doesn't match or if there's no policy attached to the resource, your request will be rejected with a
     *         <code>PolicyNotFoundException</code>.
     *         </p>
     *         </note>
     *         <p>
     *         To conditionally attach a policy when no policy exists for the resource, specify <code>NO_POLICY</code>
     *         for the revision ID.
     */

    public String getExpectedRevisionId() {
        return this.expectedRevisionId;
    }

    /**
     * <p>
     * A string value that you can use to conditionally update your policy. You can provide the revision ID of your
     * existing policy to make mutating requests against that policy.
     * </p>
     * <note>
     * <p>
     * When you provide an expected revision ID, if the revision ID of the existing policy on the resource doesn't match
     * or if there's no policy attached to the resource, your request will be rejected with a
     * <code>PolicyNotFoundException</code>.
     * </p>
     * </note>
     * <p>
     * To conditionally attach a policy when no policy exists for the resource, specify <code>NO_POLICY</code> for the
     * revision ID.
     * </p>
     * 
     * @param expectedRevisionId
     *        A string value that you can use to conditionally update your policy. You can provide the revision ID of
     *        your existing policy to make mutating requests against that policy.</p> <note>
     *        <p>
     *        When you provide an expected revision ID, if the revision ID of the existing policy on the resource
     *        doesn't match or if there's no policy attached to the resource, your request will be rejected with a
     *        <code>PolicyNotFoundException</code>.
     *        </p>
     *        </note>
     *        <p>
     *        To conditionally attach a policy when no policy exists for the resource, specify <code>NO_POLICY</code>
     *        for the revision ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutResourcePolicyRequest withExpectedRevisionId(String expectedRevisionId) {
        setExpectedRevisionId(expectedRevisionId);
        return this;
    }

    /**
     * <p>
     * Set this parameter to <code>true</code> to confirm that you want to remove your permissions to change the policy
     * of this resource in the future.
     * </p>
     * 
     * @param confirmRemoveSelfResourceAccess
     *        Set this parameter to <code>true</code> to confirm that you want to remove your permissions to change the
     *        policy of this resource in the future.
     */

    public void setConfirmRemoveSelfResourceAccess(Boolean confirmRemoveSelfResourceAccess) {
        this.confirmRemoveSelfResourceAccess = confirmRemoveSelfResourceAccess;
    }

    /**
     * <p>
     * Set this parameter to <code>true</code> to confirm that you want to remove your permissions to change the policy
     * of this resource in the future.
     * </p>
     * 
     * @return Set this parameter to <code>true</code> to confirm that you want to remove your permissions to change the
     *         policy of this resource in the future.
     */

    public Boolean getConfirmRemoveSelfResourceAccess() {
        return this.confirmRemoveSelfResourceAccess;
    }

    /**
     * <p>
     * Set this parameter to <code>true</code> to confirm that you want to remove your permissions to change the policy
     * of this resource in the future.
     * </p>
     * 
     * @param confirmRemoveSelfResourceAccess
     *        Set this parameter to <code>true</code> to confirm that you want to remove your permissions to change the
     *        policy of this resource in the future.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutResourcePolicyRequest withConfirmRemoveSelfResourceAccess(Boolean confirmRemoveSelfResourceAccess) {
        setConfirmRemoveSelfResourceAccess(confirmRemoveSelfResourceAccess);
        return this;
    }

    /**
     * <p>
     * Set this parameter to <code>true</code> to confirm that you want to remove your permissions to change the policy
     * of this resource in the future.
     * </p>
     * 
     * @return Set this parameter to <code>true</code> to confirm that you want to remove your permissions to change the
     *         policy of this resource in the future.
     */

    public Boolean isConfirmRemoveSelfResourceAccess() {
        return this.confirmRemoveSelfResourceAccess;
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
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn()).append(",");
        if (getPolicy() != null)
            sb.append("Policy: ").append(getPolicy()).append(",");
        if (getExpectedRevisionId() != null)
            sb.append("ExpectedRevisionId: ").append(getExpectedRevisionId()).append(",");
        if (getConfirmRemoveSelfResourceAccess() != null)
            sb.append("ConfirmRemoveSelfResourceAccess: ").append(getConfirmRemoveSelfResourceAccess());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutResourcePolicyRequest == false)
            return false;
        PutResourcePolicyRequest other = (PutResourcePolicyRequest) obj;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getPolicy() == null ^ this.getPolicy() == null)
            return false;
        if (other.getPolicy() != null && other.getPolicy().equals(this.getPolicy()) == false)
            return false;
        if (other.getExpectedRevisionId() == null ^ this.getExpectedRevisionId() == null)
            return false;
        if (other.getExpectedRevisionId() != null && other.getExpectedRevisionId().equals(this.getExpectedRevisionId()) == false)
            return false;
        if (other.getConfirmRemoveSelfResourceAccess() == null ^ this.getConfirmRemoveSelfResourceAccess() == null)
            return false;
        if (other.getConfirmRemoveSelfResourceAccess() != null
                && other.getConfirmRemoveSelfResourceAccess().equals(this.getConfirmRemoveSelfResourceAccess()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getPolicy() == null) ? 0 : getPolicy().hashCode());
        hashCode = prime * hashCode + ((getExpectedRevisionId() == null) ? 0 : getExpectedRevisionId().hashCode());
        hashCode = prime * hashCode + ((getConfirmRemoveSelfResourceAccess() == null) ? 0 : getConfirmRemoveSelfResourceAccess().hashCode());
        return hashCode;
    }

    @Override
    public PutResourcePolicyRequest clone() {
        return (PutResourcePolicyRequest) super.clone();
    }

}
