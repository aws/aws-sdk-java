/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.auditmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/UpdateAssessmentStatus"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateAssessmentStatusResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the updated assessment returned by the <code>UpdateAssessmentStatus</code> API.
     * </p>
     */
    private Assessment assessment;

    /**
     * <p>
     * The name of the updated assessment returned by the <code>UpdateAssessmentStatus</code> API.
     * </p>
     * 
     * @param assessment
     *        The name of the updated assessment returned by the <code>UpdateAssessmentStatus</code> API.
     */

    public void setAssessment(Assessment assessment) {
        this.assessment = assessment;
    }

    /**
     * <p>
     * The name of the updated assessment returned by the <code>UpdateAssessmentStatus</code> API.
     * </p>
     * 
     * @return The name of the updated assessment returned by the <code>UpdateAssessmentStatus</code> API.
     */

    public Assessment getAssessment() {
        return this.assessment;
    }

    /**
     * <p>
     * The name of the updated assessment returned by the <code>UpdateAssessmentStatus</code> API.
     * </p>
     * 
     * @param assessment
     *        The name of the updated assessment returned by the <code>UpdateAssessmentStatus</code> API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAssessmentStatusResult withAssessment(Assessment assessment) {
        setAssessment(assessment);
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
        if (getAssessment() != null)
            sb.append("Assessment: ").append(getAssessment());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateAssessmentStatusResult == false)
            return false;
        UpdateAssessmentStatusResult other = (UpdateAssessmentStatusResult) obj;
        if (other.getAssessment() == null ^ this.getAssessment() == null)
            return false;
        if (other.getAssessment() != null && other.getAssessment().equals(this.getAssessment()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssessment() == null) ? 0 : getAssessment().hashCode());
        return hashCode;
    }

    @Override
    public UpdateAssessmentStatusResult clone() {
        try {
            return (UpdateAssessmentStatusResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
