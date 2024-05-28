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
package com.amazonaws.services.ssoadmin.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/GetApplicationAssignmentConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetApplicationAssignmentConfigurationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * If <code>AssignmentsRequired</code> is <code>true</code> (default value), users don’t have access to the
     * application unless an assignment is created using the <a
     * href="https://docs.aws.amazon.com/singlesignon/latest/APIReference/API_CreateApplicationAssignment.html"
     * >CreateApplicationAssignment API</a>. If <code>false</code>, all users have access to the application.
     * </p>
     */
    private Boolean assignmentRequired;

    /**
     * <p>
     * If <code>AssignmentsRequired</code> is <code>true</code> (default value), users don’t have access to the
     * application unless an assignment is created using the <a
     * href="https://docs.aws.amazon.com/singlesignon/latest/APIReference/API_CreateApplicationAssignment.html"
     * >CreateApplicationAssignment API</a>. If <code>false</code>, all users have access to the application.
     * </p>
     * 
     * @param assignmentRequired
     *        If <code>AssignmentsRequired</code> is <code>true</code> (default value), users don’t have access to the
     *        application unless an assignment is created using the <a
     *        href="https://docs.aws.amazon.com/singlesignon/latest/APIReference/API_CreateApplicationAssignment.html"
     *        >CreateApplicationAssignment API</a>. If <code>false</code>, all users have access to the application.
     */

    public void setAssignmentRequired(Boolean assignmentRequired) {
        this.assignmentRequired = assignmentRequired;
    }

    /**
     * <p>
     * If <code>AssignmentsRequired</code> is <code>true</code> (default value), users don’t have access to the
     * application unless an assignment is created using the <a
     * href="https://docs.aws.amazon.com/singlesignon/latest/APIReference/API_CreateApplicationAssignment.html"
     * >CreateApplicationAssignment API</a>. If <code>false</code>, all users have access to the application.
     * </p>
     * 
     * @return If <code>AssignmentsRequired</code> is <code>true</code> (default value), users don’t have access to the
     *         application unless an assignment is created using the <a href=
     *         "https://docs.aws.amazon.com/singlesignon/latest/APIReference/API_CreateApplicationAssignment.html"
     *         >CreateApplicationAssignment API</a>. If <code>false</code>, all users have access to the application.
     */

    public Boolean getAssignmentRequired() {
        return this.assignmentRequired;
    }

    /**
     * <p>
     * If <code>AssignmentsRequired</code> is <code>true</code> (default value), users don’t have access to the
     * application unless an assignment is created using the <a
     * href="https://docs.aws.amazon.com/singlesignon/latest/APIReference/API_CreateApplicationAssignment.html"
     * >CreateApplicationAssignment API</a>. If <code>false</code>, all users have access to the application.
     * </p>
     * 
     * @param assignmentRequired
     *        If <code>AssignmentsRequired</code> is <code>true</code> (default value), users don’t have access to the
     *        application unless an assignment is created using the <a
     *        href="https://docs.aws.amazon.com/singlesignon/latest/APIReference/API_CreateApplicationAssignment.html"
     *        >CreateApplicationAssignment API</a>. If <code>false</code>, all users have access to the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetApplicationAssignmentConfigurationResult withAssignmentRequired(Boolean assignmentRequired) {
        setAssignmentRequired(assignmentRequired);
        return this;
    }

    /**
     * <p>
     * If <code>AssignmentsRequired</code> is <code>true</code> (default value), users don’t have access to the
     * application unless an assignment is created using the <a
     * href="https://docs.aws.amazon.com/singlesignon/latest/APIReference/API_CreateApplicationAssignment.html"
     * >CreateApplicationAssignment API</a>. If <code>false</code>, all users have access to the application.
     * </p>
     * 
     * @return If <code>AssignmentsRequired</code> is <code>true</code> (default value), users don’t have access to the
     *         application unless an assignment is created using the <a href=
     *         "https://docs.aws.amazon.com/singlesignon/latest/APIReference/API_CreateApplicationAssignment.html"
     *         >CreateApplicationAssignment API</a>. If <code>false</code>, all users have access to the application.
     */

    public Boolean isAssignmentRequired() {
        return this.assignmentRequired;
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
        if (getAssignmentRequired() != null)
            sb.append("AssignmentRequired: ").append(getAssignmentRequired());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetApplicationAssignmentConfigurationResult == false)
            return false;
        GetApplicationAssignmentConfigurationResult other = (GetApplicationAssignmentConfigurationResult) obj;
        if (other.getAssignmentRequired() == null ^ this.getAssignmentRequired() == null)
            return false;
        if (other.getAssignmentRequired() != null && other.getAssignmentRequired().equals(this.getAssignmentRequired()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssignmentRequired() == null) ? 0 : getAssignmentRequired().hashCode());
        return hashCode;
    }

    @Override
    public GetApplicationAssignmentConfigurationResult clone() {
        try {
            return (GetApplicationAssignmentConfigurationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
