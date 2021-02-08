/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.macie2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies a current quota for an Amazon Macie account.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/ServiceLimit" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServiceLimit implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies whether the account has met the quota that corresponds to the metric specified by the
     * UsageByAccount.type field in the response.
     * </p>
     */
    private Boolean isServiceLimited;
    /**
     * <p>
     * The unit of measurement for the value specified by the value field.
     * </p>
     */
    private String unit;
    /**
     * <p>
     * The value for the metric specified by the UsageByAccount.type field in the response.
     * </p>
     */
    private Long value;

    /**
     * <p>
     * Specifies whether the account has met the quota that corresponds to the metric specified by the
     * UsageByAccount.type field in the response.
     * </p>
     * 
     * @param isServiceLimited
     *        Specifies whether the account has met the quota that corresponds to the metric specified by the
     *        UsageByAccount.type field in the response.
     */

    public void setIsServiceLimited(Boolean isServiceLimited) {
        this.isServiceLimited = isServiceLimited;
    }

    /**
     * <p>
     * Specifies whether the account has met the quota that corresponds to the metric specified by the
     * UsageByAccount.type field in the response.
     * </p>
     * 
     * @return Specifies whether the account has met the quota that corresponds to the metric specified by the
     *         UsageByAccount.type field in the response.
     */

    public Boolean getIsServiceLimited() {
        return this.isServiceLimited;
    }

    /**
     * <p>
     * Specifies whether the account has met the quota that corresponds to the metric specified by the
     * UsageByAccount.type field in the response.
     * </p>
     * 
     * @param isServiceLimited
     *        Specifies whether the account has met the quota that corresponds to the metric specified by the
     *        UsageByAccount.type field in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceLimit withIsServiceLimited(Boolean isServiceLimited) {
        setIsServiceLimited(isServiceLimited);
        return this;
    }

    /**
     * <p>
     * Specifies whether the account has met the quota that corresponds to the metric specified by the
     * UsageByAccount.type field in the response.
     * </p>
     * 
     * @return Specifies whether the account has met the quota that corresponds to the metric specified by the
     *         UsageByAccount.type field in the response.
     */

    public Boolean isServiceLimited() {
        return this.isServiceLimited;
    }

    /**
     * <p>
     * The unit of measurement for the value specified by the value field.
     * </p>
     * 
     * @param unit
     *        The unit of measurement for the value specified by the value field.
     * @see Unit
     */

    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * <p>
     * The unit of measurement for the value specified by the value field.
     * </p>
     * 
     * @return The unit of measurement for the value specified by the value field.
     * @see Unit
     */

    public String getUnit() {
        return this.unit;
    }

    /**
     * <p>
     * The unit of measurement for the value specified by the value field.
     * </p>
     * 
     * @param unit
     *        The unit of measurement for the value specified by the value field.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Unit
     */

    public ServiceLimit withUnit(String unit) {
        setUnit(unit);
        return this;
    }

    /**
     * <p>
     * The unit of measurement for the value specified by the value field.
     * </p>
     * 
     * @param unit
     *        The unit of measurement for the value specified by the value field.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Unit
     */

    public ServiceLimit withUnit(Unit unit) {
        this.unit = unit.toString();
        return this;
    }

    /**
     * <p>
     * The value for the metric specified by the UsageByAccount.type field in the response.
     * </p>
     * 
     * @param value
     *        The value for the metric specified by the UsageByAccount.type field in the response.
     */

    public void setValue(Long value) {
        this.value = value;
    }

    /**
     * <p>
     * The value for the metric specified by the UsageByAccount.type field in the response.
     * </p>
     * 
     * @return The value for the metric specified by the UsageByAccount.type field in the response.
     */

    public Long getValue() {
        return this.value;
    }

    /**
     * <p>
     * The value for the metric specified by the UsageByAccount.type field in the response.
     * </p>
     * 
     * @param value
     *        The value for the metric specified by the UsageByAccount.type field in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceLimit withValue(Long value) {
        setValue(value);
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
        if (getIsServiceLimited() != null)
            sb.append("IsServiceLimited: ").append(getIsServiceLimited()).append(",");
        if (getUnit() != null)
            sb.append("Unit: ").append(getUnit()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ServiceLimit == false)
            return false;
        ServiceLimit other = (ServiceLimit) obj;
        if (other.getIsServiceLimited() == null ^ this.getIsServiceLimited() == null)
            return false;
        if (other.getIsServiceLimited() != null && other.getIsServiceLimited().equals(this.getIsServiceLimited()) == false)
            return false;
        if (other.getUnit() == null ^ this.getUnit() == null)
            return false;
        if (other.getUnit() != null && other.getUnit().equals(this.getUnit()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIsServiceLimited() == null) ? 0 : getIsServiceLimited().hashCode());
        hashCode = prime * hashCode + ((getUnit() == null) ? 0 : getUnit().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public ServiceLimit clone() {
        try {
            return (ServiceLimit) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.macie2.model.transform.ServiceLimitMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
