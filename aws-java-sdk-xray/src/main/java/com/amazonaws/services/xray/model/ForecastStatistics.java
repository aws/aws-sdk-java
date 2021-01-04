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
package com.amazonaws.services.xray.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The predicted high and low fault count. This is used to determine if a service has become anomalous and if an insight
 * should be created.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/ForecastStatistics" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ForecastStatistics implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The upper limit of fault counts for a service.
     * </p>
     */
    private Long faultCountHigh;
    /**
     * <p>
     * The lower limit of fault counts for a service.
     * </p>
     */
    private Long faultCountLow;

    /**
     * <p>
     * The upper limit of fault counts for a service.
     * </p>
     * 
     * @param faultCountHigh
     *        The upper limit of fault counts for a service.
     */

    public void setFaultCountHigh(Long faultCountHigh) {
        this.faultCountHigh = faultCountHigh;
    }

    /**
     * <p>
     * The upper limit of fault counts for a service.
     * </p>
     * 
     * @return The upper limit of fault counts for a service.
     */

    public Long getFaultCountHigh() {
        return this.faultCountHigh;
    }

    /**
     * <p>
     * The upper limit of fault counts for a service.
     * </p>
     * 
     * @param faultCountHigh
     *        The upper limit of fault counts for a service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ForecastStatistics withFaultCountHigh(Long faultCountHigh) {
        setFaultCountHigh(faultCountHigh);
        return this;
    }

    /**
     * <p>
     * The lower limit of fault counts for a service.
     * </p>
     * 
     * @param faultCountLow
     *        The lower limit of fault counts for a service.
     */

    public void setFaultCountLow(Long faultCountLow) {
        this.faultCountLow = faultCountLow;
    }

    /**
     * <p>
     * The lower limit of fault counts for a service.
     * </p>
     * 
     * @return The lower limit of fault counts for a service.
     */

    public Long getFaultCountLow() {
        return this.faultCountLow;
    }

    /**
     * <p>
     * The lower limit of fault counts for a service.
     * </p>
     * 
     * @param faultCountLow
     *        The lower limit of fault counts for a service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ForecastStatistics withFaultCountLow(Long faultCountLow) {
        setFaultCountLow(faultCountLow);
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
        if (getFaultCountHigh() != null)
            sb.append("FaultCountHigh: ").append(getFaultCountHigh()).append(",");
        if (getFaultCountLow() != null)
            sb.append("FaultCountLow: ").append(getFaultCountLow());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ForecastStatistics == false)
            return false;
        ForecastStatistics other = (ForecastStatistics) obj;
        if (other.getFaultCountHigh() == null ^ this.getFaultCountHigh() == null)
            return false;
        if (other.getFaultCountHigh() != null && other.getFaultCountHigh().equals(this.getFaultCountHigh()) == false)
            return false;
        if (other.getFaultCountLow() == null ^ this.getFaultCountLow() == null)
            return false;
        if (other.getFaultCountLow() != null && other.getFaultCountLow().equals(this.getFaultCountLow()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFaultCountHigh() == null) ? 0 : getFaultCountHigh().hashCode());
        hashCode = prime * hashCode + ((getFaultCountLow() == null) ? 0 : getFaultCountLow().hashCode());
        return hashCode;
    }

    @Override
    public ForecastStatistics clone() {
        try {
            return (ForecastStatistics) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.xray.model.transform.ForecastStatisticsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
