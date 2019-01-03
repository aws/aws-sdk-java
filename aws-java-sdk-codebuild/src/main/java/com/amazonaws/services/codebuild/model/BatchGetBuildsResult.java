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
package com.amazonaws.services.codebuild.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/BatchGetBuilds" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetBuildsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the requested builds.
     * </p>
     */
    private java.util.List<Build> builds;
    /**
     * <p>
     * The IDs of builds for which information could not be found.
     * </p>
     */
    private java.util.List<String> buildsNotFound;

    /**
     * <p>
     * Information about the requested builds.
     * </p>
     * 
     * @return Information about the requested builds.
     */

    public java.util.List<Build> getBuilds() {
        return builds;
    }

    /**
     * <p>
     * Information about the requested builds.
     * </p>
     * 
     * @param builds
     *        Information about the requested builds.
     */

    public void setBuilds(java.util.Collection<Build> builds) {
        if (builds == null) {
            this.builds = null;
            return;
        }

        this.builds = new java.util.ArrayList<Build>(builds);
    }

    /**
     * <p>
     * Information about the requested builds.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBuilds(java.util.Collection)} or {@link #withBuilds(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param builds
     *        Information about the requested builds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetBuildsResult withBuilds(Build... builds) {
        if (this.builds == null) {
            setBuilds(new java.util.ArrayList<Build>(builds.length));
        }
        for (Build ele : builds) {
            this.builds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the requested builds.
     * </p>
     * 
     * @param builds
     *        Information about the requested builds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetBuildsResult withBuilds(java.util.Collection<Build> builds) {
        setBuilds(builds);
        return this;
    }

    /**
     * <p>
     * The IDs of builds for which information could not be found.
     * </p>
     * 
     * @return The IDs of builds for which information could not be found.
     */

    public java.util.List<String> getBuildsNotFound() {
        return buildsNotFound;
    }

    /**
     * <p>
     * The IDs of builds for which information could not be found.
     * </p>
     * 
     * @param buildsNotFound
     *        The IDs of builds for which information could not be found.
     */

    public void setBuildsNotFound(java.util.Collection<String> buildsNotFound) {
        if (buildsNotFound == null) {
            this.buildsNotFound = null;
            return;
        }

        this.buildsNotFound = new java.util.ArrayList<String>(buildsNotFound);
    }

    /**
     * <p>
     * The IDs of builds for which information could not be found.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBuildsNotFound(java.util.Collection)} or {@link #withBuildsNotFound(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param buildsNotFound
     *        The IDs of builds for which information could not be found.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetBuildsResult withBuildsNotFound(String... buildsNotFound) {
        if (this.buildsNotFound == null) {
            setBuildsNotFound(new java.util.ArrayList<String>(buildsNotFound.length));
        }
        for (String ele : buildsNotFound) {
            this.buildsNotFound.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of builds for which information could not be found.
     * </p>
     * 
     * @param buildsNotFound
     *        The IDs of builds for which information could not be found.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetBuildsResult withBuildsNotFound(java.util.Collection<String> buildsNotFound) {
        setBuildsNotFound(buildsNotFound);
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
        if (getBuilds() != null)
            sb.append("Builds: ").append(getBuilds()).append(",");
        if (getBuildsNotFound() != null)
            sb.append("BuildsNotFound: ").append(getBuildsNotFound());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetBuildsResult == false)
            return false;
        BatchGetBuildsResult other = (BatchGetBuildsResult) obj;
        if (other.getBuilds() == null ^ this.getBuilds() == null)
            return false;
        if (other.getBuilds() != null && other.getBuilds().equals(this.getBuilds()) == false)
            return false;
        if (other.getBuildsNotFound() == null ^ this.getBuildsNotFound() == null)
            return false;
        if (other.getBuildsNotFound() != null && other.getBuildsNotFound().equals(this.getBuildsNotFound()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBuilds() == null) ? 0 : getBuilds().hashCode());
        hashCode = prime * hashCode + ((getBuildsNotFound() == null) ? 0 : getBuildsNotFound().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetBuildsResult clone() {
        try {
            return (BatchGetBuildsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
