/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.codeguruprofiler.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The structure representing the <code>putPermissionResponse</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguruprofiler-2019-07-18/PutPermission" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutPermissionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The JSON-formatted resource-based policy on the profiling group that includes the added permissions.
     * </p>
     */
    private String policy;
    /**
     * <p>
     * A universally unique identifier (UUID) for the revision of the resource-based policy that includes the added
     * permissions. The JSON-formatted policy is in the <code>policy</code> element of the response.
     * </p>
     */
    private String revisionId;

    /**
     * <p>
     * The JSON-formatted resource-based policy on the profiling group that includes the added permissions.
     * </p>
     * 
     * @param policy
     *        The JSON-formatted resource-based policy on the profiling group that includes the added permissions.
     */

    public void setPolicy(String policy) {
        this.policy = policy;
    }

    /**
     * <p>
     * The JSON-formatted resource-based policy on the profiling group that includes the added permissions.
     * </p>
     * 
     * @return The JSON-formatted resource-based policy on the profiling group that includes the added permissions.
     */

    public String getPolicy() {
        return this.policy;
    }

    /**
     * <p>
     * The JSON-formatted resource-based policy on the profiling group that includes the added permissions.
     * </p>
     * 
     * @param policy
     *        The JSON-formatted resource-based policy on the profiling group that includes the added permissions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutPermissionResult withPolicy(String policy) {
        setPolicy(policy);
        return this;
    }

    /**
     * <p>
     * A universally unique identifier (UUID) for the revision of the resource-based policy that includes the added
     * permissions. The JSON-formatted policy is in the <code>policy</code> element of the response.
     * </p>
     * 
     * @param revisionId
     *        A universally unique identifier (UUID) for the revision of the resource-based policy that includes the
     *        added permissions. The JSON-formatted policy is in the <code>policy</code> element of the response.
     */

    public void setRevisionId(String revisionId) {
        this.revisionId = revisionId;
    }

    /**
     * <p>
     * A universally unique identifier (UUID) for the revision of the resource-based policy that includes the added
     * permissions. The JSON-formatted policy is in the <code>policy</code> element of the response.
     * </p>
     * 
     * @return A universally unique identifier (UUID) for the revision of the resource-based policy that includes the
     *         added permissions. The JSON-formatted policy is in the <code>policy</code> element of the response.
     */

    public String getRevisionId() {
        return this.revisionId;
    }

    /**
     * <p>
     * A universally unique identifier (UUID) for the revision of the resource-based policy that includes the added
     * permissions. The JSON-formatted policy is in the <code>policy</code> element of the response.
     * </p>
     * 
     * @param revisionId
     *        A universally unique identifier (UUID) for the revision of the resource-based policy that includes the
     *        added permissions. The JSON-formatted policy is in the <code>policy</code> element of the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutPermissionResult withRevisionId(String revisionId) {
        setRevisionId(revisionId);
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
        if (getPolicy() != null)
            sb.append("Policy: ").append(getPolicy()).append(",");
        if (getRevisionId() != null)
            sb.append("RevisionId: ").append(getRevisionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutPermissionResult == false)
            return false;
        PutPermissionResult other = (PutPermissionResult) obj;
        if (other.getPolicy() == null ^ this.getPolicy() == null)
            return false;
        if (other.getPolicy() != null && other.getPolicy().equals(this.getPolicy()) == false)
            return false;
        if (other.getRevisionId() == null ^ this.getRevisionId() == null)
            return false;
        if (other.getRevisionId() != null && other.getRevisionId().equals(this.getRevisionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPolicy() == null) ? 0 : getPolicy().hashCode());
        hashCode = prime * hashCode + ((getRevisionId() == null) ? 0 : getRevisionId().hashCode());
        return hashCode;
    }

    @Override
    public PutPermissionResult clone() {
        try {
            return (PutPermissionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
