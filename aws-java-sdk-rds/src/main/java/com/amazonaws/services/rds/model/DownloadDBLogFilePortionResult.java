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
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * This data type is used as a response element to <a>DownloadDBLogFilePortion</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DownloadDBLogFilePortion" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DownloadDBLogFilePortionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Entries from the specified log file.
     * </p>
     */
    private String logFileData;
    /**
     * <p>
     * A pagination token that can be used in a subsequent DownloadDBLogFilePortion request.
     * </p>
     */
    private String marker;
    /**
     * <p>
     * Boolean value that if true, indicates there is more data to be downloaded.
     * </p>
     */
    private Boolean additionalDataPending;

    /**
     * <p>
     * Entries from the specified log file.
     * </p>
     * 
     * @param logFileData
     *        Entries from the specified log file.
     */

    public void setLogFileData(String logFileData) {
        this.logFileData = logFileData;
    }

    /**
     * <p>
     * Entries from the specified log file.
     * </p>
     * 
     * @return Entries from the specified log file.
     */

    public String getLogFileData() {
        return this.logFileData;
    }

    /**
     * <p>
     * Entries from the specified log file.
     * </p>
     * 
     * @param logFileData
     *        Entries from the specified log file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DownloadDBLogFilePortionResult withLogFileData(String logFileData) {
        setLogFileData(logFileData);
        return this;
    }

    /**
     * <p>
     * A pagination token that can be used in a subsequent DownloadDBLogFilePortion request.
     * </p>
     * 
     * @param marker
     *        A pagination token that can be used in a subsequent DownloadDBLogFilePortion request.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * A pagination token that can be used in a subsequent DownloadDBLogFilePortion request.
     * </p>
     * 
     * @return A pagination token that can be used in a subsequent DownloadDBLogFilePortion request.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * A pagination token that can be used in a subsequent DownloadDBLogFilePortion request.
     * </p>
     * 
     * @param marker
     *        A pagination token that can be used in a subsequent DownloadDBLogFilePortion request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DownloadDBLogFilePortionResult withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * Boolean value that if true, indicates there is more data to be downloaded.
     * </p>
     * 
     * @param additionalDataPending
     *        Boolean value that if true, indicates there is more data to be downloaded.
     */

    public void setAdditionalDataPending(Boolean additionalDataPending) {
        this.additionalDataPending = additionalDataPending;
    }

    /**
     * <p>
     * Boolean value that if true, indicates there is more data to be downloaded.
     * </p>
     * 
     * @return Boolean value that if true, indicates there is more data to be downloaded.
     */

    public Boolean getAdditionalDataPending() {
        return this.additionalDataPending;
    }

    /**
     * <p>
     * Boolean value that if true, indicates there is more data to be downloaded.
     * </p>
     * 
     * @param additionalDataPending
     *        Boolean value that if true, indicates there is more data to be downloaded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DownloadDBLogFilePortionResult withAdditionalDataPending(Boolean additionalDataPending) {
        setAdditionalDataPending(additionalDataPending);
        return this;
    }

    /**
     * <p>
     * Boolean value that if true, indicates there is more data to be downloaded.
     * </p>
     * 
     * @return Boolean value that if true, indicates there is more data to be downloaded.
     */

    public Boolean isAdditionalDataPending() {
        return this.additionalDataPending;
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
        if (getLogFileData() != null)
            sb.append("LogFileData: ").append(getLogFileData()).append(",");
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker()).append(",");
        if (getAdditionalDataPending() != null)
            sb.append("AdditionalDataPending: ").append(getAdditionalDataPending());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DownloadDBLogFilePortionResult == false)
            return false;
        DownloadDBLogFilePortionResult other = (DownloadDBLogFilePortionResult) obj;
        if (other.getLogFileData() == null ^ this.getLogFileData() == null)
            return false;
        if (other.getLogFileData() != null && other.getLogFileData().equals(this.getLogFileData()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getAdditionalDataPending() == null ^ this.getAdditionalDataPending() == null)
            return false;
        if (other.getAdditionalDataPending() != null && other.getAdditionalDataPending().equals(this.getAdditionalDataPending()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLogFileData() == null) ? 0 : getLogFileData().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getAdditionalDataPending() == null) ? 0 : getAdditionalDataPending().hashCode());
        return hashCode;
    }

    @Override
    public DownloadDBLogFilePortionResult clone() {
        try {
            return (DownloadDBLogFilePortionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
