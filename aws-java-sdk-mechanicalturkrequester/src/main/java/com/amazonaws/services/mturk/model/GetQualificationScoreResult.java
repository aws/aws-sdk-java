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
package com.amazonaws.services.mturk.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mturk-requester-2017-01-17/GetQualificationScore"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetQualificationScoreResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Qualification data structure of the Qualification assigned to a user, including the Qualification type and
     * the value (score).
     * </p>
     */
    private Qualification qualification;

    /**
     * <p>
     * The Qualification data structure of the Qualification assigned to a user, including the Qualification type and
     * the value (score).
     * </p>
     * 
     * @param qualification
     *        The Qualification data structure of the Qualification assigned to a user, including the Qualification type
     *        and the value (score).
     */

    public void setQualification(Qualification qualification) {
        this.qualification = qualification;
    }

    /**
     * <p>
     * The Qualification data structure of the Qualification assigned to a user, including the Qualification type and
     * the value (score).
     * </p>
     * 
     * @return The Qualification data structure of the Qualification assigned to a user, including the Qualification
     *         type and the value (score).
     */

    public Qualification getQualification() {
        return this.qualification;
    }

    /**
     * <p>
     * The Qualification data structure of the Qualification assigned to a user, including the Qualification type and
     * the value (score).
     * </p>
     * 
     * @param qualification
     *        The Qualification data structure of the Qualification assigned to a user, including the Qualification type
     *        and the value (score).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetQualificationScoreResult withQualification(Qualification qualification) {
        setQualification(qualification);
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
        if (getQualification() != null)
            sb.append("Qualification: ").append(getQualification());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetQualificationScoreResult == false)
            return false;
        GetQualificationScoreResult other = (GetQualificationScoreResult) obj;
        if (other.getQualification() == null ^ this.getQualification() == null)
            return false;
        if (other.getQualification() != null && other.getQualification().equals(this.getQualification()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getQualification() == null) ? 0 : getQualification().hashCode());
        return hashCode;
    }

    @Override
    public GetQualificationScoreResult clone() {
        try {
            return (GetQualificationScoreResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
