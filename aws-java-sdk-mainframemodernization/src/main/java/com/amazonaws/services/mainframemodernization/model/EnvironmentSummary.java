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
package com.amazonaws.services.mainframemodernization.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains a subset of the possible runtime environment attributes. Used in the environment list.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/EnvironmentSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EnvironmentSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The timestamp when the runtime environment was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The target platform for the runtime environment.
     * </p>
     */
    private String engineType;
    /**
     * <p>
     * The version of the runtime engine.
     * </p>
     */
    private String engineVersion;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of a particular runtime environment.
     * </p>
     */
    private String environmentArn;
    /**
     * <p>
     * The unique identifier of a particular runtime environment.
     * </p>
     */
    private String environmentId;
    /**
     * <p>
     * The instance type of the runtime environment.
     * </p>
     */
    private String instanceType;
    /**
     * <p>
     * The name of the runtime environment.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The status of the runtime environment
     * </p>
     */
    private String status;

    /**
     * <p>
     * The timestamp when the runtime environment was created.
     * </p>
     * 
     * @param creationTime
     *        The timestamp when the runtime environment was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The timestamp when the runtime environment was created.
     * </p>
     * 
     * @return The timestamp when the runtime environment was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The timestamp when the runtime environment was created.
     * </p>
     * 
     * @param creationTime
     *        The timestamp when the runtime environment was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnvironmentSummary withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The target platform for the runtime environment.
     * </p>
     * 
     * @param engineType
     *        The target platform for the runtime environment.
     * @see EngineType
     */

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    /**
     * <p>
     * The target platform for the runtime environment.
     * </p>
     * 
     * @return The target platform for the runtime environment.
     * @see EngineType
     */

    public String getEngineType() {
        return this.engineType;
    }

    /**
     * <p>
     * The target platform for the runtime environment.
     * </p>
     * 
     * @param engineType
     *        The target platform for the runtime environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EngineType
     */

    public EnvironmentSummary withEngineType(String engineType) {
        setEngineType(engineType);
        return this;
    }

    /**
     * <p>
     * The target platform for the runtime environment.
     * </p>
     * 
     * @param engineType
     *        The target platform for the runtime environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EngineType
     */

    public EnvironmentSummary withEngineType(EngineType engineType) {
        this.engineType = engineType.toString();
        return this;
    }

    /**
     * <p>
     * The version of the runtime engine.
     * </p>
     * 
     * @param engineVersion
     *        The version of the runtime engine.
     */

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * The version of the runtime engine.
     * </p>
     * 
     * @return The version of the runtime engine.
     */

    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * <p>
     * The version of the runtime engine.
     * </p>
     * 
     * @param engineVersion
     *        The version of the runtime engine.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnvironmentSummary withEngineVersion(String engineVersion) {
        setEngineVersion(engineVersion);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a particular runtime environment.
     * </p>
     * 
     * @param environmentArn
     *        The Amazon Resource Name (ARN) of a particular runtime environment.
     */

    public void setEnvironmentArn(String environmentArn) {
        this.environmentArn = environmentArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a particular runtime environment.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of a particular runtime environment.
     */

    public String getEnvironmentArn() {
        return this.environmentArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a particular runtime environment.
     * </p>
     * 
     * @param environmentArn
     *        The Amazon Resource Name (ARN) of a particular runtime environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnvironmentSummary withEnvironmentArn(String environmentArn) {
        setEnvironmentArn(environmentArn);
        return this;
    }

    /**
     * <p>
     * The unique identifier of a particular runtime environment.
     * </p>
     * 
     * @param environmentId
     *        The unique identifier of a particular runtime environment.
     */

    public void setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
    }

    /**
     * <p>
     * The unique identifier of a particular runtime environment.
     * </p>
     * 
     * @return The unique identifier of a particular runtime environment.
     */

    public String getEnvironmentId() {
        return this.environmentId;
    }

    /**
     * <p>
     * The unique identifier of a particular runtime environment.
     * </p>
     * 
     * @param environmentId
     *        The unique identifier of a particular runtime environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnvironmentSummary withEnvironmentId(String environmentId) {
        setEnvironmentId(environmentId);
        return this;
    }

    /**
     * <p>
     * The instance type of the runtime environment.
     * </p>
     * 
     * @param instanceType
     *        The instance type of the runtime environment.
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The instance type of the runtime environment.
     * </p>
     * 
     * @return The instance type of the runtime environment.
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * The instance type of the runtime environment.
     * </p>
     * 
     * @param instanceType
     *        The instance type of the runtime environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnvironmentSummary withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * <p>
     * The name of the runtime environment.
     * </p>
     * 
     * @param name
     *        The name of the runtime environment.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the runtime environment.
     * </p>
     * 
     * @return The name of the runtime environment.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the runtime environment.
     * </p>
     * 
     * @param name
     *        The name of the runtime environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnvironmentSummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The status of the runtime environment
     * </p>
     * 
     * @param status
     *        The status of the runtime environment
     * @see EnvironmentLifecycle
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the runtime environment
     * </p>
     * 
     * @return The status of the runtime environment
     * @see EnvironmentLifecycle
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the runtime environment
     * </p>
     * 
     * @param status
     *        The status of the runtime environment
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EnvironmentLifecycle
     */

    public EnvironmentSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the runtime environment
     * </p>
     * 
     * @param status
     *        The status of the runtime environment
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EnvironmentLifecycle
     */

    public EnvironmentSummary withStatus(EnvironmentLifecycle status) {
        this.status = status.toString();
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
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getEngineType() != null)
            sb.append("EngineType: ").append(getEngineType()).append(",");
        if (getEngineVersion() != null)
            sb.append("EngineVersion: ").append(getEngineVersion()).append(",");
        if (getEnvironmentArn() != null)
            sb.append("EnvironmentArn: ").append(getEnvironmentArn()).append(",");
        if (getEnvironmentId() != null)
            sb.append("EnvironmentId: ").append(getEnvironmentId()).append(",");
        if (getInstanceType() != null)
            sb.append("InstanceType: ").append(getInstanceType()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EnvironmentSummary == false)
            return false;
        EnvironmentSummary other = (EnvironmentSummary) obj;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getEngineType() == null ^ this.getEngineType() == null)
            return false;
        if (other.getEngineType() != null && other.getEngineType().equals(this.getEngineType()) == false)
            return false;
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null)
            return false;
        if (other.getEngineVersion() != null && other.getEngineVersion().equals(this.getEngineVersion()) == false)
            return false;
        if (other.getEnvironmentArn() == null ^ this.getEnvironmentArn() == null)
            return false;
        if (other.getEnvironmentArn() != null && other.getEnvironmentArn().equals(this.getEnvironmentArn()) == false)
            return false;
        if (other.getEnvironmentId() == null ^ this.getEnvironmentId() == null)
            return false;
        if (other.getEnvironmentId() != null && other.getEnvironmentId().equals(this.getEnvironmentId()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getEngineType() == null) ? 0 : getEngineType().hashCode());
        hashCode = prime * hashCode + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentArn() == null) ? 0 : getEnvironmentArn().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentId() == null) ? 0 : getEnvironmentId().hashCode());
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public EnvironmentSummary clone() {
        try {
            return (EnvironmentSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mainframemodernization.model.transform.EnvironmentSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
