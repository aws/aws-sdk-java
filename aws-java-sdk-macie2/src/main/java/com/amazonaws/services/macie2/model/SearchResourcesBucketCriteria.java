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
 * Specifies property- and tag-based conditions that define filter criteria for including or excluding S3 buckets from
 * the query results. Exclude conditions take precedence over include conditions.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/SearchResourcesBucketCriteria"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SearchResourcesBucketCriteria implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The property- and tag-based conditions that determine which buckets to exclude from the results.
     * </p>
     */
    private SearchResourcesCriteriaBlock excludes;
    /**
     * <p>
     * The property- and tag-based conditions that determine which buckets to include in the results.
     * </p>
     */
    private SearchResourcesCriteriaBlock includes;

    /**
     * <p>
     * The property- and tag-based conditions that determine which buckets to exclude from the results.
     * </p>
     * 
     * @param excludes
     *        The property- and tag-based conditions that determine which buckets to exclude from the results.
     */

    public void setExcludes(SearchResourcesCriteriaBlock excludes) {
        this.excludes = excludes;
    }

    /**
     * <p>
     * The property- and tag-based conditions that determine which buckets to exclude from the results.
     * </p>
     * 
     * @return The property- and tag-based conditions that determine which buckets to exclude from the results.
     */

    public SearchResourcesCriteriaBlock getExcludes() {
        return this.excludes;
    }

    /**
     * <p>
     * The property- and tag-based conditions that determine which buckets to exclude from the results.
     * </p>
     * 
     * @param excludes
     *        The property- and tag-based conditions that determine which buckets to exclude from the results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchResourcesBucketCriteria withExcludes(SearchResourcesCriteriaBlock excludes) {
        setExcludes(excludes);
        return this;
    }

    /**
     * <p>
     * The property- and tag-based conditions that determine which buckets to include in the results.
     * </p>
     * 
     * @param includes
     *        The property- and tag-based conditions that determine which buckets to include in the results.
     */

    public void setIncludes(SearchResourcesCriteriaBlock includes) {
        this.includes = includes;
    }

    /**
     * <p>
     * The property- and tag-based conditions that determine which buckets to include in the results.
     * </p>
     * 
     * @return The property- and tag-based conditions that determine which buckets to include in the results.
     */

    public SearchResourcesCriteriaBlock getIncludes() {
        return this.includes;
    }

    /**
     * <p>
     * The property- and tag-based conditions that determine which buckets to include in the results.
     * </p>
     * 
     * @param includes
     *        The property- and tag-based conditions that determine which buckets to include in the results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchResourcesBucketCriteria withIncludes(SearchResourcesCriteriaBlock includes) {
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

        if (obj instanceof SearchResourcesBucketCriteria == false)
            return false;
        SearchResourcesBucketCriteria other = (SearchResourcesBucketCriteria) obj;
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
    public SearchResourcesBucketCriteria clone() {
        try {
            return (SearchResourcesBucketCriteria) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.macie2.model.transform.SearchResourcesBucketCriteriaMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
