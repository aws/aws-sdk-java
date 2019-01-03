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
public class CreateApiMappingResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The API identifier.
     * </p>
     */
    private String apiId;
    /**
     * <p>
     * The API mapping identifier.
     * </p>
     */
    private String apiMappingId;
    /**
     * <p>
     * The API mapping key.
     * </p>
     */
    private String apiMappingKey;
    /**
     * <p>
     * The API stage.
     * </p>
     */
    private String stage;

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

    public CreateApiMappingResult withApiId(String apiId) {
        setApiId(apiId);
        return this;
    }

    /**
     * <p>
     * The API mapping identifier.
     * </p>
     * 
     * @param apiMappingId
     *        The API mapping identifier.
     */

    public void setApiMappingId(String apiMappingId) {
        this.apiMappingId = apiMappingId;
    }

    /**
     * <p>
     * The API mapping identifier.
     * </p>
     * 
     * @return The API mapping identifier.
     */

    public String getApiMappingId() {
        return this.apiMappingId;
    }

    /**
     * <p>
     * The API mapping identifier.
     * </p>
     * 
     * @param apiMappingId
     *        The API mapping identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApiMappingResult withApiMappingId(String apiMappingId) {
        setApiMappingId(apiMappingId);
        return this;
    }

    /**
     * <p>
     * The API mapping key.
     * </p>
     * 
     * @param apiMappingKey
     *        The API mapping key.
     */

    public void setApiMappingKey(String apiMappingKey) {
        this.apiMappingKey = apiMappingKey;
    }

    /**
     * <p>
     * The API mapping key.
     * </p>
     * 
     * @return The API mapping key.
     */

    public String getApiMappingKey() {
        return this.apiMappingKey;
    }

    /**
     * <p>
     * The API mapping key.
     * </p>
     * 
     * @param apiMappingKey
     *        The API mapping key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApiMappingResult withApiMappingKey(String apiMappingKey) {
        setApiMappingKey(apiMappingKey);
        return this;
    }

    /**
     * <p>
     * The API stage.
     * </p>
     * 
     * @param stage
     *        The API stage.
     */

    public void setStage(String stage) {
        this.stage = stage;
    }

    /**
     * <p>
     * The API stage.
     * </p>
     * 
     * @return The API stage.
     */

    public String getStage() {
        return this.stage;
    }

    /**
     * <p>
     * The API stage.
     * </p>
     * 
     * @param stage
     *        The API stage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApiMappingResult withStage(String stage) {
        setStage(stage);
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
        if (getApiMappingId() != null)
            sb.append("ApiMappingId: ").append(getApiMappingId()).append(",");
        if (getApiMappingKey() != null)
            sb.append("ApiMappingKey: ").append(getApiMappingKey()).append(",");
        if (getStage() != null)
            sb.append("Stage: ").append(getStage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateApiMappingResult == false)
            return false;
        CreateApiMappingResult other = (CreateApiMappingResult) obj;
        if (other.getApiId() == null ^ this.getApiId() == null)
            return false;
        if (other.getApiId() != null && other.getApiId().equals(this.getApiId()) == false)
            return false;
        if (other.getApiMappingId() == null ^ this.getApiMappingId() == null)
            return false;
        if (other.getApiMappingId() != null && other.getApiMappingId().equals(this.getApiMappingId()) == false)
            return false;
        if (other.getApiMappingKey() == null ^ this.getApiMappingKey() == null)
            return false;
        if (other.getApiMappingKey() != null && other.getApiMappingKey().equals(this.getApiMappingKey()) == false)
            return false;
        if (other.getStage() == null ^ this.getStage() == null)
            return false;
        if (other.getStage() != null && other.getStage().equals(this.getStage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApiId() == null) ? 0 : getApiId().hashCode());
        hashCode = prime * hashCode + ((getApiMappingId() == null) ? 0 : getApiMappingId().hashCode());
        hashCode = prime * hashCode + ((getApiMappingKey() == null) ? 0 : getApiMappingKey().hashCode());
        hashCode = prime * hashCode + ((getStage() == null) ? 0 : getStage().hashCode());
        return hashCode;
    }

    @Override
    public CreateApiMappingResult clone() {
        try {
            return (CreateApiMappingResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
