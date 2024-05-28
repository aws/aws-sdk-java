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
package com.amazonaws.services.iottwinmaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The [link to action] metadata transfer job destination configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/DestinationConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DestinationConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The destination type.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The metadata transfer job S3 configuration. [need to add S3 entity]
     * </p>
     */
    private S3DestinationConfiguration s3Configuration;
    /**
     * <p>
     * The metadata transfer job Amazon Web Services IoT TwinMaker configuration.
     * </p>
     */
    private IotTwinMakerDestinationConfiguration iotTwinMakerConfiguration;

    /**
     * <p>
     * The destination type.
     * </p>
     * 
     * @param type
     *        The destination type.
     * @see DestinationType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The destination type.
     * </p>
     * 
     * @return The destination type.
     * @see DestinationType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The destination type.
     * </p>
     * 
     * @param type
     *        The destination type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DestinationType
     */

    public DestinationConfiguration withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The destination type.
     * </p>
     * 
     * @param type
     *        The destination type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DestinationType
     */

    public DestinationConfiguration withType(DestinationType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The metadata transfer job S3 configuration. [need to add S3 entity]
     * </p>
     * 
     * @param s3Configuration
     *        The metadata transfer job S3 configuration. [need to add S3 entity]
     */

    public void setS3Configuration(S3DestinationConfiguration s3Configuration) {
        this.s3Configuration = s3Configuration;
    }

    /**
     * <p>
     * The metadata transfer job S3 configuration. [need to add S3 entity]
     * </p>
     * 
     * @return The metadata transfer job S3 configuration. [need to add S3 entity]
     */

    public S3DestinationConfiguration getS3Configuration() {
        return this.s3Configuration;
    }

    /**
     * <p>
     * The metadata transfer job S3 configuration. [need to add S3 entity]
     * </p>
     * 
     * @param s3Configuration
     *        The metadata transfer job S3 configuration. [need to add S3 entity]
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DestinationConfiguration withS3Configuration(S3DestinationConfiguration s3Configuration) {
        setS3Configuration(s3Configuration);
        return this;
    }

    /**
     * <p>
     * The metadata transfer job Amazon Web Services IoT TwinMaker configuration.
     * </p>
     * 
     * @param iotTwinMakerConfiguration
     *        The metadata transfer job Amazon Web Services IoT TwinMaker configuration.
     */

    public void setIotTwinMakerConfiguration(IotTwinMakerDestinationConfiguration iotTwinMakerConfiguration) {
        this.iotTwinMakerConfiguration = iotTwinMakerConfiguration;
    }

    /**
     * <p>
     * The metadata transfer job Amazon Web Services IoT TwinMaker configuration.
     * </p>
     * 
     * @return The metadata transfer job Amazon Web Services IoT TwinMaker configuration.
     */

    public IotTwinMakerDestinationConfiguration getIotTwinMakerConfiguration() {
        return this.iotTwinMakerConfiguration;
    }

    /**
     * <p>
     * The metadata transfer job Amazon Web Services IoT TwinMaker configuration.
     * </p>
     * 
     * @param iotTwinMakerConfiguration
     *        The metadata transfer job Amazon Web Services IoT TwinMaker configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DestinationConfiguration withIotTwinMakerConfiguration(IotTwinMakerDestinationConfiguration iotTwinMakerConfiguration) {
        setIotTwinMakerConfiguration(iotTwinMakerConfiguration);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getS3Configuration() != null)
            sb.append("S3Configuration: ").append(getS3Configuration()).append(",");
        if (getIotTwinMakerConfiguration() != null)
            sb.append("IotTwinMakerConfiguration: ").append(getIotTwinMakerConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DestinationConfiguration == false)
            return false;
        DestinationConfiguration other = (DestinationConfiguration) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getS3Configuration() == null ^ this.getS3Configuration() == null)
            return false;
        if (other.getS3Configuration() != null && other.getS3Configuration().equals(this.getS3Configuration()) == false)
            return false;
        if (other.getIotTwinMakerConfiguration() == null ^ this.getIotTwinMakerConfiguration() == null)
            return false;
        if (other.getIotTwinMakerConfiguration() != null && other.getIotTwinMakerConfiguration().equals(this.getIotTwinMakerConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getS3Configuration() == null) ? 0 : getS3Configuration().hashCode());
        hashCode = prime * hashCode + ((getIotTwinMakerConfiguration() == null) ? 0 : getIotTwinMakerConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public DestinationConfiguration clone() {
        try {
            return (DestinationConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iottwinmaker.model.transform.DestinationConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
