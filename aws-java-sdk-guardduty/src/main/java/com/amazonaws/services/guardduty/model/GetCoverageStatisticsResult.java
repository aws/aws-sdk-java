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
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/GetCoverageStatistics" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetCoverageStatisticsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Represents the count aggregated by the <code>statusCode</code> and <code>resourceType</code>.
     * </p>
     */
    private CoverageStatistics coverageStatistics;

    /**
     * <p>
     * Represents the count aggregated by the <code>statusCode</code> and <code>resourceType</code>.
     * </p>
     * 
     * @param coverageStatistics
     *        Represents the count aggregated by the <code>statusCode</code> and <code>resourceType</code>.
     */

    public void setCoverageStatistics(CoverageStatistics coverageStatistics) {
        this.coverageStatistics = coverageStatistics;
    }

    /**
     * <p>
     * Represents the count aggregated by the <code>statusCode</code> and <code>resourceType</code>.
     * </p>
     * 
     * @return Represents the count aggregated by the <code>statusCode</code> and <code>resourceType</code>.
     */

    public CoverageStatistics getCoverageStatistics() {
        return this.coverageStatistics;
    }

    /**
     * <p>
     * Represents the count aggregated by the <code>statusCode</code> and <code>resourceType</code>.
     * </p>
     * 
     * @param coverageStatistics
     *        Represents the count aggregated by the <code>statusCode</code> and <code>resourceType</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCoverageStatisticsResult withCoverageStatistics(CoverageStatistics coverageStatistics) {
        setCoverageStatistics(coverageStatistics);
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
        if (getCoverageStatistics() != null)
            sb.append("CoverageStatistics: ").append(getCoverageStatistics());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetCoverageStatisticsResult == false)
            return false;
        GetCoverageStatisticsResult other = (GetCoverageStatisticsResult) obj;
        if (other.getCoverageStatistics() == null ^ this.getCoverageStatistics() == null)
            return false;
        if (other.getCoverageStatistics() != null && other.getCoverageStatistics().equals(this.getCoverageStatistics()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCoverageStatistics() == null) ? 0 : getCoverageStatistics().hashCode());
        return hashCode;
    }

    @Override
    public GetCoverageStatisticsResult clone() {
        try {
            return (GetCoverageStatisticsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
