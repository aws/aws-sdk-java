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

/**
 * <p>
 * Represents a summary of a <a>Method</a> resource, given a particular date and time.
 * </p>
 */
public class MethodSnapshot implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the type of authorization used for the method.
     * </p>
     */
    private String authorizationType;
    /**
     * <p>
     * Specifies whether the method requires a valid <a>ApiKey</a>.
     * </p>
     */
    private Boolean apiKeyRequired;

    /**
     * <p>
     * Specifies the type of authorization used for the method.
     * </p>
     * 
     * @param authorizationType
     *        Specifies the type of authorization used for the method.
     */

    public void setAuthorizationType(String authorizationType) {
        this.authorizationType = authorizationType;
    }

    /**
     * <p>
     * Specifies the type of authorization used for the method.
     * </p>
     * 
     * @return Specifies the type of authorization used for the method.
     */

    public String getAuthorizationType() {
        return this.authorizationType;
    }

    /**
     * <p>
     * Specifies the type of authorization used for the method.
     * </p>
     * 
     * @param authorizationType
     *        Specifies the type of authorization used for the method.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MethodSnapshot withAuthorizationType(String authorizationType) {
        setAuthorizationType(authorizationType);
        return this;
    }

    /**
     * <p>
     * Specifies whether the method requires a valid <a>ApiKey</a>.
     * </p>
     * 
     * @param apiKeyRequired
     *        Specifies whether the method requires a valid <a>ApiKey</a>.
     */

    public void setApiKeyRequired(Boolean apiKeyRequired) {
        this.apiKeyRequired = apiKeyRequired;
    }

    /**
     * <p>
     * Specifies whether the method requires a valid <a>ApiKey</a>.
     * </p>
     * 
     * @return Specifies whether the method requires a valid <a>ApiKey</a>.
     */

    public Boolean getApiKeyRequired() {
        return this.apiKeyRequired;
    }

    /**
     * <p>
     * Specifies whether the method requires a valid <a>ApiKey</a>.
     * </p>
     * 
     * @param apiKeyRequired
     *        Specifies whether the method requires a valid <a>ApiKey</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MethodSnapshot withApiKeyRequired(Boolean apiKeyRequired) {
        setApiKeyRequired(apiKeyRequired);
        return this;
    }

    /**
     * <p>
     * Specifies whether the method requires a valid <a>ApiKey</a>.
     * </p>
     * 
     * @return Specifies whether the method requires a valid <a>ApiKey</a>.
     */

    public Boolean isApiKeyRequired() {
        return this.apiKeyRequired;
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
        if (getAuthorizationType() != null)
            sb.append("AuthorizationType: " + getAuthorizationType() + ",");
        if (getApiKeyRequired() != null)
            sb.append("ApiKeyRequired: " + getApiKeyRequired());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MethodSnapshot == false)
            return false;
        MethodSnapshot other = (MethodSnapshot) obj;
        if (other.getAuthorizationType() == null ^ this.getAuthorizationType() == null)
            return false;
        if (other.getAuthorizationType() != null && other.getAuthorizationType().equals(this.getAuthorizationType()) == false)
            return false;
        if (other.getApiKeyRequired() == null ^ this.getApiKeyRequired() == null)
            return false;
        if (other.getApiKeyRequired() != null && other.getApiKeyRequired().equals(this.getApiKeyRequired()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAuthorizationType() == null) ? 0 : getAuthorizationType().hashCode());
        hashCode = prime * hashCode + ((getApiKeyRequired() == null) ? 0 : getApiKeyRequired().hashCode());
        return hashCode;
    }

    @Override
    public MethodSnapshot clone() {
        try {
            return (MethodSnapshot) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
