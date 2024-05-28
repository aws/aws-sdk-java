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
package com.amazonaws.services.customerprofiles.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/DetectProfileObjectType"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DetectProfileObjectTypeResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Detected <code>ProfileObjectType</code> mappings from given objects. A maximum of one mapping is supported.
     * </p>
     */
    private java.util.List<DetectedProfileObjectType> detectedProfileObjectTypes;

    /**
     * <p>
     * Detected <code>ProfileObjectType</code> mappings from given objects. A maximum of one mapping is supported.
     * </p>
     * 
     * @return Detected <code>ProfileObjectType</code> mappings from given objects. A maximum of one mapping is
     *         supported.
     */

    public java.util.List<DetectedProfileObjectType> getDetectedProfileObjectTypes() {
        return detectedProfileObjectTypes;
    }

    /**
     * <p>
     * Detected <code>ProfileObjectType</code> mappings from given objects. A maximum of one mapping is supported.
     * </p>
     * 
     * @param detectedProfileObjectTypes
     *        Detected <code>ProfileObjectType</code> mappings from given objects. A maximum of one mapping is
     *        supported.
     */

    public void setDetectedProfileObjectTypes(java.util.Collection<DetectedProfileObjectType> detectedProfileObjectTypes) {
        if (detectedProfileObjectTypes == null) {
            this.detectedProfileObjectTypes = null;
            return;
        }

        this.detectedProfileObjectTypes = new java.util.ArrayList<DetectedProfileObjectType>(detectedProfileObjectTypes);
    }

    /**
     * <p>
     * Detected <code>ProfileObjectType</code> mappings from given objects. A maximum of one mapping is supported.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDetectedProfileObjectTypes(java.util.Collection)} or
     * {@link #withDetectedProfileObjectTypes(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param detectedProfileObjectTypes
     *        Detected <code>ProfileObjectType</code> mappings from given objects. A maximum of one mapping is
     *        supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectProfileObjectTypeResult withDetectedProfileObjectTypes(DetectedProfileObjectType... detectedProfileObjectTypes) {
        if (this.detectedProfileObjectTypes == null) {
            setDetectedProfileObjectTypes(new java.util.ArrayList<DetectedProfileObjectType>(detectedProfileObjectTypes.length));
        }
        for (DetectedProfileObjectType ele : detectedProfileObjectTypes) {
            this.detectedProfileObjectTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Detected <code>ProfileObjectType</code> mappings from given objects. A maximum of one mapping is supported.
     * </p>
     * 
     * @param detectedProfileObjectTypes
     *        Detected <code>ProfileObjectType</code> mappings from given objects. A maximum of one mapping is
     *        supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectProfileObjectTypeResult withDetectedProfileObjectTypes(java.util.Collection<DetectedProfileObjectType> detectedProfileObjectTypes) {
        setDetectedProfileObjectTypes(detectedProfileObjectTypes);
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
        if (getDetectedProfileObjectTypes() != null)
            sb.append("DetectedProfileObjectTypes: ").append(getDetectedProfileObjectTypes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DetectProfileObjectTypeResult == false)
            return false;
        DetectProfileObjectTypeResult other = (DetectProfileObjectTypeResult) obj;
        if (other.getDetectedProfileObjectTypes() == null ^ this.getDetectedProfileObjectTypes() == null)
            return false;
        if (other.getDetectedProfileObjectTypes() != null && other.getDetectedProfileObjectTypes().equals(this.getDetectedProfileObjectTypes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDetectedProfileObjectTypes() == null) ? 0 : getDetectedProfileObjectTypes().hashCode());
        return hashCode;
    }

    @Override
    public DetectProfileObjectTypeResult clone() {
        try {
            return (DetectProfileObjectTypeResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
