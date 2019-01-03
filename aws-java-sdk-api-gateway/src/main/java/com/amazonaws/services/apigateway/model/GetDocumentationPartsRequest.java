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
package com.amazonaws.services.apigateway.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Gets the documentation parts of an API. The result may be filtered by the type, name, or path of API entities
 * (targets).
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDocumentationPartsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * [Required] The string identifier of the associated <a>RestApi</a>.
     * </p>
     */
    private String restApiId;
    /**
     * <p>
     * The type of API entities of the to-be-retrieved documentation parts.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The name of API entities of the to-be-retrieved documentation parts.
     * </p>
     */
    private String nameQuery;
    /**
     * <p>
     * The path of API entities of the to-be-retrieved documentation parts.
     * </p>
     */
    private String path;
    /**
     * <p>
     * The current pagination position in the paged result set.
     * </p>
     */
    private String position;
    /**
     * <p>
     * The maximum number of returned results per page. The default value is 25 and the maximum value is 500.
     * </p>
     */
    private Integer limit;
    /**
     * <p>
     * The status of the API documentation parts to retrieve. Valid values are <code>DOCUMENTED</code> for retrieving
     * <a>DocumentationPart</a> resources with content and <code>UNDOCUMENTED</code> for <a>DocumentationPart</a>
     * resources without content.
     * </p>
     */
    private String locationStatus;

    /**
     * <p>
     * [Required] The string identifier of the associated <a>RestApi</a>.
     * </p>
     * 
     * @param restApiId
     *        [Required] The string identifier of the associated <a>RestApi</a>.
     */

    public void setRestApiId(String restApiId) {
        this.restApiId = restApiId;
    }

    /**
     * <p>
     * [Required] The string identifier of the associated <a>RestApi</a>.
     * </p>
     * 
     * @return [Required] The string identifier of the associated <a>RestApi</a>.
     */

    public String getRestApiId() {
        return this.restApiId;
    }

    /**
     * <p>
     * [Required] The string identifier of the associated <a>RestApi</a>.
     * </p>
     * 
     * @param restApiId
     *        [Required] The string identifier of the associated <a>RestApi</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDocumentationPartsRequest withRestApiId(String restApiId) {
        setRestApiId(restApiId);
        return this;
    }

    /**
     * <p>
     * The type of API entities of the to-be-retrieved documentation parts.
     * </p>
     * 
     * @param type
     *        The type of API entities of the to-be-retrieved documentation parts.
     * @see DocumentationPartType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of API entities of the to-be-retrieved documentation parts.
     * </p>
     * 
     * @return The type of API entities of the to-be-retrieved documentation parts.
     * @see DocumentationPartType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of API entities of the to-be-retrieved documentation parts.
     * </p>
     * 
     * @param type
     *        The type of API entities of the to-be-retrieved documentation parts.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DocumentationPartType
     */

    public GetDocumentationPartsRequest withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of API entities of the to-be-retrieved documentation parts.
     * </p>
     * 
     * @param type
     *        The type of API entities of the to-be-retrieved documentation parts.
     * @see DocumentationPartType
     */

    public void setType(DocumentationPartType type) {
        withType(type);
    }

    /**
     * <p>
     * The type of API entities of the to-be-retrieved documentation parts.
     * </p>
     * 
     * @param type
     *        The type of API entities of the to-be-retrieved documentation parts.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DocumentationPartType
     */

    public GetDocumentationPartsRequest withType(DocumentationPartType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The name of API entities of the to-be-retrieved documentation parts.
     * </p>
     * 
     * @param nameQuery
     *        The name of API entities of the to-be-retrieved documentation parts.
     */

    public void setNameQuery(String nameQuery) {
        this.nameQuery = nameQuery;
    }

    /**
     * <p>
     * The name of API entities of the to-be-retrieved documentation parts.
     * </p>
     * 
     * @return The name of API entities of the to-be-retrieved documentation parts.
     */

    public String getNameQuery() {
        return this.nameQuery;
    }

    /**
     * <p>
     * The name of API entities of the to-be-retrieved documentation parts.
     * </p>
     * 
     * @param nameQuery
     *        The name of API entities of the to-be-retrieved documentation parts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDocumentationPartsRequest withNameQuery(String nameQuery) {
        setNameQuery(nameQuery);
        return this;
    }

    /**
     * <p>
     * The path of API entities of the to-be-retrieved documentation parts.
     * </p>
     * 
     * @param path
     *        The path of API entities of the to-be-retrieved documentation parts.
     */

    public void setPath(String path) {
        this.path = path;
    }

    /**
     * <p>
     * The path of API entities of the to-be-retrieved documentation parts.
     * </p>
     * 
     * @return The path of API entities of the to-be-retrieved documentation parts.
     */

    public String getPath() {
        return this.path;
    }

    /**
     * <p>
     * The path of API entities of the to-be-retrieved documentation parts.
     * </p>
     * 
     * @param path
     *        The path of API entities of the to-be-retrieved documentation parts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDocumentationPartsRequest withPath(String path) {
        setPath(path);
        return this;
    }

    /**
     * <p>
     * The current pagination position in the paged result set.
     * </p>
     * 
     * @param position
     *        The current pagination position in the paged result set.
     */

    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * <p>
     * The current pagination position in the paged result set.
     * </p>
     * 
     * @return The current pagination position in the paged result set.
     */

    public String getPosition() {
        return this.position;
    }

    /**
     * <p>
     * The current pagination position in the paged result set.
     * </p>
     * 
     * @param position
     *        The current pagination position in the paged result set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDocumentationPartsRequest withPosition(String position) {
        setPosition(position);
        return this;
    }

    /**
     * <p>
     * The maximum number of returned results per page. The default value is 25 and the maximum value is 500.
     * </p>
     * 
     * @param limit
     *        The maximum number of returned results per page. The default value is 25 and the maximum value is 500.
     */

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * The maximum number of returned results per page. The default value is 25 and the maximum value is 500.
     * </p>
     * 
     * @return The maximum number of returned results per page. The default value is 25 and the maximum value is 500.
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * The maximum number of returned results per page. The default value is 25 and the maximum value is 500.
     * </p>
     * 
     * @param limit
     *        The maximum number of returned results per page. The default value is 25 and the maximum value is 500.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDocumentationPartsRequest withLimit(Integer limit) {
        setLimit(limit);
        return this;
    }

    /**
     * <p>
     * The status of the API documentation parts to retrieve. Valid values are <code>DOCUMENTED</code> for retrieving
     * <a>DocumentationPart</a> resources with content and <code>UNDOCUMENTED</code> for <a>DocumentationPart</a>
     * resources without content.
     * </p>
     * 
     * @param locationStatus
     *        The status of the API documentation parts to retrieve. Valid values are <code>DOCUMENTED</code> for
     *        retrieving <a>DocumentationPart</a> resources with content and <code>UNDOCUMENTED</code> for
     *        <a>DocumentationPart</a> resources without content.
     * @see LocationStatusType
     */

    public void setLocationStatus(String locationStatus) {
        this.locationStatus = locationStatus;
    }

    /**
     * <p>
     * The status of the API documentation parts to retrieve. Valid values are <code>DOCUMENTED</code> for retrieving
     * <a>DocumentationPart</a> resources with content and <code>UNDOCUMENTED</code> for <a>DocumentationPart</a>
     * resources without content.
     * </p>
     * 
     * @return The status of the API documentation parts to retrieve. Valid values are <code>DOCUMENTED</code> for
     *         retrieving <a>DocumentationPart</a> resources with content and <code>UNDOCUMENTED</code> for
     *         <a>DocumentationPart</a> resources without content.
     * @see LocationStatusType
     */

    public String getLocationStatus() {
        return this.locationStatus;
    }

    /**
     * <p>
     * The status of the API documentation parts to retrieve. Valid values are <code>DOCUMENTED</code> for retrieving
     * <a>DocumentationPart</a> resources with content and <code>UNDOCUMENTED</code> for <a>DocumentationPart</a>
     * resources without content.
     * </p>
     * 
     * @param locationStatus
     *        The status of the API documentation parts to retrieve. Valid values are <code>DOCUMENTED</code> for
     *        retrieving <a>DocumentationPart</a> resources with content and <code>UNDOCUMENTED</code> for
     *        <a>DocumentationPart</a> resources without content.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LocationStatusType
     */

    public GetDocumentationPartsRequest withLocationStatus(String locationStatus) {
        setLocationStatus(locationStatus);
        return this;
    }

    /**
     * <p>
     * The status of the API documentation parts to retrieve. Valid values are <code>DOCUMENTED</code> for retrieving
     * <a>DocumentationPart</a> resources with content and <code>UNDOCUMENTED</code> for <a>DocumentationPart</a>
     * resources without content.
     * </p>
     * 
     * @param locationStatus
     *        The status of the API documentation parts to retrieve. Valid values are <code>DOCUMENTED</code> for
     *        retrieving <a>DocumentationPart</a> resources with content and <code>UNDOCUMENTED</code> for
     *        <a>DocumentationPart</a> resources without content.
     * @see LocationStatusType
     */

    public void setLocationStatus(LocationStatusType locationStatus) {
        withLocationStatus(locationStatus);
    }

    /**
     * <p>
     * The status of the API documentation parts to retrieve. Valid values are <code>DOCUMENTED</code> for retrieving
     * <a>DocumentationPart</a> resources with content and <code>UNDOCUMENTED</code> for <a>DocumentationPart</a>
     * resources without content.
     * </p>
     * 
     * @param locationStatus
     *        The status of the API documentation parts to retrieve. Valid values are <code>DOCUMENTED</code> for
     *        retrieving <a>DocumentationPart</a> resources with content and <code>UNDOCUMENTED</code> for
     *        <a>DocumentationPart</a> resources without content.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LocationStatusType
     */

    public GetDocumentationPartsRequest withLocationStatus(LocationStatusType locationStatus) {
        this.locationStatus = locationStatus.toString();
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
        if (getRestApiId() != null)
            sb.append("RestApiId: ").append(getRestApiId()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getNameQuery() != null)
            sb.append("NameQuery: ").append(getNameQuery()).append(",");
        if (getPath() != null)
            sb.append("Path: ").append(getPath()).append(",");
        if (getPosition() != null)
            sb.append("Position: ").append(getPosition()).append(",");
        if (getLimit() != null)
            sb.append("Limit: ").append(getLimit()).append(",");
        if (getLocationStatus() != null)
            sb.append("LocationStatus: ").append(getLocationStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDocumentationPartsRequest == false)
            return false;
        GetDocumentationPartsRequest other = (GetDocumentationPartsRequest) obj;
        if (other.getRestApiId() == null ^ this.getRestApiId() == null)
            return false;
        if (other.getRestApiId() != null && other.getRestApiId().equals(this.getRestApiId()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getNameQuery() == null ^ this.getNameQuery() == null)
            return false;
        if (other.getNameQuery() != null && other.getNameQuery().equals(this.getNameQuery()) == false)
            return false;
        if (other.getPath() == null ^ this.getPath() == null)
            return false;
        if (other.getPath() != null && other.getPath().equals(this.getPath()) == false)
            return false;
        if (other.getPosition() == null ^ this.getPosition() == null)
            return false;
        if (other.getPosition() != null && other.getPosition().equals(this.getPosition()) == false)
            return false;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
            return false;
        if (other.getLocationStatus() == null ^ this.getLocationStatus() == null)
            return false;
        if (other.getLocationStatus() != null && other.getLocationStatus().equals(this.getLocationStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRestApiId() == null) ? 0 : getRestApiId().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getNameQuery() == null) ? 0 : getNameQuery().hashCode());
        hashCode = prime * hashCode + ((getPath() == null) ? 0 : getPath().hashCode());
        hashCode = prime * hashCode + ((getPosition() == null) ? 0 : getPosition().hashCode());
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        hashCode = prime * hashCode + ((getLocationStatus() == null) ? 0 : getLocationStatus().hashCode());
        return hashCode;
    }

    @Override
    public GetDocumentationPartsRequest clone() {
        return (GetDocumentationPartsRequest) super.clone();
    }

}
