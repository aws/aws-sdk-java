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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/GetAssessment" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetAssessmentResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private Assessment assessment;

    private Role userRole;

    /**
     * @param assessment
     */

    public void setAssessment(Assessment assessment) {
        this.assessment = assessment;
    }

    /**
     * @return
     */

    public Assessment getAssessment() {
        return this.assessment;
    }

    /**
     * @param assessment
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAssessmentResult withAssessment(Assessment assessment) {
        setAssessment(assessment);
        return this;
    }

    /**
     * @param userRole
     */

    public void setUserRole(Role userRole) {
        this.userRole = userRole;
    }

    /**
     * @return
     */

    public Role getUserRole() {
        return this.userRole;
    }

    /**
     * @param userRole
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAssessmentResult withUserRole(Role userRole) {
        setUserRole(userRole);
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
            sb.append("Assessment: ").append(getAssessment()).append(",");
        if (getUserRole() != null)
            sb.append("UserRole: ").append(getUserRole());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAssessmentResult == false)
            return false;
        GetAssessmentResult other = (GetAssessmentResult) obj;
        if (other.getAssessment() == null ^ this.getAssessment() == null)
            return false;
        if (other.getAssessment() != null && other.getAssessment().equals(this.getAssessment()) == false)
            return false;
        if (other.getUserRole() == null ^ this.getUserRole() == null)
            return false;
        if (other.getUserRole() != null && other.getUserRole().equals(this.getUserRole()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssessment() == null) ? 0 : getAssessment().hashCode());
        hashCode = prime * hashCode + ((getUserRole() == null) ? 0 : getUserRole().hashCode());
        return hashCode;
    }

    @Override
    public GetAssessmentResult clone() {
        try {
            return (GetAssessmentResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
