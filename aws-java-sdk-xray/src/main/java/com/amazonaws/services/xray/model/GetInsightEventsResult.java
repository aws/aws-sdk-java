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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/GetInsightEvents" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetInsightEventsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A detailed description of the event. This includes the time of the event, client and root cause impact
     * statistics, and the top anomalous service at the time of the event.
     * </p>
     */
    private java.util.List<InsightEvent> insightEvents;
    /**
     * <p>
     * Use this token to retrieve the next page of insight events.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A detailed description of the event. This includes the time of the event, client and root cause impact
     * statistics, and the top anomalous service at the time of the event.
     * </p>
     * 
     * @return A detailed description of the event. This includes the time of the event, client and root cause impact
     *         statistics, and the top anomalous service at the time of the event.
     */

    public java.util.List<InsightEvent> getInsightEvents() {
        return insightEvents;
    }

    /**
     * <p>
     * A detailed description of the event. This includes the time of the event, client and root cause impact
     * statistics, and the top anomalous service at the time of the event.
     * </p>
     * 
     * @param insightEvents
     *        A detailed description of the event. This includes the time of the event, client and root cause impact
     *        statistics, and the top anomalous service at the time of the event.
     */

    public void setInsightEvents(java.util.Collection<InsightEvent> insightEvents) {
        if (insightEvents == null) {
            this.insightEvents = null;
            return;
        }

        this.insightEvents = new java.util.ArrayList<InsightEvent>(insightEvents);
    }

    /**
     * <p>
     * A detailed description of the event. This includes the time of the event, client and root cause impact
     * statistics, and the top anomalous service at the time of the event.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInsightEvents(java.util.Collection)} or {@link #withInsightEvents(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param insightEvents
     *        A detailed description of the event. This includes the time of the event, client and root cause impact
     *        statistics, and the top anomalous service at the time of the event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInsightEventsResult withInsightEvents(InsightEvent... insightEvents) {
        if (this.insightEvents == null) {
            setInsightEvents(new java.util.ArrayList<InsightEvent>(insightEvents.length));
        }
        for (InsightEvent ele : insightEvents) {
            this.insightEvents.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A detailed description of the event. This includes the time of the event, client and root cause impact
     * statistics, and the top anomalous service at the time of the event.
     * </p>
     * 
     * @param insightEvents
     *        A detailed description of the event. This includes the time of the event, client and root cause impact
     *        statistics, and the top anomalous service at the time of the event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInsightEventsResult withInsightEvents(java.util.Collection<InsightEvent> insightEvents) {
        setInsightEvents(insightEvents);
        return this;
    }

    /**
     * <p>
     * Use this token to retrieve the next page of insight events.
     * </p>
     * 
     * @param nextToken
     *        Use this token to retrieve the next page of insight events.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Use this token to retrieve the next page of insight events.
     * </p>
     * 
     * @return Use this token to retrieve the next page of insight events.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Use this token to retrieve the next page of insight events.
     * </p>
     * 
     * @param nextToken
     *        Use this token to retrieve the next page of insight events.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInsightEventsResult withNextToken(String nextToken) {
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
        if (getInsightEvents() != null)
            sb.append("InsightEvents: ").append(getInsightEvents()).append(",");
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

        if (obj instanceof GetInsightEventsResult == false)
            return false;
        GetInsightEventsResult other = (GetInsightEventsResult) obj;
        if (other.getInsightEvents() == null ^ this.getInsightEvents() == null)
            return false;
        if (other.getInsightEvents() != null && other.getInsightEvents().equals(this.getInsightEvents()) == false)
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

        hashCode = prime * hashCode + ((getInsightEvents() == null) ? 0 : getInsightEvents().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetInsightEventsResult clone() {
        try {
            return (GetInsightEventsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
