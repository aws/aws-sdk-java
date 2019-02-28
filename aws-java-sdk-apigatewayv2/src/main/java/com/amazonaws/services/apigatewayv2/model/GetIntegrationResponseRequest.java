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
package com.amazonaws.services.apigatewayv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetIntegrationResponseRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The API identifier.
     * </p>
     */
    private String apiId;
    /**
     * <p>
     * The integration ID.
     * </p>
     */
    private String integrationId;
    /** The integration response ID. */
    private String integrationResponseId;

    /**
     * <p>
     * The API identifier.
     * </p>
     * 
     * @param apiId
     *        The API identifier.
     */

    public void setApiId(String apiId) {
        this.apiId = apiId;
    }

    /**
     * <p>
     * The API identifier.
     * </p>
     * 
     * @return The API identifier.
     */

    public String getApiId() {
        return this.apiId;
    }

    /**
     * <p>
     * The API identifier.
     * </p>
     * 
     * @param apiId
     *        The API identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIntegrationResponseRequest withApiId(String apiId) {
        setApiId(apiId);
        return this;
    }

    /**
     * <p>
     * The integration ID.
     * </p>
     * 
     * @param integrationId
     *        The integration ID.
     */

    public void setIntegrationId(String integrationId) {
        this.integrationId = integrationId;
    }

    /**
     * <p>
     * The integration ID.
     * </p>
     * 
     * @return The integration ID.
     */

    public String getIntegrationId() {
        return this.integrationId;
    }

    /**
     * <p>
     * The integration ID.
     * </p>
     * 
     * @param integrationId
     *        The integration ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIntegrationResponseRequest withIntegrationId(String integrationId) {
        setIntegrationId(integrationId);
        return this;
    }

    /**
     * The integration response ID.
     * 
     * @param integrationResponseId
     *        The integration response ID.
     */

    public void setIntegrationResponseId(String integrationResponseId) {
        this.integrationResponseId = integrationResponseId;
    }

    /**
     * The integration response ID.
     * 
     * @return The integration response ID.
     */

    public String getIntegrationResponseId() {
        return this.integrationResponseId;
    }

    /**
     * The integration response ID.
     * 
     * @param integrationResponseId
     *        The integration response ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIntegrationResponseRequest withIntegrationResponseId(String integrationResponseId) {
        setIntegrationResponseId(integrationResponseId);
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
        if (getApiId() != null)
            sb.append("ApiId: ").append(getApiId()).append(",");
        if (getIntegrationId() != null)
            sb.append("IntegrationId: ").append(getIntegrationId()).append(",");
        if (getIntegrationResponseId() != null)
            sb.append("IntegrationResponseId: ").append(getIntegrationResponseId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetIntegrationResponseRequest == false)
            return false;
        GetIntegrationResponseRequest other = (GetIntegrationResponseRequest) obj;
        if (other.getApiId() == null ^ this.getApiId() == null)
            return false;
        if (other.getApiId() != null && other.getApiId().equals(this.getApiId()) == false)
            return false;
        if (other.getIntegrationId() == null ^ this.getIntegrationId() == null)
            return false;
        if (other.getIntegrationId() != null && other.getIntegrationId().equals(this.getIntegrationId()) == false)
            return false;
        if (other.getIntegrationResponseId() == null ^ this.getIntegrationResponseId() == null)
            return false;
        if (other.getIntegrationResponseId() != null && other.getIntegrationResponseId().equals(this.getIntegrationResponseId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApiId() == null) ? 0 : getApiId().hashCode());
        hashCode = prime * hashCode + ((getIntegrationId() == null) ? 0 : getIntegrationId().hashCode());
        hashCode = prime * hashCode + ((getIntegrationResponseId() == null) ? 0 : getIntegrationResponseId().hashCode());
        return hashCode;
    }

    @Override
    public GetIntegrationResponseRequest clone() {
        return (GetIntegrationResponseRequest) super.clone();
    }

}
