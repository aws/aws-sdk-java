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
 * This data type is used as a response element to <a>DescribeDBLogFiles</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeDBLogFilesDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDBLogFilesDetails implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the log file for the specified DB instance.
     * </p>
     */
    private String logFileName;
    /**
     * <p>
     * A POSIX timestamp when the last log entry was written.
     * </p>
     */
    private Long lastWritten;
    /**
     * <p>
     * The size, in bytes, of the log file for the specified DB instance.
     * </p>
     */
    private Long size;

    /**
     * <p>
     * The name of the log file for the specified DB instance.
     * </p>
     * 
     * @param logFileName
     *        The name of the log file for the specified DB instance.
     */

    public void setLogFileName(String logFileName) {
        this.logFileName = logFileName;
    }

    /**
     * <p>
     * The name of the log file for the specified DB instance.
     * </p>
     * 
     * @return The name of the log file for the specified DB instance.
     */

    public String getLogFileName() {
        return this.logFileName;
    }

    /**
     * <p>
     * The name of the log file for the specified DB instance.
     * </p>
     * 
     * @param logFileName
     *        The name of the log file for the specified DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDBLogFilesDetails withLogFileName(String logFileName) {
        setLogFileName(logFileName);
        return this;
    }

    /**
     * <p>
     * A POSIX timestamp when the last log entry was written.
     * </p>
     * 
     * @param lastWritten
     *        A POSIX timestamp when the last log entry was written.
     */

    public void setLastWritten(Long lastWritten) {
        this.lastWritten = lastWritten;
    }

    /**
     * <p>
     * A POSIX timestamp when the last log entry was written.
     * </p>
     * 
     * @return A POSIX timestamp when the last log entry was written.
     */

    public Long getLastWritten() {
        return this.lastWritten;
    }

    /**
     * <p>
     * A POSIX timestamp when the last log entry was written.
     * </p>
     * 
     * @param lastWritten
     *        A POSIX timestamp when the last log entry was written.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDBLogFilesDetails withLastWritten(Long lastWritten) {
        setLastWritten(lastWritten);
        return this;
    }

    /**
     * <p>
     * The size, in bytes, of the log file for the specified DB instance.
     * </p>
     * 
     * @param size
     *        The size, in bytes, of the log file for the specified DB instance.
     */

    public void setSize(Long size) {
        this.size = size;
    }

    /**
     * <p>
     * The size, in bytes, of the log file for the specified DB instance.
     * </p>
     * 
     * @return The size, in bytes, of the log file for the specified DB instance.
     */

    public Long getSize() {
        return this.size;
    }

    /**
     * <p>
     * The size, in bytes, of the log file for the specified DB instance.
     * </p>
     * 
     * @param size
     *        The size, in bytes, of the log file for the specified DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDBLogFilesDetails withSize(Long size) {
        setSize(size);
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
        if (getLogFileName() != null)
            sb.append("LogFileName: ").append(getLogFileName()).append(",");
        if (getLastWritten() != null)
            sb.append("LastWritten: ").append(getLastWritten()).append(",");
        if (getSize() != null)
            sb.append("Size: ").append(getSize());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDBLogFilesDetails == false)
            return false;
        DescribeDBLogFilesDetails other = (DescribeDBLogFilesDetails) obj;
        if (other.getLogFileName() == null ^ this.getLogFileName() == null)
            return false;
        if (other.getLogFileName() != null && other.getLogFileName().equals(this.getLogFileName()) == false)
            return false;
        if (other.getLastWritten() == null ^ this.getLastWritten() == null)
            return false;
        if (other.getLastWritten() != null && other.getLastWritten().equals(this.getLastWritten()) == false)
            return false;
        if (other.getSize() == null ^ this.getSize() == null)
            return false;
        if (other.getSize() != null && other.getSize().equals(this.getSize()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLogFileName() == null) ? 0 : getLogFileName().hashCode());
        hashCode = prime * hashCode + ((getLastWritten() == null) ? 0 : getLastWritten().hashCode());
        hashCode = prime * hashCode + ((getSize() == null) ? 0 : getSize().hashCode());
        return hashCode;
    }

    @Override
    public DescribeDBLogFilesDetails clone() {
        try {
            return (DescribeDBLogFilesDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
