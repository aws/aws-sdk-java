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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetInstance" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetInstanceResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of key-value pairs containing information about the specified instance.
     * </p>
     */
    private Instance instance;

    /**
     * <p>
     * An array of key-value pairs containing information about the specified instance.
     * </p>
     * 
     * @param instance
     *        An array of key-value pairs containing information about the specified instance.
     */

    public void setInstance(Instance instance) {
        this.instance = instance;
    }

    /**
     * <p>
     * An array of key-value pairs containing information about the specified instance.
     * </p>
     * 
     * @return An array of key-value pairs containing information about the specified instance.
     */

    public Instance getInstance() {
        return this.instance;
    }

    /**
     * <p>
     * An array of key-value pairs containing information about the specified instance.
     * </p>
     * 
     * @param instance
     *        An array of key-value pairs containing information about the specified instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInstanceResult withInstance(Instance instance) {
        setInstance(instance);
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
        if (getInstance() != null)
            sb.append("Instance: ").append(getInstance());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetInstanceResult == false)
            return false;
        GetInstanceResult other = (GetInstanceResult) obj;
        if (other.getInstance() == null ^ this.getInstance() == null)
            return false;
        if (other.getInstance() != null && other.getInstance().equals(this.getInstance()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstance() == null) ? 0 : getInstance().hashCode());
        return hashCode;
    }

    @Override
    public GetInstanceResult clone() {
        try {
            return (GetInstanceResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
