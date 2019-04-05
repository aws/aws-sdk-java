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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetInstances" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetInstancesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of key-value pairs containing information about your instances.
     * </p>
     */
    private java.util.List<Instance> instances;
    /**
     * <p>
     * A token used for advancing to the next page of results from your get instances request.
     * </p>
     */
    private String nextPageToken;

    /**
     * <p>
     * An array of key-value pairs containing information about your instances.
     * </p>
     * 
     * @return An array of key-value pairs containing information about your instances.
     */

    public java.util.List<Instance> getInstances() {
        return instances;
    }

    /**
     * <p>
     * An array of key-value pairs containing information about your instances.
     * </p>
     * 
     * @param instances
     *        An array of key-value pairs containing information about your instances.
     */

    public void setInstances(java.util.Collection<Instance> instances) {
        if (instances == null) {
            this.instances = null;
            return;
        }

        this.instances = new java.util.ArrayList<Instance>(instances);
    }

    /**
     * <p>
     * An array of key-value pairs containing information about your instances.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInstances(java.util.Collection)} or {@link #withInstances(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param instances
     *        An array of key-value pairs containing information about your instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInstancesResult withInstances(Instance... instances) {
        if (this.instances == null) {
            setInstances(new java.util.ArrayList<Instance>(instances.length));
        }
        for (Instance ele : instances) {
            this.instances.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of key-value pairs containing information about your instances.
     * </p>
     * 
     * @param instances
     *        An array of key-value pairs containing information about your instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInstancesResult withInstances(java.util.Collection<Instance> instances) {
        setInstances(instances);
        return this;
    }

    /**
     * <p>
     * A token used for advancing to the next page of results from your get instances request.
     * </p>
     * 
     * @param nextPageToken
     *        A token used for advancing to the next page of results from your get instances request.
     */

    public void setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
    }

    /**
     * <p>
     * A token used for advancing to the next page of results from your get instances request.
     * </p>
     * 
     * @return A token used for advancing to the next page of results from your get instances request.
     */

    public String getNextPageToken() {
        return this.nextPageToken;
    }

    /**
     * <p>
     * A token used for advancing to the next page of results from your get instances request.
     * </p>
     * 
     * @param nextPageToken
     *        A token used for advancing to the next page of results from your get instances request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInstancesResult withNextPageToken(String nextPageToken) {
        setNextPageToken(nextPageToken);
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
        if (getInstances() != null)
            sb.append("Instances: ").append(getInstances()).append(",");
        if (getNextPageToken() != null)
            sb.append("NextPageToken: ").append(getNextPageToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetInstancesResult == false)
            return false;
        GetInstancesResult other = (GetInstancesResult) obj;
        if (other.getInstances() == null ^ this.getInstances() == null)
            return false;
        if (other.getInstances() != null && other.getInstances().equals(this.getInstances()) == false)
            return false;
        if (other.getNextPageToken() == null ^ this.getNextPageToken() == null)
            return false;
        if (other.getNextPageToken() != null && other.getNextPageToken().equals(this.getNextPageToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstances() == null) ? 0 : getInstances().hashCode());
        hashCode = prime * hashCode + ((getNextPageToken() == null) ? 0 : getNextPageToken().hashCode());
        return hashCode;
    }

    @Override
    public GetInstancesResult clone() {
        try {
            return (GetInstancesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
