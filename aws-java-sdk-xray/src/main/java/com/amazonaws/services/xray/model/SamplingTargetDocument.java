/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Temporary changes to a sampling rule configuration. To meet the global sampling target for a rule, X-Ray calculates a
 * new reservoir for each service based on the recent sampling results of all services that called
 * <a>GetSamplingTargets</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/SamplingTargetDocument" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SamplingTargetDocument implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the sampling rule.
     * </p>
     */
    private String ruleName;
    /**
     * <p>
     * The percentage of matching requests to instrument, after the reservoir is exhausted.
     * </p>
     */
    private Double fixedRate;
    /**
     * <p>
     * The number of requests per second that X-Ray allocated this service.
     * </p>
     */
    private Integer reservoirQuota;
    /**
     * <p>
     * When the reservoir quota expires.
     * </p>
     */
    private java.util.Date reservoirQuotaTTL;
    /**
     * <p>
     * The number of seconds for the service to wait before getting sampling targets again.
     * </p>
     */
    private Integer interval;

    /**
     * <p>
     * The name of the sampling rule.
     * </p>
     * 
     * @param ruleName
     *        The name of the sampling rule.
     */

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    /**
     * <p>
     * The name of the sampling rule.
     * </p>
     * 
     * @return The name of the sampling rule.
     */

    public String getRuleName() {
        return this.ruleName;
    }

    /**
     * <p>
     * The name of the sampling rule.
     * </p>
     * 
     * @param ruleName
     *        The name of the sampling rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SamplingTargetDocument withRuleName(String ruleName) {
        setRuleName(ruleName);
        return this;
    }

    /**
     * <p>
     * The percentage of matching requests to instrument, after the reservoir is exhausted.
     * </p>
     * 
     * @param fixedRate
     *        The percentage of matching requests to instrument, after the reservoir is exhausted.
     */

    public void setFixedRate(Double fixedRate) {
        this.fixedRate = fixedRate;
    }

    /**
     * <p>
     * The percentage of matching requests to instrument, after the reservoir is exhausted.
     * </p>
     * 
     * @return The percentage of matching requests to instrument, after the reservoir is exhausted.
     */

    public Double getFixedRate() {
        return this.fixedRate;
    }

    /**
     * <p>
     * The percentage of matching requests to instrument, after the reservoir is exhausted.
     * </p>
     * 
     * @param fixedRate
     *        The percentage of matching requests to instrument, after the reservoir is exhausted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SamplingTargetDocument withFixedRate(Double fixedRate) {
        setFixedRate(fixedRate);
        return this;
    }

    /**
     * <p>
     * The number of requests per second that X-Ray allocated this service.
     * </p>
     * 
     * @param reservoirQuota
     *        The number of requests per second that X-Ray allocated this service.
     */

    public void setReservoirQuota(Integer reservoirQuota) {
        this.reservoirQuota = reservoirQuota;
    }

    /**
     * <p>
     * The number of requests per second that X-Ray allocated this service.
     * </p>
     * 
     * @return The number of requests per second that X-Ray allocated this service.
     */

    public Integer getReservoirQuota() {
        return this.reservoirQuota;
    }

    /**
     * <p>
     * The number of requests per second that X-Ray allocated this service.
     * </p>
     * 
     * @param reservoirQuota
     *        The number of requests per second that X-Ray allocated this service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SamplingTargetDocument withReservoirQuota(Integer reservoirQuota) {
        setReservoirQuota(reservoirQuota);
        return this;
    }

    /**
     * <p>
     * When the reservoir quota expires.
     * </p>
     * 
     * @param reservoirQuotaTTL
     *        When the reservoir quota expires.
     */

    public void setReservoirQuotaTTL(java.util.Date reservoirQuotaTTL) {
        this.reservoirQuotaTTL = reservoirQuotaTTL;
    }

    /**
     * <p>
     * When the reservoir quota expires.
     * </p>
     * 
     * @return When the reservoir quota expires.
     */

    public java.util.Date getReservoirQuotaTTL() {
        return this.reservoirQuotaTTL;
    }

    /**
     * <p>
     * When the reservoir quota expires.
     * </p>
     * 
     * @param reservoirQuotaTTL
     *        When the reservoir quota expires.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SamplingTargetDocument withReservoirQuotaTTL(java.util.Date reservoirQuotaTTL) {
        setReservoirQuotaTTL(reservoirQuotaTTL);
        return this;
    }

    /**
     * <p>
     * The number of seconds for the service to wait before getting sampling targets again.
     * </p>
     * 
     * @param interval
     *        The number of seconds for the service to wait before getting sampling targets again.
     */

    public void setInterval(Integer interval) {
        this.interval = interval;
    }

    /**
     * <p>
     * The number of seconds for the service to wait before getting sampling targets again.
     * </p>
     * 
     * @return The number of seconds for the service to wait before getting sampling targets again.
     */

    public Integer getInterval() {
        return this.interval;
    }

    /**
     * <p>
     * The number of seconds for the service to wait before getting sampling targets again.
     * </p>
     * 
     * @param interval
     *        The number of seconds for the service to wait before getting sampling targets again.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SamplingTargetDocument withInterval(Integer interval) {
        setInterval(interval);
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
        if (getRuleName() != null)
            sb.append("RuleName: ").append(getRuleName()).append(",");
        if (getFixedRate() != null)
            sb.append("FixedRate: ").append(getFixedRate()).append(",");
        if (getReservoirQuota() != null)
            sb.append("ReservoirQuota: ").append(getReservoirQuota()).append(",");
        if (getReservoirQuotaTTL() != null)
            sb.append("ReservoirQuotaTTL: ").append(getReservoirQuotaTTL()).append(",");
        if (getInterval() != null)
            sb.append("Interval: ").append(getInterval());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SamplingTargetDocument == false)
            return false;
        SamplingTargetDocument other = (SamplingTargetDocument) obj;
        if (other.getRuleName() == null ^ this.getRuleName() == null)
            return false;
        if (other.getRuleName() != null && other.getRuleName().equals(this.getRuleName()) == false)
            return false;
        if (other.getFixedRate() == null ^ this.getFixedRate() == null)
            return false;
        if (other.getFixedRate() != null && other.getFixedRate().equals(this.getFixedRate()) == false)
            return false;
        if (other.getReservoirQuota() == null ^ this.getReservoirQuota() == null)
            return false;
        if (other.getReservoirQuota() != null && other.getReservoirQuota().equals(this.getReservoirQuota()) == false)
            return false;
        if (other.getReservoirQuotaTTL() == null ^ this.getReservoirQuotaTTL() == null)
            return false;
        if (other.getReservoirQuotaTTL() != null && other.getReservoirQuotaTTL().equals(this.getReservoirQuotaTTL()) == false)
            return false;
        if (other.getInterval() == null ^ this.getInterval() == null)
            return false;
        if (other.getInterval() != null && other.getInterval().equals(this.getInterval()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRuleName() == null) ? 0 : getRuleName().hashCode());
        hashCode = prime * hashCode + ((getFixedRate() == null) ? 0 : getFixedRate().hashCode());
        hashCode = prime * hashCode + ((getReservoirQuota() == null) ? 0 : getReservoirQuota().hashCode());
        hashCode = prime * hashCode + ((getReservoirQuotaTTL() == null) ? 0 : getReservoirQuotaTTL().hashCode());
        hashCode = prime * hashCode + ((getInterval() == null) ? 0 : getInterval().hashCode());
        return hashCode;
    }

    @Override
    public SamplingTargetDocument clone() {
        try {
            return (SamplingTargetDocument) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.xray.model.transform.SamplingTargetDocumentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
