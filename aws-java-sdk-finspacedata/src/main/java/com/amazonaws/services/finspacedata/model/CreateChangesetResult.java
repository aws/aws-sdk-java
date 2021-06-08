/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.finspacedata.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/CreateChangeset" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateChangesetResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Returns the changeset details.
     * </p>
     */
    private ChangesetInfo changeset;

    /**
     * <p>
     * Returns the changeset details.
     * </p>
     * 
     * @param changeset
     *        Returns the changeset details.
     */

    public void setChangeset(ChangesetInfo changeset) {
        this.changeset = changeset;
    }

    /**
     * <p>
     * Returns the changeset details.
     * </p>
     * 
     * @return Returns the changeset details.
     */

    public ChangesetInfo getChangeset() {
        return this.changeset;
    }

    /**
     * <p>
     * Returns the changeset details.
     * </p>
     * 
     * @param changeset
     *        Returns the changeset details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateChangesetResult withChangeset(ChangesetInfo changeset) {
        setChangeset(changeset);
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
        if (getChangeset() != null)
            sb.append("Changeset: ").append(getChangeset());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateChangesetResult == false)
            return false;
        CreateChangesetResult other = (CreateChangesetResult) obj;
        if (other.getChangeset() == null ^ this.getChangeset() == null)
            return false;
        if (other.getChangeset() != null && other.getChangeset().equals(this.getChangeset()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChangeset() == null) ? 0 : getChangeset().hashCode());
        return hashCode;
    }

    @Override
    public CreateChangesetResult clone() {
        try {
            return (CreateChangesetResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
