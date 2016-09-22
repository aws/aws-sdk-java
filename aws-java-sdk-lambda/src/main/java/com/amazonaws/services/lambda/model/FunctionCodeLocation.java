/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lambda.model;

import java.io.Serializable;

/**
 * <p>
 * The object for the Lambda function location.
 * </p>
 */
public class FunctionCodeLocation implements Serializable, Cloneable {

    /**
     * <p>
     * The repository from which you can download the function.
     * </p>
     */
    private String repositoryType;
    /**
     * <p>
     * The presigned URL you can use to download the function's .zip file that you previously uploaded. The URL is valid
     * for up to 10 minutes.
     * </p>
     */
    private String location;

    /**
     * <p>
     * The repository from which you can download the function.
     * </p>
     * 
     * @param repositoryType
     *        The repository from which you can download the function.
     */

    public void setRepositoryType(String repositoryType) {
        this.repositoryType = repositoryType;
    }

    /**
     * <p>
     * The repository from which you can download the function.
     * </p>
     * 
     * @return The repository from which you can download the function.
     */

    public String getRepositoryType() {
        return this.repositoryType;
    }

    /**
     * <p>
     * The repository from which you can download the function.
     * </p>
     * 
     * @param repositoryType
     *        The repository from which you can download the function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FunctionCodeLocation withRepositoryType(String repositoryType) {
        setRepositoryType(repositoryType);
        return this;
    }

    /**
     * <p>
     * The presigned URL you can use to download the function's .zip file that you previously uploaded. The URL is valid
     * for up to 10 minutes.
     * </p>
     * 
     * @param location
     *        The presigned URL you can use to download the function's .zip file that you previously uploaded. The URL
     *        is valid for up to 10 minutes.
     */

    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * <p>
     * The presigned URL you can use to download the function's .zip file that you previously uploaded. The URL is valid
     * for up to 10 minutes.
     * </p>
     * 
     * @return The presigned URL you can use to download the function's .zip file that you previously uploaded. The URL
     *         is valid for up to 10 minutes.
     */

    public String getLocation() {
        return this.location;
    }

    /**
     * <p>
     * The presigned URL you can use to download the function's .zip file that you previously uploaded. The URL is valid
     * for up to 10 minutes.
     * </p>
     * 
     * @param location
     *        The presigned URL you can use to download the function's .zip file that you previously uploaded. The URL
     *        is valid for up to 10 minutes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FunctionCodeLocation withLocation(String location) {
        setLocation(location);
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
        if (getRepositoryType() != null)
            sb.append("RepositoryType: " + getRepositoryType() + ",");
        if (getLocation() != null)
            sb.append("Location: " + getLocation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FunctionCodeLocation == false)
            return false;
        FunctionCodeLocation other = (FunctionCodeLocation) obj;
        if (other.getRepositoryType() == null ^ this.getRepositoryType() == null)
            return false;
        if (other.getRepositoryType() != null && other.getRepositoryType().equals(this.getRepositoryType()) == false)
            return false;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRepositoryType() == null) ? 0 : getRepositoryType().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        return hashCode;
    }

    @Override
    public FunctionCodeLocation clone() {
        try {
            return (FunctionCodeLocation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
