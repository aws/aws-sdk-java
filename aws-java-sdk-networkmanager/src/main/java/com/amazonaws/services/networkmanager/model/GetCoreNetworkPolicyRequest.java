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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/GetCoreNetworkPolicy"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetCoreNetworkPolicyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of a core network.
     * </p>
     */
    private String coreNetworkId;
    /**
     * <p>
     * The ID of a core network policy version.
     * </p>
     */
    private Integer policyVersionId;
    /**
     * <p>
     * The alias of a core network policy
     * </p>
     */
    private String alias;

    /**
     * <p>
     * The ID of a core network.
     * </p>
     * 
     * @param coreNetworkId
     *        The ID of a core network.
     */

    public void setCoreNetworkId(String coreNetworkId) {
        this.coreNetworkId = coreNetworkId;
    }

    /**
     * <p>
     * The ID of a core network.
     * </p>
     * 
     * @return The ID of a core network.
     */

    public String getCoreNetworkId() {
        return this.coreNetworkId;
    }

    /**
     * <p>
     * The ID of a core network.
     * </p>
     * 
     * @param coreNetworkId
     *        The ID of a core network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCoreNetworkPolicyRequest withCoreNetworkId(String coreNetworkId) {
        setCoreNetworkId(coreNetworkId);
        return this;
    }

    /**
     * <p>
     * The ID of a core network policy version.
     * </p>
     * 
     * @param policyVersionId
     *        The ID of a core network policy version.
     */

    public void setPolicyVersionId(Integer policyVersionId) {
        this.policyVersionId = policyVersionId;
    }

    /**
     * <p>
     * The ID of a core network policy version.
     * </p>
     * 
     * @return The ID of a core network policy version.
     */

    public Integer getPolicyVersionId() {
        return this.policyVersionId;
    }

    /**
     * <p>
     * The ID of a core network policy version.
     * </p>
     * 
     * @param policyVersionId
     *        The ID of a core network policy version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCoreNetworkPolicyRequest withPolicyVersionId(Integer policyVersionId) {
        setPolicyVersionId(policyVersionId);
        return this;
    }

    /**
     * <p>
     * The alias of a core network policy
     * </p>
     * 
     * @param alias
     *        The alias of a core network policy
     * @see CoreNetworkPolicyAlias
     */

    public void setAlias(String alias) {
        this.alias = alias;
    }

    /**
     * <p>
     * The alias of a core network policy
     * </p>
     * 
     * @return The alias of a core network policy
     * @see CoreNetworkPolicyAlias
     */

    public String getAlias() {
        return this.alias;
    }

    /**
     * <p>
     * The alias of a core network policy
     * </p>
     * 
     * @param alias
     *        The alias of a core network policy
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CoreNetworkPolicyAlias
     */

    public GetCoreNetworkPolicyRequest withAlias(String alias) {
        setAlias(alias);
        return this;
    }

    /**
     * <p>
     * The alias of a core network policy
     * </p>
     * 
     * @param alias
     *        The alias of a core network policy
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CoreNetworkPolicyAlias
     */

    public GetCoreNetworkPolicyRequest withAlias(CoreNetworkPolicyAlias alias) {
        this.alias = alias.toString();
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
            sb.append("PolicyVersionId: ").append(getPolicyVersionId()).append(",");
        if (getAlias() != null)
            sb.append("Alias: ").append(getAlias());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetCoreNetworkPolicyRequest == false)
            return false;
        GetCoreNetworkPolicyRequest other = (GetCoreNetworkPolicyRequest) obj;
        if (other.getCoreNetworkId() == null ^ this.getCoreNetworkId() == null)
            return false;
        if (other.getCoreNetworkId() != null && other.getCoreNetworkId().equals(this.getCoreNetworkId()) == false)
            return false;
        if (other.getPolicyVersionId() == null ^ this.getPolicyVersionId() == null)
            return false;
        if (other.getPolicyVersionId() != null && other.getPolicyVersionId().equals(this.getPolicyVersionId()) == false)
            return false;
        if (other.getAlias() == null ^ this.getAlias() == null)
            return false;
        if (other.getAlias() != null && other.getAlias().equals(this.getAlias()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCoreNetworkId() == null) ? 0 : getCoreNetworkId().hashCode());
        hashCode = prime * hashCode + ((getPolicyVersionId() == null) ? 0 : getPolicyVersionId().hashCode());
        hashCode = prime * hashCode + ((getAlias() == null) ? 0 : getAlias().hashCode());
        return hashCode;
    }

    @Override
    public GetCoreNetworkPolicyRequest clone() {
        return (GetCoreNetworkPolicyRequest) super.clone();
    }

}
