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
 * Required when you set (Type) under (OutputGroups)>(OutputGroupSettings) to MS_SMOOTH_GROUP_SETTINGS.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/MsSmoothGroupSettings" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MsSmoothGroupSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * COMBINE_DUPLICATE_STREAMS combines identical audio encoding settings across a Microsoft Smooth output group into
     * a single audio stream.
     */
    private String audioDeduplication;
    /**
     * Use Destination (Destination) to specify the S3 output location and the output filename base. Destination accepts
     * format identifiers. If you do not specify the base filename in the URI, the service will use the filename of the
     * input file. If your job has multiple inputs, the service uses the filename of the first input file.
     */
    private String destination;
    /** Settings associated with the destination. Will vary based on the type of destination */
    private DestinationSettings destinationSettings;
    /** If you are using DRM, set DRM System (MsSmoothEncryptionSettings) to specify the value SpekeKeyProvider. */
    private MsSmoothEncryptionSettings encryption;
    /**
     * Use Fragment length (FragmentLength) to specify the mp4 fragment sizes in seconds. Fragment length must be
     * compatible with GOP size and frame rate.
     */
    private Integer fragmentLength;
    /**
     * Use Manifest encoding (MsSmoothManifestEncoding) to specify the encoding format for the server and client
     * manifest. Valid options are utf8 and utf16.
     */
    private String manifestEncoding;

    /**
     * COMBINE_DUPLICATE_STREAMS combines identical audio encoding settings across a Microsoft Smooth output group into
     * a single audio stream.
     * 
     * @param audioDeduplication
     *        COMBINE_DUPLICATE_STREAMS combines identical audio encoding settings across a Microsoft Smooth output
     *        group into a single audio stream.
     * @see MsSmoothAudioDeduplication
     */

    public void setAudioDeduplication(String audioDeduplication) {
        this.audioDeduplication = audioDeduplication;
    }

    /**
     * COMBINE_DUPLICATE_STREAMS combines identical audio encoding settings across a Microsoft Smooth output group into
     * a single audio stream.
     * 
     * @return COMBINE_DUPLICATE_STREAMS combines identical audio encoding settings across a Microsoft Smooth output
     *         group into a single audio stream.
     * @see MsSmoothAudioDeduplication
     */

    public String getAudioDeduplication() {
        return this.audioDeduplication;
    }

    /**
     * COMBINE_DUPLICATE_STREAMS combines identical audio encoding settings across a Microsoft Smooth output group into
     * a single audio stream.
     * 
     * @param audioDeduplication
     *        COMBINE_DUPLICATE_STREAMS combines identical audio encoding settings across a Microsoft Smooth output
     *        group into a single audio stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MsSmoothAudioDeduplication
     */

    public MsSmoothGroupSettings withAudioDeduplication(String audioDeduplication) {
        setAudioDeduplication(audioDeduplication);
        return this;
    }

    /**
     * COMBINE_DUPLICATE_STREAMS combines identical audio encoding settings across a Microsoft Smooth output group into
     * a single audio stream.
     * 
     * @param audioDeduplication
     *        COMBINE_DUPLICATE_STREAMS combines identical audio encoding settings across a Microsoft Smooth output
     *        group into a single audio stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MsSmoothAudioDeduplication
     */

    public MsSmoothGroupSettings withAudioDeduplication(MsSmoothAudioDeduplication audioDeduplication) {
        this.audioDeduplication = audioDeduplication.toString();
        return this;
    }

    /**
     * Use Destination (Destination) to specify the S3 output location and the output filename base. Destination accepts
     * format identifiers. If you do not specify the base filename in the URI, the service will use the filename of the
     * input file. If your job has multiple inputs, the service uses the filename of the first input file.
     * 
     * @param destination
     *        Use Destination (Destination) to specify the S3 output location and the output filename base. Destination
     *        accepts format identifiers. If you do not specify the base filename in the URI, the service will use the
     *        filename of the input file. If your job has multiple inputs, the service uses the filename of the first
     *        input file.
     */

    public void setDestination(String destination) {
        this.destination = destination;
    }

    /**
     * Use Destination (Destination) to specify the S3 output location and the output filename base. Destination accepts
     * format identifiers. If you do not specify the base filename in the URI, the service will use the filename of the
     * input file. If your job has multiple inputs, the service uses the filename of the first input file.
     * 
     * @return Use Destination (Destination) to specify the S3 output location and the output filename base. Destination
     *         accepts format identifiers. If you do not specify the base filename in the URI, the service will use the
     *         filename of the input file. If your job has multiple inputs, the service uses the filename of the first
     *         input file.
     */

    public String getDestination() {
        return this.destination;
    }

    /**
     * Use Destination (Destination) to specify the S3 output location and the output filename base. Destination accepts
     * format identifiers. If you do not specify the base filename in the URI, the service will use the filename of the
     * input file. If your job has multiple inputs, the service uses the filename of the first input file.
     * 
     * @param destination
     *        Use Destination (Destination) to specify the S3 output location and the output filename base. Destination
     *        accepts format identifiers. If you do not specify the base filename in the URI, the service will use the
     *        filename of the input file. If your job has multiple inputs, the service uses the filename of the first
     *        input file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MsSmoothGroupSettings withDestination(String destination) {
        setDestination(destination);
        return this;
    }

    /**
     * Settings associated with the destination. Will vary based on the type of destination
     * 
     * @param destinationSettings
     *        Settings associated with the destination. Will vary based on the type of destination
     */

    public void setDestinationSettings(DestinationSettings destinationSettings) {
        this.destinationSettings = destinationSettings;
    }

    /**
     * Settings associated with the destination. Will vary based on the type of destination
     * 
     * @return Settings associated with the destination. Will vary based on the type of destination
     */

    public DestinationSettings getDestinationSettings() {
        return this.destinationSettings;
    }

    /**
     * Settings associated with the destination. Will vary based on the type of destination
     * 
     * @param destinationSettings
     *        Settings associated with the destination. Will vary based on the type of destination
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MsSmoothGroupSettings withDestinationSettings(DestinationSettings destinationSettings) {
        setDestinationSettings(destinationSettings);
        return this;
    }

    /**
     * If you are using DRM, set DRM System (MsSmoothEncryptionSettings) to specify the value SpekeKeyProvider.
     * 
     * @param encryption
     *        If you are using DRM, set DRM System (MsSmoothEncryptionSettings) to specify the value SpekeKeyProvider.
     */

    public void setEncryption(MsSmoothEncryptionSettings encryption) {
        this.encryption = encryption;
    }

    /**
     * If you are using DRM, set DRM System (MsSmoothEncryptionSettings) to specify the value SpekeKeyProvider.
     * 
     * @return If you are using DRM, set DRM System (MsSmoothEncryptionSettings) to specify the value SpekeKeyProvider.
     */

    public MsSmoothEncryptionSettings getEncryption() {
        return this.encryption;
    }

    /**
     * If you are using DRM, set DRM System (MsSmoothEncryptionSettings) to specify the value SpekeKeyProvider.
     * 
     * @param encryption
     *        If you are using DRM, set DRM System (MsSmoothEncryptionSettings) to specify the value SpekeKeyProvider.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MsSmoothGroupSettings withEncryption(MsSmoothEncryptionSettings encryption) {
        setEncryption(encryption);
        return this;
    }

    /**
     * Use Fragment length (FragmentLength) to specify the mp4 fragment sizes in seconds. Fragment length must be
     * compatible with GOP size and frame rate.
     * 
     * @param fragmentLength
     *        Use Fragment length (FragmentLength) to specify the mp4 fragment sizes in seconds. Fragment length must be
     *        compatible with GOP size and frame rate.
     */

    public void setFragmentLength(Integer fragmentLength) {
        this.fragmentLength = fragmentLength;
    }

    /**
     * Use Fragment length (FragmentLength) to specify the mp4 fragment sizes in seconds. Fragment length must be
     * compatible with GOP size and frame rate.
     * 
     * @return Use Fragment length (FragmentLength) to specify the mp4 fragment sizes in seconds. Fragment length must
     *         be compatible with GOP size and frame rate.
     */

    public Integer getFragmentLength() {
        return this.fragmentLength;
    }

    /**
     * Use Fragment length (FragmentLength) to specify the mp4 fragment sizes in seconds. Fragment length must be
     * compatible with GOP size and frame rate.
     * 
     * @param fragmentLength
     *        Use Fragment length (FragmentLength) to specify the mp4 fragment sizes in seconds. Fragment length must be
     *        compatible with GOP size and frame rate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MsSmoothGroupSettings withFragmentLength(Integer fragmentLength) {
        setFragmentLength(fragmentLength);
        return this;
    }

    /**
     * Use Manifest encoding (MsSmoothManifestEncoding) to specify the encoding format for the server and client
     * manifest. Valid options are utf8 and utf16.
     * 
     * @param manifestEncoding
     *        Use Manifest encoding (MsSmoothManifestEncoding) to specify the encoding format for the server and client
     *        manifest. Valid options are utf8 and utf16.
     * @see MsSmoothManifestEncoding
     */

    public void setManifestEncoding(String manifestEncoding) {
        this.manifestEncoding = manifestEncoding;
    }

    /**
     * Use Manifest encoding (MsSmoothManifestEncoding) to specify the encoding format for the server and client
     * manifest. Valid options are utf8 and utf16.
     * 
     * @return Use Manifest encoding (MsSmoothManifestEncoding) to specify the encoding format for the server and client
     *         manifest. Valid options are utf8 and utf16.
     * @see MsSmoothManifestEncoding
     */

    public String getManifestEncoding() {
        return this.manifestEncoding;
    }

    /**
     * Use Manifest encoding (MsSmoothManifestEncoding) to specify the encoding format for the server and client
     * manifest. Valid options are utf8 and utf16.
     * 
     * @param manifestEncoding
     *        Use Manifest encoding (MsSmoothManifestEncoding) to specify the encoding format for the server and client
     *        manifest. Valid options are utf8 and utf16.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MsSmoothManifestEncoding
     */

    public MsSmoothGroupSettings withManifestEncoding(String manifestEncoding) {
        setManifestEncoding(manifestEncoding);
        return this;
    }

    /**
     * Use Manifest encoding (MsSmoothManifestEncoding) to specify the encoding format for the server and client
     * manifest. Valid options are utf8 and utf16.
     * 
     * @param manifestEncoding
     *        Use Manifest encoding (MsSmoothManifestEncoding) to specify the encoding format for the server and client
     *        manifest. Valid options are utf8 and utf16.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MsSmoothManifestEncoding
     */

    public MsSmoothGroupSettings withManifestEncoding(MsSmoothManifestEncoding manifestEncoding) {
        this.manifestEncoding = manifestEncoding.toString();
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
        if (getAudioDeduplication() != null)
            sb.append("AudioDeduplication: ").append(getAudioDeduplication()).append(",");
        if (getDestination() != null)
            sb.append("Destination: ").append(getDestination()).append(",");
        if (getDestinationSettings() != null)
            sb.append("DestinationSettings: ").append(getDestinationSettings()).append(",");
        if (getEncryption() != null)
            sb.append("Encryption: ").append(getEncryption()).append(",");
        if (getFragmentLength() != null)
            sb.append("FragmentLength: ").append(getFragmentLength()).append(",");
        if (getManifestEncoding() != null)
            sb.append("ManifestEncoding: ").append(getManifestEncoding());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MsSmoothGroupSettings == false)
            return false;
        MsSmoothGroupSettings other = (MsSmoothGroupSettings) obj;
        if (other.getAudioDeduplication() == null ^ this.getAudioDeduplication() == null)
            return false;
        if (other.getAudioDeduplication() != null && other.getAudioDeduplication().equals(this.getAudioDeduplication()) == false)
            return false;
        if (other.getDestination() == null ^ this.getDestination() == null)
            return false;
        if (other.getDestination() != null && other.getDestination().equals(this.getDestination()) == false)
            return false;
        if (other.getDestinationSettings() == null ^ this.getDestinationSettings() == null)
            return false;
        if (other.getDestinationSettings() != null && other.getDestinationSettings().equals(this.getDestinationSettings()) == false)
            return false;
        if (other.getEncryption() == null ^ this.getEncryption() == null)
            return false;
        if (other.getEncryption() != null && other.getEncryption().equals(this.getEncryption()) == false)
            return false;
        if (other.getFragmentLength() == null ^ this.getFragmentLength() == null)
            return false;
        if (other.getFragmentLength() != null && other.getFragmentLength().equals(this.getFragmentLength()) == false)
            return false;
        if (other.getManifestEncoding() == null ^ this.getManifestEncoding() == null)
            return false;
        if (other.getManifestEncoding() != null && other.getManifestEncoding().equals(this.getManifestEncoding()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAudioDeduplication() == null) ? 0 : getAudioDeduplication().hashCode());
        hashCode = prime * hashCode + ((getDestination() == null) ? 0 : getDestination().hashCode());
        hashCode = prime * hashCode + ((getDestinationSettings() == null) ? 0 : getDestinationSettings().hashCode());
        hashCode = prime * hashCode + ((getEncryption() == null) ? 0 : getEncryption().hashCode());
        hashCode = prime * hashCode + ((getFragmentLength() == null) ? 0 : getFragmentLength().hashCode());
        hashCode = prime * hashCode + ((getManifestEncoding() == null) ? 0 : getManifestEncoding().hashCode());
        return hashCode;
    }

    @Override
    public MsSmoothGroupSettings clone() {
        try {
            return (MsSmoothGroupSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.MsSmoothGroupSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
