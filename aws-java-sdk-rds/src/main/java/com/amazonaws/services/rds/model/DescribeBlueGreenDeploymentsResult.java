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
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeBlueGreenDeployments" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeBlueGreenDeploymentsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Contains a list of blue/green deployments for the user.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<BlueGreenDeployment> blueGreenDeployments;
    /**
     * <p>
     * A pagination token that can be used in a later DescribeBlueGreenDeployments request.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * Contains a list of blue/green deployments for the user.
     * </p>
     * 
     * @return Contains a list of blue/green deployments for the user.
     */

    public java.util.List<BlueGreenDeployment> getBlueGreenDeployments() {
        if (blueGreenDeployments == null) {
            blueGreenDeployments = new com.amazonaws.internal.SdkInternalList<BlueGreenDeployment>();
        }
        return blueGreenDeployments;
    }

    /**
     * <p>
     * Contains a list of blue/green deployments for the user.
     * </p>
     * 
     * @param blueGreenDeployments
     *        Contains a list of blue/green deployments for the user.
     */

    public void setBlueGreenDeployments(java.util.Collection<BlueGreenDeployment> blueGreenDeployments) {
        if (blueGreenDeployments == null) {
            this.blueGreenDeployments = null;
            return;
        }

        this.blueGreenDeployments = new com.amazonaws.internal.SdkInternalList<BlueGreenDeployment>(blueGreenDeployments);
    }

    /**
     * <p>
     * Contains a list of blue/green deployments for the user.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBlueGreenDeployments(java.util.Collection)} or {@link #withBlueGreenDeployments(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param blueGreenDeployments
     *        Contains a list of blue/green deployments for the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBlueGreenDeploymentsResult withBlueGreenDeployments(BlueGreenDeployment... blueGreenDeployments) {
        if (this.blueGreenDeployments == null) {
            setBlueGreenDeployments(new com.amazonaws.internal.SdkInternalList<BlueGreenDeployment>(blueGreenDeployments.length));
        }
        for (BlueGreenDeployment ele : blueGreenDeployments) {
            this.blueGreenDeployments.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Contains a list of blue/green deployments for the user.
     * </p>
     * 
     * @param blueGreenDeployments
     *        Contains a list of blue/green deployments for the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBlueGreenDeploymentsResult withBlueGreenDeployments(java.util.Collection<BlueGreenDeployment> blueGreenDeployments) {
        setBlueGreenDeployments(blueGreenDeployments);
        return this;
    }

    /**
     * <p>
     * A pagination token that can be used in a later DescribeBlueGreenDeployments request.
     * </p>
     * 
     * @param marker
     *        A pagination token that can be used in a later DescribeBlueGreenDeployments request.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * A pagination token that can be used in a later DescribeBlueGreenDeployments request.
     * </p>
     * 
     * @return A pagination token that can be used in a later DescribeBlueGreenDeployments request.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * A pagination token that can be used in a later DescribeBlueGreenDeployments request.
     * </p>
     * 
     * @param marker
     *        A pagination token that can be used in a later DescribeBlueGreenDeployments request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBlueGreenDeploymentsResult withMarker(String marker) {
        setMarker(marker);
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
        if (getBlueGreenDeployments() != null)
            sb.append("BlueGreenDeployments: ").append(getBlueGreenDeployments()).append(",");
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeBlueGreenDeploymentsResult == false)
            return false;
        DescribeBlueGreenDeploymentsResult other = (DescribeBlueGreenDeploymentsResult) obj;
        if (other.getBlueGreenDeployments() == null ^ this.getBlueGreenDeployments() == null)
            return false;
        if (other.getBlueGreenDeployments() != null && other.getBlueGreenDeployments().equals(this.getBlueGreenDeployments()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBlueGreenDeployments() == null) ? 0 : getBlueGreenDeployments().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public DescribeBlueGreenDeploymentsResult clone() {
        try {
            return (DescribeBlueGreenDeploymentsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
