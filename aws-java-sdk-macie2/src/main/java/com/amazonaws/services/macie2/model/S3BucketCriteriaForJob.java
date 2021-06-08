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
 * Specifies property- and tag-based conditions that define criteria for including or excluding S3 buckets from a
 * classification job. Exclude conditions take precedence over include conditions.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/S3BucketCriteriaForJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3BucketCriteriaForJob implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The property- and tag-based conditions that determine which buckets to exclude from the job.
     * </p>
     */
    private CriteriaBlockForJob excludes;
    /**
     * <p>
     * The property- and tag-based conditions that determine which buckets to include in the job.
     * </p>
     */
    private CriteriaBlockForJob includes;

    /**
     * <p>
     * The property- and tag-based conditions that determine which buckets to exclude from the job.
     * </p>
     * 
     * @param excludes
     *        The property- and tag-based conditions that determine which buckets to exclude from the job.
     */

    public void setExcludes(CriteriaBlockForJob excludes) {
        this.excludes = excludes;
    }

    /**
     * <p>
     * The property- and tag-based conditions that determine which buckets to exclude from the job.
     * </p>
     * 
     * @return The property- and tag-based conditions that determine which buckets to exclude from the job.
     */

    public CriteriaBlockForJob getExcludes() {
        return this.excludes;
    }

    /**
     * <p>
     * The property- and tag-based conditions that determine which buckets to exclude from the job.
     * </p>
     * 
     * @param excludes
     *        The property- and tag-based conditions that determine which buckets to exclude from the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3BucketCriteriaForJob withExcludes(CriteriaBlockForJob excludes) {
        setExcludes(excludes);
        return this;
    }

    /**
     * <p>
     * The property- and tag-based conditions that determine which buckets to include in the job.
     * </p>
     * 
     * @param includes
     *        The property- and tag-based conditions that determine which buckets to include in the job.
     */

    public void setIncludes(CriteriaBlockForJob includes) {
        this.includes = includes;
    }

    /**
     * <p>
     * The property- and tag-based conditions that determine which buckets to include in the job.
     * </p>
     * 
     * @return The property- and tag-based conditions that determine which buckets to include in the job.
     */

    public CriteriaBlockForJob getIncludes() {
        return this.includes;
    }

    /**
     * <p>
     * The property- and tag-based conditions that determine which buckets to include in the job.
     * </p>
     * 
     * @param includes
     *        The property- and tag-based conditions that determine which buckets to include in the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3BucketCriteriaForJob withIncludes(CriteriaBlockForJob includes) {
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

        if (obj instanceof S3BucketCriteriaForJob == false)
            return false;
        S3BucketCriteriaForJob other = (S3BucketCriteriaForJob) obj;
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
    public S3BucketCriteriaForJob clone() {
        try {
            return (S3BucketCriteriaForJob) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.macie2.model.transform.S3BucketCriteriaForJobMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
