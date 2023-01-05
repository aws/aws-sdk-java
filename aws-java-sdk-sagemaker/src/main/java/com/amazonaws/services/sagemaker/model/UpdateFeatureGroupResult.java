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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/UpdateFeatureGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateFeatureGroupResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the feature group that you're updating.
     * </p>
     */
    private String featureGroupArn;

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the feature group that you're updating.
     * </p>
     * 
     * @param featureGroupArn
     *        The Amazon Resource Number (ARN) of the feature group that you're updating.
     */

    public void setFeatureGroupArn(String featureGroupArn) {
        this.featureGroupArn = featureGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the feature group that you're updating.
     * </p>
     * 
     * @return The Amazon Resource Number (ARN) of the feature group that you're updating.
     */

    public String getFeatureGroupArn() {
        return this.featureGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the feature group that you're updating.
     * </p>
     * 
     * @param featureGroupArn
     *        The Amazon Resource Number (ARN) of the feature group that you're updating.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFeatureGroupResult withFeatureGroupArn(String featureGroupArn) {
        setFeatureGroupArn(featureGroupArn);
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
        if (getFeatureGroupArn() != null)
            sb.append("FeatureGroupArn: ").append(getFeatureGroupArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateFeatureGroupResult == false)
            return false;
        UpdateFeatureGroupResult other = (UpdateFeatureGroupResult) obj;
        if (other.getFeatureGroupArn() == null ^ this.getFeatureGroupArn() == null)
            return false;
        if (other.getFeatureGroupArn() != null && other.getFeatureGroupArn().equals(this.getFeatureGroupArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFeatureGroupArn() == null) ? 0 : getFeatureGroupArn().hashCode());
        return hashCode;
    }

    @Override
    public UpdateFeatureGroupResult clone() {
        try {
            return (UpdateFeatureGroupResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
