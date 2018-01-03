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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteOTAUpdateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The OTA update ID to delete.
     * </p>
     */
    private String otaUpdateId;

    /**
     * <p>
     * The OTA update ID to delete.
     * </p>
     * 
     * @param otaUpdateId
     *        The OTA update ID to delete.
     */

    public void setOtaUpdateId(String otaUpdateId) {
        this.otaUpdateId = otaUpdateId;
    }

    /**
     * <p>
     * The OTA update ID to delete.
     * </p>
     * 
     * @return The OTA update ID to delete.
     */

    public String getOtaUpdateId() {
        return this.otaUpdateId;
    }

    /**
     * <p>
     * The OTA update ID to delete.
     * </p>
     * 
     * @param otaUpdateId
     *        The OTA update ID to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteOTAUpdateRequest withOtaUpdateId(String otaUpdateId) {
        setOtaUpdateId(otaUpdateId);
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
        if (getOtaUpdateId() != null)
            sb.append("OtaUpdateId: ").append(getOtaUpdateId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteOTAUpdateRequest == false)
            return false;
        DeleteOTAUpdateRequest other = (DeleteOTAUpdateRequest) obj;
        if (other.getOtaUpdateId() == null ^ this.getOtaUpdateId() == null)
            return false;
        if (other.getOtaUpdateId() != null && other.getOtaUpdateId().equals(this.getOtaUpdateId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOtaUpdateId() == null) ? 0 : getOtaUpdateId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteOTAUpdateRequest clone() {
        return (DeleteOTAUpdateRequest) super.clone();
    }

}
