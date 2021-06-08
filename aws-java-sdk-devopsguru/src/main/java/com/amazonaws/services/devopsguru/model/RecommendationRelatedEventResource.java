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
package com.amazonaws.services.devopsguru.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about an AWS resource that emitted and event that is related to a recommendation in an insight.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/RecommendationRelatedEventResource"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RecommendationRelatedEventResource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the resource that emitted the event. This corresponds to the <code>Name</code> field in an
     * <code>EventResource</code> object.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The type of the resource that emitted the event. This corresponds to the <code>Type</code> field in an
     * <code>EventResource</code> object.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The name of the resource that emitted the event. This corresponds to the <code>Name</code> field in an
     * <code>EventResource</code> object.
     * </p>
     * 
     * @param name
     *        The name of the resource that emitted the event. This corresponds to the <code>Name</code> field in an
     *        <code>EventResource</code> object.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the resource that emitted the event. This corresponds to the <code>Name</code> field in an
     * <code>EventResource</code> object.
     * </p>
     * 
     * @return The name of the resource that emitted the event. This corresponds to the <code>Name</code> field in an
     *         <code>EventResource</code> object.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the resource that emitted the event. This corresponds to the <code>Name</code> field in an
     * <code>EventResource</code> object.
     * </p>
     * 
     * @param name
     *        The name of the resource that emitted the event. This corresponds to the <code>Name</code> field in an
     *        <code>EventResource</code> object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationRelatedEventResource withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The type of the resource that emitted the event. This corresponds to the <code>Type</code> field in an
     * <code>EventResource</code> object.
     * </p>
     * 
     * @param type
     *        The type of the resource that emitted the event. This corresponds to the <code>Type</code> field in an
     *        <code>EventResource</code> object.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the resource that emitted the event. This corresponds to the <code>Type</code> field in an
     * <code>EventResource</code> object.
     * </p>
     * 
     * @return The type of the resource that emitted the event. This corresponds to the <code>Type</code> field in an
     *         <code>EventResource</code> object.
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the resource that emitted the event. This corresponds to the <code>Type</code> field in an
     * <code>EventResource</code> object.
     * </p>
     * 
     * @param type
     *        The type of the resource that emitted the event. This corresponds to the <code>Type</code> field in an
     *        <code>EventResource</code> object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationRelatedEventResource withType(String type) {
        setType(type);
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
            sb.append("Name: ").append(getName()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RecommendationRelatedEventResource == false)
            return false;
        RecommendationRelatedEventResource other = (RecommendationRelatedEventResource) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public RecommendationRelatedEventResource clone() {
        try {
            return (RecommendationRelatedEventResource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.devopsguru.model.transform.RecommendationRelatedEventResourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
