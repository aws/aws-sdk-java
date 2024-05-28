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
package com.amazonaws.services.personalize.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides a summary of the properties of a solution version. For a complete listing, call the <a
 * href="https://docs.aws.amazon.com/personalize/latest/dg/API_DescribeSolutionVersion.html">DescribeSolutionVersion</a>
 * API.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/SolutionVersionSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SolutionVersionSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the solution version.
     * </p>
     */
    private String solutionVersionArn;
    /**
     * <p>
     * The status of the solution version.
     * </p>
     * <p>
     * A solution version can be in one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED
     * </p>
     * </li>
     * </ul>
     */
    private String status;
    /**
     * <p>
     * The scope of training to be performed when creating the solution version. A <code>FULL</code> training considers
     * all of the data in your dataset group. An <code>UPDATE</code> processes only the data that has changed since the
     * latest training. Only solution versions created with the User-Personalization recipe can use <code>UPDATE</code>.
     * </p>
     */
    private String trainingMode;
    /**
     * <p>
     * Whether the solution version was created automatically or manually.
     * </p>
     */
    private String trainingType;
    /**
     * <p>
     * The date and time (in Unix time) that this version of a solution was created.
     * </p>
     */
    private java.util.Date creationDateTime;
    /**
     * <p>
     * The date and time (in Unix time) that the solution version was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedDateTime;
    /**
     * <p>
     * If a solution version fails, the reason behind the failure.
     * </p>
     */
    private String failureReason;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the solution version.
     * </p>
     * 
     * @param solutionVersionArn
     *        The Amazon Resource Name (ARN) of the solution version.
     */

    public void setSolutionVersionArn(String solutionVersionArn) {
        this.solutionVersionArn = solutionVersionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the solution version.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the solution version.
     */

    public String getSolutionVersionArn() {
        return this.solutionVersionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the solution version.
     * </p>
     * 
     * @param solutionVersionArn
     *        The Amazon Resource Name (ARN) of the solution version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SolutionVersionSummary withSolutionVersionArn(String solutionVersionArn) {
        setSolutionVersionArn(solutionVersionArn);
        return this;
    }

    /**
     * <p>
     * The status of the solution version.
     * </p>
     * <p>
     * A solution version can be in one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the solution version.</p>
     *        <p>
     *        A solution version can be in one of the following states:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED
     *        </p>
     *        </li>
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the solution version.
     * </p>
     * <p>
     * A solution version can be in one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED
     * </p>
     * </li>
     * </ul>
     * 
     * @return The status of the solution version.</p>
     *         <p>
     *         A solution version can be in one of the following states:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED
     *         </p>
     *         </li>
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the solution version.
     * </p>
     * <p>
     * A solution version can be in one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the solution version.</p>
     *        <p>
     *        A solution version can be in one of the following states:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SolutionVersionSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The scope of training to be performed when creating the solution version. A <code>FULL</code> training considers
     * all of the data in your dataset group. An <code>UPDATE</code> processes only the data that has changed since the
     * latest training. Only solution versions created with the User-Personalization recipe can use <code>UPDATE</code>.
     * </p>
     * 
     * @param trainingMode
     *        The scope of training to be performed when creating the solution version. A <code>FULL</code> training
     *        considers all of the data in your dataset group. An <code>UPDATE</code> processes only the data that has
     *        changed since the latest training. Only solution versions created with the User-Personalization recipe can
     *        use <code>UPDATE</code>.
     * @see TrainingMode
     */

    public void setTrainingMode(String trainingMode) {
        this.trainingMode = trainingMode;
    }

    /**
     * <p>
     * The scope of training to be performed when creating the solution version. A <code>FULL</code> training considers
     * all of the data in your dataset group. An <code>UPDATE</code> processes only the data that has changed since the
     * latest training. Only solution versions created with the User-Personalization recipe can use <code>UPDATE</code>.
     * </p>
     * 
     * @return The scope of training to be performed when creating the solution version. A <code>FULL</code> training
     *         considers all of the data in your dataset group. An <code>UPDATE</code> processes only the data that has
     *         changed since the latest training. Only solution versions created with the User-Personalization recipe
     *         can use <code>UPDATE</code>.
     * @see TrainingMode
     */

    public String getTrainingMode() {
        return this.trainingMode;
    }

    /**
     * <p>
     * The scope of training to be performed when creating the solution version. A <code>FULL</code> training considers
     * all of the data in your dataset group. An <code>UPDATE</code> processes only the data that has changed since the
     * latest training. Only solution versions created with the User-Personalization recipe can use <code>UPDATE</code>.
     * </p>
     * 
     * @param trainingMode
     *        The scope of training to be performed when creating the solution version. A <code>FULL</code> training
     *        considers all of the data in your dataset group. An <code>UPDATE</code> processes only the data that has
     *        changed since the latest training. Only solution versions created with the User-Personalization recipe can
     *        use <code>UPDATE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TrainingMode
     */

    public SolutionVersionSummary withTrainingMode(String trainingMode) {
        setTrainingMode(trainingMode);
        return this;
    }

    /**
     * <p>
     * The scope of training to be performed when creating the solution version. A <code>FULL</code> training considers
     * all of the data in your dataset group. An <code>UPDATE</code> processes only the data that has changed since the
     * latest training. Only solution versions created with the User-Personalization recipe can use <code>UPDATE</code>.
     * </p>
     * 
     * @param trainingMode
     *        The scope of training to be performed when creating the solution version. A <code>FULL</code> training
     *        considers all of the data in your dataset group. An <code>UPDATE</code> processes only the data that has
     *        changed since the latest training. Only solution versions created with the User-Personalization recipe can
     *        use <code>UPDATE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TrainingMode
     */

    public SolutionVersionSummary withTrainingMode(TrainingMode trainingMode) {
        this.trainingMode = trainingMode.toString();
        return this;
    }

    /**
     * <p>
     * Whether the solution version was created automatically or manually.
     * </p>
     * 
     * @param trainingType
     *        Whether the solution version was created automatically or manually.
     * @see TrainingType
     */

    public void setTrainingType(String trainingType) {
        this.trainingType = trainingType;
    }

    /**
     * <p>
     * Whether the solution version was created automatically or manually.
     * </p>
     * 
     * @return Whether the solution version was created automatically or manually.
     * @see TrainingType
     */

    public String getTrainingType() {
        return this.trainingType;
    }

    /**
     * <p>
     * Whether the solution version was created automatically or manually.
     * </p>
     * 
     * @param trainingType
     *        Whether the solution version was created automatically or manually.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TrainingType
     */

    public SolutionVersionSummary withTrainingType(String trainingType) {
        setTrainingType(trainingType);
        return this;
    }

    /**
     * <p>
     * Whether the solution version was created automatically or manually.
     * </p>
     * 
     * @param trainingType
     *        Whether the solution version was created automatically or manually.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TrainingType
     */

    public SolutionVersionSummary withTrainingType(TrainingType trainingType) {
        this.trainingType = trainingType.toString();
        return this;
    }

    /**
     * <p>
     * The date and time (in Unix time) that this version of a solution was created.
     * </p>
     * 
     * @param creationDateTime
     *        The date and time (in Unix time) that this version of a solution was created.
     */

    public void setCreationDateTime(java.util.Date creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    /**
     * <p>
     * The date and time (in Unix time) that this version of a solution was created.
     * </p>
     * 
     * @return The date and time (in Unix time) that this version of a solution was created.
     */

    public java.util.Date getCreationDateTime() {
        return this.creationDateTime;
    }

    /**
     * <p>
     * The date and time (in Unix time) that this version of a solution was created.
     * </p>
     * 
     * @param creationDateTime
     *        The date and time (in Unix time) that this version of a solution was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SolutionVersionSummary withCreationDateTime(java.util.Date creationDateTime) {
        setCreationDateTime(creationDateTime);
        return this;
    }

    /**
     * <p>
     * The date and time (in Unix time) that the solution version was last updated.
     * </p>
     * 
     * @param lastUpdatedDateTime
     *        The date and time (in Unix time) that the solution version was last updated.
     */

    public void setLastUpdatedDateTime(java.util.Date lastUpdatedDateTime) {
        this.lastUpdatedDateTime = lastUpdatedDateTime;
    }

    /**
     * <p>
     * The date and time (in Unix time) that the solution version was last updated.
     * </p>
     * 
     * @return The date and time (in Unix time) that the solution version was last updated.
     */

    public java.util.Date getLastUpdatedDateTime() {
        return this.lastUpdatedDateTime;
    }

    /**
     * <p>
     * The date and time (in Unix time) that the solution version was last updated.
     * </p>
     * 
     * @param lastUpdatedDateTime
     *        The date and time (in Unix time) that the solution version was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SolutionVersionSummary withLastUpdatedDateTime(java.util.Date lastUpdatedDateTime) {
        setLastUpdatedDateTime(lastUpdatedDateTime);
        return this;
    }

    /**
     * <p>
     * If a solution version fails, the reason behind the failure.
     * </p>
     * 
     * @param failureReason
     *        If a solution version fails, the reason behind the failure.
     */

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * If a solution version fails, the reason behind the failure.
     * </p>
     * 
     * @return If a solution version fails, the reason behind the failure.
     */

    public String getFailureReason() {
        return this.failureReason;
    }

    /**
     * <p>
     * If a solution version fails, the reason behind the failure.
     * </p>
     * 
     * @param failureReason
     *        If a solution version fails, the reason behind the failure.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SolutionVersionSummary withFailureReason(String failureReason) {
        setFailureReason(failureReason);
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
        if (getSolutionVersionArn() != null)
            sb.append("SolutionVersionArn: ").append(getSolutionVersionArn()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getTrainingMode() != null)
            sb.append("TrainingMode: ").append(getTrainingMode()).append(",");
        if (getTrainingType() != null)
            sb.append("TrainingType: ").append(getTrainingType()).append(",");
        if (getCreationDateTime() != null)
            sb.append("CreationDateTime: ").append(getCreationDateTime()).append(",");
        if (getLastUpdatedDateTime() != null)
            sb.append("LastUpdatedDateTime: ").append(getLastUpdatedDateTime()).append(",");
        if (getFailureReason() != null)
            sb.append("FailureReason: ").append(getFailureReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SolutionVersionSummary == false)
            return false;
        SolutionVersionSummary other = (SolutionVersionSummary) obj;
        if (other.getSolutionVersionArn() == null ^ this.getSolutionVersionArn() == null)
            return false;
        if (other.getSolutionVersionArn() != null && other.getSolutionVersionArn().equals(this.getSolutionVersionArn()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getTrainingMode() == null ^ this.getTrainingMode() == null)
            return false;
        if (other.getTrainingMode() != null && other.getTrainingMode().equals(this.getTrainingMode()) == false)
            return false;
        if (other.getTrainingType() == null ^ this.getTrainingType() == null)
            return false;
        if (other.getTrainingType() != null && other.getTrainingType().equals(this.getTrainingType()) == false)
            return false;
        if (other.getCreationDateTime() == null ^ this.getCreationDateTime() == null)
            return false;
        if (other.getCreationDateTime() != null && other.getCreationDateTime().equals(this.getCreationDateTime()) == false)
            return false;
        if (other.getLastUpdatedDateTime() == null ^ this.getLastUpdatedDateTime() == null)
            return false;
        if (other.getLastUpdatedDateTime() != null && other.getLastUpdatedDateTime().equals(this.getLastUpdatedDateTime()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSolutionVersionArn() == null) ? 0 : getSolutionVersionArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getTrainingMode() == null) ? 0 : getTrainingMode().hashCode());
        hashCode = prime * hashCode + ((getTrainingType() == null) ? 0 : getTrainingType().hashCode());
        hashCode = prime * hashCode + ((getCreationDateTime() == null) ? 0 : getCreationDateTime().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedDateTime() == null) ? 0 : getLastUpdatedDateTime().hashCode());
        hashCode = prime * hashCode + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        return hashCode;
    }

    @Override
    public SolutionVersionSummary clone() {
        try {
            return (SolutionVersionSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.personalize.model.transform.SolutionVersionSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
