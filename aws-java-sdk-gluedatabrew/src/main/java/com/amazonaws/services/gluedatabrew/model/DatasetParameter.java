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
package com.amazonaws.services.gluedatabrew.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents a dataset paramater that defines type and conditions for a parameter in the Amazon S3 path of the dataset.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/DatasetParameter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DatasetParameter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the parameter that is used in the dataset's Amazon S3 path.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The type of the dataset parameter, can be one of a 'String', 'Number' or 'Datetime'.
     * </p>
     */
    private String type;
    /**
     * <p>
     * Additional parameter options such as a format and a timezone. Required for datetime parameters.
     * </p>
     */
    private DatetimeOptions datetimeOptions;
    /**
     * <p>
     * Optional boolean value that defines whether the captured value of this parameter should be used to create a new
     * column in a dataset.
     * </p>
     */
    private Boolean createColumn;
    /**
     * <p>
     * The optional filter expression structure to apply additional matching criteria to the parameter.
     * </p>
     */
    private FilterExpression filter;

    /**
     * <p>
     * The name of the parameter that is used in the dataset's Amazon S3 path.
     * </p>
     * 
     * @param name
     *        The name of the parameter that is used in the dataset's Amazon S3 path.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the parameter that is used in the dataset's Amazon S3 path.
     * </p>
     * 
     * @return The name of the parameter that is used in the dataset's Amazon S3 path.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the parameter that is used in the dataset's Amazon S3 path.
     * </p>
     * 
     * @param name
     *        The name of the parameter that is used in the dataset's Amazon S3 path.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetParameter withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The type of the dataset parameter, can be one of a 'String', 'Number' or 'Datetime'.
     * </p>
     * 
     * @param type
     *        The type of the dataset parameter, can be one of a 'String', 'Number' or 'Datetime'.
     * @see ParameterType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the dataset parameter, can be one of a 'String', 'Number' or 'Datetime'.
     * </p>
     * 
     * @return The type of the dataset parameter, can be one of a 'String', 'Number' or 'Datetime'.
     * @see ParameterType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the dataset parameter, can be one of a 'String', 'Number' or 'Datetime'.
     * </p>
     * 
     * @param type
     *        The type of the dataset parameter, can be one of a 'String', 'Number' or 'Datetime'.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ParameterType
     */

    public DatasetParameter withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of the dataset parameter, can be one of a 'String', 'Number' or 'Datetime'.
     * </p>
     * 
     * @param type
     *        The type of the dataset parameter, can be one of a 'String', 'Number' or 'Datetime'.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ParameterType
     */

    public DatasetParameter withType(ParameterType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * Additional parameter options such as a format and a timezone. Required for datetime parameters.
     * </p>
     * 
     * @param datetimeOptions
     *        Additional parameter options such as a format and a timezone. Required for datetime parameters.
     */

    public void setDatetimeOptions(DatetimeOptions datetimeOptions) {
        this.datetimeOptions = datetimeOptions;
    }

    /**
     * <p>
     * Additional parameter options such as a format and a timezone. Required for datetime parameters.
     * </p>
     * 
     * @return Additional parameter options such as a format and a timezone. Required for datetime parameters.
     */

    public DatetimeOptions getDatetimeOptions() {
        return this.datetimeOptions;
    }

    /**
     * <p>
     * Additional parameter options such as a format and a timezone. Required for datetime parameters.
     * </p>
     * 
     * @param datetimeOptions
     *        Additional parameter options such as a format and a timezone. Required for datetime parameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetParameter withDatetimeOptions(DatetimeOptions datetimeOptions) {
        setDatetimeOptions(datetimeOptions);
        return this;
    }

    /**
     * <p>
     * Optional boolean value that defines whether the captured value of this parameter should be used to create a new
     * column in a dataset.
     * </p>
     * 
     * @param createColumn
     *        Optional boolean value that defines whether the captured value of this parameter should be used to create
     *        a new column in a dataset.
     */

    public void setCreateColumn(Boolean createColumn) {
        this.createColumn = createColumn;
    }

    /**
     * <p>
     * Optional boolean value that defines whether the captured value of this parameter should be used to create a new
     * column in a dataset.
     * </p>
     * 
     * @return Optional boolean value that defines whether the captured value of this parameter should be used to create
     *         a new column in a dataset.
     */

    public Boolean getCreateColumn() {
        return this.createColumn;
    }

    /**
     * <p>
     * Optional boolean value that defines whether the captured value of this parameter should be used to create a new
     * column in a dataset.
     * </p>
     * 
     * @param createColumn
     *        Optional boolean value that defines whether the captured value of this parameter should be used to create
     *        a new column in a dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetParameter withCreateColumn(Boolean createColumn) {
        setCreateColumn(createColumn);
        return this;
    }

    /**
     * <p>
     * Optional boolean value that defines whether the captured value of this parameter should be used to create a new
     * column in a dataset.
     * </p>
     * 
     * @return Optional boolean value that defines whether the captured value of this parameter should be used to create
     *         a new column in a dataset.
     */

    public Boolean isCreateColumn() {
        return this.createColumn;
    }

    /**
     * <p>
     * The optional filter expression structure to apply additional matching criteria to the parameter.
     * </p>
     * 
     * @param filter
     *        The optional filter expression structure to apply additional matching criteria to the parameter.
     */

    public void setFilter(FilterExpression filter) {
        this.filter = filter;
    }

    /**
     * <p>
     * The optional filter expression structure to apply additional matching criteria to the parameter.
     * </p>
     * 
     * @return The optional filter expression structure to apply additional matching criteria to the parameter.
     */

    public FilterExpression getFilter() {
        return this.filter;
    }

    /**
     * <p>
     * The optional filter expression structure to apply additional matching criteria to the parameter.
     * </p>
     * 
     * @param filter
     *        The optional filter expression structure to apply additional matching criteria to the parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetParameter withFilter(FilterExpression filter) {
        setFilter(filter);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getDatetimeOptions() != null)
            sb.append("DatetimeOptions: ").append(getDatetimeOptions()).append(",");
        if (getCreateColumn() != null)
            sb.append("CreateColumn: ").append(getCreateColumn()).append(",");
        if (getFilter() != null)
            sb.append("Filter: ").append(getFilter());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DatasetParameter == false)
            return false;
        DatasetParameter other = (DatasetParameter) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getDatetimeOptions() == null ^ this.getDatetimeOptions() == null)
            return false;
        if (other.getDatetimeOptions() != null && other.getDatetimeOptions().equals(this.getDatetimeOptions()) == false)
            return false;
        if (other.getCreateColumn() == null ^ this.getCreateColumn() == null)
            return false;
        if (other.getCreateColumn() != null && other.getCreateColumn().equals(this.getCreateColumn()) == false)
            return false;
        if (other.getFilter() == null ^ this.getFilter() == null)
            return false;
        if (other.getFilter() != null && other.getFilter().equals(this.getFilter()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getDatetimeOptions() == null) ? 0 : getDatetimeOptions().hashCode());
        hashCode = prime * hashCode + ((getCreateColumn() == null) ? 0 : getCreateColumn().hashCode());
        hashCode = prime * hashCode + ((getFilter() == null) ? 0 : getFilter().hashCode());
        return hashCode;
    }

    @Override
    public DatasetParameter clone() {
        try {
            return (DatasetParameter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.gluedatabrew.model.transform.DatasetParameterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
