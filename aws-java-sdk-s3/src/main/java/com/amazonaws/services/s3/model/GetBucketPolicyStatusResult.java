/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.s3.model;

import java.io.Serializable;

public class GetBucketPolicyStatusResult implements Serializable, Cloneable {

    private PolicyStatus policyStatus;

    /**
     * The public-policy status for this bucket.
     */
    public PolicyStatus getPolicyStatus() {
        return policyStatus;
    }

    /**
     * The public-policy status for this bucket.
     *
     * @param policyStatus Status of bucket.
     */
    public void setPolicyStatus(PolicyStatus policyStatus) {
        this.policyStatus = policyStatus;
    }

    /**
     * The public-policy status for this bucket.
     *
     * @param policyStatus Status of bucket.
     * @return This object for method chaining.
     */
    public GetBucketPolicyStatusResult withPolicyStatus(PolicyStatus policyStatus) {
        setPolicyStatus(policyStatus);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        final GetBucketPolicyStatusResult that = (GetBucketPolicyStatusResult) o;

        return policyStatus != null ? policyStatus.equals(that.policyStatus) : that.policyStatus == null;
    }

    @Override
    public int hashCode() {
        return policyStatus != null ? policyStatus.hashCode() : 0;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getPolicyStatus() != null) {
            sb.append("PolicyStatus: ").append(getPolicyStatus()).append(",");
        }
        sb.append("}");
        return sb.toString();
    }

    @Override
    public GetBucketPolicyStatusResult clone() {
        try {
            return (GetBucketPolicyStatusResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
