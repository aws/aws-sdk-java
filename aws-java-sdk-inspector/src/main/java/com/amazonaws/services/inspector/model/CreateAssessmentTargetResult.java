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
package com.amazonaws.services.inspector.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector-2016-02-16/CreateAssessmentTarget" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateAssessmentTargetResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN that specifies the assessment target that is created.
     * </p>
     */
    private String assessmentTargetArn;

    /**
     * <p>
     * The ARN that specifies the assessment target that is created.
     * </p>
     * 
     * @param assessmentTargetArn
     *        The ARN that specifies the assessment target that is created.
     */

    public void setAssessmentTargetArn(String assessmentTargetArn) {
        this.assessmentTargetArn = assessmentTargetArn;
    }

    /**
     * <p>
     * The ARN that specifies the assessment target that is created.
     * </p>
     * 
     * @return The ARN that specifies the assessment target that is created.
     */

    public String getAssessmentTargetArn() {
        return this.assessmentTargetArn;
    }

    /**
     * <p>
     * The ARN that specifies the assessment target that is created.
     * </p>
     * 
     * @param assessmentTargetArn
     *        The ARN that specifies the assessment target that is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAssessmentTargetResult withAssessmentTargetArn(String assessmentTargetArn) {
        setAssessmentTargetArn(assessmentTargetArn);
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
        if (getAssessmentTargetArn() != null)
            sb.append("AssessmentTargetArn: ").append(getAssessmentTargetArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateAssessmentTargetResult == false)
            return false;
        CreateAssessmentTargetResult other = (CreateAssessmentTargetResult) obj;
        if (other.getAssessmentTargetArn() == null ^ this.getAssessmentTargetArn() == null)
            return false;
        if (other.getAssessmentTargetArn() != null && other.getAssessmentTargetArn().equals(this.getAssessmentTargetArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssessmentTargetArn() == null) ? 0 : getAssessmentTargetArn().hashCode());
        return hashCode;
    }

    @Override
    public CreateAssessmentTargetResult clone() {
        try {
            return (CreateAssessmentTargetResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
