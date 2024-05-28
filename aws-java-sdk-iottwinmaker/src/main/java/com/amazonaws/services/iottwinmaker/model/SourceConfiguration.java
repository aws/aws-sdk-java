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
 * The source configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/SourceConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SourceConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The source configuration type.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The source configuration S3 configuration.
     * </p>
     */
    private S3SourceConfiguration s3Configuration;
    /**
     * <p>
     * The source configuration IoT SiteWise configuration.
     * </p>
     */
    private IotSiteWiseSourceConfiguration iotSiteWiseConfiguration;
    /**
     * <p>
     * The source configuration IoT TwinMaker configuration.
     * </p>
     */
    private IotTwinMakerSourceConfiguration iotTwinMakerConfiguration;

    /**
     * <p>
     * The source configuration type.
     * </p>
     * 
     * @param type
     *        The source configuration type.
     * @see SourceType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The source configuration type.
     * </p>
     * 
     * @return The source configuration type.
     * @see SourceType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The source configuration type.
     * </p>
     * 
     * @param type
     *        The source configuration type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SourceType
     */

    public SourceConfiguration withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The source configuration type.
     * </p>
     * 
     * @param type
     *        The source configuration type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SourceType
     */

    public SourceConfiguration withType(SourceType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The source configuration S3 configuration.
     * </p>
     * 
     * @param s3Configuration
     *        The source configuration S3 configuration.
     */

    public void setS3Configuration(S3SourceConfiguration s3Configuration) {
        this.s3Configuration = s3Configuration;
    }

    /**
     * <p>
     * The source configuration S3 configuration.
     * </p>
     * 
     * @return The source configuration S3 configuration.
     */

    public S3SourceConfiguration getS3Configuration() {
        return this.s3Configuration;
    }

    /**
     * <p>
     * The source configuration S3 configuration.
     * </p>
     * 
     * @param s3Configuration
     *        The source configuration S3 configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceConfiguration withS3Configuration(S3SourceConfiguration s3Configuration) {
        setS3Configuration(s3Configuration);
        return this;
    }

    /**
     * <p>
     * The source configuration IoT SiteWise configuration.
     * </p>
     * 
     * @param iotSiteWiseConfiguration
     *        The source configuration IoT SiteWise configuration.
     */

    public void setIotSiteWiseConfiguration(IotSiteWiseSourceConfiguration iotSiteWiseConfiguration) {
        this.iotSiteWiseConfiguration = iotSiteWiseConfiguration;
    }

    /**
     * <p>
     * The source configuration IoT SiteWise configuration.
     * </p>
     * 
     * @return The source configuration IoT SiteWise configuration.
     */

    public IotSiteWiseSourceConfiguration getIotSiteWiseConfiguration() {
        return this.iotSiteWiseConfiguration;
    }

    /**
     * <p>
     * The source configuration IoT SiteWise configuration.
     * </p>
     * 
     * @param iotSiteWiseConfiguration
     *        The source configuration IoT SiteWise configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceConfiguration withIotSiteWiseConfiguration(IotSiteWiseSourceConfiguration iotSiteWiseConfiguration) {
        setIotSiteWiseConfiguration(iotSiteWiseConfiguration);
        return this;
    }

    /**
     * <p>
     * The source configuration IoT TwinMaker configuration.
     * </p>
     * 
     * @param iotTwinMakerConfiguration
     *        The source configuration IoT TwinMaker configuration.
     */

    public void setIotTwinMakerConfiguration(IotTwinMakerSourceConfiguration iotTwinMakerConfiguration) {
        this.iotTwinMakerConfiguration = iotTwinMakerConfiguration;
    }

    /**
     * <p>
     * The source configuration IoT TwinMaker configuration.
     * </p>
     * 
     * @return The source configuration IoT TwinMaker configuration.
     */

    public IotTwinMakerSourceConfiguration getIotTwinMakerConfiguration() {
        return this.iotTwinMakerConfiguration;
    }

    /**
     * <p>
     * The source configuration IoT TwinMaker configuration.
     * </p>
     * 
     * @param iotTwinMakerConfiguration
     *        The source configuration IoT TwinMaker configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceConfiguration withIotTwinMakerConfiguration(IotTwinMakerSourceConfiguration iotTwinMakerConfiguration) {
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
        if (getIotSiteWiseConfiguration() != null)
            sb.append("IotSiteWiseConfiguration: ").append(getIotSiteWiseConfiguration()).append(",");
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

        if (obj instanceof SourceConfiguration == false)
            return false;
        SourceConfiguration other = (SourceConfiguration) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getS3Configuration() == null ^ this.getS3Configuration() == null)
            return false;
        if (other.getS3Configuration() != null && other.getS3Configuration().equals(this.getS3Configuration()) == false)
            return false;
        if (other.getIotSiteWiseConfiguration() == null ^ this.getIotSiteWiseConfiguration() == null)
            return false;
        if (other.getIotSiteWiseConfiguration() != null && other.getIotSiteWiseConfiguration().equals(this.getIotSiteWiseConfiguration()) == false)
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
        hashCode = prime * hashCode + ((getIotSiteWiseConfiguration() == null) ? 0 : getIotSiteWiseConfiguration().hashCode());
        hashCode = prime * hashCode + ((getIotTwinMakerConfiguration() == null) ? 0 : getIotTwinMakerConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public SourceConfiguration clone() {
        try {
            return (SourceConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iottwinmaker.model.transform.SourceConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
