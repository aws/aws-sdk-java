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
package com.amazonaws.services.timestreamquery.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-query-2018-11-01/PrepareQuery" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PrepareQueryResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The query string that you want prepare.
     * </p>
     */
    private String queryString;
    /**
     * <p>
     * A list of SELECT clause columns of the submitted query string.
     * </p>
     */
    private java.util.List<SelectColumn> columns;
    /**
     * <p>
     * A list of parameters used in the submitted query string.
     * </p>
     */
    private java.util.List<ParameterMapping> parameters;

    /**
     * <p>
     * The query string that you want prepare.
     * </p>
     * 
     * @param queryString
     *        The query string that you want prepare.
     */

    public void setQueryString(String queryString) {
        this.queryString = queryString;
    }

    /**
     * <p>
     * The query string that you want prepare.
     * </p>
     * 
     * @return The query string that you want prepare.
     */

    public String getQueryString() {
        return this.queryString;
    }

    /**
     * <p>
     * The query string that you want prepare.
     * </p>
     * 
     * @param queryString
     *        The query string that you want prepare.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PrepareQueryResult withQueryString(String queryString) {
        setQueryString(queryString);
        return this;
    }

    /**
     * <p>
     * A list of SELECT clause columns of the submitted query string.
     * </p>
     * 
     * @return A list of SELECT clause columns of the submitted query string.
     */

    public java.util.List<SelectColumn> getColumns() {
        return columns;
    }

    /**
     * <p>
     * A list of SELECT clause columns of the submitted query string.
     * </p>
     * 
     * @param columns
     *        A list of SELECT clause columns of the submitted query string.
     */

    public void setColumns(java.util.Collection<SelectColumn> columns) {
        if (columns == null) {
            this.columns = null;
            return;
        }

        this.columns = new java.util.ArrayList<SelectColumn>(columns);
    }

    /**
     * <p>
     * A list of SELECT clause columns of the submitted query string.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setColumns(java.util.Collection)} or {@link #withColumns(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param columns
     *        A list of SELECT clause columns of the submitted query string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PrepareQueryResult withColumns(SelectColumn... columns) {
        if (this.columns == null) {
            setColumns(new java.util.ArrayList<SelectColumn>(columns.length));
        }
        for (SelectColumn ele : columns) {
            this.columns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of SELECT clause columns of the submitted query string.
     * </p>
     * 
     * @param columns
     *        A list of SELECT clause columns of the submitted query string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PrepareQueryResult withColumns(java.util.Collection<SelectColumn> columns) {
        setColumns(columns);
        return this;
    }

    /**
     * <p>
     * A list of parameters used in the submitted query string.
     * </p>
     * 
     * @return A list of parameters used in the submitted query string.
     */

    public java.util.List<ParameterMapping> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * A list of parameters used in the submitted query string.
     * </p>
     * 
     * @param parameters
     *        A list of parameters used in the submitted query string.
     */

    public void setParameters(java.util.Collection<ParameterMapping> parameters) {
        if (parameters == null) {
            this.parameters = null;
            return;
        }

        this.parameters = new java.util.ArrayList<ParameterMapping>(parameters);
    }

    /**
     * <p>
     * A list of parameters used in the submitted query string.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setParameters(java.util.Collection)} or {@link #withParameters(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param parameters
     *        A list of parameters used in the submitted query string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PrepareQueryResult withParameters(ParameterMapping... parameters) {
        if (this.parameters == null) {
            setParameters(new java.util.ArrayList<ParameterMapping>(parameters.length));
        }
        for (ParameterMapping ele : parameters) {
            this.parameters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of parameters used in the submitted query string.
     * </p>
     * 
     * @param parameters
     *        A list of parameters used in the submitted query string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PrepareQueryResult withParameters(java.util.Collection<ParameterMapping> parameters) {
        setParameters(parameters);
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
        if (getQueryString() != null)
            sb.append("QueryString: ").append("***Sensitive Data Redacted***").append(",");
        if (getColumns() != null)
            sb.append("Columns: ").append(getColumns()).append(",");
        if (getParameters() != null)
            sb.append("Parameters: ").append(getParameters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PrepareQueryResult == false)
            return false;
        PrepareQueryResult other = (PrepareQueryResult) obj;
        if (other.getQueryString() == null ^ this.getQueryString() == null)
            return false;
        if (other.getQueryString() != null && other.getQueryString().equals(this.getQueryString()) == false)
            return false;
        if (other.getColumns() == null ^ this.getColumns() == null)
            return false;
        if (other.getColumns() != null && other.getColumns().equals(this.getColumns()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getQueryString() == null) ? 0 : getQueryString().hashCode());
        hashCode = prime * hashCode + ((getColumns() == null) ? 0 : getColumns().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        return hashCode;
    }

    @Override
    public PrepareQueryResult clone() {
        try {
            return (PrepareQueryResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
