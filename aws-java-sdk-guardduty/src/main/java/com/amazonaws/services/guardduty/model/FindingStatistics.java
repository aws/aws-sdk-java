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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Finding statistics object.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/FindingStatistics" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FindingStatistics implements Serializable, Cloneable, StructuredPojo {

    /** Represents a map of severity to count statistic for a set of findings */
    private java.util.Map<String, Integer> countBySeverity;

    /**
     * Represents a map of severity to count statistic for a set of findings
     * 
     * @return Represents a map of severity to count statistic for a set of findings
     */

    public java.util.Map<String, Integer> getCountBySeverity() {
        return countBySeverity;
    }

    /**
     * Represents a map of severity to count statistic for a set of findings
     * 
     * @param countBySeverity
     *        Represents a map of severity to count statistic for a set of findings
     */

    public void setCountBySeverity(java.util.Map<String, Integer> countBySeverity) {
        this.countBySeverity = countBySeverity;
    }

    /**
     * Represents a map of severity to count statistic for a set of findings
     * 
     * @param countBySeverity
     *        Represents a map of severity to count statistic for a set of findings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FindingStatistics withCountBySeverity(java.util.Map<String, Integer> countBySeverity) {
        setCountBySeverity(countBySeverity);
        return this;
    }

    public FindingStatistics addCountBySeverityEntry(String key, Integer value) {
        if (null == this.countBySeverity) {
            this.countBySeverity = new java.util.HashMap<String, Integer>();
        }
        if (this.countBySeverity.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.countBySeverity.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into CountBySeverity.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FindingStatistics clearCountBySeverityEntries() {
        this.countBySeverity = null;
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
        if (getCountBySeverity() != null)
            sb.append("CountBySeverity: ").append(getCountBySeverity());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FindingStatistics == false)
            return false;
        FindingStatistics other = (FindingStatistics) obj;
        if (other.getCountBySeverity() == null ^ this.getCountBySeverity() == null)
            return false;
        if (other.getCountBySeverity() != null && other.getCountBySeverity().equals(this.getCountBySeverity()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCountBySeverity() == null) ? 0 : getCountBySeverity().hashCode());
        return hashCode;
    }

    @Override
    public FindingStatistics clone() {
        try {
            return (FindingStatistics) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.guardduty.model.transform.FindingStatisticsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
