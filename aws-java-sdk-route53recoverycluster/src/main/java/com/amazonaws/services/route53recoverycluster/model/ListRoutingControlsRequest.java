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
package com.amazonaws.services.route53recoverycluster.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-cluster-2019-12-02/ListRoutingControls"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListRoutingControlsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the control panel of the routing controls to list.
     * </p>
     */
    private String controlPanelArn;
    /**
     * <p>
     * The token for the next set of results. You receive this token from a previous call.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The number of routing controls objects that you want to return with this call. The default value is 500.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the control panel of the routing controls to list.
     * </p>
     * 
     * @param controlPanelArn
     *        The Amazon Resource Name (ARN) of the control panel of the routing controls to list.
     */

    public void setControlPanelArn(String controlPanelArn) {
        this.controlPanelArn = controlPanelArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the control panel of the routing controls to list.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the control panel of the routing controls to list.
     */

    public String getControlPanelArn() {
        return this.controlPanelArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the control panel of the routing controls to list.
     * </p>
     * 
     * @param controlPanelArn
     *        The Amazon Resource Name (ARN) of the control panel of the routing controls to list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRoutingControlsRequest withControlPanelArn(String controlPanelArn) {
        setControlPanelArn(controlPanelArn);
        return this;
    }

    /**
     * <p>
     * The token for the next set of results. You receive this token from a previous call.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results. You receive this token from a previous call.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results. You receive this token from a previous call.
     * </p>
     * 
     * @return The token for the next set of results. You receive this token from a previous call.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of results. You receive this token from a previous call.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results. You receive this token from a previous call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRoutingControlsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The number of routing controls objects that you want to return with this call. The default value is 500.
     * </p>
     * 
     * @param maxResults
     *        The number of routing controls objects that you want to return with this call. The default value is 500.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The number of routing controls objects that you want to return with this call. The default value is 500.
     * </p>
     * 
     * @return The number of routing controls objects that you want to return with this call. The default value is 500.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The number of routing controls objects that you want to return with this call. The default value is 500.
     * </p>
     * 
     * @param maxResults
     *        The number of routing controls objects that you want to return with this call. The default value is 500.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRoutingControlsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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
        if (getControlPanelArn() != null)
            sb.append("ControlPanelArn: ").append(getControlPanelArn()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListRoutingControlsRequest == false)
            return false;
        ListRoutingControlsRequest other = (ListRoutingControlsRequest) obj;
        if (other.getControlPanelArn() == null ^ this.getControlPanelArn() == null)
            return false;
        if (other.getControlPanelArn() != null && other.getControlPanelArn().equals(this.getControlPanelArn()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getControlPanelArn() == null) ? 0 : getControlPanelArn().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListRoutingControlsRequest clone() {
        return (ListRoutingControlsRequest) super.clone();
    }

}
