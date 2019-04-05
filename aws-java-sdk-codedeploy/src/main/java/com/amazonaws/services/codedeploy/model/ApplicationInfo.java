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
 * Information about an application.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/ApplicationInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ApplicationInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The application ID.
     * </p>
     */
    private String applicationId;
    /**
     * <p>
     * The application name.
     * </p>
     */
    private String applicationName;
    /**
     * <p>
     * The time at which the application was created.
     * </p>
     */
    private java.util.Date createTime;
    /**
     * <p>
     * True if the user has authenticated with GitHub for the specified application. Otherwise, false.
     * </p>
     */
    private Boolean linkedToGitHub;
    /**
     * <p>
     * The name for a connection to a GitHub account.
     * </p>
     */
    private String gitHubAccountName;
    /**
     * <p>
     * The destination platform type for deployment of the application (<code>Lambda</code> or <code>Server</code>).
     * </p>
     */
    private String computePlatform;

    /**
     * <p>
     * The application ID.
     * </p>
     * 
     * @param applicationId
     *        The application ID.
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The application ID.
     * </p>
     * 
     * @return The application ID.
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * <p>
     * The application ID.
     * </p>
     * 
     * @param applicationId
     *        The application ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationInfo withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * <p>
     * The application name.
     * </p>
     * 
     * @param applicationName
     *        The application name.
     */

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    /**
     * <p>
     * The application name.
     * </p>
     * 
     * @return The application name.
     */

    public String getApplicationName() {
        return this.applicationName;
    }

    /**
     * <p>
     * The application name.
     * </p>
     * 
     * @param applicationName
     *        The application name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationInfo withApplicationName(String applicationName) {
        setApplicationName(applicationName);
        return this;
    }

    /**
     * <p>
     * The time at which the application was created.
     * </p>
     * 
     * @param createTime
     *        The time at which the application was created.
     */

    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    /**
     * <p>
     * The time at which the application was created.
     * </p>
     * 
     * @return The time at which the application was created.
     */

    public java.util.Date getCreateTime() {
        return this.createTime;
    }

    /**
     * <p>
     * The time at which the application was created.
     * </p>
     * 
     * @param createTime
     *        The time at which the application was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationInfo withCreateTime(java.util.Date createTime) {
        setCreateTime(createTime);
        return this;
    }

    /**
     * <p>
     * True if the user has authenticated with GitHub for the specified application. Otherwise, false.
     * </p>
     * 
     * @param linkedToGitHub
     *        True if the user has authenticated with GitHub for the specified application. Otherwise, false.
     */

    public void setLinkedToGitHub(Boolean linkedToGitHub) {
        this.linkedToGitHub = linkedToGitHub;
    }

    /**
     * <p>
     * True if the user has authenticated with GitHub for the specified application. Otherwise, false.
     * </p>
     * 
     * @return True if the user has authenticated with GitHub for the specified application. Otherwise, false.
     */

    public Boolean getLinkedToGitHub() {
        return this.linkedToGitHub;
    }

    /**
     * <p>
     * True if the user has authenticated with GitHub for the specified application. Otherwise, false.
     * </p>
     * 
     * @param linkedToGitHub
     *        True if the user has authenticated with GitHub for the specified application. Otherwise, false.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationInfo withLinkedToGitHub(Boolean linkedToGitHub) {
        setLinkedToGitHub(linkedToGitHub);
        return this;
    }

    /**
     * <p>
     * True if the user has authenticated with GitHub for the specified application. Otherwise, false.
     * </p>
     * 
     * @return True if the user has authenticated with GitHub for the specified application. Otherwise, false.
     */

    public Boolean isLinkedToGitHub() {
        return this.linkedToGitHub;
    }

    /**
     * <p>
     * The name for a connection to a GitHub account.
     * </p>
     * 
     * @param gitHubAccountName
     *        The name for a connection to a GitHub account.
     */

    public void setGitHubAccountName(String gitHubAccountName) {
        this.gitHubAccountName = gitHubAccountName;
    }

    /**
     * <p>
     * The name for a connection to a GitHub account.
     * </p>
     * 
     * @return The name for a connection to a GitHub account.
     */

    public String getGitHubAccountName() {
        return this.gitHubAccountName;
    }

    /**
     * <p>
     * The name for a connection to a GitHub account.
     * </p>
     * 
     * @param gitHubAccountName
     *        The name for a connection to a GitHub account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationInfo withGitHubAccountName(String gitHubAccountName) {
        setGitHubAccountName(gitHubAccountName);
        return this;
    }

    /**
     * <p>
     * The destination platform type for deployment of the application (<code>Lambda</code> or <code>Server</code>).
     * </p>
     * 
     * @param computePlatform
     *        The destination platform type for deployment of the application (<code>Lambda</code> or
     *        <code>Server</code>).
     * @see ComputePlatform
     */

    public void setComputePlatform(String computePlatform) {
        this.computePlatform = computePlatform;
    }

    /**
     * <p>
     * The destination platform type for deployment of the application (<code>Lambda</code> or <code>Server</code>).
     * </p>
     * 
     * @return The destination platform type for deployment of the application (<code>Lambda</code> or
     *         <code>Server</code>).
     * @see ComputePlatform
     */

    public String getComputePlatform() {
        return this.computePlatform;
    }

    /**
     * <p>
     * The destination platform type for deployment of the application (<code>Lambda</code> or <code>Server</code>).
     * </p>
     * 
     * @param computePlatform
     *        The destination platform type for deployment of the application (<code>Lambda</code> or
     *        <code>Server</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComputePlatform
     */

    public ApplicationInfo withComputePlatform(String computePlatform) {
        setComputePlatform(computePlatform);
        return this;
    }

    /**
     * <p>
     * The destination platform type for deployment of the application (<code>Lambda</code> or <code>Server</code>).
     * </p>
     * 
     * @param computePlatform
     *        The destination platform type for deployment of the application (<code>Lambda</code> or
     *        <code>Server</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComputePlatform
     */

    public ApplicationInfo withComputePlatform(ComputePlatform computePlatform) {
        this.computePlatform = computePlatform.toString();
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
        if (getApplicationName() != null)
            sb.append("ApplicationName: ").append(getApplicationName()).append(",");
        if (getCreateTime() != null)
            sb.append("CreateTime: ").append(getCreateTime()).append(",");
        if (getLinkedToGitHub() != null)
            sb.append("LinkedToGitHub: ").append(getLinkedToGitHub()).append(",");
        if (getGitHubAccountName() != null)
            sb.append("GitHubAccountName: ").append(getGitHubAccountName()).append(",");
        if (getComputePlatform() != null)
            sb.append("ComputePlatform: ").append(getComputePlatform());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ApplicationInfo == false)
            return false;
        ApplicationInfo other = (ApplicationInfo) obj;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getApplicationName() == null ^ this.getApplicationName() == null)
            return false;
        if (other.getApplicationName() != null && other.getApplicationName().equals(this.getApplicationName()) == false)
            return false;
        if (other.getCreateTime() == null ^ this.getCreateTime() == null)
            return false;
        if (other.getCreateTime() != null && other.getCreateTime().equals(this.getCreateTime()) == false)
            return false;
        if (other.getLinkedToGitHub() == null ^ this.getLinkedToGitHub() == null)
            return false;
        if (other.getLinkedToGitHub() != null && other.getLinkedToGitHub().equals(this.getLinkedToGitHub()) == false)
            return false;
        if (other.getGitHubAccountName() == null ^ this.getGitHubAccountName() == null)
            return false;
        if (other.getGitHubAccountName() != null && other.getGitHubAccountName().equals(this.getGitHubAccountName()) == false)
            return false;
        if (other.getComputePlatform() == null ^ this.getComputePlatform() == null)
            return false;
        if (other.getComputePlatform() != null && other.getComputePlatform().equals(this.getComputePlatform()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getApplicationName() == null) ? 0 : getApplicationName().hashCode());
        hashCode = prime * hashCode + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        hashCode = prime * hashCode + ((getLinkedToGitHub() == null) ? 0 : getLinkedToGitHub().hashCode());
        hashCode = prime * hashCode + ((getGitHubAccountName() == null) ? 0 : getGitHubAccountName().hashCode());
        hashCode = prime * hashCode + ((getComputePlatform() == null) ? 0 : getComputePlatform().hashCode());
        return hashCode;
    }

    @Override
    public ApplicationInfo clone() {
        try {
            return (ApplicationInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codedeploy.model.transform.ApplicationInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
