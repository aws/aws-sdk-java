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
package com.amazonaws.services.identitymanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/CreateServiceSpecificCredential"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateServiceSpecificCredentialResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * A structure that contains information about the newly created service-specific credential.
     * </p>
     * <important>
     * <p>
     * This is the only time that the password for this credential set is available. It cannot be recovered later.
     * Instead, you will have to reset the password with <a>ResetServiceSpecificCredential</a>.
     * </p>
     * </important>
     */
    private ServiceSpecificCredential serviceSpecificCredential;

    /**
     * <p>
     * A structure that contains information about the newly created service-specific credential.
     * </p>
     * <important>
     * <p>
     * This is the only time that the password for this credential set is available. It cannot be recovered later.
     * Instead, you will have to reset the password with <a>ResetServiceSpecificCredential</a>.
     * </p>
     * </important>
     * 
     * @param serviceSpecificCredential
     *        A structure that contains information about the newly created service-specific credential.</p> <important>
     *        <p>
     *        This is the only time that the password for this credential set is available. It cannot be recovered
     *        later. Instead, you will have to reset the password with <a>ResetServiceSpecificCredential</a>.
     *        </p>
     */

    public void setServiceSpecificCredential(ServiceSpecificCredential serviceSpecificCredential) {
        this.serviceSpecificCredential = serviceSpecificCredential;
    }

    /**
     * <p>
     * A structure that contains information about the newly created service-specific credential.
     * </p>
     * <important>
     * <p>
     * This is the only time that the password for this credential set is available. It cannot be recovered later.
     * Instead, you will have to reset the password with <a>ResetServiceSpecificCredential</a>.
     * </p>
     * </important>
     * 
     * @return A structure that contains information about the newly created service-specific credential.</p>
     *         <important>
     *         <p>
     *         This is the only time that the password for this credential set is available. It cannot be recovered
     *         later. Instead, you will have to reset the password with <a>ResetServiceSpecificCredential</a>.
     *         </p>
     */

    public ServiceSpecificCredential getServiceSpecificCredential() {
        return this.serviceSpecificCredential;
    }

    /**
     * <p>
     * A structure that contains information about the newly created service-specific credential.
     * </p>
     * <important>
     * <p>
     * This is the only time that the password for this credential set is available. It cannot be recovered later.
     * Instead, you will have to reset the password with <a>ResetServiceSpecificCredential</a>.
     * </p>
     * </important>
     * 
     * @param serviceSpecificCredential
     *        A structure that contains information about the newly created service-specific credential.</p> <important>
     *        <p>
     *        This is the only time that the password for this credential set is available. It cannot be recovered
     *        later. Instead, you will have to reset the password with <a>ResetServiceSpecificCredential</a>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceSpecificCredentialResult withServiceSpecificCredential(ServiceSpecificCredential serviceSpecificCredential) {
        setServiceSpecificCredential(serviceSpecificCredential);
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
        if (getServiceSpecificCredential() != null)
            sb.append("ServiceSpecificCredential: ").append(getServiceSpecificCredential());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateServiceSpecificCredentialResult == false)
            return false;
        CreateServiceSpecificCredentialResult other = (CreateServiceSpecificCredentialResult) obj;
        if (other.getServiceSpecificCredential() == null ^ this.getServiceSpecificCredential() == null)
            return false;
        if (other.getServiceSpecificCredential() != null && other.getServiceSpecificCredential().equals(this.getServiceSpecificCredential()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServiceSpecificCredential() == null) ? 0 : getServiceSpecificCredential().hashCode());
        return hashCode;
    }

    @Override
    public CreateServiceSpecificCredentialResult clone() {
        try {
            return (CreateServiceSpecificCredentialResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
