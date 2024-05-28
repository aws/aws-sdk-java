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
package com.amazonaws.services.managedblockchainquery.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The metadata of the contract.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-query-2023-05-04/ContractMetadata"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ContractMetadata implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the token contract.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The symbol of the token contract.
     * </p>
     */
    private String symbol;
    /**
     * <p>
     * The decimals used by the token contract.
     * </p>
     */
    private Integer decimals;

    /**
     * <p>
     * The name of the token contract.
     * </p>
     * 
     * @param name
     *        The name of the token contract.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the token contract.
     * </p>
     * 
     * @return The name of the token contract.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the token contract.
     * </p>
     * 
     * @param name
     *        The name of the token contract.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContractMetadata withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The symbol of the token contract.
     * </p>
     * 
     * @param symbol
     *        The symbol of the token contract.
     */

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    /**
     * <p>
     * The symbol of the token contract.
     * </p>
     * 
     * @return The symbol of the token contract.
     */

    public String getSymbol() {
        return this.symbol;
    }

    /**
     * <p>
     * The symbol of the token contract.
     * </p>
     * 
     * @param symbol
     *        The symbol of the token contract.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContractMetadata withSymbol(String symbol) {
        setSymbol(symbol);
        return this;
    }

    /**
     * <p>
     * The decimals used by the token contract.
     * </p>
     * 
     * @param decimals
     *        The decimals used by the token contract.
     */

    public void setDecimals(Integer decimals) {
        this.decimals = decimals;
    }

    /**
     * <p>
     * The decimals used by the token contract.
     * </p>
     * 
     * @return The decimals used by the token contract.
     */

    public Integer getDecimals() {
        return this.decimals;
    }

    /**
     * <p>
     * The decimals used by the token contract.
     * </p>
     * 
     * @param decimals
     *        The decimals used by the token contract.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContractMetadata withDecimals(Integer decimals) {
        setDecimals(decimals);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getSymbol() != null)
            sb.append("Symbol: ").append(getSymbol()).append(",");
        if (getDecimals() != null)
            sb.append("Decimals: ").append(getDecimals());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ContractMetadata == false)
            return false;
        ContractMetadata other = (ContractMetadata) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getSymbol() == null ^ this.getSymbol() == null)
            return false;
        if (other.getSymbol() != null && other.getSymbol().equals(this.getSymbol()) == false)
            return false;
        if (other.getDecimals() == null ^ this.getDecimals() == null)
            return false;
        if (other.getDecimals() != null && other.getDecimals().equals(this.getDecimals()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSymbol() == null) ? 0 : getSymbol().hashCode());
        hashCode = prime * hashCode + ((getDecimals() == null) ? 0 : getDecimals().hashCode());
        return hashCode;
    }

    @Override
    public ContractMetadata clone() {
        try {
            return (ContractMetadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.managedblockchainquery.model.transform.ContractMetadataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
