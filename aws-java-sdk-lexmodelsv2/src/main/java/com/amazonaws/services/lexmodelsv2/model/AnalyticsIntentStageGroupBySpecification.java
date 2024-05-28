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
package com.amazonaws.services.lexmodelsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains the category by which to group the intent stages.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/AnalyticsIntentStageGroupBySpecification"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AnalyticsIntentStageGroupBySpecification implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies whether to group the intent stages by their name or the intent to which the session was switched.
     * </p>
     */
    private String name;

    /**
     * <p>
     * Specifies whether to group the intent stages by their name or the intent to which the session was switched.
     * </p>
     * 
     * @param name
     *        Specifies whether to group the intent stages by their name or the intent to which the session was
     *        switched.
     * @see AnalyticsIntentStageField
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Specifies whether to group the intent stages by their name or the intent to which the session was switched.
     * </p>
     * 
     * @return Specifies whether to group the intent stages by their name or the intent to which the session was
     *         switched.
     * @see AnalyticsIntentStageField
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Specifies whether to group the intent stages by their name or the intent to which the session was switched.
     * </p>
     * 
     * @param name
     *        Specifies whether to group the intent stages by their name or the intent to which the session was
     *        switched.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AnalyticsIntentStageField
     */

    public AnalyticsIntentStageGroupBySpecification withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Specifies whether to group the intent stages by their name or the intent to which the session was switched.
     * </p>
     * 
     * @param name
     *        Specifies whether to group the intent stages by their name or the intent to which the session was
     *        switched.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AnalyticsIntentStageField
     */

    public AnalyticsIntentStageGroupBySpecification withName(AnalyticsIntentStageField name) {
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

        if (obj instanceof AnalyticsIntentStageGroupBySpecification == false)
            return false;
        AnalyticsIntentStageGroupBySpecification other = (AnalyticsIntentStageGroupBySpecification) obj;
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
    public AnalyticsIntentStageGroupBySpecification clone() {
        try {
            return (AnalyticsIntentStageGroupBySpecification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.AnalyticsIntentStageGroupBySpecificationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
