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
package com.amazonaws.services.amplifyuibuilder.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A summary of the basic information about the code generation job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifyuibuilder-2021-08-11/CodegenJobSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CodegenJobSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique ID of the Amplify app associated with the code generation job.
     * </p>
     */
    private String appId;
    /**
     * <p>
     * The name of the backend environment associated with the code generation job.
     * </p>
     */
    private String environmentName;
    /**
     * <p>
     * The unique ID for the code generation job summary.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The time that the code generation job summary was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The time that the code generation job summary was modified.
     * </p>
     */
    private java.util.Date modifiedAt;

    /**
     * <p>
     * The unique ID of the Amplify app associated with the code generation job.
     * </p>
     * 
     * @param appId
     *        The unique ID of the Amplify app associated with the code generation job.
     */

    public void setAppId(String appId) {
        this.appId = appId;
    }

    /**
     * <p>
     * The unique ID of the Amplify app associated with the code generation job.
     * </p>
     * 
     * @return The unique ID of the Amplify app associated with the code generation job.
     */

    public String getAppId() {
        return this.appId;
    }

    /**
     * <p>
     * The unique ID of the Amplify app associated with the code generation job.
     * </p>
     * 
     * @param appId
     *        The unique ID of the Amplify app associated with the code generation job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodegenJobSummary withAppId(String appId) {
        setAppId(appId);
        return this;
    }

    /**
     * <p>
     * The name of the backend environment associated with the code generation job.
     * </p>
     * 
     * @param environmentName
     *        The name of the backend environment associated with the code generation job.
     */

    public void setEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
    }

    /**
     * <p>
     * The name of the backend environment associated with the code generation job.
     * </p>
     * 
     * @return The name of the backend environment associated with the code generation job.
     */

    public String getEnvironmentName() {
        return this.environmentName;
    }

    /**
     * <p>
     * The name of the backend environment associated with the code generation job.
     * </p>
     * 
     * @param environmentName
     *        The name of the backend environment associated with the code generation job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodegenJobSummary withEnvironmentName(String environmentName) {
        setEnvironmentName(environmentName);
        return this;
    }

    /**
     * <p>
     * The unique ID for the code generation job summary.
     * </p>
     * 
     * @param id
     *        The unique ID for the code generation job summary.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique ID for the code generation job summary.
     * </p>
     * 
     * @return The unique ID for the code generation job summary.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique ID for the code generation job summary.
     * </p>
     * 
     * @param id
     *        The unique ID for the code generation job summary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodegenJobSummary withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The time that the code generation job summary was created.
     * </p>
     * 
     * @param createdAt
     *        The time that the code generation job summary was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The time that the code generation job summary was created.
     * </p>
     * 
     * @return The time that the code generation job summary was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The time that the code generation job summary was created.
     * </p>
     * 
     * @param createdAt
     *        The time that the code generation job summary was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodegenJobSummary withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The time that the code generation job summary was modified.
     * </p>
     * 
     * @param modifiedAt
     *        The time that the code generation job summary was modified.
     */

    public void setModifiedAt(java.util.Date modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    /**
     * <p>
     * The time that the code generation job summary was modified.
     * </p>
     * 
     * @return The time that the code generation job summary was modified.
     */

    public java.util.Date getModifiedAt() {
        return this.modifiedAt;
    }

    /**
     * <p>
     * The time that the code generation job summary was modified.
     * </p>
     * 
     * @param modifiedAt
     *        The time that the code generation job summary was modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodegenJobSummary withModifiedAt(java.util.Date modifiedAt) {
        setModifiedAt(modifiedAt);
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
        if (getAppId() != null)
            sb.append("AppId: ").append(getAppId()).append(",");
        if (getEnvironmentName() != null)
            sb.append("EnvironmentName: ").append(getEnvironmentName()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getModifiedAt() != null)
            sb.append("ModifiedAt: ").append(getModifiedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CodegenJobSummary == false)
            return false;
        CodegenJobSummary other = (CodegenJobSummary) obj;
        if (other.getAppId() == null ^ this.getAppId() == null)
            return false;
        if (other.getAppId() != null && other.getAppId().equals(this.getAppId()) == false)
            return false;
        if (other.getEnvironmentName() == null ^ this.getEnvironmentName() == null)
            return false;
        if (other.getEnvironmentName() != null && other.getEnvironmentName().equals(this.getEnvironmentName()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getModifiedAt() == null ^ this.getModifiedAt() == null)
            return false;
        if (other.getModifiedAt() != null && other.getModifiedAt().equals(this.getModifiedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAppId() == null) ? 0 : getAppId().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentName() == null) ? 0 : getEnvironmentName().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getModifiedAt() == null) ? 0 : getModifiedAt().hashCode());
        return hashCode;
    }

    @Override
    public CodegenJobSummary clone() {
        try {
            return (CodegenJobSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.amplifyuibuilder.model.transform.CodegenJobSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
