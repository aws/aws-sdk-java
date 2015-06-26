/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.importexport.model;

import java.io.Serializable;

/**
 * A discrete item that contains the description and URL of an artifact (such as
 * a PDF).
 */
public class Artifact implements Serializable, Cloneable {

    private String description;

    private String uRL;

    /**
     * Sets the value of the Description property for this object.
     * 
     * @param description
     *        The new value for the Description property for this object.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Returns the value of the Description property for this object.
     * 
     * @return The value of the Description property for this object.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Sets the value of the Description property for this object.
     * 
     * @param description
     *        The new value for the Description property for this object.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public Artifact withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * Sets the value of the URL property for this object.
     * 
     * @param uRL
     *        The new value for the URL property for this object.
     */
    public void setURL(String uRL) {
        this.uRL = uRL;
    }

    /**
     * Returns the value of the URL property for this object.
     * 
     * @return The value of the URL property for this object.
     */
    public String getURL() {
        return this.uRL;
    }

    /**
     * Sets the value of the URL property for this object.
     * 
     * @param uRL
     *        The new value for the URL property for this object.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public Artifact withURL(String uRL) {
        setURL(uRL);
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
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getURL() != null)
            sb.append("URL: " + getURL());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Artifact == false)
            return false;
        Artifact other = (Artifact) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getURL() == null ^ this.getURL() == null)
            return false;
        if (other.getURL() != null
                && other.getURL().equals(this.getURL()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getURL() == null) ? 0 : getURL().hashCode());
        return hashCode;
    }

    @Override
    public Artifact clone() {
        try {
            return (Artifact) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}