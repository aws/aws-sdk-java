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
package com.amazonaws.services.mobile.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Detailed information about an AWS Mobile Hub project.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mobile-2017-07-01/ProjectDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProjectDetails implements Serializable, Cloneable, StructuredPojo {

    private String name;

    private String projectId;

    private String region;

    private String state;
    /**
     * <p>
     * Date the project was created.
     * </p>
     */
    private java.util.Date createdDate;
    /**
     * <p>
     * Date of the last modification of the project.
     * </p>
     */
    private java.util.Date lastUpdatedDate;
    /**
     * <p>
     * Website URL for this project in the AWS Mobile Hub console.
     * </p>
     */
    private String consoleUrl;

    private java.util.List<Resource> resources;

    /**
     * @param name
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return
     */

    public String getName() {
        return this.name;
    }

    /**
     * @param name
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectDetails withName(String name) {
        setName(name);
        return this;
    }

    /**
     * @param projectId
     */

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    /**
     * @return
     */

    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @param projectId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectDetails withProjectId(String projectId) {
        setProjectId(projectId);
        return this;
    }

    /**
     * @param region
     */

    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * @return
     */

    public String getRegion() {
        return this.region;
    }

    /**
     * @param region
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectDetails withRegion(String region) {
        setRegion(region);
        return this;
    }

    /**
     * @param state
     * @see ProjectState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * @return
     * @see ProjectState
     */

    public String getState() {
        return this.state;
    }

    /**
     * @param state
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProjectState
     */

    public ProjectDetails withState(String state) {
        setState(state);
        return this;
    }

    /**
     * @param state
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProjectState
     */

    public ProjectDetails withState(ProjectState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * Date the project was created.
     * </p>
     * 
     * @param createdDate
     *        Date the project was created.
     */

    public void setCreatedDate(java.util.Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * <p>
     * Date the project was created.
     * </p>
     * 
     * @return Date the project was created.
     */

    public java.util.Date getCreatedDate() {
        return this.createdDate;
    }

    /**
     * <p>
     * Date the project was created.
     * </p>
     * 
     * @param createdDate
     *        Date the project was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectDetails withCreatedDate(java.util.Date createdDate) {
        setCreatedDate(createdDate);
        return this;
    }

    /**
     * <p>
     * Date of the last modification of the project.
     * </p>
     * 
     * @param lastUpdatedDate
     *        Date of the last modification of the project.
     */

    public void setLastUpdatedDate(java.util.Date lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }

    /**
     * <p>
     * Date of the last modification of the project.
     * </p>
     * 
     * @return Date of the last modification of the project.
     */

    public java.util.Date getLastUpdatedDate() {
        return this.lastUpdatedDate;
    }

    /**
     * <p>
     * Date of the last modification of the project.
     * </p>
     * 
     * @param lastUpdatedDate
     *        Date of the last modification of the project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectDetails withLastUpdatedDate(java.util.Date lastUpdatedDate) {
        setLastUpdatedDate(lastUpdatedDate);
        return this;
    }

    /**
     * <p>
     * Website URL for this project in the AWS Mobile Hub console.
     * </p>
     * 
     * @param consoleUrl
     *        Website URL for this project in the AWS Mobile Hub console.
     */

    public void setConsoleUrl(String consoleUrl) {
        this.consoleUrl = consoleUrl;
    }

    /**
     * <p>
     * Website URL for this project in the AWS Mobile Hub console.
     * </p>
     * 
     * @return Website URL for this project in the AWS Mobile Hub console.
     */

    public String getConsoleUrl() {
        return this.consoleUrl;
    }

    /**
     * <p>
     * Website URL for this project in the AWS Mobile Hub console.
     * </p>
     * 
     * @param consoleUrl
     *        Website URL for this project in the AWS Mobile Hub console.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectDetails withConsoleUrl(String consoleUrl) {
        setConsoleUrl(consoleUrl);
        return this;
    }

    /**
     * @return
     */

    public java.util.List<Resource> getResources() {
        return resources;
    }

    /**
     * @param resources
     */

    public void setResources(java.util.Collection<Resource> resources) {
        if (resources == null) {
            this.resources = null;
            return;
        }

        this.resources = new java.util.ArrayList<Resource>(resources);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResources(java.util.Collection)} or {@link #withResources(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param resources
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectDetails withResources(Resource... resources) {
        if (this.resources == null) {
            setResources(new java.util.ArrayList<Resource>(resources.length));
        }
        for (Resource ele : resources) {
            this.resources.add(ele);
        }
        return this;
    }

    /**
     * @param resources
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectDetails withResources(java.util.Collection<Resource> resources) {
        setResources(resources);
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
        if (getProjectId() != null)
            sb.append("ProjectId: ").append(getProjectId()).append(",");
        if (getRegion() != null)
            sb.append("Region: ").append(getRegion()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getCreatedDate() != null)
            sb.append("CreatedDate: ").append(getCreatedDate()).append(",");
        if (getLastUpdatedDate() != null)
            sb.append("LastUpdatedDate: ").append(getLastUpdatedDate()).append(",");
        if (getConsoleUrl() != null)
            sb.append("ConsoleUrl: ").append(getConsoleUrl()).append(",");
        if (getResources() != null)
            sb.append("Resources: ").append(getResources());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProjectDetails == false)
            return false;
        ProjectDetails other = (ProjectDetails) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getProjectId() == null ^ this.getProjectId() == null)
            return false;
        if (other.getProjectId() != null && other.getProjectId().equals(this.getProjectId()) == false)
            return false;
        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getCreatedDate() == null ^ this.getCreatedDate() == null)
            return false;
        if (other.getCreatedDate() != null && other.getCreatedDate().equals(this.getCreatedDate()) == false)
            return false;
        if (other.getLastUpdatedDate() == null ^ this.getLastUpdatedDate() == null)
            return false;
        if (other.getLastUpdatedDate() != null && other.getLastUpdatedDate().equals(this.getLastUpdatedDate()) == false)
            return false;
        if (other.getConsoleUrl() == null ^ this.getConsoleUrl() == null)
            return false;
        if (other.getConsoleUrl() != null && other.getConsoleUrl().equals(this.getConsoleUrl()) == false)
            return false;
        if (other.getResources() == null ^ this.getResources() == null)
            return false;
        if (other.getResources() != null && other.getResources().equals(this.getResources()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getProjectId() == null) ? 0 : getProjectId().hashCode());
        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getCreatedDate() == null) ? 0 : getCreatedDate().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedDate() == null) ? 0 : getLastUpdatedDate().hashCode());
        hashCode = prime * hashCode + ((getConsoleUrl() == null) ? 0 : getConsoleUrl().hashCode());
        hashCode = prime * hashCode + ((getResources() == null) ? 0 : getResources().hashCode());
        return hashCode;
    }

    @Override
    public ProjectDetails clone() {
        try {
            return (ProjectDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mobile.model.transform.ProjectDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
