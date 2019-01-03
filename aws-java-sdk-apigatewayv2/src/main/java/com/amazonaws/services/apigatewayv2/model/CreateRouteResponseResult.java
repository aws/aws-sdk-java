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

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateRouteResponseResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Represents the model selection expression of a route response.
     * </p>
     */
    private String modelSelectionExpression;
    /**
     * <p>
     * Represents the response models of a route response.
     * </p>
     */
    private java.util.Map<String, String> responseModels;
    /**
     * <p>
     * Represents the response parameters of a route response.
     * </p>
     */
    private java.util.Map<String, ParameterConstraints> responseParameters;
    /**
     * <p>
     * Represents the identifier of a route response.
     * </p>
     */
    private String routeResponseId;
    /**
     * <p>
     * Represents the route response key of a route response.
     * </p>
     */
    private String routeResponseKey;

    /**
     * <p>
     * Represents the model selection expression of a route response.
     * </p>
     * 
     * @param modelSelectionExpression
     *        Represents the model selection expression of a route response.
     */

    public void setModelSelectionExpression(String modelSelectionExpression) {
        this.modelSelectionExpression = modelSelectionExpression;
    }

    /**
     * <p>
     * Represents the model selection expression of a route response.
     * </p>
     * 
     * @return Represents the model selection expression of a route response.
     */

    public String getModelSelectionExpression() {
        return this.modelSelectionExpression;
    }

    /**
     * <p>
     * Represents the model selection expression of a route response.
     * </p>
     * 
     * @param modelSelectionExpression
     *        Represents the model selection expression of a route response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRouteResponseResult withModelSelectionExpression(String modelSelectionExpression) {
        setModelSelectionExpression(modelSelectionExpression);
        return this;
    }

    /**
     * <p>
     * Represents the response models of a route response.
     * </p>
     * 
     * @return Represents the response models of a route response.
     */

    public java.util.Map<String, String> getResponseModels() {
        return responseModels;
    }

    /**
     * <p>
     * Represents the response models of a route response.
     * </p>
     * 
     * @param responseModels
     *        Represents the response models of a route response.
     */

    public void setResponseModels(java.util.Map<String, String> responseModels) {
        this.responseModels = responseModels;
    }

    /**
     * <p>
     * Represents the response models of a route response.
     * </p>
     * 
     * @param responseModels
     *        Represents the response models of a route response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRouteResponseResult withResponseModels(java.util.Map<String, String> responseModels) {
        setResponseModels(responseModels);
        return this;
    }

    public CreateRouteResponseResult addResponseModelsEntry(String key, String value) {
        if (null == this.responseModels) {
            this.responseModels = new java.util.HashMap<String, String>();
        }
        if (this.responseModels.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.responseModels.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ResponseModels.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRouteResponseResult clearResponseModelsEntries() {
        this.responseModels = null;
        return this;
    }

    /**
     * <p>
     * Represents the response parameters of a route response.
     * </p>
     * 
     * @return Represents the response parameters of a route response.
     */

    public java.util.Map<String, ParameterConstraints> getResponseParameters() {
        return responseParameters;
    }

    /**
     * <p>
     * Represents the response parameters of a route response.
     * </p>
     * 
     * @param responseParameters
     *        Represents the response parameters of a route response.
     */

    public void setResponseParameters(java.util.Map<String, ParameterConstraints> responseParameters) {
        this.responseParameters = responseParameters;
    }

    /**
     * <p>
     * Represents the response parameters of a route response.
     * </p>
     * 
     * @param responseParameters
     *        Represents the response parameters of a route response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRouteResponseResult withResponseParameters(java.util.Map<String, ParameterConstraints> responseParameters) {
        setResponseParameters(responseParameters);
        return this;
    }

    public CreateRouteResponseResult addResponseParametersEntry(String key, ParameterConstraints value) {
        if (null == this.responseParameters) {
            this.responseParameters = new java.util.HashMap<String, ParameterConstraints>();
        }
        if (this.responseParameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.responseParameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ResponseParameters.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRouteResponseResult clearResponseParametersEntries() {
        this.responseParameters = null;
        return this;
    }

    /**
     * <p>
     * Represents the identifier of a route response.
     * </p>
     * 
     * @param routeResponseId
     *        Represents the identifier of a route response.
     */

    public void setRouteResponseId(String routeResponseId) {
        this.routeResponseId = routeResponseId;
    }

    /**
     * <p>
     * Represents the identifier of a route response.
     * </p>
     * 
     * @return Represents the identifier of a route response.
     */

    public String getRouteResponseId() {
        return this.routeResponseId;
    }

    /**
     * <p>
     * Represents the identifier of a route response.
     * </p>
     * 
     * @param routeResponseId
     *        Represents the identifier of a route response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRouteResponseResult withRouteResponseId(String routeResponseId) {
        setRouteResponseId(routeResponseId);
        return this;
    }

    /**
     * <p>
     * Represents the route response key of a route response.
     * </p>
     * 
     * @param routeResponseKey
     *        Represents the route response key of a route response.
     */

    public void setRouteResponseKey(String routeResponseKey) {
        this.routeResponseKey = routeResponseKey;
    }

    /**
     * <p>
     * Represents the route response key of a route response.
     * </p>
     * 
     * @return Represents the route response key of a route response.
     */

    public String getRouteResponseKey() {
        return this.routeResponseKey;
    }

    /**
     * <p>
     * Represents the route response key of a route response.
     * </p>
     * 
     * @param routeResponseKey
     *        Represents the route response key of a route response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRouteResponseResult withRouteResponseKey(String routeResponseKey) {
        setRouteResponseKey(routeResponseKey);
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
        if (getModelSelectionExpression() != null)
            sb.append("ModelSelectionExpression: ").append(getModelSelectionExpression()).append(",");
        if (getResponseModels() != null)
            sb.append("ResponseModels: ").append(getResponseModels()).append(",");
        if (getResponseParameters() != null)
            sb.append("ResponseParameters: ").append(getResponseParameters()).append(",");
        if (getRouteResponseId() != null)
            sb.append("RouteResponseId: ").append(getRouteResponseId()).append(",");
        if (getRouteResponseKey() != null)
            sb.append("RouteResponseKey: ").append(getRouteResponseKey());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateRouteResponseResult == false)
            return false;
        CreateRouteResponseResult other = (CreateRouteResponseResult) obj;
        if (other.getModelSelectionExpression() == null ^ this.getModelSelectionExpression() == null)
            return false;
        if (other.getModelSelectionExpression() != null && other.getModelSelectionExpression().equals(this.getModelSelectionExpression()) == false)
            return false;
        if (other.getResponseModels() == null ^ this.getResponseModels() == null)
            return false;
        if (other.getResponseModels() != null && other.getResponseModels().equals(this.getResponseModels()) == false)
            return false;
        if (other.getResponseParameters() == null ^ this.getResponseParameters() == null)
            return false;
        if (other.getResponseParameters() != null && other.getResponseParameters().equals(this.getResponseParameters()) == false)
            return false;
        if (other.getRouteResponseId() == null ^ this.getRouteResponseId() == null)
            return false;
        if (other.getRouteResponseId() != null && other.getRouteResponseId().equals(this.getRouteResponseId()) == false)
            return false;
        if (other.getRouteResponseKey() == null ^ this.getRouteResponseKey() == null)
            return false;
        if (other.getRouteResponseKey() != null && other.getRouteResponseKey().equals(this.getRouteResponseKey()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getModelSelectionExpression() == null) ? 0 : getModelSelectionExpression().hashCode());
        hashCode = prime * hashCode + ((getResponseModels() == null) ? 0 : getResponseModels().hashCode());
        hashCode = prime * hashCode + ((getResponseParameters() == null) ? 0 : getResponseParameters().hashCode());
        hashCode = prime * hashCode + ((getRouteResponseId() == null) ? 0 : getRouteResponseId().hashCode());
        hashCode = prime * hashCode + ((getRouteResponseKey() == null) ? 0 : getRouteResponseKey().hashCode());
        return hashCode;
    }

    @Override
    public CreateRouteResponseResult clone() {
        try {
            return (CreateRouteResponseResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
