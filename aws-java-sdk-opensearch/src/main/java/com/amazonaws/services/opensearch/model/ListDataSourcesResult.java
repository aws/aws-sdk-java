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
package com.amazonaws.services.opensearch.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The result of a <code>ListDataSources</code> operation.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDataSourcesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of data sources associated with specified domain.
     * </p>
     */
    private java.util.List<DataSourceDetails> dataSources;

    /**
     * <p>
     * A list of data sources associated with specified domain.
     * </p>
     * 
     * @return A list of data sources associated with specified domain.
     */

    public java.util.List<DataSourceDetails> getDataSources() {
        return dataSources;
    }

    /**
     * <p>
     * A list of data sources associated with specified domain.
     * </p>
     * 
     * @param dataSources
     *        A list of data sources associated with specified domain.
     */

    public void setDataSources(java.util.Collection<DataSourceDetails> dataSources) {
        if (dataSources == null) {
            this.dataSources = null;
            return;
        }

        this.dataSources = new java.util.ArrayList<DataSourceDetails>(dataSources);
    }

    /**
     * <p>
     * A list of data sources associated with specified domain.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDataSources(java.util.Collection)} or {@link #withDataSources(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param dataSources
     *        A list of data sources associated with specified domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDataSourcesResult withDataSources(DataSourceDetails... dataSources) {
        if (this.dataSources == null) {
            setDataSources(new java.util.ArrayList<DataSourceDetails>(dataSources.length));
        }
        for (DataSourceDetails ele : dataSources) {
            this.dataSources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of data sources associated with specified domain.
     * </p>
     * 
     * @param dataSources
     *        A list of data sources associated with specified domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDataSourcesResult withDataSources(java.util.Collection<DataSourceDetails> dataSources) {
        setDataSources(dataSources);
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
        if (getDataSources() != null)
            sb.append("DataSources: ").append(getDataSources());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListDataSourcesResult == false)
            return false;
        ListDataSourcesResult other = (ListDataSourcesResult) obj;
        if (other.getDataSources() == null ^ this.getDataSources() == null)
            return false;
        if (other.getDataSources() != null && other.getDataSources().equals(this.getDataSources()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDataSources() == null) ? 0 : getDataSources().hashCode());
        return hashCode;
    }

    @Override
    public ListDataSourcesResult clone() {
        try {
            return (ListDataSourcesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
