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
package com.amazonaws.services.tnb.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/DeleteSolNetworkInstance" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteSolNetworkInstanceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Network instance ID.
     * </p>
     */
    private String nsInstanceId;

    /**
     * <p>
     * Network instance ID.
     * </p>
     * 
     * @param nsInstanceId
     *        Network instance ID.
     */

    public void setNsInstanceId(String nsInstanceId) {
        this.nsInstanceId = nsInstanceId;
    }

    /**
     * <p>
     * Network instance ID.
     * </p>
     * 
     * @return Network instance ID.
     */

    public String getNsInstanceId() {
        return this.nsInstanceId;
    }

    /**
     * <p>
     * Network instance ID.
     * </p>
     * 
     * @param nsInstanceId
     *        Network instance ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteSolNetworkInstanceRequest withNsInstanceId(String nsInstanceId) {
        setNsInstanceId(nsInstanceId);
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
        if (getNsInstanceId() != null)
            sb.append("NsInstanceId: ").append(getNsInstanceId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteSolNetworkInstanceRequest == false)
            return false;
        DeleteSolNetworkInstanceRequest other = (DeleteSolNetworkInstanceRequest) obj;
        if (other.getNsInstanceId() == null ^ this.getNsInstanceId() == null)
            return false;
        if (other.getNsInstanceId() != null && other.getNsInstanceId().equals(this.getNsInstanceId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNsInstanceId() == null) ? 0 : getNsInstanceId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteSolNetworkInstanceRequest clone() {
        return (DeleteSolNetworkInstanceRequest) super.clone();
    }

}
