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
package com.amazonaws.services.macie2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/GetSensitiveDataOccurrencesAvailability"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSensitiveDataOccurrencesAvailabilityRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier for the finding.
     * </p>
     */
    private String findingId;

    /**
     * <p>
     * The unique identifier for the finding.
     * </p>
     * 
     * @param findingId
     *        The unique identifier for the finding.
     */

    public void setFindingId(String findingId) {
        this.findingId = findingId;
    }

    /**
     * <p>
     * The unique identifier for the finding.
     * </p>
     * 
     * @return The unique identifier for the finding.
     */

    public String getFindingId() {
        return this.findingId;
    }

    /**
     * <p>
     * The unique identifier for the finding.
     * </p>
     * 
     * @param findingId
     *        The unique identifier for the finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSensitiveDataOccurrencesAvailabilityRequest withFindingId(String findingId) {
        setFindingId(findingId);
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
        if (getFindingId() != null)
            sb.append("FindingId: ").append(getFindingId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSensitiveDataOccurrencesAvailabilityRequest == false)
            return false;
        GetSensitiveDataOccurrencesAvailabilityRequest other = (GetSensitiveDataOccurrencesAvailabilityRequest) obj;
        if (other.getFindingId() == null ^ this.getFindingId() == null)
            return false;
        if (other.getFindingId() != null && other.getFindingId().equals(this.getFindingId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFindingId() == null) ? 0 : getFindingId().hashCode());
        return hashCode;
    }

    @Override
    public GetSensitiveDataOccurrencesAvailabilityRequest clone() {
        return (GetSensitiveDataOccurrencesAvailabilityRequest) super.clone();
    }

}
