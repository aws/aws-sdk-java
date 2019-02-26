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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents the search status of a log stream.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/SearchedLogStream" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SearchedLogStream implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the log stream.
     * </p>
     */
    private String logStreamName;
    /**
     * <p>
     * Indicates whether all the events in this log stream were searched.
     * </p>
     */
    private Boolean searchedCompletely;

    /**
     * <p>
     * The name of the log stream.
     * </p>
     * 
     * @param logStreamName
     *        The name of the log stream.
     */

    public void setLogStreamName(String logStreamName) {
        this.logStreamName = logStreamName;
    }

    /**
     * <p>
     * The name of the log stream.
     * </p>
     * 
     * @return The name of the log stream.
     */

    public String getLogStreamName() {
        return this.logStreamName;
    }

    /**
     * <p>
     * The name of the log stream.
     * </p>
     * 
     * @param logStreamName
     *        The name of the log stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchedLogStream withLogStreamName(String logStreamName) {
        setLogStreamName(logStreamName);
        return this;
    }

    /**
     * <p>
     * Indicates whether all the events in this log stream were searched.
     * </p>
     * 
     * @param searchedCompletely
     *        Indicates whether all the events in this log stream were searched.
     */

    public void setSearchedCompletely(Boolean searchedCompletely) {
        this.searchedCompletely = searchedCompletely;
    }

    /**
     * <p>
     * Indicates whether all the events in this log stream were searched.
     * </p>
     * 
     * @return Indicates whether all the events in this log stream were searched.
     */

    public Boolean getSearchedCompletely() {
        return this.searchedCompletely;
    }

    /**
     * <p>
     * Indicates whether all the events in this log stream were searched.
     * </p>
     * 
     * @param searchedCompletely
     *        Indicates whether all the events in this log stream were searched.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchedLogStream withSearchedCompletely(Boolean searchedCompletely) {
        setSearchedCompletely(searchedCompletely);
        return this;
    }

    /**
     * <p>
     * Indicates whether all the events in this log stream were searched.
     * </p>
     * 
     * @return Indicates whether all the events in this log stream were searched.
     */

    public Boolean isSearchedCompletely() {
        return this.searchedCompletely;
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
        if (getLogStreamName() != null)
            sb.append("LogStreamName: ").append(getLogStreamName()).append(",");
        if (getSearchedCompletely() != null)
            sb.append("SearchedCompletely: ").append(getSearchedCompletely());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SearchedLogStream == false)
            return false;
        SearchedLogStream other = (SearchedLogStream) obj;
        if (other.getLogStreamName() == null ^ this.getLogStreamName() == null)
            return false;
        if (other.getLogStreamName() != null && other.getLogStreamName().equals(this.getLogStreamName()) == false)
            return false;
        if (other.getSearchedCompletely() == null ^ this.getSearchedCompletely() == null)
            return false;
        if (other.getSearchedCompletely() != null && other.getSearchedCompletely().equals(this.getSearchedCompletely()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLogStreamName() == null) ? 0 : getLogStreamName().hashCode());
        hashCode = prime * hashCode + ((getSearchedCompletely() == null) ? 0 : getSearchedCompletely().hashCode());
        return hashCode;
    }

    @Override
    public SearchedLogStream clone() {
        try {
            return (SearchedLogStream) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.logs.model.transform.SearchedLogStreamMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
