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
package com.amazonaws.services.neptunedata.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/ExecuteOpenCypherExplainQuery"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExecuteOpenCypherExplainQueryRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The openCypher query string.
     * </p>
     */
    private String openCypherQuery;
    /**
     * <p>
     * The openCypher query parameters.
     * </p>
     */
    private String parameters;
    /**
     * <p>
     * The openCypher <code>explain</code> mode. Can be one of: <code>static</code>, <code>dynamic</code>, or
     * <code>details</code>.
     * </p>
     */
    private String explainMode;

    /**
     * <p>
     * The openCypher query string.
     * </p>
     * 
     * @param openCypherQuery
     *        The openCypher query string.
     */

    public void setOpenCypherQuery(String openCypherQuery) {
        this.openCypherQuery = openCypherQuery;
    }

    /**
     * <p>
     * The openCypher query string.
     * </p>
     * 
     * @return The openCypher query string.
     */

    public String getOpenCypherQuery() {
        return this.openCypherQuery;
    }

    /**
     * <p>
     * The openCypher query string.
     * </p>
     * 
     * @param openCypherQuery
     *        The openCypher query string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecuteOpenCypherExplainQueryRequest withOpenCypherQuery(String openCypherQuery) {
        setOpenCypherQuery(openCypherQuery);
        return this;
    }

    /**
     * <p>
     * The openCypher query parameters.
     * </p>
     * 
     * @param parameters
     *        The openCypher query parameters.
     */

    public void setParameters(String parameters) {
        this.parameters = parameters;
    }

    /**
     * <p>
     * The openCypher query parameters.
     * </p>
     * 
     * @return The openCypher query parameters.
     */

    public String getParameters() {
        return this.parameters;
    }

    /**
     * <p>
     * The openCypher query parameters.
     * </p>
     * 
     * @param parameters
     *        The openCypher query parameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecuteOpenCypherExplainQueryRequest withParameters(String parameters) {
        setParameters(parameters);
        return this;
    }

    /**
     * <p>
     * The openCypher <code>explain</code> mode. Can be one of: <code>static</code>, <code>dynamic</code>, or
     * <code>details</code>.
     * </p>
     * 
     * @param explainMode
     *        The openCypher <code>explain</code> mode. Can be one of: <code>static</code>, <code>dynamic</code>, or
     *        <code>details</code>.
     * @see OpenCypherExplainMode
     */

    public void setExplainMode(String explainMode) {
        this.explainMode = explainMode;
    }

    /**
     * <p>
     * The openCypher <code>explain</code> mode. Can be one of: <code>static</code>, <code>dynamic</code>, or
     * <code>details</code>.
     * </p>
     * 
     * @return The openCypher <code>explain</code> mode. Can be one of: <code>static</code>, <code>dynamic</code>, or
     *         <code>details</code>.
     * @see OpenCypherExplainMode
     */

    public String getExplainMode() {
        return this.explainMode;
    }

    /**
     * <p>
     * The openCypher <code>explain</code> mode. Can be one of: <code>static</code>, <code>dynamic</code>, or
     * <code>details</code>.
     * </p>
     * 
     * @param explainMode
     *        The openCypher <code>explain</code> mode. Can be one of: <code>static</code>, <code>dynamic</code>, or
     *        <code>details</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OpenCypherExplainMode
     */

    public ExecuteOpenCypherExplainQueryRequest withExplainMode(String explainMode) {
        setExplainMode(explainMode);
        return this;
    }

    /**
     * <p>
     * The openCypher <code>explain</code> mode. Can be one of: <code>static</code>, <code>dynamic</code>, or
     * <code>details</code>.
     * </p>
     * 
     * @param explainMode
     *        The openCypher <code>explain</code> mode. Can be one of: <code>static</code>, <code>dynamic</code>, or
     *        <code>details</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OpenCypherExplainMode
     */

    public ExecuteOpenCypherExplainQueryRequest withExplainMode(OpenCypherExplainMode explainMode) {
        this.explainMode = explainMode.toString();
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
        if (getOpenCypherQuery() != null)
            sb.append("OpenCypherQuery: ").append(getOpenCypherQuery()).append(",");
        if (getParameters() != null)
            sb.append("Parameters: ").append(getParameters()).append(",");
        if (getExplainMode() != null)
            sb.append("ExplainMode: ").append(getExplainMode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExecuteOpenCypherExplainQueryRequest == false)
            return false;
        ExecuteOpenCypherExplainQueryRequest other = (ExecuteOpenCypherExplainQueryRequest) obj;
        if (other.getOpenCypherQuery() == null ^ this.getOpenCypherQuery() == null)
            return false;
        if (other.getOpenCypherQuery() != null && other.getOpenCypherQuery().equals(this.getOpenCypherQuery()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false)
            return false;
        if (other.getExplainMode() == null ^ this.getExplainMode() == null)
            return false;
        if (other.getExplainMode() != null && other.getExplainMode().equals(this.getExplainMode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOpenCypherQuery() == null) ? 0 : getOpenCypherQuery().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        hashCode = prime * hashCode + ((getExplainMode() == null) ? 0 : getExplainMode().hashCode());
        return hashCode;
    }

    @Override
    public ExecuteOpenCypherExplainQueryRequest clone() {
        return (ExecuteOpenCypherExplainQueryRequest) super.clone();
    }

}
