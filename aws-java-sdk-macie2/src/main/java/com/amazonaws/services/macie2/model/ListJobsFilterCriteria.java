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
package com.amazonaws.services.macie2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies criteria for filtering the results of a request for information about classification jobs.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/ListJobsFilterCriteria" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListJobsFilterCriteria implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An array of objects, one for each condition that determines which jobs to exclude from the results.
     * </p>
     */
    private java.util.List<ListJobsFilterTerm> excludes;
    /**
     * <p>
     * An array of objects, one for each condition that determines which jobs to include in the results.
     * </p>
     */
    private java.util.List<ListJobsFilterTerm> includes;

    /**
     * <p>
     * An array of objects, one for each condition that determines which jobs to exclude from the results.
     * </p>
     * 
     * @return An array of objects, one for each condition that determines which jobs to exclude from the results.
     */

    public java.util.List<ListJobsFilterTerm> getExcludes() {
        return excludes;
    }

    /**
     * <p>
     * An array of objects, one for each condition that determines which jobs to exclude from the results.
     * </p>
     * 
     * @param excludes
     *        An array of objects, one for each condition that determines which jobs to exclude from the results.
     */

    public void setExcludes(java.util.Collection<ListJobsFilterTerm> excludes) {
        if (excludes == null) {
            this.excludes = null;
            return;
        }

        this.excludes = new java.util.ArrayList<ListJobsFilterTerm>(excludes);
    }

    /**
     * <p>
     * An array of objects, one for each condition that determines which jobs to exclude from the results.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExcludes(java.util.Collection)} or {@link #withExcludes(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param excludes
     *        An array of objects, one for each condition that determines which jobs to exclude from the results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListJobsFilterCriteria withExcludes(ListJobsFilterTerm... excludes) {
        if (this.excludes == null) {
            setExcludes(new java.util.ArrayList<ListJobsFilterTerm>(excludes.length));
        }
        for (ListJobsFilterTerm ele : excludes) {
            this.excludes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects, one for each condition that determines which jobs to exclude from the results.
     * </p>
     * 
     * @param excludes
     *        An array of objects, one for each condition that determines which jobs to exclude from the results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListJobsFilterCriteria withExcludes(java.util.Collection<ListJobsFilterTerm> excludes) {
        setExcludes(excludes);
        return this;
    }

    /**
     * <p>
     * An array of objects, one for each condition that determines which jobs to include in the results.
     * </p>
     * 
     * @return An array of objects, one for each condition that determines which jobs to include in the results.
     */

    public java.util.List<ListJobsFilterTerm> getIncludes() {
        return includes;
    }

    /**
     * <p>
     * An array of objects, one for each condition that determines which jobs to include in the results.
     * </p>
     * 
     * @param includes
     *        An array of objects, one for each condition that determines which jobs to include in the results.
     */

    public void setIncludes(java.util.Collection<ListJobsFilterTerm> includes) {
        if (includes == null) {
            this.includes = null;
            return;
        }

        this.includes = new java.util.ArrayList<ListJobsFilterTerm>(includes);
    }

    /**
     * <p>
     * An array of objects, one for each condition that determines which jobs to include in the results.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIncludes(java.util.Collection)} or {@link #withIncludes(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param includes
     *        An array of objects, one for each condition that determines which jobs to include in the results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListJobsFilterCriteria withIncludes(ListJobsFilterTerm... includes) {
        if (this.includes == null) {
            setIncludes(new java.util.ArrayList<ListJobsFilterTerm>(includes.length));
        }
        for (ListJobsFilterTerm ele : includes) {
            this.includes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects, one for each condition that determines which jobs to include in the results.
     * </p>
     * 
     * @param includes
     *        An array of objects, one for each condition that determines which jobs to include in the results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListJobsFilterCriteria withIncludes(java.util.Collection<ListJobsFilterTerm> includes) {
        setIncludes(includes);
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
        if (getExcludes() != null)
            sb.append("Excludes: ").append(getExcludes()).append(",");
        if (getIncludes() != null)
            sb.append("Includes: ").append(getIncludes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListJobsFilterCriteria == false)
            return false;
        ListJobsFilterCriteria other = (ListJobsFilterCriteria) obj;
        if (other.getExcludes() == null ^ this.getExcludes() == null)
            return false;
        if (other.getExcludes() != null && other.getExcludes().equals(this.getExcludes()) == false)
            return false;
        if (other.getIncludes() == null ^ this.getIncludes() == null)
            return false;
        if (other.getIncludes() != null && other.getIncludes().equals(this.getIncludes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExcludes() == null) ? 0 : getExcludes().hashCode());
        hashCode = prime * hashCode + ((getIncludes() == null) ? 0 : getIncludes().hashCode());
        return hashCode;
    }

    @Override
    public ListJobsFilterCriteria clone() {
        try {
            return (ListJobsFilterCriteria) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.macie2.model.transform.ListJobsFilterCriteriaMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
