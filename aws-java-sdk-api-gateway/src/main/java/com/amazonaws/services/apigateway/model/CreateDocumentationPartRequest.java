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
 * Creates a new documentation part of a given API.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDocumentationPartRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * [Required] The string identifier of the associated <a>RestApi</a>.
     * </p>
     */
    private String restApiId;
    /**
     * <p>
     * [Required] The location of the targeted API entity of the to-be-created documentation part.
     * </p>
     */
    private DocumentationPartLocation location;
    /**
     * <p>
     * [Required] The new documentation content map of the targeted API entity. Enclosed key-value pairs are
     * API-specific, but only OpenAPI-compliant key-value pairs can be exported and, hence, published.
     * </p>
     */
    private String properties;

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

    public CreateDocumentationPartRequest withRestApiId(String restApiId) {
        setRestApiId(restApiId);
        return this;
    }

    /**
     * <p>
     * [Required] The location of the targeted API entity of the to-be-created documentation part.
     * </p>
     * 
     * @param location
     *        [Required] The location of the targeted API entity of the to-be-created documentation part.
     */

    public void setLocation(DocumentationPartLocation location) {
        this.location = location;
    }

    /**
     * <p>
     * [Required] The location of the targeted API entity of the to-be-created documentation part.
     * </p>
     * 
     * @return [Required] The location of the targeted API entity of the to-be-created documentation part.
     */

    public DocumentationPartLocation getLocation() {
        return this.location;
    }

    /**
     * <p>
     * [Required] The location of the targeted API entity of the to-be-created documentation part.
     * </p>
     * 
     * @param location
     *        [Required] The location of the targeted API entity of the to-be-created documentation part.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDocumentationPartRequest withLocation(DocumentationPartLocation location) {
        setLocation(location);
        return this;
    }

    /**
     * <p>
     * [Required] The new documentation content map of the targeted API entity. Enclosed key-value pairs are
     * API-specific, but only OpenAPI-compliant key-value pairs can be exported and, hence, published.
     * </p>
     * 
     * @param properties
     *        [Required] The new documentation content map of the targeted API entity. Enclosed key-value pairs are
     *        API-specific, but only OpenAPI-compliant key-value pairs can be exported and, hence, published.
     */

    public void setProperties(String properties) {
        this.properties = properties;
    }

    /**
     * <p>
     * [Required] The new documentation content map of the targeted API entity. Enclosed key-value pairs are
     * API-specific, but only OpenAPI-compliant key-value pairs can be exported and, hence, published.
     * </p>
     * 
     * @return [Required] The new documentation content map of the targeted API entity. Enclosed key-value pairs are
     *         API-specific, but only OpenAPI-compliant key-value pairs can be exported and, hence, published.
     */

    public String getProperties() {
        return this.properties;
    }

    /**
     * <p>
     * [Required] The new documentation content map of the targeted API entity. Enclosed key-value pairs are
     * API-specific, but only OpenAPI-compliant key-value pairs can be exported and, hence, published.
     * </p>
     * 
     * @param properties
     *        [Required] The new documentation content map of the targeted API entity. Enclosed key-value pairs are
     *        API-specific, but only OpenAPI-compliant key-value pairs can be exported and, hence, published.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDocumentationPartRequest withProperties(String properties) {
        setProperties(properties);
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
        if (getLocation() != null)
            sb.append("Location: ").append(getLocation()).append(",");
        if (getProperties() != null)
            sb.append("Properties: ").append(getProperties());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDocumentationPartRequest == false)
            return false;
        CreateDocumentationPartRequest other = (CreateDocumentationPartRequest) obj;
        if (other.getRestApiId() == null ^ this.getRestApiId() == null)
            return false;
        if (other.getRestApiId() != null && other.getRestApiId().equals(this.getRestApiId()) == false)
            return false;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        if (other.getProperties() == null ^ this.getProperties() == null)
            return false;
        if (other.getProperties() != null && other.getProperties().equals(this.getProperties()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRestApiId() == null) ? 0 : getRestApiId().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        hashCode = prime * hashCode + ((getProperties() == null) ? 0 : getProperties().hashCode());
        return hashCode;
    }

    @Override
    public CreateDocumentationPartRequest clone() {
        return (CreateDocumentationPartRequest) super.clone();
    }

}
