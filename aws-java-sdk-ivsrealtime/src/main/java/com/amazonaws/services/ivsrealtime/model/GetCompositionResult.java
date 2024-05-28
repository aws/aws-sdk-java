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
package com.amazonaws.services.ivsrealtime.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/GetComposition" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetCompositionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Composition that was returned.
     * </p>
     */
    private Composition composition;

    /**
     * <p>
     * The Composition that was returned.
     * </p>
     * 
     * @param composition
     *        The Composition that was returned.
     */

    public void setComposition(Composition composition) {
        this.composition = composition;
    }

    /**
     * <p>
     * The Composition that was returned.
     * </p>
     * 
     * @return The Composition that was returned.
     */

    public Composition getComposition() {
        return this.composition;
    }

    /**
     * <p>
     * The Composition that was returned.
     * </p>
     * 
     * @param composition
     *        The Composition that was returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCompositionResult withComposition(Composition composition) {
        setComposition(composition);
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
        if (getComposition() != null)
            sb.append("Composition: ").append(getComposition());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetCompositionResult == false)
            return false;
        GetCompositionResult other = (GetCompositionResult) obj;
        if (other.getComposition() == null ^ this.getComposition() == null)
            return false;
        if (other.getComposition() != null && other.getComposition().equals(this.getComposition()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getComposition() == null) ? 0 : getComposition().hashCode());
        return hashCode;
    }

    @Override
    public GetCompositionResult clone() {
        try {
            return (GetCompositionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
