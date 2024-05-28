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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetJourneyRuns" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetJourneyRunsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private JourneyRunsResponse journeyRunsResponse;

    /**
     * @param journeyRunsResponse
     */

    public void setJourneyRunsResponse(JourneyRunsResponse journeyRunsResponse) {
        this.journeyRunsResponse = journeyRunsResponse;
    }

    /**
     * @return
     */

    public JourneyRunsResponse getJourneyRunsResponse() {
        return this.journeyRunsResponse;
    }

    /**
     * @param journeyRunsResponse
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetJourneyRunsResult withJourneyRunsResponse(JourneyRunsResponse journeyRunsResponse) {
        setJourneyRunsResponse(journeyRunsResponse);
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
        if (getJourneyRunsResponse() != null)
            sb.append("JourneyRunsResponse: ").append(getJourneyRunsResponse());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetJourneyRunsResult == false)
            return false;
        GetJourneyRunsResult other = (GetJourneyRunsResult) obj;
        if (other.getJourneyRunsResponse() == null ^ this.getJourneyRunsResponse() == null)
            return false;
        if (other.getJourneyRunsResponse() != null && other.getJourneyRunsResponse().equals(this.getJourneyRunsResponse()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJourneyRunsResponse() == null) ? 0 : getJourneyRunsResponse().hashCode());
        return hashCode;
    }

    @Override
    public GetJourneyRunsResult clone() {
        try {
            return (GetJourneyRunsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
