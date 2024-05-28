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
package com.amazonaws.services.internetmonitor.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/internetmonitor-2021-06-03/ListMonitors" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListMonitorsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of monitors.
     * </p>
     */
    private java.util.List<Monitor> monitors;
    /**
     * <p>
     * The token for the next set of results. You receive this token from a previous call.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of monitors.
     * </p>
     * 
     * @return A list of monitors.
     */

    public java.util.List<Monitor> getMonitors() {
        return monitors;
    }

    /**
     * <p>
     * A list of monitors.
     * </p>
     * 
     * @param monitors
     *        A list of monitors.
     */

    public void setMonitors(java.util.Collection<Monitor> monitors) {
        if (monitors == null) {
            this.monitors = null;
            return;
        }

        this.monitors = new java.util.ArrayList<Monitor>(monitors);
    }

    /**
     * <p>
     * A list of monitors.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMonitors(java.util.Collection)} or {@link #withMonitors(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param monitors
     *        A list of monitors.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMonitorsResult withMonitors(Monitor... monitors) {
        if (this.monitors == null) {
            setMonitors(new java.util.ArrayList<Monitor>(monitors.length));
        }
        for (Monitor ele : monitors) {
            this.monitors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of monitors.
     * </p>
     * 
     * @param monitors
     *        A list of monitors.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMonitorsResult withMonitors(java.util.Collection<Monitor> monitors) {
        setMonitors(monitors);
        return this;
    }

    /**
     * <p>
     * The token for the next set of results. You receive this token from a previous call.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results. You receive this token from a previous call.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results. You receive this token from a previous call.
     * </p>
     * 
     * @return The token for the next set of results. You receive this token from a previous call.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of results. You receive this token from a previous call.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results. You receive this token from a previous call.
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
