/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.codepipeline.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The Git repository file paths specified as filter criteria to start the pipeline.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/GitFilePathFilterCriteria"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GitFilePathFilterCriteria implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The list of patterns of Git repository file paths that, when a commit is pushed, are to be included as criteria
     * that starts the pipeline.
     * </p>
     */
    private java.util.List<String> includes;
    /**
     * <p>
     * The list of patterns of Git repository file paths that, when a commit is pushed, are to be excluded from starting
     * the pipeline.
     * </p>
     */
    private java.util.List<String> excludes;

    /**
     * <p>
     * The list of patterns of Git repository file paths that, when a commit is pushed, are to be included as criteria
     * that starts the pipeline.
     * </p>
     * 
     * @return The list of patterns of Git repository file paths that, when a commit is pushed, are to be included as
     *         criteria that starts the pipeline.
     */

    public java.util.List<String> getIncludes() {
        return includes;
    }

    /**
     * <p>
     * The list of patterns of Git repository file paths that, when a commit is pushed, are to be included as criteria
     * that starts the pipeline.
     * </p>
     * 
     * @param includes
     *        The list of patterns of Git repository file paths that, when a commit is pushed, are to be included as
     *        criteria that starts the pipeline.
     */

    public void setIncludes(java.util.Collection<String> includes) {
        if (includes == null) {
            this.includes = null;
            return;
        }

        this.includes = new java.util.ArrayList<String>(includes);
    }

    /**
     * <p>
     * The list of patterns of Git repository file paths that, when a commit is pushed, are to be included as criteria
     * that starts the pipeline.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIncludes(java.util.Collection)} or {@link #withIncludes(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param includes
     *        The list of patterns of Git repository file paths that, when a commit is pushed, are to be included as
     *        criteria that starts the pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GitFilePathFilterCriteria withIncludes(String... includes) {
        if (this.includes == null) {
            setIncludes(new java.util.ArrayList<String>(includes.length));
        }
        for (String ele : includes) {
            this.includes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of patterns of Git repository file paths that, when a commit is pushed, are to be included as criteria
     * that starts the pipeline.
     * </p>
     * 
     * @param includes
     *        The list of patterns of Git repository file paths that, when a commit is pushed, are to be included as
     *        criteria that starts the pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GitFilePathFilterCriteria withIncludes(java.util.Collection<String> includes) {
        setIncludes(includes);
        return this;
    }

    /**
     * <p>
     * The list of patterns of Git repository file paths that, when a commit is pushed, are to be excluded from starting
     * the pipeline.
     * </p>
     * 
     * @return The list of patterns of Git repository file paths that, when a commit is pushed, are to be excluded from
     *         starting the pipeline.
     */

    public java.util.List<String> getExcludes() {
        return excludes;
    }

    /**
     * <p>
     * The list of patterns of Git repository file paths that, when a commit is pushed, are to be excluded from starting
     * the pipeline.
     * </p>
     * 
     * @param excludes
     *        The list of patterns of Git repository file paths that, when a commit is pushed, are to be excluded from
     *        starting the pipeline.
     */

    public void setExcludes(java.util.Collection<String> excludes) {
        if (excludes == null) {
            this.excludes = null;
            return;
        }

        this.excludes = new java.util.ArrayList<String>(excludes);
    }

    /**
     * <p>
     * The list of patterns of Git repository file paths that, when a commit is pushed, are to be excluded from starting
     * the pipeline.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExcludes(java.util.Collection)} or {@link #withExcludes(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param excludes
     *        The list of patterns of Git repository file paths that, when a commit is pushed, are to be excluded from
     *        starting the pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GitFilePathFilterCriteria withExcludes(String... excludes) {
        if (this.excludes == null) {
            setExcludes(new java.util.ArrayList<String>(excludes.length));
        }
        for (String ele : excludes) {
            this.excludes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of patterns of Git repository file paths that, when a commit is pushed, are to be excluded from starting
     * the pipeline.
     * </p>
     * 
     * @param excludes
     *        The list of patterns of Git repository file paths that, when a commit is pushed, are to be excluded from
     *        starting the pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GitFilePathFilterCriteria withExcludes(java.util.Collection<String> excludes) {
        setExcludes(excludes);
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
        if (getIncludes() != null)
            sb.append("Includes: ").append(getIncludes()).append(",");
        if (getExcludes() != null)
            sb.append("Excludes: ").append(getExcludes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GitFilePathFilterCriteria == false)
            return false;
        GitFilePathFilterCriteria other = (GitFilePathFilterCriteria) obj;
        if (other.getIncludes() == null ^ this.getIncludes() == null)
            return false;
        if (other.getIncludes() != null && other.getIncludes().equals(this.getIncludes()) == false)
            return false;
        if (other.getExcludes() == null ^ this.getExcludes() == null)
            return false;
        if (other.getExcludes() != null && other.getExcludes().equals(this.getExcludes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIncludes() == null) ? 0 : getIncludes().hashCode());
        hashCode = prime * hashCode + ((getExcludes() == null) ? 0 : getExcludes().hashCode());
        return hashCode;
    }

    @Override
    public GitFilePathFilterCriteria clone() {
        try {
            return (GitFilePathFilterCriteria) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codepipeline.model.transform.GitFilePathFilterCriteriaMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
