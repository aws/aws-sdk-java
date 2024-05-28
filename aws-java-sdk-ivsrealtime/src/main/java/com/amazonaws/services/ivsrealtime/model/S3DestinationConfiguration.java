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
package com.amazonaws.services.ivsrealtime.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A complex type that describes an S3 location where recorded videos will be stored.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/S3DestinationConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3DestinationConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * ARNs of the <a>EncoderConfiguration</a> resource. The encoder configuration and stage resources must be in the
     * same AWS account and region.
     * </p>
     */
    private java.util.List<String> encoderConfigurationArns;
    /**
     * <p>
     * Array of maps, each of the form <code>string:string (key:value)</code>. This is an optional customer
     * specification, currently used only to specify the recording format for storing a recording in Amazon S3.
     * </p>
     */
    private RecordingConfiguration recordingConfiguration;
    /**
     * <p>
     * ARN of the <a>StorageConfiguration</a> where recorded videos will be stored.
     * </p>
     */
    private String storageConfigurationArn;

    /**
     * <p>
     * ARNs of the <a>EncoderConfiguration</a> resource. The encoder configuration and stage resources must be in the
     * same AWS account and region.
     * </p>
     * 
     * @return ARNs of the <a>EncoderConfiguration</a> resource. The encoder configuration and stage resources must be
     *         in the same AWS account and region.
     */

    public java.util.List<String> getEncoderConfigurationArns() {
        return encoderConfigurationArns;
    }

    /**
     * <p>
     * ARNs of the <a>EncoderConfiguration</a> resource. The encoder configuration and stage resources must be in the
     * same AWS account and region.
     * </p>
     * 
     * @param encoderConfigurationArns
     *        ARNs of the <a>EncoderConfiguration</a> resource. The encoder configuration and stage resources must be in
     *        the same AWS account and region.
     */

    public void setEncoderConfigurationArns(java.util.Collection<String> encoderConfigurationArns) {
        if (encoderConfigurationArns == null) {
            this.encoderConfigurationArns = null;
            return;
        }

        this.encoderConfigurationArns = new java.util.ArrayList<String>(encoderConfigurationArns);
    }

    /**
     * <p>
     * ARNs of the <a>EncoderConfiguration</a> resource. The encoder configuration and stage resources must be in the
     * same AWS account and region.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEncoderConfigurationArns(java.util.Collection)} or
     * {@link #withEncoderConfigurationArns(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param encoderConfigurationArns
     *        ARNs of the <a>EncoderConfiguration</a> resource. The encoder configuration and stage resources must be in
     *        the same AWS account and region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3DestinationConfiguration withEncoderConfigurationArns(String... encoderConfigurationArns) {
        if (this.encoderConfigurationArns == null) {
            setEncoderConfigurationArns(new java.util.ArrayList<String>(encoderConfigurationArns.length));
        }
        for (String ele : encoderConfigurationArns) {
            this.encoderConfigurationArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * ARNs of the <a>EncoderConfiguration</a> resource. The encoder configuration and stage resources must be in the
     * same AWS account and region.
     * </p>
     * 
     * @param encoderConfigurationArns
     *        ARNs of the <a>EncoderConfiguration</a> resource. The encoder configuration and stage resources must be in
     *        the same AWS account and region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3DestinationConfiguration withEncoderConfigurationArns(java.util.Collection<String> encoderConfigurationArns) {
        setEncoderConfigurationArns(encoderConfigurationArns);
        return this;
    }

    /**
     * <p>
     * Array of maps, each of the form <code>string:string (key:value)</code>. This is an optional customer
     * specification, currently used only to specify the recording format for storing a recording in Amazon S3.
     * </p>
     * 
     * @param recordingConfiguration
     *        Array of maps, each of the form <code>string:string (key:value)</code>. This is an optional customer
     *        specification, currently used only to specify the recording format for storing a recording in Amazon S3.
     */

    public void setRecordingConfiguration(RecordingConfiguration recordingConfiguration) {
        this.recordingConfiguration = recordingConfiguration;
    }

    /**
     * <p>
     * Array of maps, each of the form <code>string:string (key:value)</code>. This is an optional customer
     * specification, currently used only to specify the recording format for storing a recording in Amazon S3.
     * </p>
     * 
     * @return Array of maps, each of the form <code>string:string (key:value)</code>. This is an optional customer
     *         specification, currently used only to specify the recording format for storing a recording in Amazon S3.
     */

    public RecordingConfiguration getRecordingConfiguration() {
        return this.recordingConfiguration;
    }

    /**
     * <p>
     * Array of maps, each of the form <code>string:string (key:value)</code>. This is an optional customer
     * specification, currently used only to specify the recording format for storing a recording in Amazon S3.
     * </p>
     * 
     * @param recordingConfiguration
     *        Array of maps, each of the form <code>string:string (key:value)</code>. This is an optional customer
     *        specification, currently used only to specify the recording format for storing a recording in Amazon S3.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3DestinationConfiguration withRecordingConfiguration(RecordingConfiguration recordingConfiguration) {
        setRecordingConfiguration(recordingConfiguration);
        return this;
    }

    /**
     * <p>
     * ARN of the <a>StorageConfiguration</a> where recorded videos will be stored.
     * </p>
     * 
     * @param storageConfigurationArn
     *        ARN of the <a>StorageConfiguration</a> where recorded videos will be stored.
     */

    public void setStorageConfigurationArn(String storageConfigurationArn) {
        this.storageConfigurationArn = storageConfigurationArn;
    }

    /**
     * <p>
     * ARN of the <a>StorageConfiguration</a> where recorded videos will be stored.
     * </p>
     * 
     * @return ARN of the <a>StorageConfiguration</a> where recorded videos will be stored.
     */

    public String getStorageConfigurationArn() {
        return this.storageConfigurationArn;
    }

    /**
     * <p>
     * ARN of the <a>StorageConfiguration</a> where recorded videos will be stored.
     * </p>
     * 
     * @param storageConfigurationArn
     *        ARN of the <a>StorageConfiguration</a> where recorded videos will be stored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3DestinationConfiguration withStorageConfigurationArn(String storageConfigurationArn) {
        setStorageConfigurationArn(storageConfigurationArn);
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
        if (getEncoderConfigurationArns() != null)
            sb.append("EncoderConfigurationArns: ").append(getEncoderConfigurationArns()).append(",");
        if (getRecordingConfiguration() != null)
            sb.append("RecordingConfiguration: ").append(getRecordingConfiguration()).append(",");
        if (getStorageConfigurationArn() != null)
            sb.append("StorageConfigurationArn: ").append(getStorageConfigurationArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3DestinationConfiguration == false)
            return false;
        S3DestinationConfiguration other = (S3DestinationConfiguration) obj;
        if (other.getEncoderConfigurationArns() == null ^ this.getEncoderConfigurationArns() == null)
            return false;
        if (other.getEncoderConfigurationArns() != null && other.getEncoderConfigurationArns().equals(this.getEncoderConfigurationArns()) == false)
            return false;
        if (other.getRecordingConfiguration() == null ^ this.getRecordingConfiguration() == null)
            return false;
        if (other.getRecordingConfiguration() != null && other.getRecordingConfiguration().equals(this.getRecordingConfiguration()) == false)
            return false;
        if (other.getStorageConfigurationArn() == null ^ this.getStorageConfigurationArn() == null)
            return false;
        if (other.getStorageConfigurationArn() != null && other.getStorageConfigurationArn().equals(this.getStorageConfigurationArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEncoderConfigurationArns() == null) ? 0 : getEncoderConfigurationArns().hashCode());
        hashCode = prime * hashCode + ((getRecordingConfiguration() == null) ? 0 : getRecordingConfiguration().hashCode());
        hashCode = prime * hashCode + ((getStorageConfigurationArn() == null) ? 0 : getStorageConfigurationArn().hashCode());
        return hashCode;
    }

    @Override
    public S3DestinationConfiguration clone() {
        try {
            return (S3DestinationConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ivsrealtime.model.transform.S3DestinationConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
