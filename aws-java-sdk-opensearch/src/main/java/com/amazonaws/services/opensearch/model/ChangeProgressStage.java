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
package com.amazonaws.services.opensearch.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Progress details for each stage of a domain update.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ChangeProgressStage implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the stage.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The status of the stage.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The description of the stage.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The most recent updated timestamp of the stage.
     * </p>
     */
    private java.util.Date lastUpdated;

    /**
     * <p>
     * The name of the stage.
     * </p>
     * 
     * @param name
     *        The name of the stage.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the stage.
     * </p>
     * 
     * @return The name of the stage.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the stage.
     * </p>
     * 
     * @param name
     *        The name of the stage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChangeProgressStage withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The status of the stage.
     * </p>
     * 
     * @param status
     *        The status of the stage.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the stage.
     * </p>
     * 
     * @return The status of the stage.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the stage.
     * </p>
     * 
     * @param status
     *        The status of the stage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChangeProgressStage withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The description of the stage.
     * </p>
     * 
     * @param description
     *        The description of the stage.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the stage.
     * </p>
     * 
     * @return The description of the stage.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the stage.
     * </p>
     * 
     * @param description
     *        The description of the stage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChangeProgressStage withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The most recent updated timestamp of the stage.
     * </p>
     * 
     * @param lastUpdated
     *        The most recent updated timestamp of the stage.
     */

    public void setLastUpdated(java.util.Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    /**
     * <p>
     * The most recent updated timestamp of the stage.
     * </p>
     * 
     * @return The most recent updated timestamp of the stage.
     */

    public java.util.Date getLastUpdated() {
        return this.lastUpdated;
    }

    /**
     * <p>
     * The most recent updated timestamp of the stage.
     * </p>
     * 
     * @param lastUpdated
     *        The most recent updated timestamp of the stage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChangeProgressStage withLastUpdated(java.util.Date lastUpdated) {
        setLastUpdated(lastUpdated);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getLastUpdated() != null)
            sb.append("LastUpdated: ").append(getLastUpdated());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ChangeProgressStage == false)
            return false;
        ChangeProgressStage other = (ChangeProgressStage) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getLastUpdated() == null ^ this.getLastUpdated() == null)
            return false;
        if (other.getLastUpdated() != null && other.getLastUpdated().equals(this.getLastUpdated()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getLastUpdated() == null) ? 0 : getLastUpdated().hashCode());
        return hashCode;
    }

    @Override
    public ChangeProgressStage clone() {
        try {
            return (ChangeProgressStage) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.opensearch.model.transform.ChangeProgressStageMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
