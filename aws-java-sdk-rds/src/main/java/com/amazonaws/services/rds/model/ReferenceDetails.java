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
 * The reference details of a metric.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/ReferenceDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReferenceDetails implements Serializable, Cloneable {

    /**
     * <p>
     * The metric reference details when the reference is a scalar.
     * </p>
     */
    private ScalarReferenceDetails scalarReferenceDetails;

    /**
     * <p>
     * The metric reference details when the reference is a scalar.
     * </p>
     * 
     * @param scalarReferenceDetails
     *        The metric reference details when the reference is a scalar.
     */

    public void setScalarReferenceDetails(ScalarReferenceDetails scalarReferenceDetails) {
        this.scalarReferenceDetails = scalarReferenceDetails;
    }

    /**
     * <p>
     * The metric reference details when the reference is a scalar.
     * </p>
     * 
     * @return The metric reference details when the reference is a scalar.
     */

    public ScalarReferenceDetails getScalarReferenceDetails() {
        return this.scalarReferenceDetails;
    }

    /**
     * <p>
     * The metric reference details when the reference is a scalar.
     * </p>
     * 
     * @param scalarReferenceDetails
     *        The metric reference details when the reference is a scalar.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReferenceDetails withScalarReferenceDetails(ScalarReferenceDetails scalarReferenceDetails) {
        setScalarReferenceDetails(scalarReferenceDetails);
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
        if (getScalarReferenceDetails() != null)
            sb.append("ScalarReferenceDetails: ").append(getScalarReferenceDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReferenceDetails == false)
            return false;
        ReferenceDetails other = (ReferenceDetails) obj;
        if (other.getScalarReferenceDetails() == null ^ this.getScalarReferenceDetails() == null)
            return false;
        if (other.getScalarReferenceDetails() != null && other.getScalarReferenceDetails().equals(this.getScalarReferenceDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getScalarReferenceDetails() == null) ? 0 : getScalarReferenceDetails().hashCode());
        return hashCode;
    }

    @Override
    public ReferenceDetails clone() {
        try {
            return (ReferenceDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
