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
package com.amazonaws.services.mediaconvert.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Container specific settings.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/ContainerSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ContainerSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * Container for this output. Some containers require a container settings object. If not specified, the default
     * object will be created.
     */
    private String container;
    /** Settings for F4v container */
    private F4vSettings f4vSettings;
    /**
     * MPEG-2 TS container settings. These apply to outputs in a File output group when the output's container
     * (ContainerType) is MPEG-2 Transport Stream (M2TS). In these assets, data is organized by the program map table
     * (PMT). Each transport stream program contains subsets of data, including audio, video, and metadata. Each of these
     * subsets of data has a numerical label called a packet identifier (PID). Each transport stream program corresponds
     * to one MediaConvert output. The PMT lists the types of data in a program along with their PID. Downstream systems
     * and players use the program map table to look up the PID for each type of data it accesses and then uses the PIDs
     * to locate specific data within the asset.
     */
    private M2tsSettings m2tsSettings;
    /** Settings for TS segments in HLS */
    private M3u8Settings m3u8Settings;
    /** Settings for MOV Container. */
    private MovSettings movSettings;
    /** Settings for MP4 Container */
    private Mp4Settings mp4Settings;

    /**
     * Container for this output. Some containers require a container settings object. If not specified, the default
     * object will be created.
     * 
     * @param container
     *        Container for this output. Some containers require a container settings object. If not specified, the
     *        default object will be created.
     * @see ContainerType
     */

    public void setContainer(String container) {
        this.container = container;
    }

    /**
     * Container for this output. Some containers require a container settings object. If not specified, the default
     * object will be created.
     * 
     * @return Container for this output. Some containers require a container settings object. If not specified, the
     *         default object will be created.
     * @see ContainerType
     */

    public String getContainer() {
        return this.container;
    }

    /**
     * Container for this output. Some containers require a container settings object. If not specified, the default
     * object will be created.
     * 
     * @param container
     *        Container for this output. Some containers require a container settings object. If not specified, the
     *        default object will be created.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContainerType
     */

    public ContainerSettings withContainer(String container) {
        setContainer(container);
        return this;
    }

    /**
     * Container for this output. Some containers require a container settings object. If not specified, the default
     * object will be created.
     * 
     * @param container
     *        Container for this output. Some containers require a container settings object. If not specified, the
     *        default object will be created.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContainerType
     */

    public ContainerSettings withContainer(ContainerType container) {
        this.container = container.toString();
        return this;
    }

    /**
     * Settings for F4v container
     * 
     * @param f4vSettings
     *        Settings for F4v container
     */

    public void setF4vSettings(F4vSettings f4vSettings) {
        this.f4vSettings = f4vSettings;
    }

    /**
     * Settings for F4v container
     * 
     * @return Settings for F4v container
     */

    public F4vSettings getF4vSettings() {
        return this.f4vSettings;
    }

    /**
     * Settings for F4v container
     * 
     * @param f4vSettings
     *        Settings for F4v container
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerSettings withF4vSettings(F4vSettings f4vSettings) {
        setF4vSettings(f4vSettings);
        return this;
    }

    /**
     * MPEG-2 TS container settings. These apply to outputs in a File output group when the output's container
     * (ContainerType) is MPEG-2 Transport Stream (M2TS). In these assets, data is organized by the program map table
     * (PMT). Each transport stream program contains subsets of data, including audio, video, and metadata. Each of these
     * subsets of data has a numerical label called a packet identifier (PID). Each transport stream program corresponds
     * to one MediaConvert output. The PMT lists the types of data in a program along with their PID. Downstream systems
     * and players use the program map table to look up the PID for each type of data it accesses and then uses the PIDs
     * to locate specific data within the asset.
     * 
     * @param m2tsSettings
     *        MPEG-2 TS container settings. These apply to outputs in a File output group when the output's container
     *        (ContainerType) is MPEG-2 Transport Stream (M2TS). In these assets, data is organized by the program map
     *        table (PMT). Each transport stream program contains subsets of data, including audio, video, and metadata.
     *        Each of these subsets of data has a numerical label called a packet identifier (PID). Each transport
     *        stream program corresponds to one MediaConvert output. The PMT lists the types of data in a program along
     *        with their PID. Downstream systems and players use the program map table to look up the PID for each type
     *        of data it accesses and then uses the PIDs to locate specific data within the asset.
     */

    public void setM2tsSettings(M2tsSettings m2tsSettings) {
        this.m2tsSettings = m2tsSettings;
    }

    /**
     * MPEG-2 TS container settings. These apply to outputs in a File output group when the output's container
     * (ContainerType) is MPEG-2 Transport Stream (M2TS). In these assets, data is organized by the program map table
     * (PMT). Each transport stream program contains subsets of data, including audio, video, and metadata. Each of these
     * subsets of data has a numerical label called a packet identifier (PID). Each transport stream program corresponds
     * to one MediaConvert output. The PMT lists the types of data in a program along with their PID. Downstream systems
     * and players use the program map table to look up the PID for each type of data it accesses and then uses the PIDs
     * to locate specific data within the asset.
     * 
     * @return MPEG-2 TS container settings. These apply to outputs in a File output group when the output's container
     *         (ContainerType) is MPEG-2 Transport Stream (M2TS). In these assets, data is organized by the program map
     *         table (PMT). Each transport stream program contains subsets of data, including audio, video, and
     *         metadata. Each of these subsets of data has a numerical label called a packet identifier (PID). Each
     *         transport stream program corresponds to one MediaConvert output. The PMT lists the types of data in a
     *         program along with their PID. Downstream systems and players use the program map table to look up the PID
     *         for each type of data it accesses and then uses the PIDs to locate specific data within the asset.
     */

    public M2tsSettings getM2tsSettings() {
        return this.m2tsSettings;
    }

    /**
     * MPEG-2 TS container settings. These apply to outputs in a File output group when the output's container
     * (ContainerType) is MPEG-2 Transport Stream (M2TS). In these assets, data is organized by the program map table
     * (PMT). Each transport stream program contains subsets of data, including audio, video, and metadata. Each of these
     * subsets of data has a numerical label called a packet identifier (PID). Each transport stream program corresponds
     * to one MediaConvert output. The PMT lists the types of data in a program along with their PID. Downstream systems
     * and players use the program map table to look up the PID for each type of data it accesses and then uses the PIDs
     * to locate specific data within the asset.
     * 
     * @param m2tsSettings
     *        MPEG-2 TS container settings. These apply to outputs in a File output group when the output's container
     *        (ContainerType) is MPEG-2 Transport Stream (M2TS). In these assets, data is organized by the program map
     *        table (PMT). Each transport stream program contains subsets of data, including audio, video, and metadata.
     *        Each of these subsets of data has a numerical label called a packet identifier (PID). Each transport
     *        stream program corresponds to one MediaConvert output. The PMT lists the types of data in a program along
     *        with their PID. Downstream systems and players use the program map table to look up the PID for each type
     *        of data it accesses and then uses the PIDs to locate specific data within the asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerSettings withM2tsSettings(M2tsSettings m2tsSettings) {
        setM2tsSettings(m2tsSettings);
        return this;
    }

    /**
     * Settings for TS segments in HLS
     * 
     * @param m3u8Settings
     *        Settings for TS segments in HLS
     */

    public void setM3u8Settings(M3u8Settings m3u8Settings) {
        this.m3u8Settings = m3u8Settings;
    }

    /**
     * Settings for TS segments in HLS
     * 
     * @return Settings for TS segments in HLS
     */

    public M3u8Settings getM3u8Settings() {
        return this.m3u8Settings;
    }

    /**
     * Settings for TS segments in HLS
     * 
     * @param m3u8Settings
     *        Settings for TS segments in HLS
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerSettings withM3u8Settings(M3u8Settings m3u8Settings) {
        setM3u8Settings(m3u8Settings);
        return this;
    }

    /**
     * Settings for MOV Container.
     * 
     * @param movSettings
     *        Settings for MOV Container.
     */

    public void setMovSettings(MovSettings movSettings) {
        this.movSettings = movSettings;
    }

    /**
     * Settings for MOV Container.
     * 
     * @return Settings for MOV Container.
     */

    public MovSettings getMovSettings() {
        return this.movSettings;
    }

    /**
     * Settings for MOV Container.
     * 
     * @param movSettings
     *        Settings for MOV Container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerSettings withMovSettings(MovSettings movSettings) {
        setMovSettings(movSettings);
        return this;
    }

    /**
     * Settings for MP4 Container
     * 
     * @param mp4Settings
     *        Settings for MP4 Container
     */

    public void setMp4Settings(Mp4Settings mp4Settings) {
        this.mp4Settings = mp4Settings;
    }

    /**
     * Settings for MP4 Container
     * 
     * @return Settings for MP4 Container
     */

    public Mp4Settings getMp4Settings() {
        return this.mp4Settings;
    }

    /**
     * Settings for MP4 Container
     * 
     * @param mp4Settings
     *        Settings for MP4 Container
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerSettings withMp4Settings(Mp4Settings mp4Settings) {
        setMp4Settings(mp4Settings);
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
        if (getContainer() != null)
            sb.append("Container: ").append(getContainer()).append(",");
        if (getF4vSettings() != null)
            sb.append("F4vSettings: ").append(getF4vSettings()).append(",");
        if (getM2tsSettings() != null)
            sb.append("M2tsSettings: ").append(getM2tsSettings()).append(",");
        if (getM3u8Settings() != null)
            sb.append("M3u8Settings: ").append(getM3u8Settings()).append(",");
        if (getMovSettings() != null)
            sb.append("MovSettings: ").append(getMovSettings()).append(",");
        if (getMp4Settings() != null)
            sb.append("Mp4Settings: ").append(getMp4Settings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ContainerSettings == false)
            return false;
        ContainerSettings other = (ContainerSettings) obj;
        if (other.getContainer() == null ^ this.getContainer() == null)
            return false;
        if (other.getContainer() != null && other.getContainer().equals(this.getContainer()) == false)
            return false;
        if (other.getF4vSettings() == null ^ this.getF4vSettings() == null)
            return false;
        if (other.getF4vSettings() != null && other.getF4vSettings().equals(this.getF4vSettings()) == false)
            return false;
        if (other.getM2tsSettings() == null ^ this.getM2tsSettings() == null)
            return false;
        if (other.getM2tsSettings() != null && other.getM2tsSettings().equals(this.getM2tsSettings()) == false)
            return false;
        if (other.getM3u8Settings() == null ^ this.getM3u8Settings() == null)
            return false;
        if (other.getM3u8Settings() != null && other.getM3u8Settings().equals(this.getM3u8Settings()) == false)
            return false;
        if (other.getMovSettings() == null ^ this.getMovSettings() == null)
            return false;
        if (other.getMovSettings() != null && other.getMovSettings().equals(this.getMovSettings()) == false)
            return false;
        if (other.getMp4Settings() == null ^ this.getMp4Settings() == null)
            return false;
        if (other.getMp4Settings() != null && other.getMp4Settings().equals(this.getMp4Settings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContainer() == null) ? 0 : getContainer().hashCode());
        hashCode = prime * hashCode + ((getF4vSettings() == null) ? 0 : getF4vSettings().hashCode());
        hashCode = prime * hashCode + ((getM2tsSettings() == null) ? 0 : getM2tsSettings().hashCode());
        hashCode = prime * hashCode + ((getM3u8Settings() == null) ? 0 : getM3u8Settings().hashCode());
        hashCode = prime * hashCode + ((getMovSettings() == null) ? 0 : getMovSettings().hashCode());
        hashCode = prime * hashCode + ((getMp4Settings() == null) ? 0 : getMp4Settings().hashCode());
        return hashCode;
    }

    @Override
    public ContainerSettings clone() {
        try {
            return (ContainerSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.ContainerSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
