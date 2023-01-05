/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.wellarchitected.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/GetLens" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetLensResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A lens return object.
     * </p>
     */
    private Lens lens;

    /**
     * <p>
     * A lens return object.
     * </p>
     * 
     * @param lens
     *        A lens return object.
     */

    public void setLens(Lens lens) {
        this.lens = lens;
    }

    /**
     * <p>
     * A lens return object.
     * </p>
     * 
     * @return A lens return object.
     */

    public Lens getLens() {
        return this.lens;
    }

    /**
     * <p>
     * A lens return object.
     * </p>
     * 
     * @param lens
     *        A lens return object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLensResult withLens(Lens lens) {
        setLens(lens);
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
        if (getLens() != null)
            sb.append("Lens: ").append(getLens());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetLensResult == false)
            return false;
        GetLensResult other = (GetLensResult) obj;
        if (other.getLens() == null ^ this.getLens() == null)
            return false;
        if (other.getLens() != null && other.getLens().equals(this.getLens()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLens() == null) ? 0 : getLens().hashCode());
        return hashCode;
    }

    @Override
    public GetLensResult clone() {
        try {
            return (GetLensResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
