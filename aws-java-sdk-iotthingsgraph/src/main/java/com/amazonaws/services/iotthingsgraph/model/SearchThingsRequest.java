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
package com.amazonaws.services.iotthingsgraph.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/SearchThings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SearchThingsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the entity to which the things are associated.
     * </p>
     * <p>
     * The IDs should be in the following format.
     * </p>
     * <p>
     * <code>urn:tdm:REGION/ACCOUNT ID/default:device:DEVICENAME</code>
     * </p>
     */
    private String entityId;
    /**
     * <p>
     * The string that specifies the next page of results. Use this when you're paginating results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of results to return in the response.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The version of the user's namespace. Defaults to the latest version of the user's namespace.
     * </p>
     */
    private Long namespaceVersion;

    /**
     * <p>
     * The ID of the entity to which the things are associated.
     * </p>
     * <p>
     * The IDs should be in the following format.
     * </p>
     * <p>
     * <code>urn:tdm:REGION/ACCOUNT ID/default:device:DEVICENAME</code>
     * </p>
     * 
     * @param entityId
     *        The ID of the entity to which the things are associated.</p>
     *        <p>
     *        The IDs should be in the following format.
     *        </p>
     *        <p>
     *        <code>urn:tdm:REGION/ACCOUNT ID/default:device:DEVICENAME</code>
     */

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    /**
     * <p>
     * The ID of the entity to which the things are associated.
     * </p>
     * <p>
     * The IDs should be in the following format.
     * </p>
     * <p>
     * <code>urn:tdm:REGION/ACCOUNT ID/default:device:DEVICENAME</code>
     * </p>
     * 
     * @return The ID of the entity to which the things are associated.</p>
     *         <p>
     *         The IDs should be in the following format.
     *         </p>
     *         <p>
     *         <code>urn:tdm:REGION/ACCOUNT ID/default:device:DEVICENAME</code>
     */

    public String getEntityId() {
        return this.entityId;
    }

    /**
     * <p>
     * The ID of the entity to which the things are associated.
     * </p>
     * <p>
     * The IDs should be in the following format.
     * </p>
     * <p>
     * <code>urn:tdm:REGION/ACCOUNT ID/default:device:DEVICENAME</code>
     * </p>
     * 
     * @param entityId
     *        The ID of the entity to which the things are associated.</p>
     *        <p>
     *        The IDs should be in the following format.
     *        </p>
     *        <p>
     *        <code>urn:tdm:REGION/ACCOUNT ID/default:device:DEVICENAME</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchThingsRequest withEntityId(String entityId) {
        setEntityId(entityId);
        return this;
    }

    /**
     * <p>
     * The string that specifies the next page of results. Use this when you're paginating results.
     * </p>
     * 
     * @param nextToken
     *        The string that specifies the next page of results. Use this when you're paginating results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The string that specifies the next page of results. Use this when you're paginating results.
     * </p>
     * 
     * @return The string that specifies the next page of results. Use this when you're paginating results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The string that specifies the next page of results. Use this when you're paginating results.
     * </p>
     * 
     * @param nextToken
     *        The string that specifies the next page of results. Use this when you're paginating results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchThingsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return in the response.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in the response.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in the response.
     * </p>
     * 
     * @return The maximum number of results to return in the response.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in the response.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchThingsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The version of the user's namespace. Defaults to the latest version of the user's namespace.
     * </p>
     * 
     * @param namespaceVersion
     *        The version of the user's namespace. Defaults to the latest version of the user's namespace.
     */

    public void setNamespaceVersion(Long namespaceVersion) {
        this.namespaceVersion = namespaceVersion;
    }

    /**
     * <p>
     * The version of the user's namespace. Defaults to the latest version of the user's namespace.
     * </p>
     * 
     * @return The version of the user's namespace. Defaults to the latest version of the user's namespace.
     */

    public Long getNamespaceVersion() {
        return this.namespaceVersion;
    }

    /**
     * <p>
     * The version of the user's namespace. Defaults to the latest version of the user's namespace.
     * </p>
     * 
     * @param namespaceVersion
     *        The version of the user's namespace. Defaults to the latest version of the user's namespace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchThingsRequest withNamespaceVersion(Long namespaceVersion) {
        setNamespaceVersion(namespaceVersion);
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
        if (getEntityId() != null)
            sb.append("EntityId: ").append(getEntityId()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNamespaceVersion() != null)
            sb.append("NamespaceVersion: ").append(getNamespaceVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SearchThingsRequest == false)
            return false;
        SearchThingsRequest other = (SearchThingsRequest) obj;
        if (other.getEntityId() == null ^ this.getEntityId() == null)
            return false;
        if (other.getEntityId() != null && other.getEntityId().equals(this.getEntityId()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNamespaceVersion() == null ^ this.getNamespaceVersion() == null)
            return false;
        if (other.getNamespaceVersion() != null && other.getNamespaceVersion().equals(this.getNamespaceVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEntityId() == null) ? 0 : getEntityId().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNamespaceVersion() == null) ? 0 : getNamespaceVersion().hashCode());
        return hashCode;
    }

    @Override
    public SearchThingsRequest clone() {
        return (SearchThingsRequest) super.clone();
    }

}
