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
package com.amazonaws.services.finspace.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/UpdateEnvironment" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateEnvironmentResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Returns the FinSpace environment object.
     * </p>
     */
    private Environment environment;

    /**
     * <p>
     * Returns the FinSpace environment object.
     * </p>
     * 
     * @param environment
     *        Returns the FinSpace environment object.
     */

    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }

    /**
     * <p>
     * Returns the FinSpace environment object.
     * </p>
     * 
     * @return Returns the FinSpace environment object.
     */

    public Environment getEnvironment() {
        return this.environment;
    }

    /**
     * <p>
     * Returns the FinSpace environment object.
     * </p>
     * 
     * @param environment
     *        Returns the FinSpace environment object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEnvironmentResult withEnvironment(Environment environment) {
        setEnvironment(environment);
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
        if (getEnvironment() != null)
            sb.append("Environment: ").append(getEnvironment());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateEnvironmentResult == false)
            return false;
        UpdateEnvironmentResult other = (UpdateEnvironmentResult) obj;
        if (other.getEnvironment() == null ^ this.getEnvironment() == null)
            return false;
        if (other.getEnvironment() != null && other.getEnvironment().equals(this.getEnvironment()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnvironment() == null) ? 0 : getEnvironment().hashCode());
        return hashCode;
    }

    @Override
    public UpdateEnvironmentResult clone() {
        try {
            return (UpdateEnvironmentResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
