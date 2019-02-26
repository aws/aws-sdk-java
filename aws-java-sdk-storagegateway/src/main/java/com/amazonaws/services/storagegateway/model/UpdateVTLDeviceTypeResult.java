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
package com.amazonaws.services.storagegateway.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * UpdateVTLDeviceTypeOutput
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/UpdateVTLDeviceType" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateVTLDeviceTypeResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the medium changer you have selected.
     * </p>
     */
    private String vTLDeviceARN;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the medium changer you have selected.
     * </p>
     * 
     * @param vTLDeviceARN
     *        The Amazon Resource Name (ARN) of the medium changer you have selected.
     */

    public void setVTLDeviceARN(String vTLDeviceARN) {
        this.vTLDeviceARN = vTLDeviceARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the medium changer you have selected.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the medium changer you have selected.
     */

    public String getVTLDeviceARN() {
        return this.vTLDeviceARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the medium changer you have selected.
     * </p>
     * 
     * @param vTLDeviceARN
     *        The Amazon Resource Name (ARN) of the medium changer you have selected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateVTLDeviceTypeResult withVTLDeviceARN(String vTLDeviceARN) {
        setVTLDeviceARN(vTLDeviceARN);
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
        if (getVTLDeviceARN() != null)
            sb.append("VTLDeviceARN: ").append(getVTLDeviceARN());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateVTLDeviceTypeResult == false)
            return false;
        UpdateVTLDeviceTypeResult other = (UpdateVTLDeviceTypeResult) obj;
        if (other.getVTLDeviceARN() == null ^ this.getVTLDeviceARN() == null)
            return false;
        if (other.getVTLDeviceARN() != null && other.getVTLDeviceARN().equals(this.getVTLDeviceARN()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVTLDeviceARN() == null) ? 0 : getVTLDeviceARN().hashCode());
        return hashCode;
    }

    @Override
    public UpdateVTLDeviceTypeResult clone() {
        try {
            return (UpdateVTLDeviceTypeResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
