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
package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetJourneyRunExecutionActivityMetrics"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetJourneyRunExecutionActivityMetricsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    private JourneyRunExecutionActivityMetricsResponse journeyRunExecutionActivityMetricsResponse;

    /**
     * @param journeyRunExecutionActivityMetricsResponse
     */

    public void setJourneyRunExecutionActivityMetricsResponse(JourneyRunExecutionActivityMetricsResponse journeyRunExecutionActivityMetricsResponse) {
        this.journeyRunExecutionActivityMetricsResponse = journeyRunExecutionActivityMetricsResponse;
    }

    /**
     * @return
     */

    public JourneyRunExecutionActivityMetricsResponse getJourneyRunExecutionActivityMetricsResponse() {
        return this.journeyRunExecutionActivityMetricsResponse;
    }

    /**
     * @param journeyRunExecutionActivityMetricsResponse
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetJourneyRunExecutionActivityMetricsResult withJourneyRunExecutionActivityMetricsResponse(
            JourneyRunExecutionActivityMetricsResponse journeyRunExecutionActivityMetricsResponse) {
        setJourneyRunExecutionActivityMetricsResponse(journeyRunExecutionActivityMetricsResponse);
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
        if (getJourneyRunExecutionActivityMetricsResponse() != null)
            sb.append("JourneyRunExecutionActivityMetricsResponse: ").append(getJourneyRunExecutionActivityMetricsResponse());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetJourneyRunExecutionActivityMetricsResult == false)
            return false;
        GetJourneyRunExecutionActivityMetricsResult other = (GetJourneyRunExecutionActivityMetricsResult) obj;
        if (other.getJourneyRunExecutionActivityMetricsResponse() == null ^ this.getJourneyRunExecutionActivityMetricsResponse() == null)
            return false;
        if (other.getJourneyRunExecutionActivityMetricsResponse() != null
                && other.getJourneyRunExecutionActivityMetricsResponse().equals(this.getJourneyRunExecutionActivityMetricsResponse()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getJourneyRunExecutionActivityMetricsResponse() == null) ? 0 : getJourneyRunExecutionActivityMetricsResponse().hashCode());
        return hashCode;
    }

    @Override
    public GetJourneyRunExecutionActivityMetricsResult clone() {
        try {
            return (GetJourneyRunExecutionActivityMetricsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
