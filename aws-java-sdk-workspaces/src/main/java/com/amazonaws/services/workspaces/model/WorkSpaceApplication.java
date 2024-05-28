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
package com.amazonaws.services.workspaces.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the WorkSpace application.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/WorkSpaceApplication" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WorkSpaceApplication implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the application.
     * </p>
     */
    private String applicationId;
    /**
     * <p>
     * The time the application is created.
     * </p>
     */
    private java.util.Date created;
    /**
     * <p>
     * The description of the WorkSpace application.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The license availability for the applications.
     * </p>
     */
    private String licenseType;
    /**
     * <p>
     * The name of the WorkSpace application.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The owner of the WorkSpace application.
     * </p>
     */
    private String owner;
    /**
     * <p>
     * The status of WorkSpace application.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The supported compute types of the WorkSpace application.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> supportedComputeTypeNames;
    /**
     * <p>
     * The supported operating systems of the WorkSpace application.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> supportedOperatingSystemNames;

    /**
     * <p>
     * The identifier of the application.
     * </p>
     * 
     * @param applicationId
     *        The identifier of the application.
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The identifier of the application.
     * </p>
     * 
     * @return The identifier of the application.
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * <p>
     * The identifier of the application.
     * </p>
     * 
     * @param applicationId
     *        The identifier of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkSpaceApplication withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * <p>
     * The time the application is created.
     * </p>
     * 
     * @param created
     *        The time the application is created.
     */

    public void setCreated(java.util.Date created) {
        this.created = created;
    }

    /**
     * <p>
     * The time the application is created.
     * </p>
     * 
     * @return The time the application is created.
     */

    public java.util.Date getCreated() {
        return this.created;
    }

    /**
     * <p>
     * The time the application is created.
     * </p>
     * 
     * @param created
     *        The time the application is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkSpaceApplication withCreated(java.util.Date created) {
        setCreated(created);
        return this;
    }

    /**
     * <p>
     * The description of the WorkSpace application.
     * </p>
     * 
     * @param description
     *        The description of the WorkSpace application.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the WorkSpace application.
     * </p>
     * 
     * @return The description of the WorkSpace application.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the WorkSpace application.
     * </p>
     * 
     * @param description
     *        The description of the WorkSpace application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkSpaceApplication withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The license availability for the applications.
     * </p>
     * 
     * @param licenseType
     *        The license availability for the applications.
     * @see WorkSpaceApplicationLicenseType
     */

    public void setLicenseType(String licenseType) {
        this.licenseType = licenseType;
    }

    /**
     * <p>
     * The license availability for the applications.
     * </p>
     * 
     * @return The license availability for the applications.
     * @see WorkSpaceApplicationLicenseType
     */

    public String getLicenseType() {
        return this.licenseType;
    }

    /**
     * <p>
     * The license availability for the applications.
     * </p>
     * 
     * @param licenseType
     *        The license availability for the applications.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkSpaceApplicationLicenseType
     */

    public WorkSpaceApplication withLicenseType(String licenseType) {
        setLicenseType(licenseType);
        return this;
    }

    /**
     * <p>
     * The license availability for the applications.
     * </p>
     * 
     * @param licenseType
     *        The license availability for the applications.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkSpaceApplicationLicenseType
     */

    public WorkSpaceApplication withLicenseType(WorkSpaceApplicationLicenseType licenseType) {
        this.licenseType = licenseType.toString();
        return this;
    }

    /**
     * <p>
     * The name of the WorkSpace application.
     * </p>
     * 
     * @param name
     *        The name of the WorkSpace application.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the WorkSpace application.
     * </p>
     * 
     * @return The name of the WorkSpace application.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the WorkSpace application.
     * </p>
     * 
     * @param name
     *        The name of the WorkSpace application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkSpaceApplication withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The owner of the WorkSpace application.
     * </p>
     * 
     * @param owner
     *        The owner of the WorkSpace application.
     */

    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * <p>
     * The owner of the WorkSpace application.
     * </p>
     * 
     * @return The owner of the WorkSpace application.
     */

    public String getOwner() {
        return this.owner;
    }

    /**
     * <p>
     * The owner of the WorkSpace application.
     * </p>
     * 
     * @param owner
     *        The owner of the WorkSpace application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkSpaceApplication withOwner(String owner) {
        setOwner(owner);
        return this;
    }

    /**
     * <p>
     * The status of WorkSpace application.
     * </p>
     * 
     * @param state
     *        The status of WorkSpace application.
     * @see WorkSpaceApplicationState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The status of WorkSpace application.
     * </p>
     * 
     * @return The status of WorkSpace application.
     * @see WorkSpaceApplicationState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The status of WorkSpace application.
     * </p>
     * 
     * @param state
     *        The status of WorkSpace application.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkSpaceApplicationState
     */

    public WorkSpaceApplication withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The status of WorkSpace application.
     * </p>
     * 
     * @param state
     *        The status of WorkSpace application.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkSpaceApplicationState
     */

    public WorkSpaceApplication withState(WorkSpaceApplicationState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The supported compute types of the WorkSpace application.
     * </p>
     * 
     * @return The supported compute types of the WorkSpace application.
     * @see Compute
     */

    public java.util.List<String> getSupportedComputeTypeNames() {
        if (supportedComputeTypeNames == null) {
            supportedComputeTypeNames = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return supportedComputeTypeNames;
    }

    /**
     * <p>
     * The supported compute types of the WorkSpace application.
     * </p>
     * 
     * @param supportedComputeTypeNames
     *        The supported compute types of the WorkSpace application.
     * @see Compute
     */

    public void setSupportedComputeTypeNames(java.util.Collection<String> supportedComputeTypeNames) {
        if (supportedComputeTypeNames == null) {
            this.supportedComputeTypeNames = null;
            return;
        }

        this.supportedComputeTypeNames = new com.amazonaws.internal.SdkInternalList<String>(supportedComputeTypeNames);
    }

    /**
     * <p>
     * The supported compute types of the WorkSpace application.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSupportedComputeTypeNames(java.util.Collection)} or
     * {@link #withSupportedComputeTypeNames(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param supportedComputeTypeNames
     *        The supported compute types of the WorkSpace application.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Compute
     */

    public WorkSpaceApplication withSupportedComputeTypeNames(String... supportedComputeTypeNames) {
        if (this.supportedComputeTypeNames == null) {
            setSupportedComputeTypeNames(new com.amazonaws.internal.SdkInternalList<String>(supportedComputeTypeNames.length));
        }
        for (String ele : supportedComputeTypeNames) {
            this.supportedComputeTypeNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The supported compute types of the WorkSpace application.
     * </p>
     * 
     * @param supportedComputeTypeNames
     *        The supported compute types of the WorkSpace application.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Compute
     */

    public WorkSpaceApplication withSupportedComputeTypeNames(java.util.Collection<String> supportedComputeTypeNames) {
        setSupportedComputeTypeNames(supportedComputeTypeNames);
        return this;
    }

    /**
     * <p>
     * The supported compute types of the WorkSpace application.
     * </p>
     * 
     * @param supportedComputeTypeNames
     *        The supported compute types of the WorkSpace application.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Compute
     */

    public WorkSpaceApplication withSupportedComputeTypeNames(Compute... supportedComputeTypeNames) {
        com.amazonaws.internal.SdkInternalList<String> supportedComputeTypeNamesCopy = new com.amazonaws.internal.SdkInternalList<String>(
                supportedComputeTypeNames.length);
        for (Compute value : supportedComputeTypeNames) {
            supportedComputeTypeNamesCopy.add(value.toString());
        }
        if (getSupportedComputeTypeNames() == null) {
            setSupportedComputeTypeNames(supportedComputeTypeNamesCopy);
        } else {
            getSupportedComputeTypeNames().addAll(supportedComputeTypeNamesCopy);
        }
        return this;
    }

    /**
     * <p>
     * The supported operating systems of the WorkSpace application.
     * </p>
     * 
     * @return The supported operating systems of the WorkSpace application.
     * @see OperatingSystemName
     */

    public java.util.List<String> getSupportedOperatingSystemNames() {
        if (supportedOperatingSystemNames == null) {
            supportedOperatingSystemNames = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return supportedOperatingSystemNames;
    }

    /**
     * <p>
     * The supported operating systems of the WorkSpace application.
     * </p>
     * 
     * @param supportedOperatingSystemNames
     *        The supported operating systems of the WorkSpace application.
     * @see OperatingSystemName
     */

    public void setSupportedOperatingSystemNames(java.util.Collection<String> supportedOperatingSystemNames) {
        if (supportedOperatingSystemNames == null) {
            this.supportedOperatingSystemNames = null;
            return;
        }

        this.supportedOperatingSystemNames = new com.amazonaws.internal.SdkInternalList<String>(supportedOperatingSystemNames);
    }

    /**
     * <p>
     * The supported operating systems of the WorkSpace application.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSupportedOperatingSystemNames(java.util.Collection)} or
     * {@link #withSupportedOperatingSystemNames(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param supportedOperatingSystemNames
     *        The supported operating systems of the WorkSpace application.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OperatingSystemName
     */

    public WorkSpaceApplication withSupportedOperatingSystemNames(String... supportedOperatingSystemNames) {
        if (this.supportedOperatingSystemNames == null) {
            setSupportedOperatingSystemNames(new com.amazonaws.internal.SdkInternalList<String>(supportedOperatingSystemNames.length));
        }
        for (String ele : supportedOperatingSystemNames) {
            this.supportedOperatingSystemNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The supported operating systems of the WorkSpace application.
     * </p>
     * 
     * @param supportedOperatingSystemNames
     *        The supported operating systems of the WorkSpace application.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OperatingSystemName
     */

    public WorkSpaceApplication withSupportedOperatingSystemNames(java.util.Collection<String> supportedOperatingSystemNames) {
        setSupportedOperatingSystemNames(supportedOperatingSystemNames);
        return this;
    }

    /**
     * <p>
     * The supported operating systems of the WorkSpace application.
     * </p>
     * 
     * @param supportedOperatingSystemNames
     *        The supported operating systems of the WorkSpace application.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OperatingSystemName
     */

    public WorkSpaceApplication withSupportedOperatingSystemNames(OperatingSystemName... supportedOperatingSystemNames) {
        com.amazonaws.internal.SdkInternalList<String> supportedOperatingSystemNamesCopy = new com.amazonaws.internal.SdkInternalList<String>(
                supportedOperatingSystemNames.length);
        for (OperatingSystemName value : supportedOperatingSystemNames) {
            supportedOperatingSystemNamesCopy.add(value.toString());
        }
        if (getSupportedOperatingSystemNames() == null) {
            setSupportedOperatingSystemNames(supportedOperatingSystemNamesCopy);
        } else {
            getSupportedOperatingSystemNames().addAll(supportedOperatingSystemNamesCopy);
        }
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
        if (getApplicationId() != null)
            sb.append("ApplicationId: ").append(getApplicationId()).append(",");
        if (getCreated() != null)
            sb.append("Created: ").append(getCreated()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getLicenseType() != null)
            sb.append("LicenseType: ").append(getLicenseType()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getOwner() != null)
            sb.append("Owner: ").append(getOwner()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getSupportedComputeTypeNames() != null)
            sb.append("SupportedComputeTypeNames: ").append(getSupportedComputeTypeNames()).append(",");
        if (getSupportedOperatingSystemNames() != null)
            sb.append("SupportedOperatingSystemNames: ").append(getSupportedOperatingSystemNames());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WorkSpaceApplication == false)
            return false;
        WorkSpaceApplication other = (WorkSpaceApplication) obj;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getCreated() == null ^ this.getCreated() == null)
            return false;
        if (other.getCreated() != null && other.getCreated().equals(this.getCreated()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getLicenseType() == null ^ this.getLicenseType() == null)
            return false;
        if (other.getLicenseType() != null && other.getLicenseType().equals(this.getLicenseType()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getOwner() == null ^ this.getOwner() == null)
            return false;
        if (other.getOwner() != null && other.getOwner().equals(this.getOwner()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getSupportedComputeTypeNames() == null ^ this.getSupportedComputeTypeNames() == null)
            return false;
        if (other.getSupportedComputeTypeNames() != null && other.getSupportedComputeTypeNames().equals(this.getSupportedComputeTypeNames()) == false)
            return false;
        if (other.getSupportedOperatingSystemNames() == null ^ this.getSupportedOperatingSystemNames() == null)
            return false;
        if (other.getSupportedOperatingSystemNames() != null
                && other.getSupportedOperatingSystemNames().equals(this.getSupportedOperatingSystemNames()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getCreated() == null) ? 0 : getCreated().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getLicenseType() == null) ? 0 : getLicenseType().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getOwner() == null) ? 0 : getOwner().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getSupportedComputeTypeNames() == null) ? 0 : getSupportedComputeTypeNames().hashCode());
        hashCode = prime * hashCode + ((getSupportedOperatingSystemNames() == null) ? 0 : getSupportedOperatingSystemNames().hashCode());
        return hashCode;
    }

    @Override
    public WorkSpaceApplication clone() {
        try {
            return (WorkSpaceApplication) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.workspaces.model.transform.WorkSpaceApplicationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
