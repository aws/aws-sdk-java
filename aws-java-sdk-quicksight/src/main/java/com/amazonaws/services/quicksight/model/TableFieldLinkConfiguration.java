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
 * The link configuration of a table field URL.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/TableFieldLinkConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TableFieldLinkConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The URL target (new tab, new window, same tab) for the table link configuration.
     * </p>
     */
    private String target;
    /**
     * <p>
     * The URL content (text, icon) for the table link configuration.
     * </p>
     */
    private TableFieldLinkContentConfiguration content;

    /**
     * <p>
     * The URL target (new tab, new window, same tab) for the table link configuration.
     * </p>
     * 
     * @param target
     *        The URL target (new tab, new window, same tab) for the table link configuration.
     * @see URLTargetConfiguration
     */

    public void setTarget(String target) {
        this.target = target;
    }

    /**
     * <p>
     * The URL target (new tab, new window, same tab) for the table link configuration.
     * </p>
     * 
     * @return The URL target (new tab, new window, same tab) for the table link configuration.
     * @see URLTargetConfiguration
     */

    public String getTarget() {
        return this.target;
    }

    /**
     * <p>
     * The URL target (new tab, new window, same tab) for the table link configuration.
     * </p>
     * 
     * @param target
     *        The URL target (new tab, new window, same tab) for the table link configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see URLTargetConfiguration
     */

    public TableFieldLinkConfiguration withTarget(String target) {
        setTarget(target);
        return this;
    }

    /**
     * <p>
     * The URL target (new tab, new window, same tab) for the table link configuration.
     * </p>
     * 
     * @param target
     *        The URL target (new tab, new window, same tab) for the table link configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see URLTargetConfiguration
     */

    public TableFieldLinkConfiguration withTarget(URLTargetConfiguration target) {
        this.target = target.toString();
        return this;
    }

    /**
     * <p>
     * The URL content (text, icon) for the table link configuration.
     * </p>
     * 
     * @param content
     *        The URL content (text, icon) for the table link configuration.
     */

    public void setContent(TableFieldLinkContentConfiguration content) {
        this.content = content;
    }

    /**
     * <p>
     * The URL content (text, icon) for the table link configuration.
     * </p>
     * 
     * @return The URL content (text, icon) for the table link configuration.
     */

    public TableFieldLinkContentConfiguration getContent() {
        return this.content;
    }

    /**
     * <p>
     * The URL content (text, icon) for the table link configuration.
     * </p>
     * 
     * @param content
     *        The URL content (text, icon) for the table link configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableFieldLinkConfiguration withContent(TableFieldLinkContentConfiguration content) {
        setContent(content);
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
        if (getTarget() != null)
            sb.append("Target: ").append(getTarget()).append(",");
        if (getContent() != null)
            sb.append("Content: ").append(getContent());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TableFieldLinkConfiguration == false)
            return false;
        TableFieldLinkConfiguration other = (TableFieldLinkConfiguration) obj;
        if (other.getTarget() == null ^ this.getTarget() == null)
            return false;
        if (other.getTarget() != null && other.getTarget().equals(this.getTarget()) == false)
            return false;
        if (other.getContent() == null ^ this.getContent() == null)
            return false;
        if (other.getContent() != null && other.getContent().equals(this.getContent()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTarget() == null) ? 0 : getTarget().hashCode());
        hashCode = prime * hashCode + ((getContent() == null) ? 0 : getContent().hashCode());
        return hashCode;
    }

    @Override
    public TableFieldLinkConfiguration clone() {
        try {
            return (TableFieldLinkConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.TableFieldLinkConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
