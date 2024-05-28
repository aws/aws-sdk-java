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
package com.amazonaws.services.ssoadmin.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure that describes how the portal represents an application provider.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/DisplayData" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DisplayData implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The description of the application provider that appears in the portal.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The name of the application provider that appears in the portal.
     * </p>
     */
    private String displayName;
    /**
     * <p>
     * A URL that points to an icon that represents the application provider.
     * </p>
     */
    private String iconUrl;

    /**
     * <p>
     * The description of the application provider that appears in the portal.
     * </p>
     * 
     * @param description
     *        The description of the application provider that appears in the portal.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the application provider that appears in the portal.
     * </p>
     * 
     * @return The description of the application provider that appears in the portal.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the application provider that appears in the portal.
     * </p>
     * 
     * @param description
     *        The description of the application provider that appears in the portal.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisplayData withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The name of the application provider that appears in the portal.
     * </p>
     * 
     * @param displayName
     *        The name of the application provider that appears in the portal.
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The name of the application provider that appears in the portal.
     * </p>
     * 
     * @return The name of the application provider that appears in the portal.
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * The name of the application provider that appears in the portal.
     * </p>
     * 
     * @param displayName
     *        The name of the application provider that appears in the portal.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisplayData withDisplayName(String displayName) {
        setDisplayName(displayName);
        return this;
    }

    /**
     * <p>
     * A URL that points to an icon that represents the application provider.
     * </p>
     * 
     * @param iconUrl
     *        A URL that points to an icon that represents the application provider.
     */

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    /**
     * <p>
     * A URL that points to an icon that represents the application provider.
     * </p>
     * 
     * @return A URL that points to an icon that represents the application provider.
     */

    public String getIconUrl() {
        return this.iconUrl;
    }

    /**
     * <p>
     * A URL that points to an icon that represents the application provider.
     * </p>
     * 
     * @param iconUrl
     *        A URL that points to an icon that represents the application provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisplayData withIconUrl(String iconUrl) {
        setIconUrl(iconUrl);
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getDisplayName() != null)
            sb.append("DisplayName: ").append(getDisplayName()).append(",");
        if (getIconUrl() != null)
            sb.append("IconUrl: ").append(getIconUrl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisplayData == false)
            return false;
        DisplayData other = (DisplayData) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getIconUrl() == null ^ this.getIconUrl() == null)
            return false;
        if (other.getIconUrl() != null && other.getIconUrl().equals(this.getIconUrl()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getIconUrl() == null) ? 0 : getIconUrl().hashCode());
        return hashCode;
    }

    @Override
    public DisplayData clone() {
        try {
            return (DisplayData) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ssoadmin.model.transform.DisplayDataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
