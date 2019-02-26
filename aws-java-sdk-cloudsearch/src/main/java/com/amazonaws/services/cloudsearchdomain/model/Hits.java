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
package com.amazonaws.services.cloudsearchdomain.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The collection of documents that match the search request.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Hits implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The total number of documents that match the search request.
     * </p>
     */
    private Long found;
    /**
     * <p>
     * The index of the first matching document.
     * </p>
     */
    private Long start;
    /**
     * <p>
     * A cursor that can be used to retrieve the next set of matching documents when you want to page through a large
     * result set.
     * </p>
     */
    private String cursor;
    /**
     * <p>
     * A document that matches the search request.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Hit> hit;

    /**
     * <p>
     * The total number of documents that match the search request.
     * </p>
     * 
     * @param found
     *        The total number of documents that match the search request.
     */

    public void setFound(Long found) {
        this.found = found;
    }

    /**
     * <p>
     * The total number of documents that match the search request.
     * </p>
     * 
     * @return The total number of documents that match the search request.
     */

    public Long getFound() {
        return this.found;
    }

    /**
     * <p>
     * The total number of documents that match the search request.
     * </p>
     * 
     * @param found
     *        The total number of documents that match the search request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Hits withFound(Long found) {
        setFound(found);
        return this;
    }

    /**
     * <p>
     * The index of the first matching document.
     * </p>
     * 
     * @param start
     *        The index of the first matching document.
     */

    public void setStart(Long start) {
        this.start = start;
    }

    /**
     * <p>
     * The index of the first matching document.
     * </p>
     * 
     * @return The index of the first matching document.
     */

    public Long getStart() {
        return this.start;
    }

    /**
     * <p>
     * The index of the first matching document.
     * </p>
     * 
     * @param start
     *        The index of the first matching document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Hits withStart(Long start) {
        setStart(start);
        return this;
    }

    /**
     * <p>
     * A cursor that can be used to retrieve the next set of matching documents when you want to page through a large
     * result set.
     * </p>
     * 
     * @param cursor
     *        A cursor that can be used to retrieve the next set of matching documents when you want to page through a
     *        large result set.
     */

    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    /**
     * <p>
     * A cursor that can be used to retrieve the next set of matching documents when you want to page through a large
     * result set.
     * </p>
     * 
     * @return A cursor that can be used to retrieve the next set of matching documents when you want to page through a
     *         large result set.
     */

    public String getCursor() {
        return this.cursor;
    }

    /**
     * <p>
     * A cursor that can be used to retrieve the next set of matching documents when you want to page through a large
     * result set.
     * </p>
     * 
     * @param cursor
     *        A cursor that can be used to retrieve the next set of matching documents when you want to page through a
     *        large result set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Hits withCursor(String cursor) {
        setCursor(cursor);
        return this;
    }

    /**
     * <p>
     * A document that matches the search request.
     * </p>
     * 
     * @return A document that matches the search request.
     */

    public java.util.List<Hit> getHit() {
        if (hit == null) {
            hit = new com.amazonaws.internal.SdkInternalList<Hit>();
        }
        return hit;
    }

    /**
     * <p>
     * A document that matches the search request.
     * </p>
     * 
     * @param hit
     *        A document that matches the search request.
     */

    public void setHit(java.util.Collection<Hit> hit) {
        if (hit == null) {
            this.hit = null;
            return;
        }

        this.hit = new com.amazonaws.internal.SdkInternalList<Hit>(hit);
    }

    /**
     * <p>
     * A document that matches the search request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setHit(java.util.Collection)} or {@link #withHit(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param hit
     *        A document that matches the search request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Hits withHit(Hit... hit) {
        if (this.hit == null) {
            setHit(new com.amazonaws.internal.SdkInternalList<Hit>(hit.length));
        }
        for (Hit ele : hit) {
            this.hit.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A document that matches the search request.
     * </p>
     * 
     * @param hit
     *        A document that matches the search request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Hits withHit(java.util.Collection<Hit> hit) {
        setHit(hit);
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
        if (getFound() != null)
            sb.append("Found: ").append(getFound()).append(",");
        if (getStart() != null)
            sb.append("Start: ").append(getStart()).append(",");
        if (getCursor() != null)
            sb.append("Cursor: ").append(getCursor()).append(",");
        if (getHit() != null)
            sb.append("Hit: ").append(getHit());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Hits == false)
            return false;
        Hits other = (Hits) obj;
        if (other.getFound() == null ^ this.getFound() == null)
            return false;
        if (other.getFound() != null && other.getFound().equals(this.getFound()) == false)
            return false;
        if (other.getStart() == null ^ this.getStart() == null)
            return false;
        if (other.getStart() != null && other.getStart().equals(this.getStart()) == false)
            return false;
        if (other.getCursor() == null ^ this.getCursor() == null)
            return false;
        if (other.getCursor() != null && other.getCursor().equals(this.getCursor()) == false)
            return false;
        if (other.getHit() == null ^ this.getHit() == null)
            return false;
        if (other.getHit() != null && other.getHit().equals(this.getHit()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFound() == null) ? 0 : getFound().hashCode());
        hashCode = prime * hashCode + ((getStart() == null) ? 0 : getStart().hashCode());
        hashCode = prime * hashCode + ((getCursor() == null) ? 0 : getCursor().hashCode());
        hashCode = prime * hashCode + ((getHit() == null) ? 0 : getHit().hashCode());
        return hashCode;
    }

    @Override
    public Hits clone() {
        try {
            return (Hits) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cloudsearchdomain.model.transform.HitsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
