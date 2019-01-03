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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TestAuthorizationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The authentication results.
     * </p>
     */
    private java.util.List<AuthResult> authResults;

    /**
     * <p>
     * The authentication results.
     * </p>
     * 
     * @return The authentication results.
     */

    public java.util.List<AuthResult> getAuthResults() {
        return authResults;
    }

    /**
     * <p>
     * The authentication results.
     * </p>
     * 
     * @param authResults
     *        The authentication results.
     */

    public void setAuthResults(java.util.Collection<AuthResult> authResults) {
        if (authResults == null) {
            this.authResults = null;
            return;
        }

        this.authResults = new java.util.ArrayList<AuthResult>(authResults);
    }

    /**
     * <p>
     * The authentication results.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAuthResults(java.util.Collection)} or {@link #withAuthResults(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param authResults
     *        The authentication results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestAuthorizationResult withAuthResults(AuthResult... authResults) {
        if (this.authResults == null) {
            setAuthResults(new java.util.ArrayList<AuthResult>(authResults.length));
        }
        for (AuthResult ele : authResults) {
            this.authResults.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The authentication results.
     * </p>
     * 
     * @param authResults
     *        The authentication results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestAuthorizationResult withAuthResults(java.util.Collection<AuthResult> authResults) {
        setAuthResults(authResults);
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
        if (getAuthResults() != null)
            sb.append("AuthResults: ").append(getAuthResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TestAuthorizationResult == false)
            return false;
        TestAuthorizationResult other = (TestAuthorizationResult) obj;
        if (other.getAuthResults() == null ^ this.getAuthResults() == null)
            return false;
        if (other.getAuthResults() != null && other.getAuthResults().equals(this.getAuthResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAuthResults() == null) ? 0 : getAuthResults().hashCode());
        return hashCode;
    }

    @Override
    public TestAuthorizationResult clone() {
        try {
            return (TestAuthorizationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
