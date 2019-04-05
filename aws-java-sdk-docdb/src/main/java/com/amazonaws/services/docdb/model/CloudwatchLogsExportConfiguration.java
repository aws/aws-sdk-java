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
package com.amazonaws.services.docdb.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The configuration setting for the log types to be enabled for export to Amazon CloudWatch Logs for a specific DB
 * instance or DB cluster.
 * </p>
 * <p>
 * The <code>EnableLogTypes</code> and <code>DisableLogTypes</code> arrays determine which logs are exported (or not
 * exported) to CloudWatch Logs. The values within these arrays depend on the DB engine that is being used.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/CloudwatchLogsExportConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CloudwatchLogsExportConfiguration implements Serializable, Cloneable {

    /**
     * <p>
     * The list of log types to enable.
     * </p>
     */
    private java.util.List<String> enableLogTypes;
    /**
     * <p>
     * The list of log types to disable.
     * </p>
     */
    private java.util.List<String> disableLogTypes;

    /**
     * <p>
     * The list of log types to enable.
     * </p>
     * 
     * @return The list of log types to enable.
     */

    public java.util.List<String> getEnableLogTypes() {
        return enableLogTypes;
    }

    /**
     * <p>
     * The list of log types to enable.
     * </p>
     * 
     * @param enableLogTypes
     *        The list of log types to enable.
     */

    public void setEnableLogTypes(java.util.Collection<String> enableLogTypes) {
        if (enableLogTypes == null) {
            this.enableLogTypes = null;
            return;
        }

        this.enableLogTypes = new java.util.ArrayList<String>(enableLogTypes);
    }

    /**
     * <p>
     * The list of log types to enable.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEnableLogTypes(java.util.Collection)} or {@link #withEnableLogTypes(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param enableLogTypes
     *        The list of log types to enable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloudwatchLogsExportConfiguration withEnableLogTypes(String... enableLogTypes) {
        if (this.enableLogTypes == null) {
            setEnableLogTypes(new java.util.ArrayList<String>(enableLogTypes.length));
        }
        for (String ele : enableLogTypes) {
            this.enableLogTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of log types to enable.
     * </p>
     * 
     * @param enableLogTypes
     *        The list of log types to enable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloudwatchLogsExportConfiguration withEnableLogTypes(java.util.Collection<String> enableLogTypes) {
        setEnableLogTypes(enableLogTypes);
        return this;
    }

    /**
     * <p>
     * The list of log types to disable.
     * </p>
     * 
     * @return The list of log types to disable.
     */

    public java.util.List<String> getDisableLogTypes() {
        return disableLogTypes;
    }

    /**
     * <p>
     * The list of log types to disable.
     * </p>
     * 
     * @param disableLogTypes
     *        The list of log types to disable.
     */

    public void setDisableLogTypes(java.util.Collection<String> disableLogTypes) {
        if (disableLogTypes == null) {
            this.disableLogTypes = null;
            return;
        }

        this.disableLogTypes = new java.util.ArrayList<String>(disableLogTypes);
    }

    /**
     * <p>
     * The list of log types to disable.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDisableLogTypes(java.util.Collection)} or {@link #withDisableLogTypes(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param disableLogTypes
     *        The list of log types to disable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloudwatchLogsExportConfiguration withDisableLogTypes(String... disableLogTypes) {
        if (this.disableLogTypes == null) {
            setDisableLogTypes(new java.util.ArrayList<String>(disableLogTypes.length));
        }
        for (String ele : disableLogTypes) {
            this.disableLogTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of log types to disable.
     * </p>
     * 
     * @param disableLogTypes
     *        The list of log types to disable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloudwatchLogsExportConfiguration withDisableLogTypes(java.util.Collection<String> disableLogTypes) {
        setDisableLogTypes(disableLogTypes);
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
        if (getEnableLogTypes() != null)
            sb.append("EnableLogTypes: ").append(getEnableLogTypes()).append(",");
        if (getDisableLogTypes() != null)
            sb.append("DisableLogTypes: ").append(getDisableLogTypes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CloudwatchLogsExportConfiguration == false)
            return false;
        CloudwatchLogsExportConfiguration other = (CloudwatchLogsExportConfiguration) obj;
        if (other.getEnableLogTypes() == null ^ this.getEnableLogTypes() == null)
            return false;
        if (other.getEnableLogTypes() != null && other.getEnableLogTypes().equals(this.getEnableLogTypes()) == false)
            return false;
        if (other.getDisableLogTypes() == null ^ this.getDisableLogTypes() == null)
            return false;
        if (other.getDisableLogTypes() != null && other.getDisableLogTypes().equals(this.getDisableLogTypes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnableLogTypes() == null) ? 0 : getEnableLogTypes().hashCode());
        hashCode = prime * hashCode + ((getDisableLogTypes() == null) ? 0 : getDisableLogTypes().hashCode());
        return hashCode;
    }

    @Override
    public CloudwatchLogsExportConfiguration clone() {
        try {
            return (CloudwatchLogsExportConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
