/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.logs.model;

import java.io.Serializable;

/**
 * <p>
 * An object indicating the search status of a log stream in a
 * <code>FilterLogEvents</code> request.
 * </p>
 */
public class SearchedLogStream implements Serializable, Cloneable {

    /**
     * The name of the log stream.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[^:*]*<br/>
     */
    private String logStreamName;

    /**
     * Indicates whether all the events in this log stream were searched or
     * more data exists to search by paginating further.
     */
    private Boolean searchedCompletely;

    /**
     * The name of the log stream.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[^:*]*<br/>
     *
     * @return The name of the log stream.
     */
    public String getLogStreamName() {
        return logStreamName;
    }
    
    /**
     * The name of the log stream.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[^:*]*<br/>
     *
     * @param logStreamName The name of the log stream.
     */
    public void setLogStreamName(String logStreamName) {
        this.logStreamName = logStreamName;
    }
    
    /**
     * The name of the log stream.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[^:*]*<br/>
     *
     * @param logStreamName The name of the log stream.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SearchedLogStream withLogStreamName(String logStreamName) {
        this.logStreamName = logStreamName;
        return this;
    }

    /**
     * Indicates whether all the events in this log stream were searched or
     * more data exists to search by paginating further.
     *
     * @return Indicates whether all the events in this log stream were searched or
     *         more data exists to search by paginating further.
     */
    public Boolean isSearchedCompletely() {
        return searchedCompletely;
    }
    
    /**
     * Indicates whether all the events in this log stream were searched or
     * more data exists to search by paginating further.
     *
     * @param searchedCompletely Indicates whether all the events in this log stream were searched or
     *         more data exists to search by paginating further.
     */
    public void setSearchedCompletely(Boolean searchedCompletely) {
        this.searchedCompletely = searchedCompletely;
    }
    
    /**
     * Indicates whether all the events in this log stream were searched or
     * more data exists to search by paginating further.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param searchedCompletely Indicates whether all the events in this log stream were searched or
     *         more data exists to search by paginating further.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SearchedLogStream withSearchedCompletely(Boolean searchedCompletely) {
        this.searchedCompletely = searchedCompletely;
        return this;
    }

    /**
     * Indicates whether all the events in this log stream were searched or
     * more data exists to search by paginating further.
     *
     * @return Indicates whether all the events in this log stream were searched or
     *         more data exists to search by paginating further.
     */
    public Boolean getSearchedCompletely() {
        return searchedCompletely;
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
        if (getLogStreamName() != null) sb.append("LogStreamName: " + getLogStreamName() + ",");
        if (isSearchedCompletely() != null) sb.append("SearchedCompletely: " + isSearchedCompletely() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getLogStreamName() == null) ? 0 : getLogStreamName().hashCode()); 
        hashCode = prime * hashCode + ((isSearchedCompletely() == null) ? 0 : isSearchedCompletely().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof SearchedLogStream == false) return false;
        SearchedLogStream other = (SearchedLogStream)obj;
        
        if (other.getLogStreamName() == null ^ this.getLogStreamName() == null) return false;
        if (other.getLogStreamName() != null && other.getLogStreamName().equals(this.getLogStreamName()) == false) return false; 
        if (other.isSearchedCompletely() == null ^ this.isSearchedCompletely() == null) return false;
        if (other.isSearchedCompletely() != null && other.isSearchedCompletely().equals(this.isSearchedCompletely()) == false) return false; 
        return true;
    }
    
    @Override
    public SearchedLogStream clone() {
        try {
            return (SearchedLogStream) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    