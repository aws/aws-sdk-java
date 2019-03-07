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
 * Placeholder documentation for OutputDestination
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/OutputDestination" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OutputDestination implements Serializable, Cloneable, StructuredPojo {

    /** User-specified id. This is used in an output group or an output. */
    private String id;
    /** Destination settings for a MediaPackage output; one destination for both encoders. */
    private java.util.List<MediaPackageOutputDestinationSettings> mediaPackageSettings;
    /** Destination settings for a standard output; one destination for each redundant encoder. */
    private java.util.List<OutputDestinationSettings> settings;

    /**
     * User-specified id. This is used in an output group or an output.
     * 
     * @param id
     *        User-specified id. This is used in an output group or an output.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * User-specified id. This is used in an output group or an output.
     * 
     * @return User-specified id. This is used in an output group or an output.
     */

    public String getId() {
        return this.id;
    }

    /**
     * User-specified id. This is used in an output group or an output.
     * 
     * @param id
     *        User-specified id. This is used in an output group or an output.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OutputDestination withId(String id) {
        setId(id);
        return this;
    }

    /**
     * Destination settings for a MediaPackage output; one destination for both encoders.
     * 
     * @return Destination settings for a MediaPackage output; one destination for both encoders.
     */

    public java.util.List<MediaPackageOutputDestinationSettings> getMediaPackageSettings() {
        return mediaPackageSettings;
    }

    /**
     * Destination settings for a MediaPackage output; one destination for both encoders.
     * 
     * @param mediaPackageSettings
     *        Destination settings for a MediaPackage output; one destination for both encoders.
     */

    public void setMediaPackageSettings(java.util.Collection<MediaPackageOutputDestinationSettings> mediaPackageSettings) {
        if (mediaPackageSettings == null) {
            this.mediaPackageSettings = null;
            return;
        }

        this.mediaPackageSettings = new java.util.ArrayList<MediaPackageOutputDestinationSettings>(mediaPackageSettings);
    }

    /**
     * Destination settings for a MediaPackage output; one destination for both encoders.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMediaPackageSettings(java.util.Collection)} or {@link #withMediaPackageSettings(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param mediaPackageSettings
     *        Destination settings for a MediaPackage output; one destination for both encoders.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OutputDestination withMediaPackageSettings(MediaPackageOutputDestinationSettings... mediaPackageSettings) {
        if (this.mediaPackageSettings == null) {
            setMediaPackageSettings(new java.util.ArrayList<MediaPackageOutputDestinationSettings>(mediaPackageSettings.length));
        }
        for (MediaPackageOutputDestinationSettings ele : mediaPackageSettings) {
            this.mediaPackageSettings.add(ele);
        }
        return this;
    }

    /**
     * Destination settings for a MediaPackage output; one destination for both encoders.
     * 
     * @param mediaPackageSettings
     *        Destination settings for a MediaPackage output; one destination for both encoders.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OutputDestination withMediaPackageSettings(java.util.Collection<MediaPackageOutputDestinationSettings> mediaPackageSettings) {
        setMediaPackageSettings(mediaPackageSettings);
        return this;
    }

    /**
     * Destination settings for a standard output; one destination for each redundant encoder.
     * 
     * @return Destination settings for a standard output; one destination for each redundant encoder.
     */

    public java.util.List<OutputDestinationSettings> getSettings() {
        return settings;
    }

    /**
     * Destination settings for a standard output; one destination for each redundant encoder.
     * 
     * @param settings
     *        Destination settings for a standard output; one destination for each redundant encoder.
     */

    public void setSettings(java.util.Collection<OutputDestinationSettings> settings) {
        if (settings == null) {
            this.settings = null;
            return;
        }

        this.settings = new java.util.ArrayList<OutputDestinationSettings>(settings);
    }

    /**
     * Destination settings for a standard output; one destination for each redundant encoder.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSettings(java.util.Collection)} or {@link #withSettings(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param settings
     *        Destination settings for a standard output; one destination for each redundant encoder.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OutputDestination withSettings(OutputDestinationSettings... settings) {
        if (this.settings == null) {
            setSettings(new java.util.ArrayList<OutputDestinationSettings>(settings.length));
        }
        for (OutputDestinationSettings ele : settings) {
            this.settings.add(ele);
        }
        return this;
    }

    /**
     * Destination settings for a standard output; one destination for each redundant encoder.
     * 
     * @param settings
     *        Destination settings for a standard output; one destination for each redundant encoder.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OutputDestination withSettings(java.util.Collection<OutputDestinationSettings> settings) {
        setSettings(settings);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getMediaPackageSettings() != null)
            sb.append("MediaPackageSettings: ").append(getMediaPackageSettings()).append(",");
        if (getSettings() != null)
            sb.append("Settings: ").append(getSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OutputDestination == false)
            return false;
        OutputDestination other = (OutputDestination) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getMediaPackageSettings() == null ^ this.getMediaPackageSettings() == null)
            return false;
        if (other.getMediaPackageSettings() != null && other.getMediaPackageSettings().equals(this.getMediaPackageSettings()) == false)
            return false;
        if (other.getSettings() == null ^ this.getSettings() == null)
            return false;
        if (other.getSettings() != null && other.getSettings().equals(this.getSettings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getMediaPackageSettings() == null) ? 0 : getMediaPackageSettings().hashCode());
        hashCode = prime * hashCode + ((getSettings() == null) ? 0 : getSettings().hashCode());
        return hashCode;
    }

    @Override
    public OutputDestination clone() {
        try {
            return (OutputDestination) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.OutputDestinationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
