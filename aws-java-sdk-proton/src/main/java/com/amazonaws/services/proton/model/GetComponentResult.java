/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.proton.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/GetComponent" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetComponentResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The detailed data of the requested component.
     * </p>
     */
    private Component component;

    /**
     * <p>
     * The detailed data of the requested component.
     * </p>
     * 
     * @param component
     *        The detailed data of the requested component.
     */

    public void setComponent(Component component) {
        this.component = component;
    }

    /**
     * <p>
     * The detailed data of the requested component.
     * </p>
     * 
     * @return The detailed data of the requested component.
     */

    public Component getComponent() {
        return this.component;
    }

    /**
     * <p>
     * The detailed data of the requested component.
     * </p>
     * 
     * @param component
     *        The detailed data of the requested component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetComponentResult withComponent(Component component) {
        setComponent(component);
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
        if (getComponent() != null)
            sb.append("Component: ").append(getComponent());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetComponentResult == false)
            return false;
        GetComponentResult other = (GetComponentResult) obj;
        if (other.getComponent() == null ^ this.getComponent() == null)
            return false;
        if (other.getComponent() != null && other.getComponent().equals(this.getComponent()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getComponent() == null) ? 0 : getComponent().hashCode());
        return hashCode;
    }

    @Override
    public GetComponentResult clone() {
        try {
            return (GetComponentResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
