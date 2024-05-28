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
package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import javax.annotation.Generated;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DetectModerationLabelsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Array of detected Moderation labels and the time, in milliseconds from the start of the video, they were
     * detected.
     * </p>
     */
    private java.util.List<ModerationLabel> moderationLabels;
    /**
     * <p>
     * Version number of the base moderation detection model that was used to detect unsafe content.
     * </p>
     */
    private String moderationModelVersion;
    /**
     * <p>
     * Shows the results of the human in the loop evaluation.
     * </p>
     */
    private HumanLoopActivationOutput humanLoopActivationOutput;
    /**
     * <p>
     * Identifier of the custom adapter that was used during inference. If during inference the adapter was EXPIRED,
     * then the parameter will not be returned, indicating that a base moderation detection project version was used.
     * </p>
     */
    private String projectVersion;
    /**
     * <p>
     * A list of predicted results for the type of content an image contains. For example, the image content might be
     * from animation, sports, or a video game.
     * </p>
     */
    private java.util.List<ContentType> contentTypes;

    /**
     * <p>
     * Array of detected Moderation labels and the time, in milliseconds from the start of the video, they were
     * detected.
     * </p>
     * 
     * @return Array of detected Moderation labels and the time, in milliseconds from the start of the video, they were
     *         detected.
     */

    public java.util.List<ModerationLabel> getModerationLabels() {
        return moderationLabels;
    }

    /**
     * <p>
     * Array of detected Moderation labels and the time, in milliseconds from the start of the video, they were
     * detected.
     * </p>
     * 
     * @param moderationLabels
     *        Array of detected Moderation labels and the time, in milliseconds from the start of the video, they were
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
     * Array of detected Moderation labels and the time, in milliseconds from the start of the video, they were
     * detected.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setModerationLabels(java.util.Collection)} or {@link #withModerationLabels(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param moderationLabels
     *        Array of detected Moderation labels and the time, in milliseconds from the start of the video, they were
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
     * Array of detected Moderation labels and the time, in milliseconds from the start of the video, they were
     * detected.
     * </p>
     * 
     * @param moderationLabels
     *        Array of detected Moderation labels and the time, in milliseconds from the start of the video, they were
     *        detected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectModerationLabelsResult withModerationLabels(java.util.Collection<ModerationLabel> moderationLabels) {
        setModerationLabels(moderationLabels);
        return this;
    }

    /**
     * <p>
     * Version number of the base moderation detection model that was used to detect unsafe content.
     * </p>
     * 
     * @param moderationModelVersion
     *        Version number of the base moderation detection model that was used to detect unsafe content.
     */

    public void setModerationModelVersion(String moderationModelVersion) {
        this.moderationModelVersion = moderationModelVersion;
    }

    /**
     * <p>
     * Version number of the base moderation detection model that was used to detect unsafe content.
     * </p>
     * 
     * @return Version number of the base moderation detection model that was used to detect unsafe content.
     */

    public String getModerationModelVersion() {
        return this.moderationModelVersion;
    }

    /**
     * <p>
     * Version number of the base moderation detection model that was used to detect unsafe content.
     * </p>
     * 
     * @param moderationModelVersion
     *        Version number of the base moderation detection model that was used to detect unsafe content.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectModerationLabelsResult withModerationModelVersion(String moderationModelVersion) {
        setModerationModelVersion(moderationModelVersion);
        return this;
    }

    /**
     * <p>
     * Shows the results of the human in the loop evaluation.
     * </p>
     * 
     * @param humanLoopActivationOutput
     *        Shows the results of the human in the loop evaluation.
     */

    public void setHumanLoopActivationOutput(HumanLoopActivationOutput humanLoopActivationOutput) {
        this.humanLoopActivationOutput = humanLoopActivationOutput;
    }

    /**
     * <p>
     * Shows the results of the human in the loop evaluation.
     * </p>
     * 
     * @return Shows the results of the human in the loop evaluation.
     */

    public HumanLoopActivationOutput getHumanLoopActivationOutput() {
        return this.humanLoopActivationOutput;
    }

    /**
     * <p>
     * Shows the results of the human in the loop evaluation.
     * </p>
     * 
     * @param humanLoopActivationOutput
     *        Shows the results of the human in the loop evaluation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectModerationLabelsResult withHumanLoopActivationOutput(HumanLoopActivationOutput humanLoopActivationOutput) {
        setHumanLoopActivationOutput(humanLoopActivationOutput);
        return this;
    }

    /**
     * <p>
     * Identifier of the custom adapter that was used during inference. If during inference the adapter was EXPIRED,
     * then the parameter will not be returned, indicating that a base moderation detection project version was used.
     * </p>
     * 
     * @param projectVersion
     *        Identifier of the custom adapter that was used during inference. If during inference the adapter was
     *        EXPIRED, then the parameter will not be returned, indicating that a base moderation detection project
     *        version was used.
     */

    public void setProjectVersion(String projectVersion) {
        this.projectVersion = projectVersion;
    }

    /**
     * <p>
     * Identifier of the custom adapter that was used during inference. If during inference the adapter was EXPIRED,
     * then the parameter will not be returned, indicating that a base moderation detection project version was used.
     * </p>
     * 
     * @return Identifier of the custom adapter that was used during inference. If during inference the adapter was
     *         EXPIRED, then the parameter will not be returned, indicating that a base moderation detection project
     *         version was used.
     */

    public String getProjectVersion() {
        return this.projectVersion;
    }

    /**
     * <p>
     * Identifier of the custom adapter that was used during inference. If during inference the adapter was EXPIRED,
     * then the parameter will not be returned, indicating that a base moderation detection project version was used.
     * </p>
     * 
     * @param projectVersion
     *        Identifier of the custom adapter that was used during inference. If during inference the adapter was
     *        EXPIRED, then the parameter will not be returned, indicating that a base moderation detection project
     *        version was used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectModerationLabelsResult withProjectVersion(String projectVersion) {
        setProjectVersion(projectVersion);
        return this;
    }

    /**
     * <p>
     * A list of predicted results for the type of content an image contains. For example, the image content might be
     * from animation, sports, or a video game.
     * </p>
     * 
     * @return A list of predicted results for the type of content an image contains. For example, the image content
     *         might be from animation, sports, or a video game.
     */

    public java.util.List<ContentType> getContentTypes() {
        return contentTypes;
    }

    /**
     * <p>
     * A list of predicted results for the type of content an image contains. For example, the image content might be
     * from animation, sports, or a video game.
     * </p>
     * 
     * @param contentTypes
     *        A list of predicted results for the type of content an image contains. For example, the image content
     *        might be from animation, sports, or a video game.
     */

    public void setContentTypes(java.util.Collection<ContentType> contentTypes) {
        if (contentTypes == null) {
            this.contentTypes = null;
            return;
        }

        this.contentTypes = new java.util.ArrayList<ContentType>(contentTypes);
    }

    /**
     * <p>
     * A list of predicted results for the type of content an image contains. For example, the image content might be
     * from animation, sports, or a video game.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setContentTypes(java.util.Collection)} or {@link #withContentTypes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param contentTypes
     *        A list of predicted results for the type of content an image contains. For example, the image content
     *        might be from animation, sports, or a video game.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectModerationLabelsResult withContentTypes(ContentType... contentTypes) {
        if (this.contentTypes == null) {
            setContentTypes(new java.util.ArrayList<ContentType>(contentTypes.length));
        }
        for (ContentType ele : contentTypes) {
            this.contentTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of predicted results for the type of content an image contains. For example, the image content might be
     * from animation, sports, or a video game.
     * </p>
     * 
     * @param contentTypes
     *        A list of predicted results for the type of content an image contains. For example, the image content
     *        might be from animation, sports, or a video game.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectModerationLabelsResult withContentTypes(java.util.Collection<ContentType> contentTypes) {
        setContentTypes(contentTypes);
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
            sb.append("ModerationModelVersion: ").append(getModerationModelVersion()).append(",");
        if (getHumanLoopActivationOutput() != null)
            sb.append("HumanLoopActivationOutput: ").append(getHumanLoopActivationOutput()).append(",");
        if (getProjectVersion() != null)
            sb.append("ProjectVersion: ").append(getProjectVersion()).append(",");
        if (getContentTypes() != null)
            sb.append("ContentTypes: ").append(getContentTypes());
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
        if (other.getHumanLoopActivationOutput() == null ^ this.getHumanLoopActivationOutput() == null)
            return false;
        if (other.getHumanLoopActivationOutput() != null && other.getHumanLoopActivationOutput().equals(this.getHumanLoopActivationOutput()) == false)
            return false;
        if (other.getProjectVersion() == null ^ this.getProjectVersion() == null)
            return false;
        if (other.getProjectVersion() != null && other.getProjectVersion().equals(this.getProjectVersion()) == false)
            return false;
        if (other.getContentTypes() == null ^ this.getContentTypes() == null)
            return false;
        if (other.getContentTypes() != null && other.getContentTypes().equals(this.getContentTypes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getModerationLabels() == null) ? 0 : getModerationLabels().hashCode());
        hashCode = prime * hashCode + ((getModerationModelVersion() == null) ? 0 : getModerationModelVersion().hashCode());
        hashCode = prime * hashCode + ((getHumanLoopActivationOutput() == null) ? 0 : getHumanLoopActivationOutput().hashCode());
        hashCode = prime * hashCode + ((getProjectVersion() == null) ? 0 : getProjectVersion().hashCode());
        hashCode = prime * hashCode + ((getContentTypes() == null) ? 0 : getContentTypes().hashCode());
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
