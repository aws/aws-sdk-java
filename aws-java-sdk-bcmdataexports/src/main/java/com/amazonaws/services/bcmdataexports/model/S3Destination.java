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
package com.amazonaws.services.bcmdataexports.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the destination Amazon Simple Storage Service (Amazon S3) bucket name and object keys of a data exports
 * file.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bcm-data-exports-2023-11-26/S3Destination" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3Destination implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the Amazon S3 bucket used as the destination of a data export file.
     * </p>
     */
    private String s3Bucket;
    /**
     * <p>
     * The output configuration for the data export.
     * </p>
     */
    private S3OutputConfigurations s3OutputConfigurations;
    /**
     * <p>
     * The S3 path prefix you want prepended to the name of your data export.
     * </p>
     */
    private String s3Prefix;
    /**
     * <p>
     * The S3 bucket Region.
     * </p>
     */
    private String s3Region;

    /**
     * <p>
     * The name of the Amazon S3 bucket used as the destination of a data export file.
     * </p>
     * 
     * @param s3Bucket
     *        The name of the Amazon S3 bucket used as the destination of a data export file.
     */

    public void setS3Bucket(String s3Bucket) {
        this.s3Bucket = s3Bucket;
    }

    /**
     * <p>
     * The name of the Amazon S3 bucket used as the destination of a data export file.
     * </p>
     * 
     * @return The name of the Amazon S3 bucket used as the destination of a data export file.
     */

    public String getS3Bucket() {
        return this.s3Bucket;
    }

    /**
     * <p>
     * The name of the Amazon S3 bucket used as the destination of a data export file.
     * </p>
     * 
     * @param s3Bucket
     *        The name of the Amazon S3 bucket used as the destination of a data export file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Destination withS3Bucket(String s3Bucket) {
        setS3Bucket(s3Bucket);
        return this;
    }

    /**
     * <p>
     * The output configuration for the data export.
     * </p>
     * 
     * @param s3OutputConfigurations
     *        The output configuration for the data export.
     */

    public void setS3OutputConfigurations(S3OutputConfigurations s3OutputConfigurations) {
        this.s3OutputConfigurations = s3OutputConfigurations;
    }

    /**
     * <p>
     * The output configuration for the data export.
     * </p>
     * 
     * @return The output configuration for the data export.
     */

    public S3OutputConfigurations getS3OutputConfigurations() {
        return this.s3OutputConfigurations;
    }

    /**
     * <p>
     * The output configuration for the data export.
     * </p>
     * 
     * @param s3OutputConfigurations
     *        The output configuration for the data export.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Destination withS3OutputConfigurations(S3OutputConfigurations s3OutputConfigurations) {
        setS3OutputConfigurations(s3OutputConfigurations);
        return this;
    }

    /**
     * <p>
     * The S3 path prefix you want prepended to the name of your data export.
     * </p>
     * 
     * @param s3Prefix
     *        The S3 path prefix you want prepended to the name of your data export.
     */

    public void setS3Prefix(String s3Prefix) {
        this.s3Prefix = s3Prefix;
    }

    /**
     * <p>
     * The S3 path prefix you want prepended to the name of your data export.
     * </p>
     * 
     * @return The S3 path prefix you want prepended to the name of your data export.
     */

    public String getS3Prefix() {
        return this.s3Prefix;
    }

    /**
     * <p>
     * The S3 path prefix you want prepended to the name of your data export.
     * </p>
     * 
     * @param s3Prefix
     *        The S3 path prefix you want prepended to the name of your data export.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Destination withS3Prefix(String s3Prefix) {
        setS3Prefix(s3Prefix);
        return this;
    }

    /**
     * <p>
     * The S3 bucket Region.
     * </p>
     * 
     * @param s3Region
     *        The S3 bucket Region.
     */

    public void setS3Region(String s3Region) {
        this.s3Region = s3Region;
    }

    /**
     * <p>
     * The S3 bucket Region.
     * </p>
     * 
     * @return The S3 bucket Region.
     */

    public String getS3Region() {
        return this.s3Region;
    }

    /**
     * <p>
     * The S3 bucket Region.
     * </p>
     * 
     * @param s3Region
     *        The S3 bucket Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Destination withS3Region(String s3Region) {
        setS3Region(s3Region);
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
        if (getS3Bucket() != null)
            sb.append("S3Bucket: ").append(getS3Bucket()).append(",");
        if (getS3OutputConfigurations() != null)
            sb.append("S3OutputConfigurations: ").append(getS3OutputConfigurations()).append(",");
        if (getS3Prefix() != null)
            sb.append("S3Prefix: ").append(getS3Prefix()).append(",");
        if (getS3Region() != null)
            sb.append("S3Region: ").append(getS3Region());
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
        if (other.getS3Bucket() == null ^ this.getS3Bucket() == null)
            return false;
        if (other.getS3Bucket() != null && other.getS3Bucket().equals(this.getS3Bucket()) == false)
            return false;
        if (other.getS3OutputConfigurations() == null ^ this.getS3OutputConfigurations() == null)
            return false;
        if (other.getS3OutputConfigurations() != null && other.getS3OutputConfigurations().equals(this.getS3OutputConfigurations()) == false)
            return false;
        if (other.getS3Prefix() == null ^ this.getS3Prefix() == null)
            return false;
        if (other.getS3Prefix() != null && other.getS3Prefix().equals(this.getS3Prefix()) == false)
            return false;
        if (other.getS3Region() == null ^ this.getS3Region() == null)
            return false;
        if (other.getS3Region() != null && other.getS3Region().equals(this.getS3Region()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3Bucket() == null) ? 0 : getS3Bucket().hashCode());
        hashCode = prime * hashCode + ((getS3OutputConfigurations() == null) ? 0 : getS3OutputConfigurations().hashCode());
        hashCode = prime * hashCode + ((getS3Prefix() == null) ? 0 : getS3Prefix().hashCode());
        hashCode = prime * hashCode + ((getS3Region() == null) ? 0 : getS3Region().hashCode());
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
        com.amazonaws.services.bcmdataexports.model.transform.S3DestinationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
