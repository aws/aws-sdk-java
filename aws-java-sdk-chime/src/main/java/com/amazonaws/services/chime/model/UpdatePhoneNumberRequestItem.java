/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.chime.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The phone number ID, product type, or calling name fields to update, used with the <a>BatchUpdatePhoneNumber</a> and
 * <a>UpdatePhoneNumber</a> actions.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/UpdatePhoneNumberRequestItem" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdatePhoneNumberRequestItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The phone number ID to update.
     * </p>
     */
    private String phoneNumberId;
    /**
     * <p>
     * The product type to update.
     * </p>
     */
    private String productType;
    /**
     * <p>
     * The outbound calling name to update.
     * </p>
     */
    private String callingName;

    /**
     * <p>
     * The phone number ID to update.
     * </p>
     * 
     * @param phoneNumberId
     *        The phone number ID to update.
     */

    public void setPhoneNumberId(String phoneNumberId) {
        this.phoneNumberId = phoneNumberId;
    }

    /**
     * <p>
     * The phone number ID to update.
     * </p>
     * 
     * @return The phone number ID to update.
     */

    public String getPhoneNumberId() {
        return this.phoneNumberId;
    }

    /**
     * <p>
     * The phone number ID to update.
     * </p>
     * 
     * @param phoneNumberId
     *        The phone number ID to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePhoneNumberRequestItem withPhoneNumberId(String phoneNumberId) {
        setPhoneNumberId(phoneNumberId);
        return this;
    }

    /**
     * <p>
     * The product type to update.
     * </p>
     * 
     * @param productType
     *        The product type to update.
     * @see PhoneNumberProductType
     */

    public void setProductType(String productType) {
        this.productType = productType;
    }

    /**
     * <p>
     * The product type to update.
     * </p>
     * 
     * @return The product type to update.
     * @see PhoneNumberProductType
     */

    public String getProductType() {
        return this.productType;
    }

    /**
     * <p>
     * The product type to update.
     * </p>
     * 
     * @param productType
     *        The product type to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PhoneNumberProductType
     */

    public UpdatePhoneNumberRequestItem withProductType(String productType) {
        setProductType(productType);
        return this;
    }

    /**
     * <p>
     * The product type to update.
     * </p>
     * 
     * @param productType
     *        The product type to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PhoneNumberProductType
     */

    public UpdatePhoneNumberRequestItem withProductType(PhoneNumberProductType productType) {
        this.productType = productType.toString();
        return this;
    }

    /**
     * <p>
     * The outbound calling name to update.
     * </p>
     * 
     * @param callingName
     *        The outbound calling name to update.
     */

    public void setCallingName(String callingName) {
        this.callingName = callingName;
    }

    /**
     * <p>
     * The outbound calling name to update.
     * </p>
     * 
     * @return The outbound calling name to update.
     */

    public String getCallingName() {
        return this.callingName;
    }

    /**
     * <p>
     * The outbound calling name to update.
     * </p>
     * 
     * @param callingName
     *        The outbound calling name to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePhoneNumberRequestItem withCallingName(String callingName) {
        setCallingName(callingName);
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
        if (getPhoneNumberId() != null)
            sb.append("PhoneNumberId: ").append(getPhoneNumberId()).append(",");
        if (getProductType() != null)
            sb.append("ProductType: ").append(getProductType()).append(",");
        if (getCallingName() != null)
            sb.append("CallingName: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdatePhoneNumberRequestItem == false)
            return false;
        UpdatePhoneNumberRequestItem other = (UpdatePhoneNumberRequestItem) obj;
        if (other.getPhoneNumberId() == null ^ this.getPhoneNumberId() == null)
            return false;
        if (other.getPhoneNumberId() != null && other.getPhoneNumberId().equals(this.getPhoneNumberId()) == false)
            return false;
        if (other.getProductType() == null ^ this.getProductType() == null)
            return false;
        if (other.getProductType() != null && other.getProductType().equals(this.getProductType()) == false)
            return false;
        if (other.getCallingName() == null ^ this.getCallingName() == null)
            return false;
        if (other.getCallingName() != null && other.getCallingName().equals(this.getCallingName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPhoneNumberId() == null) ? 0 : getPhoneNumberId().hashCode());
        hashCode = prime * hashCode + ((getProductType() == null) ? 0 : getProductType().hashCode());
        hashCode = prime * hashCode + ((getCallingName() == null) ? 0 : getCallingName().hashCode());
        return hashCode;
    }

    @Override
    public UpdatePhoneNumberRequestItem clone() {
        try {
            return (UpdatePhoneNumberRequestItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chime.model.transform.UpdatePhoneNumberRequestItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
