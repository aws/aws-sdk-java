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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetContainerServicePowers"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetContainerServicePowersResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of objects that describe the powers that can be specified for a container service.
     * </p>
     */
    private java.util.List<ContainerServicePower> powers;

    /**
     * <p>
     * An array of objects that describe the powers that can be specified for a container service.
     * </p>
     * 
     * @return An array of objects that describe the powers that can be specified for a container service.
     */

    public java.util.List<ContainerServicePower> getPowers() {
        return powers;
    }

    /**
     * <p>
     * An array of objects that describe the powers that can be specified for a container service.
     * </p>
     * 
     * @param powers
     *        An array of objects that describe the powers that can be specified for a container service.
     */

    public void setPowers(java.util.Collection<ContainerServicePower> powers) {
        if (powers == null) {
            this.powers = null;
            return;
        }

        this.powers = new java.util.ArrayList<ContainerServicePower>(powers);
    }

    /**
     * <p>
     * An array of objects that describe the powers that can be specified for a container service.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPowers(java.util.Collection)} or {@link #withPowers(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param powers
     *        An array of objects that describe the powers that can be specified for a container service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetContainerServicePowersResult withPowers(ContainerServicePower... powers) {
        if (this.powers == null) {
            setPowers(new java.util.ArrayList<ContainerServicePower>(powers.length));
        }
        for (ContainerServicePower ele : powers) {
            this.powers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects that describe the powers that can be specified for a container service.
     * </p>
     * 
     * @param powers
     *        An array of objects that describe the powers that can be specified for a container service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetContainerServicePowersResult withPowers(java.util.Collection<ContainerServicePower> powers) {
        setPowers(powers);
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
        if (getPowers() != null)
            sb.append("Powers: ").append(getPowers());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetContainerServicePowersResult == false)
            return false;
        GetContainerServicePowersResult other = (GetContainerServicePowersResult) obj;
        if (other.getPowers() == null ^ this.getPowers() == null)
            return false;
        if (other.getPowers() != null && other.getPowers().equals(this.getPowers()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPowers() == null) ? 0 : getPowers().hashCode());
        return hashCode;
    }

    @Override
    public GetContainerServicePowersResult clone() {
        try {
            return (GetContainerServicePowersResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
