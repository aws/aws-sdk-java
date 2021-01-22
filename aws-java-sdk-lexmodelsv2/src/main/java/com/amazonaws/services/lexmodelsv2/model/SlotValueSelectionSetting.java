/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lexmodelsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains settings used by Amazon Lex to select a slot value.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/SlotValueSelectionSetting"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SlotValueSelectionSetting implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Determines the slot resolution strategy that Amazon Lex uses to return slot type values. The field can be set to
     * one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * OriginalValue - Returns the value entered by the user, if the user value is similar to the slot value.
     * </p>
     * </li>
     * <li>
     * <p>
     * TopResolution - If there is a resolution list for the slot, return the first value in the resolution list as the
     * slot type value. If there is no resolution list, null is returned.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't specify the valueSelectionStrategy, the default is OriginalValue.
     * </p>
     */
    private String resolutionStrategy;
    /**
     * <p>
     * A regular expression used to validate the value of a slot.
     * </p>
     */
    private SlotValueRegexFilter regexFilter;

    /**
     * <p>
     * Determines the slot resolution strategy that Amazon Lex uses to return slot type values. The field can be set to
     * one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * OriginalValue - Returns the value entered by the user, if the user value is similar to the slot value.
     * </p>
     * </li>
     * <li>
     * <p>
     * TopResolution - If there is a resolution list for the slot, return the first value in the resolution list as the
     * slot type value. If there is no resolution list, null is returned.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't specify the valueSelectionStrategy, the default is OriginalValue.
     * </p>
     * 
     * @param resolutionStrategy
     *        Determines the slot resolution strategy that Amazon Lex uses to return slot type values. The field can be
     *        set to one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        OriginalValue - Returns the value entered by the user, if the user value is similar to the slot value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        TopResolution - If there is a resolution list for the slot, return the first value in the resolution list
     *        as the slot type value. If there is no resolution list, null is returned.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you don't specify the valueSelectionStrategy, the default is OriginalValue.
     * @see SlotValueResolutionStrategy
     */

    public void setResolutionStrategy(String resolutionStrategy) {
        this.resolutionStrategy = resolutionStrategy;
    }

    /**
     * <p>
     * Determines the slot resolution strategy that Amazon Lex uses to return slot type values. The field can be set to
     * one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * OriginalValue - Returns the value entered by the user, if the user value is similar to the slot value.
     * </p>
     * </li>
     * <li>
     * <p>
     * TopResolution - If there is a resolution list for the slot, return the first value in the resolution list as the
     * slot type value. If there is no resolution list, null is returned.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't specify the valueSelectionStrategy, the default is OriginalValue.
     * </p>
     * 
     * @return Determines the slot resolution strategy that Amazon Lex uses to return slot type values. The field can be
     *         set to one of the following values:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         OriginalValue - Returns the value entered by the user, if the user value is similar to the slot value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         TopResolution - If there is a resolution list for the slot, return the first value in the resolution list
     *         as the slot type value. If there is no resolution list, null is returned.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If you don't specify the valueSelectionStrategy, the default is OriginalValue.
     * @see SlotValueResolutionStrategy
     */

    public String getResolutionStrategy() {
        return this.resolutionStrategy;
    }

    /**
     * <p>
     * Determines the slot resolution strategy that Amazon Lex uses to return slot type values. The field can be set to
     * one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * OriginalValue - Returns the value entered by the user, if the user value is similar to the slot value.
     * </p>
     * </li>
     * <li>
     * <p>
     * TopResolution - If there is a resolution list for the slot, return the first value in the resolution list as the
     * slot type value. If there is no resolution list, null is returned.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't specify the valueSelectionStrategy, the default is OriginalValue.
     * </p>
     * 
     * @param resolutionStrategy
     *        Determines the slot resolution strategy that Amazon Lex uses to return slot type values. The field can be
     *        set to one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        OriginalValue - Returns the value entered by the user, if the user value is similar to the slot value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        TopResolution - If there is a resolution list for the slot, return the first value in the resolution list
     *        as the slot type value. If there is no resolution list, null is returned.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you don't specify the valueSelectionStrategy, the default is OriginalValue.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SlotValueResolutionStrategy
     */

    public SlotValueSelectionSetting withResolutionStrategy(String resolutionStrategy) {
        setResolutionStrategy(resolutionStrategy);
        return this;
    }

    /**
     * <p>
     * Determines the slot resolution strategy that Amazon Lex uses to return slot type values. The field can be set to
     * one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * OriginalValue - Returns the value entered by the user, if the user value is similar to the slot value.
     * </p>
     * </li>
     * <li>
     * <p>
     * TopResolution - If there is a resolution list for the slot, return the first value in the resolution list as the
     * slot type value. If there is no resolution list, null is returned.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't specify the valueSelectionStrategy, the default is OriginalValue.
     * </p>
     * 
     * @param resolutionStrategy
     *        Determines the slot resolution strategy that Amazon Lex uses to return slot type values. The field can be
     *        set to one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        OriginalValue - Returns the value entered by the user, if the user value is similar to the slot value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        TopResolution - If there is a resolution list for the slot, return the first value in the resolution list
     *        as the slot type value. If there is no resolution list, null is returned.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you don't specify the valueSelectionStrategy, the default is OriginalValue.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SlotValueResolutionStrategy
     */

    public SlotValueSelectionSetting withResolutionStrategy(SlotValueResolutionStrategy resolutionStrategy) {
        this.resolutionStrategy = resolutionStrategy.toString();
        return this;
    }

    /**
     * <p>
     * A regular expression used to validate the value of a slot.
     * </p>
     * 
     * @param regexFilter
     *        A regular expression used to validate the value of a slot.
     */

    public void setRegexFilter(SlotValueRegexFilter regexFilter) {
        this.regexFilter = regexFilter;
    }

    /**
     * <p>
     * A regular expression used to validate the value of a slot.
     * </p>
     * 
     * @return A regular expression used to validate the value of a slot.
     */

    public SlotValueRegexFilter getRegexFilter() {
        return this.regexFilter;
    }

    /**
     * <p>
     * A regular expression used to validate the value of a slot.
     * </p>
     * 
     * @param regexFilter
     *        A regular expression used to validate the value of a slot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SlotValueSelectionSetting withRegexFilter(SlotValueRegexFilter regexFilter) {
        setRegexFilter(regexFilter);
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
        if (getResolutionStrategy() != null)
            sb.append("ResolutionStrategy: ").append(getResolutionStrategy()).append(",");
        if (getRegexFilter() != null)
            sb.append("RegexFilter: ").append(getRegexFilter());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SlotValueSelectionSetting == false)
            return false;
        SlotValueSelectionSetting other = (SlotValueSelectionSetting) obj;
        if (other.getResolutionStrategy() == null ^ this.getResolutionStrategy() == null)
            return false;
        if (other.getResolutionStrategy() != null && other.getResolutionStrategy().equals(this.getResolutionStrategy()) == false)
            return false;
        if (other.getRegexFilter() == null ^ this.getRegexFilter() == null)
            return false;
        if (other.getRegexFilter() != null && other.getRegexFilter().equals(this.getRegexFilter()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResolutionStrategy() == null) ? 0 : getResolutionStrategy().hashCode());
        hashCode = prime * hashCode + ((getRegexFilter() == null) ? 0 : getRegexFilter().hashCode());
        return hashCode;
    }

    @Override
    public SlotValueSelectionSetting clone() {
        try {
            return (SlotValueSelectionSetting) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.SlotValueSelectionSettingMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
