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
package com.amazonaws.services.networkmonitor.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmonitor-2023-08-01/ListMonitors" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListMonitorsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Lists individual details about each of your monitors.
     * </p>
     */
    private java.util.List<MonitorSummary> monitors;
    /**
     * <p>
     * The token for the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Lists individual details about each of your monitors.
     * </p>
     * 
     * @return Lists individual details about each of your monitors.
     */

    public java.util.List<MonitorSummary> getMonitors() {
        return monitors;
    }

    /**
     * <p>
     * Lists individual details about each of your monitors.
     * </p>
     * 
     * @param monitors
     *        Lists individual details about each of your monitors.
     */

    public void setMonitors(java.util.Collection<MonitorSummary> monitors) {
        if (monitors == null) {
            this.monitors = null;
            return;
        }

        this.monitors = new java.util.ArrayList<MonitorSummary>(monitors);
    }

    /**
     * <p>
     * Lists individual details about each of your monitors.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMonitors(java.util.Collection)} or {@link #withMonitors(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param monitors
     *        Lists individual details about each of your monitors.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMonitorsResult withMonitors(MonitorSummary... monitors) {
        if (this.monitors == null) {
            setMonitors(new java.util.ArrayList<MonitorSummary>(monitors.length));
        }
        for (MonitorSummary ele : monitors) {
            this.monitors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Lists individual details about each of your monitors.
     * </p>
     * 
     * @param monitors
     *        Lists individual details about each of your monitors.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMonitorsResult withMonitors(java.util.Collection<MonitorSummary> monitors) {
        setMonitors(monitors);
        return this;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     * 
     * @return The token for the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMonitorsResult withNextToken(String nextToken) {
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
        if (getMonitors() != null)
            sb.append("Monitors: ").append(getMonitors()).append(",");
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

        if (obj instanceof ListMonitorsResult == false)
            return false;
        ListMonitorsResult other = (ListMonitorsResult) obj;
        if (other.getMonitors() == null ^ this.getMonitors() == null)
            return false;
        if (other.getMonitors() != null && other.getMonitors().equals(this.getMonitors()) == false)
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

        hashCode = prime * hashCode + ((getMonitors() == null) ? 0 : getMonitors().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListMonitorsResult clone() {
        try {
            return (ListMonitorsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
