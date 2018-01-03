/*
 * Copyright 2012-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/GetDeviceDefinitionVersion"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDeviceDefinitionVersionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** device definition Id */
    private String deviceDefinitionId;
    /** device definition version Id */
    private String deviceDefinitionVersionId;

    /**
     * device definition Id
     * 
     * @param deviceDefinitionId
     *        device definition Id
     */

    public void setDeviceDefinitionId(String deviceDefinitionId) {
        this.deviceDefinitionId = deviceDefinitionId;
    }

    /**
     * device definition Id
     * 
     * @return device definition Id
     */

    public String getDeviceDefinitionId() {
        return this.deviceDefinitionId;
    }

    /**
     * device definition Id
     * 
     * @param deviceDefinitionId
     *        device definition Id
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDeviceDefinitionVersionRequest withDeviceDefinitionId(String deviceDefinitionId) {
        setDeviceDefinitionId(deviceDefinitionId);
        return this;
    }

    /**
     * device definition version Id
     * 
     * @param deviceDefinitionVersionId
     *        device definition version Id
     */

    public void setDeviceDefinitionVersionId(String deviceDefinitionVersionId) {
        this.deviceDefinitionVersionId = deviceDefinitionVersionId;
    }

    /**
     * device definition version Id
     * 
     * @return device definition version Id
     */

    public String getDeviceDefinitionVersionId() {
        return this.deviceDefinitionVersionId;
    }

    /**
     * device definition version Id
     * 
     * @param deviceDefinitionVersionId
     *        device definition version Id
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDeviceDefinitionVersionRequest withDeviceDefinitionVersionId(String deviceDefinitionVersionId) {
        setDeviceDefinitionVersionId(deviceDefinitionVersionId);
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
        if (getDeviceDefinitionId() != null)
            sb.append("DeviceDefinitionId: ").append(getDeviceDefinitionId()).append(",");
        if (getDeviceDefinitionVersionId() != null)
            sb.append("DeviceDefinitionVersionId: ").append(getDeviceDefinitionVersionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDeviceDefinitionVersionRequest == false)
            return false;
        GetDeviceDefinitionVersionRequest other = (GetDeviceDefinitionVersionRequest) obj;
        if (other.getDeviceDefinitionId() == null ^ this.getDeviceDefinitionId() == null)
            return false;
        if (other.getDeviceDefinitionId() != null && other.getDeviceDefinitionId().equals(this.getDeviceDefinitionId()) == false)
            return false;
        if (other.getDeviceDefinitionVersionId() == null ^ this.getDeviceDefinitionVersionId() == null)
            return false;
        if (other.getDeviceDefinitionVersionId() != null && other.getDeviceDefinitionVersionId().equals(this.getDeviceDefinitionVersionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeviceDefinitionId() == null) ? 0 : getDeviceDefinitionId().hashCode());
        hashCode = prime * hashCode + ((getDeviceDefinitionVersionId() == null) ? 0 : getDeviceDefinitionVersionId().hashCode());
        return hashCode;
    }

    @Override
    public GetDeviceDefinitionVersionRequest clone() {
        return (GetDeviceDefinitionVersionRequest) super.clone();
    }

}
