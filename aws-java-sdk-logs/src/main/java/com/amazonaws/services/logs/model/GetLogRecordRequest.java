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
package com.amazonaws.services.logs.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/GetLogRecord" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetLogRecordRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The pointer corresponding to the log event record you want to retrieve. You get this from the response of a
     * <code>GetQueryResults</code> operation. In that response, the value of the <code>@ptr</code> field for a log
     * event is the value to use as <code>logRecordPointer</code> to retrieve that complete log event record.
     * </p>
     */
    private String logRecordPointer;
    /**
     * <p>
     * Specify <code>true</code> to display the log event fields with all sensitive data unmasked and visible. The
     * default is <code>false</code>.
     * </p>
     * <p>
     * To use this operation with this parameter, you must be signed into an account with the <code>logs:Unmask</code>
     * permission.
     * </p>
     */
    private Boolean unmask;

    /**
     * <p>
     * The pointer corresponding to the log event record you want to retrieve. You get this from the response of a
     * <code>GetQueryResults</code> operation. In that response, the value of the <code>@ptr</code> field for a log
     * event is the value to use as <code>logRecordPointer</code> to retrieve that complete log event record.
     * </p>
     * 
     * @param logRecordPointer
     *        The pointer corresponding to the log event record you want to retrieve. You get this from the response of
     *        a <code>GetQueryResults</code> operation. In that response, the value of the <code>@ptr</code> field for a
     *        log event is the value to use as <code>logRecordPointer</code> to retrieve that complete log event record.
     */

    public void setLogRecordPointer(String logRecordPointer) {
        this.logRecordPointer = logRecordPointer;
    }

    /**
     * <p>
     * The pointer corresponding to the log event record you want to retrieve. You get this from the response of a
     * <code>GetQueryResults</code> operation. In that response, the value of the <code>@ptr</code> field for a log
     * event is the value to use as <code>logRecordPointer</code> to retrieve that complete log event record.
     * </p>
     * 
     * @return The pointer corresponding to the log event record you want to retrieve. You get this from the response of
     *         a <code>GetQueryResults</code> operation. In that response, the value of the <code>@ptr</code> field for
     *         a log event is the value to use as <code>logRecordPointer</code> to retrieve that complete log event
     *         record.
     */

    public String getLogRecordPointer() {
        return this.logRecordPointer;
    }

    /**
     * <p>
     * The pointer corresponding to the log event record you want to retrieve. You get this from the response of a
     * <code>GetQueryResults</code> operation. In that response, the value of the <code>@ptr</code> field for a log
     * event is the value to use as <code>logRecordPointer</code> to retrieve that complete log event record.
     * </p>
     * 
     * @param logRecordPointer
     *        The pointer corresponding to the log event record you want to retrieve. You get this from the response of
     *        a <code>GetQueryResults</code> operation. In that response, the value of the <code>@ptr</code> field for a
     *        log event is the value to use as <code>logRecordPointer</code> to retrieve that complete log event record.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLogRecordRequest withLogRecordPointer(String logRecordPointer) {
        setLogRecordPointer(logRecordPointer);
        return this;
    }

    /**
     * <p>
     * Specify <code>true</code> to display the log event fields with all sensitive data unmasked and visible. The
     * default is <code>false</code>.
     * </p>
     * <p>
     * To use this operation with this parameter, you must be signed into an account with the <code>logs:Unmask</code>
     * permission.
     * </p>
     * 
     * @param unmask
     *        Specify <code>true</code> to display the log event fields with all sensitive data unmasked and visible.
     *        The default is <code>false</code>.</p>
     *        <p>
     *        To use this operation with this parameter, you must be signed into an account with the
     *        <code>logs:Unmask</code> permission.
     */

    public void setUnmask(Boolean unmask) {
        this.unmask = unmask;
    }

    /**
     * <p>
     * Specify <code>true</code> to display the log event fields with all sensitive data unmasked and visible. The
     * default is <code>false</code>.
     * </p>
     * <p>
     * To use this operation with this parameter, you must be signed into an account with the <code>logs:Unmask</code>
     * permission.
     * </p>
     * 
     * @return Specify <code>true</code> to display the log event fields with all sensitive data unmasked and visible.
     *         The default is <code>false</code>.</p>
     *         <p>
     *         To use this operation with this parameter, you must be signed into an account with the
     *         <code>logs:Unmask</code> permission.
     */

    public Boolean getUnmask() {
        return this.unmask;
    }

    /**
     * <p>
     * Specify <code>true</code> to display the log event fields with all sensitive data unmasked and visible. The
     * default is <code>false</code>.
     * </p>
     * <p>
     * To use this operation with this parameter, you must be signed into an account with the <code>logs:Unmask</code>
     * permission.
     * </p>
     * 
     * @param unmask
     *        Specify <code>true</code> to display the log event fields with all sensitive data unmasked and visible.
     *        The default is <code>false</code>.</p>
     *        <p>
     *        To use this operation with this parameter, you must be signed into an account with the
     *        <code>logs:Unmask</code> permission.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLogRecordRequest withUnmask(Boolean unmask) {
        setUnmask(unmask);
        return this;
    }

    /**
     * <p>
     * Specify <code>true</code> to display the log event fields with all sensitive data unmasked and visible. The
     * default is <code>false</code>.
     * </p>
     * <p>
     * To use this operation with this parameter, you must be signed into an account with the <code>logs:Unmask</code>
     * permission.
     * </p>
     * 
     * @return Specify <code>true</code> to display the log event fields with all sensitive data unmasked and visible.
     *         The default is <code>false</code>.</p>
     *         <p>
     *         To use this operation with this parameter, you must be signed into an account with the
     *         <code>logs:Unmask</code> permission.
     */

    public Boolean isUnmask() {
        return this.unmask;
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
        if (getLogRecordPointer() != null)
            sb.append("LogRecordPointer: ").append(getLogRecordPointer()).append(",");
        if (getUnmask() != null)
            sb.append("Unmask: ").append(getUnmask());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetLogRecordRequest == false)
            return false;
        GetLogRecordRequest other = (GetLogRecordRequest) obj;
        if (other.getLogRecordPointer() == null ^ this.getLogRecordPointer() == null)
            return false;
        if (other.getLogRecordPointer() != null && other.getLogRecordPointer().equals(this.getLogRecordPointer()) == false)
            return false;
        if (other.getUnmask() == null ^ this.getUnmask() == null)
            return false;
        if (other.getUnmask() != null && other.getUnmask().equals(this.getUnmask()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLogRecordPointer() == null) ? 0 : getLogRecordPointer().hashCode());
        hashCode = prime * hashCode + ((getUnmask() == null) ? 0 : getUnmask().hashCode());
        return hashCode;
    }

    @Override
    public GetLogRecordRequest clone() {
        return (GetLogRecordRequest) super.clone();
    }

}
