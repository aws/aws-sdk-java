/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.location.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/GetMapStyleDescriptor" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetMapStyleDescriptorRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The optional <a href="https://docs.aws.amazon.com/location/latest/developerguide/using-apikeys.html">API key</a>
     * to authorize the request.
     * </p>
     */
    private String key;
    /**
     * <p>
     * The map resource to retrieve the style descriptor from.
     * </p>
     */
    private String mapName;

    /**
     * <p>
     * The optional <a href="https://docs.aws.amazon.com/location/latest/developerguide/using-apikeys.html">API key</a>
     * to authorize the request.
     * </p>
     * 
     * @param key
     *        The optional <a href="https://docs.aws.amazon.com/location/latest/developerguide/using-apikeys.html">API
     *        key</a> to authorize the request.
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The optional <a href="https://docs.aws.amazon.com/location/latest/developerguide/using-apikeys.html">API key</a>
     * to authorize the request.
     * </p>
     * 
     * @return The optional <a href="https://docs.aws.amazon.com/location/latest/developerguide/using-apikeys.html">API
     *         key</a> to authorize the request.
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * The optional <a href="https://docs.aws.amazon.com/location/latest/developerguide/using-apikeys.html">API key</a>
     * to authorize the request.
     * </p>
     * 
     * @param key
     *        The optional <a href="https://docs.aws.amazon.com/location/latest/developerguide/using-apikeys.html">API
     *        key</a> to authorize the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMapStyleDescriptorRequest withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * The map resource to retrieve the style descriptor from.
     * </p>
     * 
     * @param mapName
     *        The map resource to retrieve the style descriptor from.
     */

    public void setMapName(String mapName) {
        this.mapName = mapName;
    }

    /**
     * <p>
     * The map resource to retrieve the style descriptor from.
     * </p>
     * 
     * @return The map resource to retrieve the style descriptor from.
     */

    public String getMapName() {
        return this.mapName;
    }

    /**
     * <p>
     * The map resource to retrieve the style descriptor from.
     * </p>
     * 
     * @param mapName
     *        The map resource to retrieve the style descriptor from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMapStyleDescriptorRequest withMapName(String mapName) {
        setMapName(mapName);
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
        if (getKey() != null)
            sb.append("Key: ").append("***Sensitive Data Redacted***").append(",");
        if (getMapName() != null)
            sb.append("MapName: ").append(getMapName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetMapStyleDescriptorRequest == false)
            return false;
        GetMapStyleDescriptorRequest other = (GetMapStyleDescriptorRequest) obj;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getMapName() == null ^ this.getMapName() == null)
            return false;
        if (other.getMapName() != null && other.getMapName().equals(this.getMapName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getMapName() == null) ? 0 : getMapName().hashCode());
        return hashCode;
    }

    @Override
    public GetMapStyleDescriptorRequest clone() {
        return (GetMapStyleDescriptorRequest) super.clone();
    }

}
