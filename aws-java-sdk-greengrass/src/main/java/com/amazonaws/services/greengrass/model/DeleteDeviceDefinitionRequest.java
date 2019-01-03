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
package com.amazonaws.services.greengrass.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/DeleteDeviceDefinition" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteDeviceDefinitionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** The ID of the device definition. */
    private String deviceDefinitionId;

    /**
     * The ID of the device definition.
     * 
     * @param deviceDefinitionId
     *        The ID of the device definition.
     */

    public void setDeviceDefinitionId(String deviceDefinitionId) {
        this.deviceDefinitionId = deviceDefinitionId;
    }

    /**
     * The ID of the device definition.
     * 
     * @return The ID of the device definition.
     */

    public String getDeviceDefinitionId() {
        return this.deviceDefinitionId;
    }

    /**
     * The ID of the device definition.
     * 
     * @param deviceDefinitionId
     *        The ID of the device definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteDeviceDefinitionRequest withDeviceDefinitionId(String deviceDefinitionId) {
        setDeviceDefinitionId(deviceDefinitionId);
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
        if (getDeviceDefinitionId() != null)
            sb.append("DeviceDefinitionId: ").append(getDeviceDefinitionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteDeviceDefinitionRequest == false)
            return false;
        DeleteDeviceDefinitionRequest other = (DeleteDeviceDefinitionRequest) obj;
        if (other.getDeviceDefinitionId() == null ^ this.getDeviceDefinitionId() == null)
            return false;
        if (other.getDeviceDefinitionId() != null && other.getDeviceDefinitionId().equals(this.getDeviceDefinitionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeviceDefinitionId() == null) ? 0 : getDeviceDefinitionId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteDeviceDefinitionRequest clone() {
        return (DeleteDeviceDefinitionRequest) super.clone();
    }

}
