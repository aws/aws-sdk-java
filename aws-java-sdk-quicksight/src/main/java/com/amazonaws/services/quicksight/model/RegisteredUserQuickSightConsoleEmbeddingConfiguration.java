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
 * Information about the Amazon QuickSight console that you want to embed.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/RegisteredUserQuickSightConsoleEmbeddingConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RegisteredUserQuickSightConsoleEmbeddingConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The initial URL path for the Amazon QuickSight console. <code>InitialPath</code> is required.
     * </p>
     * <p>
     * The entry point URL is constrained to the following paths:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>/start</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>/start/analyses</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>/start/dashboards</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>/start/favorites</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>/dashboards/DashboardId</code>. <i>DashboardId</i> is the actual ID key from the Amazon QuickSight console
     * URL of the dashboard.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>/analyses/AnalysisId</code>. <i>AnalysisId</i> is the actual ID key from the Amazon QuickSight console URL
     * of the analysis.
     * </p>
     * </li>
     * </ul>
     */
    private String initialPath;

    /**
     * <p>
     * The initial URL path for the Amazon QuickSight console. <code>InitialPath</code> is required.
     * </p>
     * <p>
     * The entry point URL is constrained to the following paths:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>/start</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>/start/analyses</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>/start/dashboards</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>/start/favorites</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>/dashboards/DashboardId</code>. <i>DashboardId</i> is the actual ID key from the Amazon QuickSight console
     * URL of the dashboard.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>/analyses/AnalysisId</code>. <i>AnalysisId</i> is the actual ID key from the Amazon QuickSight console URL
     * of the analysis.
     * </p>
     * </li>
     * </ul>
     * 
     * @param initialPath
     *        The initial URL path for the Amazon QuickSight console. <code>InitialPath</code> is required.</p>
     *        <p>
     *        The entry point URL is constrained to the following paths:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>/start</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>/start/analyses</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>/start/dashboards</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>/start/favorites</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>/dashboards/DashboardId</code>. <i>DashboardId</i> is the actual ID key from the Amazon QuickSight
     *        console URL of the dashboard.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>/analyses/AnalysisId</code>. <i>AnalysisId</i> is the actual ID key from the Amazon QuickSight
     *        console URL of the analysis.
     *        </p>
     *        </li>
     */

    public void setInitialPath(String initialPath) {
        this.initialPath = initialPath;
    }

    /**
     * <p>
     * The initial URL path for the Amazon QuickSight console. <code>InitialPath</code> is required.
     * </p>
     * <p>
     * The entry point URL is constrained to the following paths:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>/start</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>/start/analyses</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>/start/dashboards</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>/start/favorites</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>/dashboards/DashboardId</code>. <i>DashboardId</i> is the actual ID key from the Amazon QuickSight console
     * URL of the dashboard.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>/analyses/AnalysisId</code>. <i>AnalysisId</i> is the actual ID key from the Amazon QuickSight console URL
     * of the analysis.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The initial URL path for the Amazon QuickSight console. <code>InitialPath</code> is required.</p>
     *         <p>
     *         The entry point URL is constrained to the following paths:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>/start</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>/start/analyses</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>/start/dashboards</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>/start/favorites</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>/dashboards/DashboardId</code>. <i>DashboardId</i> is the actual ID key from the Amazon QuickSight
     *         console URL of the dashboard.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>/analyses/AnalysisId</code>. <i>AnalysisId</i> is the actual ID key from the Amazon QuickSight
     *         console URL of the analysis.
     *         </p>
     *         </li>
     */

    public String getInitialPath() {
        return this.initialPath;
    }

    /**
     * <p>
     * The initial URL path for the Amazon QuickSight console. <code>InitialPath</code> is required.
     * </p>
     * <p>
     * The entry point URL is constrained to the following paths:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>/start</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>/start/analyses</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>/start/dashboards</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>/start/favorites</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>/dashboards/DashboardId</code>. <i>DashboardId</i> is the actual ID key from the Amazon QuickSight console
     * URL of the dashboard.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>/analyses/AnalysisId</code>. <i>AnalysisId</i> is the actual ID key from the Amazon QuickSight console URL
     * of the analysis.
     * </p>
     * </li>
     * </ul>
     * 
     * @param initialPath
     *        The initial URL path for the Amazon QuickSight console. <code>InitialPath</code> is required.</p>
     *        <p>
     *        The entry point URL is constrained to the following paths:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>/start</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>/start/analyses</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>/start/dashboards</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>/start/favorites</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>/dashboards/DashboardId</code>. <i>DashboardId</i> is the actual ID key from the Amazon QuickSight
     *        console URL of the dashboard.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>/analyses/AnalysisId</code>. <i>AnalysisId</i> is the actual ID key from the Amazon QuickSight
     *        console URL of the analysis.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisteredUserQuickSightConsoleEmbeddingConfiguration withInitialPath(String initialPath) {
        setInitialPath(initialPath);
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
        if (getInitialPath() != null)
            sb.append("InitialPath: ").append(getInitialPath());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RegisteredUserQuickSightConsoleEmbeddingConfiguration == false)
            return false;
        RegisteredUserQuickSightConsoleEmbeddingConfiguration other = (RegisteredUserQuickSightConsoleEmbeddingConfiguration) obj;
        if (other.getInitialPath() == null ^ this.getInitialPath() == null)
            return false;
        if (other.getInitialPath() != null && other.getInitialPath().equals(this.getInitialPath()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInitialPath() == null) ? 0 : getInitialPath().hashCode());
        return hashCode;
    }

    @Override
    public RegisteredUserQuickSightConsoleEmbeddingConfiguration clone() {
        try {
            return (RegisteredUserQuickSightConsoleEmbeddingConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.RegisteredUserQuickSightConsoleEmbeddingConfigurationMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
