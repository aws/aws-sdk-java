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
package com.amazonaws.services.networkmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/PutCoreNetworkPolicy"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutCoreNetworkPolicyResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Describes the changed core network policy.
     * </p>
     */
    private CoreNetworkPolicy coreNetworkPolicy;

    /**
     * <p>
     * Describes the changed core network policy.
     * </p>
     * 
     * @param coreNetworkPolicy
     *        Describes the changed core network policy.
     */

    public void setCoreNetworkPolicy(CoreNetworkPolicy coreNetworkPolicy) {
        this.coreNetworkPolicy = coreNetworkPolicy;
    }

    /**
     * <p>
     * Describes the changed core network policy.
     * </p>
     * 
     * @return Describes the changed core network policy.
     */

    public CoreNetworkPolicy getCoreNetworkPolicy() {
        return this.coreNetworkPolicy;
    }

    /**
     * <p>
     * Describes the changed core network policy.
     * </p>
     * 
     * @param coreNetworkPolicy
     *        Describes the changed core network policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutCoreNetworkPolicyResult withCoreNetworkPolicy(CoreNetworkPolicy coreNetworkPolicy) {
        setCoreNetworkPolicy(coreNetworkPolicy);
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
        if (getCoreNetworkPolicy() != null)
            sb.append("CoreNetworkPolicy: ").append(getCoreNetworkPolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutCoreNetworkPolicyResult == false)
            return false;
        PutCoreNetworkPolicyResult other = (PutCoreNetworkPolicyResult) obj;
        if (other.getCoreNetworkPolicy() == null ^ this.getCoreNetworkPolicy() == null)
            return false;
        if (other.getCoreNetworkPolicy() != null && other.getCoreNetworkPolicy().equals(this.getCoreNetworkPolicy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCoreNetworkPolicy() == null) ? 0 : getCoreNetworkPolicy().hashCode());
        return hashCode;
    }

    @Override
    public PutCoreNetworkPolicyResult clone() {
        try {
            return (PutCoreNetworkPolicyResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
