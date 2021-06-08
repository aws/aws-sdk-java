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
package com.amazonaws.services.s3control.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/SelectionCriteria" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SelectionCriteria implements Serializable, Cloneable {

    /**
     * <p>
     * A container for the delimiter of the selection criteria being used.
     * </p>
     */
    private String delimiter;
    /**
     * <p>
     * The max depth of the selection criteria
     * </p>
     */
    private Integer maxDepth;
    /**
     * <p>
     * The minimum number of storage bytes percentage whose metrics will be selected.
     * </p>
     * <note>
     * <p>
     * You must choose a value greater than or equal to <code>1.0</code>.
     * </p>
     * </note>
     */
    private Double minStorageBytesPercentage;

    /**
     * <p>
     * A container for the delimiter of the selection criteria being used.
     * </p>
     * 
     * @param delimiter
     *        A container for the delimiter of the selection criteria being used.
     */

    public void setDelimiter(String delimiter) {
        this.delimiter = delimiter;
    }

    /**
     * <p>
     * A container for the delimiter of the selection criteria being used.
     * </p>
     * 
     * @return A container for the delimiter of the selection criteria being used.
     */

    public String getDelimiter() {
        return this.delimiter;
    }

    /**
     * <p>
     * A container for the delimiter of the selection criteria being used.
     * </p>
     * 
     * @param delimiter
     *        A container for the delimiter of the selection criteria being used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SelectionCriteria withDelimiter(String delimiter) {
        setDelimiter(delimiter);
        return this;
    }

    /**
     * <p>
     * The max depth of the selection criteria
     * </p>
     * 
     * @param maxDepth
     *        The max depth of the selection criteria
     */

    public void setMaxDepth(Integer maxDepth) {
        this.maxDepth = maxDepth;
    }

    /**
     * <p>
     * The max depth of the selection criteria
     * </p>
     * 
     * @return The max depth of the selection criteria
     */

    public Integer getMaxDepth() {
        return this.maxDepth;
    }

    /**
     * <p>
     * The max depth of the selection criteria
     * </p>
     * 
     * @param maxDepth
     *        The max depth of the selection criteria
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SelectionCriteria withMaxDepth(Integer maxDepth) {
        setMaxDepth(maxDepth);
        return this;
    }

    /**
     * <p>
     * The minimum number of storage bytes percentage whose metrics will be selected.
     * </p>
     * <note>
     * <p>
     * You must choose a value greater than or equal to <code>1.0</code>.
     * </p>
     * </note>
     * 
     * @param minStorageBytesPercentage
     *        The minimum number of storage bytes percentage whose metrics will be selected.</p> <note>
     *        <p>
     *        You must choose a value greater than or equal to <code>1.0</code>.
     *        </p>
     */

    public void setMinStorageBytesPercentage(Double minStorageBytesPercentage) {
        this.minStorageBytesPercentage = minStorageBytesPercentage;
    }

    /**
     * <p>
     * The minimum number of storage bytes percentage whose metrics will be selected.
     * </p>
     * <note>
     * <p>
     * You must choose a value greater than or equal to <code>1.0</code>.
     * </p>
     * </note>
     * 
     * @return The minimum number of storage bytes percentage whose metrics will be selected.</p> <note>
     *         <p>
     *         You must choose a value greater than or equal to <code>1.0</code>.
     *         </p>
     */

    public Double getMinStorageBytesPercentage() {
        return this.minStorageBytesPercentage;
    }

    /**
     * <p>
     * The minimum number of storage bytes percentage whose metrics will be selected.
     * </p>
     * <note>
     * <p>
     * You must choose a value greater than or equal to <code>1.0</code>.
     * </p>
     * </note>
     * 
     * @param minStorageBytesPercentage
     *        The minimum number of storage bytes percentage whose metrics will be selected.</p> <note>
     *        <p>
     *        You must choose a value greater than or equal to <code>1.0</code>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SelectionCriteria withMinStorageBytesPercentage(Double minStorageBytesPercentage) {
        setMinStorageBytesPercentage(minStorageBytesPercentage);
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
        if (getDelimiter() != null)
            sb.append("Delimiter: ").append(getDelimiter()).append(",");
        if (getMaxDepth() != null)
            sb.append("MaxDepth: ").append(getMaxDepth()).append(",");
        if (getMinStorageBytesPercentage() != null)
            sb.append("MinStorageBytesPercentage: ").append(getMinStorageBytesPercentage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SelectionCriteria == false)
            return false;
        SelectionCriteria other = (SelectionCriteria) obj;
        if (other.getDelimiter() == null ^ this.getDelimiter() == null)
            return false;
        if (other.getDelimiter() != null && other.getDelimiter().equals(this.getDelimiter()) == false)
            return false;
        if (other.getMaxDepth() == null ^ this.getMaxDepth() == null)
            return false;
        if (other.getMaxDepth() != null && other.getMaxDepth().equals(this.getMaxDepth()) == false)
            return false;
        if (other.getMinStorageBytesPercentage() == null ^ this.getMinStorageBytesPercentage() == null)
            return false;
        if (other.getMinStorageBytesPercentage() != null && other.getMinStorageBytesPercentage().equals(this.getMinStorageBytesPercentage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDelimiter() == null) ? 0 : getDelimiter().hashCode());
        hashCode = prime * hashCode + ((getMaxDepth() == null) ? 0 : getMaxDepth().hashCode());
        hashCode = prime * hashCode + ((getMinStorageBytesPercentage() == null) ? 0 : getMinStorageBytesPercentage().hashCode());
        return hashCode;
    }

    @Override
    public SelectionCriteria clone() {
        try {
            return (SelectionCriteria) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
