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
 * A request to get information about the current <a>ApiKey</a> resource.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetApiKeyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * [Required] The identifier of the <a>ApiKey</a> resource.
     * </p>
     */
    private String apiKey;
    /**
     * <p>
     * A boolean flag to specify whether (<code>true</code>) or not (<code>false</code>) the result contains the key
     * value.
     * </p>
     */
    private Boolean includeValue;

    /**
     * <p>
     * [Required] The identifier of the <a>ApiKey</a> resource.
     * </p>
     * 
     * @param apiKey
     *        [Required] The identifier of the <a>ApiKey</a> resource.
     */

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    /**
     * <p>
     * [Required] The identifier of the <a>ApiKey</a> resource.
     * </p>
     * 
     * @return [Required] The identifier of the <a>ApiKey</a> resource.
     */

    public String getApiKey() {
        return this.apiKey;
    }

    /**
     * <p>
     * [Required] The identifier of the <a>ApiKey</a> resource.
     * </p>
     * 
     * @param apiKey
     *        [Required] The identifier of the <a>ApiKey</a> resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetApiKeyRequest withApiKey(String apiKey) {
        setApiKey(apiKey);
        return this;
    }

    /**
     * <p>
     * A boolean flag to specify whether (<code>true</code>) or not (<code>false</code>) the result contains the key
     * value.
     * </p>
     * 
     * @param includeValue
     *        A boolean flag to specify whether (<code>true</code>) or not (<code>false</code>) the result contains the
     *        key value.
     */

    public void setIncludeValue(Boolean includeValue) {
        this.includeValue = includeValue;
    }

    /**
     * <p>
     * A boolean flag to specify whether (<code>true</code>) or not (<code>false</code>) the result contains the key
     * value.
     * </p>
     * 
     * @return A boolean flag to specify whether (<code>true</code>) or not (<code>false</code>) the result contains the
     *         key value.
     */

    public Boolean getIncludeValue() {
        return this.includeValue;
    }

    /**
     * <p>
     * A boolean flag to specify whether (<code>true</code>) or not (<code>false</code>) the result contains the key
     * value.
     * </p>
     * 
     * @param includeValue
     *        A boolean flag to specify whether (<code>true</code>) or not (<code>false</code>) the result contains the
     *        key value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetApiKeyRequest withIncludeValue(Boolean includeValue) {
        setIncludeValue(includeValue);
        return this;
    }

    /**
     * <p>
     * A boolean flag to specify whether (<code>true</code>) or not (<code>false</code>) the result contains the key
     * value.
     * </p>
     * 
     * @return A boolean flag to specify whether (<code>true</code>) or not (<code>false</code>) the result contains the
     *         key value.
     */

    public Boolean isIncludeValue() {
        return this.includeValue;
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
        if (getApiKey() != null)
            sb.append("ApiKey: ").append(getApiKey()).append(",");
        if (getIncludeValue() != null)
            sb.append("IncludeValue: ").append(getIncludeValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetApiKeyRequest == false)
            return false;
        GetApiKeyRequest other = (GetApiKeyRequest) obj;
        if (other.getApiKey() == null ^ this.getApiKey() == null)
            return false;
        if (other.getApiKey() != null && other.getApiKey().equals(this.getApiKey()) == false)
            return false;
        if (other.getIncludeValue() == null ^ this.getIncludeValue() == null)
            return false;
        if (other.getIncludeValue() != null && other.getIncludeValue().equals(this.getIncludeValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApiKey() == null) ? 0 : getApiKey().hashCode());
        hashCode = prime * hashCode + ((getIncludeValue() == null) ? 0 : getIncludeValue().hashCode());
        return hashCode;
    }

    @Override
    public GetApiKeyRequest clone() {
        return (GetApiKeyRequest) super.clone();
    }

}
