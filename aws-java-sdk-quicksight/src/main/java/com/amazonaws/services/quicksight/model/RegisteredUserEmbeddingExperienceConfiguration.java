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
 * The type of experience you want to embed. For registered users, you can embed Amazon QuickSight dashboards or the
 * Amazon QuickSight console.
 * </p>
 * <note>
 * <p>
 * Exactly one of the experience configurations is required. You can choose <code>Dashboard</code> or
 * <code>QuickSightConsole</code>. You cannot choose more than one experience configuration.
 * </p>
 * </note>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/RegisteredUserEmbeddingExperienceConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RegisteredUserEmbeddingExperienceConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The configuration details for providing a dashboard embedding experience.
     * </p>
     */
    private RegisteredUserDashboardEmbeddingConfiguration dashboard;
    /**
     * <p>
     * The configuration details for providing each Amazon QuickSight console embedding experience. This can be used
     * along with custom permissions to restrict access to certain features. For more information, see <a href=
     * "https://docs.aws.amazon.com/quicksight/latest/user/customizing-permissions-to-the-quicksight-console.html"
     * >Customizing Access to the Amazon QuickSight Console</a> in the <i>Amazon QuickSight User Guide</i>.
     * </p>
     * <p>
     * Use
     * <code> <a href="https://docs.aws.amazon.com/quicksight/latest/APIReference/API_GenerateEmbedUrlForRegisteredUser.html">GenerateEmbedUrlForRegisteredUser</a> </code>
     * where you want to provide an authoring portal that allows users to create data sources, datasets, analyses, and
     * dashboards. The users who accesses an embedded Amazon QuickSight console needs to belong to the author or admin
     * security cohort. If you want to restrict permissions to some of these features, add a custom permissions profile
     * to the user with the
     * <code> <a href="https://docs.aws.amazon.com/quicksight/latest/APIReference/API_UpdateUser.html">UpdateUser</a> </code>
     * API operation. Use the
     * <code> <a href="https://docs.aws.amazon.com/quicksight/latest/APIReference/API_RegisterUser.html">RegisterUser</a> </code>
     * API operation to add a new user with a custom permission profile attached. For more information, see the
     * following sections in the <i>Amazon QuickSight User Guide</i>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/quicksight/latest/user/embedded-analytics-full-console-for-authenticated-users.html"
     * >Embedding the Full Functionality of the Amazon QuickSight Console for Authenticated Users</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/quicksight/latest/user/customizing-permissions-to-the-quicksight-console.html"
     * >Customizing Access to the Amazon QuickSight Console</a>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about the high-level steps for embedding and for an interactive demo of the ways you can
     * customize embedding, visit the <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/quicksight-dev-portal.html">Amazon QuickSight Developer
     * Portal</a>.
     * </p>
     */
    private RegisteredUserQuickSightConsoleEmbeddingConfiguration quickSightConsole;
    /**
     * <p>
     * The configuration details for embedding the Q search bar.
     * </p>
     * <p>
     * For more information about embedding the Q search bar, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/embedding-overview.html">Embedding Overview</a> in the
     * <i>Amazon QuickSight User Guide</i>.
     * </p>
     */
    private RegisteredUserQSearchBarEmbeddingConfiguration qSearchBar;
    /**
     * <p>
     * The type of embedding experience. In this case, Amazon QuickSight visuals.
     * </p>
     */
    private RegisteredUserDashboardVisualEmbeddingConfiguration dashboardVisual;

    /**
     * <p>
     * The configuration details for providing a dashboard embedding experience.
     * </p>
     * 
     * @param dashboard
     *        The configuration details for providing a dashboard embedding experience.
     */

    public void setDashboard(RegisteredUserDashboardEmbeddingConfiguration dashboard) {
        this.dashboard = dashboard;
    }

    /**
     * <p>
     * The configuration details for providing a dashboard embedding experience.
     * </p>
     * 
     * @return The configuration details for providing a dashboard embedding experience.
     */

    public RegisteredUserDashboardEmbeddingConfiguration getDashboard() {
        return this.dashboard;
    }

    /**
     * <p>
     * The configuration details for providing a dashboard embedding experience.
     * </p>
     * 
     * @param dashboard
     *        The configuration details for providing a dashboard embedding experience.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisteredUserEmbeddingExperienceConfiguration withDashboard(RegisteredUserDashboardEmbeddingConfiguration dashboard) {
        setDashboard(dashboard);
        return this;
    }

    /**
     * <p>
     * The configuration details for providing each Amazon QuickSight console embedding experience. This can be used
     * along with custom permissions to restrict access to certain features. For more information, see <a href=
     * "https://docs.aws.amazon.com/quicksight/latest/user/customizing-permissions-to-the-quicksight-console.html"
     * >Customizing Access to the Amazon QuickSight Console</a> in the <i>Amazon QuickSight User Guide</i>.
     * </p>
     * <p>
     * Use
     * <code> <a href="https://docs.aws.amazon.com/quicksight/latest/APIReference/API_GenerateEmbedUrlForRegisteredUser.html">GenerateEmbedUrlForRegisteredUser</a> </code>
     * where you want to provide an authoring portal that allows users to create data sources, datasets, analyses, and
     * dashboards. The users who accesses an embedded Amazon QuickSight console needs to belong to the author or admin
     * security cohort. If you want to restrict permissions to some of these features, add a custom permissions profile
     * to the user with the
     * <code> <a href="https://docs.aws.amazon.com/quicksight/latest/APIReference/API_UpdateUser.html">UpdateUser</a> </code>
     * API operation. Use the
     * <code> <a href="https://docs.aws.amazon.com/quicksight/latest/APIReference/API_RegisterUser.html">RegisterUser</a> </code>
     * API operation to add a new user with a custom permission profile attached. For more information, see the
     * following sections in the <i>Amazon QuickSight User Guide</i>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/quicksight/latest/user/embedded-analytics-full-console-for-authenticated-users.html"
     * >Embedding the Full Functionality of the Amazon QuickSight Console for Authenticated Users</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/quicksight/latest/user/customizing-permissions-to-the-quicksight-console.html"
     * >Customizing Access to the Amazon QuickSight Console</a>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about the high-level steps for embedding and for an interactive demo of the ways you can
     * customize embedding, visit the <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/quicksight-dev-portal.html">Amazon QuickSight Developer
     * Portal</a>.
     * </p>
     * 
     * @param quickSightConsole
     *        The configuration details for providing each Amazon QuickSight console embedding experience. This can be
     *        used along with custom permissions to restrict access to certain features. For more information, see <a
     *        href=
     *        "https://docs.aws.amazon.com/quicksight/latest/user/customizing-permissions-to-the-quicksight-console.html"
     *        >Customizing Access to the Amazon QuickSight Console</a> in the <i>Amazon QuickSight User Guide</i>.</p>
     *        <p>
     *        Use
     *        <code> <a href="https://docs.aws.amazon.com/quicksight/latest/APIReference/API_GenerateEmbedUrlForRegisteredUser.html">GenerateEmbedUrlForRegisteredUser</a> </code>
     *        where you want to provide an authoring portal that allows users to create data sources, datasets,
     *        analyses, and dashboards. The users who accesses an embedded Amazon QuickSight console needs to belong to
     *        the author or admin security cohort. If you want to restrict permissions to some of these features, add a
     *        custom permissions profile to the user with the
     *        <code> <a href="https://docs.aws.amazon.com/quicksight/latest/APIReference/API_UpdateUser.html">UpdateUser</a> </code>
     *        API operation. Use the
     *        <code> <a href="https://docs.aws.amazon.com/quicksight/latest/APIReference/API_RegisterUser.html">RegisterUser</a> </code>
     *        API operation to add a new user with a custom permission profile attached. For more information, see the
     *        following sections in the <i>Amazon QuickSight User Guide</i>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <a href=
     *        "https://docs.aws.amazon.com/quicksight/latest/user/embedded-analytics-full-console-for-authenticated-users.html"
     *        >Embedding the Full Functionality of the Amazon QuickSight Console for Authenticated Users</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a href=
     *        "https://docs.aws.amazon.com/quicksight/latest/user/customizing-permissions-to-the-quicksight-console.html"
     *        >Customizing Access to the Amazon QuickSight Console</a>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information about the high-level steps for embedding and for an interactive demo of the ways you
     *        can customize embedding, visit the <a
     *        href="https://docs.aws.amazon.com/quicksight/latest/user/quicksight-dev-portal.html">Amazon QuickSight
     *        Developer Portal</a>.
     */

    public void setQuickSightConsole(RegisteredUserQuickSightConsoleEmbeddingConfiguration quickSightConsole) {
        this.quickSightConsole = quickSightConsole;
    }

    /**
     * <p>
     * The configuration details for providing each Amazon QuickSight console embedding experience. This can be used
     * along with custom permissions to restrict access to certain features. For more information, see <a href=
     * "https://docs.aws.amazon.com/quicksight/latest/user/customizing-permissions-to-the-quicksight-console.html"
     * >Customizing Access to the Amazon QuickSight Console</a> in the <i>Amazon QuickSight User Guide</i>.
     * </p>
     * <p>
     * Use
     * <code> <a href="https://docs.aws.amazon.com/quicksight/latest/APIReference/API_GenerateEmbedUrlForRegisteredUser.html">GenerateEmbedUrlForRegisteredUser</a> </code>
     * where you want to provide an authoring portal that allows users to create data sources, datasets, analyses, and
     * dashboards. The users who accesses an embedded Amazon QuickSight console needs to belong to the author or admin
     * security cohort. If you want to restrict permissions to some of these features, add a custom permissions profile
     * to the user with the
     * <code> <a href="https://docs.aws.amazon.com/quicksight/latest/APIReference/API_UpdateUser.html">UpdateUser</a> </code>
     * API operation. Use the
     * <code> <a href="https://docs.aws.amazon.com/quicksight/latest/APIReference/API_RegisterUser.html">RegisterUser</a> </code>
     * API operation to add a new user with a custom permission profile attached. For more information, see the
     * following sections in the <i>Amazon QuickSight User Guide</i>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/quicksight/latest/user/embedded-analytics-full-console-for-authenticated-users.html"
     * >Embedding the Full Functionality of the Amazon QuickSight Console for Authenticated Users</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/quicksight/latest/user/customizing-permissions-to-the-quicksight-console.html"
     * >Customizing Access to the Amazon QuickSight Console</a>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about the high-level steps for embedding and for an interactive demo of the ways you can
     * customize embedding, visit the <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/quicksight-dev-portal.html">Amazon QuickSight Developer
     * Portal</a>.
     * </p>
     * 
     * @return The configuration details for providing each Amazon QuickSight console embedding experience. This can be
     *         used along with custom permissions to restrict access to certain features. For more information, see <a
     *         href=
     *         "https://docs.aws.amazon.com/quicksight/latest/user/customizing-permissions-to-the-quicksight-console.html"
     *         >Customizing Access to the Amazon QuickSight Console</a> in the <i>Amazon QuickSight User Guide</i>.</p>
     *         <p>
     *         Use
     *         <code> <a href="https://docs.aws.amazon.com/quicksight/latest/APIReference/API_GenerateEmbedUrlForRegisteredUser.html">GenerateEmbedUrlForRegisteredUser</a> </code>
     *         where you want to provide an authoring portal that allows users to create data sources, datasets,
     *         analyses, and dashboards. The users who accesses an embedded Amazon QuickSight console needs to belong to
     *         the author or admin security cohort. If you want to restrict permissions to some of these features, add a
     *         custom permissions profile to the user with the
     *         <code> <a href="https://docs.aws.amazon.com/quicksight/latest/APIReference/API_UpdateUser.html">UpdateUser</a> </code>
     *         API operation. Use the
     *         <code> <a href="https://docs.aws.amazon.com/quicksight/latest/APIReference/API_RegisterUser.html">RegisterUser</a> </code>
     *         API operation to add a new user with a custom permission profile attached. For more information, see the
     *         following sections in the <i>Amazon QuickSight User Guide</i>:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <a href=
     *         "https://docs.aws.amazon.com/quicksight/latest/user/embedded-analytics-full-console-for-authenticated-users.html"
     *         >Embedding the Full Functionality of the Amazon QuickSight Console for Authenticated Users</a>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <a href=
     *         "https://docs.aws.amazon.com/quicksight/latest/user/customizing-permissions-to-the-quicksight-console.html"
     *         >Customizing Access to the Amazon QuickSight Console</a>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information about the high-level steps for embedding and for an interactive demo of the ways you
     *         can customize embedding, visit the <a
     *         href="https://docs.aws.amazon.com/quicksight/latest/user/quicksight-dev-portal.html">Amazon QuickSight
     *         Developer Portal</a>.
     */

    public RegisteredUserQuickSightConsoleEmbeddingConfiguration getQuickSightConsole() {
        return this.quickSightConsole;
    }

    /**
     * <p>
     * The configuration details for providing each Amazon QuickSight console embedding experience. This can be used
     * along with custom permissions to restrict access to certain features. For more information, see <a href=
     * "https://docs.aws.amazon.com/quicksight/latest/user/customizing-permissions-to-the-quicksight-console.html"
     * >Customizing Access to the Amazon QuickSight Console</a> in the <i>Amazon QuickSight User Guide</i>.
     * </p>
     * <p>
     * Use
     * <code> <a href="https://docs.aws.amazon.com/quicksight/latest/APIReference/API_GenerateEmbedUrlForRegisteredUser.html">GenerateEmbedUrlForRegisteredUser</a> </code>
     * where you want to provide an authoring portal that allows users to create data sources, datasets, analyses, and
     * dashboards. The users who accesses an embedded Amazon QuickSight console needs to belong to the author or admin
     * security cohort. If you want to restrict permissions to some of these features, add a custom permissions profile
     * to the user with the
     * <code> <a href="https://docs.aws.amazon.com/quicksight/latest/APIReference/API_UpdateUser.html">UpdateUser</a> </code>
     * API operation. Use the
     * <code> <a href="https://docs.aws.amazon.com/quicksight/latest/APIReference/API_RegisterUser.html">RegisterUser</a> </code>
     * API operation to add a new user with a custom permission profile attached. For more information, see the
     * following sections in the <i>Amazon QuickSight User Guide</i>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/quicksight/latest/user/embedded-analytics-full-console-for-authenticated-users.html"
     * >Embedding the Full Functionality of the Amazon QuickSight Console for Authenticated Users</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/quicksight/latest/user/customizing-permissions-to-the-quicksight-console.html"
     * >Customizing Access to the Amazon QuickSight Console</a>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about the high-level steps for embedding and for an interactive demo of the ways you can
     * customize embedding, visit the <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/quicksight-dev-portal.html">Amazon QuickSight Developer
     * Portal</a>.
     * </p>
     * 
     * @param quickSightConsole
     *        The configuration details for providing each Amazon QuickSight console embedding experience. This can be
     *        used along with custom permissions to restrict access to certain features. For more information, see <a
     *        href=
     *        "https://docs.aws.amazon.com/quicksight/latest/user/customizing-permissions-to-the-quicksight-console.html"
     *        >Customizing Access to the Amazon QuickSight Console</a> in the <i>Amazon QuickSight User Guide</i>.</p>
     *        <p>
     *        Use
     *        <code> <a href="https://docs.aws.amazon.com/quicksight/latest/APIReference/API_GenerateEmbedUrlForRegisteredUser.html">GenerateEmbedUrlForRegisteredUser</a> </code>
     *        where you want to provide an authoring portal that allows users to create data sources, datasets,
     *        analyses, and dashboards. The users who accesses an embedded Amazon QuickSight console needs to belong to
     *        the author or admin security cohort. If you want to restrict permissions to some of these features, add a
     *        custom permissions profile to the user with the
     *        <code> <a href="https://docs.aws.amazon.com/quicksight/latest/APIReference/API_UpdateUser.html">UpdateUser</a> </code>
     *        API operation. Use the
     *        <code> <a href="https://docs.aws.amazon.com/quicksight/latest/APIReference/API_RegisterUser.html">RegisterUser</a> </code>
     *        API operation to add a new user with a custom permission profile attached. For more information, see the
     *        following sections in the <i>Amazon QuickSight User Guide</i>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <a href=
     *        "https://docs.aws.amazon.com/quicksight/latest/user/embedded-analytics-full-console-for-authenticated-users.html"
     *        >Embedding the Full Functionality of the Amazon QuickSight Console for Authenticated Users</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a href=
     *        "https://docs.aws.amazon.com/quicksight/latest/user/customizing-permissions-to-the-quicksight-console.html"
     *        >Customizing Access to the Amazon QuickSight Console</a>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information about the high-level steps for embedding and for an interactive demo of the ways you
     *        can customize embedding, visit the <a
     *        href="https://docs.aws.amazon.com/quicksight/latest/user/quicksight-dev-portal.html">Amazon QuickSight
     *        Developer Portal</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisteredUserEmbeddingExperienceConfiguration withQuickSightConsole(RegisteredUserQuickSightConsoleEmbeddingConfiguration quickSightConsole) {
        setQuickSightConsole(quickSightConsole);
        return this;
    }

    /**
     * <p>
     * The configuration details for embedding the Q search bar.
     * </p>
     * <p>
     * For more information about embedding the Q search bar, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/embedding-overview.html">Embedding Overview</a> in the
     * <i>Amazon QuickSight User Guide</i>.
     * </p>
     * 
     * @param qSearchBar
     *        The configuration details for embedding the Q search bar.</p>
     *        <p>
     *        For more information about embedding the Q search bar, see <a
     *        href="https://docs.aws.amazon.com/quicksight/latest/user/embedding-overview.html">Embedding Overview</a>
     *        in the <i>Amazon QuickSight User Guide</i>.
     */

    public void setQSearchBar(RegisteredUserQSearchBarEmbeddingConfiguration qSearchBar) {
        this.qSearchBar = qSearchBar;
    }

    /**
     * <p>
     * The configuration details for embedding the Q search bar.
     * </p>
     * <p>
     * For more information about embedding the Q search bar, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/embedding-overview.html">Embedding Overview</a> in the
     * <i>Amazon QuickSight User Guide</i>.
     * </p>
     * 
     * @return The configuration details for embedding the Q search bar.</p>
     *         <p>
     *         For more information about embedding the Q search bar, see <a
     *         href="https://docs.aws.amazon.com/quicksight/latest/user/embedding-overview.html">Embedding Overview</a>
     *         in the <i>Amazon QuickSight User Guide</i>.
     */

    public RegisteredUserQSearchBarEmbeddingConfiguration getQSearchBar() {
        return this.qSearchBar;
    }

    /**
     * <p>
     * The configuration details for embedding the Q search bar.
     * </p>
     * <p>
     * For more information about embedding the Q search bar, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/embedding-overview.html">Embedding Overview</a> in the
     * <i>Amazon QuickSight User Guide</i>.
     * </p>
     * 
     * @param qSearchBar
     *        The configuration details for embedding the Q search bar.</p>
     *        <p>
     *        For more information about embedding the Q search bar, see <a
     *        href="https://docs.aws.amazon.com/quicksight/latest/user/embedding-overview.html">Embedding Overview</a>
     *        in the <i>Amazon QuickSight User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisteredUserEmbeddingExperienceConfiguration withQSearchBar(RegisteredUserQSearchBarEmbeddingConfiguration qSearchBar) {
        setQSearchBar(qSearchBar);
        return this;
    }

    /**
     * <p>
     * The type of embedding experience. In this case, Amazon QuickSight visuals.
     * </p>
     * 
     * @param dashboardVisual
     *        The type of embedding experience. In this case, Amazon QuickSight visuals.
     */

    public void setDashboardVisual(RegisteredUserDashboardVisualEmbeddingConfiguration dashboardVisual) {
        this.dashboardVisual = dashboardVisual;
    }

    /**
     * <p>
     * The type of embedding experience. In this case, Amazon QuickSight visuals.
     * </p>
     * 
     * @return The type of embedding experience. In this case, Amazon QuickSight visuals.
     */

    public RegisteredUserDashboardVisualEmbeddingConfiguration getDashboardVisual() {
        return this.dashboardVisual;
    }

    /**
     * <p>
     * The type of embedding experience. In this case, Amazon QuickSight visuals.
     * </p>
     * 
     * @param dashboardVisual
     *        The type of embedding experience. In this case, Amazon QuickSight visuals.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisteredUserEmbeddingExperienceConfiguration withDashboardVisual(RegisteredUserDashboardVisualEmbeddingConfiguration dashboardVisual) {
        setDashboardVisual(dashboardVisual);
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
        if (getDashboard() != null)
            sb.append("Dashboard: ").append(getDashboard()).append(",");
        if (getQuickSightConsole() != null)
            sb.append("QuickSightConsole: ").append(getQuickSightConsole()).append(",");
        if (getQSearchBar() != null)
            sb.append("QSearchBar: ").append(getQSearchBar()).append(",");
        if (getDashboardVisual() != null)
            sb.append("DashboardVisual: ").append(getDashboardVisual());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RegisteredUserEmbeddingExperienceConfiguration == false)
            return false;
        RegisteredUserEmbeddingExperienceConfiguration other = (RegisteredUserEmbeddingExperienceConfiguration) obj;
        if (other.getDashboard() == null ^ this.getDashboard() == null)
            return false;
        if (other.getDashboard() != null && other.getDashboard().equals(this.getDashboard()) == false)
            return false;
        if (other.getQuickSightConsole() == null ^ this.getQuickSightConsole() == null)
            return false;
        if (other.getQuickSightConsole() != null && other.getQuickSightConsole().equals(this.getQuickSightConsole()) == false)
            return false;
        if (other.getQSearchBar() == null ^ this.getQSearchBar() == null)
            return false;
        if (other.getQSearchBar() != null && other.getQSearchBar().equals(this.getQSearchBar()) == false)
            return false;
        if (other.getDashboardVisual() == null ^ this.getDashboardVisual() == null)
            return false;
        if (other.getDashboardVisual() != null && other.getDashboardVisual().equals(this.getDashboardVisual()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDashboard() == null) ? 0 : getDashboard().hashCode());
        hashCode = prime * hashCode + ((getQuickSightConsole() == null) ? 0 : getQuickSightConsole().hashCode());
        hashCode = prime * hashCode + ((getQSearchBar() == null) ? 0 : getQSearchBar().hashCode());
        hashCode = prime * hashCode + ((getDashboardVisual() == null) ? 0 : getDashboardVisual().hashCode());
        return hashCode;
    }

    @Override
    public RegisteredUserEmbeddingExperienceConfiguration clone() {
        try {
            return (RegisteredUserEmbeddingExperienceConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.RegisteredUserEmbeddingExperienceConfigurationMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
