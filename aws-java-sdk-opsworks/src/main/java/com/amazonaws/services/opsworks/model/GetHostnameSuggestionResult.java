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
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains the response to a <code>GetHostnameSuggestion</code> request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/GetHostnameSuggestion" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetHostnameSuggestionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The layer ID.
     * </p>
     */
    private String layerId;
    /**
     * <p>
     * The generated host name.
     * </p>
     */
    private String hostname;

    /**
     * <p>
     * The layer ID.
     * </p>
     * 
     * @param layerId
     *        The layer ID.
     */

    public void setLayerId(String layerId) {
        this.layerId = layerId;
    }

    /**
     * <p>
     * The layer ID.
     * </p>
     * 
     * @return The layer ID.
     */

    public String getLayerId() {
        return this.layerId;
    }

    /**
     * <p>
     * The layer ID.
     * </p>
     * 
     * @param layerId
     *        The layer ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetHostnameSuggestionResult withLayerId(String layerId) {
        setLayerId(layerId);
        return this;
    }

    /**
     * <p>
     * The generated host name.
     * </p>
     * 
     * @param hostname
     *        The generated host name.
     */

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    /**
     * <p>
     * The generated host name.
     * </p>
     * 
     * @return The generated host name.
     */

    public String getHostname() {
        return this.hostname;
    }

    /**
     * <p>
     * The generated host name.
     * </p>
     * 
     * @param hostname
     *        The generated host name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetHostnameSuggestionResult withHostname(String hostname) {
        setHostname(hostname);
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
        if (getLayerId() != null)
            sb.append("LayerId: ").append(getLayerId()).append(",");
        if (getHostname() != null)
            sb.append("Hostname: ").append(getHostname());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetHostnameSuggestionResult == false)
            return false;
        GetHostnameSuggestionResult other = (GetHostnameSuggestionResult) obj;
        if (other.getLayerId() == null ^ this.getLayerId() == null)
            return false;
        if (other.getLayerId() != null && other.getLayerId().equals(this.getLayerId()) == false)
            return false;
        if (other.getHostname() == null ^ this.getHostname() == null)
            return false;
        if (other.getHostname() != null && other.getHostname().equals(this.getHostname()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLayerId() == null) ? 0 : getLayerId().hashCode());
        hashCode = prime * hashCode + ((getHostname() == null) ? 0 : getHostname().hashCode());
        return hashCode;
    }

    @Override
    public GetHostnameSuggestionResult clone() {
        try {
            return (GetHostnameSuggestionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
