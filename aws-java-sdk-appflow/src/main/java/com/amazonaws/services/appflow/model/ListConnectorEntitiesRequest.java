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
package com.amazonaws.services.appflow.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/ListConnectorEntities" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListConnectorEntitiesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the connector profile. The name is unique for each <code>ConnectorProfile</code> in the Amazon Web
     * Services account, and is used to query the downstream connector.
     * </p>
     */
    private String connectorProfileName;
    /**
     * <p>
     * The type of connector, such as Salesforce, Amplitude, and so on.
     * </p>
     */
    private String connectorType;
    /**
     * <p>
     * This optional parameter is specific to connector implementation. Some connectors support multiple levels or
     * categories of entities. You can find out the list of roots for such providers by sending a request without the
     * <code>entitiesPath</code> parameter. If the connector supports entities at different roots, this initial request
     * returns the list of roots. Otherwise, this request returns all entities supported by the provider.
     * </p>
     */
    private String entitiesPath;
    /**
     * <p>
     * The version of the API that's used by the connector.
     * </p>
     */
    private String apiVersion;
    /**
     * <p>
     * The maximum number of items that the operation returns in the response.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * A token that was provided by your prior <code>ListConnectorEntities</code> operation if the response was too big
     * for the page size. You specify this token to get the next page of results in paginated response.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The name of the connector profile. The name is unique for each <code>ConnectorProfile</code> in the Amazon Web
     * Services account, and is used to query the downstream connector.
     * </p>
     * 
     * @param connectorProfileName
     *        The name of the connector profile. The name is unique for each <code>ConnectorProfile</code> in the Amazon
     *        Web Services account, and is used to query the downstream connector.
     */

    public void setConnectorProfileName(String connectorProfileName) {
        this.connectorProfileName = connectorProfileName;
    }

    /**
     * <p>
     * The name of the connector profile. The name is unique for each <code>ConnectorProfile</code> in the Amazon Web
     * Services account, and is used to query the downstream connector.
     * </p>
     * 
     * @return The name of the connector profile. The name is unique for each <code>ConnectorProfile</code> in the
     *         Amazon Web Services account, and is used to query the downstream connector.
     */

    public String getConnectorProfileName() {
        return this.connectorProfileName;
    }

    /**
     * <p>
     * The name of the connector profile. The name is unique for each <code>ConnectorProfile</code> in the Amazon Web
     * Services account, and is used to query the downstream connector.
     * </p>
     * 
     * @param connectorProfileName
     *        The name of the connector profile. The name is unique for each <code>ConnectorProfile</code> in the Amazon
     *        Web Services account, and is used to query the downstream connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListConnectorEntitiesRequest withConnectorProfileName(String connectorProfileName) {
        setConnectorProfileName(connectorProfileName);
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

    public ListConnectorEntitiesRequest withConnectorType(String connectorType) {
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

    public ListConnectorEntitiesRequest withConnectorType(ConnectorType connectorType) {
        this.connectorType = connectorType.toString();
        return this;
    }

    /**
     * <p>
     * This optional parameter is specific to connector implementation. Some connectors support multiple levels or
     * categories of entities. You can find out the list of roots for such providers by sending a request without the
     * <code>entitiesPath</code> parameter. If the connector supports entities at different roots, this initial request
     * returns the list of roots. Otherwise, this request returns all entities supported by the provider.
     * </p>
     * 
     * @param entitiesPath
     *        This optional parameter is specific to connector implementation. Some connectors support multiple levels
     *        or categories of entities. You can find out the list of roots for such providers by sending a request
     *        without the <code>entitiesPath</code> parameter. If the connector supports entities at different roots,
     *        this initial request returns the list of roots. Otherwise, this request returns all entities supported by
     *        the provider.
     */

    public void setEntitiesPath(String entitiesPath) {
        this.entitiesPath = entitiesPath;
    }

    /**
     * <p>
     * This optional parameter is specific to connector implementation. Some connectors support multiple levels or
     * categories of entities. You can find out the list of roots for such providers by sending a request without the
     * <code>entitiesPath</code> parameter. If the connector supports entities at different roots, this initial request
     * returns the list of roots. Otherwise, this request returns all entities supported by the provider.
     * </p>
     * 
     * @return This optional parameter is specific to connector implementation. Some connectors support multiple levels
     *         or categories of entities. You can find out the list of roots for such providers by sending a request
     *         without the <code>entitiesPath</code> parameter. If the connector supports entities at different roots,
     *         this initial request returns the list of roots. Otherwise, this request returns all entities supported by
     *         the provider.
     */

    public String getEntitiesPath() {
        return this.entitiesPath;
    }

    /**
     * <p>
     * This optional parameter is specific to connector implementation. Some connectors support multiple levels or
     * categories of entities. You can find out the list of roots for such providers by sending a request without the
     * <code>entitiesPath</code> parameter. If the connector supports entities at different roots, this initial request
     * returns the list of roots. Otherwise, this request returns all entities supported by the provider.
     * </p>
     * 
     * @param entitiesPath
     *        This optional parameter is specific to connector implementation. Some connectors support multiple levels
     *        or categories of entities. You can find out the list of roots for such providers by sending a request
     *        without the <code>entitiesPath</code> parameter. If the connector supports entities at different roots,
     *        this initial request returns the list of roots. Otherwise, this request returns all entities supported by
     *        the provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListConnectorEntitiesRequest withEntitiesPath(String entitiesPath) {
        setEntitiesPath(entitiesPath);
        return this;
    }

    /**
     * <p>
     * The version of the API that's used by the connector.
     * </p>
     * 
     * @param apiVersion
     *        The version of the API that's used by the connector.
     */

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    /**
     * <p>
     * The version of the API that's used by the connector.
     * </p>
     * 
     * @return The version of the API that's used by the connector.
     */

    public String getApiVersion() {
        return this.apiVersion;
    }

    /**
     * <p>
     * The version of the API that's used by the connector.
     * </p>
     * 
     * @param apiVersion
     *        The version of the API that's used by the connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListConnectorEntitiesRequest withApiVersion(String apiVersion) {
        setApiVersion(apiVersion);
        return this;
    }

    /**
     * <p>
     * The maximum number of items that the operation returns in the response.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of items that the operation returns in the response.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of items that the operation returns in the response.
     * </p>
     * 
     * @return The maximum number of items that the operation returns in the response.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of items that the operation returns in the response.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of items that the operation returns in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListConnectorEntitiesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * A token that was provided by your prior <code>ListConnectorEntities</code> operation if the response was too big
     * for the page size. You specify this token to get the next page of results in paginated response.
     * </p>
     * 
     * @param nextToken
     *        A token that was provided by your prior <code>ListConnectorEntities</code> operation if the response was
     *        too big for the page size. You specify this token to get the next page of results in paginated response.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token that was provided by your prior <code>ListConnectorEntities</code> operation if the response was too big
     * for the page size. You specify this token to get the next page of results in paginated response.
     * </p>
     * 
     * @return A token that was provided by your prior <code>ListConnectorEntities</code> operation if the response was
     *         too big for the page size. You specify this token to get the next page of results in paginated response.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token that was provided by your prior <code>ListConnectorEntities</code> operation if the response was too big
     * for the page size. You specify this token to get the next page of results in paginated response.
     * </p>
     * 
     * @param nextToken
     *        A token that was provided by your prior <code>ListConnectorEntities</code> operation if the response was
     *        too big for the page size. You specify this token to get the next page of results in paginated response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListConnectorEntitiesRequest withNextToken(String nextToken) {
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
        if (getConnectorProfileName() != null)
            sb.append("ConnectorProfileName: ").append(getConnectorProfileName()).append(",");
        if (getConnectorType() != null)
            sb.append("ConnectorType: ").append(getConnectorType()).append(",");
        if (getEntitiesPath() != null)
            sb.append("EntitiesPath: ").append(getEntitiesPath()).append(",");
        if (getApiVersion() != null)
            sb.append("ApiVersion: ").append(getApiVersion()).append(",");
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

        if (obj instanceof ListConnectorEntitiesRequest == false)
            return false;
        ListConnectorEntitiesRequest other = (ListConnectorEntitiesRequest) obj;
        if (other.getConnectorProfileName() == null ^ this.getConnectorProfileName() == null)
            return false;
        if (other.getConnectorProfileName() != null && other.getConnectorProfileName().equals(this.getConnectorProfileName()) == false)
            return false;
        if (other.getConnectorType() == null ^ this.getConnectorType() == null)
            return false;
        if (other.getConnectorType() != null && other.getConnectorType().equals(this.getConnectorType()) == false)
            return false;
        if (other.getEntitiesPath() == null ^ this.getEntitiesPath() == null)
            return false;
        if (other.getEntitiesPath() != null && other.getEntitiesPath().equals(this.getEntitiesPath()) == false)
            return false;
        if (other.getApiVersion() == null ^ this.getApiVersion() == null)
            return false;
        if (other.getApiVersion() != null && other.getApiVersion().equals(this.getApiVersion()) == false)
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

        hashCode = prime * hashCode + ((getConnectorProfileName() == null) ? 0 : getConnectorProfileName().hashCode());
        hashCode = prime * hashCode + ((getConnectorType() == null) ? 0 : getConnectorType().hashCode());
        hashCode = prime * hashCode + ((getEntitiesPath() == null) ? 0 : getEntitiesPath().hashCode());
        hashCode = prime * hashCode + ((getApiVersion() == null) ? 0 : getApiVersion().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListConnectorEntitiesRequest clone() {
        return (ListConnectorEntitiesRequest) super.clone();
    }

}
