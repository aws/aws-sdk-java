/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.backupstorage.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backupstorage-2018-04-10/ListObjects" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListObjectsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /** Object list */
    private java.util.List<BackupObject> objectList;
    /** Pagination token */
    private String nextToken;

    /**
     * Object list
     * 
     * @return Object list
     */

    public java.util.List<BackupObject> getObjectList() {
        return objectList;
    }

    /**
     * Object list
     * 
     * @param objectList
     *        Object list
     */

    public void setObjectList(java.util.Collection<BackupObject> objectList) {
        if (objectList == null) {
            this.objectList = null;
            return;
        }

        this.objectList = new java.util.ArrayList<BackupObject>(objectList);
    }

    /**
     * Object list
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setObjectList(java.util.Collection)} or {@link #withObjectList(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param objectList
     *        Object list
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListObjectsResult withObjectList(BackupObject... objectList) {
        if (this.objectList == null) {
            setObjectList(new java.util.ArrayList<BackupObject>(objectList.length));
        }
        for (BackupObject ele : objectList) {
            this.objectList.add(ele);
        }
        return this;
    }

    /**
     * Object list
     * 
     * @param objectList
     *        Object list
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListObjectsResult withObjectList(java.util.Collection<BackupObject> objectList) {
        setObjectList(objectList);
        return this;
    }

    /**
     * Pagination token
     * 
     * @param nextToken
     *        Pagination token
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * Pagination token
     * 
     * @return Pagination token
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * Pagination token
     * 
     * @param nextToken
     *        Pagination token
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListObjectsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getObjectList() != null)
            sb.append("ObjectList: ").append(getObjectList()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListObjectsResult == false)
            return false;
        ListObjectsResult other = (ListObjectsResult) obj;
        if (other.getObjectList() == null ^ this.getObjectList() == null)
            return false;
        if (other.getObjectList() != null && other.getObjectList().equals(this.getObjectList()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getObjectList() == null) ? 0 : getObjectList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListObjectsResult clone() {
        try {
            return (ListObjectsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
