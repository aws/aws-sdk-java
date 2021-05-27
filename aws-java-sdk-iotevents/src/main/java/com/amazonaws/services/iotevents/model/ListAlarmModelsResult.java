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
package com.amazonaws.services.iotevents.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/ListAlarmModels" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAlarmModelsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list that summarizes each alarm model.
     * </p>
     */
    private java.util.List<AlarmModelSummary> alarmModelSummaries;
    /**
     * <p>
     * The token that you can use to return the next set of results, or <code>null</code> if there are no more results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list that summarizes each alarm model.
     * </p>
     * 
     * @return A list that summarizes each alarm model.
     */

    public java.util.List<AlarmModelSummary> getAlarmModelSummaries() {
        return alarmModelSummaries;
    }

    /**
     * <p>
     * A list that summarizes each alarm model.
     * </p>
     * 
     * @param alarmModelSummaries
     *        A list that summarizes each alarm model.
     */

    public void setAlarmModelSummaries(java.util.Collection<AlarmModelSummary> alarmModelSummaries) {
        if (alarmModelSummaries == null) {
            this.alarmModelSummaries = null;
            return;
        }

        this.alarmModelSummaries = new java.util.ArrayList<AlarmModelSummary>(alarmModelSummaries);
    }

    /**
     * <p>
     * A list that summarizes each alarm model.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAlarmModelSummaries(java.util.Collection)} or {@link #withAlarmModelSummaries(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param alarmModelSummaries
     *        A list that summarizes each alarm model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAlarmModelsResult withAlarmModelSummaries(AlarmModelSummary... alarmModelSummaries) {
        if (this.alarmModelSummaries == null) {
            setAlarmModelSummaries(new java.util.ArrayList<AlarmModelSummary>(alarmModelSummaries.length));
        }
        for (AlarmModelSummary ele : alarmModelSummaries) {
            this.alarmModelSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list that summarizes each alarm model.
     * </p>
     * 
     * @param alarmModelSummaries
     *        A list that summarizes each alarm model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAlarmModelsResult withAlarmModelSummaries(java.util.Collection<AlarmModelSummary> alarmModelSummaries) {
        setAlarmModelSummaries(alarmModelSummaries);
        return this;
    }

    /**
     * <p>
     * The token that you can use to return the next set of results, or <code>null</code> if there are no more results.
     * </p>
     * 
     * @param nextToken
     *        The token that you can use to return the next set of results, or <code>null</code> if there are no more
     *        results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token that you can use to return the next set of results, or <code>null</code> if there are no more results.
     * </p>
     * 
     * @return The token that you can use to return the next set of results, or <code>null</code> if there are no more
     *         results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token that you can use to return the next set of results, or <code>null</code> if there are no more results.
     * </p>
     * 
     * @param nextToken
     *        The token that you can use to return the next set of results, or <code>null</code> if there are no more
     *        results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAlarmModelsResult withNextToken(String nextToken) {
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
        if (getAlarmModelSummaries() != null)
            sb.append("AlarmModelSummaries: ").append(getAlarmModelSummaries()).append(",");
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

        if (obj instanceof ListAlarmModelsResult == false)
            return false;
        ListAlarmModelsResult other = (ListAlarmModelsResult) obj;
        if (other.getAlarmModelSummaries() == null ^ this.getAlarmModelSummaries() == null)
            return false;
        if (other.getAlarmModelSummaries() != null && other.getAlarmModelSummaries().equals(this.getAlarmModelSummaries()) == false)
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

        hashCode = prime * hashCode + ((getAlarmModelSummaries() == null) ? 0 : getAlarmModelSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListAlarmModelsResult clone() {
        try {
            return (ListAlarmModelsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
