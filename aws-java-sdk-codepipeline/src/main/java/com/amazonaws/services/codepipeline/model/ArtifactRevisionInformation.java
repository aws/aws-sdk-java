/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not
 * use this file except in compliance with the License. A copy of the License is
 * located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.codepipeline.model;

import java.io.Serializable;

/**
 * <p>
 * Represents information about an artifact revision.
 * </p>
 */
public class ArtifactRevisionInformation implements Serializable, Cloneable {

    /**
     * <p>
     * The name of an artifact. This name might be system-generated, such as
     * "MyApp", or might be defined by the user when an action is created.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Represents details about the ArtifactRevision object.
     * </p>
     */
    private ArtifactRevision revision;

    /**
     * <p>
     * The name of an artifact. This name might be system-generated, such as
     * "MyApp", or might be defined by the user when an action is created.
     * </p>
     * 
     * @param name
     *        The name of an artifact. This name might be system-generated, such
     *        as "MyApp", or might be defined by the user when an action is
     *        created.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of an artifact. This name might be system-generated, such as
     * "MyApp", or might be defined by the user when an action is created.
     * </p>
     * 
     * @return The name of an artifact. This name might be system-generated,
     *         such as "MyApp", or might be defined by the user when an action
     *         is created.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of an artifact. This name might be system-generated, such as
     * "MyApp", or might be defined by the user when an action is created.
     * </p>
     * 
     * @param name
     *        The name of an artifact. This name might be system-generated, such
     *        as "MyApp", or might be defined by the user when an action is
     *        created.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ArtifactRevisionInformation withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Represents details about the ArtifactRevision object.
     * </p>
     * 
     * @param revision
     *        Represents details about the ArtifactRevision object.
     */

    public void setRevision(ArtifactRevision revision) {
        this.revision = revision;
    }

    /**
     * <p>
     * Represents details about the ArtifactRevision object.
     * </p>
     * 
     * @return Represents details about the ArtifactRevision object.
     */

    public ArtifactRevision getRevision() {
        return this.revision;
    }

    /**
     * <p>
     * Represents details about the ArtifactRevision object.
     * </p>
     * 
     * @param revision
     *        Represents details about the ArtifactRevision object.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ArtifactRevisionInformation withRevision(ArtifactRevision revision) {
        setRevision(revision);
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
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getRevision() != null)
            sb.append("Revision: " + getRevision());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ArtifactRevisionInformation == false)
            return false;
        ArtifactRevisionInformation other = (ArtifactRevisionInformation) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null
                && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getRevision() == null ^ this.getRevision() == null)
            return false;
        if (other.getRevision() != null
                && other.getRevision().equals(this.getRevision()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getRevision() == null) ? 0 : getRevision().hashCode());
        return hashCode;
    }

    @Override
    public ArtifactRevisionInformation clone() {
        try {
            return (ArtifactRevisionInformation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
