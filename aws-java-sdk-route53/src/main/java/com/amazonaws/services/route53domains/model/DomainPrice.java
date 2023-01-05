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
package com.amazonaws.services.route53domains.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the domain price associated with a TLD.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53domains-2014-05-15/DomainPrice" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DomainPrice implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the TLD for which the prices apply.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The price for domain registration with Route 53.
     * </p>
     */
    private PriceWithCurrency registrationPrice;
    /**
     * <p>
     * The price for transferring the domain registration to Route 53.
     * </p>
     */
    private PriceWithCurrency transferPrice;
    /**
     * <p>
     * The price for renewing domain registration with Route 53.
     * </p>
     */
    private PriceWithCurrency renewalPrice;
    /**
     * <p>
     * The price for changing domain ownership.
     * </p>
     */
    private PriceWithCurrency changeOwnershipPrice;
    /**
     * <p>
     * The price for restoring the domain with Route 53.
     * </p>
     */
    private PriceWithCurrency restorationPrice;

    /**
     * <p>
     * The name of the TLD for which the prices apply.
     * </p>
     * 
     * @param name
     *        The name of the TLD for which the prices apply.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the TLD for which the prices apply.
     * </p>
     * 
     * @return The name of the TLD for which the prices apply.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the TLD for which the prices apply.
     * </p>
     * 
     * @param name
     *        The name of the TLD for which the prices apply.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainPrice withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The price for domain registration with Route 53.
     * </p>
     * 
     * @param registrationPrice
     *        The price for domain registration with Route 53.
     */

    public void setRegistrationPrice(PriceWithCurrency registrationPrice) {
        this.registrationPrice = registrationPrice;
    }

    /**
     * <p>
     * The price for domain registration with Route 53.
     * </p>
     * 
     * @return The price for domain registration with Route 53.
     */

    public PriceWithCurrency getRegistrationPrice() {
        return this.registrationPrice;
    }

    /**
     * <p>
     * The price for domain registration with Route 53.
     * </p>
     * 
     * @param registrationPrice
     *        The price for domain registration with Route 53.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainPrice withRegistrationPrice(PriceWithCurrency registrationPrice) {
        setRegistrationPrice(registrationPrice);
        return this;
    }

    /**
     * <p>
     * The price for transferring the domain registration to Route 53.
     * </p>
     * 
     * @param transferPrice
     *        The price for transferring the domain registration to Route 53.
     */

    public void setTransferPrice(PriceWithCurrency transferPrice) {
        this.transferPrice = transferPrice;
    }

    /**
     * <p>
     * The price for transferring the domain registration to Route 53.
     * </p>
     * 
     * @return The price for transferring the domain registration to Route 53.
     */

    public PriceWithCurrency getTransferPrice() {
        return this.transferPrice;
    }

    /**
     * <p>
     * The price for transferring the domain registration to Route 53.
     * </p>
     * 
     * @param transferPrice
     *        The price for transferring the domain registration to Route 53.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainPrice withTransferPrice(PriceWithCurrency transferPrice) {
        setTransferPrice(transferPrice);
        return this;
    }

    /**
     * <p>
     * The price for renewing domain registration with Route 53.
     * </p>
     * 
     * @param renewalPrice
     *        The price for renewing domain registration with Route 53.
     */

    public void setRenewalPrice(PriceWithCurrency renewalPrice) {
        this.renewalPrice = renewalPrice;
    }

    /**
     * <p>
     * The price for renewing domain registration with Route 53.
     * </p>
     * 
     * @return The price for renewing domain registration with Route 53.
     */

    public PriceWithCurrency getRenewalPrice() {
        return this.renewalPrice;
    }

    /**
     * <p>
     * The price for renewing domain registration with Route 53.
     * </p>
     * 
     * @param renewalPrice
     *        The price for renewing domain registration with Route 53.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainPrice withRenewalPrice(PriceWithCurrency renewalPrice) {
        setRenewalPrice(renewalPrice);
        return this;
    }

    /**
     * <p>
     * The price for changing domain ownership.
     * </p>
     * 
     * @param changeOwnershipPrice
     *        The price for changing domain ownership.
     */

    public void setChangeOwnershipPrice(PriceWithCurrency changeOwnershipPrice) {
        this.changeOwnershipPrice = changeOwnershipPrice;
    }

    /**
     * <p>
     * The price for changing domain ownership.
     * </p>
     * 
     * @return The price for changing domain ownership.
     */

    public PriceWithCurrency getChangeOwnershipPrice() {
        return this.changeOwnershipPrice;
    }

    /**
     * <p>
     * The price for changing domain ownership.
     * </p>
     * 
     * @param changeOwnershipPrice
     *        The price for changing domain ownership.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainPrice withChangeOwnershipPrice(PriceWithCurrency changeOwnershipPrice) {
        setChangeOwnershipPrice(changeOwnershipPrice);
        return this;
    }

    /**
     * <p>
     * The price for restoring the domain with Route 53.
     * </p>
     * 
     * @param restorationPrice
     *        The price for restoring the domain with Route 53.
     */

    public void setRestorationPrice(PriceWithCurrency restorationPrice) {
        this.restorationPrice = restorationPrice;
    }

    /**
     * <p>
     * The price for restoring the domain with Route 53.
     * </p>
     * 
     * @return The price for restoring the domain with Route 53.
     */

    public PriceWithCurrency getRestorationPrice() {
        return this.restorationPrice;
    }

    /**
     * <p>
     * The price for restoring the domain with Route 53.
     * </p>
     * 
     * @param restorationPrice
     *        The price for restoring the domain with Route 53.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainPrice withRestorationPrice(PriceWithCurrency restorationPrice) {
        setRestorationPrice(restorationPrice);
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
        if (getRegistrationPrice() != null)
            sb.append("RegistrationPrice: ").append(getRegistrationPrice()).append(",");
        if (getTransferPrice() != null)
            sb.append("TransferPrice: ").append(getTransferPrice()).append(",");
        if (getRenewalPrice() != null)
            sb.append("RenewalPrice: ").append(getRenewalPrice()).append(",");
        if (getChangeOwnershipPrice() != null)
            sb.append("ChangeOwnershipPrice: ").append(getChangeOwnershipPrice()).append(",");
        if (getRestorationPrice() != null)
            sb.append("RestorationPrice: ").append(getRestorationPrice());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DomainPrice == false)
            return false;
        DomainPrice other = (DomainPrice) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getRegistrationPrice() == null ^ this.getRegistrationPrice() == null)
            return false;
        if (other.getRegistrationPrice() != null && other.getRegistrationPrice().equals(this.getRegistrationPrice()) == false)
            return false;
        if (other.getTransferPrice() == null ^ this.getTransferPrice() == null)
            return false;
        if (other.getTransferPrice() != null && other.getTransferPrice().equals(this.getTransferPrice()) == false)
            return false;
        if (other.getRenewalPrice() == null ^ this.getRenewalPrice() == null)
            return false;
        if (other.getRenewalPrice() != null && other.getRenewalPrice().equals(this.getRenewalPrice()) == false)
            return false;
        if (other.getChangeOwnershipPrice() == null ^ this.getChangeOwnershipPrice() == null)
            return false;
        if (other.getChangeOwnershipPrice() != null && other.getChangeOwnershipPrice().equals(this.getChangeOwnershipPrice()) == false)
            return false;
        if (other.getRestorationPrice() == null ^ this.getRestorationPrice() == null)
            return false;
        if (other.getRestorationPrice() != null && other.getRestorationPrice().equals(this.getRestorationPrice()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getRegistrationPrice() == null) ? 0 : getRegistrationPrice().hashCode());
        hashCode = prime * hashCode + ((getTransferPrice() == null) ? 0 : getTransferPrice().hashCode());
        hashCode = prime * hashCode + ((getRenewalPrice() == null) ? 0 : getRenewalPrice().hashCode());
        hashCode = prime * hashCode + ((getChangeOwnershipPrice() == null) ? 0 : getChangeOwnershipPrice().hashCode());
        hashCode = prime * hashCode + ((getRestorationPrice() == null) ? 0 : getRestorationPrice().hashCode());
        return hashCode;
    }

    @Override
    public DomainPrice clone() {
        try {
            return (DomainPrice) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.route53domains.model.transform.DomainPriceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
