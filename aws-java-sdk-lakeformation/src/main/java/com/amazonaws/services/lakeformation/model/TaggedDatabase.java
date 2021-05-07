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
package com.amazonaws.services.lakeformation.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure describing a database resource with tags.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/TaggedDatabase" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TaggedDatabase implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A database that has tags attached to it.
     * </p>
     */
    private DatabaseResource database;
    /**
     * <p>
     * A list of tags attached to the database.
     * </p>
     */
    private java.util.List<LFTagPair> lFTags;

    /**
     * <p>
     * A database that has tags attached to it.
     * </p>
     * 
     * @param database
     *        A database that has tags attached to it.
     */

    public void setDatabase(DatabaseResource database) {
        this.database = database;
    }

    /**
     * <p>
     * A database that has tags attached to it.
     * </p>
     * 
     * @return A database that has tags attached to it.
     */

    public DatabaseResource getDatabase() {
        return this.database;
    }

    /**
     * <p>
     * A database that has tags attached to it.
     * </p>
     * 
     * @param database
     *        A database that has tags attached to it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaggedDatabase withDatabase(DatabaseResource database) {
        setDatabase(database);
        return this;
    }

    /**
     * <p>
     * A list of tags attached to the database.
     * </p>
     * 
     * @return A list of tags attached to the database.
     */

    public java.util.List<LFTagPair> getLFTags() {
        return lFTags;
    }

    /**
     * <p>
     * A list of tags attached to the database.
     * </p>
     * 
     * @param lFTags
     *        A list of tags attached to the database.
     */

    public void setLFTags(java.util.Collection<LFTagPair> lFTags) {
        if (lFTags == null) {
            this.lFTags = null;
            return;
        }

        this.lFTags = new java.util.ArrayList<LFTagPair>(lFTags);
    }

    /**
     * <p>
     * A list of tags attached to the database.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLFTags(java.util.Collection)} or {@link #withLFTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param lFTags
     *        A list of tags attached to the database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaggedDatabase withLFTags(LFTagPair... lFTags) {
        if (this.lFTags == null) {
            setLFTags(new java.util.ArrayList<LFTagPair>(lFTags.length));
        }
        for (LFTagPair ele : lFTags) {
            this.lFTags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of tags attached to the database.
     * </p>
     * 
     * @param lFTags
     *        A list of tags attached to the database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaggedDatabase withLFTags(java.util.Collection<LFTagPair> lFTags) {
        setLFTags(lFTags);
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
        if (getDatabase() != null)
            sb.append("Database: ").append(getDatabase()).append(",");
        if (getLFTags() != null)
            sb.append("LFTags: ").append(getLFTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TaggedDatabase == false)
            return false;
        TaggedDatabase other = (TaggedDatabase) obj;
        if (other.getDatabase() == null ^ this.getDatabase() == null)
            return false;
        if (other.getDatabase() != null && other.getDatabase().equals(this.getDatabase()) == false)
            return false;
        if (other.getLFTags() == null ^ this.getLFTags() == null)
            return false;
        if (other.getLFTags() != null && other.getLFTags().equals(this.getLFTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDatabase() == null) ? 0 : getDatabase().hashCode());
        hashCode = prime * hashCode + ((getLFTags() == null) ? 0 : getLFTags().hashCode());
        return hashCode;
    }

    @Override
    public TaggedDatabase clone() {
        try {
            return (TaggedDatabase) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lakeformation.model.transform.TaggedDatabaseMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
