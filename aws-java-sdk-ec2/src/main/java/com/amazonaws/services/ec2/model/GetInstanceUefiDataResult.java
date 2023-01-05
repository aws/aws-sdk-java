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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceResult;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetInstanceUefiDataResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the instance from which to retrieve the UEFI data.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * Base64 representation of the non-volatile UEFI variable store.
     * </p>
     */
    private String uefiData;

    /**
     * <p>
     * The ID of the instance from which to retrieve the UEFI data.
     * </p>
     * 
     * @param instanceId
     *        The ID of the instance from which to retrieve the UEFI data.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The ID of the instance from which to retrieve the UEFI data.
     * </p>
     * 
     * @return The ID of the instance from which to retrieve the UEFI data.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The ID of the instance from which to retrieve the UEFI data.
     * </p>
     * 
     * @param instanceId
     *        The ID of the instance from which to retrieve the UEFI data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInstanceUefiDataResult withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * Base64 representation of the non-volatile UEFI variable store.
     * </p>
     * 
     * @param uefiData
     *        Base64 representation of the non-volatile UEFI variable store.
     */

    public void setUefiData(String uefiData) {
        this.uefiData = uefiData;
    }

    /**
     * <p>
     * Base64 representation of the non-volatile UEFI variable store.
     * </p>
     * 
     * @return Base64 representation of the non-volatile UEFI variable store.
     */

    public String getUefiData() {
        return this.uefiData;
    }

    /**
     * <p>
     * Base64 representation of the non-volatile UEFI variable store.
     * </p>
     * 
     * @param uefiData
     *        Base64 representation of the non-volatile UEFI variable store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInstanceUefiDataResult withUefiData(String uefiData) {
        setUefiData(uefiData);
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
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getUefiData() != null)
            sb.append("UefiData: ").append(getUefiData());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetInstanceUefiDataResult == false)
            return false;
        GetInstanceUefiDataResult other = (GetInstanceUefiDataResult) obj;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getUefiData() == null ^ this.getUefiData() == null)
            return false;
        if (other.getUefiData() != null && other.getUefiData().equals(this.getUefiData()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getUefiData() == null) ? 0 : getUefiData().hashCode());
        return hashCode;
    }

    @Override
    public GetInstanceUefiDataResult clone() {
        try {
            return (GetInstanceUefiDataResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
