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
package com.amazonaws.services.route53resolver.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/CreateResolverQueryLogConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateResolverQueryLogConfigRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name that you want to give the query logging configuration.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The ARN of the resource that you want Resolver to send query logs. You can send query logs to an S3 bucket, a
     * CloudWatch Logs log group, or a Kinesis Data Firehose delivery stream. Examples of valid values include the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>S3 bucket</b>:
     * </p>
     * <p>
     * <code>arn:aws:s3:::examplebucket</code>
     * </p>
     * <p>
     * You can optionally append a file prefix to the end of the ARN.
     * </p>
     * <p>
     * <code>arn:aws:s3:::examplebucket/development/</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>CloudWatch Logs log group</b>:
     * </p>
     * <p>
     * <code>arn:aws:logs:us-west-1:123456789012:log-group:/mystack-testgroup-12ABC1AB12A1:*</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Kinesis Data Firehose delivery stream</b>:
     * </p>
     * <p>
     * <code>arn:aws:kinesis:us-east-2:0123456789:stream/my_stream_name</code>
     * </p>
     * </li>
     * </ul>
     */
    private String destinationArn;
    /**
     * <p>
     * A unique string that identifies the request and that allows failed requests to be retried without the risk of
     * running the operation twice. <code>CreatorRequestId</code> can be any unique string, for example, a date/time
     * stamp.
     * </p>
     */
    private String creatorRequestId;
    /**
     * <p>
     * A list of the tag keys and values that you want to associate with the query logging configuration.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name that you want to give the query logging configuration.
     * </p>
     * 
     * @param name
     *        The name that you want to give the query logging configuration.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name that you want to give the query logging configuration.
     * </p>
     * 
     * @return The name that you want to give the query logging configuration.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name that you want to give the query logging configuration.
     * </p>
     * 
     * @param name
     *        The name that you want to give the query logging configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateResolverQueryLogConfigRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The ARN of the resource that you want Resolver to send query logs. You can send query logs to an S3 bucket, a
     * CloudWatch Logs log group, or a Kinesis Data Firehose delivery stream. Examples of valid values include the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>S3 bucket</b>:
     * </p>
     * <p>
     * <code>arn:aws:s3:::examplebucket</code>
     * </p>
     * <p>
     * You can optionally append a file prefix to the end of the ARN.
     * </p>
     * <p>
     * <code>arn:aws:s3:::examplebucket/development/</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>CloudWatch Logs log group</b>:
     * </p>
     * <p>
     * <code>arn:aws:logs:us-west-1:123456789012:log-group:/mystack-testgroup-12ABC1AB12A1:*</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Kinesis Data Firehose delivery stream</b>:
     * </p>
     * <p>
     * <code>arn:aws:kinesis:us-east-2:0123456789:stream/my_stream_name</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param destinationArn
     *        The ARN of the resource that you want Resolver to send query logs. You can send query logs to an S3
     *        bucket, a CloudWatch Logs log group, or a Kinesis Data Firehose delivery stream. Examples of valid values
     *        include the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>S3 bucket</b>:
     *        </p>
     *        <p>
     *        <code>arn:aws:s3:::examplebucket</code>
     *        </p>
     *        <p>
     *        You can optionally append a file prefix to the end of the ARN.
     *        </p>
     *        <p>
     *        <code>arn:aws:s3:::examplebucket/development/</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>CloudWatch Logs log group</b>:
     *        </p>
     *        <p>
     *        <code>arn:aws:logs:us-west-1:123456789012:log-group:/mystack-testgroup-12ABC1AB12A1:*</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Kinesis Data Firehose delivery stream</b>:
     *        </p>
     *        <p>
     *        <code>arn:aws:kinesis:us-east-2:0123456789:stream/my_stream_name</code>
     *        </p>
     *        </li>
     */

    public void setDestinationArn(String destinationArn) {
        this.destinationArn = destinationArn;
    }

    /**
     * <p>
     * The ARN of the resource that you want Resolver to send query logs. You can send query logs to an S3 bucket, a
     * CloudWatch Logs log group, or a Kinesis Data Firehose delivery stream. Examples of valid values include the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>S3 bucket</b>:
     * </p>
     * <p>
     * <code>arn:aws:s3:::examplebucket</code>
     * </p>
     * <p>
     * You can optionally append a file prefix to the end of the ARN.
     * </p>
     * <p>
     * <code>arn:aws:s3:::examplebucket/development/</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>CloudWatch Logs log group</b>:
     * </p>
     * <p>
     * <code>arn:aws:logs:us-west-1:123456789012:log-group:/mystack-testgroup-12ABC1AB12A1:*</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Kinesis Data Firehose delivery stream</b>:
     * </p>
     * <p>
     * <code>arn:aws:kinesis:us-east-2:0123456789:stream/my_stream_name</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The ARN of the resource that you want Resolver to send query logs. You can send query logs to an S3
     *         bucket, a CloudWatch Logs log group, or a Kinesis Data Firehose delivery stream. Examples of valid values
     *         include the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>S3 bucket</b>:
     *         </p>
     *         <p>
     *         <code>arn:aws:s3:::examplebucket</code>
     *         </p>
     *         <p>
     *         You can optionally append a file prefix to the end of the ARN.
     *         </p>
     *         <p>
     *         <code>arn:aws:s3:::examplebucket/development/</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>CloudWatch Logs log group</b>:
     *         </p>
     *         <p>
     *         <code>arn:aws:logs:us-west-1:123456789012:log-group:/mystack-testgroup-12ABC1AB12A1:*</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Kinesis Data Firehose delivery stream</b>:
     *         </p>
     *         <p>
     *         <code>arn:aws:kinesis:us-east-2:0123456789:stream/my_stream_name</code>
     *         </p>
     *         </li>
     */

    public String getDestinationArn() {
        return this.destinationArn;
    }

    /**
     * <p>
     * The ARN of the resource that you want Resolver to send query logs. You can send query logs to an S3 bucket, a
     * CloudWatch Logs log group, or a Kinesis Data Firehose delivery stream. Examples of valid values include the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>S3 bucket</b>:
     * </p>
     * <p>
     * <code>arn:aws:s3:::examplebucket</code>
     * </p>
     * <p>
     * You can optionally append a file prefix to the end of the ARN.
     * </p>
     * <p>
     * <code>arn:aws:s3:::examplebucket/development/</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>CloudWatch Logs log group</b>:
     * </p>
     * <p>
     * <code>arn:aws:logs:us-west-1:123456789012:log-group:/mystack-testgroup-12ABC1AB12A1:*</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Kinesis Data Firehose delivery stream</b>:
     * </p>
     * <p>
     * <code>arn:aws:kinesis:us-east-2:0123456789:stream/my_stream_name</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param destinationArn
     *        The ARN of the resource that you want Resolver to send query logs. You can send query logs to an S3
     *        bucket, a CloudWatch Logs log group, or a Kinesis Data Firehose delivery stream. Examples of valid values
     *        include the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>S3 bucket</b>:
     *        </p>
     *        <p>
     *        <code>arn:aws:s3:::examplebucket</code>
     *        </p>
     *        <p>
     *        You can optionally append a file prefix to the end of the ARN.
     *        </p>
     *        <p>
     *        <code>arn:aws:s3:::examplebucket/development/</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>CloudWatch Logs log group</b>:
     *        </p>
     *        <p>
     *        <code>arn:aws:logs:us-west-1:123456789012:log-group:/mystack-testgroup-12ABC1AB12A1:*</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Kinesis Data Firehose delivery stream</b>:
     *        </p>
     *        <p>
     *        <code>arn:aws:kinesis:us-east-2:0123456789:stream/my_stream_name</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateResolverQueryLogConfigRequest withDestinationArn(String destinationArn) {
        setDestinationArn(destinationArn);
        return this;
    }

    /**
     * <p>
     * A unique string that identifies the request and that allows failed requests to be retried without the risk of
     * running the operation twice. <code>CreatorRequestId</code> can be any unique string, for example, a date/time
     * stamp.
     * </p>
     * 
     * @param creatorRequestId
     *        A unique string that identifies the request and that allows failed requests to be retried without the risk
     *        of running the operation twice. <code>CreatorRequestId</code> can be any unique string, for example, a
     *        date/time stamp.
     */

    public void setCreatorRequestId(String creatorRequestId) {
        this.creatorRequestId = creatorRequestId;
    }

    /**
     * <p>
     * A unique string that identifies the request and that allows failed requests to be retried without the risk of
     * running the operation twice. <code>CreatorRequestId</code> can be any unique string, for example, a date/time
     * stamp.
     * </p>
     * 
     * @return A unique string that identifies the request and that allows failed requests to be retried without the
     *         risk of running the operation twice. <code>CreatorRequestId</code> can be any unique string, for example,
     *         a date/time stamp.
     */

    public String getCreatorRequestId() {
        return this.creatorRequestId;
    }

    /**
     * <p>
     * A unique string that identifies the request and that allows failed requests to be retried without the risk of
     * running the operation twice. <code>CreatorRequestId</code> can be any unique string, for example, a date/time
     * stamp.
     * </p>
     * 
     * @param creatorRequestId
     *        A unique string that identifies the request and that allows failed requests to be retried without the risk
     *        of running the operation twice. <code>CreatorRequestId</code> can be any unique string, for example, a
     *        date/time stamp.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateResolverQueryLogConfigRequest withCreatorRequestId(String creatorRequestId) {
        setCreatorRequestId(creatorRequestId);
        return this;
    }

    /**
     * <p>
     * A list of the tag keys and values that you want to associate with the query logging configuration.
     * </p>
     * 
     * @return A list of the tag keys and values that you want to associate with the query logging configuration.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of the tag keys and values that you want to associate with the query logging configuration.
     * </p>
     * 
     * @param tags
     *        A list of the tag keys and values that you want to associate with the query logging configuration.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * A list of the tag keys and values that you want to associate with the query logging configuration.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of the tag keys and values that you want to associate with the query logging configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateResolverQueryLogConfigRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the tag keys and values that you want to associate with the query logging configuration.
     * </p>
     * 
     * @param tags
     *        A list of the tag keys and values that you want to associate with the query logging configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateResolverQueryLogConfigRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDestinationArn() != null)
            sb.append("DestinationArn: ").append(getDestinationArn()).append(",");
        if (getCreatorRequestId() != null)
            sb.append("CreatorRequestId: ").append(getCreatorRequestId()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateResolverQueryLogConfigRequest == false)
            return false;
        CreateResolverQueryLogConfigRequest other = (CreateResolverQueryLogConfigRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDestinationArn() == null ^ this.getDestinationArn() == null)
            return false;
        if (other.getDestinationArn() != null && other.getDestinationArn().equals(this.getDestinationArn()) == false)
            return false;
        if (other.getCreatorRequestId() == null ^ this.getCreatorRequestId() == null)
            return false;
        if (other.getCreatorRequestId() != null && other.getCreatorRequestId().equals(this.getCreatorRequestId()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDestinationArn() == null) ? 0 : getDestinationArn().hashCode());
        hashCode = prime * hashCode + ((getCreatorRequestId() == null) ? 0 : getCreatorRequestId().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateResolverQueryLogConfigRequest clone() {
        return (CreateResolverQueryLogConfigRequest) super.clone();
    }

}
