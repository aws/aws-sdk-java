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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/StartProtectedQuery" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartProtectedQueryRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The type of the protected query to be started.
     * </p>
     */
    private String type;
    /**
     * <p>
     * A unique identifier for the membership to run this query against. Currently accepts a membership ID.
     * </p>
     */
    private String membershipIdentifier;
    /**
     * <p>
     * The protected SQL query parameters.
     * </p>
     */
    private ProtectedQuerySQLParameters sqlParameters;
    /**
     * <p>
     * The details needed to write the query results.
     * </p>
     */
    private ProtectedQueryResultConfiguration resultConfiguration;

    /**
     * <p>
     * The type of the protected query to be started.
     * </p>
     * 
     * @param type
     *        The type of the protected query to be started.
     * @see ProtectedQueryType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the protected query to be started.
     * </p>
     * 
     * @return The type of the protected query to be started.
     * @see ProtectedQueryType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the protected query to be started.
     * </p>
     * 
     * @param type
     *        The type of the protected query to be started.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProtectedQueryType
     */

    public StartProtectedQueryRequest withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of the protected query to be started.
     * </p>
     * 
     * @param type
     *        The type of the protected query to be started.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProtectedQueryType
     */

    public StartProtectedQueryRequest withType(ProtectedQueryType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * A unique identifier for the membership to run this query against. Currently accepts a membership ID.
     * </p>
     * 
     * @param membershipIdentifier
     *        A unique identifier for the membership to run this query against. Currently accepts a membership ID.
     */

    public void setMembershipIdentifier(String membershipIdentifier) {
        this.membershipIdentifier = membershipIdentifier;
    }

    /**
     * <p>
     * A unique identifier for the membership to run this query against. Currently accepts a membership ID.
     * </p>
     * 
     * @return A unique identifier for the membership to run this query against. Currently accepts a membership ID.
     */

    public String getMembershipIdentifier() {
        return this.membershipIdentifier;
    }

    /**
     * <p>
     * A unique identifier for the membership to run this query against. Currently accepts a membership ID.
     * </p>
     * 
     * @param membershipIdentifier
     *        A unique identifier for the membership to run this query against. Currently accepts a membership ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartProtectedQueryRequest withMembershipIdentifier(String membershipIdentifier) {
        setMembershipIdentifier(membershipIdentifier);
        return this;
    }

    /**
     * <p>
     * The protected SQL query parameters.
     * </p>
     * 
     * @param sqlParameters
     *        The protected SQL query parameters.
     */

    public void setSqlParameters(ProtectedQuerySQLParameters sqlParameters) {
        this.sqlParameters = sqlParameters;
    }

    /**
     * <p>
     * The protected SQL query parameters.
     * </p>
     * 
     * @return The protected SQL query parameters.
     */

    public ProtectedQuerySQLParameters getSqlParameters() {
        return this.sqlParameters;
    }

    /**
     * <p>
     * The protected SQL query parameters.
     * </p>
     * 
     * @param sqlParameters
     *        The protected SQL query parameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartProtectedQueryRequest withSqlParameters(ProtectedQuerySQLParameters sqlParameters) {
        setSqlParameters(sqlParameters);
        return this;
    }

    /**
     * <p>
     * The details needed to write the query results.
     * </p>
     * 
     * @param resultConfiguration
     *        The details needed to write the query results.
     */

    public void setResultConfiguration(ProtectedQueryResultConfiguration resultConfiguration) {
        this.resultConfiguration = resultConfiguration;
    }

    /**
     * <p>
     * The details needed to write the query results.
     * </p>
     * 
     * @return The details needed to write the query results.
     */

    public ProtectedQueryResultConfiguration getResultConfiguration() {
        return this.resultConfiguration;
    }

    /**
     * <p>
     * The details needed to write the query results.
     * </p>
     * 
     * @param resultConfiguration
     *        The details needed to write the query results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartProtectedQueryRequest withResultConfiguration(ProtectedQueryResultConfiguration resultConfiguration) {
        setResultConfiguration(resultConfiguration);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getMembershipIdentifier() != null)
            sb.append("MembershipIdentifier: ").append(getMembershipIdentifier()).append(",");
        if (getSqlParameters() != null)
            sb.append("SqlParameters: ").append("***Sensitive Data Redacted***").append(",");
        if (getResultConfiguration() != null)
            sb.append("ResultConfiguration: ").append(getResultConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartProtectedQueryRequest == false)
            return false;
        StartProtectedQueryRequest other = (StartProtectedQueryRequest) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getMembershipIdentifier() == null ^ this.getMembershipIdentifier() == null)
            return false;
        if (other.getMembershipIdentifier() != null && other.getMembershipIdentifier().equals(this.getMembershipIdentifier()) == false)
            return false;
        if (other.getSqlParameters() == null ^ this.getSqlParameters() == null)
            return false;
        if (other.getSqlParameters() != null && other.getSqlParameters().equals(this.getSqlParameters()) == false)
            return false;
        if (other.getResultConfiguration() == null ^ this.getResultConfiguration() == null)
            return false;
        if (other.getResultConfiguration() != null && other.getResultConfiguration().equals(this.getResultConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getMembershipIdentifier() == null) ? 0 : getMembershipIdentifier().hashCode());
        hashCode = prime * hashCode + ((getSqlParameters() == null) ? 0 : getSqlParameters().hashCode());
        hashCode = prime * hashCode + ((getResultConfiguration() == null) ? 0 : getResultConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public StartProtectedQueryRequest clone() {
        return (StartProtectedQueryRequest) super.clone();
    }

}
