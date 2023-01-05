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
 * The option that determines the text display weight, or boldness.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/FontWeight" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FontWeight implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The lexical name for the level of boldness of the text display.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The lexical name for the level of boldness of the text display.
     * </p>
     * 
     * @param name
     *        The lexical name for the level of boldness of the text display.
     * @see FontWeightName
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The lexical name for the level of boldness of the text display.
     * </p>
     * 
     * @return The lexical name for the level of boldness of the text display.
     * @see FontWeightName
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The lexical name for the level of boldness of the text display.
     * </p>
     * 
     * @param name
     *        The lexical name for the level of boldness of the text display.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FontWeightName
     */

    public FontWeight withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The lexical name for the level of boldness of the text display.
     * </p>
     * 
     * @param name
     *        The lexical name for the level of boldness of the text display.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FontWeightName
     */

    public FontWeight withName(FontWeightName name) {
        this.name = name.toString();
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
        if (getName() != null)
            sb.append("Name: ").append(getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FontWeight == false)
            return false;
        FontWeight other = (FontWeight) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public FontWeight clone() {
        try {
            return (FontWeight) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.FontWeightMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
