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
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Blackout Slate
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/BlackoutSlate" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BlackoutSlate implements Serializable, Cloneable, StructuredPojo {

    /** Blackout slate image to be used. Leave empty for solid black. Only bmp and png images are supported. */
    private InputLocation blackoutSlateImage;
    /**
     * Setting to enabled causes the encoder to blackout the video, audio, and captions, and raise the
     * "Network Blackout Image" slate when an SCTE104/35 Network End Segmentation Descriptor is encountered. The
     * blackout will be lifted when the Network Start Segmentation Descriptor is encountered. The Network End and Network
     * Start descriptors must contain a network ID that matches the value entered in "Network ID".
     */
    private String networkEndBlackout;
    /** Path to local file to use as Network End Blackout image. Image will be scaled to fill the entire output raster. */
    private InputLocation networkEndBlackoutImage;
    /** Provides Network ID that matches EIDR ID format (e.g., "10.XXXX/XXXX-XXXX-XXXX-XXXX-XXXX-C"). */
    private String networkId;
    /** When set to enabled, causes video, audio and captions to be blanked when indicated by program metadata. */
    private String state;

    /**
     * Blackout slate image to be used. Leave empty for solid black. Only bmp and png images are supported.
     * 
     * @param blackoutSlateImage
     *        Blackout slate image to be used. Leave empty for solid black. Only bmp and png images are supported.
     */

    public void setBlackoutSlateImage(InputLocation blackoutSlateImage) {
        this.blackoutSlateImage = blackoutSlateImage;
    }

    /**
     * Blackout slate image to be used. Leave empty for solid black. Only bmp and png images are supported.
     * 
     * @return Blackout slate image to be used. Leave empty for solid black. Only bmp and png images are supported.
     */

    public InputLocation getBlackoutSlateImage() {
        return this.blackoutSlateImage;
    }

    /**
     * Blackout slate image to be used. Leave empty for solid black. Only bmp and png images are supported.
     * 
     * @param blackoutSlateImage
     *        Blackout slate image to be used. Leave empty for solid black. Only bmp and png images are supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BlackoutSlate withBlackoutSlateImage(InputLocation blackoutSlateImage) {
        setBlackoutSlateImage(blackoutSlateImage);
        return this;
    }

    /**
     * Setting to enabled causes the encoder to blackout the video, audio, and captions, and raise the
     * "Network Blackout Image" slate when an SCTE104/35 Network End Segmentation Descriptor is encountered. The
     * blackout will be lifted when the Network Start Segmentation Descriptor is encountered. The Network End and Network
     * Start descriptors must contain a network ID that matches the value entered in "Network ID".
     * 
     * @param networkEndBlackout
     *        Setting to enabled causes the encoder to blackout the video, audio, and captions, and raise the
     *        "Network Blackout Image" slate when an SCTE104/35 Network End Segmentation Descriptor is encountered. The
     *        blackout will be lifted when the Network Start Segmentation Descriptor is encountered. The Network End and
     *        Network Start descriptors must contain a network ID that matches the value entered in "Network ID".
     * @see BlackoutSlateNetworkEndBlackout
     */

    public void setNetworkEndBlackout(String networkEndBlackout) {
        this.networkEndBlackout = networkEndBlackout;
    }

    /**
     * Setting to enabled causes the encoder to blackout the video, audio, and captions, and raise the
     * "Network Blackout Image" slate when an SCTE104/35 Network End Segmentation Descriptor is encountered. The
     * blackout will be lifted when the Network Start Segmentation Descriptor is encountered. The Network End and Network
     * Start descriptors must contain a network ID that matches the value entered in "Network ID".
     * 
     * @return Setting to enabled causes the encoder to blackout the video, audio, and captions, and raise the
     *         "Network Blackout Image" slate when an SCTE104/35 Network End Segmentation Descriptor is encountered. The
     *         blackout will be lifted when the Network Start Segmentation Descriptor is encountered. The Network End
     *         and Network Start descriptors must contain a network ID that matches the value entered in "Network ID".
     * @see BlackoutSlateNetworkEndBlackout
     */

    public String getNetworkEndBlackout() {
        return this.networkEndBlackout;
    }

    /**
     * Setting to enabled causes the encoder to blackout the video, audio, and captions, and raise the
     * "Network Blackout Image" slate when an SCTE104/35 Network End Segmentation Descriptor is encountered. The
     * blackout will be lifted when the Network Start Segmentation Descriptor is encountered. The Network End and Network
     * Start descriptors must contain a network ID that matches the value entered in "Network ID".
     * 
     * @param networkEndBlackout
     *        Setting to enabled causes the encoder to blackout the video, audio, and captions, and raise the
     *        "Network Blackout Image" slate when an SCTE104/35 Network End Segmentation Descriptor is encountered. The
     *        blackout will be lifted when the Network Start Segmentation Descriptor is encountered. The Network End and
     *        Network Start descriptors must contain a network ID that matches the value entered in "Network ID".
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BlackoutSlateNetworkEndBlackout
     */

    public BlackoutSlate withNetworkEndBlackout(String networkEndBlackout) {
        setNetworkEndBlackout(networkEndBlackout);
        return this;
    }

    /**
     * Setting to enabled causes the encoder to blackout the video, audio, and captions, and raise the
     * "Network Blackout Image" slate when an SCTE104/35 Network End Segmentation Descriptor is encountered. The
     * blackout will be lifted when the Network Start Segmentation Descriptor is encountered. The Network End and Network
     * Start descriptors must contain a network ID that matches the value entered in "Network ID".
     * 
     * @param networkEndBlackout
     *        Setting to enabled causes the encoder to blackout the video, audio, and captions, and raise the
     *        "Network Blackout Image" slate when an SCTE104/35 Network End Segmentation Descriptor is encountered. The
     *        blackout will be lifted when the Network Start Segmentation Descriptor is encountered. The Network End and
     *        Network Start descriptors must contain a network ID that matches the value entered in "Network ID".
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BlackoutSlateNetworkEndBlackout
     */

    public BlackoutSlate withNetworkEndBlackout(BlackoutSlateNetworkEndBlackout networkEndBlackout) {
        this.networkEndBlackout = networkEndBlackout.toString();
        return this;
    }

    /**
     * Path to local file to use as Network End Blackout image. Image will be scaled to fill the entire output raster.
     * 
     * @param networkEndBlackoutImage
     *        Path to local file to use as Network End Blackout image. Image will be scaled to fill the entire output
     *        raster.
     */

    public void setNetworkEndBlackoutImage(InputLocation networkEndBlackoutImage) {
        this.networkEndBlackoutImage = networkEndBlackoutImage;
    }

    /**
     * Path to local file to use as Network End Blackout image. Image will be scaled to fill the entire output raster.
     * 
     * @return Path to local file to use as Network End Blackout image. Image will be scaled to fill the entire output
     *         raster.
     */

    public InputLocation getNetworkEndBlackoutImage() {
        return this.networkEndBlackoutImage;
    }

    /**
     * Path to local file to use as Network End Blackout image. Image will be scaled to fill the entire output raster.
     * 
     * @param networkEndBlackoutImage
     *        Path to local file to use as Network End Blackout image. Image will be scaled to fill the entire output
     *        raster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BlackoutSlate withNetworkEndBlackoutImage(InputLocation networkEndBlackoutImage) {
        setNetworkEndBlackoutImage(networkEndBlackoutImage);
        return this;
    }

    /**
     * Provides Network ID that matches EIDR ID format (e.g., "10.XXXX/XXXX-XXXX-XXXX-XXXX-XXXX-C").
     * 
     * @param networkId
     *        Provides Network ID that matches EIDR ID format (e.g., "10.XXXX/XXXX-XXXX-XXXX-XXXX-XXXX-C").
     */

    public void setNetworkId(String networkId) {
        this.networkId = networkId;
    }

    /**
     * Provides Network ID that matches EIDR ID format (e.g., "10.XXXX/XXXX-XXXX-XXXX-XXXX-XXXX-C").
     * 
     * @return Provides Network ID that matches EIDR ID format (e.g., "10.XXXX/XXXX-XXXX-XXXX-XXXX-XXXX-C").
     */

    public String getNetworkId() {
        return this.networkId;
    }

    /**
     * Provides Network ID that matches EIDR ID format (e.g., "10.XXXX/XXXX-XXXX-XXXX-XXXX-XXXX-C").
     * 
     * @param networkId
     *        Provides Network ID that matches EIDR ID format (e.g., "10.XXXX/XXXX-XXXX-XXXX-XXXX-XXXX-C").
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BlackoutSlate withNetworkId(String networkId) {
        setNetworkId(networkId);
        return this;
    }

    /**
     * When set to enabled, causes video, audio and captions to be blanked when indicated by program metadata.
     * 
     * @param state
     *        When set to enabled, causes video, audio and captions to be blanked when indicated by program metadata.
     * @see BlackoutSlateState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * When set to enabled, causes video, audio and captions to be blanked when indicated by program metadata.
     * 
     * @return When set to enabled, causes video, audio and captions to be blanked when indicated by program metadata.
     * @see BlackoutSlateState
     */

    public String getState() {
        return this.state;
    }

    /**
     * When set to enabled, causes video, audio and captions to be blanked when indicated by program metadata.
     * 
     * @param state
     *        When set to enabled, causes video, audio and captions to be blanked when indicated by program metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BlackoutSlateState
     */

    public BlackoutSlate withState(String state) {
        setState(state);
        return this;
    }

    /**
     * When set to enabled, causes video, audio and captions to be blanked when indicated by program metadata.
     * 
     * @param state
     *        When set to enabled, causes video, audio and captions to be blanked when indicated by program metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BlackoutSlateState
     */

    public BlackoutSlate withState(BlackoutSlateState state) {
        this.state = state.toString();
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
        if (getBlackoutSlateImage() != null)
            sb.append("BlackoutSlateImage: ").append(getBlackoutSlateImage()).append(",");
        if (getNetworkEndBlackout() != null)
            sb.append("NetworkEndBlackout: ").append(getNetworkEndBlackout()).append(",");
        if (getNetworkEndBlackoutImage() != null)
            sb.append("NetworkEndBlackoutImage: ").append(getNetworkEndBlackoutImage()).append(",");
        if (getNetworkId() != null)
            sb.append("NetworkId: ").append(getNetworkId()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BlackoutSlate == false)
            return false;
        BlackoutSlate other = (BlackoutSlate) obj;
        if (other.getBlackoutSlateImage() == null ^ this.getBlackoutSlateImage() == null)
            return false;
        if (other.getBlackoutSlateImage() != null && other.getBlackoutSlateImage().equals(this.getBlackoutSlateImage()) == false)
            return false;
        if (other.getNetworkEndBlackout() == null ^ this.getNetworkEndBlackout() == null)
            return false;
        if (other.getNetworkEndBlackout() != null && other.getNetworkEndBlackout().equals(this.getNetworkEndBlackout()) == false)
            return false;
        if (other.getNetworkEndBlackoutImage() == null ^ this.getNetworkEndBlackoutImage() == null)
            return false;
        if (other.getNetworkEndBlackoutImage() != null && other.getNetworkEndBlackoutImage().equals(this.getNetworkEndBlackoutImage()) == false)
            return false;
        if (other.getNetworkId() == null ^ this.getNetworkId() == null)
            return false;
        if (other.getNetworkId() != null && other.getNetworkId().equals(this.getNetworkId()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBlackoutSlateImage() == null) ? 0 : getBlackoutSlateImage().hashCode());
        hashCode = prime * hashCode + ((getNetworkEndBlackout() == null) ? 0 : getNetworkEndBlackout().hashCode());
        hashCode = prime * hashCode + ((getNetworkEndBlackoutImage() == null) ? 0 : getNetworkEndBlackoutImage().hashCode());
        hashCode = prime * hashCode + ((getNetworkId() == null) ? 0 : getNetworkId().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        return hashCode;
    }

    @Override
    public BlackoutSlate clone() {
        try {
            return (BlackoutSlate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.BlackoutSlateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
