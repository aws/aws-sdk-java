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
package com.amazonaws.services.cognitoidp.model;

import java.io.Serializable;

/**
 * <p>
 * A user pool description.
 * </p>
 */
public class UserPoolDescriptionType implements Serializable, Cloneable {

    /**
     * <p>
     * The ID in a user pool description.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The name in a user pool description.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The AWS Lambda configuration information in a user pool description.
     * </p>
     */
    private LambdaConfigType lambdaConfig;
    /**
     * <p>
     * The user pool status in a user pool description.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The last modified date in a user pool description.
     * </p>
     */
    private java.util.Date lastModifiedDate;
    /**
     * <p>
     * The creation date in a user pool description.
     * </p>
     */
    private java.util.Date creationDate;

    /**
     * <p>
     * The ID in a user pool description.
     * </p>
     * 
     * @param id
     *        The ID in a user pool description.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID in a user pool description.
     * </p>
     * 
     * @return The ID in a user pool description.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID in a user pool description.
     * </p>
     * 
     * @param id
     *        The ID in a user pool description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserPoolDescriptionType withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The name in a user pool description.
     * </p>
     * 
     * @param name
     *        The name in a user pool description.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name in a user pool description.
     * </p>
     * 
     * @return The name in a user pool description.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name in a user pool description.
     * </p>
     * 
     * @param name
     *        The name in a user pool description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserPoolDescriptionType withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The AWS Lambda configuration information in a user pool description.
     * </p>
     * 
     * @param lambdaConfig
     *        The AWS Lambda configuration information in a user pool description.
     */

    public void setLambdaConfig(LambdaConfigType lambdaConfig) {
        this.lambdaConfig = lambdaConfig;
    }

    /**
     * <p>
     * The AWS Lambda configuration information in a user pool description.
     * </p>
     * 
     * @return The AWS Lambda configuration information in a user pool description.
     */

    public LambdaConfigType getLambdaConfig() {
        return this.lambdaConfig;
    }

    /**
     * <p>
     * The AWS Lambda configuration information in a user pool description.
     * </p>
     * 
     * @param lambdaConfig
     *        The AWS Lambda configuration information in a user pool description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserPoolDescriptionType withLambdaConfig(LambdaConfigType lambdaConfig) {
        setLambdaConfig(lambdaConfig);
        return this;
    }

    /**
     * <p>
     * The user pool status in a user pool description.
     * </p>
     * 
     * @param status
     *        The user pool status in a user pool description.
     * @see StatusType
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The user pool status in a user pool description.
     * </p>
     * 
     * @return The user pool status in a user pool description.
     * @see StatusType
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The user pool status in a user pool description.
     * </p>
     * 
     * @param status
     *        The user pool status in a user pool description.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StatusType
     */

    public UserPoolDescriptionType withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The user pool status in a user pool description.
     * </p>
     * 
     * @param status
     *        The user pool status in a user pool description.
     * @see StatusType
     */

    public void setStatus(StatusType status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The user pool status in a user pool description.
     * </p>
     * 
     * @param status
     *        The user pool status in a user pool description.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StatusType
     */

    public UserPoolDescriptionType withStatus(StatusType status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The last modified date in a user pool description.
     * </p>
     * 
     * @param lastModifiedDate
     *        The last modified date in a user pool description.
     */

    public void setLastModifiedDate(java.util.Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * <p>
     * The last modified date in a user pool description.
     * </p>
     * 
     * @return The last modified date in a user pool description.
     */

    public java.util.Date getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    /**
     * <p>
     * The last modified date in a user pool description.
     * </p>
     * 
     * @param lastModifiedDate
     *        The last modified date in a user pool description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserPoolDescriptionType withLastModifiedDate(java.util.Date lastModifiedDate) {
        setLastModifiedDate(lastModifiedDate);
        return this;
    }

    /**
     * <p>
     * The creation date in a user pool description.
     * </p>
     * 
     * @param creationDate
     *        The creation date in a user pool description.
     */

    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The creation date in a user pool description.
     * </p>
     * 
     * @return The creation date in a user pool description.
     */

    public java.util.Date getCreationDate() {
        return this.creationDate;
    }

    /**
     * <p>
     * The creation date in a user pool description.
     * </p>
     * 
     * @param creationDate
     *        The creation date in a user pool description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserPoolDescriptionType withCreationDate(java.util.Date creationDate) {
        setCreationDate(creationDate);
        return this;
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
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getLambdaConfig() != null)
            sb.append("LambdaConfig: " + getLambdaConfig() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getLastModifiedDate() != null)
            sb.append("LastModifiedDate: " + getLastModifiedDate() + ",");
        if (getCreationDate() != null)
            sb.append("CreationDate: " + getCreationDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UserPoolDescriptionType == false)
            return false;
        UserPoolDescriptionType other = (UserPoolDescriptionType) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getLambdaConfig() == null ^ this.getLambdaConfig() == null)
            return false;
        if (other.getLambdaConfig() != null && other.getLambdaConfig().equals(this.getLambdaConfig()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getLastModifiedDate() == null ^ this.getLastModifiedDate() == null)
            return false;
        if (other.getLastModifiedDate() != null && other.getLastModifiedDate().equals(this.getLastModifiedDate()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getLambdaConfig() == null) ? 0 : getLambdaConfig().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedDate() == null) ? 0 : getLastModifiedDate().hashCode());
        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        return hashCode;
    }

    @Override
    public UserPoolDescriptionType clone() {
        try {
            return (UserPoolDescriptionType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
