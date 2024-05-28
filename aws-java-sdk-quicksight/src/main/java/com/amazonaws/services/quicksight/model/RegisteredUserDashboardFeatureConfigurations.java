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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The feature configuration for an embedded dashboard.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/RegisteredUserDashboardFeatureConfigurations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RegisteredUserDashboardFeatureConfigurations implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The state persistence settings of an embedded dashboard.
     * </p>
     */
    private StatePersistenceConfigurations statePersistence;
    /**
     * <p>
     * The bookmarks configuration for an embedded dashboard in Amazon QuickSight.
     * </p>
     */
    private BookmarksConfigurations bookmarks;

    /**
     * <p>
     * The state persistence settings of an embedded dashboard.
     * </p>
     * 
     * @param statePersistence
     *        The state persistence settings of an embedded dashboard.
     */

    public void setStatePersistence(StatePersistenceConfigurations statePersistence) {
        this.statePersistence = statePersistence;
    }

    /**
     * <p>
     * The state persistence settings of an embedded dashboard.
     * </p>
     * 
     * @return The state persistence settings of an embedded dashboard.
     */

    public StatePersistenceConfigurations getStatePersistence() {
        return this.statePersistence;
    }

    /**
     * <p>
     * The state persistence settings of an embedded dashboard.
     * </p>
     * 
     * @param statePersistence
     *        The state persistence settings of an embedded dashboard.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisteredUserDashboardFeatureConfigurations withStatePersistence(StatePersistenceConfigurations statePersistence) {
        setStatePersistence(statePersistence);
        return this;
    }

    /**
     * <p>
     * The bookmarks configuration for an embedded dashboard in Amazon QuickSight.
     * </p>
     * 
     * @param bookmarks
     *        The bookmarks configuration for an embedded dashboard in Amazon QuickSight.
     */

    public void setBookmarks(BookmarksConfigurations bookmarks) {
        this.bookmarks = bookmarks;
    }

    /**
     * <p>
     * The bookmarks configuration for an embedded dashboard in Amazon QuickSight.
     * </p>
     * 
     * @return The bookmarks configuration for an embedded dashboard in Amazon QuickSight.
     */

    public BookmarksConfigurations getBookmarks() {
        return this.bookmarks;
    }

    /**
     * <p>
     * The bookmarks configuration for an embedded dashboard in Amazon QuickSight.
     * </p>
     * 
     * @param bookmarks
     *        The bookmarks configuration for an embedded dashboard in Amazon QuickSight.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisteredUserDashboardFeatureConfigurations withBookmarks(BookmarksConfigurations bookmarks) {
        setBookmarks(bookmarks);
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
        if (getStatePersistence() != null)
            sb.append("StatePersistence: ").append(getStatePersistence()).append(",");
        if (getBookmarks() != null)
            sb.append("Bookmarks: ").append(getBookmarks());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RegisteredUserDashboardFeatureConfigurations == false)
            return false;
        RegisteredUserDashboardFeatureConfigurations other = (RegisteredUserDashboardFeatureConfigurations) obj;
        if (other.getStatePersistence() == null ^ this.getStatePersistence() == null)
            return false;
        if (other.getStatePersistence() != null && other.getStatePersistence().equals(this.getStatePersistence()) == false)
            return false;
        if (other.getBookmarks() == null ^ this.getBookmarks() == null)
            return false;
        if (other.getBookmarks() != null && other.getBookmarks().equals(this.getBookmarks()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatePersistence() == null) ? 0 : getStatePersistence().hashCode());
        hashCode = prime * hashCode + ((getBookmarks() == null) ? 0 : getBookmarks().hashCode());
        return hashCode;
    }

    @Override
    public RegisteredUserDashboardFeatureConfigurations clone() {
        try {
            return (RegisteredUserDashboardFeatureConfigurations) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.RegisteredUserDashboardFeatureConfigurationsMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
