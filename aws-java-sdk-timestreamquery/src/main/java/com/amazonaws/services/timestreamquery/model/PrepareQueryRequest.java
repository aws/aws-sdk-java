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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-query-2018-11-01/PrepareQuery" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PrepareQueryRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Timestream query string that you want to use as a prepared statement. Parameter names can be specified in the
     * query string <code>@</code> character followed by an identifier.
     * </p>
     */
    private String queryString;
    /**
     * <p>
     * By setting this value to <code>true</code>, Timestream will only validate that the query string is a valid
     * Timestream query, and not store the prepared query for later use.
     * </p>
     */
    private Boolean validateOnly;

    /**
     * <p>
     * The Timestream query string that you want to use as a prepared statement. Parameter names can be specified in the
     * query string <code>@</code> character followed by an identifier.
     * </p>
     * 
     * @param queryString
     *        The Timestream query string that you want to use as a prepared statement. Parameter names can be specified
     *        in the query string <code>@</code> character followed by an identifier.
     */

    public void setQueryString(String queryString) {
        this.queryString = queryString;
    }

    /**
     * <p>
     * The Timestream query string that you want to use as a prepared statement. Parameter names can be specified in the
     * query string <code>@</code> character followed by an identifier.
     * </p>
     * 
     * @return The Timestream query string that you want to use as a prepared statement. Parameter names can be
     *         specified in the query string <code>@</code> character followed by an identifier.
     */

    public String getQueryString() {
        return this.queryString;
    }

    /**
     * <p>
     * The Timestream query string that you want to use as a prepared statement. Parameter names can be specified in the
     * query string <code>@</code> character followed by an identifier.
     * </p>
     * 
     * @param queryString
     *        The Timestream query string that you want to use as a prepared statement. Parameter names can be specified
     *        in the query string <code>@</code> character followed by an identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PrepareQueryRequest withQueryString(String queryString) {
        setQueryString(queryString);
        return this;
    }

    /**
     * <p>
     * By setting this value to <code>true</code>, Timestream will only validate that the query string is a valid
     * Timestream query, and not store the prepared query for later use.
     * </p>
     * 
     * @param validateOnly
     *        By setting this value to <code>true</code>, Timestream will only validate that the query string is a valid
     *        Timestream query, and not store the prepared query for later use.
     */

    public void setValidateOnly(Boolean validateOnly) {
        this.validateOnly = validateOnly;
    }

    /**
     * <p>
     * By setting this value to <code>true</code>, Timestream will only validate that the query string is a valid
     * Timestream query, and not store the prepared query for later use.
     * </p>
     * 
     * @return By setting this value to <code>true</code>, Timestream will only validate that the query string is a
     *         valid Timestream query, and not store the prepared query for later use.
     */

    public Boolean getValidateOnly() {
        return this.validateOnly;
    }

    /**
     * <p>
     * By setting this value to <code>true</code>, Timestream will only validate that the query string is a valid
     * Timestream query, and not store the prepared query for later use.
     * </p>
     * 
     * @param validateOnly
     *        By setting this value to <code>true</code>, Timestream will only validate that the query string is a valid
     *        Timestream query, and not store the prepared query for later use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PrepareQueryRequest withValidateOnly(Boolean validateOnly) {
        setValidateOnly(validateOnly);
        return this;
    }

    /**
     * <p>
     * By setting this value to <code>true</code>, Timestream will only validate that the query string is a valid
     * Timestream query, and not store the prepared query for later use.
     * </p>
     * 
     * @return By setting this value to <code>true</code>, Timestream will only validate that the query string is a
     *         valid Timestream query, and not store the prepared query for later use.
     */

    public Boolean isValidateOnly() {
        return this.validateOnly;
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
        if (getValidateOnly() != null)
            sb.append("ValidateOnly: ").append(getValidateOnly());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PrepareQueryRequest == false)
            return false;
        PrepareQueryRequest other = (PrepareQueryRequest) obj;
        if (other.getQueryString() == null ^ this.getQueryString() == null)
            return false;
        if (other.getQueryString() != null && other.getQueryString().equals(this.getQueryString()) == false)
            return false;
        if (other.getValidateOnly() == null ^ this.getValidateOnly() == null)
            return false;
        if (other.getValidateOnly() != null && other.getValidateOnly().equals(this.getValidateOnly()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getQueryString() == null) ? 0 : getQueryString().hashCode());
        hashCode = prime * hashCode + ((getValidateOnly() == null) ? 0 : getValidateOnly().hashCode());
        return hashCode;
    }

    @Override
    public PrepareQueryRequest clone() {
        return (PrepareQueryRequest) super.clone();
    }

}
