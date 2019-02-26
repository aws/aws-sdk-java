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
package com.amazonaws.services.athena.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/StartQueryExecution" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartQueryExecutionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The SQL query statements to be executed.
     * </p>
     */
    private String queryString;
    /**
     * <p>
     * A unique case-sensitive string used to ensure the request to create the query is idempotent (executes only once).
     * If another <code>StartQueryExecution</code> request is received, the same response is returned and another query
     * is not created. If a parameter has changed, for example, the <code>QueryString</code>, an error is returned.
     * </p>
     * <important>
     * <p>
     * This token is listed as not required because AWS SDKs (for example the AWS SDK for Java) auto-generate the token
     * for users. If you are not using the AWS SDK or the AWS CLI, you must provide this token or the action will fail.
     * </p>
     * </important>
     */
    private String clientRequestToken;
    /**
     * <p>
     * The database within which the query executes.
     * </p>
     */
    private QueryExecutionContext queryExecutionContext;
    /**
     * <p>
     * Specifies information about where and how to save the results of the query execution. If the query runs in a
     * workgroup, then workgroup's settings may override query settings. This affects the query results location. The
     * workgroup settings override is specified in EnforceWorkGroupConfiguration (true/false) in the
     * WorkGroupConfiguration. See <a>WorkGroupConfiguration$EnforceWorkGroupConfiguration</a>.
     * </p>
     */
    private ResultConfiguration resultConfiguration;
    /**
     * <p>
     * The name of the workgroup in which the query is being started.
     * </p>
     */
    private String workGroup;

    /**
     * <p>
     * The SQL query statements to be executed.
     * </p>
     * 
     * @param queryString
     *        The SQL query statements to be executed.
     */

    public void setQueryString(String queryString) {
        this.queryString = queryString;
    }

    /**
     * <p>
     * The SQL query statements to be executed.
     * </p>
     * 
     * @return The SQL query statements to be executed.
     */

    public String getQueryString() {
        return this.queryString;
    }

    /**
     * <p>
     * The SQL query statements to be executed.
     * </p>
     * 
     * @param queryString
     *        The SQL query statements to be executed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartQueryExecutionRequest withQueryString(String queryString) {
        setQueryString(queryString);
        return this;
    }

    /**
     * <p>
     * A unique case-sensitive string used to ensure the request to create the query is idempotent (executes only once).
     * If another <code>StartQueryExecution</code> request is received, the same response is returned and another query
     * is not created. If a parameter has changed, for example, the <code>QueryString</code>, an error is returned.
     * </p>
     * <important>
     * <p>
     * This token is listed as not required because AWS SDKs (for example the AWS SDK for Java) auto-generate the token
     * for users. If you are not using the AWS SDK or the AWS CLI, you must provide this token or the action will fail.
     * </p>
     * </important>
     * 
     * @param clientRequestToken
     *        A unique case-sensitive string used to ensure the request to create the query is idempotent (executes only
     *        once). If another <code>StartQueryExecution</code> request is received, the same response is returned and
     *        another query is not created. If a parameter has changed, for example, the <code>QueryString</code>, an
     *        error is returned.</p> <important>
     *        <p>
     *        This token is listed as not required because AWS SDKs (for example the AWS SDK for Java) auto-generate the
     *        token for users. If you are not using the AWS SDK or the AWS CLI, you must provide this token or the
     *        action will fail.
     *        </p>
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * A unique case-sensitive string used to ensure the request to create the query is idempotent (executes only once).
     * If another <code>StartQueryExecution</code> request is received, the same response is returned and another query
     * is not created. If a parameter has changed, for example, the <code>QueryString</code>, an error is returned.
     * </p>
     * <important>
     * <p>
     * This token is listed as not required because AWS SDKs (for example the AWS SDK for Java) auto-generate the token
     * for users. If you are not using the AWS SDK or the AWS CLI, you must provide this token or the action will fail.
     * </p>
     * </important>
     * 
     * @return A unique case-sensitive string used to ensure the request to create the query is idempotent (executes
     *         only once). If another <code>StartQueryExecution</code> request is received, the same response is
     *         returned and another query is not created. If a parameter has changed, for example, the
     *         <code>QueryString</code>, an error is returned.</p> <important>
     *         <p>
     *         This token is listed as not required because AWS SDKs (for example the AWS SDK for Java) auto-generate
     *         the token for users. If you are not using the AWS SDK or the AWS CLI, you must provide this token or the
     *         action will fail.
     *         </p>
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * <p>
     * A unique case-sensitive string used to ensure the request to create the query is idempotent (executes only once).
     * If another <code>StartQueryExecution</code> request is received, the same response is returned and another query
     * is not created. If a parameter has changed, for example, the <code>QueryString</code>, an error is returned.
     * </p>
     * <important>
     * <p>
     * This token is listed as not required because AWS SDKs (for example the AWS SDK for Java) auto-generate the token
     * for users. If you are not using the AWS SDK or the AWS CLI, you must provide this token or the action will fail.
     * </p>
     * </important>
     * 
     * @param clientRequestToken
     *        A unique case-sensitive string used to ensure the request to create the query is idempotent (executes only
     *        once). If another <code>StartQueryExecution</code> request is received, the same response is returned and
     *        another query is not created. If a parameter has changed, for example, the <code>QueryString</code>, an
     *        error is returned.</p> <important>
     *        <p>
     *        This token is listed as not required because AWS SDKs (for example the AWS SDK for Java) auto-generate the
     *        token for users. If you are not using the AWS SDK or the AWS CLI, you must provide this token or the
     *        action will fail.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartQueryExecutionRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
        return this;
    }

    /**
     * <p>
     * The database within which the query executes.
     * </p>
     * 
     * @param queryExecutionContext
     *        The database within which the query executes.
     */

    public void setQueryExecutionContext(QueryExecutionContext queryExecutionContext) {
        this.queryExecutionContext = queryExecutionContext;
    }

    /**
     * <p>
     * The database within which the query executes.
     * </p>
     * 
     * @return The database within which the query executes.
     */

    public QueryExecutionContext getQueryExecutionContext() {
        return this.queryExecutionContext;
    }

    /**
     * <p>
     * The database within which the query executes.
     * </p>
     * 
     * @param queryExecutionContext
     *        The database within which the query executes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartQueryExecutionRequest withQueryExecutionContext(QueryExecutionContext queryExecutionContext) {
        setQueryExecutionContext(queryExecutionContext);
        return this;
    }

    /**
     * <p>
     * Specifies information about where and how to save the results of the query execution. If the query runs in a
     * workgroup, then workgroup's settings may override query settings. This affects the query results location. The
     * workgroup settings override is specified in EnforceWorkGroupConfiguration (true/false) in the
     * WorkGroupConfiguration. See <a>WorkGroupConfiguration$EnforceWorkGroupConfiguration</a>.
     * </p>
     * 
     * @param resultConfiguration
     *        Specifies information about where and how to save the results of the query execution. If the query runs in
     *        a workgroup, then workgroup's settings may override query settings. This affects the query results
     *        location. The workgroup settings override is specified in EnforceWorkGroupConfiguration (true/false) in
     *        the WorkGroupConfiguration. See <a>WorkGroupConfiguration$EnforceWorkGroupConfiguration</a>.
     */

    public void setResultConfiguration(ResultConfiguration resultConfiguration) {
        this.resultConfiguration = resultConfiguration;
    }

    /**
     * <p>
     * Specifies information about where and how to save the results of the query execution. If the query runs in a
     * workgroup, then workgroup's settings may override query settings. This affects the query results location. The
     * workgroup settings override is specified in EnforceWorkGroupConfiguration (true/false) in the
     * WorkGroupConfiguration. See <a>WorkGroupConfiguration$EnforceWorkGroupConfiguration</a>.
     * </p>
     * 
     * @return Specifies information about where and how to save the results of the query execution. If the query runs
     *         in a workgroup, then workgroup's settings may override query settings. This affects the query results
     *         location. The workgroup settings override is specified in EnforceWorkGroupConfiguration (true/false) in
     *         the WorkGroupConfiguration. See <a>WorkGroupConfiguration$EnforceWorkGroupConfiguration</a>.
     */

    public ResultConfiguration getResultConfiguration() {
        return this.resultConfiguration;
    }

    /**
     * <p>
     * Specifies information about where and how to save the results of the query execution. If the query runs in a
     * workgroup, then workgroup's settings may override query settings. This affects the query results location. The
     * workgroup settings override is specified in EnforceWorkGroupConfiguration (true/false) in the
     * WorkGroupConfiguration. See <a>WorkGroupConfiguration$EnforceWorkGroupConfiguration</a>.
     * </p>
     * 
     * @param resultConfiguration
     *        Specifies information about where and how to save the results of the query execution. If the query runs in
     *        a workgroup, then workgroup's settings may override query settings. This affects the query results
     *        location. The workgroup settings override is specified in EnforceWorkGroupConfiguration (true/false) in
     *        the WorkGroupConfiguration. See <a>WorkGroupConfiguration$EnforceWorkGroupConfiguration</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartQueryExecutionRequest withResultConfiguration(ResultConfiguration resultConfiguration) {
        setResultConfiguration(resultConfiguration);
        return this;
    }

    /**
     * <p>
     * The name of the workgroup in which the query is being started.
     * </p>
     * 
     * @param workGroup
     *        The name of the workgroup in which the query is being started.
     */

    public void setWorkGroup(String workGroup) {
        this.workGroup = workGroup;
    }

    /**
     * <p>
     * The name of the workgroup in which the query is being started.
     * </p>
     * 
     * @return The name of the workgroup in which the query is being started.
     */

    public String getWorkGroup() {
        return this.workGroup;
    }

    /**
     * <p>
     * The name of the workgroup in which the query is being started.
     * </p>
     * 
     * @param workGroup
     *        The name of the workgroup in which the query is being started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartQueryExecutionRequest withWorkGroup(String workGroup) {
        setWorkGroup(workGroup);
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
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken()).append(",");
        if (getQueryExecutionContext() != null)
            sb.append("QueryExecutionContext: ").append(getQueryExecutionContext()).append(",");
        if (getResultConfiguration() != null)
            sb.append("ResultConfiguration: ").append(getResultConfiguration()).append(",");
        if (getWorkGroup() != null)
            sb.append("WorkGroup: ").append(getWorkGroup());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartQueryExecutionRequest == false)
            return false;
        StartQueryExecutionRequest other = (StartQueryExecutionRequest) obj;
        if (other.getQueryString() == null ^ this.getQueryString() == null)
            return false;
        if (other.getQueryString() != null && other.getQueryString().equals(this.getQueryString()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        if (other.getQueryExecutionContext() == null ^ this.getQueryExecutionContext() == null)
            return false;
        if (other.getQueryExecutionContext() != null && other.getQueryExecutionContext().equals(this.getQueryExecutionContext()) == false)
            return false;
        if (other.getResultConfiguration() == null ^ this.getResultConfiguration() == null)
            return false;
        if (other.getResultConfiguration() != null && other.getResultConfiguration().equals(this.getResultConfiguration()) == false)
            return false;
        if (other.getWorkGroup() == null ^ this.getWorkGroup() == null)
            return false;
        if (other.getWorkGroup() != null && other.getWorkGroup().equals(this.getWorkGroup()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getQueryString() == null) ? 0 : getQueryString().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode + ((getQueryExecutionContext() == null) ? 0 : getQueryExecutionContext().hashCode());
        hashCode = prime * hashCode + ((getResultConfiguration() == null) ? 0 : getResultConfiguration().hashCode());
        hashCode = prime * hashCode + ((getWorkGroup() == null) ? 0 : getWorkGroup().hashCode());
        return hashCode;
    }

    @Override
    public StartQueryExecutionRequest clone() {
        return (StartQueryExecutionRequest) super.clone();
    }

}
