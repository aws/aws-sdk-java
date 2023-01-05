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
package com.amazonaws.services.xray.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/GetInsightImpactGraph" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetInsightImpactGraphResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The insight's unique identifier.
     * </p>
     */
    private String insightId;
    /**
     * <p>
     * The provided start time.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The provided end time.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * The time, in Unix seconds, at which the service graph started.
     * </p>
     */
    private java.util.Date serviceGraphStartTime;
    /**
     * <p>
     * The time, in Unix seconds, at which the service graph ended.
     * </p>
     */
    private java.util.Date serviceGraphEndTime;
    /**
     * <p>
     * The Amazon Web Services instrumented services related to the insight.
     * </p>
     */
    private java.util.List<InsightImpactGraphService> services;
    /**
     * <p>
     * Pagination token.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The insight's unique identifier.
     * </p>
     * 
     * @param insightId
     *        The insight's unique identifier.
     */

    public void setInsightId(String insightId) {
        this.insightId = insightId;
    }

    /**
     * <p>
     * The insight's unique identifier.
     * </p>
     * 
     * @return The insight's unique identifier.
     */

    public String getInsightId() {
        return this.insightId;
    }

    /**
     * <p>
     * The insight's unique identifier.
     * </p>
     * 
     * @param insightId
     *        The insight's unique identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInsightImpactGraphResult withInsightId(String insightId) {
        setInsightId(insightId);
        return this;
    }

    /**
     * <p>
     * The provided start time.
     * </p>
     * 
     * @param startTime
     *        The provided start time.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The provided start time.
     * </p>
     * 
     * @return The provided start time.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The provided start time.
     * </p>
     * 
     * @param startTime
     *        The provided start time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInsightImpactGraphResult withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The provided end time.
     * </p>
     * 
     * @param endTime
     *        The provided end time.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The provided end time.
     * </p>
     * 
     * @return The provided end time.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The provided end time.
     * </p>
     * 
     * @param endTime
     *        The provided end time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInsightImpactGraphResult withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * The time, in Unix seconds, at which the service graph started.
     * </p>
     * 
     * @param serviceGraphStartTime
     *        The time, in Unix seconds, at which the service graph started.
     */

    public void setServiceGraphStartTime(java.util.Date serviceGraphStartTime) {
        this.serviceGraphStartTime = serviceGraphStartTime;
    }

    /**
     * <p>
     * The time, in Unix seconds, at which the service graph started.
     * </p>
     * 
     * @return The time, in Unix seconds, at which the service graph started.
     */

    public java.util.Date getServiceGraphStartTime() {
        return this.serviceGraphStartTime;
    }

    /**
     * <p>
     * The time, in Unix seconds, at which the service graph started.
     * </p>
     * 
     * @param serviceGraphStartTime
     *        The time, in Unix seconds, at which the service graph started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInsightImpactGraphResult withServiceGraphStartTime(java.util.Date serviceGraphStartTime) {
        setServiceGraphStartTime(serviceGraphStartTime);
        return this;
    }

    /**
     * <p>
     * The time, in Unix seconds, at which the service graph ended.
     * </p>
     * 
     * @param serviceGraphEndTime
     *        The time, in Unix seconds, at which the service graph ended.
     */

    public void setServiceGraphEndTime(java.util.Date serviceGraphEndTime) {
        this.serviceGraphEndTime = serviceGraphEndTime;
    }

    /**
     * <p>
     * The time, in Unix seconds, at which the service graph ended.
     * </p>
     * 
     * @return The time, in Unix seconds, at which the service graph ended.
     */

    public java.util.Date getServiceGraphEndTime() {
        return this.serviceGraphEndTime;
    }

    /**
     * <p>
     * The time, in Unix seconds, at which the service graph ended.
     * </p>
     * 
     * @param serviceGraphEndTime
     *        The time, in Unix seconds, at which the service graph ended.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInsightImpactGraphResult withServiceGraphEndTime(java.util.Date serviceGraphEndTime) {
        setServiceGraphEndTime(serviceGraphEndTime);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services instrumented services related to the insight.
     * </p>
     * 
     * @return The Amazon Web Services instrumented services related to the insight.
     */

    public java.util.List<InsightImpactGraphService> getServices() {
        return services;
    }

    /**
     * <p>
     * The Amazon Web Services instrumented services related to the insight.
     * </p>
     * 
     * @param services
     *        The Amazon Web Services instrumented services related to the insight.
     */

    public void setServices(java.util.Collection<InsightImpactGraphService> services) {
        if (services == null) {
            this.services = null;
            return;
        }

        this.services = new java.util.ArrayList<InsightImpactGraphService>(services);
    }

    /**
     * <p>
     * The Amazon Web Services instrumented services related to the insight.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setServices(java.util.Collection)} or {@link #withServices(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param services
     *        The Amazon Web Services instrumented services related to the insight.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInsightImpactGraphResult withServices(InsightImpactGraphService... services) {
        if (this.services == null) {
            setServices(new java.util.ArrayList<InsightImpactGraphService>(services.length));
        }
        for (InsightImpactGraphService ele : services) {
            this.services.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services instrumented services related to the insight.
     * </p>
     * 
     * @param services
     *        The Amazon Web Services instrumented services related to the insight.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInsightImpactGraphResult withServices(java.util.Collection<InsightImpactGraphService> services) {
        setServices(services);
        return this;
    }

    /**
     * <p>
     * Pagination token.
     * </p>
     * 
     * @param nextToken
     *        Pagination token.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Pagination token.
     * </p>
     * 
     * @return Pagination token.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Pagination token.
     * </p>
     * 
     * @param nextToken
     *        Pagination token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInsightImpactGraphResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getServiceGraphStartTime() != null)
            sb.append("ServiceGraphStartTime: ").append(getServiceGraphStartTime()).append(",");
        if (getServiceGraphEndTime() != null)
            sb.append("ServiceGraphEndTime: ").append(getServiceGraphEndTime()).append(",");
        if (getServices() != null)
            sb.append("Services: ").append(getServices()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetInsightImpactGraphResult == false)
            return false;
        GetInsightImpactGraphResult other = (GetInsightImpactGraphResult) obj;
        if (other.getInsightId() == null ^ this.getInsightId() == null)
            return false;
        if (other.getInsightId() != null && other.getInsightId().equals(this.getInsightId()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getServiceGraphStartTime() == null ^ this.getServiceGraphStartTime() == null)
            return false;
        if (other.getServiceGraphStartTime() != null && other.getServiceGraphStartTime().equals(this.getServiceGraphStartTime()) == false)
            return false;
        if (other.getServiceGraphEndTime() == null ^ this.getServiceGraphEndTime() == null)
            return false;
        if (other.getServiceGraphEndTime() != null && other.getServiceGraphEndTime().equals(this.getServiceGraphEndTime()) == false)
            return false;
        if (other.getServices() == null ^ this.getServices() == null)
            return false;
        if (other.getServices() != null && other.getServices().equals(this.getServices()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInsightId() == null) ? 0 : getInsightId().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getServiceGraphStartTime() == null) ? 0 : getServiceGraphStartTime().hashCode());
        hashCode = prime * hashCode + ((getServiceGraphEndTime() == null) ? 0 : getServiceGraphEndTime().hashCode());
        hashCode = prime * hashCode + ((getServices() == null) ? 0 : getServices().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetInsightImpactGraphResult clone() {
        try {
            return (GetInsightImpactGraphResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
