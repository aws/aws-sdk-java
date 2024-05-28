/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.costexplorer.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/StartCostAllocationTagBackfill" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartCostAllocationTagBackfillRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The date you want the backfill to start from. The date can only be a first day of the month (a billing start
     * date). Dates can't precede the previous twelve months, or in the future.
     * </p>
     */
    private String backfillFrom;

    /**
     * <p>
     * The date you want the backfill to start from. The date can only be a first day of the month (a billing start
     * date). Dates can't precede the previous twelve months, or in the future.
     * </p>
     * 
     * @param backfillFrom
     *        The date you want the backfill to start from. The date can only be a first day of the month (a billing
     *        start date). Dates can't precede the previous twelve months, or in the future.
     */

    public void setBackfillFrom(String backfillFrom) {
        this.backfillFrom = backfillFrom;
    }

    /**
     * <p>
     * The date you want the backfill to start from. The date can only be a first day of the month (a billing start
     * date). Dates can't precede the previous twelve months, or in the future.
     * </p>
     * 
     * @return The date you want the backfill to start from. The date can only be a first day of the month (a billing
     *         start date). Dates can't precede the previous twelve months, or in the future.
     */

    public String getBackfillFrom() {
        return this.backfillFrom;
    }

    /**
     * <p>
     * The date you want the backfill to start from. The date can only be a first day of the month (a billing start
     * date). Dates can't precede the previous twelve months, or in the future.
     * </p>
     * 
     * @param backfillFrom
     *        The date you want the backfill to start from. The date can only be a first day of the month (a billing
     *        start date). Dates can't precede the previous twelve months, or in the future.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartCostAllocationTagBackfillRequest withBackfillFrom(String backfillFrom) {
        setBackfillFrom(backfillFrom);
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
        if (getBackfillFrom() != null)
            sb.append("BackfillFrom: ").append(getBackfillFrom());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartCostAllocationTagBackfillRequest == false)
            return false;
        StartCostAllocationTagBackfillRequest other = (StartCostAllocationTagBackfillRequest) obj;
        if (other.getBackfillFrom() == null ^ this.getBackfillFrom() == null)
            return false;
        if (other.getBackfillFrom() != null && other.getBackfillFrom().equals(this.getBackfillFrom()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBackfillFrom() == null) ? 0 : getBackfillFrom().hashCode());
        return hashCode;
    }

    @Override
    public StartCostAllocationTagBackfillRequest clone() {
        return (StartCostAllocationTagBackfillRequest) super.clone();
    }

}
