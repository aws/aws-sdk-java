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
package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;

/**
 * <p>
 * The details of the step failure. The service attempts to detect the root cause for many common failures.
 * </p>
 */
public class FailureDetails implements Serializable, Cloneable {

    /**
     * <p>
     * The reason for the step failure. In the case where the service cannot successfully determine the root cause of
     * the failure, it returns "Unknown Error" as a reason.
     * </p>
     */
    private String reason;
    /**
     * <p>
     * The descriptive message including the error the EMR service has identified as the cause of step failure. This is
     * text from an error log that describes the root cause of the failure.
     * </p>
     */
    private String message;
    /**
     * <p>
     * The path to the log file where the step failure root cause was originally recorded.
     * </p>
     */
    private String logFile;

    /**
     * <p>
     * The reason for the step failure. In the case where the service cannot successfully determine the root cause of
     * the failure, it returns "Unknown Error" as a reason.
     * </p>
     * 
     * @param reason
     *        The reason for the step failure. In the case where the service cannot successfully determine the root
     *        cause of the failure, it returns "Unknown Error" as a reason.
     */

    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * <p>
     * The reason for the step failure. In the case where the service cannot successfully determine the root cause of
     * the failure, it returns "Unknown Error" as a reason.
     * </p>
     * 
     * @return The reason for the step failure. In the case where the service cannot successfully determine the root
     *         cause of the failure, it returns "Unknown Error" as a reason.
     */

    public String getReason() {
        return this.reason;
    }

    /**
     * <p>
     * The reason for the step failure. In the case where the service cannot successfully determine the root cause of
     * the failure, it returns "Unknown Error" as a reason.
     * </p>
     * 
     * @param reason
     *        The reason for the step failure. In the case where the service cannot successfully determine the root
     *        cause of the failure, it returns "Unknown Error" as a reason.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FailureDetails withReason(String reason) {
        setReason(reason);
        return this;
    }

    /**
     * <p>
     * The descriptive message including the error the EMR service has identified as the cause of step failure. This is
     * text from an error log that describes the root cause of the failure.
     * </p>
     * 
     * @param message
     *        The descriptive message including the error the EMR service has identified as the cause of step failure.
     *        This is text from an error log that describes the root cause of the failure.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * The descriptive message including the error the EMR service has identified as the cause of step failure. This is
     * text from an error log that describes the root cause of the failure.
     * </p>
     * 
     * @return The descriptive message including the error the EMR service has identified as the cause of step failure.
     *         This is text from an error log that describes the root cause of the failure.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * The descriptive message including the error the EMR service has identified as the cause of step failure. This is
     * text from an error log that describes the root cause of the failure.
     * </p>
     * 
     * @param message
     *        The descriptive message including the error the EMR service has identified as the cause of step failure.
     *        This is text from an error log that describes the root cause of the failure.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FailureDetails withMessage(String message) {
        setMessage(message);
        return this;
    }

    /**
     * <p>
     * The path to the log file where the step failure root cause was originally recorded.
     * </p>
     * 
     * @param logFile
     *        The path to the log file where the step failure root cause was originally recorded.
     */

    public void setLogFile(String logFile) {
        this.logFile = logFile;
    }

    /**
     * <p>
     * The path to the log file where the step failure root cause was originally recorded.
     * </p>
     * 
     * @return The path to the log file where the step failure root cause was originally recorded.
     */

    public String getLogFile() {
        return this.logFile;
    }

    /**
     * <p>
     * The path to the log file where the step failure root cause was originally recorded.
     * </p>
     * 
     * @param logFile
     *        The path to the log file where the step failure root cause was originally recorded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FailureDetails withLogFile(String logFile) {
        setLogFile(logFile);
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
        if (getReason() != null)
            sb.append("Reason: " + getReason() + ",");
        if (getMessage() != null)
            sb.append("Message: " + getMessage() + ",");
        if (getLogFile() != null)
            sb.append("LogFile: " + getLogFile());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FailureDetails == false)
            return false;
        FailureDetails other = (FailureDetails) obj;
        if (other.getReason() == null ^ this.getReason() == null)
            return false;
        if (other.getReason() != null && other.getReason().equals(this.getReason()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getLogFile() == null ^ this.getLogFile() == null)
            return false;
        if (other.getLogFile() != null && other.getLogFile().equals(this.getLogFile()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReason() == null) ? 0 : getReason().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getLogFile() == null) ? 0 : getLogFile().hashCode());
        return hashCode;
    }

    @Override
    public FailureDetails clone() {
        try {
            return (FailureDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
