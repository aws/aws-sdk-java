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
package com.amazonaws.services.emrserverless.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The summary of attributes associated with an application.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-serverless-2021-07-13/ApplicationSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ApplicationSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the application.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The name of the application.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The ARN of the application.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The EMR release version associated with the application.
     * </p>
     */
    private String releaseLabel;
    /**
     * <p>
     * The type of application, such as Spark or Hive.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The state of the application.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The state details of the application.
     * </p>
     */
    private String stateDetails;
    /**
     * <p>
     * The date and time when the application was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The date and time when the application was last updated.
     * </p>
     */
    private java.util.Date updatedAt;
    /**
     * <p>
     * The CPU architecture of an application.
     * </p>
     */
    private String architecture;

    /**
     * <p>
     * The ID of the application.
     * </p>
     * 
     * @param id
     *        The ID of the application.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the application.
     * </p>
     * 
     * @return The ID of the application.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the application.
     * </p>
     * 
     * @param id
     *        The ID of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationSummary withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The name of the application.
     * </p>
     * 
     * @param name
     *        The name of the application.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the application.
     * </p>
     * 
     * @return The name of the application.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the application.
     * </p>
     * 
     * @param name
     *        The name of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationSummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The ARN of the application.
     * </p>
     * 
     * @param arn
     *        The ARN of the application.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the application.
     * </p>
     * 
     * @return The ARN of the application.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the application.
     * </p>
     * 
     * @param arn
     *        The ARN of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationSummary withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The EMR release version associated with the application.
     * </p>
     * 
     * @param releaseLabel
     *        The EMR release version associated with the application.
     */

    public void setReleaseLabel(String releaseLabel) {
        this.releaseLabel = releaseLabel;
    }

    /**
     * <p>
     * The EMR release version associated with the application.
     * </p>
     * 
     * @return The EMR release version associated with the application.
     */

    public String getReleaseLabel() {
        return this.releaseLabel;
    }

    /**
     * <p>
     * The EMR release version associated with the application.
     * </p>
     * 
     * @param releaseLabel
     *        The EMR release version associated with the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationSummary withReleaseLabel(String releaseLabel) {
        setReleaseLabel(releaseLabel);
        return this;
    }

    /**
     * <p>
     * The type of application, such as Spark or Hive.
     * </p>
     * 
     * @param type
     *        The type of application, such as Spark or Hive.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of application, such as Spark or Hive.
     * </p>
     * 
     * @return The type of application, such as Spark or Hive.
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of application, such as Spark or Hive.
     * </p>
     * 
     * @param type
     *        The type of application, such as Spark or Hive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationSummary withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The state of the application.
     * </p>
     * 
     * @param state
     *        The state of the application.
     * @see ApplicationState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the application.
     * </p>
     * 
     * @return The state of the application.
     * @see ApplicationState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the application.
     * </p>
     * 
     * @param state
     *        The state of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApplicationState
     */

    public ApplicationSummary withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of the application.
     * </p>
     * 
     * @param state
     *        The state of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApplicationState
     */

    public ApplicationSummary withState(ApplicationState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The state details of the application.
     * </p>
     * 
     * @param stateDetails
     *        The state details of the application.
     */

    public void setStateDetails(String stateDetails) {
        this.stateDetails = stateDetails;
    }

    /**
     * <p>
     * The state details of the application.
     * </p>
     * 
     * @return The state details of the application.
     */

    public String getStateDetails() {
        return this.stateDetails;
    }

    /**
     * <p>
     * The state details of the application.
     * </p>
     * 
     * @param stateDetails
     *        The state details of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationSummary withStateDetails(String stateDetails) {
        setStateDetails(stateDetails);
        return this;
    }

    /**
     * <p>
     * The date and time when the application was created.
     * </p>
     * 
     * @param createdAt
     *        The date and time when the application was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The date and time when the application was created.
     * </p>
     * 
     * @return The date and time when the application was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The date and time when the application was created.
     * </p>
     * 
     * @param createdAt
     *        The date and time when the application was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationSummary withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The date and time when the application was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The date and time when the application was last updated.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The date and time when the application was last updated.
     * </p>
     * 
     * @return The date and time when the application was last updated.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The date and time when the application was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The date and time when the application was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationSummary withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
        return this;
    }

    /**
     * <p>
     * The CPU architecture of an application.
     * </p>
     * 
     * @param architecture
     *        The CPU architecture of an application.
     * @see Architecture
     */

    public void setArchitecture(String architecture) {
        this.architecture = architecture;
    }

    /**
     * <p>
     * The CPU architecture of an application.
     * </p>
     * 
     * @return The CPU architecture of an application.
     * @see Architecture
     */

    public String getArchitecture() {
        return this.architecture;
    }

    /**
     * <p>
     * The CPU architecture of an application.
     * </p>
     * 
     * @param architecture
     *        The CPU architecture of an application.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Architecture
     */

    public ApplicationSummary withArchitecture(String architecture) {
        setArchitecture(architecture);
        return this;
    }

    /**
     * <p>
     * The CPU architecture of an application.
     * </p>
     * 
     * @param architecture
     *        The CPU architecture of an application.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Architecture
     */

    public ApplicationSummary withArchitecture(Architecture architecture) {
        this.architecture = architecture.toString();
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getReleaseLabel() != null)
            sb.append("ReleaseLabel: ").append(getReleaseLabel()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getStateDetails() != null)
            sb.append("StateDetails: ").append(getStateDetails()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt()).append(",");
        if (getArchitecture() != null)
            sb.append("Architecture: ").append(getArchitecture());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ApplicationSummary == false)
            return false;
        ApplicationSummary other = (ApplicationSummary) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getReleaseLabel() == null ^ this.getReleaseLabel() == null)
            return false;
        if (other.getReleaseLabel() != null && other.getReleaseLabel().equals(this.getReleaseLabel()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getStateDetails() == null ^ this.getStateDetails() == null)
            return false;
        if (other.getStateDetails() != null && other.getStateDetails().equals(this.getStateDetails()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        if (other.getArchitecture() == null ^ this.getArchitecture() == null)
            return false;
        if (other.getArchitecture() != null && other.getArchitecture().equals(this.getArchitecture()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getReleaseLabel() == null) ? 0 : getReleaseLabel().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getStateDetails() == null) ? 0 : getStateDetails().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getArchitecture() == null) ? 0 : getArchitecture().hashCode());
        return hashCode;
    }

    @Override
    public ApplicationSummary clone() {
        try {
            return (ApplicationSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.emrserverless.model.transform.ApplicationSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
