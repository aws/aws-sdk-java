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
 * The reference line visual display options.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ReferenceLine" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReferenceLine implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The status of the reference line. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLE</code>
     * </p>
     * </li>
     * </ul>
     */
    private String status;
    /**
     * <p>
     * The data configuration of the reference line.
     * </p>
     */
    private ReferenceLineDataConfiguration dataConfiguration;
    /**
     * <p>
     * The style configuration of the reference line.
     * </p>
     */
    private ReferenceLineStyleConfiguration styleConfiguration;
    /**
     * <p>
     * The label configuration of the reference line.
     * </p>
     */
    private ReferenceLineLabelConfiguration labelConfiguration;

    /**
     * <p>
     * The status of the reference line. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLE</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the reference line. Choose one of the following options:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ENABLE</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DISABLE</code>
     *        </p>
     *        </li>
     * @see WidgetStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the reference line. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLE</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The status of the reference line. Choose one of the following options:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ENABLE</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DISABLE</code>
     *         </p>
     *         </li>
     * @see WidgetStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the reference line. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLE</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the reference line. Choose one of the following options:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ENABLE</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DISABLE</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WidgetStatus
     */

    public ReferenceLine withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the reference line. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLE</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the reference line. Choose one of the following options:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ENABLE</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DISABLE</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WidgetStatus
     */

    public ReferenceLine withStatus(WidgetStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The data configuration of the reference line.
     * </p>
     * 
     * @param dataConfiguration
     *        The data configuration of the reference line.
     */

    public void setDataConfiguration(ReferenceLineDataConfiguration dataConfiguration) {
        this.dataConfiguration = dataConfiguration;
    }

    /**
     * <p>
     * The data configuration of the reference line.
     * </p>
     * 
     * @return The data configuration of the reference line.
     */

    public ReferenceLineDataConfiguration getDataConfiguration() {
        return this.dataConfiguration;
    }

    /**
     * <p>
     * The data configuration of the reference line.
     * </p>
     * 
     * @param dataConfiguration
     *        The data configuration of the reference line.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReferenceLine withDataConfiguration(ReferenceLineDataConfiguration dataConfiguration) {
        setDataConfiguration(dataConfiguration);
        return this;
    }

    /**
     * <p>
     * The style configuration of the reference line.
     * </p>
     * 
     * @param styleConfiguration
     *        The style configuration of the reference line.
     */

    public void setStyleConfiguration(ReferenceLineStyleConfiguration styleConfiguration) {
        this.styleConfiguration = styleConfiguration;
    }

    /**
     * <p>
     * The style configuration of the reference line.
     * </p>
     * 
     * @return The style configuration of the reference line.
     */

    public ReferenceLineStyleConfiguration getStyleConfiguration() {
        return this.styleConfiguration;
    }

    /**
     * <p>
     * The style configuration of the reference line.
     * </p>
     * 
     * @param styleConfiguration
     *        The style configuration of the reference line.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReferenceLine withStyleConfiguration(ReferenceLineStyleConfiguration styleConfiguration) {
        setStyleConfiguration(styleConfiguration);
        return this;
    }

    /**
     * <p>
     * The label configuration of the reference line.
     * </p>
     * 
     * @param labelConfiguration
     *        The label configuration of the reference line.
     */

    public void setLabelConfiguration(ReferenceLineLabelConfiguration labelConfiguration) {
        this.labelConfiguration = labelConfiguration;
    }

    /**
     * <p>
     * The label configuration of the reference line.
     * </p>
     * 
     * @return The label configuration of the reference line.
     */

    public ReferenceLineLabelConfiguration getLabelConfiguration() {
        return this.labelConfiguration;
    }

    /**
     * <p>
     * The label configuration of the reference line.
     * </p>
     * 
     * @param labelConfiguration
     *        The label configuration of the reference line.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReferenceLine withLabelConfiguration(ReferenceLineLabelConfiguration labelConfiguration) {
        setLabelConfiguration(labelConfiguration);
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getDataConfiguration() != null)
            sb.append("DataConfiguration: ").append(getDataConfiguration()).append(",");
        if (getStyleConfiguration() != null)
            sb.append("StyleConfiguration: ").append(getStyleConfiguration()).append(",");
        if (getLabelConfiguration() != null)
            sb.append("LabelConfiguration: ").append(getLabelConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReferenceLine == false)
            return false;
        ReferenceLine other = (ReferenceLine) obj;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getDataConfiguration() == null ^ this.getDataConfiguration() == null)
            return false;
        if (other.getDataConfiguration() != null && other.getDataConfiguration().equals(this.getDataConfiguration()) == false)
            return false;
        if (other.getStyleConfiguration() == null ^ this.getStyleConfiguration() == null)
            return false;
        if (other.getStyleConfiguration() != null && other.getStyleConfiguration().equals(this.getStyleConfiguration()) == false)
            return false;
        if (other.getLabelConfiguration() == null ^ this.getLabelConfiguration() == null)
            return false;
        if (other.getLabelConfiguration() != null && other.getLabelConfiguration().equals(this.getLabelConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getDataConfiguration() == null) ? 0 : getDataConfiguration().hashCode());
        hashCode = prime * hashCode + ((getStyleConfiguration() == null) ? 0 : getStyleConfiguration().hashCode());
        hashCode = prime * hashCode + ((getLabelConfiguration() == null) ? 0 : getLabelConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public ReferenceLine clone() {
        try {
            return (ReferenceLine) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.ReferenceLineMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
