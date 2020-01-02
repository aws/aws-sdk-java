/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetJourneyDateRangeKpi" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetJourneyDateRangeKpiResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private JourneyDateRangeKpiResponse journeyDateRangeKpiResponse;

    /**
     * @param journeyDateRangeKpiResponse
     */

    public void setJourneyDateRangeKpiResponse(JourneyDateRangeKpiResponse journeyDateRangeKpiResponse) {
        this.journeyDateRangeKpiResponse = journeyDateRangeKpiResponse;
    }

    /**
     * @return
     */

    public JourneyDateRangeKpiResponse getJourneyDateRangeKpiResponse() {
        return this.journeyDateRangeKpiResponse;
    }

    /**
     * @param journeyDateRangeKpiResponse
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetJourneyDateRangeKpiResult withJourneyDateRangeKpiResponse(JourneyDateRangeKpiResponse journeyDateRangeKpiResponse) {
        setJourneyDateRangeKpiResponse(journeyDateRangeKpiResponse);
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
        if (getJourneyDateRangeKpiResponse() != null)
            sb.append("JourneyDateRangeKpiResponse: ").append(getJourneyDateRangeKpiResponse());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetJourneyDateRangeKpiResult == false)
            return false;
        GetJourneyDateRangeKpiResult other = (GetJourneyDateRangeKpiResult) obj;
        if (other.getJourneyDateRangeKpiResponse() == null ^ this.getJourneyDateRangeKpiResponse() == null)
            return false;
        if (other.getJourneyDateRangeKpiResponse() != null && other.getJourneyDateRangeKpiResponse().equals(this.getJourneyDateRangeKpiResponse()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJourneyDateRangeKpiResponse() == null) ? 0 : getJourneyDateRangeKpiResponse().hashCode());
        return hashCode;
    }

    @Override
    public GetJourneyDateRangeKpiResult clone() {
        try {
            return (GetJourneyDateRangeKpiResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
