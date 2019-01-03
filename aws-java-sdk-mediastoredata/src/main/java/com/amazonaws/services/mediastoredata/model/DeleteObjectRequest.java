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
package com.amazonaws.services.mediastoredata.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediastore-data-2017-09-01/DeleteObject" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteObjectRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The path (including the file name) where the object is stored in the container. Format: &lt;folder
     * name&gt;/&lt;folder name&gt;/&lt;file name&gt;
     * </p>
     */
    private String path;

    /**
     * <p>
     * The path (including the file name) where the object is stored in the container. Format: &lt;folder
     * name&gt;/&lt;folder name&gt;/&lt;file name&gt;
     * </p>
     * 
     * @param path
     *        The path (including the file name) where the object is stored in the container. Format: &lt;folder
     *        name&gt;/&lt;folder name&gt;/&lt;file name&gt;
     */

    public void setPath(String path) {
        this.path = path;
    }

    /**
     * <p>
     * The path (including the file name) where the object is stored in the container. Format: &lt;folder
     * name&gt;/&lt;folder name&gt;/&lt;file name&gt;
     * </p>
     * 
     * @return The path (including the file name) where the object is stored in the container. Format: &lt;folder
     *         name&gt;/&lt;folder name&gt;/&lt;file name&gt;
     */

    public String getPath() {
        return this.path;
    }

    /**
     * <p>
     * The path (including the file name) where the object is stored in the container. Format: &lt;folder
     * name&gt;/&lt;folder name&gt;/&lt;file name&gt;
     * </p>
     * 
     * @param path
     *        The path (including the file name) where the object is stored in the container. Format: &lt;folder
     *        name&gt;/&lt;folder name&gt;/&lt;file name&gt;
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteObjectRequest withPath(String path) {
        setPath(path);
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
        if (getPath() != null)
            sb.append("Path: ").append(getPath());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteObjectRequest == false)
            return false;
        DeleteObjectRequest other = (DeleteObjectRequest) obj;
        if (other.getPath() == null ^ this.getPath() == null)
            return false;
        if (other.getPath() != null && other.getPath().equals(this.getPath()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPath() == null) ? 0 : getPath().hashCode());
        return hashCode;
    }

    @Override
    public DeleteObjectRequest clone() {
        return (DeleteObjectRequest) super.clone();
    }

}
