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
package com.amazonaws.services.databasemigrationservice.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DescribeFleetAdvisorSchemas" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeFleetAdvisorSchemasRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * If you specify any of the following filters, the output includes information for only those schemas that meet the
     * filter criteria:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>complexity</code> – The schema's complexity, for example <code>Simple</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>database-id</code> – The ID of the schema's database.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>database-ip-address</code> – The IP address of the schema's database.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>database-name</code> – The name of the schema's database.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>database-engine</code> – The name of the schema database's engine.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>original-schema-name</code> – The name of the schema's database's main schema.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>schema-id</code> – The ID of the schema, for example <code>15</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>schema-name</code> – The name of the schema.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>server-ip-address</code> – The IP address of the schema database's server.
     * </p>
     * </li>
     * </ul>
     * <p>
     * An example is: <code>describe-fleet-advisor-schemas --filter Name="schema-id",Values="50"</code>
     * </p>
     */
    private java.util.List<Filter> filters;
    /**
     * <p>
     * Sets the maximum number of records returned in the response.
     * </p>
     */
    private Integer maxRecords;
    /**
     * <p>
     * If <code>NextToken</code> is returned by a previous response, there are more results available. The value of
     * <code>NextToken</code> is a unique pagination token for each page. Make the call again using the returned token
     * to retrieve the next page. Keep all other arguments unchanged.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * If you specify any of the following filters, the output includes information for only those schemas that meet the
     * filter criteria:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>complexity</code> – The schema's complexity, for example <code>Simple</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>database-id</code> – The ID of the schema's database.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>database-ip-address</code> – The IP address of the schema's database.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>database-name</code> – The name of the schema's database.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>database-engine</code> – The name of the schema database's engine.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>original-schema-name</code> – The name of the schema's database's main schema.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>schema-id</code> – The ID of the schema, for example <code>15</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>schema-name</code> – The name of the schema.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>server-ip-address</code> – The IP address of the schema database's server.
     * </p>
     * </li>
     * </ul>
     * <p>
     * An example is: <code>describe-fleet-advisor-schemas --filter Name="schema-id",Values="50"</code>
     * </p>
     * 
     * @return If you specify any of the following filters, the output includes information for only those schemas that
     *         meet the filter criteria:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>complexity</code> – The schema's complexity, for example <code>Simple</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>database-id</code> – The ID of the schema's database.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>database-ip-address</code> – The IP address of the schema's database.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>database-name</code> – The name of the schema's database.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>database-engine</code> – The name of the schema database's engine.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>original-schema-name</code> – The name of the schema's database's main schema.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>schema-id</code> – The ID of the schema, for example <code>15</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>schema-name</code> – The name of the schema.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>server-ip-address</code> – The IP address of the schema database's server.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         An example is: <code>describe-fleet-advisor-schemas --filter Name="schema-id",Values="50"</code>
     */

    public java.util.List<Filter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * If you specify any of the following filters, the output includes information for only those schemas that meet the
     * filter criteria:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>complexity</code> – The schema's complexity, for example <code>Simple</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>database-id</code> – The ID of the schema's database.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>database-ip-address</code> – The IP address of the schema's database.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>database-name</code> – The name of the schema's database.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>database-engine</code> – The name of the schema database's engine.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>original-schema-name</code> – The name of the schema's database's main schema.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>schema-id</code> – The ID of the schema, for example <code>15</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>schema-name</code> – The name of the schema.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>server-ip-address</code> – The IP address of the schema database's server.
     * </p>
     * </li>
     * </ul>
     * <p>
     * An example is: <code>describe-fleet-advisor-schemas --filter Name="schema-id",Values="50"</code>
     * </p>
     * 
     * @param filters
     *        If you specify any of the following filters, the output includes information for only those schemas that
     *        meet the filter criteria:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>complexity</code> – The schema's complexity, for example <code>Simple</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>database-id</code> – The ID of the schema's database.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>database-ip-address</code> – The IP address of the schema's database.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>database-name</code> – The name of the schema's database.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>database-engine</code> – The name of the schema database's engine.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>original-schema-name</code> – The name of the schema's database's main schema.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>schema-id</code> – The ID of the schema, for example <code>15</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>schema-name</code> – The name of the schema.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>server-ip-address</code> – The IP address of the schema database's server.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        An example is: <code>describe-fleet-advisor-schemas --filter Name="schema-id",Values="50"</code>
     */

    public void setFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<Filter>(filters);
    }

    /**
     * <p>
     * If you specify any of the following filters, the output includes information for only those schemas that meet the
     * filter criteria:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>complexity</code> – The schema's complexity, for example <code>Simple</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>database-id</code> – The ID of the schema's database.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>database-ip-address</code> – The IP address of the schema's database.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>database-name</code> – The name of the schema's database.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>database-engine</code> – The name of the schema database's engine.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>original-schema-name</code> – The name of the schema's database's main schema.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>schema-id</code> – The ID of the schema, for example <code>15</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>schema-name</code> – The name of the schema.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>server-ip-address</code> – The IP address of the schema database's server.
     * </p>
     * </li>
     * </ul>
     * <p>
     * An example is: <code>describe-fleet-advisor-schemas --filter Name="schema-id",Values="50"</code>
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        If you specify any of the following filters, the output includes information for only those schemas that
     *        meet the filter criteria:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>complexity</code> – The schema's complexity, for example <code>Simple</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>database-id</code> – The ID of the schema's database.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>database-ip-address</code> – The IP address of the schema's database.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>database-name</code> – The name of the schema's database.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>database-engine</code> – The name of the schema database's engine.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>original-schema-name</code> – The name of the schema's database's main schema.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>schema-id</code> – The ID of the schema, for example <code>15</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>schema-name</code> – The name of the schema.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>server-ip-address</code> – The IP address of the schema database's server.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        An example is: <code>describe-fleet-advisor-schemas --filter Name="schema-id",Values="50"</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFleetAdvisorSchemasRequest withFilters(Filter... filters) {
        if (this.filters == null) {
            setFilters(new java.util.ArrayList<Filter>(filters.length));
        }
        for (Filter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * If you specify any of the following filters, the output includes information for only those schemas that meet the
     * filter criteria:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>complexity</code> – The schema's complexity, for example <code>Simple</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>database-id</code> – The ID of the schema's database.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>database-ip-address</code> – The IP address of the schema's database.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>database-name</code> – The name of the schema's database.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>database-engine</code> – The name of the schema database's engine.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>original-schema-name</code> – The name of the schema's database's main schema.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>schema-id</code> – The ID of the schema, for example <code>15</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>schema-name</code> – The name of the schema.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>server-ip-address</code> – The IP address of the schema database's server.
     * </p>
     * </li>
     * </ul>
     * <p>
     * An example is: <code>describe-fleet-advisor-schemas --filter Name="schema-id",Values="50"</code>
     * </p>
     * 
     * @param filters
     *        If you specify any of the following filters, the output includes information for only those schemas that
     *        meet the filter criteria:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>complexity</code> – The schema's complexity, for example <code>Simple</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>database-id</code> – The ID of the schema's database.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>database-ip-address</code> – The IP address of the schema's database.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>database-name</code> – The name of the schema's database.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>database-engine</code> – The name of the schema database's engine.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>original-schema-name</code> – The name of the schema's database's main schema.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>schema-id</code> – The ID of the schema, for example <code>15</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>schema-name</code> – The name of the schema.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>server-ip-address</code> – The IP address of the schema database's server.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        An example is: <code>describe-fleet-advisor-schemas --filter Name="schema-id",Values="50"</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFleetAdvisorSchemasRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * Sets the maximum number of records returned in the response.
     * </p>
     * 
     * @param maxRecords
     *        Sets the maximum number of records returned in the response.
     */

    public void setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
    }

    /**
     * <p>
     * Sets the maximum number of records returned in the response.
     * </p>
     * 
     * @return Sets the maximum number of records returned in the response.
     */

    public Integer getMaxRecords() {
        return this.maxRecords;
    }

    /**
     * <p>
     * Sets the maximum number of records returned in the response.
     * </p>
     * 
     * @param maxRecords
     *        Sets the maximum number of records returned in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFleetAdvisorSchemasRequest withMaxRecords(Integer maxRecords) {
        setMaxRecords(maxRecords);
        return this;
    }

    /**
     * <p>
     * If <code>NextToken</code> is returned by a previous response, there are more results available. The value of
     * <code>NextToken</code> is a unique pagination token for each page. Make the call again using the returned token
     * to retrieve the next page. Keep all other arguments unchanged.
     * </p>
     * 
     * @param nextToken
     *        If <code>NextToken</code> is returned by a previous response, there are more results available. The value
     *        of <code>NextToken</code> is a unique pagination token for each page. Make the call again using the
     *        returned token to retrieve the next page. Keep all other arguments unchanged.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If <code>NextToken</code> is returned by a previous response, there are more results available. The value of
     * <code>NextToken</code> is a unique pagination token for each page. Make the call again using the returned token
     * to retrieve the next page. Keep all other arguments unchanged.
     * </p>
     * 
     * @return If <code>NextToken</code> is returned by a previous response, there are more results available. The value
     *         of <code>NextToken</code> is a unique pagination token for each page. Make the call again using the
     *         returned token to retrieve the next page. Keep all other arguments unchanged.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If <code>NextToken</code> is returned by a previous response, there are more results available. The value of
     * <code>NextToken</code> is a unique pagination token for each page. Make the call again using the returned token
     * to retrieve the next page. Keep all other arguments unchanged.
     * </p>
     * 
     * @param nextToken
     *        If <code>NextToken</code> is returned by a previous response, there are more results available. The value
     *        of <code>NextToken</code> is a unique pagination token for each page. Make the call again using the
     *        returned token to retrieve the next page. Keep all other arguments unchanged.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFleetAdvisorSchemasRequest withNextToken(String nextToken) {
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
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
        if (getMaxRecords() != null)
            sb.append("MaxRecords: ").append(getMaxRecords()).append(",");
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

        if (obj instanceof DescribeFleetAdvisorSchemasRequest == false)
            return false;
        DescribeFleetAdvisorSchemasRequest other = (DescribeFleetAdvisorSchemasRequest) obj;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getMaxRecords() == null ^ this.getMaxRecords() == null)
            return false;
        if (other.getMaxRecords() != null && other.getMaxRecords().equals(this.getMaxRecords()) == false)
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

        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getMaxRecords() == null) ? 0 : getMaxRecords().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeFleetAdvisorSchemasRequest clone() {
        return (DescribeFleetAdvisorSchemasRequest) super.clone();
    }

}
