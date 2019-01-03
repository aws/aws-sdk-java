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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/PutResourcePolicy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutResourcePolicyResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A hash of the policy that has just been set. This must be included in a subsequent call that overwrites or
     * updates this policy.
     * </p>
     */
    private String policyHash;

    /**
     * <p>
     * A hash of the policy that has just been set. This must be included in a subsequent call that overwrites or
     * updates this policy.
     * </p>
     * 
     * @param policyHash
     *        A hash of the policy that has just been set. This must be included in a subsequent call that overwrites or
     *        updates this policy.
     */

    public void setPolicyHash(String policyHash) {
        this.policyHash = policyHash;
    }

    /**
     * <p>
     * A hash of the policy that has just been set. This must be included in a subsequent call that overwrites or
     * updates this policy.
     * </p>
     * 
     * @return A hash of the policy that has just been set. This must be included in a subsequent call that overwrites
     *         or updates this policy.
     */

    public String getPolicyHash() {
        return this.policyHash;
    }

    /**
     * <p>
     * A hash of the policy that has just been set. This must be included in a subsequent call that overwrites or
     * updates this policy.
     * </p>
     * 
     * @param policyHash
     *        A hash of the policy that has just been set. This must be included in a subsequent call that overwrites or
     *        updates this policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutResourcePolicyResult withPolicyHash(String policyHash) {
        setPolicyHash(policyHash);
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
        if (getPolicyHash() != null)
            sb.append("PolicyHash: ").append(getPolicyHash());
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
        if (other.getPolicyHash() == null ^ this.getPolicyHash() == null)
            return false;
        if (other.getPolicyHash() != null && other.getPolicyHash().equals(this.getPolicyHash()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPolicyHash() == null) ? 0 : getPolicyHash().hashCode());
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
