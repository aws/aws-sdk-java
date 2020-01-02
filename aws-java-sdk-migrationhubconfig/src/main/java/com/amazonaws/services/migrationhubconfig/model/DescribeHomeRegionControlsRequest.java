/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.migrationhubconfig.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhub-config-2019-06-30/DescribeHomeRegionControls"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeHomeRegionControlsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The <code>ControlID</code> is a unique identifier string of your <code>HomeRegionControl</code> object.
     * </p>
     */
    private String controlId;
    /**
     * <p>
     * The name of the home region you'd like to view.
     * </p>
     */
    private String homeRegion;
    /**
     * <p>
     * The target parameter specifies the identifier to which the home region is applied, which is always of type
     * <code>ACCOUNT</code>. It applies the home region to the current <code>ACCOUNT</code>.
     * </p>
     */
    private Target target;
    /**
     * <p>
     * The maximum number of filtering results to display per page.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * If a <code>NextToken</code> was returned by a previous call, more results are available. To retrieve the next
     * page of results, make the call again using the returned token in <code>NextToken</code>.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The <code>ControlID</code> is a unique identifier string of your <code>HomeRegionControl</code> object.
     * </p>
     * 
     * @param controlId
     *        The <code>ControlID</code> is a unique identifier string of your <code>HomeRegionControl</code> object.
     */

    public void setControlId(String controlId) {
        this.controlId = controlId;
    }

    /**
     * <p>
     * The <code>ControlID</code> is a unique identifier string of your <code>HomeRegionControl</code> object.
     * </p>
     * 
     * @return The <code>ControlID</code> is a unique identifier string of your <code>HomeRegionControl</code> object.
     */

    public String getControlId() {
        return this.controlId;
    }

    /**
     * <p>
     * The <code>ControlID</code> is a unique identifier string of your <code>HomeRegionControl</code> object.
     * </p>
     * 
     * @param controlId
     *        The <code>ControlID</code> is a unique identifier string of your <code>HomeRegionControl</code> object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeHomeRegionControlsRequest withControlId(String controlId) {
        setControlId(controlId);
        return this;
    }

    /**
     * <p>
     * The name of the home region you'd like to view.
     * </p>
     * 
     * @param homeRegion
     *        The name of the home region you'd like to view.
     */

    public void setHomeRegion(String homeRegion) {
        this.homeRegion = homeRegion;
    }

    /**
     * <p>
     * The name of the home region you'd like to view.
     * </p>
     * 
     * @return The name of the home region you'd like to view.
     */

    public String getHomeRegion() {
        return this.homeRegion;
    }

    /**
     * <p>
     * The name of the home region you'd like to view.
     * </p>
     * 
     * @param homeRegion
     *        The name of the home region you'd like to view.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeHomeRegionControlsRequest withHomeRegion(String homeRegion) {
        setHomeRegion(homeRegion);
        return this;
    }

    /**
     * <p>
     * The target parameter specifies the identifier to which the home region is applied, which is always of type
     * <code>ACCOUNT</code>. It applies the home region to the current <code>ACCOUNT</code>.
     * </p>
     * 
     * @param target
     *        The target parameter specifies the identifier to which the home region is applied, which is always of type
     *        <code>ACCOUNT</code>. It applies the home region to the current <code>ACCOUNT</code>.
     */

    public void setTarget(Target target) {
        this.target = target;
    }

    /**
     * <p>
     * The target parameter specifies the identifier to which the home region is applied, which is always of type
     * <code>ACCOUNT</code>. It applies the home region to the current <code>ACCOUNT</code>.
     * </p>
     * 
     * @return The target parameter specifies the identifier to which the home region is applied, which is always of
     *         type <code>ACCOUNT</code>. It applies the home region to the current <code>ACCOUNT</code>.
     */

    public Target getTarget() {
        return this.target;
    }

    /**
     * <p>
     * The target parameter specifies the identifier to which the home region is applied, which is always of type
     * <code>ACCOUNT</code>. It applies the home region to the current <code>ACCOUNT</code>.
     * </p>
     * 
     * @param target
     *        The target parameter specifies the identifier to which the home region is applied, which is always of type
     *        <code>ACCOUNT</code>. It applies the home region to the current <code>ACCOUNT</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeHomeRegionControlsRequest withTarget(Target target) {
        setTarget(target);
        return this;
    }

    /**
     * <p>
     * The maximum number of filtering results to display per page.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of filtering results to display per page.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of filtering results to display per page.
     * </p>
     * 
     * @return The maximum number of filtering results to display per page.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of filtering results to display per page.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of filtering results to display per page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeHomeRegionControlsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * If a <code>NextToken</code> was returned by a previous call, more results are available. To retrieve the next
     * page of results, make the call again using the returned token in <code>NextToken</code>.
     * </p>
     * 
     * @param nextToken
     *        If a <code>NextToken</code> was returned by a previous call, more results are available. To retrieve the
     *        next page of results, make the call again using the returned token in <code>NextToken</code>.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If a <code>NextToken</code> was returned by a previous call, more results are available. To retrieve the next
     * page of results, make the call again using the returned token in <code>NextToken</code>.
     * </p>
     * 
     * @return If a <code>NextToken</code> was returned by a previous call, more results are available. To retrieve the
     *         next page of results, make the call again using the returned token in <code>NextToken</code>.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If a <code>NextToken</code> was returned by a previous call, more results are available. To retrieve the next
     * page of results, make the call again using the returned token in <code>NextToken</code>.
     * </p>
     * 
     * @param nextToken
     *        If a <code>NextToken</code> was returned by a previous call, more results are available. To retrieve the
     *        next page of results, make the call again using the returned token in <code>NextToken</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeHomeRegionControlsRequest withNextToken(String nextToken) {
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
        if (getControlId() != null)
            sb.append("ControlId: ").append(getControlId()).append(",");
        if (getHomeRegion() != null)
            sb.append("HomeRegion: ").append(getHomeRegion()).append(",");
        if (getTarget() != null)
            sb.append("Target: ").append(getTarget()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
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

        if (obj instanceof DescribeHomeRegionControlsRequest == false)
            return false;
        DescribeHomeRegionControlsRequest other = (DescribeHomeRegionControlsRequest) obj;
        if (other.getControlId() == null ^ this.getControlId() == null)
            return false;
        if (other.getControlId() != null && other.getControlId().equals(this.getControlId()) == false)
            return false;
        if (other.getHomeRegion() == null ^ this.getHomeRegion() == null)
            return false;
        if (other.getHomeRegion() != null && other.getHomeRegion().equals(this.getHomeRegion()) == false)
            return false;
        if (other.getTarget() == null ^ this.getTarget() == null)
            return false;
        if (other.getTarget() != null && other.getTarget().equals(this.getTarget()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
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

        hashCode = prime * hashCode + ((getControlId() == null) ? 0 : getControlId().hashCode());
        hashCode = prime * hashCode + ((getHomeRegion() == null) ? 0 : getHomeRegion().hashCode());
        hashCode = prime * hashCode + ((getTarget() == null) ? 0 : getTarget().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeHomeRegionControlsRequest clone() {
        return (DescribeHomeRegionControlsRequest) super.clone();
    }

}
