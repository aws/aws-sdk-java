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
package com.amazonaws.services.gamelift.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Represents the returned data in response to a request action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/GetInstanceAccess" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetInstanceAccessResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Object that contains connection information for a fleet instance, including IP address and access credentials.
     * </p>
     */
    private InstanceAccess instanceAccess;

    /**
     * <p>
     * Object that contains connection information for a fleet instance, including IP address and access credentials.
     * </p>
     * 
     * @param instanceAccess
     *        Object that contains connection information for a fleet instance, including IP address and access
     *        credentials.
     */

    public void setInstanceAccess(InstanceAccess instanceAccess) {
        this.instanceAccess = instanceAccess;
    }

    /**
     * <p>
     * Object that contains connection information for a fleet instance, including IP address and access credentials.
     * </p>
     * 
     * @return Object that contains connection information for a fleet instance, including IP address and access
     *         credentials.
     */

    public InstanceAccess getInstanceAccess() {
        return this.instanceAccess;
    }

    /**
     * <p>
     * Object that contains connection information for a fleet instance, including IP address and access credentials.
     * </p>
     * 
     * @param instanceAccess
     *        Object that contains connection information for a fleet instance, including IP address and access
     *        credentials.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInstanceAccessResult withInstanceAccess(InstanceAccess instanceAccess) {
        setInstanceAccess(instanceAccess);
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
        if (getInstanceAccess() != null)
            sb.append("InstanceAccess: ").append(getInstanceAccess());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetInstanceAccessResult == false)
            return false;
        GetInstanceAccessResult other = (GetInstanceAccessResult) obj;
        if (other.getInstanceAccess() == null ^ this.getInstanceAccess() == null)
            return false;
        if (other.getInstanceAccess() != null && other.getInstanceAccess().equals(this.getInstanceAccess()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceAccess() == null) ? 0 : getInstanceAccess().hashCode());
        return hashCode;
    }

    @Override
    public GetInstanceAccessResult clone() {
        try {
            return (GetInstanceAccessResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
