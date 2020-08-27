/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.appflow.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/DescribeConnectorProfiles" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeConnectorProfilesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the connector profile. The name is unique for each <code>ConnectorProfile</code> in the AWS account.
     * </p>
     */
    private java.util.List<String> connectorProfileNames;
    /**
     * <p>
     * The type of connector, such as Salesforce, Amplitude, and so on.
     * </p>
     */
    private String connectorType;
    /**
     * <p>
     * Specifies the maximum number of items that should be returned in the result set. The default for
     * <code>maxResults</code> is 20 (for all paginated API operations).
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The pagination token for the next page of data.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The name of the connector profile. The name is unique for each <code>ConnectorProfile</code> in the AWS account.
     * </p>
     * 
     * @return The name of the connector profile. The name is unique for each <code>ConnectorProfile</code> in the AWS
     *         account.
     */

    public java.util.List<String> getConnectorProfileNames() {
        return connectorProfileNames;
    }

    /**
     * <p>
     * The name of the connector profile. The name is unique for each <code>ConnectorProfile</code> in the AWS account.
     * </p>
     * 
     * @param connectorProfileNames
     *        The name of the connector profile. The name is unique for each <code>ConnectorProfile</code> in the AWS
     *        account.
     */

    public void setConnectorProfileNames(java.util.Collection<String> connectorProfileNames) {
        if (connectorProfileNames == null) {
            this.connectorProfileNames = null;
            return;
        }

        this.connectorProfileNames = new java.util.ArrayList<String>(connectorProfileNames);
    }

    /**
     * <p>
     * The name of the connector profile. The name is unique for each <code>ConnectorProfile</code> in the AWS account.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConnectorProfileNames(java.util.Collection)} or
     * {@link #withConnectorProfileNames(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param connectorProfileNames
     *        The name of the connector profile. The name is unique for each <code>ConnectorProfile</code> in the AWS
     *        account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConnectorProfilesRequest withConnectorProfileNames(String... connectorProfileNames) {
        if (this.connectorProfileNames == null) {
            setConnectorProfileNames(new java.util.ArrayList<String>(connectorProfileNames.length));
        }
        for (String ele : connectorProfileNames) {
            this.connectorProfileNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The name of the connector profile. The name is unique for each <code>ConnectorProfile</code> in the AWS account.
     * </p>
     * 
     * @param connectorProfileNames
     *        The name of the connector profile. The name is unique for each <code>ConnectorProfile</code> in the AWS
     *        account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConnectorProfilesRequest withConnectorProfileNames(java.util.Collection<String> connectorProfileNames) {
        setConnectorProfileNames(connectorProfileNames);
        return this;
    }

    /**
     * <p>
     * The type of connector, such as Salesforce, Amplitude, and so on.
     * </p>
     * 
     * @param connectorType
     *        The type of connector, such as Salesforce, Amplitude, and so on.
     * @see ConnectorType
     */

    public void setConnectorType(String connectorType) {
        this.connectorType = connectorType;
    }

    /**
     * <p>
     * The type of connector, such as Salesforce, Amplitude, and so on.
     * </p>
     * 
     * @return The type of connector, such as Salesforce, Amplitude, and so on.
     * @see ConnectorType
     */

    public String getConnectorType() {
        return this.connectorType;
    }

    /**
     * <p>
     * The type of connector, such as Salesforce, Amplitude, and so on.
     * </p>
     * 
     * @param connectorType
     *        The type of connector, such as Salesforce, Amplitude, and so on.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConnectorType
     */

    public DescribeConnectorProfilesRequest withConnectorType(String connectorType) {
        setConnectorType(connectorType);
        return this;
    }

    /**
     * <p>
     * The type of connector, such as Salesforce, Amplitude, and so on.
     * </p>
     * 
     * @param connectorType
     *        The type of connector, such as Salesforce, Amplitude, and so on.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConnectorType
     */

    public DescribeConnectorProfilesRequest withConnectorType(ConnectorType connectorType) {
        this.connectorType = connectorType.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the maximum number of items that should be returned in the result set. The default for
     * <code>maxResults</code> is 20 (for all paginated API operations).
     * </p>
     * 
     * @param maxResults
     *        Specifies the maximum number of items that should be returned in the result set. The default for
     *        <code>maxResults</code> is 20 (for all paginated API operations).
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Specifies the maximum number of items that should be returned in the result set. The default for
     * <code>maxResults</code> is 20 (for all paginated API operations).
     * </p>
     * 
     * @return Specifies the maximum number of items that should be returned in the result set. The default for
     *         <code>maxResults</code> is 20 (for all paginated API operations).
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * Specifies the maximum number of items that should be returned in the result set. The default for
     * <code>maxResults</code> is 20 (for all paginated API operations).
     * </p>
     * 
     * @param maxResults
     *        Specifies the maximum number of items that should be returned in the result set. The default for
     *        <code>maxResults</code> is 20 (for all paginated API operations).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConnectorProfilesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The pagination token for the next page of data.
     * </p>
     * 
     * @param nextToken
     *        The pagination token for the next page of data.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token for the next page of data.
     * </p>
     * 
     * @return The pagination token for the next page of data.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token for the next page of data.
     * </p>
     * 
     * @param nextToken
     *        The pagination token for the next page of data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConnectorProfilesRequest withNextToken(String nextToken) {
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
        if (getConnectorProfileNames() != null)
            sb.append("ConnectorProfileNames: ").append(getConnectorProfileNames()).append(",");
        if (getConnectorType() != null)
            sb.append("ConnectorType: ").append(getConnectorType()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
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

        if (obj instanceof DescribeConnectorProfilesRequest == false)
            return false;
        DescribeConnectorProfilesRequest other = (DescribeConnectorProfilesRequest) obj;
        if (other.getConnectorProfileNames() == null ^ this.getConnectorProfileNames() == null)
            return false;
        if (other.getConnectorProfileNames() != null && other.getConnectorProfileNames().equals(this.getConnectorProfileNames()) == false)
            return false;
        if (other.getConnectorType() == null ^ this.getConnectorType() == null)
            return false;
        if (other.getConnectorType() != null && other.getConnectorType().equals(this.getConnectorType()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
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

        hashCode = prime * hashCode + ((getConnectorProfileNames() == null) ? 0 : getConnectorProfileNames().hashCode());
        hashCode = prime * hashCode + ((getConnectorType() == null) ? 0 : getConnectorType().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeConnectorProfilesRequest clone() {
        return (DescribeConnectorProfilesRequest) super.clone();
    }

}
