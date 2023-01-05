/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.comprehend.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the information about an entity recognizer and its versions.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/EntityRecognizerSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EntityRecognizerSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name that you assigned the entity recognizer.
     * </p>
     */
    private String recognizerName;
    /**
     * <p>
     * The number of versions you created.
     * </p>
     */
    private Integer numberOfVersions;
    /**
     * <p>
     * The time that the latest entity recognizer version was submitted for processing.
     * </p>
     */
    private java.util.Date latestVersionCreatedAt;
    /**
     * <p>
     * The version name you assigned to the latest entity recognizer version.
     * </p>
     */
    private String latestVersionName;
    /**
     * <p>
     * Provides the status of the latest entity recognizer version.
     * </p>
     */
    private String latestVersionStatus;

    /**
     * <p>
     * The name that you assigned the entity recognizer.
     * </p>
     * 
     * @param recognizerName
     *        The name that you assigned the entity recognizer.
     */

    public void setRecognizerName(String recognizerName) {
        this.recognizerName = recognizerName;
    }

    /**
     * <p>
     * The name that you assigned the entity recognizer.
     * </p>
     * 
     * @return The name that you assigned the entity recognizer.
     */

    public String getRecognizerName() {
        return this.recognizerName;
    }

    /**
     * <p>
     * The name that you assigned the entity recognizer.
     * </p>
     * 
     * @param recognizerName
     *        The name that you assigned the entity recognizer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntityRecognizerSummary withRecognizerName(String recognizerName) {
        setRecognizerName(recognizerName);
        return this;
    }

    /**
     * <p>
     * The number of versions you created.
     * </p>
     * 
     * @param numberOfVersions
     *        The number of versions you created.
     */

    public void setNumberOfVersions(Integer numberOfVersions) {
        this.numberOfVersions = numberOfVersions;
    }

    /**
     * <p>
     * The number of versions you created.
     * </p>
     * 
     * @return The number of versions you created.
     */

    public Integer getNumberOfVersions() {
        return this.numberOfVersions;
    }

    /**
     * <p>
     * The number of versions you created.
     * </p>
     * 
     * @param numberOfVersions
     *        The number of versions you created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntityRecognizerSummary withNumberOfVersions(Integer numberOfVersions) {
        setNumberOfVersions(numberOfVersions);
        return this;
    }

    /**
     * <p>
     * The time that the latest entity recognizer version was submitted for processing.
     * </p>
     * 
     * @param latestVersionCreatedAt
     *        The time that the latest entity recognizer version was submitted for processing.
     */

    public void setLatestVersionCreatedAt(java.util.Date latestVersionCreatedAt) {
        this.latestVersionCreatedAt = latestVersionCreatedAt;
    }

    /**
     * <p>
     * The time that the latest entity recognizer version was submitted for processing.
     * </p>
     * 
     * @return The time that the latest entity recognizer version was submitted for processing.
     */

    public java.util.Date getLatestVersionCreatedAt() {
        return this.latestVersionCreatedAt;
    }

    /**
     * <p>
     * The time that the latest entity recognizer version was submitted for processing.
     * </p>
     * 
     * @param latestVersionCreatedAt
     *        The time that the latest entity recognizer version was submitted for processing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntityRecognizerSummary withLatestVersionCreatedAt(java.util.Date latestVersionCreatedAt) {
        setLatestVersionCreatedAt(latestVersionCreatedAt);
        return this;
    }

    /**
     * <p>
     * The version name you assigned to the latest entity recognizer version.
     * </p>
     * 
     * @param latestVersionName
     *        The version name you assigned to the latest entity recognizer version.
     */

    public void setLatestVersionName(String latestVersionName) {
        this.latestVersionName = latestVersionName;
    }

    /**
     * <p>
     * The version name you assigned to the latest entity recognizer version.
     * </p>
     * 
     * @return The version name you assigned to the latest entity recognizer version.
     */

    public String getLatestVersionName() {
        return this.latestVersionName;
    }

    /**
     * <p>
     * The version name you assigned to the latest entity recognizer version.
     * </p>
     * 
     * @param latestVersionName
     *        The version name you assigned to the latest entity recognizer version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntityRecognizerSummary withLatestVersionName(String latestVersionName) {
        setLatestVersionName(latestVersionName);
        return this;
    }

    /**
     * <p>
     * Provides the status of the latest entity recognizer version.
     * </p>
     * 
     * @param latestVersionStatus
     *        Provides the status of the latest entity recognizer version.
     * @see ModelStatus
     */

    public void setLatestVersionStatus(String latestVersionStatus) {
        this.latestVersionStatus = latestVersionStatus;
    }

    /**
     * <p>
     * Provides the status of the latest entity recognizer version.
     * </p>
     * 
     * @return Provides the status of the latest entity recognizer version.
     * @see ModelStatus
     */

    public String getLatestVersionStatus() {
        return this.latestVersionStatus;
    }

    /**
     * <p>
     * Provides the status of the latest entity recognizer version.
     * </p>
     * 
     * @param latestVersionStatus
     *        Provides the status of the latest entity recognizer version.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelStatus
     */

    public EntityRecognizerSummary withLatestVersionStatus(String latestVersionStatus) {
        setLatestVersionStatus(latestVersionStatus);
        return this;
    }

    /**
     * <p>
     * Provides the status of the latest entity recognizer version.
     * </p>
     * 
     * @param latestVersionStatus
     *        Provides the status of the latest entity recognizer version.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelStatus
     */

    public EntityRecognizerSummary withLatestVersionStatus(ModelStatus latestVersionStatus) {
        this.latestVersionStatus = latestVersionStatus.toString();
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
        if (getRecognizerName() != null)
            sb.append("RecognizerName: ").append(getRecognizerName()).append(",");
        if (getNumberOfVersions() != null)
            sb.append("NumberOfVersions: ").append(getNumberOfVersions()).append(",");
        if (getLatestVersionCreatedAt() != null)
            sb.append("LatestVersionCreatedAt: ").append(getLatestVersionCreatedAt()).append(",");
        if (getLatestVersionName() != null)
            sb.append("LatestVersionName: ").append(getLatestVersionName()).append(",");
        if (getLatestVersionStatus() != null)
            sb.append("LatestVersionStatus: ").append(getLatestVersionStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EntityRecognizerSummary == false)
            return false;
        EntityRecognizerSummary other = (EntityRecognizerSummary) obj;
        if (other.getRecognizerName() == null ^ this.getRecognizerName() == null)
            return false;
        if (other.getRecognizerName() != null && other.getRecognizerName().equals(this.getRecognizerName()) == false)
            return false;
        if (other.getNumberOfVersions() == null ^ this.getNumberOfVersions() == null)
            return false;
        if (other.getNumberOfVersions() != null && other.getNumberOfVersions().equals(this.getNumberOfVersions()) == false)
            return false;
        if (other.getLatestVersionCreatedAt() == null ^ this.getLatestVersionCreatedAt() == null)
            return false;
        if (other.getLatestVersionCreatedAt() != null && other.getLatestVersionCreatedAt().equals(this.getLatestVersionCreatedAt()) == false)
            return false;
        if (other.getLatestVersionName() == null ^ this.getLatestVersionName() == null)
            return false;
        if (other.getLatestVersionName() != null && other.getLatestVersionName().equals(this.getLatestVersionName()) == false)
            return false;
        if (other.getLatestVersionStatus() == null ^ this.getLatestVersionStatus() == null)
            return false;
        if (other.getLatestVersionStatus() != null && other.getLatestVersionStatus().equals(this.getLatestVersionStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRecognizerName() == null) ? 0 : getRecognizerName().hashCode());
        hashCode = prime * hashCode + ((getNumberOfVersions() == null) ? 0 : getNumberOfVersions().hashCode());
        hashCode = prime * hashCode + ((getLatestVersionCreatedAt() == null) ? 0 : getLatestVersionCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getLatestVersionName() == null) ? 0 : getLatestVersionName().hashCode());
        hashCode = prime * hashCode + ((getLatestVersionStatus() == null) ? 0 : getLatestVersionStatus().hashCode());
        return hashCode;
    }

    @Override
    public EntityRecognizerSummary clone() {
        try {
            return (EntityRecognizerSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.comprehend.model.transform.EntityRecognizerSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
