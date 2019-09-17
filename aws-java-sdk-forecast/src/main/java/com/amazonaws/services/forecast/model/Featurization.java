/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.forecast.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides featurization (transformation) information for a dataset field. This object is part of the
 * <a>FeaturizationConfig</a> object.
 * </p>
 * <p>
 * For example:
 * </p>
 * <p>
 * <code>{</code>
 * </p>
 * <p>
 * <code>"AttributeName": "demand",</code>
 * </p>
 * <p>
 * <code>FeaturizationPipeline [ {</code>
 * </p>
 * <p>
 * <code>"FeaturizationMethodName": "filling",</code>
 * </p>
 * <p>
 * <code>"FeaturizationMethodParameters": {"aggregation": "avg", "backfill": "nan"}</code>
 * </p>
 * <p>
 * <code>} ]</code>
 * </p>
 * <p>
 * <code>}</code>
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/Featurization" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Featurization implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the schema attribute specifying the data field to be featurized. In this release, only the
     * <code>target</code> field of the <code>TARGET_TIME_SERIES</code> dataset type is supported. For example, for the
     * <code>RETAIL</code> domain, the target is <code>demand</code>, and for the <code>CUSTOM</code> domain, the target
     * is <code>target_value</code>.
     * </p>
     */
    private String attributeName;
    /**
     * <p>
     * An array <code>FeaturizationMethod</code> objects that specifies the feature transformation methods. For this
     * release, the number of methods is limited to one.
     * </p>
     */
    private java.util.List<FeaturizationMethod> featurizationPipeline;

    /**
     * <p>
     * The name of the schema attribute specifying the data field to be featurized. In this release, only the
     * <code>target</code> field of the <code>TARGET_TIME_SERIES</code> dataset type is supported. For example, for the
     * <code>RETAIL</code> domain, the target is <code>demand</code>, and for the <code>CUSTOM</code> domain, the target
     * is <code>target_value</code>.
     * </p>
     * 
     * @param attributeName
     *        The name of the schema attribute specifying the data field to be featurized. In this release, only the
     *        <code>target</code> field of the <code>TARGET_TIME_SERIES</code> dataset type is supported. For example,
     *        for the <code>RETAIL</code> domain, the target is <code>demand</code>, and for the <code>CUSTOM</code>
     *        domain, the target is <code>target_value</code>.
     */

    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }

    /**
     * <p>
     * The name of the schema attribute specifying the data field to be featurized. In this release, only the
     * <code>target</code> field of the <code>TARGET_TIME_SERIES</code> dataset type is supported. For example, for the
     * <code>RETAIL</code> domain, the target is <code>demand</code>, and for the <code>CUSTOM</code> domain, the target
     * is <code>target_value</code>.
     * </p>
     * 
     * @return The name of the schema attribute specifying the data field to be featurized. In this release, only the
     *         <code>target</code> field of the <code>TARGET_TIME_SERIES</code> dataset type is supported. For example,
     *         for the <code>RETAIL</code> domain, the target is <code>demand</code>, and for the <code>CUSTOM</code>
     *         domain, the target is <code>target_value</code>.
     */

    public String getAttributeName() {
        return this.attributeName;
    }

    /**
     * <p>
     * The name of the schema attribute specifying the data field to be featurized. In this release, only the
     * <code>target</code> field of the <code>TARGET_TIME_SERIES</code> dataset type is supported. For example, for the
     * <code>RETAIL</code> domain, the target is <code>demand</code>, and for the <code>CUSTOM</code> domain, the target
     * is <code>target_value</code>.
     * </p>
     * 
     * @param attributeName
     *        The name of the schema attribute specifying the data field to be featurized. In this release, only the
     *        <code>target</code> field of the <code>TARGET_TIME_SERIES</code> dataset type is supported. For example,
     *        for the <code>RETAIL</code> domain, the target is <code>demand</code>, and for the <code>CUSTOM</code>
     *        domain, the target is <code>target_value</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Featurization withAttributeName(String attributeName) {
        setAttributeName(attributeName);
        return this;
    }

    /**
     * <p>
     * An array <code>FeaturizationMethod</code> objects that specifies the feature transformation methods. For this
     * release, the number of methods is limited to one.
     * </p>
     * 
     * @return An array <code>FeaturizationMethod</code> objects that specifies the feature transformation methods. For
     *         this release, the number of methods is limited to one.
     */

    public java.util.List<FeaturizationMethod> getFeaturizationPipeline() {
        return featurizationPipeline;
    }

    /**
     * <p>
     * An array <code>FeaturizationMethod</code> objects that specifies the feature transformation methods. For this
     * release, the number of methods is limited to one.
     * </p>
     * 
     * @param featurizationPipeline
     *        An array <code>FeaturizationMethod</code> objects that specifies the feature transformation methods. For
     *        this release, the number of methods is limited to one.
     */

    public void setFeaturizationPipeline(java.util.Collection<FeaturizationMethod> featurizationPipeline) {
        if (featurizationPipeline == null) {
            this.featurizationPipeline = null;
            return;
        }

        this.featurizationPipeline = new java.util.ArrayList<FeaturizationMethod>(featurizationPipeline);
    }

    /**
     * <p>
     * An array <code>FeaturizationMethod</code> objects that specifies the feature transformation methods. For this
     * release, the number of methods is limited to one.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFeaturizationPipeline(java.util.Collection)} or
     * {@link #withFeaturizationPipeline(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param featurizationPipeline
     *        An array <code>FeaturizationMethod</code> objects that specifies the feature transformation methods. For
     *        this release, the number of methods is limited to one.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Featurization withFeaturizationPipeline(FeaturizationMethod... featurizationPipeline) {
        if (this.featurizationPipeline == null) {
            setFeaturizationPipeline(new java.util.ArrayList<FeaturizationMethod>(featurizationPipeline.length));
        }
        for (FeaturizationMethod ele : featurizationPipeline) {
            this.featurizationPipeline.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array <code>FeaturizationMethod</code> objects that specifies the feature transformation methods. For this
     * release, the number of methods is limited to one.
     * </p>
     * 
     * @param featurizationPipeline
     *        An array <code>FeaturizationMethod</code> objects that specifies the feature transformation methods. For
     *        this release, the number of methods is limited to one.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Featurization withFeaturizationPipeline(java.util.Collection<FeaturizationMethod> featurizationPipeline) {
        setFeaturizationPipeline(featurizationPipeline);
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
        if (getAttributeName() != null)
            sb.append("AttributeName: ").append(getAttributeName()).append(",");
        if (getFeaturizationPipeline() != null)
            sb.append("FeaturizationPipeline: ").append(getFeaturizationPipeline());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Featurization == false)
            return false;
        Featurization other = (Featurization) obj;
        if (other.getAttributeName() == null ^ this.getAttributeName() == null)
            return false;
        if (other.getAttributeName() != null && other.getAttributeName().equals(this.getAttributeName()) == false)
            return false;
        if (other.getFeaturizationPipeline() == null ^ this.getFeaturizationPipeline() == null)
            return false;
        if (other.getFeaturizationPipeline() != null && other.getFeaturizationPipeline().equals(this.getFeaturizationPipeline()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttributeName() == null) ? 0 : getAttributeName().hashCode());
        hashCode = prime * hashCode + ((getFeaturizationPipeline() == null) ? 0 : getFeaturizationPipeline().hashCode());
        return hashCode;
    }

    @Override
    public Featurization clone() {
        try {
            return (Featurization) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.forecast.model.transform.FeaturizationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
