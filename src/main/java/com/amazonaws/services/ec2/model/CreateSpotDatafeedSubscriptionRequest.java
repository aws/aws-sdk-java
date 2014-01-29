/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.ec2.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.CreateSpotDatafeedSubscriptionRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#createSpotDatafeedSubscription(CreateSpotDatafeedSubscriptionRequest) CreateSpotDatafeedSubscription operation}.
 * <p>
 * Creates a datafeed for Spot Instances, enabling you to view Spot Instance usage logs. You can create one data feed per AWS account. For more
 * information, see <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-spot-instances.html"> Spot Instances </a> in the <i>Amazon Elastic
 * Compute Cloud User Guide</i> .
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#createSpotDatafeedSubscription(CreateSpotDatafeedSubscriptionRequest)
 */
public class CreateSpotDatafeedSubscriptionRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<CreateSpotDatafeedSubscriptionRequest> {

    /**
     * The Amazon S3 bucket in which to store the Spot Instance datafeed.
     * <p>Constraints: Must be a valid bucket associated with your AWS
     * account.
     */
    private String bucket;

    /**
     * A prefix for the datafeed file names.
     */
    private String prefix;

    /**
     * Default constructor for a new CreateSpotDatafeedSubscriptionRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public CreateSpotDatafeedSubscriptionRequest() {}
    
    /**
     * Constructs a new CreateSpotDatafeedSubscriptionRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param bucket The Amazon S3 bucket in which to store the Spot Instance
     * datafeed. <p>Constraints: Must be a valid bucket associated with your
     * AWS account.
     */
    public CreateSpotDatafeedSubscriptionRequest(String bucket) {
        setBucket(bucket);
    }

    /**
     * The Amazon S3 bucket in which to store the Spot Instance datafeed.
     * <p>Constraints: Must be a valid bucket associated with your AWS
     * account.
     *
     * @return The Amazon S3 bucket in which to store the Spot Instance datafeed.
     *         <p>Constraints: Must be a valid bucket associated with your AWS
     *         account.
     */
    public String getBucket() {
        return bucket;
    }
    
    /**
     * The Amazon S3 bucket in which to store the Spot Instance datafeed.
     * <p>Constraints: Must be a valid bucket associated with your AWS
     * account.
     *
     * @param bucket The Amazon S3 bucket in which to store the Spot Instance datafeed.
     *         <p>Constraints: Must be a valid bucket associated with your AWS
     *         account.
     */
    public void setBucket(String bucket) {
        this.bucket = bucket;
    }
    
    /**
     * The Amazon S3 bucket in which to store the Spot Instance datafeed.
     * <p>Constraints: Must be a valid bucket associated with your AWS
     * account.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param bucket The Amazon S3 bucket in which to store the Spot Instance datafeed.
     *         <p>Constraints: Must be a valid bucket associated with your AWS
     *         account.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateSpotDatafeedSubscriptionRequest withBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    /**
     * A prefix for the datafeed file names.
     *
     * @return A prefix for the datafeed file names.
     */
    public String getPrefix() {
        return prefix;
    }
    
    /**
     * A prefix for the datafeed file names.
     *
     * @param prefix A prefix for the datafeed file names.
     */
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }
    
    /**
     * A prefix for the datafeed file names.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param prefix A prefix for the datafeed file names.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateSpotDatafeedSubscriptionRequest withPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<CreateSpotDatafeedSubscriptionRequest> getDryRunRequest() {
        Request<CreateSpotDatafeedSubscriptionRequest> request = new CreateSpotDatafeedSubscriptionRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }
    
    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getBucket() != null) sb.append("Bucket: " + getBucket() + ",");
        if (getPrefix() != null) sb.append("Prefix: " + getPrefix() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateSpotDatafeedSubscriptionRequest == false) return false;
        CreateSpotDatafeedSubscriptionRequest other = (CreateSpotDatafeedSubscriptionRequest)obj;
        
        if (other.getBucket() == null ^ this.getBucket() == null) return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false) return false; 
        if (other.getPrefix() == null ^ this.getPrefix() == null) return false;
        if (other.getPrefix() != null && other.getPrefix().equals(this.getPrefix()) == false) return false; 
        return true;
    }
    
}
    