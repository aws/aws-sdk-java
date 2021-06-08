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
package com.amazonaws.services.synthetics.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * This structure contains the details about one run of one canary.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/synthetics-2017-10-11/CanaryRun" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CanaryRun implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A unique ID that identifies this canary run.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The name of the canary.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The status of this run.
     * </p>
     */
    private CanaryRunStatus status;
    /**
     * <p>
     * A structure that contains the start and end times of this run.
     * </p>
     */
    private CanaryRunTimeline timeline;
    /**
     * <p>
     * The location where the canary stored artifacts from the run. Artifacts include the log file, screenshots, and HAR
     * files.
     * </p>
     */
    private String artifactS3Location;

    /**
     * <p>
     * A unique ID that identifies this canary run.
     * </p>
     * 
     * @param id
     *        A unique ID that identifies this canary run.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * A unique ID that identifies this canary run.
     * </p>
     * 
     * @return A unique ID that identifies this canary run.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * A unique ID that identifies this canary run.
     * </p>
     * 
     * @param id
     *        A unique ID that identifies this canary run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CanaryRun withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The name of the canary.
     * </p>
     * 
     * @param name
     *        The name of the canary.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the canary.
     * </p>
     * 
     * @return The name of the canary.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the canary.
     * </p>
     * 
     * @param name
     *        The name of the canary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CanaryRun withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The status of this run.
     * </p>
     * 
     * @param status
     *        The status of this run.
     */

    public void setStatus(CanaryRunStatus status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of this run.
     * </p>
     * 
     * @return The status of this run.
     */

    public CanaryRunStatus getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of this run.
     * </p>
     * 
     * @param status
     *        The status of this run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CanaryRun withStatus(CanaryRunStatus status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * A structure that contains the start and end times of this run.
     * </p>
     * 
     * @param timeline
     *        A structure that contains the start and end times of this run.
     */

    public void setTimeline(CanaryRunTimeline timeline) {
        this.timeline = timeline;
    }

    /**
     * <p>
     * A structure that contains the start and end times of this run.
     * </p>
     * 
     * @return A structure that contains the start and end times of this run.
     */

    public CanaryRunTimeline getTimeline() {
        return this.timeline;
    }

    /**
     * <p>
     * A structure that contains the start and end times of this run.
     * </p>
     * 
     * @param timeline
     *        A structure that contains the start and end times of this run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CanaryRun withTimeline(CanaryRunTimeline timeline) {
        setTimeline(timeline);
        return this;
    }

    /**
     * <p>
     * The location where the canary stored artifacts from the run. Artifacts include the log file, screenshots, and HAR
     * files.
     * </p>
     * 
     * @param artifactS3Location
     *        The location where the canary stored artifacts from the run. Artifacts include the log file, screenshots,
     *        and HAR files.
     */

    public void setArtifactS3Location(String artifactS3Location) {
        this.artifactS3Location = artifactS3Location;
    }

    /**
     * <p>
     * The location where the canary stored artifacts from the run. Artifacts include the log file, screenshots, and HAR
     * files.
     * </p>
     * 
     * @return The location where the canary stored artifacts from the run. Artifacts include the log file, screenshots,
     *         and HAR files.
     */

    public String getArtifactS3Location() {
        return this.artifactS3Location;
    }

    /**
     * <p>
     * The location where the canary stored artifacts from the run. Artifacts include the log file, screenshots, and HAR
     * files.
     * </p>
     * 
     * @param artifactS3Location
     *        The location where the canary stored artifacts from the run. Artifacts include the log file, screenshots,
     *        and HAR files.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CanaryRun withArtifactS3Location(String artifactS3Location) {
        setArtifactS3Location(artifactS3Location);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getTimeline() != null)
            sb.append("Timeline: ").append(getTimeline()).append(",");
        if (getArtifactS3Location() != null)
            sb.append("ArtifactS3Location: ").append(getArtifactS3Location());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CanaryRun == false)
            return false;
        CanaryRun other = (CanaryRun) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getTimeline() == null ^ this.getTimeline() == null)
            return false;
        if (other.getTimeline() != null && other.getTimeline().equals(this.getTimeline()) == false)
            return false;
        if (other.getArtifactS3Location() == null ^ this.getArtifactS3Location() == null)
            return false;
        if (other.getArtifactS3Location() != null && other.getArtifactS3Location().equals(this.getArtifactS3Location()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getTimeline() == null) ? 0 : getTimeline().hashCode());
        hashCode = prime * hashCode + ((getArtifactS3Location() == null) ? 0 : getArtifactS3Location().hashCode());
        return hashCode;
    }

    @Override
    public CanaryRun clone() {
        try {
            return (CanaryRun) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.synthetics.model.transform.CanaryRunMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
