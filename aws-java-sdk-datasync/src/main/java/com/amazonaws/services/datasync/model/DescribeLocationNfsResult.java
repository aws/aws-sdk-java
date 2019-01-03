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
package com.amazonaws.services.datasync.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * DescribeLocationNfsResponse
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/DescribeLocationNfs" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeLocationNfsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon resource Name (ARN) of the NFS location that was described.
     * </p>
     */
    private String locationArn;
    /**
     * <p>
     * The URL of the source NFS location that was described.
     * </p>
     */
    private String locationUri;

    private OnPremConfig onPremConfig;
    /**
     * <p>
     * The time that the NFS location was created.
     * </p>
     */
    private java.util.Date creationTime;

    /**
     * <p>
     * The Amazon resource Name (ARN) of the NFS location that was described.
     * </p>
     * 
     * @param locationArn
     *        The Amazon resource Name (ARN) of the NFS location that was described.
     */

    public void setLocationArn(String locationArn) {
        this.locationArn = locationArn;
    }

    /**
     * <p>
     * The Amazon resource Name (ARN) of the NFS location that was described.
     * </p>
     * 
     * @return The Amazon resource Name (ARN) of the NFS location that was described.
     */

    public String getLocationArn() {
        return this.locationArn;
    }

    /**
     * <p>
     * The Amazon resource Name (ARN) of the NFS location that was described.
     * </p>
     * 
     * @param locationArn
     *        The Amazon resource Name (ARN) of the NFS location that was described.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLocationNfsResult withLocationArn(String locationArn) {
        setLocationArn(locationArn);
        return this;
    }

    /**
     * <p>
     * The URL of the source NFS location that was described.
     * </p>
     * 
     * @param locationUri
     *        The URL of the source NFS location that was described.
     */

    public void setLocationUri(String locationUri) {
        this.locationUri = locationUri;
    }

    /**
     * <p>
     * The URL of the source NFS location that was described.
     * </p>
     * 
     * @return The URL of the source NFS location that was described.
     */

    public String getLocationUri() {
        return this.locationUri;
    }

    /**
     * <p>
     * The URL of the source NFS location that was described.
     * </p>
     * 
     * @param locationUri
     *        The URL of the source NFS location that was described.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLocationNfsResult withLocationUri(String locationUri) {
        setLocationUri(locationUri);
        return this;
    }

    /**
     * @param onPremConfig
     */

    public void setOnPremConfig(OnPremConfig onPremConfig) {
        this.onPremConfig = onPremConfig;
    }

    /**
     * @return
     */

    public OnPremConfig getOnPremConfig() {
        return this.onPremConfig;
    }

    /**
     * @param onPremConfig
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLocationNfsResult withOnPremConfig(OnPremConfig onPremConfig) {
        setOnPremConfig(onPremConfig);
        return this;
    }

    /**
     * <p>
     * The time that the NFS location was created.
     * </p>
     * 
     * @param creationTime
     *        The time that the NFS location was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time that the NFS location was created.
     * </p>
     * 
     * @return The time that the NFS location was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time that the NFS location was created.
     * </p>
     * 
     * @param creationTime
     *        The time that the NFS location was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLocationNfsResult withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
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
        if (getLocationArn() != null)
            sb.append("LocationArn: ").append(getLocationArn()).append(",");
        if (getLocationUri() != null)
            sb.append("LocationUri: ").append(getLocationUri()).append(",");
        if (getOnPremConfig() != null)
            sb.append("OnPremConfig: ").append(getOnPremConfig()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeLocationNfsResult == false)
            return false;
        DescribeLocationNfsResult other = (DescribeLocationNfsResult) obj;
        if (other.getLocationArn() == null ^ this.getLocationArn() == null)
            return false;
        if (other.getLocationArn() != null && other.getLocationArn().equals(this.getLocationArn()) == false)
            return false;
        if (other.getLocationUri() == null ^ this.getLocationUri() == null)
            return false;
        if (other.getLocationUri() != null && other.getLocationUri().equals(this.getLocationUri()) == false)
            return false;
        if (other.getOnPremConfig() == null ^ this.getOnPremConfig() == null)
            return false;
        if (other.getOnPremConfig() != null && other.getOnPremConfig().equals(this.getOnPremConfig()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLocationArn() == null) ? 0 : getLocationArn().hashCode());
        hashCode = prime * hashCode + ((getLocationUri() == null) ? 0 : getLocationUri().hashCode());
        hashCode = prime * hashCode + ((getOnPremConfig() == null) ? 0 : getOnPremConfig().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        return hashCode;
    }

    @Override
    public DescribeLocationNfsResult clone() {
        try {
            return (DescribeLocationNfsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
