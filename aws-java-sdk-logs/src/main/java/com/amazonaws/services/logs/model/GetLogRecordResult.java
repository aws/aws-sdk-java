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
package com.amazonaws.services.logs.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/GetLogRecord" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetLogRecordResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The requested log event, as a JSON string.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalMap<String, String> logRecord;

    /**
     * <p>
     * The requested log event, as a JSON string.
     * </p>
     * 
     * @return The requested log event, as a JSON string.
     */

    public java.util.Map<String, String> getLogRecord() {
        if (logRecord == null) {
            logRecord = new com.amazonaws.internal.SdkInternalMap<String, String>();
        }
        return logRecord;
    }

    /**
     * <p>
     * The requested log event, as a JSON string.
     * </p>
     * 
     * @param logRecord
     *        The requested log event, as a JSON string.
     */

    public void setLogRecord(java.util.Map<String, String> logRecord) {
        this.logRecord = logRecord == null ? null : new com.amazonaws.internal.SdkInternalMap<String, String>(logRecord);
    }

    /**
     * <p>
     * The requested log event, as a JSON string.
     * </p>
     * 
     * @param logRecord
     *        The requested log event, as a JSON string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLogRecordResult withLogRecord(java.util.Map<String, String> logRecord) {
        setLogRecord(logRecord);
        return this;
    }

    public GetLogRecordResult addLogRecordEntry(String key, String value) {
        if (null == this.logRecord) {
            this.logRecord = new com.amazonaws.internal.SdkInternalMap<String, String>();
        }
        if (this.logRecord.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.logRecord.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into LogRecord.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLogRecordResult clearLogRecordEntries() {
        this.logRecord = null;
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
        if (getLogRecord() != null)
            sb.append("LogRecord: ").append(getLogRecord());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetLogRecordResult == false)
            return false;
        GetLogRecordResult other = (GetLogRecordResult) obj;
        if (other.getLogRecord() == null ^ this.getLogRecord() == null)
            return false;
        if (other.getLogRecord() != null && other.getLogRecord().equals(this.getLogRecord()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLogRecord() == null) ? 0 : getLogRecord().hashCode());
        return hashCode;
    }

    @Override
    public GetLogRecordResult clone() {
        try {
            return (GetLogRecordResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
