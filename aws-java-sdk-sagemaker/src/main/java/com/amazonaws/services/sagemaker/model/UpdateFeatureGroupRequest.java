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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/UpdateFeatureGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateFeatureGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the feature group that you're updating.
     * </p>
     */
    private String featureGroupName;
    /**
     * <p>
     * Updates the feature group. Updating a feature group is an asynchronous operation. When you get an HTTP 200
     * response, you've made a valid request. It takes some time after you've made a valid request for Feature Store to
     * update the feature group.
     * </p>
     */
    private java.util.List<FeatureDefinition> featureAdditions;

    /**
     * <p>
     * The name of the feature group that you're updating.
     * </p>
     * 
     * @param featureGroupName
     *        The name of the feature group that you're updating.
     */

    public void setFeatureGroupName(String featureGroupName) {
        this.featureGroupName = featureGroupName;
    }

    /**
     * <p>
     * The name of the feature group that you're updating.
     * </p>
     * 
     * @return The name of the feature group that you're updating.
     */

    public String getFeatureGroupName() {
        return this.featureGroupName;
    }

    /**
     * <p>
     * The name of the feature group that you're updating.
     * </p>
     * 
     * @param featureGroupName
     *        The name of the feature group that you're updating.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFeatureGroupRequest withFeatureGroupName(String featureGroupName) {
        setFeatureGroupName(featureGroupName);
        return this;
    }

    /**
     * <p>
     * Updates the feature group. Updating a feature group is an asynchronous operation. When you get an HTTP 200
     * response, you've made a valid request. It takes some time after you've made a valid request for Feature Store to
     * update the feature group.
     * </p>
     * 
     * @return Updates the feature group. Updating a feature group is an asynchronous operation. When you get an HTTP
     *         200 response, you've made a valid request. It takes some time after you've made a valid request for
     *         Feature Store to update the feature group.
     */

    public java.util.List<FeatureDefinition> getFeatureAdditions() {
        return featureAdditions;
    }

    /**
     * <p>
     * Updates the feature group. Updating a feature group is an asynchronous operation. When you get an HTTP 200
     * response, you've made a valid request. It takes some time after you've made a valid request for Feature Store to
     * update the feature group.
     * </p>
     * 
     * @param featureAdditions
     *        Updates the feature group. Updating a feature group is an asynchronous operation. When you get an HTTP 200
     *        response, you've made a valid request. It takes some time after you've made a valid request for Feature
     *        Store to update the feature group.
     */

    public void setFeatureAdditions(java.util.Collection<FeatureDefinition> featureAdditions) {
        if (featureAdditions == null) {
            this.featureAdditions = null;
            return;
        }

        this.featureAdditions = new java.util.ArrayList<FeatureDefinition>(featureAdditions);
    }

    /**
     * <p>
     * Updates the feature group. Updating a feature group is an asynchronous operation. When you get an HTTP 200
     * response, you've made a valid request. It takes some time after you've made a valid request for Feature Store to
     * update the feature group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFeatureAdditions(java.util.Collection)} or {@link #withFeatureAdditions(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param featureAdditions
     *        Updates the feature group. Updating a feature group is an asynchronous operation. When you get an HTTP 200
     *        response, you've made a valid request. It takes some time after you've made a valid request for Feature
     *        Store to update the feature group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFeatureGroupRequest withFeatureAdditions(FeatureDefinition... featureAdditions) {
        if (this.featureAdditions == null) {
            setFeatureAdditions(new java.util.ArrayList<FeatureDefinition>(featureAdditions.length));
        }
        for (FeatureDefinition ele : featureAdditions) {
            this.featureAdditions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Updates the feature group. Updating a feature group is an asynchronous operation. When you get an HTTP 200
     * response, you've made a valid request. It takes some time after you've made a valid request for Feature Store to
     * update the feature group.
     * </p>
     * 
     * @param featureAdditions
     *        Updates the feature group. Updating a feature group is an asynchronous operation. When you get an HTTP 200
     *        response, you've made a valid request. It takes some time after you've made a valid request for Feature
     *        Store to update the feature group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFeatureGroupRequest withFeatureAdditions(java.util.Collection<FeatureDefinition> featureAdditions) {
        setFeatureAdditions(featureAdditions);
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
        if (getFeatureGroupName() != null)
            sb.append("FeatureGroupName: ").append(getFeatureGroupName()).append(",");
        if (getFeatureAdditions() != null)
            sb.append("FeatureAdditions: ").append(getFeatureAdditions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateFeatureGroupRequest == false)
            return false;
        UpdateFeatureGroupRequest other = (UpdateFeatureGroupRequest) obj;
        if (other.getFeatureGroupName() == null ^ this.getFeatureGroupName() == null)
            return false;
        if (other.getFeatureGroupName() != null && other.getFeatureGroupName().equals(this.getFeatureGroupName()) == false)
            return false;
        if (other.getFeatureAdditions() == null ^ this.getFeatureAdditions() == null)
            return false;
        if (other.getFeatureAdditions() != null && other.getFeatureAdditions().equals(this.getFeatureAdditions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFeatureGroupName() == null) ? 0 : getFeatureGroupName().hashCode());
        hashCode = prime * hashCode + ((getFeatureAdditions() == null) ? 0 : getFeatureAdditions().hashCode());
        return hashCode;
    }

    @Override
    public UpdateFeatureGroupRequest clone() {
        return (UpdateFeatureGroupRequest) super.clone();
    }

}
