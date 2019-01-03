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
package com.amazonaws.services.codedeploy.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about an application revision.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/GenericRevisionInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GenericRevisionInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A comment about the revision.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The deployment groups for which this is the current target revision.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> deploymentGroups;
    /**
     * <p>
     * When the revision was first used by AWS CodeDeploy.
     * </p>
     */
    private java.util.Date firstUsedTime;
    /**
     * <p>
     * When the revision was last used by AWS CodeDeploy.
     * </p>
     */
    private java.util.Date lastUsedTime;
    /**
     * <p>
     * When the revision was registered with AWS CodeDeploy.
     * </p>
     */
    private java.util.Date registerTime;

    /**
     * <p>
     * A comment about the revision.
     * </p>
     * 
     * @param description
     *        A comment about the revision.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A comment about the revision.
     * </p>
     * 
     * @return A comment about the revision.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A comment about the revision.
     * </p>
     * 
     * @param description
     *        A comment about the revision.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GenericRevisionInfo withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The deployment groups for which this is the current target revision.
     * </p>
     * 
     * @return The deployment groups for which this is the current target revision.
     */

    public java.util.List<String> getDeploymentGroups() {
        if (deploymentGroups == null) {
            deploymentGroups = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return deploymentGroups;
    }

    /**
     * <p>
     * The deployment groups for which this is the current target revision.
     * </p>
     * 
     * @param deploymentGroups
     *        The deployment groups for which this is the current target revision.
     */

    public void setDeploymentGroups(java.util.Collection<String> deploymentGroups) {
        if (deploymentGroups == null) {
            this.deploymentGroups = null;
            return;
        }

        this.deploymentGroups = new com.amazonaws.internal.SdkInternalList<String>(deploymentGroups);
    }

    /**
     * <p>
     * The deployment groups for which this is the current target revision.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDeploymentGroups(java.util.Collection)} or {@link #withDeploymentGroups(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param deploymentGroups
     *        The deployment groups for which this is the current target revision.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GenericRevisionInfo withDeploymentGroups(String... deploymentGroups) {
        if (this.deploymentGroups == null) {
            setDeploymentGroups(new com.amazonaws.internal.SdkInternalList<String>(deploymentGroups.length));
        }
        for (String ele : deploymentGroups) {
            this.deploymentGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The deployment groups for which this is the current target revision.
     * </p>
     * 
     * @param deploymentGroups
     *        The deployment groups for which this is the current target revision.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GenericRevisionInfo withDeploymentGroups(java.util.Collection<String> deploymentGroups) {
        setDeploymentGroups(deploymentGroups);
        return this;
    }

    /**
     * <p>
     * When the revision was first used by AWS CodeDeploy.
     * </p>
     * 
     * @param firstUsedTime
     *        When the revision was first used by AWS CodeDeploy.
     */

    public void setFirstUsedTime(java.util.Date firstUsedTime) {
        this.firstUsedTime = firstUsedTime;
    }

    /**
     * <p>
     * When the revision was first used by AWS CodeDeploy.
     * </p>
     * 
     * @return When the revision was first used by AWS CodeDeploy.
     */

    public java.util.Date getFirstUsedTime() {
        return this.firstUsedTime;
    }

    /**
     * <p>
     * When the revision was first used by AWS CodeDeploy.
     * </p>
     * 
     * @param firstUsedTime
     *        When the revision was first used by AWS CodeDeploy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GenericRevisionInfo withFirstUsedTime(java.util.Date firstUsedTime) {
        setFirstUsedTime(firstUsedTime);
        return this;
    }

    /**
     * <p>
     * When the revision was last used by AWS CodeDeploy.
     * </p>
     * 
     * @param lastUsedTime
     *        When the revision was last used by AWS CodeDeploy.
     */

    public void setLastUsedTime(java.util.Date lastUsedTime) {
        this.lastUsedTime = lastUsedTime;
    }

    /**
     * <p>
     * When the revision was last used by AWS CodeDeploy.
     * </p>
     * 
     * @return When the revision was last used by AWS CodeDeploy.
     */

    public java.util.Date getLastUsedTime() {
        return this.lastUsedTime;
    }

    /**
     * <p>
     * When the revision was last used by AWS CodeDeploy.
     * </p>
     * 
     * @param lastUsedTime
     *        When the revision was last used by AWS CodeDeploy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GenericRevisionInfo withLastUsedTime(java.util.Date lastUsedTime) {
        setLastUsedTime(lastUsedTime);
        return this;
    }

    /**
     * <p>
     * When the revision was registered with AWS CodeDeploy.
     * </p>
     * 
     * @param registerTime
     *        When the revision was registered with AWS CodeDeploy.
     */

    public void setRegisterTime(java.util.Date registerTime) {
        this.registerTime = registerTime;
    }

    /**
     * <p>
     * When the revision was registered with AWS CodeDeploy.
     * </p>
     * 
     * @return When the revision was registered with AWS CodeDeploy.
     */

    public java.util.Date getRegisterTime() {
        return this.registerTime;
    }

    /**
     * <p>
     * When the revision was registered with AWS CodeDeploy.
     * </p>
     * 
     * @param registerTime
     *        When the revision was registered with AWS CodeDeploy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GenericRevisionInfo withRegisterTime(java.util.Date registerTime) {
        setRegisterTime(registerTime);
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getDeploymentGroups() != null)
            sb.append("DeploymentGroups: ").append(getDeploymentGroups()).append(",");
        if (getFirstUsedTime() != null)
            sb.append("FirstUsedTime: ").append(getFirstUsedTime()).append(",");
        if (getLastUsedTime() != null)
            sb.append("LastUsedTime: ").append(getLastUsedTime()).append(",");
        if (getRegisterTime() != null)
            sb.append("RegisterTime: ").append(getRegisterTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GenericRevisionInfo == false)
            return false;
        GenericRevisionInfo other = (GenericRevisionInfo) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDeploymentGroups() == null ^ this.getDeploymentGroups() == null)
            return false;
        if (other.getDeploymentGroups() != null && other.getDeploymentGroups().equals(this.getDeploymentGroups()) == false)
            return false;
        if (other.getFirstUsedTime() == null ^ this.getFirstUsedTime() == null)
            return false;
        if (other.getFirstUsedTime() != null && other.getFirstUsedTime().equals(this.getFirstUsedTime()) == false)
            return false;
        if (other.getLastUsedTime() == null ^ this.getLastUsedTime() == null)
            return false;
        if (other.getLastUsedTime() != null && other.getLastUsedTime().equals(this.getLastUsedTime()) == false)
            return false;
        if (other.getRegisterTime() == null ^ this.getRegisterTime() == null)
            return false;
        if (other.getRegisterTime() != null && other.getRegisterTime().equals(this.getRegisterTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDeploymentGroups() == null) ? 0 : getDeploymentGroups().hashCode());
        hashCode = prime * hashCode + ((getFirstUsedTime() == null) ? 0 : getFirstUsedTime().hashCode());
        hashCode = prime * hashCode + ((getLastUsedTime() == null) ? 0 : getLastUsedTime().hashCode());
        hashCode = prime * hashCode + ((getRegisterTime() == null) ? 0 : getRegisterTime().hashCode());
        return hashCode;
    }

    @Override
    public GenericRevisionInfo clone() {
        try {
            return (GenericRevisionInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codedeploy.model.transform.GenericRevisionInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
