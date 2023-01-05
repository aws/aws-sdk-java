/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.personalize.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/CreateFilter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateFilterRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the filter to create.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The ARN of the dataset group that the filter will belong to.
     * </p>
     */
    private String datasetGroupArn;
    /**
     * <p>
     * The filter expression defines which items are included or excluded from recommendations. Filter expression must
     * follow specific format rules. For information about filter expression structure and syntax, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/filter-expressions.html">Filter expressions</a>.
     * </p>
     */
    private String filterExpression;
    /**
     * <p>
     * A list of <a href="https://docs.aws.amazon.com/personalize/latest/dev/tagging-resources.html">tags</a> to apply
     * to the filter.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name of the filter to create.
     * </p>
     * 
     * @param name
     *        The name of the filter to create.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the filter to create.
     * </p>
     * 
     * @return The name of the filter to create.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the filter to create.
     * </p>
     * 
     * @param name
     *        The name of the filter to create.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFilterRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The ARN of the dataset group that the filter will belong to.
     * </p>
     * 
     * @param datasetGroupArn
     *        The ARN of the dataset group that the filter will belong to.
     */

    public void setDatasetGroupArn(String datasetGroupArn) {
        this.datasetGroupArn = datasetGroupArn;
    }

    /**
     * <p>
     * The ARN of the dataset group that the filter will belong to.
     * </p>
     * 
     * @return The ARN of the dataset group that the filter will belong to.
     */

    public String getDatasetGroupArn() {
        return this.datasetGroupArn;
    }

    /**
     * <p>
     * The ARN of the dataset group that the filter will belong to.
     * </p>
     * 
     * @param datasetGroupArn
     *        The ARN of the dataset group that the filter will belong to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFilterRequest withDatasetGroupArn(String datasetGroupArn) {
        setDatasetGroupArn(datasetGroupArn);
        return this;
    }

    /**
     * <p>
     * The filter expression defines which items are included or excluded from recommendations. Filter expression must
     * follow specific format rules. For information about filter expression structure and syntax, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/filter-expressions.html">Filter expressions</a>.
     * </p>
     * 
     * @param filterExpression
     *        The filter expression defines which items are included or excluded from recommendations. Filter expression
     *        must follow specific format rules. For information about filter expression structure and syntax, see <a
     *        href="https://docs.aws.amazon.com/personalize/latest/dg/filter-expressions.html">Filter expressions</a>.
     */

    public void setFilterExpression(String filterExpression) {
        this.filterExpression = filterExpression;
    }

    /**
     * <p>
     * The filter expression defines which items are included or excluded from recommendations. Filter expression must
     * follow specific format rules. For information about filter expression structure and syntax, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/filter-expressions.html">Filter expressions</a>.
     * </p>
     * 
     * @return The filter expression defines which items are included or excluded from recommendations. Filter
     *         expression must follow specific format rules. For information about filter expression structure and
     *         syntax, see <a href="https://docs.aws.amazon.com/personalize/latest/dg/filter-expressions.html">Filter
     *         expressions</a>.
     */

    public String getFilterExpression() {
        return this.filterExpression;
    }

    /**
     * <p>
     * The filter expression defines which items are included or excluded from recommendations. Filter expression must
     * follow specific format rules. For information about filter expression structure and syntax, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/filter-expressions.html">Filter expressions</a>.
     * </p>
     * 
     * @param filterExpression
     *        The filter expression defines which items are included or excluded from recommendations. Filter expression
     *        must follow specific format rules. For information about filter expression structure and syntax, see <a
     *        href="https://docs.aws.amazon.com/personalize/latest/dg/filter-expressions.html">Filter expressions</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFilterRequest withFilterExpression(String filterExpression) {
        setFilterExpression(filterExpression);
        return this;
    }

    /**
     * <p>
     * A list of <a href="https://docs.aws.amazon.com/personalize/latest/dev/tagging-resources.html">tags</a> to apply
     * to the filter.
     * </p>
     * 
     * @return A list of <a href="https://docs.aws.amazon.com/personalize/latest/dev/tagging-resources.html">tags</a> to
     *         apply to the filter.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of <a href="https://docs.aws.amazon.com/personalize/latest/dev/tagging-resources.html">tags</a> to apply
     * to the filter.
     * </p>
     * 
     * @param tags
     *        A list of <a href="https://docs.aws.amazon.com/personalize/latest/dev/tagging-resources.html">tags</a> to
     *        apply to the filter.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * A list of <a href="https://docs.aws.amazon.com/personalize/latest/dev/tagging-resources.html">tags</a> to apply
     * to the filter.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of <a href="https://docs.aws.amazon.com/personalize/latest/dev/tagging-resources.html">tags</a> to
     *        apply to the filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFilterRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <a href="https://docs.aws.amazon.com/personalize/latest/dev/tagging-resources.html">tags</a> to apply
     * to the filter.
     * </p>
     * 
     * @param tags
     *        A list of <a href="https://docs.aws.amazon.com/personalize/latest/dev/tagging-resources.html">tags</a> to
     *        apply to the filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFilterRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDatasetGroupArn() != null)
            sb.append("DatasetGroupArn: ").append(getDatasetGroupArn()).append(",");
        if (getFilterExpression() != null)
            sb.append("FilterExpression: ").append("***Sensitive Data Redacted***").append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateFilterRequest == false)
            return false;
        CreateFilterRequest other = (CreateFilterRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDatasetGroupArn() == null ^ this.getDatasetGroupArn() == null)
            return false;
        if (other.getDatasetGroupArn() != null && other.getDatasetGroupArn().equals(this.getDatasetGroupArn()) == false)
            return false;
        if (other.getFilterExpression() == null ^ this.getFilterExpression() == null)
            return false;
        if (other.getFilterExpression() != null && other.getFilterExpression().equals(this.getFilterExpression()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDatasetGroupArn() == null) ? 0 : getDatasetGroupArn().hashCode());
        hashCode = prime * hashCode + ((getFilterExpression() == null) ? 0 : getFilterExpression().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateFilterRequest clone() {
        return (CreateFilterRequest) super.clone();
    }

}
