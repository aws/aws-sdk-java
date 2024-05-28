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
package com.amazonaws.services.cleanrooms.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The parameters for the SQL type Protected Query.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/ProtectedQuerySQLParameters"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProtectedQuerySQLParameters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The query string to be submitted.
     * </p>
     */
    private String queryString;
    /**
     * <p>
     * The Amazon Resource Name (ARN) associated with the analysis template within a collaboration.
     * </p>
     */
    private String analysisTemplateArn;
    /**
     * <p>
     * The protected query SQL parameters.
     * </p>
     */
    private java.util.Map<String, String> parameters;

    /**
     * <p>
     * The query string to be submitted.
     * </p>
     * 
     * @param queryString
     *        The query string to be submitted.
     */

    public void setQueryString(String queryString) {
        this.queryString = queryString;
    }

    /**
     * <p>
     * The query string to be submitted.
     * </p>
     * 
     * @return The query string to be submitted.
     */

    public String getQueryString() {
        return this.queryString;
    }

    /**
     * <p>
     * The query string to be submitted.
     * </p>
     * 
     * @param queryString
     *        The query string to be submitted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProtectedQuerySQLParameters withQueryString(String queryString) {
        setQueryString(queryString);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) associated with the analysis template within a collaboration.
     * </p>
     * 
     * @param analysisTemplateArn
     *        The Amazon Resource Name (ARN) associated with the analysis template within a collaboration.
     */

    public void setAnalysisTemplateArn(String analysisTemplateArn) {
        this.analysisTemplateArn = analysisTemplateArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) associated with the analysis template within a collaboration.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) associated with the analysis template within a collaboration.
     */

    public String getAnalysisTemplateArn() {
        return this.analysisTemplateArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) associated with the analysis template within a collaboration.
     * </p>
     * 
     * @param analysisTemplateArn
     *        The Amazon Resource Name (ARN) associated with the analysis template within a collaboration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProtectedQuerySQLParameters withAnalysisTemplateArn(String analysisTemplateArn) {
        setAnalysisTemplateArn(analysisTemplateArn);
        return this;
    }

    /**
     * <p>
     * The protected query SQL parameters.
     * </p>
     * 
     * @return The protected query SQL parameters.
     */

    public java.util.Map<String, String> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * The protected query SQL parameters.
     * </p>
     * 
     * @param parameters
     *        The protected query SQL parameters.
     */

    public void setParameters(java.util.Map<String, String> parameters) {
        this.parameters = parameters;
    }

    /**
     * <p>
     * The protected query SQL parameters.
     * </p>
     * 
     * @param parameters
     *        The protected query SQL parameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProtectedQuerySQLParameters withParameters(java.util.Map<String, String> parameters) {
        setParameters(parameters);
        return this;
    }

    /**
     * Add a single Parameters entry
     *
     * @see ProtectedQuerySQLParameters#withParameters
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ProtectedQuerySQLParameters addParametersEntry(String key, String value) {
        if (null == this.parameters) {
            this.parameters = new java.util.HashMap<String, String>();
        }
        if (this.parameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.parameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Parameters.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProtectedQuerySQLParameters clearParametersEntries() {
        this.parameters = null;
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
            sb.append("QueryString: ").append(getQueryString()).append(",");
        if (getAnalysisTemplateArn() != null)
            sb.append("AnalysisTemplateArn: ").append(getAnalysisTemplateArn()).append(",");
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

        if (obj instanceof ProtectedQuerySQLParameters == false)
            return false;
        ProtectedQuerySQLParameters other = (ProtectedQuerySQLParameters) obj;
        if (other.getQueryString() == null ^ this.getQueryString() == null)
            return false;
        if (other.getQueryString() != null && other.getQueryString().equals(this.getQueryString()) == false)
            return false;
        if (other.getAnalysisTemplateArn() == null ^ this.getAnalysisTemplateArn() == null)
            return false;
        if (other.getAnalysisTemplateArn() != null && other.getAnalysisTemplateArn().equals(this.getAnalysisTemplateArn()) == false)
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
        hashCode = prime * hashCode + ((getAnalysisTemplateArn() == null) ? 0 : getAnalysisTemplateArn().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        return hashCode;
    }

    @Override
    public ProtectedQuerySQLParameters clone() {
        try {
            return (ProtectedQuerySQLParameters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cleanrooms.model.transform.ProtectedQuerySQLParametersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
