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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetOTAUpdateResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The OTA update info.
     * </p>
     */
    private OTAUpdateInfo otaUpdateInfo;

    /**
     * <p>
     * The OTA update info.
     * </p>
     * 
     * @param otaUpdateInfo
     *        The OTA update info.
     */

    public void setOtaUpdateInfo(OTAUpdateInfo otaUpdateInfo) {
        this.otaUpdateInfo = otaUpdateInfo;
    }

    /**
     * <p>
     * The OTA update info.
     * </p>
     * 
     * @return The OTA update info.
     */

    public OTAUpdateInfo getOtaUpdateInfo() {
        return this.otaUpdateInfo;
    }

    /**
     * <p>
     * The OTA update info.
     * </p>
     * 
     * @param otaUpdateInfo
     *        The OTA update info.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetOTAUpdateResult withOtaUpdateInfo(OTAUpdateInfo otaUpdateInfo) {
        setOtaUpdateInfo(otaUpdateInfo);
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
        if (getOtaUpdateInfo() != null)
            sb.append("OtaUpdateInfo: ").append(getOtaUpdateInfo());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetOTAUpdateResult == false)
            return false;
        GetOTAUpdateResult other = (GetOTAUpdateResult) obj;
        if (other.getOtaUpdateInfo() == null ^ this.getOtaUpdateInfo() == null)
            return false;
        if (other.getOtaUpdateInfo() != null && other.getOtaUpdateInfo().equals(this.getOtaUpdateInfo()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOtaUpdateInfo() == null) ? 0 : getOtaUpdateInfo().hashCode());
        return hashCode;
    }

    @Override
    public GetOTAUpdateResult clone() {
        try {
            return (GetOTAUpdateResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
