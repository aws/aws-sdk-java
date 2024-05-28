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
     * The configuration of EKS Anywhere on the Snow Family device.
     * </p>
     */
    private EKSOnDeviceServiceConfiguration eKSOnDeviceService;
    /**
     * <p>
     * Configuration for Amazon S3 compatible storage on Snow family devices.
     * </p>
     */
    private S3OnDeviceServiceConfiguration s3OnDeviceService;

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
     * <p>
     * The configuration of EKS Anywhere on the Snow Family device.
     * </p>
     * 
     * @param eKSOnDeviceService
     *        The configuration of EKS Anywhere on the Snow Family device.
     */

    public void setEKSOnDeviceService(EKSOnDeviceServiceConfiguration eKSOnDeviceService) {
        this.eKSOnDeviceService = eKSOnDeviceService;
    }

    /**
     * <p>
     * The configuration of EKS Anywhere on the Snow Family device.
     * </p>
     * 
     * @return The configuration of EKS Anywhere on the Snow Family device.
     */

    public EKSOnDeviceServiceConfiguration getEKSOnDeviceService() {
        return this.eKSOnDeviceService;
    }

    /**
     * <p>
     * The configuration of EKS Anywhere on the Snow Family device.
     * </p>
     * 
     * @param eKSOnDeviceService
     *        The configuration of EKS Anywhere on the Snow Family device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OnDeviceServiceConfiguration withEKSOnDeviceService(EKSOnDeviceServiceConfiguration eKSOnDeviceService) {
        setEKSOnDeviceService(eKSOnDeviceService);
        return this;
    }

    /**
     * <p>
     * Configuration for Amazon S3 compatible storage on Snow family devices.
     * </p>
     * 
     * @param s3OnDeviceService
     *        Configuration for Amazon S3 compatible storage on Snow family devices.
     */

    public void setS3OnDeviceService(S3OnDeviceServiceConfiguration s3OnDeviceService) {
        this.s3OnDeviceService = s3OnDeviceService;
    }

    /**
     * <p>
     * Configuration for Amazon S3 compatible storage on Snow family devices.
     * </p>
     * 
     * @return Configuration for Amazon S3 compatible storage on Snow family devices.
     */

    public S3OnDeviceServiceConfiguration getS3OnDeviceService() {
        return this.s3OnDeviceService;
    }

    /**
     * <p>
     * Configuration for Amazon S3 compatible storage on Snow family devices.
     * </p>
     * 
     * @param s3OnDeviceService
     *        Configuration for Amazon S3 compatible storage on Snow family devices.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OnDeviceServiceConfiguration withS3OnDeviceService(S3OnDeviceServiceConfiguration s3OnDeviceService) {
        setS3OnDeviceService(s3OnDeviceService);
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
            sb.append("TGWOnDeviceService: ").append(getTGWOnDeviceService()).append(",");
        if (getEKSOnDeviceService() != null)
            sb.append("EKSOnDeviceService: ").append(getEKSOnDeviceService()).append(",");
        if (getS3OnDeviceService() != null)
            sb.append("S3OnDeviceService: ").append(getS3OnDeviceService());
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
        if (other.getEKSOnDeviceService() == null ^ this.getEKSOnDeviceService() == null)
            return false;
        if (other.getEKSOnDeviceService() != null && other.getEKSOnDeviceService().equals(this.getEKSOnDeviceService()) == false)
            return false;
        if (other.getS3OnDeviceService() == null ^ this.getS3OnDeviceService() == null)
            return false;
        if (other.getS3OnDeviceService() != null && other.getS3OnDeviceService().equals(this.getS3OnDeviceService()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNFSOnDeviceService() == null) ? 0 : getNFSOnDeviceService().hashCode());
        hashCode = prime * hashCode + ((getTGWOnDeviceService() == null) ? 0 : getTGWOnDeviceService().hashCode());
        hashCode = prime * hashCode + ((getEKSOnDeviceService() == null) ? 0 : getEKSOnDeviceService().hashCode());
        hashCode = prime * hashCode + ((getS3OnDeviceService() == null) ? 0 : getS3OnDeviceService().hashCode());
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
