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
 * Request to list information about a resource.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetResourceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * [Required] The string identifier of the associated <a>RestApi</a>.
     * </p>
     */
    private String restApiId;
    /**
     * <p>
     * [Required] The identifier for the <a>Resource</a> resource.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * A query parameter to retrieve the specified resources embedded in the returned <a>Resource</a> representation in
     * the response. This <code>embed</code> parameter value is a list of comma-separated strings. Currently, the
     * request supports only retrieval of the embedded <a>Method</a> resources this way. The query parameter value must
     * be a single-valued list and contain the <code>"methods"</code> string. For example,
     * <code>GET /restapis/{restapi_id}/resources/{resource_id}?embed=methods</code>.
     * </p>
     */
    private java.util.List<String> embed;

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

    public GetResourceRequest withRestApiId(String restApiId) {
        setRestApiId(restApiId);
        return this;
    }

    /**
     * <p>
     * [Required] The identifier for the <a>Resource</a> resource.
     * </p>
     * 
     * @param resourceId
     *        [Required] The identifier for the <a>Resource</a> resource.
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * [Required] The identifier for the <a>Resource</a> resource.
     * </p>
     * 
     * @return [Required] The identifier for the <a>Resource</a> resource.
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * [Required] The identifier for the <a>Resource</a> resource.
     * </p>
     * 
     * @param resourceId
     *        [Required] The identifier for the <a>Resource</a> resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourceRequest withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * A query parameter to retrieve the specified resources embedded in the returned <a>Resource</a> representation in
     * the response. This <code>embed</code> parameter value is a list of comma-separated strings. Currently, the
     * request supports only retrieval of the embedded <a>Method</a> resources this way. The query parameter value must
     * be a single-valued list and contain the <code>"methods"</code> string. For example,
     * <code>GET /restapis/{restapi_id}/resources/{resource_id}?embed=methods</code>.
     * </p>
     * 
     * @return A query parameter to retrieve the specified resources embedded in the returned <a>Resource</a>
     *         representation in the response. This <code>embed</code> parameter value is a list of comma-separated
     *         strings. Currently, the request supports only retrieval of the embedded <a>Method</a> resources this way.
     *         The query parameter value must be a single-valued list and contain the <code>"methods"</code> string. For
     *         example, <code>GET /restapis/{restapi_id}/resources/{resource_id}?embed=methods</code>.
     */

    public java.util.List<String> getEmbed() {
        return embed;
    }

    /**
     * <p>
     * A query parameter to retrieve the specified resources embedded in the returned <a>Resource</a> representation in
     * the response. This <code>embed</code> parameter value is a list of comma-separated strings. Currently, the
     * request supports only retrieval of the embedded <a>Method</a> resources this way. The query parameter value must
     * be a single-valued list and contain the <code>"methods"</code> string. For example,
     * <code>GET /restapis/{restapi_id}/resources/{resource_id}?embed=methods</code>.
     * </p>
     * 
     * @param embed
     *        A query parameter to retrieve the specified resources embedded in the returned <a>Resource</a>
     *        representation in the response. This <code>embed</code> parameter value is a list of comma-separated
     *        strings. Currently, the request supports only retrieval of the embedded <a>Method</a> resources this way.
     *        The query parameter value must be a single-valued list and contain the <code>"methods"</code> string. For
     *        example, <code>GET /restapis/{restapi_id}/resources/{resource_id}?embed=methods</code>.
     */

    public void setEmbed(java.util.Collection<String> embed) {
        if (embed == null) {
            this.embed = null;
            return;
        }

        this.embed = new java.util.ArrayList<String>(embed);
    }

    /**
     * <p>
     * A query parameter to retrieve the specified resources embedded in the returned <a>Resource</a> representation in
     * the response. This <code>embed</code> parameter value is a list of comma-separated strings. Currently, the
     * request supports only retrieval of the embedded <a>Method</a> resources this way. The query parameter value must
     * be a single-valued list and contain the <code>"methods"</code> string. For example,
     * <code>GET /restapis/{restapi_id}/resources/{resource_id}?embed=methods</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEmbed(java.util.Collection)} or {@link #withEmbed(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param embed
     *        A query parameter to retrieve the specified resources embedded in the returned <a>Resource</a>
     *        representation in the response. This <code>embed</code> parameter value is a list of comma-separated
     *        strings. Currently, the request supports only retrieval of the embedded <a>Method</a> resources this way.
     *        The query parameter value must be a single-valued list and contain the <code>"methods"</code> string. For
     *        example, <code>GET /restapis/{restapi_id}/resources/{resource_id}?embed=methods</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourceRequest withEmbed(String... embed) {
        if (this.embed == null) {
            setEmbed(new java.util.ArrayList<String>(embed.length));
        }
        for (String ele : embed) {
            this.embed.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A query parameter to retrieve the specified resources embedded in the returned <a>Resource</a> representation in
     * the response. This <code>embed</code> parameter value is a list of comma-separated strings. Currently, the
     * request supports only retrieval of the embedded <a>Method</a> resources this way. The query parameter value must
     * be a single-valued list and contain the <code>"methods"</code> string. For example,
     * <code>GET /restapis/{restapi_id}/resources/{resource_id}?embed=methods</code>.
     * </p>
     * 
     * @param embed
     *        A query parameter to retrieve the specified resources embedded in the returned <a>Resource</a>
     *        representation in the response. This <code>embed</code> parameter value is a list of comma-separated
     *        strings. Currently, the request supports only retrieval of the embedded <a>Method</a> resources this way.
     *        The query parameter value must be a single-valued list and contain the <code>"methods"</code> string. For
     *        example, <code>GET /restapis/{restapi_id}/resources/{resource_id}?embed=methods</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourceRequest withEmbed(java.util.Collection<String> embed) {
        setEmbed(embed);
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
        if (getResourceId() != null)
            sb.append("ResourceId: ").append(getResourceId()).append(",");
        if (getEmbed() != null)
            sb.append("Embed: ").append(getEmbed());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetResourceRequest == false)
            return false;
        GetResourceRequest other = (GetResourceRequest) obj;
        if (other.getRestApiId() == null ^ this.getRestApiId() == null)
            return false;
        if (other.getRestApiId() != null && other.getRestApiId().equals(this.getRestApiId()) == false)
            return false;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        if (other.getEmbed() == null ^ this.getEmbed() == null)
            return false;
        if (other.getEmbed() != null && other.getEmbed().equals(this.getEmbed()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRestApiId() == null) ? 0 : getRestApiId().hashCode());
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getEmbed() == null) ? 0 : getEmbed().hashCode());
        return hashCode;
    }

    @Override
    public GetResourceRequest clone() {
        return (GetResourceRequest) super.clone();
    }

}
