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
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeIntegrations" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeIntegrationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A pagination token that can be used in a later <code>DescribeIntegrations</code> request.
     * </p>
     */
    private String marker;
    /**
     * <p>
     * A list of integrations.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Integration> integrations;

    /**
     * <p>
     * A pagination token that can be used in a later <code>DescribeIntegrations</code> request.
     * </p>
     * 
     * @param marker
     *        A pagination token that can be used in a later <code>DescribeIntegrations</code> request.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * A pagination token that can be used in a later <code>DescribeIntegrations</code> request.
     * </p>
     * 
     * @return A pagination token that can be used in a later <code>DescribeIntegrations</code> request.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * A pagination token that can be used in a later <code>DescribeIntegrations</code> request.
     * </p>
     * 
     * @param marker
     *        A pagination token that can be used in a later <code>DescribeIntegrations</code> request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeIntegrationsResult withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * A list of integrations.
     * </p>
     * 
     * @return A list of integrations.
     */

    public java.util.List<Integration> getIntegrations() {
        if (integrations == null) {
            integrations = new com.amazonaws.internal.SdkInternalList<Integration>();
        }
        return integrations;
    }

    /**
     * <p>
     * A list of integrations.
     * </p>
     * 
     * @param integrations
     *        A list of integrations.
     */

    public void setIntegrations(java.util.Collection<Integration> integrations) {
        if (integrations == null) {
            this.integrations = null;
            return;
        }

        this.integrations = new com.amazonaws.internal.SdkInternalList<Integration>(integrations);
    }

    /**
     * <p>
     * A list of integrations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIntegrations(java.util.Collection)} or {@link #withIntegrations(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param integrations
     *        A list of integrations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeIntegrationsResult withIntegrations(Integration... integrations) {
        if (this.integrations == null) {
            setIntegrations(new com.amazonaws.internal.SdkInternalList<Integration>(integrations.length));
        }
        for (Integration ele : integrations) {
            this.integrations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of integrations.
     * </p>
     * 
     * @param integrations
     *        A list of integrations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeIntegrationsResult withIntegrations(java.util.Collection<Integration> integrations) {
        setIntegrations(integrations);
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
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker()).append(",");
        if (getIntegrations() != null)
            sb.append("Integrations: ").append(getIntegrations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeIntegrationsResult == false)
            return false;
        DescribeIntegrationsResult other = (DescribeIntegrationsResult) obj;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getIntegrations() == null ^ this.getIntegrations() == null)
            return false;
        if (other.getIntegrations() != null && other.getIntegrations().equals(this.getIntegrations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getIntegrations() == null) ? 0 : getIntegrations().hashCode());
        return hashCode;
    }

    @Override
    public DescribeIntegrationsResult clone() {
        try {
            return (DescribeIntegrationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
