/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The dataset used for testing. Optionally, if <code>AutoCreate</code> is set, Amazon Rekognition Custom Labels creates
 * a testing dataset using an 80/20 split of the training dataset.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TestingData implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The assets used for testing.
     * </p>
     */
    private java.util.List<Asset> assets;
    /**
     * <p>
     * If specified, Amazon Rekognition Custom Labels creates a testing dataset with an 80/20 split of the training
     * dataset.
     * </p>
     */
    private Boolean autoCreate;

    /**
     * <p>
     * The assets used for testing.
     * </p>
     * 
     * @return The assets used for testing.
     */

    public java.util.List<Asset> getAssets() {
        return assets;
    }

    /**
     * <p>
     * The assets used for testing.
     * </p>
     * 
     * @param assets
     *        The assets used for testing.
     */

    public void setAssets(java.util.Collection<Asset> assets) {
        if (assets == null) {
            this.assets = null;
            return;
        }

        this.assets = new java.util.ArrayList<Asset>(assets);
    }

    /**
     * <p>
     * The assets used for testing.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAssets(java.util.Collection)} or {@link #withAssets(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param assets
     *        The assets used for testing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestingData withAssets(Asset... assets) {
        if (this.assets == null) {
            setAssets(new java.util.ArrayList<Asset>(assets.length));
        }
        for (Asset ele : assets) {
            this.assets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The assets used for testing.
     * </p>
     * 
     * @param assets
     *        The assets used for testing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestingData withAssets(java.util.Collection<Asset> assets) {
        setAssets(assets);
        return this;
    }

    /**
     * <p>
     * If specified, Amazon Rekognition Custom Labels creates a testing dataset with an 80/20 split of the training
     * dataset.
     * </p>
     * 
     * @param autoCreate
     *        If specified, Amazon Rekognition Custom Labels creates a testing dataset with an 80/20 split of the
     *        training dataset.
     */

    public void setAutoCreate(Boolean autoCreate) {
        this.autoCreate = autoCreate;
    }

    /**
     * <p>
     * If specified, Amazon Rekognition Custom Labels creates a testing dataset with an 80/20 split of the training
     * dataset.
     * </p>
     * 
     * @return If specified, Amazon Rekognition Custom Labels creates a testing dataset with an 80/20 split of the
     *         training dataset.
     */

    public Boolean getAutoCreate() {
        return this.autoCreate;
    }

    /**
     * <p>
     * If specified, Amazon Rekognition Custom Labels creates a testing dataset with an 80/20 split of the training
     * dataset.
     * </p>
     * 
     * @param autoCreate
     *        If specified, Amazon Rekognition Custom Labels creates a testing dataset with an 80/20 split of the
     *        training dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestingData withAutoCreate(Boolean autoCreate) {
        setAutoCreate(autoCreate);
        return this;
    }

    /**
     * <p>
     * If specified, Amazon Rekognition Custom Labels creates a testing dataset with an 80/20 split of the training
     * dataset.
     * </p>
     * 
     * @return If specified, Amazon Rekognition Custom Labels creates a testing dataset with an 80/20 split of the
     *         training dataset.
     */

    public Boolean isAutoCreate() {
        return this.autoCreate;
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
        if (getAssets() != null)
            sb.append("Assets: ").append(getAssets()).append(",");
        if (getAutoCreate() != null)
            sb.append("AutoCreate: ").append(getAutoCreate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TestingData == false)
            return false;
        TestingData other = (TestingData) obj;
        if (other.getAssets() == null ^ this.getAssets() == null)
            return false;
        if (other.getAssets() != null && other.getAssets().equals(this.getAssets()) == false)
            return false;
        if (other.getAutoCreate() == null ^ this.getAutoCreate() == null)
            return false;
        if (other.getAutoCreate() != null && other.getAutoCreate().equals(this.getAutoCreate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssets() == null) ? 0 : getAssets().hashCode());
        hashCode = prime * hashCode + ((getAutoCreate() == null) ? 0 : getAutoCreate().hashCode());
        return hashCode;
    }

    @Override
    public TestingData clone() {
        try {
            return (TestingData) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.rekognition.model.transform.TestingDataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
