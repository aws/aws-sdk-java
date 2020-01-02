/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.amplify.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Result structure for create backend environment.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/CreateBackendEnvironment" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateBackendEnvironmentResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Backend environment structure for an amplify App.
     * </p>
     */
    private BackendEnvironment backendEnvironment;

    /**
     * <p>
     * Backend environment structure for an amplify App.
     * </p>
     * 
     * @param backendEnvironment
     *        Backend environment structure for an amplify App.
     */

    public void setBackendEnvironment(BackendEnvironment backendEnvironment) {
        this.backendEnvironment = backendEnvironment;
    }

    /**
     * <p>
     * Backend environment structure for an amplify App.
     * </p>
     * 
     * @return Backend environment structure for an amplify App.
     */

    public BackendEnvironment getBackendEnvironment() {
        return this.backendEnvironment;
    }

    /**
     * <p>
     * Backend environment structure for an amplify App.
     * </p>
     * 
     * @param backendEnvironment
     *        Backend environment structure for an amplify App.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBackendEnvironmentResult withBackendEnvironment(BackendEnvironment backendEnvironment) {
        setBackendEnvironment(backendEnvironment);
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
        if (getBackendEnvironment() != null)
            sb.append("BackendEnvironment: ").append(getBackendEnvironment());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateBackendEnvironmentResult == false)
            return false;
        CreateBackendEnvironmentResult other = (CreateBackendEnvironmentResult) obj;
        if (other.getBackendEnvironment() == null ^ this.getBackendEnvironment() == null)
            return false;
        if (other.getBackendEnvironment() != null && other.getBackendEnvironment().equals(this.getBackendEnvironment()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBackendEnvironment() == null) ? 0 : getBackendEnvironment().hashCode());
        return hashCode;
    }

    @Override
    public CreateBackendEnvironmentResult clone() {
        try {
            return (CreateBackendEnvironmentResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
