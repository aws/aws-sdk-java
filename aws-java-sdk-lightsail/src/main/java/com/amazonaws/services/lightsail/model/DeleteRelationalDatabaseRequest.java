/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DeleteRelationalDatabase" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteRelationalDatabaseRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the database that you are deleting.
     * </p>
     */
    private String relationalDatabaseName;
    /**
     * <p>
     * Determines whether a final database snapshot is created before your database is deleted. If <code>true</code> is
     * specified, no database snapshot is created. If <code>false</code> is specified, a database snapshot is created
     * before your database is deleted.
     * </p>
     * <p>
     * You must specify the <code>final relational database snapshot name</code> parameter if the
     * <code>skip final snapshot</code> parameter is <code>false</code>.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     */
    private Boolean skipFinalSnapshot;
    /**
     * <p>
     * The name of the database snapshot created if <code>skip final snapshot</code> is <code>false</code>, which is the
     * default value for that parameter.
     * </p>
     * <note>
     * <p>
     * Specifying this parameter and also specifying the <code>skip final snapshot</code> parameter to <code>true</code>
     * results in an error.
     * </p>
     * </note>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 2 to 255 alphanumeric characters, or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * The first and last character must be a letter or number.
     * </p>
     * </li>
     * </ul>
     */
    private String finalRelationalDatabaseSnapshotName;

    /**
     * <p>
     * The name of the database that you are deleting.
     * </p>
     * 
     * @param relationalDatabaseName
     *        The name of the database that you are deleting.
     */

    public void setRelationalDatabaseName(String relationalDatabaseName) {
        this.relationalDatabaseName = relationalDatabaseName;
    }

    /**
     * <p>
     * The name of the database that you are deleting.
     * </p>
     * 
     * @return The name of the database that you are deleting.
     */

    public String getRelationalDatabaseName() {
        return this.relationalDatabaseName;
    }

    /**
     * <p>
     * The name of the database that you are deleting.
     * </p>
     * 
     * @param relationalDatabaseName
     *        The name of the database that you are deleting.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteRelationalDatabaseRequest withRelationalDatabaseName(String relationalDatabaseName) {
        setRelationalDatabaseName(relationalDatabaseName);
        return this;
    }

    /**
     * <p>
     * Determines whether a final database snapshot is created before your database is deleted. If <code>true</code> is
     * specified, no database snapshot is created. If <code>false</code> is specified, a database snapshot is created
     * before your database is deleted.
     * </p>
     * <p>
     * You must specify the <code>final relational database snapshot name</code> parameter if the
     * <code>skip final snapshot</code> parameter is <code>false</code>.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @param skipFinalSnapshot
     *        Determines whether a final database snapshot is created before your database is deleted. If
     *        <code>true</code> is specified, no database snapshot is created. If <code>false</code> is specified, a
     *        database snapshot is created before your database is deleted.</p>
     *        <p>
     *        You must specify the <code>final relational database snapshot name</code> parameter if the
     *        <code>skip final snapshot</code> parameter is <code>false</code>.
     *        </p>
     *        <p>
     *        Default: <code>false</code>
     */

    public void setSkipFinalSnapshot(Boolean skipFinalSnapshot) {
        this.skipFinalSnapshot = skipFinalSnapshot;
    }

    /**
     * <p>
     * Determines whether a final database snapshot is created before your database is deleted. If <code>true</code> is
     * specified, no database snapshot is created. If <code>false</code> is specified, a database snapshot is created
     * before your database is deleted.
     * </p>
     * <p>
     * You must specify the <code>final relational database snapshot name</code> parameter if the
     * <code>skip final snapshot</code> parameter is <code>false</code>.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @return Determines whether a final database snapshot is created before your database is deleted. If
     *         <code>true</code> is specified, no database snapshot is created. If <code>false</code> is specified, a
     *         database snapshot is created before your database is deleted.</p>
     *         <p>
     *         You must specify the <code>final relational database snapshot name</code> parameter if the
     *         <code>skip final snapshot</code> parameter is <code>false</code>.
     *         </p>
     *         <p>
     *         Default: <code>false</code>
     */

    public Boolean getSkipFinalSnapshot() {
        return this.skipFinalSnapshot;
    }

    /**
     * <p>
     * Determines whether a final database snapshot is created before your database is deleted. If <code>true</code> is
     * specified, no database snapshot is created. If <code>false</code> is specified, a database snapshot is created
     * before your database is deleted.
     * </p>
     * <p>
     * You must specify the <code>final relational database snapshot name</code> parameter if the
     * <code>skip final snapshot</code> parameter is <code>false</code>.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @param skipFinalSnapshot
     *        Determines whether a final database snapshot is created before your database is deleted. If
     *        <code>true</code> is specified, no database snapshot is created. If <code>false</code> is specified, a
     *        database snapshot is created before your database is deleted.</p>
     *        <p>
     *        You must specify the <code>final relational database snapshot name</code> parameter if the
     *        <code>skip final snapshot</code> parameter is <code>false</code>.
     *        </p>
     *        <p>
     *        Default: <code>false</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteRelationalDatabaseRequest withSkipFinalSnapshot(Boolean skipFinalSnapshot) {
        setSkipFinalSnapshot(skipFinalSnapshot);
        return this;
    }

    /**
     * <p>
     * Determines whether a final database snapshot is created before your database is deleted. If <code>true</code> is
     * specified, no database snapshot is created. If <code>false</code> is specified, a database snapshot is created
     * before your database is deleted.
     * </p>
     * <p>
     * You must specify the <code>final relational database snapshot name</code> parameter if the
     * <code>skip final snapshot</code> parameter is <code>false</code>.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @return Determines whether a final database snapshot is created before your database is deleted. If
     *         <code>true</code> is specified, no database snapshot is created. If <code>false</code> is specified, a
     *         database snapshot is created before your database is deleted.</p>
     *         <p>
     *         You must specify the <code>final relational database snapshot name</code> parameter if the
     *         <code>skip final snapshot</code> parameter is <code>false</code>.
     *         </p>
     *         <p>
     *         Default: <code>false</code>
     */

    public Boolean isSkipFinalSnapshot() {
        return this.skipFinalSnapshot;
    }

    /**
     * <p>
     * The name of the database snapshot created if <code>skip final snapshot</code> is <code>false</code>, which is the
     * default value for that parameter.
     * </p>
     * <note>
     * <p>
     * Specifying this parameter and also specifying the <code>skip final snapshot</code> parameter to <code>true</code>
     * results in an error.
     * </p>
     * </note>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 2 to 255 alphanumeric characters, or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * The first and last character must be a letter or number.
     * </p>
     * </li>
     * </ul>
     * 
     * @param finalRelationalDatabaseSnapshotName
     *        The name of the database snapshot created if <code>skip final snapshot</code> is <code>false</code>, which
     *        is the default value for that parameter.</p> <note>
     *        <p>
     *        Specifying this parameter and also specifying the <code>skip final snapshot</code> parameter to
     *        <code>true</code> results in an error.
     *        </p>
     *        </note>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must contain from 2 to 255 alphanumeric characters, or hyphens.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The first and last character must be a letter or number.
     *        </p>
     *        </li>
     */

    public void setFinalRelationalDatabaseSnapshotName(String finalRelationalDatabaseSnapshotName) {
        this.finalRelationalDatabaseSnapshotName = finalRelationalDatabaseSnapshotName;
    }

    /**
     * <p>
     * The name of the database snapshot created if <code>skip final snapshot</code> is <code>false</code>, which is the
     * default value for that parameter.
     * </p>
     * <note>
     * <p>
     * Specifying this parameter and also specifying the <code>skip final snapshot</code> parameter to <code>true</code>
     * results in an error.
     * </p>
     * </note>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 2 to 255 alphanumeric characters, or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * The first and last character must be a letter or number.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The name of the database snapshot created if <code>skip final snapshot</code> is <code>false</code>,
     *         which is the default value for that parameter.</p> <note>
     *         <p>
     *         Specifying this parameter and also specifying the <code>skip final snapshot</code> parameter to
     *         <code>true</code> results in an error.
     *         </p>
     *         </note>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must contain from 2 to 255 alphanumeric characters, or hyphens.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The first and last character must be a letter or number.
     *         </p>
     *         </li>
     */

    public String getFinalRelationalDatabaseSnapshotName() {
        return this.finalRelationalDatabaseSnapshotName;
    }

    /**
     * <p>
     * The name of the database snapshot created if <code>skip final snapshot</code> is <code>false</code>, which is the
     * default value for that parameter.
     * </p>
     * <note>
     * <p>
     * Specifying this parameter and also specifying the <code>skip final snapshot</code> parameter to <code>true</code>
     * results in an error.
     * </p>
     * </note>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 2 to 255 alphanumeric characters, or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * The first and last character must be a letter or number.
     * </p>
     * </li>
     * </ul>
     * 
     * @param finalRelationalDatabaseSnapshotName
     *        The name of the database snapshot created if <code>skip final snapshot</code> is <code>false</code>, which
     *        is the default value for that parameter.</p> <note>
     *        <p>
     *        Specifying this parameter and also specifying the <code>skip final snapshot</code> parameter to
     *        <code>true</code> results in an error.
     *        </p>
     *        </note>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must contain from 2 to 255 alphanumeric characters, or hyphens.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The first and last character must be a letter or number.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteRelationalDatabaseRequest withFinalRelationalDatabaseSnapshotName(String finalRelationalDatabaseSnapshotName) {
        setFinalRelationalDatabaseSnapshotName(finalRelationalDatabaseSnapshotName);
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
        if (getRelationalDatabaseName() != null)
            sb.append("RelationalDatabaseName: ").append(getRelationalDatabaseName()).append(",");
        if (getSkipFinalSnapshot() != null)
            sb.append("SkipFinalSnapshot: ").append(getSkipFinalSnapshot()).append(",");
        if (getFinalRelationalDatabaseSnapshotName() != null)
            sb.append("FinalRelationalDatabaseSnapshotName: ").append(getFinalRelationalDatabaseSnapshotName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteRelationalDatabaseRequest == false)
            return false;
        DeleteRelationalDatabaseRequest other = (DeleteRelationalDatabaseRequest) obj;
        if (other.getRelationalDatabaseName() == null ^ this.getRelationalDatabaseName() == null)
            return false;
        if (other.getRelationalDatabaseName() != null && other.getRelationalDatabaseName().equals(this.getRelationalDatabaseName()) == false)
            return false;
        if (other.getSkipFinalSnapshot() == null ^ this.getSkipFinalSnapshot() == null)
            return false;
        if (other.getSkipFinalSnapshot() != null && other.getSkipFinalSnapshot().equals(this.getSkipFinalSnapshot()) == false)
            return false;
        if (other.getFinalRelationalDatabaseSnapshotName() == null ^ this.getFinalRelationalDatabaseSnapshotName() == null)
            return false;
        if (other.getFinalRelationalDatabaseSnapshotName() != null
                && other.getFinalRelationalDatabaseSnapshotName().equals(this.getFinalRelationalDatabaseSnapshotName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRelationalDatabaseName() == null) ? 0 : getRelationalDatabaseName().hashCode());
        hashCode = prime * hashCode + ((getSkipFinalSnapshot() == null) ? 0 : getSkipFinalSnapshot().hashCode());
        hashCode = prime * hashCode + ((getFinalRelationalDatabaseSnapshotName() == null) ? 0 : getFinalRelationalDatabaseSnapshotName().hashCode());
        return hashCode;
    }

    @Override
    public DeleteRelationalDatabaseRequest clone() {
        return (DeleteRelationalDatabaseRequest) super.clone();
    }

}
