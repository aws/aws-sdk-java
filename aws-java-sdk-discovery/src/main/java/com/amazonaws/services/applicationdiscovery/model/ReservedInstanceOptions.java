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
package com.amazonaws.services.applicationdiscovery.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Used to provide Reserved Instance preferences for the recommendation.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReservedInstanceOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The payment plan to use for your Reserved Instance.
     * </p>
     */
    private String purchasingOption;
    /**
     * <p>
     * The flexibility to change the instance types needed for your Reserved Instance.
     * </p>
     */
    private String offeringClass;
    /**
     * <p>
     * The preferred duration of the Reserved Instance term.
     * </p>
     */
    private String termLength;

    /**
     * <p>
     * The payment plan to use for your Reserved Instance.
     * </p>
     * 
     * @param purchasingOption
     *        The payment plan to use for your Reserved Instance.
     * @see PurchasingOption
     */

    public void setPurchasingOption(String purchasingOption) {
        this.purchasingOption = purchasingOption;
    }

    /**
     * <p>
     * The payment plan to use for your Reserved Instance.
     * </p>
     * 
     * @return The payment plan to use for your Reserved Instance.
     * @see PurchasingOption
     */

    public String getPurchasingOption() {
        return this.purchasingOption;
    }

    /**
     * <p>
     * The payment plan to use for your Reserved Instance.
     * </p>
     * 
     * @param purchasingOption
     *        The payment plan to use for your Reserved Instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PurchasingOption
     */

    public ReservedInstanceOptions withPurchasingOption(String purchasingOption) {
        setPurchasingOption(purchasingOption);
        return this;
    }

    /**
     * <p>
     * The payment plan to use for your Reserved Instance.
     * </p>
     * 
     * @param purchasingOption
     *        The payment plan to use for your Reserved Instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PurchasingOption
     */

    public ReservedInstanceOptions withPurchasingOption(PurchasingOption purchasingOption) {
        this.purchasingOption = purchasingOption.toString();
        return this;
    }

    /**
     * <p>
     * The flexibility to change the instance types needed for your Reserved Instance.
     * </p>
     * 
     * @param offeringClass
     *        The flexibility to change the instance types needed for your Reserved Instance.
     * @see OfferingClass
     */

    public void setOfferingClass(String offeringClass) {
        this.offeringClass = offeringClass;
    }

    /**
     * <p>
     * The flexibility to change the instance types needed for your Reserved Instance.
     * </p>
     * 
     * @return The flexibility to change the instance types needed for your Reserved Instance.
     * @see OfferingClass
     */

    public String getOfferingClass() {
        return this.offeringClass;
    }

    /**
     * <p>
     * The flexibility to change the instance types needed for your Reserved Instance.
     * </p>
     * 
     * @param offeringClass
     *        The flexibility to change the instance types needed for your Reserved Instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OfferingClass
     */

    public ReservedInstanceOptions withOfferingClass(String offeringClass) {
        setOfferingClass(offeringClass);
        return this;
    }

    /**
     * <p>
     * The flexibility to change the instance types needed for your Reserved Instance.
     * </p>
     * 
     * @param offeringClass
     *        The flexibility to change the instance types needed for your Reserved Instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OfferingClass
     */

    public ReservedInstanceOptions withOfferingClass(OfferingClass offeringClass) {
        this.offeringClass = offeringClass.toString();
        return this;
    }

    /**
     * <p>
     * The preferred duration of the Reserved Instance term.
     * </p>
     * 
     * @param termLength
     *        The preferred duration of the Reserved Instance term.
     * @see TermLength
     */

    public void setTermLength(String termLength) {
        this.termLength = termLength;
    }

    /**
     * <p>
     * The preferred duration of the Reserved Instance term.
     * </p>
     * 
     * @return The preferred duration of the Reserved Instance term.
     * @see TermLength
     */

    public String getTermLength() {
        return this.termLength;
    }

    /**
     * <p>
     * The preferred duration of the Reserved Instance term.
     * </p>
     * 
     * @param termLength
     *        The preferred duration of the Reserved Instance term.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TermLength
     */

    public ReservedInstanceOptions withTermLength(String termLength) {
        setTermLength(termLength);
        return this;
    }

    /**
     * <p>
     * The preferred duration of the Reserved Instance term.
     * </p>
     * 
     * @param termLength
     *        The preferred duration of the Reserved Instance term.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TermLength
     */

    public ReservedInstanceOptions withTermLength(TermLength termLength) {
        this.termLength = termLength.toString();
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
        if (getPurchasingOption() != null)
            sb.append("PurchasingOption: ").append(getPurchasingOption()).append(",");
        if (getOfferingClass() != null)
            sb.append("OfferingClass: ").append(getOfferingClass()).append(",");
        if (getTermLength() != null)
            sb.append("TermLength: ").append(getTermLength());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReservedInstanceOptions == false)
            return false;
        ReservedInstanceOptions other = (ReservedInstanceOptions) obj;
        if (other.getPurchasingOption() == null ^ this.getPurchasingOption() == null)
            return false;
        if (other.getPurchasingOption() != null && other.getPurchasingOption().equals(this.getPurchasingOption()) == false)
            return false;
        if (other.getOfferingClass() == null ^ this.getOfferingClass() == null)
            return false;
        if (other.getOfferingClass() != null && other.getOfferingClass().equals(this.getOfferingClass()) == false)
            return false;
        if (other.getTermLength() == null ^ this.getTermLength() == null)
            return false;
        if (other.getTermLength() != null && other.getTermLength().equals(this.getTermLength()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPurchasingOption() == null) ? 0 : getPurchasingOption().hashCode());
        hashCode = prime * hashCode + ((getOfferingClass() == null) ? 0 : getOfferingClass().hashCode());
        hashCode = prime * hashCode + ((getTermLength() == null) ? 0 : getTermLength().hashCode());
        return hashCode;
    }

    @Override
    public ReservedInstanceOptions clone() {
        try {
            return (ReservedInstanceOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.applicationdiscovery.model.transform.ReservedInstanceOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
