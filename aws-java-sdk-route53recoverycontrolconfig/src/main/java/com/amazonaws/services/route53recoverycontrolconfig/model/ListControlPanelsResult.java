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
package com.amazonaws.services.route53recoverycontrolconfig.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-control-config-2020-11-02/ListControlPanels"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListControlPanelsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The result of a successful ListControlPanel request.
     * </p>
     */
    private java.util.List<ControlPanel> controlPanels;
    /**
     * <p>
     * The token that identifies which batch of results you want to see.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The result of a successful ListControlPanel request.
     * </p>
     * 
     * @return The result of a successful ListControlPanel request.
     */

    public java.util.List<ControlPanel> getControlPanels() {
        return controlPanels;
    }

    /**
     * <p>
     * The result of a successful ListControlPanel request.
     * </p>
     * 
     * @param controlPanels
     *        The result of a successful ListControlPanel request.
     */

    public void setControlPanels(java.util.Collection<ControlPanel> controlPanels) {
        if (controlPanels == null) {
            this.controlPanels = null;
            return;
        }

        this.controlPanels = new java.util.ArrayList<ControlPanel>(controlPanels);
    }

    /**
     * <p>
     * The result of a successful ListControlPanel request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setControlPanels(java.util.Collection)} or {@link #withControlPanels(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param controlPanels
     *        The result of a successful ListControlPanel request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListControlPanelsResult withControlPanels(ControlPanel... controlPanels) {
        if (this.controlPanels == null) {
            setControlPanels(new java.util.ArrayList<ControlPanel>(controlPanels.length));
        }
        for (ControlPanel ele : controlPanels) {
            this.controlPanels.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The result of a successful ListControlPanel request.
     * </p>
     * 
     * @param controlPanels
     *        The result of a successful ListControlPanel request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListControlPanelsResult withControlPanels(java.util.Collection<ControlPanel> controlPanels) {
        setControlPanels(controlPanels);
        return this;
    }

    /**
     * <p>
     * The token that identifies which batch of results you want to see.
     * </p>
     * 
     * @param nextToken
     *        The token that identifies which batch of results you want to see.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token that identifies which batch of results you want to see.
     * </p>
     * 
     * @return The token that identifies which batch of results you want to see.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token that identifies which batch of results you want to see.
     * </p>
     * 
     * @param nextToken
     *        The token that identifies which batch of results you want to see.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListControlPanelsResult withNextToken(String nextToken) {
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
        if (getControlPanels() != null)
            sb.append("ControlPanels: ").append(getControlPanels()).append(",");
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

        if (obj instanceof ListControlPanelsResult == false)
            return false;
        ListControlPanelsResult other = (ListControlPanelsResult) obj;
        if (other.getControlPanels() == null ^ this.getControlPanels() == null)
            return false;
        if (other.getControlPanels() != null && other.getControlPanels().equals(this.getControlPanels()) == false)
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

        hashCode = prime * hashCode + ((getControlPanels() == null) ? 0 : getControlPanels().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListControlPanelsResult clone() {
        try {
            return (ListControlPanelsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
