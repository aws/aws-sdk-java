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
package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The key value store. Use this to separate data from function code, allowing you to update data without having to
 * publish a new version of a function. The key value store holds keys and their corresponding values.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/KeyValueStore" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KeyValueStore implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the key value store.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The unique Id for the key value store.
     * </p>
     */
    private String id;
    /**
     * <p>
     * A comment for the key value store.
     * </p>
     */
    private String comment;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the key value store.
     * </p>
     */
    private String aRN;
    /**
     * <p>
     * The status of the key value store.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The last-modified time of the key value store.
     * </p>
     */
    private java.util.Date lastModifiedTime;

    /**
     * <p>
     * The name of the key value store.
     * </p>
     * 
     * @param name
     *        The name of the key value store.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the key value store.
     * </p>
     * 
     * @return The name of the key value store.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the key value store.
     * </p>
     * 
     * @param name
     *        The name of the key value store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KeyValueStore withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The unique Id for the key value store.
     * </p>
     * 
     * @param id
     *        The unique Id for the key value store.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique Id for the key value store.
     * </p>
     * 
     * @return The unique Id for the key value store.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique Id for the key value store.
     * </p>
     * 
     * @param id
     *        The unique Id for the key value store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KeyValueStore withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * A comment for the key value store.
     * </p>
     * 
     * @param comment
     *        A comment for the key value store.
     */

    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * <p>
     * A comment for the key value store.
     * </p>
     * 
     * @return A comment for the key value store.
     */

    public String getComment() {
        return this.comment;
    }

    /**
     * <p>
     * A comment for the key value store.
     * </p>
     * 
     * @param comment
     *        A comment for the key value store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KeyValueStore withComment(String comment) {
        setComment(comment);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the key value store.
     * </p>
     * 
     * @param aRN
     *        The Amazon Resource Name (ARN) of the key value store.
     */

    public void setARN(String aRN) {
        this.aRN = aRN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the key value store.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the key value store.
     */

    public String getARN() {
        return this.aRN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the key value store.
     * </p>
     * 
     * @param aRN
     *        The Amazon Resource Name (ARN) of the key value store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KeyValueStore withARN(String aRN) {
        setARN(aRN);
        return this;
    }

    /**
     * <p>
     * The status of the key value store.
     * </p>
     * 
     * @param status
     *        The status of the key value store.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the key value store.
     * </p>
     * 
     * @return The status of the key value store.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the key value store.
     * </p>
     * 
     * @param status
     *        The status of the key value store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KeyValueStore withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The last-modified time of the key value store.
     * </p>
     * 
     * @param lastModifiedTime
     *        The last-modified time of the key value store.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * The last-modified time of the key value store.
     * </p>
     * 
     * @return The last-modified time of the key value store.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * The last-modified time of the key value store.
     * </p>
     * 
     * @param lastModifiedTime
     *        The last-modified time of the key value store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KeyValueStore withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getComment() != null)
            sb.append("Comment: ").append(getComment()).append(",");
        if (getARN() != null)
            sb.append("ARN: ").append(getARN()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KeyValueStore == false)
            return false;
        KeyValueStore other = (KeyValueStore) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getComment() == null ^ this.getComment() == null)
            return false;
        if (other.getComment() != null && other.getComment().equals(this.getComment()) == false)
            return false;
        if (other.getARN() == null ^ this.getARN() == null)
            return false;
        if (other.getARN() != null && other.getARN().equals(this.getARN()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getComment() == null) ? 0 : getComment().hashCode());
        hashCode = prime * hashCode + ((getARN() == null) ? 0 : getARN().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        return hashCode;
    }

    @Override
    public KeyValueStore clone() {
        try {
            return (KeyValueStore) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
