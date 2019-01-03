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
 * Request to list information about a collection of resources.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetResourcesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * [Required] The string identifier of the associated <a>RestApi</a>.
     * </p>
     */
    private String restApiId;
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
     * A query parameter used to retrieve the specified resources embedded in the returned <a>Resources</a> resource in
     * the response. This <code>embed</code> parameter value is a list of comma-separated strings. Currently, the
     * request supports only retrieval of the embedded <a>Method</a> resources this way. The query parameter value must
     * be a single-valued list and contain the <code>"methods"</code> string. For example,
     * <code>GET /restapis/{restapi_id}/resources?embed=methods</code>.
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

    public GetResourcesRequest withRestApiId(String restApiId) {
        setRestApiId(restApiId);
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

    public GetResourcesRequest withPosition(String position) {
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

    public GetResourcesRequest withLimit(Integer limit) {
        setLimit(limit);
        return this;
    }

    /**
     * <p>
     * A query parameter used to retrieve the specified resources embedded in the returned <a>Resources</a> resource in
     * the response. This <code>embed</code> parameter value is a list of comma-separated strings. Currently, the
     * request supports only retrieval of the embedded <a>Method</a> resources this way. The query parameter value must
     * be a single-valued list and contain the <code>"methods"</code> string. For example,
     * <code>GET /restapis/{restapi_id}/resources?embed=methods</code>.
     * </p>
     * 
     * @return A query parameter used to retrieve the specified resources embedded in the returned <a>Resources</a>
     *         resource in the response. This <code>embed</code> parameter value is a list of comma-separated strings.
     *         Currently, the request supports only retrieval of the embedded <a>Method</a> resources this way. The
     *         query parameter value must be a single-valued list and contain the <code>"methods"</code> string. For
     *         example, <code>GET /restapis/{restapi_id}/resources?embed=methods</code>.
     */

    public java.util.List<String> getEmbed() {
        return embed;
    }

    /**
     * <p>
     * A query parameter used to retrieve the specified resources embedded in the returned <a>Resources</a> resource in
     * the response. This <code>embed</code> parameter value is a list of comma-separated strings. Currently, the
     * request supports only retrieval of the embedded <a>Method</a> resources this way. The query parameter value must
     * be a single-valued list and contain the <code>"methods"</code> string. For example,
     * <code>GET /restapis/{restapi_id}/resources?embed=methods</code>.
     * </p>
     * 
     * @param embed
     *        A query parameter used to retrieve the specified resources embedded in the returned <a>Resources</a>
     *        resource in the response. This <code>embed</code> parameter value is a list of comma-separated strings.
     *        Currently, the request supports only retrieval of the embedded <a>Method</a> resources this way. The query
     *        parameter value must be a single-valued list and contain the <code>"methods"</code> string. For example,
     *        <code>GET /restapis/{restapi_id}/resources?embed=methods</code>.
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
     * A query parameter used to retrieve the specified resources embedded in the returned <a>Resources</a> resource in
     * the response. This <code>embed</code> parameter value is a list of comma-separated strings. Currently, the
     * request supports only retrieval of the embedded <a>Method</a> resources this way. The query parameter value must
     * be a single-valued list and contain the <code>"methods"</code> string. For example,
     * <code>GET /restapis/{restapi_id}/resources?embed=methods</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEmbed(java.util.Collection)} or {@link #withEmbed(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param embed
     *        A query parameter used to retrieve the specified resources embedded in the returned <a>Resources</a>
     *        resource in the response. This <code>embed</code> parameter value is a list of comma-separated strings.
     *        Currently, the request supports only retrieval of the embedded <a>Method</a> resources this way. The query
     *        parameter value must be a single-valued list and contain the <code>"methods"</code> string. For example,
     *        <code>GET /restapis/{restapi_id}/resources?embed=methods</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourcesRequest withEmbed(String... embed) {
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
     * A query parameter used to retrieve the specified resources embedded in the returned <a>Resources</a> resource in
     * the response. This <code>embed</code> parameter value is a list of comma-separated strings. Currently, the
     * request supports only retrieval of the embedded <a>Method</a> resources this way. The query parameter value must
     * be a single-valued list and contain the <code>"methods"</code> string. For example,
     * <code>GET /restapis/{restapi_id}/resources?embed=methods</code>.
     * </p>
     * 
     * @param embed
     *        A query parameter used to retrieve the specified resources embedded in the returned <a>Resources</a>
     *        resource in the response. This <code>embed</code> parameter value is a list of comma-separated strings.
     *        Currently, the request supports only retrieval of the embedded <a>Method</a> resources this way. The query
     *        parameter value must be a single-valued list and contain the <code>"methods"</code> string. For example,
     *        <code>GET /restapis/{restapi_id}/resources?embed=methods</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourcesRequest withEmbed(java.util.Collection<String> embed) {
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
        if (getPosition() != null)
            sb.append("Position: ").append(getPosition()).append(",");
        if (getLimit() != null)
            sb.append("Limit: ").append(getLimit()).append(",");
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

        if (obj instanceof GetResourcesRequest == false)
            return false;
        GetResourcesRequest other = (GetResourcesRequest) obj;
        if (other.getRestApiId() == null ^ this.getRestApiId() == null)
            return false;
        if (other.getRestApiId() != null && other.getRestApiId().equals(this.getRestApiId()) == false)
            return false;
        if (other.getPosition() == null ^ this.getPosition() == null)
            return false;
        if (other.getPosition() != null && other.getPosition().equals(this.getPosition()) == false)
            return false;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
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
        hashCode = prime * hashCode + ((getPosition() == null) ? 0 : getPosition().hashCode());
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        hashCode = prime * hashCode + ((getEmbed() == null) ? 0 : getEmbed().hashCode());
        return hashCode;
    }

    @Override
    public GetResourcesRequest clone() {
        return (GetResourcesRequest) super.clone();
    }

}
