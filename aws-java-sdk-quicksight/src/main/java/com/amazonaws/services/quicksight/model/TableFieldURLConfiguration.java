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
 * The URL configuration for a table field.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/TableFieldURLConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TableFieldURLConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The link configuration of a table field URL.
     * </p>
     */
    private TableFieldLinkConfiguration linkConfiguration;
    /**
     * <p>
     * The image configuration of a table field URL.
     * </p>
     */
    private TableFieldImageConfiguration imageConfiguration;

    /**
     * <p>
     * The link configuration of a table field URL.
     * </p>
     * 
     * @param linkConfiguration
     *        The link configuration of a table field URL.
     */

    public void setLinkConfiguration(TableFieldLinkConfiguration linkConfiguration) {
        this.linkConfiguration = linkConfiguration;
    }

    /**
     * <p>
     * The link configuration of a table field URL.
     * </p>
     * 
     * @return The link configuration of a table field URL.
     */

    public TableFieldLinkConfiguration getLinkConfiguration() {
        return this.linkConfiguration;
    }

    /**
     * <p>
     * The link configuration of a table field URL.
     * </p>
     * 
     * @param linkConfiguration
     *        The link configuration of a table field URL.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableFieldURLConfiguration withLinkConfiguration(TableFieldLinkConfiguration linkConfiguration) {
        setLinkConfiguration(linkConfiguration);
        return this;
    }

    /**
     * <p>
     * The image configuration of a table field URL.
     * </p>
     * 
     * @param imageConfiguration
     *        The image configuration of a table field URL.
     */

    public void setImageConfiguration(TableFieldImageConfiguration imageConfiguration) {
        this.imageConfiguration = imageConfiguration;
    }

    /**
     * <p>
     * The image configuration of a table field URL.
     * </p>
     * 
     * @return The image configuration of a table field URL.
     */

    public TableFieldImageConfiguration getImageConfiguration() {
        return this.imageConfiguration;
    }

    /**
     * <p>
     * The image configuration of a table field URL.
     * </p>
     * 
     * @param imageConfiguration
     *        The image configuration of a table field URL.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableFieldURLConfiguration withImageConfiguration(TableFieldImageConfiguration imageConfiguration) {
        setImageConfiguration(imageConfiguration);
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
        if (getLinkConfiguration() != null)
            sb.append("LinkConfiguration: ").append(getLinkConfiguration()).append(",");
        if (getImageConfiguration() != null)
            sb.append("ImageConfiguration: ").append(getImageConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TableFieldURLConfiguration == false)
            return false;
        TableFieldURLConfiguration other = (TableFieldURLConfiguration) obj;
        if (other.getLinkConfiguration() == null ^ this.getLinkConfiguration() == null)
            return false;
        if (other.getLinkConfiguration() != null && other.getLinkConfiguration().equals(this.getLinkConfiguration()) == false)
            return false;
        if (other.getImageConfiguration() == null ^ this.getImageConfiguration() == null)
            return false;
        if (other.getImageConfiguration() != null && other.getImageConfiguration().equals(this.getImageConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLinkConfiguration() == null) ? 0 : getLinkConfiguration().hashCode());
        hashCode = prime * hashCode + ((getImageConfiguration() == null) ? 0 : getImageConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public TableFieldURLConfiguration clone() {
        try {
            return (TableFieldURLConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.TableFieldURLConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
