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
package com.amazonaws.services.globalaccelerator.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/CreateListener" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateListenerResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The listener that you've created.
     * </p>
     */
    private Listener listener;

    /**
     * <p>
     * The listener that you've created.
     * </p>
     * 
     * @param listener
     *        The listener that you've created.
     */

    public void setListener(Listener listener) {
        this.listener = listener;
    }

    /**
     * <p>
     * The listener that you've created.
     * </p>
     * 
     * @return The listener that you've created.
     */

    public Listener getListener() {
        return this.listener;
    }

    /**
     * <p>
     * The listener that you've created.
     * </p>
     * 
     * @param listener
     *        The listener that you've created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateListenerResult withListener(Listener listener) {
        setListener(listener);
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
        if (getListener() != null)
            sb.append("Listener: ").append(getListener());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateListenerResult == false)
            return false;
        CreateListenerResult other = (CreateListenerResult) obj;
        if (other.getListener() == null ^ this.getListener() == null)
            return false;
        if (other.getListener() != null && other.getListener().equals(this.getListener()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getListener() == null) ? 0 : getListener().hashCode());
        return hashCode;
    }

    @Override
    public CreateListenerResult clone() {
        try {
            return (CreateListenerResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
