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
package com.amazonaws.services.eks.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details about clients using the deprecated resources.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/ClientStat" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ClientStat implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The user agent of the Kubernetes client using the deprecated resource.
     * </p>
     */
    private String userAgent;
    /**
     * <p>
     * The number of requests from the Kubernetes client seen over the last 30 days.
     * </p>
     */
    private Integer numberOfRequestsLast30Days;
    /**
     * <p>
     * The timestamp of the last request seen from the Kubernetes client.
     * </p>
     */
    private java.util.Date lastRequestTime;

    /**
     * <p>
     * The user agent of the Kubernetes client using the deprecated resource.
     * </p>
     * 
     * @param userAgent
     *        The user agent of the Kubernetes client using the deprecated resource.
     */

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    /**
     * <p>
     * The user agent of the Kubernetes client using the deprecated resource.
     * </p>
     * 
     * @return The user agent of the Kubernetes client using the deprecated resource.
     */

    public String getUserAgent() {
        return this.userAgent;
    }

    /**
     * <p>
     * The user agent of the Kubernetes client using the deprecated resource.
     * </p>
     * 
     * @param userAgent
     *        The user agent of the Kubernetes client using the deprecated resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClientStat withUserAgent(String userAgent) {
        setUserAgent(userAgent);
        return this;
    }

    /**
     * <p>
     * The number of requests from the Kubernetes client seen over the last 30 days.
     * </p>
     * 
     * @param numberOfRequestsLast30Days
     *        The number of requests from the Kubernetes client seen over the last 30 days.
     */

    public void setNumberOfRequestsLast30Days(Integer numberOfRequestsLast30Days) {
        this.numberOfRequestsLast30Days = numberOfRequestsLast30Days;
    }

    /**
     * <p>
     * The number of requests from the Kubernetes client seen over the last 30 days.
     * </p>
     * 
     * @return The number of requests from the Kubernetes client seen over the last 30 days.
     */

    public Integer getNumberOfRequestsLast30Days() {
        return this.numberOfRequestsLast30Days;
    }

    /**
     * <p>
     * The number of requests from the Kubernetes client seen over the last 30 days.
     * </p>
     * 
     * @param numberOfRequestsLast30Days
     *        The number of requests from the Kubernetes client seen over the last 30 days.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClientStat withNumberOfRequestsLast30Days(Integer numberOfRequestsLast30Days) {
        setNumberOfRequestsLast30Days(numberOfRequestsLast30Days);
        return this;
    }

    /**
     * <p>
     * The timestamp of the last request seen from the Kubernetes client.
     * </p>
     * 
     * @param lastRequestTime
     *        The timestamp of the last request seen from the Kubernetes client.
     */

    public void setLastRequestTime(java.util.Date lastRequestTime) {
        this.lastRequestTime = lastRequestTime;
    }

    /**
     * <p>
     * The timestamp of the last request seen from the Kubernetes client.
     * </p>
     * 
     * @return The timestamp of the last request seen from the Kubernetes client.
     */

    public java.util.Date getLastRequestTime() {
        return this.lastRequestTime;
    }

    /**
     * <p>
     * The timestamp of the last request seen from the Kubernetes client.
     * </p>
     * 
     * @param lastRequestTime
     *        The timestamp of the last request seen from the Kubernetes client.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClientStat withLastRequestTime(java.util.Date lastRequestTime) {
        setLastRequestTime(lastRequestTime);
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
        if (getUserAgent() != null)
            sb.append("UserAgent: ").append(getUserAgent()).append(",");
        if (getNumberOfRequestsLast30Days() != null)
            sb.append("NumberOfRequestsLast30Days: ").append(getNumberOfRequestsLast30Days()).append(",");
        if (getLastRequestTime() != null)
            sb.append("LastRequestTime: ").append(getLastRequestTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ClientStat == false)
            return false;
        ClientStat other = (ClientStat) obj;
        if (other.getUserAgent() == null ^ this.getUserAgent() == null)
            return false;
        if (other.getUserAgent() != null && other.getUserAgent().equals(this.getUserAgent()) == false)
            return false;
        if (other.getNumberOfRequestsLast30Days() == null ^ this.getNumberOfRequestsLast30Days() == null)
            return false;
        if (other.getNumberOfRequestsLast30Days() != null && other.getNumberOfRequestsLast30Days().equals(this.getNumberOfRequestsLast30Days()) == false)
            return false;
        if (other.getLastRequestTime() == null ^ this.getLastRequestTime() == null)
            return false;
        if (other.getLastRequestTime() != null && other.getLastRequestTime().equals(this.getLastRequestTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserAgent() == null) ? 0 : getUserAgent().hashCode());
        hashCode = prime * hashCode + ((getNumberOfRequestsLast30Days() == null) ? 0 : getNumberOfRequestsLast30Days().hashCode());
        hashCode = prime * hashCode + ((getLastRequestTime() == null) ? 0 : getLastRequestTime().hashCode());
        return hashCode;
    }

    @Override
    public ClientStat clone() {
        try {
            return (ClientStat) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.eks.model.transform.ClientStatMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
