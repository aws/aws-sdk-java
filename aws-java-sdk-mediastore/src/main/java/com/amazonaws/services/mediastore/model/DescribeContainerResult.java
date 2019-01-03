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
package com.amazonaws.services.mediastore.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediastore-2017-09-01/DescribeContainer" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeContainerResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the queried container.
     * </p>
     */
    private Container container;

    /**
     * <p>
     * The name of the queried container.
     * </p>
     * 
     * @param container
     *        The name of the queried container.
     */

    public void setContainer(Container container) {
        this.container = container;
    }

    /**
     * <p>
     * The name of the queried container.
     * </p>
     * 
     * @return The name of the queried container.
     */

    public Container getContainer() {
        return this.container;
    }

    /**
     * <p>
     * The name of the queried container.
     * </p>
     * 
     * @param container
     *        The name of the queried container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeContainerResult withContainer(Container container) {
        setContainer(container);
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
        if (getContainer() != null)
            sb.append("Container: ").append(getContainer());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeContainerResult == false)
            return false;
        DescribeContainerResult other = (DescribeContainerResult) obj;
        if (other.getContainer() == null ^ this.getContainer() == null)
            return false;
        if (other.getContainer() != null && other.getContainer().equals(this.getContainer()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContainer() == null) ? 0 : getContainer().hashCode());
        return hashCode;
    }

    @Override
    public DescribeContainerResult clone() {
        try {
            return (DescribeContainerResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
