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
package com.amazonaws.services.cloudtrail.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/StartImport" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartImportRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the destination event data store. Use this parameter for a new import.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> destinations;
    /**
     * <p>
     * The source S3 bucket for the import. Use this parameter for a new import.
     * </p>
     */
    private ImportSource importSource;
    /**
     * <p>
     * Use with <code>EndEventTime</code> to bound a <code>StartImport</code> request, and limit imported trail events
     * to only those events logged within a specified time period. When you specify a time range, CloudTrail checks the
     * prefix and log file names to verify the names contain a date between the specified <code>StartEventTime</code>
     * and <code>EndEventTime</code> before attempting to import events.
     * </p>
     */
    private java.util.Date startEventTime;
    /**
     * <p>
     * Use with <code>StartEventTime</code> to bound a <code>StartImport</code> request, and limit imported trail events
     * to only those events logged within a specified time period. When you specify a time range, CloudTrail checks the
     * prefix and log file names to verify the names contain a date between the specified <code>StartEventTime</code>
     * and <code>EndEventTime</code> before attempting to import events.
     * </p>
     */
    private java.util.Date endEventTime;
    /**
     * <p>
     * The ID of the import. Use this parameter when you are retrying an import.
     * </p>
     */
    private String importId;

    /**
     * <p>
     * The ARN of the destination event data store. Use this parameter for a new import.
     * </p>
     * 
     * @return The ARN of the destination event data store. Use this parameter for a new import.
     */

    public java.util.List<String> getDestinations() {
        if (destinations == null) {
            destinations = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return destinations;
    }

    /**
     * <p>
     * The ARN of the destination event data store. Use this parameter for a new import.
     * </p>
     * 
     * @param destinations
     *        The ARN of the destination event data store. Use this parameter for a new import.
     */

    public void setDestinations(java.util.Collection<String> destinations) {
        if (destinations == null) {
            this.destinations = null;
            return;
        }

        this.destinations = new com.amazonaws.internal.SdkInternalList<String>(destinations);
    }

    /**
     * <p>
     * The ARN of the destination event data store. Use this parameter for a new import.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDestinations(java.util.Collection)} or {@link #withDestinations(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param destinations
     *        The ARN of the destination event data store. Use this parameter for a new import.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartImportRequest withDestinations(String... destinations) {
        if (this.destinations == null) {
            setDestinations(new com.amazonaws.internal.SdkInternalList<String>(destinations.length));
        }
        for (String ele : destinations) {
            this.destinations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The ARN of the destination event data store. Use this parameter for a new import.
     * </p>
     * 
     * @param destinations
     *        The ARN of the destination event data store. Use this parameter for a new import.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartImportRequest withDestinations(java.util.Collection<String> destinations) {
        setDestinations(destinations);
        return this;
    }

    /**
     * <p>
     * The source S3 bucket for the import. Use this parameter for a new import.
     * </p>
     * 
     * @param importSource
     *        The source S3 bucket for the import. Use this parameter for a new import.
     */

    public void setImportSource(ImportSource importSource) {
        this.importSource = importSource;
    }

    /**
     * <p>
     * The source S3 bucket for the import. Use this parameter for a new import.
     * </p>
     * 
     * @return The source S3 bucket for the import. Use this parameter for a new import.
     */

    public ImportSource getImportSource() {
        return this.importSource;
    }

    /**
     * <p>
     * The source S3 bucket for the import. Use this parameter for a new import.
     * </p>
     * 
     * @param importSource
     *        The source S3 bucket for the import. Use this parameter for a new import.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartImportRequest withImportSource(ImportSource importSource) {
        setImportSource(importSource);
        return this;
    }

    /**
     * <p>
     * Use with <code>EndEventTime</code> to bound a <code>StartImport</code> request, and limit imported trail events
     * to only those events logged within a specified time period. When you specify a time range, CloudTrail checks the
     * prefix and log file names to verify the names contain a date between the specified <code>StartEventTime</code>
     * and <code>EndEventTime</code> before attempting to import events.
     * </p>
     * 
     * @param startEventTime
     *        Use with <code>EndEventTime</code> to bound a <code>StartImport</code> request, and limit imported trail
     *        events to only those events logged within a specified time period. When you specify a time range,
     *        CloudTrail checks the prefix and log file names to verify the names contain a date between the specified
     *        <code>StartEventTime</code> and <code>EndEventTime</code> before attempting to import events.
     */

    public void setStartEventTime(java.util.Date startEventTime) {
        this.startEventTime = startEventTime;
    }

    /**
     * <p>
     * Use with <code>EndEventTime</code> to bound a <code>StartImport</code> request, and limit imported trail events
     * to only those events logged within a specified time period. When you specify a time range, CloudTrail checks the
     * prefix and log file names to verify the names contain a date between the specified <code>StartEventTime</code>
     * and <code>EndEventTime</code> before attempting to import events.
     * </p>
     * 
     * @return Use with <code>EndEventTime</code> to bound a <code>StartImport</code> request, and limit imported trail
     *         events to only those events logged within a specified time period. When you specify a time range,
     *         CloudTrail checks the prefix and log file names to verify the names contain a date between the specified
     *         <code>StartEventTime</code> and <code>EndEventTime</code> before attempting to import events.
     */

    public java.util.Date getStartEventTime() {
        return this.startEventTime;
    }

    /**
     * <p>
     * Use with <code>EndEventTime</code> to bound a <code>StartImport</code> request, and limit imported trail events
     * to only those events logged within a specified time period. When you specify a time range, CloudTrail checks the
     * prefix and log file names to verify the names contain a date between the specified <code>StartEventTime</code>
     * and <code>EndEventTime</code> before attempting to import events.
     * </p>
     * 
     * @param startEventTime
     *        Use with <code>EndEventTime</code> to bound a <code>StartImport</code> request, and limit imported trail
     *        events to only those events logged within a specified time period. When you specify a time range,
     *        CloudTrail checks the prefix and log file names to verify the names contain a date between the specified
     *        <code>StartEventTime</code> and <code>EndEventTime</code> before attempting to import events.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartImportRequest withStartEventTime(java.util.Date startEventTime) {
        setStartEventTime(startEventTime);
        return this;
    }

    /**
     * <p>
     * Use with <code>StartEventTime</code> to bound a <code>StartImport</code> request, and limit imported trail events
     * to only those events logged within a specified time period. When you specify a time range, CloudTrail checks the
     * prefix and log file names to verify the names contain a date between the specified <code>StartEventTime</code>
     * and <code>EndEventTime</code> before attempting to import events.
     * </p>
     * 
     * @param endEventTime
     *        Use with <code>StartEventTime</code> to bound a <code>StartImport</code> request, and limit imported trail
     *        events to only those events logged within a specified time period. When you specify a time range,
     *        CloudTrail checks the prefix and log file names to verify the names contain a date between the specified
     *        <code>StartEventTime</code> and <code>EndEventTime</code> before attempting to import events.
     */

    public void setEndEventTime(java.util.Date endEventTime) {
        this.endEventTime = endEventTime;
    }

    /**
     * <p>
     * Use with <code>StartEventTime</code> to bound a <code>StartImport</code> request, and limit imported trail events
     * to only those events logged within a specified time period. When you specify a time range, CloudTrail checks the
     * prefix and log file names to verify the names contain a date between the specified <code>StartEventTime</code>
     * and <code>EndEventTime</code> before attempting to import events.
     * </p>
     * 
     * @return Use with <code>StartEventTime</code> to bound a <code>StartImport</code> request, and limit imported
     *         trail events to only those events logged within a specified time period. When you specify a time range,
     *         CloudTrail checks the prefix and log file names to verify the names contain a date between the specified
     *         <code>StartEventTime</code> and <code>EndEventTime</code> before attempting to import events.
     */

    public java.util.Date getEndEventTime() {
        return this.endEventTime;
    }

    /**
     * <p>
     * Use with <code>StartEventTime</code> to bound a <code>StartImport</code> request, and limit imported trail events
     * to only those events logged within a specified time period. When you specify a time range, CloudTrail checks the
     * prefix and log file names to verify the names contain a date between the specified <code>StartEventTime</code>
     * and <code>EndEventTime</code> before attempting to import events.
     * </p>
     * 
     * @param endEventTime
     *        Use with <code>StartEventTime</code> to bound a <code>StartImport</code> request, and limit imported trail
     *        events to only those events logged within a specified time period. When you specify a time range,
     *        CloudTrail checks the prefix and log file names to verify the names contain a date between the specified
     *        <code>StartEventTime</code> and <code>EndEventTime</code> before attempting to import events.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartImportRequest withEndEventTime(java.util.Date endEventTime) {
        setEndEventTime(endEventTime);
        return this;
    }

    /**
     * <p>
     * The ID of the import. Use this parameter when you are retrying an import.
     * </p>
     * 
     * @param importId
     *        The ID of the import. Use this parameter when you are retrying an import.
     */

    public void setImportId(String importId) {
        this.importId = importId;
    }

    /**
     * <p>
     * The ID of the import. Use this parameter when you are retrying an import.
     * </p>
     * 
     * @return The ID of the import. Use this parameter when you are retrying an import.
     */

    public String getImportId() {
        return this.importId;
    }

    /**
     * <p>
     * The ID of the import. Use this parameter when you are retrying an import.
     * </p>
     * 
     * @param importId
     *        The ID of the import. Use this parameter when you are retrying an import.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartImportRequest withImportId(String importId) {
        setImportId(importId);
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
        if (getDestinations() != null)
            sb.append("Destinations: ").append(getDestinations()).append(",");
        if (getImportSource() != null)
            sb.append("ImportSource: ").append(getImportSource()).append(",");
        if (getStartEventTime() != null)
            sb.append("StartEventTime: ").append(getStartEventTime()).append(",");
        if (getEndEventTime() != null)
            sb.append("EndEventTime: ").append(getEndEventTime()).append(",");
        if (getImportId() != null)
            sb.append("ImportId: ").append(getImportId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartImportRequest == false)
            return false;
        StartImportRequest other = (StartImportRequest) obj;
        if (other.getDestinations() == null ^ this.getDestinations() == null)
            return false;
        if (other.getDestinations() != null && other.getDestinations().equals(this.getDestinations()) == false)
            return false;
        if (other.getImportSource() == null ^ this.getImportSource() == null)
            return false;
        if (other.getImportSource() != null && other.getImportSource().equals(this.getImportSource()) == false)
            return false;
        if (other.getStartEventTime() == null ^ this.getStartEventTime() == null)
            return false;
        if (other.getStartEventTime() != null && other.getStartEventTime().equals(this.getStartEventTime()) == false)
            return false;
        if (other.getEndEventTime() == null ^ this.getEndEventTime() == null)
            return false;
        if (other.getEndEventTime() != null && other.getEndEventTime().equals(this.getEndEventTime()) == false)
            return false;
        if (other.getImportId() == null ^ this.getImportId() == null)
            return false;
        if (other.getImportId() != null && other.getImportId().equals(this.getImportId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDestinations() == null) ? 0 : getDestinations().hashCode());
        hashCode = prime * hashCode + ((getImportSource() == null) ? 0 : getImportSource().hashCode());
        hashCode = prime * hashCode + ((getStartEventTime() == null) ? 0 : getStartEventTime().hashCode());
        hashCode = prime * hashCode + ((getEndEventTime() == null) ? 0 : getEndEventTime().hashCode());
        hashCode = prime * hashCode + ((getImportId() == null) ? 0 : getImportId().hashCode());
        return hashCode;
    }

    @Override
    public StartImportRequest clone() {
        return (StartImportRequest) super.clone();
    }

}
