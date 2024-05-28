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
package com.amazonaws.services.appflow.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/ResetConnectorMetadataCache"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResetConnectorMetadataCacheRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the connector profile that you want to reset cached metadata for.
     * </p>
     * <p>
     * You can omit this parameter if you're resetting the cache for any of the following connectors: Amazon Connect,
     * Amazon EventBridge, Amazon Lookout for Metrics, Amazon S3, or Upsolver. If you're resetting the cache for any
     * other connector, you must include this parameter in your request.
     * </p>
     */
    private String connectorProfileName;
    /**
     * <p>
     * The type of connector to reset cached metadata for.
     * </p>
     * <p>
     * You must include this parameter in your request if you're resetting the cache for any of the following
     * connectors: Amazon Connect, Amazon EventBridge, Amazon Lookout for Metrics, Amazon S3, or Upsolver. If you're
     * resetting the cache for any other connector, you can omit this parameter from your request.
     * </p>
     */
    private String connectorType;
    /**
     * <p>
     * Use this parameter if you want to reset cached metadata about the details for an individual entity.
     * </p>
     * <p>
     * If you don't include this parameter in your request, Amazon AppFlow only resets cached metadata about entity
     * names, not entity details.
     * </p>
     */
    private String connectorEntityName;
    /**
     * <p>
     * Use this parameter only if you’re resetting the cached metadata about a nested entity. Only some connectors
     * support nested entities. A nested entity is one that has another entity as a parent. To use this parameter,
     * specify the name of the parent entity.
     * </p>
     * <p>
     * To look up the parent-child relationship of entities, you can send a ListConnectorEntities request that omits the
     * entitiesPath parameter. Amazon AppFlow will return a list of top-level entities. For each one, it indicates
     * whether the entity has nested entities. Then, in a subsequent ListConnectorEntities request, you can specify a
     * parent entity name for the entitiesPath parameter. Amazon AppFlow will return a list of the child entities for
     * that parent.
     * </p>
     */
    private String entitiesPath;
    /**
     * <p>
     * The API version that you specified in the connector profile that you’re resetting cached metadata for. You must
     * use this parameter only if the connector supports multiple API versions or if the connector type is
     * CustomConnector.
     * </p>
     * <p>
     * To look up how many versions a connector supports, use the DescribeConnectors action. In the response, find the
     * value that Amazon AppFlow returns for the connectorVersion parameter.
     * </p>
     * <p>
     * To look up the connector type, use the DescribeConnectorProfiles action. In the response, find the value that
     * Amazon AppFlow returns for the connectorType parameter.
     * </p>
     * <p>
     * To look up the API version that you specified in a connector profile, use the DescribeConnectorProfiles action.
     * </p>
     */
    private String apiVersion;

    /**
     * <p>
     * The name of the connector profile that you want to reset cached metadata for.
     * </p>
     * <p>
     * You can omit this parameter if you're resetting the cache for any of the following connectors: Amazon Connect,
     * Amazon EventBridge, Amazon Lookout for Metrics, Amazon S3, or Upsolver. If you're resetting the cache for any
     * other connector, you must include this parameter in your request.
     * </p>
     * 
     * @param connectorProfileName
     *        The name of the connector profile that you want to reset cached metadata for.</p>
     *        <p>
     *        You can omit this parameter if you're resetting the cache for any of the following connectors: Amazon
     *        Connect, Amazon EventBridge, Amazon Lookout for Metrics, Amazon S3, or Upsolver. If you're resetting the
     *        cache for any other connector, you must include this parameter in your request.
     */

    public void setConnectorProfileName(String connectorProfileName) {
        this.connectorProfileName = connectorProfileName;
    }

    /**
     * <p>
     * The name of the connector profile that you want to reset cached metadata for.
     * </p>
     * <p>
     * You can omit this parameter if you're resetting the cache for any of the following connectors: Amazon Connect,
     * Amazon EventBridge, Amazon Lookout for Metrics, Amazon S3, or Upsolver. If you're resetting the cache for any
     * other connector, you must include this parameter in your request.
     * </p>
     * 
     * @return The name of the connector profile that you want to reset cached metadata for.</p>
     *         <p>
     *         You can omit this parameter if you're resetting the cache for any of the following connectors: Amazon
     *         Connect, Amazon EventBridge, Amazon Lookout for Metrics, Amazon S3, or Upsolver. If you're resetting the
     *         cache for any other connector, you must include this parameter in your request.
     */

    public String getConnectorProfileName() {
        return this.connectorProfileName;
    }

    /**
     * <p>
     * The name of the connector profile that you want to reset cached metadata for.
     * </p>
     * <p>
     * You can omit this parameter if you're resetting the cache for any of the following connectors: Amazon Connect,
     * Amazon EventBridge, Amazon Lookout for Metrics, Amazon S3, or Upsolver. If you're resetting the cache for any
     * other connector, you must include this parameter in your request.
     * </p>
     * 
     * @param connectorProfileName
     *        The name of the connector profile that you want to reset cached metadata for.</p>
     *        <p>
     *        You can omit this parameter if you're resetting the cache for any of the following connectors: Amazon
     *        Connect, Amazon EventBridge, Amazon Lookout for Metrics, Amazon S3, or Upsolver. If you're resetting the
     *        cache for any other connector, you must include this parameter in your request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResetConnectorMetadataCacheRequest withConnectorProfileName(String connectorProfileName) {
        setConnectorProfileName(connectorProfileName);
        return this;
    }

    /**
     * <p>
     * The type of connector to reset cached metadata for.
     * </p>
     * <p>
     * You must include this parameter in your request if you're resetting the cache for any of the following
     * connectors: Amazon Connect, Amazon EventBridge, Amazon Lookout for Metrics, Amazon S3, or Upsolver. If you're
     * resetting the cache for any other connector, you can omit this parameter from your request.
     * </p>
     * 
     * @param connectorType
     *        The type of connector to reset cached metadata for.</p>
     *        <p>
     *        You must include this parameter in your request if you're resetting the cache for any of the following
     *        connectors: Amazon Connect, Amazon EventBridge, Amazon Lookout for Metrics, Amazon S3, or Upsolver. If
     *        you're resetting the cache for any other connector, you can omit this parameter from your request.
     * @see ConnectorType
     */

    public void setConnectorType(String connectorType) {
        this.connectorType = connectorType;
    }

    /**
     * <p>
     * The type of connector to reset cached metadata for.
     * </p>
     * <p>
     * You must include this parameter in your request if you're resetting the cache for any of the following
     * connectors: Amazon Connect, Amazon EventBridge, Amazon Lookout for Metrics, Amazon S3, or Upsolver. If you're
     * resetting the cache for any other connector, you can omit this parameter from your request.
     * </p>
     * 
     * @return The type of connector to reset cached metadata for.</p>
     *         <p>
     *         You must include this parameter in your request if you're resetting the cache for any of the following
     *         connectors: Amazon Connect, Amazon EventBridge, Amazon Lookout for Metrics, Amazon S3, or Upsolver. If
     *         you're resetting the cache for any other connector, you can omit this parameter from your request.
     * @see ConnectorType
     */

    public String getConnectorType() {
        return this.connectorType;
    }

    /**
     * <p>
     * The type of connector to reset cached metadata for.
     * </p>
     * <p>
     * You must include this parameter in your request if you're resetting the cache for any of the following
     * connectors: Amazon Connect, Amazon EventBridge, Amazon Lookout for Metrics, Amazon S3, or Upsolver. If you're
     * resetting the cache for any other connector, you can omit this parameter from your request.
     * </p>
     * 
     * @param connectorType
     *        The type of connector to reset cached metadata for.</p>
     *        <p>
     *        You must include this parameter in your request if you're resetting the cache for any of the following
     *        connectors: Amazon Connect, Amazon EventBridge, Amazon Lookout for Metrics, Amazon S3, or Upsolver. If
     *        you're resetting the cache for any other connector, you can omit this parameter from your request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConnectorType
     */

    public ResetConnectorMetadataCacheRequest withConnectorType(String connectorType) {
        setConnectorType(connectorType);
        return this;
    }

    /**
     * <p>
     * The type of connector to reset cached metadata for.
     * </p>
     * <p>
     * You must include this parameter in your request if you're resetting the cache for any of the following
     * connectors: Amazon Connect, Amazon EventBridge, Amazon Lookout for Metrics, Amazon S3, or Upsolver. If you're
     * resetting the cache for any other connector, you can omit this parameter from your request.
     * </p>
     * 
     * @param connectorType
     *        The type of connector to reset cached metadata for.</p>
     *        <p>
     *        You must include this parameter in your request if you're resetting the cache for any of the following
     *        connectors: Amazon Connect, Amazon EventBridge, Amazon Lookout for Metrics, Amazon S3, or Upsolver. If
     *        you're resetting the cache for any other connector, you can omit this parameter from your request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConnectorType
     */

    public ResetConnectorMetadataCacheRequest withConnectorType(ConnectorType connectorType) {
        this.connectorType = connectorType.toString();
        return this;
    }

    /**
     * <p>
     * Use this parameter if you want to reset cached metadata about the details for an individual entity.
     * </p>
     * <p>
     * If you don't include this parameter in your request, Amazon AppFlow only resets cached metadata about entity
     * names, not entity details.
     * </p>
     * 
     * @param connectorEntityName
     *        Use this parameter if you want to reset cached metadata about the details for an individual entity.</p>
     *        <p>
     *        If you don't include this parameter in your request, Amazon AppFlow only resets cached metadata about
     *        entity names, not entity details.
     */

    public void setConnectorEntityName(String connectorEntityName) {
        this.connectorEntityName = connectorEntityName;
    }

    /**
     * <p>
     * Use this parameter if you want to reset cached metadata about the details for an individual entity.
     * </p>
     * <p>
     * If you don't include this parameter in your request, Amazon AppFlow only resets cached metadata about entity
     * names, not entity details.
     * </p>
     * 
     * @return Use this parameter if you want to reset cached metadata about the details for an individual entity.</p>
     *         <p>
     *         If you don't include this parameter in your request, Amazon AppFlow only resets cached metadata about
     *         entity names, not entity details.
     */

    public String getConnectorEntityName() {
        return this.connectorEntityName;
    }

    /**
     * <p>
     * Use this parameter if you want to reset cached metadata about the details for an individual entity.
     * </p>
     * <p>
     * If you don't include this parameter in your request, Amazon AppFlow only resets cached metadata about entity
     * names, not entity details.
     * </p>
     * 
     * @param connectorEntityName
     *        Use this parameter if you want to reset cached metadata about the details for an individual entity.</p>
     *        <p>
     *        If you don't include this parameter in your request, Amazon AppFlow only resets cached metadata about
     *        entity names, not entity details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResetConnectorMetadataCacheRequest withConnectorEntityName(String connectorEntityName) {
        setConnectorEntityName(connectorEntityName);
        return this;
    }

    /**
     * <p>
     * Use this parameter only if you’re resetting the cached metadata about a nested entity. Only some connectors
     * support nested entities. A nested entity is one that has another entity as a parent. To use this parameter,
     * specify the name of the parent entity.
     * </p>
     * <p>
     * To look up the parent-child relationship of entities, you can send a ListConnectorEntities request that omits the
     * entitiesPath parameter. Amazon AppFlow will return a list of top-level entities. For each one, it indicates
     * whether the entity has nested entities. Then, in a subsequent ListConnectorEntities request, you can specify a
     * parent entity name for the entitiesPath parameter. Amazon AppFlow will return a list of the child entities for
     * that parent.
     * </p>
     * 
     * @param entitiesPath
     *        Use this parameter only if you’re resetting the cached metadata about a nested entity. Only some
     *        connectors support nested entities. A nested entity is one that has another entity as a parent. To use
     *        this parameter, specify the name of the parent entity.</p>
     *        <p>
     *        To look up the parent-child relationship of entities, you can send a ListConnectorEntities request that
     *        omits the entitiesPath parameter. Amazon AppFlow will return a list of top-level entities. For each one,
     *        it indicates whether the entity has nested entities. Then, in a subsequent ListConnectorEntities request,
     *        you can specify a parent entity name for the entitiesPath parameter. Amazon AppFlow will return a list of
     *        the child entities for that parent.
     */

    public void setEntitiesPath(String entitiesPath) {
        this.entitiesPath = entitiesPath;
    }

    /**
     * <p>
     * Use this parameter only if you’re resetting the cached metadata about a nested entity. Only some connectors
     * support nested entities. A nested entity is one that has another entity as a parent. To use this parameter,
     * specify the name of the parent entity.
     * </p>
     * <p>
     * To look up the parent-child relationship of entities, you can send a ListConnectorEntities request that omits the
     * entitiesPath parameter. Amazon AppFlow will return a list of top-level entities. For each one, it indicates
     * whether the entity has nested entities. Then, in a subsequent ListConnectorEntities request, you can specify a
     * parent entity name for the entitiesPath parameter. Amazon AppFlow will return a list of the child entities for
     * that parent.
     * </p>
     * 
     * @return Use this parameter only if you’re resetting the cached metadata about a nested entity. Only some
     *         connectors support nested entities. A nested entity is one that has another entity as a parent. To use
     *         this parameter, specify the name of the parent entity.</p>
     *         <p>
     *         To look up the parent-child relationship of entities, you can send a ListConnectorEntities request that
     *         omits the entitiesPath parameter. Amazon AppFlow will return a list of top-level entities. For each one,
     *         it indicates whether the entity has nested entities. Then, in a subsequent ListConnectorEntities request,
     *         you can specify a parent entity name for the entitiesPath parameter. Amazon AppFlow will return a list of
     *         the child entities for that parent.
     */

    public String getEntitiesPath() {
        return this.entitiesPath;
    }

    /**
     * <p>
     * Use this parameter only if you’re resetting the cached metadata about a nested entity. Only some connectors
     * support nested entities. A nested entity is one that has another entity as a parent. To use this parameter,
     * specify the name of the parent entity.
     * </p>
     * <p>
     * To look up the parent-child relationship of entities, you can send a ListConnectorEntities request that omits the
     * entitiesPath parameter. Amazon AppFlow will return a list of top-level entities. For each one, it indicates
     * whether the entity has nested entities. Then, in a subsequent ListConnectorEntities request, you can specify a
     * parent entity name for the entitiesPath parameter. Amazon AppFlow will return a list of the child entities for
     * that parent.
     * </p>
     * 
     * @param entitiesPath
     *        Use this parameter only if you’re resetting the cached metadata about a nested entity. Only some
     *        connectors support nested entities. A nested entity is one that has another entity as a parent. To use
     *        this parameter, specify the name of the parent entity.</p>
     *        <p>
     *        To look up the parent-child relationship of entities, you can send a ListConnectorEntities request that
     *        omits the entitiesPath parameter. Amazon AppFlow will return a list of top-level entities. For each one,
     *        it indicates whether the entity has nested entities. Then, in a subsequent ListConnectorEntities request,
     *        you can specify a parent entity name for the entitiesPath parameter. Amazon AppFlow will return a list of
     *        the child entities for that parent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResetConnectorMetadataCacheRequest withEntitiesPath(String entitiesPath) {
        setEntitiesPath(entitiesPath);
        return this;
    }

    /**
     * <p>
     * The API version that you specified in the connector profile that you’re resetting cached metadata for. You must
     * use this parameter only if the connector supports multiple API versions or if the connector type is
     * CustomConnector.
     * </p>
     * <p>
     * To look up how many versions a connector supports, use the DescribeConnectors action. In the response, find the
     * value that Amazon AppFlow returns for the connectorVersion parameter.
     * </p>
     * <p>
     * To look up the connector type, use the DescribeConnectorProfiles action. In the response, find the value that
     * Amazon AppFlow returns for the connectorType parameter.
     * </p>
     * <p>
     * To look up the API version that you specified in a connector profile, use the DescribeConnectorProfiles action.
     * </p>
     * 
     * @param apiVersion
     *        The API version that you specified in the connector profile that you’re resetting cached metadata for. You
     *        must use this parameter only if the connector supports multiple API versions or if the connector type is
     *        CustomConnector.</p>
     *        <p>
     *        To look up how many versions a connector supports, use the DescribeConnectors action. In the response,
     *        find the value that Amazon AppFlow returns for the connectorVersion parameter.
     *        </p>
     *        <p>
     *        To look up the connector type, use the DescribeConnectorProfiles action. In the response, find the value
     *        that Amazon AppFlow returns for the connectorType parameter.
     *        </p>
     *        <p>
     *        To look up the API version that you specified in a connector profile, use the DescribeConnectorProfiles
     *        action.
     */

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    /**
     * <p>
     * The API version that you specified in the connector profile that you’re resetting cached metadata for. You must
     * use this parameter only if the connector supports multiple API versions or if the connector type is
     * CustomConnector.
     * </p>
     * <p>
     * To look up how many versions a connector supports, use the DescribeConnectors action. In the response, find the
     * value that Amazon AppFlow returns for the connectorVersion parameter.
     * </p>
     * <p>
     * To look up the connector type, use the DescribeConnectorProfiles action. In the response, find the value that
     * Amazon AppFlow returns for the connectorType parameter.
     * </p>
     * <p>
     * To look up the API version that you specified in a connector profile, use the DescribeConnectorProfiles action.
     * </p>
     * 
     * @return The API version that you specified in the connector profile that you’re resetting cached metadata for.
     *         You must use this parameter only if the connector supports multiple API versions or if the connector type
     *         is CustomConnector.</p>
     *         <p>
     *         To look up how many versions a connector supports, use the DescribeConnectors action. In the response,
     *         find the value that Amazon AppFlow returns for the connectorVersion parameter.
     *         </p>
     *         <p>
     *         To look up the connector type, use the DescribeConnectorProfiles action. In the response, find the value
     *         that Amazon AppFlow returns for the connectorType parameter.
     *         </p>
     *         <p>
     *         To look up the API version that you specified in a connector profile, use the DescribeConnectorProfiles
     *         action.
     */

    public String getApiVersion() {
        return this.apiVersion;
    }

    /**
     * <p>
     * The API version that you specified in the connector profile that you’re resetting cached metadata for. You must
     * use this parameter only if the connector supports multiple API versions or if the connector type is
     * CustomConnector.
     * </p>
     * <p>
     * To look up how many versions a connector supports, use the DescribeConnectors action. In the response, find the
     * value that Amazon AppFlow returns for the connectorVersion parameter.
     * </p>
     * <p>
     * To look up the connector type, use the DescribeConnectorProfiles action. In the response, find the value that
     * Amazon AppFlow returns for the connectorType parameter.
     * </p>
     * <p>
     * To look up the API version that you specified in a connector profile, use the DescribeConnectorProfiles action.
     * </p>
     * 
     * @param apiVersion
     *        The API version that you specified in the connector profile that you’re resetting cached metadata for. You
     *        must use this parameter only if the connector supports multiple API versions or if the connector type is
     *        CustomConnector.</p>
     *        <p>
     *        To look up how many versions a connector supports, use the DescribeConnectors action. In the response,
     *        find the value that Amazon AppFlow returns for the connectorVersion parameter.
     *        </p>
     *        <p>
     *        To look up the connector type, use the DescribeConnectorProfiles action. In the response, find the value
     *        that Amazon AppFlow returns for the connectorType parameter.
     *        </p>
     *        <p>
     *        To look up the API version that you specified in a connector profile, use the DescribeConnectorProfiles
     *        action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResetConnectorMetadataCacheRequest withApiVersion(String apiVersion) {
        setApiVersion(apiVersion);
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
        if (getConnectorEntityName() != null)
            sb.append("ConnectorEntityName: ").append(getConnectorEntityName()).append(",");
        if (getEntitiesPath() != null)
            sb.append("EntitiesPath: ").append(getEntitiesPath()).append(",");
        if (getApiVersion() != null)
            sb.append("ApiVersion: ").append(getApiVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResetConnectorMetadataCacheRequest == false)
            return false;
        ResetConnectorMetadataCacheRequest other = (ResetConnectorMetadataCacheRequest) obj;
        if (other.getConnectorProfileName() == null ^ this.getConnectorProfileName() == null)
            return false;
        if (other.getConnectorProfileName() != null && other.getConnectorProfileName().equals(this.getConnectorProfileName()) == false)
            return false;
        if (other.getConnectorType() == null ^ this.getConnectorType() == null)
            return false;
        if (other.getConnectorType() != null && other.getConnectorType().equals(this.getConnectorType()) == false)
            return false;
        if (other.getConnectorEntityName() == null ^ this.getConnectorEntityName() == null)
            return false;
        if (other.getConnectorEntityName() != null && other.getConnectorEntityName().equals(this.getConnectorEntityName()) == false)
            return false;
        if (other.getEntitiesPath() == null ^ this.getEntitiesPath() == null)
            return false;
        if (other.getEntitiesPath() != null && other.getEntitiesPath().equals(this.getEntitiesPath()) == false)
            return false;
        if (other.getApiVersion() == null ^ this.getApiVersion() == null)
            return false;
        if (other.getApiVersion() != null && other.getApiVersion().equals(this.getApiVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConnectorProfileName() == null) ? 0 : getConnectorProfileName().hashCode());
        hashCode = prime * hashCode + ((getConnectorType() == null) ? 0 : getConnectorType().hashCode());
        hashCode = prime * hashCode + ((getConnectorEntityName() == null) ? 0 : getConnectorEntityName().hashCode());
        hashCode = prime * hashCode + ((getEntitiesPath() == null) ? 0 : getEntitiesPath().hashCode());
        hashCode = prime * hashCode + ((getApiVersion() == null) ? 0 : getApiVersion().hashCode());
        return hashCode;
    }

    @Override
    public ResetConnectorMetadataCacheRequest clone() {
        return (ResetConnectorMetadataCacheRequest) super.clone();
    }

}
