/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.appflow.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The properties that are applied when Amazon Redshift is being used as a destination.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/RedshiftDestinationProperties"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RedshiftDestinationProperties implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The object specified in the Amazon Redshift flow destination.
     * </p>
     */
    private String object;
    /**
     * <p>
     * The intermediate bucket that Amazon AppFlow uses when moving data into Amazon Redshift.
     * </p>
     */
    private String intermediateBucketName;
    /**
     * <p>
     * The object key for the bucket in which Amazon AppFlow places the destination files.
     * </p>
     */
    private String bucketPrefix;
    /**
     * <p>
     * The settings that determine how Amazon AppFlow handles an error when placing data in the Amazon Redshift
     * destination. For example, this setting would determine if the flow should fail after one insertion error, or
     * continue and attempt to insert every record regardless of the initial failure. <code>ErrorHandlingConfig</code>
     * is a part of the destination connector details.
     * </p>
     */
    private ErrorHandlingConfig errorHandlingConfig;

    /**
     * <p>
     * The object specified in the Amazon Redshift flow destination.
     * </p>
     * 
     * @param object
     *        The object specified in the Amazon Redshift flow destination.
     */

    public void setObject(String object) {
        this.object = object;
    }

    /**
     * <p>
     * The object specified in the Amazon Redshift flow destination.
     * </p>
     * 
     * @return The object specified in the Amazon Redshift flow destination.
     */

    public String getObject() {
        return this.object;
    }

    /**
     * <p>
     * The object specified in the Amazon Redshift flow destination.
     * </p>
     * 
     * @param object
     *        The object specified in the Amazon Redshift flow destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedshiftDestinationProperties withObject(String object) {
        setObject(object);
        return this;
    }

    /**
     * <p>
     * The intermediate bucket that Amazon AppFlow uses when moving data into Amazon Redshift.
     * </p>
     * 
     * @param intermediateBucketName
     *        The intermediate bucket that Amazon AppFlow uses when moving data into Amazon Redshift.
     */

    public void setIntermediateBucketName(String intermediateBucketName) {
        this.intermediateBucketName = intermediateBucketName;
    }

    /**
     * <p>
     * The intermediate bucket that Amazon AppFlow uses when moving data into Amazon Redshift.
     * </p>
     * 
     * @return The intermediate bucket that Amazon AppFlow uses when moving data into Amazon Redshift.
     */

    public String getIntermediateBucketName() {
        return this.intermediateBucketName;
    }

    /**
     * <p>
     * The intermediate bucket that Amazon AppFlow uses when moving data into Amazon Redshift.
     * </p>
     * 
     * @param intermediateBucketName
     *        The intermediate bucket that Amazon AppFlow uses when moving data into Amazon Redshift.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedshiftDestinationProperties withIntermediateBucketName(String intermediateBucketName) {
        setIntermediateBucketName(intermediateBucketName);
        return this;
    }

    /**
     * <p>
     * The object key for the bucket in which Amazon AppFlow places the destination files.
     * </p>
     * 
     * @param bucketPrefix
     *        The object key for the bucket in which Amazon AppFlow places the destination files.
     */

    public void setBucketPrefix(String bucketPrefix) {
        this.bucketPrefix = bucketPrefix;
    }

    /**
     * <p>
     * The object key for the bucket in which Amazon AppFlow places the destination files.
     * </p>
     * 
     * @return The object key for the bucket in which Amazon AppFlow places the destination files.
     */

    public String getBucketPrefix() {
        return this.bucketPrefix;
    }

    /**
     * <p>
     * The object key for the bucket in which Amazon AppFlow places the destination files.
     * </p>
     * 
     * @param bucketPrefix
     *        The object key for the bucket in which Amazon AppFlow places the destination files.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedshiftDestinationProperties withBucketPrefix(String bucketPrefix) {
        setBucketPrefix(bucketPrefix);
        return this;
    }

    /**
     * <p>
     * The settings that determine how Amazon AppFlow handles an error when placing data in the Amazon Redshift
     * destination. For example, this setting would determine if the flow should fail after one insertion error, or
     * continue and attempt to insert every record regardless of the initial failure. <code>ErrorHandlingConfig</code>
     * is a part of the destination connector details.
     * </p>
     * 
     * @param errorHandlingConfig
     *        The settings that determine how Amazon AppFlow handles an error when placing data in the Amazon Redshift
     *        destination. For example, this setting would determine if the flow should fail after one insertion error,
     *        or continue and attempt to insert every record regardless of the initial failure.
     *        <code>ErrorHandlingConfig</code> is a part of the destination connector details.
     */

    public void setErrorHandlingConfig(ErrorHandlingConfig errorHandlingConfig) {
        this.errorHandlingConfig = errorHandlingConfig;
    }

    /**
     * <p>
     * The settings that determine how Amazon AppFlow handles an error when placing data in the Amazon Redshift
     * destination. For example, this setting would determine if the flow should fail after one insertion error, or
     * continue and attempt to insert every record regardless of the initial failure. <code>ErrorHandlingConfig</code>
     * is a part of the destination connector details.
     * </p>
     * 
     * @return The settings that determine how Amazon AppFlow handles an error when placing data in the Amazon Redshift
     *         destination. For example, this setting would determine if the flow should fail after one insertion error,
     *         or continue and attempt to insert every record regardless of the initial failure.
     *         <code>ErrorHandlingConfig</code> is a part of the destination connector details.
     */

    public ErrorHandlingConfig getErrorHandlingConfig() {
        return this.errorHandlingConfig;
    }

    /**
     * <p>
     * The settings that determine how Amazon AppFlow handles an error when placing data in the Amazon Redshift
     * destination. For example, this setting would determine if the flow should fail after one insertion error, or
     * continue and attempt to insert every record regardless of the initial failure. <code>ErrorHandlingConfig</code>
     * is a part of the destination connector details.
     * </p>
     * 
     * @param errorHandlingConfig
     *        The settings that determine how Amazon AppFlow handles an error when placing data in the Amazon Redshift
     *        destination. For example, this setting would determine if the flow should fail after one insertion error,
     *        or continue and attempt to insert every record regardless of the initial failure.
     *        <code>ErrorHandlingConfig</code> is a part of the destination connector details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedshiftDestinationProperties withErrorHandlingConfig(ErrorHandlingConfig errorHandlingConfig) {
        setErrorHandlingConfig(errorHandlingConfig);
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
        if (getObject() != null)
            sb.append("Object: ").append(getObject()).append(",");
        if (getIntermediateBucketName() != null)
            sb.append("IntermediateBucketName: ").append(getIntermediateBucketName()).append(",");
        if (getBucketPrefix() != null)
            sb.append("BucketPrefix: ").append(getBucketPrefix()).append(",");
        if (getErrorHandlingConfig() != null)
            sb.append("ErrorHandlingConfig: ").append(getErrorHandlingConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RedshiftDestinationProperties == false)
            return false;
        RedshiftDestinationProperties other = (RedshiftDestinationProperties) obj;
        if (other.getObject() == null ^ this.getObject() == null)
            return false;
        if (other.getObject() != null && other.getObject().equals(this.getObject()) == false)
            return false;
        if (other.getIntermediateBucketName() == null ^ this.getIntermediateBucketName() == null)
            return false;
        if (other.getIntermediateBucketName() != null && other.getIntermediateBucketName().equals(this.getIntermediateBucketName()) == false)
            return false;
        if (other.getBucketPrefix() == null ^ this.getBucketPrefix() == null)
            return false;
        if (other.getBucketPrefix() != null && other.getBucketPrefix().equals(this.getBucketPrefix()) == false)
            return false;
        if (other.getErrorHandlingConfig() == null ^ this.getErrorHandlingConfig() == null)
            return false;
        if (other.getErrorHandlingConfig() != null && other.getErrorHandlingConfig().equals(this.getErrorHandlingConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getObject() == null) ? 0 : getObject().hashCode());
        hashCode = prime * hashCode + ((getIntermediateBucketName() == null) ? 0 : getIntermediateBucketName().hashCode());
        hashCode = prime * hashCode + ((getBucketPrefix() == null) ? 0 : getBucketPrefix().hashCode());
        hashCode = prime * hashCode + ((getErrorHandlingConfig() == null) ? 0 : getErrorHandlingConfig().hashCode());
        return hashCode;
    }

    @Override
    public RedshiftDestinationProperties clone() {
        try {
            return (RedshiftDestinationProperties) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appflow.model.transform.RedshiftDestinationPropertiesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
