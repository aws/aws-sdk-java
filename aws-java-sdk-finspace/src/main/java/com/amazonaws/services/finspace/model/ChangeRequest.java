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
package com.amazonaws.services.finspace.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A list of change request objects.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/ChangeRequest" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ChangeRequest implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Defines the type of change request. A <code>changeType</code> can have the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PUT – Adds or updates files in a database.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETE – Deletes files in a database.
     * </p>
     * </li>
     * </ul>
     */
    private String changeType;
    /**
     * <p>
     * Defines the S3 path of the source file that is required to add or update files in a database.
     * </p>
     */
    private String s3Path;
    /**
     * <p>
     * Defines the path within the database directory.
     * </p>
     */
    private String dbPath;

    /**
     * <p>
     * Defines the type of change request. A <code>changeType</code> can have the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PUT – Adds or updates files in a database.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETE – Deletes files in a database.
     * </p>
     * </li>
     * </ul>
     * 
     * @param changeType
     *        Defines the type of change request. A <code>changeType</code> can have the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        PUT – Adds or updates files in a database.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DELETE – Deletes files in a database.
     *        </p>
     *        </li>
     * @see ChangeType
     */

    public void setChangeType(String changeType) {
        this.changeType = changeType;
    }

    /**
     * <p>
     * Defines the type of change request. A <code>changeType</code> can have the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PUT – Adds or updates files in a database.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETE – Deletes files in a database.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Defines the type of change request. A <code>changeType</code> can have the following values:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         PUT – Adds or updates files in a database.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DELETE – Deletes files in a database.
     *         </p>
     *         </li>
     * @see ChangeType
     */

    public String getChangeType() {
        return this.changeType;
    }

    /**
     * <p>
     * Defines the type of change request. A <code>changeType</code> can have the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PUT – Adds or updates files in a database.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETE – Deletes files in a database.
     * </p>
     * </li>
     * </ul>
     * 
     * @param changeType
     *        Defines the type of change request. A <code>changeType</code> can have the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        PUT – Adds or updates files in a database.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DELETE – Deletes files in a database.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChangeType
     */

    public ChangeRequest withChangeType(String changeType) {
        setChangeType(changeType);
        return this;
    }

    /**
     * <p>
     * Defines the type of change request. A <code>changeType</code> can have the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PUT – Adds or updates files in a database.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETE – Deletes files in a database.
     * </p>
     * </li>
     * </ul>
     * 
     * @param changeType
     *        Defines the type of change request. A <code>changeType</code> can have the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        PUT – Adds or updates files in a database.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DELETE – Deletes files in a database.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChangeType
     */

    public ChangeRequest withChangeType(ChangeType changeType) {
        this.changeType = changeType.toString();
        return this;
    }

    /**
     * <p>
     * Defines the S3 path of the source file that is required to add or update files in a database.
     * </p>
     * 
     * @param s3Path
     *        Defines the S3 path of the source file that is required to add or update files in a database.
     */

    public void setS3Path(String s3Path) {
        this.s3Path = s3Path;
    }

    /**
     * <p>
     * Defines the S3 path of the source file that is required to add or update files in a database.
     * </p>
     * 
     * @return Defines the S3 path of the source file that is required to add or update files in a database.
     */

    public String getS3Path() {
        return this.s3Path;
    }

    /**
     * <p>
     * Defines the S3 path of the source file that is required to add or update files in a database.
     * </p>
     * 
     * @param s3Path
     *        Defines the S3 path of the source file that is required to add or update files in a database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChangeRequest withS3Path(String s3Path) {
        setS3Path(s3Path);
        return this;
    }

    /**
     * <p>
     * Defines the path within the database directory.
     * </p>
     * 
     * @param dbPath
     *        Defines the path within the database directory.
     */

    public void setDbPath(String dbPath) {
        this.dbPath = dbPath;
    }

    /**
     * <p>
     * Defines the path within the database directory.
     * </p>
     * 
     * @return Defines the path within the database directory.
     */

    public String getDbPath() {
        return this.dbPath;
    }

    /**
     * <p>
     * Defines the path within the database directory.
     * </p>
     * 
     * @param dbPath
     *        Defines the path within the database directory.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChangeRequest withDbPath(String dbPath) {
        setDbPath(dbPath);
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
        if (getChangeType() != null)
            sb.append("ChangeType: ").append(getChangeType()).append(",");
        if (getS3Path() != null)
            sb.append("S3Path: ").append(getS3Path()).append(",");
        if (getDbPath() != null)
            sb.append("DbPath: ").append(getDbPath());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ChangeRequest == false)
            return false;
        ChangeRequest other = (ChangeRequest) obj;
        if (other.getChangeType() == null ^ this.getChangeType() == null)
            return false;
        if (other.getChangeType() != null && other.getChangeType().equals(this.getChangeType()) == false)
            return false;
        if (other.getS3Path() == null ^ this.getS3Path() == null)
            return false;
        if (other.getS3Path() != null && other.getS3Path().equals(this.getS3Path()) == false)
            return false;
        if (other.getDbPath() == null ^ this.getDbPath() == null)
            return false;
        if (other.getDbPath() != null && other.getDbPath().equals(this.getDbPath()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChangeType() == null) ? 0 : getChangeType().hashCode());
        hashCode = prime * hashCode + ((getS3Path() == null) ? 0 : getS3Path().hashCode());
        hashCode = prime * hashCode + ((getDbPath() == null) ? 0 : getDbPath().hashCode());
        return hashCode;
    }

    @Override
    public ChangeRequest clone() {
        try {
            return (ChangeRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.finspace.model.transform.ChangeRequestMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
