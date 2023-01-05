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
package com.amazonaws.services.snowball.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that represents the metadata and configuration settings for services on an Amazon Web Services Snow Family
 * device.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snowball-2016-06-30/OnDeviceServiceConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OnDeviceServiceConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Represents the NFS (Network File System) service on a Snow Family device.
     * </p>
     */
    private NFSOnDeviceServiceConfiguration nFSOnDeviceService;
    /**
     * <p>
     * Represents the Storage Gateway service Tape Gateway type on a Snow Family device.
     * </p>
     */
    private TGWOnDeviceServiceConfiguration tGWOnDeviceService;

    /**
     * <p>
     * Represents the NFS (Network File System) service on a Snow Family device.
     * </p>
     * 
     * @param nFSOnDeviceService
     *        Represents the NFS (Network File System) service on a Snow Family device.
     */

    public void setNFSOnDeviceService(NFSOnDeviceServiceConfiguration nFSOnDeviceService) {
        this.nFSOnDeviceService = nFSOnDeviceService;
    }

    /**
     * <p>
     * Represents the NFS (Network File System) service on a Snow Family device.
     * </p>
     * 
     * @return Represents the NFS (Network File System) service on a Snow Family device.
     */

    public NFSOnDeviceServiceConfiguration getNFSOnDeviceService() {
        return this.nFSOnDeviceService;
    }

    /**
     * <p>
     * Represents the NFS (Network File System) service on a Snow Family device.
     * </p>
     * 
     * @param nFSOnDeviceService
     *        Represents the NFS (Network File System) service on a Snow Family device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OnDeviceServiceConfiguration withNFSOnDeviceService(NFSOnDeviceServiceConfiguration nFSOnDeviceService) {
        setNFSOnDeviceService(nFSOnDeviceService);
        return this;
    }

    /**
     * <p>
     * Represents the Storage Gateway service Tape Gateway type on a Snow Family device.
     * </p>
     * 
     * @param tGWOnDeviceService
     *        Represents the Storage Gateway service Tape Gateway type on a Snow Family device.
     */

    public void setTGWOnDeviceService(TGWOnDeviceServiceConfiguration tGWOnDeviceService) {
        this.tGWOnDeviceService = tGWOnDeviceService;
    }

    /**
     * <p>
     * Represents the Storage Gateway service Tape Gateway type on a Snow Family device.
     * </p>
     * 
     * @return Represents the Storage Gateway service Tape Gateway type on a Snow Family device.
     */

    public TGWOnDeviceServiceConfiguration getTGWOnDeviceService() {
        return this.tGWOnDeviceService;
    }

    /**
     * <p>
     * Represents the Storage Gateway service Tape Gateway type on a Snow Family device.
     * </p>
     * 
     * @param tGWOnDeviceService
     *        Represents the Storage Gateway service Tape Gateway type on a Snow Family device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OnDeviceServiceConfiguration withTGWOnDeviceService(TGWOnDeviceServiceConfiguration tGWOnDeviceService) {
        setTGWOnDeviceService(tGWOnDeviceService);
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
        if (getNFSOnDeviceService() != null)
            sb.append("NFSOnDeviceService: ").append(getNFSOnDeviceService()).append(",");
        if (getTGWOnDeviceService() != null)
            sb.append("TGWOnDeviceService: ").append(getTGWOnDeviceService());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OnDeviceServiceConfiguration == false)
            return false;
        OnDeviceServiceConfiguration other = (OnDeviceServiceConfiguration) obj;
        if (other.getNFSOnDeviceService() == null ^ this.getNFSOnDeviceService() == null)
            return false;
        if (other.getNFSOnDeviceService() != null && other.getNFSOnDeviceService().equals(this.getNFSOnDeviceService()) == false)
            return false;
        if (other.getTGWOnDeviceService() == null ^ this.getTGWOnDeviceService() == null)
            return false;
        if (other.getTGWOnDeviceService() != null && other.getTGWOnDeviceService().equals(this.getTGWOnDeviceService()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNFSOnDeviceService() == null) ? 0 : getNFSOnDeviceService().hashCode());
        hashCode = prime * hashCode + ((getTGWOnDeviceService() == null) ? 0 : getTGWOnDeviceService().hashCode());
        return hashCode;
    }

    @Override
    public OnDeviceServiceConfiguration clone() {
        try {
            return (OnDeviceServiceConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.snowball.model.transform.OnDeviceServiceConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
