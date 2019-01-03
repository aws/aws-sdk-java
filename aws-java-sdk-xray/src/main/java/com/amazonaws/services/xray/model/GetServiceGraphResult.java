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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/GetServiceGraph" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetServiceGraphResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The start of the time frame for which the graph was generated.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The end of the time frame for which the graph was generated.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * The services that have processed a traced request during the specified time frame.
     * </p>
     */
    private java.util.List<Service> services;
    /**
     * <p>
     * A flag indicating whether the group's filter expression has been consistent, or if the returned service graph may
     * show traces from an older version of the group's filter expression.
     * </p>
     */
    private Boolean containsOldGroupVersions;
    /**
     * <p>
     * Pagination token. Not used.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The start of the time frame for which the graph was generated.
     * </p>
     * 
     * @param startTime
     *        The start of the time frame for which the graph was generated.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The start of the time frame for which the graph was generated.
     * </p>
     * 
     * @return The start of the time frame for which the graph was generated.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The start of the time frame for which the graph was generated.
     * </p>
     * 
     * @param startTime
     *        The start of the time frame for which the graph was generated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetServiceGraphResult withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The end of the time frame for which the graph was generated.
     * </p>
     * 
     * @param endTime
     *        The end of the time frame for which the graph was generated.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The end of the time frame for which the graph was generated.
     * </p>
     * 
     * @return The end of the time frame for which the graph was generated.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The end of the time frame for which the graph was generated.
     * </p>
     * 
     * @param endTime
     *        The end of the time frame for which the graph was generated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetServiceGraphResult withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * The services that have processed a traced request during the specified time frame.
     * </p>
     * 
     * @return The services that have processed a traced request during the specified time frame.
     */

    public java.util.List<Service> getServices() {
        return services;
    }

    /**
     * <p>
     * The services that have processed a traced request during the specified time frame.
     * </p>
     * 
     * @param services
     *        The services that have processed a traced request during the specified time frame.
     */

    public void setServices(java.util.Collection<Service> services) {
        if (services == null) {
            this.services = null;
            return;
        }

        this.services = new java.util.ArrayList<Service>(services);
    }

    /**
     * <p>
     * The services that have processed a traced request during the specified time frame.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setServices(java.util.Collection)} or {@link #withServices(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param services
     *        The services that have processed a traced request during the specified time frame.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetServiceGraphResult withServices(Service... services) {
        if (this.services == null) {
            setServices(new java.util.ArrayList<Service>(services.length));
        }
        for (Service ele : services) {
            this.services.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The services that have processed a traced request during the specified time frame.
     * </p>
     * 
     * @param services
     *        The services that have processed a traced request during the specified time frame.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetServiceGraphResult withServices(java.util.Collection<Service> services) {
        setServices(services);
        return this;
    }

    /**
     * <p>
     * A flag indicating whether the group's filter expression has been consistent, or if the returned service graph may
     * show traces from an older version of the group's filter expression.
     * </p>
     * 
     * @param containsOldGroupVersions
     *        A flag indicating whether the group's filter expression has been consistent, or if the returned service
     *        graph may show traces from an older version of the group's filter expression.
     */

    public void setContainsOldGroupVersions(Boolean containsOldGroupVersions) {
        this.containsOldGroupVersions = containsOldGroupVersions;
    }

    /**
     * <p>
     * A flag indicating whether the group's filter expression has been consistent, or if the returned service graph may
     * show traces from an older version of the group's filter expression.
     * </p>
     * 
     * @return A flag indicating whether the group's filter expression has been consistent, or if the returned service
     *         graph may show traces from an older version of the group's filter expression.
     */

    public Boolean getContainsOldGroupVersions() {
        return this.containsOldGroupVersions;
    }

    /**
     * <p>
     * A flag indicating whether the group's filter expression has been consistent, or if the returned service graph may
     * show traces from an older version of the group's filter expression.
     * </p>
     * 
     * @param containsOldGroupVersions
     *        A flag indicating whether the group's filter expression has been consistent, or if the returned service
     *        graph may show traces from an older version of the group's filter expression.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetServiceGraphResult withContainsOldGroupVersions(Boolean containsOldGroupVersions) {
        setContainsOldGroupVersions(containsOldGroupVersions);
        return this;
    }

    /**
     * <p>
     * A flag indicating whether the group's filter expression has been consistent, or if the returned service graph may
     * show traces from an older version of the group's filter expression.
     * </p>
     * 
     * @return A flag indicating whether the group's filter expression has been consistent, or if the returned service
     *         graph may show traces from an older version of the group's filter expression.
     */

    public Boolean isContainsOldGroupVersions() {
        return this.containsOldGroupVersions;
    }

    /**
     * <p>
     * Pagination token. Not used.
     * </p>
     * 
     * @param nextToken
     *        Pagination token. Not used.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Pagination token. Not used.
     * </p>
     * 
     * @return Pagination token. Not used.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Pagination token. Not used.
     * </p>
     * 
     * @param nextToken
     *        Pagination token. Not used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetServiceGraphResult withNextToken(String nextToken) {
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
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getServices() != null)
            sb.append("Services: ").append(getServices()).append(",");
        if (getContainsOldGroupVersions() != null)
            sb.append("ContainsOldGroupVersions: ").append(getContainsOldGroupVersions()).append(",");
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

        if (obj instanceof GetServiceGraphResult == false)
            return false;
        GetServiceGraphResult other = (GetServiceGraphResult) obj;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getServices() == null ^ this.getServices() == null)
            return false;
        if (other.getServices() != null && other.getServices().equals(this.getServices()) == false)
            return false;
        if (other.getContainsOldGroupVersions() == null ^ this.getContainsOldGroupVersions() == null)
            return false;
        if (other.getContainsOldGroupVersions() != null && other.getContainsOldGroupVersions().equals(this.getContainsOldGroupVersions()) == false)
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

        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getServices() == null) ? 0 : getServices().hashCode());
        hashCode = prime * hashCode + ((getContainsOldGroupVersions() == null) ? 0 : getContainsOldGroupVersions().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetServiceGraphResult clone() {
        try {
            return (GetServiceGraphResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
