/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
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

package com.amazonaws.services.route53.model;

import java.io.Serializable;

/**
 * 
 */
public class TrafficPolicy implements Serializable, Cloneable {

    private String id;

    private Integer version;

    private String name;

    private String type;

    private String document;

    private String comment;

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return
     */
    public String getId() {
        return this.id;
    }

    /**
     * @param id
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public TrafficPolicy withId(String id) {
        setId(id);
        return this;
    }

    /**
     * @param version
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * @return
     */
    public Integer getVersion() {
        return this.version;
    }

    /**
     * @param version
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public TrafficPolicy withVersion(Integer version) {
        setVersion(version);
        return this;
    }

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
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public TrafficPolicy withName(String name) {
        setName(name);
        return this;
    }

    /**
     * @param type
     * @see RRType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return
     * @see RRType
     */
    public String getType() {
        return this.type;
    }

    /**
     * @param type
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see RRType
     */
    public TrafficPolicy withType(String type) {
        setType(type);
        return this;
    }

    /**
     * @param type
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see RRType
     */
    public void setType(RRType type) {
        this.type = type.toString();
    }

    /**
     * @param type
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see RRType
     */
    public TrafficPolicy withType(RRType type) {
        setType(type);
        return this;
    }

    /**
     * @param document
     */
    public void setDocument(String document) {
        this.document = document;
    }

    /**
     * @return
     */
    public String getDocument() {
        return this.document;
    }

    /**
     * @param document
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public TrafficPolicy withDocument(String document) {
        setDocument(document);
        return this;
    }

    /**
     * @param comment
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * @return
     */
    public String getComment() {
        return this.comment;
    }

    /**
     * @param comment
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public TrafficPolicy withComment(String comment) {
        setComment(comment);
        return this;
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
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getVersion() != null)
            sb.append("Version: " + getVersion() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getDocument() != null)
            sb.append("Document: " + getDocument() + ",");
        if (getComment() != null)
            sb.append("Comment: " + getComment());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TrafficPolicy == false)
            return false;
        TrafficPolicy other = (TrafficPolicy) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null
                && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null
                && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null
                && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null
                && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getDocument() == null ^ this.getDocument() == null)
            return false;
        if (other.getDocument() != null
                && other.getDocument().equals(this.getDocument()) == false)
            return false;
        if (other.getComment() == null ^ this.getComment() == null)
            return false;
        if (other.getComment() != null
                && other.getComment().equals(this.getComment()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode
                + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode
                + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode
                + ((getDocument() == null) ? 0 : getDocument().hashCode());
        hashCode = prime * hashCode
                + ((getComment() == null) ? 0 : getComment().hashCode());
        return hashCode;
    }

    @Override
    public TrafficPolicy clone() {
        try {
            return (TrafficPolicy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}