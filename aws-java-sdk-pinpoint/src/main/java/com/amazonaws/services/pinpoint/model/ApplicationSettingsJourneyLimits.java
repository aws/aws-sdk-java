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
package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The default sending limits for journeys in the application. To override these limits and define custom limits for a
 * specific journey, use the Journey resource.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/ApplicationSettingsJourneyLimits"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ApplicationSettingsJourneyLimits implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The daily number of messages that an endpoint can receive from all journeys. The maximum value is 100. If set to
     * 0, this limit will not apply.
     * </p>
     */
    private Integer dailyCap;
    /**
     * <p>
     * The default maximum number of messages that can be sent to an endpoint during the specified timeframe for all
     * journeys.
     * </p>
     */
    private JourneyTimeframeCap timeframeCap;
    /**
     * <p>
     * The default maximum number of messages that a single journey can sent to a single endpoint. The maximum value is
     * 100. If set to 0, this limit will not apply.
     * </p>
     */
    private Integer totalCap;

    /**
     * <p>
     * The daily number of messages that an endpoint can receive from all journeys. The maximum value is 100. If set to
     * 0, this limit will not apply.
     * </p>
     * 
     * @param dailyCap
     *        The daily number of messages that an endpoint can receive from all journeys. The maximum value is 100. If
     *        set to 0, this limit will not apply.
     */

    public void setDailyCap(Integer dailyCap) {
        this.dailyCap = dailyCap;
    }

    /**
     * <p>
     * The daily number of messages that an endpoint can receive from all journeys. The maximum value is 100. If set to
     * 0, this limit will not apply.
     * </p>
     * 
     * @return The daily number of messages that an endpoint can receive from all journeys. The maximum value is 100. If
     *         set to 0, this limit will not apply.
     */

    public Integer getDailyCap() {
        return this.dailyCap;
    }

    /**
     * <p>
     * The daily number of messages that an endpoint can receive from all journeys. The maximum value is 100. If set to
     * 0, this limit will not apply.
     * </p>
     * 
     * @param dailyCap
     *        The daily number of messages that an endpoint can receive from all journeys. The maximum value is 100. If
     *        set to 0, this limit will not apply.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationSettingsJourneyLimits withDailyCap(Integer dailyCap) {
        setDailyCap(dailyCap);
        return this;
    }

    /**
     * <p>
     * The default maximum number of messages that can be sent to an endpoint during the specified timeframe for all
     * journeys.
     * </p>
     * 
     * @param timeframeCap
     *        The default maximum number of messages that can be sent to an endpoint during the specified timeframe for
     *        all journeys.
     */

    public void setTimeframeCap(JourneyTimeframeCap timeframeCap) {
        this.timeframeCap = timeframeCap;
    }

    /**
     * <p>
     * The default maximum number of messages that can be sent to an endpoint during the specified timeframe for all
     * journeys.
     * </p>
     * 
     * @return The default maximum number of messages that can be sent to an endpoint during the specified timeframe for
     *         all journeys.
     */

    public JourneyTimeframeCap getTimeframeCap() {
        return this.timeframeCap;
    }

    /**
     * <p>
     * The default maximum number of messages that can be sent to an endpoint during the specified timeframe for all
     * journeys.
     * </p>
     * 
     * @param timeframeCap
     *        The default maximum number of messages that can be sent to an endpoint during the specified timeframe for
     *        all journeys.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationSettingsJourneyLimits withTimeframeCap(JourneyTimeframeCap timeframeCap) {
        setTimeframeCap(timeframeCap);
        return this;
    }

    /**
     * <p>
     * The default maximum number of messages that a single journey can sent to a single endpoint. The maximum value is
     * 100. If set to 0, this limit will not apply.
     * </p>
     * 
     * @param totalCap
     *        The default maximum number of messages that a single journey can sent to a single endpoint. The maximum
     *        value is 100. If set to 0, this limit will not apply.
     */

    public void setTotalCap(Integer totalCap) {
        this.totalCap = totalCap;
    }

    /**
     * <p>
     * The default maximum number of messages that a single journey can sent to a single endpoint. The maximum value is
     * 100. If set to 0, this limit will not apply.
     * </p>
     * 
     * @return The default maximum number of messages that a single journey can sent to a single endpoint. The maximum
     *         value is 100. If set to 0, this limit will not apply.
     */

    public Integer getTotalCap() {
        return this.totalCap;
    }

    /**
     * <p>
     * The default maximum number of messages that a single journey can sent to a single endpoint. The maximum value is
     * 100. If set to 0, this limit will not apply.
     * </p>
     * 
     * @param totalCap
     *        The default maximum number of messages that a single journey can sent to a single endpoint. The maximum
     *        value is 100. If set to 0, this limit will not apply.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationSettingsJourneyLimits withTotalCap(Integer totalCap) {
        setTotalCap(totalCap);
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
        if (getDailyCap() != null)
            sb.append("DailyCap: ").append(getDailyCap()).append(",");
        if (getTimeframeCap() != null)
            sb.append("TimeframeCap: ").append(getTimeframeCap()).append(",");
        if (getTotalCap() != null)
            sb.append("TotalCap: ").append(getTotalCap());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ApplicationSettingsJourneyLimits == false)
            return false;
        ApplicationSettingsJourneyLimits other = (ApplicationSettingsJourneyLimits) obj;
        if (other.getDailyCap() == null ^ this.getDailyCap() == null)
            return false;
        if (other.getDailyCap() != null && other.getDailyCap().equals(this.getDailyCap()) == false)
            return false;
        if (other.getTimeframeCap() == null ^ this.getTimeframeCap() == null)
            return false;
        if (other.getTimeframeCap() != null && other.getTimeframeCap().equals(this.getTimeframeCap()) == false)
            return false;
        if (other.getTotalCap() == null ^ this.getTotalCap() == null)
            return false;
        if (other.getTotalCap() != null && other.getTotalCap().equals(this.getTotalCap()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDailyCap() == null) ? 0 : getDailyCap().hashCode());
        hashCode = prime * hashCode + ((getTimeframeCap() == null) ? 0 : getTimeframeCap().hashCode());
        hashCode = prime * hashCode + ((getTotalCap() == null) ? 0 : getTotalCap().hashCode());
        return hashCode;
    }

    @Override
    public ApplicationSettingsJourneyLimits clone() {
        try {
            return (ApplicationSettingsJourneyLimits) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.ApplicationSettingsJourneyLimitsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
