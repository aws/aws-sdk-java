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
 * Represents the criteria used for querying findings.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/FindingCriteria" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FindingCriteria implements Serializable, Cloneable, StructuredPojo {

    /** Represents a map of finding properties that match specified conditions and values when querying findings. */
    private java.util.Map<String, Condition> criterion;

    /**
     * Represents a map of finding properties that match specified conditions and values when querying findings.
     * 
     * @return Represents a map of finding properties that match specified conditions and values when querying findings.
     */

    public java.util.Map<String, Condition> getCriterion() {
        return criterion;
    }

    /**
     * Represents a map of finding properties that match specified conditions and values when querying findings.
     * 
     * @param criterion
     *        Represents a map of finding properties that match specified conditions and values when querying findings.
     */

    public void setCriterion(java.util.Map<String, Condition> criterion) {
        this.criterion = criterion;
    }

    /**
     * Represents a map of finding properties that match specified conditions and values when querying findings.
     * 
     * @param criterion
     *        Represents a map of finding properties that match specified conditions and values when querying findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FindingCriteria withCriterion(java.util.Map<String, Condition> criterion) {
        setCriterion(criterion);
        return this;
    }

    public FindingCriteria addCriterionEntry(String key, Condition value) {
        if (null == this.criterion) {
            this.criterion = new java.util.HashMap<String, Condition>();
        }
        if (this.criterion.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.criterion.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Criterion.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FindingCriteria clearCriterionEntries() {
        this.criterion = null;
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
        if (getCriterion() != null)
            sb.append("Criterion: ").append(getCriterion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FindingCriteria == false)
            return false;
        FindingCriteria other = (FindingCriteria) obj;
        if (other.getCriterion() == null ^ this.getCriterion() == null)
            return false;
        if (other.getCriterion() != null && other.getCriterion().equals(this.getCriterion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCriterion() == null) ? 0 : getCriterion().hashCode());
        return hashCode;
    }

    @Override
    public FindingCriteria clone() {
        try {
            return (FindingCriteria) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.guardduty.model.transform.FindingCriteriaMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
