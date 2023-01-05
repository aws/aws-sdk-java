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
package com.amazonaws.services.frauddetector.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The training metrics details.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/TrainingMetricsV2" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TrainingMetricsV2 implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Online Fraud Insights (OFI) model training metric details.
     * </p>
     */
    private OFITrainingMetricsValue ofi;
    /**
     * <p>
     * The Transaction Fraud Insights (TFI) model training metric details.
     * </p>
     */
    private TFITrainingMetricsValue tfi;
    /**
     * <p>
     * The Account Takeover Insights (ATI) model training metric details.
     * </p>
     */
    private ATITrainingMetricsValue ati;

    /**
     * <p>
     * The Online Fraud Insights (OFI) model training metric details.
     * </p>
     * 
     * @param ofi
     *        The Online Fraud Insights (OFI) model training metric details.
     */

    public void setOfi(OFITrainingMetricsValue ofi) {
        this.ofi = ofi;
    }

    /**
     * <p>
     * The Online Fraud Insights (OFI) model training metric details.
     * </p>
     * 
     * @return The Online Fraud Insights (OFI) model training metric details.
     */

    public OFITrainingMetricsValue getOfi() {
        return this.ofi;
    }

    /**
     * <p>
     * The Online Fraud Insights (OFI) model training metric details.
     * </p>
     * 
     * @param ofi
     *        The Online Fraud Insights (OFI) model training metric details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrainingMetricsV2 withOfi(OFITrainingMetricsValue ofi) {
        setOfi(ofi);
        return this;
    }

    /**
     * <p>
     * The Transaction Fraud Insights (TFI) model training metric details.
     * </p>
     * 
     * @param tfi
     *        The Transaction Fraud Insights (TFI) model training metric details.
     */

    public void setTfi(TFITrainingMetricsValue tfi) {
        this.tfi = tfi;
    }

    /**
     * <p>
     * The Transaction Fraud Insights (TFI) model training metric details.
     * </p>
     * 
     * @return The Transaction Fraud Insights (TFI) model training metric details.
     */

    public TFITrainingMetricsValue getTfi() {
        return this.tfi;
    }

    /**
     * <p>
     * The Transaction Fraud Insights (TFI) model training metric details.
     * </p>
     * 
     * @param tfi
     *        The Transaction Fraud Insights (TFI) model training metric details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrainingMetricsV2 withTfi(TFITrainingMetricsValue tfi) {
        setTfi(tfi);
        return this;
    }

    /**
     * <p>
     * The Account Takeover Insights (ATI) model training metric details.
     * </p>
     * 
     * @param ati
     *        The Account Takeover Insights (ATI) model training metric details.
     */

    public void setAti(ATITrainingMetricsValue ati) {
        this.ati = ati;
    }

    /**
     * <p>
     * The Account Takeover Insights (ATI) model training metric details.
     * </p>
     * 
     * @return The Account Takeover Insights (ATI) model training metric details.
     */

    public ATITrainingMetricsValue getAti() {
        return this.ati;
    }

    /**
     * <p>
     * The Account Takeover Insights (ATI) model training metric details.
     * </p>
     * 
     * @param ati
     *        The Account Takeover Insights (ATI) model training metric details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrainingMetricsV2 withAti(ATITrainingMetricsValue ati) {
        setAti(ati);
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
        if (getOfi() != null)
            sb.append("Ofi: ").append(getOfi()).append(",");
        if (getTfi() != null)
            sb.append("Tfi: ").append(getTfi()).append(",");
        if (getAti() != null)
            sb.append("Ati: ").append(getAti());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TrainingMetricsV2 == false)
            return false;
        TrainingMetricsV2 other = (TrainingMetricsV2) obj;
        if (other.getOfi() == null ^ this.getOfi() == null)
            return false;
        if (other.getOfi() != null && other.getOfi().equals(this.getOfi()) == false)
            return false;
        if (other.getTfi() == null ^ this.getTfi() == null)
            return false;
        if (other.getTfi() != null && other.getTfi().equals(this.getTfi()) == false)
            return false;
        if (other.getAti() == null ^ this.getAti() == null)
            return false;
        if (other.getAti() != null && other.getAti().equals(this.getAti()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOfi() == null) ? 0 : getOfi().hashCode());
        hashCode = prime * hashCode + ((getTfi() == null) ? 0 : getTfi().hashCode());
        hashCode = prime * hashCode + ((getAti() == null) ? 0 : getAti().hashCode());
        return hashCode;
    }

    @Override
    public TrainingMetricsV2 clone() {
        try {
            return (TrainingMetricsV2) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.frauddetector.model.transform.TrainingMetricsV2Marshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
