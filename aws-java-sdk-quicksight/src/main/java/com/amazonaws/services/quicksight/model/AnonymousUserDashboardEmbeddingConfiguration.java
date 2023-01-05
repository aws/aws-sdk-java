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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the dashboard that you want to embed.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/AnonymousUserDashboardEmbeddingConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AnonymousUserDashboardEmbeddingConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The dashboard ID for the dashboard that you want the user to see first. This ID is included in the output URL.
     * When the URL in response is accessed, Amazon QuickSight renders this dashboard.
     * </p>
     * <p>
     * The Amazon Resource Name (ARN) of this dashboard must be included in the <code>AuthorizedResourceArns</code>
     * parameter. Otherwise, the request will fail with <code>InvalidParameterValueException</code>.
     * </p>
     */
    private String initialDashboardId;

    /**
     * <p>
     * The dashboard ID for the dashboard that you want the user to see first. This ID is included in the output URL.
     * When the URL in response is accessed, Amazon QuickSight renders this dashboard.
     * </p>
     * <p>
     * The Amazon Resource Name (ARN) of this dashboard must be included in the <code>AuthorizedResourceArns</code>
     * parameter. Otherwise, the request will fail with <code>InvalidParameterValueException</code>.
     * </p>
     * 
     * @param initialDashboardId
     *        The dashboard ID for the dashboard that you want the user to see first. This ID is included in the output
     *        URL. When the URL in response is accessed, Amazon QuickSight renders this dashboard.</p>
     *        <p>
     *        The Amazon Resource Name (ARN) of this dashboard must be included in the
     *        <code>AuthorizedResourceArns</code> parameter. Otherwise, the request will fail with
     *        <code>InvalidParameterValueException</code>.
     */

    public void setInitialDashboardId(String initialDashboardId) {
        this.initialDashboardId = initialDashboardId;
    }

    /**
     * <p>
     * The dashboard ID for the dashboard that you want the user to see first. This ID is included in the output URL.
     * When the URL in response is accessed, Amazon QuickSight renders this dashboard.
     * </p>
     * <p>
     * The Amazon Resource Name (ARN) of this dashboard must be included in the <code>AuthorizedResourceArns</code>
     * parameter. Otherwise, the request will fail with <code>InvalidParameterValueException</code>.
     * </p>
     * 
     * @return The dashboard ID for the dashboard that you want the user to see first. This ID is included in the output
     *         URL. When the URL in response is accessed, Amazon QuickSight renders this dashboard.</p>
     *         <p>
     *         The Amazon Resource Name (ARN) of this dashboard must be included in the
     *         <code>AuthorizedResourceArns</code> parameter. Otherwise, the request will fail with
     *         <code>InvalidParameterValueException</code>.
     */

    public String getInitialDashboardId() {
        return this.initialDashboardId;
    }

    /**
     * <p>
     * The dashboard ID for the dashboard that you want the user to see first. This ID is included in the output URL.
     * When the URL in response is accessed, Amazon QuickSight renders this dashboard.
     * </p>
     * <p>
     * The Amazon Resource Name (ARN) of this dashboard must be included in the <code>AuthorizedResourceArns</code>
     * parameter. Otherwise, the request will fail with <code>InvalidParameterValueException</code>.
     * </p>
     * 
     * @param initialDashboardId
     *        The dashboard ID for the dashboard that you want the user to see first. This ID is included in the output
     *        URL. When the URL in response is accessed, Amazon QuickSight renders this dashboard.</p>
     *        <p>
     *        The Amazon Resource Name (ARN) of this dashboard must be included in the
     *        <code>AuthorizedResourceArns</code> parameter. Otherwise, the request will fail with
     *        <code>InvalidParameterValueException</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnonymousUserDashboardEmbeddingConfiguration withInitialDashboardId(String initialDashboardId) {
        setInitialDashboardId(initialDashboardId);
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
        if (getInitialDashboardId() != null)
            sb.append("InitialDashboardId: ").append(getInitialDashboardId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AnonymousUserDashboardEmbeddingConfiguration == false)
            return false;
        AnonymousUserDashboardEmbeddingConfiguration other = (AnonymousUserDashboardEmbeddingConfiguration) obj;
        if (other.getInitialDashboardId() == null ^ this.getInitialDashboardId() == null)
            return false;
        if (other.getInitialDashboardId() != null && other.getInitialDashboardId().equals(this.getInitialDashboardId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInitialDashboardId() == null) ? 0 : getInitialDashboardId().hashCode());
        return hashCode;
    }

    @Override
    public AnonymousUserDashboardEmbeddingConfiguration clone() {
        try {
            return (AnonymousUserDashboardEmbeddingConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.AnonymousUserDashboardEmbeddingConfigurationMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
