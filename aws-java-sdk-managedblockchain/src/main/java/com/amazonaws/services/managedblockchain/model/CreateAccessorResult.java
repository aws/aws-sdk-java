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
package com.amazonaws.services.managedblockchain.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-2018-09-24/CreateAccessor" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateAccessorResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the accessor.
     * </p>
     */
    private String accessorId;
    /**
     * <p>
     * The billing token is a property of the Accessor. Use this token to when making calls to the blockchain network.
     * The billing token is used to track your accessor token for billing requests.
     * </p>
     */
    private String billingToken;
    /**
     * <p>
     * The blockchain network that the accessor token is created for.
     * </p>
     */
    private String networkType;

    /**
     * <p>
     * The unique identifier of the accessor.
     * </p>
     * 
     * @param accessorId
     *        The unique identifier of the accessor.
     */

    public void setAccessorId(String accessorId) {
        this.accessorId = accessorId;
    }

    /**
     * <p>
     * The unique identifier of the accessor.
     * </p>
     * 
     * @return The unique identifier of the accessor.
     */

    public String getAccessorId() {
        return this.accessorId;
    }

    /**
     * <p>
     * The unique identifier of the accessor.
     * </p>
     * 
     * @param accessorId
     *        The unique identifier of the accessor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAccessorResult withAccessorId(String accessorId) {
        setAccessorId(accessorId);
        return this;
    }

    /**
     * <p>
     * The billing token is a property of the Accessor. Use this token to when making calls to the blockchain network.
     * The billing token is used to track your accessor token for billing requests.
     * </p>
     * 
     * @param billingToken
     *        The billing token is a property of the Accessor. Use this token to when making calls to the blockchain
     *        network. The billing token is used to track your accessor token for billing requests.
     */

    public void setBillingToken(String billingToken) {
        this.billingToken = billingToken;
    }

    /**
     * <p>
     * The billing token is a property of the Accessor. Use this token to when making calls to the blockchain network.
     * The billing token is used to track your accessor token for billing requests.
     * </p>
     * 
     * @return The billing token is a property of the Accessor. Use this token to when making calls to the blockchain
     *         network. The billing token is used to track your accessor token for billing requests.
     */

    public String getBillingToken() {
        return this.billingToken;
    }

    /**
     * <p>
     * The billing token is a property of the Accessor. Use this token to when making calls to the blockchain network.
     * The billing token is used to track your accessor token for billing requests.
     * </p>
     * 
     * @param billingToken
     *        The billing token is a property of the Accessor. Use this token to when making calls to the blockchain
     *        network. The billing token is used to track your accessor token for billing requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAccessorResult withBillingToken(String billingToken) {
        setBillingToken(billingToken);
        return this;
    }

    /**
     * <p>
     * The blockchain network that the accessor token is created for.
     * </p>
     * 
     * @param networkType
     *        The blockchain network that the accessor token is created for.
     * @see AccessorNetworkType
     */

    public void setNetworkType(String networkType) {
        this.networkType = networkType;
    }

    /**
     * <p>
     * The blockchain network that the accessor token is created for.
     * </p>
     * 
     * @return The blockchain network that the accessor token is created for.
     * @see AccessorNetworkType
     */

    public String getNetworkType() {
        return this.networkType;
    }

    /**
     * <p>
     * The blockchain network that the accessor token is created for.
     * </p>
     * 
     * @param networkType
     *        The blockchain network that the accessor token is created for.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccessorNetworkType
     */

    public CreateAccessorResult withNetworkType(String networkType) {
        setNetworkType(networkType);
        return this;
    }

    /**
     * <p>
     * The blockchain network that the accessor token is created for.
     * </p>
     * 
     * @param networkType
     *        The blockchain network that the accessor token is created for.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccessorNetworkType
     */

    public CreateAccessorResult withNetworkType(AccessorNetworkType networkType) {
        this.networkType = networkType.toString();
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
        if (getAccessorId() != null)
            sb.append("AccessorId: ").append(getAccessorId()).append(",");
        if (getBillingToken() != null)
            sb.append("BillingToken: ").append(getBillingToken()).append(",");
        if (getNetworkType() != null)
            sb.append("NetworkType: ").append(getNetworkType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateAccessorResult == false)
            return false;
        CreateAccessorResult other = (CreateAccessorResult) obj;
        if (other.getAccessorId() == null ^ this.getAccessorId() == null)
            return false;
        if (other.getAccessorId() != null && other.getAccessorId().equals(this.getAccessorId()) == false)
            return false;
        if (other.getBillingToken() == null ^ this.getBillingToken() == null)
            return false;
        if (other.getBillingToken() != null && other.getBillingToken().equals(this.getBillingToken()) == false)
            return false;
        if (other.getNetworkType() == null ^ this.getNetworkType() == null)
            return false;
        if (other.getNetworkType() != null && other.getNetworkType().equals(this.getNetworkType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccessorId() == null) ? 0 : getAccessorId().hashCode());
        hashCode = prime * hashCode + ((getBillingToken() == null) ? 0 : getBillingToken().hashCode());
        hashCode = prime * hashCode + ((getNetworkType() == null) ? 0 : getNetworkType().hashCode());
        return hashCode;
    }

    @Override
    public CreateAccessorResult clone() {
        try {
            return (CreateAccessorResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
