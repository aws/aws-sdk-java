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
 * Requests API Gateway to get information about a <a>Deployment</a> resource.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDeploymentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * [Required] The string identifier of the associated <a>RestApi</a>.
     * </p>
     */
    private String restApiId;
    /**
     * <p>
     * [Required] The identifier of the <a>Deployment</a> resource to get information about.
     * </p>
     */
    private String deploymentId;
    /**
     * <p>
     * A query parameter to retrieve the specified embedded resources of the returned <a>Deployment</a> resource in the
     * response. In a REST API call, this <code>embed</code> parameter value is a list of comma-separated strings, as in
     * <code>GET /restapis/{restapi_id}/deployments/{deployment_id}?embed=var1,var2</code>. The SDK and other
     * platform-dependent libraries might use a different format for the list. Currently, this request supports only
     * retrieval of the embedded API summary this way. Hence, the parameter value must be a single-valued list
     * containing only the <code>"apisummary"</code> string. For example,
     * <code>GET /restapis/{restapi_id}/deployments/{deployment_id}?embed=apisummary</code>.
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

    public GetDeploymentRequest withRestApiId(String restApiId) {
        setRestApiId(restApiId);
        return this;
    }

    /**
     * <p>
     * [Required] The identifier of the <a>Deployment</a> resource to get information about.
     * </p>
     * 
     * @param deploymentId
     *        [Required] The identifier of the <a>Deployment</a> resource to get information about.
     */

    public void setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
    }

    /**
     * <p>
     * [Required] The identifier of the <a>Deployment</a> resource to get information about.
     * </p>
     * 
     * @return [Required] The identifier of the <a>Deployment</a> resource to get information about.
     */

    public String getDeploymentId() {
        return this.deploymentId;
    }

    /**
     * <p>
     * [Required] The identifier of the <a>Deployment</a> resource to get information about.
     * </p>
     * 
     * @param deploymentId
     *        [Required] The identifier of the <a>Deployment</a> resource to get information about.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDeploymentRequest withDeploymentId(String deploymentId) {
        setDeploymentId(deploymentId);
        return this;
    }

    /**
     * <p>
     * A query parameter to retrieve the specified embedded resources of the returned <a>Deployment</a> resource in the
     * response. In a REST API call, this <code>embed</code> parameter value is a list of comma-separated strings, as in
     * <code>GET /restapis/{restapi_id}/deployments/{deployment_id}?embed=var1,var2</code>. The SDK and other
     * platform-dependent libraries might use a different format for the list. Currently, this request supports only
     * retrieval of the embedded API summary this way. Hence, the parameter value must be a single-valued list
     * containing only the <code>"apisummary"</code> string. For example,
     * <code>GET /restapis/{restapi_id}/deployments/{deployment_id}?embed=apisummary</code>.
     * </p>
     * 
     * @return A query parameter to retrieve the specified embedded resources of the returned <a>Deployment</a> resource
     *         in the response. In a REST API call, this <code>embed</code> parameter value is a list of comma-separated
     *         strings, as in <code>GET /restapis/{restapi_id}/deployments/{deployment_id}?embed=var1,var2</code>. The
     *         SDK and other platform-dependent libraries might use a different format for the list. Currently, this
     *         request supports only retrieval of the embedded API summary this way. Hence, the parameter value must be
     *         a single-valued list containing only the <code>"apisummary"</code> string. For example,
     *         <code>GET /restapis/{restapi_id}/deployments/{deployment_id}?embed=apisummary</code>.
     */

    public java.util.List<String> getEmbed() {
        return embed;
    }

    /**
     * <p>
     * A query parameter to retrieve the specified embedded resources of the returned <a>Deployment</a> resource in the
     * response. In a REST API call, this <code>embed</code> parameter value is a list of comma-separated strings, as in
     * <code>GET /restapis/{restapi_id}/deployments/{deployment_id}?embed=var1,var2</code>. The SDK and other
     * platform-dependent libraries might use a different format for the list. Currently, this request supports only
     * retrieval of the embedded API summary this way. Hence, the parameter value must be a single-valued list
     * containing only the <code>"apisummary"</code> string. For example,
     * <code>GET /restapis/{restapi_id}/deployments/{deployment_id}?embed=apisummary</code>.
     * </p>
     * 
     * @param embed
     *        A query parameter to retrieve the specified embedded resources of the returned <a>Deployment</a> resource
     *        in the response. In a REST API call, this <code>embed</code> parameter value is a list of comma-separated
     *        strings, as in <code>GET /restapis/{restapi_id}/deployments/{deployment_id}?embed=var1,var2</code>. The
     *        SDK and other platform-dependent libraries might use a different format for the list. Currently, this
     *        request supports only retrieval of the embedded API summary this way. Hence, the parameter value must be a
     *        single-valued list containing only the <code>"apisummary"</code> string. For example,
     *        <code>GET /restapis/{restapi_id}/deployments/{deployment_id}?embed=apisummary</code>.
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
     * A query parameter to retrieve the specified embedded resources of the returned <a>Deployment</a> resource in the
     * response. In a REST API call, this <code>embed</code> parameter value is a list of comma-separated strings, as in
     * <code>GET /restapis/{restapi_id}/deployments/{deployment_id}?embed=var1,var2</code>. The SDK and other
     * platform-dependent libraries might use a different format for the list. Currently, this request supports only
     * retrieval of the embedded API summary this way. Hence, the parameter value must be a single-valued list
     * containing only the <code>"apisummary"</code> string. For example,
     * <code>GET /restapis/{restapi_id}/deployments/{deployment_id}?embed=apisummary</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEmbed(java.util.Collection)} or {@link #withEmbed(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param embed
     *        A query parameter to retrieve the specified embedded resources of the returned <a>Deployment</a> resource
     *        in the response. In a REST API call, this <code>embed</code> parameter value is a list of comma-separated
     *        strings, as in <code>GET /restapis/{restapi_id}/deployments/{deployment_id}?embed=var1,var2</code>. The
     *        SDK and other platform-dependent libraries might use a different format for the list. Currently, this
     *        request supports only retrieval of the embedded API summary this way. Hence, the parameter value must be a
     *        single-valued list containing only the <code>"apisummary"</code> string. For example,
     *        <code>GET /restapis/{restapi_id}/deployments/{deployment_id}?embed=apisummary</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDeploymentRequest withEmbed(String... embed) {
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
     * A query parameter to retrieve the specified embedded resources of the returned <a>Deployment</a> resource in the
     * response. In a REST API call, this <code>embed</code> parameter value is a list of comma-separated strings, as in
     * <code>GET /restapis/{restapi_id}/deployments/{deployment_id}?embed=var1,var2</code>. The SDK and other
     * platform-dependent libraries might use a different format for the list. Currently, this request supports only
     * retrieval of the embedded API summary this way. Hence, the parameter value must be a single-valued list
     * containing only the <code>"apisummary"</code> string. For example,
     * <code>GET /restapis/{restapi_id}/deployments/{deployment_id}?embed=apisummary</code>.
     * </p>
     * 
     * @param embed
     *        A query parameter to retrieve the specified embedded resources of the returned <a>Deployment</a> resource
     *        in the response. In a REST API call, this <code>embed</code> parameter value is a list of comma-separated
     *        strings, as in <code>GET /restapis/{restapi_id}/deployments/{deployment_id}?embed=var1,var2</code>. The
     *        SDK and other platform-dependent libraries might use a different format for the list. Currently, this
     *        request supports only retrieval of the embedded API summary this way. Hence, the parameter value must be a
     *        single-valued list containing only the <code>"apisummary"</code> string. For example,
     *        <code>GET /restapis/{restapi_id}/deployments/{deployment_id}?embed=apisummary</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDeploymentRequest withEmbed(java.util.Collection<String> embed) {
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
        if (getDeploymentId() != null)
            sb.append("DeploymentId: ").append(getDeploymentId()).append(",");
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

        if (obj instanceof GetDeploymentRequest == false)
            return false;
        GetDeploymentRequest other = (GetDeploymentRequest) obj;
        if (other.getRestApiId() == null ^ this.getRestApiId() == null)
            return false;
        if (other.getRestApiId() != null && other.getRestApiId().equals(this.getRestApiId()) == false)
            return false;
        if (other.getDeploymentId() == null ^ this.getDeploymentId() == null)
            return false;
        if (other.getDeploymentId() != null && other.getDeploymentId().equals(this.getDeploymentId()) == false)
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
        hashCode = prime * hashCode + ((getDeploymentId() == null) ? 0 : getDeploymentId().hashCode());
        hashCode = prime * hashCode + ((getEmbed() == null) ? 0 : getEmbed().hashCode());
        return hashCode;
    }

    @Override
    public GetDeploymentRequest clone() {
        return (GetDeploymentRequest) super.clone();
    }

}
