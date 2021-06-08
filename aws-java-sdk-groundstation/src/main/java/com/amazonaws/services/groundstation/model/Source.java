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
package com.amazonaws.services.groundstation.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Dataflow details for the source side.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/Source" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Source implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Additional details for a <code>Config</code>, if type is dataflow endpoint or antenna demod decode.
     * </p>
     */
    private ConfigDetails configDetails;
    /**
     * <p>
     * UUID of a <code>Config</code>.
     * </p>
     */
    private String configId;
    /**
     * <p>
     * Type of a <code>Config</code>.
     * </p>
     */
    private String configType;
    /**
     * <p>
     * Region of a dataflow source.
     * </p>
     */
    private String dataflowSourceRegion;

    /**
     * <p>
     * Additional details for a <code>Config</code>, if type is dataflow endpoint or antenna demod decode.
     * </p>
     * 
     * @param configDetails
     *        Additional details for a <code>Config</code>, if type is dataflow endpoint or antenna demod decode.
     */

    public void setConfigDetails(ConfigDetails configDetails) {
        this.configDetails = configDetails;
    }

    /**
     * <p>
     * Additional details for a <code>Config</code>, if type is dataflow endpoint or antenna demod decode.
     * </p>
     * 
     * @return Additional details for a <code>Config</code>, if type is dataflow endpoint or antenna demod decode.
     */

    public ConfigDetails getConfigDetails() {
        return this.configDetails;
    }

    /**
     * <p>
     * Additional details for a <code>Config</code>, if type is dataflow endpoint or antenna demod decode.
     * </p>
     * 
     * @param configDetails
     *        Additional details for a <code>Config</code>, if type is dataflow endpoint or antenna demod decode.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Source withConfigDetails(ConfigDetails configDetails) {
        setConfigDetails(configDetails);
        return this;
    }

    /**
     * <p>
     * UUID of a <code>Config</code>.
     * </p>
     * 
     * @param configId
     *        UUID of a <code>Config</code>.
     */

    public void setConfigId(String configId) {
        this.configId = configId;
    }

    /**
     * <p>
     * UUID of a <code>Config</code>.
     * </p>
     * 
     * @return UUID of a <code>Config</code>.
     */

    public String getConfigId() {
        return this.configId;
    }

    /**
     * <p>
     * UUID of a <code>Config</code>.
     * </p>
     * 
     * @param configId
     *        UUID of a <code>Config</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Source withConfigId(String configId) {
        setConfigId(configId);
        return this;
    }

    /**
     * <p>
     * Type of a <code>Config</code>.
     * </p>
     * 
     * @param configType
     *        Type of a <code>Config</code>.
     * @see ConfigCapabilityType
     */

    public void setConfigType(String configType) {
        this.configType = configType;
    }

    /**
     * <p>
     * Type of a <code>Config</code>.
     * </p>
     * 
     * @return Type of a <code>Config</code>.
     * @see ConfigCapabilityType
     */

    public String getConfigType() {
        return this.configType;
    }

    /**
     * <p>
     * Type of a <code>Config</code>.
     * </p>
     * 
     * @param configType
     *        Type of a <code>Config</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConfigCapabilityType
     */

    public Source withConfigType(String configType) {
        setConfigType(configType);
        return this;
    }

    /**
     * <p>
     * Type of a <code>Config</code>.
     * </p>
     * 
     * @param configType
     *        Type of a <code>Config</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConfigCapabilityType
     */

    public Source withConfigType(ConfigCapabilityType configType) {
        this.configType = configType.toString();
        return this;
    }

    /**
     * <p>
     * Region of a dataflow source.
     * </p>
     * 
     * @param dataflowSourceRegion
     *        Region of a dataflow source.
     */

    public void setDataflowSourceRegion(String dataflowSourceRegion) {
        this.dataflowSourceRegion = dataflowSourceRegion;
    }

    /**
     * <p>
     * Region of a dataflow source.
     * </p>
     * 
     * @return Region of a dataflow source.
     */

    public String getDataflowSourceRegion() {
        return this.dataflowSourceRegion;
    }

    /**
     * <p>
     * Region of a dataflow source.
     * </p>
     * 
     * @param dataflowSourceRegion
     *        Region of a dataflow source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Source withDataflowSourceRegion(String dataflowSourceRegion) {
        setDataflowSourceRegion(dataflowSourceRegion);
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
        if (getConfigDetails() != null)
            sb.append("ConfigDetails: ").append(getConfigDetails()).append(",");
        if (getConfigId() != null)
            sb.append("ConfigId: ").append(getConfigId()).append(",");
        if (getConfigType() != null)
            sb.append("ConfigType: ").append(getConfigType()).append(",");
        if (getDataflowSourceRegion() != null)
            sb.append("DataflowSourceRegion: ").append(getDataflowSourceRegion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Source == false)
            return false;
        Source other = (Source) obj;
        if (other.getConfigDetails() == null ^ this.getConfigDetails() == null)
            return false;
        if (other.getConfigDetails() != null && other.getConfigDetails().equals(this.getConfigDetails()) == false)
            return false;
        if (other.getConfigId() == null ^ this.getConfigId() == null)
            return false;
        if (other.getConfigId() != null && other.getConfigId().equals(this.getConfigId()) == false)
            return false;
        if (other.getConfigType() == null ^ this.getConfigType() == null)
            return false;
        if (other.getConfigType() != null && other.getConfigType().equals(this.getConfigType()) == false)
            return false;
        if (other.getDataflowSourceRegion() == null ^ this.getDataflowSourceRegion() == null)
            return false;
        if (other.getDataflowSourceRegion() != null && other.getDataflowSourceRegion().equals(this.getDataflowSourceRegion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfigDetails() == null) ? 0 : getConfigDetails().hashCode());
        hashCode = prime * hashCode + ((getConfigId() == null) ? 0 : getConfigId().hashCode());
        hashCode = prime * hashCode + ((getConfigType() == null) ? 0 : getConfigType().hashCode());
        hashCode = prime * hashCode + ((getDataflowSourceRegion() == null) ? 0 : getDataflowSourceRegion().hashCode());
        return hashCode;
    }

    @Override
    public Source clone() {
        try {
            return (Source) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.groundstation.model.transform.SourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
