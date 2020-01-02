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
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * Placeholder documentation for UpdateMultiplexResponse
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/UpdateMultiplex" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateMultiplexResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /** The updated multiplex. */
    private Multiplex multiplex;

    /**
     * The updated multiplex.
     * 
     * @param multiplex
     *        The updated multiplex.
     */

    public void setMultiplex(Multiplex multiplex) {
        this.multiplex = multiplex;
    }

    /**
     * The updated multiplex.
     * 
     * @return The updated multiplex.
     */

    public Multiplex getMultiplex() {
        return this.multiplex;
    }

    /**
     * The updated multiplex.
     * 
     * @param multiplex
     *        The updated multiplex.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMultiplexResult withMultiplex(Multiplex multiplex) {
        setMultiplex(multiplex);
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
        if (getMultiplex() != null)
            sb.append("Multiplex: ").append(getMultiplex());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateMultiplexResult == false)
            return false;
        UpdateMultiplexResult other = (UpdateMultiplexResult) obj;
        if (other.getMultiplex() == null ^ this.getMultiplex() == null)
            return false;
        if (other.getMultiplex() != null && other.getMultiplex().equals(this.getMultiplex()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMultiplex() == null) ? 0 : getMultiplex().hashCode());
        return hashCode;
    }

    @Override
    public UpdateMultiplexResult clone() {
        try {
            return (UpdateMultiplexResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
