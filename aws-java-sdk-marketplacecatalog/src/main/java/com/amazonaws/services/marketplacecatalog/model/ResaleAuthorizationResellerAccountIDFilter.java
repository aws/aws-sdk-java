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
package com.amazonaws.services.marketplacecatalog.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Allows filtering on the <code>ResellerAccountID</code> of a ResaleAuthorization.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/marketplace-catalog-2018-09-17/ResaleAuthorizationResellerAccountIDFilter"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResaleAuthorizationResellerAccountIDFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Allows filtering on the <code>ResellerAccountID</code> of a ResaleAuthorization with list input.
     * </p>
     */
    private java.util.List<String> valueList;
    /**
     * <p>
     * Allows filtering on the <code>ResellerAccountID</code> of a ResaleAuthorization with wild card input.
     * </p>
     */
    private String wildCardValue;

    /**
     * <p>
     * Allows filtering on the <code>ResellerAccountID</code> of a ResaleAuthorization with list input.
     * </p>
     * 
     * @return Allows filtering on the <code>ResellerAccountID</code> of a ResaleAuthorization with list input.
     */

    public java.util.List<String> getValueList() {
        return valueList;
    }

    /**
     * <p>
     * Allows filtering on the <code>ResellerAccountID</code> of a ResaleAuthorization with list input.
     * </p>
     * 
     * @param valueList
     *        Allows filtering on the <code>ResellerAccountID</code> of a ResaleAuthorization with list input.
     */

    public void setValueList(java.util.Collection<String> valueList) {
        if (valueList == null) {
            this.valueList = null;
            return;
        }

        this.valueList = new java.util.ArrayList<String>(valueList);
    }

    /**
     * <p>
     * Allows filtering on the <code>ResellerAccountID</code> of a ResaleAuthorization with list input.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValueList(java.util.Collection)} or {@link #withValueList(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param valueList
     *        Allows filtering on the <code>ResellerAccountID</code> of a ResaleAuthorization with list input.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResaleAuthorizationResellerAccountIDFilter withValueList(String... valueList) {
        if (this.valueList == null) {
            setValueList(new java.util.ArrayList<String>(valueList.length));
        }
        for (String ele : valueList) {
            this.valueList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Allows filtering on the <code>ResellerAccountID</code> of a ResaleAuthorization with list input.
     * </p>
     * 
     * @param valueList
     *        Allows filtering on the <code>ResellerAccountID</code> of a ResaleAuthorization with list input.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResaleAuthorizationResellerAccountIDFilter withValueList(java.util.Collection<String> valueList) {
        setValueList(valueList);
        return this;
    }

    /**
     * <p>
     * Allows filtering on the <code>ResellerAccountID</code> of a ResaleAuthorization with wild card input.
     * </p>
     * 
     * @param wildCardValue
     *        Allows filtering on the <code>ResellerAccountID</code> of a ResaleAuthorization with wild card input.
     */

    public void setWildCardValue(String wildCardValue) {
        this.wildCardValue = wildCardValue;
    }

    /**
     * <p>
     * Allows filtering on the <code>ResellerAccountID</code> of a ResaleAuthorization with wild card input.
     * </p>
     * 
     * @return Allows filtering on the <code>ResellerAccountID</code> of a ResaleAuthorization with wild card input.
     */

    public String getWildCardValue() {
        return this.wildCardValue;
    }

    /**
     * <p>
     * Allows filtering on the <code>ResellerAccountID</code> of a ResaleAuthorization with wild card input.
     * </p>
     * 
     * @param wildCardValue
     *        Allows filtering on the <code>ResellerAccountID</code> of a ResaleAuthorization with wild card input.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResaleAuthorizationResellerAccountIDFilter withWildCardValue(String wildCardValue) {
        setWildCardValue(wildCardValue);
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
        if (getValueList() != null)
            sb.append("ValueList: ").append(getValueList()).append(",");
        if (getWildCardValue() != null)
            sb.append("WildCardValue: ").append(getWildCardValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResaleAuthorizationResellerAccountIDFilter == false)
            return false;
        ResaleAuthorizationResellerAccountIDFilter other = (ResaleAuthorizationResellerAccountIDFilter) obj;
        if (other.getValueList() == null ^ this.getValueList() == null)
            return false;
        if (other.getValueList() != null && other.getValueList().equals(this.getValueList()) == false)
            return false;
        if (other.getWildCardValue() == null ^ this.getWildCardValue() == null)
            return false;
        if (other.getWildCardValue() != null && other.getWildCardValue().equals(this.getWildCardValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getValueList() == null) ? 0 : getValueList().hashCode());
        hashCode = prime * hashCode + ((getWildCardValue() == null) ? 0 : getWildCardValue().hashCode());
        return hashCode;
    }

    @Override
    public ResaleAuthorizationResellerAccountIDFilter clone() {
        try {
            return (ResaleAuthorizationResellerAccountIDFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.marketplacecatalog.model.transform.ResaleAuthorizationResellerAccountIDFilterMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
