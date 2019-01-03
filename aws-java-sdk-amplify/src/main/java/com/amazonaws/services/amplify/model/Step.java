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
package com.amazonaws.services.amplify.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Structure for an execution step for an execution job, for an Amplify App.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/Step" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Step implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Name of the execution step.
     * </p>
     */
    private String stepName;
    /**
     * <p>
     * Start date/ time of the execution step.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * Status of the execution step.
     * </p>
     */
    private String status;
    /**
     * <p>
     * End date/ time of the execution step.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * Url to the logs for the execution step.
     * </p>
     */
    private String logUrl;
    /**
     * <p>
     * Url to teh artifact for the execution step.
     * </p>
     */
    private String artifactsUrl;
    /**
     * <p>
     * List of screenshot Urls for the execution step, if relevant.
     * </p>
     */
    private java.util.Map<String, String> screenshots;

    /**
     * <p>
     * Name of the execution step.
     * </p>
     * 
     * @param stepName
     *        Name of the execution step.
     */

    public void setStepName(String stepName) {
        this.stepName = stepName;
    }

    /**
     * <p>
     * Name of the execution step.
     * </p>
     * 
     * @return Name of the execution step.
     */

    public String getStepName() {
        return this.stepName;
    }

    /**
     * <p>
     * Name of the execution step.
     * </p>
     * 
     * @param stepName
     *        Name of the execution step.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Step withStepName(String stepName) {
        setStepName(stepName);
        return this;
    }

    /**
     * <p>
     * Start date/ time of the execution step.
     * </p>
     * 
     * @param startTime
     *        Start date/ time of the execution step.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * Start date/ time of the execution step.
     * </p>
     * 
     * @return Start date/ time of the execution step.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * Start date/ time of the execution step.
     * </p>
     * 
     * @param startTime
     *        Start date/ time of the execution step.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Step withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * Status of the execution step.
     * </p>
     * 
     * @param status
     *        Status of the execution step.
     * @see JobStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Status of the execution step.
     * </p>
     * 
     * @return Status of the execution step.
     * @see JobStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Status of the execution step.
     * </p>
     * 
     * @param status
     *        Status of the execution step.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobStatus
     */

    public Step withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Status of the execution step.
     * </p>
     * 
     * @param status
     *        Status of the execution step.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobStatus
     */

    public Step withStatus(JobStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * End date/ time of the execution step.
     * </p>
     * 
     * @param endTime
     *        End date/ time of the execution step.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * End date/ time of the execution step.
     * </p>
     * 
     * @return End date/ time of the execution step.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * End date/ time of the execution step.
     * </p>
     * 
     * @param endTime
     *        End date/ time of the execution step.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Step withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * Url to the logs for the execution step.
     * </p>
     * 
     * @param logUrl
     *        Url to the logs for the execution step.
     */

    public void setLogUrl(String logUrl) {
        this.logUrl = logUrl;
    }

    /**
     * <p>
     * Url to the logs for the execution step.
     * </p>
     * 
     * @return Url to the logs for the execution step.
     */

    public String getLogUrl() {
        return this.logUrl;
    }

    /**
     * <p>
     * Url to the logs for the execution step.
     * </p>
     * 
     * @param logUrl
     *        Url to the logs for the execution step.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Step withLogUrl(String logUrl) {
        setLogUrl(logUrl);
        return this;
    }

    /**
     * <p>
     * Url to teh artifact for the execution step.
     * </p>
     * 
     * @param artifactsUrl
     *        Url to teh artifact for the execution step.
     */

    public void setArtifactsUrl(String artifactsUrl) {
        this.artifactsUrl = artifactsUrl;
    }

    /**
     * <p>
     * Url to teh artifact for the execution step.
     * </p>
     * 
     * @return Url to teh artifact for the execution step.
     */

    public String getArtifactsUrl() {
        return this.artifactsUrl;
    }

    /**
     * <p>
     * Url to teh artifact for the execution step.
     * </p>
     * 
     * @param artifactsUrl
     *        Url to teh artifact for the execution step.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Step withArtifactsUrl(String artifactsUrl) {
        setArtifactsUrl(artifactsUrl);
        return this;
    }

    /**
     * <p>
     * List of screenshot Urls for the execution step, if relevant.
     * </p>
     * 
     * @return List of screenshot Urls for the execution step, if relevant.
     */

    public java.util.Map<String, String> getScreenshots() {
        return screenshots;
    }

    /**
     * <p>
     * List of screenshot Urls for the execution step, if relevant.
     * </p>
     * 
     * @param screenshots
     *        List of screenshot Urls for the execution step, if relevant.
     */

    public void setScreenshots(java.util.Map<String, String> screenshots) {
        this.screenshots = screenshots;
    }

    /**
     * <p>
     * List of screenshot Urls for the execution step, if relevant.
     * </p>
     * 
     * @param screenshots
     *        List of screenshot Urls for the execution step, if relevant.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Step withScreenshots(java.util.Map<String, String> screenshots) {
        setScreenshots(screenshots);
        return this;
    }

    public Step addScreenshotsEntry(String key, String value) {
        if (null == this.screenshots) {
            this.screenshots = new java.util.HashMap<String, String>();
        }
        if (this.screenshots.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.screenshots.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Screenshots.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Step clearScreenshotsEntries() {
        this.screenshots = null;
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
        if (getStepName() != null)
            sb.append("StepName: ").append(getStepName()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getLogUrl() != null)
            sb.append("LogUrl: ").append(getLogUrl()).append(",");
        if (getArtifactsUrl() != null)
            sb.append("ArtifactsUrl: ").append(getArtifactsUrl()).append(",");
        if (getScreenshots() != null)
            sb.append("Screenshots: ").append(getScreenshots());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Step == false)
            return false;
        Step other = (Step) obj;
        if (other.getStepName() == null ^ this.getStepName() == null)
            return false;
        if (other.getStepName() != null && other.getStepName().equals(this.getStepName()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getLogUrl() == null ^ this.getLogUrl() == null)
            return false;
        if (other.getLogUrl() != null && other.getLogUrl().equals(this.getLogUrl()) == false)
            return false;
        if (other.getArtifactsUrl() == null ^ this.getArtifactsUrl() == null)
            return false;
        if (other.getArtifactsUrl() != null && other.getArtifactsUrl().equals(this.getArtifactsUrl()) == false)
            return false;
        if (other.getScreenshots() == null ^ this.getScreenshots() == null)
            return false;
        if (other.getScreenshots() != null && other.getScreenshots().equals(this.getScreenshots()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStepName() == null) ? 0 : getStepName().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getLogUrl() == null) ? 0 : getLogUrl().hashCode());
        hashCode = prime * hashCode + ((getArtifactsUrl() == null) ? 0 : getArtifactsUrl().hashCode());
        hashCode = prime * hashCode + ((getScreenshots() == null) ? 0 : getScreenshots().hashCode());
        return hashCode;
    }

    @Override
    public Step clone() {
        try {
            return (Step) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.amplify.model.transform.StepMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
