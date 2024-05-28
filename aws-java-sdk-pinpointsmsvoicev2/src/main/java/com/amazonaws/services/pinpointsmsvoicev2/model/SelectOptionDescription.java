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
 * A description of each select option.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/SelectOptionDescription"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SelectOptionDescription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The value of the option.
     * </p>
     */
    private String option;
    /**
     * <p>
     * The title of the select option.
     * </p>
     */
    private String title;
    /**
     * <p>
     * A description of the option meaning.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The value of the option.
     * </p>
     * 
     * @param option
     *        The value of the option.
     */

    public void setOption(String option) {
        this.option = option;
    }

    /**
     * <p>
     * The value of the option.
     * </p>
     * 
     * @return The value of the option.
     */

    public String getOption() {
        return this.option;
    }

    /**
     * <p>
     * The value of the option.
     * </p>
     * 
     * @param option
     *        The value of the option.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SelectOptionDescription withOption(String option) {
        setOption(option);
        return this;
    }

    /**
     * <p>
     * The title of the select option.
     * </p>
     * 
     * @param title
     *        The title of the select option.
     */

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * <p>
     * The title of the select option.
     * </p>
     * 
     * @return The title of the select option.
     */

    public String getTitle() {
        return this.title;
    }

    /**
     * <p>
     * The title of the select option.
     * </p>
     * 
     * @param title
     *        The title of the select option.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SelectOptionDescription withTitle(String title) {
        setTitle(title);
        return this;
    }

    /**
     * <p>
     * A description of the option meaning.
     * </p>
     * 
     * @param description
     *        A description of the option meaning.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the option meaning.
     * </p>
     * 
     * @return A description of the option meaning.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the option meaning.
     * </p>
     * 
     * @param description
     *        A description of the option meaning.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SelectOptionDescription withDescription(String description) {
        setDescription(description);
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
        if (getOption() != null)
            sb.append("Option: ").append(getOption()).append(",");
        if (getTitle() != null)
            sb.append("Title: ").append(getTitle()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SelectOptionDescription == false)
            return false;
        SelectOptionDescription other = (SelectOptionDescription) obj;
        if (other.getOption() == null ^ this.getOption() == null)
            return false;
        if (other.getOption() != null && other.getOption().equals(this.getOption()) == false)
            return false;
        if (other.getTitle() == null ^ this.getTitle() == null)
            return false;
        if (other.getTitle() != null && other.getTitle().equals(this.getTitle()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOption() == null) ? 0 : getOption().hashCode());
        hashCode = prime * hashCode + ((getTitle() == null) ? 0 : getTitle().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public SelectOptionDescription clone() {
        try {
            return (SelectOptionDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpointsmsvoicev2.model.transform.SelectOptionDescriptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
