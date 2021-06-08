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
package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/DescribeStudio" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeStudioResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon EMR Studio details.
     * </p>
     */
    private Studio studio;

    /**
     * <p>
     * The Amazon EMR Studio details.
     * </p>
     * 
     * @param studio
     *        The Amazon EMR Studio details.
     */

    public void setStudio(Studio studio) {
        this.studio = studio;
    }

    /**
     * <p>
     * The Amazon EMR Studio details.
     * </p>
     * 
     * @return The Amazon EMR Studio details.
     */

    public Studio getStudio() {
        return this.studio;
    }

    /**
     * <p>
     * The Amazon EMR Studio details.
     * </p>
     * 
     * @param studio
     *        The Amazon EMR Studio details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeStudioResult withStudio(Studio studio) {
        setStudio(studio);
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
        if (getStudio() != null)
            sb.append("Studio: ").append(getStudio());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeStudioResult == false)
            return false;
        DescribeStudioResult other = (DescribeStudioResult) obj;
        if (other.getStudio() == null ^ this.getStudio() == null)
            return false;
        if (other.getStudio() != null && other.getStudio().equals(this.getStudio()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStudio() == null) ? 0 : getStudio().hashCode());
        return hashCode;
    }

    @Override
    public DescribeStudioResult clone() {
        try {
            return (DescribeStudioResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
