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
package com.amazonaws.services.snowball.model;

import java.io.Serializable;

/**
 * <p>
 * Contains a key range. For export jobs, a <code>S3Resource</code> object can
 * have an optional <code>KeyRange</code> value. The length of the range is
 * defined at job creation, and has either an inclusive <code>BeginMarker</code>
 * , an inclusive <code>EndMarker</code>, or both. Ranges are UTF-8 binary
 * sorted.
 * </p>
 */
public class KeyRange implements Serializable, Cloneable {

    /**
     * <p>
     * </p>
     */
    private String beginMarker;
    /**
     * <p>
     * </p>
     */
    private String endMarker;

    /**
     * <p>
     * </p>
     * 
     * @param beginMarker
     */

    public void setBeginMarker(String beginMarker) {
        this.beginMarker = beginMarker;
    }

    /**
     * <p>
     * </p>
     * 
     * @return
     */

    public String getBeginMarker() {
        return this.beginMarker;
    }

    /**
     * <p>
     * </p>
     * 
     * @param beginMarker
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public KeyRange withBeginMarker(String beginMarker) {
        setBeginMarker(beginMarker);
        return this;
    }

    /**
     * <p>
     * </p>
     * 
     * @param endMarker
     */

    public void setEndMarker(String endMarker) {
        this.endMarker = endMarker;
    }

    /**
     * <p>
     * </p>
     * 
     * @return
     */

    public String getEndMarker() {
        return this.endMarker;
    }

    /**
     * <p>
     * </p>
     * 
     * @param endMarker
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public KeyRange withEndMarker(String endMarker) {
        setEndMarker(endMarker);
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
        if (getBeginMarker() != null)
            sb.append("BeginMarker: " + getBeginMarker() + ",");
        if (getEndMarker() != null)
            sb.append("EndMarker: " + getEndMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KeyRange == false)
            return false;
        KeyRange other = (KeyRange) obj;
        if (other.getBeginMarker() == null ^ this.getBeginMarker() == null)
            return false;
        if (other.getBeginMarker() != null
                && other.getBeginMarker().equals(this.getBeginMarker()) == false)
            return false;
        if (other.getEndMarker() == null ^ this.getEndMarker() == null)
            return false;
        if (other.getEndMarker() != null
                && other.getEndMarker().equals(this.getEndMarker()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getBeginMarker() == null) ? 0 : getBeginMarker().hashCode());
        hashCode = prime * hashCode
                + ((getEndMarker() == null) ? 0 : getEndMarker().hashCode());
        return hashCode;
    }

    @Override
    public KeyRange clone() {
        try {
            return (KeyRange) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
