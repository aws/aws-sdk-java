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
package com.amazonaws.services.ssmincidents.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a specific CodeDeploy deployment or CloudFormation stack creation or update that occurred around
 * the time of a reported incident. These activities can be investigated as a potential cause of the incident.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/Finding" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Finding implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The timestamp for when a finding was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * Details about the finding.
     * </p>
     */
    private FindingDetails details;
    /**
     * <p>
     * The ID assigned to the finding.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The timestamp for when the finding was most recently updated with additional information.
     * </p>
     */
    private java.util.Date lastModifiedTime;

    /**
     * <p>
     * The timestamp for when a finding was created.
     * </p>
     * 
     * @param creationTime
     *        The timestamp for when a finding was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The timestamp for when a finding was created.
     * </p>
     * 
     * @return The timestamp for when a finding was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The timestamp for when a finding was created.
     * </p>
     * 
     * @param creationTime
     *        The timestamp for when a finding was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Finding withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * Details about the finding.
     * </p>
     * 
     * @param details
     *        Details about the finding.
     */

    public void setDetails(FindingDetails details) {
        this.details = details;
    }

    /**
     * <p>
     * Details about the finding.
     * </p>
     * 
     * @return Details about the finding.
     */

    public FindingDetails getDetails() {
        return this.details;
    }

    /**
     * <p>
     * Details about the finding.
     * </p>
     * 
     * @param details
     *        Details about the finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Finding withDetails(FindingDetails details) {
        setDetails(details);
        return this;
    }

    /**
     * <p>
     * The ID assigned to the finding.
     * </p>
     * 
     * @param id
     *        The ID assigned to the finding.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID assigned to the finding.
     * </p>
     * 
     * @return The ID assigned to the finding.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID assigned to the finding.
     * </p>
     * 
     * @param id
     *        The ID assigned to the finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Finding withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The timestamp for when the finding was most recently updated with additional information.
     * </p>
     * 
     * @param lastModifiedTime
     *        The timestamp for when the finding was most recently updated with additional information.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * The timestamp for when the finding was most recently updated with additional information.
     * </p>
     * 
     * @return The timestamp for when the finding was most recently updated with additional information.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * The timestamp for when the finding was most recently updated with additional information.
     * </p>
     * 
     * @param lastModifiedTime
     *        The timestamp for when the finding was most recently updated with additional information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Finding withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
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
        if (getDetails() != null)
            sb.append("Details: ").append(getDetails()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Finding == false)
            return false;
        Finding other = (Finding) obj;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getDetails() == null ^ this.getDetails() == null)
            return false;
        if (other.getDetails() != null && other.getDetails().equals(this.getDetails()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getDetails() == null) ? 0 : getDetails().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        return hashCode;
    }

    @Override
    public Finding clone() {
        try {
            return (Finding) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ssmincidents.model.transform.FindingMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
