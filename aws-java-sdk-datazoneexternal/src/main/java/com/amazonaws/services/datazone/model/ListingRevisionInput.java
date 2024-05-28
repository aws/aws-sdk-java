/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.datazone.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A revision to be made to an asset published in a Amazon DataZone catalog.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/ListingRevisionInput" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListingRevisionInput implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An identifier of revision to be made to an asset published in a Amazon DataZone catalog.
     * </p>
     */
    private String identifier;
    /**
     * <p>
     * The details of a revision to be made to an asset published in a Amazon DataZone catalog.
     * </p>
     */
    private String revision;

    /**
     * <p>
     * An identifier of revision to be made to an asset published in a Amazon DataZone catalog.
     * </p>
     * 
     * @param identifier
     *        An identifier of revision to be made to an asset published in a Amazon DataZone catalog.
     */

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    /**
     * <p>
     * An identifier of revision to be made to an asset published in a Amazon DataZone catalog.
     * </p>
     * 
     * @return An identifier of revision to be made to an asset published in a Amazon DataZone catalog.
     */

    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * <p>
     * An identifier of revision to be made to an asset published in a Amazon DataZone catalog.
     * </p>
     * 
     * @param identifier
     *        An identifier of revision to be made to an asset published in a Amazon DataZone catalog.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListingRevisionInput withIdentifier(String identifier) {
        setIdentifier(identifier);
        return this;
    }

    /**
     * <p>
     * The details of a revision to be made to an asset published in a Amazon DataZone catalog.
     * </p>
     * 
     * @param revision
     *        The details of a revision to be made to an asset published in a Amazon DataZone catalog.
     */

    public void setRevision(String revision) {
        this.revision = revision;
    }

    /**
     * <p>
     * The details of a revision to be made to an asset published in a Amazon DataZone catalog.
     * </p>
     * 
     * @return The details of a revision to be made to an asset published in a Amazon DataZone catalog.
     */

    public String getRevision() {
        return this.revision;
    }

    /**
     * <p>
     * The details of a revision to be made to an asset published in a Amazon DataZone catalog.
     * </p>
     * 
     * @param revision
     *        The details of a revision to be made to an asset published in a Amazon DataZone catalog.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListingRevisionInput withRevision(String revision) {
        setRevision(revision);
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
        if (getIdentifier() != null)
            sb.append("Identifier: ").append(getIdentifier()).append(",");
        if (getRevision() != null)
            sb.append("Revision: ").append(getRevision());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListingRevisionInput == false)
            return false;
        ListingRevisionInput other = (ListingRevisionInput) obj;
        if (other.getIdentifier() == null ^ this.getIdentifier() == null)
            return false;
        if (other.getIdentifier() != null && other.getIdentifier().equals(this.getIdentifier()) == false)
            return false;
        if (other.getRevision() == null ^ this.getRevision() == null)
            return false;
        if (other.getRevision() != null && other.getRevision().equals(this.getRevision()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIdentifier() == null) ? 0 : getIdentifier().hashCode());
        hashCode = prime * hashCode + ((getRevision() == null) ? 0 : getRevision().hashCode());
        return hashCode;
    }

    @Override
    public ListingRevisionInput clone() {
        try {
            return (ListingRevisionInput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.datazone.model.transform.ListingRevisionInputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
