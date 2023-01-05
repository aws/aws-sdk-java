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
 * The date configuration of the filter.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/AnchorDateConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AnchorDateConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The options for the date configuration. Choose one of the options below:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NOW</code>
     * </p>
     * </li>
     * </ul>
     */
    private String anchorOption;
    /**
     * <p>
     * The name of the parameter that is used for the anchor date configuration.
     * </p>
     */
    private String parameterName;

    /**
     * <p>
     * The options for the date configuration. Choose one of the options below:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NOW</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param anchorOption
     *        The options for the date configuration. Choose one of the options below:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NOW</code>
     *        </p>
     *        </li>
     * @see AnchorOption
     */

    public void setAnchorOption(String anchorOption) {
        this.anchorOption = anchorOption;
    }

    /**
     * <p>
     * The options for the date configuration. Choose one of the options below:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NOW</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The options for the date configuration. Choose one of the options below:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>NOW</code>
     *         </p>
     *         </li>
     * @see AnchorOption
     */

    public String getAnchorOption() {
        return this.anchorOption;
    }

    /**
     * <p>
     * The options for the date configuration. Choose one of the options below:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NOW</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param anchorOption
     *        The options for the date configuration. Choose one of the options below:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NOW</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AnchorOption
     */

    public AnchorDateConfiguration withAnchorOption(String anchorOption) {
        setAnchorOption(anchorOption);
        return this;
    }

    /**
     * <p>
     * The options for the date configuration. Choose one of the options below:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NOW</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param anchorOption
     *        The options for the date configuration. Choose one of the options below:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NOW</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AnchorOption
     */

    public AnchorDateConfiguration withAnchorOption(AnchorOption anchorOption) {
        this.anchorOption = anchorOption.toString();
        return this;
    }

    /**
     * <p>
     * The name of the parameter that is used for the anchor date configuration.
     * </p>
     * 
     * @param parameterName
     *        The name of the parameter that is used for the anchor date configuration.
     */

    public void setParameterName(String parameterName) {
        this.parameterName = parameterName;
    }

    /**
     * <p>
     * The name of the parameter that is used for the anchor date configuration.
     * </p>
     * 
     * @return The name of the parameter that is used for the anchor date configuration.
     */

    public String getParameterName() {
        return this.parameterName;
    }

    /**
     * <p>
     * The name of the parameter that is used for the anchor date configuration.
     * </p>
     * 
     * @param parameterName
     *        The name of the parameter that is used for the anchor date configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnchorDateConfiguration withParameterName(String parameterName) {
        setParameterName(parameterName);
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
        if (getAnchorOption() != null)
            sb.append("AnchorOption: ").append(getAnchorOption()).append(",");
        if (getParameterName() != null)
            sb.append("ParameterName: ").append(getParameterName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AnchorDateConfiguration == false)
            return false;
        AnchorDateConfiguration other = (AnchorDateConfiguration) obj;
        if (other.getAnchorOption() == null ^ this.getAnchorOption() == null)
            return false;
        if (other.getAnchorOption() != null && other.getAnchorOption().equals(this.getAnchorOption()) == false)
            return false;
        if (other.getParameterName() == null ^ this.getParameterName() == null)
            return false;
        if (other.getParameterName() != null && other.getParameterName().equals(this.getParameterName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAnchorOption() == null) ? 0 : getAnchorOption().hashCode());
        hashCode = prime * hashCode + ((getParameterName() == null) ? 0 : getParameterName().hashCode());
        return hashCode;
    }

    @Override
    public AnchorDateConfiguration clone() {
        try {
            return (AnchorDateConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.AnchorDateConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
