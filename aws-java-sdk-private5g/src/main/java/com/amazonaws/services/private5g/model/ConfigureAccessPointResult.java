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
package com.amazonaws.services.private5g.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/privatenetworks-2021-12-03/ConfigureAccessPoint"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConfigureAccessPointResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the network resource.
     * </p>
     */
    private NetworkResource accessPoint;

    /**
     * <p>
     * Information about the network resource.
     * </p>
     * 
     * @param accessPoint
     *        Information about the network resource.
     */

    public void setAccessPoint(NetworkResource accessPoint) {
        this.accessPoint = accessPoint;
    }

    /**
     * <p>
     * Information about the network resource.
     * </p>
     * 
     * @return Information about the network resource.
     */

    public NetworkResource getAccessPoint() {
        return this.accessPoint;
    }

    /**
     * <p>
     * Information about the network resource.
     * </p>
     * 
     * @param accessPoint
     *        Information about the network resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigureAccessPointResult withAccessPoint(NetworkResource accessPoint) {
        setAccessPoint(accessPoint);
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
        if (getAccessPoint() != null)
            sb.append("AccessPoint: ").append(getAccessPoint());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConfigureAccessPointResult == false)
            return false;
        ConfigureAccessPointResult other = (ConfigureAccessPointResult) obj;
        if (other.getAccessPoint() == null ^ this.getAccessPoint() == null)
            return false;
        if (other.getAccessPoint() != null && other.getAccessPoint().equals(this.getAccessPoint()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccessPoint() == null) ? 0 : getAccessPoint().hashCode());
        return hashCode;
    }

    @Override
    public ConfigureAccessPointResult clone() {
        try {
            return (ConfigureAccessPointResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
