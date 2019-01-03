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
package com.amazonaws.services.pinpointemail.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * An object that contains information about blacklist events.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/GetBlacklistReports" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetBlacklistReportsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An object that contains information about a blacklist that one of your dedicated IP addresses appears on.
     * </p>
     */
    private java.util.Map<String, java.util.List<BlacklistEntry>> blacklistReport;

    /**
     * <p>
     * An object that contains information about a blacklist that one of your dedicated IP addresses appears on.
     * </p>
     * 
     * @return An object that contains information about a blacklist that one of your dedicated IP addresses appears on.
     */

    public java.util.Map<String, java.util.List<BlacklistEntry>> getBlacklistReport() {
        return blacklistReport;
    }

    /**
     * <p>
     * An object that contains information about a blacklist that one of your dedicated IP addresses appears on.
     * </p>
     * 
     * @param blacklistReport
     *        An object that contains information about a blacklist that one of your dedicated IP addresses appears on.
     */

    public void setBlacklistReport(java.util.Map<String, java.util.List<BlacklistEntry>> blacklistReport) {
        this.blacklistReport = blacklistReport;
    }

    /**
     * <p>
     * An object that contains information about a blacklist that one of your dedicated IP addresses appears on.
     * </p>
     * 
     * @param blacklistReport
     *        An object that contains information about a blacklist that one of your dedicated IP addresses appears on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBlacklistReportsResult withBlacklistReport(java.util.Map<String, java.util.List<BlacklistEntry>> blacklistReport) {
        setBlacklistReport(blacklistReport);
        return this;
    }

    public GetBlacklistReportsResult addBlacklistReportEntry(String key, java.util.List<BlacklistEntry> value) {
        if (null == this.blacklistReport) {
            this.blacklistReport = new java.util.HashMap<String, java.util.List<BlacklistEntry>>();
        }
        if (this.blacklistReport.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.blacklistReport.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into BlacklistReport.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBlacklistReportsResult clearBlacklistReportEntries() {
        this.blacklistReport = null;
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
        if (getBlacklistReport() != null)
            sb.append("BlacklistReport: ").append(getBlacklistReport());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetBlacklistReportsResult == false)
            return false;
        GetBlacklistReportsResult other = (GetBlacklistReportsResult) obj;
        if (other.getBlacklistReport() == null ^ this.getBlacklistReport() == null)
            return false;
        if (other.getBlacklistReport() != null && other.getBlacklistReport().equals(this.getBlacklistReport()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBlacklistReport() == null) ? 0 : getBlacklistReport().hashCode());
        return hashCode;
    }

    @Override
    public GetBlacklistReportsResult clone() {
        try {
            return (GetBlacklistReportsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
