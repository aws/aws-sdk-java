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
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The details of an issue with your DB instances, DB clusters, and DB parameter groups.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/IssueDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IssueDetails implements Serializable, Cloneable {

    /**
     * <p>
     * A detailed description of the issue when the recommendation category is <code>performance</code>.
     * </p>
     */
    private PerformanceIssueDetails performanceIssueDetails;

    /**
     * <p>
     * A detailed description of the issue when the recommendation category is <code>performance</code>.
     * </p>
     * 
     * @param performanceIssueDetails
     *        A detailed description of the issue when the recommendation category is <code>performance</code>.
     */

    public void setPerformanceIssueDetails(PerformanceIssueDetails performanceIssueDetails) {
        this.performanceIssueDetails = performanceIssueDetails;
    }

    /**
     * <p>
     * A detailed description of the issue when the recommendation category is <code>performance</code>.
     * </p>
     * 
     * @return A detailed description of the issue when the recommendation category is <code>performance</code>.
     */

    public PerformanceIssueDetails getPerformanceIssueDetails() {
        return this.performanceIssueDetails;
    }

    /**
     * <p>
     * A detailed description of the issue when the recommendation category is <code>performance</code>.
     * </p>
     * 
     * @param performanceIssueDetails
     *        A detailed description of the issue when the recommendation category is <code>performance</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IssueDetails withPerformanceIssueDetails(PerformanceIssueDetails performanceIssueDetails) {
        setPerformanceIssueDetails(performanceIssueDetails);
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
        if (getPerformanceIssueDetails() != null)
            sb.append("PerformanceIssueDetails: ").append(getPerformanceIssueDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IssueDetails == false)
            return false;
        IssueDetails other = (IssueDetails) obj;
        if (other.getPerformanceIssueDetails() == null ^ this.getPerformanceIssueDetails() == null)
            return false;
        if (other.getPerformanceIssueDetails() != null && other.getPerformanceIssueDetails().equals(this.getPerformanceIssueDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPerformanceIssueDetails() == null) ? 0 : getPerformanceIssueDetails().hashCode());
        return hashCode;
    }

    @Override
    public IssueDetails clone() {
        try {
            return (IssueDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
