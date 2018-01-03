/*
 * Copyright 2012-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.greengrass.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/CreateGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateGroupResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /** Arn of the definition. */
    private String arn;
    /** Timestamp of when the definition was created. */
    private String creationTimestamp;
    /** Id of the definition. */
    private String id;
    /** Last updated timestamp of the definition. */
    private String lastUpdatedTimestamp;
    /** Last version of the definition. */
    private String latestVersion;
    /** Latest version arn of the definition. */
    private String latestVersionArn;
    /** Name of the definition. */
    private String name;

    /**
     * Arn of the definition.
     * 
     * @param arn
     *        Arn of the definition.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * Arn of the definition.
     * 
     * @return Arn of the definition.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * Arn of the definition.
     * 
     * @param arn
     *        Arn of the definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGroupResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * Timestamp of when the definition was created.
     * 
     * @param creationTimestamp
     *        Timestamp of when the definition was created.
     */

    public void setCreationTimestamp(String creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
    }

    /**
     * Timestamp of when the definition was created.
     * 
     * @return Timestamp of when the definition was created.
     */

    public String getCreationTimestamp() {
        return this.creationTimestamp;
    }

    /**
     * Timestamp of when the definition was created.
     * 
     * @param creationTimestamp
     *        Timestamp of when the definition was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGroupResult withCreationTimestamp(String creationTimestamp) {
        setCreationTimestamp(creationTimestamp);
        return this;
    }

    /**
     * Id of the definition.
     * 
     * @param id
     *        Id of the definition.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * Id of the definition.
     * 
     * @return Id of the definition.
     */

    public String getId() {
        return this.id;
    }

    /**
     * Id of the definition.
     * 
     * @param id
     *        Id of the definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGroupResult withId(String id) {
        setId(id);
        return this;
    }

    /**
     * Last updated timestamp of the definition.
     * 
     * @param lastUpdatedTimestamp
     *        Last updated timestamp of the definition.
     */

    public void setLastUpdatedTimestamp(String lastUpdatedTimestamp) {
        this.lastUpdatedTimestamp = lastUpdatedTimestamp;
    }

    /**
     * Last updated timestamp of the definition.
     * 
     * @return Last updated timestamp of the definition.
     */

    public String getLastUpdatedTimestamp() {
        return this.lastUpdatedTimestamp;
    }

    /**
     * Last updated timestamp of the definition.
     * 
     * @param lastUpdatedTimestamp
     *        Last updated timestamp of the definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGroupResult withLastUpdatedTimestamp(String lastUpdatedTimestamp) {
        setLastUpdatedTimestamp(lastUpdatedTimestamp);
        return this;
    }

    /**
     * Last version of the definition.
     * 
     * @param latestVersion
     *        Last version of the definition.
     */

    public void setLatestVersion(String latestVersion) {
        this.latestVersion = latestVersion;
    }

    /**
     * Last version of the definition.
     * 
     * @return Last version of the definition.
     */

    public String getLatestVersion() {
        return this.latestVersion;
    }

    /**
     * Last version of the definition.
     * 
     * @param latestVersion
     *        Last version of the definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGroupResult withLatestVersion(String latestVersion) {
        setLatestVersion(latestVersion);
        return this;
    }

    /**
     * Latest version arn of the definition.
     * 
     * @param latestVersionArn
     *        Latest version arn of the definition.
     */

    public void setLatestVersionArn(String latestVersionArn) {
        this.latestVersionArn = latestVersionArn;
    }

    /**
     * Latest version arn of the definition.
     * 
     * @return Latest version arn of the definition.
     */

    public String getLatestVersionArn() {
        return this.latestVersionArn;
    }

    /**
     * Latest version arn of the definition.
     * 
     * @param latestVersionArn
     *        Latest version arn of the definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGroupResult withLatestVersionArn(String latestVersionArn) {
        setLatestVersionArn(latestVersionArn);
        return this;
    }

    /**
     * Name of the definition.
     * 
     * @param name
     *        Name of the definition.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Name of the definition.
     * 
     * @return Name of the definition.
     */

    public String getName() {
        return this.name;
    }

    /**
     * Name of the definition.
     * 
     * @param name
     *        Name of the definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGroupResult withName(String name) {
        setName(name);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getCreationTimestamp() != null)
            sb.append("CreationTimestamp: ").append(getCreationTimestamp()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getLastUpdatedTimestamp() != null)
            sb.append("LastUpdatedTimestamp: ").append(getLastUpdatedTimestamp()).append(",");
        if (getLatestVersion() != null)
            sb.append("LatestVersion: ").append(getLatestVersion()).append(",");
        if (getLatestVersionArn() != null)
            sb.append("LatestVersionArn: ").append(getLatestVersionArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateGroupResult == false)
            return false;
        CreateGroupResult other = (CreateGroupResult) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreationTimestamp() == null ^ this.getCreationTimestamp() == null)
            return false;
        if (other.getCreationTimestamp() != null && other.getCreationTimestamp().equals(this.getCreationTimestamp()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getLastUpdatedTimestamp() == null ^ this.getLastUpdatedTimestamp() == null)
            return false;
        if (other.getLastUpdatedTimestamp() != null && other.getLastUpdatedTimestamp().equals(this.getLastUpdatedTimestamp()) == false)
            return false;
        if (other.getLatestVersion() == null ^ this.getLatestVersion() == null)
            return false;
        if (other.getLatestVersion() != null && other.getLatestVersion().equals(this.getLatestVersion()) == false)
            return false;
        if (other.getLatestVersionArn() == null ^ this.getLatestVersionArn() == null)
            return false;
        if (other.getLatestVersionArn() != null && other.getLatestVersionArn().equals(this.getLatestVersionArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreationTimestamp() == null) ? 0 : getCreationTimestamp().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedTimestamp() == null) ? 0 : getLastUpdatedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getLatestVersion() == null) ? 0 : getLatestVersion().hashCode());
        hashCode = prime * hashCode + ((getLatestVersionArn() == null) ? 0 : getLatestVersionArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public CreateGroupResult clone() {
        try {
            return (CreateGroupResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
