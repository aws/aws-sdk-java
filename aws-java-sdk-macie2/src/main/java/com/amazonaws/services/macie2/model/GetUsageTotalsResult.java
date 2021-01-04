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
package com.amazonaws.services.macie2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/GetUsageTotals" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetUsageTotalsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of objects that contains the results of the query. Each object contains the data for a specific usage
     * metric.
     * </p>
     */
    private java.util.List<UsageTotal> usageTotals;

    /**
     * <p>
     * An array of objects that contains the results of the query. Each object contains the data for a specific usage
     * metric.
     * </p>
     * 
     * @return An array of objects that contains the results of the query. Each object contains the data for a specific
     *         usage metric.
     */

    public java.util.List<UsageTotal> getUsageTotals() {
        return usageTotals;
    }

    /**
     * <p>
     * An array of objects that contains the results of the query. Each object contains the data for a specific usage
     * metric.
     * </p>
     * 
     * @param usageTotals
     *        An array of objects that contains the results of the query. Each object contains the data for a specific
     *        usage metric.
     */

    public void setUsageTotals(java.util.Collection<UsageTotal> usageTotals) {
        if (usageTotals == null) {
            this.usageTotals = null;
            return;
        }

        this.usageTotals = new java.util.ArrayList<UsageTotal>(usageTotals);
    }

    /**
     * <p>
     * An array of objects that contains the results of the query. Each object contains the data for a specific usage
     * metric.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUsageTotals(java.util.Collection)} or {@link #withUsageTotals(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param usageTotals
     *        An array of objects that contains the results of the query. Each object contains the data for a specific
     *        usage metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetUsageTotalsResult withUsageTotals(UsageTotal... usageTotals) {
        if (this.usageTotals == null) {
            setUsageTotals(new java.util.ArrayList<UsageTotal>(usageTotals.length));
        }
        for (UsageTotal ele : usageTotals) {
            this.usageTotals.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects that contains the results of the query. Each object contains the data for a specific usage
     * metric.
     * </p>
     * 
     * @param usageTotals
     *        An array of objects that contains the results of the query. Each object contains the data for a specific
     *        usage metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetUsageTotalsResult withUsageTotals(java.util.Collection<UsageTotal> usageTotals) {
        setUsageTotals(usageTotals);
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
        if (getUsageTotals() != null)
            sb.append("UsageTotals: ").append(getUsageTotals());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetUsageTotalsResult == false)
            return false;
        GetUsageTotalsResult other = (GetUsageTotalsResult) obj;
        if (other.getUsageTotals() == null ^ this.getUsageTotals() == null)
            return false;
        if (other.getUsageTotals() != null && other.getUsageTotals().equals(this.getUsageTotals()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUsageTotals() == null) ? 0 : getUsageTotals().hashCode());
        return hashCode;
    }

    @Override
    public GetUsageTotalsResult clone() {
        try {
            return (GetUsageTotalsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
