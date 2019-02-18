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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/CreateNamedQuery" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateNamedQueryRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The query name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The query description.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The database to which the query belongs.
     * </p>
     */
    private String database;
    /**
     * <p>
     * The contents of the query with all query statements.
     * </p>
     */
    private String queryString;
    /**
     * <p>
     * A unique case-sensitive string used to ensure the request to create the query is idempotent (executes only once).
     * If another <code>CreateNamedQuery</code> request is received, the same response is returned and another query is
     * not created. If a parameter has changed, for example, the <code>QueryString</code>, an error is returned.
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
     * The name of the workgroup in which the named query is being created.
     * </p>
     */
    private String workGroup;

    /**
     * <p>
     * The query name.
     * </p>
     * 
     * @param name
     *        The query name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The query name.
     * </p>
     * 
     * @return The query name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The query name.
     * </p>
     * 
     * @param name
     *        The query name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNamedQueryRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The query description.
     * </p>
     * 
     * @param description
     *        The query description.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The query description.
     * </p>
     * 
     * @return The query description.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The query description.
     * </p>
     * 
     * @param description
     *        The query description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNamedQueryRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The database to which the query belongs.
     * </p>
     * 
     * @param database
     *        The database to which the query belongs.
     */

    public void setDatabase(String database) {
        this.database = database;
    }

    /**
     * <p>
     * The database to which the query belongs.
     * </p>
     * 
     * @return The database to which the query belongs.
     */

    public String getDatabase() {
        return this.database;
    }

    /**
     * <p>
     * The database to which the query belongs.
     * </p>
     * 
     * @param database
     *        The database to which the query belongs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNamedQueryRequest withDatabase(String database) {
        setDatabase(database);
        return this;
    }

    /**
     * <p>
     * The contents of the query with all query statements.
     * </p>
     * 
     * @param queryString
     *        The contents of the query with all query statements.
     */

    public void setQueryString(String queryString) {
        this.queryString = queryString;
    }

    /**
     * <p>
     * The contents of the query with all query statements.
     * </p>
     * 
     * @return The contents of the query with all query statements.
     */

    public String getQueryString() {
        return this.queryString;
    }

    /**
     * <p>
     * The contents of the query with all query statements.
     * </p>
     * 
     * @param queryString
     *        The contents of the query with all query statements.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNamedQueryRequest withQueryString(String queryString) {
        setQueryString(queryString);
        return this;
    }

    /**
     * <p>
     * A unique case-sensitive string used to ensure the request to create the query is idempotent (executes only once).
     * If another <code>CreateNamedQuery</code> request is received, the same response is returned and another query is
     * not created. If a parameter has changed, for example, the <code>QueryString</code>, an error is returned.
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
     *        once). If another <code>CreateNamedQuery</code> request is received, the same response is returned and
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
     * If another <code>CreateNamedQuery</code> request is received, the same response is returned and another query is
     * not created. If a parameter has changed, for example, the <code>QueryString</code>, an error is returned.
     * </p>
     * <important>
     * <p>
     * This token is listed as not required because AWS SDKs (for example the AWS SDK for Java) auto-generate the token
     * for users. If you are not using the AWS SDK or the AWS CLI, you must provide this token or the action will fail.
     * </p>
     * </important>
     * 
     * @return A unique case-sensitive string used to ensure the request to create the query is idempotent (executes
     *         only once). If another <code>CreateNamedQuery</code> request is received, the same response is returned
     *         and another query is not created. If a parameter has changed, for example, the <code>QueryString</code>,
     *         an error is returned.</p> <important>
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
     * If another <code>CreateNamedQuery</code> request is received, the same response is returned and another query is
     * not created. If a parameter has changed, for example, the <code>QueryString</code>, an error is returned.
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
     *        once). If another <code>CreateNamedQuery</code> request is received, the same response is returned and
     *        another query is not created. If a parameter has changed, for example, the <code>QueryString</code>, an
     *        error is returned.</p> <important>
     *        <p>
     *        This token is listed as not required because AWS SDKs (for example the AWS SDK for Java) auto-generate the
     *        token for users. If you are not using the AWS SDK or the AWS CLI, you must provide this token or the
     *        action will fail.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNamedQueryRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
        return this;
    }

    /**
     * <p>
     * The name of the workgroup in which the named query is being created.
     * </p>
     * 
     * @param workGroup
     *        The name of the workgroup in which the named query is being created.
     */

    public void setWorkGroup(String workGroup) {
        this.workGroup = workGroup;
    }

    /**
     * <p>
     * The name of the workgroup in which the named query is being created.
     * </p>
     * 
     * @return The name of the workgroup in which the named query is being created.
     */

    public String getWorkGroup() {
        return this.workGroup;
    }

    /**
     * <p>
     * The name of the workgroup in which the named query is being created.
     * </p>
     * 
     * @param workGroup
     *        The name of the workgroup in which the named query is being created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNamedQueryRequest withWorkGroup(String workGroup) {
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getDatabase() != null)
            sb.append("Database: ").append(getDatabase()).append(",");
        if (getQueryString() != null)
            sb.append("QueryString: ").append(getQueryString()).append(",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken()).append(",");
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

        if (obj instanceof CreateNamedQueryRequest == false)
            return false;
        CreateNamedQueryRequest other = (CreateNamedQueryRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDatabase() == null ^ this.getDatabase() == null)
            return false;
        if (other.getDatabase() != null && other.getDatabase().equals(this.getDatabase()) == false)
            return false;
        if (other.getQueryString() == null ^ this.getQueryString() == null)
            return false;
        if (other.getQueryString() != null && other.getQueryString().equals(this.getQueryString()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
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

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDatabase() == null) ? 0 : getDatabase().hashCode());
        hashCode = prime * hashCode + ((getQueryString() == null) ? 0 : getQueryString().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode + ((getWorkGroup() == null) ? 0 : getWorkGroup().hashCode());
        return hashCode;
    }

    @Override
    public CreateNamedQueryRequest clone() {
        return (CreateNamedQueryRequest) super.clone();
    }

}
