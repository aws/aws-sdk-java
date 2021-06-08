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
 * X-Ray reevaluates insights periodically until they are resolved, and records each intermediate state in an event. You
 * can review incident events in the Impact Timeline on the Inspect page in the X-Ray console.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/InsightEvent" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InsightEvent implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A brief description of the event.
     * </p>
     */
    private String summary;
    /**
     * <p>
     * The time, in Unix seconds, at which the event was recorded.
     * </p>
     */
    private java.util.Date eventTime;
    /**
     * <p>
     * The impact statistics of the client side service. This includes the number of requests to the client service and
     * whether the requests were faults or okay.
     * </p>
     */
    private RequestImpactStatistics clientRequestImpactStatistics;
    /**
     * <p>
     * The impact statistics of the root cause service. This includes the number of requests to the client service and
     * whether the requests were faults or okay.
     * </p>
     */
    private RequestImpactStatistics rootCauseServiceRequestImpactStatistics;
    /**
     * <p>
     * The service during the event that is most impacted by the incident.
     * </p>
     */
    private java.util.List<AnomalousService> topAnomalousServices;

    /**
     * <p>
     * A brief description of the event.
     * </p>
     * 
     * @param summary
     *        A brief description of the event.
     */

    public void setSummary(String summary) {
        this.summary = summary;
    }

    /**
     * <p>
     * A brief description of the event.
     * </p>
     * 
     * @return A brief description of the event.
     */

    public String getSummary() {
        return this.summary;
    }

    /**
     * <p>
     * A brief description of the event.
     * </p>
     * 
     * @param summary
     *        A brief description of the event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InsightEvent withSummary(String summary) {
        setSummary(summary);
        return this;
    }

    /**
     * <p>
     * The time, in Unix seconds, at which the event was recorded.
     * </p>
     * 
     * @param eventTime
     *        The time, in Unix seconds, at which the event was recorded.
     */

    public void setEventTime(java.util.Date eventTime) {
        this.eventTime = eventTime;
    }

    /**
     * <p>
     * The time, in Unix seconds, at which the event was recorded.
     * </p>
     * 
     * @return The time, in Unix seconds, at which the event was recorded.
     */

    public java.util.Date getEventTime() {
        return this.eventTime;
    }

    /**
     * <p>
     * The time, in Unix seconds, at which the event was recorded.
     * </p>
     * 
     * @param eventTime
     *        The time, in Unix seconds, at which the event was recorded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InsightEvent withEventTime(java.util.Date eventTime) {
        setEventTime(eventTime);
        return this;
    }

    /**
     * <p>
     * The impact statistics of the client side service. This includes the number of requests to the client service and
     * whether the requests were faults or okay.
     * </p>
     * 
     * @param clientRequestImpactStatistics
     *        The impact statistics of the client side service. This includes the number of requests to the client
     *        service and whether the requests were faults or okay.
     */

    public void setClientRequestImpactStatistics(RequestImpactStatistics clientRequestImpactStatistics) {
        this.clientRequestImpactStatistics = clientRequestImpactStatistics;
    }

    /**
     * <p>
     * The impact statistics of the client side service. This includes the number of requests to the client service and
     * whether the requests were faults or okay.
     * </p>
     * 
     * @return The impact statistics of the client side service. This includes the number of requests to the client
     *         service and whether the requests were faults or okay.
     */

    public RequestImpactStatistics getClientRequestImpactStatistics() {
        return this.clientRequestImpactStatistics;
    }

    /**
     * <p>
     * The impact statistics of the client side service. This includes the number of requests to the client service and
     * whether the requests were faults or okay.
     * </p>
     * 
     * @param clientRequestImpactStatistics
     *        The impact statistics of the client side service. This includes the number of requests to the client
     *        service and whether the requests were faults or okay.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InsightEvent withClientRequestImpactStatistics(RequestImpactStatistics clientRequestImpactStatistics) {
        setClientRequestImpactStatistics(clientRequestImpactStatistics);
        return this;
    }

    /**
     * <p>
     * The impact statistics of the root cause service. This includes the number of requests to the client service and
     * whether the requests were faults or okay.
     * </p>
     * 
     * @param rootCauseServiceRequestImpactStatistics
     *        The impact statistics of the root cause service. This includes the number of requests to the client
     *        service and whether the requests were faults or okay.
     */

    public void setRootCauseServiceRequestImpactStatistics(RequestImpactStatistics rootCauseServiceRequestImpactStatistics) {
        this.rootCauseServiceRequestImpactStatistics = rootCauseServiceRequestImpactStatistics;
    }

    /**
     * <p>
     * The impact statistics of the root cause service. This includes the number of requests to the client service and
     * whether the requests were faults or okay.
     * </p>
     * 
     * @return The impact statistics of the root cause service. This includes the number of requests to the client
     *         service and whether the requests were faults or okay.
     */

    public RequestImpactStatistics getRootCauseServiceRequestImpactStatistics() {
        return this.rootCauseServiceRequestImpactStatistics;
    }

    /**
     * <p>
     * The impact statistics of the root cause service. This includes the number of requests to the client service and
     * whether the requests were faults or okay.
     * </p>
     * 
     * @param rootCauseServiceRequestImpactStatistics
     *        The impact statistics of the root cause service. This includes the number of requests to the client
     *        service and whether the requests were faults or okay.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InsightEvent withRootCauseServiceRequestImpactStatistics(RequestImpactStatistics rootCauseServiceRequestImpactStatistics) {
        setRootCauseServiceRequestImpactStatistics(rootCauseServiceRequestImpactStatistics);
        return this;
    }

    /**
     * <p>
     * The service during the event that is most impacted by the incident.
     * </p>
     * 
     * @return The service during the event that is most impacted by the incident.
     */

    public java.util.List<AnomalousService> getTopAnomalousServices() {
        return topAnomalousServices;
    }

    /**
     * <p>
     * The service during the event that is most impacted by the incident.
     * </p>
     * 
     * @param topAnomalousServices
     *        The service during the event that is most impacted by the incident.
     */

    public void setTopAnomalousServices(java.util.Collection<AnomalousService> topAnomalousServices) {
        if (topAnomalousServices == null) {
            this.topAnomalousServices = null;
            return;
        }

        this.topAnomalousServices = new java.util.ArrayList<AnomalousService>(topAnomalousServices);
    }

    /**
     * <p>
     * The service during the event that is most impacted by the incident.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTopAnomalousServices(java.util.Collection)} or {@link #withTopAnomalousServices(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param topAnomalousServices
     *        The service during the event that is most impacted by the incident.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InsightEvent withTopAnomalousServices(AnomalousService... topAnomalousServices) {
        if (this.topAnomalousServices == null) {
            setTopAnomalousServices(new java.util.ArrayList<AnomalousService>(topAnomalousServices.length));
        }
        for (AnomalousService ele : topAnomalousServices) {
            this.topAnomalousServices.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The service during the event that is most impacted by the incident.
     * </p>
     * 
     * @param topAnomalousServices
     *        The service during the event that is most impacted by the incident.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InsightEvent withTopAnomalousServices(java.util.Collection<AnomalousService> topAnomalousServices) {
        setTopAnomalousServices(topAnomalousServices);
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
        if (getSummary() != null)
            sb.append("Summary: ").append(getSummary()).append(",");
        if (getEventTime() != null)
            sb.append("EventTime: ").append(getEventTime()).append(",");
        if (getClientRequestImpactStatistics() != null)
            sb.append("ClientRequestImpactStatistics: ").append(getClientRequestImpactStatistics()).append(",");
        if (getRootCauseServiceRequestImpactStatistics() != null)
            sb.append("RootCauseServiceRequestImpactStatistics: ").append(getRootCauseServiceRequestImpactStatistics()).append(",");
        if (getTopAnomalousServices() != null)
            sb.append("TopAnomalousServices: ").append(getTopAnomalousServices());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InsightEvent == false)
            return false;
        InsightEvent other = (InsightEvent) obj;
        if (other.getSummary() == null ^ this.getSummary() == null)
            return false;
        if (other.getSummary() != null && other.getSummary().equals(this.getSummary()) == false)
            return false;
        if (other.getEventTime() == null ^ this.getEventTime() == null)
            return false;
        if (other.getEventTime() != null && other.getEventTime().equals(this.getEventTime()) == false)
            return false;
        if (other.getClientRequestImpactStatistics() == null ^ this.getClientRequestImpactStatistics() == null)
            return false;
        if (other.getClientRequestImpactStatistics() != null
                && other.getClientRequestImpactStatistics().equals(this.getClientRequestImpactStatistics()) == false)
            return false;
        if (other.getRootCauseServiceRequestImpactStatistics() == null ^ this.getRootCauseServiceRequestImpactStatistics() == null)
            return false;
        if (other.getRootCauseServiceRequestImpactStatistics() != null
                && other.getRootCauseServiceRequestImpactStatistics().equals(this.getRootCauseServiceRequestImpactStatistics()) == false)
            return false;
        if (other.getTopAnomalousServices() == null ^ this.getTopAnomalousServices() == null)
            return false;
        if (other.getTopAnomalousServices() != null && other.getTopAnomalousServices().equals(this.getTopAnomalousServices()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSummary() == null) ? 0 : getSummary().hashCode());
        hashCode = prime * hashCode + ((getEventTime() == null) ? 0 : getEventTime().hashCode());
        hashCode = prime * hashCode + ((getClientRequestImpactStatistics() == null) ? 0 : getClientRequestImpactStatistics().hashCode());
        hashCode = prime * hashCode + ((getRootCauseServiceRequestImpactStatistics() == null) ? 0 : getRootCauseServiceRequestImpactStatistics().hashCode());
        hashCode = prime * hashCode + ((getTopAnomalousServices() == null) ? 0 : getTopAnomalousServices().hashCode());
        return hashCode;
    }

    @Override
    public InsightEvent clone() {
        try {
            return (InsightEvent) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.xray.model.transform.InsightEventMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
