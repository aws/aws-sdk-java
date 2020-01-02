/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mediapackage.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Configuration parameters for where in an S3 bucket to place the harvested content
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-2017-10-12/S3Destination" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3Destination implements Serializable, Cloneable, StructuredPojo {

    /**
     * The name of an S3 bucket within which harvested content will be exported
     */
    private String bucketName;
    /**
     * The key in the specified S3 bucket where the harvested top-level manifest will be placed.
     */
    private String manifestKey;
    /**
     * The IAM role used to write to the specified S3 bucket
     */
    private String roleArn;

    /**
     * The name of an S3 bucket within which harvested content will be exported
     * 
     * @param bucketName
     *        The name of an S3 bucket within which harvested content will be exported
     */

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * The name of an S3 bucket within which harvested content will be exported
     * 
     * @return The name of an S3 bucket within which harvested content will be exported
     */

    public String getBucketName() {
        return this.bucketName;
    }

    /**
     * The name of an S3 bucket within which harvested content will be exported
     * 
     * @param bucketName
     *        The name of an S3 bucket within which harvested content will be exported
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Destination withBucketName(String bucketName) {
        setBucketName(bucketName);
        return this;
    }

    /**
     * The key in the specified S3 bucket where the harvested top-level manifest will be placed.
     * 
     * @param manifestKey
     *        The key in the specified S3 bucket where the harvested top-level manifest will be placed.
     */

    public void setManifestKey(String manifestKey) {
        this.manifestKey = manifestKey;
    }

    /**
     * The key in the specified S3 bucket where the harvested top-level manifest will be placed.
     * 
     * @return The key in the specified S3 bucket where the harvested top-level manifest will be placed.
     */

    public String getManifestKey() {
        return this.manifestKey;
    }

    /**
     * The key in the specified S3 bucket where the harvested top-level manifest will be placed.
     * 
     * @param manifestKey
     *        The key in the specified S3 bucket where the harvested top-level manifest will be placed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Destination withManifestKey(String manifestKey) {
        setManifestKey(manifestKey);
        return this;
    }

    /**
     * The IAM role used to write to the specified S3 bucket
     * 
     * @param roleArn
     *        The IAM role used to write to the specified S3 bucket
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * The IAM role used to write to the specified S3 bucket
     * 
     * @return The IAM role used to write to the specified S3 bucket
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * The IAM role used to write to the specified S3 bucket
     * 
     * @param roleArn
     *        The IAM role used to write to the specified S3 bucket
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Destination withRoleArn(String roleArn) {
        setRoleArn(roleArn);
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
        if (getBucketName() != null)
            sb.append("BucketName: ").append(getBucketName()).append(",");
        if (getManifestKey() != null)
            sb.append("ManifestKey: ").append(getManifestKey()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3Destination == false)
            return false;
        S3Destination other = (S3Destination) obj;
        if (other.getBucketName() == null ^ this.getBucketName() == null)
            return false;
        if (other.getBucketName() != null && other.getBucketName().equals(this.getBucketName()) == false)
            return false;
        if (other.getManifestKey() == null ^ this.getManifestKey() == null)
            return false;
        if (other.getManifestKey() != null && other.getManifestKey().equals(this.getManifestKey()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucketName() == null) ? 0 : getBucketName().hashCode());
        hashCode = prime * hashCode + ((getManifestKey() == null) ? 0 : getManifestKey().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public S3Destination clone() {
        try {
            return (S3Destination) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediapackage.model.transform.S3DestinationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
