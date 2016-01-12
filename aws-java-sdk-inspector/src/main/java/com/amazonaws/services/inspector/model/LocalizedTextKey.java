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

package com.amazonaws.services.inspector.model;

import java.io.Serializable;

/**
 * <p>
 * This data type is used in the <a>LocalizedText</a> data type.
 * </p>
 */
public class LocalizedTextKey implements Serializable, Cloneable {

    /**
     * <p>
     * The module response source of the text.
     * </p>
     */
    private String facility;
    /**
     * <p>
     * Part of the module response source of the text.
     * </p>
     */
    private String id;

    /**
     * <p>
     * The module response source of the text.
     * </p>
     * 
     * @param facility
     *        The module response source of the text.
     */
    public void setFacility(String facility) {
        this.facility = facility;
    }

    /**
     * <p>
     * The module response source of the text.
     * </p>
     * 
     * @return The module response source of the text.
     */
    public String getFacility() {
        return this.facility;
    }

    /**
     * <p>
     * The module response source of the text.
     * </p>
     * 
     * @param facility
     *        The module response source of the text.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public LocalizedTextKey withFacility(String facility) {
        setFacility(facility);
        return this;
    }

    /**
     * <p>
     * Part of the module response source of the text.
     * </p>
     * 
     * @param id
     *        Part of the module response source of the text.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * Part of the module response source of the text.
     * </p>
     * 
     * @return Part of the module response source of the text.
     */
    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * Part of the module response source of the text.
     * </p>
     * 
     * @param id
     *        Part of the module response source of the text.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public LocalizedTextKey withId(String id) {
        setId(id);
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
        if (getFacility() != null)
            sb.append("Facility: " + getFacility() + ",");
        if (getId() != null)
            sb.append("Id: " + getId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LocalizedTextKey == false)
            return false;
        LocalizedTextKey other = (LocalizedTextKey) obj;
        if (other.getFacility() == null ^ this.getFacility() == null)
            return false;
        if (other.getFacility() != null
                && other.getFacility().equals(this.getFacility()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null
                && other.getId().equals(this.getId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getFacility() == null) ? 0 : getFacility().hashCode());
        hashCode = prime * hashCode
                + ((getId() == null) ? 0 : getId().hashCode());
        return hashCode;
    }

    @Override
    public LocalizedTextKey clone() {
        try {
            return (LocalizedTextKey) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}