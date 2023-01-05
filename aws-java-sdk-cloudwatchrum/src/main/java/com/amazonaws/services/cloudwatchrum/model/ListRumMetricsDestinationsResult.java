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
package com.amazonaws.services.cloudwatchrum.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rum-2018-05-10/ListRumMetricsDestinations" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListRumMetricsDestinationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of CloudWatch RUM extended metrics destinations associated with the app monitor that you specified.
     * </p>
     */
    private java.util.List<MetricDestinationSummary> destinations;
    /**
     * <p>
     * A token that you can use in a subsequent operation to retrieve the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of CloudWatch RUM extended metrics destinations associated with the app monitor that you specified.
     * </p>
     * 
     * @return The list of CloudWatch RUM extended metrics destinations associated with the app monitor that you
     *         specified.
     */

    public java.util.List<MetricDestinationSummary> getDestinations() {
        return destinations;
    }

    /**
     * <p>
     * The list of CloudWatch RUM extended metrics destinations associated with the app monitor that you specified.
     * </p>
     * 
     * @param destinations
     *        The list of CloudWatch RUM extended metrics destinations associated with the app monitor that you
     *        specified.
     */

    public void setDestinations(java.util.Collection<MetricDestinationSummary> destinations) {
        if (destinations == null) {
            this.destinations = null;
            return;
        }

        this.destinations = new java.util.ArrayList<MetricDestinationSummary>(destinations);
    }

    /**
     * <p>
     * The list of CloudWatch RUM extended metrics destinations associated with the app monitor that you specified.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDestinations(java.util.Collection)} or {@link #withDestinations(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param destinations
     *        The list of CloudWatch RUM extended metrics destinations associated with the app monitor that you
     *        specified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRumMetricsDestinationsResult withDestinations(MetricDestinationSummary... destinations) {
        if (this.destinations == null) {
            setDestinations(new java.util.ArrayList<MetricDestinationSummary>(destinations.length));
        }
        for (MetricDestinationSummary ele : destinations) {
            this.destinations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of CloudWatch RUM extended metrics destinations associated with the app monitor that you specified.
     * </p>
     * 
     * @param destinations
     *        The list of CloudWatch RUM extended metrics destinations associated with the app monitor that you
     *        specified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRumMetricsDestinationsResult withDestinations(java.util.Collection<MetricDestinationSummary> destinations) {
        setDestinations(destinations);
        return this;
    }

    /**
     * <p>
     * A token that you can use in a subsequent operation to retrieve the next set of results.
     * </p>
     * 
     * @param nextToken
     *        A token that you can use in a subsequent operation to retrieve the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token that you can use in a subsequent operation to retrieve the next set of results.
     * </p>
     * 
     * @return A token that you can use in a subsequent operation to retrieve the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token that you can use in a subsequent operation to retrieve the next set of results.
     * </p>
     * 
     * @param nextToken
     *        A token that you can use in a subsequent operation to retrieve the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRumMetricsDestinationsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListRumMetricsDestinationsResult == false)
            return false;
        ListRumMetricsDestinationsResult other = (ListRumMetricsDestinationsResult) obj;
        if (other.getDestinations() == null ^ this.getDestinations() == null)
            return false;
        if (other.getDestinations() != null && other.getDestinations().equals(this.getDestinations()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDestinations() == null) ? 0 : getDestinations().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListRumMetricsDestinationsResult clone() {
        try {
            return (ListRumMetricsDestinationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
