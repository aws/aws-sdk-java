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
package com.amazonaws.services.ssmsap.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-sap-2018-05-10/GetDatabase" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDatabaseResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The SAP HANA database of an application registered with AWS Systems Manager for SAP.
     * </p>
     */
    private Database database;
    /**
     * <p>
     * The tags of a database.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The SAP HANA database of an application registered with AWS Systems Manager for SAP.
     * </p>
     * 
     * @param database
     *        The SAP HANA database of an application registered with AWS Systems Manager for SAP.
     */

    public void setDatabase(Database database) {
        this.database = database;
    }

    /**
     * <p>
     * The SAP HANA database of an application registered with AWS Systems Manager for SAP.
     * </p>
     * 
     * @return The SAP HANA database of an application registered with AWS Systems Manager for SAP.
     */

    public Database getDatabase() {
        return this.database;
    }

    /**
     * <p>
     * The SAP HANA database of an application registered with AWS Systems Manager for SAP.
     * </p>
     * 
     * @param database
     *        The SAP HANA database of an application registered with AWS Systems Manager for SAP.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDatabaseResult withDatabase(Database database) {
        setDatabase(database);
        return this;
    }

    /**
     * <p>
     * The tags of a database.
     * </p>
     * 
     * @return The tags of a database.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags of a database.
     * </p>
     * 
     * @param tags
     *        The tags of a database.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags of a database.
     * </p>
     * 
     * @param tags
     *        The tags of a database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDatabaseResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see GetDatabaseResult#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GetDatabaseResult addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDatabaseResult clearTagsEntries() {
        this.tags = null;
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
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDatabaseResult == false)
            return false;
        GetDatabaseResult other = (GetDatabaseResult) obj;
        if (other.getDatabase() == null ^ this.getDatabase() == null)
            return false;
        if (other.getDatabase() != null && other.getDatabase().equals(this.getDatabase()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDatabase() == null) ? 0 : getDatabase().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public GetDatabaseResult clone() {
        try {
            return (GetDatabaseResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
