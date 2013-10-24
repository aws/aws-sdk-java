/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sns.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.sns.AmazonSNS#deleteTopic(DeleteTopicRequest) DeleteTopic operation}.
 * <p>
 * The <code>DeleteTopic</code> action deletes a topic and all its subscriptions. Deleting a topic might prevent some messages previously sent to the
 * topic from being delivered to subscribers. This action is idempotent, so deleting a topic that does not exist does not result in an error.
 * </p>
 *
 * @see com.amazonaws.services.sns.AmazonSNS#deleteTopic(DeleteTopicRequest)
 */
public class DeleteTopicRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The ARN of the topic you want to delete. <examples> <queryrequest>
     * http://sns.us-east-1.amazonaws.com/
     * ?TopicArn=arn%3Aaws%3Asns%3Aus-east-1%3A123456789012%3AMy-Topic
     * &Action=DeleteTopic &SignatureVersion=2 &SignatureMethod=HmacSHA256
     * &Timestamp=2010-03-31T12%3A00%3A00.000Z &AWSAccessKeyId=(AWS Access
     * Key ID)
     * &Signature=DjHBa%2BbYCKQAzctOPnLP7MbHnrHT3%2FK3kFEZjwcf9%2FU%3D
     * </queryrequest> <queryresponse> <DeleteTopicResponse
     * xmlns="http://sns.amazonaws.com/doc/2010-03-31/"> <ResponseMetadata>
     * <RequestId>fba800b9-3765-11df-8cf3-c58c53254dfb</RequestId>
     * </ResponseMetadata> </DeleteTopicResponse> </queryresponse>
     * </examples>
     */
    private String topicArn;

    /**
     * Default constructor for a new DeleteTopicRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public DeleteTopicRequest() {}
    
    /**
     * Constructs a new DeleteTopicRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param topicArn The ARN of the topic you want to delete. <examples>
     * <queryrequest> http://sns.us-east-1.amazonaws.com/
     * ?TopicArn=arn%3Aaws%3Asns%3Aus-east-1%3A123456789012%3AMy-Topic
     * &Action=DeleteTopic &SignatureVersion=2 &SignatureMethod=HmacSHA256
     * &Timestamp=2010-03-31T12%3A00%3A00.000Z &AWSAccessKeyId=(AWS Access
     * Key ID)
     * &Signature=DjHBa%2BbYCKQAzctOPnLP7MbHnrHT3%2FK3kFEZjwcf9%2FU%3D
     * </queryrequest> <queryresponse> <DeleteTopicResponse
     * xmlns="http://sns.amazonaws.com/doc/2010-03-31/"> <ResponseMetadata>
     * <RequestId>fba800b9-3765-11df-8cf3-c58c53254dfb</RequestId>
     * </ResponseMetadata> </DeleteTopicResponse> </queryresponse>
     * </examples>
     */
    public DeleteTopicRequest(String topicArn) {
        setTopicArn(topicArn);
    }

    /**
     * The ARN of the topic you want to delete. <examples> <queryrequest>
     * http://sns.us-east-1.amazonaws.com/
     * ?TopicArn=arn%3Aaws%3Asns%3Aus-east-1%3A123456789012%3AMy-Topic
     * &Action=DeleteTopic &SignatureVersion=2 &SignatureMethod=HmacSHA256
     * &Timestamp=2010-03-31T12%3A00%3A00.000Z &AWSAccessKeyId=(AWS Access
     * Key ID)
     * &Signature=DjHBa%2BbYCKQAzctOPnLP7MbHnrHT3%2FK3kFEZjwcf9%2FU%3D
     * </queryrequest> <queryresponse> <DeleteTopicResponse
     * xmlns="http://sns.amazonaws.com/doc/2010-03-31/"> <ResponseMetadata>
     * <RequestId>fba800b9-3765-11df-8cf3-c58c53254dfb</RequestId>
     * </ResponseMetadata> </DeleteTopicResponse> </queryresponse>
     * </examples>
     *
     * @return The ARN of the topic you want to delete. <examples> <queryrequest>
     *         http://sns.us-east-1.amazonaws.com/
     *         ?TopicArn=arn%3Aaws%3Asns%3Aus-east-1%3A123456789012%3AMy-Topic
     *         &Action=DeleteTopic &SignatureVersion=2 &SignatureMethod=HmacSHA256
     *         &Timestamp=2010-03-31T12%3A00%3A00.000Z &AWSAccessKeyId=(AWS Access
     *         Key ID)
     *         &Signature=DjHBa%2BbYCKQAzctOPnLP7MbHnrHT3%2FK3kFEZjwcf9%2FU%3D
     *         </queryrequest> <queryresponse> <DeleteTopicResponse
     *         xmlns="http://sns.amazonaws.com/doc/2010-03-31/"> <ResponseMetadata>
     *         <RequestId>fba800b9-3765-11df-8cf3-c58c53254dfb</RequestId>
     *         </ResponseMetadata> </DeleteTopicResponse> </queryresponse>
     *         </examples>
     */
    public String getTopicArn() {
        return topicArn;
    }
    
    /**
     * The ARN of the topic you want to delete. <examples> <queryrequest>
     * http://sns.us-east-1.amazonaws.com/
     * ?TopicArn=arn%3Aaws%3Asns%3Aus-east-1%3A123456789012%3AMy-Topic
     * &Action=DeleteTopic &SignatureVersion=2 &SignatureMethod=HmacSHA256
     * &Timestamp=2010-03-31T12%3A00%3A00.000Z &AWSAccessKeyId=(AWS Access
     * Key ID)
     * &Signature=DjHBa%2BbYCKQAzctOPnLP7MbHnrHT3%2FK3kFEZjwcf9%2FU%3D
     * </queryrequest> <queryresponse> <DeleteTopicResponse
     * xmlns="http://sns.amazonaws.com/doc/2010-03-31/"> <ResponseMetadata>
     * <RequestId>fba800b9-3765-11df-8cf3-c58c53254dfb</RequestId>
     * </ResponseMetadata> </DeleteTopicResponse> </queryresponse>
     * </examples>
     *
     * @param topicArn The ARN of the topic you want to delete. <examples> <queryrequest>
     *         http://sns.us-east-1.amazonaws.com/
     *         ?TopicArn=arn%3Aaws%3Asns%3Aus-east-1%3A123456789012%3AMy-Topic
     *         &Action=DeleteTopic &SignatureVersion=2 &SignatureMethod=HmacSHA256
     *         &Timestamp=2010-03-31T12%3A00%3A00.000Z &AWSAccessKeyId=(AWS Access
     *         Key ID)
     *         &Signature=DjHBa%2BbYCKQAzctOPnLP7MbHnrHT3%2FK3kFEZjwcf9%2FU%3D
     *         </queryrequest> <queryresponse> <DeleteTopicResponse
     *         xmlns="http://sns.amazonaws.com/doc/2010-03-31/"> <ResponseMetadata>
     *         <RequestId>fba800b9-3765-11df-8cf3-c58c53254dfb</RequestId>
     *         </ResponseMetadata> </DeleteTopicResponse> </queryresponse>
     *         </examples>
     */
    public void setTopicArn(String topicArn) {
        this.topicArn = topicArn;
    }
    
    /**
     * The ARN of the topic you want to delete. <examples> <queryrequest>
     * http://sns.us-east-1.amazonaws.com/
     * ?TopicArn=arn%3Aaws%3Asns%3Aus-east-1%3A123456789012%3AMy-Topic
     * &Action=DeleteTopic &SignatureVersion=2 &SignatureMethod=HmacSHA256
     * &Timestamp=2010-03-31T12%3A00%3A00.000Z &AWSAccessKeyId=(AWS Access
     * Key ID)
     * &Signature=DjHBa%2BbYCKQAzctOPnLP7MbHnrHT3%2FK3kFEZjwcf9%2FU%3D
     * </queryrequest> <queryresponse> <DeleteTopicResponse
     * xmlns="http://sns.amazonaws.com/doc/2010-03-31/"> <ResponseMetadata>
     * <RequestId>fba800b9-3765-11df-8cf3-c58c53254dfb</RequestId>
     * </ResponseMetadata> </DeleteTopicResponse> </queryresponse>
     * </examples>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param topicArn The ARN of the topic you want to delete. <examples> <queryrequest>
     *         http://sns.us-east-1.amazonaws.com/
     *         ?TopicArn=arn%3Aaws%3Asns%3Aus-east-1%3A123456789012%3AMy-Topic
     *         &Action=DeleteTopic &SignatureVersion=2 &SignatureMethod=HmacSHA256
     *         &Timestamp=2010-03-31T12%3A00%3A00.000Z &AWSAccessKeyId=(AWS Access
     *         Key ID)
     *         &Signature=DjHBa%2BbYCKQAzctOPnLP7MbHnrHT3%2FK3kFEZjwcf9%2FU%3D
     *         </queryrequest> <queryresponse> <DeleteTopicResponse
     *         xmlns="http://sns.amazonaws.com/doc/2010-03-31/"> <ResponseMetadata>
     *         <RequestId>fba800b9-3765-11df-8cf3-c58c53254dfb</RequestId>
     *         </ResponseMetadata> </DeleteTopicResponse> </queryresponse>
     *         </examples>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DeleteTopicRequest withTopicArn(String topicArn) {
        this.topicArn = topicArn;
        return this;
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
        if (getTopicArn() != null) sb.append("TopicArn: " + getTopicArn() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getTopicArn() == null) ? 0 : getTopicArn().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DeleteTopicRequest == false) return false;
        DeleteTopicRequest other = (DeleteTopicRequest)obj;
        
        if (other.getTopicArn() == null ^ this.getTopicArn() == null) return false;
        if (other.getTopicArn() != null && other.getTopicArn().equals(this.getTopicArn()) == false) return false; 
        return true;
    }
    
}
    