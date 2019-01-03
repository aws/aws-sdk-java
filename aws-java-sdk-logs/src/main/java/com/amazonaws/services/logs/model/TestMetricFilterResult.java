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
package com.amazonaws.services.logs.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/TestMetricFilter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TestMetricFilterResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The matched events.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<MetricFilterMatchRecord> matches;

    /**
     * <p>
     * The matched events.
     * </p>
     * 
     * @return The matched events.
     */

    public java.util.List<MetricFilterMatchRecord> getMatches() {
        if (matches == null) {
            matches = new com.amazonaws.internal.SdkInternalList<MetricFilterMatchRecord>();
        }
        return matches;
    }

    /**
     * <p>
     * The matched events.
     * </p>
     * 
     * @param matches
     *        The matched events.
     */

    public void setMatches(java.util.Collection<MetricFilterMatchRecord> matches) {
        if (matches == null) {
            this.matches = null;
            return;
        }

        this.matches = new com.amazonaws.internal.SdkInternalList<MetricFilterMatchRecord>(matches);
    }

    /**
     * <p>
     * The matched events.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMatches(java.util.Collection)} or {@link #withMatches(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param matches
     *        The matched events.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestMetricFilterResult withMatches(MetricFilterMatchRecord... matches) {
        if (this.matches == null) {
            setMatches(new com.amazonaws.internal.SdkInternalList<MetricFilterMatchRecord>(matches.length));
        }
        for (MetricFilterMatchRecord ele : matches) {
            this.matches.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The matched events.
     * </p>
     * 
     * @param matches
     *        The matched events.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestMetricFilterResult withMatches(java.util.Collection<MetricFilterMatchRecord> matches) {
        setMatches(matches);
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
        if (getMatches() != null)
            sb.append("Matches: ").append(getMatches());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TestMetricFilterResult == false)
            return false;
        TestMetricFilterResult other = (TestMetricFilterResult) obj;
        if (other.getMatches() == null ^ this.getMatches() == null)
            return false;
        if (other.getMatches() != null && other.getMatches().equals(this.getMatches()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMatches() == null) ? 0 : getMatches().hashCode());
        return hashCode;
    }

    @Override
    public TestMetricFilterResult clone() {
        try {
            return (TestMetricFilterResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
