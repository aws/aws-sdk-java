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
import com.amazonaws.services.ec2.model.transform.CreateSpotDatafeedSubscriptionRequestMarshaller;

/**
 * <p>
 * Contains the parameters for CreateSpotDatafeedSubscription.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateSpotDatafeedSubscriptionRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<CreateSpotDatafeedSubscriptionRequest> {

    /**
     * <p>
     * The Amazon S3 bucket in which to store the Spot Instance data feed.
     * </p>
     */
    private String bucket;
    /**
     * <p>
     * A prefix for the data feed file names.
     * </p>
     */
    private String prefix;

    /**
     * Default constructor for CreateSpotDatafeedSubscriptionRequest object. Callers should use the setter or fluent
     * setter (with...) methods to initialize the object after creating it.
     */
    public CreateSpotDatafeedSubscriptionRequest() {
    }

    /**
     * Constructs a new CreateSpotDatafeedSubscriptionRequest object. Callers should use the setter or fluent setter
     * (with...) methods to initialize any additional object members.
     * 
     * @param bucket
     *        The Amazon S3 bucket in which to store the Spot Instance data feed.
     */
    public CreateSpotDatafeedSubscriptionRequest(String bucket) {
        setBucket(bucket);
    }

    /**
     * <p>
     * The Amazon S3 bucket in which to store the Spot Instance data feed.
     * </p>
     * 
     * @param bucket
     *        The Amazon S3 bucket in which to store the Spot Instance data feed.
     */

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * <p>
     * The Amazon S3 bucket in which to store the Spot Instance data feed.
     * </p>
     * 
     * @return The Amazon S3 bucket in which to store the Spot Instance data feed.
     */

    public String getBucket() {
        return this.bucket;
    }

    /**
     * <p>
     * The Amazon S3 bucket in which to store the Spot Instance data feed.
     * </p>
     * 
     * @param bucket
     *        The Amazon S3 bucket in which to store the Spot Instance data feed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSpotDatafeedSubscriptionRequest withBucket(String bucket) {
        setBucket(bucket);
        return this;
    }

    /**
     * <p>
     * A prefix for the data feed file names.
     * </p>
     * 
     * @param prefix
     *        A prefix for the data feed file names.
     */

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    /**
     * <p>
     * A prefix for the data feed file names.
     * </p>
     * 
     * @return A prefix for the data feed file names.
     */

    public String getPrefix() {
        return this.prefix;
    }

    /**
     * <p>
     * A prefix for the data feed file names.
     * </p>
     * 
     * @param prefix
     *        A prefix for the data feed file names.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSpotDatafeedSubscriptionRequest withPrefix(String prefix) {
        setPrefix(prefix);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<CreateSpotDatafeedSubscriptionRequest> getDryRunRequest() {
        Request<CreateSpotDatafeedSubscriptionRequest> request = new CreateSpotDatafeedSubscriptionRequestMarshaller().marshall(this);
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
        if (getBucket() != null)
            sb.append("Bucket: ").append(getBucket()).append(",");
        if (getPrefix() != null)
            sb.append("Prefix: ").append(getPrefix());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateSpotDatafeedSubscriptionRequest == false)
            return false;
        CreateSpotDatafeedSubscriptionRequest other = (CreateSpotDatafeedSubscriptionRequest) obj;
        if (other.getBucket() == null ^ this.getBucket() == null)
            return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false)
            return false;
        if (other.getPrefix() == null ^ this.getPrefix() == null)
            return false;
        if (other.getPrefix() != null && other.getPrefix().equals(this.getPrefix()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucket() == null) ? 0 : getBucket().hashCode());
        hashCode = prime * hashCode + ((getPrefix() == null) ? 0 : getPrefix().hashCode());
        return hashCode;
    }

    @Override
    public CreateSpotDatafeedSubscriptionRequest clone() {
        return (CreateSpotDatafeedSubscriptionRequest) super.clone();
    }
}
