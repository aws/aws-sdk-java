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
package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains the Amazon S3 bucket location of the validation data for a model training job.
 * </p>
 * <p>
 * The validation data includes error information for individual JSON lines in the dataset. For more information, see
 * Debugging a Failed Model Training in the Amazon Rekognition Custom Labels Developer Guide.
 * </p>
 * <p>
 * You get the <code>ValidationData</code> object for the training dataset (<a>TrainingDataResult</a>) and the test
 * dataset (<a>TestingDataResult</a>) by calling <a>DescribeProjectVersions</a>.
 * </p>
 * <p>
 * The assets array contains a single <a>Asset</a> object. The <a>GroundTruthManifest</a> field of the Asset object
 * contains the S3 bucket location of the validation data.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ValidationData implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The assets that comprise the validation data.
     * </p>
     */
    private java.util.List<Asset> assets;

    /**
     * <p>
     * The assets that comprise the validation data.
     * </p>
     * 
     * @return The assets that comprise the validation data.
     */

    public java.util.List<Asset> getAssets() {
        return assets;
    }

    /**
     * <p>
     * The assets that comprise the validation data.
     * </p>
     * 
     * @param assets
     *        The assets that comprise the validation data.
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
     * The assets that comprise the validation data.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAssets(java.util.Collection)} or {@link #withAssets(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param assets
     *        The assets that comprise the validation data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidationData withAssets(Asset... assets) {
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
     * The assets that comprise the validation data.
     * </p>
     * 
     * @param assets
     *        The assets that comprise the validation data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidationData withAssets(java.util.Collection<Asset> assets) {
        setAssets(assets);
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
        if (getAssets() != null)
            sb.append("Assets: ").append(getAssets());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ValidationData == false)
            return false;
        ValidationData other = (ValidationData) obj;
        if (other.getAssets() == null ^ this.getAssets() == null)
            return false;
        if (other.getAssets() != null && other.getAssets().equals(this.getAssets()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssets() == null) ? 0 : getAssets().hashCode());
        return hashCode;
    }

    @Override
    public ValidationData clone() {
        try {
            return (ValidationData) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.rekognition.model.transform.ValidationDataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
