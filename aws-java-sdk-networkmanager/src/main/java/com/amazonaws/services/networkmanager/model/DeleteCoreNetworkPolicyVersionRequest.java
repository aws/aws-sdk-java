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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/DeleteCoreNetworkPolicyVersion"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteCoreNetworkPolicyVersionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of a core network for the deleted policy.
     * </p>
     */
    private String coreNetworkId;
    /**
     * <p>
     * The version ID of the deleted policy.
     * </p>
     */
    private Integer policyVersionId;

    /**
     * <p>
     * The ID of a core network for the deleted policy.
     * </p>
     * 
     * @param coreNetworkId
     *        The ID of a core network for the deleted policy.
     */

    public void setCoreNetworkId(String coreNetworkId) {
        this.coreNetworkId = coreNetworkId;
    }

    /**
     * <p>
     * The ID of a core network for the deleted policy.
     * </p>
     * 
     * @return The ID of a core network for the deleted policy.
     */

    public String getCoreNetworkId() {
        return this.coreNetworkId;
    }

    /**
     * <p>
     * The ID of a core network for the deleted policy.
     * </p>
     * 
     * @param coreNetworkId
     *        The ID of a core network for the deleted policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteCoreNetworkPolicyVersionRequest withCoreNetworkId(String coreNetworkId) {
        setCoreNetworkId(coreNetworkId);
        return this;
    }

    /**
     * <p>
     * The version ID of the deleted policy.
     * </p>
     * 
     * @param policyVersionId
     *        The version ID of the deleted policy.
     */

    public void setPolicyVersionId(Integer policyVersionId) {
        this.policyVersionId = policyVersionId;
    }

    /**
     * <p>
     * The version ID of the deleted policy.
     * </p>
     * 
     * @return The version ID of the deleted policy.
     */

    public Integer getPolicyVersionId() {
        return this.policyVersionId;
    }

    /**
     * <p>
     * The version ID of the deleted policy.
     * </p>
     * 
     * @param policyVersionId
     *        The version ID of the deleted policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteCoreNetworkPolicyVersionRequest withPolicyVersionId(Integer policyVersionId) {
        setPolicyVersionId(policyVersionId);
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
        if (getCoreNetworkId() != null)
            sb.append("CoreNetworkId: ").append(getCoreNetworkId()).append(",");
        if (getPolicyVersionId() != null)
            sb.append("PolicyVersionId: ").append(getPolicyVersionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteCoreNetworkPolicyVersionRequest == false)
            return false;
        DeleteCoreNetworkPolicyVersionRequest other = (DeleteCoreNetworkPolicyVersionRequest) obj;
        if (other.getCoreNetworkId() == null ^ this.getCoreNetworkId() == null)
            return false;
        if (other.getCoreNetworkId() != null && other.getCoreNetworkId().equals(this.getCoreNetworkId()) == false)
            return false;
        if (other.getPolicyVersionId() == null ^ this.getPolicyVersionId() == null)
            return false;
        if (other.getPolicyVersionId() != null && other.getPolicyVersionId().equals(this.getPolicyVersionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCoreNetworkId() == null) ? 0 : getCoreNetworkId().hashCode());
        hashCode = prime * hashCode + ((getPolicyVersionId() == null) ? 0 : getPolicyVersionId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteCoreNetworkPolicyVersionRequest clone() {
        return (DeleteCoreNetworkPolicyVersionRequest) super.clone();
    }

}
