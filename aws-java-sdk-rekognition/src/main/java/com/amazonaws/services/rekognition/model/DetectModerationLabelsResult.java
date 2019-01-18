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
package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import javax.annotation.Generated;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DetectModerationLabelsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Array of detected Moderation labels and the time, in millseconds from the start of the video, they were detected.
     * </p>
     */
    private java.util.List<ModerationLabel> moderationLabels;
    /**
     * <p>
     * Version number of the moderation detection model that was used to detect unsafe content.
     * </p>
     */
    private String moderationModelVersion;

    /**
     * <p>
     * Array of detected Moderation labels and the time, in millseconds from the start of the video, they were detected.
     * </p>
     * 
     * @return Array of detected Moderation labels and the time, in millseconds from the start of the video, they were
     *         detected.
     */

    public java.util.List<ModerationLabel> getModerationLabels() {
        return moderationLabels;
    }

    /**
     * <p>
     * Array of detected Moderation labels and the time, in millseconds from the start of the video, they were detected.
     * </p>
     * 
     * @param moderationLabels
     *        Array of detected Moderation labels and the time, in millseconds from the start of the video, they were
     *        detected.
     */

    public void setModerationLabels(java.util.Collection<ModerationLabel> moderationLabels) {
        if (moderationLabels == null) {
            this.moderationLabels = null;
            return;
        }

        this.moderationLabels = new java.util.ArrayList<ModerationLabel>(moderationLabels);
    }

    /**
     * <p>
     * Array of detected Moderation labels and the time, in millseconds from the start of the video, they were detected.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setModerationLabels(java.util.Collection)} or {@link #withModerationLabels(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param moderationLabels
     *        Array of detected Moderation labels and the time, in millseconds from the start of the video, they were
     *        detected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectModerationLabelsResult withModerationLabels(ModerationLabel... moderationLabels) {
        if (this.moderationLabels == null) {
            setModerationLabels(new java.util.ArrayList<ModerationLabel>(moderationLabels.length));
        }
        for (ModerationLabel ele : moderationLabels) {
            this.moderationLabels.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Array of detected Moderation labels and the time, in millseconds from the start of the video, they were detected.
     * </p>
     * 
     * @param moderationLabels
     *        Array of detected Moderation labels and the time, in millseconds from the start of the video, they were
     *        detected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectModerationLabelsResult withModerationLabels(java.util.Collection<ModerationLabel> moderationLabels) {
        setModerationLabels(moderationLabels);
        return this;
    }

    /**
     * <p>
     * Version number of the moderation detection model that was used to detect unsafe content.
     * </p>
     * 
     * @param moderationModelVersion
     *        Version number of the moderation detection model that was used to detect unsafe content.
     */

    public void setModerationModelVersion(String moderationModelVersion) {
        this.moderationModelVersion = moderationModelVersion;
    }

    /**
     * <p>
     * Version number of the moderation detection model that was used to detect unsafe content.
     * </p>
     * 
     * @return Version number of the moderation detection model that was used to detect unsafe content.
     */

    public String getModerationModelVersion() {
        return this.moderationModelVersion;
    }

    /**
     * <p>
     * Version number of the moderation detection model that was used to detect unsafe content.
     * </p>
     * 
     * @param moderationModelVersion
     *        Version number of the moderation detection model that was used to detect unsafe content.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectModerationLabelsResult withModerationModelVersion(String moderationModelVersion) {
        setModerationModelVersion(moderationModelVersion);
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
        if (getModerationLabels() != null)
            sb.append("ModerationLabels: ").append(getModerationLabels()).append(",");
        if (getModerationModelVersion() != null)
            sb.append("ModerationModelVersion: ").append(getModerationModelVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DetectModerationLabelsResult == false)
            return false;
        DetectModerationLabelsResult other = (DetectModerationLabelsResult) obj;
        if (other.getModerationLabels() == null ^ this.getModerationLabels() == null)
            return false;
        if (other.getModerationLabels() != null && other.getModerationLabels().equals(this.getModerationLabels()) == false)
            return false;
        if (other.getModerationModelVersion() == null ^ this.getModerationModelVersion() == null)
            return false;
        if (other.getModerationModelVersion() != null && other.getModerationModelVersion().equals(this.getModerationModelVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getModerationLabels() == null) ? 0 : getModerationLabels().hashCode());
        hashCode = prime * hashCode + ((getModerationModelVersion() == null) ? 0 : getModerationModelVersion().hashCode());
        return hashCode;
    }

    @Override
    public DetectModerationLabelsResult clone() {
        try {
            return (DetectModerationLabelsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
