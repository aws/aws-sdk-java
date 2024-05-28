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
package com.amazonaws.services.appsync.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents the output of a <code>DataSourceIntrospectionResult</code>. This is the populated result of a
 * <code>GetDataSourceIntrospection</code> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/DataSourceIntrospectionResult"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataSourceIntrospectionResult implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The array of <code>DataSourceIntrospectionModel</code> objects.
     * </p>
     */
    private java.util.List<DataSourceIntrospectionModel> models;
    /**
     * <p>
     * Determines the number of types to be returned in a single response before paginating. This value is typically
     * taken from <code>nextToken</code> value from the previous response.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The array of <code>DataSourceIntrospectionModel</code> objects.
     * </p>
     * 
     * @return The array of <code>DataSourceIntrospectionModel</code> objects.
     */

    public java.util.List<DataSourceIntrospectionModel> getModels() {
        return models;
    }

    /**
     * <p>
     * The array of <code>DataSourceIntrospectionModel</code> objects.
     * </p>
     * 
     * @param models
     *        The array of <code>DataSourceIntrospectionModel</code> objects.
     */

    public void setModels(java.util.Collection<DataSourceIntrospectionModel> models) {
        if (models == null) {
            this.models = null;
            return;
        }

        this.models = new java.util.ArrayList<DataSourceIntrospectionModel>(models);
    }

    /**
     * <p>
     * The array of <code>DataSourceIntrospectionModel</code> objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setModels(java.util.Collection)} or {@link #withModels(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param models
     *        The array of <code>DataSourceIntrospectionModel</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceIntrospectionResult withModels(DataSourceIntrospectionModel... models) {
        if (this.models == null) {
            setModels(new java.util.ArrayList<DataSourceIntrospectionModel>(models.length));
        }
        for (DataSourceIntrospectionModel ele : models) {
            this.models.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The array of <code>DataSourceIntrospectionModel</code> objects.
     * </p>
     * 
     * @param models
     *        The array of <code>DataSourceIntrospectionModel</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceIntrospectionResult withModels(java.util.Collection<DataSourceIntrospectionModel> models) {
        setModels(models);
        return this;
    }

    /**
     * <p>
     * Determines the number of types to be returned in a single response before paginating. This value is typically
     * taken from <code>nextToken</code> value from the previous response.
     * </p>
     * 
     * @param nextToken
     *        Determines the number of types to be returned in a single response before paginating. This value is
     *        typically taken from <code>nextToken</code> value from the previous response.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Determines the number of types to be returned in a single response before paginating. This value is typically
     * taken from <code>nextToken</code> value from the previous response.
     * </p>
     * 
     * @return Determines the number of types to be returned in a single response before paginating. This value is
     *         typically taken from <code>nextToken</code> value from the previous response.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Determines the number of types to be returned in a single response before paginating. This value is typically
     * taken from <code>nextToken</code> value from the previous response.
     * </p>
     * 
     * @param nextToken
     *        Determines the number of types to be returned in a single response before paginating. This value is
     *        typically taken from <code>nextToken</code> value from the previous response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceIntrospectionResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getModels() != null)
            sb.append("Models: ").append(getModels()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataSourceIntrospectionResult == false)
            return false;
        DataSourceIntrospectionResult other = (DataSourceIntrospectionResult) obj;
        if (other.getModels() == null ^ this.getModels() == null)
            return false;
        if (other.getModels() != null && other.getModels().equals(this.getModels()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getModels() == null) ? 0 : getModels().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DataSourceIntrospectionResult clone() {
        try {
            return (DataSourceIntrospectionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appsync.model.transform.DataSourceIntrospectionResultMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
