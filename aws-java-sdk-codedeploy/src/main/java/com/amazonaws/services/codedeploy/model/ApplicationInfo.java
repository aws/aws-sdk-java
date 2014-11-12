/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.codedeploy.model;

import java.io.Serializable;

/**
 * <p>
 * Information about an application.
 * </p>
 */
public class ApplicationInfo implements Serializable {

    /**
     * The application ID.
     */
    private String applicationId;

    /**
     * The application name.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String applicationName;

    /**
     * The time that the application was created.
     */
    private java.util.Date createTime;

    /**
     * True if the user has authenticated with GitHub for the specified
     * application; otherwise, false.
     */
    private Boolean linkedToGitHub;

    /**
     * The application ID.
     *
     * @return The application ID.
     */
    public String getApplicationId() {
        return applicationId;
    }
    
    /**
     * The application ID.
     *
     * @param applicationId The application ID.
     */
    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }
    
    /**
     * The application ID.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param applicationId The application ID.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ApplicationInfo withApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * The application name.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return The application name.
     */
    public String getApplicationName() {
        return applicationName;
    }
    
    /**
     * The application name.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param applicationName The application name.
     */
    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }
    
    /**
     * The application name.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param applicationName The application name.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ApplicationInfo withApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }

    /**
     * The time that the application was created.
     *
     * @return The time that the application was created.
     */
    public java.util.Date getCreateTime() {
        return createTime;
    }
    
    /**
     * The time that the application was created.
     *
     * @param createTime The time that the application was created.
     */
    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }
    
    /**
     * The time that the application was created.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param createTime The time that the application was created.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ApplicationInfo withCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * True if the user has authenticated with GitHub for the specified
     * application; otherwise, false.
     *
     * @return True if the user has authenticated with GitHub for the specified
     *         application; otherwise, false.
     */
    public Boolean isLinkedToGitHub() {
        return linkedToGitHub;
    }
    
    /**
     * True if the user has authenticated with GitHub for the specified
     * application; otherwise, false.
     *
     * @param linkedToGitHub True if the user has authenticated with GitHub for the specified
     *         application; otherwise, false.
     */
    public void setLinkedToGitHub(Boolean linkedToGitHub) {
        this.linkedToGitHub = linkedToGitHub;
    }
    
    /**
     * True if the user has authenticated with GitHub for the specified
     * application; otherwise, false.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param linkedToGitHub True if the user has authenticated with GitHub for the specified
     *         application; otherwise, false.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ApplicationInfo withLinkedToGitHub(Boolean linkedToGitHub) {
        this.linkedToGitHub = linkedToGitHub;
        return this;
    }

    /**
     * True if the user has authenticated with GitHub for the specified
     * application; otherwise, false.
     *
     * @return True if the user has authenticated with GitHub for the specified
     *         application; otherwise, false.
     */
    public Boolean getLinkedToGitHub() {
        return linkedToGitHub;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getApplicationId() != null) sb.append("ApplicationId: " + getApplicationId() + ",");
        if (getApplicationName() != null) sb.append("ApplicationName: " + getApplicationName() + ",");
        if (getCreateTime() != null) sb.append("CreateTime: " + getCreateTime() + ",");
        if (isLinkedToGitHub() != null) sb.append("LinkedToGitHub: " + isLinkedToGitHub() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode()); 
        hashCode = prime * hashCode + ((getApplicationName() == null) ? 0 : getApplicationName().hashCode()); 
        hashCode = prime * hashCode + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode()); 
        hashCode = prime * hashCode + ((isLinkedToGitHub() == null) ? 0 : isLinkedToGitHub().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ApplicationInfo == false) return false;
        ApplicationInfo other = (ApplicationInfo)obj;
        
        if (other.getApplicationId() == null ^ this.getApplicationId() == null) return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false) return false; 
        if (other.getApplicationName() == null ^ this.getApplicationName() == null) return false;
        if (other.getApplicationName() != null && other.getApplicationName().equals(this.getApplicationName()) == false) return false; 
        if (other.getCreateTime() == null ^ this.getCreateTime() == null) return false;
        if (other.getCreateTime() != null && other.getCreateTime().equals(this.getCreateTime()) == false) return false; 
        if (other.isLinkedToGitHub() == null ^ this.isLinkedToGitHub() == null) return false;
        if (other.isLinkedToGitHub() != null && other.isLinkedToGitHub().equals(this.isLinkedToGitHub()) == false) return false; 
        return true;
    }
    
}
    