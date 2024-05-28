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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/PutApplicationAssignmentConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutApplicationAssignmentConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the ARN of the application. For more information about ARNs, see <a
     * href="/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs) and Amazon Web Services
     * Service Namespaces</a> in the <i>Amazon Web Services General Reference</i>.
     * </p>
     */
    private String applicationArn;
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
     * Specifies the ARN of the application. For more information about ARNs, see <a
     * href="/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs) and Amazon Web Services
     * Service Namespaces</a> in the <i>Amazon Web Services General Reference</i>.
     * </p>
     * 
     * @param applicationArn
     *        Specifies the ARN of the application. For more information about ARNs, see <a
     *        href="/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs) and Amazon Web
     *        Services Service Namespaces</a> in the <i>Amazon Web Services General Reference</i>.
     */

    public void setApplicationArn(String applicationArn) {
        this.applicationArn = applicationArn;
    }

    /**
     * <p>
     * Specifies the ARN of the application. For more information about ARNs, see <a
     * href="/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs) and Amazon Web Services
     * Service Namespaces</a> in the <i>Amazon Web Services General Reference</i>.
     * </p>
     * 
     * @return Specifies the ARN of the application. For more information about ARNs, see <a
     *         href="/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs) and Amazon Web
     *         Services Service Namespaces</a> in the <i>Amazon Web Services General Reference</i>.
     */

    public String getApplicationArn() {
        return this.applicationArn;
    }

    /**
     * <p>
     * Specifies the ARN of the application. For more information about ARNs, see <a
     * href="/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs) and Amazon Web Services
     * Service Namespaces</a> in the <i>Amazon Web Services General Reference</i>.
     * </p>
     * 
     * @param applicationArn
     *        Specifies the ARN of the application. For more information about ARNs, see <a
     *        href="/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs) and Amazon Web
     *        Services Service Namespaces</a> in the <i>Amazon Web Services General Reference</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutApplicationAssignmentConfigurationRequest withApplicationArn(String applicationArn) {
        setApplicationArn(applicationArn);
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

    public PutApplicationAssignmentConfigurationRequest withAssignmentRequired(Boolean assignmentRequired) {
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
        if (getApplicationArn() != null)
            sb.append("ApplicationArn: ").append(getApplicationArn()).append(",");
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

        if (obj instanceof PutApplicationAssignmentConfigurationRequest == false)
            return false;
        PutApplicationAssignmentConfigurationRequest other = (PutApplicationAssignmentConfigurationRequest) obj;
        if (other.getApplicationArn() == null ^ this.getApplicationArn() == null)
            return false;
        if (other.getApplicationArn() != null && other.getApplicationArn().equals(this.getApplicationArn()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getApplicationArn() == null) ? 0 : getApplicationArn().hashCode());
        hashCode = prime * hashCode + ((getAssignmentRequired() == null) ? 0 : getAssignmentRequired().hashCode());
        return hashCode;
    }

    @Override
    public PutApplicationAssignmentConfigurationRequest clone() {
        return (PutApplicationAssignmentConfigurationRequest) super.clone();
    }

}
