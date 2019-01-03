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
     * The plain language name for the query.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A brief explanation of the query.
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
     * The text of the query itself. In other words, all query statements.
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
     * The plain language name for the query.
     * </p>
     * 
     * @param name
     *        The plain language name for the query.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The plain language name for the query.
     * </p>
     * 
     * @return The plain language name for the query.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The plain language name for the query.
     * </p>
     * 
     * @param name
     *        The plain language name for the query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNamedQueryRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A brief explanation of the query.
     * </p>
     * 
     * @param description
     *        A brief explanation of the query.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A brief explanation of the query.
     * </p>
     * 
     * @return A brief explanation of the query.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A brief explanation of the query.
     * </p>
     * 
     * @param description
     *        A brief explanation of the query.
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
     * The text of the query itself. In other words, all query statements.
     * </p>
     * 
     * @param queryString
     *        The text of the query itself. In other words, all query statements.
     */

    public void setQueryString(String queryString) {
        this.queryString = queryString;
    }

    /**
     * <p>
     * The text of the query itself. In other words, all query statements.
     * </p>
     * 
     * @return The text of the query itself. In other words, all query statements.
     */

    public String getQueryString() {
        return this.queryString;
    }

    /**
     * <p>
     * The text of the query itself. In other words, all query statements.
     * </p>
     * 
     * @param queryString
     *        The text of the query itself. In other words, all query statements.
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
            sb.append("ClientRequestToken: ").append(getClientRequestToken());
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
        return hashCode;
    }

    @Override
    public CreateNamedQueryRequest clone() {
        return (CreateNamedQueryRequest) super.clone();
    }

}
