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
 * Request sampling results for a single rule from a service. Results are for the last 10 seconds unless the service has
 * been assigned a longer reporting interval after a previous call to <a>GetSamplingTargets</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/SamplingStatisticsDocument" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SamplingStatisticsDocument implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the sampling rule.
     * </p>
     */
    private String ruleName;
    /**
     * <p>
     * A unique identifier for the service in hexadecimal.
     * </p>
     */
    private String clientID;
    /**
     * <p>
     * The current time.
     * </p>
     */
    private java.util.Date timestamp;
    /**
     * <p>
     * The number of requests that matched the rule.
     * </p>
     */
    private Integer requestCount;
    /**
     * <p>
     * The number of requests recorded.
     * </p>
     */
    private Integer sampledCount;
    /**
     * <p>
     * The number of requests recorded with borrowed reservoir quota.
     * </p>
     */
    private Integer borrowCount;

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

    public SamplingStatisticsDocument withRuleName(String ruleName) {
        setRuleName(ruleName);
        return this;
    }

    /**
     * <p>
     * A unique identifier for the service in hexadecimal.
     * </p>
     * 
     * @param clientID
     *        A unique identifier for the service in hexadecimal.
     */

    public void setClientID(String clientID) {
        this.clientID = clientID;
    }

    /**
     * <p>
     * A unique identifier for the service in hexadecimal.
     * </p>
     * 
     * @return A unique identifier for the service in hexadecimal.
     */

    public String getClientID() {
        return this.clientID;
    }

    /**
     * <p>
     * A unique identifier for the service in hexadecimal.
     * </p>
     * 
     * @param clientID
     *        A unique identifier for the service in hexadecimal.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SamplingStatisticsDocument withClientID(String clientID) {
        setClientID(clientID);
        return this;
    }

    /**
     * <p>
     * The current time.
     * </p>
     * 
     * @param timestamp
     *        The current time.
     */

    public void setTimestamp(java.util.Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * <p>
     * The current time.
     * </p>
     * 
     * @return The current time.
     */

    public java.util.Date getTimestamp() {
        return this.timestamp;
    }

    /**
     * <p>
     * The current time.
     * </p>
     * 
     * @param timestamp
     *        The current time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SamplingStatisticsDocument withTimestamp(java.util.Date timestamp) {
        setTimestamp(timestamp);
        return this;
    }

    /**
     * <p>
     * The number of requests that matched the rule.
     * </p>
     * 
     * @param requestCount
     *        The number of requests that matched the rule.
     */

    public void setRequestCount(Integer requestCount) {
        this.requestCount = requestCount;
    }

    /**
     * <p>
     * The number of requests that matched the rule.
     * </p>
     * 
     * @return The number of requests that matched the rule.
     */

    public Integer getRequestCount() {
        return this.requestCount;
    }

    /**
     * <p>
     * The number of requests that matched the rule.
     * </p>
     * 
     * @param requestCount
     *        The number of requests that matched the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SamplingStatisticsDocument withRequestCount(Integer requestCount) {
        setRequestCount(requestCount);
        return this;
    }

    /**
     * <p>
     * The number of requests recorded.
     * </p>
     * 
     * @param sampledCount
     *        The number of requests recorded.
     */

    public void setSampledCount(Integer sampledCount) {
        this.sampledCount = sampledCount;
    }

    /**
     * <p>
     * The number of requests recorded.
     * </p>
     * 
     * @return The number of requests recorded.
     */

    public Integer getSampledCount() {
        return this.sampledCount;
    }

    /**
     * <p>
     * The number of requests recorded.
     * </p>
     * 
     * @param sampledCount
     *        The number of requests recorded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SamplingStatisticsDocument withSampledCount(Integer sampledCount) {
        setSampledCount(sampledCount);
        return this;
    }

    /**
     * <p>
     * The number of requests recorded with borrowed reservoir quota.
     * </p>
     * 
     * @param borrowCount
     *        The number of requests recorded with borrowed reservoir quota.
     */

    public void setBorrowCount(Integer borrowCount) {
        this.borrowCount = borrowCount;
    }

    /**
     * <p>
     * The number of requests recorded with borrowed reservoir quota.
     * </p>
     * 
     * @return The number of requests recorded with borrowed reservoir quota.
     */

    public Integer getBorrowCount() {
        return this.borrowCount;
    }

    /**
     * <p>
     * The number of requests recorded with borrowed reservoir quota.
     * </p>
     * 
     * @param borrowCount
     *        The number of requests recorded with borrowed reservoir quota.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SamplingStatisticsDocument withBorrowCount(Integer borrowCount) {
        setBorrowCount(borrowCount);
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
        if (getClientID() != null)
            sb.append("ClientID: ").append(getClientID()).append(",");
        if (getTimestamp() != null)
            sb.append("Timestamp: ").append(getTimestamp()).append(",");
        if (getRequestCount() != null)
            sb.append("RequestCount: ").append(getRequestCount()).append(",");
        if (getSampledCount() != null)
            sb.append("SampledCount: ").append(getSampledCount()).append(",");
        if (getBorrowCount() != null)
            sb.append("BorrowCount: ").append(getBorrowCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SamplingStatisticsDocument == false)
            return false;
        SamplingStatisticsDocument other = (SamplingStatisticsDocument) obj;
        if (other.getRuleName() == null ^ this.getRuleName() == null)
            return false;
        if (other.getRuleName() != null && other.getRuleName().equals(this.getRuleName()) == false)
            return false;
        if (other.getClientID() == null ^ this.getClientID() == null)
            return false;
        if (other.getClientID() != null && other.getClientID().equals(this.getClientID()) == false)
            return false;
        if (other.getTimestamp() == null ^ this.getTimestamp() == null)
            return false;
        if (other.getTimestamp() != null && other.getTimestamp().equals(this.getTimestamp()) == false)
            return false;
        if (other.getRequestCount() == null ^ this.getRequestCount() == null)
            return false;
        if (other.getRequestCount() != null && other.getRequestCount().equals(this.getRequestCount()) == false)
            return false;
        if (other.getSampledCount() == null ^ this.getSampledCount() == null)
            return false;
        if (other.getSampledCount() != null && other.getSampledCount().equals(this.getSampledCount()) == false)
            return false;
        if (other.getBorrowCount() == null ^ this.getBorrowCount() == null)
            return false;
        if (other.getBorrowCount() != null && other.getBorrowCount().equals(this.getBorrowCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRuleName() == null) ? 0 : getRuleName().hashCode());
        hashCode = prime * hashCode + ((getClientID() == null) ? 0 : getClientID().hashCode());
        hashCode = prime * hashCode + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode());
        hashCode = prime * hashCode + ((getRequestCount() == null) ? 0 : getRequestCount().hashCode());
        hashCode = prime * hashCode + ((getSampledCount() == null) ? 0 : getSampledCount().hashCode());
        hashCode = prime * hashCode + ((getBorrowCount() == null) ? 0 : getBorrowCount().hashCode());
        return hashCode;
    }

    @Override
    public SamplingStatisticsDocument clone() {
        try {
            return (SamplingStatisticsDocument) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.xray.model.transform.SamplingStatisticsDocumentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
