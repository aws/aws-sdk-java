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
 * The configuration for default new sheet settings.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DefaultNewSheetConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DefaultNewSheetConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The options that determine the default settings for interactive layout configuration.
     * </p>
     */
    private DefaultInteractiveLayoutConfiguration interactiveLayoutConfiguration;
    /**
     * <p>
     * The options that determine the default settings for a paginated layout configuration.
     * </p>
     */
    private DefaultPaginatedLayoutConfiguration paginatedLayoutConfiguration;
    /**
     * <p>
     * The option that determines the sheet content type.
     * </p>
     */
    private String sheetContentType;

    /**
     * <p>
     * The options that determine the default settings for interactive layout configuration.
     * </p>
     * 
     * @param interactiveLayoutConfiguration
     *        The options that determine the default settings for interactive layout configuration.
     */

    public void setInteractiveLayoutConfiguration(DefaultInteractiveLayoutConfiguration interactiveLayoutConfiguration) {
        this.interactiveLayoutConfiguration = interactiveLayoutConfiguration;
    }

    /**
     * <p>
     * The options that determine the default settings for interactive layout configuration.
     * </p>
     * 
     * @return The options that determine the default settings for interactive layout configuration.
     */

    public DefaultInteractiveLayoutConfiguration getInteractiveLayoutConfiguration() {
        return this.interactiveLayoutConfiguration;
    }

    /**
     * <p>
     * The options that determine the default settings for interactive layout configuration.
     * </p>
     * 
     * @param interactiveLayoutConfiguration
     *        The options that determine the default settings for interactive layout configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DefaultNewSheetConfiguration withInteractiveLayoutConfiguration(DefaultInteractiveLayoutConfiguration interactiveLayoutConfiguration) {
        setInteractiveLayoutConfiguration(interactiveLayoutConfiguration);
        return this;
    }

    /**
     * <p>
     * The options that determine the default settings for a paginated layout configuration.
     * </p>
     * 
     * @param paginatedLayoutConfiguration
     *        The options that determine the default settings for a paginated layout configuration.
     */

    public void setPaginatedLayoutConfiguration(DefaultPaginatedLayoutConfiguration paginatedLayoutConfiguration) {
        this.paginatedLayoutConfiguration = paginatedLayoutConfiguration;
    }

    /**
     * <p>
     * The options that determine the default settings for a paginated layout configuration.
     * </p>
     * 
     * @return The options that determine the default settings for a paginated layout configuration.
     */

    public DefaultPaginatedLayoutConfiguration getPaginatedLayoutConfiguration() {
        return this.paginatedLayoutConfiguration;
    }

    /**
     * <p>
     * The options that determine the default settings for a paginated layout configuration.
     * </p>
     * 
     * @param paginatedLayoutConfiguration
     *        The options that determine the default settings for a paginated layout configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DefaultNewSheetConfiguration withPaginatedLayoutConfiguration(DefaultPaginatedLayoutConfiguration paginatedLayoutConfiguration) {
        setPaginatedLayoutConfiguration(paginatedLayoutConfiguration);
        return this;
    }

    /**
     * <p>
     * The option that determines the sheet content type.
     * </p>
     * 
     * @param sheetContentType
     *        The option that determines the sheet content type.
     * @see SheetContentType
     */

    public void setSheetContentType(String sheetContentType) {
        this.sheetContentType = sheetContentType;
    }

    /**
     * <p>
     * The option that determines the sheet content type.
     * </p>
     * 
     * @return The option that determines the sheet content type.
     * @see SheetContentType
     */

    public String getSheetContentType() {
        return this.sheetContentType;
    }

    /**
     * <p>
     * The option that determines the sheet content type.
     * </p>
     * 
     * @param sheetContentType
     *        The option that determines the sheet content type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SheetContentType
     */

    public DefaultNewSheetConfiguration withSheetContentType(String sheetContentType) {
        setSheetContentType(sheetContentType);
        return this;
    }

    /**
     * <p>
     * The option that determines the sheet content type.
     * </p>
     * 
     * @param sheetContentType
     *        The option that determines the sheet content type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SheetContentType
     */

    public DefaultNewSheetConfiguration withSheetContentType(SheetContentType sheetContentType) {
        this.sheetContentType = sheetContentType.toString();
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
        if (getInteractiveLayoutConfiguration() != null)
            sb.append("InteractiveLayoutConfiguration: ").append(getInteractiveLayoutConfiguration()).append(",");
        if (getPaginatedLayoutConfiguration() != null)
            sb.append("PaginatedLayoutConfiguration: ").append(getPaginatedLayoutConfiguration()).append(",");
        if (getSheetContentType() != null)
            sb.append("SheetContentType: ").append(getSheetContentType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DefaultNewSheetConfiguration == false)
            return false;
        DefaultNewSheetConfiguration other = (DefaultNewSheetConfiguration) obj;
        if (other.getInteractiveLayoutConfiguration() == null ^ this.getInteractiveLayoutConfiguration() == null)
            return false;
        if (other.getInteractiveLayoutConfiguration() != null
                && other.getInteractiveLayoutConfiguration().equals(this.getInteractiveLayoutConfiguration()) == false)
            return false;
        if (other.getPaginatedLayoutConfiguration() == null ^ this.getPaginatedLayoutConfiguration() == null)
            return false;
        if (other.getPaginatedLayoutConfiguration() != null && other.getPaginatedLayoutConfiguration().equals(this.getPaginatedLayoutConfiguration()) == false)
            return false;
        if (other.getSheetContentType() == null ^ this.getSheetContentType() == null)
            return false;
        if (other.getSheetContentType() != null && other.getSheetContentType().equals(this.getSheetContentType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInteractiveLayoutConfiguration() == null) ? 0 : getInteractiveLayoutConfiguration().hashCode());
        hashCode = prime * hashCode + ((getPaginatedLayoutConfiguration() == null) ? 0 : getPaginatedLayoutConfiguration().hashCode());
        hashCode = prime * hashCode + ((getSheetContentType() == null) ? 0 : getSheetContentType().hashCode());
        return hashCode;
    }

    @Override
    public DefaultNewSheetConfiguration clone() {
        try {
            return (DefaultNewSheetConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.DefaultNewSheetConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
