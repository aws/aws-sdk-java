/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * A request to delete the <a>ApiKey</a> resource.
 * </p>
 */
public class DeleteApiKeyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the <a>ApiKey</a> resource to be deleted.
     * </p>
     */
    private String apiKey;

    /**
     * <p>
     * The identifier of the <a>ApiKey</a> resource to be deleted.
     * </p>
     * 
     * @param apiKey
     *        The identifier of the <a>ApiKey</a> resource to be deleted.
     */

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    /**
     * <p>
     * The identifier of the <a>ApiKey</a> resource to be deleted.
     * </p>
     * 
     * @return The identifier of the <a>ApiKey</a> resource to be deleted.
     */

    public String getApiKey() {
        return this.apiKey;
    }

    /**
     * <p>
     * The identifier of the <a>ApiKey</a> resource to be deleted.
     * </p>
     * 
     * @param apiKey
     *        The identifier of the <a>ApiKey</a> resource to be deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteApiKeyRequest withApiKey(String apiKey) {
        setApiKey(apiKey);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getApiKey() != null)
            sb.append("ApiKey: " + getApiKey());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteApiKeyRequest == false)
            return false;
        DeleteApiKeyRequest other = (DeleteApiKeyRequest) obj;
        if (other.getApiKey() == null ^ this.getApiKey() == null)
            return false;
        if (other.getApiKey() != null && other.getApiKey().equals(this.getApiKey()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApiKey() == null) ? 0 : getApiKey().hashCode());
        return hashCode;
    }

    @Override
    public DeleteApiKeyRequest clone() {
        return (DeleteApiKeyRequest) super.clone();
    }
}
