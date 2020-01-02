/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Dashboard version.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DashboardVersion" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DashboardVersion implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The time that this dashboard version was created.
     * </p>
     */
    private java.util.Date createdTime;
    /**
     * <p>
     * Errors.
     * </p>
     */
    private java.util.List<DashboardError> errors;
    /**
     * <p>
     * Version number.
     * </p>
     */
    private Long versionNumber;
    /**
     * <p>
     * The HTTP status of the request.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * Source entity ARN.
     * </p>
     */
    private String sourceEntityArn;
    /**
     * <p>
     * Description.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The time that this dashboard version was created.
     * </p>
     * 
     * @param createdTime
     *        The time that this dashboard version was created.
     */

    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * The time that this dashboard version was created.
     * </p>
     * 
     * @return The time that this dashboard version was created.
     */

    public java.util.Date getCreatedTime() {
        return this.createdTime;
    }

    /**
     * <p>
     * The time that this dashboard version was created.
     * </p>
     * 
     * @param createdTime
     *        The time that this dashboard version was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DashboardVersion withCreatedTime(java.util.Date createdTime) {
        setCreatedTime(createdTime);
        return this;
    }

    /**
     * <p>
     * Errors.
     * </p>
     * 
     * @return Errors.
     */

    public java.util.List<DashboardError> getErrors() {
        return errors;
    }

    /**
     * <p>
     * Errors.
     * </p>
     * 
     * @param errors
     *        Errors.
     */

    public void setErrors(java.util.Collection<DashboardError> errors) {
        if (errors == null) {
            this.errors = null;
            return;
        }

        this.errors = new java.util.ArrayList<DashboardError>(errors);
    }

    /**
     * <p>
     * Errors.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setErrors(java.util.Collection)} or {@link #withErrors(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param errors
     *        Errors.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DashboardVersion withErrors(DashboardError... errors) {
        if (this.errors == null) {
            setErrors(new java.util.ArrayList<DashboardError>(errors.length));
        }
        for (DashboardError ele : errors) {
            this.errors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Errors.
     * </p>
     * 
     * @param errors
     *        Errors.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DashboardVersion withErrors(java.util.Collection<DashboardError> errors) {
        setErrors(errors);
        return this;
    }

    /**
     * <p>
     * Version number.
     * </p>
     * 
     * @param versionNumber
     *        Version number.
     */

    public void setVersionNumber(Long versionNumber) {
        this.versionNumber = versionNumber;
    }

    /**
     * <p>
     * Version number.
     * </p>
     * 
     * @return Version number.
     */

    public Long getVersionNumber() {
        return this.versionNumber;
    }

    /**
     * <p>
     * Version number.
     * </p>
     * 
     * @param versionNumber
     *        Version number.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DashboardVersion withVersionNumber(Long versionNumber) {
        setVersionNumber(versionNumber);
        return this;
    }

    /**
     * <p>
     * The HTTP status of the request.
     * </p>
     * 
     * @param status
     *        The HTTP status of the request.
     * @see ResourceStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The HTTP status of the request.
     * </p>
     * 
     * @return The HTTP status of the request.
     * @see ResourceStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The HTTP status of the request.
     * </p>
     * 
     * @param status
     *        The HTTP status of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceStatus
     */

    public DashboardVersion withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The HTTP status of the request.
     * </p>
     * 
     * @param status
     *        The HTTP status of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceStatus
     */

    public DashboardVersion withStatus(ResourceStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the resource.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the resource.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DashboardVersion withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * Source entity ARN.
     * </p>
     * 
     * @param sourceEntityArn
     *        Source entity ARN.
     */

    public void setSourceEntityArn(String sourceEntityArn) {
        this.sourceEntityArn = sourceEntityArn;
    }

    /**
     * <p>
     * Source entity ARN.
     * </p>
     * 
     * @return Source entity ARN.
     */

    public String getSourceEntityArn() {
        return this.sourceEntityArn;
    }

    /**
     * <p>
     * Source entity ARN.
     * </p>
     * 
     * @param sourceEntityArn
     *        Source entity ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DashboardVersion withSourceEntityArn(String sourceEntityArn) {
        setSourceEntityArn(sourceEntityArn);
        return this;
    }

    /**
     * <p>
     * Description.
     * </p>
     * 
     * @param description
     *        Description.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Description.
     * </p>
     * 
     * @return Description.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * Description.
     * </p>
     * 
     * @param description
     *        Description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DashboardVersion withDescription(String description) {
        setDescription(description);
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
        if (getCreatedTime() != null)
            sb.append("CreatedTime: ").append(getCreatedTime()).append(",");
        if (getErrors() != null)
            sb.append("Errors: ").append(getErrors()).append(",");
        if (getVersionNumber() != null)
            sb.append("VersionNumber: ").append(getVersionNumber()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getSourceEntityArn() != null)
            sb.append("SourceEntityArn: ").append(getSourceEntityArn()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DashboardVersion == false)
            return false;
        DashboardVersion other = (DashboardVersion) obj;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        if (other.getErrors() == null ^ this.getErrors() == null)
            return false;
        if (other.getErrors() != null && other.getErrors().equals(this.getErrors()) == false)
            return false;
        if (other.getVersionNumber() == null ^ this.getVersionNumber() == null)
            return false;
        if (other.getVersionNumber() != null && other.getVersionNumber().equals(this.getVersionNumber()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getSourceEntityArn() == null ^ this.getSourceEntityArn() == null)
            return false;
        if (other.getSourceEntityArn() != null && other.getSourceEntityArn().equals(this.getSourceEntityArn()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode + ((getErrors() == null) ? 0 : getErrors().hashCode());
        hashCode = prime * hashCode + ((getVersionNumber() == null) ? 0 : getVersionNumber().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getSourceEntityArn() == null) ? 0 : getSourceEntityArn().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public DashboardVersion clone() {
        try {
            return (DashboardVersion) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.DashboardVersionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
