/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ioteventsdata.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-data-2018-10-23/BatchEnableAlarm" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchEnableAlarmResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of errors associated with the request, or <code>null</code> if there are no errors. Each error entry
     * contains an entry ID that helps you identify the entry that failed.
     * </p>
     */
    private java.util.List<BatchAlarmActionErrorEntry> errorEntries;

    /**
     * <p>
     * A list of errors associated with the request, or <code>null</code> if there are no errors. Each error entry
     * contains an entry ID that helps you identify the entry that failed.
     * </p>
     * 
     * @return A list of errors associated with the request, or <code>null</code> if there are no errors. Each error
     *         entry contains an entry ID that helps you identify the entry that failed.
     */

    public java.util.List<BatchAlarmActionErrorEntry> getErrorEntries() {
        return errorEntries;
    }

    /**
     * <p>
     * A list of errors associated with the request, or <code>null</code> if there are no errors. Each error entry
     * contains an entry ID that helps you identify the entry that failed.
     * </p>
     * 
     * @param errorEntries
     *        A list of errors associated with the request, or <code>null</code> if there are no errors. Each error
     *        entry contains an entry ID that helps you identify the entry that failed.
     */

    public void setErrorEntries(java.util.Collection<BatchAlarmActionErrorEntry> errorEntries) {
        if (errorEntries == null) {
            this.errorEntries = null;
            return;
        }

        this.errorEntries = new java.util.ArrayList<BatchAlarmActionErrorEntry>(errorEntries);
    }

    /**
     * <p>
     * A list of errors associated with the request, or <code>null</code> if there are no errors. Each error entry
     * contains an entry ID that helps you identify the entry that failed.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setErrorEntries(java.util.Collection)} or {@link #withErrorEntries(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param errorEntries
     *        A list of errors associated with the request, or <code>null</code> if there are no errors. Each error
     *        entry contains an entry ID that helps you identify the entry that failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchEnableAlarmResult withErrorEntries(BatchAlarmActionErrorEntry... errorEntries) {
        if (this.errorEntries == null) {
            setErrorEntries(new java.util.ArrayList<BatchAlarmActionErrorEntry>(errorEntries.length));
        }
        for (BatchAlarmActionErrorEntry ele : errorEntries) {
            this.errorEntries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of errors associated with the request, or <code>null</code> if there are no errors. Each error entry
     * contains an entry ID that helps you identify the entry that failed.
     * </p>
     * 
     * @param errorEntries
     *        A list of errors associated with the request, or <code>null</code> if there are no errors. Each error
     *        entry contains an entry ID that helps you identify the entry that failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchEnableAlarmResult withErrorEntries(java.util.Collection<BatchAlarmActionErrorEntry> errorEntries) {
        setErrorEntries(errorEntries);
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
        if (getErrorEntries() != null)
            sb.append("ErrorEntries: ").append(getErrorEntries());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchEnableAlarmResult == false)
            return false;
        BatchEnableAlarmResult other = (BatchEnableAlarmResult) obj;
        if (other.getErrorEntries() == null ^ this.getErrorEntries() == null)
            return false;
        if (other.getErrorEntries() != null && other.getErrorEntries().equals(this.getErrorEntries()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getErrorEntries() == null) ? 0 : getErrorEntries().hashCode());
        return hashCode;
    }

    @Override
    public BatchEnableAlarmResult clone() {
        try {
            return (BatchEnableAlarmResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
