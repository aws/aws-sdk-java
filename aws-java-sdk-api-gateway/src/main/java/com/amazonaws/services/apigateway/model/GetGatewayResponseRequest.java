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
package com.amazonaws.services.apigateway.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Gets a GatewayResponse of a specified response type on the given RestApi.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetGatewayResponseRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The string identifier of the associated RestApi.
     * </p>
     */
    private String restApiId;
    /**
     * <p>
     * The response type of the associated GatewayResponse.
     * </p>
     */
    private String responseType;

    /**
     * <p>
     * The string identifier of the associated RestApi.
     * </p>
     * 
     * @param restApiId
     *        The string identifier of the associated RestApi.
     */

    public void setRestApiId(String restApiId) {
        this.restApiId = restApiId;
    }

    /**
     * <p>
     * The string identifier of the associated RestApi.
     * </p>
     * 
     * @return The string identifier of the associated RestApi.
     */

    public String getRestApiId() {
        return this.restApiId;
    }

    /**
     * <p>
     * The string identifier of the associated RestApi.
     * </p>
     * 
     * @param restApiId
     *        The string identifier of the associated RestApi.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetGatewayResponseRequest withRestApiId(String restApiId) {
        setRestApiId(restApiId);
        return this;
    }

    /**
     * <p>
     * The response type of the associated GatewayResponse.
     * </p>
     * 
     * @param responseType
     *        The response type of the associated GatewayResponse.
     * @see GatewayResponseType
     */

    public void setResponseType(String responseType) {
        this.responseType = responseType;
    }

    /**
     * <p>
     * The response type of the associated GatewayResponse.
     * </p>
     * 
     * @return The response type of the associated GatewayResponse.
     * @see GatewayResponseType
     */

    public String getResponseType() {
        return this.responseType;
    }

    /**
     * <p>
     * The response type of the associated GatewayResponse.
     * </p>
     * 
     * @param responseType
     *        The response type of the associated GatewayResponse.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GatewayResponseType
     */

    public GetGatewayResponseRequest withResponseType(String responseType) {
        setResponseType(responseType);
        return this;
    }

    /**
     * <p>
     * The response type of the associated GatewayResponse.
     * </p>
     * 
     * @param responseType
     *        The response type of the associated GatewayResponse.
     * @see GatewayResponseType
     */

    public void setResponseType(GatewayResponseType responseType) {
        withResponseType(responseType);
    }

    /**
     * <p>
     * The response type of the associated GatewayResponse.
     * </p>
     * 
     * @param responseType
     *        The response type of the associated GatewayResponse.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GatewayResponseType
     */

    public GetGatewayResponseRequest withResponseType(GatewayResponseType responseType) {
        this.responseType = responseType.toString();
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
        if (getResponseType() != null)
            sb.append("ResponseType: ").append(getResponseType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetGatewayResponseRequest == false)
            return false;
        GetGatewayResponseRequest other = (GetGatewayResponseRequest) obj;
        if (other.getRestApiId() == null ^ this.getRestApiId() == null)
            return false;
        if (other.getRestApiId() != null && other.getRestApiId().equals(this.getRestApiId()) == false)
            return false;
        if (other.getResponseType() == null ^ this.getResponseType() == null)
            return false;
        if (other.getResponseType() != null && other.getResponseType().equals(this.getResponseType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRestApiId() == null) ? 0 : getRestApiId().hashCode());
        hashCode = prime * hashCode + ((getResponseType() == null) ? 0 : getResponseType().hashCode());
        return hashCode;
    }

    @Override
    public GetGatewayResponseRequest clone() {
        return (GetGatewayResponseRequest) super.clone();
    }

}
