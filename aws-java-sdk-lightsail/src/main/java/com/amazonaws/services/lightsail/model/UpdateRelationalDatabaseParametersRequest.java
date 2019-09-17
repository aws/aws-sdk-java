/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/UpdateRelationalDatabaseParameters"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateRelationalDatabaseParametersRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of your database for which to update parameters.
     * </p>
     */
    private String relationalDatabaseName;
    /**
     * <p>
     * The database parameters to update.
     * </p>
     */
    private java.util.List<RelationalDatabaseParameter> parameters;

    /**
     * <p>
     * The name of your database for which to update parameters.
     * </p>
     * 
     * @param relationalDatabaseName
     *        The name of your database for which to update parameters.
     */

    public void setRelationalDatabaseName(String relationalDatabaseName) {
        this.relationalDatabaseName = relationalDatabaseName;
    }

    /**
     * <p>
     * The name of your database for which to update parameters.
     * </p>
     * 
     * @return The name of your database for which to update parameters.
     */

    public String getRelationalDatabaseName() {
        return this.relationalDatabaseName;
    }

    /**
     * <p>
     * The name of your database for which to update parameters.
     * </p>
     * 
     * @param relationalDatabaseName
     *        The name of your database for which to update parameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRelationalDatabaseParametersRequest withRelationalDatabaseName(String relationalDatabaseName) {
        setRelationalDatabaseName(relationalDatabaseName);
        return this;
    }

    /**
     * <p>
     * The database parameters to update.
     * </p>
     * 
     * @return The database parameters to update.
     */

    public java.util.List<RelationalDatabaseParameter> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * The database parameters to update.
     * </p>
     * 
     * @param parameters
     *        The database parameters to update.
     */

    public void setParameters(java.util.Collection<RelationalDatabaseParameter> parameters) {
        if (parameters == null) {
            this.parameters = null;
            return;
        }

        this.parameters = new java.util.ArrayList<RelationalDatabaseParameter>(parameters);
    }

    /**
     * <p>
     * The database parameters to update.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setParameters(java.util.Collection)} or {@link #withParameters(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param parameters
     *        The database parameters to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRelationalDatabaseParametersRequest withParameters(RelationalDatabaseParameter... parameters) {
        if (this.parameters == null) {
            setParameters(new java.util.ArrayList<RelationalDatabaseParameter>(parameters.length));
        }
        for (RelationalDatabaseParameter ele : parameters) {
            this.parameters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The database parameters to update.
     * </p>
     * 
     * @param parameters
     *        The database parameters to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRelationalDatabaseParametersRequest withParameters(java.util.Collection<RelationalDatabaseParameter> parameters) {
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
        if (getRelationalDatabaseName() != null)
            sb.append("RelationalDatabaseName: ").append(getRelationalDatabaseName()).append(",");
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

        if (obj instanceof UpdateRelationalDatabaseParametersRequest == false)
            return false;
        UpdateRelationalDatabaseParametersRequest other = (UpdateRelationalDatabaseParametersRequest) obj;
        if (other.getRelationalDatabaseName() == null ^ this.getRelationalDatabaseName() == null)
            return false;
        if (other.getRelationalDatabaseName() != null && other.getRelationalDatabaseName().equals(this.getRelationalDatabaseName()) == false)
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

        hashCode = prime * hashCode + ((getRelationalDatabaseName() == null) ? 0 : getRelationalDatabaseName().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        return hashCode;
    }

    @Override
    public UpdateRelationalDatabaseParametersRequest clone() {
        return (UpdateRelationalDatabaseParametersRequest) super.clone();
    }

}
