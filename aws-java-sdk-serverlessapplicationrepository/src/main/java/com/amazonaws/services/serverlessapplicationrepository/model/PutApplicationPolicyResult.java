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
package com.amazonaws.services.serverlessapplicationrepository.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/serverlessrepo-2017-09-08/PutApplicationPolicy"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutApplicationPolicyResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of policy statements applied to the application.
     * </p>
     */
    private java.util.List<ApplicationPolicyStatement> statements;

    /**
     * <p>
     * An array of policy statements applied to the application.
     * </p>
     * 
     * @return An array of policy statements applied to the application.
     */

    public java.util.List<ApplicationPolicyStatement> getStatements() {
        return statements;
    }

    /**
     * <p>
     * An array of policy statements applied to the application.
     * </p>
     * 
     * @param statements
     *        An array of policy statements applied to the application.
     */

    public void setStatements(java.util.Collection<ApplicationPolicyStatement> statements) {
        if (statements == null) {
            this.statements = null;
            return;
        }

        this.statements = new java.util.ArrayList<ApplicationPolicyStatement>(statements);
    }

    /**
     * <p>
     * An array of policy statements applied to the application.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStatements(java.util.Collection)} or {@link #withStatements(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param statements
     *        An array of policy statements applied to the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutApplicationPolicyResult withStatements(ApplicationPolicyStatement... statements) {
        if (this.statements == null) {
            setStatements(new java.util.ArrayList<ApplicationPolicyStatement>(statements.length));
        }
        for (ApplicationPolicyStatement ele : statements) {
            this.statements.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of policy statements applied to the application.
     * </p>
     * 
     * @param statements
     *        An array of policy statements applied to the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutApplicationPolicyResult withStatements(java.util.Collection<ApplicationPolicyStatement> statements) {
        setStatements(statements);
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
        if (getStatements() != null)
            sb.append("Statements: ").append(getStatements());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutApplicationPolicyResult == false)
            return false;
        PutApplicationPolicyResult other = (PutApplicationPolicyResult) obj;
        if (other.getStatements() == null ^ this.getStatements() == null)
            return false;
        if (other.getStatements() != null && other.getStatements().equals(this.getStatements()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatements() == null) ? 0 : getStatements().hashCode());
        return hashCode;
    }

    @Override
    public PutApplicationPolicyResult clone() {
        try {
            return (PutApplicationPolicyResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
