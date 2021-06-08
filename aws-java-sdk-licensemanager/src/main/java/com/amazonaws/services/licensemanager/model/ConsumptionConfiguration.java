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
package com.amazonaws.services.licensemanager.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details about a consumption configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/ConsumptionConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConsumptionConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Renewal frequency.
     * </p>
     */
    private String renewType;
    /**
     * <p>
     * Details about a provisional configuration.
     * </p>
     */
    private ProvisionalConfiguration provisionalConfiguration;
    /**
     * <p>
     * Details about a borrow configuration.
     * </p>
     */
    private BorrowConfiguration borrowConfiguration;

    /**
     * <p>
     * Renewal frequency.
     * </p>
     * 
     * @param renewType
     *        Renewal frequency.
     * @see RenewType
     */

    public void setRenewType(String renewType) {
        this.renewType = renewType;
    }

    /**
     * <p>
     * Renewal frequency.
     * </p>
     * 
     * @return Renewal frequency.
     * @see RenewType
     */

    public String getRenewType() {
        return this.renewType;
    }

    /**
     * <p>
     * Renewal frequency.
     * </p>
     * 
     * @param renewType
     *        Renewal frequency.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RenewType
     */

    public ConsumptionConfiguration withRenewType(String renewType) {
        setRenewType(renewType);
        return this;
    }

    /**
     * <p>
     * Renewal frequency.
     * </p>
     * 
     * @param renewType
     *        Renewal frequency.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RenewType
     */

    public ConsumptionConfiguration withRenewType(RenewType renewType) {
        this.renewType = renewType.toString();
        return this;
    }

    /**
     * <p>
     * Details about a provisional configuration.
     * </p>
     * 
     * @param provisionalConfiguration
     *        Details about a provisional configuration.
     */

    public void setProvisionalConfiguration(ProvisionalConfiguration provisionalConfiguration) {
        this.provisionalConfiguration = provisionalConfiguration;
    }

    /**
     * <p>
     * Details about a provisional configuration.
     * </p>
     * 
     * @return Details about a provisional configuration.
     */

    public ProvisionalConfiguration getProvisionalConfiguration() {
        return this.provisionalConfiguration;
    }

    /**
     * <p>
     * Details about a provisional configuration.
     * </p>
     * 
     * @param provisionalConfiguration
     *        Details about a provisional configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConsumptionConfiguration withProvisionalConfiguration(ProvisionalConfiguration provisionalConfiguration) {
        setProvisionalConfiguration(provisionalConfiguration);
        return this;
    }

    /**
     * <p>
     * Details about a borrow configuration.
     * </p>
     * 
     * @param borrowConfiguration
     *        Details about a borrow configuration.
     */

    public void setBorrowConfiguration(BorrowConfiguration borrowConfiguration) {
        this.borrowConfiguration = borrowConfiguration;
    }

    /**
     * <p>
     * Details about a borrow configuration.
     * </p>
     * 
     * @return Details about a borrow configuration.
     */

    public BorrowConfiguration getBorrowConfiguration() {
        return this.borrowConfiguration;
    }

    /**
     * <p>
     * Details about a borrow configuration.
     * </p>
     * 
     * @param borrowConfiguration
     *        Details about a borrow configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConsumptionConfiguration withBorrowConfiguration(BorrowConfiguration borrowConfiguration) {
        setBorrowConfiguration(borrowConfiguration);
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
        if (getRenewType() != null)
            sb.append("RenewType: ").append(getRenewType()).append(",");
        if (getProvisionalConfiguration() != null)
            sb.append("ProvisionalConfiguration: ").append(getProvisionalConfiguration()).append(",");
        if (getBorrowConfiguration() != null)
            sb.append("BorrowConfiguration: ").append(getBorrowConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConsumptionConfiguration == false)
            return false;
        ConsumptionConfiguration other = (ConsumptionConfiguration) obj;
        if (other.getRenewType() == null ^ this.getRenewType() == null)
            return false;
        if (other.getRenewType() != null && other.getRenewType().equals(this.getRenewType()) == false)
            return false;
        if (other.getProvisionalConfiguration() == null ^ this.getProvisionalConfiguration() == null)
            return false;
        if (other.getProvisionalConfiguration() != null && other.getProvisionalConfiguration().equals(this.getProvisionalConfiguration()) == false)
            return false;
        if (other.getBorrowConfiguration() == null ^ this.getBorrowConfiguration() == null)
            return false;
        if (other.getBorrowConfiguration() != null && other.getBorrowConfiguration().equals(this.getBorrowConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRenewType() == null) ? 0 : getRenewType().hashCode());
        hashCode = prime * hashCode + ((getProvisionalConfiguration() == null) ? 0 : getProvisionalConfiguration().hashCode());
        hashCode = prime * hashCode + ((getBorrowConfiguration() == null) ? 0 : getBorrowConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public ConsumptionConfiguration clone() {
        try {
            return (ConsumptionConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.licensemanager.model.transform.ConsumptionConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
