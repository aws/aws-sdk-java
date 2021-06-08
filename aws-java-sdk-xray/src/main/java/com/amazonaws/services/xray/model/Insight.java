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
 * When fault rates go outside of the expected range, X-Ray creates an insight. Insights tracks emergent issues within
 * your applications.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/Insight" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Insight implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The insights unique identifier.
     * </p>
     */
    private String insightId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the group that the insight belongs to.
     * </p>
     */
    private String groupARN;
    /**
     * <p>
     * The name of the group that the insight belongs to.
     * </p>
     */
    private String groupName;

    private ServiceId rootCauseServiceId;
    /**
     * <p>
     * The categories that label and describe the type of insight.
     * </p>
     */
    private java.util.List<String> categories;
    /**
     * <p>
     * The current state of the insight.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The time, in Unix seconds, at which the insight began.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The time, in Unix seconds, at which the insight ended.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * A brief description of the insight.
     * </p>
     */
    private String summary;
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
     * The service within the insight that is most impacted by the incident.
     * </p>
     */
    private java.util.List<AnomalousService> topAnomalousServices;

    /**
     * <p>
     * The insights unique identifier.
     * </p>
     * 
     * @param insightId
     *        The insights unique identifier.
     */

    public void setInsightId(String insightId) {
        this.insightId = insightId;
    }

    /**
     * <p>
     * The insights unique identifier.
     * </p>
     * 
     * @return The insights unique identifier.
     */

    public String getInsightId() {
        return this.insightId;
    }

    /**
     * <p>
     * The insights unique identifier.
     * </p>
     * 
     * @param insightId
     *        The insights unique identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Insight withInsightId(String insightId) {
        setInsightId(insightId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the group that the insight belongs to.
     * </p>
     * 
     * @param groupARN
     *        The Amazon Resource Name (ARN) of the group that the insight belongs to.
     */

    public void setGroupARN(String groupARN) {
        this.groupARN = groupARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the group that the insight belongs to.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the group that the insight belongs to.
     */

    public String getGroupARN() {
        return this.groupARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the group that the insight belongs to.
     * </p>
     * 
     * @param groupARN
     *        The Amazon Resource Name (ARN) of the group that the insight belongs to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Insight withGroupARN(String groupARN) {
        setGroupARN(groupARN);
        return this;
    }

    /**
     * <p>
     * The name of the group that the insight belongs to.
     * </p>
     * 
     * @param groupName
     *        The name of the group that the insight belongs to.
     */

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * <p>
     * The name of the group that the insight belongs to.
     * </p>
     * 
     * @return The name of the group that the insight belongs to.
     */

    public String getGroupName() {
        return this.groupName;
    }

    /**
     * <p>
     * The name of the group that the insight belongs to.
     * </p>
     * 
     * @param groupName
     *        The name of the group that the insight belongs to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Insight withGroupName(String groupName) {
        setGroupName(groupName);
        return this;
    }

    /**
     * @param rootCauseServiceId
     */

    public void setRootCauseServiceId(ServiceId rootCauseServiceId) {
        this.rootCauseServiceId = rootCauseServiceId;
    }

    /**
     * @return
     */

    public ServiceId getRootCauseServiceId() {
        return this.rootCauseServiceId;
    }

    /**
     * @param rootCauseServiceId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Insight withRootCauseServiceId(ServiceId rootCauseServiceId) {
        setRootCauseServiceId(rootCauseServiceId);
        return this;
    }

    /**
     * <p>
     * The categories that label and describe the type of insight.
     * </p>
     * 
     * @return The categories that label and describe the type of insight.
     * @see InsightCategory
     */

    public java.util.List<String> getCategories() {
        return categories;
    }

    /**
     * <p>
     * The categories that label and describe the type of insight.
     * </p>
     * 
     * @param categories
     *        The categories that label and describe the type of insight.
     * @see InsightCategory
     */

    public void setCategories(java.util.Collection<String> categories) {
        if (categories == null) {
            this.categories = null;
            return;
        }

        this.categories = new java.util.ArrayList<String>(categories);
    }

    /**
     * <p>
     * The categories that label and describe the type of insight.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCategories(java.util.Collection)} or {@link #withCategories(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param categories
     *        The categories that label and describe the type of insight.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InsightCategory
     */

    public Insight withCategories(String... categories) {
        if (this.categories == null) {
            setCategories(new java.util.ArrayList<String>(categories.length));
        }
        for (String ele : categories) {
            this.categories.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The categories that label and describe the type of insight.
     * </p>
     * 
     * @param categories
     *        The categories that label and describe the type of insight.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InsightCategory
     */

    public Insight withCategories(java.util.Collection<String> categories) {
        setCategories(categories);
        return this;
    }

    /**
     * <p>
     * The categories that label and describe the type of insight.
     * </p>
     * 
     * @param categories
     *        The categories that label and describe the type of insight.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InsightCategory
     */

    public Insight withCategories(InsightCategory... categories) {
        java.util.ArrayList<String> categoriesCopy = new java.util.ArrayList<String>(categories.length);
        for (InsightCategory value : categories) {
            categoriesCopy.add(value.toString());
        }
        if (getCategories() == null) {
            setCategories(categoriesCopy);
        } else {
            getCategories().addAll(categoriesCopy);
        }
        return this;
    }

    /**
     * <p>
     * The current state of the insight.
     * </p>
     * 
     * @param state
     *        The current state of the insight.
     * @see InsightState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The current state of the insight.
     * </p>
     * 
     * @return The current state of the insight.
     * @see InsightState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The current state of the insight.
     * </p>
     * 
     * @param state
     *        The current state of the insight.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InsightState
     */

    public Insight withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The current state of the insight.
     * </p>
     * 
     * @param state
     *        The current state of the insight.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InsightState
     */

    public Insight withState(InsightState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The time, in Unix seconds, at which the insight began.
     * </p>
     * 
     * @param startTime
     *        The time, in Unix seconds, at which the insight began.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The time, in Unix seconds, at which the insight began.
     * </p>
     * 
     * @return The time, in Unix seconds, at which the insight began.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The time, in Unix seconds, at which the insight began.
     * </p>
     * 
     * @param startTime
     *        The time, in Unix seconds, at which the insight began.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Insight withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The time, in Unix seconds, at which the insight ended.
     * </p>
     * 
     * @param endTime
     *        The time, in Unix seconds, at which the insight ended.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The time, in Unix seconds, at which the insight ended.
     * </p>
     * 
     * @return The time, in Unix seconds, at which the insight ended.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The time, in Unix seconds, at which the insight ended.
     * </p>
     * 
     * @param endTime
     *        The time, in Unix seconds, at which the insight ended.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Insight withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * A brief description of the insight.
     * </p>
     * 
     * @param summary
     *        A brief description of the insight.
     */

    public void setSummary(String summary) {
        this.summary = summary;
    }

    /**
     * <p>
     * A brief description of the insight.
     * </p>
     * 
     * @return A brief description of the insight.
     */

    public String getSummary() {
        return this.summary;
    }

    /**
     * <p>
     * A brief description of the insight.
     * </p>
     * 
     * @param summary
     *        A brief description of the insight.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Insight withSummary(String summary) {
        setSummary(summary);
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

    public Insight withClientRequestImpactStatistics(RequestImpactStatistics clientRequestImpactStatistics) {
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

    public Insight withRootCauseServiceRequestImpactStatistics(RequestImpactStatistics rootCauseServiceRequestImpactStatistics) {
        setRootCauseServiceRequestImpactStatistics(rootCauseServiceRequestImpactStatistics);
        return this;
    }

    /**
     * <p>
     * The service within the insight that is most impacted by the incident.
     * </p>
     * 
     * @return The service within the insight that is most impacted by the incident.
     */

    public java.util.List<AnomalousService> getTopAnomalousServices() {
        return topAnomalousServices;
    }

    /**
     * <p>
     * The service within the insight that is most impacted by the incident.
     * </p>
     * 
     * @param topAnomalousServices
     *        The service within the insight that is most impacted by the incident.
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
     * The service within the insight that is most impacted by the incident.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTopAnomalousServices(java.util.Collection)} or {@link #withTopAnomalousServices(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param topAnomalousServices
     *        The service within the insight that is most impacted by the incident.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Insight withTopAnomalousServices(AnomalousService... topAnomalousServices) {
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
     * The service within the insight that is most impacted by the incident.
     * </p>
     * 
     * @param topAnomalousServices
     *        The service within the insight that is most impacted by the incident.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Insight withTopAnomalousServices(java.util.Collection<AnomalousService> topAnomalousServices) {
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
        if (getInsightId() != null)
            sb.append("InsightId: ").append(getInsightId()).append(",");
        if (getGroupARN() != null)
            sb.append("GroupARN: ").append(getGroupARN()).append(",");
        if (getGroupName() != null)
            sb.append("GroupName: ").append(getGroupName()).append(",");
        if (getRootCauseServiceId() != null)
            sb.append("RootCauseServiceId: ").append(getRootCauseServiceId()).append(",");
        if (getCategories() != null)
            sb.append("Categories: ").append(getCategories()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getSummary() != null)
            sb.append("Summary: ").append(getSummary()).append(",");
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

        if (obj instanceof Insight == false)
            return false;
        Insight other = (Insight) obj;
        if (other.getInsightId() == null ^ this.getInsightId() == null)
            return false;
        if (other.getInsightId() != null && other.getInsightId().equals(this.getInsightId()) == false)
            return false;
        if (other.getGroupARN() == null ^ this.getGroupARN() == null)
            return false;
        if (other.getGroupARN() != null && other.getGroupARN().equals(this.getGroupARN()) == false)
            return false;
        if (other.getGroupName() == null ^ this.getGroupName() == null)
            return false;
        if (other.getGroupName() != null && other.getGroupName().equals(this.getGroupName()) == false)
            return false;
        if (other.getRootCauseServiceId() == null ^ this.getRootCauseServiceId() == null)
            return false;
        if (other.getRootCauseServiceId() != null && other.getRootCauseServiceId().equals(this.getRootCauseServiceId()) == false)
            return false;
        if (other.getCategories() == null ^ this.getCategories() == null)
            return false;
        if (other.getCategories() != null && other.getCategories().equals(this.getCategories()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getSummary() == null ^ this.getSummary() == null)
            return false;
        if (other.getSummary() != null && other.getSummary().equals(this.getSummary()) == false)
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

        hashCode = prime * hashCode + ((getInsightId() == null) ? 0 : getInsightId().hashCode());
        hashCode = prime * hashCode + ((getGroupARN() == null) ? 0 : getGroupARN().hashCode());
        hashCode = prime * hashCode + ((getGroupName() == null) ? 0 : getGroupName().hashCode());
        hashCode = prime * hashCode + ((getRootCauseServiceId() == null) ? 0 : getRootCauseServiceId().hashCode());
        hashCode = prime * hashCode + ((getCategories() == null) ? 0 : getCategories().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getSummary() == null) ? 0 : getSummary().hashCode());
        hashCode = prime * hashCode + ((getClientRequestImpactStatistics() == null) ? 0 : getClientRequestImpactStatistics().hashCode());
        hashCode = prime * hashCode + ((getRootCauseServiceRequestImpactStatistics() == null) ? 0 : getRootCauseServiceRequestImpactStatistics().hashCode());
        hashCode = prime * hashCode + ((getTopAnomalousServices() == null) ? 0 : getTopAnomalousServices().hashCode());
        return hashCode;
    }

    @Override
    public Insight clone() {
        try {
            return (Insight) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.xray.model.transform.InsightMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
