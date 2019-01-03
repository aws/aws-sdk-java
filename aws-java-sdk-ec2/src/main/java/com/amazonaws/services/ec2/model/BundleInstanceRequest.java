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
import com.amazonaws.services.ec2.model.transform.BundleInstanceRequestMarshaller;

/**
 * <p>
 * Contains the parameters for BundleInstance.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BundleInstanceRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<BundleInstanceRequest> {

    /**
     * <p>
     * The ID of the instance to bundle.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Required: Yes
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * The bucket in which to store the AMI. You can specify a bucket that you already own or a new bucket that Amazon
     * EC2 creates on your behalf. If you specify a bucket that belongs to someone else, Amazon EC2 returns an error.
     * </p>
     */
    private Storage storage;

    /**
     * Default constructor for BundleInstanceRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize the object after creating it.
     */
    public BundleInstanceRequest() {
    }

    /**
     * Constructs a new BundleInstanceRequest object. Callers should use the setter or fluent setter (with...) methods
     * to initialize any additional object members.
     * 
     * @param instanceId
     *        The ID of the instance to bundle.</p>
     *        <p>
     *        Type: String
     *        </p>
     *        <p>
     *        Default: None
     *        </p>
     *        <p>
     *        Required: Yes
     * @param storage
     *        The bucket in which to store the AMI. You can specify a bucket that you already own or a new bucket that
     *        Amazon EC2 creates on your behalf. If you specify a bucket that belongs to someone else, Amazon EC2
     *        returns an error.
     */
    public BundleInstanceRequest(String instanceId, Storage storage) {
        setInstanceId(instanceId);
        setStorage(storage);
    }

    /**
     * <p>
     * The ID of the instance to bundle.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Required: Yes
     * </p>
     * 
     * @param instanceId
     *        The ID of the instance to bundle.</p>
     *        <p>
     *        Type: String
     *        </p>
     *        <p>
     *        Default: None
     *        </p>
     *        <p>
     *        Required: Yes
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The ID of the instance to bundle.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Required: Yes
     * </p>
     * 
     * @return The ID of the instance to bundle.</p>
     *         <p>
     *         Type: String
     *         </p>
     *         <p>
     *         Default: None
     *         </p>
     *         <p>
     *         Required: Yes
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The ID of the instance to bundle.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Required: Yes
     * </p>
     * 
     * @param instanceId
     *        The ID of the instance to bundle.</p>
     *        <p>
     *        Type: String
     *        </p>
     *        <p>
     *        Default: None
     *        </p>
     *        <p>
     *        Required: Yes
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BundleInstanceRequest withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * The bucket in which to store the AMI. You can specify a bucket that you already own or a new bucket that Amazon
     * EC2 creates on your behalf. If you specify a bucket that belongs to someone else, Amazon EC2 returns an error.
     * </p>
     * 
     * @param storage
     *        The bucket in which to store the AMI. You can specify a bucket that you already own or a new bucket that
     *        Amazon EC2 creates on your behalf. If you specify a bucket that belongs to someone else, Amazon EC2
     *        returns an error.
     */

    public void setStorage(Storage storage) {
        this.storage = storage;
    }

    /**
     * <p>
     * The bucket in which to store the AMI. You can specify a bucket that you already own or a new bucket that Amazon
     * EC2 creates on your behalf. If you specify a bucket that belongs to someone else, Amazon EC2 returns an error.
     * </p>
     * 
     * @return The bucket in which to store the AMI. You can specify a bucket that you already own or a new bucket that
     *         Amazon EC2 creates on your behalf. If you specify a bucket that belongs to someone else, Amazon EC2
     *         returns an error.
     */

    public Storage getStorage() {
        return this.storage;
    }

    /**
     * <p>
     * The bucket in which to store the AMI. You can specify a bucket that you already own or a new bucket that Amazon
     * EC2 creates on your behalf. If you specify a bucket that belongs to someone else, Amazon EC2 returns an error.
     * </p>
     * 
     * @param storage
     *        The bucket in which to store the AMI. You can specify a bucket that you already own or a new bucket that
     *        Amazon EC2 creates on your behalf. If you specify a bucket that belongs to someone else, Amazon EC2
     *        returns an error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BundleInstanceRequest withStorage(Storage storage) {
        setStorage(storage);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<BundleInstanceRequest> getDryRunRequest() {
        Request<BundleInstanceRequest> request = new BundleInstanceRequestMarshaller().marshall(this);
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
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getStorage() != null)
            sb.append("Storage: ").append(getStorage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BundleInstanceRequest == false)
            return false;
        BundleInstanceRequest other = (BundleInstanceRequest) obj;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getStorage() == null ^ this.getStorage() == null)
            return false;
        if (other.getStorage() != null && other.getStorage().equals(this.getStorage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getStorage() == null) ? 0 : getStorage().hashCode());
        return hashCode;
    }

    @Override
    public BundleInstanceRequest clone() {
        return (BundleInstanceRequest) super.clone();
    }
}
