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
package com.amazonaws.services.pinpointsmsvoicev2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Validation rules for a select field.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/SelectValidation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SelectValidation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The minimum number of choices for the select.
     * </p>
     */
    private Integer minChoices;
    /**
     * <p>
     * The maximum number of choices for the select.
     * </p>
     */
    private Integer maxChoices;
    /**
     * <p>
     * An array of strings for the possible selection options.
     * </p>
     */
    private java.util.List<String> options;

    /**
     * <p>
     * The minimum number of choices for the select.
     * </p>
     * 
     * @param minChoices
     *        The minimum number of choices for the select.
     */

    public void setMinChoices(Integer minChoices) {
        this.minChoices = minChoices;
    }

    /**
     * <p>
     * The minimum number of choices for the select.
     * </p>
     * 
     * @return The minimum number of choices for the select.
     */

    public Integer getMinChoices() {
        return this.minChoices;
    }

    /**
     * <p>
     * The minimum number of choices for the select.
     * </p>
     * 
     * @param minChoices
     *        The minimum number of choices for the select.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SelectValidation withMinChoices(Integer minChoices) {
        setMinChoices(minChoices);
        return this;
    }

    /**
     * <p>
     * The maximum number of choices for the select.
     * </p>
     * 
     * @param maxChoices
     *        The maximum number of choices for the select.
     */

    public void setMaxChoices(Integer maxChoices) {
        this.maxChoices = maxChoices;
    }

    /**
     * <p>
     * The maximum number of choices for the select.
     * </p>
     * 
     * @return The maximum number of choices for the select.
     */

    public Integer getMaxChoices() {
        return this.maxChoices;
    }

    /**
     * <p>
     * The maximum number of choices for the select.
     * </p>
     * 
     * @param maxChoices
     *        The maximum number of choices for the select.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SelectValidation withMaxChoices(Integer maxChoices) {
        setMaxChoices(maxChoices);
        return this;
    }

    /**
     * <p>
     * An array of strings for the possible selection options.
     * </p>
     * 
     * @return An array of strings for the possible selection options.
     */

    public java.util.List<String> getOptions() {
        return options;
    }

    /**
     * <p>
     * An array of strings for the possible selection options.
     * </p>
     * 
     * @param options
     *        An array of strings for the possible selection options.
     */

    public void setOptions(java.util.Collection<String> options) {
        if (options == null) {
            this.options = null;
            return;
        }

        this.options = new java.util.ArrayList<String>(options);
    }

    /**
     * <p>
     * An array of strings for the possible selection options.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOptions(java.util.Collection)} or {@link #withOptions(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param options
     *        An array of strings for the possible selection options.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SelectValidation withOptions(String... options) {
        if (this.options == null) {
            setOptions(new java.util.ArrayList<String>(options.length));
        }
        for (String ele : options) {
            this.options.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of strings for the possible selection options.
     * </p>
     * 
     * @param options
     *        An array of strings for the possible selection options.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SelectValidation withOptions(java.util.Collection<String> options) {
        setOptions(options);
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
        if (getMinChoices() != null)
            sb.append("MinChoices: ").append(getMinChoices()).append(",");
        if (getMaxChoices() != null)
            sb.append("MaxChoices: ").append(getMaxChoices()).append(",");
        if (getOptions() != null)
            sb.append("Options: ").append(getOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SelectValidation == false)
            return false;
        SelectValidation other = (SelectValidation) obj;
        if (other.getMinChoices() == null ^ this.getMinChoices() == null)
            return false;
        if (other.getMinChoices() != null && other.getMinChoices().equals(this.getMinChoices()) == false)
            return false;
        if (other.getMaxChoices() == null ^ this.getMaxChoices() == null)
            return false;
        if (other.getMaxChoices() != null && other.getMaxChoices().equals(this.getMaxChoices()) == false)
            return false;
        if (other.getOptions() == null ^ this.getOptions() == null)
            return false;
        if (other.getOptions() != null && other.getOptions().equals(this.getOptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMinChoices() == null) ? 0 : getMinChoices().hashCode());
        hashCode = prime * hashCode + ((getMaxChoices() == null) ? 0 : getMaxChoices().hashCode());
        hashCode = prime * hashCode + ((getOptions() == null) ? 0 : getOptions().hashCode());
        return hashCode;
    }

    @Override
    public SelectValidation clone() {
        try {
            return (SelectValidation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpointsmsvoicev2.model.transform.SelectValidationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
