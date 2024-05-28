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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/DeleteResourcePolicy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteResourcePolicyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the DynamoDB resource from which the policy will be removed. The resources you
     * can specify include tables and streams. If you remove the policy of a table, it will also remove the permissions
     * for the table's indexes defined in that policy document. This is because index permissions are defined in the
     * table's policy.
     * </p>
     */
    private String resourceArn;
    /**
     * <p>
     * A string value that you can use to conditionally delete your policy. When you provide an expected revision ID, if
     * the revision ID of the existing policy on the resource doesn't match or if there's no policy attached to the
     * resource, the request will fail and return a <code>PolicyNotFoundException</code>.
     * </p>
     */
    private String expectedRevisionId;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the DynamoDB resource from which the policy will be removed. The resources you
     * can specify include tables and streams. If you remove the policy of a table, it will also remove the permissions
     * for the table's indexes defined in that policy document. This is because index permissions are defined in the
     * table's policy.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) of the DynamoDB resource from which the policy will be removed. The
     *        resources you can specify include tables and streams. If you remove the policy of a table, it will also
     *        remove the permissions for the table's indexes defined in that policy document. This is because index
     *        permissions are defined in the table's policy.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the DynamoDB resource from which the policy will be removed. The resources you
     * can specify include tables and streams. If you remove the policy of a table, it will also remove the permissions
     * for the table's indexes defined in that policy document. This is because index permissions are defined in the
     * table's policy.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the DynamoDB resource from which the policy will be removed. The
     *         resources you can specify include tables and streams. If you remove the policy of a table, it will also
     *         remove the permissions for the table's indexes defined in that policy document. This is because index
     *         permissions are defined in the table's policy.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the DynamoDB resource from which the policy will be removed. The resources you
     * can specify include tables and streams. If you remove the policy of a table, it will also remove the permissions
     * for the table's indexes defined in that policy document. This is because index permissions are defined in the
     * table's policy.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) of the DynamoDB resource from which the policy will be removed. The
     *        resources you can specify include tables and streams. If you remove the policy of a table, it will also
     *        remove the permissions for the table's indexes defined in that policy document. This is because index
     *        permissions are defined in the table's policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteResourcePolicyRequest withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

    /**
     * <p>
     * A string value that you can use to conditionally delete your policy. When you provide an expected revision ID, if
     * the revision ID of the existing policy on the resource doesn't match or if there's no policy attached to the
     * resource, the request will fail and return a <code>PolicyNotFoundException</code>.
     * </p>
     * 
     * @param expectedRevisionId
     *        A string value that you can use to conditionally delete your policy. When you provide an expected revision
     *        ID, if the revision ID of the existing policy on the resource doesn't match or if there's no policy
     *        attached to the resource, the request will fail and return a <code>PolicyNotFoundException</code>.
     */

    public void setExpectedRevisionId(String expectedRevisionId) {
        this.expectedRevisionId = expectedRevisionId;
    }

    /**
     * <p>
     * A string value that you can use to conditionally delete your policy. When you provide an expected revision ID, if
     * the revision ID of the existing policy on the resource doesn't match or if there's no policy attached to the
     * resource, the request will fail and return a <code>PolicyNotFoundException</code>.
     * </p>
     * 
     * @return A string value that you can use to conditionally delete your policy. When you provide an expected
     *         revision ID, if the revision ID of the existing policy on the resource doesn't match or if there's no
     *         policy attached to the resource, the request will fail and return a <code>PolicyNotFoundException</code>.
     */

    public String getExpectedRevisionId() {
        return this.expectedRevisionId;
    }

    /**
     * <p>
     * A string value that you can use to conditionally delete your policy. When you provide an expected revision ID, if
     * the revision ID of the existing policy on the resource doesn't match or if there's no policy attached to the
     * resource, the request will fail and return a <code>PolicyNotFoundException</code>.
     * </p>
     * 
     * @param expectedRevisionId
     *        A string value that you can use to conditionally delete your policy. When you provide an expected revision
     *        ID, if the revision ID of the existing policy on the resource doesn't match or if there's no policy
     *        attached to the resource, the request will fail and return a <code>PolicyNotFoundException</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteResourcePolicyRequest withExpectedRevisionId(String expectedRevisionId) {
        setExpectedRevisionId(expectedRevisionId);
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
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn()).append(",");
        if (getExpectedRevisionId() != null)
            sb.append("ExpectedRevisionId: ").append(getExpectedRevisionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteResourcePolicyRequest == false)
            return false;
        DeleteResourcePolicyRequest other = (DeleteResourcePolicyRequest) obj;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getExpectedRevisionId() == null ^ this.getExpectedRevisionId() == null)
            return false;
        if (other.getExpectedRevisionId() != null && other.getExpectedRevisionId().equals(this.getExpectedRevisionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getExpectedRevisionId() == null) ? 0 : getExpectedRevisionId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteResourcePolicyRequest clone() {
        return (DeleteResourcePolicyRequest) super.clone();
    }

}
