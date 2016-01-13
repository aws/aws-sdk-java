/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.inspector.model;

import java.io.Serializable;

/**
 * 
 */
public class RunAssessmentResult implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN specifying the run of the assessment.
     * </p>
     */
    private String runArn;

    /**
     * <p>
     * The ARN specifying the run of the assessment.
     * </p>
     * 
     * @param runArn
     *        The ARN specifying the run of the assessment.
     */
    public void setRunArn(String runArn) {
        this.runArn = runArn;
    }

    /**
     * <p>
     * The ARN specifying the run of the assessment.
     * </p>
     * 
     * @return The ARN specifying the run of the assessment.
     */
    public String getRunArn() {
        return this.runArn;
    }

    /**
     * <p>
     * The ARN specifying the run of the assessment.
     * </p>
     * 
     * @param runArn
     *        The ARN specifying the run of the assessment.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public RunAssessmentResult withRunArn(String runArn) {
        setRunArn(runArn);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getRunArn() != null)
            sb.append("RunArn: " + getRunArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RunAssessmentResult == false)
            return false;
        RunAssessmentResult other = (RunAssessmentResult) obj;
        if (other.getRunArn() == null ^ this.getRunArn() == null)
            return false;
        if (other.getRunArn() != null
                && other.getRunArn().equals(this.getRunArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getRunArn() == null) ? 0 : getRunArn().hashCode());
        return hashCode;
    }

    @Override
    public RunAssessmentResult clone() {
        try {
            return (RunAssessmentResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}