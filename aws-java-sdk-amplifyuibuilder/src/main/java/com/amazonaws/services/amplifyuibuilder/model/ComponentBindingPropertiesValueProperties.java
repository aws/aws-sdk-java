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
package com.amazonaws.services.amplifyuibuilder.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents the data binding configuration for a specific property using data stored in Amazon Web Services. For
 * Amazon Web Services connected properties, you can bind a property to data stored in an Amazon S3 bucket, an Amplify
 * DataStore model or an authenticated user attribute.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/amplifyuibuilder-2021-08-11/ComponentBindingPropertiesValueProperties"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ComponentBindingPropertiesValueProperties implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An Amazon S3 bucket.
     * </p>
     */
    private String bucket;
    /**
     * <p>
     * The default value to assign to the property.
     * </p>
     */
    private String defaultValue;
    /**
     * <p>
     * The field to bind the data to.
     * </p>
     */
    private String field;
    /**
     * <p>
     * The storage key for an Amazon S3 bucket.
     * </p>
     */
    private String key;
    /**
     * <p>
     * An Amplify DataStore model.
     * </p>
     */
    private String model;
    /**
     * <p>
     * A list of predicates for binding a component's properties to data.
     * </p>
     */
    private java.util.List<Predicate> predicates;
    /**
     * <p>
     * The name of a component slot.
     * </p>
     */
    private String slotName;
    /**
     * <p>
     * An authenticated user attribute.
     * </p>
     */
    private String userAttribute;

    /**
     * <p>
     * An Amazon S3 bucket.
     * </p>
     * 
     * @param bucket
     *        An Amazon S3 bucket.
     */

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * <p>
     * An Amazon S3 bucket.
     * </p>
     * 
     * @return An Amazon S3 bucket.
     */

    public String getBucket() {
        return this.bucket;
    }

    /**
     * <p>
     * An Amazon S3 bucket.
     * </p>
     * 
     * @param bucket
     *        An Amazon S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentBindingPropertiesValueProperties withBucket(String bucket) {
        setBucket(bucket);
        return this;
    }

    /**
     * <p>
     * The default value to assign to the property.
     * </p>
     * 
     * @param defaultValue
     *        The default value to assign to the property.
     */

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    /**
     * <p>
     * The default value to assign to the property.
     * </p>
     * 
     * @return The default value to assign to the property.
     */

    public String getDefaultValue() {
        return this.defaultValue;
    }

    /**
     * <p>
     * The default value to assign to the property.
     * </p>
     * 
     * @param defaultValue
     *        The default value to assign to the property.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentBindingPropertiesValueProperties withDefaultValue(String defaultValue) {
        setDefaultValue(defaultValue);
        return this;
    }

    /**
     * <p>
     * The field to bind the data to.
     * </p>
     * 
     * @param field
     *        The field to bind the data to.
     */

    public void setField(String field) {
        this.field = field;
    }

    /**
     * <p>
     * The field to bind the data to.
     * </p>
     * 
     * @return The field to bind the data to.
     */

    public String getField() {
        return this.field;
    }

    /**
     * <p>
     * The field to bind the data to.
     * </p>
     * 
     * @param field
     *        The field to bind the data to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentBindingPropertiesValueProperties withField(String field) {
        setField(field);
        return this;
    }

    /**
     * <p>
     * The storage key for an Amazon S3 bucket.
     * </p>
     * 
     * @param key
     *        The storage key for an Amazon S3 bucket.
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The storage key for an Amazon S3 bucket.
     * </p>
     * 
     * @return The storage key for an Amazon S3 bucket.
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * The storage key for an Amazon S3 bucket.
     * </p>
     * 
     * @param key
     *        The storage key for an Amazon S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentBindingPropertiesValueProperties withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * An Amplify DataStore model.
     * </p>
     * 
     * @param model
     *        An Amplify DataStore model.
     */

    public void setModel(String model) {
        this.model = model;
    }

    /**
     * <p>
     * An Amplify DataStore model.
     * </p>
     * 
     * @return An Amplify DataStore model.
     */

    public String getModel() {
        return this.model;
    }

    /**
     * <p>
     * An Amplify DataStore model.
     * </p>
     * 
     * @param model
     *        An Amplify DataStore model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentBindingPropertiesValueProperties withModel(String model) {
        setModel(model);
        return this;
    }

    /**
     * <p>
     * A list of predicates for binding a component's properties to data.
     * </p>
     * 
     * @return A list of predicates for binding a component's properties to data.
     */

    public java.util.List<Predicate> getPredicates() {
        return predicates;
    }

    /**
     * <p>
     * A list of predicates for binding a component's properties to data.
     * </p>
     * 
     * @param predicates
     *        A list of predicates for binding a component's properties to data.
     */

    public void setPredicates(java.util.Collection<Predicate> predicates) {
        if (predicates == null) {
            this.predicates = null;
            return;
        }

        this.predicates = new java.util.ArrayList<Predicate>(predicates);
    }

    /**
     * <p>
     * A list of predicates for binding a component's properties to data.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPredicates(java.util.Collection)} or {@link #withPredicates(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param predicates
     *        A list of predicates for binding a component's properties to data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentBindingPropertiesValueProperties withPredicates(Predicate... predicates) {
        if (this.predicates == null) {
            setPredicates(new java.util.ArrayList<Predicate>(predicates.length));
        }
        for (Predicate ele : predicates) {
            this.predicates.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of predicates for binding a component's properties to data.
     * </p>
     * 
     * @param predicates
     *        A list of predicates for binding a component's properties to data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentBindingPropertiesValueProperties withPredicates(java.util.Collection<Predicate> predicates) {
        setPredicates(predicates);
        return this;
    }

    /**
     * <p>
     * The name of a component slot.
     * </p>
     * 
     * @param slotName
     *        The name of a component slot.
     */

    public void setSlotName(String slotName) {
        this.slotName = slotName;
    }

    /**
     * <p>
     * The name of a component slot.
     * </p>
     * 
     * @return The name of a component slot.
     */

    public String getSlotName() {
        return this.slotName;
    }

    /**
     * <p>
     * The name of a component slot.
     * </p>
     * 
     * @param slotName
     *        The name of a component slot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentBindingPropertiesValueProperties withSlotName(String slotName) {
        setSlotName(slotName);
        return this;
    }

    /**
     * <p>
     * An authenticated user attribute.
     * </p>
     * 
     * @param userAttribute
     *        An authenticated user attribute.
     */

    public void setUserAttribute(String userAttribute) {
        this.userAttribute = userAttribute;
    }

    /**
     * <p>
     * An authenticated user attribute.
     * </p>
     * 
     * @return An authenticated user attribute.
     */

    public String getUserAttribute() {
        return this.userAttribute;
    }

    /**
     * <p>
     * An authenticated user attribute.
     * </p>
     * 
     * @param userAttribute
     *        An authenticated user attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentBindingPropertiesValueProperties withUserAttribute(String userAttribute) {
        setUserAttribute(userAttribute);
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
        if (getBucket() != null)
            sb.append("Bucket: ").append(getBucket()).append(",");
        if (getDefaultValue() != null)
            sb.append("DefaultValue: ").append(getDefaultValue()).append(",");
        if (getField() != null)
            sb.append("Field: ").append(getField()).append(",");
        if (getKey() != null)
            sb.append("Key: ").append(getKey()).append(",");
        if (getModel() != null)
            sb.append("Model: ").append(getModel()).append(",");
        if (getPredicates() != null)
            sb.append("Predicates: ").append(getPredicates()).append(",");
        if (getSlotName() != null)
            sb.append("SlotName: ").append(getSlotName()).append(",");
        if (getUserAttribute() != null)
            sb.append("UserAttribute: ").append(getUserAttribute());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ComponentBindingPropertiesValueProperties == false)
            return false;
        ComponentBindingPropertiesValueProperties other = (ComponentBindingPropertiesValueProperties) obj;
        if (other.getBucket() == null ^ this.getBucket() == null)
            return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false)
            return false;
        if (other.getDefaultValue() == null ^ this.getDefaultValue() == null)
            return false;
        if (other.getDefaultValue() != null && other.getDefaultValue().equals(this.getDefaultValue()) == false)
            return false;
        if (other.getField() == null ^ this.getField() == null)
            return false;
        if (other.getField() != null && other.getField().equals(this.getField()) == false)
            return false;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getModel() == null ^ this.getModel() == null)
            return false;
        if (other.getModel() != null && other.getModel().equals(this.getModel()) == false)
            return false;
        if (other.getPredicates() == null ^ this.getPredicates() == null)
            return false;
        if (other.getPredicates() != null && other.getPredicates().equals(this.getPredicates()) == false)
            return false;
        if (other.getSlotName() == null ^ this.getSlotName() == null)
            return false;
        if (other.getSlotName() != null && other.getSlotName().equals(this.getSlotName()) == false)
            return false;
        if (other.getUserAttribute() == null ^ this.getUserAttribute() == null)
            return false;
        if (other.getUserAttribute() != null && other.getUserAttribute().equals(this.getUserAttribute()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucket() == null) ? 0 : getBucket().hashCode());
        hashCode = prime * hashCode + ((getDefaultValue() == null) ? 0 : getDefaultValue().hashCode());
        hashCode = prime * hashCode + ((getField() == null) ? 0 : getField().hashCode());
        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getModel() == null) ? 0 : getModel().hashCode());
        hashCode = prime * hashCode + ((getPredicates() == null) ? 0 : getPredicates().hashCode());
        hashCode = prime * hashCode + ((getSlotName() == null) ? 0 : getSlotName().hashCode());
        hashCode = prime * hashCode + ((getUserAttribute() == null) ? 0 : getUserAttribute().hashCode());
        return hashCode;
    }

    @Override
    public ComponentBindingPropertiesValueProperties clone() {
        try {
            return (ComponentBindingPropertiesValueProperties) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.amplifyuibuilder.model.transform.ComponentBindingPropertiesValuePropertiesMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
