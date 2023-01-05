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
package com.amazonaws.services.cloudwatchevidently.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/PutProjectEvents" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutProjectEventsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A structure that contains Evidently's response to the sent events, including an event ID and error codes, if any.
     * </p>
     */
    private java.util.List<PutProjectEventsResultEntry> eventResults;
    /**
     * <p>
     * The number of events in the operation that could not be used by Evidently.
     * </p>
     */
    private Integer failedEventCount;

    /**
     * <p>
     * A structure that contains Evidently's response to the sent events, including an event ID and error codes, if any.
     * </p>
     * 
     * @return A structure that contains Evidently's response to the sent events, including an event ID and error codes,
     *         if any.
     */

    public java.util.List<PutProjectEventsResultEntry> getEventResults() {
        return eventResults;
    }

    /**
     * <p>
     * A structure that contains Evidently's response to the sent events, including an event ID and error codes, if any.
     * </p>
     * 
     * @param eventResults
     *        A structure that contains Evidently's response to the sent events, including an event ID and error codes,
     *        if any.
     */

    public void setEventResults(java.util.Collection<PutProjectEventsResultEntry> eventResults) {
        if (eventResults == null) {
            this.eventResults = null;
            return;
        }

        this.eventResults = new java.util.ArrayList<PutProjectEventsResultEntry>(eventResults);
    }

    /**
     * <p>
     * A structure that contains Evidently's response to the sent events, including an event ID and error codes, if any.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEventResults(java.util.Collection)} or {@link #withEventResults(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param eventResults
     *        A structure that contains Evidently's response to the sent events, including an event ID and error codes,
     *        if any.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutProjectEventsResult withEventResults(PutProjectEventsResultEntry... eventResults) {
        if (this.eventResults == null) {
            setEventResults(new java.util.ArrayList<PutProjectEventsResultEntry>(eventResults.length));
        }
        for (PutProjectEventsResultEntry ele : eventResults) {
            this.eventResults.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A structure that contains Evidently's response to the sent events, including an event ID and error codes, if any.
     * </p>
     * 
     * @param eventResults
     *        A structure that contains Evidently's response to the sent events, including an event ID and error codes,
     *        if any.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutProjectEventsResult withEventResults(java.util.Collection<PutProjectEventsResultEntry> eventResults) {
        setEventResults(eventResults);
        return this;
    }

    /**
     * <p>
     * The number of events in the operation that could not be used by Evidently.
     * </p>
     * 
     * @param failedEventCount
     *        The number of events in the operation that could not be used by Evidently.
     */

    public void setFailedEventCount(Integer failedEventCount) {
        this.failedEventCount = failedEventCount;
    }

    /**
     * <p>
     * The number of events in the operation that could not be used by Evidently.
     * </p>
     * 
     * @return The number of events in the operation that could not be used by Evidently.
     */

    public Integer getFailedEventCount() {
        return this.failedEventCount;
    }

    /**
     * <p>
     * The number of events in the operation that could not be used by Evidently.
     * </p>
     * 
     * @param failedEventCount
     *        The number of events in the operation that could not be used by Evidently.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutProjectEventsResult withFailedEventCount(Integer failedEventCount) {
        setFailedEventCount(failedEventCount);
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
        if (getEventResults() != null)
            sb.append("EventResults: ").append(getEventResults()).append(",");
        if (getFailedEventCount() != null)
            sb.append("FailedEventCount: ").append(getFailedEventCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutProjectEventsResult == false)
            return false;
        PutProjectEventsResult other = (PutProjectEventsResult) obj;
        if (other.getEventResults() == null ^ this.getEventResults() == null)
            return false;
        if (other.getEventResults() != null && other.getEventResults().equals(this.getEventResults()) == false)
            return false;
        if (other.getFailedEventCount() == null ^ this.getFailedEventCount() == null)
            return false;
        if (other.getFailedEventCount() != null && other.getFailedEventCount().equals(this.getFailedEventCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEventResults() == null) ? 0 : getEventResults().hashCode());
        hashCode = prime * hashCode + ((getFailedEventCount() == null) ? 0 : getFailedEventCount().hashCode());
        return hashCode;
    }

    @Override
    public PutProjectEventsResult clone() {
        try {
            return (PutProjectEventsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
