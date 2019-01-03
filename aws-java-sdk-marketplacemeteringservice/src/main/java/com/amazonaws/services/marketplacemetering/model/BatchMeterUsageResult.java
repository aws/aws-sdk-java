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
package com.amazonaws.services.marketplacemetering.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains the UsageRecords processed by BatchMeterUsage and any records that have failed due to transient error.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/meteringmarketplace-2016-01-14/BatchMeterUsage"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchMeterUsageResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Contains all UsageRecords processed by BatchMeterUsage. These records were either honored by AWS Marketplace
     * Metering Service or were invalid.
     * </p>
     */
    private java.util.List<UsageRecordResult> results;
    /**
     * <p>
     * Contains all UsageRecords that were not processed by BatchMeterUsage. This is a list of UsageRecords. You can
     * retry the failed request by making another BatchMeterUsage call with this list as input in the
     * BatchMeterUsageRequest.
     * </p>
     */
    private java.util.List<UsageRecord> unprocessedRecords;

    /**
     * <p>
     * Contains all UsageRecords processed by BatchMeterUsage. These records were either honored by AWS Marketplace
     * Metering Service or were invalid.
     * </p>
     * 
     * @return Contains all UsageRecords processed by BatchMeterUsage. These records were either honored by AWS
     *         Marketplace Metering Service or were invalid.
     */

    public java.util.List<UsageRecordResult> getResults() {
        return results;
    }

    /**
     * <p>
     * Contains all UsageRecords processed by BatchMeterUsage. These records were either honored by AWS Marketplace
     * Metering Service or were invalid.
     * </p>
     * 
     * @param results
     *        Contains all UsageRecords processed by BatchMeterUsage. These records were either honored by AWS
     *        Marketplace Metering Service or were invalid.
     */

    public void setResults(java.util.Collection<UsageRecordResult> results) {
        if (results == null) {
            this.results = null;
            return;
        }

        this.results = new java.util.ArrayList<UsageRecordResult>(results);
    }

    /**
     * <p>
     * Contains all UsageRecords processed by BatchMeterUsage. These records were either honored by AWS Marketplace
     * Metering Service or were invalid.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResults(java.util.Collection)} or {@link #withResults(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param results
     *        Contains all UsageRecords processed by BatchMeterUsage. These records were either honored by AWS
     *        Marketplace Metering Service or were invalid.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchMeterUsageResult withResults(UsageRecordResult... results) {
        if (this.results == null) {
            setResults(new java.util.ArrayList<UsageRecordResult>(results.length));
        }
        for (UsageRecordResult ele : results) {
            this.results.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Contains all UsageRecords processed by BatchMeterUsage. These records were either honored by AWS Marketplace
     * Metering Service or were invalid.
     * </p>
     * 
     * @param results
     *        Contains all UsageRecords processed by BatchMeterUsage. These records were either honored by AWS
     *        Marketplace Metering Service or were invalid.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchMeterUsageResult withResults(java.util.Collection<UsageRecordResult> results) {
        setResults(results);
        return this;
    }

    /**
     * <p>
     * Contains all UsageRecords that were not processed by BatchMeterUsage. This is a list of UsageRecords. You can
     * retry the failed request by making another BatchMeterUsage call with this list as input in the
     * BatchMeterUsageRequest.
     * </p>
     * 
     * @return Contains all UsageRecords that were not processed by BatchMeterUsage. This is a list of UsageRecords. You
     *         can retry the failed request by making another BatchMeterUsage call with this list as input in the
     *         BatchMeterUsageRequest.
     */

    public java.util.List<UsageRecord> getUnprocessedRecords() {
        return unprocessedRecords;
    }

    /**
     * <p>
     * Contains all UsageRecords that were not processed by BatchMeterUsage. This is a list of UsageRecords. You can
     * retry the failed request by making another BatchMeterUsage call with this list as input in the
     * BatchMeterUsageRequest.
     * </p>
     * 
     * @param unprocessedRecords
     *        Contains all UsageRecords that were not processed by BatchMeterUsage. This is a list of UsageRecords. You
     *        can retry the failed request by making another BatchMeterUsage call with this list as input in the
     *        BatchMeterUsageRequest.
     */

    public void setUnprocessedRecords(java.util.Collection<UsageRecord> unprocessedRecords) {
        if (unprocessedRecords == null) {
            this.unprocessedRecords = null;
            return;
        }

        this.unprocessedRecords = new java.util.ArrayList<UsageRecord>(unprocessedRecords);
    }

    /**
     * <p>
     * Contains all UsageRecords that were not processed by BatchMeterUsage. This is a list of UsageRecords. You can
     * retry the failed request by making another BatchMeterUsage call with this list as input in the
     * BatchMeterUsageRequest.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUnprocessedRecords(java.util.Collection)} or {@link #withUnprocessedRecords(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param unprocessedRecords
     *        Contains all UsageRecords that were not processed by BatchMeterUsage. This is a list of UsageRecords. You
     *        can retry the failed request by making another BatchMeterUsage call with this list as input in the
     *        BatchMeterUsageRequest.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchMeterUsageResult withUnprocessedRecords(UsageRecord... unprocessedRecords) {
        if (this.unprocessedRecords == null) {
            setUnprocessedRecords(new java.util.ArrayList<UsageRecord>(unprocessedRecords.length));
        }
        for (UsageRecord ele : unprocessedRecords) {
            this.unprocessedRecords.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Contains all UsageRecords that were not processed by BatchMeterUsage. This is a list of UsageRecords. You can
     * retry the failed request by making another BatchMeterUsage call with this list as input in the
     * BatchMeterUsageRequest.
     * </p>
     * 
     * @param unprocessedRecords
     *        Contains all UsageRecords that were not processed by BatchMeterUsage. This is a list of UsageRecords. You
     *        can retry the failed request by making another BatchMeterUsage call with this list as input in the
     *        BatchMeterUsageRequest.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchMeterUsageResult withUnprocessedRecords(java.util.Collection<UsageRecord> unprocessedRecords) {
        setUnprocessedRecords(unprocessedRecords);
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
        if (getResults() != null)
            sb.append("Results: ").append(getResults()).append(",");
        if (getUnprocessedRecords() != null)
            sb.append("UnprocessedRecords: ").append(getUnprocessedRecords());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchMeterUsageResult == false)
            return false;
        BatchMeterUsageResult other = (BatchMeterUsageResult) obj;
        if (other.getResults() == null ^ this.getResults() == null)
            return false;
        if (other.getResults() != null && other.getResults().equals(this.getResults()) == false)
            return false;
        if (other.getUnprocessedRecords() == null ^ this.getUnprocessedRecords() == null)
            return false;
        if (other.getUnprocessedRecords() != null && other.getUnprocessedRecords().equals(this.getUnprocessedRecords()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResults() == null) ? 0 : getResults().hashCode());
        hashCode = prime * hashCode + ((getUnprocessedRecords() == null) ? 0 : getUnprocessedRecords().hashCode());
        return hashCode;
    }

    @Override
    public BatchMeterUsageResult clone() {
        try {
            return (BatchMeterUsageResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
