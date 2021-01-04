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
package com.amazonaws.services.kafka.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/GetCompatibleKafkaVersions" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetCompatibleKafkaVersionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of CompatibleKafkaVersion objects.
     * </p>
     */
    private java.util.List<CompatibleKafkaVersion> compatibleKafkaVersions;

    /**
     * <p>
     * A list of CompatibleKafkaVersion objects.
     * </p>
     * 
     * @return <p>
     *         A list of CompatibleKafkaVersion objects.
     *         </p>
     */

    public java.util.List<CompatibleKafkaVersion> getCompatibleKafkaVersions() {
        return compatibleKafkaVersions;
    }

    /**
     * <p>
     * A list of CompatibleKafkaVersion objects.
     * </p>
     * 
     * @param compatibleKafkaVersions
     *        <p>
     *        A list of CompatibleKafkaVersion objects.
     *        </p>
     */

    public void setCompatibleKafkaVersions(java.util.Collection<CompatibleKafkaVersion> compatibleKafkaVersions) {
        if (compatibleKafkaVersions == null) {
            this.compatibleKafkaVersions = null;
            return;
        }

        this.compatibleKafkaVersions = new java.util.ArrayList<CompatibleKafkaVersion>(compatibleKafkaVersions);
    }

    /**
     * <p>
     * A list of CompatibleKafkaVersion objects.
     * </p>
     * 
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCompatibleKafkaVersions(java.util.Collection)} or
     * {@link #withCompatibleKafkaVersions(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param compatibleKafkaVersions
     *        <p>
     *        A list of CompatibleKafkaVersion objects.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCompatibleKafkaVersionsResult withCompatibleKafkaVersions(CompatibleKafkaVersion... compatibleKafkaVersions) {
        if (this.compatibleKafkaVersions == null) {
            setCompatibleKafkaVersions(new java.util.ArrayList<CompatibleKafkaVersion>(compatibleKafkaVersions.length));
        }
        for (CompatibleKafkaVersion ele : compatibleKafkaVersions) {
            this.compatibleKafkaVersions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of CompatibleKafkaVersion objects.
     * </p>
     * 
     * @param compatibleKafkaVersions
     *        <p>
     *        A list of CompatibleKafkaVersion objects.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCompatibleKafkaVersionsResult withCompatibleKafkaVersions(java.util.Collection<CompatibleKafkaVersion> compatibleKafkaVersions) {
        setCompatibleKafkaVersions(compatibleKafkaVersions);
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
        if (getCompatibleKafkaVersions() != null)
            sb.append("CompatibleKafkaVersions: ").append(getCompatibleKafkaVersions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetCompatibleKafkaVersionsResult == false)
            return false;
        GetCompatibleKafkaVersionsResult other = (GetCompatibleKafkaVersionsResult) obj;
        if (other.getCompatibleKafkaVersions() == null ^ this.getCompatibleKafkaVersions() == null)
            return false;
        if (other.getCompatibleKafkaVersions() != null && other.getCompatibleKafkaVersions().equals(this.getCompatibleKafkaVersions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCompatibleKafkaVersions() == null) ? 0 : getCompatibleKafkaVersions().hashCode());
        return hashCode;
    }

    @Override
    public GetCompatibleKafkaVersionsResult clone() {
        try {
            return (GetCompatibleKafkaVersionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
