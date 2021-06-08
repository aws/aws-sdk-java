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
package com.amazonaws.services.devopsguru.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/DescribeAccountOverview"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAccountOverviewResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An integer that specifies the number of open reactive insights in your AWS account that were created during the
     * time range passed in.
     * </p>
     */
    private Integer reactiveInsights;
    /**
     * <p>
     * An integer that specifies the number of open proactive insights in your AWS account that were created during the
     * time range passed in.
     * </p>
     */
    private Integer proactiveInsights;
    /**
     * <p>
     * The Mean Time to Recover (MTTR) for all closed insights that were created during the time range passed in.
     * </p>
     */
    private Long meanTimeToRecoverInMilliseconds;

    /**
     * <p>
     * An integer that specifies the number of open reactive insights in your AWS account that were created during the
     * time range passed in.
     * </p>
     * 
     * @param reactiveInsights
     *        An integer that specifies the number of open reactive insights in your AWS account that were created
     *        during the time range passed in.
     */

    public void setReactiveInsights(Integer reactiveInsights) {
        this.reactiveInsights = reactiveInsights;
    }

    /**
     * <p>
     * An integer that specifies the number of open reactive insights in your AWS account that were created during the
     * time range passed in.
     * </p>
     * 
     * @return An integer that specifies the number of open reactive insights in your AWS account that were created
     *         during the time range passed in.
     */

    public Integer getReactiveInsights() {
        return this.reactiveInsights;
    }

    /**
     * <p>
     * An integer that specifies the number of open reactive insights in your AWS account that were created during the
     * time range passed in.
     * </p>
     * 
     * @param reactiveInsights
     *        An integer that specifies the number of open reactive insights in your AWS account that were created
     *        during the time range passed in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAccountOverviewResult withReactiveInsights(Integer reactiveInsights) {
        setReactiveInsights(reactiveInsights);
        return this;
    }

    /**
     * <p>
     * An integer that specifies the number of open proactive insights in your AWS account that were created during the
     * time range passed in.
     * </p>
     * 
     * @param proactiveInsights
     *        An integer that specifies the number of open proactive insights in your AWS account that were created
     *        during the time range passed in.
     */

    public void setProactiveInsights(Integer proactiveInsights) {
        this.proactiveInsights = proactiveInsights;
    }

    /**
     * <p>
     * An integer that specifies the number of open proactive insights in your AWS account that were created during the
     * time range passed in.
     * </p>
     * 
     * @return An integer that specifies the number of open proactive insights in your AWS account that were created
     *         during the time range passed in.
     */

    public Integer getProactiveInsights() {
        return this.proactiveInsights;
    }

    /**
     * <p>
     * An integer that specifies the number of open proactive insights in your AWS account that were created during the
     * time range passed in.
     * </p>
     * 
     * @param proactiveInsights
     *        An integer that specifies the number of open proactive insights in your AWS account that were created
     *        during the time range passed in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAccountOverviewResult withProactiveInsights(Integer proactiveInsights) {
        setProactiveInsights(proactiveInsights);
        return this;
    }

    /**
     * <p>
     * The Mean Time to Recover (MTTR) for all closed insights that were created during the time range passed in.
     * </p>
     * 
     * @param meanTimeToRecoverInMilliseconds
     *        The Mean Time to Recover (MTTR) for all closed insights that were created during the time range passed in.
     */

    public void setMeanTimeToRecoverInMilliseconds(Long meanTimeToRecoverInMilliseconds) {
        this.meanTimeToRecoverInMilliseconds = meanTimeToRecoverInMilliseconds;
    }

    /**
     * <p>
     * The Mean Time to Recover (MTTR) for all closed insights that were created during the time range passed in.
     * </p>
     * 
     * @return The Mean Time to Recover (MTTR) for all closed insights that were created during the time range passed
     *         in.
     */

    public Long getMeanTimeToRecoverInMilliseconds() {
        return this.meanTimeToRecoverInMilliseconds;
    }

    /**
     * <p>
     * The Mean Time to Recover (MTTR) for all closed insights that were created during the time range passed in.
     * </p>
     * 
     * @param meanTimeToRecoverInMilliseconds
     *        The Mean Time to Recover (MTTR) for all closed insights that were created during the time range passed in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAccountOverviewResult withMeanTimeToRecoverInMilliseconds(Long meanTimeToRecoverInMilliseconds) {
        setMeanTimeToRecoverInMilliseconds(meanTimeToRecoverInMilliseconds);
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
        if (getReactiveInsights() != null)
            sb.append("ReactiveInsights: ").append(getReactiveInsights()).append(",");
        if (getProactiveInsights() != null)
            sb.append("ProactiveInsights: ").append(getProactiveInsights()).append(",");
        if (getMeanTimeToRecoverInMilliseconds() != null)
            sb.append("MeanTimeToRecoverInMilliseconds: ").append(getMeanTimeToRecoverInMilliseconds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeAccountOverviewResult == false)
            return false;
        DescribeAccountOverviewResult other = (DescribeAccountOverviewResult) obj;
        if (other.getReactiveInsights() == null ^ this.getReactiveInsights() == null)
            return false;
        if (other.getReactiveInsights() != null && other.getReactiveInsights().equals(this.getReactiveInsights()) == false)
            return false;
        if (other.getProactiveInsights() == null ^ this.getProactiveInsights() == null)
            return false;
        if (other.getProactiveInsights() != null && other.getProactiveInsights().equals(this.getProactiveInsights()) == false)
            return false;
        if (other.getMeanTimeToRecoverInMilliseconds() == null ^ this.getMeanTimeToRecoverInMilliseconds() == null)
            return false;
        if (other.getMeanTimeToRecoverInMilliseconds() != null
                && other.getMeanTimeToRecoverInMilliseconds().equals(this.getMeanTimeToRecoverInMilliseconds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReactiveInsights() == null) ? 0 : getReactiveInsights().hashCode());
        hashCode = prime * hashCode + ((getProactiveInsights() == null) ? 0 : getProactiveInsights().hashCode());
        hashCode = prime * hashCode + ((getMeanTimeToRecoverInMilliseconds() == null) ? 0 : getMeanTimeToRecoverInMilliseconds().hashCode());
        return hashCode;
    }

    @Override
    public DescribeAccountOverviewResult clone() {
        try {
            return (DescribeAccountOverviewResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
