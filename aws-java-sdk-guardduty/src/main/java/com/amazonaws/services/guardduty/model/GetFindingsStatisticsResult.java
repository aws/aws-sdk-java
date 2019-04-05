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
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/GetFindingsStatistics" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetFindingsStatisticsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /** Finding statistics object. */
    private FindingStatistics findingStatistics;

    /**
     * Finding statistics object.
     * 
     * @param findingStatistics
     *        Finding statistics object.
     */

    public void setFindingStatistics(FindingStatistics findingStatistics) {
        this.findingStatistics = findingStatistics;
    }

    /**
     * Finding statistics object.
     * 
     * @return Finding statistics object.
     */

    public FindingStatistics getFindingStatistics() {
        return this.findingStatistics;
    }

    /**
     * Finding statistics object.
     * 
     * @param findingStatistics
     *        Finding statistics object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFindingsStatisticsResult withFindingStatistics(FindingStatistics findingStatistics) {
        setFindingStatistics(findingStatistics);
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
        if (getFindingStatistics() != null)
            sb.append("FindingStatistics: ").append(getFindingStatistics());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetFindingsStatisticsResult == false)
            return false;
        GetFindingsStatisticsResult other = (GetFindingsStatisticsResult) obj;
        if (other.getFindingStatistics() == null ^ this.getFindingStatistics() == null)
            return false;
        if (other.getFindingStatistics() != null && other.getFindingStatistics().equals(this.getFindingStatistics()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFindingStatistics() == null) ? 0 : getFindingStatistics().hashCode());
        return hashCode;
    }

    @Override
    public GetFindingsStatisticsResult clone() {
        try {
            return (GetFindingsStatisticsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
