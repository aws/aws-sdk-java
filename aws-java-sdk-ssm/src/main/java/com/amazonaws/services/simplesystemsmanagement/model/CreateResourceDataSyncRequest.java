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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/CreateResourceDataSync" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateResourceDataSyncRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A name for the configuration.
     * </p>
     */
    private String syncName;
    /**
     * <p>
     * Amazon S3 configuration details for the sync.
     * </p>
     */
    private ResourceDataSyncS3Destination s3Destination;

    /**
     * <p>
     * A name for the configuration.
     * </p>
     * 
     * @param syncName
     *        A name for the configuration.
     */

    public void setSyncName(String syncName) {
        this.syncName = syncName;
    }

    /**
     * <p>
     * A name for the configuration.
     * </p>
     * 
     * @return A name for the configuration.
     */

    public String getSyncName() {
        return this.syncName;
    }

    /**
     * <p>
     * A name for the configuration.
     * </p>
     * 
     * @param syncName
     *        A name for the configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateResourceDataSyncRequest withSyncName(String syncName) {
        setSyncName(syncName);
        return this;
    }

    /**
     * <p>
     * Amazon S3 configuration details for the sync.
     * </p>
     * 
     * @param s3Destination
     *        Amazon S3 configuration details for the sync.
     */

    public void setS3Destination(ResourceDataSyncS3Destination s3Destination) {
        this.s3Destination = s3Destination;
    }

    /**
     * <p>
     * Amazon S3 configuration details for the sync.
     * </p>
     * 
     * @return Amazon S3 configuration details for the sync.
     */

    public ResourceDataSyncS3Destination getS3Destination() {
        return this.s3Destination;
    }

    /**
     * <p>
     * Amazon S3 configuration details for the sync.
     * </p>
     * 
     * @param s3Destination
     *        Amazon S3 configuration details for the sync.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateResourceDataSyncRequest withS3Destination(ResourceDataSyncS3Destination s3Destination) {
        setS3Destination(s3Destination);
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
        if (getSyncName() != null)
            sb.append("SyncName: ").append(getSyncName()).append(",");
        if (getS3Destination() != null)
            sb.append("S3Destination: ").append(getS3Destination());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateResourceDataSyncRequest == false)
            return false;
        CreateResourceDataSyncRequest other = (CreateResourceDataSyncRequest) obj;
        if (other.getSyncName() == null ^ this.getSyncName() == null)
            return false;
        if (other.getSyncName() != null && other.getSyncName().equals(this.getSyncName()) == false)
            return false;
        if (other.getS3Destination() == null ^ this.getS3Destination() == null)
            return false;
        if (other.getS3Destination() != null && other.getS3Destination().equals(this.getS3Destination()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSyncName() == null) ? 0 : getSyncName().hashCode());
        hashCode = prime * hashCode + ((getS3Destination() == null) ? 0 : getS3Destination().hashCode());
        return hashCode;
    }

    @Override
    public CreateResourceDataSyncRequest clone() {
        return (CreateResourceDataSyncRequest) super.clone();
    }

}
