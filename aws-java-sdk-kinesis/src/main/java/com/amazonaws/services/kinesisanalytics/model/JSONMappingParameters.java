/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.kinesisanalytics.model;

import java.io.Serializable;

/**
 * <p>
 * Provides additional mapping information when JSON is the record format on the streaming source.
 * </p>
 */
public class JSONMappingParameters implements Serializable, Cloneable {

    /**
     * <p>
     * Path to the top-level parent that contains the records.
     * </p>
     * <p>
     * For example, consider the following JSON record:
     * </p>
     * <p>
     * In the <code>RecordRowPath</code>, <code>"$"</code> refers to the root and path <code>"$.vehicle.Model"</code>
     * refers to the specific <code>"Model"</code> key in the JSON.
     * </p>
     */
    private String recordRowPath;

    /**
     * <p>
     * Path to the top-level parent that contains the records.
     * </p>
     * <p>
     * For example, consider the following JSON record:
     * </p>
     * <p>
     * In the <code>RecordRowPath</code>, <code>"$"</code> refers to the root and path <code>"$.vehicle.Model"</code>
     * refers to the specific <code>"Model"</code> key in the JSON.
     * </p>
     * 
     * @param recordRowPath
     *        Path to the top-level parent that contains the records.</p>
     *        <p>
     *        For example, consider the following JSON record:
     *        </p>
     *        <p>
     *        In the <code>RecordRowPath</code>, <code>"$"</code> refers to the root and path
     *        <code>"$.vehicle.Model"</code> refers to the specific <code>"Model"</code> key in the JSON.
     */

    public void setRecordRowPath(String recordRowPath) {
        this.recordRowPath = recordRowPath;
    }

    /**
     * <p>
     * Path to the top-level parent that contains the records.
     * </p>
     * <p>
     * For example, consider the following JSON record:
     * </p>
     * <p>
     * In the <code>RecordRowPath</code>, <code>"$"</code> refers to the root and path <code>"$.vehicle.Model"</code>
     * refers to the specific <code>"Model"</code> key in the JSON.
     * </p>
     * 
     * @return Path to the top-level parent that contains the records.</p>
     *         <p>
     *         For example, consider the following JSON record:
     *         </p>
     *         <p>
     *         In the <code>RecordRowPath</code>, <code>"$"</code> refers to the root and path
     *         <code>"$.vehicle.Model"</code> refers to the specific <code>"Model"</code> key in the JSON.
     */

    public String getRecordRowPath() {
        return this.recordRowPath;
    }

    /**
     * <p>
     * Path to the top-level parent that contains the records.
     * </p>
     * <p>
     * For example, consider the following JSON record:
     * </p>
     * <p>
     * In the <code>RecordRowPath</code>, <code>"$"</code> refers to the root and path <code>"$.vehicle.Model"</code>
     * refers to the specific <code>"Model"</code> key in the JSON.
     * </p>
     * 
     * @param recordRowPath
     *        Path to the top-level parent that contains the records.</p>
     *        <p>
     *        For example, consider the following JSON record:
     *        </p>
     *        <p>
     *        In the <code>RecordRowPath</code>, <code>"$"</code> refers to the root and path
     *        <code>"$.vehicle.Model"</code> refers to the specific <code>"Model"</code> key in the JSON.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JSONMappingParameters withRecordRowPath(String recordRowPath) {
        setRecordRowPath(recordRowPath);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getRecordRowPath() != null)
            sb.append("RecordRowPath: " + getRecordRowPath());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JSONMappingParameters == false)
            return false;
        JSONMappingParameters other = (JSONMappingParameters) obj;
        if (other.getRecordRowPath() == null ^ this.getRecordRowPath() == null)
            return false;
        if (other.getRecordRowPath() != null && other.getRecordRowPath().equals(this.getRecordRowPath()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRecordRowPath() == null) ? 0 : getRecordRowPath().hashCode());
        return hashCode;
    }

    @Override
    public JSONMappingParameters clone() {
        try {
            return (JSONMappingParameters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
