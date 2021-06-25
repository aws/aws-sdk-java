/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.amplifybackend.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/GetBackendAPIModels" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetBackendAPIModelsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Stringified JSON of the datastore model.
     * </p>
     */
    private String models;
    /**
     * <p>
     * The current status of the request.
     * </p>
     */
    private String status;

    /**
     * <p>
     * Stringified JSON of the datastore model.
     * </p>
     * 
     * @param models
     *        Stringified JSON of the datastore model.
     */

    public void setModels(String models) {
        this.models = models;
    }

    /**
     * <p>
     * Stringified JSON of the datastore model.
     * </p>
     * 
     * @return Stringified JSON of the datastore model.
     */

    public String getModels() {
        return this.models;
    }

    /**
     * <p>
     * Stringified JSON of the datastore model.
     * </p>
     * 
     * @param models
     *        Stringified JSON of the datastore model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBackendAPIModelsResult withModels(String models) {
        setModels(models);
        return this;
    }

    /**
     * <p>
     * The current status of the request.
     * </p>
     * 
     * @param status
     *        The current status of the request.
     * @see Status
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the request.
     * </p>
     * 
     * @return The current status of the request.
     * @see Status
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the request.
     * </p>
     * 
     * @param status
     *        The current status of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Status
     */

    public GetBackendAPIModelsResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current status of the request.
     * </p>
     * 
     * @param status
     *        The current status of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Status
     */

    public GetBackendAPIModelsResult withStatus(Status status) {
        this.status = status.toString();
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
        if (getModels() != null)
            sb.append("Models: ").append(getModels()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetBackendAPIModelsResult == false)
            return false;
        GetBackendAPIModelsResult other = (GetBackendAPIModelsResult) obj;
        if (other.getModels() == null ^ this.getModels() == null)
            return false;
        if (other.getModels() != null && other.getModels().equals(this.getModels()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getModels() == null) ? 0 : getModels().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public GetBackendAPIModelsResult clone() {
        try {
            return (GetBackendAPIModelsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
