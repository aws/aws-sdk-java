/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.comprehend.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/PutResourcePolicy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutResourcePolicyResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The revision ID of the policy. Each time you modify a policy, Amazon Comprehend assigns a new revision ID, and it
     * deletes the prior version of the policy.
     * </p>
     */
    private String policyRevisionId;

    /**
     * <p>
     * The revision ID of the policy. Each time you modify a policy, Amazon Comprehend assigns a new revision ID, and it
     * deletes the prior version of the policy.
     * </p>
     * 
     * @param policyRevisionId
     *        The revision ID of the policy. Each time you modify a policy, Amazon Comprehend assigns a new revision ID,
     *        and it deletes the prior version of the policy.
     */

    public void setPolicyRevisionId(String policyRevisionId) {
        this.policyRevisionId = policyRevisionId;
    }

    /**
     * <p>
     * The revision ID of the policy. Each time you modify a policy, Amazon Comprehend assigns a new revision ID, and it
     * deletes the prior version of the policy.
     * </p>
     * 
     * @return The revision ID of the policy. Each time you modify a policy, Amazon Comprehend assigns a new revision
     *         ID, and it deletes the prior version of the policy.
     */

    public String getPolicyRevisionId() {
        return this.policyRevisionId;
    }

    /**
     * <p>
     * The revision ID of the policy. Each time you modify a policy, Amazon Comprehend assigns a new revision ID, and it
     * deletes the prior version of the policy.
     * </p>
     * 
     * @param policyRevisionId
     *        The revision ID of the policy. Each time you modify a policy, Amazon Comprehend assigns a new revision ID,
     *        and it deletes the prior version of the policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutResourcePolicyResult withPolicyRevisionId(String policyRevisionId) {
        setPolicyRevisionId(policyRevisionId);
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
        if (getPolicyRevisionId() != null)
            sb.append("PolicyRevisionId: ").append(getPolicyRevisionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutResourcePolicyResult == false)
            return false;
        PutResourcePolicyResult other = (PutResourcePolicyResult) obj;
        if (other.getPolicyRevisionId() == null ^ this.getPolicyRevisionId() == null)
            return false;
        if (other.getPolicyRevisionId() != null && other.getPolicyRevisionId().equals(this.getPolicyRevisionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPolicyRevisionId() == null) ? 0 : getPolicyRevisionId().hashCode());
        return hashCode;
    }

    @Override
    public PutResourcePolicyResult clone() {
        try {
            return (PutResourcePolicyResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
