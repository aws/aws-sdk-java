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
package com.amazonaws.services.billingconductor.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies if the billing group has the following features enabled.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/UpdateBillingGroupAccountGrouping"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateBillingGroupAccountGrouping implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies if this billing group will automatically associate newly added Amazon Web Services accounts that join
     * your consolidated billing family.
     * </p>
     */
    private Boolean autoAssociate;

    /**
     * <p>
     * Specifies if this billing group will automatically associate newly added Amazon Web Services accounts that join
     * your consolidated billing family.
     * </p>
     * 
     * @param autoAssociate
     *        Specifies if this billing group will automatically associate newly added Amazon Web Services accounts that
     *        join your consolidated billing family.
     */

    public void setAutoAssociate(Boolean autoAssociate) {
        this.autoAssociate = autoAssociate;
    }

    /**
     * <p>
     * Specifies if this billing group will automatically associate newly added Amazon Web Services accounts that join
     * your consolidated billing family.
     * </p>
     * 
     * @return Specifies if this billing group will automatically associate newly added Amazon Web Services accounts
     *         that join your consolidated billing family.
     */

    public Boolean getAutoAssociate() {
        return this.autoAssociate;
    }

    /**
     * <p>
     * Specifies if this billing group will automatically associate newly added Amazon Web Services accounts that join
     * your consolidated billing family.
     * </p>
     * 
     * @param autoAssociate
     *        Specifies if this billing group will automatically associate newly added Amazon Web Services accounts that
     *        join your consolidated billing family.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBillingGroupAccountGrouping withAutoAssociate(Boolean autoAssociate) {
        setAutoAssociate(autoAssociate);
        return this;
    }

    /**
     * <p>
     * Specifies if this billing group will automatically associate newly added Amazon Web Services accounts that join
     * your consolidated billing family.
     * </p>
     * 
     * @return Specifies if this billing group will automatically associate newly added Amazon Web Services accounts
     *         that join your consolidated billing family.
     */

    public Boolean isAutoAssociate() {
        return this.autoAssociate;
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
        if (getAutoAssociate() != null)
            sb.append("AutoAssociate: ").append(getAutoAssociate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateBillingGroupAccountGrouping == false)
            return false;
        UpdateBillingGroupAccountGrouping other = (UpdateBillingGroupAccountGrouping) obj;
        if (other.getAutoAssociate() == null ^ this.getAutoAssociate() == null)
            return false;
        if (other.getAutoAssociate() != null && other.getAutoAssociate().equals(this.getAutoAssociate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAutoAssociate() == null) ? 0 : getAutoAssociate().hashCode());
        return hashCode;
    }

    @Override
    public UpdateBillingGroupAccountGrouping clone() {
        try {
            return (UpdateBillingGroupAccountGrouping) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.billingconductor.model.transform.UpdateBillingGroupAccountGroupingMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
