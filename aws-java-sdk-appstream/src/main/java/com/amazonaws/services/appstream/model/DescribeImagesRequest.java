/*
 * Copyright 2012-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.appstream.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/DescribeImages" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeImagesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The names of the images to describe.
     * </p>
     */
    private java.util.List<String> names;

    /**
     * <p>
     * The names of the images to describe.
     * </p>
     * 
     * @return The names of the images to describe.
     */

    public java.util.List<String> getNames() {
        return names;
    }

    /**
     * <p>
     * The names of the images to describe.
     * </p>
     * 
     * @param names
     *        The names of the images to describe.
     */

    public void setNames(java.util.Collection<String> names) {
        if (names == null) {
            this.names = null;
            return;
        }

        this.names = new java.util.ArrayList<String>(names);
    }

    /**
     * <p>
     * The names of the images to describe.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNames(java.util.Collection)} or {@link #withNames(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param names
     *        The names of the images to describe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeImagesRequest withNames(String... names) {
        if (this.names == null) {
            setNames(new java.util.ArrayList<String>(names.length));
        }
        for (String ele : names) {
            this.names.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The names of the images to describe.
     * </p>
     * 
     * @param names
     *        The names of the images to describe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeImagesRequest withNames(java.util.Collection<String> names) {
        setNames(names);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getNames() != null)
            sb.append("Names: ").append(getNames());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeImagesRequest == false)
            return false;
        DescribeImagesRequest other = (DescribeImagesRequest) obj;
        if (other.getNames() == null ^ this.getNames() == null)
            return false;
        if (other.getNames() != null && other.getNames().equals(this.getNames()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNames() == null) ? 0 : getNames().hashCode());
        return hashCode;
    }

    @Override
    public DescribeImagesRequest clone() {
        return (DescribeImagesRequest) super.clone();
    }

}
