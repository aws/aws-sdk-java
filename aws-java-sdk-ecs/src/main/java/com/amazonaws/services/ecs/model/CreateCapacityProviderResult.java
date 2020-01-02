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
package com.amazonaws.services.ecs.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/CreateCapacityProvider" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateCapacityProviderResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The full description of the new capacity provider.
     * </p>
     */
    private CapacityProvider capacityProvider;

    /**
     * <p>
     * The full description of the new capacity provider.
     * </p>
     * 
     * @param capacityProvider
     *        The full description of the new capacity provider.
     */

    public void setCapacityProvider(CapacityProvider capacityProvider) {
        this.capacityProvider = capacityProvider;
    }

    /**
     * <p>
     * The full description of the new capacity provider.
     * </p>
     * 
     * @return The full description of the new capacity provider.
     */

    public CapacityProvider getCapacityProvider() {
        return this.capacityProvider;
    }

    /**
     * <p>
     * The full description of the new capacity provider.
     * </p>
     * 
     * @param capacityProvider
     *        The full description of the new capacity provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCapacityProviderResult withCapacityProvider(CapacityProvider capacityProvider) {
        setCapacityProvider(capacityProvider);
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
        if (getCapacityProvider() != null)
            sb.append("CapacityProvider: ").append(getCapacityProvider());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateCapacityProviderResult == false)
            return false;
        CreateCapacityProviderResult other = (CreateCapacityProviderResult) obj;
        if (other.getCapacityProvider() == null ^ this.getCapacityProvider() == null)
            return false;
        if (other.getCapacityProvider() != null && other.getCapacityProvider().equals(this.getCapacityProvider()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCapacityProvider() == null) ? 0 : getCapacityProvider().hashCode());
        return hashCode;
    }

    @Override
    public CreateCapacityProviderResult clone() {
        try {
            return (CreateCapacityProviderResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
