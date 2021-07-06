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
 * Specifies which S3 buckets contain the objects that a classification job analyzes, and the scope of that analysis.
 * The bucket specification can be static (bucketDefinitions) or dynamic (bucketCriteria). If it's static, the job
 * analyzes objects in the same predefined set of buckets each time the job runs. If it's dynamic, the job analyzes
 * objects in any buckets that match the specified criteria each time the job starts to run.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/S3JobDefinition" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3JobDefinition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An array of objects, one for each Amazon Web Services account that owns specific S3 buckets to analyze. Each
     * object specifies the account ID for an account and one or more buckets to analyze for that account. A job's
     * definition can contain a bucketDefinitions array or a bucketCriteria object, not both.
     * </p>
     */
    private java.util.List<S3BucketDefinitionForJob> bucketDefinitions;
    /**
     * <p>
     * The property- and tag-based conditions that determine which S3 objects to include or exclude from the analysis.
     * Each time the job runs, the job uses these criteria to determine which objects to analyze.
     * </p>
     */
    private Scoping scoping;
    /**
     * <p>
     * The property- and tag-based conditions that determine which S3 buckets to include or exclude from the analysis.
     * Each time the job runs, the job uses these criteria to determine which buckets contain objects to analyze. A
     * job's definition can contain a bucketCriteria object or a bucketDefinitions array, not both.
     * </p>
     */
    private S3BucketCriteriaForJob bucketCriteria;

    /**
     * <p>
     * An array of objects, one for each Amazon Web Services account that owns specific S3 buckets to analyze. Each
     * object specifies the account ID for an account and one or more buckets to analyze for that account. A job's
     * definition can contain a bucketDefinitions array or a bucketCriteria object, not both.
     * </p>
     * 
     * @return An array of objects, one for each Amazon Web Services account that owns specific S3 buckets to analyze.
     *         Each object specifies the account ID for an account and one or more buckets to analyze for that account.
     *         A job's definition can contain a bucketDefinitions array or a bucketCriteria object, not both.
     */

    public java.util.List<S3BucketDefinitionForJob> getBucketDefinitions() {
        return bucketDefinitions;
    }

    /**
     * <p>
     * An array of objects, one for each Amazon Web Services account that owns specific S3 buckets to analyze. Each
     * object specifies the account ID for an account and one or more buckets to analyze for that account. A job's
     * definition can contain a bucketDefinitions array or a bucketCriteria object, not both.
     * </p>
     * 
     * @param bucketDefinitions
     *        An array of objects, one for each Amazon Web Services account that owns specific S3 buckets to analyze.
     *        Each object specifies the account ID for an account and one or more buckets to analyze for that account. A
     *        job's definition can contain a bucketDefinitions array or a bucketCriteria object, not both.
     */

    public void setBucketDefinitions(java.util.Collection<S3BucketDefinitionForJob> bucketDefinitions) {
        if (bucketDefinitions == null) {
            this.bucketDefinitions = null;
            return;
        }

        this.bucketDefinitions = new java.util.ArrayList<S3BucketDefinitionForJob>(bucketDefinitions);
    }

    /**
     * <p>
     * An array of objects, one for each Amazon Web Services account that owns specific S3 buckets to analyze. Each
     * object specifies the account ID for an account and one or more buckets to analyze for that account. A job's
     * definition can contain a bucketDefinitions array or a bucketCriteria object, not both.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBucketDefinitions(java.util.Collection)} or {@link #withBucketDefinitions(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param bucketDefinitions
     *        An array of objects, one for each Amazon Web Services account that owns specific S3 buckets to analyze.
     *        Each object specifies the account ID for an account and one or more buckets to analyze for that account. A
     *        job's definition can contain a bucketDefinitions array or a bucketCriteria object, not both.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3JobDefinition withBucketDefinitions(S3BucketDefinitionForJob... bucketDefinitions) {
        if (this.bucketDefinitions == null) {
            setBucketDefinitions(new java.util.ArrayList<S3BucketDefinitionForJob>(bucketDefinitions.length));
        }
        for (S3BucketDefinitionForJob ele : bucketDefinitions) {
            this.bucketDefinitions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects, one for each Amazon Web Services account that owns specific S3 buckets to analyze. Each
     * object specifies the account ID for an account and one or more buckets to analyze for that account. A job's
     * definition can contain a bucketDefinitions array or a bucketCriteria object, not both.
     * </p>
     * 
     * @param bucketDefinitions
     *        An array of objects, one for each Amazon Web Services account that owns specific S3 buckets to analyze.
     *        Each object specifies the account ID for an account and one or more buckets to analyze for that account. A
     *        job's definition can contain a bucketDefinitions array or a bucketCriteria object, not both.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3JobDefinition withBucketDefinitions(java.util.Collection<S3BucketDefinitionForJob> bucketDefinitions) {
        setBucketDefinitions(bucketDefinitions);
        return this;
    }

    /**
     * <p>
     * The property- and tag-based conditions that determine which S3 objects to include or exclude from the analysis.
     * Each time the job runs, the job uses these criteria to determine which objects to analyze.
     * </p>
     * 
     * @param scoping
     *        The property- and tag-based conditions that determine which S3 objects to include or exclude from the
     *        analysis. Each time the job runs, the job uses these criteria to determine which objects to analyze.
     */

    public void setScoping(Scoping scoping) {
        this.scoping = scoping;
    }

    /**
     * <p>
     * The property- and tag-based conditions that determine which S3 objects to include or exclude from the analysis.
     * Each time the job runs, the job uses these criteria to determine which objects to analyze.
     * </p>
     * 
     * @return The property- and tag-based conditions that determine which S3 objects to include or exclude from the
     *         analysis. Each time the job runs, the job uses these criteria to determine which objects to analyze.
     */

    public Scoping getScoping() {
        return this.scoping;
    }

    /**
     * <p>
     * The property- and tag-based conditions that determine which S3 objects to include or exclude from the analysis.
     * Each time the job runs, the job uses these criteria to determine which objects to analyze.
     * </p>
     * 
     * @param scoping
     *        The property- and tag-based conditions that determine which S3 objects to include or exclude from the
     *        analysis. Each time the job runs, the job uses these criteria to determine which objects to analyze.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3JobDefinition withScoping(Scoping scoping) {
        setScoping(scoping);
        return this;
    }

    /**
     * <p>
     * The property- and tag-based conditions that determine which S3 buckets to include or exclude from the analysis.
     * Each time the job runs, the job uses these criteria to determine which buckets contain objects to analyze. A
     * job's definition can contain a bucketCriteria object or a bucketDefinitions array, not both.
     * </p>
     * 
     * @param bucketCriteria
     *        The property- and tag-based conditions that determine which S3 buckets to include or exclude from the
     *        analysis. Each time the job runs, the job uses these criteria to determine which buckets contain objects
     *        to analyze. A job's definition can contain a bucketCriteria object or a bucketDefinitions array, not both.
     */

    public void setBucketCriteria(S3BucketCriteriaForJob bucketCriteria) {
        this.bucketCriteria = bucketCriteria;
    }

    /**
     * <p>
     * The property- and tag-based conditions that determine which S3 buckets to include or exclude from the analysis.
     * Each time the job runs, the job uses these criteria to determine which buckets contain objects to analyze. A
     * job's definition can contain a bucketCriteria object or a bucketDefinitions array, not both.
     * </p>
     * 
     * @return The property- and tag-based conditions that determine which S3 buckets to include or exclude from the
     *         analysis. Each time the job runs, the job uses these criteria to determine which buckets contain objects
     *         to analyze. A job's definition can contain a bucketCriteria object or a bucketDefinitions array, not
     *         both.
     */

    public S3BucketCriteriaForJob getBucketCriteria() {
        return this.bucketCriteria;
    }

    /**
     * <p>
     * The property- and tag-based conditions that determine which S3 buckets to include or exclude from the analysis.
     * Each time the job runs, the job uses these criteria to determine which buckets contain objects to analyze. A
     * job's definition can contain a bucketCriteria object or a bucketDefinitions array, not both.
     * </p>
     * 
     * @param bucketCriteria
     *        The property- and tag-based conditions that determine which S3 buckets to include or exclude from the
     *        analysis. Each time the job runs, the job uses these criteria to determine which buckets contain objects
     *        to analyze. A job's definition can contain a bucketCriteria object or a bucketDefinitions array, not both.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3JobDefinition withBucketCriteria(S3BucketCriteriaForJob bucketCriteria) {
        setBucketCriteria(bucketCriteria);
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
        if (getBucketDefinitions() != null)
            sb.append("BucketDefinitions: ").append(getBucketDefinitions()).append(",");
        if (getScoping() != null)
            sb.append("Scoping: ").append(getScoping()).append(",");
        if (getBucketCriteria() != null)
            sb.append("BucketCriteria: ").append(getBucketCriteria());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3JobDefinition == false)
            return false;
        S3JobDefinition other = (S3JobDefinition) obj;
        if (other.getBucketDefinitions() == null ^ this.getBucketDefinitions() == null)
            return false;
        if (other.getBucketDefinitions() != null && other.getBucketDefinitions().equals(this.getBucketDefinitions()) == false)
            return false;
        if (other.getScoping() == null ^ this.getScoping() == null)
            return false;
        if (other.getScoping() != null && other.getScoping().equals(this.getScoping()) == false)
            return false;
        if (other.getBucketCriteria() == null ^ this.getBucketCriteria() == null)
            return false;
        if (other.getBucketCriteria() != null && other.getBucketCriteria().equals(this.getBucketCriteria()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucketDefinitions() == null) ? 0 : getBucketDefinitions().hashCode());
        hashCode = prime * hashCode + ((getScoping() == null) ? 0 : getScoping().hashCode());
        hashCode = prime * hashCode + ((getBucketCriteria() == null) ? 0 : getBucketCriteria().hashCode());
        return hashCode;
    }

    @Override
    public S3JobDefinition clone() {
        try {
            return (S3JobDefinition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.macie2.model.transform.S3JobDefinitionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
