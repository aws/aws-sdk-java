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
package com.amazonaws.services.deadline.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The resources to search.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/SearchSortExpression" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SearchSortExpression implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Options for sorting by a field.
     * </p>
     */
    private FieldSortExpression fieldSort;
    /**
     * <p>
     * Options for sorting by a parameter.
     * </p>
     */
    private ParameterSortExpression parameterSort;
    /**
     * <p>
     * Options for sorting a particular user's jobs first.
     * </p>
     */
    private UserJobsFirst userJobsFirst;

    /**
     * <p>
     * Options for sorting by a field.
     * </p>
     * 
     * @param fieldSort
     *        Options for sorting by a field.
     */

    public void setFieldSort(FieldSortExpression fieldSort) {
        this.fieldSort = fieldSort;
    }

    /**
     * <p>
     * Options for sorting by a field.
     * </p>
     * 
     * @return Options for sorting by a field.
     */

    public FieldSortExpression getFieldSort() {
        return this.fieldSort;
    }

    /**
     * <p>
     * Options for sorting by a field.
     * </p>
     * 
     * @param fieldSort
     *        Options for sorting by a field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchSortExpression withFieldSort(FieldSortExpression fieldSort) {
        setFieldSort(fieldSort);
        return this;
    }

    /**
     * <p>
     * Options for sorting by a parameter.
     * </p>
     * 
     * @param parameterSort
     *        Options for sorting by a parameter.
     */

    public void setParameterSort(ParameterSortExpression parameterSort) {
        this.parameterSort = parameterSort;
    }

    /**
     * <p>
     * Options for sorting by a parameter.
     * </p>
     * 
     * @return Options for sorting by a parameter.
     */

    public ParameterSortExpression getParameterSort() {
        return this.parameterSort;
    }

    /**
     * <p>
     * Options for sorting by a parameter.
     * </p>
     * 
     * @param parameterSort
     *        Options for sorting by a parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchSortExpression withParameterSort(ParameterSortExpression parameterSort) {
        setParameterSort(parameterSort);
        return this;
    }

    /**
     * <p>
     * Options for sorting a particular user's jobs first.
     * </p>
     * 
     * @param userJobsFirst
     *        Options for sorting a particular user's jobs first.
     */

    public void setUserJobsFirst(UserJobsFirst userJobsFirst) {
        this.userJobsFirst = userJobsFirst;
    }

    /**
     * <p>
     * Options for sorting a particular user's jobs first.
     * </p>
     * 
     * @return Options for sorting a particular user's jobs first.
     */

    public UserJobsFirst getUserJobsFirst() {
        return this.userJobsFirst;
    }

    /**
     * <p>
     * Options for sorting a particular user's jobs first.
     * </p>
     * 
     * @param userJobsFirst
     *        Options for sorting a particular user's jobs first.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchSortExpression withUserJobsFirst(UserJobsFirst userJobsFirst) {
        setUserJobsFirst(userJobsFirst);
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
        if (getFieldSort() != null)
            sb.append("FieldSort: ").append(getFieldSort()).append(",");
        if (getParameterSort() != null)
            sb.append("ParameterSort: ").append(getParameterSort()).append(",");
        if (getUserJobsFirst() != null)
            sb.append("UserJobsFirst: ").append(getUserJobsFirst());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SearchSortExpression == false)
            return false;
        SearchSortExpression other = (SearchSortExpression) obj;
        if (other.getFieldSort() == null ^ this.getFieldSort() == null)
            return false;
        if (other.getFieldSort() != null && other.getFieldSort().equals(this.getFieldSort()) == false)
            return false;
        if (other.getParameterSort() == null ^ this.getParameterSort() == null)
            return false;
        if (other.getParameterSort() != null && other.getParameterSort().equals(this.getParameterSort()) == false)
            return false;
        if (other.getUserJobsFirst() == null ^ this.getUserJobsFirst() == null)
            return false;
        if (other.getUserJobsFirst() != null && other.getUserJobsFirst().equals(this.getUserJobsFirst()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFieldSort() == null) ? 0 : getFieldSort().hashCode());
        hashCode = prime * hashCode + ((getParameterSort() == null) ? 0 : getParameterSort().hashCode());
        hashCode = prime * hashCode + ((getUserJobsFirst() == null) ? 0 : getUserJobsFirst().hashCode());
        return hashCode;
    }

    @Override
    public SearchSortExpression clone() {
        try {
            return (SearchSortExpression) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.deadline.model.transform.SearchSortExpressionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
