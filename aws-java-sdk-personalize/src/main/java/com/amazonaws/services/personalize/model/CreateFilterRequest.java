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
     * follow specific format rules. For information about filter expression structure and syntax, see
     * <a>filter-expressions</a>.
     * </p>
     */
    private String filterExpression;

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
     * follow specific format rules. For information about filter expression structure and syntax, see
     * <a>filter-expressions</a>.
     * </p>
     * 
     * @param filterExpression
     *        The filter expression defines which items are included or excluded from recommendations. Filter expression
     *        must follow specific format rules. For information about filter expression structure and syntax, see
     *        <a>filter-expressions</a>.
     */

    public void setFilterExpression(String filterExpression) {
        this.filterExpression = filterExpression;
    }

    /**
     * <p>
     * The filter expression defines which items are included or excluded from recommendations. Filter expression must
     * follow specific format rules. For information about filter expression structure and syntax, see
     * <a>filter-expressions</a>.
     * </p>
     * 
     * @return The filter expression defines which items are included or excluded from recommendations. Filter
     *         expression must follow specific format rules. For information about filter expression structure and
     *         syntax, see <a>filter-expressions</a>.
     */

    public String getFilterExpression() {
        return this.filterExpression;
    }

    /**
     * <p>
     * The filter expression defines which items are included or excluded from recommendations. Filter expression must
     * follow specific format rules. For information about filter expression structure and syntax, see
     * <a>filter-expressions</a>.
     * </p>
     * 
     * @param filterExpression
     *        The filter expression defines which items are included or excluded from recommendations. Filter expression
     *        must follow specific format rules. For information about filter expression structure and syntax, see
     *        <a>filter-expressions</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFilterRequest withFilterExpression(String filterExpression) {
        setFilterExpression(filterExpression);
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
            sb.append("FilterExpression: ").append("***Sensitive Data Redacted***");
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDatasetGroupArn() == null) ? 0 : getDatasetGroupArn().hashCode());
        hashCode = prime * hashCode + ((getFilterExpression() == null) ? 0 : getFilterExpression().hashCode());
        return hashCode;
    }

    @Override
    public CreateFilterRequest clone() {
        return (CreateFilterRequest) super.clone();
    }

}
