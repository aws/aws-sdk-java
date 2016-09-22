/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Information about an application.
 * </p>
 */
public class ApplicationInfo implements Serializable, Cloneable {

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
     * True if the user has authenticated with GitHub for the specified application; otherwise, false.
     * </p>
     */
    private Boolean linkedToGitHub;

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
     * True if the user has authenticated with GitHub for the specified application; otherwise, false.
     * </p>
     * 
     * @param linkedToGitHub
     *        True if the user has authenticated with GitHub for the specified application; otherwise, false.
     */

    public void setLinkedToGitHub(Boolean linkedToGitHub) {
        this.linkedToGitHub = linkedToGitHub;
    }

    /**
     * <p>
     * True if the user has authenticated with GitHub for the specified application; otherwise, false.
     * </p>
     * 
     * @return True if the user has authenticated with GitHub for the specified application; otherwise, false.
     */

    public Boolean getLinkedToGitHub() {
        return this.linkedToGitHub;
    }

    /**
     * <p>
     * True if the user has authenticated with GitHub for the specified application; otherwise, false.
     * </p>
     * 
     * @param linkedToGitHub
     *        True if the user has authenticated with GitHub for the specified application; otherwise, false.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationInfo withLinkedToGitHub(Boolean linkedToGitHub) {
        setLinkedToGitHub(linkedToGitHub);
        return this;
    }

    /**
     * <p>
     * True if the user has authenticated with GitHub for the specified application; otherwise, false.
     * </p>
     * 
     * @return True if the user has authenticated with GitHub for the specified application; otherwise, false.
     */

    public Boolean isLinkedToGitHub() {
        return this.linkedToGitHub;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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
            sb.append("ApplicationId: " + getApplicationId() + ",");
        if (getApplicationName() != null)
            sb.append("ApplicationName: " + getApplicationName() + ",");
        if (getCreateTime() != null)
            sb.append("CreateTime: " + getCreateTime() + ",");
        if (getLinkedToGitHub() != null)
            sb.append("LinkedToGitHub: " + getLinkedToGitHub());
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
}
