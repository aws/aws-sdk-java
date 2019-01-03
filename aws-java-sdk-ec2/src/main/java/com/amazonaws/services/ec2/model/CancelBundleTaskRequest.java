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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.CancelBundleTaskRequestMarshaller;

/**
 * <p>
 * Contains the parameters for CancelBundleTask.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CancelBundleTaskRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<CancelBundleTaskRequest> {

    /**
     * <p>
     * The ID of the bundle task.
     * </p>
     */
    private String bundleId;

    /**
     * Default constructor for CancelBundleTaskRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize the object after creating it.
     */
    public CancelBundleTaskRequest() {
    }

    /**
     * Constructs a new CancelBundleTaskRequest object. Callers should use the setter or fluent setter (with...) methods
     * to initialize any additional object members.
     * 
     * @param bundleId
     *        The ID of the bundle task.
     */
    public CancelBundleTaskRequest(String bundleId) {
        setBundleId(bundleId);
    }

    /**
     * <p>
     * The ID of the bundle task.
     * </p>
     * 
     * @param bundleId
     *        The ID of the bundle task.
     */

    public void setBundleId(String bundleId) {
        this.bundleId = bundleId;
    }

    /**
     * <p>
     * The ID of the bundle task.
     * </p>
     * 
     * @return The ID of the bundle task.
     */

    public String getBundleId() {
        return this.bundleId;
    }

    /**
     * <p>
     * The ID of the bundle task.
     * </p>
     * 
     * @param bundleId
     *        The ID of the bundle task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CancelBundleTaskRequest withBundleId(String bundleId) {
        setBundleId(bundleId);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<CancelBundleTaskRequest> getDryRunRequest() {
        Request<CancelBundleTaskRequest> request = new CancelBundleTaskRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getBundleId() != null)
            sb.append("BundleId: ").append(getBundleId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CancelBundleTaskRequest == false)
            return false;
        CancelBundleTaskRequest other = (CancelBundleTaskRequest) obj;
        if (other.getBundleId() == null ^ this.getBundleId() == null)
            return false;
        if (other.getBundleId() != null && other.getBundleId().equals(this.getBundleId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBundleId() == null) ? 0 : getBundleId().hashCode());
        return hashCode;
    }

    @Override
    public CancelBundleTaskRequest clone() {
        return (CancelBundleTaskRequest) super.clone();
    }
}
